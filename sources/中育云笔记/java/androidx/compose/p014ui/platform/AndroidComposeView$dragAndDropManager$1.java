package androidx.compose.p014ui.platform;

import androidx.compose.p014ui.draganddrop.DragAndDropTransferData;
import androidx.compose.p014ui.geometry.Size;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9545q;

/* loaded from: classes2.dex */
public /* synthetic */ class AndroidComposeView$dragAndDropManager$1 extends FunctionReferenceImpl implements InterfaceC9545q {
    public AndroidComposeView$dragAndDropManager$1(Object obj) {
        super(3, obj, AndroidComposeView.class, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", 0);
    }

    @Override // p181hd.InterfaceC9545q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m32621invoke12SF9DM((DragAndDropTransferData) obj, ((Size) obj2).m30711unboximpl(), (InterfaceC9540l) obj3);
    }

    /* renamed from: invoke-12SF9DM, reason: not valid java name */
    public final Boolean m32621invoke12SF9DM(DragAndDropTransferData dragAndDropTransferData, long j10, InterfaceC9540l interfaceC9540l) {
        return Boolean.valueOf(((AndroidComposeView) this.receiver).m32619startDrag12SF9DM(dragAndDropTransferData, j10, interfaceC9540l));
    }
}
