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
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$dimen;
import com.xuexiang.xui.R$drawable;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.utils.AbstractC8040f;
import com.xuexiang.xui.utils.AbstractC8041g;
import io.github.inflationx.calligraphy3.HasTypeface;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p420y7.AbstractC11916b;

/* loaded from: classes5.dex */
public class TabControlView extends RadioGroup implements HasTypeface {

    /* renamed from: c */
    public Context f17070c;

    /* renamed from: d */
    public int f17071d;

    /* renamed from: e */
    public int f17072e;

    /* renamed from: f */
    public int f17073f;

    /* renamed from: g */
    public int f17074g;

    /* renamed from: h */
    public int f17075h;

    /* renamed from: i */
    public int f17076i;

    /* renamed from: j */
    public int f17077j;

    /* renamed from: k */
    public int f17078k;

    /* renamed from: l */
    public int f17079l;

    /* renamed from: m */
    public int f17080m;

    /* renamed from: n */
    public boolean f17081n;

    /* renamed from: o */
    public boolean f17082o;

    /* renamed from: p */
    public ColorStateList f17083p;

    /* renamed from: q */
    public LinkedHashMap f17084q;

    /* renamed from: r */
    public List f17085r;

    /* renamed from: s */
    public RadioGroup.OnCheckedChangeListener f17086s;

    /* renamed from: com.xuexiang.xui.widget.tabbar.TabControlView$a */
    public class C8264a implements RadioGroup.OnCheckedChangeListener {
        public C8264a() {
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i10) {
            TabControlView.m13284a(TabControlView.this);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.tabbar.TabControlView$b */
    public interface InterfaceC8265b {
    }

    public TabControlView(Context context) {
        super(context, null);
        this.f17080m = -1;
        this.f17081n = false;
        this.f17082o = false;
        this.f17084q = new LinkedHashMap();
        this.f17086s = new C8264a();
        m13285b(context);
        m13289g();
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC8265b m13284a(TabControlView tabControlView) {
        tabControlView.getClass();
        return null;
    }

    /* renamed from: b */
    private void m13285b(Context context) {
        this.f17070c = context;
        setPadding(10, 10, 10, 10);
    }

    /* renamed from: c */
    private void m13286c(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.TabControlView, 0, 0);
        try {
            this.f17071d = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TabControlView_tcv_textSize, AbstractC8040f.m12204e(R$dimen.default_tcv_text_size));
            this.f17076i = typedArrayObtainStyledAttributes.getColor(R$styleable.TabControlView_tcv_selectedColor, AbstractC8041g.m12217d(context, R$attr.colorAccent));
            this.f17077j = typedArrayObtainStyledAttributes.getColor(R$styleable.TabControlView_tcv_unselectedColor, 0);
            this.f17078k = typedArrayObtainStyledAttributes.getColor(R$styleable.TabControlView_tcv_selectedTextColor, -1);
            this.f17079l = typedArrayObtainStyledAttributes.getColor(R$styleable.TabControlView_tcv_unselectedTextColor, AbstractC8041g.m12217d(context, R$attr.colorAccent));
            this.f17072e = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TabControlView_tcv_strokeWidth, AbstractC8040f.m12204e(R$dimen.default_tcv_stroke_width));
            this.f17073f = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TabControlView_tcv_item_padding, -1);
            this.f17074g = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TabControlView_tcv_item_padding_horizontal, -1);
            this.f17075h = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TabControlView_tcv_item_padding_vertical, -1);
            this.f17083p = new ColorStateList(new int[][]{new int[]{-16842912}, new int[]{R.attr.state_checked}}, new int[]{this.f17079l, this.f17078k});
            this.f17080m = typedArrayObtainStyledAttributes.getInt(R$styleable.TabControlView_tcv_defaultSelection, this.f17080m);
            this.f17082o = typedArrayObtainStyledAttributes.getBoolean(R$styleable.TabControlView_tcv_equalWidth, this.f17082o);
            this.f17081n = typedArrayObtainStyledAttributes.getBoolean(R$styleable.TabControlView_tcv_stretch, this.f17081n);
            m13288e(typedArrayObtainStyledAttributes.getTextArray(R$styleable.TabControlView_tcv_items), typedArrayObtainStyledAttributes.getTextArray(R$styleable.TabControlView_tcv_values));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: d */
    private boolean m13287d() {
        return getResources().getConfiguration().getLayoutDirection() == 1;
    }

    /* renamed from: e */
    private void m13288e(CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2) throws Exception {
        if (charSequenceArr != null && charSequenceArr2 != null && charSequenceArr.length != charSequenceArr2.length) {
            throw new Exception("Item labels and value arrays must be the same size");
        }
        if (charSequenceArr != null) {
            int i10 = 0;
            if (charSequenceArr2 != null) {
                while (i10 < charSequenceArr.length) {
                    this.f17084q.put(charSequenceArr[i10].toString(), charSequenceArr2[i10].toString());
                    i10++;
                }
            } else {
                int length = charSequenceArr.length;
                while (i10 < length) {
                    CharSequence charSequence = charSequenceArr[i10];
                    this.f17084q.put(charSequence.toString(), charSequence.toString());
                    i10++;
                }
            }
        }
    }

    /* renamed from: g */
    private void m13289g() {
        RadioButton radioButton;
        int i10;
        removeAllViews();
        setOrientation(0);
        this.f17085r = new ArrayList();
        float fMax = 0.0f;
        int i11 = 0;
        for (Map.Entry entry : this.f17084q.entrySet()) {
            RadioButton radioButton2 = new RadioButton(this.f17070c);
            radioButton2.setTextColor(this.f17083p);
            RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-2, -1);
            if (this.f17081n) {
                layoutParams.weight = 1.0f;
            }
            if (i11 > 0) {
                layoutParams.setMarginStart(-this.f17072e);
            }
            radioButton2.setLayoutParams(layoutParams);
            radioButton2.setButtonDrawable(new StateListDrawable());
            if (i11 == 0) {
                if (m13287d()) {
                    m13291h(radioButton2, R$drawable.tcv_right_option, R$drawable.tcv_right_option_selected);
                } else {
                    m13291h(radioButton2, R$drawable.tcv_left_option, R$drawable.tcv_left_option_selected);
                }
            } else if (i11 != this.f17084q.size() - 1) {
                m13291h(radioButton2, R$drawable.tcv_middle_option, R$drawable.tcv_middle_option_selected);
            } else if (m13287d()) {
                m13291h(radioButton2, R$drawable.tcv_left_option, R$drawable.tcv_left_option_selected);
            } else {
                m13291h(radioButton2, R$drawable.tcv_right_option, R$drawable.tcv_right_option_selected);
            }
            radioButton2.setLayoutParams(layoutParams);
            int i12 = this.f17073f;
            if (i12 != -1) {
                radioButton2.setPadding(i12, i12, i12, i12);
            }
            int i13 = this.f17074g;
            if (i13 != -1 && (i10 = this.f17075h) != -1) {
                radioButton2.setPadding(i13, i10, i13, i10);
            }
            radioButton2.setMinWidth(this.f17072e * 10);
            radioButton2.setGravity(17);
            radioButton2.setTextSize(0, this.f17071d);
            radioButton2.setTypeface(AbstractC11916b.m26459c());
            radioButton2.setText((CharSequence) entry.getKey());
            fMax = Math.max(radioButton2.getPaint().measureText((String) entry.getKey()), fMax);
            this.f17085r.add(radioButton2);
            i11++;
        }
        for (RadioButton radioButton3 : this.f17085r) {
            if (this.f17082o) {
                radioButton3.setWidth((int) ((this.f17072e * 20) + fMax));
            }
            addView(radioButton3);
        }
        setOnCheckedChangeListener(this.f17086s);
        int i14 = this.f17080m;
        if (i14 <= -1 || (radioButton = (RadioButton) getChildAt(i14)) == null) {
            return;
        }
        check(radioButton.getId());
    }

    /* renamed from: f */
    public final void m13290f(RadioButton radioButton, GradientDrawable gradientDrawable, GradientDrawable gradientDrawable2) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842912}, gradientDrawable);
        stateListDrawable.addState(new int[]{R.attr.state_checked}, gradientDrawable2);
        radioButton.setBackground(stateListDrawable);
    }

    public String getChecked() {
        return (String) this.f17084q.get(((RadioButton) findViewById(getCheckedRadioButtonId())).getText().toString());
    }

    public String[] getCheckedWithIdentifier() {
        String string = ((RadioButton) findViewById(getCheckedRadioButtonId())).getText().toString();
        return new String[]{string, (String) this.f17084q.get(string)};
    }

    /* renamed from: h */
    public final void m13291h(RadioButton radioButton, int i10, int i11) {
        GradientDrawable gradientDrawable = (GradientDrawable) this.f17070c.getResources().getDrawable(i10).mutate();
        gradientDrawable.setStroke(this.f17072e, this.f17076i);
        gradientDrawable.setDither(true);
        gradientDrawable.setColor(this.f17077j);
        GradientDrawable gradientDrawable2 = (GradientDrawable) this.f17070c.getResources().getDrawable(i11).mutate();
        gradientDrawable2.setColor(this.f17076i);
        gradientDrawable2.setStroke(this.f17072e, this.f17076i);
        m13290f(radioButton, gradientDrawable, gradientDrawable2);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m13289g();
    }

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public void setTypeface(Typeface typeface) {
        if (this.f17085r != null) {
            for (int i10 = 0; i10 < this.f17085r.size(); i10++) {
                ((RadioButton) this.f17085r.get(i10)).setTypeface(typeface);
            }
        }
    }

    public TabControlView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17080m = -1;
        this.f17081n = false;
        this.f17082o = false;
        this.f17084q = new LinkedHashMap();
        this.f17086s = new C8264a();
        m13285b(context);
        m13286c(context, attributeSet);
        m13289g();
    }
}
