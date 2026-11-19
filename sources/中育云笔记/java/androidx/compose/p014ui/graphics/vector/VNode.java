package androidx.compose.p014ui.graphics.vector;

import androidx.compose.p014ui.graphics.drawscope.DrawScope;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9540l;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public abstract class VNode {
    public static final int $stable = 8;
    private InterfaceC9540l invalidateListener;

    public /* synthetic */ VNode(AbstractC9972n abstractC9972n) {
        this();
    }

    public abstract void draw(DrawScope drawScope);

    public InterfaceC9540l getInvalidateListener$ui_release() {
        return this.invalidateListener;
    }

    public final void invalidate() {
        InterfaceC9540l invalidateListener$ui_release = getInvalidateListener$ui_release();
        if (invalidateListener$ui_release != null) {
            invalidateListener$ui_release.invoke(this);
        }
    }

    public void setInvalidateListener$ui_release(InterfaceC9540l interfaceC9540l) {
        this.invalidateListener = interfaceC9540l;
    }

    private VNode() {
    }
}
