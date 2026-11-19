package androidx.compose.p014ui.platform.accessibility;

import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.semantics.CollectionInfo;
import androidx.compose.p014ui.semantics.CollectionItemInfo;
import androidx.compose.p014ui.semantics.SemanticsConfiguration;
import androidx.compose.p014ui.semantics.SemanticsConfigurationKt;
import androidx.compose.p014ui.semantics.SemanticsNode;
import androidx.compose.p014ui.semantics.SemanticsProperties;
import androidx.compose.p014ui.util.ListUtilsKt;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.ArrayList;
import java.util.List;
import p181hd.InterfaceC9529a;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10978w;

/* loaded from: classes2.dex */
public final class CollectionInfo_androidKt {
    private static final boolean calculateIfHorizontallyStacked(List<SemanticsNode> list) {
        List listM24136n;
        long jM30647unboximpl;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() <= 1) {
            listM24136n = AbstractC10978w.m24136n();
        } else {
            ArrayList arrayList = new ArrayList();
            SemanticsNode semanticsNode = list.get(0);
            int iM24138p = AbstractC10978w.m24138p(list);
            int i10 = 0;
            while (i10 < iM24138p) {
                i10++;
                SemanticsNode semanticsNode2 = list.get(i10);
                SemanticsNode semanticsNode3 = semanticsNode2;
                SemanticsNode semanticsNode4 = semanticsNode;
                arrayList.add(Offset.m30626boximpl(Offset.m30629constructorimpl((Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (semanticsNode4.getBoundsInRoot().m30667getCenterF1C5BW0() >> 32)) - Float.intBitsToFloat((int) (semanticsNode3.getBoundsInRoot().m30667getCenterF1C5BW0() >> 32)))) << 32) | (Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (semanticsNode4.getBoundsInRoot().m30667getCenterF1C5BW0() & 4294967295L)) - Float.intBitsToFloat((int) (semanticsNode3.getBoundsInRoot().m30667getCenterF1C5BW0() & 4294967295L)))) & 4294967295L))));
                semanticsNode = semanticsNode2;
            }
            listM24136n = arrayList;
        }
        if (listM24136n.size() == 1) {
            jM30647unboximpl = ((Offset) AbstractC10947g0.m23944m0(listM24136n)).m30647unboximpl();
        } else {
            if (listM24136n.isEmpty()) {
                ListUtilsKt.throwUnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object objM23944m0 = AbstractC10947g0.m23944m0(listM24136n);
            int iM24138p2 = AbstractC10978w.m24138p(listM24136n);
            if (1 <= iM24138p2) {
                int i11 = 1;
                while (true) {
                    objM23944m0 = Offset.m30626boximpl(Offset.m30642plusMKHz9U(((Offset) objM23944m0).m30647unboximpl(), ((Offset) listM24136n.get(i11)).m30647unboximpl()));
                    if (i11 == iM24138p2) {
                        break;
                    }
                    i11++;
                }
            }
            jM30647unboximpl = ((Offset) objM23944m0).m30647unboximpl();
        }
        return Float.intBitsToFloat((int) (4294967295L & jM30647unboximpl)) < Float.intBitsToFloat((int) (jM30647unboximpl >> 32));
    }

    public static final boolean hasCollectionInfo(SemanticsNode semanticsNode) {
        SemanticsConfiguration config = semanticsNode.getConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        return (SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getCollectionInfo()) == null && SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), semanticsProperties.getSelectableGroup()) == null) ? false : true;
    }

    private static final boolean isLazyCollection(CollectionInfo collectionInfo) {
        return collectionInfo.getRowCount() < 0 || collectionInfo.getColumnCount() < 0;
    }

    public static final void setCollectionInfo(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        SemanticsConfiguration config = semanticsNode.getConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        CollectionInfo collectionInfo = (CollectionInfo) SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getCollectionInfo());
        if (collectionInfo != null) {
            accessibilityNodeInfoCompat.setCollectionInfo(toAccessibilityCollectionInfo(collectionInfo));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), semanticsProperties.getSelectableGroup()) != null) {
            List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
            int size = replacedChildren$ui_release.size();
            for (int i10 = 0; i10 < size; i10++) {
                SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i10);
                if (semanticsNode2.getConfig().contains(SemanticsProperties.INSTANCE.getSelected())) {
                    arrayList.add(semanticsNode2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean zCalculateIfHorizontallyStacked = calculateIfHorizontallyStacked(arrayList);
        accessibilityNodeInfoCompat.setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(zCalculateIfHorizontallyStacked ? 1 : arrayList.size(), zCalculateIfHorizontallyStacked ? arrayList.size() : 1, false, 0));
    }

    public static final void setCollectionItemInfo(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        SemanticsConfiguration config = semanticsNode.getConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        CollectionItemInfo collectionItemInfo = (CollectionItemInfo) SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getCollectionItemInfo());
        if (collectionItemInfo != null) {
            accessibilityNodeInfoCompat.setCollectionItemInfo(toAccessibilityCollectionItemInfo(collectionItemInfo, semanticsNode));
        }
        SemanticsNode parent = semanticsNode.getParent();
        if (parent == null || SemanticsConfigurationKt.getOrNull(parent.getConfig(), semanticsProperties.getSelectableGroup()) == null) {
            return;
        }
        CollectionInfo collectionInfo = (CollectionInfo) SemanticsConfigurationKt.getOrNull(parent.getConfig(), semanticsProperties.getCollectionInfo());
        if ((collectionInfo == null || !isLazyCollection(collectionInfo)) && semanticsNode.getConfig().contains(semanticsProperties.getSelected())) {
            ArrayList arrayList = new ArrayList();
            List<SemanticsNode> replacedChildren$ui_release = parent.getReplacedChildren$ui_release();
            int size = replacedChildren$ui_release.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i11);
                if (semanticsNode2.getConfig().contains(SemanticsProperties.INSTANCE.getSelected())) {
                    arrayList.add(semanticsNode2);
                    if (semanticsNode2.getLayoutNode$ui_release().getPlaceOrder$ui_release() < semanticsNode.getLayoutNode$ui_release().getPlaceOrder$ui_release()) {
                        i10++;
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            boolean zCalculateIfHorizontallyStacked = calculateIfHorizontallyStacked(arrayList);
            AccessibilityNodeInfoCompat.CollectionItemInfoCompat collectionItemInfoCompatObtain = AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(zCalculateIfHorizontallyStacked ? 0 : i10, 1, zCalculateIfHorizontallyStacked ? i10 : 0, 1, false, ((Boolean) semanticsNode.getConfig().getOrElse(SemanticsProperties.INSTANCE.getSelected(), new InterfaceC9529a() { // from class: androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt$setCollectionItemInfo$itemInfo$1
                @Override // p181hd.InterfaceC9529a
                public final Boolean invoke() {
                    return Boolean.FALSE;
                }
            })).booleanValue());
            if (collectionItemInfoCompatObtain != null) {
                accessibilityNodeInfoCompat.setCollectionItemInfo(collectionItemInfoCompatObtain);
            }
        }
    }

    private static final AccessibilityNodeInfoCompat.CollectionInfoCompat toAccessibilityCollectionInfo(CollectionInfo collectionInfo) {
        return AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(collectionInfo.getRowCount(), collectionInfo.getColumnCount(), false, 0);
    }

    private static final AccessibilityNodeInfoCompat.CollectionItemInfoCompat toAccessibilityCollectionItemInfo(CollectionItemInfo collectionItemInfo, SemanticsNode semanticsNode) {
        return AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(collectionItemInfo.getRowIndex(), collectionItemInfo.getRowSpan(), collectionItemInfo.getColumnIndex(), collectionItemInfo.getColumnSpan(), false, ((Boolean) semanticsNode.getConfig().getOrElse(SemanticsProperties.INSTANCE.getSelected(), new InterfaceC9529a() { // from class: androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt.toAccessibilityCollectionItemInfo.1
            @Override // p181hd.InterfaceC9529a
            public final Boolean invoke() {
                return Boolean.FALSE;
            }
        })).booleanValue());
    }
}
