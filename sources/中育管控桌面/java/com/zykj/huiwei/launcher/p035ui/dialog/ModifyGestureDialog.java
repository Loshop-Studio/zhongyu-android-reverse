package com.zykj.huiwei.launcher.p035ui.dialog;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.fragment.FragmentKt;
import com.zykj.huiwei.launcher.databinding.HwDialogModifyGestureBinding;
import com.zykj.manage.R;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\u0004J\u0019\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/ui/dialog/ModifyGestureDialog;", "Lcom/zykj/huiwei/launcher/base/CommonDialogFragment;", "Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyGestureBinding;", "<init>", "()V", "", "layoutId", "()I", "", "g", "Landroid/view/View;", "v", "onClick", "(Landroid/view/View;)V", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class ModifyGestureDialog extends Hilt_ModifyGestureDialog<HwDialogModifyGestureBinding> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.huiwei.launcher.base.CommonDialogFragment
    /* renamed from: g */
    public void mo5279g() {
        ((HwDialogModifyGestureBinding) getMBindView()).setOnClickListener(this);
    }

    @Override // com.zykj.base.BaseDialogFragment
    public int layoutId() {
        return R.layout.hw_dialog_modify_gesture;
    }

    @Override // com.zykj.huiwei.launcher.base.CommonDialogFragment, android.view.View.OnClickListener
    public void onClick(View v6) {
        Object objM17183constructorimpl;
        Object objM17183constructorimpl2;
        super.onClick(v6);
        Integer numValueOf = v6 != null ? Integer.valueOf(v6.getId()) : null;
        if (numValueOf != null && numValueOf.intValue() == R.id.ivClose) {
            FragmentKt.findNavController(this).navigateUp();
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.tvReset) {
            FragmentKt.findNavController(this).navigateUp();
            try {
                Result.Companion companion = Result.INSTANCE;
                Context contextRequireContext = requireContext();
                Intent intent = new Intent();
                intent.setPackage("com.android.launcher3");
                intent.setClassName("com.android.launcher3", "com.android.launcher3.activity.gestrue.SettingPwdGestureActivity");
                intent.putExtra("settings_type", 1);
                contextRequireContext.startActivity(intent);
                objM17183constructorimpl2 = Result.m17183constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM17183constructorimpl2 = Result.m17183constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m17186exceptionOrNullimpl(objM17183constructorimpl2) != null) {
                m5281i("设置失败，请联系管理员");
                return;
            }
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.tvCancel) {
            FragmentKt.findNavController(this).navigateUp();
            try {
                Result.Companion companion3 = Result.INSTANCE;
                Context contextRequireContext2 = requireContext();
                Intent intent2 = new Intent();
                intent2.setPackage("com.android.launcher3");
                intent2.setClassName("com.android.launcher3", "com.android.launcher3.activity.gestrue.SettingPwdGestureActivity");
                intent2.putExtra("settings_type", 2);
                contextRequireContext2.startActivity(intent2);
                objM17183constructorimpl = Result.m17183constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.INSTANCE;
                objM17183constructorimpl = Result.m17183constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m17186exceptionOrNullimpl(objM17183constructorimpl) != null) {
                m5281i("设置失败，请联系管理员");
            }
        }
    }
}
