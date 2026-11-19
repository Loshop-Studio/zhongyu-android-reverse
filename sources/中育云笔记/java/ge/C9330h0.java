package ge;

import ee.InterfaceC9129f;
import java.util.Arrays;
import kotlin.AbstractC9923a;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.serialization.SerializationException;
import p049ce.InterfaceC5432b;
import p153fe.InterfaceC9228e;
import p153fe.InterfaceC9229f;
import p181hd.InterfaceC9529a;
import p309qc.InterfaceC10773d;
import p325rc.AbstractC10968r;

/* renamed from: ge.h0 */
/* loaded from: classes6.dex */
public final class C9330h0 implements InterfaceC5432b {

    /* renamed from: a */
    public final Enum[] f21726a;

    /* renamed from: b */
    public InterfaceC9129f f21727b;

    /* renamed from: c */
    public final InterfaceC10773d f21728c;

    public C9330h0(final String serialName, Enum[] values) {
        AbstractC9979u.m20294g(serialName, "serialName");
        AbstractC9979u.m20294g(values, "values");
        this.f21726a = values;
        this.f21728c = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: ge.g0
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return C9330h0.m18441c(this.f21719c, serialName);
            }
        });
    }

    /* renamed from: c */
    public static final InterfaceC9129f m18441c(C9330h0 c9330h0, String str) {
        InterfaceC9129f interfaceC9129f = c9330h0.f21727b;
        return interfaceC9129f == null ? c9330h0.m18442b(str) : interfaceC9129f;
    }

    /* renamed from: b */
    public final InterfaceC9129f m18442b(String str) {
        C9320f0 c9320f0 = new C9320f0(str, this.f21726a.length);
        for (Enum r02 : this.f21726a) {
            C9312d2.m18389n(c9320f0, r02.name(), false, 2, null);
        }
        return c9320f0;
    }

    @Override // p049ce.InterfaceC5431a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Enum deserialize(InterfaceC9228e decoder) {
        AbstractC9979u.m20294g(decoder, "decoder");
        int iDecodeEnum = decoder.decodeEnum(getDescriptor());
        if (iDecodeEnum >= 0) {
            Enum[] enumArr = this.f21726a;
            if (iDecodeEnum < enumArr.length) {
                return enumArr[iDecodeEnum];
            }
        }
        throw new SerializationException(iDecodeEnum + " is not among valid " + getDescriptor().mo17961f() + " enum values, values size is " + this.f21726a.length);
    }

    @Override // p049ce.InterfaceC5439i
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void serialize(InterfaceC9229f encoder, Enum value) {
        AbstractC9979u.m20294g(encoder, "encoder");
        AbstractC9979u.m20294g(value, "value");
        int iM24048G0 = AbstractC10968r.m24048G0(this.f21726a, value);
        if (iM24048G0 != -1) {
            encoder.encodeEnum(getDescriptor(), iM24048G0);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(value);
        sb2.append(" is not a valid enum ");
        sb2.append(getDescriptor().mo17961f());
        sb2.append(", must be one of ");
        String string = Arrays.toString(this.f21726a);
        AbstractC9979u.m20293f(string, "toString(...)");
        sb2.append(string);
        throw new SerializationException(sb2.toString());
    }

    @Override // p049ce.InterfaceC5432b, p049ce.InterfaceC5439i, p049ce.InterfaceC5431a
    public InterfaceC9129f getDescriptor() {
        return (InterfaceC9129f) this.f21728c.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().mo17961f() + '>';
    }
}
