/**
 * 插入排序
 * 步骤--|
 *    1.从第一个元素开始，该元素默认已经排序。
 *    2.取出下一个元素，在已经排序的元素序列中从后向前扫描。
 *    3.如果序列中的元素大于新元素，则将该元素移到下一位置
 *    4.重复步骤3，直到找到已排序的元素小于或者等于新元素的位置；
 *    5.
 *
 */
function insertSort01(arr) {
    for (var i = 0; i < arr.length; i++) {
        var key=arr[i];
        var j= i-1;
        while (j >= 0 && arr[j] > key) {
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=key;
    }
    return arr;
}
arr=[3,44,38,5,47,15,36,26,27,2,46,4,19,50,48];
console.log(arr);
