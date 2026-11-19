package coil3.intercept;

import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p075h6.InterfaceC5631c;

@Metadata(m5111k = 3, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m5302c = "coil3.intercept.EngineInterceptor", m5303f = "EngineInterceptor.kt", m5304i = {0, 0, 0, 0, 0, 0, 0, 0}, m5305l = {ComposerKt.providerValuesKey}, m5306m = "decode", m5307n = {"fetchResult", "components", "request", "mappedData", "options", "eventListener", "decoder", "searchIndex"}, m5308s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0"})
/* loaded from: classes2.dex */
final class EngineInterceptor$decode$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C3300b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$decode$1(C3300b c3300b, InterfaceC5631c<? super EngineInterceptor$decode$1> interfaceC5631c) {
        super(interfaceC5631c);
        this.this$0 = c3300b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C3300b.m2226a(this.this$0, null, null, null, null, null, null, this);
    }
}
