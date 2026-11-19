package androidx.compose.foundation.gestures;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;

/* loaded from: classes.dex */
abstract class TransformEvent {

    @StabilityInferred(parameters = 1)
    public static final class TransformDelta extends TransformEvent {
        public static final int $stable = 0;
        private final long panChange;
        private final float rotationChange;
        private final float zoomChange;

        public /* synthetic */ TransformDelta(float f10, long j10, float f11, AbstractC9126n abstractC9126n) {
            this(f10, j10, f11);
        }

        /* renamed from: getPanChange-F1C5BW0, reason: not valid java name */
        public final long m20655getPanChangeF1C5BW0() {
            return this.panChange;
        }

        public final float getRotationChange() {
            return this.rotationChange;
        }

        public final float getZoomChange() {
            return this.zoomChange;
        }

        private TransformDelta(float f10, long j10, float f11) {
            super(null);
            this.zoomChange = f10;
            this.panChange = j10;
            this.rotationChange = f11;
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class TransformStarted extends TransformEvent {
        public static final int $stable = 0;
        public static final TransformStarted INSTANCE = new TransformStarted();

        private TransformStarted() {
            super(null);
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class TransformStopped extends TransformEvent {
        public static final int $stable = 0;
        public static final TransformStopped INSTANCE = new TransformStopped();

        private TransformStopped() {
            super(null);
        }
    }

    public /* synthetic */ TransformEvent(AbstractC9126n abstractC9126n) {
        this();
    }

    private TransformEvent() {
    }
}
