package androidx.compose.foundation.text.selection;

import androidx.collection.LongObjectMap;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.layout.LayoutCoordinates;
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
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9546r;
import p181hd.InterfaceC9548t;
import p325rc.AbstractC10935a0;
import p364uc.AbstractC11382b;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class SelectionRegistrarImpl implements SelectionRegistrar {
    private final MutableLongObjectMap<Selectable> _selectableMap;
    private final List<Selectable> _selectables;
    private InterfaceC9540l afterSelectableUnsubscribe;
    private AtomicLong incrementId;
    private InterfaceC9540l onPositionChangeCallback;
    private InterfaceC9540l onSelectableChangeCallback;
    private InterfaceC9548t onSelectionUpdateCallback;
    private InterfaceC9529a onSelectionUpdateEndCallback;
    private InterfaceC9544p onSelectionUpdateSelectAll;
    private InterfaceC9546r onSelectionUpdateStartCallback;
    private boolean sorted;
    private final MutableState subselections$delegate;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final Saver<SelectionRegistrarImpl, Long> Saver = SaverKt.Saver(new InterfaceC9544p() { // from class: androidx.compose.foundation.text.selection.SelectionRegistrarImpl$Companion$Saver$1
        @Override // p181hd.InterfaceC9544p
        public final Long invoke(SaverScope saverScope, SelectionRegistrarImpl selectionRegistrarImpl) {
            return Long.valueOf(selectionRegistrarImpl.incrementId.get());
        }
    }, new InterfaceC9540l() { // from class: androidx.compose.foundation.text.selection.SelectionRegistrarImpl$Companion$Saver$2
        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).longValue());
        }

        public final SelectionRegistrarImpl invoke(long j10) {
            return new SelectionRegistrarImpl(j10, null);
        }
    });

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final Saver<SelectionRegistrarImpl, Long> getSaver() {
            return SelectionRegistrarImpl.Saver;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SelectionRegistrarImpl(long j10, AbstractC9972n abstractC9972n) {
        this(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sort$lambda$2(InterfaceC9544p interfaceC9544p, Object obj, Object obj2) {
        return ((Number) interfaceC9544p.invoke(obj, obj2)).intValue();
    }

    public final InterfaceC9540l getAfterSelectableUnsubscribe$foundation_release() {
        return this.afterSelectableUnsubscribe;
    }

    public final InterfaceC9540l getOnPositionChangeCallback$foundation_release() {
        return this.onPositionChangeCallback;
    }

    public final InterfaceC9540l getOnSelectableChangeCallback$foundation_release() {
        return this.onSelectableChangeCallback;
    }

    public final InterfaceC9548t getOnSelectionUpdateCallback$foundation_release() {
        return this.onSelectionUpdateCallback;
    }

    public final InterfaceC9529a getOnSelectionUpdateEndCallback$foundation_release() {
        return this.onSelectionUpdateEndCallback;
    }

    public final InterfaceC9544p getOnSelectionUpdateSelectAll$foundation_release() {
        return this.onSelectionUpdateSelectAll;
    }

    public final InterfaceC9546r getOnSelectionUpdateStartCallback$foundation_release() {
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
        InterfaceC9540l interfaceC9540l = this.onPositionChangeCallback;
        if (interfaceC9540l != null) {
            interfaceC9540l.invoke(Long.valueOf(j10));
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifySelectableChange(long j10) {
        InterfaceC9540l interfaceC9540l = this.onSelectableChangeCallback;
        if (interfaceC9540l != null) {
            interfaceC9540l.invoke(Long.valueOf(j10));
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    /* renamed from: notifySelectionUpdate-njBpvok */
    public boolean mo28278notifySelectionUpdatenjBpvok(LayoutCoordinates layoutCoordinates, long j10, long j11, boolean z10, SelectionAdjustment selectionAdjustment, boolean z11) {
        InterfaceC9548t interfaceC9548t = this.onSelectionUpdateCallback;
        if (interfaceC9548t != null) {
            return ((Boolean) interfaceC9548t.invoke(Boolean.valueOf(z11), layoutCoordinates, Offset.m30626boximpl(j10), Offset.m30626boximpl(j11), Boolean.valueOf(z10), selectionAdjustment)).booleanValue();
        }
        return true;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifySelectionUpdateEnd() {
        InterfaceC9529a interfaceC9529a = this.onSelectionUpdateEndCallback;
        if (interfaceC9529a != null) {
            interfaceC9529a.invoke();
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifySelectionUpdateSelectAll(long j10, boolean z10) {
        InterfaceC9544p interfaceC9544p = this.onSelectionUpdateSelectAll;
        if (interfaceC9544p != null) {
            interfaceC9544p.invoke(Boolean.valueOf(z10), Long.valueOf(j10));
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    /* renamed from: notifySelectionUpdateStart-ubNVwUQ */
    public void mo28279notifySelectionUpdateStartubNVwUQ(LayoutCoordinates layoutCoordinates, long j10, SelectionAdjustment selectionAdjustment, boolean z10) {
        InterfaceC9546r interfaceC9546r = this.onSelectionUpdateStartCallback;
        if (interfaceC9546r != null) {
            interfaceC9546r.invoke(Boolean.valueOf(z10), layoutCoordinates, Offset.m30626boximpl(j10), selectionAdjustment);
        }
    }

    public final void setAfterSelectableUnsubscribe$foundation_release(InterfaceC9540l interfaceC9540l) {
        this.afterSelectableUnsubscribe = interfaceC9540l;
    }

    public final void setOnPositionChangeCallback$foundation_release(InterfaceC9540l interfaceC9540l) {
        this.onPositionChangeCallback = interfaceC9540l;
    }

    public final void setOnSelectableChangeCallback$foundation_release(InterfaceC9540l interfaceC9540l) {
        this.onSelectableChangeCallback = interfaceC9540l;
    }

    public final void setOnSelectionUpdateCallback$foundation_release(InterfaceC9548t interfaceC9548t) {
        this.onSelectionUpdateCallback = interfaceC9548t;
    }

    public final void setOnSelectionUpdateEndCallback$foundation_release(InterfaceC9529a interfaceC9529a) {
        this.onSelectionUpdateEndCallback = interfaceC9529a;
    }

    public final void setOnSelectionUpdateSelectAll$foundation_release(InterfaceC9544p interfaceC9544p) {
        this.onSelectionUpdateSelectAll = interfaceC9544p;
    }

    public final void setOnSelectionUpdateStartCallback$foundation_release(InterfaceC9546r interfaceC9546r) {
        this.onSelectionUpdateStartCallback = interfaceC9546r;
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
            final InterfaceC9544p interfaceC9544p = new InterfaceC9544p() { // from class: androidx.compose.foundation.text.selection.SelectionRegistrarImpl.sort.1
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public final Integer invoke(Selectable selectable, Selectable selectable2) {
                    LayoutCoordinates layoutCoordinates2 = selectable.getLayoutCoordinates();
                    LayoutCoordinates layoutCoordinates3 = selectable2.getLayoutCoordinates();
                    long jMo32238localPositionOfR5De75A = layoutCoordinates2 != null ? layoutCoordinates.mo32238localPositionOfR5De75A(layoutCoordinates2, Offset.Companion.m30653getZeroF1C5BW0()) : Offset.Companion.m30653getZeroF1C5BW0();
                    long jMo32238localPositionOfR5De75A2 = layoutCoordinates3 != null ? layoutCoordinates.mo32238localPositionOfR5De75A(layoutCoordinates3, Offset.Companion.m30653getZeroF1C5BW0()) : Offset.Companion.m30653getZeroF1C5BW0();
                    int i10 = (int) (jMo32238localPositionOfR5De75A & 4294967295L);
                    int i11 = (int) (4294967295L & jMo32238localPositionOfR5De75A2);
                    return Integer.valueOf(Float.intBitsToFloat(i10) == Float.intBitsToFloat(i11) ? AbstractC11382b.m25330d(Float.valueOf(Float.intBitsToFloat((int) (jMo32238localPositionOfR5De75A >> 32))), Float.valueOf(Float.intBitsToFloat((int) (jMo32238localPositionOfR5De75A2 >> 32)))) : AbstractC11382b.m25330d(Float.valueOf(Float.intBitsToFloat(i10)), Float.valueOf(Float.intBitsToFloat(i11))));
                }
            };
            AbstractC10935a0.m23853A(list, new Comparator() { // from class: androidx.compose.foundation.text.selection.f
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return SelectionRegistrarImpl.sort$lambda$2(interfaceC9544p, obj, obj2);
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
            InterfaceC9540l interfaceC9540l = this.afterSelectableUnsubscribe;
            if (interfaceC9540l != null) {
                interfaceC9540l.invoke(Long.valueOf(selectable.getSelectableId()));
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
