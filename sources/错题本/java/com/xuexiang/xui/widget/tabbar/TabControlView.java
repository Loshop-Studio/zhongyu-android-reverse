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
import com.xuexiang.xui.R$drawable;
import com.xuexiang.xui.R$styleable;
import io.github.inflationx.calligraphy3.HasTypeface;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import p136p3.C6366d;
import p164t1.AbstractC6582a;

/* loaded from: classes3.dex */
public class TabControlView extends RadioGroup implements HasTypeface {

    /* renamed from: f */
    public static final /* synthetic */ int f4921f = 0;

    /* renamed from: a */
    public final Context f4922a;

    /* renamed from: b */
    public final int f4923b;

    /* renamed from: c */
    public final LinkedHashMap f4924c;

    /* renamed from: d */
    public ArrayList f4925d;

    /* renamed from: e */
    public final C6366d f4926e;

    public TabControlView(Context context) {
        super(context, null);
        this.f4923b = -1;
        this.f4924c = new LinkedHashMap();
        this.f4926e = new C6366d(this);
        this.f4922a = context;
        setPadding(10, 10, 10, 10);
        m3585a();
    }

    /* renamed from: a */
    public final void m3585a() {
        RadioButton radioButton;
        removeAllViews();
        int i = 0;
        setOrientation(0);
        this.f4925d = new ArrayList();
        LinkedHashMap linkedHashMap = this.f4924c;
        float fMax = 0.0f;
        int i8 = 0;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            RadioButton radioButton2 = new RadioButton(this.f4922a);
            radioButton2.setTextColor((ColorStateList) null);
            RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-2, -1);
            if (i8 > 0) {
                layoutParams.setMarginStart(0);
            }
            radioButton2.setLayoutParams(layoutParams);
            radioButton2.setButtonDrawable(new StateListDrawable());
            if (i8 == 0) {
                if (getResources().getConfiguration().getLayoutDirection() == 1) {
                    m3586b(radioButton2, R$drawable.tcv_right_option, R$drawable.tcv_right_option_selected);
                } else {
                    m3586b(radioButton2, R$drawable.tcv_left_option, R$drawable.tcv_left_option_selected);
                }
            } else if (i8 != linkedHashMap.size() - 1) {
                m3586b(radioButton2, R$drawable.tcv_middle_option, R$drawable.tcv_middle_option_selected);
            } else if (getResources().getConfiguration().getLayoutDirection() == 1) {
                m3586b(radioButton2, R$drawable.tcv_left_option, R$drawable.tcv_left_option_selected);
            } else {
                m3586b(radioButton2, R$drawable.tcv_right_option, R$drawable.tcv_right_option_selected);
            }
            radioButton2.setLayoutParams(layoutParams);
            radioButton2.setPadding(0, 0, 0, 0);
            radioButton2.setPadding(0, 0, 0, 0);
            radioButton2.setMinWidth(0);
            radioButton2.setGravity(17);
            radioButton2.setTextSize(0, 0);
            AbstractC6582a.m6218b();
            radioButton2.setTypeface(null);
            radioButton2.setText((CharSequence) entry.getKey());
            fMax = Math.max(radioButton2.getPaint().measureText((String) entry.getKey()), fMax);
            this.f4925d.add(radioButton2);
            i8++;
        }
        ArrayList arrayList = this.f4925d;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            addView((RadioButton) obj);
        }
        setOnCheckedChangeListener(this.f4926e);
        int i9 = this.f4923b;
        if (i9 <= -1 || (radioButton = (RadioButton) getChildAt(i9)) == null) {
            return;
        }
        check(radioButton.getId());
    }

    /* renamed from: b */
    public final void m3586b(RadioButton radioButton, int i, int i8) {
        GradientDrawable gradientDrawable = (GradientDrawable) this.f4922a.getResources().getDrawable(i).mutate();
        gradientDrawable.setStroke(0, 0);
        gradientDrawable.setDither(true);
        gradientDrawable.setColor(0);
        GradientDrawable gradientDrawable2 = (GradientDrawable) this.f4922a.getResources().getDrawable(i8).mutate();
        gradientDrawable2.setColor(0);
        gradientDrawable2.setStroke(0, 0);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842912}, gradientDrawable);
        stateListDrawable.addState(new int[]{R.attr.state_checked}, gradientDrawable2);
        radioButton.setBackground(stateListDrawable);
    }

    public String getChecked() {
        return (String) this.f4924c.get(((RadioButton) findViewById(getCheckedRadioButtonId())).getText().toString());
    }

    public String[] getCheckedWithIdentifier() {
        String string = ((RadioButton) findViewById(getCheckedRadioButtonId())).getText().toString();
        return new String[]{string, (String) this.f4924c.get(string)};
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m3585a();
    }

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public void setTypeface(Typeface typeface) {
        if (this.f4925d != null) {
            for (int i = 0; i < this.f4925d.size(); i++) {
                ((RadioButton) this.f4925d.get(i)).setTypeface(typeface);
            }
        }
    }

    public TabControlView(Context context, AttributeSet attributeSet) throws Exception {
        super(context, attributeSet);
        this.f4923b = -1;
        this.f4924c = new LinkedHashMap();
        this.f4926e = new C6366d(this);
        this.f4922a = context;
        setPadding(10, 10, 10, 10);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.TabControlView, 0, 0);
        try {
            AbstractC6582a.m6217a();
            throw null;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
