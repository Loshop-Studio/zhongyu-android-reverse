package kotlinx.serialization.json.internal;

import java.util.List;
import kotlin.collections.AbstractC5785e0;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5830k;
import p101k7.InterfaceC5765g;
import p118m7.C6134f0;
import p125n7.AbstractC6227b;
import p125n7.AbstractC6235j;
import p125n7.AbstractC6236k;
import p125n7.C6241p;
import p125n7.C6246u;

/* renamed from: kotlinx.serialization.json.internal.p */
/* loaded from: classes4.dex */
public final class C6035p extends C6033n {

    /* renamed from: j */
    public final C6246u f9570j;

    /* renamed from: k */
    public final List f9571k;

    /* renamed from: l */
    public final int f9572l;

    /* renamed from: m */
    public int f9573m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6035p(AbstractC6227b json, C6246u value) {
        super(json, value, (String) null, 12);
        AbstractC5830k.m5330g(json, "json");
        AbstractC5830k.m5330g(value, "value");
        this.f9570j = value;
        List listM5217D0 = AbstractC5805t.m5217D0(value.f9993a.keySet());
        this.f9571k = listM5217D0;
        this.f9572l = listM5217D0.size() * 2;
        this.f9573m = -1;
    }

    @Override // kotlinx.serialization.json.internal.C6033n, kotlinx.serialization.json.internal.AbstractC6020a
    /* renamed from: b */
    public final AbstractC6235j mo5659b(String tag) {
        AbstractC5830k.m5330g(tag, "tag");
        if (this.f9573m % 2 != 0) {
            return (AbstractC6235j) AbstractC5785e0.m5148B(this.f9570j, tag);
        }
        C6134f0 c6134f0 = AbstractC6236k.f9982a;
        return new C6241p(tag, true);
    }

    @Override // kotlinx.serialization.json.internal.C6033n, p109l7.InterfaceC6069c
    public final int decodeElementIndex(InterfaceC5765g descriptor) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        int i = this.f9573m;
        if (i >= this.f9572l - 1) {
            return -1;
        }
        int i8 = i + 1;
        this.f9573m = i8;
        return i8;
    }

    @Override // kotlinx.serialization.json.internal.C6033n, kotlinx.serialization.json.internal.AbstractC6020a, p109l7.InterfaceC6069c
    public final void endStructure(InterfaceC5765g descriptor) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
    }

    @Override // kotlinx.serialization.json.internal.C6033n, kotlinx.serialization.json.internal.AbstractC6020a
    /* renamed from: o */
    public final String mo5672o(InterfaceC5765g descriptor, int i) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        return (String) this.f9571k.get(i / 2);
    }

    @Override // kotlinx.serialization.json.internal.C6033n, kotlinx.serialization.json.internal.AbstractC6020a
    /* renamed from: q */
    public final AbstractC6235j mo5674q() {
        return this.f9570j;
    }

    @Override // kotlinx.serialization.json.internal.C6033n
    /* renamed from: v */
    public final C6246u mo5674q() {
        return this.f9570j;
    }
}
