package p007a6;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import okio.BufferedSink;
import p058f5.AbstractC6360c0;
import p058f5.C6386y;

/* renamed from: a6.d */
/* loaded from: classes4.dex */
public final class C0021d extends AbstractC6360c0 {

    /* renamed from: a */
    public final Gson f22a;

    /* renamed from: b */
    public final TypeAdapter f23b;

    /* renamed from: c */
    public final Object f24c;

    public C0021d(Gson gson, TypeAdapter typeAdapter, Object obj) {
        this.f22a = gson;
        this.f23b = typeAdapter;
        this.f24c = obj;
    }

    @Override // p058f5.AbstractC6360c0
    /* renamed from: contentType */
    public C6386y getContentType() {
        return C0019b.f16d;
    }

    @Override // p058f5.AbstractC6360c0
    public void writeTo(BufferedSink bufferedSink) {
        C0019b.m30b(bufferedSink, this.f22a, this.f23b, this.f24c);
    }
}
