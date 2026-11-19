package androidx.compose.p006ui.input.pointer;

import androidx.compose.p006ui.node.HitTestResult;
import androidx.compose.p006ui.node.LayoutNode;
import androidx.compose.p006ui.node.PointerInputModifierNode;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.commonsdk.framework.UMModuleRegister;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J0\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0006\u0010\u0019\u001a\u00020\u001aR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, m5175d2 = {"Landroidx/compose/ui/input/pointer/PointerInputEventProcessor;", "", "root", "Landroidx/compose/ui/node/LayoutNode;", "(Landroidx/compose/ui/node/LayoutNode;)V", "hitPathTracker", "Landroidx/compose/ui/input/pointer/HitPathTracker;", "hitResult", "Landroidx/compose/ui/node/HitTestResult;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "isProcessing", "", "pointerInputChangeEventProducer", "Landroidx/compose/ui/input/pointer/PointerInputChangeEventProducer;", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", UMModuleRegister.PROCESS, "Landroidx/compose/ui/input/pointer/ProcessResult;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerInputEvent;", "positionCalculator", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "isInBounds", "process-BIzXfog", "(Landroidx/compose/ui/input/pointer/PointerInputEvent;Landroidx/compose/ui/input/pointer/PositionCalculator;Z)I", "processCancel", "", "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nPointerInputEventProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInputEventProcessor.kt\nandroidx/compose/ui/input/pointer/PointerInputEventProcessor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,237:1\n1747#2,3:238\n1855#2,2:241\n1747#2,3:243\n*S KotlinDebug\n*F\n+ 1 PointerInputEventProcessor.kt\nandroidx/compose/ui/input/pointer/PointerInputEventProcessor\n*L\n78#1:238,3\n81#1:241,2\n104#1:243,3\n*E\n"})
/* loaded from: classes.dex */
public final class PointerInputEventProcessor {
    private final HitPathTracker hitPathTracker;
    private final HitTestResult<PointerInputModifierNode> hitResult;
    private boolean isProcessing;
    private final PointerInputChangeEventProducer pointerInputChangeEventProducer;
    private final LayoutNode root;

    public PointerInputEventProcessor(LayoutNode root) {
        Intrinsics.checkNotNullParameter(root, "root");
        this.root = root;
        this.hitPathTracker = new HitPathTracker(root.getCoordinates());
        this.pointerInputChangeEventProducer = new PointerInputChangeEventProducer();
        this.hitResult = new HitTestResult<>();
    }

    /* renamed from: process-BIzXfog$default, reason: not valid java name */
    public static /* synthetic */ int m10498processBIzXfog$default(PointerInputEventProcessor pointerInputEventProcessor, PointerInputEvent pointerInputEvent, PositionCalculator positionCalculator, boolean z3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            z3 = true;
        }
        return pointerInputEventProcessor.m10499processBIzXfog(pointerInputEvent, positionCalculator, z3);
    }

    public final LayoutNode getRoot() {
        return this.root;
    }

    /* renamed from: process-BIzXfog, reason: not valid java name */
    public final int m10499processBIzXfog(PointerInputEvent pointerEvent, PositionCalculator positionCalculator, boolean isInBounds) {
        boolean z3;
        Intrinsics.checkNotNullParameter(pointerEvent, "pointerEvent");
        Intrinsics.checkNotNullParameter(positionCalculator, "positionCalculator");
        if (this.isProcessing) {
            return PointerInputEventProcessorKt.ProcessResult(false, false);
        }
        boolean z4 = true;
        try {
            this.isProcessing = true;
            InternalPointerEvent internalPointerEventProduce = this.pointerInputChangeEventProducer.produce(pointerEvent, positionCalculator);
            Collection<PointerInputChange> collectionValues = internalPointerEventProduce.getChanges().values();
            if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
                z3 = false;
            } else {
                for (PointerInputChange pointerInputChange : collectionValues) {
                    if (pointerInputChange.getPressed() || pointerInputChange.getPreviousPressed()) {
                        z3 = true;
                        break;
                    }
                }
                z3 = false;
            }
            boolean z5 = !z3;
            for (PointerInputChange pointerInputChange2 : internalPointerEventProduce.getChanges().values()) {
                if (z5 || PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange2)) {
                    LayoutNode.m10696hitTestM_7yMNQ$ui_release$default(this.root, pointerInputChange2.getPosition(), this.hitResult, PointerType.m10538equalsimpl0(pointerInputChange2.getType(), PointerType.INSTANCE.m10545getTouchT8wyACA()), false, 8, null);
                    if (!this.hitResult.isEmpty()) {
                        this.hitPathTracker.m10411addHitPathKNwqfcY(pointerInputChange2.getId(), this.hitResult);
                        this.hitResult.clear();
                    }
                }
            }
            this.hitPathTracker.removeDetachedPointerInputFilters();
            boolean zDispatchChanges = this.hitPathTracker.dispatchChanges(internalPointerEventProduce, isInBounds);
            if (internalPointerEventProduce.getSuppressMovementConsumption()) {
                z4 = false;
            } else {
                Collection<PointerInputChange> collectionValues2 = internalPointerEventProduce.getChanges().values();
                if (!(collectionValues2 instanceof Collection) || !collectionValues2.isEmpty()) {
                    for (PointerInputChange pointerInputChange3 : collectionValues2) {
                        if (PointerEventKt.positionChangedIgnoreConsumed(pointerInputChange3) && pointerInputChange3.isConsumed()) {
                            break;
                        }
                    }
                }
                z4 = false;
            }
            return PointerInputEventProcessorKt.ProcessResult(zDispatchChanges, z4);
        } finally {
            this.isProcessing = false;
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
