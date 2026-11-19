package androidx.compose.p013ui.platform;

import androidx.compose.p013ui.draganddrop.DragAndDropTransferData;
import androidx.compose.p013ui.geometry.Size;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10575q;

/* loaded from: classes2.dex */
public /* synthetic */ class AndroidComposeView$dragAndDropManager$1 extends FunctionReferenceImpl implements InterfaceC10575q {
    public AndroidComposeView$dragAndDropManager$1(Object obj) {
        super(3, obj, AndroidComposeView.class, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", 0);
    }

    @Override // p300x7.InterfaceC10575q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m26019invoke12SF9DM((DragAndDropTransferData) obj, ((Size) obj2).m24109unboximpl(), (InterfaceC10570l) obj3);
    }

    /* renamed from: invoke-12SF9DM, reason: not valid java name */
    public final Boolean m26019invoke12SF9DM(DragAndDropTransferData dragAndDropTransferData, long j10, InterfaceC10570l interfaceC10570l) {
        return Boolean.valueOf(((AndroidComposeView) this.receiver).m26017startDrag12SF9DM(dragAndDropTransferData, j10, interfaceC10570l));
    }
}
