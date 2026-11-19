package p079da;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import okio.BufferedSink;
import p136i9.AbstractC8901c0;
import p136i9.C8927y;

/* renamed from: da.d */
/* loaded from: classes5.dex */
public final class C8329d extends AbstractC8901c0 {

    /* renamed from: a */
    public final Gson f15815a;

    /* renamed from: b */
    public final TypeAdapter f15816b;

    /* renamed from: c */
    public final Object f15817c;

    public C8329d(Gson gson, TypeAdapter typeAdapter, Object obj) {
        this.f15815a = gson;
        this.f15816b = typeAdapter;
        this.f15817c = obj;
    }

    @Override // p136i9.AbstractC8901c0
    public C8927y contentType() {
        return C8327b.f15809d;
    }

    @Override // p136i9.AbstractC8901c0
    public void writeTo(BufferedSink bufferedSink) {
        C8327b.m13538b(bufferedSink, this.f15815a, this.f15816b, this.f15817c);
    }
}
