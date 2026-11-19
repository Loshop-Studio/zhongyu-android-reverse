package androidx.compose.p014ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes2.dex */
public class ColorFilter {
    public static final Companion Companion = new Companion(null);
    private final android.graphics.ColorFilter nativeColorFilter;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: tint-xETnrds$default, reason: not valid java name */
        public static /* synthetic */ ColorFilter m30919tintxETnrds$default(Companion companion, long j10, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                i10 = BlendMode.Companion.m30818getSrcIn0nO6VwU();
            }
            return companion.m30922tintxETnrds(j10, i10);
        }

        @Stable
        /* renamed from: colorMatrix-jHG-Opc, reason: not valid java name */
        public final ColorFilter m30920colorMatrixjHGOpc(float[] fArr) {
            return new ColorMatrixColorFilter(fArr, (AbstractC9972n) null);
        }

        @Stable
        /* renamed from: lighting--OWjLjI, reason: not valid java name */
        public final ColorFilter m30921lightingOWjLjI(long j10, long j11) {
            return new LightingColorFilter(j10, j11, (AbstractC9972n) null);
        }

        @Stable
        /* renamed from: tint-xETnrds, reason: not valid java name */
        public final ColorFilter m30922tintxETnrds(long j10, int i10) {
            return new BlendModeColorFilter(j10, i10, (AbstractC9972n) null);
        }

        private Companion() {
        }
    }

    public ColorFilter(android.graphics.ColorFilter colorFilter) {
        this.nativeColorFilter = colorFilter;
    }

    public final android.graphics.ColorFilter getNativeColorFilter$ui_graphics_release() {
        return this.nativeColorFilter;
    }
}
