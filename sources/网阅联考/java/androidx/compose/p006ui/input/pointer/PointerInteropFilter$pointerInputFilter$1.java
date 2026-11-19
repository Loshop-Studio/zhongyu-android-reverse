package androidx.compose.p006ui.input.pointer;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.p006ui.geometry.Offset;
import androidx.compose.p006ui.input.pointer.PointerInteropFilter;
import androidx.compose.p006ui.layout.LayoutCoordinates;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\tH\u0016J-\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\tH\u0002R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0015"}, m5175d2 = {"androidx/compose/ui/input/pointer/PointerInteropFilter$pointerInputFilter$1", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "shareWithSiblings", "", "getShareWithSiblings", "()Z", "state", "Landroidx/compose/ui/input/pointer/PointerInteropFilter$DispatchToViewState;", "dispatchToView", "", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "onCancel", "onPointerEvent", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "bounds", "Landroidx/compose/ui/unit/IntSize;", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "reset", "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nPointerInteropFilter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter$pointerInputFilter$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,350:1\n101#2,2:351\n33#2,6:353\n103#2:359\n86#2,2:360\n33#2,6:362\n88#2:368\n101#2,2:369\n33#2,6:371\n103#2:377\n33#2,6:378\n*S KotlinDebug\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter$pointerInputFilter$1\n*L\n223#1:351,2\n223#1:353,6\n223#1:359\n238#1:360,2\n238#1:362,6\n238#1:368\n280#1:369,2\n280#1:371,6\n280#1:377\n314#1:378,6\n*E\n"})
/* loaded from: classes.dex */
public final class PointerInteropFilter$pointerInputFilter$1 extends PointerInputFilter {
    private PointerInteropFilter.DispatchToViewState state = PointerInteropFilter.DispatchToViewState.Unknown;
    final /* synthetic */ PointerInteropFilter this$0;

    public PointerInteropFilter$pointerInputFilter$1(PointerInteropFilter pointerInteropFilter) {
        this.this$0 = pointerInteropFilter;
    }

    private final void dispatchToView(PointerEvent pointerEvent) {
        boolean z3;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                z3 = false;
                break;
            } else {
                if (changes.get(i4).isConsumed()) {
                    z3 = true;
                    break;
                }
                i4++;
            }
        }
        if (z3) {
            if (this.state == PointerInteropFilter.DispatchToViewState.Dispatching) {
                LayoutCoordinates layoutCoordinates = getLayoutCoordinates();
                if (layoutCoordinates == null) {
                    throw new IllegalStateException("layoutCoordinates not set".toString());
                }
                long jMo10591localToRootMKHz9U = layoutCoordinates.mo10591localToRootMKHz9U(Offset.INSTANCE.m8961getZeroF1C5BW0());
                final PointerInteropFilter pointerInteropFilter = this.this$0;
                PointerInteropUtils_androidKt.m10525toCancelMotionEventScoped4ec7I(pointerEvent, jMo10591localToRootMKHz9U, new Function1<MotionEvent, Unit>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$dispatchToView$2
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(MotionEvent motionEvent) {
                        invoke2(motionEvent);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(MotionEvent motionEvent) {
                        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
                        pointerInteropFilter.getOnTouchEvent().invoke(motionEvent);
                    }
                });
            }
            this.state = PointerInteropFilter.DispatchToViewState.NotDispatching;
            return;
        }
        LayoutCoordinates layoutCoordinates2 = getLayoutCoordinates();
        if (layoutCoordinates2 == null) {
            throw new IllegalStateException("layoutCoordinates not set".toString());
        }
        long jMo10591localToRootMKHz9U2 = layoutCoordinates2.mo10591localToRootMKHz9U(Offset.INSTANCE.m8961getZeroF1C5BW0());
        final PointerInteropFilter pointerInteropFilter2 = this.this$0;
        PointerInteropUtils_androidKt.m10526toMotionEventScoped4ec7I(pointerEvent, jMo10591localToRootMKHz9U2, new Function1<MotionEvent, Unit>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$dispatchToView$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(MotionEvent motionEvent) {
                invoke2(motionEvent);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(MotionEvent motionEvent) {
                Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
                if (motionEvent.getActionMasked() != 0) {
                    pointerInteropFilter2.getOnTouchEvent().invoke(motionEvent);
                } else {
                    this.this$0.state = pointerInteropFilter2.getOnTouchEvent().invoke(motionEvent).booleanValue() ? PointerInteropFilter.DispatchToViewState.Dispatching : PointerInteropFilter.DispatchToViewState.NotDispatching;
                }
            }
        });
        if (this.state == PointerInteropFilter.DispatchToViewState.Dispatching) {
            int size2 = changes.size();
            for (int i5 = 0; i5 < size2; i5++) {
                changes.get(i5).consume();
            }
            InternalPointerEvent internalPointerEvent = pointerEvent.getInternalPointerEvent();
            if (internalPointerEvent == null) {
                return;
            }
            internalPointerEvent.setSuppressMovementConsumption(!this.this$0.getDisallowIntercept());
        }
    }

    private final void reset() {
        this.state = PointerInteropFilter.DispatchToViewState.Unknown;
        this.this$0.setDisallowIntercept$ui_release(false);
    }

    @Override // androidx.compose.p006ui.input.pointer.PointerInputFilter
    public boolean getShareWithSiblings() {
        return true;
    }

    @Override // androidx.compose.p006ui.input.pointer.PointerInputFilter
    public void onCancel() {
        if (this.state == PointerInteropFilter.DispatchToViewState.Dispatching) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            final PointerInteropFilter pointerInteropFilter = this.this$0;
            PointerInteropUtils_androidKt.emptyCancelMotionEventScope(jUptimeMillis, new Function1<MotionEvent, Unit>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$onCancel$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(MotionEvent motionEvent) {
                    invoke2(motionEvent);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(MotionEvent motionEvent) {
                    Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
                    pointerInteropFilter.getOnTouchEvent().invoke(motionEvent);
                }
            });
            reset();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    @Override // androidx.compose.p006ui.input.pointer.PointerInputFilter
    /* renamed from: onPointerEvent-H0pRuoY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo10501onPointerEventH0pRuoY(androidx.compose.p006ui.input.pointer.PointerEvent r6, androidx.compose.p006ui.input.pointer.PointerEventPass r7, long r8) {
        /*
            r5 = this;
            java.lang.String r8 = "pointerEvent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r8)
            java.lang.String r8 = "pass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r8)
            java.util.List r8 = r6.getChanges()
            androidx.compose.ui.input.pointer.PointerInteropFilter r9 = r5.this$0
            boolean r9 = r9.getDisallowIntercept()
            r0 = 0
            r1 = 1
            if (r9 != 0) goto L42
            int r9 = r8.size()
            r2 = r0
        L1d:
            if (r2 >= r9) goto L3c
            java.lang.Object r3 = r8.get(r2)
            androidx.compose.ui.input.pointer.PointerInputChange r3 = (androidx.compose.p006ui.input.pointer.PointerInputChange) r3
            boolean r4 = androidx.compose.p006ui.input.pointer.PointerEventKt.changedToDownIgnoreConsumed(r3)
            if (r4 != 0) goto L34
            boolean r3 = androidx.compose.p006ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r3)
            if (r3 == 0) goto L32
            goto L34
        L32:
            r3 = r0
            goto L35
        L34:
            r3 = r1
        L35:
            if (r3 == 0) goto L39
            r9 = r1
            goto L3d
        L39:
            int r2 = r2 + 1
            goto L1d
        L3c:
            r9 = r0
        L3d:
            if (r9 == 0) goto L40
            goto L42
        L40:
            r9 = r0
            goto L43
        L42:
            r9 = r1
        L43:
            androidx.compose.ui.input.pointer.PointerInteropFilter$DispatchToViewState r2 = r5.state
            androidx.compose.ui.input.pointer.PointerInteropFilter$DispatchToViewState r3 = androidx.compose.ui.input.pointer.PointerInteropFilter.DispatchToViewState.NotDispatching
            if (r2 == r3) goto L5b
            androidx.compose.ui.input.pointer.PointerEventPass r2 = androidx.compose.p006ui.input.pointer.PointerEventPass.Initial
            if (r7 != r2) goto L52
            if (r9 == 0) goto L52
            r5.dispatchToView(r6)
        L52:
            androidx.compose.ui.input.pointer.PointerEventPass r2 = androidx.compose.p006ui.input.pointer.PointerEventPass.Final
            if (r7 != r2) goto L5b
            if (r9 != 0) goto L5b
            r5.dispatchToView(r6)
        L5b:
            androidx.compose.ui.input.pointer.PointerEventPass r6 = androidx.compose.p006ui.input.pointer.PointerEventPass.Final
            if (r7 != r6) goto L7c
            int r6 = r8.size()
            r7 = r0
        L64:
            if (r7 >= r6) goto L76
            java.lang.Object r9 = r8.get(r7)
            androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.p006ui.input.pointer.PointerInputChange) r9
            boolean r9 = androidx.compose.p006ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r9)
            if (r9 != 0) goto L73
            goto L77
        L73:
            int r7 = r7 + 1
            goto L64
        L76:
            r0 = r1
        L77:
            if (r0 == 0) goto L7c
            r5.reset()
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p006ui.input.pointer.PointerInteropFilter$pointerInputFilter$1.mo10501onPointerEventH0pRuoY(androidx.compose.ui.input.pointer.PointerEvent, androidx.compose.ui.input.pointer.PointerEventPass, long):void");
    }
}
