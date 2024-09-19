

document.querySelectorAll('.card').forEach(card=>{
    gsap.to('.card2',{
        scale:0.7,
        opacity:0,
        
        scrollTrigger:{
            trigger:".card2",
            start:"top 15%",
            end:"bottom 15%",
            markers:true,
            scrub:true,
        }
        
        })

})



   