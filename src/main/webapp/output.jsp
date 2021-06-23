<!DOCTYPE html>
<html lang="en">
<head>
  <title>CurrencyConverter</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body style="background-color:#1b1b2c;">

<div class="container">
<br><br><br>
<div class="card" style="margin: 0 auto;">
  
  <div class="card-body">
    <h4 class="card-title" style="text-align:center;padding:20px;font-size:40px;color:#000;">Total Amount: </h4>
    <p class="card-text" style="text-align:center;padding:10px;font-size:20px;color:#000;"><%=request.getAttribute("result")%></p>
    
    
    <h4 class="card-title" style="text-align:center;padding:20px;font-size:40px;color:#000;">Charges: </h4>
    <p class="card-text" style="text-align:center;padding:10px;font-size:20px;color:#000;"><%=request.getAttribute("charges")%></p>
    
    <h4 class="card-title" style="text-align:center;padding:20px;font-size:40px;color:#000;">Net Amount: </h4>
    <p class="card-text" style="text-align:center;padding:10px;font-size:20px;color:#000;"><%=request.getAttribute("netAmount")%></p>
    
  </div>
</div>
</div>
</body>
</html>
