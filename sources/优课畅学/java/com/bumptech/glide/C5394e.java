package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bumptech.glide.e */
/* loaded from: classes3.dex */
public class C5394e {

    /* renamed from: a */
    public final Map f2854a;

    /* renamed from: com.bumptech.glide.e$a */
    public static final class a {

        /* renamed from: a */
        public final Map f2855a = new HashMap();

        /* renamed from: b */
        public C5394e m2766b() {
            return new C5394e(this);
        }
    }

    public C5394e(a aVar) {
        this.f2854a = Collections.unmodifiableMap(new HashMap(aVar.f2855a));
    }

    /* renamed from: a */
    public boolean m2764a(Class cls) {
        return this.f2854a.containsKey(cls);
    }
}
