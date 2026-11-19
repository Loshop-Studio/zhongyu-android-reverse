package com.xuexiang.xui.widget.textview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.List;
import p176w2.AbstractC7810a;

/* loaded from: classes3.dex */
public class MarqueeTextView extends AppCompatTextView {

    /* renamed from: b */
    public int f5500b;

    /* renamed from: c */
    public boolean f5501c;

    /* renamed from: d */
    public List f5502d;

    /* renamed from: e */
    public int f5503e;

    /* renamed from: f */
    public float f5504f;

    /* renamed from: g */
    public int f5505g;

    /* renamed from: h */
    public int f5506h;

    /* renamed from: i */
    public boolean f5507i;

    /* renamed from: j */
    public boolean f5508j;

    /* renamed from: k */
    public final Handler f5509k;

    /* renamed from: b */
    public final int m4969b() {
        Paint.FontMetricsInt fontMetricsInt = getPaint().getFontMetricsInt();
        return ((getHeight() - fontMetricsInt.bottom) - fontMetricsInt.top) / 2;
    }

    /* renamed from: c */
    public final boolean m4970c() {
        return false;
    }

    /* renamed from: d */
    public MarqueeTextView m4971d() {
        this.f5504f = getWidth();
        this.f5505g = getWidth();
        this.f5500b = m4969b();
        return this;
    }

    public int getCurrentIndex() {
        return this.f5503e;
    }

    public float getCurrentPosition() {
        return this.f5504f;
    }

    public List<AbstractC7810a> getDisplayList() {
        return this.f5502d;
    }

    public int getDisplaySize() {
        List list = this.f5502d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public int getScrollWidth() {
        return this.f5505g;
    }

    public AbstractC7810a getShowDisplayEntity() {
        return null;
    }

    public int getSpeed() {
        return this.f5506h;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        this.f5501c = false;
        if (!m4970c()) {
            this.f5507i = false;
        }
        super.onAttachedToWindow();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public void onDetachedFromWindow() {
        this.f5501c = true;
        this.f5507i = false;
        if (this.f5509k.hasMessages(1)) {
            this.f5509k.removeMessages(1);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (m4970c()) {
            this.f5500b = m4969b();
            throw null;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i6, int i7, int i8, int i9) {
        super.onSizeChanged(i6, i7, i8, i9);
        if (this.f5508j) {
            m4971d();
        }
    }
}
