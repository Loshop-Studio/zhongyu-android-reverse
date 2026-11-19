package com.xuexiang.xui.widget.edittext.verify;

import android.content.Context;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$layout;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.widget.searchview.C4214e;
import p113m2.InterfaceC6101d;
import p113m2.ViewOnKeyListenerC6100c;
import p129o2.C6268a;
import p164t1.AbstractC6582a;

/* loaded from: classes3.dex */
public class VerifyCodeEditText extends RelativeLayout {

    /* renamed from: a */
    public final LinearLayout f4306a;

    /* renamed from: b */
    public final PwdEditText f4307b;

    /* renamed from: c */
    public int f4308c;

    /* renamed from: d */
    public boolean f4309d;

    /* renamed from: e */
    public PwdTextView[] f4310e;

    /* renamed from: f */
    public final C4214e f4311f;

    public VerifyCodeEditText(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public static void m3486a(VerifyCodeEditText verifyCodeEditText) {
        for (int length = verifyCodeEditText.f4310e.length - 1; length >= 0; length--) {
            PwdTextView pwdTextView = verifyCodeEditText.f4310e[length];
            if (!"".equals(pwdTextView.getText().toString().trim())) {
                if (verifyCodeEditText.f4309d) {
                    pwdTextView.f4304c = false;
                    pwdTextView.invalidate();
                }
                pwdTextView.setText("");
                pwdTextView.setBackgroundDrawable(null);
                if (length < verifyCodeEditText.f4308c - 1) {
                    verifyCodeEditText.f4310e[length + 1].setBackgroundDrawable(null);
                    return;
                }
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setText(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int i = 0;
        while (true) {
            PwdTextView[] pwdTextViewArr = this.f4310e;
            if (i >= pwdTextViewArr.length) {
                return;
            }
            PwdTextView pwdTextView = pwdTextViewArr[i];
            if ("".equals(pwdTextView.getText().toString().trim())) {
                if (this.f4309d) {
                    pwdTextView.f4304c = true;
                    pwdTextView.f4303b = pwdTextView.getWidth() >> 2;
                    pwdTextView.invalidate();
                }
                pwdTextView.setText(str);
                pwdTextView.setBackgroundDrawable(null);
                if (i < this.f4308c - 1) {
                    this.f4310e[i + 1].setBackgroundDrawable(null);
                    return;
                }
                return;
            }
            i++;
        }
    }

    public EditText getEditText() {
        return this.f4307b;
    }

    public int getEtNumber() {
        return this.f4308c;
    }

    public String getInputValue() {
        StringBuilder sb = new StringBuilder();
        for (PwdTextView pwdTextView : this.f4310e) {
            sb.append(pwdTextView.getText().toString().trim());
        }
        return sb.toString();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i8) {
        if (View.MeasureSpec.getMode(i8) == Integer.MIN_VALUE) {
            i8 = View.MeasureSpec.makeMeasureSpec((int) TypedValue.applyDimension(1, 50.0f, getContext().getResources().getDisplayMetrics()), BasicMeasure.EXACTLY);
        }
        super.onMeasure(i, i8);
    }

    public void setEtNumber(int i) {
        PwdTextView[] pwdTextViewArr;
        this.f4308c = i;
        PwdEditText pwdEditText = this.f4307b;
        C4214e c4214e = this.f4311f;
        pwdEditText.removeTextChangedListener(c4214e);
        LinearLayout linearLayout = this.f4306a;
        linearLayout.removeAllViews();
        Context context = getContext();
        int i8 = this.f4308c;
        pwdEditText.setCursorVisible(false);
        pwdEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i8)});
        this.f4310e = new PwdTextView[i8];
        int i9 = 0;
        while (true) {
            pwdTextViewArr = this.f4310e;
            if (i9 >= pwdTextViewArr.length) {
                break;
            }
            PwdTextView pwdTextView = new PwdTextView(context);
            pwdTextView.setTextSize(0, 0.0f);
            pwdTextView.setTextColor(0);
            pwdTextView.setWidth(0);
            pwdTextView.setHeight(0);
            if (i9 == 0) {
                pwdTextView.setBackgroundDrawable(null);
            } else {
                pwdTextView.setBackgroundDrawable(null);
            }
            pwdTextView.setGravity(17);
            pwdTextView.setFocusable(false);
            this.f4310e[i9] = pwdTextView;
            i9++;
        }
        for (PwdTextView pwdTextView2 : pwdTextViewArr) {
            linearLayout.addView(pwdTextView2);
        }
        pwdEditText.addTextChangedListener(c4214e);
        pwdEditText.setOnKeyListener(new ViewOnKeyListenerC6100c(this));
        pwdEditText.setBackSpaceListener(new C6268a(this, 22));
    }

    public void setPwdMode(boolean z8) {
        this.f4309d = z8;
    }

    public VerifyCodeEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.VerifyCodeEditTextStyle);
    }

    public VerifyCodeEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4311f = new C4214e(this, 2);
        LayoutInflater.from(context).inflate(R$layout.xui_layout_verify_code, this);
        this.f4306a = (LinearLayout) findViewById(R$id.ll_container);
        this.f4307b = (PwdEditText) findViewById(R$id.et_input);
        this.f4308c = context.obtainStyledAttributes(attributeSet, R$styleable.VerifyCodeEditText, i, 0).getInteger(R$styleable.VerifyCodeEditText_vcet_number, 4);
        AbstractC6582a.m6217a();
        throw null;
    }

    public void setOnInputListener(InterfaceC6101d interfaceC6101d) {
    }
}
