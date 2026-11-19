package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionGesturesKt;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.layout.LayoutCoordinates;
import p300x7.InterfaceC10559a;

/* loaded from: classes.dex */
public final class SelectionControllerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier makeSelectionModifier(final SelectionRegistrar selectionRegistrar, final long j10, final InterfaceC10559a interfaceC10559a) {
        TextDragObserver textDragObserver = new TextDragObserver() { // from class: androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeSelectionModifier$longPressDragObserver$1
            private long dragTotalDistance;
            private long lastPosition;

            {
                Offset.Companion companion = Offset.Companion;
                this.lastPosition = companion.m24051getZeroF1C5BW0();
                this.dragTotalDistance = companion.m24051getZeroF1C5BW0();
            }

            public final long getDragTotalDistance() {
                return this.dragTotalDistance;
            }

            public final long getLastPosition() {
                return this.lastPosition;
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
                if (SelectionRegistrarKt.hasSelection(selectionRegistrar, j10)) {
                    selectionRegistrar.notifySelectionUpdateEnd();
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo21286onDownk4lQ0M(long j11) {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo21287onDragk4lQ0M(long j11) {
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) interfaceC10559a.invoke();
                if (layoutCoordinates != null) {
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    long j12 = j10;
                    if (layoutCoordinates.isAttached() && SelectionRegistrarKt.hasSelection(selectionRegistrar2, j12)) {
                        long jM24040plusMKHz9U = Offset.m24040plusMKHz9U(this.dragTotalDistance, j11);
                        this.dragTotalDistance = jM24040plusMKHz9U;
                        long jM24040plusMKHz9U2 = Offset.m24040plusMKHz9U(this.lastPosition, jM24040plusMKHz9U);
                        if (selectionRegistrar2.mo21676notifySelectionUpdatenjBpvok(layoutCoordinates, jM24040plusMKHz9U2, this.lastPosition, false, SelectionAdjustment.Companion.getWord(), true)) {
                            this.lastPosition = jM24040plusMKHz9U2;
                            this.dragTotalDistance = Offset.Companion.m24051getZeroF1C5BW0();
                        }
                    }
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo21288onStartk4lQ0M(long j11) {
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) interfaceC10559a.invoke();
                if (layoutCoordinates != null) {
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    if (!layoutCoordinates.isAttached()) {
                        return;
                    }
                    selectionRegistrar2.mo21677notifySelectionUpdateStartubNVwUQ(layoutCoordinates, j11, SelectionAdjustment.Companion.getWord(), true);
                    this.lastPosition = j11;
                }
                if (SelectionRegistrarKt.hasSelection(selectionRegistrar, j10)) {
                    this.dragTotalDistance = Offset.Companion.m24051getZeroF1C5BW0();
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                if (SelectionRegistrarKt.hasSelection(selectionRegistrar, j10)) {
                    selectionRegistrar.notifySelectionUpdateEnd();
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
            }

            public final void setDragTotalDistance(long j11) {
                this.dragTotalDistance = j11;
            }

            public final void setLastPosition(long j11) {
                this.lastPosition = j11;
            }
        };
        return SelectionGesturesKt.selectionGestureInput(Modifier.Companion, new MouseSelectionObserver() { // from class: androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeSelectionModifier$mouseSelectionObserver$1
            private long lastPosition = Offset.Companion.m24051getZeroF1C5BW0();

            public final long getLastPosition() {
                return this.lastPosition;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onDrag-3MmeM6k */
            public boolean mo21535onDrag3MmeM6k(long j11, SelectionAdjustment selectionAdjustment) {
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) interfaceC10559a.invoke();
                if (layoutCoordinates == null) {
                    return true;
                }
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                long j12 = j10;
                if (!layoutCoordinates.isAttached() || !SelectionRegistrarKt.hasSelection(selectionRegistrar2, j12)) {
                    return false;
                }
                if (!selectionRegistrar2.mo21676notifySelectionUpdatenjBpvok(layoutCoordinates, j11, this.lastPosition, false, selectionAdjustment, false)) {
                    return true;
                }
                this.lastPosition = j11;
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public void onDragDone() {
                selectionRegistrar.notifySelectionUpdateEnd();
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtend-k-4lQ0M */
            public boolean mo21536onExtendk4lQ0M(long j11) {
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) interfaceC10559a.invoke();
                if (layoutCoordinates == null) {
                    return false;
                }
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                long j12 = j10;
                if (!layoutCoordinates.isAttached()) {
                    return false;
                }
                if (selectionRegistrar2.mo21676notifySelectionUpdatenjBpvok(layoutCoordinates, j11, this.lastPosition, false, SelectionAdjustment.Companion.getNone(), false)) {
                    this.lastPosition = j11;
                }
                return SelectionRegistrarKt.hasSelection(selectionRegistrar2, j12);
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtendDrag-k-4lQ0M */
            public boolean mo21537onExtendDragk4lQ0M(long j11) {
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) interfaceC10559a.invoke();
                if (layoutCoordinates == null) {
                    return true;
                }
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                long j12 = j10;
                if (!layoutCoordinates.isAttached() || !SelectionRegistrarKt.hasSelection(selectionRegistrar2, j12)) {
                    return false;
                }
                if (!selectionRegistrar2.mo21676notifySelectionUpdatenjBpvok(layoutCoordinates, j11, this.lastPosition, false, SelectionAdjustment.Companion.getNone(), false)) {
                    return true;
                }
                this.lastPosition = j11;
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onStart-3MmeM6k */
            public boolean mo21538onStart3MmeM6k(long j11, SelectionAdjustment selectionAdjustment) {
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) interfaceC10559a.invoke();
                if (layoutCoordinates == null) {
                    return false;
                }
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                long j12 = j10;
                if (!layoutCoordinates.isAttached()) {
                    return false;
                }
                selectionRegistrar2.mo21677notifySelectionUpdateStartubNVwUQ(layoutCoordinates, j11, selectionAdjustment, false);
                this.lastPosition = j11;
                return SelectionRegistrarKt.hasSelection(selectionRegistrar2, j12);
            }

            public final void setLastPosition(long j11) {
                this.lastPosition = j11;
            }
        }, textDragObserver);
    }
}
