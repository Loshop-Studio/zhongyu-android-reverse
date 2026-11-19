package p224kb;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.Button;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;
import com.zykj.view.R$color;
import com.zykj.view.R$string;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p294pb.DialogC10651l;
import p309qc.C10786q;

/* renamed from: kb.w1 */
/* loaded from: classes6.dex */
public abstract class AbstractC9899w1 {
    /* renamed from: f */
    public static final void m19957f(Context context, final InterfaceC9529a callback) {
        AbstractC9979u.m20294g(context, "<this>");
        AbstractC9979u.m20294g(callback, "callback");
        AlertDialog alertDialogCreate = new AlertDialog.Builder(context).setMessage(R$string.clear_canvas).setPositiveButton(context.getString(R$string.sure), new DialogInterface.OnClickListener() { // from class: kb.s1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                AbstractC9899w1.m19958g(callback, dialogInterface, i10);
            }
        }).setNegativeButton(context.getString(R$string.cancel), new DialogInterface.OnClickListener() { // from class: kb.t1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                AbstractC9899w1.m19959h(dialogInterface, i10);
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
    public static final void m19958g(InterfaceC9529a interfaceC9529a, DialogInterface dialogInterface, int i10) {
        interfaceC9529a.invoke();
    }

    /* renamed from: h */
    public static final void m19959h(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    /* renamed from: i */
    public static final void m19960i(Context context, String initText, InterfaceC9540l afterTextChangeCallback, InterfaceC9529a cancelCallback, final InterfaceC9540l callback) {
        AbstractC9979u.m20294g(context, "<this>");
        AbstractC9979u.m20294g(initText, "initText");
        AbstractC9979u.m20294g(afterTextChangeCallback, "afterTextChangeCallback");
        AbstractC9979u.m20294g(cancelCallback, "cancelCallback");
        AbstractC9979u.m20294g(callback, "callback");
        new DialogC10651l(context, 0, 2, null).m22536s(initText, afterTextChangeCallback, new InterfaceC9540l() { // from class: kb.r1
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return AbstractC9899w1.m19964m(callback, (String) obj);
            }
        }, cancelCallback);
    }

    /* renamed from: j */
    public static /* synthetic */ void m19961j(Context context, String str, InterfaceC9540l interfaceC9540l, InterfaceC9529a interfaceC9529a, InterfaceC9540l interfaceC9540l2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        if ((i10 & 2) != 0) {
            interfaceC9540l = new InterfaceC9540l() { // from class: kb.u1
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj2) {
                    return AbstractC9899w1.m19962k((String) obj2);
                }
            };
        }
        if ((i10 & 4) != 0) {
            interfaceC9529a = new InterfaceC9529a() { // from class: kb.v1
                @Override // p181hd.InterfaceC9529a
                public final Object invoke() {
                    return AbstractC9899w1.m19963l();
                }
            };
        }
        m19960i(context, str, interfaceC9540l, interfaceC9529a, interfaceC9540l2);
    }

    /* renamed from: k */
    public static final C10786q m19962k(String it) {
        AbstractC9979u.m20294g(it, "it");
        return C10786q.f26013a;
    }

    /* renamed from: l */
    public static final C10786q m19963l() {
        return C10786q.f26013a;
    }

    /* renamed from: m */
    public static final C10786q m19964m(InterfaceC9540l interfaceC9540l, String it) {
        AbstractC9979u.m20294g(it, "it");
        interfaceC9540l.invoke(it);
        return C10786q.f26013a;
    }
}
