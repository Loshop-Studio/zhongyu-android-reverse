package androidx.compose.p011ui.graphics.vector;

import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0013\u0010\u0007\u001a\u00020\u0004*\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bR0\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t8\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u0082\u0001\u0003\u0010\u0011\u0012¨\u0006\u0013"}, m5110d2 = {"Landroidx/compose/ui/graphics/vector/VNode;", "", "<init>", "()V", "Ld6/s;", "invalidate", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "draw", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "Lkotlin/Function1;", "invalidateListener", "Lr6/c;", "getInvalidateListener$ui_release", "()Lr6/c;", "setInvalidateListener$ui_release", "(Lr6/c;)V", "Landroidx/compose/ui/graphics/vector/GroupComponent;", "Landroidx/compose/ui/graphics/vector/PathComponent;", "Landroidx/compose/ui/graphics/vector/VectorComponent;", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public abstract class VNode {
    public static final int $stable = 8;

    @Nullable
    private InterfaceC6471c invalidateListener;

    public /* synthetic */ VNode(AbstractC5824e abstractC5824e) {
        this();
    }

    public abstract void draw(@NotNull DrawScope drawScope);

    @Nullable
    /* renamed from: getInvalidateListener$ui_release, reason: from getter */
    public InterfaceC6471c getInvalidateListener() {
        return this.invalidateListener;
    }

    public final void invalidate() {
        InterfaceC6471c invalidateListener = getInvalidateListener();
        if (invalidateListener != null) {
            invalidateListener.invoke(this);
        }
    }

    public void setInvalidateListener$ui_release(@Nullable InterfaceC6471c interfaceC6471c) {
        this.invalidateListener = interfaceC6471c;
    }

    private VNode() {
    }
}
