package com.zykj.gallery.p034ui.gallery.detail;

import androidx.compose.runtime.internal.StabilityInferred;
import com.zykj.base.BaseViewModel;
import com.zykj.gallery.repository.GalleryRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p070h3.AbstractC6459c0;
import p070h3.C6461d0;
import p070h3.C6480w;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u000f\u0010\u000e\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u00188\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m7880d2 = {"Lcom/zykj/gallery/ui/gallery/detail/DetailViewModel;", "Lcom/zykj/base/BaseViewModel;", "Lcom/zykj/gallery/repository/GalleryRepository;", "galleryRepository", "<init>", "(Lcom/zykj/gallery/repository/GalleryRepository;)V", "Lh3/d0;", "pictureData", "Lh3/c0;", "fromMode", "", "c", "(Lh3/d0;Lh3/c0;)V", "b", "()Lh3/d0;", "a", "Lcom/zykj/gallery/repository/GalleryRepository;", "Lh3/d0;", "d", "(Lh3/d0;)V", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lh3/w;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_uiState", "Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "module_gallery_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class DetailViewModel extends BaseViewModel {

    /* renamed from: a, reason: from kotlin metadata */
    public final GalleryRepository galleryRepository;

    /* renamed from: b, reason: from kotlin metadata */
    public C6461d0 pictureData;

    /* renamed from: c, reason: from kotlin metadata */
    public final MutableStateFlow _uiState;

    /* renamed from: d, reason: from kotlin metadata */
    public final StateFlow uiState;

    public DetailViewModel(GalleryRepository galleryRepository) {
        Intrinsics.checkNotNullParameter(galleryRepository, "galleryRepository");
        this.galleryRepository = galleryRepository;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(new C6480w(false, false, 3, null));
        this._uiState = MutableStateFlow;
        this.uiState = FlowKt.asStateFlow(MutableStateFlow);
    }

    /* renamed from: a */
    public final C6461d0 m5057a() {
        C6461d0 c6461d0 = this.pictureData;
        if (c6461d0 != null) {
            return c6461d0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pictureData");
        return null;
    }

    /* renamed from: b */
    public final C6461d0 m5058b() {
        return m5057a();
    }

    /* renamed from: c */
    public final void m5059c(C6461d0 pictureData, AbstractC6459c0 fromMode) {
        Intrinsics.checkNotNullParameter(pictureData, "pictureData");
        Intrinsics.checkNotNullParameter(fromMode, "fromMode");
        m5060d(pictureData);
    }

    /* renamed from: d */
    public final void m5060d(C6461d0 c6461d0) {
        Intrinsics.checkNotNullParameter(c6461d0, "<set-?>");
        this.pictureData = c6461d0;
    }
}
