package com.xuexiang.xui.widget.textview.label;

import android.R;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.concurrent.atomic.AtomicInteger;
import p174u3.C6612a;

/* loaded from: classes3.dex */
public class LabelView extends AppCompatTextView {

    /* renamed from: c */
    public static final /* synthetic */ int f5054c = 0;

    /* renamed from: b */
    public final C6612a f5055b;

    static {
        new AtomicInteger(1);
    }

    public LabelView(Context context) {
        this(context, null);
    }

    public LabelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public LabelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C6612a c6612a = new C6612a();
        this.f5055b = c6612a;
        if (getLayoutParams() == null) {
            setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        }
        setGravity(17);
        setTextColor(-1);
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(2, 12.0f);
        setBackgroundColor(-16776961);
        c6612a.setFillBefore(true);
        c6612a.setFillAfter(true);
        c6612a.setFillEnabled(true);
    }
}
