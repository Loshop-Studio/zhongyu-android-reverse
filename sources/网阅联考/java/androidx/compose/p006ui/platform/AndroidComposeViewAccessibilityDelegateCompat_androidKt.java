package androidx.compose.p006ui.platform;

import android.graphics.Region;
import androidx.compose.p006ui.geometry.Rect;
import androidx.compose.p006ui.layout.LayoutInfo;
import androidx.compose.p006ui.node.LayoutNode;
import androidx.compose.p006ui.node.SemanticsModifierNode;
import androidx.compose.p006ui.node.SemanticsModifierNodeKt;
import androidx.compose.p006ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.p006ui.semantics.AccessibilityAction;
import androidx.compose.p006ui.semantics.SemanticsActions;
import androidx.compose.p006ui.semantics.SemanticsConfiguration;
import androidx.compose.p006ui.semantics.SemanticsConfigurationKt;
import androidx.compose.p006ui.semantics.SemanticsNode;
import androidx.compose.p006ui.semantics.SemanticsNodeKt;
import androidx.compose.p006ui.semantics.SemanticsOwner;
import androidx.compose.p006ui.semantics.SemanticsProperties;
import androidx.compose.p006ui.semantics.SemanticsPropertyKey;
import androidx.compose.p006ui.unit.LayoutDirection;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;

@Metadata(m5174d1 = {"\u0000\\\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001a\u0010\u0010\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002\u001a\f\u0010\u0014\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u0015\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017*\b\u0012\u0004\u0012\u00020\u00170\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0000\u001a\"\u0010\u001b\u001a\u0004\u0018\u00010\u001c*\u00020\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00010\u001eH\u0002\u001a\u0018\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020!0 *\u00020\"H\u0000\u001a\f\u0010#\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a \u0010$\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020&0%2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%H\u0002\u001a\u0014\u0010(\u001a\u00020\u0001*\u00020\u00022\u0006\u0010)\u001a\u00020*H\u0002\u001a\u001b\u0010+\u001a\b\u0012\u0004\u0012\u00020&0%*\u00020&2\u0006\u0010,\u001a\u00020&H\u0080\u0002\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0018\u0010\u0007\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0004\"\u0018\u0010\b\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004\"\u0018\u0010\t\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0004\"\u0018\u0010\n\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004\"\u001e\u0010\u000b\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\f\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\u0004\"\u0018\u0010\u000e\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0004¨\u0006-"}, m5175d2 = {"hasCollectionInfo", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "getHasCollectionInfo", "(Landroidx/compose/ui/semantics/SemanticsNode;)Z", "isContainer", "(Landroidx/compose/ui/semantics/SemanticsNode;)Ljava/lang/Boolean;", "isPassword", "isRtl", "isScrollable", "isTextField", "isVisible", "isVisible$annotations", "(Landroidx/compose/ui/semantics/SemanticsNode;)V", "semanticsNodeIsStructurallySignificant", "getSemanticsNodeIsStructurallySignificant", "accessibilityEquals", "Landroidx/compose/ui/semantics/AccessibilityAction;", "other", "", "enabled", "excludeLineAndPageGranularities", "findById", "Landroidx/compose/ui/platform/ScrollObservationScope;", "", "id", "", "findClosestParentNode", "Landroidx/compose/ui/node/LayoutNode;", "selector", "Lkotlin/Function1;", "getAllUncoveredSemanticsNodesToMap", "", "Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "Landroidx/compose/ui/semantics/SemanticsOwner;", "hasPaneTitle", "overlaps", "Landroidx/compose/ui/platform/OpenEndRange;", "", "it", "propertiesDeleted", "oldNode", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy;", "rangeUntil", "that", "ui_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAndroidComposeViewAccessibilityDelegateCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3169:1\n1#2:3170\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean accessibilityEquals(AccessibilityAction<?> accessibilityAction, Object obj) {
        if (accessibilityAction == obj) {
            return true;
        }
        if (!(obj instanceof AccessibilityAction)) {
            return false;
        }
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) obj;
        if (!Intrinsics.areEqual(accessibilityAction.getLabel(), accessibilityAction2.getLabel())) {
            return false;
        }
        if (accessibilityAction.getAction() != null || accessibilityAction2.getAction() == null) {
            return accessibilityAction.getAction() == null || accessibilityAction2.getAction() != null;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean enabled(SemanticsNode semanticsNode) {
        return SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), SemanticsProperties.INSTANCE.getDisabled()) == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean excludeLineAndPageGranularities(SemanticsNode semanticsNode) {
        SemanticsConfiguration semanticsConfigurationCollapsedSemanticsConfiguration;
        if (isTextField(semanticsNode) && !Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getFocused()), Boolean.TRUE)) {
            return true;
        }
        LayoutNode layoutNodeFindClosestParentNode = findClosestParentNode(semanticsNode.getLayoutNode(), new Function1<LayoutNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(LayoutNode it) {
                Intrinsics.checkNotNullParameter(it, "it");
                SemanticsModifierNode outerSemantics = SemanticsNodeKt.getOuterSemantics(it);
                SemanticsConfiguration semanticsConfigurationCollapsedSemanticsConfiguration2 = outerSemantics != null ? SemanticsModifierNodeKt.collapsedSemanticsConfiguration(outerSemantics) : null;
                return Boolean.valueOf((semanticsConfigurationCollapsedSemanticsConfiguration2 != null && semanticsConfigurationCollapsedSemanticsConfiguration2.getIsMergingSemanticsOfDescendants()) && semanticsConfigurationCollapsedSemanticsConfiguration2.contains(SemanticsActions.INSTANCE.getSetText()));
            }
        });
        if (layoutNodeFindClosestParentNode != null) {
            SemanticsModifierNode outerSemantics = SemanticsNodeKt.getOuterSemantics(layoutNodeFindClosestParentNode);
            if (!((outerSemantics == null || (semanticsConfigurationCollapsedSemanticsConfiguration = SemanticsModifierNodeKt.collapsedSemanticsConfiguration(outerSemantics)) == null) ? false : Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(semanticsConfigurationCollapsedSemanticsConfiguration, SemanticsProperties.INSTANCE.getFocused()), Boolean.TRUE))) {
                return true;
            }
        }
        return false;
    }

    public static final ScrollObservationScope findById(List<ScrollObservationScope> list, int i4) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (list.get(i5).getSemanticsNodeId() == i4) {
                return list.get(i5);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LayoutNode findClosestParentNode(LayoutNode layoutNode, Function1<? super LayoutNode, Boolean> function1) {
        for (LayoutNode parent$ui_release = layoutNode.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            if (function1.invoke(parent$ui_release).booleanValue()) {
                return parent$ui_release;
            }
        }
        return null;
    }

    public static final Map<Integer, SemanticsNodeWithAdjustedBounds> getAllUncoveredSemanticsNodesToMap(SemanticsOwner semanticsOwner) {
        Intrinsics.checkNotNullParameter(semanticsOwner, "<this>");
        SemanticsNode unmergedRootSemanticsNode = semanticsOwner.getUnmergedRootSemanticsNode();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (unmergedRootSemanticsNode.getLayoutNode().getIsPlaced() && unmergedRootSemanticsNode.getLayoutNode().isAttached()) {
            Region region = new Region();
            Rect boundsInRoot = unmergedRootSemanticsNode.getBoundsInRoot();
            region.set(new android.graphics.Rect(MathKt__MathJVMKt.roundToInt(boundsInRoot.getLeft()), MathKt__MathJVMKt.roundToInt(boundsInRoot.getTop()), MathKt__MathJVMKt.roundToInt(boundsInRoot.getRight()), MathKt__MathJVMKt.roundToInt(boundsInRoot.getBottom())));
            getAllUncoveredSemanticsNodesToMap$findAllSemanticNodesRecursive(region, unmergedRootSemanticsNode, linkedHashMap, unmergedRootSemanticsNode);
        }
        return linkedHashMap;
    }

    private static final void getAllUncoveredSemanticsNodesToMap$findAllSemanticNodesRecursive(Region region, SemanticsNode semanticsNode, Map<Integer, SemanticsNodeWithAdjustedBounds> map, SemanticsNode semanticsNode2) {
        LayoutInfo layoutInfo;
        boolean z3 = false;
        boolean z4 = (semanticsNode2.getLayoutNode().getIsPlaced() && semanticsNode2.getLayoutNode().isAttached()) ? false : true;
        if (!region.isEmpty() || semanticsNode2.getId() == semanticsNode.getId()) {
            if (!z4 || semanticsNode2.getIsFake()) {
                android.graphics.Rect rect = new android.graphics.Rect(MathKt__MathJVMKt.roundToInt(semanticsNode2.getTouchBoundsInRoot().getLeft()), MathKt__MathJVMKt.roundToInt(semanticsNode2.getTouchBoundsInRoot().getTop()), MathKt__MathJVMKt.roundToInt(semanticsNode2.getTouchBoundsInRoot().getRight()), MathKt__MathJVMKt.roundToInt(semanticsNode2.getTouchBoundsInRoot().getBottom()));
                Region region2 = new Region();
                region2.set(rect);
                int id = semanticsNode2.getId() == semanticsNode.getId() ? -1 : semanticsNode2.getId();
                if (region2.op(region, region2, Region.Op.INTERSECT)) {
                    Integer numValueOf = Integer.valueOf(id);
                    android.graphics.Rect bounds = region2.getBounds();
                    Intrinsics.checkNotNullExpressionValue(bounds, "region.bounds");
                    map.put(numValueOf, new SemanticsNodeWithAdjustedBounds(semanticsNode2, bounds));
                    List<SemanticsNode> replacedChildren$ui_release = semanticsNode2.getReplacedChildren$ui_release();
                    for (int size = replacedChildren$ui_release.size() - 1; -1 < size; size--) {
                        getAllUncoveredSemanticsNodesToMap$findAllSemanticNodesRecursive(region, semanticsNode, map, replacedChildren$ui_release.get(size));
                    }
                    region.op(rect, region, Region.Op.REVERSE_DIFFERENCE);
                    return;
                }
                if (!semanticsNode2.getIsFake()) {
                    if (id == -1) {
                        Integer numValueOf2 = Integer.valueOf(id);
                        android.graphics.Rect bounds2 = region2.getBounds();
                        Intrinsics.checkNotNullExpressionValue(bounds2, "region.bounds");
                        map.put(numValueOf2, new SemanticsNodeWithAdjustedBounds(semanticsNode2, bounds2));
                        return;
                    }
                    return;
                }
                SemanticsNode parent = semanticsNode2.getParent();
                if (parent != null && (layoutInfo = parent.getLayoutInfo()) != null && layoutInfo.getIsPlaced()) {
                    z3 = true;
                }
                Rect boundsInRoot = z3 ? parent.getBoundsInRoot() : new Rect(0.0f, 0.0f, 10.0f, 10.0f);
                map.put(Integer.valueOf(id), new SemanticsNodeWithAdjustedBounds(semanticsNode2, new android.graphics.Rect(MathKt__MathJVMKt.roundToInt(boundsInRoot.getLeft()), MathKt__MathJVMKt.roundToInt(boundsInRoot.getTop()), MathKt__MathJVMKt.roundToInt(boundsInRoot.getRight()), MathKt__MathJVMKt.roundToInt(boundsInRoot.getBottom()))));
            }
        }
    }

    private static final boolean getHasCollectionInfo(SemanticsNode semanticsNode) {
        return semanticsNode.getConfig().contains(SemanticsProperties.INSTANCE.getCollectionInfo());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getSemanticsNodeIsStructurallySignificant(SemanticsNode semanticsNode) {
        if (Intrinsics.areEqual(isContainer(semanticsNode), Boolean.FALSE)) {
            return false;
        }
        return Intrinsics.areEqual(isContainer(semanticsNode), Boolean.TRUE) || getHasCollectionInfo(semanticsNode) || isScrollable(semanticsNode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasPaneTitle(SemanticsNode semanticsNode) {
        return semanticsNode.getConfig().contains(SemanticsProperties.INSTANCE.getPaneTitle());
    }

    private static final Boolean isContainer(SemanticsNode semanticsNode) {
        return (Boolean) SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), SemanticsProperties.INSTANCE.getIsContainer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isPassword(SemanticsNode semanticsNode) {
        return semanticsNode.getConfig().contains(SemanticsProperties.INSTANCE.getPassword());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isRtl(SemanticsNode semanticsNode) {
        return semanticsNode.getLayoutInfo().getLayoutDirection() == LayoutDirection.Rtl;
    }

    private static final boolean isScrollable(SemanticsNode semanticsNode) {
        return semanticsNode.getConfig().contains(SemanticsActions.INSTANCE.getScrollBy());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isTextField(SemanticsNode semanticsNode) {
        return semanticsNode.getUnmergedConfig().contains(SemanticsActions.INSTANCE.getSetText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isVisible(SemanticsNode semanticsNode) {
        return (semanticsNode.isTransparent$ui_release() || semanticsNode.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getInvisibleToUser())) ? false : true;
    }

    private static /* synthetic */ void isVisible$annotations(SemanticsNode semanticsNode) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean overlaps(OpenEndRange<Float> openEndRange, OpenEndRange<Float> openEndRange2) {
        return (openEndRange.isEmpty() || openEndRange2.isEmpty() || Math.max(((Number) openEndRange.getStart()).floatValue(), ((Number) openEndRange2.getStart()).floatValue()) >= Math.min(((Number) openEndRange.getEndExclusive()).floatValue(), ((Number) openEndRange2.getEndExclusive()).floatValue())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean propertiesDeleted(SemanticsNode semanticsNode, AndroidComposeViewAccessibilityDelegateCompat.SemanticsNodeCopy semanticsNodeCopy) {
        Iterator<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>> it = semanticsNodeCopy.getUnmergedConfig().iterator();
        while (it.hasNext()) {
            if (!semanticsNode.getConfig().contains(it.next().getKey())) {
                return true;
            }
        }
        return false;
    }

    public static final OpenEndRange<Float> rangeUntil(float f4, float f5) {
        return new OpenEndFloatRange(f4, f5);
    }
}
