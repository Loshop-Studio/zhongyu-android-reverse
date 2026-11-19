package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterMapKt;
import androidx.collection.ScatterSetKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.GraphicsContext;
import androidx.compose.p011ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p011ui.graphics.layer.GraphicsLayer;
import androidx.compose.p011ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.p011ui.node.DrawModifierNode;
import androidx.compose.p011ui.node.DrawModifierNodeKt;
import androidx.compose.p011ui.node.ModifierNodeElement;
import androidx.compose.p011ui.platform.InspectorInfo;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5802q;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5809x;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC6009v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p204y1.AbstractC6768a;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0003UVWB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0005J3\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f2\u0012\b\u0002\u0010\u000f\u001a\f0\u000eR\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00028\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\f*\u00020\u00162\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0089\u0001\u0010,\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 2\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\f2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u0007¢\u0006\u0004\b.\u0010\u0005J\u001f\u00101\u001a\u0004\u0018\u0001002\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\f¢\u0006\u0004\b1\u00102R*\u00104\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u000e\u0012\f0\u000eR\b\u0012\u0004\u0012\u00028\u00000\u0000038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u00106R\u0016\u00107\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0003098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010=R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010=R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010=R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u0002000\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010=R\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0017\u0010F\u001a\u00020E8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0018\u0010L\u001a\u00020\u0012*\u00028\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0018\u0010\r\u001a\u00020\f*\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0018\u0010P\u001a\u00020\f*\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010NR\u0017\u0010T\u001a\u00020Q8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bR\u0010S\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006X"}, m5110d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;", ExifInterface.GPS_DIRECTION_TRUE, "", "<init>", "()V", "key", "Ld6/s;", "removeInfoForKey", "(Ljava/lang/Object;)V", "releaseAnimations", "item", "", "mainAxisOffset", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;", "itemInfo", "initializeAnimation", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;ILandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;)V", "", "isMovingAway", "startPlacementAnimationsIfNeeded", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;Z)V", "", "updateAndReturnOffsetFor", "([ILandroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I", "consumedScroll", "layoutWidth", "layoutHeight", "", "positionedItems", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "keyIndexMap", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItemProvider;", "itemProvider", "isVertical", "isLookingAhead", "laneCount", "hasLookaheadOccurred", "layoutMinOffset", "layoutMaxOffset", "Lkotlinx/coroutines/v;", "coroutineScope", "Landroidx/compose/ui/graphics/GraphicsContext;", "graphicsContext", "onMeasured", "(IIILjava/util/List;Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItemProvider;ZZIZIILkotlinx/coroutines/v;Landroidx/compose/ui/graphics/GraphicsContext;)V", "reset", "placeableIndex", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "getAnimation", "(Ljava/lang/Object;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "Landroidx/collection/MutableScatterMap;", "keyToItemInfoMap", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "firstVisibleIndex", "I", "Landroidx/collection/MutableScatterSet;", "movingAwayKeys", "Landroidx/collection/MutableScatterSet;", "movingInFromStartBound", "Ljava/util/List;", "movingInFromEndBound", "movingAwayToStartBound", "movingAwayToEndBound", "disappearingItems", "Landroidx/compose/ui/node/DrawModifierNode;", "displayingNode", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "getHasAnimations", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)Z", "hasAnimations", "getMainAxisOffset", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I", "getCrossAxisOffset", "crossAxisOffset", "Landroidx/compose/ui/unit/IntSize;", "getMinSizeToFitDisappearingItems-YbymL2g", "()J", "minSizeToFitDisappearingItems", "DisplayingDisappearingItemsElement", "DisplayingDisappearingItemsNode", "ItemInfo", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLazyLayoutItemAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutItemAnimator.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 6 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 10 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 11 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 12 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n*L\n1#1,587:1\n102#2,2:588\n34#2,6:590\n104#2:596\n34#2,4:625\n39#2:636\n34#2,6:639\n34#2,6:647\n34#2,6:684\n34#2,6:692\n34#2,4:731\n39#2:741\n32#3:597\n32#3:599\n80#4:598\n80#4:600\n85#4:736\n90#4:738\n80#4:740\n365#5,3:601\n329#5,6:604\n339#5,3:611\n342#5,9:615\n368#5:624\n372#5,3:700\n329#5,6:703\n339#5,3:710\n342#5,2:714\n345#5,6:718\n375#5:724\n1399#6:610\n1270#6:614\n1399#6:663\n1270#6:667\n1399#6:709\n1270#6:713\n1#7:629\n13309#8,2:630\n13309#8,2:632\n13309#8,2:634\n13374#8,3:670\n12474#8,2:673\n13309#8,2:698\n13309#8,2:716\n13374#8,3:725\n13374#8,3:728\n1011#9,2:637\n1002#9,2:645\n1011#9,2:682\n1002#9,2:690\n231#10,3:653\n200#10,7:656\n211#10,3:664\n214#10,2:668\n217#10,6:675\n234#10:681\n54#11:735\n59#11:737\n30#12:739\n*S KotlinDebug\n*F\n+ 1 LazyLayoutItemAnimator.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator\n*L\n89#1:588,2\n89#1:590,6\n89#1:596\n113#1:625,4\n113#1:636\n189#1:639,6\n199#1:647,6\n289#1:684,6\n314#1:692,6\n433#1:731,4\n433#1:741\n102#1:597\n104#1:599\n102#1:598\n104#1:600\n438#1:736\n439#1:738\n437#1:740\n111#1:601,3\n111#1:604,6\n111#1:611,3\n111#1:615,9\n111#1:624\n368#1:700,3\n368#1:703,6\n368#1:710,3\n368#1:714,2\n368#1:718,6\n368#1:724\n111#1:610\n111#1:614\n210#1:663\n210#1:667\n368#1:709\n368#1:713\n145#1:630,2\n157#1:632,2\n166#1:634,2\n226#1:670,3\n264#1:673,2\n353#1:698,2\n369#1:716,2\n390#1:725,3\n401#1:728,3\n188#1:637,2\n198#1:645,2\n288#1:682,2\n313#1:690,2\n210#1:653,3\n210#1:656,7\n210#1:664,3\n210#1:668,2\n210#1:675,6\n210#1:681\n438#1:735\n439#1:737\n437#1:739\n*E\n"})
/* loaded from: classes.dex */
public final class LazyLayoutItemAnimator<T extends LazyLayoutMeasuredItem> {
    public static final int $stable = 8;

    @Nullable
    private DrawModifierNode displayingNode;
    private int firstVisibleIndex;

    @Nullable
    private LazyLayoutKeyIndexMap keyIndexMap;

    @NotNull
    private final MutableScatterMap<Object, LazyLayoutItemAnimator<T>.ItemInfo> keyToItemInfoMap = ScatterMapKt.mutableScatterMapOf();

    @NotNull
    private final MutableScatterSet<Object> movingAwayKeys = ScatterSetKt.mutableScatterSetOf();

    @NotNull
    private final List<T> movingInFromStartBound = new ArrayList();

    @NotNull
    private final List<T> movingInFromEndBound = new ArrayList();

    @NotNull
    private final List<T> movingAwayToStartBound = new ArrayList();

    @NotNull
    private final List<T> movingAwayToEndBound = new ArrayList();

    @NotNull
    private final List<LazyLayoutItemAnimation> disappearingItems = new ArrayList();

    @NotNull
    private final Modifier modifier = new DisplayingDisappearingItemsElement(this);

    @Metadata(m5109d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0003HÂ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\f*\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0012\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001f¨\u0006 "}, m5110d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsNode;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "animator", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)V", "component1", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "create", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsNode;", "node", "Ld6/s;", "update", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "copy", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsElement;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class DisplayingDisappearingItemsElement extends ModifierNodeElement<DisplayingDisappearingItemsNode> {

        @NotNull
        private final LazyLayoutItemAnimator<?> animator;

        public DisplayingDisappearingItemsElement(@NotNull LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            this.animator = lazyLayoutItemAnimator;
        }

        private final LazyLayoutItemAnimator<?> component1() {
            return this.animator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DisplayingDisappearingItemsElement copy$default(DisplayingDisappearingItemsElement displayingDisappearingItemsElement, LazyLayoutItemAnimator lazyLayoutItemAnimator, int i, Object obj) {
            if ((i & 1) != 0) {
                lazyLayoutItemAnimator = displayingDisappearingItemsElement.animator;
            }
            return displayingDisappearingItemsElement.copy(lazyLayoutItemAnimator);
        }

        @NotNull
        public final DisplayingDisappearingItemsElement copy(@NotNull LazyLayoutItemAnimator<?> animator) {
            return new DisplayingDisappearingItemsElement(animator);
        }

        @Override // androidx.compose.p011ui.node.ModifierNodeElement
        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DisplayingDisappearingItemsElement) && AbstractC5830k.m5325b(this.animator, ((DisplayingDisappearingItemsElement) other).animator);
        }

        @Override // androidx.compose.p011ui.node.ModifierNodeElement
        public int hashCode() {
            return this.animator.hashCode();
        }

        @Override // androidx.compose.p011ui.node.ModifierNodeElement
        public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
            inspectorInfo.setName("DisplayingDisappearingItemsElement");
        }

        @NotNull
        public String toString() {
            return "DisplayingDisappearingItemsElement(animator=" + this.animator + ')';
        }

        @Override // androidx.compose.p011ui.node.ModifierNodeElement
        @NotNull
        /* renamed from: create */
        public DisplayingDisappearingItemsNode getNode() {
            return new DisplayingDisappearingItemsNode(this.animator);
        }

        @Override // androidx.compose.p011ui.node.ModifierNodeElement
        public void update(@NotNull DisplayingDisappearingItemsNode node) {
            node.setAnimator(this.animator);
        }
    }

    @Metadata(m5109d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0003HÂ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\n2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0010\u0010\u0006J\u001e\u0010\u0011\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u001e¨\u0006\u001f"}, m5110d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "animator", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)V", "component1", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Ld6/s;", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "onAttach", "()V", "onDetach", "setAnimator", "copy", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsNode;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nLazyLayoutItemAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutItemAnimator.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsNode\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,587:1\n34#2,4:588\n39#2:599\n120#3,7:592\n*S KotlinDebug\n*F\n+ 1 LazyLayoutItemAnimator.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsNode\n*L\n552#1:588,4\n552#1:599\n556#1:592,7\n*E\n"})
    public static final /* data */ class DisplayingDisappearingItemsNode extends Modifier.Node implements DrawModifierNode {

        @NotNull
        private LazyLayoutItemAnimator<?> animator;

        public DisplayingDisappearingItemsNode(@NotNull LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            this.animator = lazyLayoutItemAnimator;
        }

        private final LazyLayoutItemAnimator<?> component1() {
            return this.animator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DisplayingDisappearingItemsNode copy$default(DisplayingDisappearingItemsNode displayingDisappearingItemsNode, LazyLayoutItemAnimator lazyLayoutItemAnimator, int i, Object obj) {
            if ((i & 1) != 0) {
                lazyLayoutItemAnimator = displayingDisappearingItemsNode.animator;
            }
            return displayingDisappearingItemsNode.copy(lazyLayoutItemAnimator);
        }

        @NotNull
        public final DisplayingDisappearingItemsNode copy(@NotNull LazyLayoutItemAnimator<?> animator) {
            return new DisplayingDisappearingItemsNode(animator);
        }

        @Override // androidx.compose.p011ui.node.DrawModifierNode
        public void draw(@NotNull ContentDrawScope contentDrawScope) {
            List list = ((LazyLayoutItemAnimator) this.animator).disappearingItems;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                LazyLayoutItemAnimation lazyLayoutItemAnimation = (LazyLayoutItemAnimation) list.get(i);
                GraphicsLayer layer = lazyLayoutItemAnimation.getLayer();
                if (layer != null) {
                    float fM13433getXimpl = IntOffset.m13433getXimpl(lazyLayoutItemAnimation.getFinalOffset());
                    float fM13433getXimpl2 = fM13433getXimpl - IntOffset.m13433getXimpl(layer.getTopLeft());
                    float fM13434getYimpl = IntOffset.m13434getYimpl(lazyLayoutItemAnimation.getFinalOffset()) - IntOffset.m13434getYimpl(layer.getTopLeft());
                    contentDrawScope.getDrawContext().getTransform().translate(fM13433getXimpl2, fM13434getYimpl);
                    try {
                        GraphicsLayerKt.drawLayer(contentDrawScope, layer);
                    } finally {
                        contentDrawScope.getDrawContext().getTransform().translate(-fM13433getXimpl2, -fM13434getYimpl);
                    }
                }
            }
            contentDrawScope.drawContent();
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DisplayingDisappearingItemsNode) && AbstractC5830k.m5325b(this.animator, ((DisplayingDisappearingItemsNode) other).animator);
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

        public final void setAnimator(@NotNull LazyLayoutItemAnimator<?> animator) {
            if (AbstractC5830k.m5325b(this.animator, animator) || !getNode().getIsAttached()) {
                return;
            }
            this.animator.reset();
            ((LazyLayoutItemAnimator) animator).displayingNode = this;
            this.animator = animator;
        }

        @NotNull
        public String toString() {
            return "DisplayingDisappearingItemsNode(animator=" + this.animator + ')';
        }
    }

    @Metadata(m5109d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fR4\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00102\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R*\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010#\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R\"\u0010&\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001e\u001a\u0004\b'\u0010 \"\u0004\b(\u0010\"R$\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b)\u0010 R$\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b*\u0010 R\u0014\u0010,\u001a\u00020+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006."}, m5110d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;", "", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)V", "positionedItem", "Lkotlinx/coroutines/v;", "coroutineScope", "Landroidx/compose/ui/graphics/GraphicsContext;", "graphicsContext", "", "layoutMinOffset", "layoutMaxOffset", "crossAxisOffset", "Ld6/s;", "updateAnimation", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;Lkotlinx/coroutines/v;Landroidx/compose/ui/graphics/GraphicsContext;III)V", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "<set-?>", "animations", "[Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "getAnimations", "()[Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "getConstraints-DWUhwKw", "()Landroidx/compose/ui/unit/Constraints;", "setConstraints-_Sx5XlM", "(Landroidx/compose/ui/unit/Constraints;)V", "I", "getCrossAxisOffset", "()I", "setCrossAxisOffset", "(I)V", "lane", "getLane", "setLane", "span", "getSpan", "setSpan", "getLayoutMinOffset", "getLayoutMaxOffset", "", "isRunningPlacement", "()Z", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nLazyLayoutItemAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutItemAnimator.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,587:1\n12474#2,2:588\n1#3:590\n*S KotlinDebug\n*F\n+ 1 LazyLayoutItemAnimator.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo\n*L\n479#1:588,2\n*E\n"})
    public final class ItemInfo {

        @Nullable
        private Constraints constraints;
        private int crossAxisOffset;
        private int lane;
        private int layoutMaxOffset;
        private int layoutMinOffset;

        @NotNull
        private LazyLayoutItemAnimation[] animations = LazyLayoutItemAnimatorKt.EmptyArray;
        private int span = 1;

        public ItemInfo() {
        }

        private final boolean isRunningPlacement() {
            for (LazyLayoutItemAnimation lazyLayoutItemAnimation : this.animations) {
                if (lazyLayoutItemAnimation != null && lazyLayoutItemAnimation.getIsRunningMovingAwayAnimation()) {
                    return true;
                }
            }
            return false;
        }

        public static /* synthetic */ void updateAnimation$default(ItemInfo itemInfo, LazyLayoutMeasuredItem lazyLayoutMeasuredItem, InterfaceC6009v interfaceC6009v, GraphicsContext graphicsContext, int i, int i8, int i9, int i10, Object obj) {
            if ((i10 & 32) != 0) {
                i9 = LazyLayoutItemAnimator.this.getCrossAxisOffset(lazyLayoutMeasuredItem);
            }
            itemInfo.updateAnimation(lazyLayoutMeasuredItem, interfaceC6009v, graphicsContext, i, i8, i9);
        }

        @NotNull
        public final LazyLayoutItemAnimation[] getAnimations() {
            return this.animations;
        }

        @Nullable
        /* renamed from: getConstraints-DWUhwKw, reason: not valid java name and from getter */
        public final Constraints getConstraints() {
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
        public final void m7433setConstraints_Sx5XlM(@Nullable Constraints constraints) {
            this.constraints = constraints;
        }

        public final void setCrossAxisOffset(int i) {
            this.crossAxisOffset = i;
        }

        public final void setLane(int i) {
            this.lane = i;
        }

        public final void setSpan(int i) {
            this.span = i;
        }

        public final void updateAnimation(@NotNull T positionedItem, @NotNull InterfaceC6009v coroutineScope, @NotNull GraphicsContext graphicsContext, int layoutMinOffset, int layoutMaxOffset, int crossAxisOffset) {
            if (!isRunningPlacement()) {
                this.layoutMinOffset = layoutMinOffset;
                this.layoutMaxOffset = layoutMaxOffset;
            }
            int length = this.animations.length;
            for (int placeablesCount = positionedItem.getPlaceablesCount(); placeablesCount < length; placeablesCount++) {
                LazyLayoutItemAnimation lazyLayoutItemAnimation = this.animations[placeablesCount];
                if (lazyLayoutItemAnimation != null) {
                    lazyLayoutItemAnimation.release();
                }
            }
            if (this.animations.length != positionedItem.getPlaceablesCount()) {
                Object[] objArrCopyOf = Arrays.copyOf(this.animations, positionedItem.getPlaceablesCount());
                AbstractC5830k.m5329f(objArrCopyOf, "copyOf(...)");
                this.animations = (LazyLayoutItemAnimation[]) objArrCopyOf;
            }
            this.constraints = Constraints.m13245boximpl(positionedItem.getConstraints());
            this.crossAxisOffset = crossAxisOffset;
            this.lane = positionedItem.getLane();
            this.span = positionedItem.getSpan();
            int placeablesCount2 = positionedItem.getPlaceablesCount();
            final LazyLayoutItemAnimator<T> lazyLayoutItemAnimator = LazyLayoutItemAnimator.this;
            for (int i = 0; i < placeablesCount2; i++) {
                LazyLayoutAnimationSpecsNode specs = LazyLayoutItemAnimatorKt.getSpecs(positionedItem.getParentData(i));
                if (specs == null) {
                    LazyLayoutItemAnimation lazyLayoutItemAnimation2 = this.animations[i];
                    if (lazyLayoutItemAnimation2 != null) {
                        lazyLayoutItemAnimation2.release();
                    }
                    this.animations[i] = null;
                } else {
                    LazyLayoutItemAnimation lazyLayoutItemAnimation3 = this.animations[i];
                    if (lazyLayoutItemAnimation3 == null) {
                        lazyLayoutItemAnimation3 = new LazyLayoutItemAnimation(coroutineScope, graphicsContext, new InterfaceC6469a() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$ItemInfo$updateAnimation$1$animation$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m7434invoke() {
                                DrawModifierNode drawModifierNode = ((LazyLayoutItemAnimator) lazyLayoutItemAnimator).displayingNode;
                                if (drawModifierNode != null) {
                                    DrawModifierNodeKt.invalidateDraw(drawModifierNode);
                                }
                            }

                            @Override // p152r6.InterfaceC6469a
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m7434invoke();
                                return C5443s.f8405a;
                            }
                        });
                        this.animations[i] = lazyLayoutItemAnimation3;
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
        long jMo7376getOffsetBjo55l4 = lazyLayoutMeasuredItem.mo7376getOffsetBjo55l4(0);
        return !lazyLayoutMeasuredItem.getIsVertical() ? IntOffset.m13434getYimpl(jMo7376getOffsetBjo55l4) : IntOffset.m13433getXimpl(jMo7376getOffsetBjo55l4);
    }

    private final boolean getHasAnimations(T t8) {
        int placeablesCount = t8.getPlaceablesCount();
        for (int i = 0; i < placeablesCount; i++) {
            if (LazyLayoutItemAnimatorKt.getSpecs(t8.getParentData(i)) != null) {
                return true;
            }
        }
        return false;
    }

    private final int getMainAxisOffset(LazyLayoutMeasuredItem lazyLayoutMeasuredItem) {
        long jMo7376getOffsetBjo55l4 = lazyLayoutMeasuredItem.mo7376getOffsetBjo55l4(0);
        return lazyLayoutMeasuredItem.getIsVertical() ? IntOffset.m13434getYimpl(jMo7376getOffsetBjo55l4) : IntOffset.m13433getXimpl(jMo7376getOffsetBjo55l4);
    }

    private final void initializeAnimation(T item, int mainAxisOffset, LazyLayoutItemAnimator<T>.ItemInfo itemInfo) {
        int i = 0;
        long jMo7376getOffsetBjo55l4 = item.mo7376getOffsetBjo55l4(0);
        long jM13429copyiSbpLlY$default = item.getIsVertical() ? IntOffset.m13429copyiSbpLlY$default(jMo7376getOffsetBjo55l4, 0, mainAxisOffset, 1, null) : IntOffset.m13429copyiSbpLlY$default(jMo7376getOffsetBjo55l4, mainAxisOffset, 0, 2, null);
        LazyLayoutItemAnimation[] animations = itemInfo.getAnimations();
        int length = animations.length;
        int i8 = 0;
        while (i < length) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = animations[i];
            int i9 = i8 + 1;
            if (lazyLayoutItemAnimation != null) {
                lazyLayoutItemAnimation.m7428setRawOffsetgyyYBs(IntOffset.m13437plusqkQi6aY(jM13429copyiSbpLlY$default, IntOffset.m13436minusqkQi6aY(item.mo7376getOffsetBjo55l4(i8), jMo7376getOffsetBjo55l4)));
            }
            i++;
            i8 = i9;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void initializeAnimation$default(LazyLayoutItemAnimator lazyLayoutItemAnimator, LazyLayoutMeasuredItem lazyLayoutMeasuredItem, int i, ItemInfo itemInfo, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            LazyLayoutItemAnimator<T>.ItemInfo itemInfo2 = lazyLayoutItemAnimator.keyToItemInfoMap.get(lazyLayoutMeasuredItem.getKey());
            AbstractC5830k.m5327d(itemInfo2);
            itemInfo = itemInfo2;
        }
        lazyLayoutItemAnimator.initializeAnimation(lazyLayoutMeasuredItem, i, itemInfo);
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

    private final void removeInfoForKey(Object key) {
        LazyLayoutItemAnimation[] animations;
        LazyLayoutItemAnimator<T>.ItemInfo itemInfoRemove = this.keyToItemInfoMap.remove(key);
        if (itemInfoRemove == null || (animations = itemInfoRemove.getAnimations()) == null) {
            return;
        }
        for (LazyLayoutItemAnimation lazyLayoutItemAnimation : animations) {
            if (lazyLayoutItemAnimation != null) {
                lazyLayoutItemAnimation.release();
            }
        }
    }

    private final void startPlacementAnimationsIfNeeded(T item, boolean isMovingAway) {
        LazyLayoutItemAnimator<T>.ItemInfo itemInfo = this.keyToItemInfoMap.get(item.getKey());
        AbstractC5830k.m5327d(itemInfo);
        LazyLayoutItemAnimation[] animations = itemInfo.getAnimations();
        int length = animations.length;
        int i = 0;
        int i8 = 0;
        while (i < length) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = animations[i];
            int i9 = i8 + 1;
            if (lazyLayoutItemAnimation != null) {
                long jMo7376getOffsetBjo55l4 = item.mo7376getOffsetBjo55l4(i8);
                long rawOffset = lazyLayoutItemAnimation.getRawOffset();
                if (!IntOffset.m13432equalsimpl0(rawOffset, LazyLayoutItemAnimation.INSTANCE.m7430getNotInitializednOccac()) && !IntOffset.m13432equalsimpl0(rawOffset, jMo7376getOffsetBjo55l4)) {
                    lazyLayoutItemAnimation.m7421animatePlacementDeltaar5cAso(IntOffset.m13436minusqkQi6aY(jMo7376getOffsetBjo55l4, rawOffset), isMovingAway);
                }
                lazyLayoutItemAnimation.m7428setRawOffsetgyyYBs(jMo7376getOffsetBjo55l4);
            }
            i++;
            i8 = i9;
        }
    }

    public static /* synthetic */ void startPlacementAnimationsIfNeeded$default(LazyLayoutItemAnimator lazyLayoutItemAnimator, LazyLayoutMeasuredItem lazyLayoutMeasuredItem, boolean z8, int i, Object obj) {
        if ((i & 2) != 0) {
            z8 = false;
        }
        lazyLayoutItemAnimator.startPlacementAnimationsIfNeeded(lazyLayoutMeasuredItem, z8);
    }

    private final int updateAndReturnOffsetFor(int[] iArr, T t8) {
        int lane = t8.getLane();
        int span = t8.getSpan() + lane;
        int iMax = 0;
        while (lane < span) {
            int mainAxisSizeWithSpacings = t8.getMainAxisSizeWithSpacings() + iArr[lane];
            iArr[lane] = mainAxisSizeWithSpacings;
            iMax = Math.max(iMax, mainAxisSizeWithSpacings);
            lane++;
        }
        return iMax;
    }

    @Nullable
    public final LazyLayoutItemAnimation getAnimation(@NotNull Object key, int placeableIndex) {
        LazyLayoutItemAnimation[] animations;
        LazyLayoutItemAnimator<T>.ItemInfo itemInfo = this.keyToItemInfoMap.get(key);
        if (itemInfo == null || (animations = itemInfo.getAnimations()) == null) {
            return null;
        }
        return animations[placeableIndex];
    }

    /* renamed from: getMinSizeToFitDisappearingItems-YbymL2g, reason: not valid java name */
    public final long m7431getMinSizeToFitDisappearingItemsYbymL2g() {
        long jM13481getZeroYbymL2g = IntSize.INSTANCE.m13481getZeroYbymL2g();
        List<LazyLayoutItemAnimation> list = this.disappearingItems;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = list.get(i);
            GraphicsLayer layer = lazyLayoutItemAnimation.getLayer();
            if (layer != null) {
                jM13481getZeroYbymL2g = IntSize.m13471constructorimpl((Math.max((int) (jM13481getZeroYbymL2g & 4294967295L), IntOffset.m13434getYimpl(lazyLayoutItemAnimation.getRawOffset()) + ((int) (layer.getSize() & 4294967295L))) & 4294967295L) | (Math.max((int) (jM13481getZeroYbymL2g >> 32), IntOffset.m13433getXimpl(lazyLayoutItemAnimation.getRawOffset()) + ((int) (layer.getSize() >> 32))) << 32));
            }
        }
        return jM13481getZeroYbymL2g;
    }

    @NotNull
    public final Modifier getModifier() {
        return this.modifier;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onMeasured(int consumedScroll, int layoutWidth, int layoutHeight, @NotNull List<T> positionedItems, @NotNull final LazyLayoutKeyIndexMap keyIndexMap, @NotNull LazyLayoutMeasuredItemProvider<T> itemProvider, boolean isVertical, boolean isLookingAhead, int laneCount, boolean hasLookaheadOccurred, int layoutMinOffset, int layoutMaxOffset, @NotNull InterfaceC6009v coroutineScope, @NotNull GraphicsContext graphicsContext) {
        int i;
        int i8;
        int i9;
        int layoutMaxOffset2;
        Object[] objArr;
        long[] jArr;
        int i10;
        Object[] objArr2;
        long[] jArr2;
        int i11;
        LazyLayoutItemAnimation[] lazyLayoutItemAnimationArr;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long[] jArr3;
        long[] jArr4;
        int i17;
        int i18 = laneCount;
        final LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap = this.keyIndexMap;
        this.keyIndexMap = keyIndexMap;
        int size = positionedItems.size();
        int i19 = 0;
        while (true) {
            if (i19 >= size) {
                if (this.keyToItemInfoMap.isEmpty()) {
                    releaseAnimations();
                    return;
                }
            } else if (getHasAnimations(positionedItems.get(i19))) {
                break;
            } else {
                i19++;
            }
        }
        int i20 = this.firstVisibleIndex;
        LazyLayoutMeasuredItem lazyLayoutMeasuredItem = (LazyLayoutMeasuredItem) AbstractC5805t.m5229i0(positionedItems);
        this.firstVisibleIndex = lazyLayoutMeasuredItem != null ? lazyLayoutMeasuredItem.getIndex() : 0;
        long jM13427constructorimpl = isVertical ? IntOffset.m13427constructorimpl((consumedScroll & 4294967295L) | (0 << 32)) : IntOffset.m13427constructorimpl((consumedScroll << 32) | (0 & 4294967295L));
        boolean z8 = isLookingAhead || !hasLookaheadOccurred;
        MutableScatterMap<Object, LazyLayoutItemAnimator<T>.ItemInfo> mutableScatterMap = this.keyToItemInfoMap;
        Object[] objArr3 = mutableScatterMap.keys;
        long[] jArr5 = mutableScatterMap.metadata;
        int length = jArr5.length - 2;
        if (length >= 0) {
            int i21 = 0;
            while (true) {
                long j7 = jArr5[i21];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i22 = 8 - ((~(i21 - length)) >>> 31);
                    int i23 = 0;
                    while (i23 < i22) {
                        if ((j7 & 255) < 128) {
                            jArr4 = jArr5;
                            i17 = i23;
                            this.movingAwayKeys.add(objArr3[(i21 << 3) + i23]);
                        } else {
                            jArr4 = jArr5;
                            i17 = i23;
                        }
                        j7 >>= 8;
                        i23 = i17 + 1;
                        jArr5 = jArr4;
                    }
                    jArr3 = jArr5;
                    if (i22 != 8) {
                        break;
                    }
                } else {
                    jArr3 = jArr5;
                }
                if (i21 == length) {
                    break;
                }
                i21++;
                jArr5 = jArr3;
            }
        }
        int size2 = positionedItems.size();
        int i24 = 0;
        while (i24 < size2) {
            T t8 = positionedItems.get(i24);
            this.movingAwayKeys.remove(t8.getKey());
            if (getHasAnimations(t8)) {
                LazyLayoutItemAnimator<T>.ItemInfo itemInfo = this.keyToItemInfoMap.get(t8.getKey());
                int index = lazyLayoutKeyIndexMap != null ? lazyLayoutKeyIndexMap.getIndex(t8.getKey()) : -1;
                boolean z9 = index == -1 && lazyLayoutKeyIndexMap != null;
                if (itemInfo == null) {
                    LazyLayoutItemAnimator<T>.ItemInfo itemInfo2 = new ItemInfo();
                    ItemInfo.updateAnimation$default(itemInfo2, t8, coroutineScope, graphicsContext, layoutMinOffset, layoutMaxOffset, 0, 32, null);
                    i12 = size2;
                    this.keyToItemInfoMap.set(t8.getKey(), itemInfo2);
                    if (t8.getIndex() == index || index == -1) {
                        long jMo7376getOffsetBjo55l4 = t8.mo7376getOffsetBjo55l4(0);
                        initializeAnimation(t8, t8.getIsVertical() ? IntOffset.m13434getYimpl(jMo7376getOffsetBjo55l4) : IntOffset.m13433getXimpl(jMo7376getOffsetBjo55l4), itemInfo2);
                        if (z9) {
                            LazyLayoutItemAnimation[] animations = itemInfo2.getAnimations();
                            for (LazyLayoutItemAnimation lazyLayoutItemAnimation : animations) {
                                if (lazyLayoutItemAnimation != null) {
                                    lazyLayoutItemAnimation.animateAppearance();
                                }
                            }
                        }
                    } else if (index < i20) {
                        this.movingInFromStartBound.add(t8);
                    } else {
                        this.movingInFromEndBound.add(t8);
                    }
                } else {
                    i12 = size2;
                    if (z8) {
                        ItemInfo.updateAnimation$default(itemInfo, t8, coroutineScope, graphicsContext, layoutMinOffset, layoutMaxOffset, 0, 32, null);
                        LazyLayoutItemAnimation[] animations2 = itemInfo.getAnimations();
                        int length2 = animations2.length;
                        int i25 = 0;
                        while (i25 < length2) {
                            LazyLayoutItemAnimation lazyLayoutItemAnimation2 = animations2[i25];
                            LazyLayoutItemAnimation[] lazyLayoutItemAnimationArr2 = animations2;
                            int i26 = i20;
                            if (lazyLayoutItemAnimation2 != null) {
                                i15 = i24;
                                i16 = length2;
                                if (!IntOffset.m13432equalsimpl0(lazyLayoutItemAnimation2.getRawOffset(), LazyLayoutItemAnimation.INSTANCE.m7430getNotInitializednOccac())) {
                                    lazyLayoutItemAnimation2.m7428setRawOffsetgyyYBs(IntOffset.m13437plusqkQi6aY(lazyLayoutItemAnimation2.getRawOffset(), jM13427constructorimpl));
                                }
                            } else {
                                i15 = i24;
                                i16 = length2;
                            }
                            i25++;
                            animations2 = lazyLayoutItemAnimationArr2;
                            i20 = i26;
                            i24 = i15;
                            length2 = i16;
                        }
                        i13 = i20;
                        i14 = i24;
                        if (z9) {
                            for (LazyLayoutItemAnimation lazyLayoutItemAnimation3 : itemInfo.getAnimations()) {
                                if (lazyLayoutItemAnimation3 != null) {
                                    if (lazyLayoutItemAnimation3.isDisappearanceAnimationInProgress()) {
                                        this.disappearingItems.remove(lazyLayoutItemAnimation3);
                                        DrawModifierNode drawModifierNode = this.displayingNode;
                                        if (drawModifierNode != null) {
                                            DrawModifierNodeKt.invalidateDraw(drawModifierNode);
                                        }
                                    }
                                    lazyLayoutItemAnimation3.animateAppearance();
                                }
                            }
                        }
                        startPlacementAnimationsIfNeeded$default(this, t8, false, 2, null);
                    }
                }
                i13 = i20;
                i14 = i24;
            } else {
                i12 = size2;
                i13 = i20;
                i14 = i24;
                removeInfoForKey(t8.getKey());
            }
            i24 = i14 + 1;
            i20 = i13;
            size2 = i12;
        }
        int i27 = 2;
        int[] iArr = new int[i18];
        if (!z8 || lazyLayoutKeyIndexMap == null) {
            i = 2;
        } else {
            if (this.movingInFromStartBound.isEmpty()) {
                i = 2;
            } else {
                List<T> list = this.movingInFromStartBound;
                if (list.size() > 1) {
                    AbstractC5809x.m5289Q(list, new Comparator() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortByDescending$1
                        @Override // java.util.Comparator
                        public final int compare(T t9, T t10) {
                            return AbstractC6768a.m6441f(Integer.valueOf(lazyLayoutKeyIndexMap.getIndex(((LazyLayoutMeasuredItem) t10).getKey())), Integer.valueOf(lazyLayoutKeyIndexMap.getIndex(((LazyLayoutMeasuredItem) t9).getKey())));
                        }
                    });
                }
                List<T> list2 = this.movingInFromStartBound;
                int size3 = list2.size();
                int i28 = 0;
                while (i28 < size3) {
                    T t9 = list2.get(i28);
                    int i29 = i27;
                    initializeAnimation$default(this, t9, layoutMinOffset - updateAndReturnOffsetFor(iArr, t9), null, 4, null);
                    startPlacementAnimationsIfNeeded$default(this, t9, false, i29, null);
                    i28++;
                    i27 = i29;
                }
                i = i27;
                AbstractC5802q.m5187N(iArr, 0, 0, 6);
            }
            if (!this.movingInFromEndBound.isEmpty()) {
                List<T> list3 = this.movingInFromEndBound;
                if (list3.size() > 1) {
                    AbstractC5809x.m5289Q(list3, new Comparator() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortBy$1
                        @Override // java.util.Comparator
                        public final int compare(T t10, T t11) {
                            return AbstractC6768a.m6441f(Integer.valueOf(lazyLayoutKeyIndexMap.getIndex(((LazyLayoutMeasuredItem) t10).getKey())), Integer.valueOf(lazyLayoutKeyIndexMap.getIndex(((LazyLayoutMeasuredItem) t11).getKey())));
                        }
                    });
                }
                List<T> list4 = this.movingInFromEndBound;
                int size4 = list4.size();
                for (int i30 = 0; i30 < size4; i30++) {
                    T t10 = list4.get(i30);
                    initializeAnimation$default(this, t10, (layoutMaxOffset + updateAndReturnOffsetFor(iArr, t10)) - t10.getMainAxisSizeWithSpacings(), null, 4, null);
                    startPlacementAnimationsIfNeeded$default(this, t10, false, i, null);
                }
                AbstractC5802q.m5187N(iArr, 0, 0, 6);
            }
        }
        MutableScatterSet<Object> mutableScatterSet = this.movingAwayKeys;
        Object[] objArr4 = mutableScatterSet.elements;
        long[] jArr6 = mutableScatterSet.metadata;
        int length3 = jArr6.length - i;
        if (length3 >= 0) {
            int i31 = 0;
            while (true) {
                long j8 = jArr6[i31];
                long[] jArr7 = jArr6;
                Object[] objArr5 = objArr4;
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i32 = 8 - ((~(i31 - length3)) >>> 31);
                    int i33 = 0;
                    while (i33 < i32) {
                        if ((j8 & 255) < 128) {
                            Object obj = objArr5[(i31 << 3) + i33];
                            i10 = i33;
                            LazyLayoutItemAnimator<T>.ItemInfo itemInfo3 = this.keyToItemInfoMap.get(obj);
                            if (itemInfo3 != 0) {
                                objArr2 = objArr5;
                                int index2 = keyIndexMap.getIndex(obj);
                                jArr2 = jArr7;
                                itemInfo3.setSpan(Math.min(i18, itemInfo3.getSpan()));
                                itemInfo3.setLane(Math.min(i18 - itemInfo3.getSpan(), itemInfo3.getLane()));
                                if (index2 == -1) {
                                    LazyLayoutItemAnimation[] animations3 = itemInfo3.getAnimations();
                                    int length4 = animations3.length;
                                    int i34 = 0;
                                    boolean z10 = false;
                                    int i35 = 0;
                                    ItemInfo itemInfo4 = itemInfo3;
                                    while (i34 < length4) {
                                        ItemInfo itemInfo5 = itemInfo4;
                                        LazyLayoutItemAnimation lazyLayoutItemAnimation4 = animations3[i34];
                                        int i36 = i35 + 1;
                                        if (lazyLayoutItemAnimation4 != null) {
                                            if (lazyLayoutItemAnimation4.isDisappearanceAnimationInProgress()) {
                                                lazyLayoutItemAnimationArr = animations3;
                                            } else if (lazyLayoutItemAnimation4.isDisappearanceAnimationFinished()) {
                                                lazyLayoutItemAnimation4.release();
                                                itemInfo5.getAnimations()[i35] = null;
                                                lazyLayoutItemAnimationArr = animations3;
                                                this.disappearingItems.remove(lazyLayoutItemAnimation4);
                                                DrawModifierNode drawModifierNode2 = this.displayingNode;
                                                if (drawModifierNode2 != null) {
                                                    DrawModifierNodeKt.invalidateDraw(drawModifierNode2);
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
                                                    }
                                                } else {
                                                    lazyLayoutItemAnimation4.release();
                                                    itemInfo5.getAnimations()[i35] = null;
                                                    i34++;
                                                    i35 = i36;
                                                    animations3 = lazyLayoutItemAnimationArr;
                                                    itemInfo4 = itemInfo5;
                                                }
                                            }
                                            z10 = true;
                                        } else {
                                            lazyLayoutItemAnimationArr = animations3;
                                        }
                                        i34++;
                                        i35 = i36;
                                        animations3 = lazyLayoutItemAnimationArr;
                                        itemInfo4 = itemInfo5;
                                    }
                                    if (!z10) {
                                        removeInfoForKey(obj);
                                    }
                                } else {
                                    Constraints constraints = itemInfo3.getConstraints();
                                    AbstractC5830k.m5327d(constraints);
                                    LazyLayoutMeasuredItem lazyLayoutMeasuredItemMo7378getAndMeasurehBUhpc = itemProvider.mo7378getAndMeasurehBUhpc(index2, itemInfo3.getLane(), itemInfo3.getSpan(), constraints.getValue());
                                    lazyLayoutMeasuredItemMo7378getAndMeasurehBUhpc.setNonScrollableItem(true);
                                    LazyLayoutItemAnimation[] animations4 = itemInfo3.getAnimations();
                                    int length5 = animations4.length;
                                    int i37 = 0;
                                    while (true) {
                                        if (i37 < length5) {
                                            LazyLayoutItemAnimation lazyLayoutItemAnimation5 = animations4[i37];
                                            int i38 = i37;
                                            if (lazyLayoutItemAnimation5 != null) {
                                                boolean zIsPlacementAnimationInProgress = lazyLayoutItemAnimation5.isPlacementAnimationInProgress();
                                                i11 = length5;
                                                if (zIsPlacementAnimationInProgress) {
                                                    break;
                                                }
                                            } else {
                                                i11 = length5;
                                            }
                                            i37 = i38 + 1;
                                            length5 = i11;
                                        } else if (lazyLayoutKeyIndexMap == null || index2 != lazyLayoutKeyIndexMap.getIndex(obj)) {
                                            break;
                                        } else {
                                            removeInfoForKey(obj);
                                        }
                                    }
                                    itemInfo3.updateAnimation(lazyLayoutMeasuredItemMo7378getAndMeasurehBUhpc, coroutineScope, graphicsContext, layoutMinOffset, layoutMaxOffset, itemInfo3.getCrossAxisOffset());
                                    if (index2 < this.firstVisibleIndex) {
                                        this.movingAwayToStartBound.add(lazyLayoutMeasuredItemMo7378getAndMeasurehBUhpc);
                                    } else {
                                        this.movingAwayToEndBound.add(lazyLayoutMeasuredItemMo7378getAndMeasurehBUhpc);
                                    }
                                }
                            }
                            j8 >>= 8;
                            i18 = laneCount;
                            i33 = i10 + 1;
                            objArr5 = objArr2;
                            jArr7 = jArr2;
                        } else {
                            i10 = i33;
                        }
                        objArr2 = objArr5;
                        jArr2 = jArr7;
                        j8 >>= 8;
                        i18 = laneCount;
                        i33 = i10 + 1;
                        objArr5 = objArr2;
                        jArr7 = jArr2;
                    }
                    objArr = objArr5;
                    jArr = jArr7;
                    if (i32 != 8) {
                        break;
                    }
                } else {
                    objArr = objArr5;
                    jArr = jArr7;
                }
                if (i31 == length3) {
                    break;
                }
                i31++;
                i18 = laneCount;
                objArr4 = objArr;
                jArr6 = jArr;
            }
        }
        if (this.movingAwayToStartBound.isEmpty()) {
            i8 = layoutWidth;
            i9 = layoutHeight;
        } else {
            List<T> list5 = this.movingAwayToStartBound;
            if (list5.size() > 1) {
                AbstractC5809x.m5289Q(list5, new Comparator() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortByDescending$2
                    @Override // java.util.Comparator
                    public final int compare(T t11, T t12) {
                        return AbstractC6768a.m6441f(Integer.valueOf(keyIndexMap.getIndex(((LazyLayoutMeasuredItem) t12).getKey())), Integer.valueOf(keyIndexMap.getIndex(((LazyLayoutMeasuredItem) t11).getKey())));
                    }
                });
            }
            List<T> list6 = this.movingAwayToStartBound;
            int size5 = list6.size();
            for (int i39 = 0; i39 < size5; i39++) {
                T t11 = list6.get(i39);
                LazyLayoutItemAnimator<T>.ItemInfo itemInfo6 = this.keyToItemInfoMap.get(t11.getKey());
                AbstractC5830k.m5327d(itemInfo6);
                LazyLayoutItemAnimator<T>.ItemInfo itemInfo7 = itemInfo6;
                t11.position((isLookingAhead ? getMainAxisOffset((LazyLayoutMeasuredItem) AbstractC5805t.m5228h0(positionedItems)) : itemInfo7.getLayoutMinOffset()) - updateAndReturnOffsetFor(iArr, t11), itemInfo7.getCrossAxisOffset(), layoutWidth, layoutHeight);
                if (z8) {
                    startPlacementAnimationsIfNeeded(t11, true);
                }
            }
            i8 = layoutWidth;
            i9 = layoutHeight;
            AbstractC5802q.m5187N(iArr, 0, 0, 6);
        }
        if (!this.movingAwayToEndBound.isEmpty()) {
            List<T> list7 = this.movingAwayToEndBound;
            if (list7.size() > 1) {
                AbstractC5809x.m5289Q(list7, new Comparator() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortBy$2
                    @Override // java.util.Comparator
                    public final int compare(T t12, T t13) {
                        return AbstractC6768a.m6441f(Integer.valueOf(keyIndexMap.getIndex(((LazyLayoutMeasuredItem) t12).getKey())), Integer.valueOf(keyIndexMap.getIndex(((LazyLayoutMeasuredItem) t13).getKey())));
                    }
                });
            }
            List<T> list8 = this.movingAwayToEndBound;
            int size6 = list8.size();
            for (int i40 = 0; i40 < size6; i40++) {
                T t12 = list8.get(i40);
                LazyLayoutItemAnimator<T>.ItemInfo itemInfo8 = this.keyToItemInfoMap.get(t12.getKey());
                AbstractC5830k.m5327d(itemInfo8);
                LazyLayoutItemAnimator<T>.ItemInfo itemInfo9 = itemInfo8;
                int iUpdateAndReturnOffsetFor = updateAndReturnOffsetFor(iArr, t12);
                if (isLookingAhead) {
                    LazyLayoutMeasuredItem lazyLayoutMeasuredItem2 = (LazyLayoutMeasuredItem) AbstractC5805t.m5235o0(positionedItems);
                    layoutMaxOffset2 = lazyLayoutMeasuredItem2.getMainAxisSizeWithSpacings() + getMainAxisOffset(lazyLayoutMeasuredItem2);
                } else {
                    layoutMaxOffset2 = itemInfo9.getLayoutMaxOffset();
                }
                t12.position((layoutMaxOffset2 - t12.getMainAxisSizeWithSpacings()) + iUpdateAndReturnOffsetFor, itemInfo9.getCrossAxisOffset(), i8, i9);
                if (z8) {
                    startPlacementAnimationsIfNeeded(t12, true);
                }
            }
        }
        List<T> list9 = this.movingAwayToStartBound;
        AbstractC5830k.m5330g(list9, "<this>");
        Collections.reverse(list9);
        positionedItems.addAll(0, list9);
        positionedItems.addAll(this.movingAwayToEndBound);
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
