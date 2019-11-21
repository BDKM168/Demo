/**
 * 快速排序：
 * 首先选择一个基准，然后将待排序元素很基准相比较，最终可以得到两个序列，
 * 一个是大于基准，一个小于基准，然后对这两个序列采用上述的方法继续排序。
 */
/**
 * 步骤 ：
 * 1.从数列中挑选一个元素，成为基准。
 * 2.排序数列，将小于基准的元素放在基准前面。将大于基准的放在其后面。
 * 3.对上述得到的两个序列重复执行1,2步骤。
 */
function quickSort01(arr,left,right) {
    console.time('1.quick sort use time');
    if (left < right) {
        var x = arr[right],
            i=left-1,
            temp;
        for (var j = left; j <= right; j++) {
            if (arr[j] <= x) {
                i++;
                temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        quickSort01(arr,left,i-1);
        quickSort01(arr,i+1,right);
    }
    console.timeEnd('1.quick sort use time');
    return arr;
}
var arr=[3,44,38,5,47,15,36,26,27,2,46,4,19,50,48];
// console.log(quickSort01(arr,0,arr.length-1));

function quickSort02(arr) {
    if (arr.length <= 1) {
        return arr;
    }
    var pivotIndex = Math.floor(arr.length/2);
    var pivot=arr.splice(pivotIndex,1)[0];
    var left=[];
    var right=[];
    for (var i = 0; i < arr.length; i++) {
        if (arr[i < pivot]) {
            left.push(arr[i]);
        }else{
            right.push(arr[i]);
        }
    }
    // console.log('quick sort  2');
    return quickSort02(left).concat([pivot],quickSort02(right));
}
console.log(quickSort02(arr));
