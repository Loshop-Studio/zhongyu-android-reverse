package androidx.activity.contextaware;

import android.content.Context;
import kotlin.AbstractC9079b;
import kotlin.Result;
import kotlin.jvm.internal.AbstractC9133u;
import p135i8.InterfaceC8845j;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public final class ContextAwareKt$withContextAvailable$2$listener$1 implements OnContextAvailableListener {
    final /* synthetic */ InterfaceC8845j $co;
    final /* synthetic */ InterfaceC10570l $onContextAvailable;

    public ContextAwareKt$withContextAvailable$2$listener$1(InterfaceC8845j interfaceC8845j, InterfaceC10570l interfaceC10570l) {
        this.$co = interfaceC8845j;
        this.$onContextAvailable = interfaceC10570l;
    }

    @Override // androidx.activity.contextaware.OnContextAvailableListener
    public void onContextAvailable(Context context) {
        Object objM15909b;
        AbstractC9133u.m16133g(context, "context");
        InterfaceC8845j interfaceC8845j = this.$co;
        InterfaceC10570l interfaceC10570l = this.$onContextAvailable;
        try {
            Result.C9076a c9076a = Result.f17350b;
            objM15909b = Result.m15909b(interfaceC10570l.invoke(context));
        } catch (Throwable th) {
            Result.C9076a c9076a2 = Result.f17350b;
            objM15909b = Result.m15909b(AbstractC9079b.m15925a(th));
        }
        interfaceC8845j.resumeWith(objM15909b);
    }
}
