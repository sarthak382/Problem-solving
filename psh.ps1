echo "Hello"
$mssg = Read-Host -Prompt 'ENTER GITHUB MESSAGE'
echo $mssg
if($mssg){
 echo "Pushing...$mssg" 
#  git add .
#  git commit -m"$mssg"
#  git push
echo"successfully pushed to github"
# del "push.class"
}
else{
echo "Message is Null!..Kuch Dalo"
 powershell.exe -ExecutionPolicy ByPass -File C:\Users\sarth\OneDrive\Desktop\ProblemSolving\psh.ps1
}