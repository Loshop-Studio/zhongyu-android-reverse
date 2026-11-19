package com.zykj.gallery.p034ui.gallery.screenList;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.lifecycle.ViewModelKt;
import com.zykj.base.BaseViewModel;
import com.zykj.gallery.bean.GalleryImgBean;
import com.zykj.gallery.p034ui.gallery.commonState.GalleryCommonState;
import com.zykj.gallery.p034ui.gallery.commonState.GalleryStateDelegate;
import com.zykj.gallery.p034ui.gallery.screenList.GalleryViewModel;
import com.zykj.gallery.repository.GalleryRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0012J\u0015\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0010J\u001b\u0010\u001c\u001a\u00020\n2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001e\u001a\u00020\n2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0004\b\u001e\u0010\u001dJ#\u0010\"\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020!0\u0019¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\n¢\u0006\u0004\b$\u0010\u0012J\u001b\u0010%\u001a\u00020\n2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0004\b%\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020\u00060,8\u0006¢\u0006\f\n\u0004\b$\u0010-\u001a\u0004\b.\u0010/R\u001d\u00105\u001a\b\u0012\u0004\u0012\u00020\r018\u0006¢\u0006\f\n\u0004\b\"\u00102\u001a\u0004\b3\u00104R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\b0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010*R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R#\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0<0;8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b=\u0010?R\u001d\u0010C\u001a\b\u0012\u0004\u0012\u00020A0,8\u0006¢\u0006\f\n\u0004\b.\u0010-\u001a\u0004\bB\u0010/R/\u0010I\u001a\u0004\u0018\u00010\r2\b\u0010D\u001a\u0004\u0018\u00010\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b3\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010\u0010¨\u0006J"}, m7880d2 = {"Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;", "Lcom/zykj/base/BaseViewModel;", "Lcom/zykj/gallery/repository/GalleryRepository;", "galleryRepository", "<init>", "(Lcom/zykj/gallery/repository/GalleryRepository;)V", "Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;", "newState", "", "needRefresh", "", "r", "(Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;Z)V", "Lcom/zykj/gallery/bean/GalleryImgBean;", "item", "s", "(Lcom/zykj/gallery/bean/GalleryImgBean;)V", "t", "()V", "isRecycleBin", "q", "(Z)V", "m", "entity", "o", "", "", "list", "l", "(Ljava/util/List;)V", "e", "Landroid/content/Context;", "context", "", "d", "(Landroid/content/Context;Ljava/util/List;)V", "c", "n", "a", "Lcom/zykj/gallery/repository/GalleryRepository;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "b", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_screenState", "Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "h", "()Lkotlinx/coroutines/flow/StateFlow;", "screenState", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "i", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "selectedItems", "_isRecycleBin", "Lcom/zykj/gallery/ui/gallery/commonState/GalleryCommonState;", "f", "Lcom/zykj/gallery/ui/gallery/commonState/GalleryCommonState;", "galleryStateDelegate", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "g", "Lkotlinx/coroutines/flow/Flow;", "()Lkotlinx/coroutines/flow/Flow;", "listPager", "", "k", "totalCount", "<set-?>", "Landroidx/compose/runtime/MutableState;", "j", "()Lcom/zykj/gallery/bean/GalleryImgBean;", "p", "selectedPreviewImg", "module_gallery_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nGalleryViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GalleryViewModel.kt\ncom/zykj/gallery/ui/gallery/screenList/GalleryViewModel\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,144:1\n85#2:145\n113#2,2:146\n*S KotlinDebug\n*F\n+ 1 GalleryViewModel.kt\ncom/zykj/gallery/ui/gallery/screenList/GalleryViewModel\n*L\n86#1:145\n86#1:146,2\n*E\n"})
/* loaded from: classes4.dex */
public final class GalleryViewModel extends BaseViewModel {

    /* renamed from: a, reason: from kotlin metadata */
    public final GalleryRepository galleryRepository;

    /* renamed from: b, reason: from kotlin metadata */
    public final MutableStateFlow _screenState;

    /* renamed from: c, reason: from kotlin metadata */
    public final StateFlow screenState;

    /* renamed from: d, reason: from kotlin metadata */
    public final SnapshotStateList selectedItems;

    /* renamed from: e, reason: from kotlin metadata */
    public final MutableStateFlow _isRecycleBin;

    /* renamed from: f, reason: from kotlin metadata */
    public final GalleryCommonState galleryStateDelegate;

    /* renamed from: g, reason: from kotlin metadata */
    public final Flow listPager;

    /* renamed from: h, reason: from kotlin metadata */
    public final StateFlow totalCount;

    /* renamed from: i, reason: from kotlin metadata */
    public final MutableState selectedPreviewImg;

    /* renamed from: com.zykj.gallery.ui.gallery.screenList.GalleryViewModel$a */
    public static final /* synthetic */ class C6031a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5874a;

        static {
            int[] iArr = new int[ScreenState.values().length];
            try {
                iArr[ScreenState.f5889a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScreenState.f5890b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScreenState.f5892d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ScreenState.f5891c.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f5874a = iArr;
        }
    }

    public GalleryViewModel(GalleryRepository galleryRepository) {
        Intrinsics.checkNotNullParameter(galleryRepository, "galleryRepository");
        this.galleryRepository = galleryRepository;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(ScreenState.f5889a);
        this._screenState = MutableStateFlow;
        this.screenState = FlowKt.asStateFlow(MutableStateFlow);
        this.selectedItems = SnapshotStateKt.mutableStateListOf();
        this._isRecycleBin = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        GalleryStateDelegate galleryStateDelegate = new GalleryStateDelegate(galleryRepository, new Function0() { // from class: k3.n0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(GalleryViewModel.m5101f(this.f8763a));
            }
        }, ViewModelKt.getViewModelScope(this));
        this.galleryStateDelegate = galleryStateDelegate;
        this.listPager = galleryStateDelegate.getListPagingFlow();
        this.totalCount = galleryStateDelegate.getTotalCount();
        this.selectedPreviewImg = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    /* renamed from: f */
    public static final boolean m5101f(GalleryViewModel galleryViewModel) {
        return ((Boolean) galleryViewModel._isRecycleBin.getValue()).booleanValue();
    }

    /* renamed from: c */
    public final void m5102c() {
        BaseViewModel.launch$default(this, null, null, new GalleryViewModel$clear$1(this, null), 3, null);
    }

    /* renamed from: d */
    public final void m5103d(Context context, List list) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(list, "list");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new GalleryViewModel$clearImgCache$1(context, list, null), 3, null);
    }

    /* renamed from: e */
    public final void m5104e(List list) {
        Intrinsics.checkNotNullParameter(list, "list");
        BaseViewModel.launch$default(this, null, null, new GalleryViewModel$clearImgClear$1(this, list, null), 3, null);
    }

    /* renamed from: g, reason: from getter */
    public final Flow getListPager() {
        return this.listPager;
    }

    /* renamed from: h, reason: from getter */
    public final StateFlow getScreenState() {
        return this.screenState;
    }

    /* renamed from: i, reason: from getter */
    public final SnapshotStateList getSelectedItems() {
        return this.selectedItems;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    public final GalleryImgBean m5108j() {
        return (GalleryImgBean) this.selectedPreviewImg.getValue();
    }

    /* renamed from: k, reason: from getter */
    public final StateFlow getTotalCount() {
        return this.totalCount;
    }

    /* renamed from: l */
    public final void m5110l(List list) {
        Intrinsics.checkNotNullParameter(list, "list");
        BaseViewModel.launch$default(this, null, null, new GalleryViewModel$moveToRecycleBinAsync$1(this, list, null), 3, null);
    }

    /* renamed from: m */
    public final void m5111m() {
        this.galleryStateDelegate.forceRefreshList();
    }

    /* renamed from: n */
    public final void m5112n(List list) {
        Intrinsics.checkNotNullParameter(list, "list");
        BaseViewModel.launch$default(this, null, null, new GalleryViewModel$receiver$1(this, list, null), 3, null);
    }

    /* renamed from: o */
    public final void m5113o(GalleryImgBean entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        m5114p(entity);
    }

    /* renamed from: p */
    public final void m5114p(GalleryImgBean galleryImgBean) {
        this.selectedPreviewImg.setValue(galleryImgBean);
    }

    /* renamed from: q */
    public final void m5115q(boolean isRecycleBin) {
        this._isRecycleBin.setValue(Boolean.valueOf(isRecycleBin));
        m5111m();
    }

    /* renamed from: r */
    public final void m5116r(ScreenState newState, boolean needRefresh) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        this._screenState.setValue(newState);
        if (needRefresh) {
            int i6 = C6031a.f5874a[newState.ordinal()];
            if (i6 == 1 || i6 == 2) {
                m5115q(false);
            } else {
                if (i6 != 3 && i6 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                m5115q(true);
            }
        }
    }

    /* renamed from: s */
    public final void m5117s(GalleryImgBean item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (this.selectedItems.contains(item)) {
            this.selectedItems.remove(item);
        } else {
            this.selectedItems.add(item);
        }
    }

    /* renamed from: t */
    public final void m5118t() {
        this.selectedItems.clear();
    }
}
