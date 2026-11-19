package androidx.compose.foundation.interaction;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;

/* loaded from: classes.dex */
public interface PressInteraction extends Interaction {

    @StabilityInferred(parameters = 1)
    public static final class Cancel implements PressInteraction {
        public static final int $stable = 0;
        private final Press press;

        public Cancel(Press press) {
            this.press = press;
        }

        public final Press getPress() {
            return this.press;
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class Press implements PressInteraction {
        public static final int $stable = 0;
        private final long pressPosition;

        public /* synthetic */ Press(long j10, AbstractC9972n abstractC9972n) {
            this(j10);
        }

        /* renamed from: getPressPosition-F1C5BW0, reason: not valid java name */
        public final long m27280getPressPositionF1C5BW0() {
            return this.pressPosition;
        }

        private Press(long j10) {
            this.pressPosition = j10;
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class Release implements PressInteraction {
        public static final int $stable = 0;
        private final Press press;

        public Release(Press press) {
            this.press = press;
        }

        public final Press getPress() {
            return this.press;
        }
    }
}
