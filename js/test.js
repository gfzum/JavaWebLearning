var a = {
    name : "tex",
    age : 17,
    id: "my waifu",
    show : function (){alert("name=" + this.name + " " + this.age + " " + this.id)}
}
//a.show();

function arg_test(){
    for (var i = 0; i < 4; i++) {
        alert(arguments[i]);
    }
}
//arg_test(a.name,a.age,a.id);

var arr = [1,2,3];
//alert(arr[4]);

window.onload = function (){
    var textObj = document.getElementById("text");
    textObj.onblur = function (){
        console.log("lose focus")
    }
    var resetObj = document.getElementById("reset");
    resetObj.onclick = function (){
        alert("reset")
    }
    // var testObj = document.getElementById("class01");
    // textObj.onclick = function (){
    //     alert("test click")
    // }
    var selObj = document.getElementById("sel");
    selObj.onchange = function (){
        alert("sel change")
    }
    var formObj = document.getElementById("form");
    formObj.onsubmit = function (){
        alert("submit false");
        return false;
    }

    var checkObj = document.getElementById("check");
    checkObj.onclick = function (){
        var textObj = document.getElementById("text");
        var pat = /^\w{5,12}$/;
        if (pat.test(textObj.value))
            alert("right");
        else
            alert("false");
    }

}