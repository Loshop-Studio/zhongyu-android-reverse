package coil3.decode;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p075h6.InterfaceC5631c;

@Metadata(m5111k = 3, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m5302c = "coil3.decode.BitmapFactoryDecoder", m5303f = "BitmapFactoryDecoder.kt", m5304i = {0, 1}, m5305l = {212, 40}, m5306m = "decode", m5307n = {"$this$withPermit$iv", "$this$withPermit$iv"}, m5308s = {"L$0", "L$0"})
/* loaded from: classes2.dex */
final class BitmapFactoryDecoder$decode$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C3263d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitmapFactoryDecoder$decode$1(C3263d c3263d, InterfaceC5631c<? super BitmapFactoryDecoder$decode$1> interfaceC5631c) {
        super(interfaceC5631c);
        this.this$0 = c3263d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo2191a(this);
    }
}
