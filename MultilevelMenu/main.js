var index = 1;
		var interval = setInterval(function(){
			$(".banner").css("opacity", "0");
			$(".banner" + index).animate({
				"opacity": "1"
			},2000);
			++index;
			if(index > 3){
				index = 1;
			}
		}, 2000);

$('li.dropdown').mouseover(function() {   
    $(this).addClass('open');    }).mouseout(function() {        $(this).removeClass('open');    });