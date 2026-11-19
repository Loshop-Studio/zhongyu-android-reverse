package androidx.compose.foundation.draganddrop;

import androidx.compose.p009ui.draganddrop.DragAndDropTransferData;
import androidx.compose.p009ui.geometry.Offset;
import androidx.compose.p009ui.node.ModifierNodeElement;
import androidx.compose.p009ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m7879d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BD\u0012'\u0010\u0003\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b¢\u0006\u0002\u0010\u000eJ/\u0010\u0018\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\tHÆ\u0003¢\u0006\u0002\u0010\u0010J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bHÆ\u0003JQ\u0010\u001a\u001a\u00020\u00002)\b\u0002\u0010\u0003\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bHÆ\u0001¢\u0006\u0002\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u0002H\u0016J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001J\u0010\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u0002H\u0016J\f\u0010&\u001a\u00020\u0007*\u00020'H\u0016R=\u0010\u0003\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006("}, m7880d2 = {"Landroidx/compose/foundation/draganddrop/DragAndDropSourceWithDefaultShadowElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter;", "detectDragStart", "Lkotlin/Function2;", "Landroidx/compose/foundation/draganddrop/DragAndDropStartDetectorScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "transferData", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/draganddrop/DragAndDropTransferData;", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "getDetectDragStart", "()Lkotlin/jvm/functions/Function2;", "setDetectDragStart", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "getTransferData", "()Lkotlin/jvm/functions/Function1;", "setTransferData", "(Lkotlin/jvm/functions/Function1;)V", "component1", "component2", "copy", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/draganddrop/DragAndDropSourceWithDefaultShadowElement;", "create", "equals", "", "other", "hashCode", "", "toString", "", "update", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "foundation_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
/* loaded from: classes.dex */
final /* data */ class DragAndDropSourceWithDefaultShadowElement extends ModifierNodeElement<DragSourceNodeWithDefaultPainter> {
    private Function2<? super DragAndDropStartDetectorScope, ? super Continuation<? super Unit>, ? extends Object> detectDragStart;
    private Function1<? super Offset, DragAndDropTransferData> transferData;

    public DragAndDropSourceWithDefaultShadowElement(Function2<? super DragAndDropStartDetectorScope, ? super Continuation<? super Unit>, ? extends Object> function2, Function1<? super Offset, DragAndDropTransferData> function1) {
        this.detectDragStart = function2;
        this.transferData = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DragAndDropSourceWithDefaultShadowElement copy$default(DragAndDropSourceWithDefaultShadowElement dragAndDropSourceWithDefaultShadowElement, Function2 function2, Function1 function1, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            function2 = dragAndDropSourceWithDefaultShadowElement.detectDragStart;
        }
        if ((i6 & 2) != 0) {
            function1 = dragAndDropSourceWithDefaultShadowElement.transferData;
        }
        return dragAndDropSourceWithDefaultShadowElement.copy(function2, function1);
    }

    public final Function2<DragAndDropStartDetectorScope, Continuation<? super Unit>, Object> component1() {
        return this.detectDragStart;
    }

    public final Function1<Offset, DragAndDropTransferData> component2() {
        return this.transferData;
    }

    public final DragAndDropSourceWithDefaultShadowElement copy(Function2<? super DragAndDropStartDetectorScope, ? super Continuation<? super Unit>, ? extends Object> detectDragStart, Function1<? super Offset, DragAndDropTransferData> transferData) {
        return new DragAndDropSourceWithDefaultShadowElement(detectDragStart, transferData);
    }

    @Override // androidx.compose.p009ui.node.ModifierNodeElement
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DragAndDropSourceWithDefaultShadowElement)) {
            return false;
        }
        DragAndDropSourceWithDefaultShadowElement dragAndDropSourceWithDefaultShadowElement = (DragAndDropSourceWithDefaultShadowElement) other;
        return Intrinsics.areEqual(this.detectDragStart, dragAndDropSourceWithDefaultShadowElement.detectDragStart) && Intrinsics.areEqual(this.transferData, dragAndDropSourceWithDefaultShadowElement.transferData);
    }

    public final Function2<DragAndDropStartDetectorScope, Continuation<? super Unit>, Object> getDetectDragStart() {
        return this.detectDragStart;
    }

    public final Function1<Offset, DragAndDropTransferData> getTransferData() {
        return this.transferData;
    }

    @Override // androidx.compose.p009ui.node.ModifierNodeElement
    public int hashCode() {
        return (this.detectDragStart.hashCode() * 31) + this.transferData.hashCode();
    }

    @Override // androidx.compose.p009ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("dragSourceWithDefaultPainter");
        inspectorInfo.getProperties().set("detectDragStart", this.detectDragStart);
        inspectorInfo.getProperties().set("transferData", this.transferData);
    }

    public final void setDetectDragStart(Function2<? super DragAndDropStartDetectorScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        this.detectDragStart = function2;
    }

    public final void setTransferData(Function1<? super Offset, DragAndDropTransferData> function1) {
        this.transferData = function1;
    }

    public String toString() {
        return "DragAndDropSourceWithDefaultShadowElement(detectDragStart=" + this.detectDragStart + ", transferData=" + this.transferData + ')';
    }

    @Override // androidx.compose.p009ui.node.ModifierNodeElement
    /* renamed from: create */
    public DragSourceNodeWithDefaultPainter getNode() {
        return new DragSourceNodeWithDefaultPainter(this.detectDragStart, this.transferData);
    }

    @Override // androidx.compose.p009ui.node.ModifierNodeElement
    public void update(DragSourceNodeWithDefaultPainter node) {
        node.setDetectDragStart(this.detectDragStart);
        node.setTransferData(this.transferData);
    }
}
