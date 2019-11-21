/**
插入排序 改进版
查找插入位置时 使用二分查找的方式
 */
function insertSort02(arr) {
    for (var i = 0; i < arr.length; i++) {
        var key = arr[i];
        var left=0;
        var right=i-1;
        while(left<=right){
            var middle = parseInt((left+right)/2);
            if (key < arr[middle]) {
                right=middle-1;
            }else{
                left=middle+1;
            }
        }
        for (var j = i-1; j >=left; j--) {
            arr[j+1]=arr[j];
        }
        arr[left]=key;
    }
    return arr;
}

arr=[3,44,38,5,47,15,36,26,27,2,46,4,19,50,48];
console.log(insertSort02(arr));
