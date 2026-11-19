package androidx.compose.p013ui.platform;

import android.annotation.SuppressLint;
import android.graphics.Region;
import android.view.View;
import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.layout.LayoutInfo;
import androidx.compose.p013ui.node.LayoutNode;
import androidx.compose.p013ui.semantics.AccessibilityAction;
import androidx.compose.p013ui.semantics.Role;
import androidx.compose.p013ui.semantics.SemanticsActions;
import androidx.compose.p013ui.semantics.SemanticsConfiguration;
import androidx.compose.p013ui.semantics.SemanticsConfigurationKt;
import androidx.compose.p013ui.semantics.SemanticsNode;
import androidx.compose.p013ui.semantics.SemanticsOwner;
import androidx.compose.p013ui.semantics.SemanticsProperties;
import androidx.compose.p013ui.text.TextLayoutResult;
import androidx.compose.p013ui.viewinterop.AndroidViewHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class SemanticsUtils_androidKt {
    private static final Rect DefaultFakeNodeBounds = new Rect(0.0f, 0.0f, 10.0f, 10.0f);

    public static final ScrollObservationScope findById(List<ScrollObservationScope> list, int i10) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (list.get(i11).getSemanticsNodeId() == i10) {
                return list.get(i11);
            }
        }
        return null;
    }

    public static final IntObjectMap<SemanticsNodeWithAdjustedBounds> getAllUncoveredSemanticsNodesToIntObjectMap(SemanticsOwner semanticsOwner) {
        SemanticsNode unmergedRootSemanticsNode = semanticsOwner.getUnmergedRootSemanticsNode();
        if (!unmergedRootSemanticsNode.getLayoutNode$ui_release().isPlaced() || !unmergedRootSemanticsNode.getLayoutNode$ui_release().isAttached()) {
            return IntObjectMapKt.emptyIntObjectMap();
        }
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(48);
        Rect boundsInRoot = unmergedRootSemanticsNode.getBoundsInRoot();
        m1201x1b6f0f0a(new Region(Math.round(boundsInRoot.getLeft()), Math.round(boundsInRoot.getTop()), Math.round(boundsInRoot.getRight()), Math.round(boundsInRoot.getBottom())), unmergedRootSemanticsNode, mutableIntObjectMap, unmergedRootSemanticsNode, new Region());
        return mutableIntObjectMap;
    }

    /* renamed from: getAllUncoveredSemanticsNodesToIntObjectMap$findAllSemanticNodesRecursive */
    private static final void m1201x1b6f0f0a(Region region, SemanticsNode semanticsNode, MutableIntObjectMap<SemanticsNodeWithAdjustedBounds> mutableIntObjectMap, SemanticsNode semanticsNode2, Region region2) {
        LayoutInfo layoutInfo;
        boolean z10 = (semanticsNode2.getLayoutNode$ui_release().isPlaced() && semanticsNode2.getLayoutNode$ui_release().isAttached()) ? false : true;
        if (!region.isEmpty() || semanticsNode2.getId() == semanticsNode.getId()) {
            if (!z10 || semanticsNode2.isFake$ui_release()) {
                Rect touchBoundsInRoot = semanticsNode2.getTouchBoundsInRoot();
                int iRound = Math.round(touchBoundsInRoot.getLeft());
                int iRound2 = Math.round(touchBoundsInRoot.getTop());
                int iRound3 = Math.round(touchBoundsInRoot.getRight());
                int iRound4 = Math.round(touchBoundsInRoot.getBottom());
                region2.set(iRound, iRound2, iRound3, iRound4);
                int id = semanticsNode2.getId() == semanticsNode.getId() ? -1 : semanticsNode2.getId();
                if (!region2.op(region, Region.Op.INTERSECT)) {
                    if (semanticsNode2.isFake$ui_release()) {
                        SemanticsNode parent = semanticsNode2.getParent();
                        Rect boundsInRoot = (parent == null || (layoutInfo = parent.getLayoutInfo()) == null || !layoutInfo.isPlaced()) ? DefaultFakeNodeBounds : parent.getBoundsInRoot();
                        mutableIntObjectMap.set(id, new SemanticsNodeWithAdjustedBounds(semanticsNode2, new android.graphics.Rect(Math.round(boundsInRoot.getLeft()), Math.round(boundsInRoot.getTop()), Math.round(boundsInRoot.getRight()), Math.round(boundsInRoot.getBottom()))));
                        return;
                    } else {
                        if (id == -1) {
                            mutableIntObjectMap.set(id, new SemanticsNodeWithAdjustedBounds(semanticsNode2, region2.getBounds()));
                            return;
                        }
                        return;
                    }
                }
                mutableIntObjectMap.set(id, new SemanticsNodeWithAdjustedBounds(semanticsNode2, region2.getBounds()));
                List<SemanticsNode> replacedChildren$ui_release = semanticsNode2.getReplacedChildren$ui_release();
                for (int size = replacedChildren$ui_release.size() - 1; -1 < size; size--) {
                    if (!replacedChildren$ui_release.get(size).getConfig().contains(SemanticsProperties.INSTANCE.getLinkTestMarker())) {
                        m1201x1b6f0f0a(region, semanticsNode, mutableIntObjectMap, replacedChildren$ui_release.get(size), region2);
                    }
                }
                if (isImportantForAccessibility(semanticsNode2)) {
                    region.op(iRound, iRound2, iRound3, iRound4, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static final Rect getDefaultFakeNodeBounds() {
        return DefaultFakeNodeBounds;
    }

    @SuppressLint({"PrimitiveInCollection"})
    public static final Float getScrollViewportLength(SemanticsConfiguration semanticsConfiguration) {
        InterfaceC10570l interfaceC10570l;
        ArrayList arrayList = new ArrayList();
        AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsActions.INSTANCE.getGetScrollViewportLength());
        if (accessibilityAction == null || (interfaceC10570l = (InterfaceC10570l) accessibilityAction.getAction()) == null || !((Boolean) interfaceC10570l.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (Float) arrayList.get(0);
    }

    public static final TextLayoutResult getTextLayoutResult(SemanticsConfiguration semanticsConfiguration) {
        InterfaceC10570l interfaceC10570l;
        ArrayList arrayList = new ArrayList();
        AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsActions.INSTANCE.getGetTextLayoutResult());
        if (accessibilityAction == null || (interfaceC10570l = (InterfaceC10570l) accessibilityAction.getAction()) == null || !((Boolean) interfaceC10570l.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (TextLayoutResult) arrayList.get(0);
    }

    public static final boolean isHidden(SemanticsNode semanticsNode) {
        if (semanticsNode.isTransparent$ui_release()) {
            return true;
        }
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        return unmergedConfig$ui_release.contains(semanticsProperties.getHideFromAccessibility()) || semanticsNode.getUnmergedConfig$ui_release().contains(semanticsProperties.getInvisibleToUser());
    }

    public static /* synthetic */ void isHidden$annotations(SemanticsNode semanticsNode) {
    }

    public static final boolean isImportantForAccessibility(SemanticsNode semanticsNode) {
        if (isHidden(semanticsNode)) {
            return false;
        }
        return semanticsNode.getUnmergedConfig$ui_release().isMergingSemanticsOfDescendants() || semanticsNode.getUnmergedConfig$ui_release().containsImportantForAccessibility$ui_release();
    }

    public static final View semanticsIdToView(AndroidViewsHandler androidViewsHandler, int i10) {
        Object next;
        Iterator<T> it = androidViewsHandler.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((LayoutNode) ((Map.Entry) next).getKey()).getSemanticsId() == i10) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (AndroidViewHolder) entry.getValue();
        }
        return null;
    }

    /* renamed from: toLegacyClassName-V4PA4sw, reason: not valid java name */
    public static final String m26097toLegacyClassNameV4PA4sw(int i10) {
        Role.Companion companion = Role.Companion;
        if (Role.m26122equalsimpl0(i10, companion.m26126getButtono7Vup1c())) {
            return "android.widget.Button";
        }
        if (Role.m26122equalsimpl0(i10, companion.m26128getCheckboxo7Vup1c())) {
            return "android.widget.CheckBox";
        }
        if (Role.m26122equalsimpl0(i10, companion.m26131getRadioButtono7Vup1c())) {
            return "android.widget.RadioButton";
        }
        if (Role.m26122equalsimpl0(i10, companion.m26130getImageo7Vup1c())) {
            return "android.widget.ImageView";
        }
        if (Role.m26122equalsimpl0(i10, companion.m26129getDropdownListo7Vup1c())) {
            return "android.widget.Spinner";
        }
        if (Role.m26122equalsimpl0(i10, companion.m26134getValuePickero7Vup1c())) {
            return "android.widget.NumberPicker";
        }
        return null;
    }
}
