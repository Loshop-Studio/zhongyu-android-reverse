package p290w8;

import java.util.Arrays;
import kotlin.AbstractC9078a;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.serialization.SerializationException;
import p123h7.InterfaceC8724d;
import p134i7.AbstractC8801r;
import p246s8.InterfaceC10052b;
import p268u8.InterfaceC10210f;
import p279v8.InterfaceC10256e;
import p279v8.InterfaceC10257f;
import p300x7.InterfaceC10559a;

/* renamed from: w8.h0 */
/* loaded from: classes5.dex */
public final class C10397h0 implements InterfaceC10052b {

    /* renamed from: a */
    public final Enum[] f20699a;

    /* renamed from: b */
    public InterfaceC10210f f20700b;

    /* renamed from: c */
    public final InterfaceC8724d f20701c;

    public C10397h0(final String serialName, Enum[] values) {
        AbstractC9133u.m16133g(serialName, "serialName");
        AbstractC9133u.m16133g(values, "values");
        this.f20699a = values;
        this.f20701c = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: w8.g0
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return C10397h0.m19415c(this.f20692a, serialName);
            }
        });
    }

    /* renamed from: c */
    public static final InterfaceC10210f m19415c(C10397h0 c10397h0, String str) {
        InterfaceC10210f interfaceC10210f = c10397h0.f20700b;
        return interfaceC10210f == null ? c10397h0.m19416b(str) : interfaceC10210f;
    }

    /* renamed from: b */
    public final InterfaceC10210f m19416b(String str) {
        C10387f0 c10387f0 = new C10387f0(str, this.f20699a.length);
        for (Enum r02 : this.f20699a) {
            C10379d2.m19363n(c10387f0, r02.name(), false, 2, null);
        }
        return c10387f0;
    }

    @Override // p246s8.InterfaceC10051a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Enum deserialize(InterfaceC10256e decoder) {
        AbstractC9133u.m16133g(decoder, "decoder");
        int iDecodeEnum = decoder.decodeEnum(getDescriptor());
        if (iDecodeEnum >= 0) {
            Enum[] enumArr = this.f20699a;
            if (iDecodeEnum < enumArr.length) {
                return enumArr[iDecodeEnum];
            }
        }
        throw new SerializationException(iDecodeEnum + " is not among valid " + getDescriptor().mo19089f() + " enum values, values size is " + this.f20699a.length);
    }

    @Override // p246s8.InterfaceC10059i
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void serialize(InterfaceC10257f encoder, Enum value) {
        AbstractC9133u.m16133g(encoder, "encoder");
        AbstractC9133u.m16133g(value, "value");
        int iM14679H0 = AbstractC8801r.m14679H0(this.f20699a, value);
        if (iM14679H0 != -1) {
            encoder.encodeEnum(getDescriptor(), iM14679H0);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(value);
        sb.append(" is not a valid enum ");
        sb.append(getDescriptor().mo19089f());
        sb.append(", must be one of ");
        String string = Arrays.toString(this.f20699a);
        AbstractC9133u.m16132f(string, "toString(...)");
        sb.append(string);
        throw new SerializationException(sb.toString());
    }

    @Override // p246s8.InterfaceC10052b, p246s8.InterfaceC10059i, p246s8.InterfaceC10051a
    public InterfaceC10210f getDescriptor() {
        return (InterfaceC10210f) this.f20701c.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().mo19089f() + '>';
    }
}
