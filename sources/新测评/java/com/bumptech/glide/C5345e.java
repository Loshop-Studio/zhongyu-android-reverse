package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bumptech.glide.e */
/* loaded from: classes3.dex */
public class C5345e {

    /* renamed from: a */
    public final Map f3421a;

    /* renamed from: com.bumptech.glide.e$a */
    public static final class a {

        /* renamed from: a */
        public final Map f3422a = new HashMap();

        /* renamed from: b */
        public C5345e m3325b() {
            return new C5345e(this);
        }
    }

    public C5345e(a aVar) {
        this.f3421a = Collections.unmodifiableMap(new HashMap(aVar.f3422a));
    }

    /* renamed from: a */
    public boolean m3323a(Class cls) {
        return this.f3421a.containsKey(cls);
    }
}
