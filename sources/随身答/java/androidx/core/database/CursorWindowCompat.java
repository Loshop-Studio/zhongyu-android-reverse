package androidx.core.database;

import android.database.CursorWindow;
import android.os.Build;
import androidx.annotation.RequiresApi;

/* loaded from: classes2.dex */
public final class CursorWindowCompat {

    @RequiresApi(28)
    public static class Api28Impl {
        private Api28Impl() {
        }

        public static CursorWindow createCursorWindow(String str, long j9) {
            return new CursorWindow(str, j9);
        }
    }

    private CursorWindowCompat() {
    }

    public static CursorWindow create(String str, long j9) {
        return Build.VERSION.SDK_INT >= 28 ? Api28Impl.createCursorWindow(str, j9) : new CursorWindow(str);
    }
}
