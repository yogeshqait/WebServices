<!DOCTYPE html>
<html>
    <head>
         <title>login</title>
         <meta charset="utf-8">
         <meta name="viewport" content="width=device-width, initial-scale=1">  
         <link rel="stylesheet" href="styles.css">
         <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
         <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
         <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
         <script src="home.js"></script>
         
     </head>
     <body>
         <div class="header">
            <div class="header-image">
                <br>
                &nbsp;
               <img src="demo-logo.png" alt="demo-logo" width="100" height="100"> 
            </div>
         </div>
        <div class="boxed">
               <br><br>
               <form method="post" action="home.html">
               <label>Email :</label><br>
               <input type="email" name="useremail" title="Please Enter Valid email"required 
               placeholder="Enter Your Email"><br>
               <label>Password : </label> <br>
               <input type="password" name="password" required placeholder="Enter password"><br>
               <input type="checkbox" checked="checked" name="remember"> <label>Keep me Logged in</label><br>
               <input type="submit" width="50" height="50" > </input>
               <button type="button" width="50" height="50" onclick="location.href = 'signup.jsp';"> Signup </button>
            </form>
        </div>
        <footer>
         Having trouble Signing In
            <h6 style="color:black;">Contact us:</h6>
             21, Elm street, Revello Drive, Sunnydale, CA <br>
            <a href="mailto:someone@example.com">
            someone@example.com</a>
          </footer> 
     </body>
</html>