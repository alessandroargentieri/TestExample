package mawashi.alex.letstesttogeter;

/**
 * Created by alessandro.argentier on 23/09/2016.
 */
import org.hamcrest.Matcher;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import android.support.annotation.NonNull;
import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withTagKey;
import static android.support.test.espresso.matcher.ViewMatchers.withTagValue;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.RootMatchers.withDecorView;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

import static org.hamcrest.Matchers.not;


@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityUITest {

    //variabili globali al test
    private String StringToBeTyped = "";
    private String StringToBeGot = "";
    private String NumberToBeGot = "";

    @Rule
    //specifica quale sarà l'activity ad essere testata dal BOT
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);
    public ActivityTestRule<MainActivity2> mActivity2Rule = new ActivityTestRule<>(MainActivity2.class);

    @Before
    //azioni da effettuare prima del test
    public void initTest() {
        StringToBeTyped = "Espresso Test";
        StringToBeGot   = "Espresso Test";
        NumberToBeGot = "7";
    }



    @Test
    public void getNumber(){
        //il BOT preme il pulsante con la scritta "2+5 TEST"
        onView(withText("2+5 TEST")).perform(click());
        //nella TextView ci si aspetta la stringa "7"
        onView(withId(R.id.text)).check(matches(withText(NumberToBeGot)));
    }

    @Test
    public void goToSecondActivity(){
        StringToBeTyped = "Amo la natura";
        StringToBeGot = "Amo la natura";

        //il BOT scrive un valore nell'editTest
        onView(withId(R.id.edit)).perform(typeText(StringToBeTyped), closeSoftKeyboard());
        //il BOT salva il valore scritto
        onView(withText("SAVE")).perform(click());
        //il BOT recupera il valore con GET
        onView(withText("GET")).perform(click());
        //ci si aspetta la stringa salvata
        onView(withId(R.id.text)).check(matches(withText(StringToBeGot)));
        //il BOT apre una seconda activity passando il parametro
        onView(withText("PASS TO SECOND ACTIVITY")).perform(click());
        //ci si aspetta il parametro visualizzato: non dobbiamo dire ad Espresso che siamo passati ad un'altra Activity
        onView(withText(StringToBeGot)).check(matches(withText(StringToBeGot)));
        onView(withText(StringToBeGot)).inRoot(withDecorView(not(mActivityRule.getActivity().getWindow().getDecorView()))).check(matches(isDisplayed()));
    }

    @Test
    public void saveAndGetString(){
        //il BOT scrive nell'EditText e chiude la tastiera
        onView(withId(R.id.edit)).perform(typeText(StringToBeTyped), closeSoftKeyboard());
        //il BOT preme il pulsante con il testo "SAVE"
        onView(withText("SAVE")).perform(click());

        //il BOT preme il pulsante con la scritta "GET"
        onView(withText("GET")).perform(click());
        //nella TextView ci si aspetta la stringa salvata precedentemente
        onView(withId(R.id.text)).check(matches(withText(StringToBeGot)));
        /********************************************************************/
        onView(withId(R.id.edit)).perform(clearText(), closeSoftKeyboard());

        StringToBeTyped = "Prova1234";
        StringToBeGot   = "Prova1234";
        //il BOT scrive nell'EditText e chiude la tastiera
        onView(withId(R.id.edit)).perform(typeText(StringToBeTyped), closeSoftKeyboard());
        //il BOT preme il pulsante con il testo "SAVE"
        onView(withText("SAVE")).perform(click());

        //il BOT preme il pulsante con la scritta "GET"
        onView(withText("GET")).perform(click());
        //nella TextView ci si aspetta la stringa salvata precedentemente
        onView(withId(R.id.text)).check(matches(withText(StringToBeGot)));
        /********************************************************************/
        onView(withId(R.id.edit)).perform(clearText(), closeSoftKeyboard());

        StringToBeTyped = "Complex example";
        StringToBeGot   = "Complex example";
        //il BOT scrive nell'EditText e chiude la tastiera
        onView(withId(R.id.edit)).perform(typeText(StringToBeTyped), closeSoftKeyboard());
        //il BOT preme il pulsante con il testo "SAVE"
        onView(withText("SAVE")).perform(click());

        //il BOT preme il pulsante con la scritta "GET"
        onView(withText("GET")).perform(click());
        //nella TextView ci si aspetta la stringa salvata precedentemente
        onView(withId(R.id.text)).check(matches(withText(StringToBeGot)));
        /********************************************************************/
        onView(withId(R.id.edit)).perform(clearText(), closeSoftKeyboard());

        StringToBeTyped = "Pagliara GIT Exausted";
        StringToBeGot   = "Pagliara GIT Exausted";
        //il BOT scrive nell'EditText e chiude la tastiera
        onView(withId(R.id.edit)).perform(typeText(StringToBeTyped), closeSoftKeyboard());
        //il BOT preme il pulsante con il testo "SAVE"
        onView(withText("SAVE")).perform(click());

        //il BOT preme il pulsante con la scritta "GET"
        onView(withText("GET")).perform(click());
        //nella TextView ci si aspetta la stringa salvata precedentemente
        onView(withId(R.id.text)).check(matches(withText(StringToBeGot)));
        /********************************************************************/
        onView(withId(R.id.edit)).perform(clearText(), closeSoftKeyboard());

        StringToBeTyped = "Argentieri Bello e Intelligente";
        StringToBeGot   = "Argentieri Bello e Intelligente";
        //il BOT scrive nell'EditText e chiude la tastiera
        onView(withId(R.id.edit)).perform(typeText(StringToBeTyped), closeSoftKeyboard());
        //il BOT preme il pulsante con il testo "SAVE"
        onView(withText("SAVE")).perform(click());

        //il BOT preme il pulsante con la scritta "GET"
        onView(withText("GET")).perform(click());
        //nella TextView ci si aspetta la stringa salvata precedentemente
        onView(withId(R.id.text)).check(matches(withText(StringToBeGot)));
        /********************************************************************/
     /*   onView(withId(R.id.edit)).perform(clearText(), closeSoftKeyboard());

        StringToBeTyped = "èìòàùç°ùé";
        StringToBeGot   = "èìòàùç°ùé";
        //il BOT scrive nell'EditText e chiude la tastiera
        onView(withId(R.id.edit)).perform(typeText(StringToBeTyped), closeSoftKeyboard());
        //il BOT preme il pulsante con il testo "SAVE"
        onView(withText("SAVE")).perform(click());

        //il BOT preme il pulsante con la scritta "GET"
        onView(withText("GET")).perform(click());
        //nella TextView ci si aspetta la stringa salvata precedentemente
        onView(withId(R.id.text)).check(matches(withText(StringToBeGot))); */
        /********************************************************************/


    }

}
