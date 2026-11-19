package androidx.compose.foundation.text.selection;

import androidx.collection.LongObjectMap;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.layout.LayoutCoordinates;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.AbstractC9126n;
import p134i7.AbstractC8816z;
import p168l7.AbstractC9260b;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10576r;
import p300x7.InterfaceC10578t;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class SelectionRegistrarImpl implements SelectionRegistrar {
    private final MutableLongObjectMap<Selectable> _selectableMap;
    private final List<Selectable> _selectables;
    private InterfaceC10570l afterSelectableUnsubscribe;
    private AtomicLong incrementId;
    private InterfaceC10570l onPositionChangeCallback;
    private InterfaceC10570l onSelectableChangeCallback;
    private InterfaceC10578t onSelectionUpdateCallback;
    private InterfaceC10559a onSelectionUpdateEndCallback;
    private InterfaceC10574p onSelectionUpdateSelectAll;
    private InterfaceC10576r onSelectionUpdateStartCallback;
    private boolean sorted;
    private final MutableState subselections$delegate;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final Saver<SelectionRegistrarImpl, Long> Saver = SaverKt.Saver(new InterfaceC10574p() { // from class: androidx.compose.foundation.text.selection.SelectionRegistrarImpl$Companion$Saver$1
        @Override // p300x7.InterfaceC10574p
        public final Long invoke(SaverScope saverScope, SelectionRegistrarImpl selectionRegistrarImpl) {
            return Long.valueOf(selectionRegistrarImpl.incrementId.get());
        }
    }, new InterfaceC10570l() { // from class: androidx.compose.foundation.text.selection.SelectionRegistrarImpl$Companion$Saver$2
        @Override // p300x7.InterfaceC10570l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).longValue());
        }

        public final SelectionRegistrarImpl invoke(long j10) {
            return new SelectionRegistrarImpl(j10, null);
        }
    });

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final Saver<SelectionRegistrarImpl, Long> getSaver() {
            return SelectionRegistrarImpl.Saver;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SelectionRegistrarImpl(long j10, AbstractC9126n abstractC9126n) {
        this(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sort$lambda$2(InterfaceC10574p interfaceC10574p, Object obj, Object obj2) {
        return ((Number) interfaceC10574p.invoke(obj, obj2)).intValue();
    }

    public final InterfaceC10570l getAfterSelectableUnsubscribe$foundation_release() {
        return this.afterSelectableUnsubscribe;
    }

    public final InterfaceC10570l getOnPositionChangeCallback$foundation_release() {
        return this.onPositionChangeCallback;
    }

    public final InterfaceC10570l getOnSelectableChangeCallback$foundation_release() {
        return this.onSelectableChangeCallback;
    }

    public final InterfaceC10578t getOnSelectionUpdateCallback$foundation_release() {
        return this.onSelectionUpdateCallback;
    }

    public final InterfaceC10559a getOnSelectionUpdateEndCallback$foundation_release() {
        return this.onSelectionUpdateEndCallback;
    }

    public final InterfaceC10574p getOnSelectionUpdateSelectAll$foundation_release() {
        return this.onSelectionUpdateSelectAll;
    }

    public final InterfaceC10576r getOnSelectionUpdateStartCallback$foundation_release() {
        return this.onSelectionUpdateStartCallback;
    }

    public final LongObjectMap<Selectable> getSelectableMap$foundation_release() {
        return this._selectableMap;
    }

    public final List<Selectable> getSelectables$foundation_release() {
        return this._selectables;
    }

    public final boolean getSorted$foundation_release() {
        return this.sorted;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public LongObjectMap<Selection> getSubselections() {
        return (LongObjectMap) this.subselections$delegate.getValue();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public long nextSelectableId() {
        long andIncrement = this.incrementId.getAndIncrement();
        while (andIncrement == 0) {
            andIncrement = this.incrementId.getAndIncrement();
        }
        return andIncrement;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifyPositionChange(long j10) {
        this.sorted = false;
        InterfaceC10570l interfaceC10570l = this.onPositionChangeCallback;
        if (interfaceC10570l != null) {
            interfaceC10570l.invoke(Long.valueOf(j10));
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifySelectableChange(long j10) {
        InterfaceC10570l interfaceC10570l = this.onSelectableChangeCallback;
        if (interfaceC10570l != null) {
            interfaceC10570l.invoke(Long.valueOf(j10));
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    /* renamed from: notifySelectionUpdate-njBpvok */
    public boolean mo21676notifySelectionUpdatenjBpvok(LayoutCoordinates layoutCoordinates, long j10, long j11, boolean z10, SelectionAdjustment selectionAdjustment, boolean z11) {
        InterfaceC10578t interfaceC10578t = this.onSelectionUpdateCallback;
        if (interfaceC10578t != null) {
            return ((Boolean) interfaceC10578t.invoke(Boolean.valueOf(z11), layoutCoordinates, Offset.m24024boximpl(j10), Offset.m24024boximpl(j11), Boolean.valueOf(z10), selectionAdjustment)).booleanValue();
        }
        return true;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifySelectionUpdateEnd() {
        InterfaceC10559a interfaceC10559a = this.onSelectionUpdateEndCallback;
        if (interfaceC10559a != null) {
            interfaceC10559a.invoke();
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifySelectionUpdateSelectAll(long j10, boolean z10) {
        InterfaceC10574p interfaceC10574p = this.onSelectionUpdateSelectAll;
        if (interfaceC10574p != null) {
            interfaceC10574p.invoke(Boolean.valueOf(z10), Long.valueOf(j10));
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    /* renamed from: notifySelectionUpdateStart-ubNVwUQ */
    public void mo21677notifySelectionUpdateStartubNVwUQ(LayoutCoordinates layoutCoordinates, long j10, SelectionAdjustment selectionAdjustment, boolean z10) {
        InterfaceC10576r interfaceC10576r = this.onSelectionUpdateStartCallback;
        if (interfaceC10576r != null) {
            interfaceC10576r.invoke(Boolean.valueOf(z10), layoutCoordinates, Offset.m24024boximpl(j10), selectionAdjustment);
        }
    }

    public final void setAfterSelectableUnsubscribe$foundation_release(InterfaceC10570l interfaceC10570l) {
        this.afterSelectableUnsubscribe = interfaceC10570l;
    }

    public final void setOnPositionChangeCallback$foundation_release(InterfaceC10570l interfaceC10570l) {
        this.onPositionChangeCallback = interfaceC10570l;
    }

    public final void setOnSelectableChangeCallback$foundation_release(InterfaceC10570l interfaceC10570l) {
        this.onSelectableChangeCallback = interfaceC10570l;
    }

    public final void setOnSelectionUpdateCallback$foundation_release(InterfaceC10578t interfaceC10578t) {
        this.onSelectionUpdateCallback = interfaceC10578t;
    }

    public final void setOnSelectionUpdateEndCallback$foundation_release(InterfaceC10559a interfaceC10559a) {
        this.onSelectionUpdateEndCallback = interfaceC10559a;
    }

    public final void setOnSelectionUpdateSelectAll$foundation_release(InterfaceC10574p interfaceC10574p) {
        this.onSelectionUpdateSelectAll = interfaceC10574p;
    }

    public final void setOnSelectionUpdateStartCallback$foundation_release(InterfaceC10576r interfaceC10576r) {
        this.onSelectionUpdateStartCallback = interfaceC10576r;
    }

    public final void setSorted$foundation_release(boolean z10) {
        this.sorted = z10;
    }

    public void setSubselections(LongObjectMap<Selection> longObjectMap) {
        this.subselections$delegate.setValue(longObjectMap);
    }

    public final List<Selectable> sort(final LayoutCoordinates layoutCoordinates) {
        if (!this.sorted) {
            List<Selectable> list = this._selectables;
            final InterfaceC10574p interfaceC10574p = new InterfaceC10574p() { // from class: androidx.compose.foundation.text.selection.SelectionRegistrarImpl.sort.1
                {
                    super(2);
                }

                @Override // p300x7.InterfaceC10574p
                public final Integer invoke(Selectable selectable, Selectable selectable2) {
                    LayoutCoordinates layoutCoordinates2 = selectable.getLayoutCoordinates();
                    LayoutCoordinates layoutCoordinates3 = selectable2.getLayoutCoordinates();
                    long jMo25636localPositionOfR5De75A = layoutCoordinates2 != null ? layoutCoordinates.mo25636localPositionOfR5De75A(layoutCoordinates2, Offset.Companion.m24051getZeroF1C5BW0()) : Offset.Companion.m24051getZeroF1C5BW0();
                    long jMo25636localPositionOfR5De75A2 = layoutCoordinates3 != null ? layoutCoordinates.mo25636localPositionOfR5De75A(layoutCoordinates3, Offset.Companion.m24051getZeroF1C5BW0()) : Offset.Companion.m24051getZeroF1C5BW0();
                    int i10 = (int) (jMo25636localPositionOfR5De75A & 4294967295L);
                    int i11 = (int) (4294967295L & jMo25636localPositionOfR5De75A2);
                    return Integer.valueOf(Float.intBitsToFloat(i10) == Float.intBitsToFloat(i11) ? AbstractC9260b.m16977d(Float.valueOf(Float.intBitsToFloat((int) (jMo25636localPositionOfR5De75A >> 32))), Float.valueOf(Float.intBitsToFloat((int) (jMo25636localPositionOfR5De75A2 >> 32)))) : AbstractC9260b.m16977d(Float.valueOf(Float.intBitsToFloat(i10)), Float.valueOf(Float.intBitsToFloat(i11))));
                }
            };
            AbstractC8816z.m14795A(list, new Comparator() { // from class: androidx.compose.foundation.text.selection.f
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return SelectionRegistrarImpl.sort$lambda$2(interfaceC10574p, obj, obj2);
                }
            });
            this.sorted = true;
        }
        return getSelectables$foundation_release();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public Selectable subscribe(Selectable selectable) {
        if (!(selectable.getSelectableId() != 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("The selectable contains an invalid id: " + selectable.getSelectableId());
        }
        if (this._selectableMap.containsKey(selectable.getSelectableId())) {
            InlineClassHelperKt.throwIllegalArgumentException("Another selectable with the id: " + selectable + ".selectableId has already subscribed.");
        }
        this._selectableMap.set(selectable.getSelectableId(), selectable);
        this._selectables.add(selectable);
        this.sorted = false;
        return selectable;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void unsubscribe(Selectable selectable) {
        if (this._selectableMap.containsKey(selectable.getSelectableId())) {
            this._selectables.remove(selectable);
            this._selectableMap.remove(selectable.getSelectableId());
            InterfaceC10570l interfaceC10570l = this.afterSelectableUnsubscribe;
            if (interfaceC10570l != null) {
                interfaceC10570l.invoke(Long.valueOf(selectable.getSelectableId()));
            }
        }
    }

    private SelectionRegistrarImpl(long j10) {
        this._selectables = new ArrayList();
        this._selectableMap = LongObjectMapKt.mutableLongObjectMapOf();
        this.incrementId = new AtomicLong(j10);
        this.subselections$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(LongObjectMapKt.emptyLongObjectMap(), null, 2, null);
    }

    public SelectionRegistrarImpl() {
        this(1L);
    }
}
