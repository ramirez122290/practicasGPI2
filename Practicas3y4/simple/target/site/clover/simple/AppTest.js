var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":35,"id":4,"methods":[{"el":18,"sc":5,"sl":15},{"el":34,"sc":5,"sl":20}],"name":"AppTest","sl":10}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_0":{"methods":[{"sl":15}],"name":"shouldAnswerWithTrue","pass":true,"statements":[{"sl":17}]},"test_1":{"methods":[{"sl":20}],"name":"stringOutputTest","pass":true,"statements":[{"sl":23},{"sl":24},{"sl":25},{"sl":27},{"sl":28},{"sl":29},{"sl":31},{"sl":33}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [0], [], [0], [], [], [1], [], [], [1], [1], [1], [], [1], [1], [1], [], [1], [], [1], [], []]
