$( document ).ready(function() {
     /* Create new Item */
     $("#login-submit").click(function(e){
 
         e.preventDefault(); 
         var username = $("#login-form").find("input[name='username']").val();
         var password = $("#login-form").find("input[name='password']").val(); 
         var name = $("#login-form").find("input[name='name']").val();
         var surname = $("#login-form").find("input[name='surname']").val();
         var email = $("#login-form").find("input[name='email']").val();
         var country = $("#login-form").find("input[name='country']").val();
         
         if(username != '' && password != ''){
             $.ajax({
                 dataType: 'json',
                 type:'POST',
                 url: "/WebDevProject/InsertCtrl",
                 data:{username:username, password:password, name:name, surname:surname, email:email, country:country }         
             }).done(function(data) {
            	 console.log(data[0].status);
            	 if (data[0].status ==true) {
            		 alert ("Hi " + name + " you are connected" );
            	
            	 } else {
            		 alert ("Error, try again")
            	 }
            	 
             });        
         }
     });
    
   });