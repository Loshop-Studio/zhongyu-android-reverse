package p137ef;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import je.AbstractC9744x;
import je.C9740t;
import okio.BufferedSink;

/* renamed from: ef.d */
/* loaded from: classes6.dex */
public final class C9143d extends AbstractC9744x {

    /* renamed from: a */
    public final Gson f21346a;

    /* renamed from: b */
    public final TypeAdapter f21347b;

    /* renamed from: c */
    public final Object f21348c;

    public C9143d(Gson gson, TypeAdapter typeAdapter, Object obj) {
        this.f21346a = gson;
        this.f21347b = typeAdapter;
        this.f21348c = obj;
    }

    @Override // je.AbstractC9744x
    public C9740t contentType() {
        return C9141b.f21340d;
    }

    @Override // je.AbstractC9744x
    public void writeTo(BufferedSink bufferedSink) {
        C9141b.m17986b(bufferedSink, this.f21346a, this.f21347b, this.f21348c);
    }
}
