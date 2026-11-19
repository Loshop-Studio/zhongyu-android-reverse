package p085k3;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import okio.Buffer;
import p080j3.InterfaceC3821i;
import p117r2.AbstractC4523z;
import p117r2.C4519v;

/* renamed from: k3.b */
/* loaded from: classes2.dex */
public final class C3862b implements InterfaceC3821i {

    /* renamed from: c */
    public static final C4519v f4785c = C4519v.m6050e("application/json; charset=UTF-8");

    /* renamed from: d */
    public static final Charset f4786d = Charset.forName("UTF-8");

    /* renamed from: a */
    public final Gson f4787a;

    /* renamed from: b */
    public final TypeAdapter f4788b;

    public C3862b(Gson gson, TypeAdapter typeAdapter) {
        this.f4787a = gson;
        this.f4788b = typeAdapter;
    }

    @Override // p080j3.InterfaceC3821i
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC4523z mo4967a(Object obj) throws IOException {
        Buffer buffer = new Buffer();
        JsonWriter jsonWriterNewJsonWriter = this.f4787a.newJsonWriter(new OutputStreamWriter(buffer.outputStream(), f4786d));
        this.f4788b.write(jsonWriterNewJsonWriter, obj);
        jsonWriterNewJsonWriter.close();
        return AbstractC4523z.create(f4785c, buffer.readByteString());
    }
}
