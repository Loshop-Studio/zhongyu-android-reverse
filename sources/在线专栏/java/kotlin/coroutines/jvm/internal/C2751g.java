package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Field;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlin.coroutines.jvm.internal.g */
/* loaded from: classes.dex */
public final class C2751g {
    /* renamed from: a */
    private static final void m9211a(int i4, int i5) {
        if (i5 <= i4) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i4 + ", got " + i5 + ". Please update the Kotlin standard library.").toString());
    }

    /* renamed from: b */
    private static final InterfaceC2750f m9212b(AbstractC2745a abstractC2745a) {
        return (InterfaceC2750f) abstractC2745a.getClass().getAnnotation(InterfaceC2750f.class);
    }

    /* renamed from: c */
    private static final int m9213c(AbstractC2745a abstractC2745a) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        try {
            Field declaredField = abstractC2745a.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(abstractC2745a);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num == null ? 0 : num.intValue()) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    @Nullable
    /* renamed from: d */
    public static final StackTraceElement m9214d(@NotNull AbstractC2745a abstractC2745a) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        String strM9206c;
        C2769l.m9241e(abstractC2745a, "<this>");
        InterfaceC2750f interfaceC2750fM9212b = m9212b(abstractC2745a);
        if (interfaceC2750fM9212b == null) {
            return null;
        }
        m9211a(1, interfaceC2750fM9212b.m9210v());
        int iM9213c = m9213c(abstractC2745a);
        int i4 = iM9213c < 0 ? -1 : interfaceC2750fM9212b.m9208l()[iM9213c];
        String strM9219b = C2753i.f10711a.m9219b(abstractC2745a);
        if (strM9219b == null) {
            strM9206c = interfaceC2750fM9212b.m9206c();
        } else {
            strM9206c = ((Object) strM9219b) + '/' + interfaceC2750fM9212b.m9206c();
        }
        return new StackTraceElement(strM9206c, interfaceC2750fM9212b.m9209m(), interfaceC2750fM9212b.m9207f(), i4);
    }
}
