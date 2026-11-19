package androidx.compose.foundation.text.input.internal;

import android.content.ClipDescription;
import android.view.DragEvent;
import androidx.compose.foundation.content.MediaType;
import androidx.compose.p014ui.draganddrop.DragAndDropEvent;
import androidx.compose.p014ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.p014ui.draganddrop.DragAndDropTarget;
import androidx.compose.p014ui.draganddrop.DragAndDropTargetModifierNode;
import androidx.compose.p014ui.draganddrop.DragAndDrop_androidKt;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.platform.AndroidClipboardManager_androidKt;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;

/* loaded from: classes.dex */
public final class TextFieldDragAndDropNode_androidKt {
    public static final DragAndDropTargetModifierNode textFieldDragAndDropNode(final InterfaceC9529a interfaceC9529a, final InterfaceC9544p interfaceC9544p, final InterfaceC9540l interfaceC9540l, final InterfaceC9540l interfaceC9540l2, final InterfaceC9540l interfaceC9540l3, final InterfaceC9540l interfaceC9540l4, final InterfaceC9540l interfaceC9540l5, final InterfaceC9540l interfaceC9540l6, final InterfaceC9540l interfaceC9540l7) {
        return DragAndDropNodeKt.DragAndDropTargetModifierNode(new InterfaceC9540l() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDragAndDropNode_androidKt.textFieldDragAndDropNode.1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public final Boolean invoke(DragAndDropEvent dragAndDropEvent) {
                ClipDescription clipDescription = DragAndDrop_androidKt.toAndroidDragEvent(dragAndDropEvent).getClipDescription();
                Iterable<MediaType> iterable = (Iterable) interfaceC9529a.invoke();
                boolean z10 = false;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    for (MediaType mediaType : iterable) {
                        if (AbstractC9979u.m20289b(mediaType, MediaType.Companion.getAll()) || clipDescription.hasMimeType(mediaType.getRepresentation())) {
                            z10 = true;
                            break;
                        }
                    }
                }
                return Boolean.valueOf(z10);
            }
        }, new DragAndDropTarget() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDragAndDropNode_androidKt.textFieldDragAndDropNode.2
            @Override // androidx.compose.p014ui.draganddrop.DragAndDropTarget
            public void onChanged(DragAndDropEvent dragAndDropEvent) {
                InterfaceC9540l interfaceC9540l8 = interfaceC9540l5;
                if (interfaceC9540l8 != null) {
                    interfaceC9540l8.invoke(dragAndDropEvent);
                    C10786q c10786q = C10786q.f26013a;
                }
            }

            @Override // androidx.compose.p014ui.draganddrop.DragAndDropTarget
            public boolean onDrop(DragAndDropEvent dragAndDropEvent) {
                interfaceC9540l.invoke(dragAndDropEvent);
                return ((Boolean) interfaceC9544p.invoke(AndroidClipboardManager_androidKt.toClipEntry(DragAndDrop_androidKt.toAndroidDragEvent(dragAndDropEvent).getClipData()), AndroidClipboardManager_androidKt.toClipMetadata(DragAndDrop_androidKt.toAndroidDragEvent(dragAndDropEvent).getClipDescription()))).booleanValue();
            }

            @Override // androidx.compose.p014ui.draganddrop.DragAndDropTarget
            public void onEnded(DragAndDropEvent dragAndDropEvent) {
                InterfaceC9540l interfaceC9540l8 = interfaceC9540l7;
                if (interfaceC9540l8 != null) {
                    interfaceC9540l8.invoke(dragAndDropEvent);
                    C10786q c10786q = C10786q.f26013a;
                }
            }

            @Override // androidx.compose.p014ui.draganddrop.DragAndDropTarget
            public void onEntered(DragAndDropEvent dragAndDropEvent) {
                InterfaceC9540l interfaceC9540l8 = interfaceC9540l3;
                if (interfaceC9540l8 != null) {
                    interfaceC9540l8.invoke(dragAndDropEvent);
                    C10786q c10786q = C10786q.f26013a;
                }
            }

            @Override // androidx.compose.p014ui.draganddrop.DragAndDropTarget
            public void onExited(DragAndDropEvent dragAndDropEvent) {
                InterfaceC9540l interfaceC9540l8 = interfaceC9540l6;
                if (interfaceC9540l8 != null) {
                    interfaceC9540l8.invoke(dragAndDropEvent);
                    C10786q c10786q = C10786q.f26013a;
                }
            }

            @Override // androidx.compose.p014ui.draganddrop.DragAndDropTarget
            public void onMoved(DragAndDropEvent dragAndDropEvent) {
                DragEvent androidDragEvent = DragAndDrop_androidKt.toAndroidDragEvent(dragAndDropEvent);
                InterfaceC9540l interfaceC9540l8 = interfaceC9540l4;
                if (interfaceC9540l8 != null) {
                    float x10 = androidDragEvent.getX();
                    float y10 = androidDragEvent.getY();
                    interfaceC9540l8.invoke(Offset.m30626boximpl(Offset.m30629constructorimpl((Float.floatToRawIntBits(x10) << 32) | (Float.floatToRawIntBits(y10) & 4294967295L))));
                    C10786q c10786q = C10786q.f26013a;
                }
            }

            @Override // androidx.compose.p014ui.draganddrop.DragAndDropTarget
            public void onStarted(DragAndDropEvent dragAndDropEvent) {
                InterfaceC9540l interfaceC9540l8 = interfaceC9540l2;
                if (interfaceC9540l8 != null) {
                    interfaceC9540l8.invoke(dragAndDropEvent);
                    C10786q c10786q = C10786q.f26013a;
                }
            }
        });
    }

    public static /* synthetic */ DragAndDropTargetModifierNode textFieldDragAndDropNode$default(InterfaceC9529a interfaceC9529a, InterfaceC9544p interfaceC9544p, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3, InterfaceC9540l interfaceC9540l4, InterfaceC9540l interfaceC9540l5, InterfaceC9540l interfaceC9540l6, InterfaceC9540l interfaceC9540l7, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            interfaceC9540l2 = null;
        }
        if ((i10 & 16) != 0) {
            interfaceC9540l3 = null;
        }
        if ((i10 & 32) != 0) {
            interfaceC9540l4 = null;
        }
        if ((i10 & 64) != 0) {
            interfaceC9540l5 = null;
        }
        if ((i10 & 128) != 0) {
            interfaceC9540l6 = null;
        }
        if ((i10 & 256) != 0) {
            interfaceC9540l7 = null;
        }
        return textFieldDragAndDropNode(interfaceC9529a, interfaceC9544p, interfaceC9540l, interfaceC9540l2, interfaceC9540l3, interfaceC9540l4, interfaceC9540l5, interfaceC9540l6, interfaceC9540l7);
    }
}
