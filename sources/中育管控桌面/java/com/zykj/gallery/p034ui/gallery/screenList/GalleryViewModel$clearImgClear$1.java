package com.zykj.gallery.p034ui.gallery.screenList;

import com.zykj.gallery.repository.GalleryRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.gallery.ui.gallery.screenList.GalleryViewModel$clearImgClear$1", m7918f = "GalleryViewModel.kt", m7919i = {}, m7920l = {108}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
/* loaded from: classes4.dex */
public final class GalleryViewModel$clearImgClear$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f5880a;

    /* renamed from: b */
    public final /* synthetic */ GalleryViewModel f5881b;

    /* renamed from: c */
    public final /* synthetic */ List f5882c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryViewModel$clearImgClear$1(GalleryViewModel galleryViewModel, List list, Continuation continuation) {
        super(2, continuation);
        this.f5881b = galleryViewModel;
        this.f5882c = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GalleryViewModel$clearImgClear$1(this.f5881b, this.f5882c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.f5880a;
        if (i6 == 0) {
            ResultKt.throwOnFailure(obj);
            GalleryRepository galleryRepository = this.f5881b.galleryRepository;
            List list = this.f5882c;
            this.f5880a = 1;
            if (galleryRepository.m5025c(list, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.f5881b.m5111m();
        this.f5881b.m5118t();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((GalleryViewModel$clearImgClear$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
