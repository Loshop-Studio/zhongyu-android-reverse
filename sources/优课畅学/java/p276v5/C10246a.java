package p276v5;

import android.graphics.Matrix;
import android.view.MotionEvent;
import kotlin.jvm.internal.AbstractC9133u;
import p287w5.AbstractC10353e;
import p287w5.C10354f;
import p287w5.C10355g;
import p287w5.C10356h;
import p287w5.C10357i;

/* renamed from: v5.a */
/* loaded from: classes5.dex */
public final class C10246a {

    /* renamed from: a */
    public int f20459a;

    /* renamed from: b */
    public final C10357i f20460b;

    /* renamed from: c */
    public final C10355g f20461c;

    /* renamed from: d */
    public final C10354f f20462d;

    /* renamed from: e */
    public final C10356h f20463e;

    /* renamed from: f */
    public AbstractC10353e f20464f;

    public C10246a(C10248c boardConfig, Matrix cameraMatrix, C10247b drawControl) {
        AbstractC9133u.m16133g(boardConfig, "boardConfig");
        AbstractC9133u.m16133g(cameraMatrix, "cameraMatrix");
        AbstractC9133u.m16133g(drawControl, "drawControl");
        this.f20460b = new C10357i(boardConfig, cameraMatrix, drawControl);
        this.f20461c = new C10355g(boardConfig, cameraMatrix, drawControl);
        this.f20462d = new C10354f(boardConfig, cameraMatrix, drawControl);
        this.f20463e = new C10356h(boardConfig, cameraMatrix, drawControl);
    }

    /* renamed from: a */
    public final void m19167a(MotionEvent event) {
        AbstractC10353e abstractC10353e;
        AbstractC9133u.m16133g(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            int i10 = this.f20459a;
            AbstractC10353e abstractC10353e2 = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? this.f20463e : this.f20463e : this.f20462d : this.f20461c : this.f20460b;
            this.f20464f = abstractC10353e2;
            if (abstractC10353e2 != null) {
                abstractC10353e2.m19285p(event);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            AbstractC10353e abstractC10353e3 = this.f20464f;
            if (abstractC10353e3 != null) {
                abstractC10353e3.m19289w(event);
            }
            this.f20464f = null;
            return;
        }
        if (actionMasked == 2) {
            AbstractC10353e abstractC10353e4 = this.f20464f;
            if (abstractC10353e4 != null) {
                abstractC10353e4.m19286r(event);
                return;
            }
            return;
        }
        if (actionMasked != 5) {
            if (actionMasked == 6 && (abstractC10353e = this.f20464f) != null) {
                abstractC10353e.mo19288v(event);
                return;
            }
            return;
        }
        AbstractC10353e abstractC10353e5 = this.f20464f;
        if (abstractC10353e5 != null) {
            abstractC10353e5.m19287t(event);
        }
    }

    /* renamed from: b */
    public final void m19168b(int i10) {
        this.f20459a = i10;
    }
}
