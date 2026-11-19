package com.xuexiang.xui.widget.edittext;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$drawable;
import com.xuexiang.xui.utils.AbstractC3530e;
import com.xuexiang.xui.utils.AbstractC3531f;
import com.xuexiang.xui.widget.edittext.materialedittext.validation.METValidator;
import com.xuexiang.xui.widget.popupwindow.ViewTooltip;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class ValidatorEditText extends AppCompatEditText implements View.OnFocusChangeListener {

    /* renamed from: a */
    public List f3461a;

    /* renamed from: b */
    public boolean f3462b;

    /* renamed from: c */
    public boolean f3463c;

    /* renamed from: d */
    public Drawable f3464d;

    /* renamed from: e */
    public CharSequence f3465e;

    /* renamed from: f */
    public int f3466f;

    /* renamed from: g */
    public boolean f3467g;

    /* renamed from: h */
    public int f3468h;

    /* renamed from: d */
    public static ViewTooltip.Position m4294d(int i4) {
        return i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? ViewTooltip.Position.TOP : ViewTooltip.Position.BOTTOM : ViewTooltip.Position.TOP : ViewTooltip.Position.RIGHT : ViewTooltip.Position.LEFT;
    }

    private void setErrorIconVisible(boolean z3) {
        setCompoundDrawablesRelative(getCompoundDrawablesRelative()[0], getCompoundDrawablesRelative()[1], (z3 && this.f3467g) ? this.f3464d : null, getCompoundDrawablesRelative()[3]);
    }

    /* renamed from: a */
    public final boolean m4295a() {
        return getLayoutDirection() == 1;
    }

    /* renamed from: b */
    public final boolean m4296b(MotionEvent motionEvent) {
        return m4295a() ? motionEvent.getX() > ((float) (getPaddingStart() - this.f3468h)) && motionEvent.getX() < ((float) ((getPaddingStart() + this.f3464d.getIntrinsicWidth()) + this.f3468h)) : motionEvent.getX() > ((float) (((getWidth() - getPaddingEnd()) - this.f3464d.getIntrinsicWidth()) - this.f3468h)) && motionEvent.getX() < ((float) ((getWidth() - getPaddingEnd()) + this.f3468h));
    }

    /* renamed from: c */
    public final void m4297c(String str) {
        setErrorIconVisible(true);
    }

    /* renamed from: e */
    public final void m4298e() {
        if (this.f3463c) {
            return;
        }
        ViewTooltip.m4502e(this).m4503c(AbstractC3531f.m4071d(getContext(), R$attr.xui_config_color_error_text)).m4505f(m4294d(this.f3466f)).m4507h(this.f3465e.toString()).m4506g();
    }

    /* renamed from: f */
    public void m4299f() {
        this.f3463c = validate();
    }

    public CharSequence getErrorMsg() {
        return this.f3465e;
    }

    public String getInputValue() {
        return getEditableText().toString().trim();
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z3) {
        if (!this.f3462b || z3) {
            return;
        }
        m4299f();
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (getCompoundDrawablesRelative()[2] != null && motionEvent.getAction() == 1 && m4296b(motionEvent)) {
            m4298e();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z3) {
        super.setFocusable(z3);
        super.setFocusableInTouchMode(z3);
        super.setEnabled(z3);
    }

    @Override // android.widget.TextView
    public void setError(CharSequence charSequence) {
        this.f3465e = charSequence;
        if (TextUtils.isEmpty(charSequence)) {
            setErrorIconVisible(false);
            setBackground(AbstractC3530e.m4063d(getContext(), R$drawable.xui_config_bg_edittext));
        } else {
            m4297c(charSequence.toString());
            setBackground(AbstractC3530e.m4063d(getContext(), R$drawable.xui_config_color_edittext_error));
        }
    }

    public boolean validate() {
        List list = this.f3461a;
        boolean z3 = true;
        if (list != null && !list.isEmpty()) {
            Editable text = getText();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            Iterator it = this.f3461a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                METValidator mETValidator = (METValidator) it.next();
                boolean zIsValid = mETValidator.isValid(text, zIsEmpty);
                if (!zIsValid) {
                    setError(mETValidator.getErrorMessage());
                    z3 = zIsValid;
                    break;
                }
                z3 = zIsValid;
            }
            if (z3) {
                setError(null);
            }
            postInvalidate();
        }
        return z3;
    }
}
