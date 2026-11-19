package com.xuexiang.xui.widget.edittext;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$drawable;
import com.xuexiang.xui.R$string;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.utils.AbstractC8037c;
import com.xuexiang.xui.utils.AbstractC8040f;
import com.xuexiang.xui.utils.AbstractC8041g;
import com.xuexiang.xui.widget.edittext.materialedittext.validation.METValidator;
import com.xuexiang.xui.widget.edittext.materialedittext.validation.RegexpValidator;
import com.xuexiang.xui.widget.popupwindow.ViewTooltip;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public class ValidatorEditText extends AppCompatEditText implements View.OnFocusChangeListener {

    /* renamed from: c */
    public List f15910c;

    /* renamed from: d */
    public boolean f15911d;

    /* renamed from: e */
    public boolean f15912e;

    /* renamed from: f */
    public Drawable f15913f;

    /* renamed from: g */
    public CharSequence f15914g;

    /* renamed from: h */
    public int f15915h;

    /* renamed from: i */
    public boolean f15916i;

    /* renamed from: j */
    public int f15917j;

    /* renamed from: com.xuexiang.xui.widget.edittext.ValidatorEditText$a */
    public class C8108a implements TextWatcher {
        public C8108a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (ValidatorEditText.this.f15911d) {
                ValidatorEditText.this.m12605i();
            } else {
                ValidatorEditText.this.setError(null);
            }
            ValidatorEditText.this.postInvalidate();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public ValidatorEditText(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    private void m12598b(Context context, AttributeSet attributeSet, int i10) {
        this.f15917j = AbstractC8037c.m12187a(20.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ValidatorEditText, i10, 0);
        String string = typedArrayObtainStyledAttributes.getString(R$styleable.ValidatorEditText_vet_regexp);
        if (!TextUtils.isEmpty(string)) {
            this.f15910c = new ArrayList();
            String string2 = typedArrayObtainStyledAttributes.getString(R$styleable.ValidatorEditText_vet_errorMessage);
            if (TextUtils.isEmpty(string2)) {
                this.f15910c.add(new RegexpValidator(AbstractC8040f.m12209j(R$string.xui_met_input_error), string));
            } else {
                this.f15910c.add(new RegexpValidator(string2, string));
            }
        }
        this.f15911d = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ValidatorEditText_vet_autoValidate, true);
        this.f15916i = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ValidatorEditText_vet_showErrorIcon, true);
        Drawable drawableM12206g = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.ValidatorEditText_vet_errorIcon);
        this.f15913f = drawableM12206g;
        if (drawableM12206g == null) {
            Drawable drawable = getCompoundDrawablesRelative()[2];
            this.f15913f = drawable;
            if (drawable == null) {
                this.f15913f = AbstractC8040f.m12205f(getContext(), R$drawable.xui_ic_default_tip_btn);
            }
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ValidatorEditText_vet_errorIconSize, 0);
        if (dimensionPixelSize != 0) {
            this.f15913f.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        } else {
            Drawable drawable2 = this.f15913f;
            drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), this.f15913f.getIntrinsicHeight());
        }
        this.f15915h = typedArrayObtainStyledAttributes.getInt(R$styleable.ValidatorEditText_vet_tipPosition, 2);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: c */
    private void m12599c() {
        setErrorIconVisible(false);
        super.setOnFocusChangeListener(this);
        initTextWatcher();
        if (this.f15911d) {
            m12605i();
        }
    }

    /* renamed from: d */
    private boolean m12600d() {
        return getLayoutDirection() == 1;
    }

    /* renamed from: e */
    private boolean m12601e(MotionEvent motionEvent) {
        return m12600d() ? motionEvent.getX() > ((float) (getPaddingStart() - this.f15917j)) && motionEvent.getX() < ((float) ((getPaddingStart() + this.f15913f.getIntrinsicWidth()) + this.f15917j)) : motionEvent.getX() > ((float) (((getWidth() - getPaddingEnd()) - this.f15913f.getIntrinsicWidth()) - this.f15917j)) && motionEvent.getX() < ((float) ((getWidth() - getPaddingEnd()) + this.f15917j));
    }

    /* renamed from: g */
    public static ViewTooltip.Position m12602g(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? ViewTooltip.Position.TOP : ViewTooltip.Position.BOTTOM : ViewTooltip.Position.TOP : ViewTooltip.Position.RIGHT : ViewTooltip.Position.LEFT;
    }

    private void setErrorIconVisible(boolean z10) {
        setCompoundDrawablesRelative(getCompoundDrawablesRelative()[0], getCompoundDrawablesRelative()[1], (z10 && this.f15916i) ? this.f15913f : null, getCompoundDrawablesRelative()[3]);
    }

    /* renamed from: f */
    public final void m12603f(String str) {
        setErrorIconVisible(true);
    }

    public CharSequence getErrorMsg() {
        return this.f15914g;
    }

    public String getInputValue() {
        return getEditableText().toString().trim();
    }

    /* renamed from: h */
    public final void m12604h() {
        if (this.f15912e) {
            return;
        }
        ViewTooltip.m13027e(this).m13028c(AbstractC8041g.m12217d(getContext(), R$attr.xui_config_color_error_text)).m13030f(m12602g(this.f15915h)).m13032h(this.f15914g.toString()).m13031g();
    }

    /* renamed from: i */
    public void m12605i() {
        this.f15912e = validate();
    }

    public final void initTextWatcher() {
        addTextChangedListener(new C8108a());
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z10) {
        if (!this.f15911d || z10) {
            return;
        }
        m12605i();
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (getCompoundDrawablesRelative()[2] != null && motionEvent.getAction() == 1 && m12601e(motionEvent)) {
            m12604h();
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
        this.f15914g = charSequence;
        if (TextUtils.isEmpty(charSequence)) {
            setErrorIconVisible(false);
            setBackground(AbstractC8040f.m12205f(getContext(), R$drawable.xui_config_bg_edittext));
        } else {
            m12603f(charSequence.toString());
            setBackground(AbstractC8040f.m12205f(getContext(), R$drawable.xui_config_color_edittext_error));
        }
    }

    public boolean validate() {
        List list = this.f15910c;
        boolean z10 = true;
        if (list != null && !list.isEmpty()) {
            Editable text = getText();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            Iterator it = this.f15910c.iterator();
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

    public ValidatorEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.ValidatorEditTextStyle);
    }

    public ValidatorEditText(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f15912e = true;
        this.f15916i = true;
        m12598b(context, attributeSet, i10);
        m12599c();
    }
}
