package androidx.compose.p014ui.focus;

import androidx.compose.p014ui.ExperimentalComposeUiApi;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.layout.PinnableContainer;
import androidx.compose.p014ui.layout.PinnableContainerKt;
import androidx.compose.p014ui.node.CompositionLocalConsumerModifierNodeKt;
import p181hd.InterfaceC9529a;
import p309qc.InterfaceC10770a;

/* loaded from: classes2.dex */
public final class FocusRestorerKt {
    private static final String PrevFocusedChild = "previouslyFocusedChildHash";

    public static final Modifier focusRestorer(Modifier modifier, FocusRequester focusRequester) {
        return modifier.then(new FocusRestorerElement(focusRequester));
    }

    public static /* synthetic */ Modifier focusRestorer$default(Modifier modifier, FocusRequester focusRequester, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            focusRequester = FocusRequester.Companion.getDefault();
        }
        return focusRestorer(modifier, focusRequester);
    }

    public static final PinnableContainer.PinnedHandle pinFocusedChild(FocusTargetNode focusTargetNode) {
        PinnableContainer pinnableContainer;
        FocusTargetNode focusTargetNodeFindActiveFocusNode = FocusTraversalKt.findActiveFocusNode(focusTargetNode);
        if (focusTargetNodeFindActiveFocusNode == null || (pinnableContainer = (PinnableContainer) CompositionLocalConsumerModifierNodeKt.currentValueOf(focusTargetNodeFindActiveFocusNode, PinnableContainerKt.getLocalPinnableContainer())) == null) {
            return null;
        }
        return pinnableContainer.pin();
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0060, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean restoreFocusedChild(androidx.compose.p014ui.focus.FocusTargetNode r11) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.focus.FocusRestorerKt.restoreFocusedChild(androidx.compose.ui.focus.FocusTargetNode):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0040, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean saveFocusedChild(final androidx.compose.p014ui.focus.FocusTargetNode r11) {
        /*
            androidx.compose.ui.focus.FocusStateImpl r0 = r11.getFocusState()
            boolean r0 = r0.getHasFocus()
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            r0 = 1024(0x400, float:1.435E-42)
            int r0 = androidx.compose.p014ui.node.NodeKind.m32510constructorimpl(r0)
            androidx.compose.ui.Modifier$Node r2 = r11.getNode()
            boolean r2 = r2.isAttached()
            if (r2 != 0) goto L22
            java.lang.String r2 = "visitChildren called on an unattached node"
            androidx.compose.p014ui.internal.InlineClassHelperKt.throwIllegalStateException(r2)
        L22:
            androidx.compose.runtime.collection.MutableVector r2 = new androidx.compose.runtime.collection.MutableVector
            r3 = 16
            androidx.compose.ui.Modifier$Node[] r4 = new androidx.compose.ui.Modifier.Node[r3]
            r2.<init>(r4, r1)
            androidx.compose.ui.Modifier$Node r4 = r11.getNode()
            androidx.compose.ui.Modifier$Node r4 = r4.getChild$ui_release()
            if (r4 != 0) goto L3d
            androidx.compose.ui.Modifier$Node r4 = r11.getNode()
            androidx.compose.p014ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r2, r4, r1)
            goto L40
        L3d:
            r2.add(r4)
        L40:
            int r4 = r2.getSize()
            if (r4 == 0) goto Le4
            int r4 = r2.getSize()
            r5 = 1
            int r4 = r4 - r5
            java.lang.Object r4 = r2.removeAt(r4)
            androidx.compose.ui.Modifier$Node r4 = (androidx.compose.ui.Modifier.Node) r4
            int r6 = r4.getAggregateChildKindSet$ui_release()
            r6 = r6 & r0
            if (r6 != 0) goto L5d
            androidx.compose.p014ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r2, r4, r1)
            goto L40
        L5d:
            if (r4 == 0) goto L40
            int r6 = r4.getKindSet$ui_release()
            r6 = r6 & r0
            if (r6 == 0) goto Lde
            r6 = 0
            r7 = r6
        L68:
            if (r4 == 0) goto L40
            boolean r8 = r4 instanceof androidx.compose.p014ui.focus.FocusTargetNode
            if (r8 == 0) goto L9d
            androidx.compose.ui.focus.FocusTargetNode r4 = (androidx.compose.p014ui.focus.FocusTargetNode) r4
            androidx.compose.ui.focus.FocusStateImpl r8 = r4.getFocusState()
            boolean r8 = r8.getHasFocus()
            if (r8 == 0) goto Ld9
            androidx.compose.ui.node.LayoutNode r0 = androidx.compose.p014ui.node.DelegatableNodeKt.requireLayoutNode(r4)
            int r0 = r0.getCompositeKeyHash()
            r11.setPreviouslyFocusedChildHash(r0)
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.runtime.saveable.SaveableStateRegistryKt.getLocalSaveableStateRegistry()
            java.lang.Object r0 = androidx.compose.p014ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(r11, r0)
            androidx.compose.runtime.saveable.SaveableStateRegistry r0 = (androidx.compose.runtime.saveable.SaveableStateRegistry) r0
            if (r0 == 0) goto L9c
            androidx.compose.ui.focus.FocusRestorerKt$saveFocusedChild$1$1 r1 = new androidx.compose.ui.focus.FocusRestorerKt$saveFocusedChild$1$1
            r1.<init>()
            java.lang.String r11 = "previouslyFocusedChildHash"
            r0.registerProvider(r11, r1)
        L9c:
            return r5
        L9d:
            int r8 = r4.getKindSet$ui_release()
            r8 = r8 & r0
            if (r8 == 0) goto Ld9
            boolean r8 = r4 instanceof androidx.compose.p014ui.node.DelegatingNode
            if (r8 == 0) goto Ld9
            r8 = r4
            androidx.compose.ui.node.DelegatingNode r8 = (androidx.compose.p014ui.node.DelegatingNode) r8
            androidx.compose.ui.Modifier$Node r8 = r8.getDelegate$ui_release()
            r9 = r1
        Lb0:
            if (r8 == 0) goto Ld6
            int r10 = r8.getKindSet$ui_release()
            r10 = r10 & r0
            if (r10 == 0) goto Ld1
            int r9 = r9 + 1
            if (r9 != r5) goto Lbf
            r4 = r8
            goto Ld1
        Lbf:
            if (r7 != 0) goto Lc8
            androidx.compose.runtime.collection.MutableVector r7 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r10 = new androidx.compose.ui.Modifier.Node[r3]
            r7.<init>(r10, r1)
        Lc8:
            if (r4 == 0) goto Lce
            r7.add(r4)
            r4 = r6
        Lce:
            r7.add(r8)
        Ld1:
            androidx.compose.ui.Modifier$Node r8 = r8.getChild$ui_release()
            goto Lb0
        Ld6:
            if (r9 != r5) goto Ld9
            goto L68
        Ld9:
            androidx.compose.ui.Modifier$Node r4 = androidx.compose.p014ui.node.DelegatableNodeKt.access$pop(r7)
            goto L68
        Lde:
            androidx.compose.ui.Modifier$Node r4 = r4.getChild$ui_release()
            goto L5d
        Le4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.focus.FocusRestorerKt.saveFocusedChild(androidx.compose.ui.focus.FocusTargetNode):boolean");
    }

    @InterfaceC10770a
    @ExperimentalComposeUiApi
    public static final Modifier focusRestorer(Modifier modifier, InterfaceC9529a interfaceC9529a) {
        FocusRequester focusRequester;
        if (interfaceC9529a == null || (focusRequester = (FocusRequester) interfaceC9529a.invoke()) == null) {
            focusRequester = FocusRequester.Companion.getDefault();
        }
        return focusRestorer(modifier, focusRequester);
    }
}
