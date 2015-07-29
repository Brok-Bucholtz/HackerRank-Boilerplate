import sys
import pytest
from src.main import solve_problem

if 2 <= sys.version_info.major < 3:
    from StringIO import StringIO
elif sys.version_info.major <= 3:
    from io import StringIO


# TODO: Modify for each HackerRank problem.
testcases = [
    (StringIO('2\n3'), '5'),
    (StringIO('1\n1'), '2'),
    (StringIO('1000\n1000'), '2000')]


@pytest.mark.timeout(10)  # HackerRank timeout of 10 seconds
@pytest.mark.parametrize("test_input, expected_output", testcases)
def test_all(test_input, expected_output):
    assert solve_problem(test_input) == expected_output
