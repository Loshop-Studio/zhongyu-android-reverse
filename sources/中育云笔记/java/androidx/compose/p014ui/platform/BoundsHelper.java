package androidx.compose.p014ui.platform;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;

/* loaded from: classes2.dex */
interface BoundsHelper {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final BoundsHelper getInstance() {
            int i10 = Build.VERSION.SDK_INT;
            return i10 >= 30 ? BoundsHelperApi30Impl.INSTANCE : i10 >= 29 ? BoundsHelperApi29Impl.INSTANCE : i10 >= 28 ? BoundsHelperApi28Impl.INSTANCE : BoundsHelperApi24Impl.INSTANCE;
        }
    }

    Rect currentWindowBounds(Activity activity);
}
