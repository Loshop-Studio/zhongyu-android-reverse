package androidx.compose.p011ui.modifier;

import androidx.compose.material3.AbstractC1923c;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.internal.InlineClassHelperKt;
import androidx.compose.p011ui.node.BackwardsCompatNode;
import androidx.compose.p011ui.node.DelegatableNodeKt;
import androidx.compose.p011ui.node.DelegatingNode;
import androidx.compose.p011ui.node.LayoutNode;
import androidx.compose.p011ui.node.NodeKind;
import androidx.compose.p011ui.node.Owner;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0011J!\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\u0015\u0010\u0014J!\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\u001e\u0010 \u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001cR\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, m5110d2 = {"Landroidx/compose/ui/modifier/ModifierLocalManager;", "", "Landroidx/compose/ui/node/Owner;", "owner", "<init>", "(Landroidx/compose/ui/node/Owner;)V", "Landroidx/compose/ui/Modifier$Node;", "node", "Landroidx/compose/ui/modifier/ModifierLocal;", "key", "", "Landroidx/compose/ui/node/BackwardsCompatNode;", "set", "Ld6/s;", "invalidateConsumersOfNodeForKey", "(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/modifier/ModifierLocal;Ljava/util/Set;)V", "invalidate", "()V", "triggerUpdates", "updatedProvider", "(Landroidx/compose/ui/node/BackwardsCompatNode;Landroidx/compose/ui/modifier/ModifierLocal;)V", "insertedProvider", "removedProvider", "Landroidx/compose/ui/node/Owner;", "getOwner", "()Landroidx/compose/ui/node/Owner;", "Landroidx/compose/runtime/collection/MutableVector;", "inserted", "Landroidx/compose/runtime/collection/MutableVector;", "insertedLocal", "Landroidx/compose/ui/node/LayoutNode;", "removed", "removedLocal", "", "invalidated", "Z", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nModifierLocalManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalManager.kt\nandroidx/compose/ui/modifier/ModifierLocalManager\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 8 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 9 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,119:1\n1101#2:120\n1083#2,2:121\n1101#2:123\n1083#2,2:124\n1101#2:126\n1083#2,2:127\n1101#2:129\n1083#2,2:130\n1101#2:168\n1083#2,2:169\n435#3,6:132\n472#3:138\n441#3,3:139\n435#3,6:142\n472#3:148\n441#3,3:149\n519#3:174\n641#3,2:232\n641#3,2:234\n641#3,2:236\n641#3,2:238\n641#3,2:240\n641#3,2:242\n1855#4,2:152\n99#5:154\n298#6,6:155\n179#6:161\n180#6:167\n181#6,3:171\n184#6,6:175\n304#6:181\n437#6,6:182\n447#6,2:189\n449#6,17:194\n466#6,8:214\n305#6:222\n190#6,8:223\n306#6:231\n56#7,5:162\n246#8:188\n240#9,3:191\n243#9,3:211\n*S KotlinDebug\n*F\n+ 1 ModifierLocalManager.kt\nandroidx/compose/ui/modifier/ModifierLocalManager\n*L\n41#1:120\n41#1:121,2\n42#1:123\n42#1:124,2\n43#1:126\n43#1:127,2\n44#1:129\n44#1:130,2\n90#1:168\n90#1:169,2\n61#1:132,6\n62#1:138\n61#1:139,3\n74#1:142,6\n75#1:148\n74#1:149,3\n90#1:174\n102#1:232,2\n103#1:234,2\n108#1:236,2\n109#1:238,2\n114#1:240,2\n115#1:242,2\n82#1:152,2\n90#1:154\n90#1:155,6\n90#1:161\n90#1:167\n90#1:171,3\n90#1:175,6\n90#1:181\n90#1:182,6\n90#1:189,2\n90#1:194,17\n90#1:214,8\n90#1:222\n90#1:223,8\n90#1:231\n90#1:162,5\n90#1:188\n90#1:191,3\n90#1:211,3\n*E\n"})
/* loaded from: classes2.dex */
public final class ModifierLocalManager {
    public static final int $stable = 8;
    private boolean invalidated;

    @NotNull
    private final Owner owner;

    @NotNull
    private final MutableVector<BackwardsCompatNode> inserted = new MutableVector<>(new BackwardsCompatNode[16], 0);

    @NotNull
    private final MutableVector<ModifierLocal<?>> insertedLocal = new MutableVector<>(new ModifierLocal[16], 0);

    @NotNull
    private final MutableVector<LayoutNode> removed = new MutableVector<>(new LayoutNode[16], 0);

    @NotNull
    private final MutableVector<ModifierLocal<?>> removedLocal = new MutableVector<>(new ModifierLocal[16], 0);

    public ModifierLocalManager(@NotNull Owner owner) {
        this.owner = owner;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.util.Set, java.util.Set<androidx.compose.ui.node.BackwardsCompatNode>] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    private final void invalidateConsumersOfNodeForKey(Modifier.Node node, ModifierLocal<?> key, Set<BackwardsCompatNode> set) {
        int iM12314constructorimpl = NodeKind.m12314constructorimpl(32);
        if (!node.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = node.getNode().getChild();
        if (child == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, node.getNode(), false);
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node2 = (Modifier.Node) AbstractC1923c.m1046j(mutableVector, 1);
            if ((node2.getAggregateChildKindSet() & iM12314constructorimpl) != 0) {
                for (Modifier.Node child2 = node2; child2 != null; child2 = child2.getChild()) {
                    if ((child2.getKindSet() & iM12314constructorimpl) != 0) {
                        DelegatingNode delegatingNodePop = child2;
                        MutableVector mutableVector2 = null;
                        while (delegatingNodePop != 0) {
                            if (delegatingNodePop instanceof ModifierLocalModifierNode) {
                                ModifierLocalModifierNode modifierLocalModifierNode = (ModifierLocalModifierNode) delegatingNodePop;
                                if (modifierLocalModifierNode instanceof BackwardsCompatNode) {
                                    BackwardsCompatNode backwardsCompatNode = (BackwardsCompatNode) modifierLocalModifierNode;
                                    if ((backwardsCompatNode.getElement() instanceof ModifierLocalConsumer) && backwardsCompatNode.getReadValues().contains(key)) {
                                        set.add(modifierLocalModifierNode);
                                    }
                                }
                                if (modifierLocalModifierNode.getProvidedValues().contains$ui_release(key)) {
                                    break;
                                }
                            } else if ((delegatingNodePop.getKindSet() & iM12314constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                                Modifier.Node delegate = delegatingNodePop.getDelegate();
                                int i = 0;
                                delegatingNodePop = delegatingNodePop;
                                while (delegate != null) {
                                    if ((delegate.getKindSet() & iM12314constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            delegatingNodePop = delegate;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (delegatingNodePop != 0) {
                                                mutableVector2.add(delegatingNodePop);
                                                delegatingNodePop = 0;
                                            }
                                            mutableVector2.add(delegate);
                                        }
                                    }
                                    delegate = delegate.getChild();
                                    delegatingNodePop = delegatingNodePop;
                                }
                                if (i == 1) {
                                }
                            }
                            delegatingNodePop = DelegatableNodeKt.pop(mutableVector2);
                        }
                    }
                }
            }
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, node2, false);
        }
    }

    @NotNull
    public final Owner getOwner() {
        return this.owner;
    }

    public final void insertedProvider(@NotNull BackwardsCompatNode node, @NotNull ModifierLocal<?> key) {
        this.inserted.add(node);
        this.insertedLocal.add(key);
        invalidate();
    }

    public final void invalidate() {
        if (this.invalidated) {
            return;
        }
        this.invalidated = true;
        this.owner.registerOnEndApplyChangesListener(new InterfaceC6469a() { // from class: androidx.compose.ui.modifier.ModifierLocalManager.invalidate.1
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public /* bridge */ /* synthetic */ Object invoke() {
                m12141invoke();
                return C5443s.f8405a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m12141invoke() {
                ModifierLocalManager.this.triggerUpdates();
            }
        });
    }

    public final void removedProvider(@NotNull BackwardsCompatNode node, @NotNull ModifierLocal<?> key) {
        this.removed.add(DelegatableNodeKt.requireLayoutNode(node));
        this.removedLocal.add(key);
        invalidate();
    }

    public final void triggerUpdates() {
        this.invalidated = false;
        HashSet hashSet = new HashSet();
        MutableVector<LayoutNode> mutableVector = this.removed;
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode = layoutNodeArr[i];
            ModifierLocal<?> modifierLocal = this.removedLocal.content[i];
            if (layoutNode.getNodes().getHead().getIsAttached()) {
                invalidateConsumersOfNodeForKey(layoutNode.getNodes().getHead(), modifierLocal, hashSet);
            }
        }
        this.removed.clear();
        this.removedLocal.clear();
        MutableVector<BackwardsCompatNode> mutableVector2 = this.inserted;
        BackwardsCompatNode[] backwardsCompatNodeArr = mutableVector2.content;
        int size2 = mutableVector2.getSize();
        for (int i8 = 0; i8 < size2; i8++) {
            BackwardsCompatNode backwardsCompatNode = backwardsCompatNodeArr[i8];
            ModifierLocal<?> modifierLocal2 = this.insertedLocal.content[i8];
            if (backwardsCompatNode.getIsAttached()) {
                invalidateConsumersOfNodeForKey(backwardsCompatNode, modifierLocal2, hashSet);
            }
        }
        this.inserted.clear();
        this.insertedLocal.clear();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((BackwardsCompatNode) it.next()).updateModifierLocalConsumer();
        }
    }

    public final void updatedProvider(@NotNull BackwardsCompatNode node, @NotNull ModifierLocal<?> key) {
        this.inserted.add(node);
        this.insertedLocal.add(key);
        invalidate();
    }
}
