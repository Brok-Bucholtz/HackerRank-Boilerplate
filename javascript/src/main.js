'use strict';

function processData(input) {
    //TODO: Modify the below for each HackerRank problem
    var inputLines = input.split("\n");

    var a = parseInt(inputLines[0]);
    var b = parseInt(inputLines[1]);

    return a + b;
}

var _input = "";
process.stdin.resume();
process.stdin.setEncoding("ascii");
process.stdin.on("data", function(input) { _input += input; });
process.stdin.on("end", function() { console.log(processData(_input)); });

if(exports) { exports.processData = processData; }
