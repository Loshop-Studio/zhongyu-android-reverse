package com.xuexiang.xui.widget.edittext;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$drawable;
import com.xuexiang.xui.utils.AbstractC5857e;
import com.xuexiang.xui.utils.AbstractC5859g;
import com.xuexiang.xui.widget.edittext.materialedittext.validation.METValidator;
import com.xuexiang.xui.widget.popupwindow.ViewTooltip;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class ValidatorEditText extends AppCompatEditText implements View.OnFocusChangeListener {

    /* renamed from: a */
    public List f4982a;

    /* renamed from: b */
    public boolean f4983b;

    /* renamed from: c */
    public boolean f4984c;

    /* renamed from: d */
    public Drawable f4985d;

    /* renamed from: e */
    public CharSequence f4986e;

    /* renamed from: f */
    public int f4987f;

    /* renamed from: g */
    public boolean f4988g;

    /* renamed from: h */
    public int f4989h;

    /* renamed from: a */
    private boolean m4671a() {
        return getLayoutDirection() == 1;
    }

    /* renamed from: b */
    private boolean m4672b(MotionEvent motionEvent) {
        return m4671a() ? motionEvent.getX() > ((float) (getPaddingStart() - this.f4989h)) && motionEvent.getX() < ((float) ((getPaddingStart() + this.f4985d.getIntrinsicWidth()) + this.f4989h)) : motionEvent.getX() > ((float) (((getWidth() - getPaddingEnd()) - this.f4985d.getIntrinsicWidth()) - this.f4989h)) && motionEvent.getX() < ((float) ((getWidth() - getPaddingEnd()) + this.f4989h));
    }

    /* renamed from: d */
    public static ViewTooltip.Position m4673d(int i6) {
        return i6 != 0 ? i6 != 1 ? i6 != 2 ? i6 != 3 ? ViewTooltip.Position.TOP : ViewTooltip.Position.BOTTOM : ViewTooltip.Position.TOP : ViewTooltip.Position.RIGHT : ViewTooltip.Position.LEFT;
    }

    private void setErrorIconVisible(boolean z6) {
        setCompoundDrawablesRelative(getCompoundDrawablesRelative()[0], getCompoundDrawablesRelative()[1], (z6 && this.f4988g) ? this.f4985d : null, getCompoundDrawablesRelative()[3]);
    }

    /* renamed from: c */
    public final void m4674c(String str) {
        setErrorIconVisible(true);
    }

    /* renamed from: e */
    public final void m4675e() {
        if (this.f4984c) {
            return;
        }
        ViewTooltip.m4880e(this).m4881c(AbstractC5859g.m4387m(getContext(), R$attr.xui_config_color_error_text)).m4883f(m4673d(this.f4987f)).m4885h(this.f4986e.toString()).m4884g();
    }

    /* renamed from: f */
    public void m4676f() {
        this.f4984c = validate();
    }

    public CharSequence getErrorMsg() {
        return this.f4986e;
    }

    public String getInputValue() {
        return getEditableText().toString().trim();
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z6) {
        if (!this.f4983b || z6) {
            return;
        }
        m4676f();
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (getCompoundDrawablesRelative()[2] != null && motionEvent.getAction() == 1 && m4672b(motionEvent)) {
            m4675e();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z6) {
        super.setFocusable(z6);
        super.setFocusableInTouchMode(z6);
        super.setEnabled(z6);
    }

    @Override // android.widget.TextView
    public void setError(CharSequence charSequence) {
        this.f4986e = charSequence;
        if (TextUtils.isEmpty(charSequence)) {
            setErrorIconVisible(false);
            setBackground(AbstractC5857e.m4365f(getContext(), R$drawable.xui_config_bg_edittext));
        } else {
            m4674c(charSequence.toString());
            setBackground(AbstractC5857e.m4365f(getContext(), R$drawable.xui_config_color_edittext_error));
        }
    }

    public boolean validate() {
        List list = this.f4982a;
        boolean z6 = true;
        if (list != null && !list.isEmpty()) {
            Editable text = getText();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            Iterator it = this.f4982a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                METValidator mETValidator = (METValidator) it.next();
                boolean zIsValid = mETValidator.isValid(text, zIsEmpty);
                if (!zIsValid) {
                    setError(mETValidator.getErrorMessage());
                    z6 = zIsValid;
                    break;
                }
                z6 = zIsValid;
            }
            if (z6) {
                setError(null);
            }
            postInvalidate();
        }
        return z6;
    }
}
