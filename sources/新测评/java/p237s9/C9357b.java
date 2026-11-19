package p237s9;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import okio.Buffer;
import okio.BufferedSink;
import p011a9.AbstractC0061x;
import p011a9.C0057t;
import p226r9.InterfaceC9066h;

/* renamed from: s9.b */
/* loaded from: classes5.dex */
public final class C9357b implements InterfaceC9066h {

    /* renamed from: d */
    public static final C0057t f16215d = C0057t.m273e("application/json; charset=UTF-8");

    /* renamed from: a */
    public final Gson f16216a;

    /* renamed from: b */
    public final TypeAdapter f16217b;

    /* renamed from: c */
    public final boolean f16218c;

    public C9357b(Gson gson, TypeAdapter typeAdapter, boolean z9) {
        this.f16216a = gson;
        this.f16217b = typeAdapter;
        this.f16218c = z9;
    }

    /* renamed from: b */
    public static void m15608b(BufferedSink bufferedSink, Gson gson, TypeAdapter typeAdapter, Object obj) {
        JsonWriter jsonWriterNewJsonWriter = gson.newJsonWriter(new OutputStreamWriter(bufferedSink.outputStream(), StandardCharsets.UTF_8));
        typeAdapter.write(jsonWriterNewJsonWriter, obj);
        jsonWriterNewJsonWriter.close();
    }

    @Override // p226r9.InterfaceC9066h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC0061x convert(Object obj) {
        if (this.f16218c) {
            return new C9359d(this.f16216a, this.f16217b, obj);
        }
        Buffer buffer = new Buffer();
        m15608b(buffer, this.f16216a, this.f16217b, obj);
        return AbstractC0061x.create(f16215d, buffer.readByteString());
    }
}
