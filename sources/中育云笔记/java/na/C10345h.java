package na;

import android.content.Context;
import com.zykj.blackboard.widgets.TextDialog;
import kotlin.jvm.internal.AbstractC9979u;
import ma.InterfaceC10222j;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;

/* renamed from: na.h */
/* loaded from: classes5.dex */
public final class C10345h implements InterfaceC10222j {

    /* renamed from: a */
    public final Context f24650a;

    /* renamed from: b */
    public TextDialog f24651b;

    public C10345h(Context context) {
        AbstractC9979u.m20294g(context, "context");
        this.f24650a = context;
    }

    @Override // ma.InterfaceC10222j
    /* renamed from: a */
    public void mo16800a(String initText, InterfaceC9540l afterTextChangedCallback, InterfaceC9540l doneCallback, InterfaceC9529a cancelCallback) {
        AbstractC9979u.m20294g(initText, "initText");
        AbstractC9979u.m20294g(afterTextChangedCallback, "afterTextChangedCallback");
        AbstractC9979u.m20294g(doneCallback, "doneCallback");
        AbstractC9979u.m20294g(cancelCallback, "cancelCallback");
        if (this.f24651b == null) {
            this.f24651b = new TextDialog(this.f24650a, 0, 2, null);
        }
        TextDialog textDialog = this.f24651b;
        if (textDialog != null) {
            textDialog.m14642d(initText, afterTextChangedCallback, doneCallback, cancelCallback);
        }
    }
}
