package androidx.activity.contextaware;

import android.content.Context;
import kotlin.AbstractC9924b;
import kotlin.Result;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import sd.InterfaceC11125j;

/* loaded from: classes.dex */
public final class ContextAwareKt$withContextAvailable$2$listener$1 implements OnContextAvailableListener {
    final /* synthetic */ InterfaceC11125j $co;
    final /* synthetic */ InterfaceC9540l $onContextAvailable;

    public ContextAwareKt$withContextAvailable$2$listener$1(InterfaceC11125j interfaceC11125j, InterfaceC9540l interfaceC9540l) {
        this.$co = interfaceC11125j;
        this.$onContextAvailable = interfaceC9540l;
    }

    @Override // androidx.activity.contextaware.OnContextAvailableListener
    public void onContextAvailable(Context context) {
        Object objM20054c;
        AbstractC9979u.m20294g(context, "context");
        InterfaceC11125j interfaceC11125j = this.$co;
        InterfaceC9540l interfaceC9540l = this.$onContextAvailable;
        try {
            Result.C9921a c9921a = Result.f23263d;
            objM20054c = Result.m20054c(interfaceC9540l.invoke(context));
        } catch (Throwable th) {
            Result.C9921a c9921a2 = Result.f23263d;
            objM20054c = Result.m20054c(AbstractC9924b.m20070a(th));
        }
        interfaceC11125j.resumeWith(objM20054c);
    }
}
