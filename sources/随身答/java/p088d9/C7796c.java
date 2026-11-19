package p088d9;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import p038c9.InterfaceC5280f;
import p172l8.AbstractC8927z;

/* renamed from: d9.c */
/* loaded from: classes5.dex */
public final class C7796c implements InterfaceC5280f {

    /* renamed from: a */
    public final Gson f13115a;

    /* renamed from: b */
    public final TypeAdapter f13116b;

    public C7796c(Gson gson, TypeAdapter typeAdapter) {
        this.f13115a = gson;
        this.f13116b = typeAdapter;
    }

    @Override // p038c9.InterfaceC5280f
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object convert(AbstractC8927z abstractC8927z) {
        JsonReader jsonReaderNewJsonReader = this.f13115a.newJsonReader(abstractC8927z.charStream());
        try {
            Object obj = this.f13116b.read(jsonReaderNewJsonReader);
            if (jsonReaderNewJsonReader.peek() == JsonToken.END_DOCUMENT) {
                return obj;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            abstractC8927z.close();
        }
    }
}
