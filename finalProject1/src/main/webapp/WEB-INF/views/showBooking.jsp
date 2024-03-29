<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Display Booking Information</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            text-align: center;
        }

        h1 {
            color: #007bff; /* Blue color */
            margin-top: 50px;
        }

        h2 {
            color: #28a745; /* Green color */
            margin-top: 20px;
        }

        .container {
            margin-top: 50px;
            padding: 20px;
            border-radius: 10px;
            background-color: #fff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            max-width: 600px;
            margin-left: auto;
            margin-right: auto;
        }

        .btn {
            display: inline-block;
            padding: 10px 20px;
            background-color: #007bff;
            color: #fff;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            text-decoration: none;
            transition: background-color 0.3s ease;
        }

        .btn:hover {
            background-color: #0056b3;
        }
    </style>
</head>

<body>
    <div class="container">
        <h1>BOOKING DONE! ENJOY YOUR VACATION</h1>
        <h2>Your Id is : ${bID} use this to check your booking</h2>
        <a href="checkBookingForm" class="btn">Check Booking</a>
    </div>
</body>

</html>