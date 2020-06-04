let number = /^[0-9]*$/;   //判断字符串是否为数字

function closeMenu(box){//手风琴特效菜单
  var parent = box.parentNode;
  var child = parent.childNodes;
  for (var i = 0; i < child.length-1; i++) {
    if (child[i].nodeName == 'H5')
    try { getNextTag(child[i]).className = "close"; } catch (e) {}
  }
  box = getNextTag(box);
  if(box.className == "open")
    box.className = "close";
  else
    box.className = "open";
}

function getNextTag(box){//查找下元一节点
  box = box.nextSibling;
  if (box == null)return;
  else if(box.nodeType == 1);
  else box = getNextTag(box);
  return box;
}
function createTag_Text(tagType,textName){//生成标签和名称
  var tag = document.createElement(tagType);
  tag.appendChild(document.createTextNode(textName));
  return tag;
}
function createArray_2(x,y,value){//生成数组
  var arr = new Array(x);
  for (var i = 0; i < arr.length; i++) {
    arr[i] = new Array(y);
    for (var j = 0; j < arr[i].length; j++) {
      arr[i][j] = value;
    }
  }
  return arr;
}
function createButton(name,method){//生成按键
  var button = createTag_Text("input","");
  button.setAttribute("value",name);
  button.setAttribute("type","button");
  if (method != undefined)
    button.onclick = method;//装载方法
  return button;
}
function createCheckbox(isYes,method){//生成单选框
  var checkbox = createTag_Text("checkbox","")
  checkbox = createTag_Text("input","");
  checkbox.setAttribute("type","checkbox");
  if (method != undefined)
    checkbox.setAttribute("onclick",method);//装载方法
  if(isYes == true || isYes == 1 ||isYes == "yes")
    checkbox.checked = true;//默认勾选
  else
    checkbox.checked = false;
  return checkbox;
}
function AjaxTransfer(url,sendData,funY,fnuN,type,dataType) {
  if (funY == undefined) funY = function(msg){alert("返回数据为："+msg);}
  if (fnuN == undefined) fnuN = function(){alert("你的操作非法！\n或服务器正忙，请重试！");}
  if (type == undefined)type = "POST";
  if (dataType == undefined)dataType = "text";
  $.ajax( {
    type: type, url: url, data: sendData,
    dataType: dataType, success:funY, error:fnuN
  })
}
function OptionDate(elLabel) {//获取日历
  elLabel.datepicker({
    changeMonth: true,
    changeYear: true
  });
  elLabel.change(function() {
    elLabel.datepicker( "option", "dateFormat", "yy-mm-dd" );
  });
}
function HideOrShow(aLabel,isHide) {//隐藏与显示标签
    if (isHide) aLabel.attr("hidden","hidden");
    else aLabel.removeAttr("hidden");
}