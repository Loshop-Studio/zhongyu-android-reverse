package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bumptech.glide.f */
/* loaded from: classes3.dex */
public class C4681f {

    /* renamed from: a */
    public final Map f2212a;

    /* renamed from: com.bumptech.glide.f$a */
    public static final class a {

        /* renamed from: a */
        public final Map f2213a = new HashMap();

        /* renamed from: b */
        public C4681f m2504b() {
            return new C4681f(this);
        }
    }

    public C4681f(a aVar) {
        this.f2212a = Collections.unmodifiableMap(new HashMap(aVar.f2213a));
    }

    /* renamed from: a */
    public boolean m2502a(Class cls) {
        return this.f2212a.containsKey(cls);
    }
}
