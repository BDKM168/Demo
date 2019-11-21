/**
 * 冒泡排序：
 1.比较相邻的元素，如果第一个比第二大，就进行交换。
 2.对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这样在最后的元素才会是最大的数。
 3.针对所有的元素重复以上的步骤，除了最后一个。
 4.重复1-3，直到排序完成。
 * @param arr
 * @returns {*}
 */

function bubbleSort(arr){
    console.time('改进前冒泡排序耗时');
    var len = arr.length;
    for (var i = 0; i < len; i++) {
        for (var j = 0; j < len-1-i; j++) {
            if (arr[j]>arr[j+1]){
                //相邻元素进行对比，
                var temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
            }
        }
    }
    console.timeEnd('改进前冒泡排序耗时');
    return arr;
}

var arr=[3,44,38,5,47,15,36,26,27,2,46,4,19,50,483,44,38,5,47,15,36,26,27,2,46,4,19,50,483,44,38,5,47,15,36,26,27,2,46,4,19,50,48];

console.log(bubbleSort(arr));

