package za.co.riggaroo.gus.presentation.search;

import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.view.KeyEvent;

import org.junit.Rule;
import org.junit.Test;

import rx.Observable;
import za.co.riggaroo.gus.R;
import za.co.riggaroo.gus.data.remote.MockGithubUserRestServiceImpl;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.pressKey;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withEffectiveVisibility;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.not;

/**
 * Created by JayChen on 2016/12/14.
 */

public class UserSearchActivityTest {

    @Rule
    public ActivityTestRule<UserSearchActivity> testRule = new ActivityTestRule<>(UserSearchActivity.class);

    @Test
    public void searchActivity_onLaunch_HintTextDisplayed() {
        //让Activity自启动
        //用户没有进行操作
        //然后
        onView(withText("Start typing to search"))
                .check(matches(isDisplayed()));
    }

    @Test
    public void searchText_ReturnsCorrectlyFromWebService_DisplaysResult() {
        //让Activity自启动

        //When
        onView(allOf(withId(R.id.menu_search), withEffectiveVisibility(ViewMatchers.Visibility.VISIBLE))).perform(
                click());  // 当使用SearchView时，会有两个View匹配menu_search id - 一个是图标，另一个是文本框。我们想要点击那个可见的。
        onView(withId(R.id.search_src_text)).perform(typeText("riggaroo"), pressKey(KeyEvent.KEYCODE_ENTER));

        //Then
        onView(withText("Start typing to search")).check(matches(not(isDisplayed())));
        onView(withText("riggaroo - Rebecca Franks")).check(matches(isDisplayed()));
        onView(withText("Android Dev")).check(matches(isDisplayed()));
        onView(withText("A unicorn")).check(matches(isDisplayed()));
        onView(withText("riggaroo2 - Rebecca's Alter Ego")).check(matches(isDisplayed()));
    }

    @Test
    public void searchText_ServiceCallFails_DisplayError() {
        String errorMsg = "Server Error";
        MockGithubUserRestServiceImpl.setDummySearchGithubCallResult(Observable.error(new Exception(errorMsg)));

        onView(allOf(withId(R.id.menu_search), withEffectiveVisibility(ViewMatchers.Visibility.VISIBLE))).perform(
                click());  // 当使用SearchView时，会有两个View匹配menu_search id - 一个是图标，另一个是文本框。我们想要点击那个可见的。
        onView(withId(R.id.search_src_text)).perform(typeText("riggaroo"), pressKey(KeyEvent.KEYCODE_ENTER));

        onView(withText(errorMsg)).check(matches(isDisplayed()));
    }
}
