package com.zykj.mistake.utils;

// RE note 本类字节码直接引用的读写或显示接口包括文件流、位图。

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"Lkotlinx/coroutines/v;", "", "kotlin.jvm.PlatformType", "<anonymous>", "(Lkotlinx/coroutines/v;)Ljava/lang/String;"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.mistake.utils.AskMaterialImageResolver$saveBitmap$2", m5303f = "AskMaterialImageResolver.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes3.dex */
final class AskMaterialImageResolver$saveBitmap$2 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ Bitmap $bitmap;
    final /* synthetic */ String $id;
    int label;
    final /* synthetic */ C5098c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AskMaterialImageResolver$saveBitmap$2(C5098c c5098c, String str, Bitmap bitmap, InterfaceC5631c<? super AskMaterialImageResolver$saveBitmap$2> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.this$0 = c5098c;
        this.$id = str;
        this.$bitmap = bitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new AskMaterialImageResolver$saveBitmap$2(this.this$0, this.$id, this.$bitmap, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC5774b.m5119b(obj);
        C5098c c5098c = this.this$0;
        String str = this.$id;
        c5098c.getClass();
        File fileM4447d = C5098c.m4447d(str, "jpg");
        FileOutputStream fileOutputStream = new FileOutputStream(fileM4447d);
        try {
            if (!this.$bitmap.compress(Bitmap.CompressFormat.JPEG, 92, fileOutputStream)) {
                throw new IllegalStateException("Save bitmap failed");
            }
            fileOutputStream.close();
            return fileM4447d.getAbsolutePath();
        } finally {
        }
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super String> interfaceC5631c) {
        return ((AskMaterialImageResolver$saveBitmap$2) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
