package com.xuexiang.xui.widget.edittext;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.camera.video.AudioStats;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$drawable;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$layout;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.widget.searchview.C4214e;
import com.xuexiang.xui.widget.searchview.ViewOnFocusChangeListenerC4215f;
import kotlin.collections.AbstractC5806u;
import p073h4.AbstractC5625a;

/* loaded from: classes3.dex */
public class MultiLineEditText extends LinearLayout {

    /* renamed from: a */
    public final EditText f4281a;

    /* renamed from: b */
    public final TextView f4282b;

    /* renamed from: c */
    public final int f4283c;

    /* renamed from: d */
    public String f4284d;

    /* renamed from: e */
    public final int f4285e;

    /* renamed from: f */
    public final boolean f4286f;

    /* renamed from: g */
    public String f4287g;

    /* renamed from: h */
    public final int f4288h;

    /* renamed from: i */
    public final int f4289i;

    /* renamed from: j */
    public final float f4290j;

    /* renamed from: k */
    public final boolean f4291k;

    /* renamed from: l */
    public final int f4292l;

    /* renamed from: m */
    public final Drawable f4293m;

    /* renamed from: n */
    public final boolean f4294n;

    /* renamed from: o */
    public final C4214e f4295o;

    public MultiLineEditText(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public static long m3483a(String str) {
        double d9 = AudioStats.AUDIO_AMPLITUDE_NONE;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            d9 += (cCharAt <= 0 || cCharAt >= 127) ? 1.0d : 0.5d;
        }
        return Math.round(d9);
    }

    /* renamed from: b */
    public final void m3484b() {
        if (!this.f4286f) {
            m3485c((int) m3483a(this.f4281a.getText().toString()));
        } else {
            String string = this.f4281a.getText().toString();
            m3485c(string != null ? string.length() : 0);
        }
    }

    /* renamed from: c */
    public final void m3485c(int i) {
        if (this.f4294n) {
            this.f4282b.setText((this.f4283c - i) + "/" + this.f4283c);
            return;
        }
        this.f4282b.setText(i + "/" + this.f4283c);
    }

    public String getContentText() {
        EditText editText = this.f4281a;
        if (editText != null) {
            this.f4287g = editText.getText() == null ? "" : this.f4281a.getText().toString();
        }
        return this.f4287g;
    }

    public TextView getCountTextView() {
        return this.f4282b;
    }

    public EditText getEditText() {
        return this.f4281a;
    }

    public String getHintText() {
        EditText editText = this.f4281a;
        if (editText != null) {
            this.f4284d = editText.getHint() == null ? "" : this.f4281a.getHint().toString();
        }
        return this.f4284d;
    }

    public void setContentText(String str) {
        int i;
        if (str != null) {
            if ((this.f4286f ? str.length() : m3483a(str)) > this.f4283c) {
                if (this.f4286f) {
                    i = this.f4283c;
                    str = str.substring(0, i);
                } else {
                    double d9 = AudioStats.AUDIO_AMPLITUDE_NONE;
                    for (int i8 = 0; i8 < str.length(); i8++) {
                        char cCharAt = str.charAt(i8);
                        d9 += (cCharAt <= 0 || cCharAt >= 127) ? 1.0d : 0.5d;
                        if (Math.round(d9) == this.f4283c) {
                            i = i8 + 1;
                            break;
                        }
                    }
                    i = this.f4283c;
                    str = str.substring(0, i);
                }
            }
        }
        this.f4287g = str;
        EditText editText = this.f4281a;
        if (editText == null) {
            return;
        }
        editText.setText(str);
    }

    public void setContentTextColor(int i) {
        EditText editText = this.f4281a;
        if (editText == null) {
            return;
        }
        editText.setTextColor(i);
    }

    public void setContentTextSize(int i) {
        EditText editText = this.f4281a;
        if (editText == null) {
            return;
        }
        editText.setTextSize(0, i);
    }

    public void setHintColor(int i) {
        EditText editText = this.f4281a;
        if (editText == null) {
            return;
        }
        editText.setHintTextColor(i);
    }

    public void setHintText(String str) {
        this.f4284d = str;
        EditText editText = this.f4281a;
        if (editText == null) {
            return;
        }
        editText.setHint(str);
    }

    public MultiLineEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.MultiLineEditTextStyle);
    }

    public MultiLineEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C4214e c4214e = new C4214e(this, 1);
        this.f4295o = c4214e;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MultiLineEditText, i, 0);
        this.f4283c = typedArrayObtainStyledAttributes.getInteger(R$styleable.MultiLineEditText_mlet_maxCount, 240);
        this.f4286f = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MultiLineEditText_mlet_ignoreCnOrEn, true);
        this.f4284d = typedArrayObtainStyledAttributes.getString(R$styleable.MultiLineEditText_mlet_hintText);
        this.f4285e = typedArrayObtainStyledAttributes.getColor(R$styleable.MultiLineEditText_mlet_hintTextColor, AbstractC5806u.m5252F(getContext(), R$attr.xui_config_color_hint_text, 0));
        this.f4292l = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MultiLineEditText_mlet_contentPadding, AbstractC5625a.m4948h(context, 10.0f));
        getContext();
        this.f4293m = typedArrayObtainStyledAttributes.getDrawable(R$styleable.MultiLineEditText_mlet_contentBackground);
        this.f4287g = typedArrayObtainStyledAttributes.getString(R$styleable.MultiLineEditText_mlet_contentText);
        this.f4289i = typedArrayObtainStyledAttributes.getColor(R$styleable.MultiLineEditText_mlet_contentTextColor, AbstractC5806u.m5252F(getContext(), R$attr.xui_config_color_input_text, 0));
        this.f4288h = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MultiLineEditText_mlet_contentTextSize, AbstractC5625a.m4954n(context, 14.0f));
        this.f4290j = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MultiLineEditText_mlet_contentViewHeight, AbstractC5625a.m4948h(context, 140.0f));
        this.f4291k = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MultiLineEditText_mlet_isFixHeight, true);
        this.f4294n = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MultiLineEditText_mlet_showSurplusNumber, false);
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = LayoutInflater.from(getContext()).inflate(R$layout.xui_layout_multiline_edittext, this);
        this.f4281a = (EditText) viewInflate.findViewById(R$id.mlet_input);
        this.f4282b = (TextView) viewInflate.findViewById(R$id.mlet_number);
        if (getBackground() == null) {
            setBackgroundResource(R$drawable.mlet_selector_bg);
        }
        this.f4281a.addTextChangedListener(c4214e);
        this.f4281a.setHint(this.f4284d);
        this.f4281a.setHintTextColor(this.f4285e);
        this.f4281a.setText(this.f4287g);
        EditText editText = this.f4281a;
        int i8 = this.f4292l;
        editText.setPadding(i8, i8, i8, 0);
        Drawable drawable = this.f4293m;
        if (drawable != null) {
            this.f4281a.setBackground(drawable);
        }
        this.f4281a.setTextColor(this.f4289i);
        this.f4281a.setTextSize(0, this.f4288h);
        if (this.f4291k) {
            this.f4281a.setHeight((int) this.f4290j);
        } else {
            this.f4281a.setMinHeight((int) this.f4290j);
        }
        this.f4282b.requestFocus();
        m3484b();
        EditText editText2 = this.f4281a;
        editText2.setSelection(editText2.length());
        this.f4281a.setOnFocusChangeListener(new ViewOnFocusChangeListenerC4215f(this, 1));
    }
}
