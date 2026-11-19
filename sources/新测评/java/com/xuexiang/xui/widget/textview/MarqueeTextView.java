package com.xuexiang.xui.widget.textview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.List;
import p023b4.AbstractC4981a;

/* loaded from: classes4.dex */
public class MarqueeTextView extends AppCompatTextView {

    /* renamed from: b */
    public int f6776b;

    /* renamed from: c */
    public boolean f6777c;

    /* renamed from: d */
    public List f6778d;

    /* renamed from: e */
    public int f6779e;

    /* renamed from: f */
    public float f6780f;

    /* renamed from: g */
    public int f6781g;

    /* renamed from: h */
    public int f6782h;

    /* renamed from: i */
    public boolean f6783i;

    /* renamed from: j */
    public boolean f6784j;

    /* renamed from: k */
    public final Handler f6785k;

    /* renamed from: b */
    public final int m5954b() {
        Paint.FontMetricsInt fontMetricsInt = getPaint().getFontMetricsInt();
        return ((getHeight() - fontMetricsInt.bottom) - fontMetricsInt.top) / 2;
    }

    /* renamed from: c */
    public final boolean m5955c() {
        return false;
    }

    /* renamed from: d */
    public MarqueeTextView m5956d() {
        this.f6780f = getWidth();
        this.f6781g = getWidth();
        this.f6776b = m5954b();
        return this;
    }

    public int getCurrentIndex() {
        return this.f6779e;
    }

    public float getCurrentPosition() {
        return this.f6780f;
    }

    public List<AbstractC4981a> getDisplayList() {
        return this.f6778d;
    }

    public int getDisplaySize() {
        List list = this.f6778d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public int getScrollWidth() {
        return this.f6781g;
    }

    public AbstractC4981a getShowDisplayEntity() {
        return null;
    }

    public int getSpeed() {
        return this.f6782h;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        this.f6777c = false;
        if (!m5955c()) {
            this.f6783i = false;
        }
        super.onAttachedToWindow();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public void onDetachedFromWindow() {
        this.f6777c = true;
        this.f6783i = false;
        if (this.f6785k.hasMessages(1)) {
            this.f6785k.removeMessages(1);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (m5955c()) {
            this.f6776b = m5954b();
            throw null;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.f6784j) {
            m5956d();
        }
    }
}
