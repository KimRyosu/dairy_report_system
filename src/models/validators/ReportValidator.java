package models.validators;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import models.Report;

public class ReportValidator {
    public static List<String> validate(Report r) {
        List<String> errors = new ArrayList<String>();

        String report_date_error = validateReportDate(r.getReport_date());
        if(!report_date_error.equals("")) {
            errors.add(report_date_error);
        }

        String title_error = validateTitle(r.getTitle());
        if(!title_error.equals("")) {
            errors.add(title_error);
        }

        String content_error = validateContent(r.getContent());
        if(!content_error.equals("")) {
            errors.add(content_error);
        }

        return errors;
    }

    private static String validateReportDate(Date report_date) {
        if(report_date == null || report_date.equals("")) {
            return "日報の日付を入力してください。";
        }

        return "";
    }

    private static String validateTitle(String title) {
        if(title == null || title.equals("")) {
            return "日報のタイトルを入力してください。";
        }

        return "";
    }

    private static String validateContent(String content) {
        if(content == null || content.equals("")) {
            return "日報の内容を入力してください。";
        }

        return "";
    }

}
