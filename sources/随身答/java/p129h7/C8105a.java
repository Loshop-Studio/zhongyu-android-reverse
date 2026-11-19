package p129h7;

import android.graphics.Matrix;
import android.view.MotionEvent;
import com.zykj.view.simpleBoard.C7719a;
import kotlin.jvm.internal.Intrinsics;
import p139i7.AbstractC8144e;
import p139i7.C8145f;
import p139i7.C8146g;
import p139i7.C8147h;
import p139i7.C8148i;
import p139i7.C8149j;

/* renamed from: h7.a */
/* loaded from: classes5.dex */
public final class C8105a {

    /* renamed from: a */
    public final C7719a f13832a;

    /* renamed from: b */
    public int f13833b;

    /* renamed from: c */
    public final C8149j f13834c;

    /* renamed from: d */
    public final C8146g f13835d;

    /* renamed from: e */
    public final C8145f f13836e;

    /* renamed from: f */
    public final C8147h f13837f;

    /* renamed from: g */
    public final C8148i f13838g;

    /* renamed from: h */
    public AbstractC8144e f13839h;

    public C8105a(C8107c boardConfig, Matrix cameraMatrix, C7719a drawControl) {
        Intrinsics.checkNotNullParameter(boardConfig, "boardConfig");
        Intrinsics.checkNotNullParameter(cameraMatrix, "cameraMatrix");
        Intrinsics.checkNotNullParameter(drawControl, "drawControl");
        this.f13832a = drawControl;
        this.f13834c = new C8149j(boardConfig, cameraMatrix, drawControl);
        this.f13835d = new C8146g(boardConfig, cameraMatrix, drawControl);
        this.f13836e = new C8145f(boardConfig, cameraMatrix, drawControl);
        this.f13837f = new C8147h(boardConfig, cameraMatrix, drawControl);
        this.f13838g = new C8148i(boardConfig, cameraMatrix, drawControl);
    }

    /* renamed from: a */
    public final void m12952a(MotionEvent event) {
        AbstractC8144e abstractC8144e;
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            int i9 = this.f13833b;
            AbstractC8144e abstractC8144e2 = i9 != 0 ? i9 != 1 ? i9 != 2 ? (i9 == 3 || i9 != 4) ? this.f13837f : this.f13838g : this.f13836e : this.f13835d : this.f13834c;
            this.f13839h = abstractC8144e2;
            if (abstractC8144e2 != null) {
                abstractC8144e2.m13068p(event);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            AbstractC8144e abstractC8144e3 = this.f13839h;
            if (abstractC8144e3 != null) {
                abstractC8144e3.m13072w(event);
            }
            this.f13839h = null;
            return;
        }
        if (actionMasked == 2) {
            AbstractC8144e abstractC8144e4 = this.f13839h;
            if (abstractC8144e4 != null) {
                abstractC8144e4.m13069r(event);
                return;
            }
            return;
        }
        if (actionMasked == 3) {
            AbstractC8144e abstractC8144e5 = this.f13839h;
            if (abstractC8144e5 != null) {
                abstractC8144e5.mo13073y(event);
            }
            this.f13839h = null;
            return;
        }
        if (actionMasked != 5) {
            if (actionMasked == 6 && (abstractC8144e = this.f13839h) != null) {
                abstractC8144e.mo13071v(event);
                return;
            }
            return;
        }
        AbstractC8144e abstractC8144e6 = this.f13839h;
        if (abstractC8144e6 != null) {
            abstractC8144e6.m13070t(event);
        }
    }

    /* renamed from: b */
    public final void m12953b(int i9) {
        if (i9 != 4) {
            this.f13832a.m11968g();
        }
        this.f13833b = i9;
    }
}
