<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Nomination Management</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f8f9fa;
        }
        .container {
            max-width: 600px;
            margin: 100px auto;
            text-align: center;
        }
        .btn {
            display: inline-block;
            padding: 15px 30px;
            border: none;
            border-radius: 5px;
            font-size: 18px;
            cursor: pointer;
            transition: background-color 0.3s;
            margin-bottom: 20px;
        }
        .btn-add {
            background-color: #28a745;
            color: #ffffff;
        }
        .btn-view {
            background-color: #007bff;
            color: #ffffff;
        }
        .btn-delete {
            background-color: #dc3545;
            color: #ffffff;
        }
        .btn:hover {
            background-color: rgba(0, 0, 0, 0.5);
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Nomination Management</h2>
        <form action="fillForm">
            <button type="submit" class="btn btn-add">Add Nomination</button>
        </form>
        <form action="showAll">
            <button type="submit" class="btn btn-view">View All Nominations</button>
        </form>
        <form action="deleteNominations">
            <button type="submit" class="btn btn-delete">Delete Nominations</button>
        </form>
    </div>
</body>
</html>