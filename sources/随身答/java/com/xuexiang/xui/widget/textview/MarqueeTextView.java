package com.xuexiang.xui.widget.textview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.List;
import p232r4.AbstractC9429a;

/* loaded from: classes4.dex */
public class MarqueeTextView extends AppCompatTextView {

    /* renamed from: b */
    public int f8030b;

    /* renamed from: c */
    public boolean f8031c;

    /* renamed from: d */
    public List f8032d;

    /* renamed from: e */
    public int f8033e;

    /* renamed from: f */
    public float f8034f;

    /* renamed from: g */
    public int f8035g;

    /* renamed from: h */
    public int f8036h;

    /* renamed from: i */
    public boolean f8037i;

    /* renamed from: j */
    public boolean f8038j;

    /* renamed from: k */
    public Handler f8039k;

    /* renamed from: b */
    public final int m7052b() {
        Paint.FontMetricsInt fontMetricsInt = getPaint().getFontMetricsInt();
        return ((getHeight() - fontMetricsInt.bottom) - fontMetricsInt.top) / 2;
    }

    /* renamed from: c */
    public final boolean m7053c() {
        return false;
    }

    /* renamed from: d */
    public MarqueeTextView m7054d() {
        this.f8034f = getWidth();
        this.f8035g = getWidth();
        this.f8030b = m7052b();
        return this;
    }

    public int getCurrentIndex() {
        return this.f8033e;
    }

    public float getCurrentPosition() {
        return this.f8034f;
    }

    public List<AbstractC9429a> getDisplayList() {
        return this.f8032d;
    }

    public int getDisplaySize() {
        List list = this.f8032d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public int getScrollWidth() {
        return this.f8035g;
    }

    public AbstractC9429a getShowDisplayEntity() {
        return null;
    }

    public int getSpeed() {
        return this.f8036h;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        this.f8031c = false;
        if (!m7053c()) {
            this.f8037i = false;
        }
        super.onAttachedToWindow();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public void onDetachedFromWindow() {
        this.f8031c = true;
        this.f8037i = false;
        if (this.f8039k.hasMessages(1)) {
            this.f8039k.removeMessages(1);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (m7053c()) {
            this.f8030b = m7052b();
            throw null;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        if (this.f8038j) {
            m7054d();
        }
    }
}
