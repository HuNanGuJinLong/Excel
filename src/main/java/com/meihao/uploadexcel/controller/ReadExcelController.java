package com.meihao.uploadexcel.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.meihao.uploadexcel.entity.Excel;
import com.meihao.uploadexcel.entity.Messages;
import com.meihao.uploadexcel.service.MessagesService;
import com.meihao.uploadexcel.util.ExportExcelUtil;
import com.meihao.uploadexcel.util.POIUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/go")
public class ReadExcelController {
    private static Logger logger = Logger.getLogger(ReadExcelController.class);

    @Autowired
    private MessagesService messagesService;

    @GetMapping("/goto")
    public String GoToLogin() {
        return "upload";
    }

    @RequestMapping("/readExcel")
    public void readExcel(@RequestParam(value = "excelFile") MultipartFile excelFile, HttpServletRequest req, HttpServletResponse resp) {
        ArrayList<Messages> messages = new ArrayList<>();
        try {
            List<String[]> list = POIUtil.readExcel(excelFile);
            for (int i = 0; i < list.size(); i++) {
                String[] strings = list.get(i);
                Messages messages1 = new Messages();
                try {
                    messages1.setBookname(strings[0]);
                    messages1.setAuthor(strings[1]);
                    messages1.setPress(strings[2]);
                    messages1.setQuantity(strings[3]);
                    messages1.setPrice(strings[4]);
                    messages1.setAutograph(strings[5]);
                    messages1.setRemarks(strings[6]);
                    messages1.setObjectname(strings[7]);
                    messages1.setIsbn(strings[8]);
                    messages1.setClasses(strings[9]);
                    messages1.setNumber(strings[10]);
                    messages1.setHeadmaster(strings[11]);
                    messages1.setHandleman(strings[12]);
                    messages1.setDate(strings[13]);
                    messages.add(messages1);
                } catch (Exception e) {
                    System.out.println(e);
                    logger.info(e);
                }
            }
        } catch (IOException e) {
            System.out.println(e);
            logger.info("读取excel文件失败", e);
        }
        //将数据重新打包成excel
        try {
            String[] columnNames = {"班级", "班级人数", " 班主任", "经手人 ", "领用日期", " 课程名字", " 编著者", " 出版社", " 数量", " 单价（元）", "复核签名 ", "备注 ", " 科目名称", " ISBN", "ID"};
            new ExportExcelUtil().exportExcel("测试", columnNames, messages, new FileOutputStream("C:\\Users\\Administrator\\Desktop\\cc\\1.xls"), ExportExcelUtil.EXCEL_FILE_2003);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //转json
        String str=JSON.toJSON(messages).toString();
        List<Messages> messages1 = JSONObject.parseArray(str, Messages.class);
        Boolean b = messagesService.insertLists(messages1);
        if (true == b) {
            System.out.println("ok");
        } else {
            System.out.println("no");
        }
    }
}
