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
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
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
public class MultiTabControlView extends LinearLayout implements HasTypeface {

    /* renamed from: c */
    public Context f17052c;

    /* renamed from: d */
    public int f17053d;

    /* renamed from: e */
    public int f17054e;

    /* renamed from: f */
    public int f17055f;

    /* renamed from: g */
    public int f17056g;

    /* renamed from: h */
    public int f17057h;

    /* renamed from: i */
    public int f17058i;

    /* renamed from: j */
    public int f17059j;

    /* renamed from: k */
    public int f17060k;

    /* renamed from: l */
    public int f17061l;

    /* renamed from: m */
    public int[] f17062m;

    /* renamed from: n */
    public boolean f17063n;

    /* renamed from: o */
    public boolean f17064o;

    /* renamed from: p */
    public ColorStateList f17065p;

    /* renamed from: q */
    public LinkedHashMap f17066q;

    /* renamed from: r */
    public List f17067r;

    /* renamed from: s */
    public CompoundButton.OnCheckedChangeListener f17068s;

    /* renamed from: com.xuexiang.xui.widget.tabbar.MultiTabControlView$a */
    public class C8262a implements CompoundButton.OnCheckedChangeListener {
        public C8262a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            MultiTabControlView.m13274a(MultiTabControlView.this);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.tabbar.MultiTabControlView$b */
    public interface InterfaceC8263b {
    }

    public MultiTabControlView(Context context) {
        super(context, null);
        this.f17063n = false;
        this.f17064o = false;
        this.f17066q = new LinkedHashMap();
        this.f17068s = new C8262a();
        m13275c(context);
        m13278i();
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC8263b m13274a(MultiTabControlView multiTabControlView) {
        multiTabControlView.getClass();
        return null;
    }

    /* renamed from: c */
    private void m13275c(Context context) {
        this.f17052c = context;
        setPadding(10, 10, 10, 10);
    }

    /* renamed from: d */
    private void m13276d(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.TabControlView, 0, 0);
        try {
            this.f17053d = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TabControlView_tcv_textSize, AbstractC8040f.m12204e(R$dimen.default_tcv_text_size));
            this.f17058i = typedArrayObtainStyledAttributes.getColor(R$styleable.TabControlView_tcv_selectedColor, AbstractC8041g.m12217d(context, R$attr.colorAccent));
            this.f17059j = typedArrayObtainStyledAttributes.getColor(R$styleable.TabControlView_tcv_unselectedColor, 0);
            this.f17060k = typedArrayObtainStyledAttributes.getColor(R$styleable.TabControlView_tcv_selectedTextColor, -1);
            this.f17061l = typedArrayObtainStyledAttributes.getColor(R$styleable.TabControlView_tcv_unselectedTextColor, AbstractC8041g.m12217d(context, R$attr.colorAccent));
            this.f17054e = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TabControlView_tcv_strokeWidth, AbstractC8040f.m12204e(R$dimen.default_tcv_stroke_width));
            this.f17055f = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TabControlView_tcv_item_padding, -1);
            this.f17056g = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TabControlView_tcv_item_padding_horizontal, -1);
            this.f17057h = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TabControlView_tcv_item_padding_vertical, -1);
            this.f17065p = new ColorStateList(new int[][]{new int[]{-16842912}, new int[]{R.attr.state_checked}}, new int[]{this.f17061l, this.f17060k});
            int i10 = typedArrayObtainStyledAttributes.getInt(R$styleable.TabControlView_tcv_defaultSelection, -1);
            if (i10 > -1) {
                this.f17062m = new int[]{i10};
            }
            this.f17064o = typedArrayObtainStyledAttributes.getBoolean(R$styleable.TabControlView_tcv_equalWidth, this.f17064o);
            this.f17063n = typedArrayObtainStyledAttributes.getBoolean(R$styleable.TabControlView_tcv_stretch, this.f17063n);
            m13282h(typedArrayObtainStyledAttributes.getTextArray(R$styleable.TabControlView_tcv_items), typedArrayObtainStyledAttributes.getTextArray(R$styleable.TabControlView_tcv_values));
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: e */
    private boolean m13277e() {
        return getResources().getConfiguration().getLayoutDirection() == 1;
    }

    /* renamed from: i */
    private void m13278i() {
        int i10;
        removeAllViews();
        setOrientation(0);
        this.f17067r = new ArrayList();
        float fMax = 0.0f;
        int i11 = 0;
        for (Map.Entry entry : this.f17066q.entrySet()) {
            CheckBox checkBox = new CheckBox(this.f17052c);
            checkBox.setTextColor(this.f17065p);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            if (this.f17063n) {
                layoutParams.weight = 1.0f;
            }
            if (i11 > 0) {
                layoutParams.setMarginStart(-this.f17054e);
            }
            checkBox.setLayoutParams(layoutParams);
            checkBox.setButtonDrawable(new StateListDrawable());
            if (i11 == 0) {
                if (m13277e()) {
                    m13283j(checkBox, R$drawable.tcv_right_option, R$drawable.tcv_right_option_selected);
                } else {
                    m13283j(checkBox, R$drawable.tcv_left_option, R$drawable.tcv_left_option_selected);
                }
            } else if (i11 != this.f17066q.size() - 1) {
                m13283j(checkBox, R$drawable.tcv_middle_option, R$drawable.tcv_middle_option_selected);
            } else if (m13277e()) {
                m13283j(checkBox, R$drawable.tcv_left_option, R$drawable.tcv_left_option_selected);
            } else {
                m13283j(checkBox, R$drawable.tcv_right_option, R$drawable.tcv_right_option_selected);
            }
            checkBox.setLayoutParams(layoutParams);
            int i12 = this.f17055f;
            if (i12 != -1) {
                checkBox.setPadding(i12, i12, i12, i12);
            }
            int i13 = this.f17056g;
            if (i13 != -1 && (i10 = this.f17057h) != -1) {
                checkBox.setPadding(i13, i10, i13, i10);
            }
            checkBox.setMinWidth(this.f17054e * 10);
            checkBox.setGravity(17);
            checkBox.setTextSize(0, this.f17053d);
            checkBox.setTypeface(AbstractC11916b.m26459c());
            checkBox.setText((CharSequence) entry.getKey());
            m13279b(checkBox);
            fMax = Math.max(checkBox.getPaint().measureText((String) entry.getKey()), fMax);
            this.f17067r.add(checkBox);
            i11++;
        }
        for (CheckBox checkBox2 : this.f17067r) {
            if (this.f17064o) {
                checkBox2.setWidth((int) ((this.f17054e * 20) + fMax));
            }
            addView(checkBox2);
        }
        int[] iArr = this.f17062m;
        if (iArr == null || iArr.length <= 0) {
            return;
        }
        for (int i14 : iArr) {
            m13281g(i14, true);
        }
    }

    /* renamed from: b */
    public final void m13279b(CheckBox checkBox) {
        if (checkBox != null) {
            checkBox.setOnCheckedChangeListener(this.f17068s);
        }
    }

    /* renamed from: f */
    public final void m13280f(CheckBox checkBox, GradientDrawable gradientDrawable, GradientDrawable gradientDrawable2) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842912}, gradientDrawable);
        stateListDrawable.addState(new int[]{R.attr.state_checked}, gradientDrawable2);
        checkBox.setBackground(stateListDrawable);
    }

    /* renamed from: g */
    public void m13281g(int i10, boolean z10) {
        CheckBox checkBox = (CheckBox) getChildAt(i10);
        if (checkBox != null) {
            checkBox.setChecked(z10);
        }
    }

    /* renamed from: h */
    public final void m13282h(CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2) throws Exception {
        if (charSequenceArr != null && charSequenceArr2 != null && charSequenceArr.length != charSequenceArr2.length) {
            throw new Exception("Item labels and value arrays must be the same size");
        }
        if (charSequenceArr != null) {
            int i10 = 0;
            if (charSequenceArr2 != null) {
                while (i10 < charSequenceArr.length) {
                    this.f17066q.put(charSequenceArr[i10].toString(), charSequenceArr2[i10].toString());
                    i10++;
                }
            } else {
                int length = charSequenceArr.length;
                while (i10 < length) {
                    CharSequence charSequence = charSequenceArr[i10];
                    this.f17066q.put(charSequence.toString(), charSequence.toString());
                    i10++;
                }
            }
        }
    }

    /* renamed from: j */
    public final void m13283j(CheckBox checkBox, int i10, int i11) {
        GradientDrawable gradientDrawable = (GradientDrawable) this.f17052c.getResources().getDrawable(i10).mutate();
        gradientDrawable.setStroke(this.f17054e, this.f17058i);
        gradientDrawable.setDither(true);
        gradientDrawable.setColor(this.f17059j);
        GradientDrawable gradientDrawable2 = (GradientDrawable) this.f17052c.getResources().getDrawable(i11).mutate();
        gradientDrawable2.setColor(this.f17058i);
        gradientDrawable2.setStroke(this.f17054e, this.f17058i);
        m13280f(checkBox, gradientDrawable, gradientDrawable2);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m13278i();
    }

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public void setTypeface(Typeface typeface) {
        if (this.f17067r != null) {
            for (int i10 = 0; i10 < this.f17067r.size(); i10++) {
                ((CheckBox) this.f17067r.get(i10)).setTypeface(typeface);
            }
        }
    }

    public MultiTabControlView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17063n = false;
        this.f17064o = false;
        this.f17066q = new LinkedHashMap();
        this.f17068s = new C8262a();
        m13275c(context);
        m13276d(context, attributeSet);
        m13278i();
    }
}
