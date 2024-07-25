
$(document).ready(function() {

console.log("Into Contact form JS");

     $('.send_button').on('click', function() {

console.log("Submit button clicked");

saveFormData();

            });

function saveFormData() {
         var name = document.getElementById('nameInput').value;
         var email = document.getElementById('emailInput').value;
         var message = document.getElementById('messageInput').value;

         // Check if the email is valid
         var emailRegex = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
         if (!emailRegex.test(email)) {
            alert("Please enter a valid email address.");
            return false;
         }

         // Store data in cookies
         document.cookie = "name=" + name + ";";
         document.cookie = "email=" + email + ";";
         document.cookie = "message=" + message + ";";

         // Display data on the page
         document.getElementById('formData').innerHTML = "Name: " + name + "<br>Email: " + email + "<br>Message: " + message;

         return false; // Prevent form submission
      }

      // Function to retrieve cookie data
      function getCookie(name) {
         var value = "; " + document.cookie;
         var parts = value.split("; " + name + "=");
         if (parts.length == 2) return parts.pop().split(";").shift();
      }

      // Display cookie data in the desired section
      var storedName = getCookie("name");
      var storedEmail = getCookie("email");
      var storedMessage = getCookie("message");

      if (storedName && storedEmail && storedMessage) {
         document.getElementById('formData').innerHTML = "Name: " + storedName + "<br>Email: " + storedEmail + "<br>Message: " + storedMessage;
      }
});