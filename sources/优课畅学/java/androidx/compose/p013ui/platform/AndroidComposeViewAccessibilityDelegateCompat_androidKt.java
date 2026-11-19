package androidx.compose.p013ui.platform;

import android.content.res.Resources;
import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntIntMap;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.p013ui.C2608R;
import androidx.compose.p013ui.ExperimentalComposeUiApi;
import androidx.compose.p013ui.contentcapture.ContentCaptureManager;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.node.LayoutNode;
import androidx.compose.p013ui.semantics.AccessibilityAction;
import androidx.compose.p013ui.semantics.ProgressBarRangeInfo;
import androidx.compose.p013ui.semantics.Role;
import androidx.compose.p013ui.semantics.SemanticsConfiguration;
import androidx.compose.p013ui.semantics.SemanticsConfigurationKt;
import androidx.compose.p013ui.semantics.SemanticsNode;
import androidx.compose.p013ui.semantics.SemanticsProperties;
import androidx.compose.p013ui.semantics.SemanticsPropertyKey;
import androidx.compose.p013ui.state.ToggleableState;
import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;
import p077d8.InterfaceC8317b;
import p123h7.InterfaceC8721a;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8807u;
import p134i7.AbstractC8809v;
import p134i7.AbstractC8816z;
import p168l7.AbstractC9260b;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat_androidKt {
    private static final InterfaceC10574p UnmergedConfigComparator;
    private static final Comparator<SemanticsNode>[] semanticComparators;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.f1351On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToggleableState.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Comparator<SemanticsNode>[] comparatorArr = new Comparator[2];
        int i10 = 0;
        while (i10 < 2) {
            final Comparator comparator = i10 == 0 ? RtlBoundsComparator.INSTANCE : LtrBoundsComparator.INSTANCE;
            final Comparator<LayoutNode> zComparator$ui_release = LayoutNode.Companion.getZComparator$ui_release();
            final Comparator comparator2 = new Comparator() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$special$$inlined$thenBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    int iCompare = comparator.compare(t10, t11);
                    return iCompare != 0 ? iCompare : zComparator$ui_release.compare(((SemanticsNode) t10).getLayoutNode$ui_release(), ((SemanticsNode) t11).getLayoutNode$ui_release());
                }
            };
            comparatorArr[i10] = new Comparator() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$special$$inlined$thenBy$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    int iCompare = comparator2.compare(t10, t11);
                    return iCompare != 0 ? iCompare : AbstractC9260b.m16977d(Integer.valueOf(((SemanticsNode) t10).getId()), Integer.valueOf(((SemanticsNode) t11).getId()));
                }
            };
            i10++;
        }
        semanticComparators = comparatorArr;
        UnmergedConfigComparator = new InterfaceC10574p() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$UnmergedConfigComparator$1
            @Override // p300x7.InterfaceC10574p
            public final Integer invoke(SemanticsNode semanticsNode, SemanticsNode semanticsNode2) {
                SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
                SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
                return Integer.valueOf(Float.compare(((Number) unmergedConfig$ui_release.getOrElse(semanticsProperties.getTraversalIndex(), new InterfaceC10559a() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$UnmergedConfigComparator$1.1
                    @Override // p300x7.InterfaceC10559a
                    public final Float invoke() {
                        return Float.valueOf(0.0f);
                    }
                })).floatValue(), ((Number) semanticsNode2.getUnmergedConfig$ui_release().getOrElse(semanticsProperties.getTraversalIndex(), new InterfaceC10559a() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$UnmergedConfigComparator$1.2
                    @Override // p300x7.InterfaceC10559a
                    public final Float invoke() {
                        return Float.valueOf(0.0f);
                    }
                })).floatValue()));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean accessibilityEquals(AccessibilityAction<?> accessibilityAction, Object obj) {
        if (accessibilityAction == obj) {
            return true;
        }
        if (!(obj instanceof AccessibilityAction)) {
            return false;
        }
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) obj;
        if (!AbstractC9133u.m16128b(accessibilityAction.getLabel(), accessibilityAction2.getLabel())) {
            return false;
        }
        if (accessibilityAction.getAction() != null || accessibilityAction2.getAction() == null) {
            return accessibilityAction.getAction() == null || accessibilityAction2.getAction() != null;
        }
        return false;
    }

    private static final String createStateDescriptionForTextField(SemanticsNode semanticsNode, Resources resources) {
        SemanticsConfiguration config = semanticsNode.copyWithMergingEnabled$ui_release().getConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        Collection collection = (Collection) SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getContentDescription());
        if (collection != null && !collection.isEmpty()) {
            return null;
        }
        Collection collection2 = (Collection) SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getText());
        if (collection2 != null && !collection2.isEmpty()) {
            return null;
        }
        CharSequence charSequence = (CharSequence) SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getEditableText());
        if (charSequence == null || charSequence.length() == 0) {
            return resources.getString(C2608R.string.state_empty);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean enabled(SemanticsNode semanticsNode) {
        return !semanticsNode.getConfig().contains(SemanticsProperties.INSTANCE.getDisabled());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean excludeLineAndPageGranularities(SemanticsNode semanticsNode) {
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (unmergedConfig$ui_release.contains(semanticsProperties.getEditableText()) && !AbstractC9133u.m16128b(SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getFocused()), Boolean.TRUE)) {
            return true;
        }
        LayoutNode layoutNodeFindClosestParentNode = findClosestParentNode(semanticsNode.getLayoutNode$ui_release(), new InterfaceC10570l() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1
            /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
            @Override // p300x7.InterfaceC10570l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Boolean invoke(androidx.compose.p013ui.node.LayoutNode r3) {
                /*
                    r2 = this;
                    androidx.compose.ui.semantics.SemanticsConfiguration r3 = r3.getSemanticsConfiguration()
                    if (r3 == 0) goto L1a
                    boolean r0 = r3.isMergingSemanticsOfDescendants()
                    r1 = 1
                    if (r0 != r1) goto L1a
                    androidx.compose.ui.semantics.SemanticsProperties r0 = androidx.compose.p013ui.semantics.SemanticsProperties.INSTANCE
                    androidx.compose.ui.semantics.SemanticsPropertyKey r0 = r0.getEditableText()
                    boolean r3 = r3.contains(r0)
                    if (r3 == 0) goto L1a
                    goto L1b
                L1a:
                    r1 = 0
                L1b:
                    java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p013ui.platform.C2937x93be146e.invoke(androidx.compose.ui.node.LayoutNode):java.lang.Boolean");
            }
        });
        if (layoutNodeFindClosestParentNode != null) {
            SemanticsConfiguration semanticsConfiguration = layoutNodeFindClosestParentNode.getSemanticsConfiguration();
            if (!(semanticsConfiguration != null ? AbstractC9133u.m16128b(SemanticsConfigurationKt.getOrNull(semanticsConfiguration, semanticsProperties.getFocused()), Boolean.TRUE) : false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LayoutNode findClosestParentNode(LayoutNode layoutNode, InterfaceC10570l interfaceC10570l) {
        for (LayoutNode parent$ui_release = layoutNode.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            if (((Boolean) interfaceC10570l.invoke(parent$ui_release)).booleanValue()) {
                return parent$ui_release;
            }
        }
        return null;
    }

    private static final void geometryDepthFirstSearch(SemanticsNode semanticsNode, ArrayList<SemanticsNode> arrayList, MutableIntObjectMap<List<SemanticsNode>> mutableIntObjectMap, IntObjectMap<SemanticsNodeWithAdjustedBounds> intObjectMap, Resources resources) {
        boolean zIsRtl = isRtl(semanticsNode);
        boolean zBooleanValue = ((Boolean) semanticsNode.getUnmergedConfig$ui_release().getOrElse(SemanticsProperties.INSTANCE.getIsTraversalGroup(), new InterfaceC10559a() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$geometryDepthFirstSearch$isTraversalGroup$1
            @Override // p300x7.InterfaceC10559a
            public final Boolean invoke() {
                return Boolean.FALSE;
            }
        })).booleanValue();
        if ((zBooleanValue || isScreenReaderFocusable(semanticsNode, resources)) && intObjectMap.containsKey(semanticsNode.getId())) {
            arrayList.add(semanticsNode);
        }
        if (zBooleanValue) {
            mutableIntObjectMap.set(semanticsNode.getId(), subtreeSortedByGeometryGrouping(zIsRtl, semanticsNode.getChildren(), intObjectMap, resources));
            return;
        }
        List<SemanticsNode> children = semanticsNode.getChildren();
        int size = children.size();
        for (int i10 = 0; i10 < size; i10++) {
            geometryDepthFirstSearch(children.get(i10), arrayList, mutableIntObjectMap, intObjectMap, resources);
        }
    }

    @ExperimentalComposeUiApi
    public static final boolean getDisableContentCapture() {
        return ContentCaptureManager.Companion.isEnabled();
    }

    @InterfaceC8721a
    @ExperimentalComposeUiApi
    public static /* synthetic */ void getDisableContentCapture$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getInfoIsCheckable(SemanticsNode semanticsNode) {
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsProperties.getToggleableState());
        Role role = (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getRole());
        boolean z10 = toggleableState != null;
        if (((Boolean) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getSelected())) != null) {
            if (!(role != null ? Role.m26122equalsimpl0(role.m26125unboximpl(), Role.Companion.m26133getTabo7Vup1c()) : false)) {
                return true;
            }
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getInfoStateDescriptionOrNull(SemanticsNode semanticsNode, Resources resources) throws Resources.NotFoundException {
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        Object orNull = SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsProperties.getStateDescription());
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getToggleableState());
        Role role = (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getRole());
        if (toggleableState != null) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i10 == 1) {
                if ((role == null ? false : Role.m26122equalsimpl0(role.m26125unboximpl(), Role.Companion.m26132getSwitcho7Vup1c())) && orNull == null) {
                    orNull = resources.getString(C2608R.string.state_on);
                }
            } else if (i10 == 2) {
                if ((role == null ? false : Role.m26122equalsimpl0(role.m26125unboximpl(), Role.Companion.m26132getSwitcho7Vup1c())) && orNull == null) {
                    orNull = resources.getString(C2608R.string.state_off);
                }
            } else if (i10 == 3 && orNull == null) {
                orNull = resources.getString(C2608R.string.indeterminate);
            }
        }
        Boolean bool = (Boolean) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getSelected());
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if (!(role == null ? false : Role.m26122equalsimpl0(role.m26125unboximpl(), Role.Companion.m26133getTabo7Vup1c())) && orNull == null) {
                orNull = zBooleanValue ? resources.getString(C2608R.string.selected) : resources.getString(C2608R.string.not_selected);
            }
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getProgressBarRangeInfo());
        if (progressBarRangeInfo != null) {
            if (progressBarRangeInfo != ProgressBarRangeInfo.Companion.getIndeterminate()) {
                if (orNull == null) {
                    InterfaceC8317b range = progressBarRangeInfo.getRange();
                    float current = ((((Number) range.getEndInclusive()).floatValue() - ((Number) range.getStart()).floatValue()) > 0.0f ? 1 : ((((Number) range.getEndInclusive()).floatValue() - ((Number) range.getStart()).floatValue()) == 0.0f ? 0 : -1)) == 0 ? 0.0f : (progressBarRangeInfo.getCurrent() - ((Number) range.getStart()).floatValue()) / (((Number) range.getEndInclusive()).floatValue() - ((Number) range.getStart()).floatValue());
                    if (current < 0.0f) {
                        current = 0.0f;
                    }
                    if (current > 1.0f) {
                        current = 1.0f;
                    }
                    if (!(current == 0.0f)) {
                        iM13518m = (current == 1.0f ? 1 : 0) != 0 ? 100 : AbstractC8323h.m13518m(Math.round(current * 100), 1, 99);
                    }
                    orNull = resources.getString(C2608R.string.template_percent, Integer.valueOf(iM13518m));
                }
            } else if (orNull == null) {
                orNull = resources.getString(C2608R.string.in_progress);
            }
        }
        if (semanticsNode.getUnmergedConfig$ui_release().contains(semanticsProperties.getEditableText())) {
            orNull = createStateDescriptionForTextField(semanticsNode, resources);
        }
        return (String) orNull;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnnotatedString getInfoText(SemanticsNode semanticsNode) {
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        AnnotatedString annotatedString = (AnnotatedString) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsProperties.getEditableText());
        List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getText());
        return annotatedString == null ? list != null ? (AnnotatedString) AbstractC8778f0.m14568n0(list) : null : annotatedString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isRtl(SemanticsNode semanticsNode) {
        return semanticsNode.getLayoutInfo().getLayoutDirection() == LayoutDirection.Rtl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isScreenReaderFocusable(SemanticsNode semanticsNode, Resources resources) {
        List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getContentDescription());
        return !SemanticsUtils_androidKt.isHidden(semanticsNode) && (semanticsNode.getUnmergedConfig$ui_release().isMergingSemanticsOfDescendants() || (semanticsNode.isUnmergedLeafNode$ui_release() && ((list != null ? (String) AbstractC8778f0.m14568n0(list) : null) != null || getInfoText(semanticsNode) != null || getInfoStateDescriptionOrNull(semanticsNode, resources) != null || getInfoIsCheckable(semanticsNode))));
    }

    private static final boolean placedEntryRowOverlaps(ArrayList<Pair<Rect, List<SemanticsNode>>> arrayList, SemanticsNode semanticsNode) {
        float top2 = semanticsNode.getBoundsInWindow().getTop();
        float bottom = semanticsNode.getBoundsInWindow().getBottom();
        boolean z10 = top2 >= bottom;
        int iM14773p = AbstractC8809v.m14773p(arrayList);
        if (iM14773p >= 0) {
            int i10 = 0;
            while (true) {
                Rect rect = (Rect) arrayList.get(i10).m15906e();
                boolean z11 = rect.getTop() >= rect.getBottom();
                if (!z10 && !z11 && Math.max(top2, rect.getTop()) < Math.min(bottom, rect.getBottom())) {
                    arrayList.set(i10, new Pair<>(rect.intersect(0.0f, top2, Float.POSITIVE_INFINITY, bottom), arrayList.get(i10).m15907g()));
                    ((List) arrayList.get(i10).m15907g()).add(semanticsNode);
                    return true;
                }
                if (i10 == iM14773p) {
                    break;
                }
                i10++;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean propertiesDeleted(SemanticsNode semanticsNode, SemanticsConfiguration semanticsConfiguration) {
        Iterator<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>> it = semanticsConfiguration.iterator();
        while (it.hasNext()) {
            if (!semanticsNode.getConfig().contains(it.next().getKey())) {
                return true;
            }
        }
        return false;
    }

    @ExperimentalComposeUiApi
    public static final void setDisableContentCapture(boolean z10) {
        ContentCaptureManager.Companion.setEnabled(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setTraversalValues(IntObjectMap<SemanticsNodeWithAdjustedBounds> intObjectMap, MutableIntIntMap mutableIntIntMap, MutableIntIntMap mutableIntIntMap2, Resources resources) {
        mutableIntIntMap.clear();
        mutableIntIntMap2.clear();
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = intObjectMap.get(-1);
        SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
        AbstractC9133u.m16130d(semanticsNode);
        List<SemanticsNode> listSubtreeSortedByGeometryGrouping = subtreeSortedByGeometryGrouping(isRtl(semanticsNode), AbstractC8807u.m14755e(semanticsNode), intObjectMap, resources);
        int iM14773p = AbstractC8809v.m14773p(listSubtreeSortedByGeometryGrouping);
        int i10 = 1;
        if (1 > iM14773p) {
            return;
        }
        while (true) {
            int id = listSubtreeSortedByGeometryGrouping.get(i10 - 1).getId();
            int id2 = listSubtreeSortedByGeometryGrouping.get(i10).getId();
            mutableIntIntMap.set(id, id2);
            mutableIntIntMap2.set(id2, id);
            if (i10 == iM14773p) {
                return;
            } else {
                i10++;
            }
        }
    }

    private static final List<SemanticsNode> sortByGeometryGroupings(boolean z10, ArrayList<SemanticsNode> arrayList, Resources resources, MutableIntObjectMap<List<SemanticsNode>> mutableIntObjectMap) {
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int iM14773p = AbstractC8809v.m14773p(arrayList);
        int size = 0;
        if (iM14773p >= 0) {
            int i10 = 0;
            while (true) {
                SemanticsNode semanticsNode = arrayList.get(i10);
                if (i10 == 0 || !placedEntryRowOverlaps(arrayList2, semanticsNode)) {
                    arrayList2.add(new Pair(semanticsNode.getBoundsInWindow(), AbstractC8809v.m14776s(semanticsNode)));
                }
                if (i10 == iM14773p) {
                    break;
                }
                i10++;
            }
        }
        AbstractC8816z.m14795A(arrayList2, TopBottomBoundsComparator.INSTANCE);
        ArrayList arrayList3 = new ArrayList();
        Comparator<SemanticsNode> comparator = semanticComparators[!z10 ? 1 : 0];
        int size2 = arrayList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            Pair pair = (Pair) arrayList2.get(i11);
            AbstractC8816z.m14795A((List) pair.m15907g(), comparator);
            arrayList3.addAll((Collection) pair.m15907g());
        }
        final InterfaceC10574p interfaceC10574p = UnmergedConfigComparator;
        AbstractC8816z.m14795A(arrayList3, new Comparator() { // from class: androidx.compose.ui.platform.j
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AndroidComposeViewAccessibilityDelegateCompat_androidKt.sortByGeometryGroupings$lambda$5(interfaceC10574p, obj, obj2);
            }
        });
        while (size <= AbstractC8809v.m14773p(arrayList3)) {
            List<SemanticsNode> list = mutableIntObjectMap.get(((SemanticsNode) arrayList3.get(size)).getId());
            if (list != null) {
                if (isScreenReaderFocusable((SemanticsNode) arrayList3.get(size), resources)) {
                    size++;
                } else {
                    arrayList3.remove(size);
                }
                arrayList3.addAll(size, list);
                size += list.size();
            } else {
                size++;
            }
        }
        return arrayList3;
    }

    public static /* synthetic */ List sortByGeometryGroupings$default(boolean z10, ArrayList arrayList, Resources resources, MutableIntObjectMap mutableIntObjectMap, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            mutableIntObjectMap = IntObjectMapKt.mutableIntObjectMapOf();
        }
        return sortByGeometryGroupings(z10, arrayList, resources, mutableIntObjectMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sortByGeometryGroupings$lambda$5(InterfaceC10574p interfaceC10574p, Object obj, Object obj2) {
        return ((Number) interfaceC10574p.invoke(obj, obj2)).intValue();
    }

    private static final List<SemanticsNode> subtreeSortedByGeometryGrouping(boolean z10, List<SemanticsNode> list, IntObjectMap<SemanticsNodeWithAdjustedBounds> intObjectMap, Resources resources) {
        MutableIntObjectMap mutableIntObjectMapMutableIntObjectMapOf = IntObjectMapKt.mutableIntObjectMapOf();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            geometryDepthFirstSearch(list.get(i10), arrayList, mutableIntObjectMapMutableIntObjectMapOf, intObjectMap, resources);
        }
        return sortByGeometryGroupings(z10, arrayList, resources, mutableIntObjectMapMutableIntObjectMapOf);
    }
}
