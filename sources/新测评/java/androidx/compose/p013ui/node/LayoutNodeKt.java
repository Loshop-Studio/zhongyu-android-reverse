package androidx.compose.p013ui.node;

import androidx.compose.p013ui.internal.InlineClassHelperKt;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.DensityKt;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\f\u0010\b\u001a\u00020\t*\u00020\u0006H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m13558d2 = {"DebugChanges", "", "DefaultDensity", "Landroidx/compose/ui/unit/Density;", "add", "", "Landroidx/compose/ui/node/LayoutNode;", "child", "requireOwner", "Landroidx/compose/ui/node/Owner;", "ui_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nLayoutNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNodeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,1533:1\n76#2,7:1534\n*S KotlinDebug\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNodeKt\n*L\n1522#1:1534,7\n*E\n"})
/* loaded from: classes2.dex */
public final class LayoutNodeKt {
    private static final boolean DebugChanges = false;
    private static final Density DefaultDensity = DensityKt.Density$default(1.0f, 0.0f, 2, null);

    public static final void add(LayoutNode layoutNode, LayoutNode layoutNode2) {
        layoutNode.insertAt$ui_release(layoutNode.getChildren$ui_release().size(), layoutNode2);
    }

    public static final Owner requireOwner(LayoutNode layoutNode) {
        Owner owner = layoutNode.getOwner();
        if (owner != null) {
            return owner;
        }
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("LayoutNode should be attached to an owner");
        throw new KotlinNothingValueException();
    }
}
