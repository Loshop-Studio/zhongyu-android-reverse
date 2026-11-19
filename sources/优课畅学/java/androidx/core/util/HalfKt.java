package androidx.core.util;

import android.util.Half;
import androidx.annotation.RequiresApi;

/* loaded from: classes2.dex */
public final class HalfKt {
    @RequiresApi(26)
    public static final Half toHalf(short s10) {
        return Half.valueOf(s10);
    }

    @RequiresApi(26)
    public static final Half toHalf(float f10) {
        return Half.valueOf(f10);
    }

    @RequiresApi(26)
    public static final Half toHalf(String str) {
        return Half.valueOf(str);
    }

    @RequiresApi(26)
    public static final Half toHalf(double d10) {
        return Half.valueOf((float) d10);
    }
}
