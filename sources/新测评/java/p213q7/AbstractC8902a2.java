package p213q7;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.Button;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;
import com.zykj.view.R$color;
import com.zykj.view.R$string;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p268v7.DialogC9721l;

/* renamed from: q7.a2 */
/* loaded from: classes5.dex */
public abstract class AbstractC8902a2 {
    /* renamed from: f */
    public static final void m15013f(Context context, final Function0 callback) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        AlertDialog alertDialogCreate = new AlertDialog.Builder(context).setMessage(R$string.clear_canvas).setPositiveButton(context.getString(R$string.sure), new DialogInterface.OnClickListener() { // from class: q7.w1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                AbstractC8902a2.m15014g(callback, dialogInterface, i10);
            }
        }).setNegativeButton(context.getString(R$string.cancel), new DialogInterface.OnClickListener() { // from class: q7.x1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                AbstractC8902a2.m15015h(dialogInterface, i10);
            }
        }).create();
        alertDialogCreate.show();
        Button button = alertDialogCreate.getButton(-1);
        int i10 = R$color.button_text;
        button.setTextColor(ContextCompat.getColor(context, i10));
        button.setTextSize(14.0f);
        Button button2 = alertDialogCreate.getButton(-2);
        button2.setTextColor(ContextCompat.getColor(context, i10));
        button2.setTextSize(14.0f);
    }

    /* renamed from: g */
    public static final void m15014g(Function0 function0, DialogInterface dialogInterface, int i10) {
        function0.invoke();
    }

    /* renamed from: h */
    public static final void m15015h(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    /* renamed from: i */
    public static final void m15016i(Context context, String initText, Function1 afterTextChangeCallback, Function0 cancelCallback, final Function1 callback) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(initText, "initText");
        Intrinsics.checkNotNullParameter(afterTextChangeCallback, "afterTextChangeCallback");
        Intrinsics.checkNotNullParameter(cancelCallback, "cancelCallback");
        Intrinsics.checkNotNullParameter(callback, "callback");
        new DialogC9721l(context, 0, 2, null).m16252s(initText, afterTextChangeCallback, new Function1() { // from class: q7.v1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC8902a2.m15020m(callback, (String) obj);
            }
        }, cancelCallback);
    }

    /* renamed from: j */
    public static /* synthetic */ void m15017j(Context context, String str, Function1 function1, Function0 function0, Function1 function12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        if ((i10 & 2) != 0) {
            function1 = new Function1() { // from class: q7.y1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return AbstractC8902a2.m15018k((String) obj2);
                }
            };
        }
        if ((i10 & 4) != 0) {
            function0 = new Function0() { // from class: q7.z1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AbstractC8902a2.m15019l();
                }
            };
        }
        m15016i(context, str, function1, function0, function12);
    }

    /* renamed from: k */
    public static final Unit m15018k(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* renamed from: l */
    public static final Unit m15019l() {
        return Unit.INSTANCE;
    }

    /* renamed from: m */
    public static final Unit m15020m(Function1 function1, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(it);
        return Unit.INSTANCE;
    }
}
