package androidx.compose.p011ui.node;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.p011ui.internal.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\fJ\r\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J&\u0010\u0015\u001a\u00020\r2\u0014\b\u0004\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r0\u0013H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, m5110d2 = {"Landroidx/compose/ui/node/DepthSortedSet;", "", "", "extraAssertions", "<init>", "(Z)V", "Landroidx/collection/MutableObjectIntMap;", "Landroidx/compose/ui/node/LayoutNode;", "safeMapOfOriginalDepth", "()Landroidx/collection/MutableObjectIntMap;", "node", "contains", "(Landroidx/compose/ui/node/LayoutNode;)Z", "Ld6/s;", "add", "(Landroidx/compose/ui/node/LayoutNode;)V", "remove", "pop", "()Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Function1;", "block", "popEach", "(Lr6/c;)V", "isEmpty", "()Z", "isNotEmpty", "", "toString", "()Ljava/lang/String;", "Z", "mapOfOriginalDepth", "Landroidx/collection/MutableObjectIntMap;", "Landroidx/compose/ui/node/TreeSet;", "set", "Landroidx/compose/ui/node/TreeSet;", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nDepthSortedSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSet\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n*L\n1#1,203:1\n107#1:230\n56#2,5:204\n56#2,5:209\n56#2,5:214\n56#2,5:219\n56#2,5:225\n438#3:224\n*S KotlinDebug\n*F\n+ 1 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSet\n*L\n99#1:230\n55#1:204,5\n63#1:209,5\n70#1:214,5\n77#1:219,5\n84#1:225,5\n81#1:224\n*E\n"})
/* loaded from: classes2.dex */
public final class DepthSortedSet {
    public static final int $stable = 8;
    private final boolean extraAssertions;

    @Nullable
    private MutableObjectIntMap<LayoutNode> mapOfOriginalDepth;

    @NotNull
    private final TreeSet<LayoutNode> set = new TreeSet<>(DepthSortedSetKt.DepthComparator);

    public DepthSortedSet(boolean z8) {
        this.extraAssertions = z8;
    }

    private final MutableObjectIntMap<LayoutNode> safeMapOfOriginalDepth() {
        if (this.mapOfOriginalDepth == null) {
            this.mapOfOriginalDepth = ObjectIntMapKt.mutableObjectIntMapOf();
        }
        MutableObjectIntMap<LayoutNode> mutableObjectIntMap = this.mapOfOriginalDepth;
        AbstractC5830k.m5327d(mutableObjectIntMap);
        return mutableObjectIntMap;
    }

    public final void add(@NotNull LayoutNode node) {
        if (!node.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("DepthSortedSet.add called on an unattached node");
        }
        if (this.extraAssertions) {
            MutableObjectIntMap<LayoutNode> mutableObjectIntMapSafeMapOfOriginalDepth = safeMapOfOriginalDepth();
            int orDefault = mutableObjectIntMapSafeMapOfOriginalDepth.getOrDefault(node, Integer.MAX_VALUE);
            if (orDefault == Integer.MAX_VALUE) {
                mutableObjectIntMapSafeMapOfOriginalDepth.set(node, node.getDepth());
            } else {
                if (!(orDefault == node.getDepth())) {
                    InlineClassHelperKt.throwIllegalStateException("invalid node depth");
                }
            }
        }
        this.set.add(node);
    }

    public final boolean contains(@NotNull LayoutNode node) {
        boolean zContains = this.set.contains(node);
        if (this.extraAssertions) {
            if (!(zContains == safeMapOfOriginalDepth().containsKey(node))) {
                InlineClassHelperKt.throwIllegalStateException("inconsistency in TreeSet");
            }
        }
        return zContains;
    }

    public final boolean isEmpty() {
        return this.set.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !isEmpty();
    }

    @NotNull
    public final LayoutNode pop() {
        LayoutNode layoutNodeFirst = this.set.first();
        remove(layoutNodeFirst);
        return layoutNodeFirst;
    }

    public final void popEach(@NotNull InterfaceC6471c block) {
        while (!isEmpty()) {
            block.invoke(pop());
        }
    }

    public final boolean remove(@NotNull LayoutNode node) {
        if (!node.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("DepthSortedSet.remove called on an unattached node");
        }
        boolean zRemove = this.set.remove(node);
        if (this.extraAssertions) {
            MutableObjectIntMap<LayoutNode> mutableObjectIntMapSafeMapOfOriginalDepth = safeMapOfOriginalDepth();
            if (mutableObjectIntMapSafeMapOfOriginalDepth.containsKey(node)) {
                int i = mutableObjectIntMapSafeMapOfOriginalDepth.get(node);
                mutableObjectIntMapSafeMapOfOriginalDepth.remove(node);
                if (!(i == (zRemove ? node.getDepth() : Integer.MAX_VALUE))) {
                    InlineClassHelperKt.throwIllegalStateException("invalid node depth");
                }
            }
        }
        return zRemove;
    }

    @NotNull
    public String toString() {
        return this.set.toString();
    }
}
