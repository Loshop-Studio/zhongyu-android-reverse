package androidx.activity.contextaware;

import android.content.Context;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.AbstractC9977s;
import kotlinx.coroutines.C9997c;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11831f;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
public final class ContextAwareKt {
    public static final <R> Object withContextAvailable(ContextAware contextAware, InterfaceC9540l interfaceC9540l, InterfaceC11588c<R> interfaceC11588c) {
        Context contextPeekAvailableContext = contextAware.peekAvailableContext();
        if (contextPeekAvailableContext != null) {
            return interfaceC9540l.invoke(contextPeekAvailableContext);
        }
        C9997c c9997c = new C9997c(IntrinsicsKt__IntrinsicsJvmKt.m20224d(interfaceC11588c), 1);
        c9997c.m20503F();
        ContextAwareKt$withContextAvailable$2$listener$1 contextAwareKt$withContextAvailable$2$listener$1 = new ContextAwareKt$withContextAvailable$2$listener$1(c9997c, interfaceC9540l);
        contextAware.addOnContextAvailableListener(contextAwareKt$withContextAvailable$2$listener$1);
        c9997c.mo20536u(new ContextAwareKt$withContextAvailable$2$1(contextAware, contextAwareKt$withContextAvailable$2$listener$1));
        Object objM20538x = c9997c.m20538x();
        if (objM20538x == AbstractC11725a.m25952f()) {
            AbstractC11831f.m26221c(interfaceC11588c);
        }
        return objM20538x;
    }

    private static final <R> Object withContextAvailable$$forInline(ContextAware contextAware, InterfaceC9540l interfaceC9540l, InterfaceC11588c<R> interfaceC11588c) {
        Context contextPeekAvailableContext = contextAware.peekAvailableContext();
        if (contextPeekAvailableContext != null) {
            return interfaceC9540l.invoke(contextPeekAvailableContext);
        }
        AbstractC9977s.m20287c(0);
        C9997c c9997c = new C9997c(IntrinsicsKt__IntrinsicsJvmKt.m20224d(interfaceC11588c), 1);
        c9997c.m20503F();
        ContextAwareKt$withContextAvailable$2$listener$1 contextAwareKt$withContextAvailable$2$listener$1 = new ContextAwareKt$withContextAvailable$2$listener$1(c9997c, interfaceC9540l);
        contextAware.addOnContextAvailableListener(contextAwareKt$withContextAvailable$2$listener$1);
        c9997c.mo20536u(new ContextAwareKt$withContextAvailable$2$1(contextAware, contextAwareKt$withContextAvailable$2$listener$1));
        C10786q c10786q = C10786q.f26013a;
        Object objM20538x = c9997c.m20538x();
        if (objM20538x == AbstractC11725a.m25952f()) {
            AbstractC11831f.m26221c(interfaceC11588c);
        }
        AbstractC9977s.m20287c(1);
        return objM20538x;
    }
}
