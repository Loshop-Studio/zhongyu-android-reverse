package p237s9;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import p011a9.AbstractC0063z;
import p226r9.InterfaceC9066h;

/* renamed from: s9.c */
/* loaded from: classes5.dex */
public final class C9358c implements InterfaceC9066h {

    /* renamed from: a */
    public final Gson f16219a;

    /* renamed from: b */
    public final TypeAdapter f16220b;

    public C9358c(Gson gson, TypeAdapter typeAdapter) {
        this.f16219a = gson;
        this.f16220b = typeAdapter;
    }

    @Override // p226r9.InterfaceC9066h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object convert(AbstractC0063z abstractC0063z) {
        JsonReader jsonReaderNewJsonReader = this.f16219a.newJsonReader(abstractC0063z.charStream());
        try {
            Object obj = this.f16220b.read(jsonReaderNewJsonReader);
            if (jsonReaderNewJsonReader.peek() == JsonToken.END_DOCUMENT) {
                return obj;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            abstractC0063z.close();
        }
    }
}
