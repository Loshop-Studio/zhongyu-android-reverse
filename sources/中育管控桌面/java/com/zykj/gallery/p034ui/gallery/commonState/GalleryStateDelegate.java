package com.zykj.gallery.p034ui.gallery.commonState;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.paging.CachedPagingDataKt;
import androidx.paging.PagingData;
import com.zykj.gallery.bean.GalleryImgBean;
import com.zykj.gallery.page.PagingModuleDelegate;
import com.zykj.gallery.repository.GalleryRepository;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00180\u0017H\u0016J\b\u0010\u001c\u001a\u00020\u0014H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00180\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, m7880d2 = {"Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate;", "Lcom/zykj/gallery/ui/gallery/commonState/GalleryCommonState;", "repository", "Lcom/zykj/gallery/repository/GalleryRepository;", "isRecycleBinProvider", "Lkotlin/Function0;", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lcom/zykj/gallery/repository/GalleryRepository;Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/CoroutineScope;)V", "_totalCount", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "totalCount", "Lkotlinx/coroutines/flow/StateFlow;", "getTotalCount", "()Lkotlinx/coroutines/flow/StateFlow;", "pagingDelegate", "Lcom/zykj/gallery/page/PagingModuleDelegate;", "", "Lcom/zykj/gallery/bean/GalleryImgBean;", "listPager", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "getListPager", "()Lkotlinx/coroutines/flow/Flow;", "getListPagingFlow", "forceRefreshList", "module_gallery_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class GalleryStateDelegate implements GalleryCommonState {
    public static final int $stable = 8;
    private final MutableStateFlow<Integer> _totalCount;
    private final Function0<Boolean> isRecycleBinProvider;
    private final Flow<PagingData<GalleryImgBean>> listPager;
    private final PagingModuleDelegate pagingDelegate;
    private final GalleryRepository repository;
    private final CoroutineScope scope;
    private final StateFlow<Integer> totalCount;

    public GalleryStateDelegate(GalleryRepository repository, Function0<Boolean> isRecycleBinProvider, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(isRecycleBinProvider, "isRecycleBinProvider");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.repository = repository;
        this.isRecycleBinProvider = isRecycleBinProvider;
        this.scope = scope;
        MutableStateFlow<Integer> MutableStateFlow = StateFlowKt.MutableStateFlow(0);
        this._totalCount = MutableStateFlow;
        this.totalCount = FlowKt.asStateFlow(MutableStateFlow);
        PagingModuleDelegate pagingModuleDelegate = new PagingModuleDelegate(new GalleryStateDelegate$pagingDelegate$1(this), Unit.INSTANCE, 40, scope);
        this.pagingDelegate = pagingModuleDelegate;
        this.listPager = CachedPagingDataKt.cachedIn(pagingModuleDelegate.m5021d(), scope);
    }

    @Override // com.zykj.gallery.p034ui.gallery.commonState.GalleryCommonState
    public void forceRefreshList() {
        this.pagingDelegate.m5020c();
    }

    @Override // com.zykj.gallery.p034ui.gallery.commonState.GalleryCommonState
    public Flow<PagingData<GalleryImgBean>> getListPager() {
        return this.listPager;
    }

    @Override // com.zykj.gallery.p034ui.gallery.commonState.GalleryCommonState
    public Flow<PagingData<GalleryImgBean>> getListPagingFlow() {
        return this.pagingDelegate.m5021d();
    }

    @Override // com.zykj.gallery.p034ui.gallery.commonState.GalleryCommonState
    public StateFlow<Integer> getTotalCount() {
        return this.totalCount;
    }
}
