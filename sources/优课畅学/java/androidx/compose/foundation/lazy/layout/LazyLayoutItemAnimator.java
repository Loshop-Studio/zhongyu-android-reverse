package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterMapKt;
import androidx.collection.ScatterSetKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.graphics.GraphicsContext;
import androidx.compose.p013ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p013ui.graphics.layer.GraphicsLayer;
import androidx.compose.p013ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.p013ui.node.DrawModifierNode;
import androidx.compose.p013ui.node.DrawModifierNodeKt;
import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p134i7.AbstractC8772c0;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8797p;
import p134i7.AbstractC8816z;
import p135i8.InterfaceC8822b0;
import p168l7.AbstractC9260b;
import p300x7.InterfaceC10559a;

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

        @Override // androidx.compose.p013ui.node.ModifierNodeElement
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DisplayingDisappearingItemsElement) && AbstractC9133u.m16128b(this.animator, ((DisplayingDisappearingItemsElement) obj).animator);
        }

        @Override // androidx.compose.p013ui.node.ModifierNodeElement
        public int hashCode() {
            return this.animator.hashCode();
        }

        @Override // androidx.compose.p013ui.node.ModifierNodeElement
        public void inspectableProperties(InspectorInfo inspectorInfo) {
            inspectorInfo.setName("DisplayingDisappearingItemsElement");
        }

        public String toString() {
            return "DisplayingDisappearingItemsElement(animator=" + this.animator + ')';
        }

        @Override // androidx.compose.p013ui.node.ModifierNodeElement
        public DisplayingDisappearingItemsNode create() {
            return new DisplayingDisappearingItemsNode(this.animator);
        }

        @Override // androidx.compose.p013ui.node.ModifierNodeElement
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

        @Override // androidx.compose.p013ui.node.DrawModifierNode
        public void draw(ContentDrawScope contentDrawScope) {
            List list = ((LazyLayoutItemAnimator) this.animator).disappearingItems;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                LazyLayoutItemAnimation lazyLayoutItemAnimation = (LazyLayoutItemAnimation) list.get(i10);
                GraphicsLayer layer = lazyLayoutItemAnimation.getLayer();
                if (layer != null) {
                    float fM27027getXimpl = IntOffset.m27027getXimpl(lazyLayoutItemAnimation.m21016getFinalOffsetnOccac());
                    float fM27027getXimpl2 = fM27027getXimpl - IntOffset.m27027getXimpl(layer.m24920getTopLeftnOccac());
                    float fM27028getYimpl = IntOffset.m27028getYimpl(lazyLayoutItemAnimation.m21016getFinalOffsetnOccac()) - IntOffset.m27028getYimpl(layer.m24920getTopLeftnOccac());
                    contentDrawScope.getDrawContext().getTransform().translate(fM27027getXimpl2, fM27028getYimpl);
                    try {
                        GraphicsLayerKt.drawLayer(contentDrawScope, layer);
                    } finally {
                        contentDrawScope.getDrawContext().getTransform().translate(-fM27027getXimpl2, -fM27028getYimpl);
                    }
                }
            }
            contentDrawScope.drawContent();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DisplayingDisappearingItemsNode) && AbstractC9133u.m16128b(this.animator, ((DisplayingDisappearingItemsNode) obj).animator);
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
            if (AbstractC9133u.m16128b(this.animator, lazyLayoutItemAnimator) || !getNode().isAttached()) {
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

        public static /* synthetic */ void updateAnimation$default(ItemInfo itemInfo, LazyLayoutMeasuredItem lazyLayoutMeasuredItem, InterfaceC8822b0 interfaceC8822b0, GraphicsContext graphicsContext, int i10, int i11, int i12, int i13, Object obj) {
            if ((i13 & 32) != 0) {
                i12 = LazyLayoutItemAnimator.this.getCrossAxisOffset(lazyLayoutMeasuredItem);
            }
            itemInfo.updateAnimation(lazyLayoutMeasuredItem, interfaceC8822b0, graphicsContext, i10, i11, i12);
        }

        public final LazyLayoutItemAnimation[] getAnimations() {
            return this.animations;
        }

        /* renamed from: getConstraints-DWUhwKw, reason: not valid java name */
        public final Constraints m21026getConstraintsDWUhwKw() {
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
        public final void m21027setConstraints_Sx5XlM(Constraints constraints) {
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

        public final void updateAnimation(T t10, InterfaceC8822b0 interfaceC8822b0, GraphicsContext graphicsContext, int i10, int i11, int i12) {
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
                AbstractC9133u.m16132f(objArrCopyOf, "copyOf(...)");
                this.animations = (LazyLayoutItemAnimation[]) objArrCopyOf;
            }
            this.constraints = Constraints.m26839boximpl(t10.mo20969getConstraintsmsEJaDk());
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
                        lazyLayoutItemAnimation3 = new LazyLayoutItemAnimation(interfaceC8822b0, graphicsContext, new InterfaceC10559a() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$ItemInfo$updateAnimation$1$animation$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m21028invoke() {
                                DrawModifierNode drawModifierNode = ((LazyLayoutItemAnimator) lazyLayoutItemAnimator).displayingNode;
                                if (drawModifierNode != null) {
                                    DrawModifierNodeKt.invalidateDraw(drawModifierNode);
                                }
                            }

                            @Override // p300x7.InterfaceC10559a
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m21028invoke();
                                return C8736p.f16368a;
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
        long jMo20970getOffsetBjo55l4 = lazyLayoutMeasuredItem.mo20970getOffsetBjo55l4(0);
        return !lazyLayoutMeasuredItem.isVertical() ? IntOffset.m27028getYimpl(jMo20970getOffsetBjo55l4) : IntOffset.m27027getXimpl(jMo20970getOffsetBjo55l4);
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
        long jMo20970getOffsetBjo55l4 = lazyLayoutMeasuredItem.mo20970getOffsetBjo55l4(0);
        return lazyLayoutMeasuredItem.isVertical() ? IntOffset.m27028getYimpl(jMo20970getOffsetBjo55l4) : IntOffset.m27027getXimpl(jMo20970getOffsetBjo55l4);
    }

    private final void initializeAnimation(T t10, int i10, LazyLayoutItemAnimator<T>.ItemInfo itemInfo) {
        int i11 = 0;
        long jMo20970getOffsetBjo55l4 = t10.mo20970getOffsetBjo55l4(0);
        long jM27023copyiSbpLlY$default = t10.isVertical() ? IntOffset.m27023copyiSbpLlY$default(jMo20970getOffsetBjo55l4, 0, i10, 1, null) : IntOffset.m27023copyiSbpLlY$default(jMo20970getOffsetBjo55l4, i10, 0, 2, null);
        LazyLayoutItemAnimation[] animations = itemInfo.getAnimations();
        int length = animations.length;
        int i12 = 0;
        while (i11 < length) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = animations[i11];
            int i13 = i12 + 1;
            if (lazyLayoutItemAnimation != null) {
                lazyLayoutItemAnimation.m21022setRawOffsetgyyYBs(IntOffset.m27031plusqkQi6aY(jM27023copyiSbpLlY$default, IntOffset.m27030minusqkQi6aY(t10.mo20970getOffsetBjo55l4(i12), jMo20970getOffsetBjo55l4)));
            }
            i11++;
            i12 = i13;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void initializeAnimation$default(LazyLayoutItemAnimator lazyLayoutItemAnimator, LazyLayoutMeasuredItem lazyLayoutMeasuredItem, int i10, ItemInfo itemInfo, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            LazyLayoutItemAnimator<T>.ItemInfo itemInfo2 = lazyLayoutItemAnimator.keyToItemInfoMap.get(lazyLayoutMeasuredItem.getKey());
            AbstractC9133u.m16130d(itemInfo2);
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
        AbstractC9133u.m16130d(itemInfo);
        LazyLayoutItemAnimation[] animations = itemInfo.getAnimations();
        int length = animations.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = animations[i10];
            int i12 = i11 + 1;
            if (lazyLayoutItemAnimation != null) {
                long jMo20970getOffsetBjo55l4 = t10.mo20970getOffsetBjo55l4(i11);
                long jM21019getRawOffsetnOccac = lazyLayoutItemAnimation.m21019getRawOffsetnOccac();
                if (!IntOffset.m27026equalsimpl0(jM21019getRawOffsetnOccac, LazyLayoutItemAnimation.Companion.m21024getNotInitializednOccac()) && !IntOffset.m27026equalsimpl0(jM21019getRawOffsetnOccac, jMo20970getOffsetBjo55l4)) {
                    lazyLayoutItemAnimation.m21015animatePlacementDeltaar5cAso(IntOffset.m27030minusqkQi6aY(jMo20970getOffsetBjo55l4, jM21019getRawOffsetnOccac), z10);
                }
                lazyLayoutItemAnimation.m21022setRawOffsetgyyYBs(jMo20970getOffsetBjo55l4);
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
    public final long m21025getMinSizeToFitDisappearingItemsYbymL2g() {
        long jM27075getZeroYbymL2g = IntSize.Companion.m27075getZeroYbymL2g();
        List<LazyLayoutItemAnimation> list = this.disappearingItems;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = list.get(i10);
            GraphicsLayer layer = lazyLayoutItemAnimation.getLayer();
            if (layer != null) {
                jM27075getZeroYbymL2g = IntSize.m27065constructorimpl((Math.max((int) (jM27075getZeroYbymL2g & 4294967295L), IntOffset.m27028getYimpl(lazyLayoutItemAnimation.m21019getRawOffsetnOccac()) + ((int) (layer.m24918getSizeYbymL2g() & 4294967295L))) & 4294967295L) | (Math.max((int) (jM27075getZeroYbymL2g >> 32), IntOffset.m27027getXimpl(lazyLayoutItemAnimation.m21019getRawOffsetnOccac()) + ((int) (layer.m24918getSizeYbymL2g() >> 32))) << 32));
            }
        }
        return jM27075getZeroYbymL2g;
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onMeasured(int i10, int i11, int i12, List<T> list, final LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap, LazyLayoutMeasuredItemProvider<T> lazyLayoutMeasuredItemProvider, boolean z10, boolean z11, int i13, boolean z12, int i14, int i15, InterfaceC8822b0 interfaceC8822b0, GraphicsContext graphicsContext) {
        int i16;
        int i17;
        int i18;
        int layoutMaxOffset;
        Object[] objArr;
        long[] jArr;
        int i19;
        Object[] objArr2;
        long[] jArr2;
        int i20;
        LazyLayoutItemAnimation[] lazyLayoutItemAnimationArr;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        long[] jArr3;
        long[] jArr4;
        int i26;
        int i27 = i13;
        final LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap2 = this.keyIndexMap;
        this.keyIndexMap = lazyLayoutKeyIndexMap;
        int size = list.size();
        int i28 = 0;
        while (true) {
            if (i28 >= size) {
                if (this.keyToItemInfoMap.isEmpty()) {
                    releaseAnimations();
                    return;
                }
            } else if (getHasAnimations(list.get(i28))) {
                break;
            } else {
                i28++;
            }
        }
        int i29 = this.firstVisibleIndex;
        LazyLayoutMeasuredItem lazyLayoutMeasuredItem = (LazyLayoutMeasuredItem) AbstractC8778f0.m14568n0(list);
        this.firstVisibleIndex = lazyLayoutMeasuredItem != null ? lazyLayoutMeasuredItem.getIndex() : 0;
        long jM27021constructorimpl = z10 ? IntOffset.m27021constructorimpl((i10 & 4294967295L) | (0 << 32)) : IntOffset.m27021constructorimpl((i10 << 32) | (0 & 4294967295L));
        boolean z13 = z11 || !z12;
        MutableScatterMap<Object, LazyLayoutItemAnimator<T>.ItemInfo> mutableScatterMap = this.keyToItemInfoMap;
        Object[] objArr3 = mutableScatterMap.keys;
        long[] jArr5 = mutableScatterMap.metadata;
        int length = jArr5.length - 2;
        if (length >= 0) {
            int i30 = 0;
            while (true) {
                long j10 = jArr5[i30];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i31 = 8 - ((~(i30 - length)) >>> 31);
                    int i32 = 0;
                    while (i32 < i31) {
                        if ((j10 & 255) < 128) {
                            jArr4 = jArr5;
                            i26 = i32;
                            this.movingAwayKeys.add(objArr3[(i30 << 3) + i32]);
                        } else {
                            jArr4 = jArr5;
                            i26 = i32;
                        }
                        j10 >>= 8;
                        i32 = i26 + 1;
                        jArr5 = jArr4;
                    }
                    jArr3 = jArr5;
                    if (i31 != 8) {
                        break;
                    }
                } else {
                    jArr3 = jArr5;
                }
                if (i30 == length) {
                    break;
                }
                i30++;
                jArr5 = jArr3;
            }
        }
        int size2 = list.size();
        int i33 = 0;
        while (i33 < size2) {
            T t10 = list.get(i33);
            this.movingAwayKeys.remove(t10.getKey());
            if (getHasAnimations(t10)) {
                LazyLayoutItemAnimator<T>.ItemInfo itemInfo = this.keyToItemInfoMap.get(t10.getKey());
                int index = lazyLayoutKeyIndexMap2 != null ? lazyLayoutKeyIndexMap2.getIndex(t10.getKey()) : -1;
                boolean z14 = index == -1 && lazyLayoutKeyIndexMap2 != null;
                if (itemInfo == null) {
                    LazyLayoutItemAnimator<T>.ItemInfo itemInfo2 = new ItemInfo();
                    ItemInfo.updateAnimation$default(itemInfo2, t10, interfaceC8822b0, graphicsContext, i14, i15, 0, 32, null);
                    i21 = size2;
                    this.keyToItemInfoMap.set(t10.getKey(), itemInfo2);
                    if (t10.getIndex() == index || index == -1) {
                        long jMo20970getOffsetBjo55l4 = t10.mo20970getOffsetBjo55l4(0);
                        initializeAnimation(t10, t10.isVertical() ? IntOffset.m27028getYimpl(jMo20970getOffsetBjo55l4) : IntOffset.m27027getXimpl(jMo20970getOffsetBjo55l4), itemInfo2);
                        if (z14) {
                            LazyLayoutItemAnimation[] animations = itemInfo2.getAnimations();
                            for (LazyLayoutItemAnimation lazyLayoutItemAnimation : animations) {
                                if (lazyLayoutItemAnimation != null) {
                                    lazyLayoutItemAnimation.animateAppearance();
                                    C8736p c8736p = C8736p.f16368a;
                                }
                            }
                        }
                    } else if (index < i29) {
                        this.movingInFromStartBound.add(t10);
                    } else {
                        this.movingInFromEndBound.add(t10);
                    }
                } else {
                    i21 = size2;
                    if (z13) {
                        ItemInfo.updateAnimation$default(itemInfo, t10, interfaceC8822b0, graphicsContext, i14, i15, 0, 32, null);
                        LazyLayoutItemAnimation[] animations2 = itemInfo.getAnimations();
                        int length2 = animations2.length;
                        int i34 = 0;
                        while (i34 < length2) {
                            LazyLayoutItemAnimation lazyLayoutItemAnimation2 = animations2[i34];
                            LazyLayoutItemAnimation[] lazyLayoutItemAnimationArr2 = animations2;
                            int i35 = i29;
                            if (lazyLayoutItemAnimation2 != null) {
                                i24 = i33;
                                i25 = length2;
                                if (!IntOffset.m27026equalsimpl0(lazyLayoutItemAnimation2.m21019getRawOffsetnOccac(), LazyLayoutItemAnimation.Companion.m21024getNotInitializednOccac())) {
                                    lazyLayoutItemAnimation2.m21022setRawOffsetgyyYBs(IntOffset.m27031plusqkQi6aY(lazyLayoutItemAnimation2.m21019getRawOffsetnOccac(), jM27021constructorimpl));
                                }
                            } else {
                                i24 = i33;
                                i25 = length2;
                            }
                            i34++;
                            animations2 = lazyLayoutItemAnimationArr2;
                            i29 = i35;
                            i33 = i24;
                            length2 = i25;
                        }
                        i22 = i29;
                        i23 = i33;
                        if (z14) {
                            for (LazyLayoutItemAnimation lazyLayoutItemAnimation3 : itemInfo.getAnimations()) {
                                if (lazyLayoutItemAnimation3 != null) {
                                    if (lazyLayoutItemAnimation3.isDisappearanceAnimationInProgress()) {
                                        this.disappearingItems.remove(lazyLayoutItemAnimation3);
                                        DrawModifierNode drawModifierNode = this.displayingNode;
                                        if (drawModifierNode != null) {
                                            DrawModifierNodeKt.invalidateDraw(drawModifierNode);
                                            C8736p c8736p2 = C8736p.f16368a;
                                        }
                                    }
                                    lazyLayoutItemAnimation3.animateAppearance();
                                }
                            }
                        }
                        startPlacementAnimationsIfNeeded$default(this, t10, false, 2, null);
                    }
                }
                i22 = i29;
                i23 = i33;
            } else {
                i21 = size2;
                i22 = i29;
                i23 = i33;
                removeInfoForKey(t10.getKey());
            }
            i33 = i23 + 1;
            i29 = i22;
            size2 = i21;
        }
        int i36 = 2;
        int[] iArr = new int[i27];
        if (!z13 || lazyLayoutKeyIndexMap2 == null) {
            i16 = 2;
        } else {
            if (this.movingInFromStartBound.isEmpty()) {
                i16 = 2;
            } else {
                List<T> list2 = this.movingInFromStartBound;
                if (list2.size() > 1) {
                    AbstractC8816z.m14795A(list2, new Comparator() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortByDescending$1
                        @Override // java.util.Comparator
                        public final int compare(T t11, T t12) {
                            return AbstractC9260b.m16977d(Integer.valueOf(lazyLayoutKeyIndexMap2.getIndex(((LazyLayoutMeasuredItem) t12).getKey())), Integer.valueOf(lazyLayoutKeyIndexMap2.getIndex(((LazyLayoutMeasuredItem) t11).getKey())));
                        }
                    });
                }
                List<T> list3 = this.movingInFromStartBound;
                int size3 = list3.size();
                int i37 = 0;
                while (i37 < size3) {
                    T t11 = list3.get(i37);
                    int i38 = i36;
                    initializeAnimation$default(this, t11, i14 - updateAndReturnOffsetFor(iArr, t11), null, 4, null);
                    startPlacementAnimationsIfNeeded$default(this, t11, false, i38, null);
                    i37++;
                    i36 = i38;
                }
                i16 = i36;
                AbstractC8797p.m14615E(iArr, 0, 0, 0, 6, null);
            }
            if (!this.movingInFromEndBound.isEmpty()) {
                List<T> list4 = this.movingInFromEndBound;
                if (list4.size() > 1) {
                    AbstractC8816z.m14795A(list4, new Comparator() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortBy$1
                        @Override // java.util.Comparator
                        public final int compare(T t12, T t13) {
                            return AbstractC9260b.m16977d(Integer.valueOf(lazyLayoutKeyIndexMap2.getIndex(((LazyLayoutMeasuredItem) t12).getKey())), Integer.valueOf(lazyLayoutKeyIndexMap2.getIndex(((LazyLayoutMeasuredItem) t13).getKey())));
                        }
                    });
                }
                List<T> list5 = this.movingInFromEndBound;
                int size4 = list5.size();
                for (int i39 = 0; i39 < size4; i39++) {
                    T t12 = list5.get(i39);
                    initializeAnimation$default(this, t12, (i15 + updateAndReturnOffsetFor(iArr, t12)) - t12.getMainAxisSizeWithSpacings(), null, 4, null);
                    startPlacementAnimationsIfNeeded$default(this, t12, false, i16, null);
                }
                AbstractC8797p.m14615E(iArr, 0, 0, 0, 6, null);
            }
        }
        MutableScatterSet<Object> mutableScatterSet = this.movingAwayKeys;
        Object[] objArr4 = mutableScatterSet.elements;
        long[] jArr6 = mutableScatterSet.metadata;
        int length3 = jArr6.length - i16;
        if (length3 >= 0) {
            int i40 = 0;
            while (true) {
                long j11 = jArr6[i40];
                long[] jArr7 = jArr6;
                Object[] objArr5 = objArr4;
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i41 = 8 - ((~(i40 - length3)) >>> 31);
                    int i42 = 0;
                    while (i42 < i41) {
                        if ((j11 & 255) < 128) {
                            Object obj = objArr5[(i40 << 3) + i42];
                            i19 = i42;
                            LazyLayoutItemAnimator<T>.ItemInfo itemInfo3 = this.keyToItemInfoMap.get(obj);
                            if (itemInfo3 != 0) {
                                objArr2 = objArr5;
                                int index2 = lazyLayoutKeyIndexMap.getIndex(obj);
                                jArr2 = jArr7;
                                itemInfo3.setSpan(Math.min(i27, itemInfo3.getSpan()));
                                itemInfo3.setLane(Math.min(i27 - itemInfo3.getSpan(), itemInfo3.getLane()));
                                if (index2 == -1) {
                                    LazyLayoutItemAnimation[] animations3 = itemInfo3.getAnimations();
                                    int length4 = animations3.length;
                                    int i43 = 0;
                                    boolean z15 = false;
                                    int i44 = 0;
                                    ItemInfo itemInfo4 = itemInfo3;
                                    while (i43 < length4) {
                                        ItemInfo itemInfo5 = itemInfo4;
                                        LazyLayoutItemAnimation lazyLayoutItemAnimation4 = animations3[i43];
                                        int i45 = i44 + 1;
                                        if (lazyLayoutItemAnimation4 != null) {
                                            if (lazyLayoutItemAnimation4.isDisappearanceAnimationInProgress()) {
                                                lazyLayoutItemAnimationArr = animations3;
                                            } else if (lazyLayoutItemAnimation4.isDisappearanceAnimationFinished()) {
                                                lazyLayoutItemAnimation4.release();
                                                itemInfo5.getAnimations()[i44] = null;
                                                lazyLayoutItemAnimationArr = animations3;
                                                this.disappearingItems.remove(lazyLayoutItemAnimation4);
                                                DrawModifierNode drawModifierNode2 = this.displayingNode;
                                                if (drawModifierNode2 != null) {
                                                    DrawModifierNodeKt.invalidateDraw(drawModifierNode2);
                                                    C8736p c8736p3 = C8736p.f16368a;
                                                }
                                            } else {
                                                lazyLayoutItemAnimationArr = animations3;
                                                if (lazyLayoutItemAnimation4.getLayer() != null) {
                                                    lazyLayoutItemAnimation4.animateDisappearance();
                                                }
                                                if (lazyLayoutItemAnimation4.isDisappearanceAnimationInProgress()) {
                                                    this.disappearingItems.add(lazyLayoutItemAnimation4);
                                                    DrawModifierNode drawModifierNode3 = this.displayingNode;
                                                    if (drawModifierNode3 != null) {
                                                        DrawModifierNodeKt.invalidateDraw(drawModifierNode3);
                                                        C8736p c8736p4 = C8736p.f16368a;
                                                    }
                                                } else {
                                                    lazyLayoutItemAnimation4.release();
                                                    itemInfo5.getAnimations()[i44] = null;
                                                    i43++;
                                                    i44 = i45;
                                                    animations3 = lazyLayoutItemAnimationArr;
                                                    itemInfo4 = itemInfo5;
                                                }
                                            }
                                            z15 = true;
                                        } else {
                                            lazyLayoutItemAnimationArr = animations3;
                                        }
                                        i43++;
                                        i44 = i45;
                                        animations3 = lazyLayoutItemAnimationArr;
                                        itemInfo4 = itemInfo5;
                                    }
                                    if (!z15) {
                                        removeInfoForKey(obj);
                                    }
                                } else {
                                    Constraints constraintsM21026getConstraintsDWUhwKw = itemInfo3.m21026getConstraintsDWUhwKw();
                                    AbstractC9133u.m16130d(constraintsM21026getConstraintsDWUhwKw);
                                    LazyLayoutMeasuredItem lazyLayoutMeasuredItemMo20972getAndMeasurehBUhpc = lazyLayoutMeasuredItemProvider.mo20972getAndMeasurehBUhpc(index2, itemInfo3.getLane(), itemInfo3.getSpan(), constraintsM21026getConstraintsDWUhwKw.m26858unboximpl());
                                    lazyLayoutMeasuredItemMo20972getAndMeasurehBUhpc.setNonScrollableItem(true);
                                    LazyLayoutItemAnimation[] animations4 = itemInfo3.getAnimations();
                                    int length5 = animations4.length;
                                    int i46 = 0;
                                    while (true) {
                                        if (i46 < length5) {
                                            LazyLayoutItemAnimation lazyLayoutItemAnimation5 = animations4[i46];
                                            int i47 = i46;
                                            if (lazyLayoutItemAnimation5 != null) {
                                                boolean zIsPlacementAnimationInProgress = lazyLayoutItemAnimation5.isPlacementAnimationInProgress();
                                                i20 = length5;
                                                if (zIsPlacementAnimationInProgress) {
                                                    break;
                                                }
                                            } else {
                                                i20 = length5;
                                            }
                                            i46 = i47 + 1;
                                            length5 = i20;
                                        } else if (lazyLayoutKeyIndexMap2 == null || index2 != lazyLayoutKeyIndexMap2.getIndex(obj)) {
                                            break;
                                        } else {
                                            removeInfoForKey(obj);
                                        }
                                    }
                                    itemInfo3.updateAnimation(lazyLayoutMeasuredItemMo20972getAndMeasurehBUhpc, interfaceC8822b0, graphicsContext, i14, i15, itemInfo3.getCrossAxisOffset());
                                    if (index2 < this.firstVisibleIndex) {
                                        this.movingAwayToStartBound.add(lazyLayoutMeasuredItemMo20972getAndMeasurehBUhpc);
                                    } else {
                                        this.movingAwayToEndBound.add(lazyLayoutMeasuredItemMo20972getAndMeasurehBUhpc);
                                    }
                                }
                            }
                            j11 >>= 8;
                            i27 = i13;
                            i42 = i19 + 1;
                            jArr7 = jArr2;
                            objArr5 = objArr2;
                        } else {
                            i19 = i42;
                        }
                        objArr2 = objArr5;
                        jArr2 = jArr7;
                        j11 >>= 8;
                        i27 = i13;
                        i42 = i19 + 1;
                        jArr7 = jArr2;
                        objArr5 = objArr2;
                    }
                    objArr = objArr5;
                    jArr = jArr7;
                    if (i41 != 8) {
                        break;
                    }
                } else {
                    objArr = objArr5;
                    jArr = jArr7;
                }
                if (i40 == length3) {
                    break;
                }
                i40++;
                objArr4 = objArr;
                i27 = i13;
                jArr6 = jArr;
            }
        }
        if (this.movingAwayToStartBound.isEmpty()) {
            i17 = i11;
            i18 = i12;
        } else {
            List<T> list6 = this.movingAwayToStartBound;
            if (list6.size() > 1) {
                AbstractC8816z.m14795A(list6, new Comparator() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortByDescending$2
                    @Override // java.util.Comparator
                    public final int compare(T t13, T t14) {
                        return AbstractC9260b.m16977d(Integer.valueOf(lazyLayoutKeyIndexMap.getIndex(((LazyLayoutMeasuredItem) t14).getKey())), Integer.valueOf(lazyLayoutKeyIndexMap.getIndex(((LazyLayoutMeasuredItem) t13).getKey())));
                    }
                });
            }
            List<T> list7 = this.movingAwayToStartBound;
            int size5 = list7.size();
            for (int i48 = 0; i48 < size5; i48++) {
                T t13 = list7.get(i48);
                LazyLayoutItemAnimator<T>.ItemInfo itemInfo6 = this.keyToItemInfoMap.get(t13.getKey());
                AbstractC9133u.m16130d(itemInfo6);
                LazyLayoutItemAnimator<T>.ItemInfo itemInfo7 = itemInfo6;
                t13.position((z11 ? getMainAxisOffset((LazyLayoutMeasuredItem) AbstractC8778f0.m14566l0(list)) : itemInfo7.getLayoutMinOffset()) - updateAndReturnOffsetFor(iArr, t13), itemInfo7.getCrossAxisOffset(), i11, i12);
                if (z13) {
                    startPlacementAnimationsIfNeeded(t13, true);
                }
            }
            i17 = i11;
            i18 = i12;
            AbstractC8797p.m14615E(iArr, 0, 0, 0, 6, null);
        }
        if (!this.movingAwayToEndBound.isEmpty()) {
            List<T> list8 = this.movingAwayToEndBound;
            if (list8.size() > 1) {
                AbstractC8816z.m14795A(list8, new Comparator() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortBy$2
                    @Override // java.util.Comparator
                    public final int compare(T t14, T t15) {
                        return AbstractC9260b.m16977d(Integer.valueOf(lazyLayoutKeyIndexMap.getIndex(((LazyLayoutMeasuredItem) t14).getKey())), Integer.valueOf(lazyLayoutKeyIndexMap.getIndex(((LazyLayoutMeasuredItem) t15).getKey())));
                    }
                });
            }
            List<T> list9 = this.movingAwayToEndBound;
            int size6 = list9.size();
            for (int i49 = 0; i49 < size6; i49++) {
                T t14 = list9.get(i49);
                LazyLayoutItemAnimator<T>.ItemInfo itemInfo8 = this.keyToItemInfoMap.get(t14.getKey());
                AbstractC9133u.m16130d(itemInfo8);
                LazyLayoutItemAnimator<T>.ItemInfo itemInfo9 = itemInfo8;
                int iUpdateAndReturnOffsetFor = updateAndReturnOffsetFor(iArr, t14);
                if (z11) {
                    LazyLayoutMeasuredItem lazyLayoutMeasuredItem2 = (LazyLayoutMeasuredItem) AbstractC8778f0.m14578x0(list);
                    layoutMaxOffset = getMainAxisOffset(lazyLayoutMeasuredItem2) + lazyLayoutMeasuredItem2.getMainAxisSizeWithSpacings();
                } else {
                    layoutMaxOffset = itemInfo9.getLayoutMaxOffset();
                }
                t14.position((layoutMaxOffset - t14.getMainAxisSizeWithSpacings()) + iUpdateAndReturnOffsetFor, itemInfo9.getCrossAxisOffset(), i17, i18);
                if (z13) {
                    startPlacementAnimationsIfNeeded(t14, true);
                }
            }
        }
        List<T> list10 = this.movingAwayToStartBound;
        AbstractC8772c0.m14510Z(list10);
        C8736p c8736p5 = C8736p.f16368a;
        list.addAll(0, list10);
        list.addAll(this.movingAwayToEndBound);
        this.movingInFromStartBound.clear();
        this.movingInFromEndBound.clear();
        this.movingAwayToStartBound.clear();
        this.movingAwayToEndBound.clear();
        this.movingAwayKeys.clear();
    }

    public final void reset() {
        releaseAnimations();
        this.keyIndexMap = null;
        this.firstVisibleIndex = -1;
    }
}
