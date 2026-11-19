package p263u5;

import android.content.Context;
import com.zykj.blackboard.widgets.TextDialog;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p253t5.InterfaceC9617c;

/* renamed from: u5.h */
/* loaded from: classes4.dex */
public final class C9689h implements InterfaceC9617c {

    /* renamed from: a */
    public final Context f17125a;

    /* renamed from: b */
    public TextDialog f17126b;

    public C9689h(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f17125a = context;
    }

    @Override // p253t5.InterfaceC9617c
    /* renamed from: a */
    public void mo11218a(String initText, Function1 afterTextChangedCallback, Function1 doneCallback, Function0 cancelCallback) {
        Intrinsics.checkNotNullParameter(initText, "initText");
        Intrinsics.checkNotNullParameter(afterTextChangedCallback, "afterTextChangedCallback");
        Intrinsics.checkNotNullParameter(doneCallback, "doneCallback");
        Intrinsics.checkNotNullParameter(cancelCallback, "cancelCallback");
        if (this.f17126b == null) {
            this.f17126b = new TextDialog(this.f17125a, 0, 2, null);
        }
        TextDialog textDialog = this.f17126b;
        if (textDialog != null) {
            textDialog.m8022d(initText, afterTextChangedCallback, doneCallback, cancelCallback);
        }
    }
}
