package com.zykj.blackboard.core.action.newSelectAtion.function;

import androidx.constraintlayout.widget.ConstraintLayout;
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
import p263u5.C9692k;

@Metadata(m13412d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\u008a@"}, m13413d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.blackboard.core.action.newSelectAtion.function.ImageFunction$handleClick$1$1$newFilePath$1", m13451f = "ImageFunction.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
/* loaded from: classes4.dex */
public final class ImageFunction$handleClick$1$1$newFilePath$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {

    /* renamed from: a */
    public int f8355a;

    /* renamed from: b */
    public final /* synthetic */ String f8356b;

    /* renamed from: c */
    public final /* synthetic */ String f8357c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageFunction$handleClick$1$1$newFilePath$1(String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f8356b = str;
        this.f8357c = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ImageFunction$handleClick$1$1$newFilePath$1(this.f8356b, this.f8357c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strSubstring;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f8355a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        File file = new File(this.f8356b);
        int iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) this.f8356b, '.', 0, false, 6, (Object) null);
        if (iLastIndexOf$default != -1) {
            strSubstring = this.f8356b.substring(iLastIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        } else {
            strSubstring = "";
        }
        File file2 = new File(new File(this.f8357c).getParent(), UUID.randomUUID().toString() + strSubstring);
        C9692k.f17130a.m16184a(file, file2);
        return file2.getAbsolutePath();
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((ImageFunction$handleClick$1$1$newFilePath$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
