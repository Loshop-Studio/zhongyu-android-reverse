package com.zykj.evaluation.p057ui.sheet.preview;

import androidx.compose.foundation.ScrollState;
import com.zykj.evaluation.p057ui.sheet.AbstractC6935c;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p267v6.C9709z;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.sheet.preview.PreviewPageKt$PreviewButtonIndexView$1$1", m13596f = "PreviewPage.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes4.dex */
public final class PreviewPageKt$PreviewButtonIndexView$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f10142a;

    /* renamed from: b */
    public /* synthetic */ Object f10143b;

    /* renamed from: c */
    public final /* synthetic */ ScrollState f10144c;

    /* renamed from: d */
    public final /* synthetic */ List f10145d;

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "com.zykj.evaluation.ui.sheet.preview.PreviewPageKt$PreviewButtonIndexView$1$1$1", m13596f = "PreviewPage.kt", m13597i = {}, m13598l = {324}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    @SourceDebugExtension({"SMAP\nPreviewPage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreviewPage.kt\ncom/zykj/evaluation/ui/sheet/preview/PreviewPageKt$PreviewButtonIndexView$1$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,364:1\n360#2,7:365\n*S KotlinDebug\n*F\n+ 1 PreviewPage.kt\ncom/zykj/evaluation/ui/sheet/preview/PreviewPageKt$PreviewButtonIndexView$1$1$1\n*L\n324#1:365,7\n*E\n"})
    /* renamed from: com.zykj.evaluation.ui.sheet.preview.PreviewPageKt$PreviewButtonIndexView$1$1$1 */
    public static final class C69371 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f10146a;

        /* renamed from: b */
        public final /* synthetic */ ScrollState f10147b;

        /* renamed from: c */
        public final /* synthetic */ List f10148c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C69371(ScrollState scrollState, List list, Continuation continuation) {
            super(2, continuation);
            this.f10147b = scrollState;
            this.f10148c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C69371(this.f10147b, this.f10148c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f10146a;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                ScrollState scrollState = this.f10147b;
                Iterator it = this.f10148c.iterator();
                int i11 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i11 = -1;
                        break;
                    }
                    if (((C9709z) it.next()).m16226d() instanceof AbstractC6935c.a) {
                        break;
                    }
                    i11++;
                }
                this.f10146a = 1;
                if (scrollState.scrollTo(i11, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C69371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewPageKt$PreviewButtonIndexView$1$1(ScrollState scrollState, List list, Continuation continuation) {
        super(2, continuation);
        this.f10144c = scrollState;
        this.f10145d = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PreviewPageKt$PreviewButtonIndexView$1$1 previewPageKt$PreviewButtonIndexView$1$1 = new PreviewPageKt$PreviewButtonIndexView$1$1(this.f10144c, this.f10145d, continuation);
        previewPageKt$PreviewButtonIndexView$1$1.f10143b = obj;
        return previewPageKt$PreviewButtonIndexView$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.f10143b;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f10142a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C69371(this.f10144c, this.f10145d, null), 3, null);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((PreviewPageKt$PreviewButtonIndexView$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
