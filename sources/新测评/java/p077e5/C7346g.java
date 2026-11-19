package p077e5;

import android.content.Context;
import com.zykj.blackboard.widgets.TextDialog;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p066d5.InterfaceC7291c;

/* renamed from: e5.g */
/* loaded from: classes4.dex */
public final class C7346g implements InterfaceC7291c {

    /* renamed from: a */
    public final Context f11912a;

    /* renamed from: b */
    public TextDialog f11913b;

    public C7346g(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f11912a = context;
    }

    @Override // p066d5.InterfaceC7291c
    /* renamed from: a */
    public void mo10819a(String initText, Function1 afterTextChangedCallback, Function1 doneCallback, Function0 cancelCallback) {
        Intrinsics.checkNotNullParameter(initText, "initText");
        Intrinsics.checkNotNullParameter(afterTextChangedCallback, "afterTextChangedCallback");
        Intrinsics.checkNotNullParameter(doneCallback, "doneCallback");
        Intrinsics.checkNotNullParameter(cancelCallback, "cancelCallback");
        if (this.f11913b == null) {
            this.f11913b = new TextDialog(this.f11912a, 0, 2, null);
        }
        TextDialog textDialog = this.f11913b;
        if (textDialog != null) {
            textDialog.m6906d(initText, afterTextChangedCallback, doneCallback, cancelCallback);
        }
    }
}
