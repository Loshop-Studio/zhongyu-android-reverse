package androidx.compose.p014ui.focus;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.internal.InlineClassHelperKt;
import androidx.compose.p014ui.node.DelegatableNodeKt;
import androidx.compose.p014ui.node.DelegatingNode;
import androidx.compose.p014ui.node.NodeKind;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9540l;
import p309qc.InterfaceC10770a;

@Stable
/* loaded from: classes2.dex */
public final class FocusRequester {
    public static final int $stable = 0;
    private final MutableVector<FocusRequesterModifierNode> focusRequesterNodes = new MutableVector<>(new FocusRequesterModifierNode[16], 0);
    public static final Companion Companion = new Companion(null);
    private static final FocusRequester Default = new FocusRequester();
    private static final FocusRequester Cancel = new FocusRequester();
    private static final FocusRequester Redirect = new FocusRequester();

    public static final class Companion {

        @StabilityInferred(parameters = 1)
        public static final class FocusRequesterFactory {
            public static final int $stable = 0;
            public static final FocusRequesterFactory INSTANCE = new FocusRequesterFactory();

            private FocusRequesterFactory() {
            }

            public final FocusRequester component1() {
                return new FocusRequester();
            }

            public final FocusRequester component10() {
                return new FocusRequester();
            }

            public final FocusRequester component11() {
                return new FocusRequester();
            }

            public final FocusRequester component12() {
                return new FocusRequester();
            }

            public final FocusRequester component13() {
                return new FocusRequester();
            }

            public final FocusRequester component14() {
                return new FocusRequester();
            }

            public final FocusRequester component15() {
                return new FocusRequester();
            }

            public final FocusRequester component16() {
                return new FocusRequester();
            }

            public final FocusRequester component2() {
                return new FocusRequester();
            }

            public final FocusRequester component3() {
                return new FocusRequester();
            }

            public final FocusRequester component4() {
                return new FocusRequester();
            }

            public final FocusRequester component5() {
                return new FocusRequester();
            }

            public final FocusRequester component6() {
                return new FocusRequester();
            }

            public final FocusRequester component7() {
                return new FocusRequester();
            }

            public final FocusRequester component8() {
                return new FocusRequester();
            }

            public final FocusRequester component9() {
                return new FocusRequester();
            }
        }

        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final FocusRequesterFactory createRefs() {
            return FocusRequesterFactory.INSTANCE;
        }

        public final FocusRequester getCancel() {
            return FocusRequester.Cancel;
        }

        public final FocusRequester getDefault() {
            return FocusRequester.Default;
        }

        public final FocusRequester getRedirect$ui_release() {
            return FocusRequester.Redirect;
        }

        private Companion() {
        }
    }

    private final boolean findFocusTarget(InterfaceC9540l interfaceC9540l) {
        Companion companion = Companion;
        if (this == companion.getDefault()) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        if (this == companion.getCancel()) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        if (this.focusRequesterNodes.getSize() == 0) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
        }
        MutableVector<FocusRequesterModifierNode> mutableVector = this.focusRequesterNodes;
        FocusRequesterModifierNode[] focusRequesterModifierNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            FocusRequesterModifierNode focusRequesterModifierNode = focusRequesterModifierNodeArr[i10];
            int iM32510constructorimpl = NodeKind.m32510constructorimpl(1024);
            if (!focusRequesterModifierNode.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
            }
            MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = focusRequesterModifierNode.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusRequesterModifierNode.getNode(), false);
            } else {
                mutableVector2.add(child$ui_release);
            }
            while (true) {
                if (mutableVector2.getSize() != 0) {
                    Modifier.Node nodePop = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
                    if ((nodePop.getAggregateChildKindSet$ui_release() & iM32510constructorimpl) == 0) {
                        DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, nodePop, false);
                    } else {
                        while (true) {
                            if (nodePop == null) {
                                break;
                            }
                            if ((nodePop.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                                MutableVector mutableVector3 = null;
                                while (nodePop != null) {
                                    if (nodePop instanceof FocusTargetNode) {
                                        if (((Boolean) interfaceC9540l.invoke((FocusTargetNode) nodePop)).booleanValue()) {
                                            z10 = true;
                                            break;
                                        }
                                    } else if ((nodePop.getKindSet$ui_release() & iM32510constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                        int i11 = 0;
                                        for (Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                            if ((delegate$ui_release.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                                                i11++;
                                                if (i11 == 1) {
                                                    nodePop = delegate$ui_release;
                                                } else {
                                                    if (mutableVector3 == null) {
                                                        mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    if (nodePop != null) {
                                                        mutableVector3.add(nodePop);
                                                        nodePop = null;
                                                    }
                                                    mutableVector3.add(delegate$ui_release);
                                                }
                                            }
                                        }
                                        if (i11 == 1) {
                                        }
                                    }
                                    nodePop = DelegatableNodeKt.pop(mutableVector3);
                                }
                            } else {
                                nodePop = nodePop.getChild$ui_release();
                            }
                        }
                    }
                }
            }
        }
        return z10;
    }

    /* renamed from: requestFocus-3ESFkO8$default, reason: not valid java name */
    public static /* synthetic */ boolean m30545requestFocus3ESFkO8$default(FocusRequester focusRequester, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = FocusDirection.Companion.m30519getEnterdhqQ8s();
        }
        return focusRequester.m30546requestFocus3ESFkO8(i10);
    }

    public final boolean captureFocus() {
        if (this.focusRequesterNodes.getSize() == 0) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
        }
        MutableVector<FocusRequesterModifierNode> mutableVector = this.focusRequesterNodes;
        FocusRequesterModifierNode[] focusRequesterModifierNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            if (FocusRequesterModifierNodeKt.captureFocus(focusRequesterModifierNodeArr[i10])) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0061, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean findFocusTargetNode$ui_release(p181hd.InterfaceC9540l r18) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.focus.FocusRequester.findFocusTargetNode$ui_release(hd.l):boolean");
    }

    public final boolean freeFocus() {
        if (this.focusRequesterNodes.getSize() == 0) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
        }
        MutableVector<FocusRequesterModifierNode> mutableVector = this.focusRequesterNodes;
        FocusRequesterModifierNode[] focusRequesterModifierNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            if (FocusRequesterModifierNodeKt.freeFocus(focusRequesterModifierNodeArr[i10])) {
                return true;
            }
        }
        return false;
    }

    public final MutableVector<FocusRequesterModifierNode> getFocusRequesterNodes$ui_release() {
        return this.focusRequesterNodes;
    }

    @InterfaceC10770a
    public final /* synthetic */ void requestFocus() {
        m30546requestFocus3ESFkO8(FocusDirection.Companion.m30519getEnterdhqQ8s());
    }

    /* renamed from: requestFocus-3ESFkO8, reason: not valid java name */
    public final boolean m30546requestFocus3ESFkO8(final int i10) {
        return findFocusTargetNode$ui_release(new InterfaceC9540l() { // from class: androidx.compose.ui.focus.FocusRequester.requestFocus.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                return Boolean.valueOf(focusTargetNode.mo30549requestFocus3ESFkO8(i10));
            }
        });
    }

    public final boolean restoreFocusedChild() {
        if (this.focusRequesterNodes.getSize() == 0) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
        }
        MutableVector<FocusRequesterModifierNode> mutableVector = this.focusRequesterNodes;
        FocusRequesterModifierNode[] focusRequesterModifierNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            z10 = FocusRequesterModifierNodeKt.restoreFocusedChild(focusRequesterModifierNodeArr[i10]) || z10;
        }
        return z10;
    }

    public final boolean saveFocusedChild() {
        if (this.focusRequesterNodes.getSize() == 0) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
        }
        MutableVector<FocusRequesterModifierNode> mutableVector = this.focusRequesterNodes;
        FocusRequesterModifierNode[] focusRequesterModifierNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            if (FocusRequesterModifierNodeKt.saveFocusedChild(focusRequesterModifierNodeArr[i10])) {
                return true;
            }
        }
        return false;
    }
}
