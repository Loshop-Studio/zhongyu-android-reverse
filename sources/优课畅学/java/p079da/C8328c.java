package p079da;

import ca.InterfaceC5290h;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import p136i9.AbstractC8905e0;

/* renamed from: da.c */
/* loaded from: classes5.dex */
public final class C8328c implements InterfaceC5290h {

    /* renamed from: a */
    public final Gson f15813a;

    /* renamed from: b */
    public final TypeAdapter f15814b;

    public C8328c(Gson gson, TypeAdapter typeAdapter) {
        this.f15813a = gson;
        this.f15814b = typeAdapter;
    }

    @Override // ca.InterfaceC5290h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object convert(AbstractC8905e0 abstractC8905e0) {
        JsonReader jsonReaderNewJsonReader = this.f15813a.newJsonReader(abstractC8905e0.charStream());
        try {
            Object obj = this.f15814b.read2(jsonReaderNewJsonReader);
            if (jsonReaderNewJsonReader.peek() == JsonToken.END_DOCUMENT) {
                return obj;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            abstractC8905e0.close();
        }
    }
}
