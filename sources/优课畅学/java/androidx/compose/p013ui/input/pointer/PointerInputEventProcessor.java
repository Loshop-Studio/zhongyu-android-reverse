package androidx.compose.p013ui.input.pointer;

import androidx.compose.p013ui.node.HitTestResult;
import androidx.compose.p013ui.node.LayoutNode;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class PointerInputEventProcessor {
    public static final int $stable = 8;
    private final HitPathTracker hitPathTracker;
    private boolean isProcessing;
    private final LayoutNode root;
    private final PointerInputChangeEventProducer pointerInputChangeEventProducer = new PointerInputChangeEventProducer();
    private final HitTestResult hitResult = new HitTestResult();

    public PointerInputEventProcessor(LayoutNode layoutNode) {
        this.root = layoutNode;
        this.hitPathTracker = new HitPathTracker(layoutNode.getCoordinates());
    }

    /* renamed from: process-BIzXfog$default, reason: not valid java name */
    public static /* synthetic */ int m25522processBIzXfog$default(PointerInputEventProcessor pointerInputEventProcessor, PointerInputEvent pointerInputEvent, PositionCalculator positionCalculator, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return pointerInputEventProcessor.m25523processBIzXfog(pointerInputEvent, positionCalculator, z10);
    }

    public final void clearPreviouslyHitModifierNodes() {
        this.hitPathTracker.clearPreviouslyHitModifierNodeCache();
    }

    public final LayoutNode getRoot() {
        return this.root;
    }

    /* renamed from: process-BIzXfog, reason: not valid java name */
    public final int m25523processBIzXfog(PointerInputEvent pointerInputEvent, PositionCalculator positionCalculator, boolean z10) {
        boolean z11;
        if (this.isProcessing) {
            return PointerInputEventProcessorKt.ProcessResult(false, false);
        }
        boolean z12 = true;
        try {
            this.isProcessing = true;
            InternalPointerEvent internalPointerEventProduce = this.pointerInputChangeEventProducer.produce(pointerInputEvent, positionCalculator);
            int size = internalPointerEventProduce.getChanges().size();
            for (int i10 = 0; i10 < size; i10++) {
                PointerInputChange pointerInputChangeValueAt = internalPointerEventProduce.getChanges().valueAt(i10);
                if (!pointerInputChangeValueAt.getPressed() && !pointerInputChangeValueAt.getPreviousPressed()) {
                }
                z11 = false;
                break;
            }
            z11 = true;
            int size2 = internalPointerEventProduce.getChanges().size();
            for (int i11 = 0; i11 < size2; i11++) {
                PointerInputChange pointerInputChangeValueAt2 = internalPointerEventProduce.getChanges().valueAt(i11);
                if (z11 || PointerEventKt.changedToDownIgnoreConsumed(pointerInputChangeValueAt2)) {
                    LayoutNode.m25802hitTest6fMxITs$ui_release$default(this.root, pointerInputChangeValueAt2.m25502getPositionF1C5BW0(), this.hitResult, pointerInputChangeValueAt2.m25505getTypeT8wyACA(), false, 8, null);
                    if (!this.hitResult.isEmpty()) {
                        this.hitPathTracker.m25427addHitPathQJqDSyo(pointerInputChangeValueAt2.m25500getIdJ3iCeTQ(), this.hitResult, PointerEventKt.changedToDownIgnoreConsumed(pointerInputChangeValueAt2));
                        this.hitResult.clear();
                    }
                }
            }
            boolean zDispatchChanges = this.hitPathTracker.dispatchChanges(internalPointerEventProduce, z10);
            if (internalPointerEventProduce.getSuppressMovementConsumption()) {
                z12 = false;
            } else {
                int size3 = internalPointerEventProduce.getChanges().size();
                for (int i12 = 0; i12 < size3; i12++) {
                    PointerInputChange pointerInputChangeValueAt3 = internalPointerEventProduce.getChanges().valueAt(i12);
                    if (PointerEventKt.positionChangedIgnoreConsumed(pointerInputChangeValueAt3) && pointerInputChangeValueAt3.isConsumed()) {
                        break;
                    }
                }
                z12 = false;
            }
            int iProcessResult = PointerInputEventProcessorKt.ProcessResult(zDispatchChanges, z12);
            this.isProcessing = false;
            return iProcessResult;
        } catch (Throwable th) {
            this.isProcessing = false;
            throw th;
        }
    }

    public final void processCancel() {
        if (this.isProcessing) {
            return;
        }
        this.pointerInputChangeEventProducer.clear();
        this.hitPathTracker.processCancel();
    }
}
