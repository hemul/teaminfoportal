<!DOCTYPE html>

<html lang="en">
<head>
    <title>Team Info Portal</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>
</head>
<script type="text/javascript">
    fetch("/api/visits", {method: 'post'})
        .then(response => response.json())
        .then(visits => {
            visits.forEach(visit => {
                const el = document.createElement('li');
                el.innerText = visit.description;
                document.querySelector('#visits').append(el);
            });
        });
</script>

<body>
 <#include "header.html">
<h1>Welcome to Spring, ${name}</h1>

<div id="listOfVisits">
    <ul id="visits">
    </ul>
</div>

<form name='loginForm' action="/api/login" method="post">
    <fieldset>
        <legend>Login</legend>
        <label for="UserName">User name:</label>
        <input id="UserName" type="text" name="username"/>
        <label for="Password">Password:</label>
        <input id="Password" type="password" name="password"/>
        <br/>
        <button class="btn btn-primary" type="submit">Login</button>
    </fieldset>
</form>

</body>

</html>