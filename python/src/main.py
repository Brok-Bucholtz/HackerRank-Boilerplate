import sys


def solve_problem(file_input):
    # TODO: Modify the below for each HackerRank problem
    num1 = int(file_input.readline())
    num2 = int(file_input.readline())

    return str(num1 + num2)

if __name__ == '__main__':
    sys.stdout.write(solve_problem(sys.stdin))
