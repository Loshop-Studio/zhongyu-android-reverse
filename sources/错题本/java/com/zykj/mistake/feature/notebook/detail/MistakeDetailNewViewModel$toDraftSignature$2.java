package com.zykj.mistake.feature.notebook.detail;

// RE note 本类字节码直接引用的读写或显示接口包括文件流。

import coil3.network.AbstractC3315g;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Lcom/zykj/mistake/feature/notebook/detail/d4;", "<anonymous>", "(Lkotlinx/coroutines/v;)Lcom/zykj/mistake/feature/notebook/detail/d4;"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$toDraftSignature$2", m5303f = "MistakeDetailNewViewModel.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes3.dex */
final class MistakeDetailNewViewModel$toDraftSignature$2 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ int $itemId;
    final /* synthetic */ File $this_toDraftSignature;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MistakeDetailNewViewModel$toDraftSignature$2(File file, int i, InterfaceC5631c<? super MistakeDetailNewViewModel$toDraftSignature$2> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$this_toDraftSignature = file;
        this.$itemId = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new MistakeDetailNewViewModel$toDraftSignature$2(this.$this_toDraftSignature, this.$itemId, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws NoSuchAlgorithmException, IOException {
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC5774b.m5119b(obj);
        if (!this.$this_toDraftSignature.isFile() || !this.$this_toDraftSignature.exists()) {
            return null;
        }
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        FileInputStream fileInputStream = new FileInputStream(this.$this_toDraftSignature);
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int i8 = fileInputStream.read(bArr);
                if (i8 <= 0) {
                    break;
                }
                messageDigest.update(bArr, 0, i8);
            }
            fileInputStream.close();
            int i9 = this.$itemId;
            long length = this.$this_toDraftSignature.length();
            byte[] bArrDigest = messageDigest.digest();
            AbstractC5830k.m5329f(bArrDigest, "digest(...)");
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "");
            int i10 = 0;
            for (byte b6 : bArrDigest) {
                i10++;
                if (i10 > 1) {
                    sb.append((CharSequence) "");
                }
                sb.append((CharSequence) String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b6)}, 1)));
            }
            sb.append((CharSequence) "");
            return new C4784d4(length, i9, sb.toString());
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3315g.m2237e(fileInputStream, th);
                throw th2;
            }
        }
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C4784d4> interfaceC5631c) {
        return ((MistakeDetailNewViewModel$toDraftSignature$2) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
