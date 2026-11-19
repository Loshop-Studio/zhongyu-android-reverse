package com.zykj.evaluation.p057ui.detail.mistake;

// RE note 本类字节码直接引用的读写或显示接口包括JSON。

import androidx.compose.runtime.MutableState;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.detail.mistake.CreateOrUpdateTagDialogPageKt$CreateOrUpdateTagDialogPage$1$1", m13596f = "CreateOrUpdateTagDialogPage.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
@SourceDebugExtension({"SMAP\nCreateOrUpdateTagDialogPage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateOrUpdateTagDialogPage.kt\ncom/zykj/evaluation/ui/detail/mistake/CreateOrUpdateTagDialogPageKt$CreateOrUpdateTagDialogPage$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,177:1\n1#2:178\n*E\n"})
/* loaded from: classes4.dex */
public final class CreateOrUpdateTagDialogPageKt$CreateOrUpdateTagDialogPage$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f9273a;

    /* renamed from: b */
    public final /* synthetic */ String f9274b;

    /* renamed from: c */
    public final /* synthetic */ MutableState f9275c;

    /* renamed from: d */
    public final /* synthetic */ MutableState f9276d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateOrUpdateTagDialogPageKt$CreateOrUpdateTagDialogPage$1$1(String str, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.f9274b = str;
        this.f9275c = mutableState;
        this.f9276d = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CreateOrUpdateTagDialogPageKt$CreateOrUpdateTagDialogPage$1$1(this.f9274b, this.f9275c, this.f9276d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws JsonSyntaxException {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f9273a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MutableState mutableState = this.f9275c;
        Object objFromJson = new Gson().fromJson(this.f9274b, (Class<Object>) TagData.class);
        Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
        CreateOrUpdateTagDialogPageKt.m9495l(mutableState, (TagData) objFromJson);
        String name = CreateOrUpdateTagDialogPageKt.m9490g(this.f9275c).getName();
        if (name != null) {
            CreateOrUpdateTagDialogPageKt.m9498o(this.f9276d, name);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((CreateOrUpdateTagDialogPageKt$CreateOrUpdateTagDialogPage$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
