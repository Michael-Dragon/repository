package com.miutrip.domain;

public class PaymentRecord {
    private int id;
    private String pay_order_no;
    private String out_order_no;
    private String pay_amount;
    private String pay_mode;
    private String payer_company_name;
    private String payee_company_name;
    private String create_time;
    private String pay_status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPay_order_no() {
        return pay_order_no;
    }

    public void setPay_order_no(String pay_order_no) {
        this.pay_order_no = pay_order_no;
    }

    public String getOut_order_no() {
        return out_order_no;
    }

    public void setOut_order_no(String out_order_no) {
        this.out_order_no = out_order_no;
    }

    public String getPay_amount() {
        return pay_amount;
    }

    public void setPay_amount(String pay_amount) {
        this.pay_amount = pay_amount;
    }

    public String getPay_mode() {
        return pay_mode;
    }

    public void setPay_mode(String pay_mode) {
        this.pay_mode = pay_mode;
    }

    public String getPayer_company_name() {
        return payer_company_name;
    }

    public void setPayer_company_name(String payer_company_name) {
        this.payer_company_name = payer_company_name;
    }

    public String getPayee_company_name() {
        return payee_company_name;
    }

    public void setPayee_company_name(String payee_company_name) {
        this.payee_company_name = payee_company_name;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getPay_status() {
        return pay_status;
    }

    public void setPay_status(String pay_status) {
        this.pay_status = pay_status;
    }
}
