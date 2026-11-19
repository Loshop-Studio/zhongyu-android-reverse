package androidx.compose.p006ui.node;

import androidx.compose.p006ui.ExperimentalComposeUiApi;
import androidx.compose.p006ui.Modifier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u00020\u0001\"\f\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004*\u0002H\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m5175d2 = {"observeReads", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/ObserverNode;", "block", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier$Node;Lkotlin/jvm/functions/Function0;)V", "ui_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nObserverNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObserverNode.kt\nandroidx/compose/ui/node/ObserverNodeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
/* loaded from: classes.dex */
public final class ObserverNodeKt {
    @ExperimentalComposeUiApi
    public static final <T extends Modifier.Node & ObserverNode> void observeReads(T t3, Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(t3, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        ModifierNodeOwnerScope ownerScope = t3.getOwnerScope();
        if (ownerScope == null) {
            ownerScope = new ModifierNodeOwnerScope(t3);
            t3.setOwnerScope$ui_release(ownerScope);
        }
        DelegatableNodeKt.requireOwner(t3).getSnapshotObserver().observeReads$ui_release(ownerScope, ModifierNodeOwnerScope.INSTANCE.getOnObserveReadsChanged$ui_release(), block);
    }
}
