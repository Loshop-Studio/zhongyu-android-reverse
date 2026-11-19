package androidx.compose.runtime;

import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.compose.p013ui.spatial.RectListKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9131s;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import p113g8.AbstractC8661c0;
import p113g8.AbstractC8687z;
import p123h7.C8736p;
import p134i7.AbstractC8801r;
import p300x7.InterfaceC10570l;
import p311y7.InterfaceC10668a;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class SlotTable implements CompositionData, Iterable<CompositionGroup>, InterfaceC10668a {
    public static final int $stable = 8;
    private MutableIntObjectMap<MutableIntSet> calledByMap;
    private int groupsSize;
    private int readers;
    private int slotsSize;
    private HashMap<Anchor, GroupSourceInformation> sourceInformationMap;
    private int version;
    private boolean writer;
    private int[] groups = new int[0];
    private Object[] slots = new Object[0];
    private final Object lock = new Object();
    private ArrayList<Anchor> anchors = new ArrayList<>();

    private final List<Integer> dataIndexes() {
        return SlotTableKt.dataAnchors(this.groups, this.groupsSize * 5);
    }

    private final int emitGroup(StringBuilder sb, int i10, int i11) {
        String sourceInformation;
        for (int i12 = 0; i12 < i11; i12++) {
            sb.append(' ');
        }
        sb.append("Group(");
        sb.append(i10);
        sb.append(")");
        GroupSourceInformation groupSourceInformationSourceInformationOf = sourceInformationOf(i10);
        if (groupSourceInformationSourceInformationOf != null && (sourceInformation = groupSourceInformationSourceInformationOf.getSourceInformation()) != null && (AbstractC8687z.m14105M(sourceInformation, "C(", false, 2, null) || AbstractC8687z.m14105M(sourceInformation, "CC(", false, 2, null))) {
            int iM13991f0 = AbstractC8661c0.m13991f0(sourceInformation, "(", 0, false, 6, null) + 1;
            int iM13990e0 = AbstractC8661c0.m13990e0(sourceInformation, ')', 0, false, 6, null);
            sb.append(" ");
            String strSubstring = sourceInformation.substring(iM13991f0, iM13990e0);
            AbstractC9133u.m16132f(strSubstring, "substring(...)");
            sb.append(strSubstring);
            sb.append("()");
        }
        sb.append(" key=");
        int i13 = i10 * 5;
        sb.append(this.groups[i13]);
        int iGroupSize = SlotTableKt.groupSize(this.groups, i10);
        sb.append(", nodes=");
        int i14 = i13 + 1;
        sb.append(this.groups[i14] & RectListKt.Lower26Bits);
        sb.append(", size=");
        sb.append(iGroupSize);
        if ((this.groups[i14] & 134217728) != 0) {
            sb.append(", mark");
        }
        if ((this.groups[i14] & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0) {
            sb.append(", contains mark");
        }
        int iEmitGroup$dataIndex = emitGroup$dataIndex(this, i10);
        int iEmitGroup = i10 + 1;
        int iEmitGroup$dataIndex2 = emitGroup$dataIndex(this, iEmitGroup);
        if (iEmitGroup$dataIndex < 0 || iEmitGroup$dataIndex > iEmitGroup$dataIndex2 || iEmitGroup$dataIndex2 > this.slotsSize) {
            sb.append(", *invalid data offsets " + iEmitGroup$dataIndex + '-' + iEmitGroup$dataIndex2 + '*');
        } else {
            if ((this.groups[i14] & 536870912) != 0) {
                sb.append(" objectKey=" + SlotTableKt.summarize(String.valueOf(this.slots[SlotTableKt.objectKeyIndex(this.groups, i10)]), 10));
            }
            if ((this.groups[i14] & BasicMeasure.EXACTLY) != 0) {
                sb.append(" node=" + SlotTableKt.summarize(String.valueOf(this.slots[this.groups[i13 + 4]]), 10));
            }
            if ((this.groups[i14] & 268435456) != 0) {
                sb.append(" aux=" + SlotTableKt.summarize(String.valueOf(this.slots[SlotTableKt.auxIndex(this.groups, i10)]), 10));
            }
            int iSlotAnchor = SlotTableKt.slotAnchor(this.groups, i10);
            if (iSlotAnchor < iEmitGroup$dataIndex2) {
                sb.append(", slots=[");
                sb.append(iSlotAnchor);
                sb.append(": ");
                for (int i15 = iSlotAnchor; i15 < iEmitGroup$dataIndex2; i15++) {
                    if (i15 != iSlotAnchor) {
                        sb.append(", ");
                    }
                    sb.append(SlotTableKt.summarize(String.valueOf(this.slots[i15]), 10));
                }
                sb.append("]");
            }
        }
        sb.append('\n');
        int i16 = i10 + iGroupSize;
        while (iEmitGroup < i16) {
            iEmitGroup += emitGroup(sb, iEmitGroup, i11 + 1);
        }
        return iGroupSize;
    }

    private static final int emitGroup$dataIndex(SlotTable slotTable, int i10) {
        return i10 >= slotTable.groupsSize ? slotTable.slotsSize : slotTable.groups[(i10 * 5) + 4];
    }

    private final RecomposeScopeImpl findEffectiveRecomposeScope(int i10) {
        int i11 = i10;
        while (i11 > 0) {
            Iterator<Object> it = new DataIterator(this, i11).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof RecomposeScopeImpl) {
                    RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) next;
                    if (recomposeScopeImpl.getUsed() && i11 != i10) {
                        return recomposeScopeImpl;
                    }
                    recomposeScopeImpl.setForcedRecompose(true);
                }
            }
            i11 = this.groups[(i11 * 5) + 2];
        }
        return null;
    }

    private final List<Integer> groupSizes() {
        return SlotTableKt.groupSizes(this.groups, this.groupsSize * 5);
    }

    private static final void invalidateGroupsWithKey$lambda$20$scanGroup(SlotReader slotReader, MutableIntSet mutableIntSet, List<Anchor> list, Ref$BooleanRef ref$BooleanRef, SlotTable slotTable, List<RecomposeScopeImpl> list2) {
        RecomposeScopeImpl recomposeScopeImplFindEffectiveRecomposeScope;
        int groupKey = slotReader.getGroupKey();
        if (!mutableIntSet.contains(groupKey)) {
            slotReader.startGroup();
            while (!slotReader.isGroupEnd()) {
                invalidateGroupsWithKey$lambda$20$scanGroup(slotReader, mutableIntSet, list, ref$BooleanRef, slotTable, list2);
            }
            slotReader.endGroup();
            return;
        }
        if (groupKey != -3) {
            list.add(SlotReader.anchor$default(slotReader, 0, 1, null));
        }
        if (ref$BooleanRef.f17469a) {
            RecomposeScopeImpl recomposeScopeImplFindEffectiveRecomposeScope2 = slotTable.findEffectiveRecomposeScope(slotReader.getCurrentGroup());
            if (recomposeScopeImplFindEffectiveRecomposeScope2 != null) {
                list2.add(recomposeScopeImplFindEffectiveRecomposeScope2);
                Anchor anchor = recomposeScopeImplFindEffectiveRecomposeScope2.getAnchor();
                if (anchor != null && anchor.getLocation$runtime_release() == slotReader.getCurrentGroup() && (recomposeScopeImplFindEffectiveRecomposeScope = slotTable.findEffectiveRecomposeScope(slotReader.getParent())) != null) {
                    list2.add(recomposeScopeImplFindEffectiveRecomposeScope);
                }
            } else {
                ref$BooleanRef.f17469a = false;
                list2.clear();
            }
        }
        slotReader.skipGroup();
    }

    private final List<Integer> keys() {
        return SlotTableKt.keys(this.groups, this.groupsSize * 5);
    }

    private final List<Integer> nodes() {
        return SlotTableKt.nodeCounts(this.groups, this.groupsSize * 5);
    }

    private final List<Integer> parentIndexes() {
        return SlotTableKt.parentAnchors(this.groups, this.groupsSize * 5);
    }

    private final Anchor tryAnchor(int i10) {
        int i11;
        if (this.writer) {
            ComposerKt.composeImmediateRuntimeError("use active SlotWriter to crate an anchor for location instead");
        }
        if (i10 < 0 || i10 >= (i11 = this.groupsSize)) {
            return null;
        }
        return SlotTableKt.find(this.anchors, i10, i11);
    }

    private static final int verifyWellFormed$validateGroup(Ref$IntRef ref$IntRef, SlotTable slotTable, int i10, int i11) {
        int i12 = ref$IntRef.f17471a;
        int i13 = i12 + 1;
        ref$IntRef.f17471a = i13;
        int i14 = i12 * 5;
        int i15 = slotTable.groups[i14 + 2];
        if (!(i15 == i10)) {
            PreconditionsKt.throwIllegalStateException("Invalid parent index detected at " + i12 + ", expected parent index to be " + i10 + " found " + i15);
        }
        int iGroupSize = SlotTableKt.groupSize(slotTable.groups, i12) + i12;
        if (!(iGroupSize <= slotTable.groupsSize)) {
            PreconditionsKt.throwIllegalStateException("A group extends past the end of the table at " + i12);
        }
        if (!(iGroupSize <= i11)) {
            PreconditionsKt.throwIllegalStateException("A group extends past its parent group at " + i12);
        }
        int[] iArr = slotTable.groups;
        int i16 = i14 + 4;
        int i17 = iArr[i16];
        int i18 = i12 >= slotTable.groupsSize - 1 ? slotTable.slotsSize : iArr[(i13 * 5) + 4];
        if (!(i18 <= slotTable.slots.length)) {
            PreconditionsKt.throwIllegalStateException("Slots for " + i12 + " extend past the end of the slot table");
        }
        if (!(i17 <= i18)) {
            PreconditionsKt.throwIllegalStateException("Invalid data anchor at " + i12);
        }
        if (!(SlotTableKt.slotAnchor(slotTable.groups, i12) <= i18)) {
            PreconditionsKt.throwIllegalStateException("Slots start out of range at " + i12);
        }
        int i19 = i14 + 1;
        int i20 = slotTable.groups[i19];
        if (!(i18 - i17 >= (((i20 & BasicMeasure.EXACTLY) != 0 ? 1 : 0) + ((536870912 & i20) != 0 ? 1 : 0)) + ((i20 & 268435456) != 0 ? 1 : 0))) {
            PreconditionsKt.throwIllegalStateException("Not enough slots added for group " + i12);
        }
        int[] iArr2 = slotTable.groups;
        boolean z10 = (iArr2[i19] & BasicMeasure.EXACTLY) != 0;
        if (!((z10 && slotTable.slots[iArr2[i16]] == null) ? false : true)) {
            PreconditionsKt.throwIllegalStateException("No node recorded for a node group at " + i12);
        }
        int iVerifyWellFormed$validateGroup = 0;
        while (ref$IntRef.f17471a < iGroupSize) {
            iVerifyWellFormed$validateGroup += verifyWellFormed$validateGroup(ref$IntRef, slotTable, i12, iGroupSize);
        }
        int[] iArr3 = slotTable.groups;
        int i21 = iArr3[i19] & RectListKt.Lower26Bits;
        int iGroupSize2 = SlotTableKt.groupSize(iArr3, i12);
        if (!(i21 == iVerifyWellFormed$validateGroup)) {
            PreconditionsKt.throwIllegalStateException("Incorrect node count detected at " + i12 + ", expected " + i21 + ", received " + iVerifyWellFormed$validateGroup);
        }
        int i22 = ref$IntRef.f17471a - i12;
        if (!(iGroupSize2 == i22)) {
            PreconditionsKt.throwIllegalStateException("Incorrect slot count detected at " + i12 + ", expected " + iGroupSize2 + ", received " + i22);
        }
        int[] iArr4 = slotTable.groups;
        if ((iArr4[i19] & 201326592) != 0) {
            if (!(i12 <= 0 || (iArr4[(i10 * 5) + 1] & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0)) {
                PreconditionsKt.throwIllegalStateException("Expected group " + i10 + " to record it contains a mark because " + i12 + " does");
            }
        }
        if (z10) {
            return 1;
        }
        return iVerifyWellFormed$validateGroup;
    }

    private static final void verifyWellFormed$verifySourceGroup(SlotTable slotTable, GroupSourceInformation groupSourceInformation) {
        ArrayList<Object> groups = groupSourceInformation.getGroups();
        if (groups != null) {
            int size = groups.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = groups.get(i10);
                if (obj instanceof Anchor) {
                    Anchor anchor = (Anchor) obj;
                    if (!anchor.getValid()) {
                        PreconditionsKt.throwIllegalArgumentException("Source map contains invalid anchor");
                    }
                    if (!slotTable.ownsAnchor(anchor)) {
                        PreconditionsKt.throwIllegalArgumentException("Source map anchor is not owned by the slot table");
                    }
                } else if (obj instanceof GroupSourceInformation) {
                    verifyWellFormed$verifySourceGroup(slotTable, (GroupSourceInformation) obj);
                }
            }
        }
    }

    public final Anchor anchor(int i10) {
        if (this.writer) {
            ComposerKt.composeImmediateRuntimeError("use active SlotWriter to create an anchor location instead");
        }
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.groupsSize) {
            z10 = true;
        }
        if (!z10) {
            PreconditionsKt.throwIllegalArgumentException("Parameter index is out of range");
        }
        ArrayList<Anchor> arrayList = this.anchors;
        int iSearch = SlotTableKt.search(arrayList, i10, this.groupsSize);
        if (iSearch >= 0) {
            return arrayList.get(iSearch);
        }
        Anchor anchor = new Anchor(i10);
        arrayList.add(-(iSearch + 1), anchor);
        return anchor;
    }

    public final int anchorIndex(Anchor anchor) {
        if (this.writer) {
            ComposerKt.composeImmediateRuntimeError("Use active SlotWriter to determine anchor location instead");
        }
        if (!anchor.getValid()) {
            PreconditionsKt.throwIllegalArgumentException("Anchor refers to a group that was removed");
        }
        return anchor.getLocation$runtime_release();
    }

    public final void close$runtime_release(SlotReader slotReader, HashMap<Anchor, GroupSourceInformation> map) {
        if (!(slotReader.getTable$runtime_release() == this && this.readers > 0)) {
            ComposerKt.composeImmediateRuntimeError("Unexpected reader close()");
        }
        this.readers--;
        if (map != null) {
            synchronized (this.lock) {
                try {
                    HashMap<Anchor, GroupSourceInformation> map2 = this.sourceInformationMap;
                    if (map2 != null) {
                        map2.putAll(map);
                    } else {
                        this.sourceInformationMap = map;
                    }
                    C8736p c8736p = C8736p.f16368a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void collectCalledByInformation() {
        this.calledByMap = new MutableIntObjectMap<>(0, 1, null);
    }

    public final void collectSourceInformation() {
        this.sourceInformationMap = new HashMap<>();
    }

    public final boolean containsMark() {
        return this.groupsSize > 0 && (this.groups[1] & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public CompositionGroup find(Object obj) {
        return new SlotTableGroup(this, 0, 0, 4, null).find(obj);
    }

    public final ArrayList<Anchor> getAnchors$runtime_release() {
        return this.anchors;
    }

    public final MutableIntObjectMap<MutableIntSet> getCalledByMap$runtime_release() {
        return this.calledByMap;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public Iterable<CompositionGroup> getCompositionGroups() {
        return this;
    }

    public final int[] getGroups() {
        return this.groups;
    }

    public final int getGroupsSize() {
        return this.groupsSize;
    }

    public final Object[] getSlots() {
        return this.slots;
    }

    public final int getSlotsSize() {
        return this.slotsSize;
    }

    public final HashMap<Anchor, GroupSourceInformation> getSourceInformationMap$runtime_release() {
        return this.sourceInformationMap;
    }

    public final int getVersion$runtime_release() {
        return this.version;
    }

    public final boolean getWriter$runtime_release() {
        return this.writer;
    }

    public final boolean groupContainsAnchor(int i10, Anchor anchor) {
        if (this.writer) {
            ComposerKt.composeImmediateRuntimeError("Writer is active");
        }
        if (!(i10 >= 0 && i10 < this.groupsSize)) {
            ComposerKt.composeImmediateRuntimeError("Invalid group index");
        }
        if (ownsAnchor(anchor)) {
            int iGroupSize = SlotTableKt.groupSize(this.groups, i10) + i10;
            int location$runtime_release = anchor.getLocation$runtime_release();
            if (i10 <= location$runtime_release && location$runtime_release < iGroupSize) {
                return true;
            }
        }
        return false;
    }

    public final List<RecomposeScopeImpl> invalidateGroupsWithKey$runtime_release(int i10) {
        MutableIntSet mutableIntSet;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.f17469a = true;
        MutableIntSet mutableIntSet2 = new MutableIntSet(0, 1, null);
        mutableIntSet2.add(i10);
        mutableIntSet2.add(-3);
        MutableIntObjectMap<MutableIntSet> mutableIntObjectMap = this.calledByMap;
        if (mutableIntObjectMap != null && (mutableIntSet = mutableIntObjectMap.get(i10)) != null) {
            mutableIntSet2.addAll(mutableIntSet);
        }
        SlotReader slotReaderOpenReader = openReader();
        try {
            invalidateGroupsWithKey$lambda$20$scanGroup(slotReaderOpenReader, mutableIntSet2, arrayList, ref$BooleanRef, this, arrayList2);
            C8736p c8736p = C8736p.f16368a;
            slotReaderOpenReader.close();
            SlotWriter slotWriterOpenWriter = openWriter();
            try {
                slotWriterOpenWriter.startGroup();
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Anchor anchor = (Anchor) arrayList.get(i11);
                    if (anchor.toIndexFor(slotWriterOpenWriter) >= slotWriterOpenWriter.getCurrentGroup()) {
                        slotWriterOpenWriter.seek(anchor);
                        slotWriterOpenWriter.bashCurrentGroup();
                    }
                }
                slotWriterOpenWriter.skipToGroupEnd();
                slotWriterOpenWriter.endGroup();
                slotWriterOpenWriter.close(true);
                if (ref$BooleanRef.f17469a) {
                    return arrayList2;
                }
                return null;
            } catch (Throwable th) {
                slotWriterOpenWriter.close(false);
                throw th;
            }
        } catch (Throwable th2) {
            slotReaderOpenReader.close();
            throw th2;
        }
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public boolean isEmpty() {
        return this.groupsSize == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<CompositionGroup> iterator() {
        return new GroupIterator(this, 0, this.groupsSize);
    }

    public final SlotReader openReader() {
        if (this.writer) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.readers++;
        return new SlotReader(this);
    }

    public final SlotWriter openWriter() {
        if (this.writer) {
            ComposerKt.composeImmediateRuntimeError("Cannot start a writer when another writer is pending");
        }
        if (!(this.readers <= 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot start a writer when a reader is pending");
        }
        this.writer = true;
        this.version++;
        return new SlotWriter(this);
    }

    public final boolean ownsAnchor(Anchor anchor) {
        int iSearch;
        return anchor.getValid() && (iSearch = SlotTableKt.search(this.anchors, anchor.getLocation$runtime_release(), this.groupsSize)) >= 0 && AbstractC9133u.m16128b(this.anchors.get(iSearch), anchor);
    }

    public final <T> T read(InterfaceC10570l interfaceC10570l) {
        SlotReader slotReaderOpenReader = openReader();
        try {
            return (T) interfaceC10570l.invoke(slotReaderOpenReader);
        } finally {
            AbstractC9131s.m16125b(1);
            slotReaderOpenReader.close();
            AbstractC9131s.m16124a(1);
        }
    }

    public final void setAnchors$runtime_release(ArrayList<Anchor> arrayList) {
        this.anchors = arrayList;
    }

    public final void setCalledByMap$runtime_release(MutableIntObjectMap<MutableIntSet> mutableIntObjectMap) {
        this.calledByMap = mutableIntObjectMap;
    }

    public final void setSourceInformationMap$runtime_release(HashMap<Anchor, GroupSourceInformation> map) {
        this.sourceInformationMap = map;
    }

    public final void setTo$runtime_release(int[] iArr, int i10, Object[] objArr, int i11, ArrayList<Anchor> arrayList, HashMap<Anchor, GroupSourceInformation> map, MutableIntObjectMap<MutableIntSet> mutableIntObjectMap) {
        this.groups = iArr;
        this.groupsSize = i10;
        this.slots = objArr;
        this.slotsSize = i11;
        this.anchors = arrayList;
        this.sourceInformationMap = map;
        this.calledByMap = mutableIntObjectMap;
    }

    public final void setVersion$runtime_release(int i10) {
        this.version = i10;
    }

    public final Object slot$runtime_release(int i10, int i11) {
        int iSlotAnchor = SlotTableKt.slotAnchor(this.groups, i10);
        int i12 = i10 + 1;
        return (i11 < 0 || i11 >= (i12 < this.groupsSize ? this.groups[(i12 * 5) + 4] : this.slots.length) - iSlotAnchor) ? Composer.Companion.getEmpty() : this.slots[iSlotAnchor + i11];
    }

    public final List<Object> slotsOf$runtime_release(int i10) {
        int[] iArr = this.groups;
        int i11 = iArr[(i10 * 5) + 4];
        int i12 = i10 + 1;
        return AbstractC8801r.m14736u1(this.slots).subList(i11, i12 < this.groupsSize ? iArr[(i12 * 5) + 4] : this.slots.length);
    }

    public final GroupSourceInformation sourceInformationOf(int i10) {
        Anchor anchorTryAnchor;
        HashMap<Anchor, GroupSourceInformation> map = this.sourceInformationMap;
        if (map == null || (anchorTryAnchor = tryAnchor(i10)) == null) {
            return null;
        }
        return map.get(anchorTryAnchor);
    }

    public final String toDebugString() {
        if (this.writer) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append('\n');
        int i10 = this.groupsSize;
        if (i10 > 0) {
            int iEmitGroup = 0;
            while (iEmitGroup < i10) {
                iEmitGroup += emitGroup(sb, iEmitGroup, 0);
            }
        } else {
            sb.append("<EMPTY>");
        }
        String string = sb.toString();
        AbstractC9133u.m16132f(string, "toString(...)");
        return string;
    }

    public final void verifyWellFormed() {
        int i10;
        int i11;
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        int i12 = -1;
        if (this.groupsSize > 0) {
            while (true) {
                i10 = ref$IntRef.f17471a;
                i11 = this.groupsSize;
                if (i10 >= i11) {
                    break;
                } else {
                    verifyWellFormed$validateGroup(ref$IntRef, this, -1, i10 + SlotTableKt.groupSize(this.groups, i10));
                }
            }
            if (!(i10 == i11)) {
                PreconditionsKt.throwIllegalStateException("Incomplete group at root " + ref$IntRef.f17471a + " expected to be " + this.groupsSize);
            }
        }
        int length = this.slots.length;
        for (int i13 = this.slotsSize; i13 < length; i13++) {
            if (!(this.slots[i13] == null)) {
                PreconditionsKt.throwIllegalStateException("Non null value in the slot gap at index " + i13);
            }
        }
        ArrayList<Anchor> arrayList = this.anchors;
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            int indexFor = arrayList.get(i14).toIndexFor(this);
            if (!(indexFor >= 0 && indexFor <= this.groupsSize)) {
                PreconditionsKt.throwIllegalArgumentException("Invalid anchor, location out of bound");
            }
            if (!(i12 < indexFor)) {
                PreconditionsKt.throwIllegalArgumentException("Anchor is out of order");
            }
            i14++;
            i12 = indexFor;
        }
        HashMap<Anchor, GroupSourceInformation> map = this.sourceInformationMap;
        if (map != null) {
            for (Map.Entry<Anchor, GroupSourceInformation> entry : map.entrySet()) {
                Anchor key = entry.getKey();
                GroupSourceInformation value = entry.getValue();
                if (!key.getValid()) {
                    PreconditionsKt.throwIllegalArgumentException("Source map contains invalid anchor");
                }
                if (!ownsAnchor(key)) {
                    PreconditionsKt.throwIllegalArgumentException("Source map anchor is not owned by the slot table");
                }
                verifyWellFormed$verifySourceGroup(this, value);
            }
        }
    }

    public final <T> T write(InterfaceC10570l interfaceC10570l) {
        SlotWriter slotWriterOpenWriter = openWriter();
        try {
            T t10 = (T) interfaceC10570l.invoke(slotWriterOpenWriter);
            AbstractC9131s.m16125b(1);
            slotWriterOpenWriter.close(true);
            AbstractC9131s.m16124a(1);
            return t10;
        } catch (Throwable th) {
            AbstractC9131s.m16125b(1);
            slotWriterOpenWriter.close(false);
            AbstractC9131s.m16124a(1);
            throw th;
        }
    }

    public final void close$runtime_release(SlotWriter slotWriter, int[] iArr, int i10, Object[] objArr, int i11, ArrayList<Anchor> arrayList, HashMap<Anchor, GroupSourceInformation> map, MutableIntObjectMap<MutableIntSet> mutableIntObjectMap) {
        if (!(slotWriter.getTable$runtime_release() == this && this.writer)) {
            PreconditionsKt.throwIllegalArgumentException("Unexpected writer close()");
        }
        this.writer = false;
        setTo$runtime_release(iArr, i10, objArr, i11, arrayList, map, mutableIntObjectMap);
    }
}
