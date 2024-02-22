<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee Information Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f8f9fa;
        }
        .container {
            max-width: 600px;
            margin: 20px auto;
            background-color: #ffffff;
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
            width: calc(100% - 22px);
            padding: 10px;
            border: 1px solid #ced4da;
            border-radius: 5px;
            font-size: 16px;
        }
        .form-group input[type="radio"] {
            margin-right: 10px;
        }
        .form-group button[type="submit"] {
            display: inline-block;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            background-color: #007bff;
            color: #ffffff;
            font-size: 16px;
            cursor: pointer;
        }
        .form-group button[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Employee Information Form</h2>
        <form action="saveForm" method="post">
            <div class="form-group">
                <label for="name">Enter Name:</label>
                <input type="text" id="name" name="name" required>
            </div>
            <div class="form-group">
                <label for="id">Employee ID:</label>
                <input type="text" id="id" name="id" required>
            </div>
            <div class="form-group">
                <label>Hobbies:</label><br>
                <input type="radio" id="singing" name="activity" value="Singing">
                <label for="singing">Singing</label><br>
                <input type="radio" id="dancing" name="activity" value="Dancing">
                <label for="dancing">Dancing</label><br>
                <input type="radio" id="cooking" name="activity" value="Cooking">
                <label for="cooking">Cooking</label><br>
                <input type="radio" id="paanMaking" name="activity" value="Paan making">
                <label for="paanMaking">Paan making</label><br>
                <input type="radio" id="rampWalk" name="activity" value="Ramp walk">
                <label for="rampWalk">Ramp walk</label>
            </div>
            <button type="submit">Submit</button>
        </form>
    </div>
<!--     <div class="container" style="text-align: center;"> -->
<!--         <form action="showAll"> -->
<!--             <div class="form-group"> -->
<!--                 <button type="submit">Show all entries</button> -->
<!--             </div> -->
<!--         </form> -->
<!--     </div> -->
</body>
</html>