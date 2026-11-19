package com.xuexiang.xui.widget.edittext.verify;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$dimen;
import com.xuexiang.xui.R$drawable;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$layout;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.utils.AbstractC8040f;
import com.xuexiang.xui.widget.edittext.verify.C8116a;

/* loaded from: classes5.dex */
public class VerifyCodeEditText extends RelativeLayout {

    /* renamed from: c */
    public LinearLayout f15923c;

    /* renamed from: d */
    public PwdEditText f15924d;

    /* renamed from: e */
    public int f15925e;

    /* renamed from: f */
    public int f15926f;

    /* renamed from: g */
    public Drawable f15927g;

    /* renamed from: h */
    public int f15928h;

    /* renamed from: i */
    public float f15929i;

    /* renamed from: j */
    public Drawable f15930j;

    /* renamed from: k */
    public Drawable f15931k;

    /* renamed from: l */
    public boolean f15932l;

    /* renamed from: m */
    public float f15933m;

    /* renamed from: n */
    public PwdTextView[] f15934n;

    /* renamed from: o */
    public C8114c f15935o;

    /* renamed from: com.xuexiang.xui.widget.edittext.verify.VerifyCodeEditText$a */
    public class ViewOnKeyListenerC8112a implements View.OnKeyListener {
        public ViewOnKeyListenerC8112a() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            if (i10 != 67 || keyEvent.getAction() != 0) {
                return false;
            }
            VerifyCodeEditText.this.m12619j();
            return true;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.edittext.verify.VerifyCodeEditText$b */
    public class C8113b implements C8116a.a {
        public C8113b() {
        }

        @Override // com.xuexiang.xui.widget.edittext.verify.C8116a.a
        /* renamed from: a */
        public boolean mo12621a() {
            VerifyCodeEditText.this.m12619j();
            return true;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.edittext.verify.VerifyCodeEditText$c */
    public class C8114c implements TextWatcher {
        public C8114c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String string = editable.toString();
            if (TextUtils.isEmpty(string)) {
                return;
            }
            String[] strArrSplit = string.split("");
            for (int i10 = 0; i10 < strArrSplit.length && i10 <= VerifyCodeEditText.this.f15925e; i10++) {
                VerifyCodeEditText.this.setText(strArrSplit[i10]);
                VerifyCodeEditText.this.f15924d.setText("");
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public /* synthetic */ C8114c(VerifyCodeEditText verifyCodeEditText, ViewOnKeyListenerC8112a viewOnKeyListenerC8112a) {
            this();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.edittext.verify.VerifyCodeEditText$d */
    public interface InterfaceC8115d {
    }

    public VerifyCodeEditText(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setText(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int i10 = 0;
        while (true) {
            PwdTextView[] pwdTextViewArr = this.f15934n;
            if (i10 >= pwdTextViewArr.length) {
                return;
            }
            PwdTextView pwdTextView = pwdTextViewArr[i10];
            if ("".equals(pwdTextView.getText().toString().trim())) {
                if (this.f15932l) {
                    pwdTextView.m12609d(this.f15933m);
                }
                pwdTextView.setText(str);
                pwdTextView.setBackgroundDrawable(this.f15931k);
                if (i10 < this.f15925e - 1) {
                    this.f15934n[i10 + 1].setBackgroundDrawable(this.f15930j);
                    return;
                }
                return;
            }
            i10++;
        }
    }

    /* renamed from: e */
    public float m12614e(float f10, Context context) {
        return TypedValue.applyDimension(1, f10, context.getResources().getDisplayMetrics());
    }

    /* renamed from: f */
    public final void m12615f(Context context, AttributeSet attributeSet, int i10) {
        LayoutInflater.from(context).inflate(R$layout.xui_layout_verify_code, this);
        this.f15923c = (LinearLayout) findViewById(R$id.ll_container);
        this.f15924d = (PwdEditText) findViewById(R$id.et_input);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.VerifyCodeEditText, i10, 0);
        this.f15925e = typedArrayObtainStyledAttributes.getInteger(R$styleable.VerifyCodeEditText_vcet_number, 4);
        this.f15926f = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.VerifyCodeEditText_vcet_width, AbstractC8040f.m12204e(R$dimen.default_vcet_width));
        this.f15927g = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.VerifyCodeEditText_vcet_divider);
        this.f15929i = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.VerifyCodeEditText_vcet_text_size, AbstractC8040f.m12204e(R$dimen.default_vcet_text_size));
        this.f15928h = typedArrayObtainStyledAttributes.getColor(R$styleable.VerifyCodeEditText_vcet_text_color, ViewCompat.MEASURED_STATE_MASK);
        this.f15930j = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.VerifyCodeEditText_vcet_bg_focus);
        this.f15931k = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.VerifyCodeEditText_vcet_bg_normal);
        this.f15932l = typedArrayObtainStyledAttributes.getBoolean(R$styleable.VerifyCodeEditText_vcet_is_pwd, false);
        this.f15933m = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.VerifyCodeEditText_vcet_pwd_radius, AbstractC8040f.m12204e(R$dimen.default_vcet_pwd_radius));
        typedArrayObtainStyledAttributes.recycle();
        if (this.f15927g == null) {
            this.f15927g = AbstractC8040f.m12205f(getContext(), R$drawable.vcet_shape_divider);
        }
        if (this.f15930j == null) {
            this.f15930j = AbstractC8040f.m12205f(getContext(), R$drawable.vcet_shape_bg_focus);
        }
        if (this.f15931k == null) {
            this.f15931k = AbstractC8040f.m12205f(getContext(), R$drawable.vcet_shape_bg_normal);
        }
        m12618i();
    }

    /* renamed from: g */
    public final void m12616g(TextView[] textViewArr) {
        for (TextView textView : textViewArr) {
            this.f15923c.addView(textView);
        }
    }

    public EditText getEditText() {
        return this.f15924d;
    }

    public int getEtNumber() {
        return this.f15925e;
    }

    public String getInputValue() {
        StringBuilder sb2 = new StringBuilder();
        for (PwdTextView pwdTextView : this.f15934n) {
            sb2.append(pwdTextView.getText().toString().trim());
        }
        return sb2.toString();
    }

    /* renamed from: h */
    public final void m12617h(Context context, int i10, int i11, Drawable drawable, float f10, int i12) {
        this.f15924d.setCursorVisible(false);
        this.f15924d.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i10)});
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            this.f15923c.setDividerDrawable(drawable);
        }
        this.f15934n = new PwdTextView[i10];
        for (int i13 = 0; i13 < this.f15934n.length; i13++) {
            PwdTextView pwdTextView = new PwdTextView(context);
            pwdTextView.setTextSize(0, f10);
            pwdTextView.setTextColor(i12);
            pwdTextView.setWidth(i11);
            pwdTextView.setHeight(i11);
            if (i13 == 0) {
                pwdTextView.setBackgroundDrawable(this.f15930j);
            } else {
                pwdTextView.setBackgroundDrawable(this.f15931k);
            }
            pwdTextView.setGravity(17);
            pwdTextView.setFocusable(false);
            this.f15934n[i13] = pwdTextView;
        }
    }

    /* renamed from: i */
    public final void m12618i() {
        m12617h(getContext(), this.f15925e, this.f15926f, this.f15927g, this.f15929i, this.f15928h);
        m12616g(this.f15934n);
        m12620k();
    }

    /* renamed from: j */
    public final void m12619j() {
        for (int length = this.f15934n.length - 1; length >= 0; length--) {
            PwdTextView pwdTextView = this.f15934n[length];
            if (!"".equals(pwdTextView.getText().toString().trim())) {
                if (this.f15932l) {
                    pwdTextView.m12608c();
                }
                pwdTextView.setText("");
                pwdTextView.setBackgroundDrawable(this.f15930j);
                if (length < this.f15925e - 1) {
                    this.f15934n[length + 1].setBackgroundDrawable(this.f15931k);
                    return;
                }
                return;
            }
        }
    }

    /* renamed from: k */
    public final void m12620k() {
        this.f15924d.addTextChangedListener(this.f15935o);
        this.f15924d.setOnKeyListener(new ViewOnKeyListenerC8112a());
        this.f15924d.setBackSpaceListener(new C8113b());
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE) {
            i11 = View.MeasureSpec.makeMeasureSpec((int) m12614e(50.0f, getContext()), 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    public void setEtNumber(int i10) {
        this.f15925e = i10;
        this.f15924d.removeTextChangedListener(this.f15935o);
        this.f15923c.removeAllViews();
        m12618i();
    }

    public void setOnInputListener(InterfaceC8115d interfaceC8115d) {
    }

    public void setPwdMode(boolean z10) {
        this.f15932l = z10;
    }

    public VerifyCodeEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.VerifyCodeEditTextStyle);
    }

    public VerifyCodeEditText(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f15935o = new C8114c(this, null);
        m12615f(context, attributeSet, i10);
    }
}
