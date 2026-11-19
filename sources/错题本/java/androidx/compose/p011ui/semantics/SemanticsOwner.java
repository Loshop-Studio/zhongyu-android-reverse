package androidx.compose.p011ui.semantics;

import androidx.collection.IntObjectMap;
import androidx.collection.MutableObjectList;
import androidx.compose.p011ui.node.LayoutNode;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B'\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0080\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010#\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010%\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b$\u0010\"R\u0014\u0010(\u001a\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, m5110d2 = {"Landroidx/compose/ui/semantics/SemanticsOwner;", "", "Landroidx/compose/ui/node/LayoutNode;", "rootNode", "Landroidx/compose/ui/semantics/EmptySemanticsModifier;", "outerSemanticsNode", "Landroidx/collection/IntObjectMap;", "nodes", "<init>", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/semantics/EmptySemanticsModifier;Landroidx/collection/IntObjectMap;)V", "", "semanticsId", "Landroidx/compose/ui/semantics/SemanticsInfo;", "get$ui_release", "(I)Landroidx/compose/ui/semantics/SemanticsInfo;", "get", "semanticsInfo", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "previousSemanticsConfiguration", "Ld6/s;", "notifySemanticsChange$ui_release", "(Landroidx/compose/ui/semantics/SemanticsInfo;Landroidx/compose/ui/semantics/SemanticsConfiguration;)V", "notifySemanticsChange", "Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/semantics/EmptySemanticsModifier;", "Landroidx/collection/IntObjectMap;", "Landroidx/collection/MutableObjectList;", "Landroidx/compose/ui/semantics/SemanticsListener;", "listeners", "Landroidx/collection/MutableObjectList;", "getListeners$ui_release", "()Landroidx/collection/MutableObjectList;", "Landroidx/compose/ui/semantics/SemanticsNode;", "getRootSemanticsNode", "()Landroidx/compose/ui/semantics/SemanticsNode;", "rootSemanticsNode", "getUnmergedRootSemanticsNode", "unmergedRootSemanticsNode", "getRootInfo$ui_release", "()Landroidx/compose/ui/semantics/SemanticsInfo;", "rootInfo", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSemanticsOwner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsOwner.kt\nandroidx/compose/ui/semantics/SemanticsOwner\n+ 2 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,121:1\n287#2,6:122\n*S KotlinDebug\n*F\n+ 1 SemanticsOwner.kt\nandroidx/compose/ui/semantics/SemanticsOwner\n*L\n67#1:122,6\n*E\n"})
/* loaded from: classes2.dex */
public final class SemanticsOwner {
    public static final int $stable = 8;

    @NotNull
    private final MutableObjectList<SemanticsListener> listeners = new MutableObjectList<>(2);

    @NotNull
    private final IntObjectMap<LayoutNode> nodes;

    @NotNull
    private final EmptySemanticsModifier outerSemanticsNode;

    @NotNull
    private final LayoutNode rootNode;

    public SemanticsOwner(@NotNull LayoutNode layoutNode, @NotNull EmptySemanticsModifier emptySemanticsModifier, @NotNull IntObjectMap<LayoutNode> intObjectMap) {
        this.rootNode = layoutNode;
        this.outerSemanticsNode = emptySemanticsModifier;
        this.nodes = intObjectMap;
    }

    @Nullable
    public final SemanticsInfo get$ui_release(int semanticsId) {
        return this.nodes.get(semanticsId);
    }

    @NotNull
    public final MutableObjectList<SemanticsListener> getListeners$ui_release() {
        return this.listeners;
    }

    @NotNull
    public final SemanticsInfo getRootInfo$ui_release() {
        return this.rootNode;
    }

    @NotNull
    public final SemanticsNode getRootSemanticsNode() {
        return SemanticsNodeKt.SemanticsNode(this.rootNode, true);
    }

    @NotNull
    public final SemanticsNode getUnmergedRootSemanticsNode() {
        return new SemanticsNode(this.outerSemanticsNode, false, this.rootNode, new SemanticsConfiguration());
    }

    public final void notifySemanticsChange$ui_release(@NotNull SemanticsInfo semanticsInfo, @Nullable SemanticsConfiguration previousSemanticsConfiguration) {
        MutableObjectList<SemanticsListener> mutableObjectList = this.listeners;
        Object[] objArr = mutableObjectList.content;
        int i = mutableObjectList._size;
        for (int i8 = 0; i8 < i; i8++) {
            ((SemanticsListener) objArr[i8]).onSemanticsChanged(semanticsInfo, previousSemanticsConfiguration);
        }
    }
}
