package com.zykj.blackboard.core.action.newSelectAtion.function;

import java.io.File;
import java.util.UUID;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import na.C10348k;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p310qd.AbstractC10793c0;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.zykj.blackboard.core.action.newSelectAtion.function.ImageFunction$handleClick$1$1$newFilePath$1", m26211f = "ImageFunction.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ImageFunction$handleClick$1$1$newFilePath$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f17909c;

    /* renamed from: d */
    public final /* synthetic */ String f17910d;

    /* renamed from: e */
    public final /* synthetic */ String f17911e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageFunction$handleClick$1$1$newFilePath$1(String str, String str2, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f17910d = str;
        this.f17911e = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new ImageFunction$handleClick$1$1$newFilePath$1(this.f17910d, this.f17911e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strSubstring;
        AbstractC11725a.m25952f();
        if (this.f17909c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        File file = new File(this.f17910d);
        int iM23135k0 = AbstractC10793c0.m23135k0(this.f17910d, '.', 0, false, 6, null);
        if (iM23135k0 != -1) {
            strSubstring = this.f17910d.substring(iM23135k0);
            AbstractC9979u.m20293f(strSubstring, "this as java.lang.String).substring(startIndex)");
        } else {
            strSubstring = "";
        }
        File file2 = new File(new File(this.f17911e).getParent(), UUID.randomUUID().toString() + strSubstring);
        C10348k.f24655a.m21645a(file, file2);
        return file2.getAbsolutePath();
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((ImageFunction$handleClick$1$1$newFilePath$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
