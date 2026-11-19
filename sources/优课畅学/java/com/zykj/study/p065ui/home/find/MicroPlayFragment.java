package com.zykj.study.p065ui.home.find;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.webkit.URLUtil;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.navigation.NavArgsLazy;
import androidx.navigation.fragment.FragmentKt;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import com.blankj.utilcode.util.AbstractC5376m0;
import com.xuexiang.xui.widget.dialog.materialdialog.GravityEnum;
import com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog;
import com.zykj.base.utils.XToastUtils;
import com.zykj.download.OssUtils;
import com.zykj.download.work.DownloadFileCommonWork;
import com.zykj.lib.error.code.ErrorCodeHandler;
import com.zykj.study.R$id;
import com.zykj.study.R$layout;
import com.zykj.study.R$string;
import com.zykj.study.databinding.FragmentMicroPlayBinding;
import com.zykj.study.p065ui.home.find.MicroPlayFragment;
import com.zykj.view.board.play.SketchPlayFragment;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import kotlin.jvm.internal.InterfaceC9129q;
import p086e5.AbstractC8366o;
import p123h7.C8736p;
import p123h7.InterfaceC8723c;
import p134i7.AbstractC8778f0;
import p179m7.InterfaceC9324c;
import p243s5.C10014a;
import p256t7.AbstractC10123h;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class MicroPlayFragment extends Hilt_MicroPlayFragment<FragmentMicroPlayBinding> {

    /* renamed from: f */
    public final NavArgsLazy f12665f = new NavArgsLazy(AbstractC9137y.m16154b(MicroPlayFragmentArgs.class), new C7953c(this));

    /* renamed from: com.zykj.study.ui.home.find.MicroPlayFragment$a */
    public static final /* synthetic */ class C7951a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12666a;

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
            f12666a = iArr;
        }
    }

    /* renamed from: com.zykj.study.ui.home.find.MicroPlayFragment$b */
    public static final class C7952b implements Observer, InterfaceC9129q {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10570l f12667a;

        public C7952b(InterfaceC10570l function) {
            AbstractC9133u.m16133g(function, "function");
            this.f12667a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9129q)) {
                return AbstractC9133u.m16128b(getFunctionDelegate(), ((InterfaceC9129q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9129q
        public final InterfaceC8723c getFunctionDelegate() {
            return this.f12667a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12667a.invoke(obj);
        }
    }

    /* renamed from: com.zykj.study.ui.home.find.MicroPlayFragment$c */
    public static final class C7953c implements InterfaceC10559a {

        /* renamed from: a */
        public final /* synthetic */ Fragment f12668a;

        public C7953c(Fragment fragment) {
            this.f12668a = fragment;
        }

        @Override // p300x7.InterfaceC10559a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f12668a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f12668a + " has null arguments");
        }
    }

    /* renamed from: m */
    private final void m11130m(final SketchPlayFragment sketchPlayFragment, final String str) {
        final OneTimeWorkRequest oneTimeWorkRequestBuild = new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) DownloadFileCommonWork.class).setInputData(DownloadFileCommonWork.C7280a.m9199b(DownloadFileCommonWork.Companion, str, null, null, 6, null)).build();
        WorkManager.Companion companion = WorkManager.Companion;
        Context contextRequireContext = requireContext();
        AbstractC9133u.m16132f(contextRequireContext, "requireContext(...)");
        final WorkManager companion2 = companion.getInstance(contextRequireContext);
        companion2.enqueueUniqueWork(str, ExistingWorkPolicy.KEEP, oneTimeWorkRequestBuild);
        new MaterialDialog.C6913g(requireContext()).m6749j(getString(R$string.downloading_wait)).m6750k(GravityEnum.CENTER).m6732C(false, 100, true).m6743d(new DialogInterface.OnCancelListener() { // from class: y4.i0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                MicroPlayFragment.m11133p(companion2, oneTimeWorkRequestBuild, dialogInterface);
            }
        }).m6735F(new DialogInterface.OnShowListener() { // from class: y4.j0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                MicroPlayFragment.m11131n(companion2, str, this, sketchPlayFragment, dialogInterface);
            }
        }).m6759t(R$string.cancel).m6734E();
    }

    /* renamed from: n */
    public static final void m11131n(WorkManager workManager, String str, final MicroPlayFragment microPlayFragment, final SketchPlayFragment sketchPlayFragment, final DialogInterface dialogInterface) {
        workManager.getWorkInfosForUniqueWorkLiveData(str).observe(microPlayFragment.getViewLifecycleOwner(), new C7952b(new InterfaceC10570l() { // from class: y4.k0
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return MicroPlayFragment.m11132o(dialogInterface, microPlayFragment, sketchPlayFragment, (List) obj);
            }
        }));
    }

    /* renamed from: o */
    public static final C8736p m11132o(DialogInterface dialogInterface, MicroPlayFragment microPlayFragment, SketchPlayFragment sketchPlayFragment, List list) {
        AbstractC9133u.m16130d(list);
        WorkInfo workInfo = (WorkInfo) AbstractC8778f0.m14568n0(list);
        if (workInfo != null) {
            int i10 = C7951a.f12666a[workInfo.getState().ordinal()];
            if (i10 == 1) {
                dialogInterface.dismiss();
                String string = workInfo.getOutputData().getString(OssUtils.SUCCESS_KEY);
                if (string != null) {
                    File file = new File(string);
                    File file2 = new File(file.getParentFile(), AbstractC10123h.m18879f(file));
                    AbstractC5376m0.m2582b(file, file2);
                    String absolutePath = file2.getAbsolutePath();
                    AbstractC9133u.m16132f(absolutePath, "getAbsolutePath(...)");
                    microPlayFragment.m11137u(sketchPlayFragment, absolutePath);
                }
            } else if (i10 != 2) {
                AbstractC9133u.m16131e(dialogInterface, "null cannot be cast to non-null type com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog");
                ((MaterialDialog) dialogInterface).m6725t(workInfo.getProgress().getInt("progress", 0));
            } else {
                Integer messageResId = ErrorCodeHandler.INSTANCE.getErrorCode(workInfo.getOutputData().getInt(OssUtils.ERROR_KEY, 0)).getErrorCodeInfo().getMessageResId();
                if (messageResId != null) {
                    AbstractC8366o.m13651c(XToastUtils.INSTANCE, messageResId.intValue());
                }
                dialogInterface.dismiss();
            }
        }
        return C8736p.f16368a;
    }

    /* renamed from: p */
    public static final void m11133p(WorkManager workManager, OneTimeWorkRequest oneTimeWorkRequest, DialogInterface dialogInterface) {
        workManager.cancelWorkById(oneTimeWorkRequest.getId());
    }

    /* renamed from: r */
    public static final C8736p m11134r(MicroPlayFragment microPlayFragment) {
        FragmentKt.findNavController(microPlayFragment).navigateUp();
        return C8736p.f16368a;
    }

    /* renamed from: s */
    public static final C8736p m11135s() {
        return C8736p.f16368a;
    }

    /* renamed from: t */
    public static final C8736p m11136t() {
        return C8736p.f16368a;
    }

    /* renamed from: u */
    private final void m11137u(SketchPlayFragment sketchPlayFragment, String str) {
        SketchPlayFragment.m13104e0(sketchPlayFragment, str, 0, false, null, null, 30, null);
    }

    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        Fragment fragmentFindFragmentById = getChildFragmentManager().findFragmentById(R$id.sketch_play_fragment);
        AbstractC9133u.m16131e(fragmentFindFragmentById, "null cannot be cast to non-null type com.zykj.view.board.play.SketchPlayFragment");
        SketchPlayFragment sketchPlayFragment = (SketchPlayFragment) fragmentFindFragmentById;
        sketchPlayFragment.m13138h0(new C10014a(false, new InterfaceC10559a() { // from class: y4.f0
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return MicroPlayFragment.m11134r(this.f21082a);
            }
        }, new InterfaceC10559a() { // from class: y4.g0
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return MicroPlayFragment.m11135s();
            }
        }, false, new InterfaceC10559a() { // from class: y4.h0
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return MicroPlayFragment.m11136t();
            }
        }, null, null, null, true, false, 736, null));
        if (new File(m11138q().m11140a()).exists()) {
            m11137u(sketchPlayFragment, m11138q().m11140a());
        } else if (URLUtil.isNetworkUrl(m11138q().m11140a())) {
            OssUtils ossUtils = OssUtils.INSTANCE;
            Context contextRequireContext = requireContext();
            AbstractC9133u.m16132f(contextRequireContext, "requireContext(...)");
            File file = new File(ossUtils.checkDownloadDir(contextRequireContext, m11138q().m11140a()), AbstractC10123h.m18879f(new File(ossUtils.checkFileName(null, m11138q().m11140a()))));
            if (file.exists()) {
                String absolutePath = file.getAbsolutePath();
                AbstractC9133u.m16132f(absolutePath, "getAbsolutePath(...)");
                m11137u(sketchPlayFragment, absolutePath);
            } else {
                m11130m(sketchPlayFragment, m11138q().m11140a());
            }
        } else {
            AbstractC8366o.m13652d(XToastUtils.INSTANCE, "文件不存在 " + m11138q().m11140a());
        }
        return C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.fragment_micro_play;
    }

    /* renamed from: q */
    public final MicroPlayFragmentArgs m11138q() {
        return (MicroPlayFragmentArgs) this.f12665f.getValue();
    }
}
