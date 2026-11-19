package androidx.compose.foundation.text.input.internal.selection;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.text.style.ResolvedTextDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0080\b\u0018\u0000 ,2\u00020\u0001:\u0001,B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0011\u001a\u00020\u0004HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000eJE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000eR\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0013R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010\u0015R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b+\u0010\u000e\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006-"}, m5110d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;", "", "", "visible", "Landroidx/compose/ui/geometry/Offset;", RequestParameters.POSITION, "", "lineHeight", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "direction", "handlesCrossed", "<init>", "(ZJFLandroidx/compose/ui/text/style/ResolvedTextDirection;ZLkotlin/jvm/internal/e;)V", "component1", "()Z", "component2-F1C5BW0", "()J", "component2", "component3", "()F", "component4", "()Landroidx/compose/ui/text/style/ResolvedTextDirection;", "component5", "copy-YqVAtuI", "(ZJFLandroidx/compose/ui/text/style/ResolvedTextDirection;Z)Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getVisible", "J", "getPosition-F1C5BW0", "F", "getLineHeight", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getDirection", "getHandlesCrossed", "Companion", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final /* data */ class TextFieldHandleState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final TextFieldHandleState Hidden = new TextFieldHandleState(false, Offset.INSTANCE.m10456getUnspecifiedF1C5BW0(), 0.0f, ResolvedTextDirection.Ltr, false, null);

    @NotNull
    private final ResolvedTextDirection direction;
    private final boolean handlesCrossed;
    private final float lineHeight;
    private final long position;
    private final boolean visible;

    @Metadata(m5109d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m5110d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState$Companion;", "", "()V", "Hidden", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;", "getHidden", "()Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        @NotNull
        public final TextFieldHandleState getHidden() {
            return TextFieldHandleState.Hidden;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TextFieldHandleState(boolean z8, long j7, float f, ResolvedTextDirection resolvedTextDirection, boolean z9, AbstractC5824e abstractC5824e) {
        this(z8, j7, f, resolvedTextDirection, z9);
    }

    /* renamed from: copy-YqVAtuI$default, reason: not valid java name */
    public static /* synthetic */ TextFieldHandleState m7910copyYqVAtuI$default(TextFieldHandleState textFieldHandleState, boolean z8, long j7, float f, ResolvedTextDirection resolvedTextDirection, boolean z9, int i, Object obj) {
        if ((i & 1) != 0) {
            z8 = textFieldHandleState.visible;
        }
        if ((i & 2) != 0) {
            j7 = textFieldHandleState.position;
        }
        if ((i & 4) != 0) {
            f = textFieldHandleState.lineHeight;
        }
        if ((i & 8) != 0) {
            resolvedTextDirection = textFieldHandleState.direction;
        }
        if ((i & 16) != 0) {
            z9 = textFieldHandleState.handlesCrossed;
        }
        boolean z10 = z9;
        float f7 = f;
        return textFieldHandleState.m7912copyYqVAtuI(z8, j7, f7, resolvedTextDirection, z10);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getVisible() {
        return this.visible;
    }

    /* renamed from: component2-F1C5BW0, reason: not valid java name and from getter */
    public final long getPosition() {
        return this.position;
    }

    /* renamed from: component3, reason: from getter */
    public final float getLineHeight() {
        return this.lineHeight;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ResolvedTextDirection getDirection() {
        return this.direction;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getHandlesCrossed() {
        return this.handlesCrossed;
    }

    @NotNull
    /* renamed from: copy-YqVAtuI, reason: not valid java name */
    public final TextFieldHandleState m7912copyYqVAtuI(boolean visible, long position, float lineHeight, @NotNull ResolvedTextDirection direction, boolean handlesCrossed) {
        return new TextFieldHandleState(visible, position, lineHeight, direction, handlesCrossed, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextFieldHandleState)) {
            return false;
        }
        TextFieldHandleState textFieldHandleState = (TextFieldHandleState) other;
        return this.visible == textFieldHandleState.visible && Offset.m10438equalsimpl0(this.position, textFieldHandleState.position) && Float.compare(this.lineHeight, textFieldHandleState.lineHeight) == 0 && this.direction == textFieldHandleState.direction && this.handlesCrossed == textFieldHandleState.handlesCrossed;
    }

    @NotNull
    public final ResolvedTextDirection getDirection() {
        return this.direction;
    }

    public final boolean getHandlesCrossed() {
        return this.handlesCrossed;
    }

    public final float getLineHeight() {
        return this.lineHeight;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m7913getPositionF1C5BW0() {
        return this.position;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        return Boolean.hashCode(this.handlesCrossed) + ((this.direction.hashCode() + AbstractC0584a.m901b(this.lineHeight, (Offset.m10443hashCodeimpl(this.position) + (Boolean.hashCode(this.visible) * 31)) * 31, 31)) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("TextFieldHandleState(visible=");
        sb.append(this.visible);
        sb.append(", position=");
        sb.append((Object) Offset.m10449toStringimpl(this.position));
        sb.append(", lineHeight=");
        sb.append(this.lineHeight);
        sb.append(", direction=");
        sb.append(this.direction);
        sb.append(", handlesCrossed=");
        return AbstractC0037f.m93r(sb, this.handlesCrossed, ')');
    }

    private TextFieldHandleState(boolean z8, long j7, float f, ResolvedTextDirection resolvedTextDirection, boolean z9) {
        this.visible = z8;
        this.position = j7;
        this.lineHeight = f;
        this.direction = resolvedTextDirection;
        this.handlesCrossed = z9;
    }
}
