package kotlinx.coroutines.flow;

import com.tencent.smtt.sdk.TbsListener;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "kotlinx.coroutines.flow.FlowKt__EmittersKt", m17801f = "Emitters.kt", m17802l = {TbsListener.ErrorCode.COPY_FAIL}, m17803m = "invokeSafely$FlowKt__EmittersKt")
/* loaded from: classes5.dex */
public final class FlowKt__EmittersKt$invokeSafely$1<T> extends ContinuationImpl {

    /* renamed from: a */
    public Object f17760a;

    /* renamed from: b */
    public /* synthetic */ Object f17761b;

    /* renamed from: c */
    public int f17762c;

    public FlowKt__EmittersKt$invokeSafely$1(InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f17761b = obj;
        this.f17762c |= Integer.MIN_VALUE;
        return FlowKt__EmittersKt.m16596c(null, null, null, this);
    }
}
