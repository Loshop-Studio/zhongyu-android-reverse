package com.zykj.blackboard.utils;

import android.content.Context;
import com.zykj.blackboard.listener.TextEditView;
import com.zykj.blackboard.widgets.TextDialog;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes4.dex */
public final class DefaultTextEditView implements TextEditView {
    private final Context context;
    private TextDialog dialog;

    public DefaultTextEditView(Context context) {
        AbstractC9133u.m16133g(context, "context");
        this.context = context;
    }

    public final TextDialog getDialog() {
        return this.dialog;
    }

    public final void setDialog(TextDialog textDialog) {
        this.dialog = textDialog;
    }

    @Override // com.zykj.blackboard.listener.TextEditView
    public void showEditView(String initText, InterfaceC10570l afterTextChangedCallback, InterfaceC10570l doneCallback, InterfaceC10559a cancelCallback) {
        AbstractC9133u.m16133g(initText, "initText");
        AbstractC9133u.m16133g(afterTextChangedCallback, "afterTextChangedCallback");
        AbstractC9133u.m16133g(doneCallback, "doneCallback");
        AbstractC9133u.m16133g(cancelCallback, "cancelCallback");
        if (this.dialog == null) {
            this.dialog = new TextDialog(this.context, 0, 2, null);
        }
        TextDialog textDialog = this.dialog;
        if (textDialog != null) {
            textDialog.showDialog(initText, afterTextChangedCallback, doneCallback, cancelCallback);
        }
    }
}
