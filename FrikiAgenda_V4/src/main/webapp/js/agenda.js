$(document).ready(function(){
    
	console.log("Hola mundo");
	
    $.ajax({
        dataType: "json",
        url: "listaCat",
        success: function(result){
            console.log("Dentro de ajax");
            console.log(result);
        }
    })
	
	
	
	
    
    
    
    
});