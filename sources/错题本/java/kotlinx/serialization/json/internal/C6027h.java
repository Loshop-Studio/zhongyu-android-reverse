package kotlinx.serialization.json.internal;

import androidx.compose.material3.AbstractC1923c;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5862w;
import p045d6.C5433i;
import p045d6.C5436l;
import p045d6.C5438n;
import p045d6.C5441q;
import p073h4.AbstractC5625a;
import p101k7.InterfaceC5765g;
import p109l7.AbstractC6067a;
import p125n7.AbstractC6227b;
import p133o7.AbstractC6281e;

/* renamed from: kotlinx.serialization.json.internal.h */
/* loaded from: classes4.dex */
public final class C6027h extends AbstractC6067a {

    /* renamed from: a */
    public final C6043x f9552a;

    /* renamed from: b */
    public final AbstractC6281e f9553b;

    public C6027h(C6043x c6043x, AbstractC6227b json) {
        AbstractC5830k.m5330g(json, "json");
        this.f9552a = c6043x;
        this.f9553b = json.f9967b;
    }

    @Override // p109l7.AbstractC6067a, p109l7.InterfaceC6071e
    public final byte decodeByte() {
        C5433i c5433i;
        C6043x c6043x = this.f9552a;
        String strM5716j = c6043x.m5716j();
        try {
            AbstractC5830k.m5330g(strM5716j, "<this>");
            C5436l c5436lM4958r = AbstractC5625a.m4958r(strM5716j);
            if (c5436lM4958r != null) {
                int i = c5436lM4958r.f8398a;
                c5433i = Integer.compare(Integer.MIN_VALUE ^ i, -2147483393) > 0 ? null : new C5433i((byte) i);
            }
            if (c5433i != null) {
                return c5433i.f8393a;
            }
            AbstractC5862w.m5416w(strM5716j);
            throw null;
        } catch (IllegalArgumentException unused) {
            C6043x.m5706m(c6043x, AbstractC1923c.m1047k('\'', "Failed to parse type 'UByte' for input '", strM5716j), 0, null, 6);
            throw null;
        }
    }

    @Override // p109l7.InterfaceC6069c
    public final int decodeElementIndex(InterfaceC5765g descriptor) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    @Override // p109l7.AbstractC6067a, p109l7.InterfaceC6071e
    public final int decodeInt() {
        C6043x c6043x = this.f9552a;
        String strM5716j = c6043x.m5716j();
        try {
            AbstractC5830k.m5330g(strM5716j, "<this>");
            C5436l c5436lM4958r = AbstractC5625a.m4958r(strM5716j);
            if (c5436lM4958r != null) {
                return c5436lM4958r.f8398a;
            }
            AbstractC5862w.m5416w(strM5716j);
            throw null;
        } catch (IllegalArgumentException unused) {
            C6043x.m5706m(c6043x, AbstractC1923c.m1047k('\'', "Failed to parse type 'UInt' for input '", strM5716j), 0, null, 6);
            throw null;
        }
    }

    @Override // p109l7.AbstractC6067a, p109l7.InterfaceC6071e
    public final long decodeLong() {
        C6043x c6043x = this.f9552a;
        String strM5716j = c6043x.m5716j();
        try {
            AbstractC5830k.m5330g(strM5716j, "<this>");
            C5438n c5438nM4959s = AbstractC5625a.m4959s(strM5716j);
            if (c5438nM4959s != null) {
                return c5438nM4959s.f8400a;
            }
            AbstractC5862w.m5416w(strM5716j);
            throw null;
        } catch (IllegalArgumentException unused) {
            C6043x.m5706m(c6043x, AbstractC1923c.m1047k('\'', "Failed to parse type 'ULong' for input '", strM5716j), 0, null, 6);
            throw null;
        }
    }

    @Override // p109l7.AbstractC6067a, p109l7.InterfaceC6071e
    public final short decodeShort() {
        C5441q c5441q;
        C6043x c6043x = this.f9552a;
        String strM5716j = c6043x.m5716j();
        try {
            AbstractC5830k.m5330g(strM5716j, "<this>");
            C5436l c5436lM4958r = AbstractC5625a.m4958r(strM5716j);
            if (c5436lM4958r != null) {
                int i = c5436lM4958r.f8398a;
                c5441q = Integer.compare(Integer.MIN_VALUE ^ i, -2147418113) > 0 ? null : new C5441q((short) i);
            }
            if (c5441q != null) {
                return c5441q.f8403a;
            }
            AbstractC5862w.m5416w(strM5716j);
            throw null;
        } catch (IllegalArgumentException unused) {
            C6043x.m5706m(c6043x, AbstractC1923c.m1047k('\'', "Failed to parse type 'UShort' for input '", strM5716j), 0, null, 6);
            throw null;
        }
    }

    @Override // p109l7.InterfaceC6069c
    public final AbstractC6281e getSerializersModule() {
        return this.f9553b;
    }
}
