package com.xuexiang.xui.widget.edittext;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
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
import com.xuexiang.xui.utils.AbstractC6872b;
import com.xuexiang.xui.utils.AbstractC6875e;
import com.xuexiang.xui.utils.AbstractC6877g;

/* loaded from: classes4.dex */
public class MultiLineEditText extends LinearLayout {

    /* renamed from: a */
    public EditText f7633a;

    /* renamed from: b */
    public TextView f7634b;

    /* renamed from: c */
    public int f7635c;

    /* renamed from: d */
    public String f7636d;

    /* renamed from: e */
    public int f7637e;

    /* renamed from: f */
    public boolean f7638f;

    /* renamed from: g */
    public String f7639g;

    /* renamed from: h */
    public int f7640h;

    /* renamed from: i */
    public int f7641i;

    /* renamed from: j */
    public float f7642j;

    /* renamed from: k */
    public boolean f7643k;

    /* renamed from: l */
    public int f7644l;

    /* renamed from: m */
    public Drawable f7645m;

    /* renamed from: n */
    public boolean f7646n;

    /* renamed from: o */
    public TextWatcher f7647o;

    /* renamed from: com.xuexiang.xui.widget.edittext.MultiLineEditText$a */
    public class ViewOnFocusChangeListenerC6924a implements View.OnFocusChangeListener {
        public ViewOnFocusChangeListenerC6924a() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            MultiLineEditText.this.setSelected(z10);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.edittext.MultiLineEditText$b */
    public class C6925b implements TextWatcher {
        public C6925b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int selectionStart = MultiLineEditText.this.f7633a.getSelectionStart();
            int selectionEnd = MultiLineEditText.this.f7633a.getSelectionEnd();
            MultiLineEditText.this.f7633a.removeTextChangedListener(MultiLineEditText.this.f7647o);
            if (MultiLineEditText.this.f7638f) {
                while (MultiLineEditText.this.m6818j(editable.toString()) > MultiLineEditText.this.f7635c) {
                    editable.delete(selectionStart - 1, selectionEnd);
                    selectionStart--;
                    selectionEnd--;
                }
            } else {
                while (MultiLineEditText.this.m6817i(editable.toString()) > MultiLineEditText.this.f7635c) {
                    editable.delete(selectionStart - 1, selectionEnd);
                    selectionStart--;
                    selectionEnd--;
                }
            }
            MultiLineEditText.this.f7633a.setSelection(selectionStart);
            MultiLineEditText.this.f7633a.addTextChangedListener(MultiLineEditText.this.f7647o);
            MultiLineEditText.this.m6819k();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public MultiLineEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.MultiLineEditTextStyle);
    }

    public String getContentText() {
        EditText editText = this.f7633a;
        if (editText != null) {
            this.f7639g = editText.getText() == null ? "" : this.f7633a.getText().toString();
        }
        return this.f7639g;
    }

    public TextView getCountTextView() {
        return this.f7634b;
    }

    public EditText getEditText() {
        return this.f7633a;
    }

    public String getHintText() {
        EditText editText = this.f7633a;
        if (editText != null) {
            this.f7636d = editText.getHint() == null ? "" : this.f7633a.getHint().toString();
        }
        return this.f7636d;
    }

    /* renamed from: h */
    public final long m6816h(String str) {
        return this.f7638f ? m6818j(str) : m6817i(str);
    }

    /* renamed from: i */
    public final long m6817i(CharSequence charSequence) {
        double d10 = AudioStats.AUDIO_AMPLITUDE_NONE;
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            d10 += (cCharAt <= 0 || cCharAt >= 127) ? 1.0d : 0.5d;
        }
        return Math.round(d10);
    }

    /* renamed from: j */
    public final int m6818j(CharSequence charSequence) {
        if (charSequence != null) {
            return charSequence.length();
        }
        return 0;
    }

    /* renamed from: k */
    public final void m6819k() {
        if (this.f7638f) {
            m6823o(m6818j(this.f7633a.getText().toString()));
        } else {
            m6823o((int) m6817i(this.f7633a.getText().toString()));
        }
    }

    /* renamed from: l */
    public final int m6820l(String str) {
        if (!this.f7638f) {
            double d10 = AudioStats.AUDIO_AMPLITUDE_NONE;
            for (int i10 = 0; i10 < str.length(); i10++) {
                char cCharAt = str.charAt(i10);
                d10 += (cCharAt <= 0 || cCharAt >= 127) ? 1.0d : 0.5d;
                if (Math.round(d10) == this.f7635c) {
                    return i10 + 1;
                }
            }
        }
        return this.f7635c;
    }

    /* renamed from: m */
    public final void m6821m() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R$layout.xui_layout_multiline_edittext, this);
        this.f7633a = (EditText) viewInflate.findViewById(R$id.mlet_input);
        this.f7634b = (TextView) viewInflate.findViewById(R$id.mlet_number);
        if (getBackground() == null) {
            setBackgroundResource(R$drawable.mlet_selector_bg);
        }
        this.f7633a.addTextChangedListener(this.f7647o);
        this.f7633a.setHint(this.f7636d);
        this.f7633a.setHintTextColor(this.f7637e);
        this.f7633a.setText(this.f7639g);
        EditText editText = this.f7633a;
        int i10 = this.f7644l;
        editText.setPadding(i10, i10, i10, 0);
        Drawable drawable = this.f7645m;
        if (drawable != null) {
            this.f7633a.setBackground(drawable);
        }
        this.f7633a.setTextColor(this.f7641i);
        this.f7633a.setTextSize(0, this.f7640h);
        if (this.f7643k) {
            this.f7633a.setHeight((int) this.f7642j);
        } else {
            this.f7633a.setMinHeight((int) this.f7642j);
        }
        this.f7634b.requestFocus();
        m6819k();
        EditText editText2 = this.f7633a;
        editText2.setSelection(editText2.length());
        this.f7633a.setOnFocusChangeListener(new ViewOnFocusChangeListenerC6924a());
    }

    /* renamed from: n */
    public final void m6822n(Context context, AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MultiLineEditText, i10, 0);
        this.f7635c = typedArrayObtainStyledAttributes.getInteger(R$styleable.MultiLineEditText_mlet_maxCount, 240);
        this.f7638f = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MultiLineEditText_mlet_ignoreCnOrEn, true);
        this.f7636d = typedArrayObtainStyledAttributes.getString(R$styleable.MultiLineEditText_mlet_hintText);
        this.f7637e = typedArrayObtainStyledAttributes.getColor(R$styleable.MultiLineEditText_mlet_hintTextColor, AbstractC6877g.m6479m(getContext(), R$attr.xui_config_color_hint_text));
        this.f7644l = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MultiLineEditText_mlet_contentPadding, AbstractC6872b.m6425a(context, 10.0f));
        this.f7645m = AbstractC6875e.m6453i(getContext(), typedArrayObtainStyledAttributes, R$styleable.MultiLineEditText_mlet_contentBackground);
        this.f7639g = typedArrayObtainStyledAttributes.getString(R$styleable.MultiLineEditText_mlet_contentText);
        this.f7641i = typedArrayObtainStyledAttributes.getColor(R$styleable.MultiLineEditText_mlet_contentTextColor, AbstractC6877g.m6479m(getContext(), R$attr.xui_config_color_input_text));
        this.f7640h = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MultiLineEditText_mlet_contentTextSize, AbstractC6872b.m6428d(context, 14.0f));
        this.f7642j = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MultiLineEditText_mlet_contentViewHeight, AbstractC6872b.m6425a(context, 140.0f));
        this.f7643k = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MultiLineEditText_mlet_isFixHeight, true);
        this.f7646n = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MultiLineEditText_mlet_showSurplusNumber, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: o */
    public final void m6823o(int i10) {
        if (this.f7646n) {
            this.f7634b.setText((this.f7635c - i10) + "/" + this.f7635c);
            return;
        }
        this.f7634b.setText(i10 + "/" + this.f7635c);
    }

    public void setContentText(String str) {
        if (str != null && m6816h(str) > this.f7635c) {
            str = str.substring(0, m6820l(str));
        }
        this.f7639g = str;
        EditText editText = this.f7633a;
        if (editText == null) {
            return;
        }
        editText.setText(str);
    }

    public void setContentTextColor(int i10) {
        EditText editText = this.f7633a;
        if (editText == null) {
            return;
        }
        editText.setTextColor(i10);
    }

    public void setContentTextSize(int i10) {
        EditText editText = this.f7633a;
        if (editText == null) {
            return;
        }
        editText.setTextSize(0, i10);
    }

    public void setHintColor(int i10) {
        EditText editText = this.f7633a;
        if (editText == null) {
            return;
        }
        editText.setHintTextColor(i10);
    }

    public void setHintText(String str) {
        this.f7636d = str;
        EditText editText = this.f7633a;
        if (editText == null) {
            return;
        }
        editText.setHint(str);
    }

    public MultiLineEditText(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f7647o = new C6925b();
        m6822n(context, attributeSet, i10);
        m6821m();
    }
}
