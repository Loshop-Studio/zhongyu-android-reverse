package com.zykj.mistake.feature.notebook.detail;

// RE note 本类字节码直接引用的读写或显示接口包括偏好设置。

import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "", "<anonymous>", "(Lkotlinx/coroutines/v;)Ljava/lang/String;"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$uploadDraftStroke$2", m5303f = "MistakeDetailNewViewModel.kt", m5304i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, m5305l = {578, 585}, m5306m = "invokeSuspend", m5307n = {"modulePath", "resPath", "fe", "nonce", "reqStr", "tokenReq", "userId", "ft", "fo", "ts", "modulePath", "resPath", "fe", "nonce", "reqStr", "tokenReq", "resp", "credential", "date", "objectKey", "userId", "ft", "fo", "ts"}, m5308s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "J$0", "I$0", "I$1", "J$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "J$0", "I$0", "I$1", "J$1"})
/* loaded from: classes3.dex */
final class MistakeDetailNewViewModel$uploadDraftStroke$2 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ File $strokeFile;
    int I$0;
    int I$1;
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ MistakeDetailNewViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MistakeDetailNewViewModel$uploadDraftStroke$2(MistakeDetailNewViewModel mistakeDetailNewViewModel, File file, InterfaceC5631c<? super MistakeDetailNewViewModel$uploadDraftStroke$2> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.this$0 = mistakeDetailNewViewModel;
        this.$strokeFile = file;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new MistakeDetailNewViewModel$uploadDraftStroke$2(this.this$0, this.$strokeFile, interfaceC5631c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x017a, code lost:
    
        if (r2 == r1) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$uploadDraftStroke$2.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2.smali:279
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super String> interfaceC5631c) {
        return ((MistakeDetailNewViewModel$uploadDraftStroke$2) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
