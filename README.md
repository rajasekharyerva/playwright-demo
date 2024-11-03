    mvn compile exec:java -D exec.mainClass="org.example.App"

### Set headless
    playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));


git remote add playwright-demo https://github.com/
git push --set-upstream playwright-demo main

…or create a new repository on the command line
echo "# playwright-demo" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/rajasekharyerva/playwright-demo.git
git push -u origin main

…or push an existing repository from the command line
git remote add origin https://github.com/rajasekharyerva/playwright-demo.git
git branch -M main
git push -u origin main
