package com.xuexiang.xui.widget.tabbar;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.xuexiang.xui.R$dimen;
import com.xuexiang.xui.R$drawable;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.utils.AbstractC6875e;
import com.xuexiang.xui.utils.AbstractC6877g;
import io.github.inflationx.calligraphy3.HasTypeface;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p150k1.AbstractC9051b;

/* loaded from: classes4.dex */
public class TabControlView extends RadioGroup implements HasTypeface {

    /* renamed from: a */
    public Context f8213a;

    /* renamed from: b */
    public InterfaceC7012b f8214b;

    /* renamed from: c */
    public int f8215c;

    /* renamed from: d */
    public int f8216d;

    /* renamed from: e */
    public int f8217e;

    /* renamed from: f */
    public int f8218f;

    /* renamed from: g */
    public int f8219g;

    /* renamed from: h */
    public int f8220h;

    /* renamed from: i */
    public int f8221i;

    /* renamed from: j */
    public int f8222j;

    /* renamed from: k */
    public int f8223k;

    /* renamed from: l */
    public int f8224l;

    /* renamed from: m */
    public boolean f8225m;

    /* renamed from: n */
    public boolean f8226n;

    /* renamed from: o */
    public ColorStateList f8227o;

    /* renamed from: p */
    public LinkedHashMap f8228p;

    /* renamed from: q */
    public List f8229q;

    /* renamed from: r */
    public RadioGroup.OnCheckedChangeListener f8230r;

    /* renamed from: com.xuexiang.xui.widget.tabbar.TabControlView$a */
    public class C7011a implements RadioGroup.OnCheckedChangeListener {
        public C7011a() {
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i10) {
            if (TabControlView.this.f8214b != null) {
                String string = ((RadioButton) radioGroup.findViewById(i10)).getText().toString();
                TabControlView.this.f8214b.mo2088a(string, (String) TabControlView.this.f8228p.get(string));
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.tabbar.TabControlView$b */
    public interface InterfaceC7012b {
        /* renamed from: a */
        void mo2088a(String str, String str2);
    }

    public TabControlView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8224l = -1;
        this.f8225m = false;
        this.f8226n = false;
        this.f8228p = new LinkedHashMap();
        this.f8230r = new C7011a();
        m7176c(context);
        m7177d(context, attributeSet);
        m7179j();
    }

    /* renamed from: c */
    private void m7176c(Context context) {
        this.f8213a = context;
        setPadding(10, 10, 10, 10);
    }

    /* renamed from: d */
    private void m7177d(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.TabControlView, 0, 0);
        try {
            this.f8215c = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TabControlView_tcv_textSize, AbstractC6875e.m6450f(context, R$dimen.default_tcv_text_size));
            this.f8220h = typedArrayObtainStyledAttributes.getColor(R$styleable.TabControlView_tcv_selectedColor, AbstractC6877g.m6472f(context));
            this.f8221i = typedArrayObtainStyledAttributes.getColor(R$styleable.TabControlView_tcv_unselectedColor, 0);
            this.f8222j = typedArrayObtainStyledAttributes.getColor(R$styleable.TabControlView_tcv_selectedTextColor, -1);
            this.f8223k = typedArrayObtainStyledAttributes.getColor(R$styleable.TabControlView_tcv_unselectedTextColor, AbstractC6877g.m6472f(context));
            this.f8216d = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TabControlView_tcv_strokeWidth, AbstractC6875e.m6450f(context, R$dimen.default_tcv_stroke_width));
            this.f8217e = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TabControlView_tcv_item_padding, -1);
            this.f8218f = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TabControlView_tcv_item_padding_horizontal, -1);
            this.f8219g = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TabControlView_tcv_item_padding_vertical, -1);
            this.f8227o = new ColorStateList(new int[][]{new int[]{-16842912}, new int[]{R.attr.state_checked}}, new int[]{this.f8223k, this.f8222j});
            this.f8224l = typedArrayObtainStyledAttributes.getInt(R$styleable.TabControlView_tcv_defaultSelection, this.f8224l);
            this.f8226n = typedArrayObtainStyledAttributes.getBoolean(R$styleable.TabControlView_tcv_equalWidth, this.f8226n);
            this.f8225m = typedArrayObtainStyledAttributes.getBoolean(R$styleable.TabControlView_tcv_stretch, this.f8225m);
            m7181g(typedArrayObtainStyledAttributes.getTextArray(R$styleable.TabControlView_tcv_items), typedArrayObtainStyledAttributes.getTextArray(R$styleable.TabControlView_tcv_values));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: e */
    private boolean m7178e() {
        return getResources().getConfiguration().getLayoutDirection() == 1;
    }

    /* renamed from: j */
    private void m7179j() {
        RadioButton radioButton;
        int i10;
        removeAllViews();
        setOrientation(0);
        this.f8229q = new ArrayList();
        float fMax = 0.0f;
        int i11 = 0;
        for (Map.Entry entry : this.f8228p.entrySet()) {
            RadioButton radioButton2 = new RadioButton(this.f8213a);
            radioButton2.setTextColor(this.f8227o);
            RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-2, -1);
            if (this.f8225m) {
                layoutParams.weight = 1.0f;
            }
            if (i11 > 0) {
                layoutParams.setMarginStart(-this.f8216d);
            }
            radioButton2.setLayoutParams(layoutParams);
            radioButton2.setButtonDrawable(new StateListDrawable());
            if (i11 == 0) {
                if (m7178e()) {
                    m7184k(radioButton2, R$drawable.tcv_right_option, R$drawable.tcv_right_option_selected);
                } else {
                    m7184k(radioButton2, R$drawable.tcv_left_option, R$drawable.tcv_left_option_selected);
                }
            } else if (i11 != this.f8228p.size() - 1) {
                m7184k(radioButton2, R$drawable.tcv_middle_option, R$drawable.tcv_middle_option_selected);
            } else if (m7178e()) {
                m7184k(radioButton2, R$drawable.tcv_left_option, R$drawable.tcv_left_option_selected);
            } else {
                m7184k(radioButton2, R$drawable.tcv_right_option, R$drawable.tcv_right_option_selected);
            }
            radioButton2.setLayoutParams(layoutParams);
            int i12 = this.f8217e;
            if (i12 != -1) {
                radioButton2.setPadding(i12, i12, i12, i12);
            }
            int i13 = this.f8218f;
            if (i13 != -1 && (i10 = this.f8219g) != -1) {
                radioButton2.setPadding(i13, i10, i13, i10);
            }
            radioButton2.setMinWidth(this.f8216d * 10);
            radioButton2.setGravity(17);
            radioButton2.setTextSize(0, this.f8215c);
            radioButton2.setTypeface(AbstractC9051b.m15849d());
            radioButton2.setText((CharSequence) entry.getKey());
            fMax = Math.max(radioButton2.getPaint().measureText((String) entry.getKey()), fMax);
            this.f8229q.add(radioButton2);
            i11++;
        }
        for (RadioButton radioButton3 : this.f8229q) {
            if (this.f8226n) {
                radioButton3.setWidth((int) ((this.f8216d * 20) + fMax));
            }
            addView(radioButton3);
        }
        setOnCheckedChangeListener(this.f8230r);
        int i14 = this.f8224l;
        if (i14 <= -1 || (radioButton = (RadioButton) getChildAt(i14)) == null) {
            return;
        }
        check(radioButton.getId());
    }

    /* renamed from: f */
    public TabControlView m7180f(int i10) throws Exception {
        if (i10 > this.f8228p.size() - 1) {
            throw new Exception("Default selection cannot be greater than the number of items");
        }
        this.f8224l = i10;
        m7179j();
        return this;
    }

    /* renamed from: g */
    public final void m7181g(CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2) throws Exception {
        if (charSequenceArr != null && charSequenceArr2 != null && charSequenceArr.length != charSequenceArr2.length) {
            throw new Exception("Item labels and value arrays must be the same size");
        }
        if (charSequenceArr != null) {
            int i10 = 0;
            if (charSequenceArr2 != null) {
                while (i10 < charSequenceArr.length) {
                    this.f8228p.put(charSequenceArr[i10].toString(), charSequenceArr2[i10].toString());
                    i10++;
                }
            } else {
                int length = charSequenceArr.length;
                while (i10 < length) {
                    CharSequence charSequence = charSequenceArr[i10];
                    this.f8228p.put(charSequence.toString(), charSequence.toString());
                    i10++;
                }
            }
        }
    }

    public String getChecked() {
        return (String) this.f8228p.get(((RadioButton) findViewById(getCheckedRadioButtonId())).getText().toString());
    }

    public String[] getCheckedWithIdentifier() {
        String string = ((RadioButton) findViewById(getCheckedRadioButtonId())).getText().toString();
        return new String[]{string, (String) this.f8228p.get(string)};
    }

    /* renamed from: h */
    public TabControlView m7182h(InterfaceC7012b interfaceC7012b) {
        this.f8214b = interfaceC7012b;
        return this;
    }

    /* renamed from: i */
    public final void m7183i(RadioButton radioButton, GradientDrawable gradientDrawable, GradientDrawable gradientDrawable2) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842912}, gradientDrawable);
        stateListDrawable.addState(new int[]{R.attr.state_checked}, gradientDrawable2);
        radioButton.setBackground(stateListDrawable);
    }

    /* renamed from: k */
    public final void m7184k(RadioButton radioButton, int i10, int i11) {
        GradientDrawable gradientDrawable = (GradientDrawable) this.f8213a.getResources().getDrawable(i10).mutate();
        gradientDrawable.setStroke(this.f8216d, this.f8220h);
        gradientDrawable.setDither(true);
        gradientDrawable.setColor(this.f8221i);
        GradientDrawable gradientDrawable2 = (GradientDrawable) this.f8213a.getResources().getDrawable(i11).mutate();
        gradientDrawable2.setColor(this.f8220h);
        gradientDrawable2.setStroke(this.f8216d, this.f8220h);
        m7183i(radioButton, gradientDrawable, gradientDrawable2);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m7179j();
    }

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public void setTypeface(Typeface typeface) {
        if (this.f8229q != null) {
            for (int i10 = 0; i10 < this.f8229q.size(); i10++) {
                ((RadioButton) this.f8229q.get(i10)).setTypeface(typeface);
            }
        }
    }
}
