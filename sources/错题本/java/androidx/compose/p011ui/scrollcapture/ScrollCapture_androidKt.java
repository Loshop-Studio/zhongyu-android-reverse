package androidx.compose.p011ui.scrollcapture;

import androidx.autofill.HintConstants;
import androidx.compose.material3.AbstractC1923c;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinatesKt;
import androidx.compose.p011ui.node.NodeCoordinator;
import androidx.compose.p011ui.platform.SemanticsUtils_androidKt;
import androidx.compose.p011ui.semantics.ScrollAxisRange;
import androidx.compose.p011ui.semantics.SemanticsActions;
import androidx.compose.p011ui.semantics.SemanticsConfigurationKt;
import androidx.compose.p011ui.semantics.SemanticsNode;
import androidx.compose.p011ui.semantics.SemanticsProperties;
import androidx.compose.p011ui.unit.IntRect;
import androidx.compose.p011ui.unit.IntRectKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\u001a5\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002¢\u0006\u0004\b\b\u0010\t\u001a(\u0010\f\u001a\u00020\u0006*\u00020\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\u0004H\u0082\b¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00000\u000e*\u00020\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\"E\u0010\u001a\u001a/\b\u0001\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u0011*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\"\u0018\u0010\u001d\u001a\u00020\n*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m5110d2 = {"Landroidx/compose/ui/semantics/SemanticsNode;", "fromNode", "", "depth", "Lkotlin/Function1;", "Landroidx/compose/ui/scrollcapture/ScrollCaptureCandidate;", "Ld6/s;", "onCandidate", "visitScrollCaptureCandidates", "(Landroidx/compose/ui/semantics/SemanticsNode;ILr6/c;)V", "", "onNode", "visitDescendants", "(Landroidx/compose/ui/semantics/SemanticsNode;Lr6/c;)V", "", "getChildrenForSearch", "(Landroidx/compose/ui/semantics/SemanticsNode;)Ljava/util/List;", "Lkotlin/Function2;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, TypedValues.CycleType.S_WAVE_OFFSET, "Lh6/c;", "", "getScrollCaptureScrollByAction", "(Landroidx/compose/ui/semantics/SemanticsNode;)Lr6/e;", "scrollCaptureScrollByAction", "getCanScrollVertically", "(Landroidx/compose/ui/semantics/SemanticsNode;)Z", "canScrollVertically", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nScrollCapture.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollCapture.android.kt\nandroidx/compose/ui/scrollcapture/ScrollCapture_androidKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,237:1\n203#1:238\n204#1:242\n205#1:244\n206#1:246\n207#1:248\n208#1,5:256\n1101#2:239\n1083#2,2:240\n1101#2:261\n1083#2,2:262\n136#3:243\n519#3:245\n44#3:247\n136#3:264\n519#3:265\n44#3:266\n136#3:267\n76#4,7:249\n*S KotlinDebug\n*F\n+ 1 ScrollCapture.android.kt\nandroidx/compose/ui/scrollcapture/ScrollCapture_androidKt\n*L\n133#1:238\n133#1:242\n133#1:244\n133#1:246\n133#1:248\n133#1:256,5\n133#1:239\n133#1:240,2\n203#1:261\n203#1:262,2\n133#1:243\n133#1:245\n133#1:247\n204#1:264\n205#1:265\n206#1:266\n209#1:267\n143#1:249,7\n*E\n"})
/* loaded from: classes2.dex */
public final class ScrollCapture_androidKt {
    private static final boolean getCanScrollVertically(SemanticsNode semanticsNode) {
        InterfaceC6473e scrollCaptureScrollByAction = getScrollCaptureScrollByAction(semanticsNode);
        ScrollAxisRange scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getVerticalScrollAxisRange());
        return (scrollCaptureScrollByAction == null || scrollAxisRange == null || ((Number) scrollAxisRange.getMaxValue().invoke()).floatValue() <= 0.0f) ? false : true;
    }

    private static final List<SemanticsNode> getChildrenForSearch(SemanticsNode semanticsNode) {
        return semanticsNode.getChildren$ui_release(false, false, false);
    }

    @Nullable
    public static final InterfaceC6473e getScrollCaptureScrollByAction(@NotNull SemanticsNode semanticsNode) {
        return (InterfaceC6473e) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getScrollByOffset());
    }

    private static final void visitDescendants(SemanticsNode semanticsNode, InterfaceC6471c interfaceC6471c) {
        MutableVector mutableVector = new MutableVector(new SemanticsNode[16], 0);
        mutableVector.addAll(mutableVector.getSize(), (List) getChildrenForSearch(semanticsNode));
        while (mutableVector.getSize() != 0) {
            SemanticsNode semanticsNode2 = (SemanticsNode) AbstractC1923c.m1046j(mutableVector, 1);
            if (((Boolean) interfaceC6471c.invoke(semanticsNode2)).booleanValue()) {
                mutableVector.addAll(mutableVector.getSize(), (List) getChildrenForSearch(semanticsNode2));
            }
        }
    }

    private static final void visitScrollCaptureCandidates(SemanticsNode semanticsNode, int i, InterfaceC6471c interfaceC6471c) {
        SemanticsNode semanticsNode2;
        MutableVector mutableVector = new MutableVector(new SemanticsNode[16], 0);
        List<SemanticsNode> childrenForSearch = getChildrenForSearch(semanticsNode);
        while (true) {
            mutableVector.addAll(mutableVector.getSize(), (List) childrenForSearch);
            while (mutableVector.getSize() != 0) {
                semanticsNode2 = (SemanticsNode) AbstractC1923c.m1046j(mutableVector, 1);
                if (!SemanticsUtils_androidKt.isHidden(semanticsNode2) && !semanticsNode2.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getDisabled())) {
                    NodeCoordinator nodeCoordinatorFindCoordinatorToGetBounds$ui_release = semanticsNode2.findCoordinatorToGetBounds$ui_release();
                    if (nodeCoordinatorFindCoordinatorToGetBounds$ui_release == null) {
                        throw AbstractC1923c.m1053q("Expected semantics node to have a coordinator.");
                    }
                    LayoutCoordinates coordinates = nodeCoordinatorFindCoordinatorToGetBounds$ui_release.getCoordinates();
                    IntRect intRectRoundToIntRect = IntRectKt.roundToIntRect(LayoutCoordinatesKt.boundsInWindow(coordinates));
                    if (intRectRoundToIntRect.isEmpty()) {
                        continue;
                    } else {
                        if (!getCanScrollVertically(semanticsNode2)) {
                            break;
                        }
                        int i8 = 1 + i;
                        interfaceC6471c.invoke(new ScrollCaptureCandidate(semanticsNode2, i8, intRectRoundToIntRect, coordinates));
                        visitScrollCaptureCandidates(semanticsNode2, i8, interfaceC6471c);
                    }
                }
            }
            return;
            childrenForSearch = getChildrenForSearch(semanticsNode2);
        }
    }

    public static /* synthetic */ void visitScrollCaptureCandidates$default(SemanticsNode semanticsNode, int i, InterfaceC6471c interfaceC6471c, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i = 0;
        }
        visitScrollCaptureCandidates(semanticsNode, i, interfaceC6471c);
    }
}
