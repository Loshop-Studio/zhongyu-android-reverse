package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterMapKt;
import androidx.collection.ScatterSetKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.graphics.GraphicsContext;
import androidx.compose.p014ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p014ui.graphics.layer.GraphicsLayer;
import androidx.compose.p014ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.p014ui.node.DrawModifierNode;
import androidx.compose.p014ui.node.DrawModifierNodeKt;
import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.IntOffset;
import androidx.compose.p014ui.unit.IntSize;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;
import sd.InterfaceC11122i0;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LazyLayoutItemAnimator<T extends LazyLayoutMeasuredItem> {
    public static final int $stable = 8;
    private DrawModifierNode displayingNode;
    private int firstVisibleIndex;
    private LazyLayoutKeyIndexMap keyIndexMap;
    private final MutableScatterMap<Object, LazyLayoutItemAnimator<T>.ItemInfo> keyToItemInfoMap = ScatterMapKt.mutableScatterMapOf();
    private final MutableScatterSet<Object> movingAwayKeys = ScatterSetKt.mutableScatterSetOf();
    private final List<T> movingInFromStartBound = new ArrayList();
    private final List<T> movingInFromEndBound = new ArrayList();
    private final List<T> movingAwayToStartBound = new ArrayList();
    private final List<T> movingAwayToEndBound = new ArrayList();
    private final List<LazyLayoutItemAnimation> disappearingItems = new ArrayList();
    private final Modifier modifier = new DisplayingDisappearingItemsElement(this);

    public static final class DisplayingDisappearingItemsElement extends ModifierNodeElement<DisplayingDisappearingItemsNode> {
        private final LazyLayoutItemAnimator<?> animator;

        public DisplayingDisappearingItemsElement(LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            this.animator = lazyLayoutItemAnimator;
        }

        private final LazyLayoutItemAnimator<?> component1() {
            return this.animator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DisplayingDisappearingItemsElement copy$default(DisplayingDisappearingItemsElement displayingDisappearingItemsElement, LazyLayoutItemAnimator lazyLayoutItemAnimator, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                lazyLayoutItemAnimator = displayingDisappearingItemsElement.animator;
            }
            return displayingDisappearingItemsElement.copy(lazyLayoutItemAnimator);
        }

        public final DisplayingDisappearingItemsElement copy(LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            return new DisplayingDisappearingItemsElement(lazyLayoutItemAnimator);
        }

        @Override // androidx.compose.p014ui.node.ModifierNodeElement
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DisplayingDisappearingItemsElement) && AbstractC9979u.m20289b(this.animator, ((DisplayingDisappearingItemsElement) obj).animator);
        }

        @Override // androidx.compose.p014ui.node.ModifierNodeElement
        public int hashCode() {
            return this.animator.hashCode();
        }

        @Override // androidx.compose.p014ui.node.ModifierNodeElement
        public void inspectableProperties(InspectorInfo inspectorInfo) {
            inspectorInfo.setName("DisplayingDisappearingItemsElement");
        }

        public String toString() {
            return "DisplayingDisappearingItemsElement(animator=" + this.animator + ')';
        }

        @Override // androidx.compose.p014ui.node.ModifierNodeElement
        public DisplayingDisappearingItemsNode create() {
            return new DisplayingDisappearingItemsNode(this.animator);
        }

        @Override // androidx.compose.p014ui.node.ModifierNodeElement
        public void update(DisplayingDisappearingItemsNode displayingDisappearingItemsNode) {
            displayingDisappearingItemsNode.setAnimator(this.animator);
        }
    }

    public static final class DisplayingDisappearingItemsNode extends Modifier.Node implements DrawModifierNode {
        private LazyLayoutItemAnimator<?> animator;

        public DisplayingDisappearingItemsNode(LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            this.animator = lazyLayoutItemAnimator;
        }

        private final LazyLayoutItemAnimator<?> component1() {
            return this.animator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DisplayingDisappearingItemsNode copy$default(DisplayingDisappearingItemsNode displayingDisappearingItemsNode, LazyLayoutItemAnimator lazyLayoutItemAnimator, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                lazyLayoutItemAnimator = displayingDisappearingItemsNode.animator;
            }
            return displayingDisappearingItemsNode.copy(lazyLayoutItemAnimator);
        }

        public final DisplayingDisappearingItemsNode copy(LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            return new DisplayingDisappearingItemsNode(lazyLayoutItemAnimator);
        }

        @Override // androidx.compose.p014ui.node.DrawModifierNode
        public void draw(ContentDrawScope contentDrawScope) {
            List list = ((LazyLayoutItemAnimator) this.animator).disappearingItems;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                LazyLayoutItemAnimation lazyLayoutItemAnimation = (LazyLayoutItemAnimation) list.get(i10);
                GraphicsLayer layer = lazyLayoutItemAnimation.getLayer();
                if (layer != null) {
                    float fM33629getXimpl = IntOffset.m33629getXimpl(lazyLayoutItemAnimation.m27618getFinalOffsetnOccac());
                    float fM33629getXimpl2 = fM33629getXimpl - IntOffset.m33629getXimpl(layer.m31522getTopLeftnOccac());
                    float fM33630getYimpl = IntOffset.m33630getYimpl(lazyLayoutItemAnimation.m27618getFinalOffsetnOccac()) - IntOffset.m33630getYimpl(layer.m31522getTopLeftnOccac());
                    contentDrawScope.getDrawContext().getTransform().translate(fM33629getXimpl2, fM33630getYimpl);
                    try {
                        GraphicsLayerKt.drawLayer(contentDrawScope, layer);
                    } finally {
                        contentDrawScope.getDrawContext().getTransform().translate(-fM33629getXimpl2, -fM33630getYimpl);
                    }
                }
            }
            contentDrawScope.drawContent();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DisplayingDisappearingItemsNode) && AbstractC9979u.m20289b(this.animator, ((DisplayingDisappearingItemsNode) obj).animator);
        }

        public int hashCode() {
            return this.animator.hashCode();
        }

        @Override // androidx.compose.ui.Modifier.Node
        public void onAttach() {
            ((LazyLayoutItemAnimator) this.animator).displayingNode = this;
        }

        @Override // androidx.compose.ui.Modifier.Node
        public void onDetach() {
            this.animator.reset();
        }

        public final void setAnimator(LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            if (AbstractC9979u.m20289b(this.animator, lazyLayoutItemAnimator) || !getNode().isAttached()) {
                return;
            }
            this.animator.reset();
            ((LazyLayoutItemAnimator) lazyLayoutItemAnimator).displayingNode = this;
            this.animator = lazyLayoutItemAnimator;
        }

        public String toString() {
            return "DisplayingDisappearingItemsNode(animator=" + this.animator + ')';
        }
    }

    public final class ItemInfo {
        private Constraints constraints;
        private int crossAxisOffset;
        private int lane;
        private int layoutMaxOffset;
        private int layoutMinOffset;
        private LazyLayoutItemAnimation[] animations = LazyLayoutItemAnimatorKt.EmptyArray;
        private int span = 1;

        public ItemInfo() {
        }

        private final boolean isRunningPlacement() {
            for (LazyLayoutItemAnimation lazyLayoutItemAnimation : this.animations) {
                if (lazyLayoutItemAnimation != null && lazyLayoutItemAnimation.isRunningMovingAwayAnimation()) {
                    return true;
                }
            }
            return false;
        }

        public static /* synthetic */ void updateAnimation$default(ItemInfo itemInfo, LazyLayoutMeasuredItem lazyLayoutMeasuredItem, InterfaceC11122i0 interfaceC11122i0, GraphicsContext graphicsContext, int i10, int i11, int i12, int i13, Object obj) {
            if ((i13 & 32) != 0) {
                i12 = LazyLayoutItemAnimator.this.getCrossAxisOffset(lazyLayoutMeasuredItem);
            }
            itemInfo.updateAnimation(lazyLayoutMeasuredItem, interfaceC11122i0, graphicsContext, i10, i11, i12);
        }

        public final LazyLayoutItemAnimation[] getAnimations() {
            return this.animations;
        }

        /* renamed from: getConstraints-DWUhwKw, reason: not valid java name */
        public final Constraints m27628getConstraintsDWUhwKw() {
            return this.constraints;
        }

        public final int getCrossAxisOffset() {
            return this.crossAxisOffset;
        }

        public final int getLane() {
            return this.lane;
        }

        public final int getLayoutMaxOffset() {
            return this.layoutMaxOffset;
        }

        public final int getLayoutMinOffset() {
            return this.layoutMinOffset;
        }

        public final int getSpan() {
            return this.span;
        }

        /* renamed from: setConstraints-_Sx5XlM, reason: not valid java name */
        public final void m27629setConstraints_Sx5XlM(Constraints constraints) {
            this.constraints = constraints;
        }

        public final void setCrossAxisOffset(int i10) {
            this.crossAxisOffset = i10;
        }

        public final void setLane(int i10) {
            this.lane = i10;
        }

        public final void setSpan(int i10) {
            this.span = i10;
        }

        public final void updateAnimation(T t10, InterfaceC11122i0 interfaceC11122i0, GraphicsContext graphicsContext, int i10, int i11, int i12) {
            if (!isRunningPlacement()) {
                this.layoutMinOffset = i10;
                this.layoutMaxOffset = i11;
            }
            int length = this.animations.length;
            for (int placeablesCount = t10.getPlaceablesCount(); placeablesCount < length; placeablesCount++) {
                LazyLayoutItemAnimation lazyLayoutItemAnimation = this.animations[placeablesCount];
                if (lazyLayoutItemAnimation != null) {
                    lazyLayoutItemAnimation.release();
                }
            }
            if (this.animations.length != t10.getPlaceablesCount()) {
                Object[] objArrCopyOf = Arrays.copyOf(this.animations, t10.getPlaceablesCount());
                AbstractC9979u.m20293f(objArrCopyOf, "copyOf(...)");
                this.animations = (LazyLayoutItemAnimation[]) objArrCopyOf;
            }
            this.constraints = Constraints.m33441boximpl(t10.mo27571getConstraintsmsEJaDk());
            this.crossAxisOffset = i12;
            this.lane = t10.getLane();
            this.span = t10.getSpan();
            int placeablesCount2 = t10.getPlaceablesCount();
            final LazyLayoutItemAnimator<T> lazyLayoutItemAnimator = LazyLayoutItemAnimator.this;
            for (int i13 = 0; i13 < placeablesCount2; i13++) {
                LazyLayoutAnimationSpecsNode specs = LazyLayoutItemAnimatorKt.getSpecs(t10.getParentData(i13));
                if (specs == null) {
                    LazyLayoutItemAnimation lazyLayoutItemAnimation2 = this.animations[i13];
                    if (lazyLayoutItemAnimation2 != null) {
                        lazyLayoutItemAnimation2.release();
                    }
                    this.animations[i13] = null;
                } else {
                    LazyLayoutItemAnimation lazyLayoutItemAnimation3 = this.animations[i13];
                    if (lazyLayoutItemAnimation3 == null) {
                        lazyLayoutItemAnimation3 = new LazyLayoutItemAnimation(interfaceC11122i0, graphicsContext, new InterfaceC9529a() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$ItemInfo$updateAnimation$1$animation$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m27630invoke() {
                                DrawModifierNode drawModifierNode = ((LazyLayoutItemAnimator) lazyLayoutItemAnimator).displayingNode;
                                if (drawModifierNode != null) {
                                    DrawModifierNodeKt.invalidateDraw(drawModifierNode);
                                }
                            }

                            @Override // p181hd.InterfaceC9529a
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m27630invoke();
                                return C10786q.f26013a;
                            }
                        });
                        this.animations[i13] = lazyLayoutItemAnimation3;
                    }
                    lazyLayoutItemAnimation3.setFadeInSpec(specs.getFadeInSpec());
                    lazyLayoutItemAnimation3.setPlacementSpec(specs.getPlacementSpec());
                    lazyLayoutItemAnimation3.setFadeOutSpec(specs.getFadeOutSpec());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getCrossAxisOffset(LazyLayoutMeasuredItem lazyLayoutMeasuredItem) {
        long jMo27572getOffsetBjo55l4 = lazyLayoutMeasuredItem.mo27572getOffsetBjo55l4(0);
        return !lazyLayoutMeasuredItem.isVertical() ? IntOffset.m33630getYimpl(jMo27572getOffsetBjo55l4) : IntOffset.m33629getXimpl(jMo27572getOffsetBjo55l4);
    }

    private final boolean getHasAnimations(T t10) {
        int placeablesCount = t10.getPlaceablesCount();
        for (int i10 = 0; i10 < placeablesCount; i10++) {
            if (LazyLayoutItemAnimatorKt.getSpecs(t10.getParentData(i10)) != null) {
                return true;
            }
        }
        return false;
    }

    private final int getMainAxisOffset(LazyLayoutMeasuredItem lazyLayoutMeasuredItem) {
        long jMo27572getOffsetBjo55l4 = lazyLayoutMeasuredItem.mo27572getOffsetBjo55l4(0);
        return lazyLayoutMeasuredItem.isVertical() ? IntOffset.m33630getYimpl(jMo27572getOffsetBjo55l4) : IntOffset.m33629getXimpl(jMo27572getOffsetBjo55l4);
    }

    private final void initializeAnimation(T t10, int i10, LazyLayoutItemAnimator<T>.ItemInfo itemInfo) {
        int i11 = 0;
        long jMo27572getOffsetBjo55l4 = t10.mo27572getOffsetBjo55l4(0);
        long jM33625copyiSbpLlY$default = t10.isVertical() ? IntOffset.m33625copyiSbpLlY$default(jMo27572getOffsetBjo55l4, 0, i10, 1, null) : IntOffset.m33625copyiSbpLlY$default(jMo27572getOffsetBjo55l4, i10, 0, 2, null);
        LazyLayoutItemAnimation[] animations = itemInfo.getAnimations();
        int length = animations.length;
        int i12 = 0;
        while (i11 < length) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = animations[i11];
            int i13 = i12 + 1;
            if (lazyLayoutItemAnimation != null) {
                lazyLayoutItemAnimation.m27624setRawOffsetgyyYBs(IntOffset.m33633plusqkQi6aY(jM33625copyiSbpLlY$default, IntOffset.m33632minusqkQi6aY(t10.mo27572getOffsetBjo55l4(i12), jMo27572getOffsetBjo55l4)));
            }
            i11++;
            i12 = i13;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void initializeAnimation$default(LazyLayoutItemAnimator lazyLayoutItemAnimator, LazyLayoutMeasuredItem lazyLayoutMeasuredItem, int i10, ItemInfo itemInfo, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            LazyLayoutItemAnimator<T>.ItemInfo itemInfo2 = lazyLayoutItemAnimator.keyToItemInfoMap.get(lazyLayoutMeasuredItem.getKey());
            AbstractC9979u.m20291d(itemInfo2);
            itemInfo = itemInfo2;
        }
        lazyLayoutItemAnimator.initializeAnimation(lazyLayoutMeasuredItem, i10, itemInfo);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void releaseAnimations() {
        /*
            r14 = this;
            androidx.collection.MutableScatterMap<java.lang.Object, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<T>$ItemInfo> r0 = r14.keyToItemInfoMap
            boolean r0 = r0.isNotEmpty()
            if (r0 == 0) goto L63
            androidx.collection.MutableScatterMap<java.lang.Object, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<T>$ItemInfo> r0 = r14.keyToItemInfoMap
            java.lang.Object[] r1 = r0.values
            long[] r0 = r0.metadata
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L5e
            r3 = 0
            r4 = r3
        L15:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L59
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L2f:
            if (r9 >= r7) goto L57
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L53
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$ItemInfo r10 = (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.ItemInfo) r10
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation[] r10 = r10.getAnimations()
            int r11 = r10.length
            r12 = r3
        L47:
            if (r12 >= r11) goto L53
            r13 = r10[r12]
            if (r13 == 0) goto L50
            r13.release()
        L50:
            int r12 = r12 + 1
            goto L47
        L53:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L2f
        L57:
            if (r7 != r8) goto L5e
        L59:
            if (r4 == r2) goto L5e
            int r4 = r4 + 1
            goto L15
        L5e:
            androidx.collection.MutableScatterMap<java.lang.Object, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<T>$ItemInfo> r0 = r14.keyToItemInfoMap
            r0.clear()
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.releaseAnimations():void");
    }

    private final void removeInfoForKey(Object obj) {
        LazyLayoutItemAnimation[] animations;
        LazyLayoutItemAnimator<T>.ItemInfo itemInfoRemove = this.keyToItemInfoMap.remove(obj);
        if (itemInfoRemove == null || (animations = itemInfoRemove.getAnimations()) == null) {
            return;
        }
        for (LazyLayoutItemAnimation lazyLayoutItemAnimation : animations) {
            if (lazyLayoutItemAnimation != null) {
                lazyLayoutItemAnimation.release();
            }
        }
    }

    private final void startPlacementAnimationsIfNeeded(T t10, boolean z10) {
        LazyLayoutItemAnimator<T>.ItemInfo itemInfo = this.keyToItemInfoMap.get(t10.getKey());
        AbstractC9979u.m20291d(itemInfo);
        LazyLayoutItemAnimation[] animations = itemInfo.getAnimations();
        int length = animations.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = animations[i10];
            int i12 = i11 + 1;
            if (lazyLayoutItemAnimation != null) {
                long jMo27572getOffsetBjo55l4 = t10.mo27572getOffsetBjo55l4(i11);
                long jM27621getRawOffsetnOccac = lazyLayoutItemAnimation.m27621getRawOffsetnOccac();
                if (!IntOffset.m33628equalsimpl0(jM27621getRawOffsetnOccac, LazyLayoutItemAnimation.Companion.m27626getNotInitializednOccac()) && !IntOffset.m33628equalsimpl0(jM27621getRawOffsetnOccac, jMo27572getOffsetBjo55l4)) {
                    lazyLayoutItemAnimation.m27617animatePlacementDeltaar5cAso(IntOffset.m33632minusqkQi6aY(jMo27572getOffsetBjo55l4, jM27621getRawOffsetnOccac), z10);
                }
                lazyLayoutItemAnimation.m27624setRawOffsetgyyYBs(jMo27572getOffsetBjo55l4);
            }
            i10++;
            i11 = i12;
        }
    }

    public static /* synthetic */ void startPlacementAnimationsIfNeeded$default(LazyLayoutItemAnimator lazyLayoutItemAnimator, LazyLayoutMeasuredItem lazyLayoutMeasuredItem, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        lazyLayoutItemAnimator.startPlacementAnimationsIfNeeded(lazyLayoutMeasuredItem, z10);
    }

    private final int updateAndReturnOffsetFor(int[] iArr, T t10) {
        int lane = t10.getLane();
        int span = t10.getSpan() + lane;
        int iMax = 0;
        while (lane < span) {
            int mainAxisSizeWithSpacings = iArr[lane] + t10.getMainAxisSizeWithSpacings();
            iArr[lane] = mainAxisSizeWithSpacings;
            iMax = Math.max(iMax, mainAxisSizeWithSpacings);
            lane++;
        }
        return iMax;
    }

    public final LazyLayoutItemAnimation getAnimation(Object obj, int i10) {
        LazyLayoutItemAnimation[] animations;
        LazyLayoutItemAnimator<T>.ItemInfo itemInfo = this.keyToItemInfoMap.get(obj);
        if (itemInfo == null || (animations = itemInfo.getAnimations()) == null) {
            return null;
        }
        return animations[i10];
    }

    /* renamed from: getMinSizeToFitDisappearingItems-YbymL2g, reason: not valid java name */
    public final long m27627getMinSizeToFitDisappearingItemsYbymL2g() {
        long jM33677getZeroYbymL2g = IntSize.Companion.m33677getZeroYbymL2g();
        List<LazyLayoutItemAnimation> list = this.disappearingItems;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = list.get(i10);
            GraphicsLayer layer = lazyLayoutItemAnimation.getLayer();
            if (layer != null) {
                jM33677getZeroYbymL2g = IntSize.m33667constructorimpl((Math.max((int) (jM33677getZeroYbymL2g & 4294967295L), IntOffset.m33630getYimpl(lazyLayoutItemAnimation.m27621getRawOffsetnOccac()) + ((int) (layer.m31520getSizeYbymL2g() & 4294967295L))) & 4294967295L) | (Math.max((int) (jM33677getZeroYbymL2g >> 32), IntOffset.m33629getXimpl(lazyLayoutItemAnimation.m27621getRawOffsetnOccac()) + ((int) (layer.m31520getSizeYbymL2g() >> 32))) << 32));
            }
        }
        return jM33677getZeroYbymL2g;
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasured(int r43, int r44, int r45, java.util.List<T> r46, final androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap r47, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider<T> r48, boolean r49, boolean r50, int r51, boolean r52, int r53, int r54, sd.InterfaceC11122i0 r55, androidx.compose.p014ui.graphics.GraphicsContext r56) {
        /*
            Method dump skipped, instructions count: 1377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.onMeasured(int, int, int, java.util.List, androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider, boolean, boolean, int, boolean, int, int, sd.i0, androidx.compose.ui.graphics.GraphicsContext):void");
    }

    public final void reset() {
        releaseAnimations();
        this.keyIndexMap = null;
        this.firstVisibleIndex = -1;
    }
}
