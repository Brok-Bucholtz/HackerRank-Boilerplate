from __future__ import print_function

import sys
from setuptools import setup

install_requires = [
    'pytest >=2.7.1',
    'pytest-timeout >=0.4',
    # ML/NLP Challenges
    # 'numpy',
    # 'scipy',
    # 'sklearn',
    # 'nltk'
]

setup(
    name="hackerrankboilerplate",
    version="1.0.0",
    author="Brok Bucholtz",
    url="https://github.com/Brok-Bucholtz/HackerRankBoilerplate",
    install_requires=install_requires,
    license="MIT",
)

# HackerRank's current runtime versions: https://www.hackerrank.com/environment
if sys.version_info.major == 2 and sys.version_info != (2, 7, 6):
    print('WARNING: HackerRank uses python2 version 2.7.6')
elif sys.version_info.major == 3 and sys.version_info != (3, 4, 0):
    print('WARNING: HackerRank uses python3 version 3.4.0')
