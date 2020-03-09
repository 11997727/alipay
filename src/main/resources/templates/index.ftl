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
    <form action="/dopost">
       <input type="text" id="name" name="name" value="" placeholder="输入商品名称"><br/>
       <input type="text" id="price" name="price" value="" placeholder="请输入价格"><br/>
       <button type="submit" onclick="return yanzheng()">付款</button>
    </form>
</div>
</body>
</html>
<script>
    $(function () {

    })
    function yanzheng() {
        var name=$('#name').val()
        var price=$('#price').val()
        if(name==''||name==null){
          alert("请输入商品名称")
            return false
        }
        if (parseFloat(price).toString() == "NaN"||price<=0) {
            alert("请输入正确价格")
            return false;
        }
            return true;

    }

</script>