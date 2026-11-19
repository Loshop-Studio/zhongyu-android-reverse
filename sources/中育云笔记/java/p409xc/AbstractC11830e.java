package p409xc;

import java.lang.reflect.Field;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: xc.e */
/* loaded from: classes6.dex */
public abstract class AbstractC11830e {
    /* renamed from: a */
    public static final void m26215a(int i10, int i11) {
        if (i11 <= i10) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i10 + ", got " + i11 + ". Please update the Kotlin standard library.").toString());
    }

    /* renamed from: b */
    public static final InterfaceC11829d m26216b(BaseContinuationImpl baseContinuationImpl) {
        return (InterfaceC11829d) baseContinuationImpl.getClass().getAnnotation(InterfaceC11829d.class);
    }

    /* renamed from: c */
    public static final int m26217c(BaseContinuationImpl baseContinuationImpl) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
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
    public static final StackTraceElement m26218d(BaseContinuationImpl baseContinuationImpl) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        String strM26210c;
        AbstractC9979u.m20294g(baseContinuationImpl, "<this>");
        InterfaceC11829d interfaceC11829dM26216b = m26216b(baseContinuationImpl);
        if (interfaceC11829dM26216b == null) {
            return null;
        }
        m26215a(1, interfaceC11829dM26216b.m26214v());
        int iM26217c = m26217c(baseContinuationImpl);
        int i10 = iM26217c < 0 ? -1 : interfaceC11829dM26216b.m26212l()[iM26217c];
        String strM26223b = C11832g.f28069a.m26223b(baseContinuationImpl);
        if (strM26223b == null) {
            strM26210c = interfaceC11829dM26216b.m26210c();
        } else {
            strM26210c = strM26223b + '/' + interfaceC11829dM26216b.m26210c();
        }
        return new StackTraceElement(strM26210c, interfaceC11829dM26216b.m26213m(), interfaceC11829dM26216b.m26211f(), i10);
    }
}
