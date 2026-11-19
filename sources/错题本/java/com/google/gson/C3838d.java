package com.google.gson;

import com.google.gson.stream.JsonToken;
import java.io.IOException;
import p104l1.C6046a;
import p104l1.C6047b;

/* renamed from: com.google.gson.d */
/* loaded from: classes2.dex */
public class C3838d extends AbstractC3869p {
    @Override // com.google.gson.AbstractC3869p
    /* renamed from: b */
    public final Object mo2779b(C6046a c6046a) {
        if (c6046a.m5764x() != JsonToken.NULL) {
            return Long.valueOf(c6046a.m5757q());
        }
        c6046a.m5760t();
        return null;
    }

    @Override // com.google.gson.AbstractC3869p
    /* renamed from: c */
    public final void mo2780c(C6047b c6047b, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            c6047b.m5775k();
        } else {
            c6047b.m5783s(number.toString());
        }
    }
}
