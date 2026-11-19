package androidx.compose.p013ui.graphics.vector;

import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public abstract class VNode {
    public static final int $stable = 8;
    private InterfaceC10570l invalidateListener;

    public /* synthetic */ VNode(AbstractC9126n abstractC9126n) {
        this();
    }

    public abstract void draw(DrawScope drawScope);

    public InterfaceC10570l getInvalidateListener$ui_release() {
        return this.invalidateListener;
    }

    public final void invalidate() {
        InterfaceC10570l invalidateListener$ui_release = getInvalidateListener$ui_release();
        if (invalidateListener$ui_release != null) {
            invalidateListener$ui_release.invoke(this);
        }
    }

    public void setInvalidateListener$ui_release(InterfaceC10570l interfaceC10570l) {
        this.invalidateListener = interfaceC10570l;
    }

    private VNode() {
    }
}
