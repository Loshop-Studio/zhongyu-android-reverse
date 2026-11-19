package p201o7;

import java.lang.reflect.Field;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: o7.e */
/* loaded from: classes5.dex */
public abstract class AbstractC9540e {
    /* renamed from: a */
    public static final void m17805a(int i10, int i11) {
        if (i11 <= i10) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i10 + ", got " + i11 + ". Please update the Kotlin standard library.").toString());
    }

    /* renamed from: b */
    public static final InterfaceC9539d m17806b(BaseContinuationImpl baseContinuationImpl) {
        return (InterfaceC9539d) baseContinuationImpl.getClass().getAnnotation(InterfaceC9539d.class);
    }

    /* renamed from: c */
    public static final int m17807c(BaseContinuationImpl baseContinuationImpl) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        try {
            Field declaredField = baseContinuationImpl.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(baseContinuationImpl);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: d */
    public static final StackTraceElement m17808d(BaseContinuationImpl baseContinuationImpl) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        String strM17800c;
        AbstractC9133u.m16133g(baseContinuationImpl, "<this>");
        InterfaceC9539d interfaceC9539dM17806b = m17806b(baseContinuationImpl);
        if (interfaceC9539dM17806b == null) {
            return null;
        }
        m17805a(1, interfaceC9539dM17806b.m17804v());
        int iM17807c = m17807c(baseContinuationImpl);
        int i10 = iM17807c < 0 ? -1 : interfaceC9539dM17806b.m17802l()[iM17807c];
        String strM17813b = C9542g.f18902a.m17813b(baseContinuationImpl);
        if (strM17813b == null) {
            strM17800c = interfaceC9539dM17806b.m17800c();
        } else {
            strM17800c = strM17813b + '/' + interfaceC9539dM17806b.m17800c();
        }
        return new StackTraceElement(strM17800c, interfaceC9539dM17806b.m17803m(), interfaceC9539dM17806b.m17801f(), i10);
    }
}
