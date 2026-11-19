package com.zykj.gallery.factory;

import androidx.paging.PagingSource;
import com.zykj.gallery.bean.GalleryImgBean;
import com.zykj.gallery.bean.PagedData;
import com.zykj.gallery.page.OffsetPagingSource;
import com.zykj.gallery.repository.GalleryRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import p049e3.InterfaceC6268a;

/* loaded from: classes.dex */
public final class GalleryPagingSourceFactory implements InterfaceC6268a {

    /* renamed from: a */
    public final GalleryRepository f5736a;

    /* renamed from: b */
    public final Function0 f5737b;

    /* renamed from: c */
    public final int f5738c;

    /* renamed from: d */
    public final Function1 f5739d;

    @Metadata(m7879d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\n"}, m7880d2 = {"<anonymous>", "Lcom/zykj/gallery/bean/PagedData;", "Lcom/zykj/gallery/bean/GalleryImgBean;", "skipCount", "", "maxResultCount"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
    @DebugMetadata(m7917c = "com.zykj.gallery.factory.GalleryPagingSourceFactory$create$1", m7918f = "GalleryPagingSourceFactory.kt", m7919i = {0, 0, 0}, m7920l = {21}, m7921m = "invokeSuspend", m7922n = {"skipCount", "maxResultCount", "isRecycleBin"}, m7923s = {"I$0", "I$1", "Z$0"})
    /* renamed from: com.zykj.gallery.factory.GalleryPagingSourceFactory$create$1 */
    public static final class C60181 extends SuspendLambda implements Function3<Integer, Integer, Continuation<? super PagedData<GalleryImgBean>>, Object> {

        /* renamed from: a */
        public boolean f5740a;

        /* renamed from: b */
        public int f5741b;

        /* renamed from: c */
        public /* synthetic */ int f5742c;

        /* renamed from: d */
        public /* synthetic */ int f5743d;

        public C60181(Continuation continuation) {
            super(3, continuation);
        }

        /* renamed from: a */
        public final Object m5017a(int i6, int i7, Continuation continuation) {
            C60181 c60181 = GalleryPagingSourceFactory.this.new C60181(continuation);
            c60181.f5742c = i6;
            c60181.f5743d = i7;
            return c60181.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Integer num2, Continuation<? super PagedData<GalleryImgBean>> continuation) {
            return m5017a(num.intValue(), num2.intValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i6 = this.f5742c;
            int i7 = this.f5743d;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i8 = this.f5741b;
            if (i8 == 0) {
                ResultKt.throwOnFailure(obj);
                boolean zBooleanValue = ((Boolean) GalleryPagingSourceFactory.this.f5737b.invoke()).booleanValue();
                GalleryRepository galleryRepository = GalleryPagingSourceFactory.this.f5736a;
                this.f5742c = i6;
                this.f5743d = i7;
                this.f5740a = zBooleanValue;
                this.f5741b = 1;
                obj = galleryRepository.m5027e(i6, i7, zBooleanValue, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            GalleryPagingSourceFactory.this.f5739d.invoke(Boxing.boxInt(((PagedData) obj).getTotalCount()));
            return obj;
        }
    }

    public GalleryPagingSourceFactory(GalleryRepository repository, Function0 isRecycleBinProvider, int i6, Function1 onTotalCountLoaded) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(isRecycleBinProvider, "isRecycleBinProvider");
        Intrinsics.checkNotNullParameter(onTotalCountLoaded, "onTotalCountLoaded");
        this.f5736a = repository;
        this.f5737b = isRecycleBinProvider;
        this.f5738c = i6;
        this.f5739d = onTotalCountLoaded;
    }

    @Override // p049e3.InterfaceC6268a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public PagingSource create(Unit params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return new OffsetPagingSource(new C60181(null), this.f5738c);
    }
}
