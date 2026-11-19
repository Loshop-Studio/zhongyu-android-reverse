package androidx.compose.foundation.layout;

import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9126n;

/* loaded from: classes.dex */
final class FillElement extends ModifierNodeElement<FillNode> {
    public static final Companion Companion = new Companion(null);
    private final Direction direction;
    private final float fraction;
    private final String inspectorName;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        @Stable
        public final FillElement height(float f10) {
            return new FillElement(Direction.Vertical, f10, "fillMaxHeight");
        }

        @Stable
        public final FillElement size(float f10) {
            return new FillElement(Direction.Both, f10, "fillMaxSize");
        }

        @Stable
        public final FillElement width(float f10) {
            return new FillElement(Direction.Horizontal, f10, "fillMaxWidth");
        }

        private Companion() {
        }
    }

    public FillElement(Direction direction, float f10, String str) {
        this.direction = direction;
        this.fraction = f10;
        this.inspectorName = str;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        return this.direction == fillElement.direction && this.fraction == fillElement.fraction;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        return (this.direction.hashCode() * 31) + Float.hashCode(this.fraction);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName(this.inspectorName);
        inspectorInfo.getProperties().set("fraction", Float.valueOf(this.fraction));
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public FillNode create() {
        return new FillNode(this.direction, this.fraction);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(FillNode fillNode) {
        fillNode.setDirection(this.direction);
        fillNode.setFraction(this.fraction);
    }
}
