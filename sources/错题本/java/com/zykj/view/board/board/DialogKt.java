package com.zykj.view.board.board;

import android.content.Context;
import android.content.DialogInterface;
import android.view.C2766k;
import android.widget.Button;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.zykj.mistake.feature.notebook.list.C4959k1;
import com.zykj.view.C5280R;
import com.zykj.view.dialog.TextEditDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001aU\u0010\u000b\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m5110d2 = {"Landroid/content/Context;", "Lkotlin/Function0;", "Ld6/s;", "callback", "showAskForCleanDialog", "(Landroid/content/Context;Lr6/a;)V", "", "initText", "Lkotlin/Function1;", "afterTextChangeCallback", "cancelCallback", "showTextEditDialog", "(Landroid/content/Context;Ljava/lang/String;Lr6/c;Lr6/a;Lr6/c;)V", "view_release"}, m5111k = 2, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class DialogKt {
    public static final void showAskForCleanDialog(@NotNull Context context, @NotNull final InterfaceC6469a callback) {
        AbstractC5830k.m5330g(context, "<this>");
        AbstractC5830k.m5330g(callback, "callback");
        AlertDialog alertDialogCreate = new AlertDialog.Builder(context).setMessage(C5280R.string.clear_canvas).setPositiveButton(context.getString(C5280R.string.sure), new DialogInterface.OnClickListener() { // from class: com.zykj.view.board.board.p
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                callback.invoke();
            }
        }).setNegativeButton(context.getString(C5280R.string.cancel), new DialogInterfaceOnClickListenerC5319q(0)).create();
        alertDialogCreate.show();
        Button button = alertDialogCreate.getButton(-1);
        button.setTextColor(ContextCompat.getColor(context, C5280R.color.button_text));
        button.setTextSize(14.0f);
        Button button2 = alertDialogCreate.getButton(-2);
        button2.setTextColor(ContextCompat.getColor(context, C5280R.color.button_text));
        button2.setTextSize(14.0f);
    }

    public static final void showTextEditDialog(@NotNull Context context, @NotNull String initText, @NotNull InterfaceC6471c afterTextChangeCallback, @NotNull InterfaceC6469a cancelCallback, @NotNull InterfaceC6471c callback) {
        AbstractC5830k.m5330g(context, "<this>");
        AbstractC5830k.m5330g(initText, "initText");
        AbstractC5830k.m5330g(afterTextChangeCallback, "afterTextChangeCallback");
        AbstractC5830k.m5330g(cancelCallback, "cancelCallback");
        AbstractC5830k.m5330g(callback, "callback");
        int i = 2;
        new TextEditDialog(context, 0, i, null).showDialog(initText, afterTextChangeCallback, new C5307e(callback, i), cancelCallback);
    }

    public static /* synthetic */ void showTextEditDialog$default(Context context, String str, InterfaceC6471c interfaceC6471c, InterfaceC6469a interfaceC6469a, InterfaceC6471c interfaceC6471c2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            interfaceC6471c = new C4959k1(14);
        }
        if ((i & 4) != 0) {
            interfaceC6469a = new C2766k(22);
        }
        showTextEditDialog(context, str, interfaceC6471c, interfaceC6469a, interfaceC6471c2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s showTextEditDialog$lambda$5(String it) {
        AbstractC5830k.m5330g(it, "it");
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s showTextEditDialog$lambda$7(InterfaceC6471c interfaceC6471c, String it) {
        AbstractC5830k.m5330g(it, "it");
        interfaceC6471c.invoke(it);
        return C5443s.f8405a;
    }
}
