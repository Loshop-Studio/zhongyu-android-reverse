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
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0003JKLB\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010(\u001a\u0004\u0018\u00010\u00072\u0006\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u000bJ1\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00028\u00002\u0006\u0010&\u001a\u00020\u000b2\u0012\b\u0002\u0010.\u001a\f0\u0010R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0002\u0010/J\u0082\u0001\u00100\u001a\u00020,2\u0006\u00101\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u000b2\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\f\u001a\u00020\r2\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u0000062\u0006\u00107\u001a\u00020#2\u0006\u00108\u001a\u00020#2\u0006\u00109\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020#2\u0006\u0010;\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@J\b\u0010A\u001a\u00020,H\u0002J\u0010\u0010B\u001a\u00020,2\u0006\u0010)\u001a\u00020\u0003H\u0002J\u0006\u0010C\u001a\u00020,J\u001f\u0010D\u001a\u00020,2\u0006\u0010-\u001a\u00028\u00002\b\b\u0002\u0010E\u001a\u00020#H\u0002¢\u0006\u0002\u0010FJ\u0019\u0010G\u001a\u00020\u000b*\u00020H2\u0006\u0010-\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010IR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u000e\u0012\f0\u0010R\b\u0012\u0004\u0012\u00028\u00000\u00000\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\u00020\u00128Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001f\u001a\u00020\u000b*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0018\u0010\"\u001a\u00020#*\u00028\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0018\u0010&\u001a\u00020\u000b*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010!\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006M"}, m13558d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;", "", "()V", "disappearingItems", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "displayingNode", "Landroidx/compose/ui/node/DrawModifierNode;", "firstVisibleIndex", "", "keyIndexMap", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "keyToItemInfoMap", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;", "minSizeToFitDisappearingItems", "Landroidx/compose/ui/unit/IntSize;", "getMinSizeToFitDisappearingItems-YbymL2g", "()J", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "movingAwayKeys", "Landroidx/collection/MutableScatterSet;", "movingAwayToEndBound", "movingAwayToStartBound", "movingInFromEndBound", "movingInFromStartBound", "crossAxisOffset", "getCrossAxisOffset", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I", "hasAnimations", "", "getHasAnimations", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)Z", "mainAxisOffset", "getMainAxisOffset", "getAnimation", "key", "placeableIndex", "initializeAnimation", "", "item", "itemInfo", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;ILandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;)V", "onMeasured", "consumedScroll", "layoutWidth", "layoutHeight", "positionedItems", "itemProvider", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItemProvider;", "isVertical", "isLookingAhead", "laneCount", "hasLookaheadOccurred", "layoutMinOffset", "layoutMaxOffset", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "graphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "releaseAnimations", "removeInfoForKey", "reset", "startPlacementAnimationsIfNeeded", "isMovingAway", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;Z)V", "updateAndReturnOffsetFor", "", "([ILandroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I", "DisplayingDisappearingItemsElement", "DisplayingDisappearingItemsNode", "ItemInfo", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nLazyLayoutItemAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutItemAnimator.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 6 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 10 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 11 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 12 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n*L\n1#1,587:1\n102#2,2:588\n34#2,6:590\n104#2:596\n34#2,4:625\n39#2:636\n34#2,6:639\n34#2,6:647\n34#2,6:684\n34#2,6:692\n34#2,4:731\n39#2:741\n32#3:597\n32#3:599\n80#4:598\n80#4:600\n85#4:736\n90#4:738\n80#4:740\n365#5,3:601\n329#5,6:604\n339#5,3:611\n342#5,9:615\n368#5:624\n372#5,3:700\n329#5,6:703\n339#5,3:710\n342#5,2:714\n345#5,6:718\n375#5:724\n1399#6:610\n1270#6:614\n1399#6:663\n1270#6:667\n1399#6:709\n1270#6:713\n1#7:629\n13309#8,2:630\n13309#8,2:632\n13309#8,2:634\n13374#8,3:670\n12474#8,2:673\n13309#8,2:698\n13309#8,2:716\n13374#8,3:725\n13374#8,3:728\n1011#9,2:637\n1002#9,2:645\n1011#9,2:682\n1002#9,2:690\n231#10,3:653\n200#10,7:656\n211#10,3:664\n214#10,2:668\n217#10,6:675\n234#10:681\n54#11:735\n59#11:737\n30#12:739\n*S KotlinDebug\n*F\n+ 1 LazyLayoutItemAnimator.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator\n*L\n89#1:588,2\n89#1:590,6\n89#1:596\n113#1:625,4\n113#1:636\n189#1:639,6\n199#1:647,6\n289#1:684,6\n314#1:692,6\n433#1:731,4\n433#1:741\n102#1:597\n104#1:599\n102#1:598\n104#1:600\n438#1:736\n439#1:738\n437#1:740\n111#1:601,3\n111#1:604,6\n111#1:611,3\n111#1:615,9\n111#1:624\n368#1:700,3\n368#1:703,6\n368#1:710,3\n368#1:714,2\n368#1:718,6\n368#1:724\n111#1:610\n111#1:614\n210#1:663\n210#1:667\n368#1:709\n368#1:713\n145#1:630,2\n157#1:632,2\n166#1:634,2\n226#1:670,3\n264#1:673,2\n353#1:698,2\n369#1:716,2\n390#1:725,3\n401#1:728,3\n188#1:637,2\n198#1:645,2\n288#1:682,2\n313#1:690,2\n210#1:653,3\n210#1:656,7\n210#1:664,3\n210#1:668,2\n210#1:675,6\n210#1:681\n438#1:735\n439#1:737\n437#1:739\n*E\n"})
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

    @Metadata(m13557d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0002\u0010\u0005J\r\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0004HÂ\u0003J\u0017\u0010\u0007\u001a\u00020\u00002\f\b\u0002\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004HÆ\u0001J\b\u0010\b\u001a\u00020\u0002H\u0016J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0016J\f\u0010\u0014\u001a\u00020\u0012*\u00020\u0015H\u0016R\u0012\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m13558d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsNode;", "animator", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)V", "component1", "copy", "create", "equals", "", "other", "", "hashCode", "", "toString", "", "update", "", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    public static final /* data */ class DisplayingDisappearingItemsElement extends ModifierNodeElement<DisplayingDisappearingItemsNode> {
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

        public final DisplayingDisappearingItemsElement copy(LazyLayoutItemAnimator<?> animator) {
            return new DisplayingDisappearingItemsElement(animator);
        }

        @Override // androidx.compose.p013ui.node.ModifierNodeElement
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DisplayingDisappearingItemsElement) && Intrinsics.areEqual(this.animator, ((DisplayingDisappearingItemsElement) other).animator);
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
        /* renamed from: create */
        public DisplayingDisappearingItemsNode getNode() {
            return new DisplayingDisappearingItemsNode(this.animator);
        }

        @Override // androidx.compose.p013ui.node.ModifierNodeElement
        public void update(DisplayingDisappearingItemsNode node) {
            node.setAnimator(this.animator);
        }
    }

    @Metadata(m13557d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0002\u0010\u0005J\r\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0004HÂ\u0003J\u0017\u0010\u0007\u001a\u00020\u00002\f\b\u0002\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004HÆ\u0001J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0012\u0010\u0011\u001a\u00020\u000f2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\f\u0010\u0014\u001a\u00020\u000f*\u00020\u0015H\u0016R\u0012\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m13558d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "animator", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)V", "component1", "copy", "equals", "", "other", "", "hashCode", "", "onAttach", "", "onDetach", "setAnimator", "toString", "", "draw", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    @SourceDebugExtension({"SMAP\nLazyLayoutItemAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutItemAnimator.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsNode\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,587:1\n34#2,4:588\n39#2:599\n120#3,7:592\n*S KotlinDebug\n*F\n+ 1 LazyLayoutItemAnimator.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsNode\n*L\n552#1:588,4\n552#1:599\n556#1:592,7\n*E\n"})
    public static final /* data */ class DisplayingDisappearingItemsNode extends Modifier.Node implements DrawModifierNode {
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

        public final DisplayingDisappearingItemsNode copy(LazyLayoutItemAnimator<?> animator) {
            return new DisplayingDisappearingItemsNode(animator);
        }

        @Override // androidx.compose.p013ui.node.DrawModifierNode
        public void draw(ContentDrawScope contentDrawScope) {
            List list = ((LazyLayoutItemAnimator) this.animator).disappearingItems;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                LazyLayoutItemAnimation lazyLayoutItemAnimation = (LazyLayoutItemAnimation) list.get(i10);
                GraphicsLayer layer = lazyLayoutItemAnimation.getLayer();
                if (layer != null) {
                    float fM23689getXimpl = IntOffset.m23689getXimpl(lazyLayoutItemAnimation.getFinalOffset());
                    float fM23689getXimpl2 = fM23689getXimpl - IntOffset.m23689getXimpl(layer.getTopLeft());
                    float fM23690getYimpl = IntOffset.m23690getYimpl(lazyLayoutItemAnimation.getFinalOffset()) - IntOffset.m23690getYimpl(layer.getTopLeft());
                    contentDrawScope.getDrawContext().getTransform().translate(fM23689getXimpl2, fM23690getYimpl);
                    try {
                        GraphicsLayerKt.drawLayer(contentDrawScope, layer);
                    } finally {
                        contentDrawScope.getDrawContext().getTransform().translate(-fM23689getXimpl2, -fM23690getYimpl);
                    }
                }
            }
            contentDrawScope.drawContent();
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DisplayingDisappearingItemsNode) && Intrinsics.areEqual(this.animator, ((DisplayingDisappearingItemsNode) other).animator);
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

        public final void setAnimator(LazyLayoutItemAnimator<?> animator) {
            if (Intrinsics.areEqual(this.animator, animator) || !getNode().getIsAttached()) {
                return;
            }
            this.animator.reset();
            ((LazyLayoutItemAnimator) animator).displayingNode = this;
            this.animator = animator;
        }

        public String toString() {
            return "DisplayingDisappearingItemsNode(animator=" + this.animator + ')';
        }
    }

    @Metadata(m13557d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J=\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00028\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00112\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010*R0\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001e\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0011@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u001e\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0011@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u001a\u0010 \u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0013\"\u0004\b\"\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, m13558d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;", "", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)V", "<set-?>", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "animations", "getAnimations", "()[Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "[Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "getConstraints-DWUhwKw", "()Landroidx/compose/ui/unit/Constraints;", "setConstraints-_Sx5XlM", "(Landroidx/compose/ui/unit/Constraints;)V", "crossAxisOffset", "", "getCrossAxisOffset", "()I", "setCrossAxisOffset", "(I)V", "isRunningPlacement", "", "()Z", "lane", "getLane", "setLane", "layoutMaxOffset", "getLayoutMaxOffset", "layoutMinOffset", "getLayoutMinOffset", "span", "getSpan", "setSpan", "updateAnimation", "", "positionedItem", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "graphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;III)V", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    @SourceDebugExtension({"SMAP\nLazyLayoutItemAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutItemAnimator.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,587:1\n12474#2,2:588\n1#3:590\n*S KotlinDebug\n*F\n+ 1 LazyLayoutItemAnimator.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo\n*L\n479#1:588,2\n*E\n"})
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
                if (lazyLayoutItemAnimation != null && lazyLayoutItemAnimation.getIsRunningMovingAwayAnimation()) {
                    return true;
                }
            }
            return false;
        }

        public static /* synthetic */ void updateAnimation$default(ItemInfo itemInfo, LazyLayoutMeasuredItem lazyLayoutMeasuredItem, CoroutineScope coroutineScope, GraphicsContext graphicsContext, int i10, int i11, int i12, int i13, Object obj) {
            if ((i13 & 32) != 0) {
                i12 = LazyLayoutItemAnimator.this.getCrossAxisOffset(lazyLayoutMeasuredItem);
            }
            itemInfo.updateAnimation(lazyLayoutMeasuredItem, coroutineScope, graphicsContext, i10, i11, i12);
        }

        public final LazyLayoutItemAnimation[] getAnimations() {
            return this.animations;
        }

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
        public final void m17851setConstraints_Sx5XlM(Constraints constraints) {
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

        public final void updateAnimation(T positionedItem, CoroutineScope coroutineScope, GraphicsContext graphicsContext, int layoutMinOffset, int layoutMaxOffset, int crossAxisOffset) {
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
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                this.animations = (LazyLayoutItemAnimation[]) objArrCopyOf;
            }
            this.constraints = Constraints.m23501boximpl(positionedItem.getConstraints());
            this.crossAxisOffset = crossAxisOffset;
            this.lane = positionedItem.getLane();
            this.span = positionedItem.getSpan();
            int placeablesCount2 = positionedItem.getPlaceablesCount();
            final LazyLayoutItemAnimator<T> lazyLayoutItemAnimator = LazyLayoutItemAnimator.this;
            for (int i10 = 0; i10 < placeablesCount2; i10++) {
                LazyLayoutAnimationSpecsNode specs = LazyLayoutItemAnimatorKt.getSpecs(positionedItem.getParentData(i10));
                if (specs == null) {
                    LazyLayoutItemAnimation lazyLayoutItemAnimation2 = this.animations[i10];
                    if (lazyLayoutItemAnimation2 != null) {
                        lazyLayoutItemAnimation2.release();
                    }
                    this.animations[i10] = null;
                } else {
                    LazyLayoutItemAnimation lazyLayoutItemAnimation3 = this.animations[i10];
                    if (lazyLayoutItemAnimation3 == null) {
                        lazyLayoutItemAnimation3 = new LazyLayoutItemAnimation(coroutineScope, graphicsContext, new Function0<Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$ItemInfo$updateAnimation$1$animation$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                DrawModifierNode drawModifierNode = ((LazyLayoutItemAnimator) lazyLayoutItemAnimator).displayingNode;
                                if (drawModifierNode != null) {
                                    DrawModifierNodeKt.invalidateDraw(drawModifierNode);
                                }
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }
                        });
                        this.animations[i10] = lazyLayoutItemAnimation3;
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
        long jMo17795getOffsetBjo55l4 = lazyLayoutMeasuredItem.mo17795getOffsetBjo55l4(0);
        return !lazyLayoutMeasuredItem.getIsVertical() ? IntOffset.m23690getYimpl(jMo17795getOffsetBjo55l4) : IntOffset.m23689getXimpl(jMo17795getOffsetBjo55l4);
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
        long jMo17795getOffsetBjo55l4 = lazyLayoutMeasuredItem.mo17795getOffsetBjo55l4(0);
        return lazyLayoutMeasuredItem.getIsVertical() ? IntOffset.m23690getYimpl(jMo17795getOffsetBjo55l4) : IntOffset.m23689getXimpl(jMo17795getOffsetBjo55l4);
    }

    private final void initializeAnimation(T item, int mainAxisOffset, LazyLayoutItemAnimator<T>.ItemInfo itemInfo) {
        int i10 = 0;
        long jMo17795getOffsetBjo55l4 = item.mo17795getOffsetBjo55l4(0);
        long jM23685copyiSbpLlY$default = item.getIsVertical() ? IntOffset.m23685copyiSbpLlY$default(jMo17795getOffsetBjo55l4, 0, mainAxisOffset, 1, null) : IntOffset.m23685copyiSbpLlY$default(jMo17795getOffsetBjo55l4, mainAxisOffset, 0, 2, null);
        LazyLayoutItemAnimation[] animations = itemInfo.getAnimations();
        int length = animations.length;
        int i11 = 0;
        while (i10 < length) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = animations[i10];
            int i12 = i11 + 1;
            if (lazyLayoutItemAnimation != null) {
                lazyLayoutItemAnimation.m17847setRawOffsetgyyYBs(IntOffset.m23693plusqkQi6aY(jM23685copyiSbpLlY$default, IntOffset.m23692minusqkQi6aY(item.mo17795getOffsetBjo55l4(i11), jMo17795getOffsetBjo55l4)));
            }
            i10++;
            i11 = i12;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void initializeAnimation$default(LazyLayoutItemAnimator lazyLayoutItemAnimator, LazyLayoutMeasuredItem lazyLayoutMeasuredItem, int i10, ItemInfo itemInfo, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            LazyLayoutItemAnimator<T>.ItemInfo itemInfo2 = lazyLayoutItemAnimator.keyToItemInfoMap.get(lazyLayoutMeasuredItem.getKey());
            Intrinsics.checkNotNull(itemInfo2);
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
        Intrinsics.checkNotNull(itemInfo);
        LazyLayoutItemAnimation[] animations = itemInfo.getAnimations();
        int length = animations.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = animations[i10];
            int i12 = i11 + 1;
            if (lazyLayoutItemAnimation != null) {
                long jMo17795getOffsetBjo55l4 = item.mo17795getOffsetBjo55l4(i11);
                long rawOffset = lazyLayoutItemAnimation.getRawOffset();
                if (!IntOffset.m23688equalsimpl0(rawOffset, LazyLayoutItemAnimation.INSTANCE.m17848getNotInitializednOccac()) && !IntOffset.m23688equalsimpl0(rawOffset, jMo17795getOffsetBjo55l4)) {
                    lazyLayoutItemAnimation.m17840animatePlacementDeltaar5cAso(IntOffset.m23692minusqkQi6aY(jMo17795getOffsetBjo55l4, rawOffset), isMovingAway);
                }
                lazyLayoutItemAnimation.m17847setRawOffsetgyyYBs(jMo17795getOffsetBjo55l4);
            }
            i10++;
            i11 = i12;
        }
    }

    public static /* synthetic */ void startPlacementAnimationsIfNeeded$default(LazyLayoutItemAnimator lazyLayoutItemAnimator, LazyLayoutMeasuredItem lazyLayoutMeasuredItem, boolean z9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z9 = false;
        }
        lazyLayoutItemAnimator.startPlacementAnimationsIfNeeded(lazyLayoutMeasuredItem, z9);
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

    public final LazyLayoutItemAnimation getAnimation(Object key, int placeableIndex) {
        LazyLayoutItemAnimation[] animations;
        LazyLayoutItemAnimator<T>.ItemInfo itemInfo = this.keyToItemInfoMap.get(key);
        if (itemInfo == null || (animations = itemInfo.getAnimations()) == null) {
            return null;
        }
        return animations[placeableIndex];
    }

    /* renamed from: getMinSizeToFitDisappearingItems-YbymL2g, reason: not valid java name */
    public final long m17849getMinSizeToFitDisappearingItemsYbymL2g() {
        long jM23737getZeroYbymL2g = IntSize.INSTANCE.m23737getZeroYbymL2g();
        List<LazyLayoutItemAnimation> list = this.disappearingItems;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = list.get(i10);
            GraphicsLayer layer = lazyLayoutItemAnimation.getLayer();
            if (layer != null) {
                jM23737getZeroYbymL2g = IntSize.m23727constructorimpl((Math.max((int) (jM23737getZeroYbymL2g & 4294967295L), IntOffset.m23690getYimpl(lazyLayoutItemAnimation.getRawOffset()) + ((int) (layer.getSize() & 4294967295L))) & 4294967295L) | (Math.max((int) (jM23737getZeroYbymL2g >> 32), IntOffset.m23689getXimpl(lazyLayoutItemAnimation.getRawOffset()) + ((int) (layer.getSize() >> 32))) << 32));
            }
        }
        return jM23737getZeroYbymL2g;
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onMeasured(int consumedScroll, int layoutWidth, int layoutHeight, List<T> positionedItems, final LazyLayoutKeyIndexMap keyIndexMap, LazyLayoutMeasuredItemProvider<T> itemProvider, boolean isVertical, boolean isLookingAhead, int laneCount, boolean hasLookaheadOccurred, int layoutMinOffset, int layoutMaxOffset, CoroutineScope coroutineScope, GraphicsContext graphicsContext) {
        int i10;
        int i11;
        int i12;
        int layoutMaxOffset2;
        Object[] objArr;
        long[] jArr;
        int i13;
        Object[] objArr2;
        long[] jArr2;
        int i14;
        LazyLayoutItemAnimation[] lazyLayoutItemAnimationArr;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        long[] jArr3;
        long[] jArr4;
        int i20;
        int i21 = laneCount;
        final LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap = this.keyIndexMap;
        this.keyIndexMap = keyIndexMap;
        int size = positionedItems.size();
        int i22 = 0;
        while (true) {
            if (i22 >= size) {
                if (this.keyToItemInfoMap.isEmpty()) {
                    releaseAnimations();
                    return;
                }
            } else if (getHasAnimations(positionedItems.get(i22))) {
                break;
            } else {
                i22++;
            }
        }
        int i23 = this.firstVisibleIndex;
        LazyLayoutMeasuredItem lazyLayoutMeasuredItem = (LazyLayoutMeasuredItem) CollectionsKt.firstOrNull((List) positionedItems);
        this.firstVisibleIndex = lazyLayoutMeasuredItem != null ? lazyLayoutMeasuredItem.getIndex() : 0;
        long jM23683constructorimpl = isVertical ? IntOffset.m23683constructorimpl((consumedScroll & 4294967295L) | (0 << 32)) : IntOffset.m23683constructorimpl((consumedScroll << 32) | (0 & 4294967295L));
        boolean z9 = isLookingAhead || !hasLookaheadOccurred;
        MutableScatterMap<Object, LazyLayoutItemAnimator<T>.ItemInfo> mutableScatterMap = this.keyToItemInfoMap;
        Object[] objArr3 = mutableScatterMap.keys;
        long[] jArr5 = mutableScatterMap.metadata;
        int length = jArr5.length - 2;
        if (length >= 0) {
            int i24 = 0;
            while (true) {
                long j10 = jArr5[i24];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i25 = 8 - ((~(i24 - length)) >>> 31);
                    int i26 = 0;
                    while (i26 < i25) {
                        if ((j10 & 255) < 128) {
                            jArr4 = jArr5;
                            i20 = i26;
                            this.movingAwayKeys.add(objArr3[(i24 << 3) + i26]);
                        } else {
                            jArr4 = jArr5;
                            i20 = i26;
                        }
                        j10 >>= 8;
                        i26 = i20 + 1;
                        jArr5 = jArr4;
                    }
                    jArr3 = jArr5;
                    if (i25 != 8) {
                        break;
                    }
                } else {
                    jArr3 = jArr5;
                }
                if (i24 == length) {
                    break;
                }
                i24++;
                jArr5 = jArr3;
            }
        }
        int size2 = positionedItems.size();
        int i27 = 0;
        while (i27 < size2) {
            T t10 = positionedItems.get(i27);
            this.movingAwayKeys.remove(t10.getKey());
            if (getHasAnimations(t10)) {
                LazyLayoutItemAnimator<T>.ItemInfo itemInfo = this.keyToItemInfoMap.get(t10.getKey());
                int index = lazyLayoutKeyIndexMap != null ? lazyLayoutKeyIndexMap.getIndex(t10.getKey()) : -1;
                boolean z10 = index == -1 && lazyLayoutKeyIndexMap != null;
                if (itemInfo == null) {
                    LazyLayoutItemAnimator<T>.ItemInfo itemInfo2 = new ItemInfo();
                    ItemInfo.updateAnimation$default(itemInfo2, t10, coroutineScope, graphicsContext, layoutMinOffset, layoutMaxOffset, 0, 32, null);
                    i15 = size2;
                    this.keyToItemInfoMap.set(t10.getKey(), itemInfo2);
                    if (t10.getIndex() == index || index == -1) {
                        long jMo17795getOffsetBjo55l4 = t10.mo17795getOffsetBjo55l4(0);
                        initializeAnimation(t10, t10.getIsVertical() ? IntOffset.m23690getYimpl(jMo17795getOffsetBjo55l4) : IntOffset.m23689getXimpl(jMo17795getOffsetBjo55l4), itemInfo2);
                        if (z10) {
                            LazyLayoutItemAnimation[] animations = itemInfo2.getAnimations();
                            for (LazyLayoutItemAnimation lazyLayoutItemAnimation : animations) {
                                if (lazyLayoutItemAnimation != null) {
                                    lazyLayoutItemAnimation.animateAppearance();
                                    Unit unit = Unit.INSTANCE;
                                }
                            }
                        }
                    } else if (index < i23) {
                        this.movingInFromStartBound.add(t10);
                    } else {
                        this.movingInFromEndBound.add(t10);
                    }
                } else {
                    i15 = size2;
                    if (z9) {
                        ItemInfo.updateAnimation$default(itemInfo, t10, coroutineScope, graphicsContext, layoutMinOffset, layoutMaxOffset, 0, 32, null);
                        LazyLayoutItemAnimation[] animations2 = itemInfo.getAnimations();
                        int length2 = animations2.length;
                        int i28 = 0;
                        while (i28 < length2) {
                            LazyLayoutItemAnimation lazyLayoutItemAnimation2 = animations2[i28];
                            LazyLayoutItemAnimation[] lazyLayoutItemAnimationArr2 = animations2;
                            int i29 = i23;
                            if (lazyLayoutItemAnimation2 != null) {
                                i18 = i27;
                                i19 = length2;
                                if (!IntOffset.m23688equalsimpl0(lazyLayoutItemAnimation2.getRawOffset(), LazyLayoutItemAnimation.INSTANCE.m17848getNotInitializednOccac())) {
                                    lazyLayoutItemAnimation2.m17847setRawOffsetgyyYBs(IntOffset.m23693plusqkQi6aY(lazyLayoutItemAnimation2.getRawOffset(), jM23683constructorimpl));
                                }
                            } else {
                                i18 = i27;
                                i19 = length2;
                            }
                            i28++;
                            animations2 = lazyLayoutItemAnimationArr2;
                            i23 = i29;
                            i27 = i18;
                            length2 = i19;
                        }
                        i16 = i23;
                        i17 = i27;
                        if (z10) {
                            for (LazyLayoutItemAnimation lazyLayoutItemAnimation3 : itemInfo.getAnimations()) {
                                if (lazyLayoutItemAnimation3 != null) {
                                    if (lazyLayoutItemAnimation3.isDisappearanceAnimationInProgress()) {
                                        this.disappearingItems.remove(lazyLayoutItemAnimation3);
                                        DrawModifierNode drawModifierNode = this.displayingNode;
                                        if (drawModifierNode != null) {
                                            DrawModifierNodeKt.invalidateDraw(drawModifierNode);
                                            Unit unit2 = Unit.INSTANCE;
                                        }
                                    }
                                    lazyLayoutItemAnimation3.animateAppearance();
                                }
                            }
                        }
                        startPlacementAnimationsIfNeeded$default(this, t10, false, 2, null);
                    }
                }
                i16 = i23;
                i17 = i27;
            } else {
                i15 = size2;
                i16 = i23;
                i17 = i27;
                removeInfoForKey(t10.getKey());
            }
            i27 = i17 + 1;
            i23 = i16;
            size2 = i15;
        }
        int i30 = 2;
        int[] iArr = new int[i21];
        if (!z9 || lazyLayoutKeyIndexMap == null) {
            i10 = 2;
        } else {
            if (this.movingInFromStartBound.isEmpty()) {
                i10 = 2;
            } else {
                List<T> list = this.movingInFromStartBound;
                if (list.size() > 1) {
                    CollectionsKt.sortWith(list, new Comparator() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortByDescending$1
                        @Override // java.util.Comparator
                        public final int compare(T t11, T t12) {
                            return ComparisonsKt.compareValues(Integer.valueOf(lazyLayoutKeyIndexMap.getIndex(((LazyLayoutMeasuredItem) t12).getKey())), Integer.valueOf(lazyLayoutKeyIndexMap.getIndex(((LazyLayoutMeasuredItem) t11).getKey())));
                        }
                    });
                }
                List<T> list2 = this.movingInFromStartBound;
                int size3 = list2.size();
                int i31 = 0;
                while (i31 < size3) {
                    T t11 = list2.get(i31);
                    int i32 = i30;
                    initializeAnimation$default(this, t11, layoutMinOffset - updateAndReturnOffsetFor(iArr, t11), null, 4, null);
                    startPlacementAnimationsIfNeeded$default(this, t11, false, i32, null);
                    i31++;
                    i30 = i32;
                }
                i10 = i30;
                ArraysKt.fill$default(iArr, 0, 0, 0, 6, (Object) null);
            }
            if (!this.movingInFromEndBound.isEmpty()) {
                List<T> list3 = this.movingInFromEndBound;
                if (list3.size() > 1) {
                    CollectionsKt.sortWith(list3, new Comparator() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortBy$1
                        @Override // java.util.Comparator
                        public final int compare(T t12, T t13) {
                            return ComparisonsKt.compareValues(Integer.valueOf(lazyLayoutKeyIndexMap.getIndex(((LazyLayoutMeasuredItem) t12).getKey())), Integer.valueOf(lazyLayoutKeyIndexMap.getIndex(((LazyLayoutMeasuredItem) t13).getKey())));
                        }
                    });
                }
                List<T> list4 = this.movingInFromEndBound;
                int size4 = list4.size();
                for (int i33 = 0; i33 < size4; i33++) {
                    T t12 = list4.get(i33);
                    initializeAnimation$default(this, t12, (layoutMaxOffset + updateAndReturnOffsetFor(iArr, t12)) - t12.getMainAxisSizeWithSpacings(), null, 4, null);
                    startPlacementAnimationsIfNeeded$default(this, t12, false, i10, null);
                }
                ArraysKt.fill$default(iArr, 0, 0, 0, 6, (Object) null);
            }
        }
        MutableScatterSet<Object> mutableScatterSet = this.movingAwayKeys;
        Object[] objArr4 = mutableScatterSet.elements;
        long[] jArr6 = mutableScatterSet.metadata;
        int length3 = jArr6.length - i10;
        if (length3 >= 0) {
            int i34 = 0;
            while (true) {
                long j11 = jArr6[i34];
                long[] jArr7 = jArr6;
                Object[] objArr5 = objArr4;
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i35 = 8 - ((~(i34 - length3)) >>> 31);
                    int i36 = 0;
                    while (i36 < i35) {
                        if ((j11 & 255) < 128) {
                            Object obj = objArr5[(i34 << 3) + i36];
                            i13 = i36;
                            LazyLayoutItemAnimator<T>.ItemInfo itemInfo3 = this.keyToItemInfoMap.get(obj);
                            if (itemInfo3 != 0) {
                                objArr2 = objArr5;
                                int index2 = keyIndexMap.getIndex(obj);
                                jArr2 = jArr7;
                                itemInfo3.setSpan(Math.min(i21, itemInfo3.getSpan()));
                                itemInfo3.setLane(Math.min(i21 - itemInfo3.getSpan(), itemInfo3.getLane()));
                                if (index2 == -1) {
                                    LazyLayoutItemAnimation[] animations3 = itemInfo3.getAnimations();
                                    int length4 = animations3.length;
                                    int i37 = 0;
                                    boolean z11 = false;
                                    int i38 = 0;
                                    ItemInfo itemInfo4 = itemInfo3;
                                    while (i37 < length4) {
                                        ItemInfo itemInfo5 = itemInfo4;
                                        LazyLayoutItemAnimation lazyLayoutItemAnimation4 = animations3[i37];
                                        int i39 = i38 + 1;
                                        if (lazyLayoutItemAnimation4 != null) {
                                            if (lazyLayoutItemAnimation4.isDisappearanceAnimationInProgress()) {
                                                lazyLayoutItemAnimationArr = animations3;
                                            } else if (lazyLayoutItemAnimation4.isDisappearanceAnimationFinished()) {
                                                lazyLayoutItemAnimation4.release();
                                                itemInfo5.getAnimations()[i38] = null;
                                                lazyLayoutItemAnimationArr = animations3;
                                                this.disappearingItems.remove(lazyLayoutItemAnimation4);
                                                DrawModifierNode drawModifierNode2 = this.displayingNode;
                                                if (drawModifierNode2 != null) {
                                                    DrawModifierNodeKt.invalidateDraw(drawModifierNode2);
                                                    Unit unit3 = Unit.INSTANCE;
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
                                                        Unit unit4 = Unit.INSTANCE;
                                                    }
                                                } else {
                                                    lazyLayoutItemAnimation4.release();
                                                    itemInfo5.getAnimations()[i38] = null;
                                                    i37++;
                                                    i38 = i39;
                                                    animations3 = lazyLayoutItemAnimationArr;
                                                    itemInfo4 = itemInfo5;
                                                }
                                            }
                                            z11 = true;
                                        } else {
                                            lazyLayoutItemAnimationArr = animations3;
                                        }
                                        i37++;
                                        i38 = i39;
                                        animations3 = lazyLayoutItemAnimationArr;
                                        itemInfo4 = itemInfo5;
                                    }
                                    if (!z11) {
                                        removeInfoForKey(obj);
                                    }
                                } else {
                                    Constraints constraints = itemInfo3.getConstraints();
                                    Intrinsics.checkNotNull(constraints);
                                    LazyLayoutMeasuredItem lazyLayoutMeasuredItemMo17797getAndMeasurehBUhpc = itemProvider.mo17797getAndMeasurehBUhpc(index2, itemInfo3.getLane(), itemInfo3.getSpan(), constraints.getValue());
                                    lazyLayoutMeasuredItemMo17797getAndMeasurehBUhpc.setNonScrollableItem(true);
                                    LazyLayoutItemAnimation[] animations4 = itemInfo3.getAnimations();
                                    int length5 = animations4.length;
                                    int i40 = 0;
                                    while (true) {
                                        if (i40 < length5) {
                                            LazyLayoutItemAnimation lazyLayoutItemAnimation5 = animations4[i40];
                                            int i41 = i40;
                                            if (lazyLayoutItemAnimation5 != null) {
                                                boolean zIsPlacementAnimationInProgress = lazyLayoutItemAnimation5.isPlacementAnimationInProgress();
                                                i14 = length5;
                                                if (zIsPlacementAnimationInProgress) {
                                                    break;
                                                }
                                            } else {
                                                i14 = length5;
                                            }
                                            i40 = i41 + 1;
                                            length5 = i14;
                                        } else if (lazyLayoutKeyIndexMap == null || index2 != lazyLayoutKeyIndexMap.getIndex(obj)) {
                                            break;
                                        } else {
                                            removeInfoForKey(obj);
                                        }
                                    }
                                    itemInfo3.updateAnimation(lazyLayoutMeasuredItemMo17797getAndMeasurehBUhpc, coroutineScope, graphicsContext, layoutMinOffset, layoutMaxOffset, itemInfo3.getCrossAxisOffset());
                                    if (index2 < this.firstVisibleIndex) {
                                        this.movingAwayToStartBound.add(lazyLayoutMeasuredItemMo17797getAndMeasurehBUhpc);
                                    } else {
                                        this.movingAwayToEndBound.add(lazyLayoutMeasuredItemMo17797getAndMeasurehBUhpc);
                                    }
                                }
                            }
                            j11 >>= 8;
                            i21 = laneCount;
                            i36 = i13 + 1;
                            jArr7 = jArr2;
                            objArr5 = objArr2;
                        } else {
                            i13 = i36;
                        }
                        objArr2 = objArr5;
                        jArr2 = jArr7;
                        j11 >>= 8;
                        i21 = laneCount;
                        i36 = i13 + 1;
                        jArr7 = jArr2;
                        objArr5 = objArr2;
                    }
                    objArr = objArr5;
                    jArr = jArr7;
                    if (i35 != 8) {
                        break;
                    }
                } else {
                    objArr = objArr5;
                    jArr = jArr7;
                }
                if (i34 == length3) {
                    break;
                }
                i34++;
                objArr4 = objArr;
                i21 = laneCount;
                jArr6 = jArr;
            }
        }
        if (this.movingAwayToStartBound.isEmpty()) {
            i11 = layoutWidth;
            i12 = layoutHeight;
        } else {
            List<T> list5 = this.movingAwayToStartBound;
            if (list5.size() > 1) {
                CollectionsKt.sortWith(list5, new Comparator() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortByDescending$2
                    @Override // java.util.Comparator
                    public final int compare(T t13, T t14) {
                        return ComparisonsKt.compareValues(Integer.valueOf(keyIndexMap.getIndex(((LazyLayoutMeasuredItem) t14).getKey())), Integer.valueOf(keyIndexMap.getIndex(((LazyLayoutMeasuredItem) t13).getKey())));
                    }
                });
            }
            List<T> list6 = this.movingAwayToStartBound;
            int size5 = list6.size();
            for (int i42 = 0; i42 < size5; i42++) {
                T t13 = list6.get(i42);
                LazyLayoutItemAnimator<T>.ItemInfo itemInfo6 = this.keyToItemInfoMap.get(t13.getKey());
                Intrinsics.checkNotNull(itemInfo6);
                LazyLayoutItemAnimator<T>.ItemInfo itemInfo7 = itemInfo6;
                t13.position((isLookingAhead ? getMainAxisOffset((LazyLayoutMeasuredItem) CollectionsKt.first((List) positionedItems)) : itemInfo7.getLayoutMinOffset()) - updateAndReturnOffsetFor(iArr, t13), itemInfo7.getCrossAxisOffset(), layoutWidth, layoutHeight);
                if (z9) {
                    startPlacementAnimationsIfNeeded(t13, true);
                }
            }
            i11 = layoutWidth;
            i12 = layoutHeight;
            ArraysKt.fill$default(iArr, 0, 0, 0, 6, (Object) null);
        }
        if (!this.movingAwayToEndBound.isEmpty()) {
            List<T> list7 = this.movingAwayToEndBound;
            if (list7.size() > 1) {
                CollectionsKt.sortWith(list7, new Comparator() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortBy$2
                    @Override // java.util.Comparator
                    public final int compare(T t14, T t15) {
                        return ComparisonsKt.compareValues(Integer.valueOf(keyIndexMap.getIndex(((LazyLayoutMeasuredItem) t14).getKey())), Integer.valueOf(keyIndexMap.getIndex(((LazyLayoutMeasuredItem) t15).getKey())));
                    }
                });
            }
            List<T> list8 = this.movingAwayToEndBound;
            int size6 = list8.size();
            for (int i43 = 0; i43 < size6; i43++) {
                T t14 = list8.get(i43);
                LazyLayoutItemAnimator<T>.ItemInfo itemInfo8 = this.keyToItemInfoMap.get(t14.getKey());
                Intrinsics.checkNotNull(itemInfo8);
                LazyLayoutItemAnimator<T>.ItemInfo itemInfo9 = itemInfo8;
                int iUpdateAndReturnOffsetFor = updateAndReturnOffsetFor(iArr, t14);
                if (isLookingAhead) {
                    LazyLayoutMeasuredItem lazyLayoutMeasuredItem2 = (LazyLayoutMeasuredItem) CollectionsKt.last((List) positionedItems);
                    layoutMaxOffset2 = getMainAxisOffset(lazyLayoutMeasuredItem2) + lazyLayoutMeasuredItem2.getMainAxisSizeWithSpacings();
                } else {
                    layoutMaxOffset2 = itemInfo9.getLayoutMaxOffset();
                }
                t14.position((layoutMaxOffset2 - t14.getMainAxisSizeWithSpacings()) + iUpdateAndReturnOffsetFor, itemInfo9.getCrossAxisOffset(), i11, i12);
                if (z9) {
                    startPlacementAnimationsIfNeeded(t14, true);
                }
            }
        }
        List<T> list9 = this.movingAwayToStartBound;
        CollectionsKt.reverse(list9);
        Unit unit5 = Unit.INSTANCE;
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
