package androidx.compose.p013ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9126n;

@Immutable
/* loaded from: classes2.dex */
public class ColorFilter {
    public static final Companion Companion = new Companion(null);
    private final android.graphics.ColorFilter nativeColorFilter;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: tint-xETnrds$default, reason: not valid java name */
        public static /* synthetic */ ColorFilter m24317tintxETnrds$default(Companion companion, long j10, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                i10 = BlendMode.Companion.m24216getSrcIn0nO6VwU();
            }
            return companion.m24320tintxETnrds(j10, i10);
        }

        @Stable
        /* renamed from: colorMatrix-jHG-Opc, reason: not valid java name */
        public final ColorFilter m24318colorMatrixjHGOpc(float[] fArr) {
            return new ColorMatrixColorFilter(fArr, (AbstractC9126n) null);
        }

        @Stable
        /* renamed from: lighting--OWjLjI, reason: not valid java name */
        public final ColorFilter m24319lightingOWjLjI(long j10, long j11) {
            return new LightingColorFilter(j10, j11, (AbstractC9126n) null);
        }

        @Stable
        /* renamed from: tint-xETnrds, reason: not valid java name */
        public final ColorFilter m24320tintxETnrds(long j10, int i10) {
            return new BlendModeColorFilter(j10, i10, (AbstractC9126n) null);
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
