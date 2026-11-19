package p137ef;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import je.AbstractC9746z;
import p122df.InterfaceC9040h;

/* renamed from: ef.c */
/* loaded from: classes6.dex */
public final class C9142c implements InterfaceC9040h {

    /* renamed from: a */
    public final Gson f21344a;

    /* renamed from: b */
    public final TypeAdapter f21345b;

    public C9142c(Gson gson, TypeAdapter typeAdapter) {
        this.f21344a = gson;
        this.f21345b = typeAdapter;
    }

    @Override // p122df.InterfaceC9040h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object convert(AbstractC9746z abstractC9746z) {
        JsonReader jsonReaderNewJsonReader = this.f21344a.newJsonReader(abstractC9746z.charStream());
        try {
            Object obj = this.f21345b.read2(jsonReaderNewJsonReader);
            if (jsonReaderNewJsonReader.peek() == JsonToken.END_DOCUMENT) {
                return obj;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            abstractC9746z.close();
        }
    }
}
