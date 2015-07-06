<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="favicon.ico">

    <title>Navbar Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

      <script id="some-template" type="text/x-handlebars-template">
      <ul class="list-group">
        <li class="list-group-item">Assignee Name   :: {{assigneeName}}</li>
        <li class="list-group-item">Assignment Name :: {{assignmentName}}</li>
        <li class="list-group-item">Start Date      :: {{creationDate}}</li>
        <li class="list-group-item">End Date        :: {{dueDate}}</li>
      </ul>
      </script>

  </head>

  <body>

    <div class="form-group"></div>
    <div class="container">
     <div class="page-header">
         <h4>Simple web application to demostrate the usage of Spring MVC + MyBatis, Bootstrap, handlebar, Jquery with Ajax call, Maven, Jetty integrated, Rest API, Junit, Annotations</h4>
      </div>
     <div class="form-group">
      <div class="dropdown">
        <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
            Assignee List to Select
        <span class="caret"></span>
        </button>
        <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
          <c:forEach var="o" items="${objects}">
            <li ><a href="#" id="${o.assigneeId}" >${o.assigneeName}</a></li>
          </c:forEach>
        </ul>
      </div>
      </div>
      <div class="form-group">
        <div id="content"></div>
      </div>
   </div> <!-- /container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/handlebars-v3.0.3.js"> </script>
    <script language="javascript">
       $(function(retData){
        $(".dropdown-menu li a").click(function(){
          $(this).parents(".dropdown").find('.btn').text($(this).text());
          $(this).parents(".dropdown").find('.btn').val($(this).text());
          var id=$(this).attr('id');
          var urlVal =  "/assignment/rest/filterby/id/"+id;
           jQuery.ajax({
                   type: "GET",
                   url: urlVal,
                   contentType: "application/json; charset=utf-8",
                   dataType: "json",
                   success: function (data, status) {
                       var source   = $("#some-template").html();
                       var template = Handlebars.compile(source);
                       $("#content").html(template(data));
                   }
          });


         });
   });
    </script>

  </body>
</html>
