package androidx.compose.runtime;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.collection.MultiValueMap;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p309qc.AbstractC10776g;
import p309qc.C10786q;
import p325rc.AbstractC10947g0;

/* loaded from: classes2.dex */
public final class ComposerKt {
    public static final boolean EnableDebugRuntimeChecks = false;
    public static final int compositionLocalMapKey = 202;
    private static CompositionTracer compositionTracer = null;
    private static final int defaultsKey = -127;
    private static final int invalidGroupLocation = -2;
    public static final int invocationKey = 200;
    private static final int nodeKey = 125;
    public static final int providerKey = 201;
    public static final int providerMapsKey = 204;
    public static final int providerValuesKey = 203;
    public static final int referenceKey = 206;
    public static final int reuseKey = 207;
    private static final int rootKey = 100;
    private static final Object invocation = new OpaqueKey("provider");
    private static final Object provider = new OpaqueKey("provider");
    private static final Object compositionLocalMap = new OpaqueKey("compositionLocalMap");
    private static final Object providerValues = new OpaqueKey("providerValues");
    private static final Object providerMaps = new OpaqueKey("providers");
    private static final Object reference = new OpaqueKey(TypedValues.Custom.S_REFERENCE);
    private static final Comparator<Invalidation> InvalidationLocationAscending = new Comparator() { // from class: androidx.compose.runtime.a
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComposerKt.InvalidationLocationAscending$lambda$16((Invalidation) obj, (Invalidation) obj2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final int InvalidationLocationAscending$lambda$16(Invalidation invalidation, Invalidation invalidation2) {
        return AbstractC9979u.m20296i(invalidation.getLocation(), invalidation2.getLocation());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean asBool(int i10) {
        return i10 != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int asInt(boolean z10) {
        return z10 ? 1 : 0;
    }

    @ComposeCompilerApi
    public static final <T> T cache(Composer composer, boolean z10, InterfaceC9529a interfaceC9529a) {
        T t10 = (T) composer.rememberedValue();
        if (!z10 && t10 != Composer.Companion.getEmpty()) {
            return t10;
        }
        T t11 = (T) interfaceC9529a.invoke();
        composer.updateRememberedValue(t11);
        return t11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Object> collectNodesFrom(SlotTable slotTable, Anchor anchor) {
        ArrayList arrayList = new ArrayList();
        SlotReader slotReaderOpenReader = slotTable.openReader();
        try {
            collectNodesFrom$lambda$10$collectFromGroup(slotReaderOpenReader, arrayList, slotTable.anchorIndex(anchor));
            C10786q c10786q = C10786q.f26013a;
            return arrayList;
        } finally {
            slotReaderOpenReader.close();
        }
    }

    private static final void collectNodesFrom$lambda$10$collectFromGroup(SlotReader slotReader, List<Object> list, int i10) {
        if (slotReader.isNode(i10)) {
            list.add(slotReader.node(i10));
            return;
        }
        int iGroupSize = i10 + 1;
        int iGroupSize2 = i10 + slotReader.groupSize(i10);
        while (iGroupSize < iGroupSize2) {
            collectNodesFrom$lambda$10$collectFromGroup(slotReader, list, iGroupSize);
            iGroupSize += slotReader.groupSize(iGroupSize);
        }
    }

    public static final void composeImmediateRuntimeError(String str) {
        throw new ComposeRuntimeError("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final Void composeRuntimeError(String str) {
        throw new ComposeRuntimeError("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final void deactivateCurrentGroup(SlotWriter slotWriter, RememberManager rememberManager) {
        int slotsSize;
        int iDataIndex = slotWriter.dataIndex(slotWriter.groups, slotWriter.groupIndexToAddress(slotWriter.getCurrentGroup() + slotWriter.groupSize(slotWriter.getCurrentGroup())));
        for (int iDataIndex2 = slotWriter.dataIndex(slotWriter.groups, slotWriter.groupIndexToAddress(slotWriter.getCurrentGroup())); iDataIndex2 < iDataIndex; iDataIndex2++) {
            Object obj = slotWriter.slots[slotWriter.dataIndexToDataAddress(iDataIndex2)];
            int iAnchorIndex = -1;
            if (obj instanceof ComposeNodeLifecycleCallback) {
                rememberManager.deactivating((ComposeNodeLifecycleCallback) obj, slotWriter.getSlotsSize() - iDataIndex2, -1, -1);
            } else if (obj instanceof RememberObserverHolder) {
                RememberObserverHolder rememberObserverHolder = (RememberObserverHolder) obj;
                if (!(rememberObserverHolder.getWrapped() instanceof ReusableRememberObserver)) {
                    removeData(slotWriter, iDataIndex2, obj);
                    int slotsSize2 = slotWriter.getSlotsSize() - iDataIndex2;
                    Anchor after = rememberObserverHolder.getAfter();
                    if (after == null || !after.getValid()) {
                        slotsSize = -1;
                    } else {
                        iAnchorIndex = slotWriter.anchorIndex(after);
                        slotsSize = slotWriter.getSlotsSize() - slotWriter.slotsEndAllIndex$runtime_release(iAnchorIndex);
                    }
                    rememberManager.forgetting(rememberObserverHolder, slotsSize2, iAnchorIndex, slotsSize);
                }
            } else if (obj instanceof RecomposeScopeImpl) {
                removeData(slotWriter, iDataIndex2, obj);
                ((RecomposeScopeImpl) obj).release();
            }
        }
    }

    public static final void debugRuntimeCheck(boolean z10) {
    }

    private static final int distanceFrom(SlotReader slotReader, int i10, int i11) {
        int i12 = 0;
        while (i10 > 0 && i10 != i11) {
            i10 = slotReader.parent(i10);
            i12++;
        }
        return i12;
    }

    public static final MovableContentState extractMovableContentAtCurrent(final ControlledComposition controlledComposition, final MovableContentStateReference movableContentStateReference, SlotWriter slotWriter, Applier<?> applier) {
        SlotTable slotTable = new SlotTable();
        if (slotWriter.getCollectingSourceInformation()) {
            slotTable.collectSourceInformation();
        }
        if (slotWriter.getCollectingCalledInformation()) {
            slotTable.collectCalledByInformation();
        }
        int currentGroup = slotWriter.getCurrentGroup();
        if (applier != null && slotWriter.nodeCount(currentGroup) > 0) {
            int parent = slotWriter.getParent();
            while (parent > 0 && !slotWriter.isNode(parent)) {
                parent = slotWriter.parent(parent);
            }
            if (parent >= 0 && slotWriter.isNode(parent)) {
                Object objNode = slotWriter.node(parent);
                int i10 = parent + 1;
                int iGroupSize = parent + slotWriter.groupSize(parent);
                int iNodeCount = 0;
                while (i10 < iGroupSize) {
                    int iGroupSize2 = slotWriter.groupSize(i10) + i10;
                    if (iGroupSize2 > currentGroup) {
                        break;
                    }
                    iNodeCount += slotWriter.isNode(i10) ? 1 : slotWriter.nodeCount(i10);
                    i10 = iGroupSize2;
                }
                int iNodeCount2 = slotWriter.isNode(currentGroup) ? 1 : slotWriter.nodeCount(currentGroup);
                applier.down(objNode);
                applier.remove(iNodeCount, iNodeCount2);
                applier.mo1049up();
            }
        }
        SlotWriter slotWriterOpenWriter = slotTable.openWriter();
        try {
            slotWriterOpenWriter.beginInsert();
            slotWriterOpenWriter.startGroup(MovableContentKt.movableContentKey, movableContentStateReference.getContent$runtime_release());
            SlotWriter.markGroup$default(slotWriterOpenWriter, 0, 1, null);
            slotWriterOpenWriter.update(movableContentStateReference.getParameter$runtime_release());
            List<Anchor> listMoveTo = slotWriter.moveTo(movableContentStateReference.getAnchor$runtime_release(), 1, slotWriterOpenWriter);
            slotWriterOpenWriter.skipGroup();
            slotWriterOpenWriter.endGroup();
            slotWriterOpenWriter.endInsert();
            slotWriterOpenWriter.close(true);
            MovableContentState movableContentState = new MovableContentState(slotTable);
            RecomposeScopeImpl.Companion companion = RecomposeScopeImpl.Companion;
            if (!companion.hasAnchoredRecomposeScopes$runtime_release(slotTable, listMoveTo)) {
                return movableContentState;
            }
            RecomposeScopeOwner recomposeScopeOwner = new RecomposeScopeOwner() { // from class: androidx.compose.runtime.ComposerKt$extractMovableContentAtCurrent$movableContentRecomposeScopeOwner$1
                @Override // androidx.compose.runtime.RecomposeScopeOwner
                public InvalidationResult invalidate(RecomposeScopeImpl recomposeScopeImpl, Object obj) {
                    InvalidationResult invalidationResultInvalidate;
                    ControlledComposition controlledComposition2 = controlledComposition;
                    RecomposeScopeOwner recomposeScopeOwner2 = controlledComposition2 instanceof RecomposeScopeOwner ? (RecomposeScopeOwner) controlledComposition2 : null;
                    if (recomposeScopeOwner2 == null || (invalidationResultInvalidate = recomposeScopeOwner2.invalidate(recomposeScopeImpl, obj)) == null) {
                        invalidationResultInvalidate = InvalidationResult.IGNORED;
                    }
                    if (invalidationResultInvalidate != InvalidationResult.IGNORED) {
                        return invalidationResultInvalidate;
                    }
                    MovableContentStateReference movableContentStateReference2 = movableContentStateReference;
                    movableContentStateReference2.setInvalidations$runtime_release(AbstractC10947g0.m23907I0(movableContentStateReference2.getInvalidations$runtime_release(), AbstractC10776g.m22975a(recomposeScopeImpl, obj)));
                    return InvalidationResult.SCHEDULED;
                }

                @Override // androidx.compose.runtime.RecomposeScopeOwner
                public void recomposeScopeReleased(RecomposeScopeImpl recomposeScopeImpl) {
                }

                @Override // androidx.compose.runtime.RecomposeScopeOwner
                public void recordReadOf(Object obj) {
                }
            };
            slotWriterOpenWriter = slotTable.openWriter();
            try {
                companion.adoptAnchoredScopes$runtime_release(slotWriterOpenWriter, listMoveTo, recomposeScopeOwner);
                C10786q c10786q = C10786q.f26013a;
                slotWriterOpenWriter.close(true);
                return movableContentState;
            } finally {
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Invalidation> filterToRange(List<Invalidation> list, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        for (int iFindInsertLocation = findInsertLocation(list, i10); iFindInsertLocation < list.size(); iFindInsertLocation++) {
            Invalidation invalidation = list.get(iFindInsertLocation);
            if (invalidation.getLocation() >= i11) {
                break;
            }
            arrayList.add(invalidation);
        }
        return arrayList;
    }

    private static final int findInsertLocation(List<Invalidation> list, int i10) {
        int iFindLocation = findLocation(list, i10);
        return iFindLocation < 0 ? -(iFindLocation + 1) : iFindLocation;
    }

    private static final int findLocation(List<Invalidation> list, int i10) {
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            int iM20296i = AbstractC9979u.m20296i(list.get(i12).getLocation(), i10);
            if (iM20296i < 0) {
                i11 = i12 + 1;
            } else {
                if (iM20296i <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Invalidation firstInRange(List<Invalidation> list, int i10, int i11) {
        int iFindInsertLocation = findInsertLocation(list, i10);
        if (iFindInsertLocation >= list.size()) {
            return null;
        }
        Invalidation invalidation = list.get(iFindInsertLocation);
        if (invalidation.getLocation() < i11) {
            return invalidation;
        }
        return null;
    }

    public static final Object getCompositionLocalMap() {
        return compositionLocalMap;
    }

    public static /* synthetic */ void getCompositionLocalMap$annotations() {
    }

    public static /* synthetic */ void getCompositionLocalMapKey$annotations() {
    }

    private static /* synthetic */ void getCompositionTracer$annotations() {
    }

    public static final Object getInvocation() {
        return invocation;
    }

    public static /* synthetic */ void getInvocation$annotations() {
    }

    public static /* synthetic */ void getInvocationKey$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getJoinedKey(KeyInfo keyInfo) {
        return keyInfo.getObjectKey() != null ? new JoinedKey(Integer.valueOf(keyInfo.getKey()), keyInfo.getObjectKey()) : Integer.valueOf(keyInfo.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getKey(Object obj, Object obj2, Object obj3) {
        JoinedKey joinedKey = obj instanceof JoinedKey ? (JoinedKey) obj : null;
        if (joinedKey == null) {
            return null;
        }
        if (AbstractC9979u.m20289b(joinedKey.getLeft(), obj2) && AbstractC9979u.m20289b(joinedKey.getRight(), obj3)) {
            return obj;
        }
        Object key = getKey(joinedKey.getLeft(), obj2, obj3);
        return key == null ? getKey(joinedKey.getRight(), obj2, obj3) : key;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getNextGroup(SlotWriter slotWriter) {
        return slotWriter.getCurrentGroup() + slotWriter.groupSize(slotWriter.getCurrentGroup());
    }

    public static final Object getProvider() {
        return provider;
    }

    public static /* synthetic */ void getProvider$annotations() {
    }

    public static /* synthetic */ void getProviderKey$annotations() {
    }

    public static final Object getProviderMaps() {
        return providerMaps;
    }

    public static /* synthetic */ void getProviderMaps$annotations() {
    }

    public static /* synthetic */ void getProviderMapsKey$annotations() {
    }

    public static final Object getProviderValues() {
        return providerValues;
    }

    public static /* synthetic */ void getProviderValues$annotations() {
    }

    public static /* synthetic */ void getProviderValuesKey$annotations() {
    }

    public static final Object getReference() {
        return reference;
    }

    public static /* synthetic */ void getReference$annotations() {
    }

    public static /* synthetic */ void getReferenceKey$annotations() {
    }

    public static /* synthetic */ void getReuseKey$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void insertIfMissing(List<Invalidation> list, int i10, RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        int iFindLocation = findLocation(list, i10);
        if (iFindLocation < 0) {
            int i11 = -(iFindLocation + 1);
            if (!(obj instanceof DerivedState)) {
                obj = null;
            }
            list.add(i11, new Invalidation(recomposeScopeImpl, i10, obj));
            return;
        }
        Invalidation invalidation = list.get(iFindLocation);
        if (!(obj instanceof DerivedState)) {
            invalidation.setInstances(null);
            return;
        }
        Object instances = invalidation.getInstances();
        if (instances == null) {
            invalidation.setInstances(obj);
        } else if (instances instanceof MutableScatterSet) {
            ((MutableScatterSet) instances).add(obj);
        } else {
            invalidation.setInstances(ScatterSetKt.mutableScatterSetOf(instances, obj));
        }
    }

    public static final boolean isAfterFirstChild(SlotWriter slotWriter) {
        return slotWriter.getCurrentGroup() > slotWriter.getParent() + 1;
    }

    @ComposeCompilerApi
    public static final boolean isTraceInProgress() {
        CompositionTracer compositionTracer2 = compositionTracer;
        return compositionTracer2 != null && compositionTracer2.isTraceInProgress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> MutableScatterMap<Object, Object> multiMap(int i10) {
        return MultiValueMap.m30383constructorimpl(new MutableScatterMap(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int nearestCommonRootOf(SlotReader slotReader, int i10, int i11, int i12) {
        if (i10 != i11) {
            if (i10 == i12 || i11 == i12) {
                return i12;
            }
            if (slotReader.parent(i10) == i11) {
                return i11;
            }
            if (slotReader.parent(i11) != i10) {
                if (slotReader.parent(i10) == slotReader.parent(i11)) {
                    return slotReader.parent(i10);
                }
                int iDistanceFrom = distanceFrom(slotReader, i10, i12);
                int iDistanceFrom2 = distanceFrom(slotReader, i11, i12);
                int i13 = iDistanceFrom - iDistanceFrom2;
                for (int i14 = 0; i14 < i13; i14++) {
                    i10 = slotReader.parent(i10);
                }
                int i15 = iDistanceFrom2 - iDistanceFrom;
                for (int i16 = 0; i16 < i15; i16++) {
                    i11 = slotReader.parent(i11);
                }
                while (i10 != i11) {
                    i10 = slotReader.parent(i10);
                    i11 = slotReader.parent(i11);
                }
                return i10;
            }
        }
        return i10;
    }

    public static final void removeCurrentGroup(SlotWriter slotWriter, RememberManager rememberManager) {
        int slotsSize;
        int iDataIndex = slotWriter.dataIndex(slotWriter.groups, slotWriter.groupIndexToAddress(slotWriter.getCurrentGroup() + slotWriter.groupSize(slotWriter.getCurrentGroup())));
        for (int iDataIndex2 = slotWriter.dataIndex(slotWriter.groups, slotWriter.groupIndexToAddress(slotWriter.getCurrentGroup())); iDataIndex2 < iDataIndex; iDataIndex2++) {
            Object obj = slotWriter.slots[slotWriter.dataIndexToDataAddress(iDataIndex2)];
            int iAnchorIndex = -1;
            if (obj instanceof ComposeNodeLifecycleCallback) {
                rememberManager.releasing((ComposeNodeLifecycleCallback) obj, slotWriter.getSlotsSize() - iDataIndex2, -1, -1);
            }
            if (obj instanceof RememberObserverHolder) {
                int slotsSize2 = slotWriter.getSlotsSize() - iDataIndex2;
                RememberObserverHolder rememberObserverHolder = (RememberObserverHolder) obj;
                Anchor after = rememberObserverHolder.getAfter();
                if (after == null || !after.getValid()) {
                    slotsSize = -1;
                } else {
                    iAnchorIndex = slotWriter.anchorIndex(after);
                    slotsSize = slotWriter.getSlotsSize() - slotWriter.slotsEndAllIndex$runtime_release(iAnchorIndex);
                }
                rememberManager.forgetting(rememberObserverHolder, slotsSize2, iAnchorIndex, slotsSize);
            }
            if (obj instanceof RecomposeScopeImpl) {
                ((RecomposeScopeImpl) obj).release();
            }
        }
        slotWriter.removeGroup();
    }

    private static final void removeData(SlotWriter slotWriter, int i10, Object obj) {
        Object objClear = slotWriter.clear(i10);
        if (obj == objClear) {
            return;
        }
        composeImmediateRuntimeError("Slot table is out of sync (expected " + obj + ", got " + objClear + ')');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Invalidation removeLocation(List<Invalidation> list, int i10) {
        int iFindLocation = findLocation(list, i10);
        if (iFindLocation >= 0) {
            return list.remove(iFindLocation);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeRange(List<Invalidation> list, int i10, int i11) {
        int iFindInsertLocation = findInsertLocation(list, i10);
        while (iFindInsertLocation < list.size() && list.get(iFindInsertLocation).getLocation() < i11) {
            list.remove(iFindInsertLocation);
        }
    }

    public static final void runtimeCheck(boolean z10, InterfaceC9529a interfaceC9529a) {
        if (z10) {
            return;
        }
        composeImmediateRuntimeError((String) interfaceC9529a.invoke());
    }

    @ComposeCompilerApi
    public static final void sourceInformation(Composer composer, String str) {
        composer.sourceInformation(str);
    }

    @ComposeCompilerApi
    public static final void sourceInformationMarkerEnd(Composer composer) {
        composer.sourceInformationMarkerEnd();
    }

    @ComposeCompilerApi
    public static final void sourceInformationMarkerStart(Composer composer, int i10, String str) {
        composer.sourceInformationMarkerStart(i10, str);
    }

    @ComposeCompilerApi
    public static final void traceEventEnd() {
        CompositionTracer compositionTracer2 = compositionTracer;
        if (compositionTracer2 != null) {
            compositionTracer2.traceEventEnd();
        }
    }

    public static final <R> void withAfterAnchorInfo(SlotWriter slotWriter, Anchor anchor, InterfaceC9544p interfaceC9544p) {
        int iAnchorIndex;
        int slotsSize;
        if (anchor == null || !anchor.getValid()) {
            iAnchorIndex = -1;
            slotsSize = -1;
        } else {
            iAnchorIndex = slotWriter.anchorIndex(anchor);
            slotsSize = slotWriter.getSlotsSize() - slotWriter.slotsEndAllIndex$runtime_release(iAnchorIndex);
        }
        interfaceC9544p.invoke(Integer.valueOf(iAnchorIndex), Integer.valueOf(slotsSize));
    }

    public static final void debugRuntimeCheck(boolean z10, InterfaceC9529a interfaceC9529a) {
    }

    public static final boolean isAfterFirstChild(SlotReader slotReader) {
        return slotReader.getCurrentGroup() > slotReader.getParent() + 1;
    }

    public static final void runtimeCheck(boolean z10) {
        if (z10) {
            return;
        }
        composeImmediateRuntimeError("Check failed");
    }

    @ComposeCompilerApi
    public static final void traceEventStart(int i10, int i11, int i12, String str) {
        CompositionTracer compositionTracer2 = compositionTracer;
        if (compositionTracer2 != null) {
            compositionTracer2.traceEventStart(i10, i11, i12, str);
        }
    }
}
