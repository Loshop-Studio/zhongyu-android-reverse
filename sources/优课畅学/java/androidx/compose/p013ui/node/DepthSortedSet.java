package androidx.compose.p013ui.node;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.p013ui.internal.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class DepthSortedSet {
    public static final int $stable = 8;
    private final boolean extraAssertions;
    private MutableObjectIntMap<LayoutNode> mapOfOriginalDepth;
    private final TreeSet<LayoutNode> set = new TreeSet<>(DepthSortedSetKt.DepthComparator);

    public DepthSortedSet(boolean z10) {
        this.extraAssertions = z10;
    }

    private final MutableObjectIntMap<LayoutNode> safeMapOfOriginalDepth() {
        if (this.mapOfOriginalDepth == null) {
            this.mapOfOriginalDepth = ObjectIntMapKt.mutableObjectIntMapOf();
        }
        MutableObjectIntMap<LayoutNode> mutableObjectIntMap = this.mapOfOriginalDepth;
        AbstractC9133u.m16130d(mutableObjectIntMap);
        return mutableObjectIntMap;
    }

    public final void add(LayoutNode layoutNode) {
        if (!layoutNode.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("DepthSortedSet.add called on an unattached node");
        }
        if (this.extraAssertions) {
            MutableObjectIntMap<LayoutNode> mutableObjectIntMapSafeMapOfOriginalDepth = safeMapOfOriginalDepth();
            int orDefault = mutableObjectIntMapSafeMapOfOriginalDepth.getOrDefault(layoutNode, Integer.MAX_VALUE);
            if (orDefault == Integer.MAX_VALUE) {
                mutableObjectIntMapSafeMapOfOriginalDepth.set(layoutNode, layoutNode.getDepth$ui_release());
            } else {
                if (!(orDefault == layoutNode.getDepth$ui_release())) {
                    InlineClassHelperKt.throwIllegalStateException("invalid node depth");
                }
            }
        }
        this.set.add(layoutNode);
    }

    public final boolean contains(LayoutNode layoutNode) {
        boolean zContains = this.set.contains(layoutNode);
        if (this.extraAssertions) {
            if (!(zContains == safeMapOfOriginalDepth().containsKey(layoutNode))) {
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

    public final LayoutNode pop() {
        LayoutNode layoutNodeFirst = this.set.first();
        remove(layoutNodeFirst);
        return layoutNodeFirst;
    }

    public final void popEach(InterfaceC10570l interfaceC10570l) {
        while (!isEmpty()) {
            interfaceC10570l.invoke(pop());
        }
    }

    public final boolean remove(LayoutNode layoutNode) {
        if (!layoutNode.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("DepthSortedSet.remove called on an unattached node");
        }
        boolean zRemove = this.set.remove(layoutNode);
        if (this.extraAssertions) {
            MutableObjectIntMap<LayoutNode> mutableObjectIntMapSafeMapOfOriginalDepth = safeMapOfOriginalDepth();
            if (mutableObjectIntMapSafeMapOfOriginalDepth.containsKey(layoutNode)) {
                int i10 = mutableObjectIntMapSafeMapOfOriginalDepth.get(layoutNode);
                mutableObjectIntMapSafeMapOfOriginalDepth.remove(layoutNode);
                if (!(i10 == (zRemove ? layoutNode.getDepth$ui_release() : Integer.MAX_VALUE))) {
                    InlineClassHelperKt.throwIllegalStateException("invalid node depth");
                }
            }
        }
        return zRemove;
    }

    public String toString() {
        return this.set.toString();
    }
}
