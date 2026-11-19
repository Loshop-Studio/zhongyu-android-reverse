package androidx.compose.foundation.content.internal;

import android.view.DragEvent;
import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.p011ui.draganddrop.DragAndDropEvent;
import androidx.compose.p011ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.p011ui.draganddrop.DragAndDropTarget;
import androidx.compose.p011ui.draganddrop.DragAndDropTargetModifierNode;
import androidx.compose.p011ui.draganddrop.DragAndDrop_androidKt;
import androidx.compose.p011ui.platform.AndroidClipboardManager_androidKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0003H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m5110d2 = {"Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;", "receiveContentConfiguration", "Lkotlin/Function1;", "Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "Ld6/s;", "dragAndDropRequestPermission", "Landroidx/compose/ui/draganddrop/DragAndDropTargetModifierNode;", "ReceiveContentDragAndDropNode", "(Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;Lr6/c;)Landroidx/compose/ui/draganddrop/DragAndDropTargetModifierNode;", "Landroidx/compose/foundation/content/TransferableContent;", "toTransferableContent", "(Landroidx/compose/ui/draganddrop/DragAndDropEvent;)Landroidx/compose/foundation/content/TransferableContent;", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ReceiveContentDragAndDropNode_androidKt {
    @NotNull
    public static final DragAndDropTargetModifierNode ReceiveContentDragAndDropNode(@NotNull final ReceiveContentConfiguration receiveContentConfiguration, @NotNull final InterfaceC6471c interfaceC6471c) {
        return DragAndDropNodeKt.DragAndDropTargetModifierNode(new InterfaceC6471c() { // from class: androidx.compose.foundation.content.internal.ReceiveContentDragAndDropNode_androidKt.ReceiveContentDragAndDropNode.1
            @Override // p152r6.InterfaceC6471c
            public final Boolean invoke(DragAndDropEvent dragAndDropEvent) {
                return Boolean.TRUE;
            }
        }, new DragAndDropTarget() { // from class: androidx.compose.foundation.content.internal.ReceiveContentDragAndDropNode_androidKt.ReceiveContentDragAndDropNode.2
            @Override // androidx.compose.p011ui.draganddrop.DragAndDropTarget
            public boolean onDrop(DragAndDropEvent event) {
                interfaceC6471c.invoke(event);
                TransferableContent transferableContent = ReceiveContentDragAndDropNode_androidKt.toTransferableContent(event);
                return !AbstractC5830k.m5325b(transferableContent, receiveContentConfiguration.getReceiveContentListener().onReceive(transferableContent));
            }

            @Override // androidx.compose.p011ui.draganddrop.DragAndDropTarget
            public void onEnded(DragAndDropEvent event) {
                receiveContentConfiguration.getReceiveContentListener().onDragEnd();
            }

            @Override // androidx.compose.p011ui.draganddrop.DragAndDropTarget
            public void onEntered(DragAndDropEvent event) {
                receiveContentConfiguration.getReceiveContentListener().onDragEnter();
            }

            @Override // androidx.compose.p011ui.draganddrop.DragAndDropTarget
            public void onExited(DragAndDropEvent event) {
                receiveContentConfiguration.getReceiveContentListener().onDragExit();
            }

            @Override // androidx.compose.p011ui.draganddrop.DragAndDropTarget
            public void onStarted(DragAndDropEvent event) {
                receiveContentConfiguration.getReceiveContentListener().onDragStart();
            }
        });
    }

    @NotNull
    public static final TransferableContent toTransferableContent(@NotNull DragAndDropEvent dragAndDropEvent) {
        DragEvent androidDragEvent = DragAndDrop_androidKt.toAndroidDragEvent(dragAndDropEvent);
        return new TransferableContent(AndroidClipboardManager_androidKt.toClipEntry(androidDragEvent.getClipData()), AndroidClipboardManager_androidKt.toClipMetadata(androidDragEvent.getClipDescription()), TransferableContent.Source.INSTANCE.m6861getDragAndDropkB6V9T0(), null, 8, null);
    }
}
