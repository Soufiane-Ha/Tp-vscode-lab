### result of part 01 lab01 python test: 

```powershell
PS C:\Users\ELITE COMPUTER\Tp-vscode-lab> cd docs/lab01-python-test
PS C:\Users\ELITE COMPUTER\Tp-vscode-lab\docs\lab01-python-test> python -m venv venv
PS C:\Users\ELITE COMPUTER\Tp-vscode-lab\docs\lab01-python-test> .\venv\Scripts\activate
(venv) PS C:\Users\ELITE COMPUTER\Tp-vscode-lab\docs\lab01-python-test> 
```

### result of Run command: 

```powershell
PS C:\Users\ELITE COMPUTER\Tp-vscode-lab> & "C:/Users/ELITE COMPUTER/AppData/Local/Python/bin/python.exe" "c:/Users/ELITE COMPUTER/Tp-vscode-lab/docs/lab01-python-test/main.py"
Hello, World!
PS C:\Users\ELITE COMPUTER\Tp-vscode-lab> 
```

### pip install result: 
```powershell
PS C:\Users\ELITE COMPUTER\Tp-vscode-lab> pip install pytest
Requirement already satisfied: pytest in C:\Users\ELITE COMPUTER\AppData\Local\Python\pythoncore-3.14-64\Lib\site-packages (9.0.3)
Requirement already satisfied: colorama>=0.4 in C:\Users\ELITE COMPUTER\AppData\Local\Python\pythoncore-3.14-64\Lib\site-packages (from pytest) (0.4.6)
Requirement already satisfied: iniconfig>=1.0.1 in C:\Users\ELITE COMPUTER\AppData\Local\Python\pythoncore-3.14-64\Lib\site-packages (from pytest) (2.3.0)
Requirement already satisfied: packaging>=22 in C:\Users\ELITE COMPUTER\AppData\Local\Python\pythoncore-3.14-64\Lib\site-packages (from pytest) (26.2)
Requirement already satisfied: pluggy<2,>=1.5 in C:\Users\ELITE COMPUTER\AppData\Local\Python\pythoncore-3.14-64\Lib\site-packages (from pytest) (1.6.0)
Requirement already satisfied: pygments>=2.7.2 in C:\Users\ELITE COMPUTER\AppData\Local\Python\pythoncore-3.14-64\Lib\site-packages (from pytest) (2.20.0)

[notice] A new release of pip is available: 26.0.1 -> 26.1.1      
[notice] To update, run: C:\Users\ELITE COMPUTER\AppData\Local\Python\pythoncore-3.14-64\python.exe -m pip install --upgrade pip   
```

### Test result: 
```powershell
PS C:\Users\ELITE COMPUTER\Tp-vscode-lab> python -m pytest
====================== test session starts ======================
platform win32 -- Python 3.14.4, pytest-9.0.3, pluggy-1.6.0       
rootdir: C:\Users\ELITE COMPUTER\Tp-vscode-lab
collected 1 item                                                 

docs\lab01-python-test\test_main.py .                      [100%] 

======================= 1 passed in 0.11s ======================= 
```
