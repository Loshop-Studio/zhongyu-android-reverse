package androidx.compose.p009ui.platform;

import androidx.compose.p009ui.draganddrop.DragAndDropTransferData;
import androidx.compose.p009ui.geometry.Size;
import androidx.compose.p009ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(m7881k = 3, m7882mv = {1, 9, 0}, m7884xi = 48)
/* loaded from: classes2.dex */
public /* synthetic */ class AndroidComposeView$dragAndDropManager$1 extends FunctionReferenceImpl implements Function3<DragAndDropTransferData, Size, Function1<? super DrawScope, ? extends Unit>, Boolean> {
    public AndroidComposeView$dragAndDropManager$1(Object obj) {
        super(3, obj, AndroidComposeView.class, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Boolean invoke(DragAndDropTransferData dragAndDropTransferData, Size size, Function1<? super DrawScope, ? extends Unit> function1) {
        return m15620invoke12SF9DM(dragAndDropTransferData, size.m13732unboximpl(), function1);
    }

    /* renamed from: invoke-12SF9DM, reason: not valid java name */
    public final Boolean m15620invoke12SF9DM(DragAndDropTransferData dragAndDropTransferData, long j6, Function1<? super DrawScope, Unit> function1) {
        return Boolean.valueOf(((AndroidComposeView) this.receiver).m15618startDrag12SF9DM(dragAndDropTransferData, j6, function1));
    }
}
