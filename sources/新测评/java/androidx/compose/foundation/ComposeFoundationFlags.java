package androidx.compose.foundation;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.JvmField;

@StabilityInferred(parameters = 0)
@ExperimentalFoundationApi
@Metadata(m13557d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u0018\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0002R\u0018\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0002¨\u0006\n"}, m13558d2 = {"Landroidx/compose/foundation/ComposeFoundationFlags;", "", "()V", "DragGesturePickUpEnabled", "", "getDragGesturePickUpEnabled$annotations", "NewNestedFlingPropagationEnabled", "getNewNestedFlingPropagationEnabled$annotations", "isDetectTapGesturesImmediateCoroutineDispatchEnabled", "isDetectTapGesturesImmediateCoroutineDispatchEnabled$annotations", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes.dex */
public final class ComposeFoundationFlags {
    public static final ComposeFoundationFlags INSTANCE = new ComposeFoundationFlags();

    @JvmField
    public static boolean NewNestedFlingPropagationEnabled = true;

    @JvmField
    public static boolean DragGesturePickUpEnabled = true;

    @JvmField
    public static boolean isDetectTapGesturesImmediateCoroutineDispatchEnabled = true;
    public static final int $stable = 8;

    private ComposeFoundationFlags() {
    }

    public static /* synthetic */ void getDragGesturePickUpEnabled$annotations() {
    }

    public static /* synthetic */ void getNewNestedFlingPropagationEnabled$annotations() {
    }

    public static /* synthetic */ void isDetectTapGesturesImmediateCoroutineDispatchEnabled$annotations() {
    }
}
