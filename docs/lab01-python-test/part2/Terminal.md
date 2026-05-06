### Test factorial part 2 pytest run result:

```powershell
PS C:\Users\ELITE COMPUTER\Tp-vscode-lab> python -m pytest
====================== test session starts ======================
platform win32 -- Python 3.14.4, pytest-9.0.3, pluggy-1.6.0       
rootdir: C:\Users\ELITE COMPUTER\Tp-vscode-lab
collected 2 items                                                

docs\lab01-python-test\part2\test_factorial.py F           [ 50%]
docs\lab01-python-test\test_main.py .                      [100%] 

=========================== FAILURES ============================ 
________________________ test_factorial _________________________ 

    def test_factorial():
        assert factorial(0) == 1
>       assert factorial(1) == 1
E       assert 2 == 1
E        +  where 2 = factorial(1)

docs\lab01-python-test\part2\test_factorial.py:5: AssertionError  
==================== short test summary info ==================== 
FAILED docs/lab01-python-test/part2/test_factorial.py::test_factorial - assert 2 == 1
================== 1 failed, 1 passed in 0.12s ================== 
PS C:\Users\ELITE COMPUTER\Tp-vscode-lab> 
```
