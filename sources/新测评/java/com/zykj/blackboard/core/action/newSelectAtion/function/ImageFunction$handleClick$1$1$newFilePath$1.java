package com.zykj.blackboard.core.action.newSelectAtion.function;

import java.io.File;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import p077e5.C7349j;

@Metadata(m13557d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\u008a@"}, m13558d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 7, 1}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.blackboard.core.action.newSelectAtion.function.ImageFunction$handleClick$1$1$newFilePath$1", m13596f = "ImageFunction.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes4.dex */
public final class ImageFunction$handleClick$1$1$newFilePath$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {

    /* renamed from: a */
    public int f7072a;

    /* renamed from: b */
    public final /* synthetic */ String f7073b;

    /* renamed from: c */
    public final /* synthetic */ String f7074c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageFunction$handleClick$1$1$newFilePath$1(String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f7073b = str;
        this.f7074c = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ImageFunction$handleClick$1$1$newFilePath$1(this.f7073b, this.f7074c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strSubstring;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f7072a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        File file = new File(this.f7073b);
        int iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) this.f7073b, '.', 0, false, 6, (Object) null);
        if (iLastIndexOf$default != -1) {
            strSubstring = this.f7073b.substring(iLastIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        } else {
            strSubstring = "";
        }
        File file2 = new File(new File(this.f7074c).getParent(), UUID.randomUUID().toString() + strSubstring);
        C7349j.f11917a.m11763a(file, file2);
        return file2.getAbsolutePath();
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((ImageFunction$handleClick$1$1$newFilePath$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
