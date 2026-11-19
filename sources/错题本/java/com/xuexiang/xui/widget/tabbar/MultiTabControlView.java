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
import android.widget.LinearLayout;
import com.xuexiang.xui.R$drawable;
import com.xuexiang.xui.R$styleable;
import io.github.inflationx.calligraphy3.HasTypeface;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import p136p3.C6365c;
import p164t1.AbstractC6582a;

/* loaded from: classes3.dex */
public class MultiTabControlView extends LinearLayout implements HasTypeface {

    /* renamed from: e */
    public static final /* synthetic */ int f4916e = 0;

    /* renamed from: a */
    public final Context f4917a;

    /* renamed from: b */
    public final LinkedHashMap f4918b;

    /* renamed from: c */
    public ArrayList f4919c;

    /* renamed from: d */
    public final C6365c f4920d;

    public MultiTabControlView(Context context) {
        super(context, null);
        this.f4918b = new LinkedHashMap();
        this.f4920d = new C6365c(this);
        this.f4917a = context;
        setPadding(10, 10, 10, 10);
        m3583a();
    }

    /* renamed from: a */
    public final void m3583a() {
        removeAllViews();
        int i = 0;
        setOrientation(0);
        this.f4919c = new ArrayList();
        LinkedHashMap linkedHashMap = this.f4918b;
        float fMax = 0.0f;
        int i8 = 0;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            CheckBox checkBox = new CheckBox(this.f4917a);
            checkBox.setTextColor((ColorStateList) null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            if (i8 > 0) {
                layoutParams.setMarginStart(0);
            }
            checkBox.setLayoutParams(layoutParams);
            checkBox.setButtonDrawable(new StateListDrawable());
            if (i8 == 0) {
                if (getResources().getConfiguration().getLayoutDirection() == 1) {
                    m3584b(checkBox, R$drawable.tcv_right_option, R$drawable.tcv_right_option_selected);
                } else {
                    m3584b(checkBox, R$drawable.tcv_left_option, R$drawable.tcv_left_option_selected);
                }
            } else if (i8 != linkedHashMap.size() - 1) {
                m3584b(checkBox, R$drawable.tcv_middle_option, R$drawable.tcv_middle_option_selected);
            } else if (getResources().getConfiguration().getLayoutDirection() == 1) {
                m3584b(checkBox, R$drawable.tcv_left_option, R$drawable.tcv_left_option_selected);
            } else {
                m3584b(checkBox, R$drawable.tcv_right_option, R$drawable.tcv_right_option_selected);
            }
            checkBox.setLayoutParams(layoutParams);
            checkBox.setPadding(0, 0, 0, 0);
            checkBox.setPadding(0, 0, 0, 0);
            checkBox.setMinWidth(0);
            checkBox.setGravity(17);
            checkBox.setTextSize(0, 0);
            AbstractC6582a.m6218b();
            checkBox.setTypeface(null);
            checkBox.setText((CharSequence) entry.getKey());
            checkBox.setOnCheckedChangeListener(this.f4920d);
            fMax = Math.max(checkBox.getPaint().measureText((String) entry.getKey()), fMax);
            this.f4919c.add(checkBox);
            i8++;
        }
        ArrayList arrayList = this.f4919c;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            addView((CheckBox) obj);
        }
    }

    /* renamed from: b */
    public final void m3584b(CheckBox checkBox, int i, int i8) {
        GradientDrawable gradientDrawable = (GradientDrawable) this.f4917a.getResources().getDrawable(i).mutate();
        gradientDrawable.setStroke(0, 0);
        gradientDrawable.setDither(true);
        gradientDrawable.setColor(0);
        GradientDrawable gradientDrawable2 = (GradientDrawable) this.f4917a.getResources().getDrawable(i8).mutate();
        gradientDrawable2.setColor(0);
        gradientDrawable2.setStroke(0, 0);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842912}, gradientDrawable);
        stateListDrawable.addState(new int[]{R.attr.state_checked}, gradientDrawable2);
        checkBox.setBackground(stateListDrawable);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m3583a();
    }

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public void setTypeface(Typeface typeface) {
        if (this.f4919c != null) {
            for (int i = 0; i < this.f4919c.size(); i++) {
                ((CheckBox) this.f4919c.get(i)).setTypeface(typeface);
            }
        }
    }

    public MultiTabControlView(Context context, AttributeSet attributeSet) throws Exception {
        super(context, attributeSet);
        this.f4918b = new LinkedHashMap();
        this.f4920d = new C6365c(this);
        this.f4917a = context;
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
