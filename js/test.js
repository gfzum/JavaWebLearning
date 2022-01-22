var a = {
    name : "tex",
    age : 17,
    id: "my waifu",
    show : function (){alert("name=" + this.name + " " + this.age + " " + this.id)}
}
a.show();

function arg_test(){
    for (var i = 0; i < 4; i++) {
        alert(arguments[i]);
    }
}
arg_test(a.name,a.age,a.id);

var arr = [1,2,3];
alert(arr[4]);

