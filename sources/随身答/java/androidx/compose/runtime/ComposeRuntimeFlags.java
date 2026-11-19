package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmField;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002¨\u0006\u0006"}, m13413d2 = {"Landroidx/compose/runtime/ComposeRuntimeFlags;", "", "()V", "isMovingNestedMovableContentEnabled", "", "isMovingNestedMovableContentEnabled$annotations", "runtime_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@ExperimentalComposeApi
/* loaded from: classes2.dex */
public final class ComposeRuntimeFlags {
    public static final ComposeRuntimeFlags INSTANCE = new ComposeRuntimeFlags();

    @JvmField
    public static boolean isMovingNestedMovableContentEnabled = true;
    public static final int $stable = 8;

    private ComposeRuntimeFlags() {
    }

    public static /* synthetic */ void isMovingNestedMovableContentEnabled$annotations() {
    }
}
