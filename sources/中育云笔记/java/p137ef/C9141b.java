package p137ef;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import je.AbstractC9744x;
import je.C9740t;
import okio.Buffer;
import okio.BufferedSink;
import p122df.InterfaceC9040h;

/* renamed from: ef.b */
/* loaded from: classes6.dex */
public final class C9141b implements InterfaceC9040h {

    /* renamed from: d */
    public static final C9740t f21340d = C9740t.m19482e("application/json; charset=UTF-8");

    /* renamed from: a */
    public final Gson f21341a;

    /* renamed from: b */
    public final TypeAdapter f21342b;

    /* renamed from: c */
    public final boolean f21343c;

    public C9141b(Gson gson, TypeAdapter typeAdapter, boolean z10) {
        this.f21341a = gson;
        this.f21342b = typeAdapter;
        this.f21343c = z10;
    }

    /* renamed from: b */
    public static void m17986b(BufferedSink bufferedSink, Gson gson, TypeAdapter typeAdapter, Object obj) {
        JsonWriter jsonWriterNewJsonWriter = gson.newJsonWriter(new OutputStreamWriter(bufferedSink.outputStream(), StandardCharsets.UTF_8));
        typeAdapter.write(jsonWriterNewJsonWriter, obj);
        jsonWriterNewJsonWriter.close();
    }

    @Override // p122df.InterfaceC9040h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC9744x convert(Object obj) {
        if (this.f21343c) {
            return new C9143d(this.f21341a, this.f21342b, obj);
        }
        Buffer buffer = new Buffer();
        m17986b(buffer, this.f21341a, this.f21342b, obj);
        return AbstractC9744x.create(f21340d, buffer.readByteString());
    }
}
