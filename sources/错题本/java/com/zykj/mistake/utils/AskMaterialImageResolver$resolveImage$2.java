package com.zykj.mistake.utils;

import java.io.File;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.AbstractC5855p;
import kotlin.text.AbstractC5862w;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "", "<anonymous>", "(Lkotlinx/coroutines/v;)Ljava/lang/String;"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.mistake.utils.AskMaterialImageResolver$resolveImage$2", m5303f = "AskMaterialImageResolver.kt", m5304i = {}, m5305l = {42}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes3.dex */
final class AskMaterialImageResolver$resolveImage$2 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ String $id;
    final /* synthetic */ String $source;
    int label;
    final /* synthetic */ C5098c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AskMaterialImageResolver$resolveImage$2(String str, C5098c c5098c, String str2, InterfaceC5631c<? super AskMaterialImageResolver$resolveImage$2> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$source = str;
        this.this$0 = c5098c;
        this.$id = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new AskMaterialImageResolver$resolveImage$2(this.$source, this.this$0, this.$id, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            if (!AbstractC5862w.m5409C(this.$source, "http://", false) && !AbstractC5862w.m5409C(this.$source, "https://", false)) {
                if (AbstractC5862w.m5409C(this.$source, "file://", false)) {
                    return C5098c.m4445a(this.this$0, new File(AbstractC5855p.m5388V(this.$source, "file://")), this.$id);
                }
                if (new File(this.$source).exists()) {
                    return C5098c.m4445a(this.this$0, new File(this.$source), this.$id);
                }
                throw new IllegalStateException("Unsupported image source");
            }
            C5098c c5098c = this.this$0;
            String str = this.$source;
            String str2 = this.$id;
            this.label = 1;
            obj = C5098c.m4446b(c5098c, str, str2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
        }
        return (String) obj;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super String> interfaceC5631c) {
        return ((AskMaterialImageResolver$resolveImage$2) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
