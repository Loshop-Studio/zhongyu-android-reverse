package androidx.compose.p006ui.focus;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u0004\u001a\u00020\u0001*\u00020\u0002H\u0007¨\u0006\u0005"}, m5175d2 = {"captureFocus", "", "Landroidx/compose/ui/focus/FocusRequesterModifierNode;", "freeFocus", "requestFocus", "ui_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nFocusRequesterModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusRequesterModifierNode.kt\nandroidx/compose/ui/focus/FocusRequesterModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,92:1\n87#2:93\n87#2:123\n87#2:153\n340#3:94\n206#3,2:95\n208#3,7:100\n215#3,15:108\n340#3:124\n206#3,2:125\n208#3,7:130\n215#3,15:138\n340#3:154\n206#3,2:155\n208#3,7:160\n215#3,15:168\n1182#4:97\n1161#4,2:98\n1182#4:127\n1161#4,2:128\n1182#4:157\n1161#4,2:158\n48#5:107\n48#5:137\n48#5:167\n*S KotlinDebug\n*F\n+ 1 FocusRequesterModifierNode.kt\nandroidx/compose/ui/focus/FocusRequesterModifierNodeKt\n*L\n40#1:93\n63#1:123\n87#1:153\n40#1:94\n40#1:95,2\n40#1:100,7\n40#1:108,15\n63#1:124\n63#1:125,2\n63#1:130,7\n63#1:138,15\n87#1:154\n87#1:155,2\n87#1:160,7\n87#1:168,15\n40#1:97\n40#1:98,2\n63#1:127\n63#1:128,2\n87#1:157\n87#1:158,2\n40#1:107\n63#1:137\n87#1:167\n*E\n"})
/* loaded from: classes.dex */
public final class FocusRequesterModifierNodeKt {
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0034, code lost:
    
        continue;
     */
    @androidx.compose.p006ui.ExperimentalComposeUiApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean captureFocus(androidx.compose.p006ui.focus.FocusRequesterModifierNode r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 1024(0x400, float:1.435E-42)
            int r0 = androidx.compose.p006ui.node.NodeKind.m10773constructorimpl(r0)
            androidx.compose.ui.Modifier$Node r1 = r5.getNode()
            boolean r1 = r1.getIsAttached()
            if (r1 == 0) goto L6d
            androidx.compose.runtime.collection.MutableVector r1 = new androidx.compose.runtime.collection.MutableVector
            r2 = 16
            androidx.compose.ui.Modifier$Node[] r2 = new androidx.compose.ui.Modifier.Node[r2]
            r3 = 0
            r1.<init>(r2, r3)
            androidx.compose.ui.Modifier$Node r2 = r5.getNode()
            androidx.compose.ui.Modifier$Node r2 = r2.getChild()
            if (r2 != 0) goto L31
            androidx.compose.ui.Modifier$Node r5 = r5.getNode()
            androidx.compose.p006ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r1, r5)
            goto L34
        L31:
            r1.add(r2)
        L34:
            boolean r5 = r1.isNotEmpty()
            if (r5 == 0) goto L6c
            int r5 = r1.getSize()
            r2 = 1
            int r5 = r5 - r2
            java.lang.Object r5 = r1.removeAt(r5)
            androidx.compose.ui.Modifier$Node r5 = (androidx.compose.ui.Modifier.Node) r5
            int r4 = r5.getAggregateChildKindSet()
            r4 = r4 & r0
            if (r4 != 0) goto L51
            androidx.compose.p006ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r1, r5)
            goto L34
        L51:
            if (r5 == 0) goto L34
            int r4 = r5.getKindSet()
            r4 = r4 & r0
            if (r4 == 0) goto L67
            boolean r4 = r5 instanceof androidx.compose.p006ui.focus.FocusTargetModifierNode
            if (r4 == 0) goto L34
            androidx.compose.ui.focus.FocusTargetModifierNode r5 = (androidx.compose.p006ui.focus.FocusTargetModifierNode) r5
            boolean r5 = androidx.compose.p006ui.focus.FocusTransactionsKt.captureFocus(r5)
            if (r5 == 0) goto L34
            return r2
        L67:
            androidx.compose.ui.Modifier$Node r5 = r5.getChild()
            goto L51
        L6c:
            return r3
        L6d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p006ui.focus.FocusRequesterModifierNodeKt.captureFocus(androidx.compose.ui.focus.FocusRequesterModifierNode):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0034, code lost:
    
        continue;
     */
    @androidx.compose.p006ui.ExperimentalComposeUiApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean freeFocus(androidx.compose.p006ui.focus.FocusRequesterModifierNode r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 1024(0x400, float:1.435E-42)
            int r0 = androidx.compose.p006ui.node.NodeKind.m10773constructorimpl(r0)
            androidx.compose.ui.Modifier$Node r1 = r5.getNode()
            boolean r1 = r1.getIsAttached()
            if (r1 == 0) goto L6d
            androidx.compose.runtime.collection.MutableVector r1 = new androidx.compose.runtime.collection.MutableVector
            r2 = 16
            androidx.compose.ui.Modifier$Node[] r2 = new androidx.compose.ui.Modifier.Node[r2]
            r3 = 0
            r1.<init>(r2, r3)
            androidx.compose.ui.Modifier$Node r2 = r5.getNode()
            androidx.compose.ui.Modifier$Node r2 = r2.getChild()
            if (r2 != 0) goto L31
            androidx.compose.ui.Modifier$Node r5 = r5.getNode()
            androidx.compose.p006ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r1, r5)
            goto L34
        L31:
            r1.add(r2)
        L34:
            boolean r5 = r1.isNotEmpty()
            if (r5 == 0) goto L6c
            int r5 = r1.getSize()
            r2 = 1
            int r5 = r5 - r2
            java.lang.Object r5 = r1.removeAt(r5)
            androidx.compose.ui.Modifier$Node r5 = (androidx.compose.ui.Modifier.Node) r5
            int r4 = r5.getAggregateChildKindSet()
            r4 = r4 & r0
            if (r4 != 0) goto L51
            androidx.compose.p006ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r1, r5)
            goto L34
        L51:
            if (r5 == 0) goto L34
            int r4 = r5.getKindSet()
            r4 = r4 & r0
            if (r4 == 0) goto L67
            boolean r4 = r5 instanceof androidx.compose.p006ui.focus.FocusTargetModifierNode
            if (r4 == 0) goto L34
            androidx.compose.ui.focus.FocusTargetModifierNode r5 = (androidx.compose.p006ui.focus.FocusTargetModifierNode) r5
            boolean r5 = androidx.compose.p006ui.focus.FocusTransactionsKt.freeFocus(r5)
            if (r5 == 0) goto L34
            return r2
        L67:
            androidx.compose.ui.Modifier$Node r5 = r5.getChild()
            goto L51
        L6c:
            return r3
        L6d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p006ui.focus.FocusRequesterModifierNodeKt.freeFocus(androidx.compose.ui.focus.FocusRequesterModifierNode):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0034, code lost:
    
        continue;
     */
    @androidx.compose.p006ui.ExperimentalComposeUiApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean requestFocus(androidx.compose.p006ui.focus.FocusRequesterModifierNode r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 1024(0x400, float:1.435E-42)
            int r0 = androidx.compose.p006ui.node.NodeKind.m10773constructorimpl(r0)
            androidx.compose.ui.Modifier$Node r1 = r5.getNode()
            boolean r1 = r1.getIsAttached()
            if (r1 == 0) goto L6d
            androidx.compose.runtime.collection.MutableVector r1 = new androidx.compose.runtime.collection.MutableVector
            r2 = 16
            androidx.compose.ui.Modifier$Node[] r2 = new androidx.compose.ui.Modifier.Node[r2]
            r3 = 0
            r1.<init>(r2, r3)
            androidx.compose.ui.Modifier$Node r2 = r5.getNode()
            androidx.compose.ui.Modifier$Node r2 = r2.getChild()
            if (r2 != 0) goto L31
            androidx.compose.ui.Modifier$Node r5 = r5.getNode()
            androidx.compose.p006ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r1, r5)
            goto L34
        L31:
            r1.add(r2)
        L34:
            boolean r5 = r1.isNotEmpty()
            if (r5 == 0) goto L6c
            int r5 = r1.getSize()
            r2 = 1
            int r5 = r5 - r2
            java.lang.Object r5 = r1.removeAt(r5)
            androidx.compose.ui.Modifier$Node r5 = (androidx.compose.ui.Modifier.Node) r5
            int r4 = r5.getAggregateChildKindSet()
            r4 = r4 & r0
            if (r4 != 0) goto L51
            androidx.compose.p006ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r1, r5)
            goto L34
        L51:
            if (r5 == 0) goto L34
            int r4 = r5.getKindSet()
            r4 = r4 & r0
            if (r4 == 0) goto L67
            boolean r4 = r5 instanceof androidx.compose.p006ui.focus.FocusTargetModifierNode
            if (r4 == 0) goto L34
            androidx.compose.ui.focus.FocusTargetModifierNode r5 = (androidx.compose.p006ui.focus.FocusTargetModifierNode) r5
            boolean r5 = androidx.compose.p006ui.focus.FocusTransactionsKt.requestFocus(r5)
            if (r5 == 0) goto L34
            return r2
        L67:
            androidx.compose.ui.Modifier$Node r5 = r5.getChild()
            goto L51
        L6c:
            return r3
        L6d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p006ui.focus.FocusRequesterModifierNodeKt.requestFocus(androidx.compose.ui.focus.FocusRequesterModifierNode):boolean");
    }
}
