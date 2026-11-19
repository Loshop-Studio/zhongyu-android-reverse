package p063g1;

import com.google.gson.AbstractC3869p;
import com.google.gson.C3841g;
import com.google.gson.InterfaceC3870q;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.internal.AbstractC3848e;
import com.google.gson.internal.C3845b;
import java.util.concurrent.ConcurrentHashMap;
import p095k1.C5752a;

/* renamed from: g1.l */
/* loaded from: classes2.dex */
public final class C5569l implements InterfaceC3870q {

    /* renamed from: c */
    public static final C5567k f8646c;

    /* renamed from: a */
    public final C3845b f8647a;

    /* renamed from: b */
    public final ConcurrentHashMap f8648b = new ConcurrentHashMap();

    static {
        int i = 0;
        f8646c = new C5567k(i);
        new C5567k(i);
    }

    public C5569l(C3845b c3845b) {
        this.f8647a = c3845b;
    }

    /* renamed from: a */
    public final AbstractC3869p m4904a(C3845b c3845b, C3841g c3841g, C5752a c5752a, JsonAdapter jsonAdapter, boolean z8) {
        AbstractC3869p abstractC3869pMo2798c;
        Object objMo671a = c3845b.m2797c(new C5752a(jsonAdapter.value()), true).mo671a();
        boolean zNullSafe = jsonAdapter.nullSafe();
        if (objMo671a instanceof AbstractC3869p) {
            abstractC3869pMo2798c = (AbstractC3869p) objMo671a;
        } else {
            if (!(objMo671a instanceof InterfaceC3870q)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objMo671a.getClass().getName() + " as a @JsonAdapter for " + AbstractC3848e.m2810k(c5752a.f9104b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            InterfaceC3870q interfaceC3870q = (InterfaceC3870q) objMo671a;
            if (z8) {
                InterfaceC3870q interfaceC3870q2 = (InterfaceC3870q) this.f8648b.putIfAbsent(c5752a.f9103a, interfaceC3870q);
                if (interfaceC3870q2 != null) {
                    interfaceC3870q = interfaceC3870q2;
                }
            }
            abstractC3869pMo2798c = interfaceC3870q.mo2798c(c3841g, c5752a);
        }
        return (abstractC3869pMo2798c == null || !zNullSafe) ? abstractC3869pMo2798c : abstractC3869pMo2798c.m2820a();
    }

    @Override // com.google.gson.InterfaceC3870q
    /* renamed from: c */
    public final AbstractC3869p mo2798c(C3841g c3841g, C5752a c5752a) {
        JsonAdapter jsonAdapter = (JsonAdapter) c5752a.f9103a.getAnnotation(JsonAdapter.class);
        if (jsonAdapter == null) {
            return null;
        }
        return m4904a(this.f8647a, c3841g, c5752a, jsonAdapter, true);
    }
}
