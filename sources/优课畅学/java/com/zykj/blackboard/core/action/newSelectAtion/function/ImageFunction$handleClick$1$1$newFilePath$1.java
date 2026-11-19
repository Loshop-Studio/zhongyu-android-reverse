package com.zykj.blackboard.core.action.newSelectAtion.function;

import com.zykj.blackboard.utils.FileUtils;
import java.io.File;
import java.util.UUID;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8661c0;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.blackboard.core.action.newSelectAtion.function.ImageFunction$handleClick$1$1$newFilePath$1", m17801f = "ImageFunction.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ImageFunction$handleClick$1$1$newFilePath$1 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ String $cropFilePath;
    final /* synthetic */ String $graphFilePath;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageFunction$handleClick$1$1$newFilePath$1(String str, String str2, InterfaceC9324c<? super ImageFunction$handleClick$1$1$newFilePath$1> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.$cropFilePath = str;
        this.$graphFilePath = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        return new ImageFunction$handleClick$1$1$newFilePath$1(this.$cropFilePath, this.$graphFilePath, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super String> interfaceC9324c) {
        return ((ImageFunction$handleClick$1$1$newFilePath$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strSubstring;
        AbstractC9434a.m17291f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        File file = new File(this.$cropFilePath);
        int iM13996k0 = AbstractC8661c0.m13996k0(this.$cropFilePath, '.', 0, false, 6, null);
        if (iM13996k0 != -1) {
            strSubstring = this.$cropFilePath.substring(iM13996k0);
            AbstractC9133u.m16132f(strSubstring, "this as java.lang.String).substring(startIndex)");
        } else {
            strSubstring = "";
        }
        File file2 = new File(new File(this.$graphFilePath).getParent(), UUID.randomUUID().toString() + strSubstring);
        FileUtils.INSTANCE.copyFileUsingFileChannels(file, file2);
        return file2.getAbsolutePath();
    }
}
