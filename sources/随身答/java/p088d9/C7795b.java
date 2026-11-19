package p088d9;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import okio.Buffer;
import p038c9.InterfaceC5280f;
import p172l8.AbstractC8925x;
import p172l8.C8921t;

/* renamed from: d9.b */
/* loaded from: classes5.dex */
public final class C7795b implements InterfaceC5280f {

    /* renamed from: c */
    public static final C8921t f13111c = C8921t.m14029e("application/json; charset=UTF-8");

    /* renamed from: d */
    public static final Charset f13112d = Charset.forName("UTF-8");

    /* renamed from: a */
    public final Gson f13113a;

    /* renamed from: b */
    public final TypeAdapter f13114b;

    public C7795b(Gson gson, TypeAdapter typeAdapter) {
        this.f13113a = gson;
        this.f13114b = typeAdapter;
    }

    @Override // p038c9.InterfaceC5280f
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC8925x convert(Object obj) throws IOException {
        Buffer buffer = new Buffer();
        JsonWriter jsonWriterNewJsonWriter = this.f13113a.newJsonWriter(new OutputStreamWriter(buffer.outputStream(), f13112d));
        this.f13114b.write(jsonWriterNewJsonWriter, obj);
        jsonWriterNewJsonWriter.close();
        return AbstractC8925x.create(f13111c, buffer.readByteString());
    }
}
