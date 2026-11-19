package p264u6;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.zykj.student.dialogue.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p138i6.AbstractC8136b;

/* renamed from: u6.b */
/* loaded from: classes5.dex */
public final class DialogC9703b extends Dialog {
    public /* synthetic */ DialogC9703b(Context context, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? R.style.AppTheme_Dialog : i9);
    }

    /* renamed from: b */
    public static final Unit m16221b(DialogC9703b dialogC9703b, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        dialogC9703b.dismiss();
        return Unit.INSTANCE;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dialog_camera_forbidden);
        View viewFindViewById = findViewById(R.id.tv_confirm);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        AbstractC8136b.m13040h(viewFindViewById, new Function1() { // from class: u6.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DialogC9703b.m16221b(this.f17140a, (View) obj);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC9703b(Context context, int i9) {
        super(context, i9);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
