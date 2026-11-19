package p410xd;

import java.lang.reflect.InvocationTargetException;
import kotlin.coroutines.InterfaceC9945d;
import kotlinx.coroutines.internal.UndeliveredElementException;
import p181hd.InterfaceC9540l;
import p309qc.AbstractC10771b;
import sd.AbstractC11114g0;

/* renamed from: xd.v */
/* loaded from: classes6.dex */
public abstract class AbstractC11871v {
    /* renamed from: a */
    public static final void m26349a(InterfaceC9540l interfaceC9540l, Object obj, InterfaceC9945d interfaceC9945d) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        UndeliveredElementException undeliveredElementExceptionM26350b = m26350b(interfaceC9540l, obj, null);
        if (undeliveredElementExceptionM26350b != null) {
            AbstractC11114g0.m24718a(interfaceC9945d, undeliveredElementExceptionM26350b);
        }
    }

    /* renamed from: b */
    public static final UndeliveredElementException m26350b(InterfaceC9540l interfaceC9540l, Object obj, UndeliveredElementException undeliveredElementException) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            interfaceC9540l.invoke(obj);
            return undeliveredElementException;
        } catch (Throwable th) {
            if (undeliveredElementException != null && undeliveredElementException.getCause() != th) {
                AbstractC10771b.m22973a(undeliveredElementException, th);
                return undeliveredElementException;
            }
            return new UndeliveredElementException("Exception in undelivered element handler for " + obj, th);
        }
    }

    /* renamed from: c */
    public static /* synthetic */ UndeliveredElementException m26351c(InterfaceC9540l interfaceC9540l, Object obj, UndeliveredElementException undeliveredElementException, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            undeliveredElementException = null;
        }
        return m26350b(interfaceC9540l, obj, undeliveredElementException);
    }
}
