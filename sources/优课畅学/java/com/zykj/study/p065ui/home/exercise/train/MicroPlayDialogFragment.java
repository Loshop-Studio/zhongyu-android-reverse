package com.zykj.study.p065ui.home.exercise.train;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
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
import com.zykj.study.databinding.DialogFragmentMicroPlayBinding;
import com.zykj.study.p065ui.home.exercise.train.MicroPlayDialogFragment;
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
public final class MicroPlayDialogFragment extends Hilt_MicroPlayDialogFragment<DialogFragmentMicroPlayBinding> {

    /* renamed from: f */
    public final NavArgsLazy f12296f = new NavArgsLazy(AbstractC9137y.m16154b(MicroPlayDialogFragmentArgs.class), new C7866c(this));

    /* renamed from: com.zykj.study.ui.home.exercise.train.MicroPlayDialogFragment$a */
    public static final /* synthetic */ class C7864a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12297a;

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
            f12297a = iArr;
        }
    }

    /* renamed from: com.zykj.study.ui.home.exercise.train.MicroPlayDialogFragment$b */
    public static final class C7865b implements Observer, InterfaceC9129q {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10570l f12298a;

        public C7865b(InterfaceC10570l function) {
            AbstractC9133u.m16133g(function, "function");
            this.f12298a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9129q)) {
                return AbstractC9133u.m16128b(getFunctionDelegate(), ((InterfaceC9129q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9129q
        public final InterfaceC8723c getFunctionDelegate() {
            return this.f12298a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12298a.invoke(obj);
        }
    }

    /* renamed from: com.zykj.study.ui.home.exercise.train.MicroPlayDialogFragment$c */
    public static final class C7866c implements InterfaceC10559a {

        /* renamed from: a */
        public final /* synthetic */ Fragment f12299a;

        public C7866c(Fragment fragment) {
            this.f12299a = fragment;
        }

        @Override // p300x7.InterfaceC10559a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f12299a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f12299a + " has null arguments");
        }
    }

    /* renamed from: n */
    public static final void m10877n(WorkManager workManager, String str, final MicroPlayDialogFragment microPlayDialogFragment, final SketchPlayFragment sketchPlayFragment, final DialogInterface dialogInterface) {
        workManager.getWorkInfosForUniqueWorkLiveData(str).observe(microPlayDialogFragment.getViewLifecycleOwner(), new C7865b(new InterfaceC10570l() { // from class: x4.z
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return MicroPlayDialogFragment.m10878o(dialogInterface, microPlayDialogFragment, sketchPlayFragment, (List) obj);
            }
        }));
    }

    /* renamed from: o */
    public static final C8736p m10878o(DialogInterface dialogInterface, MicroPlayDialogFragment microPlayDialogFragment, SketchPlayFragment sketchPlayFragment, List list) {
        AbstractC9133u.m16130d(list);
        WorkInfo workInfo = (WorkInfo) AbstractC8778f0.m14568n0(list);
        if (workInfo != null) {
            int i10 = C7864a.f12297a[workInfo.getState().ordinal()];
            if (i10 == 1) {
                dialogInterface.dismiss();
                String string = workInfo.getOutputData().getString(OssUtils.SUCCESS_KEY);
                if (string != null) {
                    File file = new File(string);
                    File file2 = new File(file.getParentFile(), AbstractC10123h.m18879f(file));
                    AbstractC5376m0.m2582b(file, file2);
                    String absolutePath = file2.getAbsolutePath();
                    AbstractC9133u.m16132f(absolutePath, "getAbsolutePath(...)");
                    microPlayDialogFragment.m10885u(sketchPlayFragment, absolutePath);
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
    public static final void m10879p(WorkManager workManager, OneTimeWorkRequest oneTimeWorkRequest, DialogInterface dialogInterface) {
        workManager.cancelWorkById(oneTimeWorkRequest.getId());
    }

    /* renamed from: r */
    public static final C8736p m10880r(MicroPlayDialogFragment microPlayDialogFragment) {
        FragmentKt.findNavController(microPlayDialogFragment).navigateUp();
        return C8736p.f16368a;
    }

    /* renamed from: s */
    public static final C8736p m10881s() {
        return C8736p.f16368a;
    }

    /* renamed from: t */
    public static final C8736p m10882t() {
        return C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseDialogFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        Fragment fragmentFindFragmentById = getChildFragmentManager().findFragmentById(R$id.sketch_play_fragment);
        AbstractC9133u.m16131e(fragmentFindFragmentById, "null cannot be cast to non-null type com.zykj.view.board.play.SketchPlayFragment");
        SketchPlayFragment sketchPlayFragment = (SketchPlayFragment) fragmentFindFragmentById;
        sketchPlayFragment.m13138h0(new C10014a(false, new InterfaceC10559a() { // from class: x4.u
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return MicroPlayDialogFragment.m10880r(this.f20961a);
            }
        }, new InterfaceC10559a() { // from class: x4.v
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return MicroPlayDialogFragment.m10881s();
            }
        }, false, new InterfaceC10559a() { // from class: x4.w
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return MicroPlayDialogFragment.m10882t();
            }
        }, null, null, null, true, false, 736, null));
        if (new File(m10884q().m10887a()).exists()) {
            m10885u(sketchPlayFragment, m10884q().m10887a());
        } else if (URLUtil.isNetworkUrl(m10884q().m10887a())) {
            OssUtils ossUtils = OssUtils.INSTANCE;
            Context contextRequireContext = requireContext();
            AbstractC9133u.m16132f(contextRequireContext, "requireContext(...)");
            File file = new File(ossUtils.checkDownloadDir(contextRequireContext, m10884q().m10887a()), AbstractC10123h.m18879f(new File(ossUtils.checkFileName(null, m10884q().m10887a()))));
            if (file.exists()) {
                String absolutePath = file.getAbsolutePath();
                AbstractC9133u.m16132f(absolutePath, "getAbsolutePath(...)");
                m10885u(sketchPlayFragment, absolutePath);
            } else {
                m10883m(sketchPlayFragment, m10884q().m10887a());
            }
        } else {
            AbstractC8366o.m13652d(XToastUtils.INSTANCE, "文件不存在 " + m10884q().m10887a());
        }
        return C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseDialogFragment
    public int layoutId() {
        return R$layout.dialog_fragment_micro_play;
    }

    /* renamed from: m */
    public final void m10883m(final SketchPlayFragment sketchPlayFragment, final String str) {
        final OneTimeWorkRequest oneTimeWorkRequestBuild = new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) DownloadFileCommonWork.class).setInputData(DownloadFileCommonWork.C7280a.m9199b(DownloadFileCommonWork.Companion, str, null, null, 6, null)).build();
        WorkManager.Companion companion = WorkManager.Companion;
        Context contextRequireContext = requireContext();
        AbstractC9133u.m16132f(contextRequireContext, "requireContext(...)");
        final WorkManager companion2 = companion.getInstance(contextRequireContext);
        companion2.enqueueUniqueWork(str, ExistingWorkPolicy.KEEP, oneTimeWorkRequestBuild);
        new MaterialDialog.C6913g(requireContext()).m6749j(getString(R$string.downloading_wait)).m6750k(GravityEnum.CENTER).m6732C(false, 100, true).m6743d(new DialogInterface.OnCancelListener() { // from class: x4.x
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                MicroPlayDialogFragment.m10879p(companion2, oneTimeWorkRequestBuild, dialogInterface);
            }
        }).m6735F(new DialogInterface.OnShowListener() { // from class: x4.y
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                MicroPlayDialogFragment.m10877n(companion2, str, this, sketchPlayFragment, dialogInterface);
            }
        }).m6759t(R$string.cancel).m6734E();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        Window window;
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setCancelable(true);
        }
        Dialog dialog3 = getDialog();
        if (dialog3 != null) {
            dialog3.setCanceledOnTouchOutside(false);
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        window.setAttributes(attributes);
    }

    /* renamed from: q */
    public final MicroPlayDialogFragmentArgs m10884q() {
        return (MicroPlayDialogFragmentArgs) this.f12296f.getValue();
    }

    /* renamed from: u */
    public final void m10885u(SketchPlayFragment sketchPlayFragment, String str) {
        SketchPlayFragment.m13104e0(sketchPlayFragment, str, 0, false, null, null, 30, null);
    }
}
