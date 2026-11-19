package com.zykj.image;

import androidx.navigation.fragment.FragmentKt;
import java.io.File;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p141j3.AbstractC9007l;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.image.ImagePickFragment$takePic$1$onImageSaved$1", m17801f = "ImagePickFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ImagePickFragment$takePic$1$onImageSaved$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f9759a;

    /* renamed from: b */
    public final /* synthetic */ File f9760b;

    /* renamed from: c */
    public final /* synthetic */ ImagePickFragment f9761c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImagePickFragment$takePic$1$onImageSaved$1(File file, ImagePickFragment imagePickFragment, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f9760b = file;
        this.f9761c = imagePickFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new ImagePickFragment$takePic$1$onImageSaved$1(this.f9760b, this.f9761c, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((ImagePickFragment$takePic$1$onImageSaved$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC9434a.m17291f();
        if (this.f9759a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        AbstractC9007l.b bVar = AbstractC9007l.f17199a;
        String absolutePath = this.f9760b.getAbsolutePath();
        AbstractC9133u.m16132f(absolutePath, "file.absolutePath");
        FragmentKt.findNavController(this.f9761c).navigate(bVar.m15650a(absolutePath, this.f9761c.getArgs().m9226b(), this.f9761c.getArgs().m9227c(), this.f9761c.getArgs().m9228d(), this.f9761c.getArgs().m9225a()));
        return C8736p.f16368a;
    }
}
