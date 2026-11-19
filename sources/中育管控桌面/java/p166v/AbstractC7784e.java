package p166v;

import android.content.Context;
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: v.e */
/* loaded from: classes3.dex */
public abstract class AbstractC7784e {
    /* renamed from: a */
    public static final void m9319a() {
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            throw new NetworkOnMainThreadException();
        }
    }

    /* renamed from: b */
    public static final boolean m9320b(Context context, String str) {
        return ContextCompat.checkSelfPermission(context, str) == 0;
    }
}
