package com.zykj.gallery.p034ui.share.page;

import androidx.paging.PagingData;
import androidx.paging.PagingDataTransforms__PagingDataTransformsKt;
import com.zykj.gallery.bean.GalleryImgBean;
import com.zykj.gallery.p034ui.share.page.InterfaceC6036a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

@Metadata(m7879d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m7880d2 = {"Landroidx/paging/PagingData;", "Lcom/zykj/gallery/bean/GalleryImgBean;", "pagingData", "", "shouldShowCamera", "Lcom/zykj/gallery/ui/share/page/a;", "<anonymous>", "(Landroidx/paging/PagingData;Z)Landroidx/paging/PagingData;"}, m7881k = 3, m7882mv = {2, 2, 0})
@DebugMetadata(m7917c = "com.zykj.gallery.ui.share.page.ShareViewModel$displayPager$1", m7918f = "ShareViewModel.kt", m7919i = {}, m7920l = {}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
/* loaded from: classes4.dex */
public final class ShareViewModel$displayPager$1 extends SuspendLambda implements Function3<PagingData<GalleryImgBean>, Boolean, Continuation<? super PagingData<InterfaceC6036a>>, Object> {

    /* renamed from: a */
    public int f5923a;

    /* renamed from: b */
    public /* synthetic */ Object f5924b;

    /* renamed from: c */
    public /* synthetic */ boolean f5925c;

    @Metadata(m7879d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m7880d2 = {"Lcom/zykj/gallery/ui/share/page/a;", "before", "after", "<anonymous>", "(Lcom/zykj/gallery/ui/share/page/a;Lcom/zykj/gallery/ui/share/page/a;)Lcom/zykj/gallery/ui/share/page/a;"}, m7881k = 3, m7882mv = {2, 2, 0})
    @DebugMetadata(m7917c = "com.zykj.gallery.ui.share.page.ShareViewModel$displayPager$1$1", m7918f = "ShareViewModel.kt", m7919i = {}, m7920l = {}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
    /* renamed from: com.zykj.gallery.ui.share.page.ShareViewModel$displayPager$1$1 */
    public static final class C60351 extends SuspendLambda implements Function3<InterfaceC6036a, InterfaceC6036a, Continuation<? super InterfaceC6036a>, Object> {

        /* renamed from: a */
        public int f5926a;

        /* renamed from: b */
        public /* synthetic */ Object f5927b;

        public C60351(Continuation continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6036a interfaceC6036a, InterfaceC6036a interfaceC6036a2, Continuation continuation) {
            C60351 c60351 = new C60351(continuation);
            c60351.f5927b = interfaceC6036a;
            return c60351.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            InterfaceC6036a interfaceC6036a = (InterfaceC6036a) this.f5927b;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f5926a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (interfaceC6036a == null) {
                return InterfaceC6036a.a.f5938a;
            }
            return null;
        }
    }

    public ShareViewModel$displayPager$1(Continuation continuation) {
        super(3, continuation);
    }

    /* renamed from: a */
    public final Object m5154a(PagingData pagingData, boolean z6, Continuation continuation) {
        ShareViewModel$displayPager$1 shareViewModel$displayPager$1 = new ShareViewModel$displayPager$1(continuation);
        shareViewModel$displayPager$1.f5924b = pagingData;
        shareViewModel$displayPager$1.f5925c = z6;
        return shareViewModel$displayPager$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(PagingData<GalleryImgBean> pagingData, Boolean bool, Continuation<? super PagingData<InterfaceC6036a>> continuation) {
        return m5154a(pagingData, bool.booleanValue(), continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PagingData pagingData = (PagingData) this.f5924b;
        boolean z6 = this.f5925c;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f5923a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        PagingData map = PagingDataTransforms__PagingDataTransformsKt.map(pagingData, new ShareViewModel$displayPager$1$mappedPagingData$1(null));
        return z6 ? PagingDataTransforms__PagingDataTransformsKt.insertSeparators$default(map, null, new C60351(null), 1, null) : map;
    }
}
