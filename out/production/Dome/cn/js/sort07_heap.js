/**
 *  堆排序利用堆这种数据结构所设计的排序算法。
 *  堆积是一个近似完全二叉树的结构，并同时满足堆积的性质：
 *  即子节点的键值或索引总是小于（或大于）它的父节点。
 *
 *
 *  最佳情况：T(n) = O(nlogn)
 *  最差情况：T(n) = O(nlogn)
 *  平均情况：T(n) = O(nlogn)
 */
function heapSort(arr) {
    var heapSize = arr.length,
        temp;
    for (var i = Math.floor(heapSize/2)-1; i >= 0; i--) {
        heapify(arr,i,heapSize);
    }
    // 堆排序
    for (var j = heapSize-1; j >=1 ; j--) {
        temp=arr[0];
        arr[0]=arr[j];
        arr[j]=temp;
        heapify(arr,0,--heapSize);
    }
    return arr;
}

function heapify(arr, x, len) {
    var l =2*x+1,
        r=2*x+2,
        largest=x,
        temp;
    if (l < len && arr[l] > arr[largest]) {
        largest=l;
    }
    if (r < len && arr[r] > arr[largest]) {
        largest=r;
    }
    if (largest != x) {
        temp=arr[x];
        arr[x]=arr[largest];
        arr[largest]=temp;
        heapify(arr,largest,len);
    }
}
var arr=[91,60,96,13,35,65,46,65,10,30,20,31,77,81,22];
console.log(heapSort(arr));

