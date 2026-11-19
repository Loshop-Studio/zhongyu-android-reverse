package androidx.compose.p011ui.focus;

import androidx.compose.p011ui.ExperimentalComposeUiApi;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.PinnableContainer;
import androidx.compose.p011ui.layout.PinnableContainerKt;
import androidx.compose.p011ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\u000b\u001a\u00020\b*\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u001a#\u0010\u000b\u001a\u00020\b*\u00020\b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\rH\u0007¢\u0006\u0004\b\u000b\u0010\u000f\"\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m5110d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "", "saveFocusedChild", "(Landroidx/compose/ui/focus/FocusTargetNode;)Z", "restoreFocusedChild", "Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;", "pinFocusedChild", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/focus/FocusRequester;", "fallback", "focusRestorer", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/focus/FocusRequester;)Landroidx/compose/ui/Modifier;", "Lkotlin/Function0;", "onRestoreFailed", "(Landroidx/compose/ui/Modifier;Lr6/a;)Landroidx/compose/ui/Modifier;", "", "PrevFocusedChild", "Ljava/lang/String;", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nFocusRestorer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusRestorer.kt\nandroidx/compose/ui/focus/FocusRestorerKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 8 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,150:1\n119#2:151\n119#2:228\n283#3,5:152\n148#3:157\n149#3:163\n150#3,3:167\n153#3:171\n154#3,9:173\n437#3,6:182\n447#3,2:189\n449#3,17:194\n466#3,8:214\n163#3,6:222\n283#3,5:229\n148#3:234\n149#3:240\n150#3,3:244\n153#3:248\n154#3,9:250\n437#3,6:259\n447#3,2:266\n449#3,17:271\n466#3,8:291\n163#3,6:299\n56#4,5:158\n56#4,5:235\n1101#5:164\n1083#5,2:165\n1101#5:241\n1083#5,2:242\n519#6:170\n44#6:172\n519#6:247\n44#6:249\n246#7:188\n246#7:265\n240#8,3:191\n243#8,3:211\n240#8,3:268\n243#8,3:288\n*S KotlinDebug\n*F\n+ 1 FocusRestorer.kt\nandroidx/compose/ui/focus/FocusRestorerKt\n*L\n38#1:151\n58#1:228\n38#1:152,5\n38#1:157\n38#1:163\n38#1:167,3\n38#1:171\n38#1:173,9\n38#1:182,6\n38#1:189,2\n38#1:194,17\n38#1:214,8\n38#1:222,6\n58#1:229,5\n58#1:234\n58#1:240\n58#1:244,3\n58#1:248\n58#1:250,9\n58#1:259,6\n58#1:266,2\n58#1:271,17\n58#1:291,8\n58#1:299,6\n38#1:158,5\n58#1:235,5\n38#1:164\n38#1:165,2\n58#1:241\n58#1:242,2\n38#1:170\n38#1:172\n58#1:247\n58#1:249\n38#1:188\n58#1:265\n38#1:191,3\n38#1:211,3\n58#1:268,3\n58#1:288,3\n*E\n"})
/* loaded from: classes.dex */
public final class FocusRestorerKt {

    @NotNull
    private static final String PrevFocusedChild = "previouslyFocusedChildHash";

    @NotNull
    public static final Modifier focusRestorer(@NotNull Modifier modifier, @NotNull FocusRequester focusRequester) {
        return modifier.then(new FocusRestorerElement(focusRequester));
    }

    public static /* synthetic */ Modifier focusRestorer$default(Modifier modifier, FocusRequester focusRequester, int i, Object obj) {
        if ((i & 1) != 0) {
            focusRequester = FocusRequester.INSTANCE.getDefault();
        }
        return focusRestorer(modifier, focusRequester);
    }

    @Nullable
    public static final PinnableContainer.PinnedHandle pinFocusedChild(@NotNull FocusTargetNode focusTargetNode) {
        PinnableContainer pinnableContainer;
        FocusTargetNode focusTargetNodeFindActiveFocusNode = FocusTraversalKt.findActiveFocusNode(focusTargetNode);
        if (focusTargetNodeFindActiveFocusNode == null || (pinnableContainer = (PinnableContainer) CompositionLocalConsumerModifierNodeKt.currentValueOf(focusTargetNodeFindActiveFocusNode, PinnableContainerKt.getLocalPinnableContainer())) == null) {
            return null;
        }
        return pinnableContainer.pin();
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x005f, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean restoreFocusedChild(@org.jetbrains.annotations.NotNull androidx.compose.p011ui.focus.FocusTargetNode r11) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p011ui.focus.FocusRestorerKt.restoreFocusedChild(androidx.compose.ui.focus.FocusTargetNode):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0040, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean saveFocusedChild(@org.jetbrains.annotations.NotNull final androidx.compose.p011ui.focus.FocusTargetNode r11) {
        /*
            androidx.compose.ui.focus.FocusStateImpl r0 = r11.getFocusState()
            boolean r0 = r0.getHasFocus()
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            r0 = 1024(0x400, float:1.435E-42)
            int r0 = androidx.compose.p011ui.node.NodeKind.m12314constructorimpl(r0)
            androidx.compose.ui.Modifier$Node r2 = r11.getNode()
            boolean r2 = r2.getIsAttached()
            if (r2 != 0) goto L22
            java.lang.String r2 = "visitChildren called on an unattached node"
            androidx.compose.p011ui.internal.InlineClassHelperKt.throwIllegalStateException(r2)
        L22:
            androidx.compose.runtime.collection.MutableVector r2 = new androidx.compose.runtime.collection.MutableVector
            r3 = 16
            androidx.compose.ui.Modifier$Node[] r4 = new androidx.compose.ui.Modifier.Node[r3]
            r2.<init>(r4, r1)
            androidx.compose.ui.Modifier$Node r4 = r11.getNode()
            androidx.compose.ui.Modifier$Node r4 = r4.getChild()
            if (r4 != 0) goto L3d
            androidx.compose.ui.Modifier$Node r4 = r11.getNode()
            androidx.compose.p011ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r2, r4, r1)
            goto L40
        L3d:
            r2.add(r4)
        L40:
            int r4 = r2.getSize()
            if (r4 == 0) goto Lde
            r4 = 1
            java.lang.Object r5 = androidx.compose.material3.AbstractC1923c.m1046j(r2, r4)
            androidx.compose.ui.Modifier$Node r5 = (androidx.compose.ui.Modifier.Node) r5
            int r6 = r5.getAggregateChildKindSet()
            r6 = r6 & r0
            if (r6 != 0) goto L58
            androidx.compose.p011ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r2, r5, r1)
            goto L40
        L58:
            if (r5 == 0) goto L40
            int r6 = r5.getKindSet()
            r6 = r6 & r0
            if (r6 == 0) goto Ld8
            r6 = 0
            r7 = r6
        L63:
            if (r5 == 0) goto L40
            boolean r8 = r5 instanceof androidx.compose.p011ui.focus.FocusTargetNode
            if (r8 == 0) goto L97
            androidx.compose.ui.focus.FocusTargetNode r5 = (androidx.compose.p011ui.focus.FocusTargetNode) r5
            androidx.compose.ui.focus.FocusStateImpl r8 = r5.getFocusState()
            boolean r8 = r8.getHasFocus()
            if (r8 == 0) goto Ld3
            androidx.compose.ui.node.LayoutNode r0 = androidx.compose.p011ui.node.DelegatableNodeKt.requireLayoutNode(r5)
            int r0 = r0.getCompositeKeyHash()
            r11.setPreviouslyFocusedChildHash(r0)
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.runtime.saveable.SaveableStateRegistryKt.getLocalSaveableStateRegistry()
            java.lang.Object r0 = androidx.compose.p011ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(r11, r0)
            androidx.compose.runtime.saveable.SaveableStateRegistry r0 = (androidx.compose.runtime.saveable.SaveableStateRegistry) r0
            if (r0 == 0) goto L96
            androidx.compose.ui.focus.FocusRestorerKt$saveFocusedChild$1$1 r1 = new androidx.compose.ui.focus.FocusRestorerKt$saveFocusedChild$1$1
            r1.<init>()
            java.lang.String r11 = "previouslyFocusedChildHash"
            r0.registerProvider(r11, r1)
        L96:
            return r4
        L97:
            int r8 = r5.getKindSet()
            r8 = r8 & r0
            if (r8 == 0) goto Ld3
            boolean r8 = r5 instanceof androidx.compose.p011ui.node.DelegatingNode
            if (r8 == 0) goto Ld3
            r8 = r5
            androidx.compose.ui.node.DelegatingNode r8 = (androidx.compose.p011ui.node.DelegatingNode) r8
            androidx.compose.ui.Modifier$Node r8 = r8.getDelegate()
            r9 = r1
        Laa:
            if (r8 == 0) goto Ld0
            int r10 = r8.getKindSet()
            r10 = r10 & r0
            if (r10 == 0) goto Lcb
            int r9 = r9 + 1
            if (r9 != r4) goto Lb9
            r5 = r8
            goto Lcb
        Lb9:
            if (r7 != 0) goto Lc2
            androidx.compose.runtime.collection.MutableVector r7 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r10 = new androidx.compose.ui.Modifier.Node[r3]
            r7.<init>(r10, r1)
        Lc2:
            if (r5 == 0) goto Lc8
            r7.add(r5)
            r5 = r6
        Lc8:
            r7.add(r8)
        Lcb:
            androidx.compose.ui.Modifier$Node r8 = r8.getChild()
            goto Laa
        Ld0:
            if (r9 != r4) goto Ld3
            goto L63
        Ld3:
            androidx.compose.ui.Modifier$Node r5 = androidx.compose.p011ui.node.DelegatableNodeKt.access$pop(r7)
            goto L63
        Ld8:
            androidx.compose.ui.Modifier$Node r5 = r5.getChild()
            goto L58
        Lde:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p011ui.focus.FocusRestorerKt.saveFocusedChild(androidx.compose.ui.focus.FocusTargetNode):boolean");
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use focusRestorer(FocusRequester) instead", replaceWith = @ReplaceWith(expression = "this.focusRestorer(onRestoreFailed())", imports = {}))
    @ExperimentalComposeUiApi
    @NotNull
    public static final Modifier focusRestorer(@NotNull Modifier modifier, @Nullable InterfaceC6469a interfaceC6469a) {
        FocusRequester focusRequester;
        if (interfaceC6469a == null || (focusRequester = (FocusRequester) interfaceC6469a.invoke()) == null) {
            focusRequester = FocusRequester.INSTANCE.getDefault();
        }
        return focusRestorer(modifier, focusRequester);
    }
}
