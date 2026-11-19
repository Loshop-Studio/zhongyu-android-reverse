package com.zykj.evaluation.version;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.FileUtils;
import com.liulishuo.okdownload.C6327a;
import com.liulishuo.okdownload.core.cause.EndCause;
import com.zykj.base.BaseDialogFragment;
import com.zykj.evaluation.R;
import com.zykj.evaluation.bean.TaskState;
import com.zykj.evaluation.databinding.DialogVersionUpgradeBinding;
import com.zykj.evaluation.version.VersionUpgradeDialogFragment;
import java.io.File;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p004a2.C0016b;
import p027b8.AbstractC5046c;
import p101g7.C7589e;
import p207q1.C8881f;
import p229s1.C9124a;
import p229s1.C9126c;
import p302z1.AbstractC9974c;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0094@¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u0004R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, m13558d2 = {"Lcom/zykj/evaluation/version/VersionUpgradeDialogFragment;", "Lcom/zykj/base/BaseDialogFragment;", "Lcom/zykj/evaluation/databinding/DialogVersionUpgradeBinding;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "initView", "(Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onStart", "", "layoutId", "()I", "g", "Lcom/liulishuo/okdownload/a;", "a", "Lcom/liulishuo/okdownload/a;", "downloadTask", "Lcom/zykj/evaluation/version/VersionResult;", "b", "Lcom/zykj/evaluation/version/VersionResult;", "versionResult", "c", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final class VersionUpgradeDialogFragment extends BaseDialogFragment<DialogVersionUpgradeBinding> {

    /* renamed from: c, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d */
    public static final int f10549d = 8;

    /* renamed from: a, reason: from kotlin metadata */
    public C6327a downloadTask;

    /* renamed from: b, reason: from kotlin metadata */
    public VersionResult versionResult;

    /* renamed from: com.zykj.evaluation.version.VersionUpgradeDialogFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final VersionUpgradeDialogFragment m10539a(VersionResult versionResult) {
            Intrinsics.checkNotNullParameter(versionResult, "versionResult");
            Bundle bundle = new Bundle();
            bundle.putParcelable("VERSION_UPGRADE_KEY", versionResult);
            VersionUpgradeDialogFragment versionUpgradeDialogFragment = new VersionUpgradeDialogFragment();
            versionUpgradeDialogFragment.setArguments(bundle);
            return versionUpgradeDialogFragment;
        }

        public Companion() {
        }
    }

    /* renamed from: com.zykj.evaluation.version.VersionUpgradeDialogFragment$b */
    public static final class C6958b extends AbstractC9974c {
        public C6958b() {
        }

        @Override // p004a2.C0016b.a
        /* renamed from: a */
        public void mo42a(C6327a task, int i10, long j10, C8881f blockSpeed) {
            Intrinsics.checkNotNullParameter(task, "task");
            Intrinsics.checkNotNullParameter(blockSpeed, "blockSpeed");
        }

        @Override // p004a2.C0016b.a
        /* renamed from: c */
        public void mo43c(C6327a task, long j10, C8881f taskSpeed) {
            Intrinsics.checkNotNullParameter(task, "task");
            Intrinsics.checkNotNullParameter(taskSpeed, "taskSpeed");
            ProgressBar progressBar = VersionUpgradeDialogFragment.this.getMBindView().f8713c;
            float f10 = j10 * 1.0f;
            VersionResult versionResult = VersionUpgradeDialogFragment.this.versionResult;
            if (versionResult == null) {
                Intrinsics.throwUninitializedPropertyAccessException("versionResult");
                versionResult = null;
            }
            progressBar.setProgress((int) ((f10 / versionResult.getSize()) * 100));
            VersionUpgradeDialogFragment.this.getMBindView().f8719i.setText(VersionUpgradeDialogFragment.this.getMBindView().f8713c.getProgress() + "%");
        }

        @Override // p207q1.InterfaceC8876a
        /* renamed from: h */
        public void mo10426h(C6327a task) {
            Intrinsics.checkNotNullParameter(task, "task");
            TextView tvNow = VersionUpgradeDialogFragment.this.getMBindView().f8718h;
            Intrinsics.checkNotNullExpressionValue(tvNow, "tvNow");
            tvNow.setVisibility(8);
            TextView tvNotNow = VersionUpgradeDialogFragment.this.getMBindView().f8717g;
            Intrinsics.checkNotNullExpressionValue(tvNotNow, "tvNotNow");
            tvNotNow.setVisibility(8);
            TextView tvCancel = VersionUpgradeDialogFragment.this.getMBindView().f8714d;
            Intrinsics.checkNotNullExpressionValue(tvCancel, "tvCancel");
            tvCancel.setVisibility(0);
            ProgressBar progressBar = VersionUpgradeDialogFragment.this.getMBindView().f8713c;
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            progressBar.setVisibility(0);
            TextView tvProgress = VersionUpgradeDialogFragment.this.getMBindView().f8719i;
            Intrinsics.checkNotNullExpressionValue(tvProgress, "tvProgress");
            tvProgress.setVisibility(0);
        }

        @Override // p004a2.C0016b.a
        /* renamed from: i */
        public void mo44i(C6327a task, int i10, C9124a c9124a, C8881f blockSpeed) {
            Intrinsics.checkNotNullParameter(task, "task");
            Intrinsics.checkNotNullParameter(blockSpeed, "blockSpeed");
        }

        @Override // p004a2.C0016b.a
        /* renamed from: j */
        public void mo45j(C6327a task, EndCause cause, Exception exc, C8881f taskSpeed) {
            Intrinsics.checkNotNullParameter(task, "task");
            Intrinsics.checkNotNullParameter(cause, "cause");
            Intrinsics.checkNotNullParameter(taskSpeed, "taskSpeed");
            if (cause == EndCause.COMPLETED && task.m4392l() != null) {
                AppUtils.installApp(task.m4392l());
            }
            TextView tvNow = VersionUpgradeDialogFragment.this.getMBindView().f8718h;
            Intrinsics.checkNotNullExpressionValue(tvNow, "tvNow");
            tvNow.setVisibility(0);
            TextView tvNotNow = VersionUpgradeDialogFragment.this.getMBindView().f8717g;
            Intrinsics.checkNotNullExpressionValue(tvNotNow, "tvNotNow");
            tvNotNow.setVisibility(0);
            TextView tvCancel = VersionUpgradeDialogFragment.this.getMBindView().f8714d;
            Intrinsics.checkNotNullExpressionValue(tvCancel, "tvCancel");
            tvCancel.setVisibility(8);
            ProgressBar progressBar = VersionUpgradeDialogFragment.this.getMBindView().f8713c;
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            progressBar.setVisibility(8);
            TextView tvProgress = VersionUpgradeDialogFragment.this.getMBindView().f8719i;
            Intrinsics.checkNotNullExpressionValue(tvProgress, "tvProgress");
            tvProgress.setVisibility(8);
        }

        @Override // p004a2.C0016b.a
        /* renamed from: l */
        public void mo46l(C6327a task, C9126c info, boolean z9, C0016b.b model) {
            Intrinsics.checkNotNullParameter(task, "task");
            Intrinsics.checkNotNullParameter(info, "info");
            Intrinsics.checkNotNullParameter(model, "model");
        }

        @Override // p207q1.InterfaceC8876a
        /* renamed from: r */
        public void mo10540r(C6327a task, int i10, int i11, Map responseHeaderFields) {
            Intrinsics.checkNotNullParameter(task, "task");
            Intrinsics.checkNotNullParameter(responseHeaderFields, "responseHeaderFields");
        }

        @Override // p207q1.InterfaceC8876a
        /* renamed from: u */
        public void mo10541u(C6327a task, int i10, Map requestHeaderFields) {
            Intrinsics.checkNotNullParameter(task, "task");
            Intrinsics.checkNotNullParameter(requestHeaderFields, "requestHeaderFields");
        }
    }

    /* renamed from: h */
    public static final void m10535h(VersionUpgradeDialogFragment versionUpgradeDialogFragment, View view) {
        C6327a c6327a = versionUpgradeDialogFragment.downloadTask;
        if (c6327a != null) {
            c6327a.m4391k(versionUpgradeDialogFragment.new C6958b());
        }
    }

    /* renamed from: i */
    public static final void m10536i(VersionUpgradeDialogFragment versionUpgradeDialogFragment, View view) {
        C6327a c6327a = versionUpgradeDialogFragment.downloadTask;
        if (c6327a != null) {
            c6327a.m4389i();
        }
    }

    /* renamed from: j */
    public static final void m10537j(VersionUpgradeDialogFragment versionUpgradeDialogFragment, View view) {
        VersionResult versionResult = versionUpgradeDialogFragment.versionResult;
        if (versionResult == null) {
            Intrinsics.throwUninitializedPropertyAccessException("versionResult");
            versionResult = null;
        }
        if (versionResult.getForceUpdate()) {
            AppUtils.exitApp();
        } else {
            versionUpgradeDialogFragment.dismissAllowingStateLoss();
        }
    }

    /* renamed from: g */
    public final void m10538g() {
        C7589e c7589e = new C7589e(TaskState.Done.INSTANCE, 0L, 0L);
        String appVersionName = AppUtils.getAppVersionName();
        Intrinsics.checkNotNullExpressionValue(appVersionName, "getAppVersionName(...)");
        String strM12472s = c7589e.m12472s(appVersionName);
        if (FileUtils.isFileExists(strM12472s)) {
            FileUtils.delete(strM12472s);
        }
        VersionResult versionResult = this.versionResult;
        VersionResult versionResult2 = null;
        if (versionResult == null) {
            Intrinsics.throwUninitializedPropertyAccessException("versionResult");
            versionResult = null;
        }
        String strM12472s2 = c7589e.m12472s(versionResult.getVersionName());
        VersionResult versionResult3 = this.versionResult;
        if (versionResult3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("versionResult");
        } else {
            versionResult2 = versionResult3;
        }
        this.downloadTask = new C6327a.a(versionResult2.getFileUrl(), new File(strM12472s2)).m4408b(100).m4409c(true).m4407a();
    }

    @Override // com.zykj.base.BaseDialogFragment
    public Object initView(Bundle bundle, Continuation continuation) {
        Bundle arguments = getArguments();
        VersionResult versionResult = null;
        VersionResult versionResult2 = arguments != null ? (VersionResult) arguments.getParcelable("VERSION_UPGRADE_KEY") : null;
        if (versionResult2 == null) {
            dismissAllowingStateLoss();
        } else {
            this.versionResult = versionResult2;
            if (versionResult2.getForceUpdate()) {
                getMBindView().f8717g.setText("退出");
            } else {
                getMBindView().f8717g.setText("暂不更新");
            }
            TextView textView = getMBindView().f8721k;
            StringBuilder sb = new StringBuilder();
            sb.append("v");
            VersionResult versionResult3 = this.versionResult;
            if (versionResult3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("versionResult");
                versionResult3 = null;
            }
            sb.append(versionResult3.getVersionName());
            textView.setText(sb.toString());
            TextView textView2 = getMBindView().f8715e;
            VersionResult versionResult4 = this.versionResult;
            if (versionResult4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("versionResult");
            } else {
                versionResult = versionResult4;
            }
            textView2.setText(versionResult.getSummary());
            m10538g();
            TextView tvNow = getMBindView().f8718h;
            Intrinsics.checkNotNullExpressionValue(tvNow, "tvNow");
            AbstractC5046c.m2530f(tvNow, 0L, new View.OnClickListener() { // from class: h7.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VersionUpgradeDialogFragment.m10535h(this.f12839a, view);
                }
            }, 1, null);
            TextView tvCancel = getMBindView().f8714d;
            Intrinsics.checkNotNullExpressionValue(tvCancel, "tvCancel");
            AbstractC5046c.m2530f(tvCancel, 0L, new View.OnClickListener() { // from class: h7.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VersionUpgradeDialogFragment.m10536i(this.f12840a, view);
                }
            }, 1, null);
            TextView tvNotNow = getMBindView().f8717g;
            Intrinsics.checkNotNullExpressionValue(tvNotNow, "tvNotNow");
            AbstractC5046c.m2530f(tvNotNow, 0L, new View.OnClickListener() { // from class: h7.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VersionUpgradeDialogFragment.m10537j(this.f12841a, view);
                }
            }, 1, null);
        }
        return Unit.INSTANCE;
    }

    @Override // com.zykj.base.BaseDialogFragment
    public int layoutId() {
        return R.layout.dialog_version_upgrade;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setType(1000);
            window.setLayout((int) getResources().getDimension(R.dimen.view_216), (int) getResources().getDimension(R.dimen.view_234));
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setCancelable(false);
            dialog2.setCanceledOnTouchOutside(false);
        }
        super.onStart();
    }
}
