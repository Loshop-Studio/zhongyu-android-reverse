package com.xuexiang.xui.widget.edittext;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$drawable;
import com.xuexiang.xui.utils.AbstractC6480e;
import com.xuexiang.xui.utils.AbstractC6482g;
import com.xuexiang.xui.widget.edittext.materialedittext.validation.METValidator;
import com.xuexiang.xui.widget.popupwindow.ViewTooltip;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class ValidatorEditText extends AppCompatEditText implements View.OnFocusChangeListener {

    /* renamed from: a */
    public List f6257a;

    /* renamed from: b */
    public boolean f6258b;

    /* renamed from: c */
    public boolean f6259c;

    /* renamed from: d */
    public Drawable f6260d;

    /* renamed from: e */
    public CharSequence f6261e;

    /* renamed from: f */
    public int f6262f;

    /* renamed from: g */
    public boolean f6263g;

    /* renamed from: h */
    public int f6264h;

    /* renamed from: a */
    private boolean m5652a() {
        return getLayoutDirection() == 1;
    }

    /* renamed from: b */
    private boolean m5653b(MotionEvent motionEvent) {
        return m5652a() ? motionEvent.getX() > ((float) (getPaddingStart() - this.f6264h)) && motionEvent.getX() < ((float) ((getPaddingStart() + this.f6260d.getIntrinsicWidth()) + this.f6264h)) : motionEvent.getX() > ((float) (((getWidth() - getPaddingEnd()) - this.f6260d.getIntrinsicWidth()) - this.f6264h)) && motionEvent.getX() < ((float) ((getWidth() - getPaddingEnd()) + this.f6264h));
    }

    /* renamed from: d */
    public static ViewTooltip.Position m5654d(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? ViewTooltip.Position.TOP : ViewTooltip.Position.BOTTOM : ViewTooltip.Position.TOP : ViewTooltip.Position.RIGHT : ViewTooltip.Position.LEFT;
    }

    private void setErrorIconVisible(boolean z9) {
        setCompoundDrawablesRelative(getCompoundDrawablesRelative()[0], getCompoundDrawablesRelative()[1], (z9 && this.f6263g) ? this.f6260d : null, getCompoundDrawablesRelative()[3]);
    }

    /* renamed from: c */
    public final void m5655c(String str) {
        setErrorIconVisible(true);
    }

    /* renamed from: e */
    public final void m5656e() {
        if (this.f6259c) {
            return;
        }
        ViewTooltip.m5871e(this).m5872c(AbstractC6482g.m5382m(getContext(), R$attr.xui_config_color_error_text)).m5874f(m5654d(this.f6262f)).m5876h(this.f6261e.toString()).m5875g();
    }

    /* renamed from: f */
    public void m5657f() {
        this.f6259c = validate();
    }

    public CharSequence getErrorMsg() {
        return this.f6261e;
    }

    public String getInputValue() {
        return getEditableText().toString().trim();
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z9) {
        if (!this.f6258b || z9) {
            return;
        }
        m5657f();
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (getCompoundDrawablesRelative()[2] != null && motionEvent.getAction() == 1 && m5653b(motionEvent)) {
            m5656e();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z9) {
        super.setFocusable(z9);
        super.setFocusableInTouchMode(z9);
        super.setEnabled(z9);
    }

    @Override // android.widget.TextView
    public void setError(CharSequence charSequence) {
        this.f6261e = charSequence;
        if (TextUtils.isEmpty(charSequence)) {
            setErrorIconVisible(false);
            setBackground(AbstractC6480e.m5360f(getContext(), R$drawable.xui_config_bg_edittext));
        } else {
            m5655c(charSequence.toString());
            setBackground(AbstractC6480e.m5360f(getContext(), R$drawable.xui_config_color_edittext_error));
        }
    }

    public boolean validate() {
        List list = this.f6257a;
        boolean z9 = true;
        if (list != null && !list.isEmpty()) {
            Editable text = getText();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            Iterator it = this.f6257a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                METValidator mETValidator = (METValidator) it.next();
                boolean zIsValid = mETValidator.isValid(text, zIsEmpty);
                if (!zIsValid) {
                    setError(mETValidator.getErrorMessage());
                    z9 = zIsValid;
                    break;
                }
                z9 = zIsValid;
            }
            if (z9) {
                setError(null);
            }
            postInvalidate();
        }
        return z9;
    }
}
