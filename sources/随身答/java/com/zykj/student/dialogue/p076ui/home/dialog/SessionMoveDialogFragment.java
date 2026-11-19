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
import com.zykj.base.utils.XToastUtils;
import com.zykj.student.dialogue.R;
import com.zykj.student.dialogue.p076ui.home.dialog.SessionMoveDialogFragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/home/dialog/SessionMoveDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "", "Lcom/zykj/student/dialogue/bean/resp/CatalogResp;", "catalogList", "Lkotlin/Function1;", "", "", "onConfirmedCallback", "<init>", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "f", "Ljava/util/List;", "g", "Lkotlin/jvm/functions/Function1;", "getOnConfirmedCallback", "()Lkotlin/jvm/functions/Function1;", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSessionMoveDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionMoveDialogFragment.kt\ncom/zykj/student/dialogue/ui/home/dialog/SessionMoveDialogFragment\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,54:1\n1247#2,6:55\n1247#2,6:61\n*S KotlinDebug\n*F\n+ 1 SessionMoveDialogFragment.kt\ncom/zykj/student/dialogue/ui/home/dialog/SessionMoveDialogFragment\n*L\n41#1:55,6\n43#1:61,6\n*E\n"})
/* loaded from: classes5.dex */
public final class SessionMoveDialogFragment extends Hilt_SessionMoveDialogFragment {

    /* renamed from: f, reason: from kotlin metadata */
    public final List catalogList;

    /* renamed from: g, reason: from kotlin metadata */
    public final Function1 onConfirmedCallback;

    public SessionMoveDialogFragment(List catalogList, Function1 onConfirmedCallback) {
        Intrinsics.checkNotNullParameter(catalogList, "catalogList");
        Intrinsics.checkNotNullParameter(onConfirmedCallback, "onConfirmedCallback");
        this.catalogList = catalogList;
        this.onConfirmedCallback = onConfirmedCallback;
    }

    /* renamed from: j */
    public static final Unit m11030j(final SessionMoveDialogFragment sessionMoveDialogFragment, Composer composer, int i9) {
        if (composer.shouldExecute((i9 & 3) != 2, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1976938745, i9, -1, "com.zykj.student.dialogue.ui.home.dialog.SessionMoveDialogFragment.onCreateView.<anonymous>.<anonymous> (SessionMoveDialogFragment.kt:40)");
            }
            List list = sessionMoveDialogFragment.catalogList;
            boolean zChangedInstance = composer.changedInstance(sessionMoveDialogFragment);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: u6.q
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SessionMoveDialogFragment.m11031k(this.f17168a);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            boolean zChangedInstance2 = composer.changedInstance(sessionMoveDialogFragment);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: u6.r
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SessionMoveDialogFragment.m11032l(this.f17169a, (Long) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            MoveDialogKt.m11007h(null, list, function0, (Function1) objRememberedValue2, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: k */
    public static final Unit m11031k(SessionMoveDialogFragment sessionMoveDialogFragment) {
        sessionMoveDialogFragment.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* renamed from: l */
    public static final Unit m11032l(SessionMoveDialogFragment sessionMoveDialogFragment, Long l9) {
        if (l9 == null) {
            XToastUtils.INSTANCE.warning("请先选中一个分类");
        } else {
            sessionMoveDialogFragment.dismissAllowingStateLoss();
            sessionMoveDialogFragment.onConfirmedCallback.invoke(l9);
        }
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
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1976938745, true, new Function2() { // from class: u6.p
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SessionMoveDialogFragment.m11030j(this.f17167a, (Composer) obj, ((Integer) obj2).intValue());
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
