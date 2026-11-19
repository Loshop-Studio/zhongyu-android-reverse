package com.zykj.study.p065ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.URLUtil;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.navigation.NavArgsLazy;
import androidx.navigation.fragment.FragmentKt;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import com.xuexiang.xui.widget.dialog.materialdialog.GravityEnum;
import com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog;
import com.zykj.download.OssUtils;
import com.zykj.download.work.DownloadFileCommonWork;
import com.zykj.lib.p063ui.R$dimen;
import com.zykj.study.R$color;
import com.zykj.study.R$layout;
import com.zykj.study.R$string;
import com.zykj.study.databinding.FragmentOpenFileBinding;
import com.zykj.study.p065ui.OpenFileFragment;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import kotlin.jvm.internal.InterfaceC9129q;
import p113g8.AbstractC8661c0;
import p113g8.AbstractC8687z;
import p123h7.C8736p;
import p123h7.InterfaceC8723c;
import p134i7.AbstractC8778f0;
import p135i8.AbstractC8833f;
import p135i8.AbstractC8839h;
import p135i8.C8843i0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class OpenFileFragment extends Hilt_OpenFileFragment<FragmentOpenFileBinding> {

    /* renamed from: h */
    public static final C7762a f11658h = new C7762a(null);

    /* renamed from: i */
    public static final int f11659i = 8;

    /* renamed from: f */
    public final NavArgsLazy f11660f = new NavArgsLazy(AbstractC9137y.m16154b(OpenFileFragmentArgs.class), new C7765d(this));

    /* renamed from: g */
    public final HashMap f11661g = new HashMap();

    /* renamed from: com.zykj.study.ui.OpenFileFragment$a */
    public static final class C7762a {
        public /* synthetic */ C7762a(AbstractC9126n abstractC9126n) {
            this();
        }

        public C7762a() {
        }
    }

    /* renamed from: com.zykj.study.ui.OpenFileFragment$b */
    public static final /* synthetic */ class C7763b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11662a;

        static {
            int[] iArr = new int[WorkInfo.State.values().length];
            try {
                iArr[WorkInfo.State.SUCCEEDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WorkInfo.State.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f11662a = iArr;
        }
    }

    /* renamed from: com.zykj.study.ui.OpenFileFragment$c */
    public static final class C7764c implements Observer, InterfaceC9129q {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10570l f11663a;

        public C7764c(InterfaceC10570l function) {
            AbstractC9133u.m16133g(function, "function");
            this.f11663a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9129q)) {
                return AbstractC9133u.m16128b(getFunctionDelegate(), ((InterfaceC9129q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9129q
        public final InterfaceC8723c getFunctionDelegate() {
            return this.f11663a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f11663a.invoke(obj);
        }
    }

    /* renamed from: com.zykj.study.ui.OpenFileFragment$d */
    public static final class C7765d implements InterfaceC10559a {

        /* renamed from: a */
        public final /* synthetic */ Fragment f11664a;

        public C7765d(Fragment fragment) {
            this.f11664a = fragment;
        }

        @Override // p300x7.InterfaceC10559a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f11664a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f11664a + " has null arguments");
        }
    }

    /* renamed from: q */
    public static final void m10473q(WorkManager workManager, OneTimeWorkRequest oneTimeWorkRequest, DialogInterface dialogInterface) {
        workManager.cancelWorkById(oneTimeWorkRequest.getId());
    }

    /* renamed from: r */
    public static final void m10474r(WorkManager workManager, final String str, final OpenFileFragment openFileFragment, final String str2, final DialogInterface dialogInterface) {
        workManager.getWorkInfosForUniqueWorkLiveData(str).observe(openFileFragment.getViewLifecycleOwner(), new C7764c(new InterfaceC10570l() { // from class: u4.n
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return OpenFileFragment.m10475s(dialogInterface, str, str2, openFileFragment, (List) obj);
            }
        }));
    }

    /* renamed from: s */
    public static final C8736p m10475s(DialogInterface dialogInterface, String str, String str2, OpenFileFragment openFileFragment, List list) throws Resources.NotFoundException {
        AbstractC9133u.m16130d(list);
        WorkInfo workInfo = (WorkInfo) AbstractC8778f0.m14568n0(list);
        if (workInfo != null) {
            int i10 = C7763b.f11662a[workInfo.getState().ordinal()];
            if (i10 == 1) {
                dialogInterface.dismiss();
                String string = workInfo.getOutputData().getString(OssUtils.SUCCESS_KEY);
                if (string != null) {
                    openFileFragment.m10479o(string);
                }
            } else if (i10 != 2) {
                AbstractC9133u.m16131e(dialogInterface, "null cannot be cast to non-null type com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog");
                ((MaterialDialog) dialogInterface).m6725t(workInfo.getProgress().getInt("progress", 0));
            } else if (AbstractC9133u.m16128b(str, str2)) {
                LifecycleOwner viewLifecycleOwner = openFileFragment.getViewLifecycleOwner();
                AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new OpenFileFragment$downloadFile$2$1$1$3(openFileFragment, workInfo, dialogInterface, null), 3, null);
            } else {
                LifecycleOwner viewLifecycleOwner2 = openFileFragment.getViewLifecycleOwner();
                AbstractC9133u.m16132f(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new OpenFileFragment$downloadFile$2$1$1$2(openFileFragment, str2, workInfo, dialogInterface, null), 3, null);
            }
        }
        return C8736p.f16368a;
    }

    /* renamed from: t */
    public static final Object m10476t(WorkInfo workInfo, DialogInterface dialogInterface, InterfaceC9324c interfaceC9324c) {
        Object objM14848g = AbstractC8833f.m14848g(C8843i0.m14868c(), new OpenFileFragment$downloadFile$showError$2(workInfo, dialogInterface, null), interfaceC9324c);
        return objM14848g == AbstractC9434a.m17291f() ? objM14848g : C8736p.f16368a;
    }

    /* renamed from: x */
    public static final void m10477x(OpenFileFragment openFileFragment, View view) {
        FragmentKt.findNavController(openFileFragment).navigateUp();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) throws Resources.NotFoundException {
        ((FragmentOpenFileBinding) getMBindView()).toolbar.m6539t(getString(R$string.preview)).m6535p(getString(R$string.arrow_left_return)).m6537r(ContextCompat.getColor(requireContext(), R$color.toolbar_back_icon_color)).m6538s(getResources().getDimensionPixelSize(R$dimen.text_9)).m6533n(new View.OnClickListener() { // from class: u4.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OpenFileFragment.m10477x(this.f20311a, view);
            }
        });
        m10478n(m10482v().m10486b());
        return C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.fragment_open_file;
    }

    /* renamed from: n */
    public final void m10478n(String str) throws Resources.NotFoundException {
        if (URLUtil.isNetworkUrl(str)) {
            m10480p(str);
        } else {
            m10479o(str);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        if (r2.equals("jpeg") == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        if (r2.equals("epub") == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        if (r2.equals("docx") == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        if (r2.equals("xls") != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
    
        if (r2.equals("txt") == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        if (r2.equals("ppt") == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
    
        if (r2.equals("png") == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0087, code lost:
    
        if (r2.equals("pdf") == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0090, code lost:
    
        if (r2.equals("jpg") == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0099, code lost:
    
        if (r2.equals("gif") == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a2, code lost:
    
        if (r2.equals("doc") == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a5, code lost:
    
        r1.setStartDestination(com.zykj.study.R$id.pdfFragment);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b1, code lost:
    
        if (r2.equals("bmp") == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d1, code lost:
    
        r1.setStartDestination(com.zykj.study.R$id.imageFragment);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d6, code lost:
    
        r0.getNavController().setGraph(r1, m10482v().m10485a(r5).m10487c());
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        if (r2.equals("xlsx") == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003c, code lost:
    
        if (r2.equals("pptx") == false) goto L47;
     */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m10479o(java.lang.String r5) throws android.content.res.Resources.NotFoundException {
        /*
            r4 = this;
            androidx.fragment.app.FragmentManager r0 = r4.getChildFragmentManager()
            int r1 = com.zykj.study.R$id.nav_file_fragment
            androidx.fragment.app.Fragment r0 = r0.findFragmentById(r1)
            java.lang.String r1 = "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment"
            kotlin.jvm.internal.AbstractC9133u.m16131e(r0, r1)
            androidx.navigation.fragment.NavHostFragment r0 = (androidx.navigation.fragment.NavHostFragment) r0
            androidx.navigation.NavController r1 = r0.getNavController()
            androidx.navigation.NavInflater r1 = r1.getNavInflater()
            int r2 = com.zykj.study.R$navigation.nav_file
            androidx.navigation.NavGraph r1 = r1.inflate(r2)
            java.lang.String r2 = r4.m10483w(r5)
            int r3 = r2.hashCode()
            switch(r3) {
                case 97669: goto Lab;
                case 99640: goto L9c;
                case 102340: goto L93;
                case 105441: goto L8a;
                case 110834: goto L81;
                case 111145: goto L78;
                case 111220: goto L6f;
                case 115312: goto L66;
                case 118783: goto L5d;
                case 3088960: goto L54;
                case 3120248: goto L4a;
                case 3268712: goto L40;
                case 3447940: goto L36;
                case 3682393: goto L2c;
                default: goto L2a;
            }
        L2a:
            goto Lb3
        L2c:
            java.lang.String r3 = "xlsx"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto La5
            goto Lb3
        L36:
            java.lang.String r3 = "pptx"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto La5
            goto Lb3
        L40:
            java.lang.String r3 = "jpeg"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto Ld1
            goto Lb3
        L4a:
            java.lang.String r3 = "epub"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto La5
            goto Lb3
        L54:
            java.lang.String r3 = "docx"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto La5
            goto Lb3
        L5d:
            java.lang.String r3 = "xls"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto Lb3
            goto La5
        L66:
            java.lang.String r3 = "txt"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto La5
            goto Lb3
        L6f:
            java.lang.String r3 = "ppt"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto La5
            goto Lb3
        L78:
            java.lang.String r3 = "png"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto Ld1
            goto Lb3
        L81:
            java.lang.String r3 = "pdf"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto La5
            goto Lb3
        L8a:
            java.lang.String r3 = "jpg"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto Ld1
            goto Lb3
        L93:
            java.lang.String r3 = "gif"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto Ld1
            goto Lb3
        L9c:
            java.lang.String r3 = "doc"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto La5
            goto Lb3
        La5:
            int r2 = com.zykj.study.R$id.pdfFragment
            r1.setStartDestination(r2)
            goto Ld6
        Lab:
            java.lang.String r3 = "bmp"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto Ld1
        Lb3:
            com.zykj.base.utils.XToastUtils r5 = com.zykj.base.utils.XToastUtils.INSTANCE
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "不支持的文件类型:"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            p086e5.AbstractC8366o.m13652d(r5, r0)
            androidx.navigation.NavController r5 = androidx.navigation.fragment.FragmentKt.findNavController(r4)
            r5.navigateUp()
            return
        Ld1:
            int r2 = com.zykj.study.R$id.imageFragment
            r1.setStartDestination(r2)
        Ld6:
            androidx.navigation.NavController r0 = r0.getNavController()
            com.zykj.study.ui.OpenFileFragmentArgs r2 = r4.m10482v()
            com.zykj.study.ui.OpenFileFragmentArgs r5 = r2.m10485a(r5)
            android.os.Bundle r5 = r5.m10487c()
            r0.setGraph(r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.p065ui.OpenFileFragment.m10479o(java.lang.String):void"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/ui/OpenFileFragment.smali:846
    }

    /* renamed from: p */
    public final void m10480p(String str) {
        final String str2;
        final String strM13951B0;
        if (m10481u(str, "doc", "docx", "ppt", "pptx", "xls", "xlsx", "pdf")) {
            str2 = str;
            strM13951B0 = AbstractC8661c0.m13951B0(str2, ".", "pdf", null, 4, null);
        } else {
            str2 = str;
            strM13951B0 = str2;
        }
        final OneTimeWorkRequest oneTimeWorkRequestBuild = new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) DownloadFileCommonWork.class).setInputData(DownloadFileCommonWork.C7280a.m9199b(DownloadFileCommonWork.Companion, strM13951B0, null, null, 6, null)).build();
        WorkManager.Companion companion = WorkManager.Companion;
        Context contextRequireContext = requireContext();
        AbstractC9133u.m16132f(contextRequireContext, "requireContext(...)");
        final WorkManager companion2 = companion.getInstance(contextRequireContext);
        companion2.enqueueUniqueWork(strM13951B0, ExistingWorkPolicy.KEEP, oneTimeWorkRequestBuild);
        new MaterialDialog.C6913g(requireContext()).m6749j(getString(R$string.downloading_wait)).m6750k(GravityEnum.CENTER).m6732C(false, 100, true).m6745f(false).m6744e(true).m6743d(new DialogInterface.OnCancelListener() { // from class: u4.l
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                OpenFileFragment.m10473q(companion2, oneTimeWorkRequestBuild, dialogInterface);
            }
        }).m6735F(new DialogInterface.OnShowListener() { // from class: u4.m
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                OpenFileFragment.m10474r(companion2, strM13951B0, this, str2, dialogInterface);
            }
        }).m6759t(R$string.cancel).m6734E();
    }

    /* renamed from: u */
    public final boolean m10481u(String str, String... strArr) {
        for (String str2 : strArr) {
            if (AbstractC8687z.m14111z(str, str2, false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: v */
    public final OpenFileFragmentArgs m10482v() {
        return (OpenFileFragmentArgs) this.f11660f.getValue();
    }

    /* renamed from: w */
    public final String m10483w(String str) {
        int iM13996k0;
        if (TextUtils.isEmpty(str) || (iM13996k0 = AbstractC8661c0.m13996k0(str, '.', 0, false, 6, null)) <= -1) {
            return "";
        }
        String strSubstring = str.substring(iM13996k0 + 1);
        AbstractC9133u.m16132f(strSubstring, "substring(...)");
        return strSubstring;
    }
}
