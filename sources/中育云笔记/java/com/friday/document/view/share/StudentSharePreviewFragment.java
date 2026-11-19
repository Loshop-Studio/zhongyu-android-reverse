package com.friday.document.view.share;

import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.activity.result.ActivityResultCaller;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.friday.common.databinding.ViewNoteInfoShareToMeBinding;
import com.friday.document.R$id;
import com.friday.document.R$layout;
import com.friday.document.databinding.SharePreviewFragmentBinding;
import com.friday.document.model.ShareFile;
import com.friday.document.view.preview.EmptyPreviewFragment;
import com.friday.document.view.preview.PdfPreviewFragment;
import com.friday.document.view.preview.PicturePreviewFragment;
import com.friday.document.view.preview.TxtPreviewFragment;
import com.friday.document.view.preview.VideoPreviewFragment;
import com.friday.document.view.share.StudentSharePreviewFragment;
import com.friday.document.viewmodel.ShareBaseViewModel;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9545q;
import p244m2.C10193a;
import p244m2.C10193a.a;
import p309qc.C10786q;
import p309qc.InterfaceC10773d;
import p379vd.InterfaceC11612u;
import p383w2.InterfaceC11671b;
import sd.AbstractC11117h;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class StudentSharePreviewFragment extends Hilt_StudentSharePreviewFragment<SharePreviewFragmentBinding> {

    /* renamed from: i */
    public final InterfaceC10773d f7670i;

    /* renamed from: j */
    public final EmptyPreviewFragment f7671j = EmptyPreviewFragment.f7430d.m5929a();

    public StudentSharePreviewFragment() {
        final InterfaceC9529a interfaceC9529a = null;
        this.f7670i = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9983y.m20315b(ShareBaseViewModel.class), new InterfaceC9529a() { // from class: com.friday.document.view.share.StudentSharePreviewFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new InterfaceC9529a() { // from class: com.friday.document.view.share.StudentSharePreviewFragment$special$$inlined$activityViewModels$default$2
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
        }, new InterfaceC9529a() { // from class: com.friday.document.view.share.StudentSharePreviewFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public final ShareBaseViewModel m6115I() {
        return (ShareBaseViewModel) this.f7670i.getValue();
    }

    /* renamed from: J */
    public static final C10786q m6116J(StudentSharePreviewFragment studentSharePreviewFragment, View view, PopupWindow popupWindow, ViewNoteInfoShareToMeBinding binding) {
        String shareTime;
        AbstractC9979u.m20294g(view, "<unused var>");
        AbstractC9979u.m20294g(popupWindow, "popupWindow");
        AbstractC9979u.m20294g(binding, "binding");
        if (((ShareFile) studentSharePreviewFragment.m6115I().m6382z().getValue()) != null) {
            TextView textView = binding.f6021d;
            ShareFile shareFile = (ShareFile) studentSharePreviewFragment.m6115I().m6382z().getValue();
            if (shareFile == null || (shareTime = shareFile.getShareTime()) == null) {
                shareTime = "";
            }
            textView.setText("收到分享：" + shareTime);
            binding.f6020c.setVisibility(8);
        }
        popupWindow.dismiss();
        return C10786q.f26013a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: B */
    public final void m6126B() {
        View root = ((SharePreviewFragmentBinding) getMBinding()).f6627d.getRoot();
        AbstractC9979u.m20293f(root, "getRoot(...)");
        root.setVisibility(8);
        getChildFragmentManager().beginTransaction().replace(R$id.fragment_container, this.f7671j).commit();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m6127C(com.friday.document.model.ShareFile r6, vc.InterfaceC11588c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.friday.document.view.share.StudentSharePreviewFragment$displayMicroClass$1
            if (r0 == 0) goto L13
            r0 = r7
            com.friday.document.view.share.StudentSharePreviewFragment$displayMicroClass$1 r0 = (com.friday.document.view.share.StudentSharePreviewFragment$displayMicroClass$1) r0
            int r1 = r0.f7697g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7697g = r1
            goto L18
        L13:
            com.friday.document.view.share.StudentSharePreviewFragment$displayMicroClass$1 r0 = new com.friday.document.view.share.StudentSharePreviewFragment$displayMicroClass$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f7695e
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f7697g
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r6 = r0.f7694d
            com.friday.document.view.preview.MicroClassPreviewFragment r6 = (com.friday.document.view.preview.MicroClassPreviewFragment) r6
            java.lang.Object r0 = r0.f7693c
            com.friday.document.model.ShareFile r0 = (com.friday.document.model.ShareFile) r0
            kotlin.AbstractC9924b.m20071b(r7)
            goto La1
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            kotlin.AbstractC9924b.m20071b(r7)
            com.friday.document.view.preview.MicroClassPreviewFragment$a r7 = com.friday.document.view.preview.MicroClassPreviewFragment.f7447e
            java.lang.String r2 = r6.getCoverFilePath()
            java.lang.String r4 = r6.getDirPath()
            com.friday.document.view.preview.MicroClassPreviewFragment r7 = r7.m5943a(r2, r4)
            androidx.databinding.ViewDataBinding r2 = r5.getMBinding()
            com.friday.document.databinding.SharePreviewFragmentBinding r2 = (com.friday.document.databinding.SharePreviewFragmentBinding) r2
            com.friday.document.databinding.IncludePreviewTitleBinding r2 = r2.f6627d
            android.view.View r2 = r2.getRoot()
            java.lang.String r4 = "getRoot(...)"
            kotlin.jvm.internal.AbstractC9979u.m20293f(r2, r4)
            r4 = 0
            r2.setVisibility(r4)
            androidx.fragment.app.FragmentManager r2 = r5.getChildFragmentManager()
            androidx.fragment.app.FragmentTransaction r2 = r2.beginTransaction()
            int r4 = com.friday.document.R$id.fragment_container
            androidx.fragment.app.FragmentTransaction r2 = r2.replace(r4, r7)
            r2.commit()
            java.lang.String r2 = r6.getCoverFilePath()
            boolean r2 = com.blankj.utilcode.util.FileUtils.isFileExists(r2)
            if (r2 != 0) goto La5
            f2.c r2 = p141f2.C9166c.f21406a
            boolean r2 = r2.m18061e()
            if (r2 != 0) goto L8b
            int r6 = com.friday.document.R$string.connect_network_please
            p429z1.AbstractC11958b.m26587h(r6)
            r7.m5942y(r3)
            goto La8
        L8b:
            com.friday.document.viewmodel.ShareBaseViewModel r2 = r5.m6115I()
            java.lang.Object r4 = p409xc.AbstractC11833h.m26224a(r6)
            r0.f7693c = r4
            r0.f7694d = r7
            r0.f7697g = r3
            java.lang.Object r6 = r2.m6377u(r6, r0)
            if (r6 != r1) goto La0
            return r1
        La0:
            r6 = r7
        La1:
            r6.m5942y(r3)
            goto La8
        La5:
            r7.m5942y(r3)
        La8:
            qc.q r6 = p309qc.C10786q.f26013a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.view.share.StudentSharePreviewFragment.m6127C(com.friday.document.model.ShareFile, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/view/share/StudentSharePreviewFragment.smali:530
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: D */
    public final void m6128D(ShareFile shareFile) {
        View root = ((SharePreviewFragmentBinding) getMBinding()).f6627d.getRoot();
        AbstractC9979u.m20293f(root, "getRoot(...)");
        root.setVisibility(0);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9979u.m20293f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new StudentSharePreviewFragment$displayNote$1(this, shareFile, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: E */
    public final void m6129E(ShareFile shareFile) {
        View root = ((SharePreviewFragmentBinding) getMBinding()).f6627d.getRoot();
        AbstractC9979u.m20293f(root, "getRoot(...)");
        root.setVisibility(0);
        getChildFragmentManager().beginTransaction().replace(R$id.fragment_container, PdfPreviewFragment.f7466j.m5962a(shareFile.getOthersPath())).commit();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: F */
    public final void m6130F(ShareFile shareFile) {
        PicturePreviewFragment picturePreviewFragmentM5965a = PicturePreviewFragment.f7484d.m5965a(shareFile.getOthersPath());
        View root = ((SharePreviewFragmentBinding) getMBinding()).f6627d.getRoot();
        AbstractC9979u.m20293f(root, "getRoot(...)");
        root.setVisibility(0);
        getChildFragmentManager().beginTransaction().replace(R$id.fragment_container, picturePreviewFragmentM5965a).commit();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: G */
    public final void m6131G(ShareFile shareFile) {
        View root = ((SharePreviewFragmentBinding) getMBinding()).f6627d.getRoot();
        AbstractC9979u.m20293f(root, "getRoot(...)");
        root.setVisibility(0);
        getChildFragmentManager().beginTransaction().replace(R$id.fragment_container, TxtPreviewFragment.f7486i.m5971a(shareFile.getFileName(), shareFile.getTxtFilePath(), shareFile.getShareTime())).commit();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: H */
    public final void m6132H(ShareFile shareFile) {
        VideoPreviewFragment videoPreviewFragmentM5978a = VideoPreviewFragment.f7492j.m5978a(shareFile.getFileName(), shareFile.getFileId(), shareFile.getRealOssUrl(), shareFile.getDirPath());
        View root = ((SharePreviewFragmentBinding) getMBinding()).f6627d.getRoot();
        AbstractC9979u.m20293f(root, "getRoot(...)");
        root.setVisibility(0);
        getChildFragmentManager().beginTransaction().replace(R$id.fragment_container, videoPreviewFragmentM5978a).commit();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: K */
    public final void m6133K(ShareFile shareFile) {
        ((SharePreviewFragmentBinding) getMBinding()).f6627d.f6463f.setText(shareFile.getFileName());
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public int getLayoutId() {
        return R$layout.share_preview_fragment;
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public void initData() {
        initView();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9979u.m20293f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        InterfaceC11612u interfaceC11612uM6382z = m6115I().m6382z();
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C6082xc2ebb8ee(viewLifecycleOwner, Lifecycle.State.STARTED, interfaceC11612uM6382z, null, this), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.friday.common.base.BaseFragment
    public void initView() {
        super.initView();
        m6126B();
        ImageView ivFullScreen = ((SharePreviewFragmentBinding) getMBinding()).f6627d.f6460c;
        AbstractC9979u.m20293f(ivFullScreen, "ivFullScreen");
        ImageView ivNoteInfo = ((SharePreviewFragmentBinding) getMBinding()).f6627d.f6461d;
        AbstractC9979u.m20293f(ivNoteInfo, "ivNoteInfo");
        setClickListener(ivFullScreen, ivNoteInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.friday.common.base.BaseFragment, com.friday.common.base.InterfaceViewOnClickListenerC5928b, android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC9979u.m20294g(view, "view");
        super.onClick(view);
        if (AbstractC9979u.m20289b(view, ((SharePreviewFragmentBinding) getMBinding()).f6627d.f6460c)) {
            ActivityResultCaller activityResultCallerFindFragmentById = getChildFragmentManager().findFragmentById(R$id.fragment_container);
            if (activityResultCallerFindFragmentById instanceof InterfaceC11671b) {
                ((InterfaceC11671b) activityResultCallerFindFragmentById).mo5940i();
                return;
            }
            return;
        }
        if (AbstractC9979u.m20289b(view, ((SharePreviewFragmentBinding) getMBinding()).f6627d.f6461d)) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            AbstractC9979u.m20293f(fragmentActivityRequireActivity, "requireActivity(...)");
            C10193a.a aVar = new C10193a(fragmentActivityRequireActivity).new a();
            ViewNoteInfoShareToMeBinding viewNoteInfoShareToMeBindingM5240a = ViewNoteInfoShareToMeBinding.m5240a(getLayoutInflater());
            AbstractC9979u.m20293f(viewNoteInfoShareToMeBindingM5240a, "inflate(...)");
            aVar.m21278b(viewNoteInfoShareToMeBindingM5240a).m21280d(true).m21279c(new InterfaceC9545q() { // from class: x2.c0
                @Override // p181hd.InterfaceC9545q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return StudentSharePreviewFragment.m6116J(this.f27943c, (View) obj, (PopupWindow) obj2, (ViewNoteInfoShareToMeBinding) obj3);
                }
            }).m21277a().showAsDropDown(view, 0, 0, 80);
        }
    }
}
