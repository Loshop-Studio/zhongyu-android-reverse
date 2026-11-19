package p210p5;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.Button;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;
import com.zykj.view.R$color;
import com.zykj.view.R$string;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p265u5.DialogC10197l;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* renamed from: p5.w1 */
/* loaded from: classes5.dex */
public abstract class AbstractC9742w1 {
    /* renamed from: f */
    public static final void m18260f(Context context, final InterfaceC10559a callback) {
        AbstractC9133u.m16133g(context, "<this>");
        AbstractC9133u.m16133g(callback, "callback");
        AlertDialog alertDialogCreate = new AlertDialog.Builder(context).setMessage(R$string.clear_canvas).setPositiveButton(context.getString(R$string.sure), new DialogInterface.OnClickListener() { // from class: p5.s1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                AbstractC9742w1.m18261g(callback, dialogInterface, i10);
            }
        }).setNegativeButton(context.getString(R$string.cancel), new DialogInterface.OnClickListener() { // from class: p5.t1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                AbstractC9742w1.m18262h(dialogInterface, i10);
            }
        }).create();
        alertDialogCreate.show();
        Button button = alertDialogCreate.getButton(-1);
        button.setTextColor(ContextCompat.getColor(context, R$color.button_text));
        button.setTextSize(14.0f);
        Button button2 = alertDialogCreate.getButton(-2);
        button2.setTextColor(ContextCompat.getColor(context, R$color.button_text));
        button2.setTextSize(14.0f);
    }

    /* renamed from: g */
    public static final void m18261g(InterfaceC10559a interfaceC10559a, DialogInterface dialogInterface, int i10) {
        interfaceC10559a.invoke();
    }

    /* renamed from: h */
    public static final void m18262h(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    /* renamed from: i */
    public static final void m18263i(Context context, String initText, InterfaceC10570l afterTextChangeCallback, InterfaceC10559a cancelCallback, final InterfaceC10570l callback) {
        AbstractC9133u.m16133g(context, "<this>");
        AbstractC9133u.m16133g(initText, "initText");
        AbstractC9133u.m16133g(afterTextChangeCallback, "afterTextChangeCallback");
        AbstractC9133u.m16133g(cancelCallback, "cancelCallback");
        AbstractC9133u.m16133g(callback, "callback");
        new DialogC10197l(context, 0, 2, null).m19068s(initText, afterTextChangeCallback, new InterfaceC10570l() { // from class: p5.r1
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return AbstractC9742w1.m18267m(callback, (String) obj);
            }
        }, cancelCallback);
    }

    /* renamed from: j */
    public static /* synthetic */ void m18264j(Context context, String str, InterfaceC10570l interfaceC10570l, InterfaceC10559a interfaceC10559a, InterfaceC10570l interfaceC10570l2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        if ((i10 & 2) != 0) {
            interfaceC10570l = new InterfaceC10570l() { // from class: p5.u1
                @Override // p300x7.InterfaceC10570l
                public final Object invoke(Object obj2) {
                    return AbstractC9742w1.m18265k((String) obj2);
                }
            };
        }
        if ((i10 & 4) != 0) {
            interfaceC10559a = new InterfaceC10559a() { // from class: p5.v1
                @Override // p300x7.InterfaceC10559a
                public final Object invoke() {
                    return AbstractC9742w1.m18266l();
                }
            };
        }
        m18263i(context, str, interfaceC10570l, interfaceC10559a, interfaceC10570l2);
    }

    /* renamed from: k */
    public static final C8736p m18265k(String it) {
        AbstractC9133u.m16133g(it, "it");
        return C8736p.f16368a;
    }

    /* renamed from: l */
    public static final C8736p m18266l() {
        return C8736p.f16368a;
    }

    /* renamed from: m */
    public static final C8736p m18267m(InterfaceC10570l interfaceC10570l, String it) {
        AbstractC9133u.m16133g(it, "it");
        interfaceC10570l.invoke(it);
        return C8736p.f16368a;
    }
}
