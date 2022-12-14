package com.example.quotes;



import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.renderscript.Sampler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.ColorInt;
import androidx.annotation.ColorLong;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class quoteAdapter extends RecyclerView.Adapter<quoteAdapter.ViewData> {
    Activity activity;
    List<ModelData>l1=new ArrayList();

    int i;

    String[] love={
    "As he read, I fell in love the way you fall asleep: slowly, and then all at once.",
    "Loved you yesterday, love you still, always have, always will.",
    "I saw that you were perfect, and so I loved you. Then I saw that you were not perfect and I loved you even more.",
    "Thinking of you keeps me awake. Dreaming of you keeps me asleep. Being with you keeps me alive.",
    "I need you like a heart needs a beat.",
    "If I know what love is, it is because of you.",
    "I swear I couldn’t love you more than I do right now, and yet I know I will tomorrow.",
    "If you live to be a hundred, I want to live to be a hundred minus one day so I never have to live without you.",
    "A man is already halfway in love with any woman who listens to him.",
    "Women are meant to be loved, not to be understood.”",
    "You make me want to be a better man.",
    "Love is that condition in which the happiness of another person is essential to your own.",
    "He is not a lover who does not love forever.",
    "To love is to burn, to be on fire.",
    "Pleasure of love lasts but a moment. Pain of love lasts a lifetime."};

    String[] Alon={
            "It’s far better to be unhappy alone than unhappy with someone — so far.",
           "Laugh and the world laughs with you, snore and you sleep alone.",
           "It’s easy to stand with the crowd it takes courage to stand alone",
           "I used to think the worst thing in life was to end up all alone, it’s not. The worst thing in life is to end up with people that make you feel all alone.",
           "Sometimes, you need to be alone. Not to be lonely, but to enjoy your free time being yourself.",
           "You smile, but you wanna cry. You talk, but you wanna be quiet. You pretend like you’re happy, but you aren’t.",
           "Sometimes, you just need a break. In a beautiful place. Alone. To figure everything out.",
           "What a lovely surprise to finally discover how unlonely being alone can be.",
           "As I get older I’m more and more comfortable being alone.",
           "Loneliness adds beauty to life. It puts a special burn on sunsets and makes night air smell better.",
           "Once you start loving your own presence, you stop chasing people in your life.",
           "Sometimes you just need to be alone and let your tears out.",
           "The soul that sees beauty may sometimes walk alone.",
           "Nothing can bring you peace but yourself.",
           "Being alone has a power that very few people can handle."};
    String[] sad={
              "There are moments when I wish I could roll back the clock and take all the sadness away, but I have the feeling that if I did, the joy would be gone as well.",
              "Life's under no obligation to give us what we expect.",
              "You see, I usually find myself among strangers because I drift here and there trying to forget the sad things that happened to me.",
              "Don't go around saying the world owes you a living. The world owes you nothing. It was here first.",
              "Things change. And friends leave. And life doesn't stop for anybody.",
              "Life is a moderately good play with a badly written third act.",
              "I have learned now that while those who speak about one's miseries usually hurt, those who keep silence hurt more.",
              "The excursion is the same when you go looking for your sorrow as when you go looking for your joy.",
              "Don't ever tell anybody anything. If you do, you start missing everybody.",
              "So it's true, when all is said and done, grief is the price we pay for love.",
              "Our dead are never dead to us until we have forgotten them.",
              "The bitterest tears shed over graves are for words left unsaid and deeds left undone.",
              "It is the unknown we fear when we look upon death and darkness, nothing more.",
              "It's sad when someone you know becomes someone you knew.",
               "There is a time for departure, even when there's no certain place to go."};
    String[] Angry={
            "Angry people are not always wise.",
            "The best fighter is never angry.",
            "Bitterness is like cancer. It eats upon the host. But anger is like fire. It burns it all clean.",
            "When angry, count four. When very angry, swear.",
            "Anger, resentment and jealousy doesn't change the heart of others-- it only changes yours.",
            "Don't get angry quickly - be kind, be forgiving, be patient.",
            "answer a letter while you are angry.",
            "Never let an angry sister comb your hair.",
            "You are not angry with people when you laugh at them. Humor teaches tolerance.",
            "Grow angry slowly - there's plenty of time.",
            "You either give up and quit, or you get angry and fight. Willow Cross, Getting Over It",
            "Anger and laughter are mutually exclusive and you have the power to choose either.",
            "When angry count to ten before you speak. If very angry, count to one hundred.",
            "Do not teach your children never to be angry; teach them how to be angry.",
            " There are two things a person should never be angry at, what they can help, and what they cannot."};
    String[] Anniversary={
           "Wishing a perfect pair a perfectly happy day.",
           "Here's to another year of being great together!",
           "Anniversary cheers!",
           "Happy anniversary, you old lovebirds!",
           "Hope you find time to look back on all your sweet memories together.",
           "Always knew you two had something special.",
           "Still vibin’ and still thrivin’ right on up to your forever. Happy Anniversary, you two!",
           "Hope the next 10 years are even happier than your [first decade] together!",
           "Can’t believe it’s been [three] years already. Here’s to many more!",
           "Love and much happiness to one of our all-time favorite couples!",
           "Warmest wishes to the wonderful two of you on your [sixth] anniversary.",
           "Wishing you a happy ‘you two’ day!",
           "Another year, another great reason to celebrate!",
           "Congratulations all over again!",
           "Siempre supe que ustedes dos tenían algo especial. ¡Feliz Aniversario!"};
    String[] Attitude={
           "Attitudes are nothing more than habits of thought.",
           "Attitude is everything, so pick a good one.",
           "ttitude is a little thing that makes a big difference.",
           "Your attitude, not your aptitude, determines your altitude.",
           "Our attitude towards others determines their attitude towards us.",
           "Our attitude towards life determines life’s attitude towards us.",
           "Excellence is not a skill. It is an attitude.",
           "Weakness of attitude becomes weakness of character.",
           "Attitude is your acceptance of the natural laws, or your rejection of the natural laws.",
           "Whether you think you can or you think you can’t – you’re right.",
           "Men do not attract that which they want, but that which they are.",
           "I believe the single most significant decision I can make on a day-to-day basis is my choice of attitude.",
           "Your attitude is more important than your capabilities. Similarly, your decision is more important than your capabilities.",
           "The attitude is very important. Because your behavior radiates how you feel.",
           "If you don’t like something, change it. If you can’t change it, change your attitude."};
    String[] Awesome={
            "You are amazing, you are important, you are special, you are unique, you are precious, you are loved.",
            "In case no one has told you lately, you are amazing, strong, brave, wonderful, kind, loved, worthy, and there is no one like you. The world needs you.",
            "You don't have to be perfect to be amazing",
            "In case you have not been adequately informed, please consider this official notification that you are awesome.",
            "If someone asked me to describe you in just 2 words, I'd say... simply amazing",
            "Never ever forget, even for one moment, how truly amazing you are.",
            "Your value doesn't decrease based on someone's inability to see your worth.",
            "Remember you are enough",
            "This is your morning reminder that you are amazing and you can handle anything.",
            "You are amazing today just as you are.",
            "You're amazing just the way you are.",
            "No words can describe how amazing you make me feel.",
            "And, baby, you know this one fits you to a tee. One word. All I can say is amazing.",
            "You really are good enough, pretty enough, and strong enough.",
            "Just so you know, you're pretty much the most amazing person I've ever met."};
    String[] Beard={
            "Get Your Face a Gift, GROW A BEARD.",
            "My beard is to me what a Mane is to a lion .",
            "I Got 99 Problems, But my Beard Ain't One!",
            "Beard & Success both Grow with Patience.",
            "Did you say something? Sorry I Can't Hear you. ...",
            "Smart Men Grow Beards.",
            "Go ahead and stare at your beard in the mirror. ...",
            "I am sexy & I grow it!",
            "A BEARD IS NATURAL. SHAVING OFF IS QUITE UNNATURAL.",
            "I HAVE A MOUSTACHE, THEREFORE I AM.",
            "ALWAYS HAVE SOME BEARD-LESS FRIENDS SO THAT PEOPLE CAN TELL YOU ARE THEIR LEADER.",
            "TRUST A MAN WITH BEARD & GLASSES.",
            "BEARDS ARE ACQUIRED. DON’T LIKE BEARDS? ACQUIRE A TASTE!",
            "MY BEARD? NATURAL. SCRIPTUAL.",
            "HOW TO SPOT A CLASSY MAN: LOOK FOR A BEARD.",};
    String[] Beautiful={
          "Everything has beauty, but not everyone sees it.",
          "The beauty of a woman is not in a facial mode but the true beauty in a woman is reflected in her soul.",
          "Beauty is power; a smile is its sword.",
          "Let us live for the beauty of our own reality.",
          "Life is full of beauty.",
          "Beauty is the promise of happiness.",
          "Think of all the beauty still left around you and be happy.",
          "Beauty is a short-lived tyranny.",
          "Gorgeous hair is the best revenge.",
          "Beauty is whatever gives joy.",
          "She got her looks from her father. He's a plastic surgeon.",
          "Rare is the union of beauty and purity.",
          "Beauty is a fragile gift.",
          "Integrity reveals beauty.",
          "Beauty has a lot to do with character."};
    String[] Best={
            "You will face many defeats in life, but never let yourself be defeated.",
            "The way to get started is to quit talking and begin doing.",
            "The greatest glory in living lies not in never falling, but in rising every time we fall.",
            "If life were predictable it would cease to be life, and be without flavor.",
            "Life is what happens when you're busy making other plans.",
            "Always remember that you are absolutely unique. Just like everyone else.",
            "Don't judge each day by the harvest you reap but by the seeds that you plant.",
            "The future belongs to those who believe in the beauty of their dreams.",
            "Tell me and I forget. Teach me and I remember. Involve me and I learn.",
            "It is during our darkest moments that we must focus to see the light.",
            "Whoever is happy will make others happy too.",
            "Spread love everywhere you go. Let no one ever come to you without leaving happier.",
            "When you reach the end of your rope, tie a knot in it and hang on.",
            "Always remember that you are absolutely unique. Just like everyone else.",
            "The future belongs to those who believe in the beauty of their dreams."};
    String[] Bike={
            "My prince charming doesn’t ride a horse…he rides wheelies.",
            "You don’t stop riding when you get old, you get old when you stop riding.",
            "The only thing better than a street bike.. is a woman riding one.",
            "Life is not about waiting for the storms to pass: it’s about learning how to ride in the rain!",
            "Bikes don’t leak oil, they mark their territory.",
            "Note to self: Never ride a motorcycle in stilettos and a miniskirt.",
            "I don’t really feel like going for a ride today. Said no motorcycle rider ever.",
            "We need to go for an adventure road trip.",
            "I believe there are two periods in life, one for the bike, the other for becoming active on one’s work.",
            "A bike on the road is worth two in the shed.",
            "I love taking my bike for a spin during my free time.",
            "Four wheels move the body, Two wheels move the soul.",
            "Faster, faster, faster, until the thrill of speed overcomes the fear of death4",
            "The perfect man? A poet on a motorcycle.",
            "Never ride faster than your guardian angel can fly.",};
    String[] Birthday={
            "Count your life by smiles, not tears. Count your age by friends, not years. Happy birthday!",
            "Happy birthday! I hope all your birthday wishes and dreams come true.",
            "May the joy that you have spread in the past come back to you on this day. Wishing you a very happy birthday!",
            "Happy birthday! May your Facebook wall be filled with messages from people you never talk to.",
            "You’re older today than yesterday but younger than tomorrow, happy birthday!",
            "Cheers on your birthday. One step closer to adult underpants.",
            "Happy birthday to one of the few people whose birthday I can remember without a Facebook reminder.",
            "Happy Birthday! You know, you don’t look that old. But then, you don’t look that young, either.",
            "Happy birthday to someone who is smart, gorgeous, funny and reminds me a lot of myself… from one fabulous chick to another!",
            "Don’t get all weird about getting older! Our age is merely the number of years the world has been enjoying us!",
            "To quote Shakespeare: ‘Party thine ass off!’",
            "You are only young once, but you can be immature for a lifetime. Happy birthday!",
            "Happy birthday to someone who is forever young!",
            "Just wanted to be the first one to wish you happy birthday so I can feel superior to your other well-wishers. So, happy birthday!",
            "Wishing you a beautiful day with good health and happiness forever. Happy birthday!"};
    String[] Break_up={
            "Some things break your heart but fix your vision.",
            "Nothing hurts more than being disappointed by the one person who you thought would never hurt you.",
            "You don’t walk out of a breakup empty-handed. Every breakup teaches a lesson. Find yours.",
            "Don’t cling to a mistake just because you spent a long time making it.",
            "I never get jealous when I see my ex with someone else, because my parents always taught me to give my used toys to the less fortunate.",
            "Don’t let someone who isn’t worth your love make you forget how much you are worth.",
            "You fell in love with a storm. Did you really think you would get out unscathed?",
            "Don’t cry because it’s over. Smile because he is finally someone else’s problem.",
            "The people that are quick to walk away are the ones that never intended to stay.",
            "We need to take our relationship to the previous level.",
            "It’s better to be single with a standard than losing yourself for approval.",
            "The best way to mend a broken heart is time and girlfriends.",
            "Definition of Ex: Thanks for the Ex-perience. Our time has Ex-pired. Now, Ex-it my life.",
            "If someone can walk away from you, let them walk.",
            "Not all storms come to disrupt your life. Some come to clear your path."};
    String[] Brother={
            "Brother, you are one-of-a-kind and I'm lucky to be your sibling.",
            "It is an honor to call you, brother.",
            "You are a brother like no other.",
            "A brother will always stand by you.",
            "You are a rare species - a brother who never judges me.",
            "A brother's unconditional love is priceless.",
            "Regardless what I've asked of him, my brother has never refused me.",
            "I love my brother's compassion; he's even kind to insects.",
            "Growing up, I revered my brother and still do.",
            "Brother, you got the best of genes of our parents.",
            "An older brother is a godsend for his sister.",
            "My friend is my brother, just born to a different family.",
            "Some friends are brothers who find each other.",
            "I know my friend will always be there like a true brother.",
            "True brothers in spirit."};
    String[] Busy={
            "Being busy is one thing however productivity is the real gem.",
            "You will become impressive the day you stop trying. You will become successful the day you stop being busy.",
            "Success usually comes to those who are too busy to be looking for it.",
            "I don’t like looking back. I’m always constantly looking forward. I’m not the one to sort of sit and cry over spilt milk. I’m too busy looking for the next cow.",
            "Be a busy person. People who are active are often much more at peace with themselves than those who are inactive and inert.",
            "A bee is never as busy as it seems; it’s just that it can’t buzz any slower.",
            "I don’t think I am a workaholic. I prefer to keep busy. It is better than the alternative.",
            "The majority prove their worth by keeping busy. A busy life is the nearest thing to a purposeful life.",
            "A man has always to be busy with his thoughts if anything is to be accomplished.",
            "Keep yourself busy if you want to avoid depression. For me, inactivity is the enemy.",
            "I love to keep busy. The challenge of fitting all of my activities into each day is my motivation.",
            "Busy is a choice. Stress is a choice. Joy is a choice. Choose well.",
            "It is possible to be busy-very busy-without being very effective.",
            "Some people are so busy learning the tricks of the trade that they never learn the trade.",
            "To me, 'busy' implies that the person is out of control of their life."};
    String[] Cheat={
           "Next to hurting my family, cheating on me is the worst thing someone could do.",
           "You didn’t just cheat on me; you cheated on us. You didn’t just break my heart; you broke our future.",
           "No woman could love a cheater and not pay the price for it.",
           "Cheating and lying aren’t struggles, they’re reasons to break up.",
           "etrayal was what I felt, my heart broken not just by a guy I was in love with, but also by, as I once believed, a true friend",
           "Earthquakes just happen. Tornadoes just happen. Your tongue does not just happen to fall into some other girl’s mouth!",
           "Cheats prosper until there are enough who bear grudges against them to make sure they do not prosper.",
           "No relationship is ever a waste of time. If it didn't bring you what you want, it taught you what you don't want.",
           "How can he love you when he treats you as if he doesn't even like you.",
           "You don't deserve someone who comes back, you deserve someone who never leaves.",
           "The more you defend a lie, the angrier you become.",
           "“Not that you lied to me but that I no longer believe you has shaken me.",
           "Once a cheater, always a repeater.",
           "When a man steals your wife, there is no better revenge than to let him keep her.",
           "Don’t cheat if you don’t want to be cheated. A relationship is mutual. This is the golden rule for all great connections."};
    String[] Childhood={
            "Memories of childhood were the dreams that stayed with you after you woke.",
            "Childhood is the best of all the seasons of life, and the longer it lasts with happy memories, the stronger the emotional stability in adulthood.",
            "Don't you wish you could take a single childhood memory and blow it up into a bubble and live inside it forever?",
            "Praise the innocence of childhood soon forgotten.",
            "When you finally go back to your old hometown, you find it wasn't the old home you missed but your childhood.",
            "If you carry your childhood with you, you never become older.",
            "When I was ten, I read fairy tales in secret and would have been ashamed if I had been found doing so.",
            "We could never have loved the earth so well if we had had no childhood in it.",
            "Every time you miss your childhood, ride on a bicycle! ",
            "Growing old is mandatory, growing up is optional.",
            "Old age lives minutes slowly, hours quickly; childhood chews hours and swallows minutes.",
            "Sometimes, it’s better to bunk a class and enjoy with friends, because today, when I look back, marks never make me laugh, but memories do. ",
            "Growing apart doesn't change the fact that for a long time we grew side by side, our roots will always be tangled.",
            "It is one of the blessings of old friends that you can afford to be stupid with them.",
            "Remember that the most valuable antiques are dear old friends."};
    String[] Clever={
            " Anger makes dull men witty, but it keeps them poor.",
            " Don't bother about genius. Don't worry about being clever. Trust in hard work, perseverance, and determination.",
            " Being clever was when you looked at how things were and used the evidence to work out something new.",
            " A man who correctly guesses a woman's age may be smart, but he's not very bright.",
            " Nothing is particularly hard if you divide it into small jobs.",
            " Where you start is not as important as where you finish.",
            " Creativity is the catalyst for brilliant accomplishments, but it is also the greatest obstacle. Scott Belsky, Making Ideas Happen",
            " Computers and the internet have made us faster but they do not make us smarter. Steven Levi, Off The Wall Thinking",
            " Broken Irish is better than clever English.",
            " More than cleverness, we need kindness and gentleness.",
            " When you're at the end of your rope, tie a knot and hold on.",
            " clever you are, to know something of which you are ignorant.",
            " Minds like razors remain sharp and bright, only if kept in use, otherwise they rust.",
            " A clever person turns great troubles into little ones, and little ones into none at all.",
            " If put to the pinch, an ounce of loyalty is worth a pound of cleverness."};
    String[] College={
            "ollege is the reward for surviving high school.",
            "very year, many, many stupid people graduate from college. And if they can do it, so can you.",
            "triving for success without hard work is like trying to harvest when you haven't planted.",
            "here is no elevator to success. You have to take the stairs.",
            "ducation is the passport to the future, for tomorrow belongs to those who prepare for it today.",
            "ccept failure as part of the process.",
            "f you hear a voice within you say 'you cannot paint,' then by all means paint, and that voice will be silenced.",
            "very expert was once a beginner.",
            "ou can’t use up creativity. The more you use, the more you have.",
            "e so good they can't ignore you.",
            "ailure is simply the opportunity to begin again. This time more intelligently.",
            "pportunities don’t happen. You create them.",
            "ou get in life what you have the courage to ask for.",
            "umulative final exams are like fights in relationships. Why must we continue to bring up the past? What's done is done.",
            " pulled an all-dayer today. It was rough."};
    String[] Cool={
            "What's cooler than being cool?",
            "I could never dream of being cool.",
            "I don't want to be cool. I want to be fashion!",
            "I thought it would be cool to take flat-picking and put it in overdrive. I thought it would bend the ear.",
            " Cool is conservative fear dressed in black.",
            "I don't mind not being cool.",
            "Being cool is when you win, you don't get too happy; and when you lose, you don't get too mad.",
            "I'd definitely be into doing some zombie slaying music. That'd be cool.",
            "It's fun to be a part of pop history. Anytime you can be referenced in that respect it can be cool.",
            "If you've gotta think about being cool, you ain't cool.",
            "I try to be cool, but I'm not very good at it.",
            "I don't mind not being cool; I wear a cardigan.",
            "I don't hate Coldplay to be cool I genuinely hate Coldplay.",
            "The coolest thing is when you don't care about being cool.",
            "Be cool to the pizza dude."};
    String[] Creative={
            "The creative adult is the child who survived.",
            "The desire to create is one of the deepest yearnings of the human soul.",
            "Everything you can imagine is real.",
            "You can't use up creativity. The more you use the more you have.",
            "Creativity doesn't wait for that perfect moment. It fashions its own perfect moments out of ordinary ones.",
            "Creativity is intelligence having fun.",
            "To practice any art, no matter how well or badly, is a way to make your soul grow. So do it.",
            "Creativity is inventing, experimenting, growing, taking risks, breaking rules, making mistakes, and having fun.",
            "The chief enemy of creativity is good sense.",
            "Creativity involves breaking out of expected patterns in order to look at things in a different way.",
            "The true sign of intelligence is not knowledge, but imagination.",
            "An essential aspect of creativity is not being afraid to fail.",
            "Odd how the creative power at once brings the whole universe to order.",
            "The worst enemy to creativity is self-doubt.",
            "Invention, it must be humbly admitted, does not consist in creating out of void but out of chaos."};
    String[] cute={
            "Whatever you are, be a good one.",
            "Cute is when a person’s personality shines through their looks.",
            "Man may have discovered fire, but women discovered how to play with it.",
            "Wherever you go, go with all your heart.",
            "Always wear cute pajamas to bed, you’ll never know who u will meet in your dreams.",
            "As hard as I try to sound tough and dark, I still sound cute.",
            "Life must be lived as play.",
            "I believe in a lively disrespect for most forms of authority.",
            "I’ve never been that cute kid that was forgiven for being naughty.",
            "It wasn’t love at first sight. It took a full five minutes.",
            "We were together. I forget the rest.",
            " “Love thy neighbor — and if he happens to be tall, debonair, and devastating, it will be that much easier.",
            "I have a crush on your mind. I fell for your personality. Your looks are just a bonus.",
            "Love is like Pi: natural, irrational, and very important.",
            "Love is like an hourglass, with the heart filling up as the brain empties."};
    String[] Dance={
            "I wasn't just going to walk, I was going to run. And then, once I stopped running, I was going to dance.",
            "The dance goes on forever. So shall I. So shall we.",
            "I do not try to dance better than anyone else. I only try to dance better than myself.",
            "Life isn't about waiting for the storm to pass. It's about learning to dance in the rain.",
            "And when you get the chance to sit it out or dance / I hope you dance",
            "Those who were seen dancing were thought to be insane by those who could not hear the music.",
            "Every day brings a chance for you to draw in a breath, kick off your shoes, and dance.",
            "I can do anything when I am in a tutu.",
            "I’m just an old Broadway gypsy.",
            "Almost nobody dances sober, unless they happen to be insane.",
            "If you cannot get rid of the family skeleton, you may as well make it dance.",
            "Life's a dance you learn as you go, Sometimes you lead, sometimes you follow”",
            "If people stand in a circle long enough, they'll eventually begin to dance.",
            "I'm going to tap until I can't.",
            "We're gonna boogie oogie oogie / 'Til you just can't boogie no more."};
    String[] Emotional={
            "The best and most beautiful things in the world cannot be seen or even touched. They must be felt with the heart",
            "I don't want to be at the mercy of my emotions. I want to use them, to enjoy them, and to dominate them.",
            "One thing you can't hide - is when you're crippled inside.",
            "The emotion that can break your heart is sometimes the very one that heals it...",
            "Pity those who don't feel anything at all.",
            "Your emotions are the slaves to your thoughts, and you are the slave to your emotions.",
            "The world is a tragedy to those who feel, but a comedy to those who think.",
            "I envy people that know love. That have someone who takes them as they are.",
            "Life is a comedy to those who think, a tragedy to those who feel.",
            "One ought to hold on to one's heart; for if one lets it go, one soon loses control of the head too.",
            "But feelings can't be ignored, no matter how unjust or ungrateful they seem.",
            "All the knowledge I possess everyone else can acquire, but my heart is all my own.",
            "Sex is always about emotions. Good sex is about free emotions; bad sex is about blocked emotions.",
            "Crying does not indicate that you are weak. Since birth, it has always been a sign that you are alive.",
            "The moment we cry in a film is not when things are sad but when they turn out to be more beautiful than we expected them to be."};
    String[] Exam={
            "Believe in yourself and all that you are. Know that there is something inside you that is greater than any obstacle.",
            "Self-belief and hard work will always earn you success.",
            "nother of my all-time favourite motivational exam quotes for students.",
            "f you’re totally convinced you’ll fail, you’ll struggle to succeed.",
            "ut if you believe you’ll succeed, you’ll stand a much better chance.",
            "ake it one step at a time – you can get there!",
            "Trust yourself, you know more than you think you do",
            "Don’t let what you cannot do interfere with what you can do.",
            "Everybody is a genius. But if you judge a fish by its ability to climb a tree, it will spend its whole life believing that it is stupid.",
            "Believe in yourself, take on your challenges, dig deep within yourself to conquer fears. Never let anyone bring you down. You got to keep going.",
            "Successful and unsuccessful people do not vary greatly in their abilities. They vary in their desires to reach their potential.",
            "If you don’t sacrifice for what you want, what you want becomes the sacrifice.",
            "Education’s purpose is to replace an empty mind with an open one.",
            "The whole secret of a successful life is to find out what is one’s destiny.",
            "Life is never made unbearable by circumstance, but only by lack of meaning and purpose."};
    String[] Facebook={
            "Keep your face always toward the sunshine ― and shadows will fall behind you.",
            "The best way to predict the future is to invent it.",
            "If you can’t stop thinking about someone’s update, that’s called ‘status cling.’",
            "Accept who you are. Unless you’re a serial killer.",
            "Think in the morning. Act in the noon. Eat in the evening. Sleep in the night.",
            "When life gives you lemons, squirt someone in the eye.",
            "If you want something you never had before, you have to do something you’ve never done before.",
            "Happiness can exist only in acceptance.",
            "You can’t blame gravity for falling in love.",
            "I live in my own little world. But it’s ok, they know me here.",
            "Let us always meet each other with a smile, for the smile is the beginning of love",
            "It does not matter how slowly you go as long as you do not stop.",
            "Always remember that you are absolutely unique. Just like everyone else.",
            "Not all those who wander are lost.",
            "Change your life today. Don’t gamble on the future, act now, without delay."};
    String[] family={

    };
    String[] Fathers_Day={
            "There will always be a few people who have the courage to love what is untamed inside us. One of those men is my father.",
            "There is no teacher equal to mother and there's nothing more contagious than the dignity of a father.",
            "Every father should remember one day his son will follow his example, not his advice.",
            "[My father] has always provided me a safe place to land and a hard place from which to launch.",
            "My dad's my best mate, and he always will be.",
            "And I only hope when I have my own familyThat every day I see a little more of my father in me.",
            "No music is so pleasant to my ears as that word: father.",
            "My father didn’t do anything unusual. He only did what dads are supposed to do: be there.",
            "A girl's father is the first man in her life, and probably the most influential.",
            "Sometimes the poorest man leaves his children the richest inheritance.",
            "Confident women are raised by loving dads.",
            "A father’s smile has been known to light up a child’s entire day.",
            "Dads are most ordinary men turned by love into heroes, adventurers, storytellers, and singers of song.",
            "I cannot think of any need in childhood as strong as the need for a father's protection.",
            "To be as good as our fathers we must be better; imitation is not discipleship."};
    String[] Mothes_Day={
            "A mother is your first friend, your best friend, your forever friend.",
            "When you are looking at your mother, you are looking at the purest love you will ever know.",
            "Mother is the heartbeat in the home; and without her, there seems to be no heartthrob.",
            "Mothers are like glue. Even when you can’t see them, they’re still holding the family together.",
            "Mother is the name for God in the lips and hearts of little children.",
            "The influence of a mother in the lives of her children is beyond calculation.",
            "It may be possible to gild pure gold, but who can make his mother more beautiful?",
            "There is no role in life that is more essential than that of motherhood.",
            "Youth fades; love droops; the leaves of friendship fall; A mother’s secret hope outlives them all.",
            "Motherhood is the exquisite inconvenience of being another person’s everything.",
            "Only mothers can think of the future because they give birth to it in their children.",
            "My mother was my role model before I even knew what that word was.",
            "To describe my mother would be to write about a hurricane in its perfect power.",
            "Motherhood is the biggest gamble in the world. It is the glorious life force. It’s huge and scary – it’s an act of infinite optimism.",
            "My mother is a walking miracle.",};
    String[] Flirt={
            "I think of you only twice a day. when I am alone and when I am with someone else.",
            "I want you to know that you are the hottest biscuit this side of the gravy boat.",
            "A day without sunshine is a day without you.",
            "Let's be naughty and save Santa the trip.",
            "I heard that the best way to get over someone is to get under someone else.",
            "I don't mind hot and spicy. Actually find that appealing in a girl. And chicken wings.",
            "I loved you for a thousand years and missed you in all of them.",
            "I am so in love, every time I look at you my soul gets dizzy.",
            "A girl's legs are her best friends , but even the best of friends must part.",
            "When I want to smile, I know exactly what to do. I just close my eyes and think of you.",
            "You are, and always have been, my dream.",
            "Forget everything that surrounds you. Think that there’s just you and me in this wide world.",
            "From the first time I saw you, I’ve belonged to you completely. I still do. If you want me.",
            "If I had a flower for every time I thought of you, I could walk in my garden forever.",
            "Clever as the Devil and twice as pretty."};
    String[] Food={
            "Let food be thy medicine and medicine be thy food.",
            "Food is symbolic of love when words are inadequate.",
            "If more of us valued food and cheer and song above hoarded gold, it would be a merrier world.",
            "One cannot think well, love well, sleep well, if one has not dined well.",
            "There is no love sincerer than the love of food.",
            "Food is not rational. Food is culture, habit, craving, and identity.",
            "Food is our common ground, a universal experience.",
            "Food may be essential as fuel for the body, but good food is fuel for the soul.",
            "Laughter is brightest in the place where food is.",
            "A party without cake is just a meeting.",
            "Everything you see I owe to spaghetti.",
            "Ice cream is exquisite. What a pity it isn't illegal.",
            "If you can t feed a hundred people, then just feed one.",
            "Food for the body is not enough. There must be food for the soul.",
            "Only the pure in heart can make a good soup."};
    String[] Forgiveness={
            "Never does the human soul appear so strong as when it forgoes revenge",
            "True forgiveness is when you can say,Thank you for that experience",
            "To err is human; to forgive, divine",
            "Forgiveness is healing...especially forgiving yourself.",
            "Always forgive your enemies; nothing annoys them so much",
            "The weak can never forgive. Forgiveness is the attribute of the strong",
            "I could easily forgive his pride, if he had not mortified mine",
            "One of the keys to happiness is a bad memory",
            "Last night I lost the world, and gained the universe",
            "Forgiveness is not an occasional act, it is a constant attitude",
            "Forgiveness is the fragrance that the violet sheds on the heel that has crushed it",
            "Resentment is like drinking poison and then hoping it will kill your enemies",
            "Forgive your enemies, but never forget their names",
            "To be wronged is nothing, unless you continue to remember it",
            "Sigh no more, ladies, sigh no more,Men were deceivers ever,-One foot in sea and one on shore,To one thing constant never"
    };

    String[][] l2={love,Alon,sad,Angry,Anniversary,Attitude,Awesome,Beard,Beautiful,Best,Bike,Birthday,Break_up,Brother,Busy,Cheat,Childhood,
            Clever,College,Cool,Creative,cute,Dance,Emotional,Exam,Facebook,family,Fathers_Day,Mothes_Day,Flirt,Food,Forgiveness};



    int[] loveimg={R.drawable.love,R.drawable.love1,R.drawable.love2,R.drawable.love3,R.drawable.love4,R.drawable.love,R.drawable.love1,R.drawable.love2,R.drawable.love3,R.drawable.love4,R.drawable.love,R.drawable.love1,R.drawable.love2,R.drawable.love3,R.drawable.love4};
    int[] Alonimg={R.drawable.alone,R.drawable.alone1,R.drawable.alone2,R.drawable.alone3,R.drawable.alone4,R.drawable.alone,R.drawable.alone1,R.drawable.alone2,R.drawable.alone3,R.drawable.alone4,R.drawable.alone,R.drawable.alone1,R.drawable.alone2,R.drawable.alone3,R.drawable.alone4};
    int[] sadimg={R.drawable.sad1,R.drawable.sad2,R.drawable.sad3,R.drawable.sad4,R.drawable.sad5,R.drawable.sad1,R.drawable.sad2,R.drawable.sad3,R.drawable.sad4,R.drawable.sad5,R.drawable.sad1,R.drawable.sad2,R.drawable.sad3,R.drawable.sad4,R.drawable.sad5};
    int[] Angryimg={R.drawable.angry,R.drawable.angry2,R.drawable.angry3,R.drawable.angry4,R.drawable.angry5,R.drawable.angry,R.drawable.angry2,R.drawable.angry3,R.drawable.angry4,R.drawable.angry5,R.drawable.angry,R.drawable.angry2,R.drawable.angry3,R.drawable.angry4,R.drawable.angry5};
    int[] Anniversaryimg={R.drawable.anni1,R.drawable.anni2,R.drawable.loven1,R.drawable.anniversary4,R.drawable.ln21,R.drawable.anni1,R.drawable.anni2,R.drawable.loven1,R.drawable.anniversary4,R.drawable.ln21,R.drawable.anni1,R.drawable.anni2,R.drawable.loven1,R.drawable.anniversary4,R.drawable.ln21};
    int[] Attitudeimg={R.drawable.attitude1,R.drawable.attitude2,R.drawable.attitude3,R.drawable.attitude4,R.drawable.attitude5,R.drawable.attitude6,R.drawable.attitude1,R.drawable.attitude2,R.drawable.attitude3,R.drawable.attitude4,R.drawable.attitude5,R.drawable.attitude6,R.drawable.attitude1,R.drawable.attitude2,R.drawable.attitude3,R.drawable.attitude4,R.drawable.attitude5,R.drawable.attitude6};
    int[] Awesomeimg={R.drawable.awesome1,R.drawable.awesome2,R.drawable.awesome3,R.drawable.awesome4,R.drawable.awesome5,R.drawable.awesome6,R.drawable.awesome1,R.drawable.awesome2,R.drawable.awesome3,R.drawable.awesome4,R.drawable.awesome5,R.drawable.awesome6,R.drawable.awesome1,R.drawable.awesome2,R.drawable.awesome3,R.drawable.awesome4,R.drawable.awesome5,R.drawable.awesome6};
    int[] Beardimg={R.drawable.beard1,R.drawable.beard2,R.drawable.beard3,R.drawable.beard4,R.drawable.beard5,R.drawable.beard6,R.drawable.beard1,R.drawable.beard2,R.drawable.beard3,R.drawable.beard4,R.drawable.beard5,R.drawable.beard6,R.drawable.beard1,R.drawable.beard2,R.drawable.beard3,R.drawable.beard4,R.drawable.beard5,R.drawable.beard6};
    int[] Beautifulimg={R.drawable.beautiful1,R.drawable.beautiful2,R.drawable.beautiful3,R.drawable.beautiful4,R.drawable.beautiful5,R.drawable.beautiful6,R.drawable.beautiful1,R.drawable.beautiful2,R.drawable.beautiful3,R.drawable.beautiful4,R.drawable.beautiful5,R.drawable.beautiful6,R.drawable.beautiful4,R.drawable.beautiful5,R.drawable.beautiful6};
    int[] Bestimg={R.drawable.best,R.drawable.best1,R.drawable.best2,R.drawable.best3,R.drawable.best4,R.drawable.best5,R.drawable.best,R.drawable.best1,R.drawable.best2,R.drawable.best3,R.drawable.best4,R.drawable.best5,R.drawable.best3,R.drawable.best4,R.drawable.best5};
    int[] Bikeimg={R.drawable.bike1,R.drawable.bike2,R.drawable.bike3,R.drawable.bike4,R.drawable.bike5,R.drawable.bike6,R.drawable.bike1,R.drawable.bike2,R.drawable.bike3,R.drawable.bike4,R.drawable.bike5,R.drawable.bike6,R.drawable.bike4,R.drawable.bike5,R.drawable.bike6};
    int[] Birthdayimg={R.drawable.birthday1,R.drawable.birthday2,R.drawable.birthday3,R.drawable.birthday4,R.drawable.birthday5,R.drawable.birthday6,R.drawable.birthday7,R.drawable.birthday1,R.drawable.birthday2,R.drawable.birthday3,R.drawable.birthday4,R.drawable.birthday5,R.drawable.birthday6,R.drawable.birthday7,R.drawable.birthday1};
    int[] Break_upimg={R.drawable.breakup1,R.drawable.breakup2,R.drawable.breakup3,R.drawable.breakup4,R.drawable.breakup5,R.drawable.breakup6,R.drawable.breakup1,R.drawable.breakup2,R.drawable.breakup3,R.drawable.breakup4,R.drawable.breakup5,R.drawable.breakup6,R.drawable.breakup1,R.drawable.breakup2,R.drawable.breakup3};
    int[] Brotherimg={R.drawable.brother1,R.drawable.brother2,R.drawable.brother3,R.drawable.brother4,R.drawable.brother6,R.drawable.brother1,R.drawable.brother2,R.drawable.brother3,R.drawable.brother4,R.drawable.brother6,R.drawable.brother1,R.drawable.brother2,R.drawable.brother3,R.drawable.brother4,R.drawable.brother6};
    int[] Busyimg={R.drawable.busy1,R.drawable.busy2,R.drawable.busy3,R.drawable.busy4,R.drawable.busy5,R.drawable.busy1,R.drawable.busy2,R.drawable.busy3,R.drawable.busy4,R.drawable.busy5,R.drawable.busy1,R.drawable.busy2,R.drawable.busy3,R.drawable.busy4,R.drawable.busy5};
    int[] Cheatimg={R.drawable.cheat1,R.drawable.cheat2,R.drawable.cheat3,R.drawable.cheat4,R.drawable.cheat1,R.drawable.cheat2,R.drawable.cheat3,R.drawable.cheat4,R.drawable.cheat1,R.drawable.cheat2,R.drawable.cheat3,R.drawable.cheat4,R.drawable.cheat2,R.drawable.cheat3,R.drawable.cheat4};
    int[] Childhoodimg={R.drawable.child1,R.drawable.child2,R.drawable.child3,R.drawable.child4,R.drawable.child5,R.drawable.child6,R.drawable.child1,R.drawable.child2,R.drawable.child3,R.drawable.child4,R.drawable.child5,R.drawable.child6,R.drawable.child1,R.drawable.child2,R.drawable.child3};
    int[] Cleverimg={R.drawable.best1,R.drawable.neon1,R.drawable.best3,R.drawable.best5,R.drawable.creative3,R.drawable.best1,R.drawable.neon1,R.drawable.best3,R.drawable.best5,R.drawable.creative3,R.drawable.best1,R.drawable.neon1,R.drawable.best3,R.drawable.best5,R.drawable.creative3};
    int[] Collegeimg={R.drawable.collage1,R.drawable.collage2,R.drawable.collage3,R.drawable.collage4,R.drawable.collage5,R.drawable.collage6,R.drawable.collage1,R.drawable.collage2,R.drawable.collage3,R.drawable.collage4,R.drawable.collage5,R.drawable.collage6,R.drawable.collage1,R.drawable.collage2,R.drawable.collage3};
    int[] Coolimg={R.drawable.cool1,R.drawable.cool2,R.drawable.cool3,R.drawable.cool4,R.drawable.cool5,R.drawable.cool6,R.drawable.cool1,R.drawable.cool2,R.drawable.cool3,R.drawable.cool4,R.drawable.cool5,R.drawable.cool6,R.drawable.cool1,R.drawable.cool2,R.drawable.cool3};
    int[] Creativeimg={R.drawable.creative1,R.drawable.creative2,R.drawable.creative3,R.drawable.creative4,R.drawable.creative5,R.drawable.creative6,R.drawable.creative1,R.drawable.creative2,R.drawable.creative3,R.drawable.creative4,R.drawable.creative5,R.drawable.creative6,R.drawable.creative1,R.drawable.creative2,R.drawable.creative3};
    int[] cuteimg={R.drawable.cute1,R.drawable.cute2,R.drawable.cute3,R.drawable.cute4,R.drawable.cute5,R.drawable.cute6,R.drawable.cute7,R.drawable.cute1,R.drawable.cute2,R.drawable.cute3,R.drawable.cute4,R.drawable.cute5,R.drawable.cute6,R.drawable.cute7,R.drawable.cute6};
    int[] Danceimg={R.drawable.dance1,R.drawable.dance2,R.drawable.dance3,R.drawable.dance4,R.drawable.dance5,R.drawable.dance6,R.drawable.dance1,R.drawable.dance2,R.drawable.dance3,R.drawable.dance4,R.drawable.dance5,R.drawable.dance6,R.drawable.dance1,R.drawable.dance2,R.drawable.dance3};
    int[] Emotionalimg={R.drawable.emotional1,R.drawable.emotional2,R.drawable.emotional3,R.drawable.emotional1,R.drawable.emotional2,R.drawable.emotional1,R.drawable.emotional2,R.drawable.emotional3,R.drawable.emotional1,R.drawable.emotional2,R.drawable.emotional1,R.drawable.emotional2,R.drawable.emotional3,R.drawable.emotional1,R.drawable.emotional2};
    int[] Examimg={R.drawable.exam1,R.drawable.exam2,R.drawable.exam3,R.drawable.exam4,R.drawable.exam5,R.drawable.exam1,R.drawable.exam2,R.drawable.exam3,R.drawable.exam4,R.drawable.exam5,R.drawable.exam1,R.drawable.exam2,R.drawable.exam3,R.drawable.exam4,R.drawable.exam5};
    int[] Facebookimg={R.drawable.face1,R.drawable.face3,R.drawable.face4,R.drawable.face5,R.drawable.face1,R.drawable.face3,R.drawable.face4,R.drawable.face5,R.drawable.face1,R.drawable.face3,R.drawable.face4,R.drawable.face5,R.drawable.face3,R.drawable.face4,R.drawable.face5};
    int[] familyimg={R.drawable.family1,R.drawable.family2,R.drawable.family3,R.drawable.family4,R.drawable.family5,R.drawable.family1,R.drawable.family2,R.drawable.family3,R.drawable.family4,R.drawable.family5,R.drawable.family1,R.drawable.family2,R.drawable.family3,R.drawable.family4,R.drawable.family5};
    int[] Fathers_Dayimg={R.drawable.father1,R.drawable.father2,R.drawable.father3,R.drawable.father4,R.drawable.father5,R.drawable.father1,R.drawable.father2,R.drawable.father3,R.drawable.father4,R.drawable.father5,R.drawable.father1,R.drawable.father2,R.drawable.father3,R.drawable.father4,R.drawable.father5};
    int[] Mothes_Dayimg={R.drawable.mother1,R.drawable.mother2,R.drawable.mother3,R.drawable.mother4,R.drawable.mother5,R.drawable.mother1,R.drawable.mother2,R.drawable.mother3,R.drawable.mother4,R.drawable.mother5,R.drawable.mother1,R.drawable.mother2,R.drawable.mother3,R.drawable.mother4,R.drawable.mother5};
    int[] Flirtimg={R.drawable.flirt1,R.drawable.flirt2,R.drawable.flirt3,R.drawable.flirt4,R.drawable.flirt5,R.drawable.flirt1,R.drawable.flirt2,R.drawable.flirt3,R.drawable.flirt4,R.drawable.flirt5,R.drawable.flirt1,R.drawable.flirt2,R.drawable.flirt3,R.drawable.flirt4,R.drawable.flirt5};
    int[] Foodimg={R.drawable.food1,R.drawable.food3,R.drawable.food4,R.drawable.food5,R.drawable.food6,R.drawable.food1,R.drawable.food3,R.drawable.food4,R.drawable.food5,R.drawable.food6,R.drawable.food1,R.drawable.food3,R.drawable.food4,R.drawable.food5,R.drawable.food6};
    int[] Forgivenessimg={R.drawable.forgive1,R.drawable.forgiv2,R.drawable.forgiv3,R.drawable.forgiv4,R.drawable.forgiv5,R.drawable.forgive1,R.drawable.forgiv2,R.drawable.forgiv3,R.drawable.forgiv4,R.drawable.forgiv5,R.drawable.forgive1,R.drawable.forgiv2,R.drawable.forgiv3,R.drawable.forgiv4,R.drawable.forgiv5};
    int[][] l3={loveimg,Alonimg,sadimg,Angryimg,Anniversaryimg,Attitudeimg,Awesomeimg,Beardimg,Beautifulimg,Bestimg,Bikeimg,Birthdayimg,
            Break_upimg,Brotherimg,Busyimg,Cheatimg,Childhoodimg,Cleverimg,Collegeimg,Coolimg,Creativeimg,cuteimg,Danceimg,
            Emotionalimg,Examimg,Facebookimg,familyimg,Fathers_Dayimg,Mothes_Dayimg,Flirtimg,Foodimg,Forgivenessimg};


    int[] l5={R.color.black,R.color.white};
    int p1,p2;
    int position;
    public quoteAdapter(quotes quotes, List<ModelData> l1, int p2, int p1) {


        activity =quotes;
        this.l1=l1;
        this.p1=p1;
        this.p2=p2;
    }
    @NonNull
    @Override
    public ViewData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(activity).inflate(R.layout.quotes_list,parent,false);
        return new ViewData(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewData holder, int position) {
        holder.txtquotes.setText(l2[p1][position]);
        holder.imgquotes.setImageResource(l3[p2][position]);
        holder.imgquotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(i < 5)
                {
                    holder.imgquotes.setImageResource(l3[p2][i++]);
                }
                else if(i==5)
                {
                    i=0;
                    holder.imgquotes.setImageResource(l3[p2][i++]);
                }


            }
        });
    }
    @Override
    public int getItemCount() {
        return l2[0].length;
    }

    class ViewData extends RecyclerView.ViewHolder {
        TextView txtquotes;
        ImageView imgquotes,like;


        public ViewData(@NonNull View itemView) {
            super(itemView);
            txtquotes=itemView.findViewById(R.id.txtquotes);
            imgquotes=itemView.findViewById(R.id.imgquotes);
            like=itemView.findViewById(R.id.like);
        }
    }

}
