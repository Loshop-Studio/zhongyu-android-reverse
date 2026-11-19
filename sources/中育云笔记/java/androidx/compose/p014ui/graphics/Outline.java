package androidx.compose.p014ui.graphics;

import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.geometry.RoundRect;
import androidx.compose.p014ui.geometry.RoundRectKt;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
public abstract class Outline {

    public static final class Generic extends Outline {
        private final Path path;

        public Generic(Path path) {
            super(null);
            this.path = path;
        }

        @Override // androidx.compose.p014ui.graphics.Outline
        public Rect getBounds() {
            return this.path.getBounds();
        }

        public final Path getPath() {
            return this.path;
        }
    }

    @Immutable
    public static final class Rectangle extends Outline {
        private final Rect rect;

        public Rectangle(Rect rect) {
            super(null);
            this.rect = rect;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Rectangle) && AbstractC9979u.m20289b(this.rect, ((Rectangle) obj).rect);
        }

        @Override // androidx.compose.p014ui.graphics.Outline
        public Rect getBounds() {
            return this.rect;
        }

        public final Rect getRect() {
            return this.rect;
        }

        public int hashCode() {
            return this.rect.hashCode();
        }
    }

    @Immutable
    public static final class Rounded extends Outline {
        private final RoundRect roundRect;
        private final Path roundRectPath;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Rounded(RoundRect roundRect) {
            super(0 == true ? 1 : 0);
            Path path = null;
            this.roundRect = roundRect;
            if (!RoundRectKt.isSimple(roundRect)) {
                Path Path = AndroidPath_androidKt.Path();
                Path.addRoundRect$default(Path, roundRect, null, 2, null);
                path = Path;
            }
            this.roundRectPath = path;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Rounded) && AbstractC9979u.m20289b(this.roundRect, ((Rounded) obj).roundRect);
        }

        @Override // androidx.compose.p014ui.graphics.Outline
        public Rect getBounds() {
            return RoundRectKt.getBoundingRect(this.roundRect);
        }

        public final RoundRect getRoundRect() {
            return this.roundRect;
        }

        public final Path getRoundRectPath$ui_graphics_release() {
            return this.roundRectPath;
        }

        public int hashCode() {
            return this.roundRect.hashCode();
        }
    }

    public /* synthetic */ Outline(AbstractC9972n abstractC9972n) {
        this();
    }

    public abstract Rect getBounds();

    private Outline() {
    }
}
