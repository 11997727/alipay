<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3.org/TR/html4/frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <meta charset="UTF-8">
    <title></title>
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta http-equiv="Cache-Control" content="no-siteapp" />
</head>
<script src="js/jquery-3.4.1.min.js"></script>
<body class="index">
<div align="center">
    <p1>付款状态:${status!}</p1>
    <p1>支付宝交易号:${trade_no!}</p1>
    <p1>商户订单号:${out_trade_no!}</p1>
    <p1>付款金额:${total_amount!}</p1>
</div>
</body>
</html>
