package androidx.compose.foundation.text.input.internal;

import android.content.ClipDescription;
import android.view.DragEvent;
import androidx.autofill.HintConstants;
import androidx.compose.foundation.content.MediaType;
import androidx.compose.p011ui.draganddrop.DragAndDropEvent;
import androidx.compose.p011ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.p011ui.draganddrop.DragAndDropTarget;
import androidx.compose.p011ui.draganddrop.DragAndDropTargetModifierNode;
import androidx.compose.p011ui.draganddrop.DragAndDrop_androidKt;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.platform.AndroidClipboardManager_androidKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aÙ\u0002\u0010\u001b\u001a\u00020\u001a2\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u000026\u0010\f\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u00042\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2%\b\u0002\u0010\u0012\u001a\u001f\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r2%\b\u0002\u0010\u0013\u001a\u001f\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r2%\b\u0002\u0010\u0016\u001a\u001f\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r2%\b\u0002\u0010\u0017\u001a\u001f\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r2%\b\u0002\u0010\u0018\u001a\u001f\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r2%\b\u0002\u0010\u0019\u001a\u001f\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rH\u0000¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m5110d2 = {"Lkotlin/Function0;", "", "Landroidx/compose/foundation/content/MediaType;", "hintMediaTypes", "Lkotlin/Function2;", "Landroidx/compose/ui/platform/ClipEntry;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "clipEntry", "Landroidx/compose/ui/platform/ClipMetadata;", "clipMetadata", "", "onDrop", "Lkotlin/Function1;", "Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "Ld6/s;", "dragAndDropRequestPermission", NotificationCompat.CATEGORY_EVENT, "onStarted", "onEntered", "Landroidx/compose/ui/geometry/Offset;", RequestParameters.POSITION, "onMoved", "onChanged", "onExited", "onEnded", "Landroidx/compose/ui/draganddrop/DragAndDropTargetModifierNode;", "textFieldDragAndDropNode", "(Lr6/a;Lr6/e;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;)Landroidx/compose/ui/draganddrop/DragAndDropTargetModifierNode;", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class TextFieldDragAndDropNode_androidKt {
    @NotNull
    public static final DragAndDropTargetModifierNode textFieldDragAndDropNode(@NotNull final InterfaceC6469a interfaceC6469a, @NotNull final InterfaceC6473e interfaceC6473e, @NotNull final InterfaceC6471c interfaceC6471c, @Nullable final InterfaceC6471c interfaceC6471c2, @Nullable final InterfaceC6471c interfaceC6471c3, @Nullable final InterfaceC6471c interfaceC6471c4, @Nullable final InterfaceC6471c interfaceC6471c5, @Nullable final InterfaceC6471c interfaceC6471c6, @Nullable final InterfaceC6471c interfaceC6471c7) {
        return DragAndDropNodeKt.DragAndDropTargetModifierNode(new InterfaceC6471c() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDragAndDropNode_androidKt.textFieldDragAndDropNode.1
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public final Boolean invoke(DragAndDropEvent dragAndDropEvent) {
                ClipDescription clipDescription = DragAndDrop_androidKt.toAndroidDragEvent(dragAndDropEvent).getClipDescription();
                Iterable<MediaType> iterable = (Iterable) interfaceC6469a.invoke();
                boolean z8 = false;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    for (MediaType mediaType : iterable) {
                        if (AbstractC5830k.m5325b(mediaType, MediaType.INSTANCE.getAll()) || clipDescription.hasMimeType(mediaType.getRepresentation())) {
                            z8 = true;
                            break;
                        }
                    }
                }
                return Boolean.valueOf(z8);
            }
        }, new DragAndDropTarget() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDragAndDropNode_androidKt.textFieldDragAndDropNode.2
            @Override // androidx.compose.p011ui.draganddrop.DragAndDropTarget
            public void onChanged(DragAndDropEvent event) {
                InterfaceC6471c interfaceC6471c8 = interfaceC6471c5;
                if (interfaceC6471c8 != null) {
                    interfaceC6471c8.invoke(event);
                }
            }

            @Override // androidx.compose.p011ui.draganddrop.DragAndDropTarget
            public boolean onDrop(DragAndDropEvent event) {
                interfaceC6471c.invoke(event);
                return ((Boolean) interfaceC6473e.invoke(AndroidClipboardManager_androidKt.toClipEntry(DragAndDrop_androidKt.toAndroidDragEvent(event).getClipData()), AndroidClipboardManager_androidKt.toClipMetadata(DragAndDrop_androidKt.toAndroidDragEvent(event).getClipDescription()))).booleanValue();
            }

            @Override // androidx.compose.p011ui.draganddrop.DragAndDropTarget
            public void onEnded(DragAndDropEvent event) {
                InterfaceC6471c interfaceC6471c8 = interfaceC6471c7;
                if (interfaceC6471c8 != null) {
                    interfaceC6471c8.invoke(event);
                }
            }

            @Override // androidx.compose.p011ui.draganddrop.DragAndDropTarget
            public void onEntered(DragAndDropEvent event) {
                InterfaceC6471c interfaceC6471c8 = interfaceC6471c3;
                if (interfaceC6471c8 != null) {
                    interfaceC6471c8.invoke(event);
                }
            }

            @Override // androidx.compose.p011ui.draganddrop.DragAndDropTarget
            public void onExited(DragAndDropEvent event) {
                InterfaceC6471c interfaceC6471c8 = interfaceC6471c6;
                if (interfaceC6471c8 != null) {
                    interfaceC6471c8.invoke(event);
                }
            }

            @Override // androidx.compose.p011ui.draganddrop.DragAndDropTarget
            public void onMoved(DragAndDropEvent event) {
                DragEvent androidDragEvent = DragAndDrop_androidKt.toAndroidDragEvent(event);
                InterfaceC6471c interfaceC6471c8 = interfaceC6471c4;
                if (interfaceC6471c8 != null) {
                    float x3 = androidDragEvent.getX();
                    float y2 = androidDragEvent.getY();
                    interfaceC6471c8.invoke(Offset.m10430boximpl(Offset.m10433constructorimpl((Float.floatToRawIntBits(x3) << 32) | (Float.floatToRawIntBits(y2) & 4294967295L))));
                }
            }

            @Override // androidx.compose.p011ui.draganddrop.DragAndDropTarget
            public void onStarted(DragAndDropEvent event) {
                InterfaceC6471c interfaceC6471c8 = interfaceC6471c2;
                if (interfaceC6471c8 != null) {
                    interfaceC6471c8.invoke(event);
                }
            }
        });
    }

    public static /* synthetic */ DragAndDropTargetModifierNode textFieldDragAndDropNode$default(InterfaceC6469a interfaceC6469a, InterfaceC6473e interfaceC6473e, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, InterfaceC6471c interfaceC6471c3, InterfaceC6471c interfaceC6471c4, InterfaceC6471c interfaceC6471c5, InterfaceC6471c interfaceC6471c6, InterfaceC6471c interfaceC6471c7, int i, Object obj) {
        if ((i & 8) != 0) {
            interfaceC6471c2 = null;
        }
        if ((i & 16) != 0) {
            interfaceC6471c3 = null;
        }
        if ((i & 32) != 0) {
            interfaceC6471c4 = null;
        }
        if ((i & 64) != 0) {
            interfaceC6471c5 = null;
        }
        if ((i & 128) != 0) {
            interfaceC6471c6 = null;
        }
        if ((i & 256) != 0) {
            interfaceC6471c7 = null;
        }
        return textFieldDragAndDropNode(interfaceC6469a, interfaceC6473e, interfaceC6471c, interfaceC6471c2, interfaceC6471c3, interfaceC6471c4, interfaceC6471c5, interfaceC6471c6, interfaceC6471c7);
    }
}
