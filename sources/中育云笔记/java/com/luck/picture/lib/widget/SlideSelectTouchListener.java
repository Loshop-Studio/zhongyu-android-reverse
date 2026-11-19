package com.luck.picture.lib.widget;

import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.OverScroller;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import org.eclipse.paho.client.mqttv3.DisconnectedBufferOptions;

/* loaded from: classes5.dex */
public class SlideSelectTouchListener implements RecyclerView.OnItemTouchListener {

    /* renamed from: a */
    public boolean f12633a;

    /* renamed from: b */
    public int f12634b;

    /* renamed from: c */
    public int f12635c;

    /* renamed from: d */
    public boolean f12636d;

    /* renamed from: e */
    public boolean f12637e;

    /* renamed from: f */
    public int f12638f;

    /* renamed from: g */
    public float f12639g;

    /* renamed from: h */
    public float f12640h;

    /* renamed from: i */
    public int f12641i;

    /* renamed from: j */
    public int f12642j;

    /* renamed from: k */
    public InterfaceC7512c f12643k;

    /* renamed from: l */
    public RecyclerView f12644l;

    /* renamed from: m */
    public OverScroller f12645m;

    /* renamed from: o */
    public int f12647o;

    /* renamed from: p */
    public int f12648p;

    /* renamed from: q */
    public int f12649q;

    /* renamed from: r */
    public int f12650r;

    /* renamed from: y */
    public int f12657y;

    /* renamed from: n */
    public final Runnable f12646n = new RunnableC7510a();

    /* renamed from: s */
    public int f12651s = 16;

    /* renamed from: t */
    public int f12652t = (int) (Resources.getSystem().getDisplayMetrics().density * 56.0f);

    /* renamed from: u */
    public int f12653u = 0;

    /* renamed from: v */
    public int f12654v = 0;

    /* renamed from: w */
    public boolean f12655w = true;

    /* renamed from: x */
    public boolean f12656x = true;

    /* renamed from: com.luck.picture.lib.widget.SlideSelectTouchListener$a */
    public class RunnableC7510a implements Runnable {
        public RunnableC7510a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SlideSelectTouchListener.this.f12645m == null || !SlideSelectTouchListener.this.f12645m.computeScrollOffset()) {
                return;
            }
            SlideSelectTouchListener slideSelectTouchListener = SlideSelectTouchListener.this;
            slideSelectTouchListener.m9635l(slideSelectTouchListener.f12638f);
            ViewCompat.postOnAnimation(SlideSelectTouchListener.this.f12644l, SlideSelectTouchListener.this.f12646n);
        }
    }

    /* renamed from: com.luck.picture.lib.widget.SlideSelectTouchListener$b */
    public interface InterfaceC7511b extends InterfaceC7512c {
        /* renamed from: a */
        void mo9642a(int i10);

        /* renamed from: c */
        void mo9643c(int i10);
    }

    /* renamed from: com.luck.picture.lib.widget.SlideSelectTouchListener$c */
    public interface InterfaceC7512c {
        /* renamed from: b */
        void mo9644b(int i10, int i11, boolean z10);
    }

    public SlideSelectTouchListener() {
        m9634k();
    }

    /* renamed from: f */
    public final void m9629f(RecyclerView recyclerView, float f10, float f11) {
        int childAdapterPosition;
        View viewFindChildViewUnder = recyclerView.findChildViewUnder(f10, f11);
        if (viewFindChildViewUnder == null || (childAdapterPosition = recyclerView.getChildAdapterPosition(viewFindChildViewUnder) - this.f12657y) == -1 || this.f12635c == childAdapterPosition) {
            return;
        }
        this.f12635c = childAdapterPosition;
        m9632i();
    }

    /* renamed from: g */
    public final void m9630g(RecyclerView recyclerView, MotionEvent motionEvent) {
        m9629f(recyclerView, motionEvent.getX(), motionEvent.getY());
    }

    /* renamed from: h */
    public final void m9631h(Context context) {
        if (this.f12645m == null) {
            this.f12645m = new OverScroller(context, new LinearInterpolator());
        }
    }

    /* renamed from: i */
    public final void m9632i() {
        int i10;
        int i11;
        if (this.f12643k == null || (i10 = this.f12634b) == -1 || (i11 = this.f12635c) == -1) {
            return;
        }
        int iMin = Math.min(i10, i11);
        int iMax = Math.max(this.f12634b, this.f12635c);
        if (iMin < 0) {
            return;
        }
        int i12 = this.f12641i;
        if (i12 != -1 && this.f12642j != -1) {
            if (iMin > i12) {
                this.f12643k.mo9644b(i12, iMin - 1, false);
            } else if (iMin < i12) {
                this.f12643k.mo9644b(iMin, i12 - 1, true);
            }
            int i13 = this.f12642j;
            if (iMax > i13) {
                this.f12643k.mo9644b(i13 + 1, iMax, true);
            } else if (iMax < i13) {
                this.f12643k.mo9644b(iMax + 1, i13, false);
            }
        } else if (iMax - iMin == 1) {
            this.f12643k.mo9644b(iMin, iMin, true);
        } else {
            this.f12643k.mo9644b(iMin, iMax, true);
        }
        this.f12641i = iMin;
        this.f12642j = iMax;
    }

    /* renamed from: j */
    public final void m9633j(MotionEvent motionEvent) {
        int y10 = (int) motionEvent.getY();
        int i10 = this.f12647o;
        if (y10 >= i10 && y10 <= this.f12648p) {
            this.f12639g = motionEvent.getX();
            this.f12640h = motionEvent.getY();
            int i11 = this.f12648p;
            int i12 = this.f12647o;
            this.f12638f = (int) (this.f12651s * (((i11 - i12) - (y10 - i12)) / (i11 - i12)) * (-1.0f));
            if (this.f12636d) {
                return;
            }
            this.f12636d = true;
            m9638o();
            return;
        }
        if (this.f12655w && y10 < i10) {
            this.f12639g = motionEvent.getX();
            this.f12640h = motionEvent.getY();
            this.f12638f = this.f12651s * (-1);
            if (this.f12636d) {
                return;
            }
            this.f12636d = true;
            m9638o();
            return;
        }
        if (y10 >= this.f12649q && y10 <= this.f12650r) {
            this.f12639g = motionEvent.getX();
            this.f12640h = motionEvent.getY();
            float f10 = y10;
            int i13 = this.f12649q;
            this.f12638f = (int) (this.f12651s * ((f10 - i13) / (this.f12650r - i13)));
            if (this.f12637e) {
                return;
            }
            this.f12637e = true;
            m9638o();
            return;
        }
        if (!this.f12656x || y10 <= this.f12650r) {
            this.f12637e = false;
            this.f12636d = false;
            this.f12639g = Float.MIN_VALUE;
            this.f12640h = Float.MIN_VALUE;
            m9640q();
            return;
        }
        this.f12639g = motionEvent.getX();
        this.f12640h = motionEvent.getY();
        this.f12638f = this.f12651s;
        if (this.f12636d) {
            return;
        }
        this.f12636d = true;
        m9638o();
    }

    /* renamed from: k */
    public final void m9634k() {
        m9636m(false);
        InterfaceC7512c interfaceC7512c = this.f12643k;
        if (interfaceC7512c != null && (interfaceC7512c instanceof InterfaceC7511b)) {
            ((InterfaceC7511b) interfaceC7512c).mo9643c(this.f12635c);
        }
        this.f12634b = -1;
        this.f12635c = -1;
        this.f12641i = -1;
        this.f12642j = -1;
        this.f12636d = false;
        this.f12637e = false;
        this.f12639g = Float.MIN_VALUE;
        this.f12640h = Float.MIN_VALUE;
        m9640q();
    }

    /* renamed from: l */
    public final void m9635l(int i10) {
        this.f12644l.scrollBy(0, i10 > 0 ? Math.min(i10, this.f12651s) : Math.max(i10, -this.f12651s));
        float f10 = this.f12639g;
        if (f10 != Float.MIN_VALUE) {
            float f11 = this.f12640h;
            if (f11 != Float.MIN_VALUE) {
                m9629f(this.f12644l, f10, f11);
            }
        }
    }

    /* renamed from: m */
    public void m9636m(boolean z10) {
        this.f12633a = z10;
    }

    /* renamed from: n */
    public SlideSelectTouchListener m9637n(int i10) {
        this.f12657y = i10;
        return this;
    }

    /* renamed from: o */
    public void m9638o() {
        RecyclerView recyclerView = this.f12644l;
        if (recyclerView == null) {
            return;
        }
        m9631h(recyclerView.getContext());
        if (this.f12645m.isFinished()) {
            this.f12644l.removeCallbacks(this.f12646n);
            OverScroller overScroller = this.f12645m;
            overScroller.startScroll(0, overScroller.getCurrY(), 0, DisconnectedBufferOptions.DISCONNECTED_BUFFER_SIZE_DEFAULT, 100000);
            ViewCompat.postOnAnimation(this.f12644l, this.f12646n);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (!this.f12633a || recyclerView.getAdapter() == null || recyclerView.getAdapter().getItemCount() == 0) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0 || action == 5) {
            m9634k();
        }
        this.f12644l = recyclerView;
        int height = recyclerView.getHeight();
        int i10 = this.f12653u;
        this.f12647o = i10;
        int i11 = this.f12652t;
        this.f12648p = i10 + i11;
        int i12 = this.f12654v;
        this.f12649q = (height + i12) - i11;
        this.f12650r = height + i12;
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onRequestDisallowInterceptTouchEvent(boolean z10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (!this.f12633a) {
            m9634k();
            return;
        }
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action == 2) {
                if (!this.f12636d && !this.f12637e) {
                    m9630g(recyclerView, motionEvent);
                }
                m9633j(motionEvent);
                return;
            }
            if (action != 3 && action != 6) {
                return;
            }
        }
        m9634k();
    }

    /* renamed from: p */
    public void m9639p(int i10) {
        m9636m(true);
        this.f12634b = i10;
        this.f12635c = i10;
        this.f12641i = i10;
        this.f12642j = i10;
        InterfaceC7512c interfaceC7512c = this.f12643k;
        if (interfaceC7512c == null || !(interfaceC7512c instanceof InterfaceC7511b)) {
            return;
        }
        ((InterfaceC7511b) interfaceC7512c).mo9642a(i10);
    }

    /* renamed from: q */
    public void m9640q() {
        try {
            OverScroller overScroller = this.f12645m;
            if (overScroller == null || overScroller.isFinished()) {
                return;
            }
            this.f12644l.removeCallbacks(this.f12646n);
            this.f12645m.abortAnimation();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: r */
    public SlideSelectTouchListener m9641r(InterfaceC7512c interfaceC7512c) {
        this.f12643k = interfaceC7512c;
        return this;
    }
}
