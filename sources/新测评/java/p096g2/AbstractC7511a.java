package p096g2;

import android.content.Context;

/* renamed from: g2.a */
/* loaded from: classes4.dex */
public abstract class AbstractC7511a {

    /* renamed from: a */
    public static final c f12371a = new b();

    /* renamed from: g2.a$b */
    public static class b extends c {
        @Override // p096g2.AbstractC7511a.c
        /* renamed from: a */
        public int mo12220a(Context context, String str, String str2) {
            return AbstractC7512b.m12222a(context, str, str2);
        }

        @Override // p096g2.AbstractC7511a.c
        /* renamed from: b */
        public String mo12221b(String str) {
            return AbstractC7512b.m12223b(str);
        }

        public b() {
            super();
        }
    }

    /* renamed from: g2.a$c */
    public static class c {
        /* renamed from: a */
        public abstract int mo12220a(Context context, String str, String str2);

        /* renamed from: b */
        public abstract String mo12221b(String str);

        public c() {
        }
    }

    /* renamed from: a */
    public static int m12218a(Context context, String str, String str2) {
        return f12371a.mo12220a(context, str, str2);
    }

    /* renamed from: b */
    public static String m12219b(String str) {
        return f12371a.mo12221b(str);
    }
}
