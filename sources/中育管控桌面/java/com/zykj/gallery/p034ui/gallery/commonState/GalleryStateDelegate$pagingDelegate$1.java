package com.zykj.gallery.p034ui.gallery.commonState;

import androidx.paging.PagingSource;
import com.zykj.gallery.bean.GalleryImgBean;
import com.zykj.gallery.factory.GalleryPagingSourceFactory;
import com.zykj.gallery.repository.GalleryRepository;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p049e3.InterfaceC6268a;

@Metadata(m7879d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m7880d2 = {"com/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate$pagingDelegate$1", "Le3/a;", "", "Lcom/zykj/gallery/bean/GalleryImgBean;", "params", "Landroidx/paging/PagingSource;", "", "create", "(Lkotlin/Unit;)Landroidx/paging/PagingSource;", "module_gallery_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class GalleryStateDelegate$pagingDelegate$1 implements InterfaceC6268a {
    final /* synthetic */ GalleryStateDelegate this$0;

    public GalleryStateDelegate$pagingDelegate$1(GalleryStateDelegate galleryStateDelegate) {
        this.this$0 = galleryStateDelegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit create$lambda$0(GalleryStateDelegate galleryStateDelegate, int i6) {
        if (!((Boolean) galleryStateDelegate.isRecycleBinProvider.invoke()).booleanValue()) {
            galleryStateDelegate._totalCount.setValue(Integer.valueOf(i6));
        }
        return Unit.INSTANCE;
    }

    @Override // p049e3.InterfaceC6268a
    public PagingSource<Integer, GalleryImgBean> create(Unit params) {
        Intrinsics.checkNotNullParameter(params, "params");
        GalleryRepository galleryRepository = this.this$0.repository;
        Function0 function0 = this.this$0.isRecycleBinProvider;
        final GalleryStateDelegate galleryStateDelegate = this.this$0;
        return new GalleryPagingSourceFactory(galleryRepository, function0, 40, new Function1() { // from class: com.zykj.gallery.ui.gallery.commonState.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GalleryStateDelegate$pagingDelegate$1.create$lambda$0(galleryStateDelegate, ((Integer) obj).intValue());
            }
        }).create(Unit.INSTANCE);
    }
}
