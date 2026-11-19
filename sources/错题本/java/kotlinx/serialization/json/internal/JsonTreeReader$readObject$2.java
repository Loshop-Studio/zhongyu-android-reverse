package kotlinx.serialization.json.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p075h6.InterfaceC5631c;

@Metadata(m5111k = 3, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m5302c = "kotlinx.serialization.json.internal.JsonTreeReader", m5303f = "JsonTreeReader.kt", m5304i = {0, 0, 0, 0}, m5305l = {24}, m5306m = "readObject", m5307n = {"$this$readObject", "this_$iv", "result$iv", "key$iv"}, m5308s = {"L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes4.dex */
final class JsonTreeReader$readObject$2 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C6036q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeReader$readObject$2(C6036q c6036q, InterfaceC5631c<? super JsonTreeReader$readObject$2> interfaceC5631c) {
        super(interfaceC5631c);
        this.this$0 = c6036q;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C6036q.m5701a(this.this$0, null, this);
    }
}
