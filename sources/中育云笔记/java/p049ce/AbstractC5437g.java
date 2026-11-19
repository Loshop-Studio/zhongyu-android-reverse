package p049ce;

import ge.AbstractC9299b;
import ge.AbstractC9304c;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p153fe.InterfaceC9226c;
import p153fe.InterfaceC9229f;

/* renamed from: ce.g */
/* loaded from: classes6.dex */
public abstract class AbstractC5437g {
    /* renamed from: a */
    public static final InterfaceC5431a m2935a(AbstractC9299b abstractC9299b, InterfaceC9226c decoder, String str) {
        AbstractC9979u.m20294g(abstractC9299b, "<this>");
        AbstractC9979u.m20294g(decoder, "decoder");
        InterfaceC5431a interfaceC5431aM18360c = abstractC9299b.m18360c(decoder, str);
        if (interfaceC5431aM18360c != null) {
            return interfaceC5431aM18360c;
        }
        AbstractC9304c.m18369a(str, abstractC9299b.mo2934e());
        throw new KotlinNothingValueException();
    }

    /* renamed from: b */
    public static final InterfaceC5439i m2936b(AbstractC9299b abstractC9299b, InterfaceC9229f encoder, Object value) {
        AbstractC9979u.m20294g(abstractC9299b, "<this>");
        AbstractC9979u.m20294g(encoder, "encoder");
        AbstractC9979u.m20294g(value, "value");
        InterfaceC5439i interfaceC5439iM18361d = abstractC9299b.m18361d(encoder, value);
        if (interfaceC5439iM18361d != null) {
            return interfaceC5439iM18361d;
        }
        AbstractC9304c.m18370b(AbstractC9983y.m20315b(value.getClass()), abstractC9299b.mo2934e());
        throw new KotlinNothingValueException();
    }
}
