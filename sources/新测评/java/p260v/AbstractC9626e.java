package p260v;

import android.content.Context;
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: v.e */
/* loaded from: classes3.dex */
public abstract class AbstractC9626e {
    /* renamed from: a */
    public static final void m15993a() {
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            throw new NetworkOnMainThreadException();
        }
    }

    /* renamed from: b */
    public static final boolean m15994b(Context context, String str) {
        return ContextCompat.checkSelfPermission(context, str) == 0;
    }
}
