package com.zykj.mistake.utils;

import android.util.Log;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6009v;
import okhttp3.C6289c0;
import okhttp3.C6338z;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "", "<anonymous>", "(Lkotlinx/coroutines/v;)Z"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.mistake.utils.UploadUtils$gridFsUpload$2", m5303f = "UploadUtils.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes3.dex */
final class UploadUtils$gridFsUpload$2 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ C6289c0 $request;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadUtils$gridFsUpload$2(C6289c0 c6289c0, InterfaceC5631c<? super UploadUtils$gridFsUpload$2> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$request = c6289c0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        UploadUtils$gridFsUpload$2 uploadUtils$gridFsUpload$2 = new UploadUtils$gridFsUpload$2(this.$request, interfaceC5631c);
        uploadUtils$gridFsUpload$2.L$0 = obj;
        return uploadUtils$gridFsUpload$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM13956constructorimpl;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC5774b.m5119b(obj);
        try {
            objM13956constructorimpl = Result.m13956constructorimpl(new C6338z().m5983c(this.$request).m5914h());
        } catch (Throwable th) {
            objM13956constructorimpl = Result.m13956constructorimpl(AbstractC5774b.m5118a(th));
        }
        Throwable thM13959exceptionOrNullimpl = Result.m13959exceptionOrNullimpl(objM13956constructorimpl);
        if (thM13959exceptionOrNullimpl != null) {
            String message = thM13959exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "";
            }
            Log.i("UploadDataWork", message);
        }
        return Boolean.valueOf(Result.m13962isSuccessimpl(objM13956constructorimpl));
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super Boolean> interfaceC5631c) {
        return ((UploadUtils$gridFsUpload$2) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
