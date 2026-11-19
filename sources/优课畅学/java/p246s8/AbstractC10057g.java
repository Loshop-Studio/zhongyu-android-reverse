package p246s8;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p279v8.InterfaceC10254c;
import p279v8.InterfaceC10257f;
import p290w8.AbstractC10366b;
import p290w8.AbstractC10371c;

/* renamed from: s8.g */
/* loaded from: classes5.dex */
public abstract class AbstractC10057g {
    /* renamed from: a */
    public static final InterfaceC10051a m18761a(AbstractC10366b abstractC10366b, InterfaceC10254c decoder, String str) {
        AbstractC9133u.m16133g(abstractC10366b, "<this>");
        AbstractC9133u.m16133g(decoder, "decoder");
        InterfaceC10051a interfaceC10051aM19334c = abstractC10366b.m19334c(decoder, str);
        if (interfaceC10051aM19334c != null) {
            return interfaceC10051aM19334c;
        }
        AbstractC10371c.m19344b(str, abstractC10366b.mo18760e());
        throw new KotlinNothingValueException();
    }

    /* renamed from: b */
    public static final InterfaceC10059i m18762b(AbstractC10366b abstractC10366b, InterfaceC10257f encoder, Object value) {
        AbstractC9133u.m16133g(abstractC10366b, "<this>");
        AbstractC9133u.m16133g(encoder, "encoder");
        AbstractC9133u.m16133g(value, "value");
        InterfaceC10059i interfaceC10059iM19335d = abstractC10366b.m19335d(encoder, value);
        if (interfaceC10059iM19335d != null) {
            return interfaceC10059iM19335d;
        }
        AbstractC10371c.m19343a(AbstractC9137y.m16154b(value.getClass()), abstractC10366b.mo18760e());
        throw new KotlinNothingValueException();
    }
}
