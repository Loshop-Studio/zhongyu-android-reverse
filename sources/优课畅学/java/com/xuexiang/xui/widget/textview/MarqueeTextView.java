package com.xuexiang.xui.widget.textview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.List;
import p273v2.AbstractC10240a;

/* loaded from: classes4.dex */
public class MarqueeTextView extends AppCompatTextView {

    /* renamed from: b */
    public int f8257b;

    /* renamed from: c */
    public boolean f8258c;

    /* renamed from: d */
    public List f8259d;

    /* renamed from: e */
    public int f8260e;

    /* renamed from: f */
    public float f8261f;

    /* renamed from: g */
    public int f8262g;

    /* renamed from: h */
    public int f8263h;

    /* renamed from: i */
    public boolean f8264i;

    /* renamed from: j */
    public boolean f8265j;

    /* renamed from: k */
    public final Handler f8266k;

    /* renamed from: b */
    public final int m7203b() {
        Paint.FontMetricsInt fontMetricsInt = getPaint().getFontMetricsInt();
        return ((getHeight() - fontMetricsInt.bottom) - fontMetricsInt.top) / 2;
    }

    /* renamed from: c */
    public final boolean m7204c() {
        return false;
    }

    /* renamed from: d */
    public MarqueeTextView m7205d() {
        this.f8261f = getWidth();
        this.f8262g = getWidth();
        this.f8257b = m7203b();
        return this;
    }

    public int getCurrentIndex() {
        return this.f8260e;
    }

    public float getCurrentPosition() {
        return this.f8261f;
    }

    public List<AbstractC10240a> getDisplayList() {
        return this.f8259d;
    }

    public int getDisplaySize() {
        List list = this.f8259d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public int getScrollWidth() {
        return this.f8262g;
    }

    public AbstractC10240a getShowDisplayEntity() {
        return null;
    }

    public int getSpeed() {
        return this.f8263h;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        this.f8258c = false;
        if (!m7204c()) {
            this.f8264i = false;
        }
        super.onAttachedToWindow();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public void onDetachedFromWindow() {
        this.f8258c = true;
        this.f8264i = false;
        if (this.f8266k.hasMessages(1)) {
            this.f8266k.removeMessages(1);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (m7204c()) {
            this.f8257b = m7203b();
            throw null;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.f8265j) {
            m7205d();
        }
    }
}
