'use strict';

var assert = require('assert');
var main = require('../src/main.js');

describe('Main', function() {
    //TODO: Modify for each HackerRank problem.
    it('should add two numbers together', function() {
        assert.equal(main.processData("2\n3"), 5);
        assert.equal(main.processData("1\n1"), 2);
        assert.equal(main.processData("1000\n1000"), 2000);
    });
});
