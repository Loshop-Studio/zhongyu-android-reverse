package ge;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.serialization.SerializationException;
import p280od.InterfaceC10469c;

/* renamed from: ge.c */
/* loaded from: classes6.dex */
public abstract class AbstractC9304c {
    /* renamed from: a */
    public static final Void m18369a(String str, InterfaceC10469c baseClass) {
        String str2;
        AbstractC9979u.m20294g(baseClass, "baseClass");
        String str3 = "in the polymorphic scope of '" + baseClass.mo20277f() + '\'';
        if (str == null) {
            str2 = "Class discriminator was missing and no default serializers were registered " + str3 + '.';
        } else {
            str2 = "Serializer for subclass '" + str + "' is not found " + str3 + ".\nCheck if class with serial name '" + str + "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '" + str + "' has to be '@Serializable', and the base class '" + baseClass.mo20277f() + "' has to be sealed and '@Serializable'.";
        }
        throw new SerializationException(str2);
    }

    /* renamed from: b */
    public static final Void m18370b(InterfaceC10469c subClass, InterfaceC10469c baseClass) {
        AbstractC9979u.m20294g(subClass, "subClass");
        AbstractC9979u.m20294g(baseClass, "baseClass");
        String strMo20277f = subClass.mo20277f();
        if (strMo20277f == null) {
            strMo20277f = String.valueOf(subClass);
        }
        m18369a(strMo20277f, baseClass);
        throw new KotlinNothingValueException();
    }
}
