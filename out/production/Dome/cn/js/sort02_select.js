/**
 * 选择排序
 * 时间复杂度 O(n2)
 * 首先在未排序的序列中找到最小值或最大值放在起始位置，然后再从剩余的序列中寻找最小值或最大值
 * 
 */
function selectSort(arr) {
    var len=arr.length;
    var minIndex,temp;
    for (var i = 0; i < len - 1; i++) {
        minIndex=i;
        for (var j = i + 1; j < len; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex=j;
            }
        }
        temp=arr[i];
        arr[i]=arr[minIndex];
        arr[minIndex]=temp;
    }
    return arr;
}
var arr=[3,44,38,5,47,15,36,26,27,2,46,4,19,50,48];
console.log(selectSort(arr));