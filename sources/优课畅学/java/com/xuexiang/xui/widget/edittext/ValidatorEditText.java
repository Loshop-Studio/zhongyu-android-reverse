package com.xuexiang.xui.widget.edittext;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$drawable;
import com.xuexiang.xui.utils.AbstractC6875e;
import com.xuexiang.xui.utils.AbstractC6877g;
import com.xuexiang.xui.widget.edittext.materialedittext.validation.METValidator;
import com.xuexiang.xui.widget.popupwindow.ViewTooltip;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class ValidatorEditText extends AppCompatEditText implements View.OnFocusChangeListener {

    /* renamed from: a */
    public List f7662a;

    /* renamed from: b */
    public boolean f7663b;

    /* renamed from: c */
    public boolean f7664c;

    /* renamed from: d */
    public Drawable f7665d;

    /* renamed from: e */
    public CharSequence f7666e;

    /* renamed from: f */
    public int f7667f;

    /* renamed from: g */
    public boolean f7668g;

    /* renamed from: h */
    public int f7669h;

    /* renamed from: a */
    private boolean m6840a() {
        return getLayoutDirection() == 1;
    }

    /* renamed from: b */
    private boolean m6841b(MotionEvent motionEvent) {
        return m6840a() ? motionEvent.getX() > ((float) (getPaddingStart() - this.f7669h)) && motionEvent.getX() < ((float) ((getPaddingStart() + this.f7665d.getIntrinsicWidth()) + this.f7669h)) : motionEvent.getX() > ((float) (((getWidth() - getPaddingEnd()) - this.f7665d.getIntrinsicWidth()) - this.f7669h)) && motionEvent.getX() < ((float) ((getWidth() - getPaddingEnd()) + this.f7669h));
    }

    /* renamed from: d */
    public static ViewTooltip.Position m6842d(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? ViewTooltip.Position.TOP : ViewTooltip.Position.BOTTOM : ViewTooltip.Position.TOP : ViewTooltip.Position.RIGHT : ViewTooltip.Position.LEFT;
    }

    private void setErrorIconVisible(boolean z10) {
        setCompoundDrawablesRelative(getCompoundDrawablesRelative()[0], getCompoundDrawablesRelative()[1], (z10 && this.f7668g) ? this.f7665d : null, getCompoundDrawablesRelative()[3]);
    }

    /* renamed from: c */
    public final void m6843c(String str) {
        setErrorIconVisible(true);
    }

    /* renamed from: e */
    public final void m6844e() {
        if (this.f7664c) {
            return;
        }
        ViewTooltip.m7055e(this).m7056c(AbstractC6877g.m6479m(getContext(), R$attr.xui_config_color_error_text)).m7058f(m6842d(this.f7667f)).m7060h(this.f7666e.toString()).m7059g();
    }

    /* renamed from: f */
    public void m6845f() {
        this.f7664c = validate();
    }

    public CharSequence getErrorMsg() {
        return this.f7666e;
    }

    public String getInputValue() {
        return getEditableText().toString().trim();
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z10) {
        if (!this.f7663b || z10) {
            return;
        }
        m6845f();
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (getCompoundDrawablesRelative()[2] != null && motionEvent.getAction() == 1 && m6841b(motionEvent)) {
            m6844e();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z10) {
        super.setFocusable(z10);
        super.setFocusableInTouchMode(z10);
        super.setEnabled(z10);
    }

    @Override // android.widget.TextView
    public void setError(CharSequence charSequence) {
        this.f7666e = charSequence;
        if (TextUtils.isEmpty(charSequence)) {
            setErrorIconVisible(false);
            setBackground(AbstractC6875e.m6452h(getContext(), R$drawable.xui_config_bg_edittext));
        } else {
            m6843c(charSequence.toString());
            setBackground(AbstractC6875e.m6452h(getContext(), R$drawable.xui_config_color_edittext_error));
        }
    }

    public boolean validate() {
        List list = this.f7662a;
        boolean z10 = true;
        if (list != null && !list.isEmpty()) {
            Editable text = getText();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            Iterator it = this.f7662a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                METValidator mETValidator = (METValidator) it.next();
                boolean zIsValid = mETValidator.isValid(text, zIsEmpty);
                if (!zIsValid) {
                    setError(mETValidator.getErrorMessage());
                    z10 = zIsValid;
                    break;
                }
                z10 = zIsValid;
            }
            if (z10) {
                setError(null);
            }
            postInvalidate();
        }
        return z10;
    }
}
