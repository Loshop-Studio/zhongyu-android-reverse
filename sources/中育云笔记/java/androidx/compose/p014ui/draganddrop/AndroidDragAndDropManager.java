package androidx.compose.p014ui.draganddrop;

import android.view.DragEvent;
import android.view.View;
import androidx.collection.ArraySet;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import kotlin.jvm.internal.Ref$BooleanRef;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9545q;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class AndroidDragAndDropManager implements View.OnDragListener, DragAndDropManager {
    public static final int $stable = 8;
    private final InterfaceC9545q startDrag;
    private final DragAndDropNode rootDragAndDropNode = new DragAndDropNode(null, null, 3, null);
    private final ArraySet<DragAndDropTarget> interestedTargets = new ArraySet<>(0, 1, null);
    private final Modifier modifier = new ModifierNodeElement<DragAndDropNode>() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1
        @Override // androidx.compose.p014ui.node.ModifierNodeElement
        public boolean equals(Object obj) {
            return obj == this;
        }

        @Override // androidx.compose.p014ui.node.ModifierNodeElement
        public int hashCode() {
            return this.this$0.rootDragAndDropNode.hashCode();
        }

        @Override // androidx.compose.p014ui.node.ModifierNodeElement
        public void inspectableProperties(InspectorInfo inspectorInfo) {
            inspectorInfo.setName("RootDragAndDropNode");
        }

        @Override // androidx.compose.p014ui.node.ModifierNodeElement
        public void update(DragAndDropNode dragAndDropNode) {
        }

        @Override // androidx.compose.p014ui.node.ModifierNodeElement
        public DragAndDropNode create() {
            return this.this$0.rootDragAndDropNode;
        }
    };

    public AndroidDragAndDropManager(InterfaceC9545q interfaceC9545q) {
        this.startDrag = interfaceC9545q;
    }

    @Override // androidx.compose.p014ui.draganddrop.DragAndDropManager
    public Modifier getModifier() {
        return this.modifier;
    }

    @Override // androidx.compose.p014ui.draganddrop.DragAndDropManager
    public boolean isInterestedTarget(DragAndDropTarget dragAndDropTarget) {
        return this.interestedTargets.contains(dragAndDropTarget);
    }

    @Override // androidx.compose.p014ui.draganddrop.DragAndDropManager
    public boolean isRequestDragAndDropTransferRequired() {
        return true;
    }

    @Override // android.view.View.OnDragListener
    public boolean onDrag(View view, DragEvent dragEvent) {
        DragAndDropEvent dragAndDropEvent = new DragAndDropEvent(dragEvent);
        switch (dragEvent.getAction()) {
            case 1:
                boolean zAcceptDragAndDropTransfer = this.rootDragAndDropNode.acceptDragAndDropTransfer(dragAndDropEvent);
                Iterator<DragAndDropTarget> it = this.interestedTargets.iterator();
                while (it.hasNext()) {
                    it.next().onStarted(dragAndDropEvent);
                }
                break;
            case 2:
                this.rootDragAndDropNode.onMoved(dragAndDropEvent);
                break;
            case 4:
                this.rootDragAndDropNode.onEnded(dragAndDropEvent);
                this.interestedTargets.clear();
                break;
            case 5:
                this.rootDragAndDropNode.onEntered(dragAndDropEvent);
                break;
            case 6:
                this.rootDragAndDropNode.onExited(dragAndDropEvent);
                break;
        }
        return false;
    }

    @Override // androidx.compose.p014ui.draganddrop.DragAndDropManager
    public void registerTargetInterest(DragAndDropTarget dragAndDropTarget) {
        this.interestedTargets.add(dragAndDropTarget);
    }

    @Override // androidx.compose.p014ui.draganddrop.DragAndDropManager
    /* renamed from: requestDragAndDropTransfer-Uv8p0NA, reason: not valid java name */
    public void mo30465requestDragAndDropTransferUv8p0NA(DragAndDropNode dragAndDropNode, long j10) {
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        dragAndDropNode.m30471startDragAndDropTransferd4ec7I(new DragAndDropStartTransferScope() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$requestDragAndDropTransfer$dragAndDropSourceScope$1
            @Override // androidx.compose.p014ui.draganddrop.DragAndDropStartTransferScope
            /* renamed from: startDragAndDropTransfer-12SF9DM, reason: not valid java name */
            public boolean mo30466startDragAndDropTransfer12SF9DM(DragAndDropTransferData dragAndDropTransferData, long j11, InterfaceC9540l interfaceC9540l) {
                ref$BooleanRef.f23398c = ((Boolean) this.startDrag.invoke(dragAndDropTransferData, Size.m30694boximpl(j11), interfaceC9540l)).booleanValue();
                return ref$BooleanRef.f23398c;
            }
        }, j10, new InterfaceC9529a() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$requestDragAndDropTransfer$1$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final Boolean invoke() {
                return Boolean.valueOf(ref$BooleanRef.f23398c);
            }
        });
    }
}
