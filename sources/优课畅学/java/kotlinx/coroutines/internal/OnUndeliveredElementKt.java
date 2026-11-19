package kotlinx.coroutines.internal;

import java.lang.reflect.InvocationTargetException;
import kotlin.coroutines.InterfaceC9100d;
import p123h7.AbstractC8722b;
import p123h7.C8736p;
import p135i8.AbstractC8818a0;
import p300x7.InterfaceC10570l;

/* loaded from: classes5.dex */
public abstract class OnUndeliveredElementKt {
    /* renamed from: a */
    public static final InterfaceC10570l m16743a(final InterfaceC10570l interfaceC10570l, final Object obj, final InterfaceC9100d interfaceC9100d) {
        return new InterfaceC10570l() { // from class: kotlinx.coroutines.internal.OnUndeliveredElementKt$bindCancellationFun$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                invoke((Throwable) obj2);
                return C8736p.f16368a;
            }

            public final void invoke(Throwable th) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                OnUndeliveredElementKt.m16744b(interfaceC10570l, obj, interfaceC9100d);
            }
        };
    }

    /* renamed from: b */
    public static final void m16744b(InterfaceC10570l interfaceC10570l, Object obj, InterfaceC9100d interfaceC9100d) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        UndeliveredElementException undeliveredElementExceptionM16745c = m16745c(interfaceC10570l, obj, null);
        if (undeliveredElementExceptionM16745c != null) {
            AbstractC8818a0.m14797a(interfaceC9100d, undeliveredElementExceptionM16745c);
        }
    }

    /* renamed from: c */
    public static final UndeliveredElementException m16745c(InterfaceC10570l interfaceC10570l, Object obj, UndeliveredElementException undeliveredElementException) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            interfaceC10570l.invoke(obj);
            return undeliveredElementException;
        } catch (Throwable th) {
            if (undeliveredElementException != null && undeliveredElementException.getCause() != th) {
                AbstractC8722b.m14228a(undeliveredElementException, th);
                return undeliveredElementException;
            }
            return new UndeliveredElementException("Exception in undelivered element handler for " + obj, th);
        }
    }

    /* renamed from: d */
    public static /* synthetic */ UndeliveredElementException m16746d(InterfaceC10570l interfaceC10570l, Object obj, UndeliveredElementException undeliveredElementException, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            undeliveredElementException = null;
        }
        return m16745c(interfaceC10570l, obj, undeliveredElementException);
    }
}
