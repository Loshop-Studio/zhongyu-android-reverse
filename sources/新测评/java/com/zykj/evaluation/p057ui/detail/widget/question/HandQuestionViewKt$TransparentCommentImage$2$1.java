package com.zykj.evaluation.p057ui.detail.widget.question;

import android.app.Application;
import android.graphics.Bitmap;
import androidx.compose.runtime.MutableState;
import coil3.C5203l;
import coil3.InterfaceC5193e;
import com.blankj.utilcode.util.Utils;
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
import p101g7.C7585a;
import p137k.AbstractC7843o;
import p137k.InterfaceC7838j;
import p290y.C9886e;
import p290y.InterfaceC9889h;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.detail.widget.question.HandQuestionViewKt$TransparentCommentImage$2$1", m13596f = "HandQuestionView.kt", m13597i = {}, m13598l = {115}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
@SourceDebugExtension({"SMAP\nHandQuestionView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HandQuestionView.kt\ncom/zykj/evaluation/ui/detail/widget/question/HandQuestionViewKt$TransparentCommentImage$2$1\n+ 2 singletonImageLoaders.android.kt\ncoil3/SingletonImageLoaders_androidKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,231:1\n17#2:232\n1#3:233\n*S KotlinDebug\n*F\n+ 1 HandQuestionView.kt\ncom/zykj/evaluation/ui/detail/widget/question/HandQuestionViewKt$TransparentCommentImage$2$1\n*L\n115#1:232\n*E\n"})
/* loaded from: classes4.dex */
public final class HandQuestionViewKt$TransparentCommentImage$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f9539a;

    /* renamed from: b */
    public int f9540b;

    /* renamed from: c */
    public final /* synthetic */ String f9541c;

    /* renamed from: d */
    public final /* synthetic */ MutableState f9542d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandQuestionViewKt$TransparentCommentImage$2$1(String str, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.f9541c = str;
        this.f9542d = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HandQuestionViewKt$TransparentCommentImage$2$1(this.f9541c, this.f9542d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableState mutableState;
        Bitmap bitmapM13305g;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f9540b;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableState mutableState2 = this.f9542d;
            Application app = Utils.getApp();
            Intrinsics.checkNotNullExpressionValue(app, "getApp(...)");
            InterfaceC5193e interfaceC5193eM3104a = C5203l.m3104a(app);
            Application app2 = Utils.getApp();
            Intrinsics.checkNotNullExpressionValue(app2, "getApp(...)");
            C9886e c9886eM16641a = new C9886e.a(app2).m16643c(this.f9541c).m16641a();
            this.f9539a = mutableState2;
            this.f9540b = 1;
            Object objMo2818c = interfaceC5193eM3104a.mo2818c(c9886eM16641a, this);
            if (objMo2818c == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutableState = mutableState2;
            obj = objMo2818c;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableState = (MutableState) this.f9539a;
            ResultKt.throwOnFailure(obj);
        }
        InterfaceC7838j image = ((InterfaceC9889h) obj).getImage();
        Bitmap bitmapM12440d = null;
        if (image != null && (bitmapM13305g = AbstractC7843o.m13305g(image, 0, 0, 3, null)) != null) {
            bitmapM12440d = C7585a.m12440d(C7585a.f12711a, bitmapM13305g, 0, 2, null);
        }
        HandQuestionViewKt.m9765r(mutableState, bitmapM12440d);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((HandQuestionViewKt$TransparentCommentImage$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
