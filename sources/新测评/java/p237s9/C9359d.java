package p237s9;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import okio.BufferedSink;
import p011a9.AbstractC0061x;
import p011a9.C0057t;

/* renamed from: s9.d */
/* loaded from: classes5.dex */
public final class C9359d extends AbstractC0061x {

    /* renamed from: a */
    public final Gson f16221a;

    /* renamed from: b */
    public final TypeAdapter f16222b;

    /* renamed from: c */
    public final Object f16223c;

    public C9359d(Gson gson, TypeAdapter typeAdapter, Object obj) {
        this.f16221a = gson;
        this.f16222b = typeAdapter;
        this.f16223c = obj;
    }

    @Override // p011a9.AbstractC0061x
    /* renamed from: contentType */
    public C0057t getContentType() {
        return C9357b.f16215d;
    }

    @Override // p011a9.AbstractC0061x
    public void writeTo(BufferedSink bufferedSink) {
        C9357b.m15608b(bufferedSink, this.f16221a, this.f16222b, this.f16223c);
    }
}
