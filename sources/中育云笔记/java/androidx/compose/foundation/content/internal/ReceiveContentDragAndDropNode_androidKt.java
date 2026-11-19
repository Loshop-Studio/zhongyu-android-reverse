package androidx.compose.foundation.content.internal;

import android.view.DragEvent;
import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.p014ui.draganddrop.DragAndDropEvent;
import androidx.compose.p014ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.p014ui.draganddrop.DragAndDropTarget;
import androidx.compose.p014ui.draganddrop.DragAndDropTargetModifierNode;
import androidx.compose.p014ui.draganddrop.DragAndDrop_androidKt;
import androidx.compose.p014ui.platform.AndroidClipboardManager_androidKt;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
public final class ReceiveContentDragAndDropNode_androidKt {
    public static final DragAndDropTargetModifierNode ReceiveContentDragAndDropNode(final ReceiveContentConfiguration receiveContentConfiguration, final InterfaceC9540l interfaceC9540l) {
        return DragAndDropNodeKt.DragAndDropTargetModifierNode(new InterfaceC9540l() { // from class: androidx.compose.foundation.content.internal.ReceiveContentDragAndDropNode_androidKt.ReceiveContentDragAndDropNode.1
            @Override // p181hd.InterfaceC9540l
            public final Boolean invoke(DragAndDropEvent dragAndDropEvent) {
                return Boolean.TRUE;
            }
        }, new DragAndDropTarget() { // from class: androidx.compose.foundation.content.internal.ReceiveContentDragAndDropNode_androidKt.ReceiveContentDragAndDropNode.2
            @Override // androidx.compose.p014ui.draganddrop.DragAndDropTarget
            public boolean onDrop(DragAndDropEvent dragAndDropEvent) {
                interfaceC9540l.invoke(dragAndDropEvent);
                TransferableContent transferableContent = ReceiveContentDragAndDropNode_androidKt.toTransferableContent(dragAndDropEvent);
                return !AbstractC9979u.m20289b(transferableContent, receiveContentConfiguration.getReceiveContentListener().onReceive(transferableContent));
            }

            @Override // androidx.compose.p014ui.draganddrop.DragAndDropTarget
            public void onEnded(DragAndDropEvent dragAndDropEvent) {
                receiveContentConfiguration.getReceiveContentListener().onDragEnd();
            }

            @Override // androidx.compose.p014ui.draganddrop.DragAndDropTarget
            public void onEntered(DragAndDropEvent dragAndDropEvent) {
                receiveContentConfiguration.getReceiveContentListener().onDragEnter();
            }

            @Override // androidx.compose.p014ui.draganddrop.DragAndDropTarget
            public void onExited(DragAndDropEvent dragAndDropEvent) {
                receiveContentConfiguration.getReceiveContentListener().onDragExit();
            }

            @Override // androidx.compose.p014ui.draganddrop.DragAndDropTarget
            public void onStarted(DragAndDropEvent dragAndDropEvent) {
                receiveContentConfiguration.getReceiveContentListener().onDragStart();
            }
        });
    }

    public static final TransferableContent toTransferableContent(DragAndDropEvent dragAndDropEvent) {
        DragEvent androidDragEvent = DragAndDrop_androidKt.toAndroidDragEvent(dragAndDropEvent);
        return new TransferableContent(AndroidClipboardManager_androidKt.toClipEntry(androidDragEvent.getClipData()), AndroidClipboardManager_androidKt.toClipMetadata(androidDragEvent.getClipDescription()), TransferableContent.Source.Companion.m27057getDragAndDropkB6V9T0(), null, 8, null);
    }
}
