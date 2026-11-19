package com.friday.document.view.viewer;

import android.R;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager2.widget.ViewPager2;
import com.friday.common.base.BaseDialogFragment;
import com.friday.document.R$layout;
import com.friday.document.adapter.ImagePagerAdapter;
import com.friday.document.databinding.DialogImageViewPagerBinding;
import com.friday.document.model.ShareFile;
import com.friday.document.view.viewer.ImagePreviewDialogFragment;
import com.friday.document.viewmodel.ShareBaseViewModel;
import gb.AbstractC9286b;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p265nd.AbstractC10410o;
import p309qc.C10786q;
import p309qc.InterfaceC10773d;
import p325rc.AbstractC10947g0;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class ImagePreviewDialogFragment extends BaseDialogFragment<DialogImageViewPagerBinding> {

    /* renamed from: f */
    public final InterfaceC10773d f7742f;

    /* renamed from: g */
    public boolean f7743g = true;

    /* renamed from: h */
    public ShareFile f7744h;

    /* renamed from: i */
    public ImagePagerAdapter f7745i;

    public ImagePreviewDialogFragment() {
        final InterfaceC9529a interfaceC9529a = null;
        this.f7742f = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9983y.m20315b(ShareBaseViewModel.class), new InterfaceC9529a() { // from class: com.friday.document.view.viewer.ImagePreviewDialogFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new InterfaceC9529a() { // from class: com.friday.document.view.viewer.ImagePreviewDialogFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC9529a interfaceC9529a2 = interfaceC9529a;
                return (interfaceC9529a2 == null || (creationExtras = (CreationExtras) interfaceC9529a2.invoke()) == null) ? this.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
            }
        }, new InterfaceC9529a() { // from class: com.friday.document.view.viewer.ImagePreviewDialogFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
    }

    /* renamed from: A */
    public static final C10786q m6155A(ImagePreviewDialogFragment imagePreviewDialogFragment, View it) {
        AbstractC9979u.m20294g(it, "it");
        imagePreviewDialogFragment.m6167x();
        return C10786q.f26013a;
    }

    /* renamed from: B */
    public static final boolean m6156B(ImagePreviewDialogFragment imagePreviewDialogFragment, DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        if (i10 != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        imagePreviewDialogFragment.m6167x();
        return true;
    }

    private final void initClick() {
        TextView tvFinish = ((DialogImageViewPagerBinding) getMBinding()).f6336c;
        AbstractC9979u.m20293f(tvFinish, "tvFinish");
        AbstractC9286b.m18309e(tvFinish, new InterfaceC9540l() { // from class: y2.d
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ImagePreviewDialogFragment.m6155A(this.f28207c, (View) obj);
            }
        });
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: y2.e
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
                    return ImagePreviewDialogFragment.m6156B(this.f28208c, dialogInterface, i10, keyEvent);
                }
            });
        }
    }

    /* renamed from: u */
    public static final /* synthetic */ DialogImageViewPagerBinding m6161u(ImagePreviewDialogFragment imagePreviewDialogFragment) {
        return (DialogImageViewPagerBinding) imagePreviewDialogFragment.getMBinding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public final ShareBaseViewModel m6163w() {
        return (ShareBaseViewModel) this.f7742f.getValue();
    }

    /* renamed from: y */
    private final void m6164y() {
        this.f7744h = (ShareFile) m6163w().m6382z().getValue();
        List list = (List) m6163w().m6366C().getValue();
        TextView textView = ((DialogImageViewPagerBinding) getMBinding()).f6336c;
        ShareFile shareFile = this.f7744h;
        ImagePagerAdapter imagePagerAdapter = null;
        textView.setText(shareFile != null ? shareFile.getFileName() : null);
        ShareFile shareFile2 = this.f7744h;
        if (shareFile2 == null) {
            shareFile2 = (ShareFile) AbstractC10947g0.m23946o0(list);
        }
        int iM21752e = AbstractC10410o.m21752e(AbstractC10947g0.m23949r0(list, shareFile2), 0);
        this.f7745i = new ImagePagerAdapter(list, new InterfaceC9529a() { // from class: y2.c
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return ImagePreviewDialogFragment.m6165z(this.f28206c);
            }
        });
        ViewPager2 viewPager2 = ((DialogImageViewPagerBinding) getMBinding()).f6337d;
        ImagePagerAdapter imagePagerAdapter2 = this.f7745i;
        if (imagePagerAdapter2 == null) {
            AbstractC9979u.m20312y("adapter");
        } else {
            imagePagerAdapter = imagePagerAdapter2;
        }
        viewPager2.setAdapter(imagePagerAdapter);
        ((DialogImageViewPagerBinding) getMBinding()).f6337d.setCurrentItem(iM21752e, false);
        ((DialogImageViewPagerBinding) getMBinding()).f6337d.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() { // from class: com.friday.document.view.viewer.ImagePreviewDialogFragment$init$2
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int i10) {
                super.onPageSelected(i10);
                List list2 = (List) this.f7750a.m6163w().m6366C().getValue();
                if (i10 < 0 || i10 >= list2.size()) {
                    return;
                }
                ShareFile shareFile3 = (ShareFile) list2.get(i10);
                this.f7750a.f7744h = shareFile3;
                String fileId = shareFile3.getFileId();
                ImagePreviewDialogFragment.m6161u(this.f7750a).f6336c.setText(shareFile3.getFileName());
                this.f7750a.m6163w().m6371I(fileId);
            }
        });
        initClick();
    }

    /* renamed from: z */
    public static final C10786q m6165z(ImagePreviewDialogFragment imagePreviewDialogFragment) {
        imagePreviewDialogFragment.m6166C();
        return C10786q.f26013a;
    }

    /* renamed from: C */
    public final void m6166C() {
        this.f7743g = !this.f7743g;
        TextView tvFinish = ((DialogImageViewPagerBinding) getMBinding()).f6336c;
        AbstractC9979u.m20293f(tvFinish, "tvFinish");
        tvFinish.setVisibility(this.f7743g ? 0 : 8);
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public int getLayoutId() {
        return R$layout.dialog_image_view_pager;
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public void initData() {
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.Theme.Black.NoTitleBar.Fullscreen);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        AbstractC9979u.m20294g(view, "view");
        super.onViewCreated(view, bundle);
        m6164y();
    }

    /* renamed from: x */
    public final void m6167x() {
        ShareFile shareFile = this.f7744h;
        if (shareFile != null) {
            m6163w().m6369F(shareFile);
        }
        dismiss();
    }
}
