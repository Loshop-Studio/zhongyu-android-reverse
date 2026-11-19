package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bumptech.glide.e */
/* loaded from: classes3.dex */
public class C5813e {

    /* renamed from: a */
    public final Map f4624a;

    /* renamed from: com.bumptech.glide.e$a */
    public static final class a {

        /* renamed from: a */
        public final Map f4625a = new HashMap();

        /* renamed from: b */
        public C5813e m3975b() {
            return new C5813e(this);
        }
    }

    public C5813e(a aVar) {
        this.f4624a = Collections.unmodifiableMap(new HashMap(aVar.f4625a));
    }

    /* renamed from: a */
    public boolean m3973a(Class cls) {
        return this.f4624a.containsKey(cls);
    }
}
