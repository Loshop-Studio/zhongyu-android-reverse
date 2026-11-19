package com.tendcloud.tenddata;

import java.util.List;

/* renamed from: com.tendcloud.tenddata.h */
/* loaded from: classes5.dex */
class C8004h {

    /* renamed from: a */
    private final AbstractC8010n f15019a;

    /* renamed from: com.tendcloud.tenddata.h$a */
    public static class a {
        final List<String> imageUrls;
        final AbstractC8015t visitor;

        private a(AbstractC8015t abstractC8015t, List<String> list) {
            this.visitor = abstractC8015t;
            this.imageUrls = list;
        }
    }

    public C8004h(AbstractC8010n abstractC8010n) {
        this.f15019a = abstractC8010n;
    }

    /* renamed from: a */
    public C8014s m12029a() {
        try {
            return new C8014s(this.f15019a);
        } catch (Throwable unused) {
            return null;
        }
    }
}
