package androidx.activity.contextaware;

import android.content.Context;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.AbstractC9131s;
import kotlinx.coroutines.C9155c;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9541f;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public final class ContextAwareKt {
    public static final <R> Object withContextAvailable(ContextAware contextAware, InterfaceC10570l interfaceC10570l, InterfaceC9324c<R> interfaceC9324c) {
        Context contextPeekAvailableContext = contextAware.peekAvailableContext();
        if (contextPeekAvailableContext != null) {
            return interfaceC10570l.invoke(contextPeekAvailableContext);
        }
        C9155c c9155c = new C9155c(IntrinsicsKt__IntrinsicsJvmKt.m16079d(interfaceC9324c), 1);
        c9155c.m16343D();
        ContextAwareKt$withContextAvailable$2$listener$1 contextAwareKt$withContextAvailable$2$listener$1 = new ContextAwareKt$withContextAvailable$2$listener$1(c9155c, interfaceC10570l);
        contextAware.addOnContextAvailableListener(contextAwareKt$withContextAvailable$2$listener$1);
        c9155c.mo14873r(new ContextAwareKt$withContextAvailable$2$1(contextAware, contextAwareKt$withContextAvailable$2$listener$1));
        Object objM16372x = c9155c.m16372x();
        if (objM16372x == AbstractC9434a.m17291f()) {
            AbstractC9541f.m17811c(interfaceC9324c);
        }
        return objM16372x;
    }

    private static final <R> Object withContextAvailable$$forInline(ContextAware contextAware, InterfaceC10570l interfaceC10570l, InterfaceC9324c<R> interfaceC9324c) {
        Context contextPeekAvailableContext = contextAware.peekAvailableContext();
        if (contextPeekAvailableContext != null) {
            return interfaceC10570l.invoke(contextPeekAvailableContext);
        }
        AbstractC9131s.m16126c(0);
        C9155c c9155c = new C9155c(IntrinsicsKt__IntrinsicsJvmKt.m16079d(interfaceC9324c), 1);
        c9155c.m16343D();
        ContextAwareKt$withContextAvailable$2$listener$1 contextAwareKt$withContextAvailable$2$listener$1 = new ContextAwareKt$withContextAvailable$2$listener$1(c9155c, interfaceC10570l);
        contextAware.addOnContextAvailableListener(contextAwareKt$withContextAvailable$2$listener$1);
        c9155c.mo14873r(new ContextAwareKt$withContextAvailable$2$1(contextAware, contextAwareKt$withContextAvailable$2$listener$1));
        C8736p c8736p = C8736p.f16368a;
        Object objM16372x = c9155c.m16372x();
        if (objM16372x == AbstractC9434a.m17291f()) {
            AbstractC9541f.m17811c(interfaceC9324c);
        }
        AbstractC9131s.m16126c(1);
        return objM16372x;
    }
}
