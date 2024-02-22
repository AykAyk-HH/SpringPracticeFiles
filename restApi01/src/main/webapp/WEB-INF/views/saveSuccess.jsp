<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }
        .container {
            max-width: 600px;
            margin: 20px auto;
            background-color: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
        .form-group {
            margin-bottom: 20px;
        }
        .form-group label {
            display: block;
            font-weight: bold;
            margin-bottom: 5px;
        }
        .form-group input[type="text"] {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 16px;
        }
        .form-group input[type="radio"] {
            margin-right: 10px;
        }
    </style>
 
<body>
	<div class="container">
        <h1>Form saved </h1>
             <div class="form-group">
                <label for="id">Employee ID : ${dets.getId()} </label>
            </div>
            <div class="form-group">
                <label for="name" >Name : ${dets.getName()} </label>
            </div>
           
            <div class="form-group">
                <label>Activity : ${dets.getActivity()} </label><br>
            </div>
       </div>
 
</body>
</html>