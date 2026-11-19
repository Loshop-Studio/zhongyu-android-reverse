package androidx.compose.foundation.gestures;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public abstract class DragEvent {
    public static final int $stable = 0;

    @StabilityInferred(parameters = 1)
    public static final class DragCancelled extends DragEvent {
        public static final int $stable = 0;
        public static final DragCancelled INSTANCE = new DragCancelled();

        private DragCancelled() {
            super(null);
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class DragDelta extends DragEvent {
        public static final int $stable = 0;
        private final long delta;

        public /* synthetic */ DragDelta(long j10, AbstractC9126n abstractC9126n) {
            this(j10);
        }

        /* renamed from: getDelta-F1C5BW0, reason: not valid java name */
        public final long m20535getDeltaF1C5BW0() {
            return this.delta;
        }

        private DragDelta(long j10) {
            super(null);
            this.delta = j10;
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class DragStarted extends DragEvent {
        public static final int $stable = 0;
        private final long startPoint;

        public /* synthetic */ DragStarted(long j10, AbstractC9126n abstractC9126n) {
            this(j10);
        }

        /* renamed from: getStartPoint-F1C5BW0, reason: not valid java name */
        public final long m20536getStartPointF1C5BW0() {
            return this.startPoint;
        }

        private DragStarted(long j10) {
            super(null);
            this.startPoint = j10;
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class DragStopped extends DragEvent {
        public static final int $stable = 0;
        private final long velocity;

        public /* synthetic */ DragStopped(long j10, AbstractC9126n abstractC9126n) {
            this(j10);
        }

        /* renamed from: getVelocity-9UxMQ8M, reason: not valid java name */
        public final long m20537getVelocity9UxMQ8M() {
            return this.velocity;
        }

        private DragStopped(long j10) {
            super(null);
            this.velocity = j10;
        }
    }

    public /* synthetic */ DragEvent(AbstractC9126n abstractC9126n) {
        this();
    }

    private DragEvent() {
    }
}
