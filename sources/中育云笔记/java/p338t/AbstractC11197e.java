package p338t;

import android.content.Context;
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: t.e */
/* loaded from: classes3.dex */
public abstract class AbstractC11197e {
    /* renamed from: a */
    public static final void m24906a() {
        if (AbstractC9979u.m20289b(Looper.myLooper(), Looper.getMainLooper())) {
            throw new NetworkOnMainThreadException();
        }
    }

    /* renamed from: b */
    public static final boolean m24907b(Context context, String str) {
        return ContextCompat.checkSelfPermission(context, str) == 0;
    }
}
