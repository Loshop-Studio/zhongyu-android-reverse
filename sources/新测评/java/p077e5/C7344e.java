package p077e5;

import androidx.core.view.ViewCompat;

/* renamed from: e5.e */
/* loaded from: classes4.dex */
public final class C7344e {

    /* renamed from: a */
    public static final C7344e f11911a = new C7344e();

    /* renamed from: a */
    public final int m11748a(int i10, float f10) {
        return (i10 & ViewCompat.MEASURED_SIZE_MASK) | (((int) (f10 * 255)) << 24);
    }

    /* renamed from: b */
    public final int m11749b(int i10) {
        return (i10 & ViewCompat.MEASURED_SIZE_MASK) | ViewCompat.MEASURED_STATE_MASK;
    }
}
