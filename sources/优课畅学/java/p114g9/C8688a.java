package p114g9;

import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import p010a9.C0053d;
import p312y8.InterfaceC10679f;
import p323z8.AbstractC10732c;
import p323z8.InterfaceC10740k;
import p323z8.InterfaceC10741l;

/* renamed from: g9.a */
/* loaded from: classes5.dex */
public class C8688a {

    /* renamed from: a */
    public final GestureDetector f16272a;

    /* renamed from: b */
    public InterfaceC10679f f16273b;

    /* renamed from: c */
    public RectF f16274c;

    /* renamed from: d */
    public final GestureDetector.OnGestureListener f16275d;

    /* renamed from: g9.a$a */
    public class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            if (C8688a.this.f16273b == null) {
                return false;
            }
            C8688a.this.f16273b.getOnDanmakuClickListener();
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            InterfaceC10741l interfaceC10741lM14120i = C8688a.this.m14120i(motionEvent.getX(), motionEvent.getY());
            boolean zM14118g = (interfaceC10741lM14120i == null || interfaceC10741lM14120i.isEmpty()) ? false : C8688a.this.m14118g(interfaceC10741lM14120i);
            return !zM14118g ? C8688a.this.m14119h() : zM14118g;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C8688a(InterfaceC10679f interfaceC10679f) {
        a aVar = new a();
        this.f16275d = aVar;
        this.f16273b = interfaceC10679f;
        this.f16274c = new RectF();
        this.f16272a = new GestureDetector(((View) interfaceC10679f).getContext(), aVar);
    }

    /* renamed from: e */
    public static synchronized C8688a m14116e(InterfaceC10679f interfaceC10679f) {
        return new C8688a(interfaceC10679f);
    }

    /* renamed from: f */
    public boolean m14117f(MotionEvent motionEvent) {
        return this.f16272a.onTouchEvent(motionEvent);
    }

    /* renamed from: g */
    public final boolean m14118g(InterfaceC10741l interfaceC10741l) {
        this.f16273b.getOnDanmakuClickListener();
        return false;
    }

    /* renamed from: h */
    public final boolean m14119h() {
        this.f16273b.getOnDanmakuClickListener();
        return false;
    }

    /* renamed from: i */
    public final InterfaceC10741l m14120i(float f10, float f11) {
        C0053d c0053d = new C0053d();
        this.f16274c.setEmpty();
        InterfaceC10741l currentVisibleDanmakus = this.f16273b.getCurrentVisibleDanmakus();
        if (currentVisibleDanmakus != null && !currentVisibleDanmakus.isEmpty()) {
            InterfaceC10740k it = currentVisibleDanmakus.iterator();
            while (it.hasNext()) {
                AbstractC10732c next = it.next();
                if (next != null) {
                    this.f16274c.set(next.mo20048g(), next.mo20053l(), next.mo20050i(), next.mo20045d());
                    if (this.f16274c.contains(f10, f11)) {
                        c0053d.mo182e(next);
                    }
                }
            }
        }
        return c0053d;
    }
}
