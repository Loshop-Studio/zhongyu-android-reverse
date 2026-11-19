package androidx.compose.foundation.interaction;

import androidx.compose.runtime.internal.StabilityInferred;

/* loaded from: classes.dex */
public interface HoverInteraction extends Interaction {

    @StabilityInferred(parameters = 1)
    public static final class Enter implements HoverInteraction {
        public static final int $stable = 0;
    }

    @StabilityInferred(parameters = 1)
    public static final class Exit implements HoverInteraction {
        public static final int $stable = 0;
        private final Enter enter;

        public Exit(Enter enter) {
            this.enter = enter;
        }

        public final Enter getEnter() {
            return this.enter;
        }
    }
}
