package p263u5;

import androidx.core.view.ViewCompat;

/* renamed from: u5.f */
/* loaded from: classes4.dex */
public final class C9687f {

    /* renamed from: a */
    public static final C9687f f17124a = new C9687f();

    /* renamed from: a */
    public final int m16169a(int i9, float f10) {
        return (i9 & ViewCompat.MEASURED_SIZE_MASK) | (((int) (f10 * 255)) << 24);
    }

    /* renamed from: b */
    public final int m16170b(int i9) {
        return (i9 & ViewCompat.MEASURED_SIZE_MASK) | ViewCompat.MEASURED_STATE_MASK;
    }
}
