package androidx.compose.p011ui.platform;

import androidx.compose.p011ui.draganddrop.DragAndDropTransferData;
import androidx.compose.p011ui.geometry.Size;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6474f;

@Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public /* synthetic */ class AndroidComposeView$dragAndDropManager$1 extends FunctionReferenceImpl implements InterfaceC6474f {
    public AndroidComposeView$dragAndDropManager$1(Object obj) {
        super(3, obj, AndroidComposeView.class, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", 0);
    }

    @Override // p152r6.InterfaceC6474f
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m12425invoke12SF9DM((DragAndDropTransferData) obj, ((Size) obj2).m10515unboximpl(), (InterfaceC6471c) obj3);
    }

    /* renamed from: invoke-12SF9DM, reason: not valid java name */
    public final Boolean m12425invoke12SF9DM(DragAndDropTransferData dragAndDropTransferData, long j7, InterfaceC6471c interfaceC6471c) {
        return Boolean.valueOf(((AndroidComposeView) this.receiver).m12423startDrag12SF9DM(dragAndDropTransferData, j7, interfaceC6471c));
    }
}
