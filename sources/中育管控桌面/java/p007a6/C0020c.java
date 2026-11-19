package p007a6;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import p058f5.AbstractC6364e0;
import p200z5.InterfaceC7966h;

/* renamed from: a6.c */
/* loaded from: classes4.dex */
public final class C0020c implements InterfaceC7966h {

    /* renamed from: a */
    public final Gson f20a;

    /* renamed from: b */
    public final TypeAdapter f21b;

    public C0020c(Gson gson, TypeAdapter typeAdapter) {
        this.f20a = gson;
        this.f21b = typeAdapter;
    }

    @Override // p200z5.InterfaceC7966h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object convert(AbstractC6364e0 abstractC6364e0) {
        JsonReader jsonReaderNewJsonReader = this.f20a.newJsonReader(abstractC6364e0.charStream());
        try {
            Object obj = this.f21b.read2(jsonReaderNewJsonReader);
            if (jsonReaderNewJsonReader.peek() == JsonToken.END_DOCUMENT) {
                return obj;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            abstractC6364e0.close();
        }
    }
}
