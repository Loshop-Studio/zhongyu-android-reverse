package p267v;

import android.content.Context;
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: v.e */
/* loaded from: classes3.dex */
public abstract class AbstractC9739e {
    /* renamed from: a */
    public static final void m16278a() {
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            throw new NetworkOnMainThreadException();
        }
    }

    /* renamed from: b */
    public static final boolean m16279b(Context context, String str) {
        return ContextCompat.checkSelfPermission(context, str) == 0;
    }
}
