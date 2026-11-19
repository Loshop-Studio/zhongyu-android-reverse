package p278w7;

import android.graphics.Matrix;
import android.view.MotionEvent;
import kotlin.jvm.internal.Intrinsics;
import p288x7.AbstractC9875e;
import p288x7.C9876f;
import p288x7.C9877g;
import p288x7.C9878h;
import p288x7.C9879i;

/* renamed from: w7.a */
/* loaded from: classes5.dex */
public final class C9820a {

    /* renamed from: a */
    public int f17356a;

    /* renamed from: b */
    public final C9879i f17357b;

    /* renamed from: c */
    public final C9877g f17358c;

    /* renamed from: d */
    public final C9876f f17359d;

    /* renamed from: e */
    public final C9878h f17360e;

    /* renamed from: f */
    public AbstractC9875e f17361f;

    public C9820a(C9822c boardConfig, Matrix cameraMatrix, C9821b drawControl) {
        Intrinsics.checkNotNullParameter(boardConfig, "boardConfig");
        Intrinsics.checkNotNullParameter(cameraMatrix, "cameraMatrix");
        Intrinsics.checkNotNullParameter(drawControl, "drawControl");
        this.f17357b = new C9879i(boardConfig, cameraMatrix, drawControl);
        this.f17358c = new C9877g(boardConfig, cameraMatrix, drawControl);
        this.f17359d = new C9876f(boardConfig, cameraMatrix, drawControl);
        this.f17360e = new C9878h(boardConfig, cameraMatrix, drawControl);
    }

    /* renamed from: a */
    public final void m16405a(MotionEvent event) {
        AbstractC9875e abstractC9875e;
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            int i10 = this.f17356a;
            AbstractC9875e abstractC9875e2 = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? this.f17360e : this.f17360e : this.f17359d : this.f17358c : this.f17357b;
            this.f17361f = abstractC9875e2;
            if (abstractC9875e2 != null) {
                abstractC9875e2.m16579p(event);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            AbstractC9875e abstractC9875e3 = this.f17361f;
            if (abstractC9875e3 != null) {
                abstractC9875e3.m16583w(event);
            }
            this.f17361f = null;
            return;
        }
        if (actionMasked == 2) {
            AbstractC9875e abstractC9875e4 = this.f17361f;
            if (abstractC9875e4 != null) {
                abstractC9875e4.m16580r(event);
                return;
            }
            return;
        }
        if (actionMasked != 5) {
            if (actionMasked == 6 && (abstractC9875e = this.f17361f) != null) {
                abstractC9875e.mo16582v(event);
                return;
            }
            return;
        }
        AbstractC9875e abstractC9875e5 = this.f17361f;
        if (abstractC9875e5 != null) {
            abstractC9875e5.m16581t(event);
        }
    }

    /* renamed from: b */
    public final void m16406b(int i10) {
        this.f17356a = i10;
    }
}
