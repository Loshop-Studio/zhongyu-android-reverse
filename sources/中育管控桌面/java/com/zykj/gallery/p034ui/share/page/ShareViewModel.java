package com.zykj.gallery.p034ui.share.page;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.CachedPagingDataKt;
import androidx.paging.PagingData;
import com.zykj.base.BaseViewModel;
import com.zykj.gallery.bean.GalleryImgBean;
import com.zykj.gallery.p034ui.gallery.commonState.GalleryCommonState;
import com.zykj.gallery.p034ui.gallery.commonState.GalleryStateDelegate;
import com.zykj.gallery.p034ui.share.page.ShareViewModel;
import com.zykj.gallery.repository.GalleryRepository;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p070h3.C6461d0;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR#\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u001d8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b&\u0010,R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020/0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001d\u00103\u001a\b\u0012\u0004\u0012\u00020/0\u001d8\u0006¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b0\u0010#R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u00110%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010'R\u001d\u00106\u001a\b\u0012\u0004\u0012\u00020\u00110)8\u0006¢\u0006\f\n\u0004\b\u0013\u0010+\u001a\u0004\b5\u0010,R#\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002070\u001e0\u001d8\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b*\u0010#¨\u00069"}, m7880d2 = {"Lcom/zykj/gallery/ui/share/page/ShareViewModel;", "Lcom/zykj/base/BaseViewModel;", "Lcom/zykj/gallery/repository/GalleryRepository;", "repository", "<init>", "(Lcom/zykj/gallery/repository/GalleryRepository;)V", "Lh3/d0;", "newData", "", "j", "(Lh3/d0;)V", "Landroid/content/Context;", "context", "", "picture", "g", "(Landroid/content/Context;Ljava/lang/String;)V", "", "enableCamera", "i", "(Z)V", "h", "()V", "a", "Lcom/zykj/gallery/repository/GalleryRepository;", "Lcom/zykj/gallery/ui/gallery/commonState/GalleryCommonState;", "b", "Lcom/zykj/gallery/ui/gallery/commonState/GalleryCommonState;", "galleryStateDelegate", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/zykj/gallery/bean/GalleryImgBean;", "c", "Lkotlinx/coroutines/flow/Flow;", "getListPager", "()Lkotlinx/coroutines/flow/Flow;", "listPager", "Lkotlinx/coroutines/flow/MutableStateFlow;", "d", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_detailData", "Lkotlinx/coroutines/flow/StateFlow;", "e", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "detailData", "Lkotlinx/coroutines/channels/Channel;", "Lcom/zykj/gallery/ui/share/page/b;", "f", "Lkotlinx/coroutines/channels/Channel;", "_shareUriEvent", "shareUriEvent", "_showCameraEntry", "getShowCameraEntry", "showCameraEntry", "Lcom/zykj/gallery/ui/share/page/a;", "displayPager", "module_gallery_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class ShareViewModel extends BaseViewModel {

    /* renamed from: a, reason: from kotlin metadata */
    public final GalleryRepository repository;

    /* renamed from: b, reason: from kotlin metadata */
    public final GalleryCommonState galleryStateDelegate;

    /* renamed from: c, reason: from kotlin metadata */
    public final Flow listPager;

    /* renamed from: d, reason: from kotlin metadata */
    public final MutableStateFlow _detailData;

    /* renamed from: e, reason: from kotlin metadata */
    public final StateFlow detailData;

    /* renamed from: f, reason: from kotlin metadata */
    public final Channel _shareUriEvent;

    /* renamed from: g, reason: from kotlin metadata */
    public final Flow shareUriEvent;

    /* renamed from: h, reason: from kotlin metadata */
    public final MutableStateFlow _showCameraEntry;

    /* renamed from: i, reason: from kotlin metadata */
    public final StateFlow showCameraEntry;

    /* renamed from: j, reason: from kotlin metadata */
    public final Flow displayPager;

    public ShareViewModel(GalleryRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
        GalleryStateDelegate galleryStateDelegate = new GalleryStateDelegate(repository, new Function0() { // from class: m3.t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(ShareViewModel.m5146c());
            }
        }, ViewModelKt.getViewModelScope(this));
        this.galleryStateDelegate = galleryStateDelegate;
        Flow<PagingData<GalleryImgBean>> listPager = galleryStateDelegate.getListPager();
        this.listPager = listPager;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(new C6461d0(0L, null, null, null, null, 31, null));
        this._detailData = MutableStateFlow;
        this.detailData = FlowKt.asStateFlow(MutableStateFlow);
        Channel channelChannel$default = ChannelKt.Channel$default(-2, null, null, 6, null);
        this._shareUriEvent = channelChannel$default;
        this.shareUriEvent = FlowKt.receiveAsFlow(channelChannel$default);
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this._showCameraEntry = MutableStateFlow2;
        StateFlow stateFlowAsStateFlow = FlowKt.asStateFlow(MutableStateFlow2);
        this.showCameraEntry = stateFlowAsStateFlow;
        this.displayPager = CachedPagingDataKt.cachedIn(FlowKt.combine(listPager, stateFlowAsStateFlow, new ShareViewModel$displayPager$1(null)), ViewModelKt.getViewModelScope(this));
    }

    /* renamed from: c */
    public static final boolean m5146c() {
        return false;
    }

    /* renamed from: d, reason: from getter */
    public final StateFlow getDetailData() {
        return this.detailData;
    }

    /* renamed from: e, reason: from getter */
    public final Flow getDisplayPager() {
        return this.displayPager;
    }

    /* renamed from: f, reason: from getter */
    public final Flow getShareUriEvent() {
        return this.shareUriEvent;
    }

    /* renamed from: g */
    public final void m5150g(Context context, String picture) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(picture, "picture");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ShareViewModel$handleImageClick$1(context, picture, this, null), 3, null);
    }

    /* renamed from: h */
    public final void m5151h() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ShareViewModel$onCameraClicked$1(this, null), 3, null);
    }

    /* renamed from: i */
    public final void m5152i(boolean enableCamera) {
        if (enableCamera) {
            this._showCameraEntry.setValue(Boolean.TRUE);
        }
    }

    /* renamed from: j */
    public final void m5153j(C6461d0 newData) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        this._detailData.setValue(newData);
    }
}
