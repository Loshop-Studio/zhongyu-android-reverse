package com.friday.main.view;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import com.blankj.utilcode.util.AppUtils;
import com.friday.main.R$color;
import com.friday.main.R$dimen;
import com.friday.main.R$layout;
import com.friday.main.R$style;
import com.friday.main.databinding.DialogVersionUpdateBinding;
import com.friday.main.model.Result;
import com.friday.main.model.VersionUpdate;
import com.friday.main.view.AppUpdateDialog;
import com.friday.main.viewmodel.HomeViewModel;
import com.zykj.download.OssUtils;
import com.zykj.download.work.DownloadFileCommonWork;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import kotlin.jvm.internal.InterfaceC9975q;
import p126e2.C9072a;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p309qc.InterfaceC10772c;
import p309qc.InterfaceC10773d;
import p325rc.AbstractC10947g0;
import p429z1.AbstractC11958b;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class AppUpdateDialog extends Hilt_AppUpdateDialog<DialogVersionUpdateBinding> {

    /* renamed from: k */
    public final InterfaceC10773d f9241k;

    /* renamed from: com.friday.main.view.AppUpdateDialog$a */
    public static final /* synthetic */ class C6187a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9246a;

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
            f9246a = iArr;
        }
    }

    /* renamed from: com.friday.main.view.AppUpdateDialog$b */
    public static final class C6188b implements Observer, InterfaceC9975q {

        /* renamed from: c */
        public final /* synthetic */ InterfaceC9540l f9247c;

        public C6188b(InterfaceC9540l function) {
            AbstractC9979u.m20294g(function, "function");
            this.f9247c = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9975q)) {
                return AbstractC9979u.m20289b(getFunctionDelegate(), ((InterfaceC9975q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9975q
        public final InterfaceC10772c getFunctionDelegate() {
            return this.f9247c;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f9247c.invoke(obj);
        }
    }

    public AppUpdateDialog() {
        final InterfaceC9529a interfaceC9529a = null;
        this.f9241k = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9983y.m20315b(HomeViewModel.class), new InterfaceC9529a() { // from class: com.friday.main.view.AppUpdateDialog$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new InterfaceC9529a() { // from class: com.friday.main.view.AppUpdateDialog$special$$inlined$activityViewModels$default$2
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
        }, new InterfaceC9529a() { // from class: com.friday.main.view.AppUpdateDialog$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: v */
    public static final void m6950v(AppUpdateDialog appUpdateDialog, View view) throws UnsupportedEncodingException {
        VersionUpdate versionUpdate;
        Result result;
        C9072a c9072a = (C9072a) appUpdateDialog.m6953u().m7263v().getValue();
        String strDecode = URLDecoder.decode((c9072a == null || (versionUpdate = (VersionUpdate) c9072a.m17874b()) == null || (result = versionUpdate.getResult()) == null) ? null : result.getFileUrl(), "utf-8");
        AbstractC9979u.m20293f(strDecode, "decode(...)");
        appUpdateDialog.m6954x(strDecode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: w */
    public static final void m6951w(AppUpdateDialog appUpdateDialog, View view) {
        VersionUpdate versionUpdate;
        Result result;
        C9072a c9072a = (C9072a) appUpdateDialog.m6953u().m7263v().getValue();
        if (c9072a == null || (versionUpdate = (VersionUpdate) c9072a.m17874b()) == null || (result = versionUpdate.getResult()) == null) {
            return;
        }
        boolean forceUpdate = result.getForceUpdate();
        appUpdateDialog.dismissAllowingStateLoss();
        if (forceUpdate) {
            AppUtils.exitApp();
        }
    }

    /* renamed from: y */
    public static final C10786q m6952y(AppUpdateDialog appUpdateDialog, List list) {
        AbstractC9979u.m20291d(list);
        WorkInfo workInfo = (WorkInfo) AbstractC10947g0.m23944m0(list);
        int i10 = C6187a.f9246a[workInfo.getState().ordinal()];
        if (i10 == 1) {
            String string = workInfo.getOutputData().getString(OssUtils.SUCCESS_KEY);
            ((DialogVersionUpdateBinding) appUpdateDialog.getMBinding()).f9154f.setText("下载完成");
            ((DialogVersionUpdateBinding) appUpdateDialog.getMBinding()).f9155g.setEnabled(true);
            ((DialogVersionUpdateBinding) appUpdateDialog.getMBinding()).f9152d.setCardBackgroundColor(ContextCompat.getColor(appUpdateDialog.requireContext(), R$color.colorPrimary));
            ((DialogVersionUpdateBinding) appUpdateDialog.getMBinding()).f9155g.setTextColor(Color.parseColor("#ffffff"));
            ((DialogVersionUpdateBinding) appUpdateDialog.getMBinding()).f9153e.setEnabled(true);
            AppUtils.installApp(string);
        } else if (i10 != 2) {
            int i11 = workInfo.getProgress().getInt("progress", 0);
            ((DialogVersionUpdateBinding) appUpdateDialog.getMBinding()).f9153e.setEnabled(false);
            ((DialogVersionUpdateBinding) appUpdateDialog.getMBinding()).f9154f.setText("正在下载" + i11 + "%");
        } else {
            ((DialogVersionUpdateBinding) appUpdateDialog.getMBinding()).f9154f.setText("文件校验失败");
            ((DialogVersionUpdateBinding) appUpdateDialog.getMBinding()).f9155g.setEnabled(true);
            ((DialogVersionUpdateBinding) appUpdateDialog.getMBinding()).f9152d.setCardBackgroundColor(ContextCompat.getColor(appUpdateDialog.requireContext(), R$color.colorPrimary));
            ((DialogVersionUpdateBinding) appUpdateDialog.getMBinding()).f9155g.setTextColor(Color.parseColor("#ffffff"));
            ((DialogVersionUpdateBinding) appUpdateDialog.getMBinding()).f9153e.setEnabled(true);
        }
        return C10786q.f26013a;
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public int getLayoutId() {
        return R$layout.dialog_version_update;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.friday.common.base.InterfaceC5929c
    public void initData() {
        VersionUpdate versionUpdate;
        Result result;
        C9072a c9072a = (C9072a) m6953u().m7263v().getValue();
        if (c9072a != null && (versionUpdate = (VersionUpdate) c9072a.m17874b()) != null && (result = versionUpdate.getResult()) != null) {
            if (result.getForceUpdate()) {
                ((DialogVersionUpdateBinding) getMBinding()).f9153e.setText("退出");
            } else {
                ((DialogVersionUpdateBinding) getMBinding()).f9153e.setText("取消");
            }
        }
        TextView tvUpdate = ((DialogVersionUpdateBinding) getMBinding()).f9155g;
        AbstractC9979u.m20293f(tvUpdate, "tvUpdate");
        AbstractC11958b.m26591l(tvUpdate, 500L, new View.OnClickListener() { // from class: v3.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws UnsupportedEncodingException {
                AppUpdateDialog.m6950v(this.f27284c, view);
            }
        });
        ((DialogVersionUpdateBinding) getMBinding()).f9153e.setOnClickListener(new View.OnClickListener() { // from class: v3.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppUpdateDialog.m6951w(this.f27293c, view);
            }
        });
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R$style.airPlayDialog);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout((int) getResources().getDimension(R$dimen.view_189), (int) getResources().getDimension(R$dimen.view_140));
            window.setGravity(17);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setCancelable(false);
            dialog2.setCanceledOnTouchOutside(false);
        }
        super.onStart();
    }

    /* renamed from: u */
    public final HomeViewModel m6953u() {
        return (HomeViewModel) this.f9241k.getValue();
    }

    /* renamed from: x */
    public final void m6954x(String str) {
        OneTimeWorkRequest oneTimeWorkRequestBuild = new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) DownloadFileCommonWork.class).setInputData(DownloadFileCommonWork.C8560a.m16513b(DownloadFileCommonWork.Companion, str, null, null, 6, null)).build();
        WorkManager.Companion companion = WorkManager.Companion;
        Context contextRequireContext = requireContext();
        AbstractC9979u.m20293f(contextRequireContext, "requireContext(...)");
        WorkManager companion2 = companion.getInstance(contextRequireContext);
        ((DialogVersionUpdateBinding) getMBinding()).f9154f.setText("正在下载0%");
        ((DialogVersionUpdateBinding) getMBinding()).f9155g.setEnabled(false);
        ((DialogVersionUpdateBinding) getMBinding()).f9152d.setCardBackgroundColor(Color.parseColor("#dadada"));
        ((DialogVersionUpdateBinding) getMBinding()).f9155g.setTextColor(Color.parseColor("#494949"));
        companion2.enqueueUniqueWork(str, ExistingWorkPolicy.REPLACE, oneTimeWorkRequestBuild);
        companion2.getWorkInfosForUniqueWorkLiveData(str).observe(getViewLifecycleOwner(), new C6188b(new InterfaceC9540l() { // from class: v3.c
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return AppUpdateDialog.m6952y(this.f27302c, (List) obj);
            }
        }));
    }
}
