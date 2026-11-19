package com.xuexiang.xui.widget.textview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.List;
import p095m1.AbstractC4365a;

/* loaded from: classes2.dex */
public class MarqueeTextView extends AppCompatTextView {

    /* renamed from: b */
    public int f3960b;

    /* renamed from: c */
    public boolean f3961c;

    /* renamed from: d */
    public List f3962d;

    /* renamed from: e */
    public int f3963e;

    /* renamed from: f */
    public float f3964f;

    /* renamed from: g */
    public int f3965g;

    /* renamed from: h */
    public int f3966h;

    /* renamed from: i */
    public boolean f3967i;

    /* renamed from: j */
    public boolean f3968j;

    /* renamed from: k */
    public Handler f3969k;

    /* renamed from: b */
    public final int m4585b() {
        Paint.FontMetricsInt fontMetricsInt = getPaint().getFontMetricsInt();
        return ((getHeight() - fontMetricsInt.bottom) - fontMetricsInt.top) / 2;
    }

    /* renamed from: c */
    public final boolean m4586c() {
        return false;
    }

    /* renamed from: d */
    public MarqueeTextView m4587d() {
        this.f3964f = getWidth();
        this.f3965g = getWidth();
        this.f3960b = m4585b();
        return this;
    }

    public int getCurrentIndex() {
        return this.f3963e;
    }

    public float getCurrentPosition() {
        return this.f3964f;
    }

    public List<AbstractC4365a> getDisplayList() {
        return this.f3962d;
    }

    public int getDisplaySize() {
        List list = this.f3962d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public int getScrollWidth() {
        return this.f3965g;
    }

    public AbstractC4365a getShowDisplayEntity() {
        return null;
    }

    public int getSpeed() {
        return this.f3966h;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        this.f3961c = false;
        if (!m4586c()) {
            this.f3967i = false;
        }
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        this.f3961c = true;
        this.f3967i = false;
        if (this.f3969k.hasMessages(1)) {
            this.f3969k.removeMessages(1);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (m4586c()) {
            this.f3960b = m4585b();
            throw null;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        if (this.f3968j) {
            m4587d();
        }
    }
}
