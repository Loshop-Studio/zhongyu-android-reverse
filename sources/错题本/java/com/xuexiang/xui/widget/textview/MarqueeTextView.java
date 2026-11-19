package com.xuexiang.xui.widget.textview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.xuexiang.xui.R$styleable;
import java.util.ArrayList;
import java.util.List;
import p018b2.C3101a;
import p182v3.AbstractC6666a;

/* loaded from: classes3.dex */
public class MarqueeTextView extends AppCompatTextView {

    /* renamed from: b */
    public boolean f5011b;

    /* renamed from: c */
    public final ArrayList f5012c;

    /* renamed from: d */
    public int f5013d;

    /* renamed from: e */
    public float f5014e;

    /* renamed from: f */
    public int f5015f;

    /* renamed from: g */
    public final int f5016g;

    /* renamed from: h */
    public final boolean f5017h;

    /* renamed from: i */
    public final boolean f5018i;

    /* renamed from: j */
    public final Handler f5019j;

    public MarqueeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5012c = new ArrayList();
        this.f5013d = 0;
        this.f5016g = 3;
        this.f5019j = new Handler(new C3101a(this, 2));
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.MarqueeTextView);
        this.f5017h = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MarqueeTextView_mtv_isAutoFit, false);
        boolean z8 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MarqueeTextView_mtv_isAutoDisplay, false);
        this.f5018i = z8;
        if (z8) {
            setVisibility(8);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    public final void m3613b() {
        int i = this.f5013d + 1;
        this.f5013d = i;
        if (i <= this.f5012c.size() - 1) {
            if (this.f5012c != null && i >= 0 && i <= r1.size() - 1 && this.f5012c.get(i) != null) {
                throw new ClassCastException();
            }
            m3613b();
            return;
        }
        ArrayList arrayList = this.f5012c;
        if (arrayList == null || arrayList.size() <= 0) {
            if (this.f5018i) {
                setVisibility(8);
                return;
            }
            return;
        }
        if (this.f5018i) {
            setVisibility(0);
        }
        this.f5013d = 0;
        if (this.f5012c != null && r0.size() - 1 >= 0 && this.f5012c.get(0) != null) {
            throw new ClassCastException();
        }
        m3613b();
    }

    public int getCurrentIndex() {
        return this.f5013d;
    }

    public float getCurrentPosition() {
        return this.f5014e;
    }

    public List<AbstractC6666a> getDisplayList() {
        return this.f5012c;
    }

    public int getDisplaySize() {
        ArrayList arrayList = this.f5012c;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public int getScrollWidth() {
        return this.f5015f;
    }

    public AbstractC6666a getShowDisplayEntity() {
        return null;
    }

    public int getSpeed() {
        return this.f5016g;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        this.f5011b = false;
        super.onAttachedToWindow();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public final void onDetachedFromWindow() {
        this.f5011b = true;
        Handler handler = this.f5019j;
        if (handler.hasMessages(1)) {
            handler.removeMessages(1);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i8, int i9, int i10) {
        super.onSizeChanged(i, i8, i9, i10);
        if (this.f5017h) {
            this.f5014e = getWidth();
            this.f5015f = getWidth();
            Paint.FontMetricsInt fontMetricsInt = getPaint().getFontMetricsInt();
            getHeight();
            int i11 = fontMetricsInt.bottom;
        }
    }
}
