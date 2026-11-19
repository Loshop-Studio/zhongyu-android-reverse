package androidx.compose.p014ui.input.pointer;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.input.pointer.PointerInteropFilter;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import java.util.List;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes2.dex */
public final class PointerInteropFilter$pointerInputFilter$1 extends PointerInputFilter {
    private PointerInteropFilter.DispatchToViewState state = PointerInteropFilter.DispatchToViewState.Unknown;
    final /* synthetic */ PointerInteropFilter this$0;

    public PointerInteropFilter$pointerInputFilter$1(PointerInteropFilter pointerInteropFilter) {
        this.this$0 = pointerInteropFilter;
    }

    private final void dispatchToView(PointerEvent pointerEvent) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        List<PointerInputChange> list = changes;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (changes.get(i10).isConsumed()) {
                if (this.state == PointerInteropFilter.DispatchToViewState.Dispatching) {
                    LayoutCoordinates layoutCoordinates$ui_release = getLayoutCoordinates$ui_release();
                    if (layoutCoordinates$ui_release == null) {
                        throw new IllegalStateException("layoutCoordinates not set");
                    }
                    long jMo32240localToRootMKHz9U = layoutCoordinates$ui_release.mo32240localToRootMKHz9U(Offset.Companion.m30653getZeroF1C5BW0());
                    final PointerInteropFilter pointerInteropFilter = this.this$0;
                    PointerInteropUtils_androidKt.m32162toCancelMotionEventScoped4ec7I(pointerEvent, jMo32240localToRootMKHz9U, new InterfaceC9540l() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$dispatchToView$2
                        {
                            super(1);
                        }

                        @Override // p181hd.InterfaceC9540l
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((MotionEvent) obj);
                            return C10786q.f26013a;
                        }

                        public final void invoke(MotionEvent motionEvent) {
                            pointerInteropFilter.getOnTouchEvent().invoke(motionEvent);
                        }
                    });
                }
                this.state = PointerInteropFilter.DispatchToViewState.NotDispatching;
                return;
            }
        }
        LayoutCoordinates layoutCoordinates$ui_release2 = getLayoutCoordinates$ui_release();
        if (layoutCoordinates$ui_release2 == null) {
            throw new IllegalStateException("layoutCoordinates not set");
        }
        long jMo32240localToRootMKHz9U2 = layoutCoordinates$ui_release2.mo32240localToRootMKHz9U(Offset.Companion.m30653getZeroF1C5BW0());
        final PointerInteropFilter pointerInteropFilter2 = this.this$0;
        PointerInteropUtils_androidKt.m32163toMotionEventScoped4ec7I(pointerEvent, jMo32240localToRootMKHz9U2, new InterfaceC9540l() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$dispatchToView$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((MotionEvent) obj);
                return C10786q.f26013a;
            }

            public final void invoke(MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() != 0) {
                    pointerInteropFilter2.getOnTouchEvent().invoke(motionEvent);
                } else {
                    this.this$0.state = ((Boolean) pointerInteropFilter2.getOnTouchEvent().invoke(motionEvent)).booleanValue() ? PointerInteropFilter.DispatchToViewState.Dispatching : PointerInteropFilter.DispatchToViewState.NotDispatching;
                }
            }
        });
        if (this.state == PointerInteropFilter.DispatchToViewState.Dispatching) {
            int size2 = list.size();
            for (int i11 = 0; i11 < size2; i11++) {
                changes.get(i11).consume();
            }
            InternalPointerEvent internalPointerEvent$ui_release = pointerEvent.getInternalPointerEvent$ui_release();
            if (internalPointerEvent$ui_release == null) {
                return;
            }
            internalPointerEvent$ui_release.setSuppressMovementConsumption(!this.this$0.getDisallowIntercept$ui_release());
        }
    }

    private final void reset() {
        this.state = PointerInteropFilter.DispatchToViewState.Unknown;
        this.this$0.setDisallowIntercept$ui_release(false);
    }

    @Override // androidx.compose.p014ui.input.pointer.PointerInputFilter
    public boolean getShareWithSiblings() {
        return true;
    }

    @Override // androidx.compose.p014ui.input.pointer.PointerInputFilter
    public void onCancel() {
        if (this.state == PointerInteropFilter.DispatchToViewState.Dispatching) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            final PointerInteropFilter pointerInteropFilter = this.this$0;
            PointerInteropUtils_androidKt.emptyCancelMotionEventScope(jUptimeMillis, new InterfaceC9540l() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$onCancel$1
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((MotionEvent) obj);
                    return C10786q.f26013a;
                }

                public final void invoke(MotionEvent motionEvent) {
                    pointerInteropFilter.getOnTouchEvent().invoke(motionEvent);
                }
            });
            reset();
        }
    }

    @Override // androidx.compose.p014ui.input.pointer.PointerInputFilter
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo32127onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j10) {
        boolean z10;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        if (this.this$0.getDisallowIntercept$ui_release()) {
            z10 = true;
            break;
        }
        int size = changes.size();
        for (int i10 = 0; i10 < size; i10++) {
            PointerInputChange pointerInputChange = changes.get(i10);
            if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange) || PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                z10 = true;
                break;
            }
        }
        z10 = false;
        if (this.state != PointerInteropFilter.DispatchToViewState.NotDispatching) {
            if (pointerEventPass == PointerEventPass.Initial && z10) {
                dispatchToView(pointerEvent);
            }
            if (pointerEventPass == PointerEventPass.Final && !z10) {
                dispatchToView(pointerEvent);
            }
        }
        if (pointerEventPass == PointerEventPass.Final) {
            int size2 = changes.size();
            for (int i11 = 0; i11 < size2; i11++) {
                if (!PointerEventKt.changedToUpIgnoreConsumed(changes.get(i11))) {
                    return;
                }
            }
            reset();
        }
    }
}
