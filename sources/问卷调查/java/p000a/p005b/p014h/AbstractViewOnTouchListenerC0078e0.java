package p000a.p005b.p014h;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import p000a.p005b.p012g.p013i.InterfaceC0063p;

/* renamed from: a.b.h.e0 */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0078e0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: b */
    public final float f604b;

    /* renamed from: c */
    public final int f605c;

    /* renamed from: d */
    public final int f606d;

    /* renamed from: e */
    public final View f607e;

    /* renamed from: f */
    public Runnable f608f;

    /* renamed from: g */
    public Runnable f609g;

    /* renamed from: h */
    public boolean f610h;

    /* renamed from: i */
    public int f611i;

    /* renamed from: j */
    public final int[] f612j = new int[2];

    /* renamed from: a.b.h.e0$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = AbstractViewOnTouchListenerC0078e0.this.f607e.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: a.b.h.e0$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractViewOnTouchListenerC0078e0 abstractViewOnTouchListenerC0078e0 = AbstractViewOnTouchListenerC0078e0.this;
            abstractViewOnTouchListenerC0078e0.m309a();
            View view = abstractViewOnTouchListenerC0078e0.f607e;
            if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC0078e0.mo294c()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
                abstractViewOnTouchListenerC0078e0.f610h = true;
            }
        }
    }

    public AbstractViewOnTouchListenerC0078e0(View view) {
        this.f607e = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f604b = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f605c = tapTimeout;
        this.f606d = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    /* renamed from: a */
    public final void m309a() {
        Runnable runnable = this.f609g;
        if (runnable != null) {
            this.f607e.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f608f;
        if (runnable2 != null) {
            this.f607e.removeCallbacks(runnable2);
        }
    }

    /* renamed from: b */
    public abstract InterfaceC0063p mo293b();

    /* renamed from: c */
    public abstract boolean mo294c();

    /* renamed from: d */
    public boolean mo295d() {
        InterfaceC0063p interfaceC0063pMo293b = mo293b();
        if (interfaceC0063pMo293b == null || !interfaceC0063pMo293b.mo171a()) {
            return true;
        }
        interfaceC0063pMo293b.dismiss();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0113  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r12, android.view.MotionEvent r13) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p014h.AbstractViewOnTouchListenerC0078e0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f610h = false;
        this.f611i = -1;
        Runnable runnable = this.f608f;
        if (runnable != null) {
            this.f607e.removeCallbacks(runnable);
        }
    }
}
