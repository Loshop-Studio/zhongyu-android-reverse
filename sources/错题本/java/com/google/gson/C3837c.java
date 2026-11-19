package com.google.gson;

import com.google.gson.stream.JsonToken;
import java.io.IOException;
import p104l1.C6046a;
import p104l1.C6047b;

/* renamed from: com.google.gson.c */
/* loaded from: classes2.dex */
public final class C3837c extends AbstractC3869p {

    /* renamed from: a */
    public final /* synthetic */ int f2977a;

    @Override // com.google.gson.AbstractC3869p
    /* renamed from: b */
    public final Object mo2779b(C6046a c6046a) throws IOException {
        switch (this.f2977a) {
            case 0:
                if (c6046a.m5764x() != JsonToken.NULL) {
                    return Double.valueOf(c6046a.m5755o());
                }
                c6046a.m5760t();
                return null;
            case 1:
                if (c6046a.m5764x() != JsonToken.NULL) {
                    return Float.valueOf((float) c6046a.m5755o());
                }
                c6046a.m5760t();
                return null;
            default:
                c6046a.m5740E();
                return null;
        }
    }

    @Override // com.google.gson.AbstractC3869p
    /* renamed from: c */
    public final void mo2780c(C6047b c6047b, Object obj) throws IOException {
        switch (this.f2977a) {
            case 0:
                Number number = (Number) obj;
                if (number != null) {
                    double dDoubleValue = number.doubleValue();
                    C3841g.m2782a(dDoubleValue);
                    c6047b.m5780p(dDoubleValue);
                    break;
                } else {
                    c6047b.m5775k();
                    break;
                }
            case 1:
                Number numberValueOf = (Number) obj;
                if (numberValueOf != null) {
                    float fFloatValue = numberValueOf.floatValue();
                    C3841g.m2782a(fFloatValue);
                    if (!(numberValueOf instanceof Float)) {
                        numberValueOf = Float.valueOf(fFloatValue);
                    }
                    c6047b.m5782r(numberValueOf);
                    break;
                } else {
                    c6047b.m5775k();
                    break;
                }
            default:
                c6047b.m5775k();
                break;
        }
    }

    public String toString() {
        switch (this.f2977a) {
            case 2:
                return "AnonymousOrNonStaticLocalClassAdapter";
            default:
                return super.toString();
        }
    }
}
