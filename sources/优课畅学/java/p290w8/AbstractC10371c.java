package p290w8;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.serialization.SerializationException;
import p089e8.InterfaceC8375c;

/* renamed from: w8.c */
/* loaded from: classes5.dex */
public abstract class AbstractC10371c {
    /* renamed from: a */
    public static final Void m19343a(InterfaceC8375c subClass, InterfaceC8375c baseClass) {
        AbstractC9133u.m16133g(subClass, "subClass");
        AbstractC9133u.m16133g(baseClass, "baseClass");
        String strMo13672g = subClass.mo13672g();
        if (strMo13672g == null) {
            strMo13672g = String.valueOf(subClass);
        }
        m19344b(strMo13672g, baseClass);
        throw new KotlinNothingValueException();
    }

    /* renamed from: b */
    public static final Void m19344b(String str, InterfaceC8375c baseClass) {
        String str2;
        AbstractC9133u.m16133g(baseClass, "baseClass");
        String str3 = "in the polymorphic scope of '" + baseClass.mo13672g() + '\'';
        if (str == null) {
            str2 = "Class discriminator was missing and no default serializers were registered " + str3 + '.';
        } else {
            str2 = "Serializer for subclass '" + str + "' is not found " + str3 + ".\nCheck if class with serial name '" + str + "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '" + str + "' has to be '@Serializable', and the base class '" + baseClass.mo13672g() + "' has to be sealed and '@Serializable'.";
        }
        throw new SerializationException(str2);
    }
}
