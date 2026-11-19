package androidx.compose.foundation;

import android.os.Build;
import android.view.View;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.runtime.Stable;

@Stable
/* loaded from: classes.dex */
public interface PlatformMagnifierFactory {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Stable
        public final PlatformMagnifierFactory getForCurrentPlatform() {
            if (Magnifier_androidKt.isPlatformMagnifierSupported$default(0, 1, null)) {
                return Build.VERSION.SDK_INT == 28 ? PlatformMagnifierFactoryApi28Impl.INSTANCE : PlatformMagnifierFactoryApi29Impl.INSTANCE;
            }
            throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
        }
    }

    /* renamed from: create-nHHXs2Y, reason: not valid java name */
    PlatformMagnifier mo27046createnHHXs2Y(View view, boolean z10, long j10, float f10, float f11, boolean z11, Density density, float f12);

    boolean getCanUpdateZoom();
}
