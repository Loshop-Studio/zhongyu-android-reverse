package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.AbstractC5830k;
import p016b0.C3080k0;
import p041d2.C5413c;
import p084i7.InterfaceC5689e;
import p101k7.InterfaceC5765g;
import p109l7.AbstractC6068b;
import p109l7.InterfaceC6070d;
import p109l7.InterfaceC6072f;
import p125n7.AbstractC6227b;
import p125n7.AbstractC6236k;
import p125n7.C6232g;
import p133o7.AbstractC6281e;

/* renamed from: kotlinx.serialization.json.internal.v */
/* loaded from: classes4.dex */
public final class C6041v extends AbstractC6068b {

    /* renamed from: a */
    public final C3080k0 f9586a;

    /* renamed from: b */
    public final AbstractC6227b f9587b;

    /* renamed from: c */
    public final WriteMode f9588c;

    /* renamed from: d */
    public final C6041v[] f9589d;

    /* renamed from: e */
    public final AbstractC6281e f9590e;

    /* renamed from: f */
    public final C6232g f9591f;

    /* renamed from: g */
    public boolean f9592g;

    /* renamed from: h */
    public String f9593h;

    /* renamed from: i */
    public String f9594i;

    public C6041v(C3080k0 composer, AbstractC6227b json, WriteMode writeMode, C6041v[] c6041vArr) {
        AbstractC5830k.m5330g(composer, "composer");
        AbstractC5830k.m5330g(json, "json");
        this.f9586a = composer;
        this.f9587b = json;
        this.f9588c = writeMode;
        this.f9589d = c6041vArr;
        this.f9590e = json.f9967b;
        this.f9591f = json.f9966a;
        int iOrdinal = writeMode.ordinal();
        if (c6041vArr != null) {
            C6041v c6041v = c6041vArr[iOrdinal];
            if (c6041v == null && c6041v == this) {
                return;
            }
            c6041vArr[iOrdinal] = this;
        }
    }

    @Override // p109l7.AbstractC6068b, p109l7.InterfaceC6072f
    public final InterfaceC6070d beginStructure(InterfaceC5765g descriptor) {
        C6041v c6041v;
        AbstractC5830k.m5330g(descriptor, "descriptor");
        AbstractC6227b abstractC6227b = this.f9587b;
        WriteMode writeModeM5696q = AbstractC6029j.m5696q(descriptor, abstractC6227b);
        char c = writeModeM5696q.begin;
        C3080k0 c3080k0 = this.f9586a;
        if (c != 0) {
            c3080k0.m2033c(c);
            c3080k0.f1464a = true;
        }
        String str = this.f9593h;
        if (str != null) {
            String strMo5105h = this.f9594i;
            if (strMo5105h == null) {
                strMo5105h = descriptor.mo5105h();
            }
            c3080k0.m2031a();
            encodeString(str);
            c3080k0.m2033c(':');
            c3080k0.getClass();
            encodeString(strMo5105h);
            this.f9593h = null;
            this.f9594i = null;
        }
        if (this.f9588c == writeModeM5696q) {
            return this;
        }
        C6041v[] c6041vArr = this.f9589d;
        return (c6041vArr == null || (c6041v = c6041vArr[writeModeM5696q.ordinal()]) == null) ? new C6041v(c3080k0, abstractC6227b, writeModeM5696q, c6041vArr) : c6041v;
    }

    @Override // p109l7.AbstractC6068b, p109l7.InterfaceC6072f
    public final void encodeBoolean(boolean z8) {
        if (this.f9592g) {
            encodeString(String.valueOf(z8));
        } else {
            ((C5413c) this.f9586a.f1465b).m4807h(String.valueOf(z8));
        }
    }

    @Override // p109l7.AbstractC6068b, p109l7.InterfaceC6072f
    public final void encodeByte(byte b6) {
        if (this.f9592g) {
            encodeString(String.valueOf((int) b6));
        } else {
            this.f9586a.mo2032b(b6);
        }
    }

    @Override // p109l7.AbstractC6068b, p109l7.InterfaceC6072f
    public final void encodeChar(char c) {
        encodeString(String.valueOf(c));
    }

    @Override // p109l7.AbstractC6068b, p109l7.InterfaceC6072f
    public final void encodeDouble(double d9) {
        boolean z8 = this.f9592g;
        C3080k0 c3080k0 = this.f9586a;
        if (z8) {
            encodeString(String.valueOf(d9));
        } else {
            ((C5413c) c3080k0.f1465b).m4807h(String.valueOf(d9));
        }
        if (Math.abs(d9) > Double.MAX_VALUE) {
            throw AbstractC6029j.m5681b(Double.valueOf(d9), ((C5413c) c3080k0.f1465b).toString());
        }
    }

    @Override // p109l7.AbstractC6068b
    public final boolean encodeElement(InterfaceC5765g descriptor, int i) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        int i8 = AbstractC6040u.f9585a[this.f9588c.ordinal()];
        C3080k0 c3080k0 = this.f9586a;
        if (i8 == 1) {
            if (!c3080k0.f1464a) {
                c3080k0.m2033c(',');
            }
            c3080k0.m2031a();
            return true;
        }
        boolean z8 = false;
        if (i8 == 2) {
            if (c3080k0.f1464a) {
                this.f9592g = true;
                c3080k0.m2031a();
                return true;
            }
            if (i % 2 == 0) {
                c3080k0.m2033c(',');
                c3080k0.m2031a();
                z8 = true;
            } else {
                c3080k0.m2033c(':');
                c3080k0.m2040j();
            }
            this.f9592g = z8;
            return true;
        }
        if (i8 == 3) {
            if (i == 0) {
                this.f9592g = true;
            }
            if (i == 1) {
                c3080k0.m2033c(',');
                c3080k0.m2040j();
                this.f9592g = false;
            }
            return true;
        }
        if (!c3080k0.f1464a) {
            c3080k0.m2033c(',');
        }
        c3080k0.m2031a();
        AbstractC6227b json = this.f9587b;
        AbstractC5830k.m5330g(json, "json");
        AbstractC6029j.m5694o(descriptor, json);
        encodeString(descriptor.mo5102e(i));
        c3080k0.m2033c(':');
        c3080k0.m2040j();
        return true;
    }

    @Override // p109l7.AbstractC6068b, p109l7.InterfaceC6072f
    public final void encodeEnum(InterfaceC5765g enumDescriptor, int i) {
        AbstractC5830k.m5330g(enumDescriptor, "enumDescriptor");
        encodeString(enumDescriptor.mo5102e(i));
    }

    @Override // p109l7.AbstractC6068b, p109l7.InterfaceC6072f
    public final void encodeFloat(float f) {
        boolean z8 = this.f9592g;
        C3080k0 c3080k0 = this.f9586a;
        if (z8) {
            encodeString(String.valueOf(f));
        } else {
            ((C5413c) c3080k0.f1465b).m4807h(String.valueOf(f));
        }
        if (Math.abs(f) > Float.MAX_VALUE) {
            throw AbstractC6029j.m5681b(Float.valueOf(f), ((C5413c) c3080k0.f1465b).toString());
        }
    }

    @Override // p109l7.AbstractC6068b, p109l7.InterfaceC6072f
    public final InterfaceC6072f encodeInline(InterfaceC5765g descriptor) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        boolean zM5705a = AbstractC6042w.m5705a(descriptor);
        WriteMode writeMode = this.f9588c;
        AbstractC6227b abstractC6227b = this.f9587b;
        C3080k0 c6025f = this.f9586a;
        if (zM5705a) {
            if (!(c6025f instanceof C6026g)) {
                c6025f = new C6026g((C5413c) c6025f.f1465b, this.f9592g);
            }
            return new C6041v(c6025f, abstractC6227b, writeMode, null);
        }
        if (descriptor.isInline() && descriptor.equals(AbstractC6236k.f9982a)) {
            if (!(c6025f instanceof C6025f)) {
                c6025f = new C6025f((C5413c) c6025f.f1465b, this.f9592g);
            }
            return new C6041v(c6025f, abstractC6227b, writeMode, null);
        }
        if (this.f9593h == null) {
            return super.encodeInline(descriptor);
        }
        this.f9594i = descriptor.mo5105h();
        return this;
    }

    @Override // p109l7.AbstractC6068b, p109l7.InterfaceC6072f
    public final void encodeInt(int i) {
        if (this.f9592g) {
            encodeString(String.valueOf(i));
        } else {
            this.f9586a.mo2034d(i);
        }
    }

    @Override // p109l7.AbstractC6068b, p109l7.InterfaceC6072f
    public final void encodeLong(long j7) {
        if (this.f9592g) {
            encodeString(String.valueOf(j7));
        } else {
            this.f9586a.mo2035e(j7);
        }
    }

    @Override // p109l7.InterfaceC6072f
    public final void encodeNull() {
        this.f9586a.m2036f("null");
    }

    @Override // p109l7.AbstractC6068b, p109l7.InterfaceC6070d
    public final void encodeNullableSerializableElement(InterfaceC5765g descriptor, int i, InterfaceC5689e serializer, Object obj) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        AbstractC5830k.m5330g(serializer, "serializer");
        if (obj != null || this.f9591f.f9977c) {
            super.encodeNullableSerializableElement(descriptor, i, serializer, obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    @Override // p109l7.InterfaceC6072f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void encodeSerializableValue(p084i7.InterfaceC5689e r5, java.lang.Object r6) {
        /*
            r4 = this;
            java.lang.String r0 = "serializer"
            kotlin.jvm.internal.AbstractC5830k.m5330g(r5, r0)
            n7.b r0 = r4.f9587b
            n7.g r1 = r0.f9966a
            boolean r2 = r5 instanceof p118m7.AbstractC6120b
            if (r2 == 0) goto L14
            kotlinx.serialization.json.ClassDiscriminatorMode r1 = r1.f9981g
            kotlinx.serialization.json.ClassDiscriminatorMode r3 = kotlinx.serialization.json.ClassDiscriminatorMode.NONE
            if (r1 == r3) goto L4e
            goto L3f
        L14:
            kotlinx.serialization.json.ClassDiscriminatorMode r1 = r1.f9981g
            int[] r3 = kotlinx.serialization.json.internal.AbstractC6037r.f9576a
            int r1 = r1.ordinal()
            r1 = r3[r1]
            r3 = 1
            if (r1 == r3) goto L4e
            r3 = 2
            if (r1 == r3) goto L4e
            r3 = 3
            if (r1 != r3) goto L48
            k7.g r1 = r5.getDescriptor()
            coil3.network.g r1 = r1.getKind()
            k7.l r3 = p101k7.C5770l.f9146b
            boolean r3 = kotlin.jvm.internal.AbstractC5830k.m5325b(r1, r3)
            if (r3 != 0) goto L3f
            k7.l r3 = p101k7.C5770l.f9149e
            boolean r1 = kotlin.jvm.internal.AbstractC5830k.m5325b(r1, r3)
            if (r1 == 0) goto L4e
        L3f:
            k7.g r1 = r5.getDescriptor()
            java.lang.String r0 = kotlinx.serialization.json.internal.AbstractC6029j.m5687h(r1, r0)
            goto L4f
        L48:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L4e:
            r0 = 0
        L4f:
            if (r2 == 0) goto Ld1
            r1 = r5
            m7.b r1 = (p118m7.AbstractC6120b) r1
            if (r6 == 0) goto Lae
            i7.e r1 = p185v7.AbstractC6683l.m6370j(r1, r4, r6)
            if (r0 == 0) goto Lac
            boolean r5 = r5 instanceof p084i7.AbstractC5688d
            if (r5 != 0) goto L61
            goto L74
        L61:
            k7.g r5 = r1.getDescriptor()
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.AbstractC5830k.m5330g(r5, r2)
            java.util.Set r5 = p118m7.AbstractC6191y0.m5832b(r5)
            boolean r5 = r5.contains(r0)
            if (r5 != 0) goto La6
        L74:
            k7.g r5 = r1.getDescriptor()
            coil3.network.g r5 = r5.getKind()
            java.lang.String r2 = "kind"
            kotlin.jvm.internal.AbstractC5830k.m5330g(r5, r2)
            boolean r2 = r5 instanceof p101k7.C5769k
            if (r2 != 0) goto L9e
            boolean r2 = r5 instanceof p101k7.AbstractC5764f
            if (r2 != 0) goto L96
            boolean r5 = r5 instanceof p101k7.AbstractC5762d
            if (r5 != 0) goto L8e
            goto Lac
        L8e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Actual serializer for polymorphic cannot be polymorphic itself"
            r5.<init>(r6)
            throw r5
        L96:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead"
            r5.<init>(r6)
            throw r5
        L9e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead"
            r5.<init>(r6)
            throw r5
        La6:
            java.lang.ClassCastException r5 = new java.lang.ClassCastException
            r5.<init>()
            throw r5
        Lac:
            r5 = r1
            goto Ld1
        Lae:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Value for serializer "
            r5.<init>(r6)
            i7.c r1 = (p084i7.C5687c) r1
            k7.g r6 = r1.getDescriptor()
            r5.append(r6)
            java.lang.String r6 = " should always be non-null. Please report issue to the kotlinx.serialization tracker."
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        Ld1:
            if (r0 == 0) goto Ldf
            k7.g r1 = r5.getDescriptor()
            java.lang.String r1 = r1.mo5105h()
            r4.f9593h = r0
            r4.f9594i = r1
        Ldf:
            r5.serialize(r4, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.C6041v.encodeSerializableValue(i7.e, java.lang.Object):void");
    }

    @Override // p109l7.AbstractC6068b, p109l7.InterfaceC6072f
    public final void encodeShort(short s8) {
        if (this.f9592g) {
            encodeString(String.valueOf((int) s8));
        } else {
            this.f9586a.mo2037g(s8);
        }
    }

    @Override // p109l7.AbstractC6068b, p109l7.InterfaceC6072f
    public final void encodeString(String value) {
        AbstractC5830k.m5330g(value, "value");
        this.f9586a.mo2038h(value);
    }

    @Override // p109l7.AbstractC6068b, p109l7.InterfaceC6070d
    public final void endStructure(InterfaceC5765g descriptor) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        WriteMode writeMode = this.f9588c;
        if (writeMode.end != 0) {
            C3080k0 c3080k0 = this.f9586a;
            c3080k0.getClass();
            c3080k0.f1464a = false;
            c3080k0.m2033c(writeMode.end);
        }
    }

    @Override // p109l7.InterfaceC6072f
    public final AbstractC6281e getSerializersModule() {
        return this.f9590e;
    }

    @Override // p109l7.InterfaceC6070d
    public final boolean shouldEncodeElementDefault(InterfaceC5765g descriptor, int i) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        return this.f9591f.f9975a;
    }
}
