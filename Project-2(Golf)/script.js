var crsr = document.querySelector("#cursor")
var blur = document.querySelector("#cursor-blur")

document.addEventListener("mousemove" , function(dets){
     crsr.style.left = dets.x + "px" 
     crsr.style.top = dets.y + "px" 
     blur.style.left = dets.x - 250 + "px" 
     blur.style.top = dets.y - 250 + "px" 
})




gsap.to("#nav" , {
   backgroundColor : "black" ,
    duration : 0.5 ,
    delay : 1 ,
    height : "100px" ,

    scrollTrigger : {
        trigger : "#nav" , 
        scroller : "body" , 
        // markers : true ,  
        start : "top -11%" ,
        end :  " top -11%" ,
        scrub :  1   
    }   
})


gsap.to("#main" , {
    backgroundColor : "black" , 
    scrollTrigger : {
        trigger : "#main" , 
        scroller : "body" ,
        markers : true  , 
        start : "top - 80%" ,
        end : "top -100%" ,
        scrub : 2 
    }
})