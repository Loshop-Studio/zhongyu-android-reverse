package com.xuexiang.xui.widget.edittext;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$drawable;
import com.xuexiang.xui.utils.AbstractC6799e;
import com.xuexiang.xui.utils.AbstractC6801g;
import com.xuexiang.xui.widget.edittext.materialedittext.validation.METValidator;
import com.xuexiang.xui.widget.popupwindow.ViewTooltip;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class ValidatorEditText extends AppCompatEditText implements View.OnFocusChangeListener {

    /* renamed from: a */
    public List f7515a;

    /* renamed from: b */
    public boolean f7516b;

    /* renamed from: c */
    public boolean f7517c;

    /* renamed from: d */
    public Drawable f7518d;

    /* renamed from: e */
    public CharSequence f7519e;

    /* renamed from: f */
    public int f7520f;

    /* renamed from: g */
    public boolean f7521g;

    /* renamed from: h */
    public int f7522h;

    /* renamed from: a */
    private boolean m6758a() {
        return getLayoutDirection() == 1;
    }

    /* renamed from: b */
    private boolean m6759b(MotionEvent motionEvent) {
        return m6758a() ? motionEvent.getX() > ((float) (getPaddingStart() - this.f7522h)) && motionEvent.getX() < ((float) ((getPaddingStart() + this.f7518d.getIntrinsicWidth()) + this.f7522h)) : motionEvent.getX() > ((float) (((getWidth() - getPaddingEnd()) - this.f7518d.getIntrinsicWidth()) - this.f7522h)) && motionEvent.getX() < ((float) ((getWidth() - getPaddingEnd()) + this.f7522h));
    }

    /* renamed from: d */
    public static ViewTooltip.Position m6760d(int i9) {
        return i9 != 0 ? i9 != 1 ? i9 != 2 ? i9 != 3 ? ViewTooltip.Position.TOP : ViewTooltip.Position.BOTTOM : ViewTooltip.Position.TOP : ViewTooltip.Position.RIGHT : ViewTooltip.Position.LEFT;
    }

    private void setErrorIconVisible(boolean z9) {
        setCompoundDrawablesRelative(getCompoundDrawablesRelative()[0], getCompoundDrawablesRelative()[1], (z9 && this.f7521g) ? this.f7518d : null, getCompoundDrawablesRelative()[3]);
    }

    /* renamed from: c */
    public final void m6761c(String str) {
        setErrorIconVisible(true);
    }

    /* renamed from: e */
    public final void m6762e() {
        if (this.f7517c) {
            return;
        }
        ViewTooltip.m6969e(this).m6970c(AbstractC6801g.m6479l(getContext(), R$attr.xui_config_color_error_text)).m6972f(m6760d(this.f7520f)).m6974h(this.f7519e.toString()).m6973g();
    }

    /* renamed from: f */
    public void m6763f() {
        this.f7517c = validate();
    }

    public CharSequence getErrorMsg() {
        return this.f7519e;
    }

    public String getInputValue() {
        return getEditableText().toString().trim();
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z9) {
        if (!this.f7516b || z9) {
            return;
        }
        m6763f();
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (getCompoundDrawablesRelative()[2] != null && motionEvent.getAction() == 1 && m6759b(motionEvent)) {
            m6762e();
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
        this.f7519e = charSequence;
        if (TextUtils.isEmpty(charSequence)) {
            setErrorIconVisible(false);
            setBackground(AbstractC6799e.m6460e(getContext(), R$drawable.xui_config_bg_edittext));
        } else {
            m6761c(charSequence.toString());
            setBackground(AbstractC6799e.m6460e(getContext(), R$drawable.xui_config_color_edittext_error));
        }
    }

    public boolean validate() {
        List list = this.f7515a;
        boolean z9 = true;
        if (list != null && !list.isEmpty()) {
            Editable text = getText();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            Iterator it = this.f7515a.iterator();
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
