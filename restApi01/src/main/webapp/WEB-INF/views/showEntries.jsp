<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="com.expleo.nominationWebsite.entity.NomineeDetails"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Display Nominee Details</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }
        .container {
            max-width: 800px;
            margin: 20px auto;
            background-color: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }
        th, td {
            padding: 8px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Nominee Details</h2>
        <table>
            <thead>
                <tr>
                    <th>Name</th>
                    <th>ID</th>
                    <th>Activity</th>
                </tr>
            </thead>
            <tbody>
                <%
                    // Assuming itr contains objects of NomineeDetails class
                    Iterable<NomineeDetails> itr = (Iterable<NomineeDetails>) request.getAttribute("itr");
                    for (NomineeDetails nominee : itr) {
                %>
                        <tr>
                            <td><%= nominee.getName() %></td>
                            <td><%= nominee.getId() %></td>
                            <td><%= nominee.getActivity() %></td>
                        </tr>
                <%
                    }
                %>
            </tbody>
        </table>
    </div>
</body>
</html>