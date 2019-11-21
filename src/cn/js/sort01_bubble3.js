/**
 * 传统的冒泡排序中每一趟排序操作只能找到一个最大值或最小值，我们考虑用在
 * 每趟排序中进行正向和反向两边冒泡的方法，可以一次得到两个最终值，从而使排序趟数减少一半。
 */
function bubbleSort3(arr) {
    var low=0;
    var high = arr.length-1;
    var tmp,j;
    console.time('2.改进后冒泡排序耗时');
    while (low < high) {
        for (j=low;j<high;++j){
            // 正向冒泡
            if (arr[j]>arr[j+1]){
                tmp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=tmp;
            }
        }
        high--;
        for (j=high;j>low;--j){
            if(arr[j]<arr[j-1]){
                tmp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=tmp;
            }
        }
        low++;
    }
    console.timeEnd('2.改进后冒泡排序耗时');
    return arr;
}

var arr=[3,44,38,5,47,15,36,26,27,2,46,4,19,50,483,44,38,5,47,15,36,26,27,2,46,4,19,50,483,44,38,5,47,15,36,26,27,2,46,4,19,50,48];
console.log(bubbleSort3(arr));
