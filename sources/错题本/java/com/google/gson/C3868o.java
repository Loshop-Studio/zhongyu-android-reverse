package com.google.gson;

import com.google.gson.stream.JsonToken;
import java.io.IOException;
import p104l1.C6046a;
import p104l1.C6047b;

/* renamed from: com.google.gson.o */
/* loaded from: classes2.dex */
public final class C3868o extends AbstractC3869p {

    /* renamed from: a */
    public final /* synthetic */ AbstractC3869p f3059a;

    public C3868o(AbstractC3869p abstractC3869p) {
        this.f3059a = abstractC3869p;
    }

    @Override // com.google.gson.AbstractC3869p
    /* renamed from: b */
    public final Object mo2779b(C6046a c6046a) {
        if (c6046a.m5764x() != JsonToken.NULL) {
            return this.f3059a.mo2779b(c6046a);
        }
        c6046a.m5760t();
        return null;
    }

    @Override // com.google.gson.AbstractC3869p
    /* renamed from: c */
    public final void mo2780c(C6047b c6047b, Object obj) throws IOException {
        if (obj == null) {
            c6047b.m5775k();
        } else {
            this.f3059a.mo2780c(c6047b, obj);
        }
    }

    public final String toString() {
        return "NullSafeTypeAdapter[" + this.f3059a + "]";
    }
}
