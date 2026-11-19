package p025b7;

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
import p119g7.DialogC8078l;

/* renamed from: b7.d2 */
/* loaded from: classes5.dex */
public abstract class AbstractC5137d2 {
    /* renamed from: f */
    public static final void m2203f(Context context, final Function0 callback) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        AlertDialog alertDialogCreate = new AlertDialog.Builder(context).setMessage(R$string.clear_canvas).setPositiveButton(context.getString(R$string.sure), new DialogInterface.OnClickListener() { // from class: b7.z1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i9) {
                AbstractC5137d2.m2204g(callback, dialogInterface, i9);
            }
        }).setNegativeButton(context.getString(R$string.cancel), new DialogInterface.OnClickListener() { // from class: b7.a2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i9) {
                AbstractC5137d2.m2205h(dialogInterface, i9);
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
    public static final void m2204g(Function0 function0, DialogInterface dialogInterface, int i9) {
        function0.invoke();
    }

    /* renamed from: h */
    public static final void m2205h(DialogInterface dialogInterface, int i9) {
        dialogInterface.dismiss();
    }

    /* renamed from: i */
    public static final void m2206i(Context context, String initText, Function1 afterTextChangeCallback, Function0 cancelCallback, final Function1 callback) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(initText, "initText");
        Intrinsics.checkNotNullParameter(afterTextChangeCallback, "afterTextChangeCallback");
        Intrinsics.checkNotNullParameter(cancelCallback, "cancelCallback");
        Intrinsics.checkNotNullParameter(callback, "callback");
        new DialogC8078l(context, 0, 2, null).m12897s(initText, afterTextChangeCallback, new Function1() { // from class: b7.y1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC5137d2.m2210m(callback, (String) obj);
            }
        }, cancelCallback);
    }

    /* renamed from: j */
    public static /* synthetic */ void m2207j(Context context, String str, Function1 function1, Function0 function0, Function1 function12, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = "";
        }
        if ((i9 & 2) != 0) {
            function1 = new Function1() { // from class: b7.b2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return AbstractC5137d2.m2208k((String) obj2);
                }
            };
        }
        if ((i9 & 4) != 0) {
            function0 = new Function0() { // from class: b7.c2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AbstractC5137d2.m2209l();
                }
            };
        }
        m2206i(context, str, function1, function0, function12);
    }

    /* renamed from: k */
    public static final Unit m2208k(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* renamed from: l */
    public static final Unit m2209l() {
        return Unit.INSTANCE;
    }

    /* renamed from: m */
    public static final Unit m2210m(Function1 function1, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(it);
        return Unit.INSTANCE;
    }
}
