package com.xuexiang.xui.utils;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.xuexiang.xui.XUI;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class KeyboardUtils implements ViewTreeObserver.OnGlobalLayoutListener {
    private static HashMap<SoftKeyboardToggleListener, KeyboardUtils> sListenerMap = new HashMap<>();
    private SoftKeyboardToggleListener mCallback;
    private ViewGroup mRootView;
    private Boolean prevValue = null;

    public interface SoftKeyboardToggleListener {
        void onToggleSoftKeyboard(boolean z3);
    }

    private KeyboardUtils(Activity activity, SoftKeyboardToggleListener softKeyboardToggleListener) {
        this.mCallback = softKeyboardToggleListener;
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        this.mRootView = viewGroup;
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    public static void addKeyboardToggleListener(Activity activity, SoftKeyboardToggleListener softKeyboardToggleListener) {
        removeKeyboardToggleListener(softKeyboardToggleListener);
        sListenerMap.put(softKeyboardToggleListener, new KeyboardUtils(activity, softKeyboardToggleListener));
    }

    public static void dispatchTouchEvent(MotionEvent motionEvent, Activity activity) {
        dispatchTouchEvent(motionEvent, activity.getWindow());
    }

    private static View findTouchEditText(ViewGroup viewGroup, MotionEvent motionEvent) {
        if (viewGroup == null) {
            return null;
        }
        for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
            View childAt = viewGroup.getChildAt(i4);
            if (childAt != null && childAt.isShown() && isTouchView(childAt, motionEvent)) {
                if (childAt instanceof EditText) {
                    return childAt;
                }
                if (childAt instanceof ViewGroup) {
                    return findTouchEditText((ViewGroup) childAt, motionEvent);
                }
            }
        }
        return null;
    }

    public static void fixSoftInputLeaks(Context context) {
        InputMethodManager inputMethodManager;
        if (context == null || (inputMethodManager = (InputMethodManager) context.getSystemService("input_method")) == null) {
            return;
        }
        String[] strArr = {"mCurRootView", "mServedView", "mNextServedView"};
        for (int i4 = 0; i4 < 3; i4++) {
            try {
                Field declaredField = inputMethodManager.getClass().getDeclaredField(strArr[i4]);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                Object obj = declaredField.get(inputMethodManager);
                if (obj instanceof View) {
                    if (((View) obj).getContext() != context) {
                        return;
                    } else {
                        declaredField.set(inputMethodManager, null);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void forceCloseKeyboard(View view) {
        ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static void hideSoftInput(View view) {
        InputMethodManager inputMethodManager;
        if (view == null || (inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static void hideSoftInputClearFocus(View view) {
        InputMethodManager inputMethodManager;
        if (view == null || (inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        if (view instanceof EditText) {
            view.clearFocus();
        }
    }

    public static boolean isShouldHideKeyboard(View view, MotionEvent motionEvent) {
        if (!(view instanceof EditText) || motionEvent == null) {
            return false;
        }
        return !isTouchView(view, motionEvent);
    }

    public static boolean isSoftInputShow(Activity activity) {
        return activity != null && isSoftInputShow(activity.getWindow());
    }

    private static boolean isTouchView(View view, MotionEvent motionEvent) {
        if (view == null || motionEvent == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i4 = iArr[0];
        int i5 = iArr[1];
        return motionEvent.getY() >= ((float) i5) && motionEvent.getY() <= ((float) (view.getMeasuredHeight() + i5)) && motionEvent.getX() >= ((float) i4) && motionEvent.getX() <= ((float) (view.getMeasuredWidth() + i4));
    }

    public static boolean onDisableBackKeyDown(int i4) {
        return (i4 == 3 || i4 == 4) ? false : true;
    }

    public static void removeAllKeyboardToggleListeners() {
        Iterator<SoftKeyboardToggleListener> it = sListenerMap.keySet().iterator();
        while (it.hasNext()) {
            KeyboardUtils keyboardUtils = sListenerMap.get(it.next());
            if (keyboardUtils != null) {
                keyboardUtils.removeListener();
            }
        }
        sListenerMap.clear();
    }

    public static void removeKeyboardToggleListener(SoftKeyboardToggleListener softKeyboardToggleListener) {
        if (sListenerMap.containsKey(softKeyboardToggleListener)) {
            KeyboardUtils keyboardUtils = sListenerMap.get(softKeyboardToggleListener);
            if (keyboardUtils != null) {
                keyboardUtils.removeListener();
            }
            sListenerMap.remove(softKeyboardToggleListener);
        }
    }

    private void removeListener() {
        this.mCallback = null;
        this.mRootView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    public static void setSoftInputAdjustNothing(Activity activity) {
        activity.getWindow().setSoftInputMode(50);
    }

    public static void setSoftInputAdjustPan(Activity activity) {
        activity.getWindow().setSoftInputMode(34);
    }

    public static void setSoftInputAdjustResize(Activity activity) {
        activity.getWindow().setSoftInputMode(18);
    }

    public static void showSoftInput(EditText editText) {
        InputMethodManager inputMethodManager;
        if (editText == null || (inputMethodManager = (InputMethodManager) editText.getContext().getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.showSoftInput(editText, 2);
    }

    public static void showSoftInputForce(Activity activity) {
        if (isSoftInputShow(activity)) {
            return;
        }
        toggleSoftInput();
    }

    public static void toggleKeyboardVisibility(Context context) {
        ((InputMethodManager) context.getSystemService("input_method")).toggleSoftInput(2, 0);
    }

    public static void toggleSoftInput() {
        InputMethodManager inputMethodManager = (InputMethodManager) XUI.getContext().getSystemService("input_method");
        if (inputMethodManager == null) {
            return;
        }
        inputMethodManager.toggleSoftInput(2, 0);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        boolean zIsSoftInputShow = isSoftInputShow(this.mRootView);
        if (this.mCallback != null) {
            Boolean bool = this.prevValue;
            if (bool == null || zIsSoftInputShow != bool.booleanValue()) {
                this.prevValue = Boolean.valueOf(zIsSoftInputShow);
                this.mCallback.onToggleSoftKeyboard(zIsSoftInputShow);
            }
        }
    }

    public static void dispatchTouchEvent(MotionEvent motionEvent, Dialog dialog) {
        dispatchTouchEvent(motionEvent, dialog.getWindow());
    }

    public static boolean isSoftInputShow(Window window) {
        if (window == null || !(window.getDecorView() instanceof ViewGroup)) {
            return false;
        }
        return isSoftInputShow((ViewGroup) window.getDecorView());
    }

    public static void addKeyboardToggleListener(ViewGroup viewGroup, SoftKeyboardToggleListener softKeyboardToggleListener) {
        removeKeyboardToggleListener(softKeyboardToggleListener);
        sListenerMap.put(softKeyboardToggleListener, new KeyboardUtils(viewGroup, softKeyboardToggleListener));
    }

    public static void dispatchTouchEvent(MotionEvent motionEvent, Window window) {
        if (motionEvent == null || window == null || motionEvent.getAction() != 0 || !isShouldHideKeyboard(window, motionEvent)) {
            return;
        }
        hideSoftInputClearFocus(window.getCurrentFocus());
    }

    public static void hideSoftInput(DialogInterface dialogInterface) {
        if (dialogInterface instanceof Dialog) {
            hideSoftInput((Dialog) dialogInterface);
        }
    }

    public static boolean isShouldHideKeyboard(Window window, MotionEvent motionEvent) {
        if (window == null || motionEvent == null || !isSoftInputShow(window) || !(window.getCurrentFocus() instanceof EditText)) {
            return false;
        }
        View decorView = window.getDecorView();
        return (decorView instanceof ViewGroup) && findTouchEditText((ViewGroup) decorView, motionEvent) == null;
    }

    public static boolean isSoftInputShow(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return false;
        }
        int height = viewGroup.getHeight();
        Rect rect = new Rect();
        viewGroup.getWindowVisibleDisplayFrame(rect);
        return (height - rect.bottom) - DensityUtils.getNavigationBarHeight(viewGroup.getContext()) > 0;
    }

    public static void hideSoftInput(Dialog dialog) {
        View currentFocus = dialog.getCurrentFocus();
        if (currentFocus == null && dialog.getWindow() != null) {
            currentFocus = dialog.getWindow().getDecorView();
        }
        hideSoftInput(currentFocus);
    }

    private KeyboardUtils(ViewGroup viewGroup, SoftKeyboardToggleListener softKeyboardToggleListener) {
        this.mCallback = softKeyboardToggleListener;
        this.mRootView = viewGroup;
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }
}
