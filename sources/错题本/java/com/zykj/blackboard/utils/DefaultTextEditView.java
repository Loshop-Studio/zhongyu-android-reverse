package com.zykj.blackboard.utils;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.compose.DialogNavigator;
import com.zykj.blackboard.proxy.TextEditView;
import com.zykj.blackboard.widgets.TextDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JM\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m5110d2 = {"Lcom/zykj/blackboard/utils/DefaultTextEditView;", "Lcom/zykj/blackboard/proxy/TextEditView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "initText", "Lkotlin/Function1;", "Ld6/s;", "afterTextChangedCallback", "doneCallback", "Lkotlin/Function0;", "cancelCallback", "showEditView", "(Ljava/lang/String;Lr6/c;Lr6/c;Lr6/a;)V", "Landroid/content/Context;", "Lcom/zykj/blackboard/widgets/TextDialog;", DialogNavigator.NAME, "Lcom/zykj/blackboard/widgets/TextDialog;", "getDialog", "()Lcom/zykj/blackboard/widgets/TextDialog;", "setDialog", "(Lcom/zykj/blackboard/widgets/TextDialog;)V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class DefaultTextEditView implements TextEditView {

    @NotNull
    private final Context context;

    @Nullable
    private TextDialog dialog;

    public DefaultTextEditView(@NotNull Context context) {
        AbstractC5830k.m5330g(context, "context");
        this.context = context;
    }

    @Nullable
    public final TextDialog getDialog() {
        return this.dialog;
    }

    public final void setDialog(@Nullable TextDialog textDialog) {
        this.dialog = textDialog;
    }

    @Override // com.zykj.blackboard.proxy.TextEditView
    public void showEditView(@NotNull String initText, @NotNull InterfaceC6471c afterTextChangedCallback, @NotNull InterfaceC6471c doneCallback, @NotNull InterfaceC6469a cancelCallback) {
        AbstractC5830k.m5330g(initText, "initText");
        AbstractC5830k.m5330g(afterTextChangedCallback, "afterTextChangedCallback");
        AbstractC5830k.m5330g(doneCallback, "doneCallback");
        AbstractC5830k.m5330g(cancelCallback, "cancelCallback");
        if (this.dialog == null) {
            this.dialog = new TextDialog(this.context, 0, 2, null);
        }
        TextDialog textDialog = this.dialog;
        if (textDialog != null) {
            textDialog.showDialog(initText, afterTextChangedCallback, doneCallback, cancelCallback);
        }
    }
}
