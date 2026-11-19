package com.zykj.student.dialogue.p076ui.home.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p012ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.student.dialogue.R;
import com.zykj.student.dialogue.p076ui.home.dialog.SessionDeleteDialogFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p294x6.AbstractC9898m;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/home/dialog/SessionDeleteDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lkotlin/Function0;", "f", "Lkotlin/jvm/functions/Function0;", "getOnConfirmedCallback", "()Lkotlin/jvm/functions/Function0;", "onConfirmedCallback", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSessionDeleteDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionDeleteDialogFragment.kt\ncom/zykj/student/dialogue/ui/home/dialog/SessionDeleteDialogFragment\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,49:1\n1247#2,6:50\n1247#2,6:56\n*S KotlinDebug\n*F\n+ 1 SessionDeleteDialogFragment.kt\ncom/zykj/student/dialogue/ui/home/dialog/SessionDeleteDialogFragment\n*L\n39#1:50,6\n42#1:56,6\n*E\n"})
/* loaded from: classes5.dex */
public final class SessionDeleteDialogFragment extends Hilt_SessionDeleteDialogFragment {

    /* renamed from: f, reason: from kotlin metadata */
    public final Function0 onConfirmedCallback;

    /* renamed from: j */
    public static final Unit m11024j(final SessionDeleteDialogFragment sessionDeleteDialogFragment, Composer composer, int i9) {
        if (composer.shouldExecute((i9 & 3) != 2, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1749223483, i9, -1, "com.zykj.student.dialogue.ui.home.dialog.SessionDeleteDialogFragment.onCreateView.<anonymous>.<anonymous> (SessionDeleteDialogFragment.kt:35)");
            }
            boolean zChangedInstance = composer.changedInstance(sessionDeleteDialogFragment);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: u6.m
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SessionDeleteDialogFragment.m11025k(this.f17165a);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            boolean zChangedInstance2 = composer.changedInstance(sessionDeleteDialogFragment);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: u6.n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SessionDeleteDialogFragment.m11026l(this.f17166a);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            AbstractC9898m.m16960f("确定要删除吗？", "将永久删除发言，参与讨论的成员不再能看到，\n确认要删除吗？", null, function0, (Function0) objRememberedValue2, composer, 54, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: k */
    public static final Unit m11025k(SessionDeleteDialogFragment sessionDeleteDialogFragment) {
        sessionDeleteDialogFragment.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* renamed from: l */
    public static final Unit m11026l(SessionDeleteDialogFragment sessionDeleteDialogFragment) {
        sessionDeleteDialogFragment.dismissAllowingStateLoss();
        sessionDeleteDialogFragment.onConfirmedCallback.invoke();
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(1, R.style.CustomDialog);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1749223483, true, new Function2() { // from class: u6.l
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SessionDeleteDialogFragment.m11024j(this.f17164a, (Composer) obj, ((Integer) obj2).intValue());
            }
        }));
        return composeView;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCancelable(true);
            dialog.setCanceledOnTouchOutside(true);
        }
        super.onStart();
    }
}
