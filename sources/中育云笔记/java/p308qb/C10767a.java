package p308qb;

import android.graphics.Matrix;
import android.view.MotionEvent;
import kotlin.jvm.internal.AbstractC9979u;
import p324rb.AbstractC10928e;
import p324rb.C10929f;
import p324rb.C10930g;
import p324rb.C10931h;
import p324rb.C10932i;

/* renamed from: qb.a */
/* loaded from: classes6.dex */
public final class C10767a {

    /* renamed from: a */
    public int f25963a;

    /* renamed from: b */
    public final C10932i f25964b;

    /* renamed from: c */
    public final C10930g f25965c;

    /* renamed from: d */
    public final C10929f f25966d;

    /* renamed from: e */
    public final C10931h f25967e;

    /* renamed from: f */
    public AbstractC10928e f25968f;

    public C10767a(C10769c boardConfig, Matrix cameraMatrix, C10768b drawControl) {
        AbstractC9979u.m20294g(boardConfig, "boardConfig");
        AbstractC9979u.m20294g(cameraMatrix, "cameraMatrix");
        AbstractC9979u.m20294g(drawControl, "drawControl");
        this.f25964b = new C10932i(boardConfig, cameraMatrix, drawControl);
        this.f25965c = new C10930g(boardConfig, cameraMatrix, drawControl);
        this.f25966d = new C10929f(boardConfig, cameraMatrix, drawControl);
        this.f25967e = new C10931h(boardConfig, cameraMatrix, drawControl);
    }

    /* renamed from: a */
    public final void m22940a(MotionEvent event) {
        AbstractC10928e abstractC10928e;
        AbstractC9979u.m20294g(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            int i10 = this.f25963a;
            AbstractC10928e abstractC10928e2 = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? this.f25967e : this.f25967e : this.f25966d : this.f25965c : this.f25964b;
            this.f25968f = abstractC10928e2;
            if (abstractC10928e2 != null) {
                abstractC10928e2.m23842p(event);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            AbstractC10928e abstractC10928e3 = this.f25968f;
            if (abstractC10928e3 != null) {
                abstractC10928e3.m23846w(event);
            }
            this.f25968f = null;
            return;
        }
        if (actionMasked == 2) {
            AbstractC10928e abstractC10928e4 = this.f25968f;
            if (abstractC10928e4 != null) {
                abstractC10928e4.m23843r(event);
                return;
            }
            return;
        }
        if (actionMasked != 5) {
            if (actionMasked == 6 && (abstractC10928e = this.f25968f) != null) {
                abstractC10928e.mo23845v(event);
                return;
            }
            return;
        }
        AbstractC10928e abstractC10928e5 = this.f25968f;
        if (abstractC10928e5 != null) {
            abstractC10928e5.m23844t(event);
        }
    }

    /* renamed from: b */
    public final void m22941b(int i10) {
        this.f25963a = i10;
    }
}
