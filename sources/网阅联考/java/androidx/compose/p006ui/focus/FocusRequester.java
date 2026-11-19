package androidx.compose.p006ui.focus;

import androidx.compose.p006ui.ExperimentalComposeUiApi;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Stable
@Metadata(m5174d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ!\u0010\u000b\u001a\u00020\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\rH\u0000¢\u0006\u0002\b\u000fJ\u0006\u0010\u0010\u001a\u00020\nJ\u0006\u0010\u0011\u001a\u00020\u0012R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, m5175d2 = {"Landroidx/compose/ui/focus/FocusRequester;", "", "()V", "focusRequesterNodes", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/focus/FocusRequesterModifierNode;", "getFocusRequesterNodes$ui_release$annotations", "getFocusRequesterNodes$ui_release", "()Landroidx/compose/runtime/collection/MutableVector;", "captureFocus", "", "findFocusTarget", "onFound", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "findFocusTarget$ui_release", "freeFocus", "requestFocus", "", "Companion", "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nFocusRequester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusRequester.kt\nandroidx/compose/ui/focus/FocusRequester\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n*L\n1#1,201:1\n1182#2:202\n1161#2,2:203\n1182#2:217\n1161#2,2:218\n1#3:205\n460#4,7:206\n48#4:227\n467#4,4:243\n460#4,11:247\n460#4,11:258\n87#5:213\n340#6:214\n206#6,2:215\n208#6,7:220\n215#6,15:228\n*S KotlinDebug\n*F\n+ 1 FocusRequester.kt\nandroidx/compose/ui/focus/FocusRequester\n*L\n53#1:202\n53#1:203,2\n85#1:217\n85#1:218,2\n84#1:206,7\n85#1:227\n84#1:243,4\n113#1:247,11\n138#1:258,11\n85#1:213\n85#1:214\n85#1:215,2\n85#1:220,7\n85#1:228,15\n*E\n"})
/* loaded from: classes.dex */
public final class FocusRequester {
    public static final int $stable = 0;
    private final MutableVector<FocusRequesterModifierNode> focusRequesterNodes = new MutableVector<>(new FocusRequesterModifierNode[16], 0);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final FocusRequester Default = new FocusRequester();
    private static final FocusRequester Cancel = new FocusRequester();

    @Metadata(m5174d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0007R\u001c\u0010\u0003\u001a\u00020\u00048GX\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\r"}, m5175d2 = {"Landroidx/compose/ui/focus/FocusRequester$Companion;", "", "()V", "Cancel", "Landroidx/compose/ui/focus/FocusRequester;", "getCancel$annotations", "getCancel", "()Landroidx/compose/ui/focus/FocusRequester;", "Default", "getDefault", "createRefs", "Landroidx/compose/ui/focus/FocusRequester$Companion$FocusRequesterFactory;", "FocusRequesterFactory", "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {

        @StabilityInferred(parameters = 0)
        @Metadata(m5174d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0005\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0006\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0007\u001a\u00020\u0004H\u0086\u0002J\t\u0010\b\u001a\u00020\u0004H\u0086\u0002J\t\u0010\t\u001a\u00020\u0004H\u0086\u0002J\t\u0010\n\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u000b\u001a\u00020\u0004H\u0086\u0002J\t\u0010\f\u001a\u00020\u0004H\u0086\u0002J\t\u0010\r\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u000e\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u000f\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0010\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0011\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0012\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0013\u001a\u00020\u0004H\u0086\u0002¨\u0006\u0014"}, m5175d2 = {"Landroidx/compose/ui/focus/FocusRequester$Companion$FocusRequesterFactory;", "", "()V", "component1", "Landroidx/compose/ui/focus/FocusRequester;", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @ExperimentalComposeUiApi
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

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @ExperimentalComposeUiApi
        public static /* synthetic */ void getCancel$annotations() {
        }

        @ExperimentalComposeUiApi
        public final FocusRequesterFactory createRefs() {
            return FocusRequesterFactory.INSTANCE;
        }

        @ExperimentalComposeUiApi
        public final FocusRequester getCancel() {
            return FocusRequester.Cancel;
        }

        public final FocusRequester getDefault() {
            return FocusRequester.Default;
        }
    }

    public static /* synthetic */ void getFocusRequesterNodes$ui_release$annotations() {
    }

    public final boolean captureFocus() {
        if (!this.focusRequesterNodes.isNotEmpty()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
        }
        MutableVector<FocusRequesterModifierNode> mutableVector = this.focusRequesterNodes;
        int size = mutableVector.getSize();
        if (size > 0) {
            FocusRequesterModifierNode[] content = mutableVector.getContent();
            int i4 = 0;
            while (!FocusRequesterModifierNodeKt.captureFocus(content[i4])) {
                i4++;
                if (i4 >= size) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0063, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean findFocusTarget$ui_release(kotlin.jvm.functions.Function1<? super androidx.compose.p006ui.focus.FocusTargetModifierNode, java.lang.Boolean> r11) {
        /*
            r10 = this;
            java.lang.String r0 = "onFound"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            androidx.compose.ui.focus.FocusRequester r0 = androidx.compose.p006ui.focus.FocusRequester.Default
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r10, r0)
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = "\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n"
            if (r0 == 0) goto Lca
            androidx.compose.ui.focus.FocusRequester r0 = androidx.compose.p006ui.focus.FocusRequester.Cancel
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r10, r0)
            r0 = r0 ^ r1
            if (r0 == 0) goto Lc0
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.focus.FocusRequesterModifierNode> r0 = r10.focusRequesterNodes
            boolean r0 = r0.isNotEmpty()
            if (r0 == 0) goto Lb4
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.focus.FocusRequesterModifierNode> r0 = r10.focusRequesterNodes
            int r2 = r0.getSize()
            r3 = 0
            if (r2 <= 0) goto Lb3
            java.lang.Object[] r0 = r0.getContent()
            r4 = r3
            r5 = r4
        L31:
            r6 = r0[r4]
            androidx.compose.ui.focus.FocusRequesterModifierNode r6 = (androidx.compose.p006ui.focus.FocusRequesterModifierNode) r6
            r7 = 1024(0x400, float:1.435E-42)
            int r7 = androidx.compose.p006ui.node.NodeKind.m10773constructorimpl(r7)
            androidx.compose.ui.Modifier$Node r8 = r6.getNode()
            boolean r8 = r8.getIsAttached()
            if (r8 == 0) goto La7
            androidx.compose.runtime.collection.MutableVector r8 = new androidx.compose.runtime.collection.MutableVector
            r9 = 16
            androidx.compose.ui.Modifier$Node[] r9 = new androidx.compose.ui.Modifier.Node[r9]
            r8.<init>(r9, r3)
            androidx.compose.ui.Modifier$Node r9 = r6.getNode()
            androidx.compose.ui.Modifier$Node r9 = r9.getChild()
            if (r9 != 0) goto L60
            androidx.compose.ui.Modifier$Node r6 = r6.getNode()
            androidx.compose.p006ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r8, r6)
            goto L63
        L60:
            r8.add(r9)
        L63:
            boolean r6 = r8.isNotEmpty()
            if (r6 == 0) goto La1
            int r6 = r8.getSize()
            int r6 = r6 - r1
            java.lang.Object r6 = r8.removeAt(r6)
            androidx.compose.ui.Modifier$Node r6 = (androidx.compose.ui.Modifier.Node) r6
            int r9 = r6.getAggregateChildKindSet()
            r9 = r9 & r7
            if (r9 != 0) goto L7f
            androidx.compose.p006ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r8, r6)
            goto L63
        L7f:
            if (r6 == 0) goto L63
            int r9 = r6.getKindSet()
            r9 = r9 & r7
            if (r9 == 0) goto L9c
            boolean r9 = r6 instanceof androidx.compose.p006ui.focus.FocusTargetModifierNode
            if (r9 == 0) goto L63
            androidx.compose.ui.focus.FocusTargetModifierNode r6 = (androidx.compose.p006ui.focus.FocusTargetModifierNode) r6
            java.lang.Object r6 = r11.invoke(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L63
            r5 = r1
            goto La1
        L9c:
            androidx.compose.ui.Modifier$Node r6 = r6.getChild()
            goto L7f
        La1:
            int r4 = r4 + 1
            if (r4 < r2) goto L31
            r3 = r5
            goto Lb3
        La7:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r11.<init>(r0)
            throw r11
        Lb3:
            return r3
        Lb4:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n"
            java.lang.String r0 = r0.toString()
            r11.<init>(r0)
            throw r11
        Lc0:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = r2.toString()
            r11.<init>(r0)
            throw r11
        Lca:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = r2.toString()
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p006ui.focus.FocusRequester.findFocusTarget$ui_release(kotlin.jvm.functions.Function1):boolean");
    }

    public final boolean freeFocus() {
        if (!this.focusRequesterNodes.isNotEmpty()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
        }
        MutableVector<FocusRequesterModifierNode> mutableVector = this.focusRequesterNodes;
        int size = mutableVector.getSize();
        if (size > 0) {
            FocusRequesterModifierNode[] content = mutableVector.getContent();
            int i4 = 0;
            while (!FocusRequesterModifierNodeKt.freeFocus(content[i4])) {
                i4++;
                if (i4 >= size) {
                }
            }
            return true;
        }
        return false;
    }

    public final MutableVector<FocusRequesterModifierNode> getFocusRequesterNodes$ui_release() {
        return this.focusRequesterNodes;
    }

    public final void requestFocus() {
        findFocusTarget$ui_release(new Function1<FocusTargetModifierNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusRequester.requestFocus.1
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(FocusTargetModifierNode it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(FocusTransactionsKt.requestFocus(it));
            }
        });
    }
}
