package p079da;

import ca.InterfaceC5290h;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import okio.Buffer;
import okio.BufferedSink;
import p136i9.AbstractC8901c0;
import p136i9.C8927y;

/* renamed from: da.b */
/* loaded from: classes5.dex */
public final class C8327b implements InterfaceC5290h {

    /* renamed from: d */
    public static final C8927y f15809d = C8927y.m15337e("application/json; charset=UTF-8");

    /* renamed from: a */
    public final Gson f15810a;

    /* renamed from: b */
    public final TypeAdapter f15811b;

    /* renamed from: c */
    public final boolean f15812c;

    public C8327b(Gson gson, TypeAdapter typeAdapter, boolean z10) {
        this.f15810a = gson;
        this.f15811b = typeAdapter;
        this.f15812c = z10;
    }

    /* renamed from: b */
    public static void m13538b(BufferedSink bufferedSink, Gson gson, TypeAdapter typeAdapter, Object obj) {
        JsonWriter jsonWriterNewJsonWriter = gson.newJsonWriter(new OutputStreamWriter(bufferedSink.outputStream(), StandardCharsets.UTF_8));
        typeAdapter.write(jsonWriterNewJsonWriter, obj);
        jsonWriterNewJsonWriter.close();
    }

    @Override // ca.InterfaceC5290h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC8901c0 convert(Object obj) {
        if (this.f15812c) {
            return new C8329d(this.f15810a, this.f15811b, obj);
        }
        Buffer buffer = new Buffer();
        m13538b(buffer, this.f15810a, this.f15811b, obj);
        return AbstractC8901c0.create(f15809d, buffer.readByteString());
    }
}
