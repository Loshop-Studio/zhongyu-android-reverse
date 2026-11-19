package p007a6;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import okio.Buffer;
import okio.BufferedSink;
import p058f5.AbstractC6360c0;
import p058f5.C6386y;
import p200z5.InterfaceC7966h;

/* renamed from: a6.b */
/* loaded from: classes4.dex */
public final class C0019b implements InterfaceC7966h {

    /* renamed from: d */
    public static final C6386y f16d = C6386y.m6876e("application/json; charset=UTF-8");

    /* renamed from: a */
    public final Gson f17a;

    /* renamed from: b */
    public final TypeAdapter f18b;

    /* renamed from: c */
    public final boolean f19c;

    public C0019b(Gson gson, TypeAdapter typeAdapter, boolean z6) {
        this.f17a = gson;
        this.f18b = typeAdapter;
        this.f19c = z6;
    }

    /* renamed from: b */
    public static void m30b(BufferedSink bufferedSink, Gson gson, TypeAdapter typeAdapter, Object obj) {
        JsonWriter jsonWriterNewJsonWriter = gson.newJsonWriter(new OutputStreamWriter(bufferedSink.outputStream(), StandardCharsets.UTF_8));
        typeAdapter.write(jsonWriterNewJsonWriter, obj);
        jsonWriterNewJsonWriter.close();
    }

    @Override // p200z5.InterfaceC7966h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC6360c0 convert(Object obj) {
        if (this.f19c) {
            return new C0021d(this.f17a, this.f18b, obj);
        }
        Buffer buffer = new Buffer();
        m30b(buffer, this.f17a, this.f18b, obj);
        return AbstractC6360c0.create(f16d, buffer.readByteString());
    }
}
