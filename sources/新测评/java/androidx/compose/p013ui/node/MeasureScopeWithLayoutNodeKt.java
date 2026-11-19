package androidx.compose.p013ui.node;

import androidx.compose.p013ui.layout.IntrinsicMeasureScope;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.node.LayoutNode;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0002¨\u0006\b"}, m13558d2 = {"getChildrenOfVirtualChildren", "", "Landroidx/compose/ui/layout/Measurable;", "scope", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "isInLookaheadPass", "", "Landroidx/compose/ui/node/LayoutNode;", "ui_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nMeasureScopeWithLayoutNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasureScopeWithLayoutNode.kt\nandroidx/compose/ui/node/MeasureScopeWithLayoutNodeKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,49:1\n150#2,3:50\n34#2,6:53\n153#2:59\n1#3:60\n*S KotlinDebug\n*F\n+ 1 MeasureScopeWithLayoutNode.kt\nandroidx/compose/ui/node/MeasureScopeWithLayoutNodeKt\n*L\n32#1:50,3\n32#1:53,6\n32#1:59\n*E\n"})
/* loaded from: classes2.dex */
public final class MeasureScopeWithLayoutNodeKt {

    @Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            try {
                iArr[LayoutNode.LayoutState.LookaheadMeasuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutNode.LayoutState.LookaheadLayingOut.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LayoutNode.LayoutState.Idle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final List<List<Measurable>> getChildrenOfVirtualChildren(IntrinsicMeasureScope intrinsicMeasureScope) {
        Intrinsics.checkNotNull(intrinsicMeasureScope, "null cannot be cast to non-null type androidx.compose.ui.node.MeasureScopeWithLayoutNode");
        LayoutNode layoutNode = ((MeasureScopeWithLayoutNode) intrinsicMeasureScope).getLayoutNode();
        boolean zIsInLookaheadPass = isInLookaheadPass(layoutNode);
        List<LayoutNode> foldedChildren$ui_release = layoutNode.getFoldedChildren$ui_release();
        ArrayList arrayList = new ArrayList(foldedChildren$ui_release.size());
        int size = foldedChildren$ui_release.size();
        for (int i10 = 0; i10 < size; i10++) {
            LayoutNode layoutNode2 = foldedChildren$ui_release.get(i10);
            arrayList.add(zIsInLookaheadPass ? layoutNode2.getChildLookaheadMeasurables$ui_release() : layoutNode2.getChildMeasurables$ui_release());
        }
        return arrayList;
    }

    private static final boolean isInLookaheadPass(LayoutNode layoutNode) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        if (i10 == 3 || i10 == 4) {
            return false;
        }
        if (i10 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        if (parent$ui_release != null) {
            return isInLookaheadPass(parent$ui_release);
        }
        throw new IllegalArgumentException("no parent for idle node");
    }
}
