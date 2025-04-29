<div class="mb-4 rounded-lg border bg-linear-to-b from-gray-100 to-white to-10% p-4 py-2 sm:p-5"> <div class="relative">  <div class="my-2 flex items-center justify-between gap-2 sm:my-7"> <div class=""> <h1 class="mb-1 text-xl font-semibold sm:mb-2 sm:text-3xl"> Number Guessing Game </h1> <p class="text-sm text-balance text-gray-500"> Build a simple number guessing game to test your luck. </p> </div>  </div> </div> <astro-island uid="Z16i4h6" prefix="r13" component-url="/_astro/ProjectStepper.DVJDYZDp.js" component-export="ProjectStepper" renderer-url="/_astro/client.DNdMcqFj.js" props="{&quot;projectId&quot;:[0,&quot;number-guessing-game&quot;]}" client="load" opts="{&quot;name&quot;:&quot;ProjectStepper&quot;,&quot;value&quot;:true}" await-children=""></astro-island> <div class="prose prose-h2:mb-3 prose-h2:mt-5 prose-h3:mb-1 prose-h3:mt-5 prose-p:mb-2 prose-blockquote:font-normal prose-blockquote:text-gray-500 prose-pre:my-3 prose-ul:my-3.5 prose-hr:my-5 max-w-full [&amp;>ul>li]:my-1"> <p>You are required to build a simple number guessing game where the computer randomly selects a number and the user has to guess it. The user will be given a limited number of chances to guess the number. If the user guesses the number correctly, the game will end, and the user will win. Otherwise, the game will continue until the user runs out of chances.</p>
<h2 id="requirements">Requirements</h2>
<p>It is a CLI-based game, so you need to use the command line to interact with the game. The game should work as follows:</p>
<ul>
<li>When the game starts, it should display a welcome message along with the rules of the game.</li>
<li>The computer should randomly select a number between 1 and 100.</li>
<li>User should select the difficulty level (easy, medium, hard) which will determine the number of chances they get to guess the number.</li>
<li>The user should be able to enter their guess.</li>
<li>If the user’s guess is correct, the game should display a congratulatory message along with the number of attempts it took to guess the number.</li>
<li>If the user’s guess is incorrect, the game should display a message indicating whether the number is greater or less than the user’s guess.</li>
<li>The game should end when the user guesses the correct number or runs out of chances.</li>
</ul>
<p>Here is a sample output of the game:</p>
<pre class="astro-code dracula" style="background-color:#282A36;color:#F8F8F2; overflow-x: auto;" tabindex="0" data-language="plaintext"><code><span class="line"><span>Welcome to the Number Guessing Game!</span></span>
<span class="line"><span>I'm thinking of a number between 1 and 100.</span></span>
<span class="line"><span>You have 5 chances to guess the correct number.</span></span>
<span class="line"><span></span></span>
<span class="line"><span>Please select the difficulty level:</span></span>
<span class="line"><span>1. Easy (10 chances)</span></span>
<span class="line"><span>2. Medium (5 chances)</span></span>
<span class="line"><span>3. Hard (3 chances)</span></span>
<span class="line"><span></span></span>
<span class="line"><span>Enter your choice: 2</span></span>
<span class="line"><span></span></span>
<span class="line"><span>Great! You have selected the Medium difficulty level.</span></span>
<span class="line"><span>Let's start the game!</span></span>
<span class="line"><span></span></span>
<span class="line"><span>Enter your guess: 50</span></span>
<span class="line"><span>Incorrect! The number is less than 50.</span></span>
<span class="line"><span></span></span>
<span class="line"><span>Enter your guess: 25</span></span>
<span class="line"><span>Incorrect! The number is greater than 25.</span></span>
<span class="line"><span></span></span>
<span class="line"><span>Enter your guess: 35</span></span>
<span class="line"><span>Incorrect! The number is less than 35.</span></span>
<span class="line"><span></span></span>
<span class="line"><span>Enter your guess: 30</span></span>
<span class="line"><span>Congratulations! You guessed the correct number in 4 attempts.</span></span></code></pre>
<p>To make the game more interesting, you can add the following features:</p>
<ul>
<li>Allow the user to play multiple rounds of the game (i.e., keep playing until the user decides to quit). You can do this by asking the user if they want to play again after each round.</li>
<li>Add a timer to see how long it takes the user to guess the number.</li>
<li>Implement a hint system that provides clues to the user if they are stuck.</li>
<li>Keep track of the user’s high score (i.e., the fewest number of attempts it took to guess the number under a specific difficulty level).</li>
</ul> </div> <div class="mt-5 flex flex-wrap items-center justify-center rounded-lg p-2.5 text-sm"> <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 98 96" xmlns:v="https://vecta.io/nano" class="mr-2 inline-block h-5 w-5"><path fill-rule="evenodd" d="M48.854 0C21.839 0 0 22 0 49.217c0 21.756 13.993 40.172 33.405 46.69 2.427.49 3.316-1.059 3.316-2.362l-.08-9.127c-13.59 2.934-16.42-5.867-16.42-5.867-2.184-5.704-5.42-7.17-5.42-7.17-4.448-3.015.324-3.015.324-3.015 4.934.326 7.523 5.052 7.523 5.052 4.367 7.496 11.404 5.378 14.235 4.074.404-3.178 1.699-5.378 3.074-6.6-10.839-1.141-22.243-5.378-22.243-24.283 0-5.378 1.94-9.778 5.014-13.2-.485-1.222-2.184-6.275.486-13.038 0 0 4.125-1.304 13.426 5.052a46.97 46.97 0 0 1 12.214-1.63c4.125 0 8.33.571 12.213 1.63 9.302-6.356 13.427-5.052 13.427-5.052 2.67 6.763.97 11.816.485 13.038 3.155 3.422 5.015 7.822 5.015 13.2 0 18.905-11.404 23.06-22.324 24.283 1.78 1.548 3.316 4.481 3.316 9.126l-.08 13.526c0 1.304.89 2.853 3.316 2.364 19.412-6.52 33.405-24.935 33.405-46.691C97.707 22 75.788 0 48.854 0z" fill="currentColor"></path></svg>
Found a mistake?
<a class="ml-1 underline underline-offset-2" href="https://github.com/kamranahmedse/developer-roadmap/tree/master/src/data/projects/number-guessing-game.md" target="_blank">
Help us improve.
</a> </div> </div>
