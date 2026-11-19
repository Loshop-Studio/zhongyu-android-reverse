package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;
import io.github.inflationx.calligraphy3.BuildConfig;
import io.github.inflationx.calligraphy3.C1088R;
import java.util.Locale;
import p070b.p074b.p075a.p076a.C0564b;
import p070b.p074b.p075a.p076a.p077a0.p078a.C0563a;
import p070b.p074b.p075a.p076a.p096r.C0655j;

/* loaded from: classes.dex */
public class TextInputEditText extends AppCompatEditText {

    /* renamed from: b */
    public final Rect f4978b;

    /* renamed from: c */
    public boolean f4979c;

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        super(C0563a.m2100a(context, attributeSet, C1088R.attr.editTextStyle, 0), attributeSet, C1088R.attr.editTextStyle);
        this.f4978b = new Rect();
        int[] iArr = C0564b.f3527v;
        C0655j.m2266a(context, attributeSet, C1088R.attr.editTextStyle, C1088R.style.Widget_Design_TextInputEditText);
        C0655j.m2267b(context, attributeSet, iArr, C1088R.attr.editTextStyle, C1088R.style.Widget_Design_TextInputEditText, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, C1088R.attr.editTextStyle, C1088R.style.Widget_Design_TextInputEditText);
        setTextInputLayoutFocusedRectEnabled(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null || !this.f4979c || rect == null) {
            return;
        }
        textInputLayout.getFocusedRect(this.f4978b);
        rect.bottom = this.f4978b.bottom;
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        boolean globalVisibleRect = super.getGlobalVisibleRect(rect, point);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f4979c && rect != null) {
            textInputLayout.getGlobalVisibleRect(this.f4978b, point);
            rect.bottom = this.f4978b.bottom;
        }
        return globalVisibleRect;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        return (textInputLayout == null || !textInputLayout.f4982B) ? super.getHint() : textInputLayout.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.f4982B && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint(BuildConfig.FLAVOR);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        getTextInputLayout();
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(Rect rect) {
        boolean zRequestRectangleOnScreen = super.requestRectangleOnScreen(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f4979c) {
            this.f4978b.set(0, textInputLayout.getHeight() - getResources().getDimensionPixelOffset(C1088R.dimen.mtrl_edittext_rectangle_top_offset), textInputLayout.getWidth(), textInputLayout.getHeight());
            textInputLayout.requestRectangleOnScreen(this.f4978b, true);
        }
        return zRequestRectangleOnScreen;
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z) {
        this.f4979c = z;
    }
}
