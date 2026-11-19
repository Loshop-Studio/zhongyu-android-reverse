package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.AbstractC5830k;
import p101k7.InterfaceC5765g;
import p125n7.AbstractC6227b;
import p125n7.AbstractC6235j;
import p125n7.C6229d;

/* renamed from: kotlinx.serialization.json.internal.o */
/* loaded from: classes4.dex */
public final class C6034o extends AbstractC6020a {

    /* renamed from: f */
    public final C6229d f9567f;

    /* renamed from: g */
    public final int f9568g;

    /* renamed from: h */
    public int f9569h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6034o(AbstractC6227b json, C6229d value) {
        super(json, null);
        AbstractC5830k.m5330g(json, "json");
        AbstractC5830k.m5330g(value, "value");
        this.f9567f = value;
        this.f9568g = value.f9969a.size();
        this.f9569h = -1;
    }

    @Override // kotlinx.serialization.json.internal.AbstractC6020a
    /* renamed from: b */
    public final AbstractC6235j mo5659b(String tag) throws NumberFormatException {
        AbstractC5830k.m5330g(tag, "tag");
        return (AbstractC6235j) this.f9567f.f9969a.get(Integer.parseInt(tag));
    }

    @Override // p109l7.InterfaceC6069c
    public final int decodeElementIndex(InterfaceC5765g descriptor) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        int i = this.f9569h;
        if (i >= this.f9568g - 1) {
            return -1;
        }
        int i8 = i + 1;
        this.f9569h = i8;
        return i8;
    }

    @Override // kotlinx.serialization.json.internal.AbstractC6020a
    /* renamed from: o */
    public final String mo5672o(InterfaceC5765g descriptor, int i) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        return String.valueOf(i);
    }

    @Override // kotlinx.serialization.json.internal.AbstractC6020a
    /* renamed from: q */
    public final AbstractC6235j mo5674q() {
        return this.f9567f;
    }
}
