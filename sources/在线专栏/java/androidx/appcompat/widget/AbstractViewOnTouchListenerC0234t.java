package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.appcompat.view.menu.InterfaceC0134p;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* renamed from: androidx.appcompat.widget.t */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0234t implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a */
    private final float f1210a;

    /* renamed from: b */
    private final int f1211b;

    /* renamed from: c */
    private final int f1212c;

    /* renamed from: d */
    final View f1213d;

    /* renamed from: e */
    private Runnable f1214e;

    /* renamed from: f */
    private Runnable f1215f;

    /* renamed from: g */
    private boolean f1216g;

    /* renamed from: h */
    private int f1217h;

    /* renamed from: i */
    private final int[] f1218i = new int[2];

    /* renamed from: androidx.appcompat.widget.t$a */
    private class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = AbstractViewOnTouchListenerC0234t.this.f1213d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.t$b */
    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractViewOnTouchListenerC0234t.this.m1005e();
        }
    }

    public AbstractViewOnTouchListenerC0234t(View view) {
        this.f1213d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1210a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1211b = tapTimeout;
        this.f1212c = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: a */
    private void m999a() {
        Runnable runnable = this.f1215f;
        if (runnable != null) {
            this.f1213d.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1214e;
        if (runnable2 != null) {
            this.f1213d.removeCallbacks(runnable2);
        }
    }

    /* renamed from: f */
    private boolean m1000f(MotionEvent motionEvent) throws IllegalAccessException, IllegalArgumentException {
        C0232r c0232r;
        View view = this.f1213d;
        InterfaceC0134p interfaceC0134pMo413b = mo413b();
        if (interfaceC0134pMo413b == null || !interfaceC0134pMo413b.mo450a() || (c0232r = (C0232r) interfaceC0134pMo413b.mo453f()) == null || !c0232r.isShown()) {
            return false;
        }
        MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        m1003i(view, motionEventObtainNoHistory);
        m1004j(c0232r, motionEventObtainNoHistory);
        boolean zMo994e = c0232r.mo994e(motionEventObtainNoHistory, this.f1217h);
        motionEventObtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return zMo994e && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m1001g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f1213d
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.f1217h
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f1210a
            boolean r6 = m1002h(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.m999a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.m999a()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.f1217h = r6
            java.lang.Runnable r6 = r5.f1214e
            if (r6 != 0) goto L52
            androidx.appcompat.widget.t$a r6 = new androidx.appcompat.widget.t$a
            r6.<init>()
            r5.f1214e = r6
        L52:
            java.lang.Runnable r6 = r5.f1214e
            int r1 = r5.f1211b
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f1215f
            if (r6 != 0) goto L65
            androidx.appcompat.widget.t$b r6 = new androidx.appcompat.widget.t$b
            r6.<init>()
            r5.f1215f = r6
        L65:
            java.lang.Runnable r6 = r5.f1215f
            int r1 = r5.f1212c
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AbstractViewOnTouchListenerC0234t.m1001g(android.view.MotionEvent):boolean");
    }

    /* renamed from: h */
    private static boolean m1002h(View view, float f4, float f5, float f6) {
        float f7 = -f6;
        return f4 >= f7 && f5 >= f7 && f4 < ((float) (view.getRight() - view.getLeft())) + f6 && f5 < ((float) (view.getBottom() - view.getTop())) + f6;
    }

    /* renamed from: i */
    private boolean m1003i(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f1218i);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    /* renamed from: j */
    private boolean m1004j(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f1218i);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    /* renamed from: b */
    public abstract InterfaceC0134p mo413b();

    /* renamed from: c */
    protected abstract boolean mo414c();

    /* renamed from: d */
    protected boolean mo588d() {
        InterfaceC0134p interfaceC0134pMo413b = mo413b();
        if (interfaceC0134pMo413b == null || !interfaceC0134pMo413b.mo450a()) {
            return true;
        }
        interfaceC0134pMo413b.dismiss();
        return true;
    }

    /* renamed from: e */
    void m1005e() {
        m999a();
        View view = this.f1213d;
        if (view.isEnabled() && !view.isLongClickable() && mo414c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.f1216g = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z3;
        boolean z4 = this.f1216g;
        if (z4) {
            z3 = m1000f(motionEvent) || !mo588d();
        } else {
            z3 = m1001g(motionEvent) && mo414c();
            if (z3) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, 0);
                this.f1213d.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f1216g = z3;
        return z3 || z4;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f1216g = false;
        this.f1217h = -1;
        Runnable runnable = this.f1214e;
        if (runnable != null) {
            this.f1213d.removeCallbacks(runnable);
        }
    }
}
