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
import com.xuexiang.xui.utils.AbstractC8037c;
import com.xuexiang.xui.utils.AbstractC8040f;
import com.xuexiang.xui.utils.AbstractC8041g;
import org.eclipse.paho.client.mqttv3.MqttTopic;

/* loaded from: classes5.dex */
public class MultiLineEditText extends LinearLayout {

    /* renamed from: c */
    public EditText f15881c;

    /* renamed from: d */
    public TextView f15882d;

    /* renamed from: e */
    public int f15883e;

    /* renamed from: f */
    public String f15884f;

    /* renamed from: g */
    public int f15885g;

    /* renamed from: h */
    public boolean f15886h;

    /* renamed from: i */
    public String f15887i;

    /* renamed from: j */
    public int f15888j;

    /* renamed from: k */
    public int f15889k;

    /* renamed from: l */
    public float f15890l;

    /* renamed from: m */
    public boolean f15891m;

    /* renamed from: n */
    public int f15892n;

    /* renamed from: o */
    public Drawable f15893o;

    /* renamed from: p */
    public boolean f15894p;

    /* renamed from: q */
    public TextWatcher f15895q;

    /* renamed from: com.xuexiang.xui.widget.edittext.MultiLineEditText$a */
    public class ViewOnFocusChangeListenerC8104a implements View.OnFocusChangeListener {
        public ViewOnFocusChangeListenerC8104a() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            MultiLineEditText.this.setSelected(z10);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.edittext.MultiLineEditText$b */
    public class C8105b implements TextWatcher {
        public C8105b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int selectionStart = MultiLineEditText.this.f15881c.getSelectionStart();
            int selectionEnd = MultiLineEditText.this.f15881c.getSelectionEnd();
            MultiLineEditText.this.f15881c.removeTextChangedListener(MultiLineEditText.this.f15895q);
            if (MultiLineEditText.this.f15886h) {
                while (MultiLineEditText.this.m12575j(editable.toString()) > MultiLineEditText.this.f15883e) {
                    editable.delete(selectionStart - 1, selectionEnd);
                    selectionStart--;
                    selectionEnd--;
                }
            } else {
                while (MultiLineEditText.this.m12574i(editable.toString()) > MultiLineEditText.this.f15883e) {
                    editable.delete(selectionStart - 1, selectionEnd);
                    selectionStart--;
                    selectionEnd--;
                }
            }
            MultiLineEditText.this.f15881c.setSelection(selectionStart);
            MultiLineEditText.this.f15881c.addTextChangedListener(MultiLineEditText.this.f15895q);
            MultiLineEditText.this.m12576k();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public MultiLineEditText(Context context) {
        this(context, null);
    }

    public String getContentText() {
        EditText editText = this.f15881c;
        if (editText != null) {
            this.f15887i = editText.getText() == null ? "" : this.f15881c.getText().toString();
        }
        return this.f15887i;
    }

    public TextView getCountTextView() {
        return this.f15882d;
    }

    public EditText getEditText() {
        return this.f15881c;
    }

    public String getHintText() {
        EditText editText = this.f15881c;
        if (editText != null) {
            this.f15884f = editText.getHint() == null ? "" : this.f15881c.getHint().toString();
        }
        return this.f15884f;
    }

    /* renamed from: h */
    public final long m12573h(String str) {
        return this.f15886h ? m12575j(str) : m12574i(str);
    }

    /* renamed from: i */
    public final long m12574i(CharSequence charSequence) {
        double d10 = AudioStats.AUDIO_AMPLITUDE_NONE;
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            d10 += (cCharAt <= 0 || cCharAt >= 127) ? 1.0d : 0.5d;
        }
        return Math.round(d10);
    }

    /* renamed from: j */
    public final int m12575j(CharSequence charSequence) {
        if (charSequence != null) {
            return charSequence.length();
        }
        return 0;
    }

    /* renamed from: k */
    public final void m12576k() {
        if (this.f15886h) {
            m12580o(m12575j(this.f15881c.getText().toString()));
        } else {
            m12580o((int) m12574i(this.f15881c.getText().toString()));
        }
    }

    /* renamed from: l */
    public final int m12577l(String str) {
        if (!this.f15886h) {
            double d10 = AudioStats.AUDIO_AMPLITUDE_NONE;
            for (int i10 = 0; i10 < str.length(); i10++) {
                char cCharAt = str.charAt(i10);
                d10 += (cCharAt <= 0 || cCharAt >= 127) ? 1.0d : 0.5d;
                if (Math.round(d10) == this.f15883e) {
                    return i10 + 1;
                }
            }
        }
        return this.f15883e;
    }

    /* renamed from: m */
    public final void m12578m() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R$layout.xui_layout_multiline_edittext, this);
        this.f15881c = (EditText) viewInflate.findViewById(R$id.mlet_input);
        this.f15882d = (TextView) viewInflate.findViewById(R$id.mlet_number);
        if (getBackground() == null) {
            setBackgroundResource(R$drawable.mlet_selector_bg);
        }
        this.f15881c.addTextChangedListener(this.f15895q);
        this.f15881c.setHint(this.f15884f);
        this.f15881c.setHintTextColor(this.f15885g);
        this.f15881c.setText(this.f15887i);
        EditText editText = this.f15881c;
        int i10 = this.f15892n;
        editText.setPadding(i10, i10, i10, 0);
        Drawable drawable = this.f15893o;
        if (drawable != null) {
            this.f15881c.setBackground(drawable);
        }
        this.f15881c.setTextColor(this.f15889k);
        this.f15881c.setTextSize(0, this.f15888j);
        if (this.f15891m) {
            this.f15881c.setHeight((int) this.f15890l);
        } else {
            this.f15881c.setMinHeight((int) this.f15890l);
        }
        this.f15882d.requestFocus();
        m12576k();
        EditText editText2 = this.f15881c;
        editText2.setSelection(editText2.length());
        this.f15881c.setOnFocusChangeListener(new ViewOnFocusChangeListenerC8104a());
    }

    /* renamed from: n */
    public final void m12579n(Context context, AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MultiLineEditText, i10, 0);
        this.f15883e = typedArrayObtainStyledAttributes.getInteger(R$styleable.MultiLineEditText_mlet_maxCount, 240);
        this.f15886h = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MultiLineEditText_mlet_ignoreCnOrEn, true);
        this.f15884f = typedArrayObtainStyledAttributes.getString(R$styleable.MultiLineEditText_mlet_hintText);
        this.f15885g = typedArrayObtainStyledAttributes.getColor(R$styleable.MultiLineEditText_mlet_hintTextColor, AbstractC8041g.m12217d(getContext(), R$attr.xui_config_color_hint_text));
        this.f15892n = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MultiLineEditText_mlet_contentPadding, AbstractC8037c.m12188b(context, 10.0f));
        this.f15893o = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.MultiLineEditText_mlet_contentBackground);
        this.f15887i = typedArrayObtainStyledAttributes.getString(R$styleable.MultiLineEditText_mlet_contentText);
        this.f15889k = typedArrayObtainStyledAttributes.getColor(R$styleable.MultiLineEditText_mlet_contentTextColor, AbstractC8041g.m12217d(getContext(), R$attr.xui_config_color_input_text));
        this.f15888j = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MultiLineEditText_mlet_contentTextSize, AbstractC8037c.m12190d(context, 14.0f));
        this.f15890l = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MultiLineEditText_mlet_contentViewHeight, AbstractC8037c.m12188b(context, 140.0f));
        this.f15891m = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MultiLineEditText_mlet_isFixHeight, true);
        this.f15894p = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MultiLineEditText_mlet_showSurplusNumber, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: o */
    public final void m12580o(int i10) {
        if (this.f15894p) {
            this.f15882d.setText((this.f15883e - i10) + MqttTopic.TOPIC_LEVEL_SEPARATOR + this.f15883e);
            return;
        }
        this.f15882d.setText(i10 + MqttTopic.TOPIC_LEVEL_SEPARATOR + this.f15883e);
    }

    public void setContentText(String str) {
        if (str != null && m12573h(str) > this.f15883e) {
            str = str.substring(0, m12577l(str));
        }
        this.f15887i = str;
        EditText editText = this.f15881c;
        if (editText == null) {
            return;
        }
        editText.setText(str);
    }

    public void setContentTextColor(int i10) {
        EditText editText = this.f15881c;
        if (editText == null) {
            return;
        }
        editText.setTextColor(i10);
    }

    public void setContentTextSize(int i10) {
        EditText editText = this.f15881c;
        if (editText == null) {
            return;
        }
        editText.setTextSize(0, i10);
    }

    public void setHintColor(int i10) {
        EditText editText = this.f15881c;
        if (editText == null) {
            return;
        }
        editText.setHintTextColor(i10);
    }

    public void setHintText(String str) {
        this.f15884f = str;
        EditText editText = this.f15881c;
        if (editText == null) {
            return;
        }
        editText.setHint(str);
    }

    public MultiLineEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.MultiLineEditTextStyle);
    }

    public MultiLineEditText(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f15895q = new C8105b();
        m12579n(context, attributeSet, i10);
        m12578m();
    }
}
