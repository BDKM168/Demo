/**
 * 基数排序也是一种非比较排序。对每一位进行排序，从最低位开始排序
 * 数据范围较小，建议小于1000
 * 每个数值都要大于等于0
 *
 * 最佳情况：T(n) = O(n * k)
 最差情况：T(n) = O(n * k)
 平均情况：T(n) = O(n * k)
 */
function radixSort(arr,maxDigit) {
    var mod=10,
        dev=1,
        counter=[];
    for (var i = 0; i < maxDigit; i++,dev*=10,mod*=10) {
        for (var j = 0; j < arr.length; j++) {
            var bucket = parseInt((arr[j] % mod)/dev);
            if (counter[bucket] == null) {
                counter[bucket]=[];
            }
            counter[bucket].push(arr[j]);
        }
        var pos = 0;
        for (var j = 0; j < counter.length; j++) {
            var value = null;
            if (counter[j] != null) {
                while((value=counter[j].shift())!=null){
                    arr[pos++]=value;
                }
            }
        }
    }
    return arr;
}
var arr=[3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48];
console.log(radixSort(arr,2));