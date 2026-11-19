package p063g1;

import com.google.gson.AbstractC3869p;
import com.google.gson.C3841g;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import p104l1.C6046a;
import p104l1.C6047b;

/* renamed from: g1.b */
/* loaded from: classes2.dex */
public final class C5544b extends AbstractC3869p {

    /* renamed from: c */
    public static final C5541a f8599c = new C5541a();

    /* renamed from: a */
    public final Class f8600a;

    /* renamed from: b */
    public final C5575o f8601b;

    public C5544b(C3841g c3841g, AbstractC3869p abstractC3869p, Class cls) {
        this.f8601b = new C5575o(c3841g, abstractC3869p, cls);
        this.f8600a = cls;
    }

    @Override // com.google.gson.AbstractC3869p
    /* renamed from: b */
    public final Object mo2779b(C6046a c6046a) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        if (c6046a.m5764x() == JsonToken.NULL) {
            c6046a.m5760t();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        c6046a.m5743a();
        while (c6046a.m5751k()) {
            arrayList.add(this.f8601b.f8653c.mo2779b(c6046a));
        }
        c6046a.m5747e();
        int size = arrayList.size();
        Class cls = this.f8600a;
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) cls, size);
        for (int i = 0; i < size; i++) {
            Array.set(objNewInstance, i, arrayList.get(i));
        }
        return objNewInstance;
    }

    @Override // com.google.gson.AbstractC3869p
    /* renamed from: c */
    public final void mo2780c(C6047b c6047b, Object obj) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        if (obj == null) {
            c6047b.m5775k();
            return;
        }
        c6047b.m5768b();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f8601b.mo2780c(c6047b, Array.get(obj, i));
        }
        c6047b.m5771e();
    }
}
