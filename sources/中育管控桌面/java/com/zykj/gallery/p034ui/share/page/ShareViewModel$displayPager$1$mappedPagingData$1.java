package com.zykj.gallery.p034ui.share.page;

import com.zykj.gallery.bean.GalleryImgBean;
import com.zykj.gallery.p034ui.share.page.InterfaceC6036a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(m7879d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m7880d2 = {"Lcom/zykj/gallery/bean/GalleryImgBean;", "imgBean", "Lcom/zykj/gallery/ui/share/page/a;", "<anonymous>", "(Lcom/zykj/gallery/bean/GalleryImgBean;)Lcom/zykj/gallery/ui/share/page/a;"}, m7881k = 3, m7882mv = {2, 2, 0})
@DebugMetadata(m7917c = "com.zykj.gallery.ui.share.page.ShareViewModel$displayPager$1$mappedPagingData$1", m7918f = "ShareViewModel.kt", m7919i = {}, m7920l = {}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
/* loaded from: classes4.dex */
public final class ShareViewModel$displayPager$1$mappedPagingData$1 extends SuspendLambda implements Function2<GalleryImgBean, Continuation<? super InterfaceC6036a>, Object> {

    /* renamed from: a */
    public int f5928a;

    /* renamed from: b */
    public /* synthetic */ Object f5929b;

    public ShareViewModel$displayPager$1$mappedPagingData$1(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(GalleryImgBean galleryImgBean, Continuation continuation) {
        return ((ShareViewModel$displayPager$1$mappedPagingData$1) create(galleryImgBean, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ShareViewModel$displayPager$1$mappedPagingData$1 shareViewModel$displayPager$1$mappedPagingData$1 = new ShareViewModel$displayPager$1$mappedPagingData$1(continuation);
        shareViewModel$displayPager$1$mappedPagingData$1.f5929b = obj;
        return shareViewModel$displayPager$1$mappedPagingData$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        GalleryImgBean galleryImgBean = (GalleryImgBean) this.f5929b;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f5928a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return new InterfaceC6036a.b(galleryImgBean);
    }
}
