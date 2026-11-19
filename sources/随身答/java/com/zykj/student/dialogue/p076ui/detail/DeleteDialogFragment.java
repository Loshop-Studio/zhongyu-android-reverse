package com.zykj.student.dialogue.p076ui.detail;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.lib.p075ui.R$dimen;
import com.zykj.student.dialogue.R;
import com.zykj.student.dialogue.databinding.DialogueDialogDeleteBinding;
import com.zykj.student.dialogue.p076ui.detail.DeleteDialogFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p138i6.AbstractC8136b;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0094@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/detail/DeleteDialogFragment;", "Lcom/zykj/base/BaseDialogFragment;", "Lcom/zykj/student/dialogue/databinding/DialogueDialogDeleteBinding;", "", "onStart", "()V", "", "layoutId", "()I", "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/zykj/student/dialogue/ui/detail/DeleteAction;", "f", "Lcom/zykj/student/dialogue/ui/detail/DeleteAction;", "action", "Lkotlin/Function0;", "g", "Lkotlin/jvm/functions/Function0;", "onEnsureClick", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final class DeleteDialogFragment extends Hilt_DeleteDialogFragment<DialogueDialogDeleteBinding> {

    /* renamed from: f, reason: from kotlin metadata */
    public final DeleteAction action;

    /* renamed from: g, reason: from kotlin metadata */
    public final Function0 onEnsureClick;

    /* renamed from: i */
    public static final Unit m10301i(DeleteDialogFragment deleteDialogFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        deleteDialogFragment.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* renamed from: j */
    public static final Unit m10302j(DeleteDialogFragment deleteDialogFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        deleteDialogFragment.dismissAllowingStateLoss();
        deleteDialogFragment.onEnsureClick.invoke();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.base.BaseDialogFragment
    public Object initView(Bundle bundle, Continuation continuation) {
        if (this.action == DeleteAction.f10964a) {
            ((DialogueDialogDeleteBinding) getMBindView()).f10399b.setText(getString(R.string.dialogue_delete_session));
        } else {
            ((DialogueDialogDeleteBinding) getMBindView()).f10399b.setText(getString(R.string.dialogue_delete_statement));
        }
        TextView tvCancel = ((DialogueDialogDeleteBinding) getMBindView()).f10398a;
        Intrinsics.checkNotNullExpressionValue(tvCancel, "tvCancel");
        AbstractC8136b.m13040h(tvCancel, new Function1() { // from class: o6.s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeleteDialogFragment.m10301i(this.f15617a, (View) obj);
            }
        });
        TextView tvOk = ((DialogueDialogDeleteBinding) getMBindView()).f10400c;
        Intrinsics.checkNotNullExpressionValue(tvOk, "tvOk");
        AbstractC8136b.m13040h(tvOk, new Function1() { // from class: o6.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeleteDialogFragment.m10302j(this.f15618a, (View) obj);
            }
        });
        return Unit.INSTANCE;
    }

    @Override // com.zykj.base.BaseDialogFragment
    public int layoutId() {
        return R.layout.dialogue_dialog_delete;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setType(1000);
            window.setLayout((int) getResources().getDimension(R$dimen.view_216), (int) getResources().getDimension(R$dimen.view_115));
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setCancelable(true);
            dialog2.setCanceledOnTouchOutside(true);
        }
        super.onStart();
    }
}
