package androidx.compose.foundation.text.input.internal;

import android.content.ClipDescription;
import android.view.DragEvent;
import androidx.compose.foundation.content.MediaType;
import androidx.compose.p013ui.draganddrop.DragAndDropEvent;
import androidx.compose.p013ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.p013ui.draganddrop.DragAndDropTarget;
import androidx.compose.p013ui.draganddrop.DragAndDropTargetModifierNode;
import androidx.compose.p013ui.draganddrop.DragAndDrop_androidKt;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.platform.AndroidClipboardManager_androidKt;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes.dex */
public final class TextFieldDragAndDropNode_androidKt {
    public static final DragAndDropTargetModifierNode textFieldDragAndDropNode(final InterfaceC10559a interfaceC10559a, final InterfaceC10574p interfaceC10574p, final InterfaceC10570l interfaceC10570l, final InterfaceC10570l interfaceC10570l2, final InterfaceC10570l interfaceC10570l3, final InterfaceC10570l interfaceC10570l4, final InterfaceC10570l interfaceC10570l5, final InterfaceC10570l interfaceC10570l6, final InterfaceC10570l interfaceC10570l7) {
        return DragAndDropNodeKt.DragAndDropTargetModifierNode(new InterfaceC10570l() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDragAndDropNode_androidKt.textFieldDragAndDropNode.1
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public final Boolean invoke(DragAndDropEvent dragAndDropEvent) {
                ClipDescription clipDescription = DragAndDrop_androidKt.toAndroidDragEvent(dragAndDropEvent).getClipDescription();
                Iterable<MediaType> iterable = (Iterable) interfaceC10559a.invoke();
                boolean z10 = false;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    for (MediaType mediaType : iterable) {
                        if (AbstractC9133u.m16128b(mediaType, MediaType.Companion.getAll()) || clipDescription.hasMimeType(mediaType.getRepresentation())) {
                            z10 = true;
                            break;
                        }
                    }
                }
                return Boolean.valueOf(z10);
            }
        }, new DragAndDropTarget() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDragAndDropNode_androidKt.textFieldDragAndDropNode.2
            @Override // androidx.compose.p013ui.draganddrop.DragAndDropTarget
            public void onChanged(DragAndDropEvent dragAndDropEvent) {
                InterfaceC10570l interfaceC10570l8 = interfaceC10570l5;
                if (interfaceC10570l8 != null) {
                    interfaceC10570l8.invoke(dragAndDropEvent);
                    C8736p c8736p = C8736p.f16368a;
                }
            }

            @Override // androidx.compose.p013ui.draganddrop.DragAndDropTarget
            public boolean onDrop(DragAndDropEvent dragAndDropEvent) {
                interfaceC10570l.invoke(dragAndDropEvent);
                return ((Boolean) interfaceC10574p.invoke(AndroidClipboardManager_androidKt.toClipEntry(DragAndDrop_androidKt.toAndroidDragEvent(dragAndDropEvent).getClipData()), AndroidClipboardManager_androidKt.toClipMetadata(DragAndDrop_androidKt.toAndroidDragEvent(dragAndDropEvent).getClipDescription()))).booleanValue();
            }

            @Override // androidx.compose.p013ui.draganddrop.DragAndDropTarget
            public void onEnded(DragAndDropEvent dragAndDropEvent) {
                InterfaceC10570l interfaceC10570l8 = interfaceC10570l7;
                if (interfaceC10570l8 != null) {
                    interfaceC10570l8.invoke(dragAndDropEvent);
                    C8736p c8736p = C8736p.f16368a;
                }
            }

            @Override // androidx.compose.p013ui.draganddrop.DragAndDropTarget
            public void onEntered(DragAndDropEvent dragAndDropEvent) {
                InterfaceC10570l interfaceC10570l8 = interfaceC10570l3;
                if (interfaceC10570l8 != null) {
                    interfaceC10570l8.invoke(dragAndDropEvent);
                    C8736p c8736p = C8736p.f16368a;
                }
            }

            @Override // androidx.compose.p013ui.draganddrop.DragAndDropTarget
            public void onExited(DragAndDropEvent dragAndDropEvent) {
                InterfaceC10570l interfaceC10570l8 = interfaceC10570l6;
                if (interfaceC10570l8 != null) {
                    interfaceC10570l8.invoke(dragAndDropEvent);
                    C8736p c8736p = C8736p.f16368a;
                }
            }

            @Override // androidx.compose.p013ui.draganddrop.DragAndDropTarget
            public void onMoved(DragAndDropEvent dragAndDropEvent) {
                DragEvent androidDragEvent = DragAndDrop_androidKt.toAndroidDragEvent(dragAndDropEvent);
                InterfaceC10570l interfaceC10570l8 = interfaceC10570l4;
                if (interfaceC10570l8 != null) {
                    float x10 = androidDragEvent.getX();
                    float y10 = androidDragEvent.getY();
                    interfaceC10570l8.invoke(Offset.m24024boximpl(Offset.m24027constructorimpl((Float.floatToRawIntBits(x10) << 32) | (Float.floatToRawIntBits(y10) & 4294967295L))));
                    C8736p c8736p = C8736p.f16368a;
                }
            }

            @Override // androidx.compose.p013ui.draganddrop.DragAndDropTarget
            public void onStarted(DragAndDropEvent dragAndDropEvent) {
                InterfaceC10570l interfaceC10570l8 = interfaceC10570l2;
                if (interfaceC10570l8 != null) {
                    interfaceC10570l8.invoke(dragAndDropEvent);
                    C8736p c8736p = C8736p.f16368a;
                }
            }
        });
    }

    public static /* synthetic */ DragAndDropTargetModifierNode textFieldDragAndDropNode$default(InterfaceC10559a interfaceC10559a, InterfaceC10574p interfaceC10574p, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2, InterfaceC10570l interfaceC10570l3, InterfaceC10570l interfaceC10570l4, InterfaceC10570l interfaceC10570l5, InterfaceC10570l interfaceC10570l6, InterfaceC10570l interfaceC10570l7, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            interfaceC10570l2 = null;
        }
        if ((i10 & 16) != 0) {
            interfaceC10570l3 = null;
        }
        if ((i10 & 32) != 0) {
            interfaceC10570l4 = null;
        }
        if ((i10 & 64) != 0) {
            interfaceC10570l5 = null;
        }
        if ((i10 & 128) != 0) {
            interfaceC10570l6 = null;
        }
        if ((i10 & 256) != 0) {
            interfaceC10570l7 = null;
        }
        return textFieldDragAndDropNode(interfaceC10559a, interfaceC10574p, interfaceC10570l, interfaceC10570l2, interfaceC10570l3, interfaceC10570l4, interfaceC10570l5, interfaceC10570l6, interfaceC10570l7);
    }
}
