package p105j1;

import android.os.Parcel;

/* renamed from: j1.b */
/* loaded from: classes.dex */
public final class C2691b {
    /* renamed from: a */
    public static boolean m9003a(Parcel parcel) {
        return parcel.readInt() == 1;
    }

    /* renamed from: b */
    public static void m9004b(Parcel parcel, boolean z3) {
        parcel.writeInt(z3 ? 1 : 0);
    }
}
