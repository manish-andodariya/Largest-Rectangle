
function getMax(arr)
{
    var max = 0;
    for (var i = 0; i < arr.length; i++) {
        var total = 0;
        var current = arr[ i ];
        for (var j = i - 1; j >= 0; j--) {
            if (arr[ j ] >= current) {
                total++;
                console.log("Left" + total);
            } else {
                break;
            }
        }
        for (var k = i + 1; k < arr.length; k++) {
            if (arr[ k ] >= current) {
                total++;
                console.log("Right" + total);
            } else {
                console.log("Skipped");
                break;
            }
        }
        var temp = (total + 1) * arr[ i ];
        console.log("Max of " + i + "is" + temp);
        if (temp > max) {
            max = temp;
        }
    }
    return max;
}

var building = [ 1, 2, 3, 4, 5 ];
var result = getMax(building);
console.log(result);