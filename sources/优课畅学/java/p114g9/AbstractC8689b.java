package p114g9;

import android.content.Context;
import android.graphics.Canvas;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import java.util.LinkedList;
import java.util.Locale;
import master.flame.danmaku.danmaku.model.android.DanmakuContext;
import p040c9.AbstractC5275a;
import p078d9.InterfaceC8324a;
import p102f9.AbstractC8486c;
import p312y8.AbstractC10677d;
import p312y8.HandlerC10676c;
import p312y8.InterfaceC10679f;
import p312y8.InterfaceC10680g;
import p323z8.AbstractC10732c;
import p323z8.InterfaceC10741l;

/* renamed from: g9.b */
/* loaded from: classes5.dex */
public abstract class AbstractC8689b extends View implements InterfaceC10679f, InterfaceC10680g {

    /* renamed from: a */
    public HandlerC10676c.d f16277a;

    /* renamed from: b */
    public HandlerThread f16278b;

    /* renamed from: c */
    public HandlerC10676c f16279c;

    /* renamed from: d */
    public boolean f16280d;

    /* renamed from: e */
    public boolean f16281e;

    /* renamed from: f */
    public C8688a f16282f;

    /* renamed from: g */
    public boolean f16283g;

    /* renamed from: h */
    public boolean f16284h;

    /* renamed from: i */
    public int f16285i;

    /* renamed from: j */
    public Object f16286j;

    /* renamed from: k */
    public boolean f16287k;

    /* renamed from: l */
    public boolean f16288l;

    /* renamed from: m */
    public long f16289m;

    /* renamed from: n */
    public LinkedList f16290n;

    /* renamed from: o */
    public boolean f16291o;

    /* renamed from: p */
    public int f16292p;

    /* renamed from: q */
    public Runnable f16293q;

    /* renamed from: g9.b$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AbstractC8689b.this.f16279c == null) {
                return;
            }
            AbstractC8689b.m14123f(AbstractC8689b.this);
            if (AbstractC8689b.this.f16292p > 4 || AbstractC8689b.super.isShown()) {
                AbstractC8689b.this.f16279c.m19928L();
            } else {
                AbstractC8689b.this.f16279c.postDelayed(this, AbstractC8689b.this.f16292p * 100);
            }
        }
    }

    public AbstractC8689b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16281e = true;
        this.f16284h = true;
        this.f16285i = 0;
        this.f16286j = new Object();
        this.f16287k = false;
        this.f16288l = false;
        this.f16292p = 0;
        this.f16293q = new a();
        m14134l();
    }

    /* renamed from: f */
    public static /* synthetic */ int m14123f(AbstractC8689b abstractC8689b) {
        int i10 = abstractC8689b.f16292p;
        abstractC8689b.f16292p = i10 + 1;
        return i10;
    }

    /* renamed from: A */
    public final void m14125A() throws InterruptedException {
        HandlerC10676c handlerC10676c = this.f16279c;
        this.f16279c = null;
        m14126B();
        if (handlerC10676c != null) {
            handlerC10676c.m19925I();
        }
        HandlerThread handlerThread = this.f16278b;
        if (handlerThread != null) {
            this.f16278b = null;
            try {
                handlerThread.join();
            } catch (InterruptedException e10) {
                e10.printStackTrace();
            }
            handlerThread.quit();
        }
    }

    /* renamed from: B */
    public final void m14126B() {
        synchronized (this.f16286j) {
            this.f16287k = true;
            this.f16286j.notifyAll();
        }
    }

    @Override // p312y8.InterfaceC10680g
    /* renamed from: a */
    public long mo14127a() {
        if (!this.f16280d) {
            return 0L;
        }
        if (!isShown()) {
            return -1L;
        }
        long jM13880b = AbstractC8486c.m13880b();
        m14137o();
        return AbstractC8486c.m13880b() - jM13880b;
    }

    @Override // p312y8.InterfaceC10680g
    /* renamed from: b */
    public boolean mo14128b() {
        return this.f16280d;
    }

    @Override // p312y8.InterfaceC10680g
    /* renamed from: c */
    public boolean mo14129c() {
        return this.f16281e;
    }

    @Override // p312y8.InterfaceC10680g
    public void clear() {
        if (mo14128b()) {
            if (this.f16284h && Thread.currentThread().getId() != this.f16289m) {
                m14138p();
            } else {
                this.f16291o = true;
                m14140r();
            }
        }
    }

    public DanmakuContext getConfig() {
        HandlerC10676c handlerC10676c = this.f16279c;
        if (handlerC10676c == null) {
            return null;
        }
        return handlerC10676c.m19943w();
    }

    public long getCurrentTime() {
        HandlerC10676c handlerC10676c = this.f16279c;
        if (handlerC10676c != null) {
            return handlerC10676c.m19944x();
        }
        return 0L;
    }

    @Override // p312y8.InterfaceC10679f
    public InterfaceC10741l getCurrentVisibleDanmakus() {
        HandlerC10676c handlerC10676c = this.f16279c;
        if (handlerC10676c != null) {
            return handlerC10676c.m19945y();
        }
        return null;
    }

    @Override // p312y8.InterfaceC10679f
    public InterfaceC10679f.a getOnDanmakuClickListener() {
        return null;
    }

    /* renamed from: h */
    public void m14130h(AbstractC10732c abstractC10732c) {
        HandlerC10676c handlerC10676c = this.f16279c;
        if (handlerC10676c != null) {
            handlerC10676c.m19938r(abstractC10732c);
        }
    }

    /* renamed from: i */
    public void m14131i(boolean z10) {
        this.f16281e = z10;
    }

    @Override // android.view.View, p312y8.InterfaceC10680g
    public boolean isHardwareAccelerated() {
        return super.isHardwareAccelerated();
    }

    @Override // android.view.View
    public boolean isShown() {
        return this.f16284h && super.isShown();
    }

    /* renamed from: j */
    public final float m14132j() {
        long jM13880b = AbstractC8486c.m13880b();
        this.f16290n.addLast(Long.valueOf(jM13880b));
        float fLongValue = jM13880b - ((Long) this.f16290n.getFirst()).longValue();
        if (this.f16290n.size() > 50) {
            this.f16290n.removeFirst();
        }
        if (fLongValue > 0.0f) {
            return (this.f16290n.size() * 1000) / fLongValue;
        }
        return 0.0f;
    }

    /* renamed from: k */
    public Looper m14133k(int i10) {
        HandlerThread handlerThread = this.f16278b;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f16278b = null;
        }
        if (i10 == 1) {
            return Looper.getMainLooper();
        }
        int i11 = i10 != 2 ? i10 != 3 ? 0 : 19 : -8;
        HandlerThread handlerThread2 = new HandlerThread("DFM Handler Thread #" + i11, i11);
        this.f16278b = handlerThread2;
        handlerThread2.start();
        return this.f16278b.getLooper();
    }

    /* renamed from: l */
    public final void m14134l() {
        this.f16289m = Thread.currentThread().getId();
        setBackgroundColor(0);
        setDrawingCacheBackgroundColor(0);
        AbstractC10677d.m19955e(true, false);
        this.f16282f = C8688a.m14116e(this);
    }

    /* renamed from: m */
    public boolean m14135m() {
        HandlerC10676c handlerC10676c = this.f16279c;
        if (handlerC10676c != null) {
            return handlerC10676c.m19919C();
        }
        return false;
    }

    /* renamed from: n */
    public boolean m14136n() {
        HandlerC10676c handlerC10676c = this.f16279c;
        return handlerC10676c != null && handlerC10676c.m19918B();
    }

    /* renamed from: o */
    public final void m14137o() {
        HandlerC10676c handlerC10676c;
        if (this.f16284h) {
            m14140r();
            synchronized (this.f16286j) {
                while (!this.f16287k && this.f16279c != null) {
                    try {
                        this.f16286j.wait(200L);
                    } catch (InterruptedException unused) {
                        if (!this.f16284h || (handlerC10676c = this.f16279c) == null || handlerC10676c.m19919C()) {
                            break;
                        } else {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
                this.f16287k = false;
            }
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (!this.f16284h && !this.f16288l) {
            super.onDraw(canvas);
            return;
        }
        if (this.f16291o) {
            AbstractC10677d.m19951a(canvas);
            this.f16291o = false;
        } else {
            HandlerC10676c handlerC10676c = this.f16279c;
            if (handlerC10676c != null) {
                InterfaceC8324a.b bVarM19941u = handlerC10676c.m19941u(canvas);
                if (this.f16283g) {
                    if (this.f16290n == null) {
                        this.f16290n = new LinkedList();
                    }
                    AbstractC10677d.m19954d(canvas, String.format(Locale.getDefault(), "fps %.2f,time:%d s,cache:%d,miss:%d", Float.valueOf(m14132j()), Long.valueOf(getCurrentTime() / 1000), Long.valueOf(bVarM19941u.f15803r), Long.valueOf(bVarM19941u.f15804s)));
                }
            }
        }
        this.f16288l = false;
        m14126B();
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        HandlerC10676c handlerC10676c = this.f16279c;
        if (handlerC10676c != null) {
            handlerC10676c.m19920D(i12 - i10, i13 - i11);
        }
        this.f16280d = true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM14117f = this.f16282f.m14117f(motionEvent);
        return !zM14117f ? super.onTouchEvent(motionEvent) : zM14117f;
    }

    /* renamed from: p */
    public final void m14138p() {
        this.f16291o = true;
        m14137o();
    }

    /* renamed from: q */
    public void m14139q() {
        HandlerC10676c handlerC10676c = this.f16279c;
        if (handlerC10676c != null) {
            handlerC10676c.removeCallbacks(this.f16293q);
            this.f16279c.m19922F();
        }
    }

    /* renamed from: r */
    public final void m14140r() {
        this.f16288l = true;
        postInvalidateOnAnimation();
    }

    /* renamed from: s */
    public final void m14141s() {
        if (this.f16279c == null) {
            this.f16279c = new HandlerC10676c(m14133k(this.f16285i), this, this.f16284h);
        }
    }

    public void setCallback(HandlerC10676c.d dVar) {
        this.f16277a = dVar;
        HandlerC10676c handlerC10676c = this.f16279c;
        if (handlerC10676c != null) {
            handlerC10676c.m19929M(dVar);
        }
    }

    public void setDrawingThreadType(int i10) {
        this.f16285i = i10;
    }

    /* renamed from: t */
    public void m14142t(AbstractC5275a abstractC5275a, DanmakuContext danmakuContext) {
        m14141s();
        this.f16279c.m19930N(danmakuContext);
        this.f16279c.m19931O(abstractC5275a);
        this.f16279c.m19929M(this.f16277a);
        this.f16279c.m19923G();
    }

    /* renamed from: u */
    public void mo12507u() {
        m14147z();
        LinkedList linkedList = this.f16290n;
        if (linkedList != null) {
            linkedList.clear();
        }
    }

    /* renamed from: v */
    public void m14143v() throws InterruptedException {
        m14147z();
        m14145x();
    }

    /* renamed from: w */
    public void m14144w() throws InterruptedException {
        HandlerC10676c handlerC10676c = this.f16279c;
        if (handlerC10676c != null && handlerC10676c.m19918B()) {
            this.f16292p = 0;
            this.f16279c.post(this.f16293q);
        } else if (this.f16279c == null) {
            m14143v();
        }
    }

    /* renamed from: x */
    public void m14145x() {
        m14146y(0L);
    }

    /* renamed from: y */
    public void m14146y(long j10) {
        HandlerC10676c handlerC10676c = this.f16279c;
        if (handlerC10676c == null) {
            m14141s();
        } else {
            handlerC10676c.removeCallbacksAndMessages(null);
        }
        this.f16279c.obtainMessage(1, Long.valueOf(j10)).sendToTarget();
    }

    /* renamed from: z */
    public void m14147z() throws InterruptedException {
        m14125A();
    }

    public View getView() {
        return this;
    }

    public void setOnDanmakuClickListener(InterfaceC10679f.a aVar) {
    }
}
