package p085k3;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import p080j3.InterfaceC3821i;
import p117r2.AbstractC4498b0;

/* renamed from: k3.c */
/* loaded from: classes2.dex */
public final class C3863c implements InterfaceC3821i {

    /* renamed from: a */
    public final Gson f4789a;

    /* renamed from: b */
    public final TypeAdapter f4790b;

    public C3863c(Gson gson, TypeAdapter typeAdapter) {
        this.f4789a = gson;
        this.f4790b = typeAdapter;
    }

    @Override // p080j3.InterfaceC3821i
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Object mo4967a(AbstractC4498b0 abstractC4498b0) {
        JsonReader jsonReaderNewJsonReader = this.f4789a.newJsonReader(abstractC4498b0.m5839a());
        try {
            Object obj = this.f4790b.read(jsonReaderNewJsonReader);
            if (jsonReaderNewJsonReader.peek() == JsonToken.END_DOCUMENT) {
                return obj;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            abstractC4498b0.close();
        }
    }
}
