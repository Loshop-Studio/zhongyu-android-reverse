package com.zykj.student.dialogue.p076ui.version;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.PathUtils;
import com.liulishuo.okdownload.C6593a;
import com.liulishuo.okdownload.core.cause.EndCause;
import com.zykj.base.BaseDialogFragment;
import com.zykj.base.R$dimen;
import com.zykj.student.dialogue.R;
import com.zykj.student.dialogue.bean.resp.VersionResult;
import com.zykj.student.dialogue.databinding.DialogVersionUpgradeBinding;
import com.zykj.student.dialogue.p076ui.version.VersionUpgradeDialogFragment;
import java.io.File;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p138i6.AbstractC8136b;
import p209p1.C9317f;
import p229r1.C9417a;
import p229r1.C9419c;
import p299y1.AbstractC9944b;
import p309z1.C9988b;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0094@¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u0004R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment;", "Lcom/zykj/base/BaseDialogFragment;", "Lcom/zykj/student/dialogue/databinding/DialogVersionUpgradeBinding;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "initView", "(Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onStart", "", "layoutId", "()I", "g", "Lcom/liulishuo/okdownload/a;", "a", "Lcom/liulishuo/okdownload/a;", "downloadTask", "Lcom/zykj/student/dialogue/bean/resp/VersionResult;", "b", "Lcom/zykj/student/dialogue/bean/resp/VersionResult;", "versionResult", "c", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final class VersionUpgradeDialogFragment extends BaseDialogFragment<DialogVersionUpgradeBinding> {

    /* renamed from: c, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d */
    public static final int f11887d = 8;

    /* renamed from: a, reason: from kotlin metadata */
    public C6593a downloadTask;

    /* renamed from: b, reason: from kotlin metadata */
    public VersionResult versionResult;

    /* renamed from: com.zykj.student.dialogue.ui.version.VersionUpgradeDialogFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final VersionUpgradeDialogFragment m11046a(VersionResult versionResult) {
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

    /* renamed from: com.zykj.student.dialogue.ui.version.VersionUpgradeDialogFragment$b */
    public static final class C7640b extends AbstractC9944b {
        public C7640b() {
        }

        @Override // p309z1.C9988b.a
        /* renamed from: a */
        public void mo10263a(C6593a task, C9419c info, boolean z9, C9988b.b model) {
            Intrinsics.checkNotNullParameter(task, "task");
            Intrinsics.checkNotNullParameter(info, "info");
            Intrinsics.checkNotNullParameter(model, "model");
        }

        @Override // p309z1.C9988b.a
        /* renamed from: b */
        public void mo10264b(C6593a task, EndCause cause, Exception exc, C9317f taskSpeed) {
            Intrinsics.checkNotNullParameter(task, "task");
            Intrinsics.checkNotNullParameter(cause, "cause");
            Intrinsics.checkNotNullParameter(taskSpeed, "taskSpeed");
            if (cause == EndCause.COMPLETED && task.m4596l() != null) {
                AppUtils.installApp(task.m4596l());
            }
            TextView tvNow = VersionUpgradeDialogFragment.this.getMBindView().f10364h;
            Intrinsics.checkNotNullExpressionValue(tvNow, "tvNow");
            tvNow.setVisibility(0);
            TextView tvNotNow = VersionUpgradeDialogFragment.this.getMBindView().f10363g;
            Intrinsics.checkNotNullExpressionValue(tvNotNow, "tvNotNow");
            tvNotNow.setVisibility(0);
            TextView tvCancel = VersionUpgradeDialogFragment.this.getMBindView().f10360d;
            Intrinsics.checkNotNullExpressionValue(tvCancel, "tvCancel");
            tvCancel.setVisibility(8);
            ProgressBar progressBar = VersionUpgradeDialogFragment.this.getMBindView().f10359c;
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            progressBar.setVisibility(8);
            TextView tvProgress = VersionUpgradeDialogFragment.this.getMBindView().f10365i;
            Intrinsics.checkNotNullExpressionValue(tvProgress, "tvProgress");
            tvProgress.setVisibility(8);
        }

        @Override // p209p1.InterfaceC9312a
        /* renamed from: g */
        public void mo10265g(C6593a task) {
            Intrinsics.checkNotNullParameter(task, "task");
            TextView tvNow = VersionUpgradeDialogFragment.this.getMBindView().f10364h;
            Intrinsics.checkNotNullExpressionValue(tvNow, "tvNow");
            tvNow.setVisibility(8);
            TextView tvNotNow = VersionUpgradeDialogFragment.this.getMBindView().f10363g;
            Intrinsics.checkNotNullExpressionValue(tvNotNow, "tvNotNow");
            tvNotNow.setVisibility(8);
            TextView tvCancel = VersionUpgradeDialogFragment.this.getMBindView().f10360d;
            Intrinsics.checkNotNullExpressionValue(tvCancel, "tvCancel");
            tvCancel.setVisibility(0);
            ProgressBar progressBar = VersionUpgradeDialogFragment.this.getMBindView().f10359c;
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            progressBar.setVisibility(0);
            TextView tvProgress = VersionUpgradeDialogFragment.this.getMBindView().f10365i;
            Intrinsics.checkNotNullExpressionValue(tvProgress, "tvProgress");
            tvProgress.setVisibility(0);
        }

        @Override // p309z1.C9988b.a
        /* renamed from: h */
        public void mo10266h(C6593a task, int i9, C9417a c9417a, C9317f blockSpeed) {
            Intrinsics.checkNotNullParameter(task, "task");
            Intrinsics.checkNotNullParameter(blockSpeed, "blockSpeed");
        }

        @Override // p309z1.C9988b.a
        /* renamed from: j */
        public void mo10267j(C6593a task, int i9, long j9, C9317f blockSpeed) {
            Intrinsics.checkNotNullParameter(task, "task");
            Intrinsics.checkNotNullParameter(blockSpeed, "blockSpeed");
        }

        @Override // p309z1.C9988b.a
        /* renamed from: l */
        public void mo10268l(C6593a task, long j9, C9317f taskSpeed) {
            Intrinsics.checkNotNullParameter(task, "task");
            Intrinsics.checkNotNullParameter(taskSpeed, "taskSpeed");
            ProgressBar progressBar = VersionUpgradeDialogFragment.this.getMBindView().f10359c;
            float f10 = j9 * 1.0f;
            VersionResult versionResult = VersionUpgradeDialogFragment.this.versionResult;
            if (versionResult == null) {
                Intrinsics.throwUninitializedPropertyAccessException("versionResult");
                versionResult = null;
            }
            progressBar.setProgress((int) ((f10 / versionResult.getSize()) * 100));
            VersionUpgradeDialogFragment.this.getMBindView().f10365i.setText(VersionUpgradeDialogFragment.this.getMBindView().f10359c.getProgress() + "%");
        }

        @Override // p209p1.InterfaceC9312a
        /* renamed from: o */
        public void mo10269o(C6593a task, int i9, int i10, Map responseHeaderFields) {
            Intrinsics.checkNotNullParameter(task, "task");
            Intrinsics.checkNotNullParameter(responseHeaderFields, "responseHeaderFields");
        }

        @Override // p209p1.InterfaceC9312a
        /* renamed from: u */
        public void mo10270u(C6593a task, int i9, Map requestHeaderFields) {
            Intrinsics.checkNotNullParameter(task, "task");
            Intrinsics.checkNotNullParameter(requestHeaderFields, "requestHeaderFields");
        }
    }

    /* renamed from: h */
    public static final Unit m11042h(VersionUpgradeDialogFragment versionUpgradeDialogFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C6593a c6593a = versionUpgradeDialogFragment.downloadTask;
        if (c6593a != null) {
            c6593a.m4595k(versionUpgradeDialogFragment.new C7640b());
        }
        return Unit.INSTANCE;
    }

    /* renamed from: i */
    public static final Unit m11043i(VersionUpgradeDialogFragment versionUpgradeDialogFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C6593a c6593a = versionUpgradeDialogFragment.downloadTask;
        if (c6593a != null) {
            c6593a.m4593i();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: j */
    public static final Unit m11044j(VersionUpgradeDialogFragment versionUpgradeDialogFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
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
        return Unit.INSTANCE;
    }

    /* renamed from: g */
    public final void m11045g() {
        String externalAppCachePath = PathUtils.getExternalAppCachePath();
        String str = File.separator;
        String str2 = externalAppCachePath + str + AppUtils.getAppVersionName() + ".apk";
        if (FileUtils.isFileExists(str2)) {
            FileUtils.delete(str2);
        }
        String externalAppCachePath2 = PathUtils.getExternalAppCachePath();
        VersionResult versionResult = this.versionResult;
        VersionResult versionResult2 = null;
        if (versionResult == null) {
            Intrinsics.throwUninitializedPropertyAccessException("versionResult");
            versionResult = null;
        }
        String str3 = externalAppCachePath2 + str + versionResult.getVersionName() + ".apk";
        VersionResult versionResult3 = this.versionResult;
        if (versionResult3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("versionResult");
        } else {
            versionResult2 = versionResult3;
        }
        this.downloadTask = new C6593a.a(versionResult2.getFileUrl(), new File(str3)).m4612b(100).m4613c(true).m4611a();
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
                getMBindView().f10363g.setText("退出");
            } else {
                getMBindView().f10363g.setText("暂不更新");
            }
            TextView textView = getMBindView().f10367k;
            StringBuilder sb = new StringBuilder();
            sb.append("v");
            VersionResult versionResult3 = this.versionResult;
            if (versionResult3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("versionResult");
                versionResult3 = null;
            }
            sb.append(versionResult3.getVersionName());
            textView.setText(sb.toString());
            TextView textView2 = getMBindView().f10361e;
            VersionResult versionResult4 = this.versionResult;
            if (versionResult4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("versionResult");
            } else {
                versionResult = versionResult4;
            }
            textView2.setText(versionResult.getSummary());
            m11045g();
            TextView tvNow = getMBindView().f10364h;
            Intrinsics.checkNotNullExpressionValue(tvNow, "tvNow");
            AbstractC8136b.m13040h(tvNow, new Function1() { // from class: w6.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return VersionUpgradeDialogFragment.m11042h(this.f17546a, (View) obj);
                }
            });
            TextView tvCancel = getMBindView().f10360d;
            Intrinsics.checkNotNullExpressionValue(tvCancel, "tvCancel");
            AbstractC8136b.m13040h(tvCancel, new Function1() { // from class: w6.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return VersionUpgradeDialogFragment.m11043i(this.f17547a, (View) obj);
                }
            });
            TextView tvNotNow = getMBindView().f10363g;
            Intrinsics.checkNotNullExpressionValue(tvNotNow, "tvNotNow");
            AbstractC8136b.m13040h(tvNotNow, new Function1() { // from class: w6.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return VersionUpgradeDialogFragment.m11044j(this.f17548a, (View) obj);
                }
            });
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
            window.setLayout((int) getResources().getDimension(R$dimen.view_216), (int) getResources().getDimension(R$dimen.view_234));
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setCancelable(false);
            dialog2.setCanceledOnTouchOutside(false);
        }
        super.onStart();
    }
}
