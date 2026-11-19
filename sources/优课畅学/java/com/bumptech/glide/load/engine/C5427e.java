package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.core.util.Pools;
import com.bumptech.glide.load.data.InterfaceC5406e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p116h0.AbstractC8706j;
import p160l.C9230d;
import p160l.InterfaceC9231e;
import p182n.InterfaceC9357j;
import p314z.InterfaceC10688e;

/* renamed from: com.bumptech.glide.load.engine.e */
/* loaded from: classes3.dex */
public class C5427e {

    /* renamed from: a */
    public final Class f3058a;

    /* renamed from: b */
    public final List f3059b;

    /* renamed from: c */
    public final InterfaceC10688e f3060c;

    /* renamed from: d */
    public final Pools.Pool f3061d;

    /* renamed from: e */
    public final String f3062e;

    /* renamed from: com.bumptech.glide.load.engine.e$a */
    public interface a {
        /* renamed from: a */
        InterfaceC9357j mo2917a(InterfaceC9357j interfaceC9357j);
    }

    public C5427e(Class cls, Class cls2, Class cls3, List list, InterfaceC10688e interfaceC10688e, Pools.Pool pool) {
        this.f3058a = cls;
        this.f3059b = list;
        this.f3060c = interfaceC10688e;
        this.f3061d = pool;
        this.f3062e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: a */
    public InterfaceC9357j m2974a(InterfaceC5406e interfaceC5406e, int i10, int i11, C9230d c9230d, a aVar) {
        return this.f3060c.mo19979a(aVar.mo2917a(m2975b(interfaceC5406e, i10, i11, c9230d)), c9230d);
    }

    /* renamed from: b */
    public final InterfaceC9357j m2975b(InterfaceC5406e interfaceC5406e, int i10, int i11, C9230d c9230d) {
        List list = (List) AbstractC8706j.m14181d(this.f3061d.acquire());
        try {
            return m2976c(interfaceC5406e, i10, i11, c9230d, list);
        } finally {
            this.f3061d.release(list);
        }
    }

    /* renamed from: c */
    public final InterfaceC9357j m2976c(InterfaceC5406e interfaceC5406e, int i10, int i11, C9230d c9230d, List list) throws GlideException {
        int size = this.f3059b.size();
        InterfaceC9357j interfaceC9357jMo3061a = null;
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC9231e interfaceC9231e = (InterfaceC9231e) this.f3059b.get(i12);
            try {
                if (interfaceC9231e.mo3062b(interfaceC5406e.mo2840a(), c9230d)) {
                    interfaceC9357jMo3061a = interfaceC9231e.mo3061a(interfaceC5406e.mo2840a(), i10, i11, c9230d);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e10) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Objects.toString(interfaceC9231e);
                }
                list.add(e10);
            }
            if (interfaceC9357jMo3061a != null) {
                break;
            }
        }
        if (interfaceC9357jMo3061a != null) {
            return interfaceC9357jMo3061a;
        }
        throw new GlideException(this.f3062e, new ArrayList(list));
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f3058a + ", decoders=" + this.f3059b + ", transcoder=" + this.f3060c + '}';
    }
}
