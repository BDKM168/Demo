/**
 * 计数排序：
 * 输入的线性表的元素属于有限偏序集S；
 * 数排序的基本思想是对于给定的输入序列中的每一个元素x，
 * 确定该序列中值小于x的元素的个数
 */
function coutingSort(arr) {
    var len=arr.length,
        B=[],
        C=[],
        min=max=arr[0];
    for (var i = 0; i < len; i++) {
        min=min<=arr[i]?min:arr[i];
        max=max>=arr[i]?max:arr[i];
        C[arr[i]]=C[arr[i]]?C[arr[i]]+1:1;
    }
    for (var j = min; j < max; j++) {
        C[j+1]=(C[j+1]||0)+(C[j]||0);
    }
    for (var k = len-1; k >=0 ; k--) {
        B[C[arr[k]]-1]=arr[k];
        C[arr[k]]--;
    }
    return B;
}
var arr=[2,2,3,8,7,1,2,2,2,7,3,9,8,2,1,4,2,4,6,9,7,4,3];
console.log(coutingSort(arr));