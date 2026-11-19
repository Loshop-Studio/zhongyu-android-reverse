package com.zykj.huiwei.launcher.p035ui.dialog;

import android.app.Dialog;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blankj.utilcode.util.AbstractC4640d;
import com.zykj.huiwei.launcher.databinding.DialogCrashHintBinding;
import com.zykj.huiwei.launcher.p035ui.dialog.CrashHintDialog;
import com.zykj.manage.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p122o4.AbstractC7521b;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\u0004¨\u0006\n"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/ui/dialog/CrashHintDialog;", "Lcom/zykj/huiwei/launcher/base/CommonDialogFragment;", "Lcom/zykj/huiwei/launcher/databinding/DialogCrashHintBinding;", "<init>", "()V", "", "layoutId", "()I", "", "g", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class CrashHintDialog extends Hilt_CrashHintDialog<DialogCrashHintBinding> {
    /* renamed from: p */
    public static final Unit m5648p(View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        AbstractC4640d.m2156j("com.ndwill.swd.appstore");
        AbstractC4640d.m2147a();
        return Unit.INSTANCE;
    }

    /* renamed from: q */
    public static final Unit m5649q(CrashHintDialog crashHintDialog, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        crashHintDialog.requireActivity().finish();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.huiwei.launcher.base.CommonDialogFragment
    /* renamed from: g */
    public void mo5279g() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCancelable(false);
        }
        AppCompatTextView tvConfirm = ((DialogCrashHintBinding) getMBindView()).tvConfirm;
        Intrinsics.checkNotNullExpressionValue(tvConfirm, "tvConfirm");
        AbstractC7521b.m8681e(tvConfirm, new Function1() { // from class: b4.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CrashHintDialog.m5648p((View) obj);
            }
        });
        AppCompatTextView tvCancel = ((DialogCrashHintBinding) getMBindView()).tvCancel;
        Intrinsics.checkNotNullExpressionValue(tvCancel, "tvCancel");
        AbstractC7521b.m8681e(tvCancel, new Function1() { // from class: b4.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CrashHintDialog.m5649q(this.f1316a, (View) obj);
            }
        });
    }

    @Override // com.zykj.base.BaseDialogFragment
    public int layoutId() {
        return R.layout.dialog_crash_hint;
    }
}
