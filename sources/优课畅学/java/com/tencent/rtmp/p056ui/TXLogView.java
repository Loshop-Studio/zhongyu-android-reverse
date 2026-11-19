package com.tencent.rtmp.p056ui;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

/* loaded from: classes4.dex */
public class TXLogView extends LinearLayout {

    /* renamed from: a */
    StringBuffer f6542a;

    /* renamed from: b */
    private TextView f6543b;

    /* renamed from: c */
    private TextView f6544c;

    /* renamed from: d */
    private ScrollView f6545d;

    /* renamed from: e */
    private ScrollView f6546e;

    /* renamed from: f */
    private final int f6547f;

    /* renamed from: g */
    private boolean f6548g;

    public TXLogView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public static int m5831a(Context context, float f10) {
        return (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public TXLogView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6542a = new StringBuffer("");
        this.f6547f = 3000;
        this.f6548g = false;
        setOrientation(1);
        this.f6543b = new TextView(context);
        this.f6544c = new TextView(context);
        this.f6545d = new ScrollView(context);
        this.f6546e = new ScrollView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 0.2f;
        this.f6545d.setLayoutParams(layoutParams);
        this.f6545d.setBackgroundColor(1627389951);
        this.f6545d.setVerticalScrollBarEnabled(true);
        this.f6545d.setScrollbarFadingEnabled(true);
        this.f6543b.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f6543b.setTextSize(2, 11.0f);
        this.f6543b.setTextColor(-16777216);
        this.f6543b.setTypeface(Typeface.MONOSPACE, 1);
        this.f6543b.setLineSpacing(4.0f, 1.0f);
        this.f6543b.setPadding(m5831a(context, 2.0f), m5831a(context, 2.0f), m5831a(context, 2.0f), m5831a(context, 2.0f));
        this.f6545d.addView(this.f6543b);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams2.weight = 0.8f;
        layoutParams2.topMargin = m5831a(context, 2.0f);
        this.f6546e.setLayoutParams(layoutParams2);
        this.f6546e.setBackgroundColor(1627389951);
        this.f6546e.setVerticalScrollBarEnabled(true);
        this.f6546e.setScrollbarFadingEnabled(true);
        this.f6544c.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f6544c.setTextSize(2, 13.0f);
        this.f6544c.setTextColor(-16777216);
        this.f6544c.setPadding(m5831a(context, 2.0f), m5831a(context, 2.0f), m5831a(context, 2.0f), m5831a(context, 2.0f));
        this.f6546e.addView(this.f6544c);
        addView(this.f6545d);
        addView(this.f6546e);
        setVisibility(8);
    }
}
