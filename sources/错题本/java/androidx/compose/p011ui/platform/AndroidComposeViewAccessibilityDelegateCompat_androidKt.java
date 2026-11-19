package androidx.compose.p011ui.platform;

import android.content.res.Resources;
import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntIntMap;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.p011ui.C2075R;
import androidx.compose.p011ui.ExperimentalComposeUiApi;
import androidx.compose.p011ui.contentcapture.ContentCaptureManager;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.node.LayoutNode;
import androidx.compose.p011ui.semantics.AccessibilityAction;
import androidx.compose.p011ui.semantics.ProgressBarRangeInfo;
import androidx.compose.p011ui.semantics.Role;
import androidx.compose.p011ui.semantics.SemanticsConfiguration;
import androidx.compose.p011ui.semantics.SemanticsConfigurationKt;
import androidx.compose.p011ui.semantics.SemanticsNode;
import androidx.compose.p011ui.semantics.SemanticsProperties;
import androidx.compose.p011ui.semantics.SemanticsPropertyKey;
import androidx.compose.p011ui.state.ToggleableState;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.AbstractC5809x;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p200x6.C6751a;
import p200x6.InterfaceC6752b;
import p204y1.AbstractC6768a;

@Metadata(m5109d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\u001a)\u0010\u0004\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a5\u0010\u000f\u001a\u00020\u000e2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001aA\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\u0006\u0010\u0011\u001a\u00020\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001aY\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00132\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0019j\b\u0012\u0004\u0012\u00020\u0013`\u001a2\u0012\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00150\u001c2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001aS\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\u0006\u0010\u0011\u001a\u00020\u00022\u0016\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0019j\b\u0012\u0004\u0012\u00020\u0013`\u001a2\u0006\u0010\r\u001a\u00020\f2\u0014\b\u0002\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00150\u001cH\u0002¢\u0006\u0004\b\"\u0010#\u001a\u001f\u0010%\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b%\u0010&\u001a\u0019\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010$\u001a\u00020\u0013H\u0002¢\u0006\u0004\b(\u0010)\u001a!\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010$\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b+\u0010,\u001a!\u0010-\u001a\u0004\u0018\u00010*2\u0006\u0010$\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b-\u0010,\u001a\u0017\u0010.\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0013H\u0002¢\u0006\u0004\b.\u0010/\u001aS\u00103\u001a\u00020\u00022:\u00102\u001a6\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u000201\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0015000\u0019j\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u000201\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u001500`\u001a2\u0006\u0010$\u001a\u00020\u0013H\u0002¢\u0006\u0004\b3\u00104\u001a\u0013\u00105\u001a\u00020\u0002*\u00020\u0013H\u0002¢\u0006\u0004\b5\u0010/\u001a\u001b\u00108\u001a\u00020\u0002*\u00020\u00132\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b8\u00109\u001a\u0013\u0010:\u001a\u00020\u0002*\u00020\u0013H\u0002¢\u0006\u0004\b:\u0010/\u001a!\u0010>\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030;2\b\u0010=\u001a\u0004\u0018\u00010<H\u0002¢\u0006\u0004\b>\u0010?\"*\u0010C\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00130Aj\b\u0012\u0004\u0012\u00020\u0013`B0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010D\"&\u0010G\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020F0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010H\"\u0018\u0010I\u001a\u00020\u0002*\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010/\"*\u0010Q\u001a\u00020\u00022\u0006\u0010J\u001a\u00020\u00028G@GX\u0087\u000e¢\u0006\u0012\u0012\u0004\bO\u0010P\u001a\u0004\bK\u0010L\"\u0004\bM\u0010N¨\u0006R"}, m5110d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Function1;", "", "selector", "findClosestParentNode", "(Landroidx/compose/ui/node/LayoutNode;Lr6/c;)Landroidx/compose/ui/node/LayoutNode;", "Landroidx/collection/IntObjectMap;", "Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "currentSemanticsNodes", "Landroidx/collection/MutableIntIntMap;", "outputBeforeMap", "outputAfterMap", "Landroid/content/res/Resources;", "resources", "Ld6/s;", "setTraversalValues", "(Landroidx/collection/IntObjectMap;Landroidx/collection/MutableIntIntMap;Landroidx/collection/MutableIntIntMap;Landroid/content/res/Resources;)V", "layoutIsRtl", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "listToSort", "", "subtreeSortedByGeometryGrouping", "(ZLjava/util/List;Landroidx/collection/IntObjectMap;Landroid/content/res/Resources;)Ljava/util/List;", "currNode", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "geometryList", "Landroidx/collection/MutableIntObjectMap;", "containerMapToChildren", "geometryDepthFirstSearch", "(Landroidx/compose/ui/semantics/SemanticsNode;Ljava/util/ArrayList;Landroidx/collection/MutableIntObjectMap;Landroidx/collection/IntObjectMap;Landroid/content/res/Resources;)V", "parentListToSort", "containerChildrenMapping", "sortByGeometryGroupings", "(ZLjava/util/ArrayList;Landroid/content/res/Resources;Landroidx/collection/MutableIntObjectMap;)Ljava/util/List;", "node", "isScreenReaderFocusable", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroid/content/res/Resources;)Z", "Landroidx/compose/ui/text/AnnotatedString;", "getInfoText", "(Landroidx/compose/ui/semantics/SemanticsNode;)Landroidx/compose/ui/text/AnnotatedString;", "", "getInfoStateDescriptionOrNull", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroid/content/res/Resources;)Ljava/lang/String;", "createStateDescriptionForTextField", "getInfoIsCheckable", "(Landroidx/compose/ui/semantics/SemanticsNode;)Z", "Lkotlin/Pair;", "Landroidx/compose/ui/geometry/Rect;", "rowGroupings", "placedEntryRowOverlaps", "(Ljava/util/ArrayList;Landroidx/compose/ui/semantics/SemanticsNode;)Z", "enabled", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "oldConfig", "propertiesDeleted", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroidx/compose/ui/semantics/SemanticsConfiguration;)Z", "excludeLineAndPageGranularities", "Landroidx/compose/ui/semantics/AccessibilityAction;", "", "other", "accessibilityEquals", "(Landroidx/compose/ui/semantics/AccessibilityAction;Ljava/lang/Object;)Z", "", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "semanticComparators", "[Ljava/util/Comparator;", "Lkotlin/Function2;", "", "UnmergedConfigComparator", "Lr6/e;", "isRtl", "value", "getDisableContentCapture", "()Z", "setDisableContentCapture", "(Z)V", "getDisableContentCapture$annotations", "()V", "DisableContentCapture", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAndroidComposeViewAccessibilityDelegateCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3362:1\n34#2,6:3363\n34#2,6:3369\n34#2,6:3375\n65#3,10:3381\n26#4:3391\n1#5:3392\n*S KotlinDebug\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat_androidKt\n*L\n2997#1:3363,6\n3041#1:3369,6\n3089#1:3375,6\n3208#1:3381,10\n3215#1:3391\n*E\n"})
/* loaded from: classes2.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat_androidKt {

    @NotNull
    private static final InterfaceC6473e UnmergedConfigComparator;

    @NotNull
    private static final Comparator<SemanticsNode>[] semanticComparators;

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.f928On.ordinal()] = 1;
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
        int i = 0;
        while (i < 2) {
            final Comparator comparator = i == 0 ? RtlBoundsComparator.INSTANCE : LtrBoundsComparator.INSTANCE;
            final Comparator<LayoutNode> zComparator$ui_release = LayoutNode.INSTANCE.getZComparator$ui_release();
            final Comparator comparator2 = new Comparator() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$special$$inlined$thenBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t8, T t9) {
                    int iCompare = comparator.compare(t8, t9);
                    return iCompare != 0 ? iCompare : zComparator$ui_release.compare(((SemanticsNode) t8).getLayoutNode(), ((SemanticsNode) t9).getLayoutNode());
                }
            };
            comparatorArr[i] = new Comparator() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$special$$inlined$thenBy$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t8, T t9) {
                    int iCompare = comparator2.compare(t8, t9);
                    return iCompare != 0 ? iCompare : AbstractC6768a.m6441f(Integer.valueOf(((SemanticsNode) t8).getId()), Integer.valueOf(((SemanticsNode) t9).getId()));
                }
            };
            i++;
        }
        semanticComparators = comparatorArr;
        UnmergedConfigComparator = new InterfaceC6473e() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$UnmergedConfigComparator$1
            @Override // p152r6.InterfaceC6473e
            public final Integer invoke(SemanticsNode semanticsNode, SemanticsNode semanticsNode2) {
                SemanticsConfiguration unmergedConfig = semanticsNode.getUnmergedConfig();
                SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
                return Integer.valueOf(Float.compare(((Number) unmergedConfig.getOrElse(semanticsProperties.getTraversalIndex(), new InterfaceC6469a() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$UnmergedConfigComparator$1.1
                    @Override // p152r6.InterfaceC6469a
                    public final Float invoke() {
                        return Float.valueOf(0.0f);
                    }
                })).floatValue(), ((Number) semanticsNode2.getUnmergedConfig().getOrElse(semanticsProperties.getTraversalIndex(), new InterfaceC6469a() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$UnmergedConfigComparator$1.2
                    @Override // p152r6.InterfaceC6469a
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
        if (!AbstractC5830k.m5325b(accessibilityAction.getLabel(), accessibilityAction2.getLabel())) {
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
            return resources.getString(C2075R.string.state_empty);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean enabled(SemanticsNode semanticsNode) {
        return !semanticsNode.getConfig().contains(SemanticsProperties.INSTANCE.getDisabled());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean excludeLineAndPageGranularities(SemanticsNode semanticsNode) {
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (unmergedConfig$ui_release.contains(semanticsProperties.getEditableText()) && !AbstractC5830k.m5325b(SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties.getFocused()), Boolean.TRUE)) {
            return true;
        }
        LayoutNode layoutNodeFindClosestParentNode = findClosestParentNode(semanticsNode.getLayoutNode(), new InterfaceC6471c() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1
            /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
            @Override // p152r6.InterfaceC6471c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Boolean invoke(androidx.compose.p011ui.node.LayoutNode r3) {
                /*
                    r2 = this;
                    androidx.compose.ui.semantics.SemanticsConfiguration r3 = r3.getSemanticsConfiguration()
                    if (r3 == 0) goto L1a
                    boolean r0 = r3.getIsMergingSemanticsOfDescendants()
                    r1 = 1
                    if (r0 != r1) goto L1a
                    androidx.compose.ui.semantics.SemanticsProperties r0 = androidx.compose.p011ui.semantics.SemanticsProperties.INSTANCE
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
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p011ui.platform.C2215x93be146e.invoke(androidx.compose.ui.node.LayoutNode):java.lang.Boolean");
            }
        });
        if (layoutNodeFindClosestParentNode != null) {
            SemanticsConfiguration semanticsConfiguration = layoutNodeFindClosestParentNode.getSemanticsConfiguration();
            if (!(semanticsConfiguration != null ? AbstractC5830k.m5325b(SemanticsConfigurationKt.getOrNull(semanticsConfiguration, semanticsProperties.getFocused()), Boolean.TRUE) : false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LayoutNode findClosestParentNode(LayoutNode layoutNode, InterfaceC6471c interfaceC6471c) {
        for (LayoutNode parent$ui_release = layoutNode.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            if (((Boolean) interfaceC6471c.invoke(parent$ui_release)).booleanValue()) {
                return parent$ui_release;
            }
        }
        return null;
    }

    private static final void geometryDepthFirstSearch(SemanticsNode semanticsNode, ArrayList<SemanticsNode> arrayList, MutableIntObjectMap<List<SemanticsNode>> mutableIntObjectMap, IntObjectMap<SemanticsNodeWithAdjustedBounds> intObjectMap, Resources resources) {
        boolean zIsRtl = isRtl(semanticsNode);
        boolean zBooleanValue = ((Boolean) semanticsNode.getUnmergedConfig().getOrElse(SemanticsProperties.INSTANCE.getIsTraversalGroup(), new InterfaceC6469a() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$geometryDepthFirstSearch$isTraversalGroup$1
            @Override // p152r6.InterfaceC6469a
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
        for (int i = 0; i < size; i++) {
            geometryDepthFirstSearch(children.get(i), arrayList, mutableIntObjectMap, intObjectMap, resources);
        }
    }

    @ExperimentalComposeUiApi
    public static final boolean getDisableContentCapture() {
        return ContentCaptureManager.INSTANCE.isEnabled();
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use ContentCapture.isEnabled instead", replaceWith = @ReplaceWith(expression = "!ContentCaptureManager.isEnabled", imports = {"androidx.compose.ui.contentcapture.ContentCaptureManager.Companion.isEnabled"}))
    @ExperimentalComposeUiApi
    public static /* synthetic */ void getDisableContentCapture$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getInfoIsCheckable(SemanticsNode semanticsNode) {
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsProperties.getToggleableState());
        Role role = (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties.getRole());
        boolean z8 = toggleableState != null;
        if (((Boolean) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties.getSelected())) != null) {
            if (!(role != null ? Role.m12528equalsimpl0(role.getValue(), Role.INSTANCE.m12539getTabo7Vup1c()) : false)) {
                return true;
            }
        }
        return z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getInfoStateDescriptionOrNull(SemanticsNode semanticsNode, Resources resources) throws Resources.NotFoundException {
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        Object orNull = SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsProperties.getStateDescription());
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties.getToggleableState());
        Role role = (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties.getRole());
        if (toggleableState != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i == 1) {
                if ((role == null ? false : Role.m12528equalsimpl0(role.getValue(), Role.INSTANCE.m12538getSwitcho7Vup1c())) && orNull == null) {
                    orNull = resources.getString(C2075R.string.state_on);
                }
            } else if (i == 2) {
                if ((role == null ? false : Role.m12528equalsimpl0(role.getValue(), Role.INSTANCE.m12538getSwitcho7Vup1c())) && orNull == null) {
                    orNull = resources.getString(C2075R.string.state_off);
                }
            } else if (i == 3 && orNull == null) {
                orNull = resources.getString(C2075R.string.indeterminate);
            }
        }
        Boolean bool = (Boolean) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties.getSelected());
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if (!(role == null ? false : Role.m12528equalsimpl0(role.getValue(), Role.INSTANCE.m12539getTabo7Vup1c())) && orNull == null) {
                orNull = zBooleanValue ? resources.getString(C2075R.string.selected) : resources.getString(C2075R.string.not_selected);
            }
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties.getProgressBarRangeInfo());
        if (progressBarRangeInfo != null) {
            if (progressBarRangeInfo != ProgressBarRangeInfo.INSTANCE.getIndeterminate()) {
                if (orNull == null) {
                    InterfaceC6752b range = progressBarRangeInfo.getRange();
                    float fFloatValue = Float.valueOf(((C6751a) range).f11419b).floatValue();
                    C6751a c6751a = (C6751a) range;
                    float f = c6751a.f11418a;
                    float current = ((fFloatValue - Float.valueOf(f).floatValue()) > 0.0f ? 1 : ((fFloatValue - Float.valueOf(f).floatValue()) == 0.0f ? 0 : -1)) == 0 ? 0.0f : (progressBarRangeInfo.getCurrent() - Float.valueOf(f).floatValue()) / (Float.valueOf(c6751a.f11419b).floatValue() - Float.valueOf(f).floatValue());
                    if (current < 0.0f) {
                        current = 0.0f;
                    }
                    if (current > 1.0f) {
                        current = 1.0f;
                    }
                    if (!(current == 0.0f)) {
                        iM5274m = (current == 1.0f ? 1 : 0) != 0 ? 100 : AbstractC5806u.m5274m(Math.round(current * 100), 1, 99);
                    }
                    orNull = resources.getString(C2075R.string.template_percent, Integer.valueOf(iM5274m));
                }
            } else if (orNull == null) {
                orNull = resources.getString(C2075R.string.in_progress);
            }
        }
        if (semanticsNode.getUnmergedConfig().contains(semanticsProperties.getEditableText())) {
            orNull = createStateDescriptionForTextField(semanticsNode, resources);
        }
        return (String) orNull;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnnotatedString getInfoText(SemanticsNode semanticsNode) {
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        AnnotatedString annotatedString = (AnnotatedString) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsProperties.getEditableText());
        List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties.getText());
        return annotatedString == null ? list != null ? (AnnotatedString) AbstractC5805t.m5229i0(list) : null : annotatedString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isRtl(SemanticsNode semanticsNode) {
        return semanticsNode.getLayoutInfo().getLayoutDirection() == LayoutDirection.Rtl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isScreenReaderFocusable(SemanticsNode semanticsNode, Resources resources) {
        List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getContentDescription());
        return !SemanticsUtils_androidKt.isHidden(semanticsNode) && (semanticsNode.getUnmergedConfig().getIsMergingSemanticsOfDescendants() || (semanticsNode.isUnmergedLeafNode$ui_release() && ((list != null ? (String) AbstractC5805t.m5229i0(list) : null) != null || getInfoText(semanticsNode) != null || getInfoStateDescriptionOrNull(semanticsNode, resources) != null || getInfoIsCheckable(semanticsNode))));
    }

    private static final boolean placedEntryRowOverlaps(ArrayList<Pair<Rect, List<SemanticsNode>>> arrayList, SemanticsNode semanticsNode) {
        float top2 = semanticsNode.getBoundsInWindow().getTop();
        float bottom = semanticsNode.getBoundsInWindow().getBottom();
        boolean z8 = top2 >= bottom;
        int iM5282u = AbstractC5806u.m5282u(arrayList);
        if (iM5282u >= 0) {
            int i = 0;
            while (true) {
                Rect first = arrayList.get(i).getFirst();
                boolean z9 = first.getTop() >= first.getBottom();
                if (!z8 && !z9 && Math.max(top2, first.getTop()) < Math.min(bottom, first.getBottom())) {
                    arrayList.set(i, new Pair<>(first.intersect(0.0f, top2, Float.POSITIVE_INFINITY, bottom), arrayList.get(i).getSecond()));
                    arrayList.get(i).getSecond().add(semanticsNode);
                    return true;
                }
                if (i == iM5282u) {
                    break;
                }
                i++;
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
    public static final void setDisableContentCapture(boolean z8) {
        ContentCaptureManager.INSTANCE.setEnabled(z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setTraversalValues(IntObjectMap<SemanticsNodeWithAdjustedBounds> intObjectMap, MutableIntIntMap mutableIntIntMap, MutableIntIntMap mutableIntIntMap2, Resources resources) {
        mutableIntIntMap.clear();
        mutableIntIntMap2.clear();
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = intObjectMap.get(-1);
        SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
        AbstractC5830k.m5327d(semanticsNode);
        List<SemanticsNode> listSubtreeSortedByGeometryGrouping = subtreeSortedByGeometryGrouping(isRtl(semanticsNode), AbstractC5806u.m5286y(semanticsNode), intObjectMap, resources);
        int iM5282u = AbstractC5806u.m5282u(listSubtreeSortedByGeometryGrouping);
        int i = 1;
        if (1 > iM5282u) {
            return;
        }
        while (true) {
            int id = listSubtreeSortedByGeometryGrouping.get(i - 1).getId();
            int id2 = listSubtreeSortedByGeometryGrouping.get(i).getId();
            mutableIntIntMap.set(id, id2);
            mutableIntIntMap2.set(id2, id);
            if (i == iM5282u) {
                return;
            } else {
                i++;
            }
        }
    }

    private static final List<SemanticsNode> sortByGeometryGroupings(boolean z8, ArrayList<SemanticsNode> arrayList, Resources resources, MutableIntObjectMap<List<SemanticsNode>> mutableIntObjectMap) {
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int iM5282u = AbstractC5806u.m5282u(arrayList);
        int size = 0;
        if (iM5282u >= 0) {
            int i = 0;
            while (true) {
                SemanticsNode semanticsNode = arrayList.get(i);
                if (i == 0 || !placedEntryRowOverlaps(arrayList2, semanticsNode)) {
                    arrayList2.add(new Pair(semanticsNode.getBoundsInWindow(), AbstractC5806u.m5247A(semanticsNode)));
                }
                if (i == iM5282u) {
                    break;
                }
                i++;
            }
        }
        AbstractC5809x.m5289Q(arrayList2, TopBottomBoundsComparator.INSTANCE);
        ArrayList arrayList3 = new ArrayList();
        Comparator<SemanticsNode> comparator = semanticComparators[!z8 ? 1 : 0];
        int size2 = arrayList2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            Pair pair = (Pair) arrayList2.get(i8);
            AbstractC5809x.m5289Q((List) pair.getSecond(), comparator);
            arrayList3.addAll((Collection) pair.getSecond());
        }
        final InterfaceC6473e interfaceC6473e = UnmergedConfigComparator;
        AbstractC5809x.m5289Q(arrayList3, new Comparator() { // from class: androidx.compose.ui.platform.g
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AndroidComposeViewAccessibilityDelegateCompat_androidKt.sortByGeometryGroupings$lambda$5(interfaceC6473e, obj, obj2);
            }
        });
        while (size <= AbstractC5806u.m5282u(arrayList3)) {
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

    public static /* synthetic */ List sortByGeometryGroupings$default(boolean z8, ArrayList arrayList, Resources resources, MutableIntObjectMap mutableIntObjectMap, int i, Object obj) {
        if ((i & 8) != 0) {
            mutableIntObjectMap = IntObjectMapKt.mutableIntObjectMapOf();
        }
        return sortByGeometryGroupings(z8, arrayList, resources, mutableIntObjectMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sortByGeometryGroupings$lambda$5(InterfaceC6473e interfaceC6473e, Object obj, Object obj2) {
        return ((Number) interfaceC6473e.invoke(obj, obj2)).intValue();
    }

    private static final List<SemanticsNode> subtreeSortedByGeometryGrouping(boolean z8, List<SemanticsNode> list, IntObjectMap<SemanticsNodeWithAdjustedBounds> intObjectMap, Resources resources) {
        MutableIntObjectMap mutableIntObjectMapMutableIntObjectMapOf = IntObjectMapKt.mutableIntObjectMapOf();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            geometryDepthFirstSearch(list.get(i), arrayList, mutableIntObjectMapMutableIntObjectMapOf, intObjectMap, resources);
        }
        return sortByGeometryGroupings(z8, arrayList, resources, mutableIntObjectMapMutableIntObjectMapOf);
    }
}
