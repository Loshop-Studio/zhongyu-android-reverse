package com.xuexiang.xui.widget.textview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.xuexiang.xui.R$styleable;
import java.util.ArrayList;
import java.util.List;
import p212k.AbstractC9764r;
import p276o9.AbstractC10451a;

/* loaded from: classes5.dex */
public class MarqueeTextView extends AppCompatTextView {

    /* renamed from: d */
    public int f17264d;

    /* renamed from: e */
    public boolean f17265e;

    /* renamed from: f */
    public List f17266f;

    /* renamed from: g */
    public int f17267g;

    /* renamed from: h */
    public float f17268h;

    /* renamed from: i */
    public float f17269i;

    /* renamed from: j */
    public int f17270j;

    /* renamed from: k */
    public int f17271k;

    /* renamed from: l */
    public boolean f17272l;

    /* renamed from: m */
    public boolean f17273m;

    /* renamed from: n */
    public boolean f17274n;

    /* renamed from: o */
    public final Object f17275o;

    /* renamed from: p */
    public Handler f17276p;

    /* renamed from: com.xuexiang.xui.widget.textview.MarqueeTextView$a */
    public class C8297a implements Handler.Callback {
        public C8297a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                if (MarqueeTextView.this.f17269i < (-MarqueeTextView.this.f17268h)) {
                    MarqueeTextView.this.m13522r();
                } else {
                    MarqueeTextView.this.f17269i -= MarqueeTextView.this.f17271k;
                    MarqueeTextView.this.m13520p(30);
                }
            }
            return true;
        }
    }

    public MarqueeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17266f = new ArrayList();
        this.f17267g = 0;
        this.f17271k = 3;
        this.f17272l = false;
        this.f17275o = new Object();
        this.f17276p = new Handler(new C8297a());
        m13516l(attributeSet);
    }

    public int getCurrentIndex() {
        return this.f17267g;
    }

    public float getCurrentPosition() {
        return this.f17269i;
    }

    public List<AbstractC10451a> getDisplayList() {
        return this.f17266f;
    }

    public int getDisplaySize() {
        List list = this.f17266f;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public int getScrollWidth() {
        return this.f17270j;
    }

    public AbstractC10451a getShowDisplayEntity() {
        return null;
    }

    public int getSpeed() {
        return this.f17271k;
    }

    /* renamed from: i */
    public final int m13513i() {
        Paint.FontMetricsInt fontMetricsInt = getPaint().getFontMetricsInt();
        return ((getHeight() - fontMetricsInt.bottom) - fontMetricsInt.top) / 2;
    }

    /* renamed from: j */
    public AbstractC10451a m13514j(int i10) {
        if (this.f17266f != null && i10 >= 0 && i10 <= r0.size() - 1) {
            AbstractC9764r.m19682a(this.f17266f.get(i10));
        }
        return null;
    }

    /* renamed from: k */
    public final void m13515k() {
        m13517m();
    }

    /* renamed from: l */
    public final void m13516l(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.MarqueeTextView);
        this.f17273m = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MarqueeTextView_mtv_isAutoFit, false);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MarqueeTextView_mtv_isAutoDisplay, false);
        this.f17274n = z10;
        if (z10) {
            setVisibility(8);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: m */
    public final void m13517m() {
        List list = this.f17266f;
        if (list == null || list.size() <= 0) {
            if (this.f17274n) {
                setVisibility(8);
            }
            this.f17272l = false;
        } else {
            if (this.f17274n) {
                setVisibility(0);
            }
            this.f17267g = 0;
            m13514j(0);
            m13523s(null);
        }
    }

    /* renamed from: n */
    public final boolean m13518n() {
        return false;
    }

    /* renamed from: o */
    public MarqueeTextView m13519o() {
        this.f17269i = getWidth();
        this.f17270j = getWidth();
        this.f17264d = m13513i();
        return this;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        this.f17265e = false;
        if (!m13518n()) {
            this.f17272l = false;
        }
        super.onAttachedToWindow();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public void onDetachedFromWindow() {
        this.f17265e = true;
        this.f17272l = false;
        if (this.f17276p.hasMessages(1)) {
            this.f17276p.removeMessages(1);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (m13518n()) {
            this.f17264d = m13513i();
            throw null;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.f17273m) {
            m13519o();
        }
    }

    /* renamed from: p */
    public final void m13520p(int i10) {
        Handler handler;
        invalidate();
        if (this.f17265e || (handler = this.f17276p) == null) {
            this.f17272l = false;
        } else {
            handler.sendEmptyMessageDelayed(1, i10);
        }
    }

    /* renamed from: q */
    public final void m13521q(int i10) {
        if (i10 > this.f17266f.size() - 1) {
            m13515k();
        } else {
            m13514j(i10);
            m13523s(null);
        }
    }

    /* renamed from: r */
    public final void m13522r() {
        int i10 = this.f17267g + 1;
        this.f17267g = i10;
        m13521q(i10);
    }

    /* renamed from: s */
    public final void m13523s(AbstractC10451a abstractC10451a) {
        m13522r();
    }
}
