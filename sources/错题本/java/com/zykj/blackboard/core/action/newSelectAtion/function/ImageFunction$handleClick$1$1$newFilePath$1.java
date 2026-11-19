package com.zykj.blackboard.core.action.newSelectAtion.function;

import com.zykj.blackboard.utils.FileUtils;
import java.io.File;
import java.util.UUID;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5855p;
import kotlinx.coroutines.InterfaceC6009v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"Lkotlinx/coroutines/v;", "", "kotlin.jvm.PlatformType", "<anonymous>", "(Lkotlinx/coroutines/v;)Ljava/lang/String;"}, m5111k = 3, m5112mv = {1, 7, 1})
@DebugMetadata(m5302c = "com.zykj.blackboard.core.action.newSelectAtion.function.ImageFunction$handleClick$1$1$newFilePath$1", m5303f = "ImageFunction.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes3.dex */
public final class ImageFunction$handleClick$1$1$newFilePath$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ String $cropFilePath;
    final /* synthetic */ String $graphFilePath;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageFunction$handleClick$1$1$newFilePath$1(String str, String str2, InterfaceC5631c<? super ImageFunction$handleClick$1$1$newFilePath$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$cropFilePath = str;
        this.$graphFilePath = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
        return new ImageFunction$handleClick$1$1$newFilePath$1(this.$cropFilePath, this.$graphFilePath, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        String strSubstring;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC5774b.m5119b(obj);
        File file = new File(this.$cropFilePath);
        int iM5385S = AbstractC5855p.m5385S(this.$cropFilePath, '.', 0, 6);
        if (iM5385S != -1) {
            strSubstring = this.$cropFilePath.substring(iM5385S);
            AbstractC5830k.m5329f(strSubstring, "this as java.lang.String).substring(startIndex)");
        } else {
            strSubstring = "";
        }
        File file2 = new File(new File(this.$graphFilePath).getParent(), UUID.randomUUID().toString() + strSubstring);
        FileUtils.INSTANCE.copyFileUsingFileChannels(file, file2);
        return file2.getAbsolutePath();
    }

    @Override // p152r6.InterfaceC6473e
    @Nullable
    public final Object invoke(@NotNull InterfaceC6009v interfaceC6009v, @Nullable InterfaceC5631c<? super String> interfaceC5631c) {
        return ((ImageFunction$handleClick$1$1$newFilePath$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
