package com.team4.report;

import java.util.List;
import java.util.HashMap;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import com.team4.compliance.Configuration;

public class ReportService {

    public byte[] generateReport(List<Configuration> configs) throws JRException {
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(configs);
        JasperPrint print = JasperFillManager.fillReport(getCompiledReport(), new HashMap<>(), dataSource);
        return JasperExportManager.exportReportToPdf(print);
    }

    private net.sf.jasperreports.engine.JasperReport getCompiledReport() throws JRException {
<<<<<<< HEAD
        
=======
        // Use class loader to load the resource
>>>>>>> bb2131f581a8784940646fe971f26f97ef97d819
        return JasperCompileManager.compileReport(
            getClass().getClassLoader().getResourceAsStream("compliance_report.jrxml")
        );
    }
}
