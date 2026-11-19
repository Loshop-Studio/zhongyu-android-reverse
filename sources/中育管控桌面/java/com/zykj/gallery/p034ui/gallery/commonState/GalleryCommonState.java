package com.zykj.gallery.p034ui.gallery.commonState;

import androidx.paging.PagingData;
import com.zykj.gallery.bean.GalleryImgBean;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(m7879d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J\b\u0010\t\u001a\u00020\nH&R\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, m7880d2 = {"Lcom/zykj/gallery/ui/gallery/commonState/GalleryCommonState;", "", "listPager", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/zykj/gallery/bean/GalleryImgBean;", "getListPager", "()Lkotlinx/coroutines/flow/Flow;", "getListPagingFlow", "forceRefreshList", "", "totalCount", "Lkotlinx/coroutines/flow/StateFlow;", "", "getTotalCount", "()Lkotlinx/coroutines/flow/StateFlow;", "module_gallery_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public interface GalleryCommonState {
    void forceRefreshList();

    Flow<PagingData<GalleryImgBean>> getListPager();

    Flow<PagingData<GalleryImgBean>> getListPagingFlow();

    StateFlow<Integer> getTotalCount();
}
