package p079e0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* renamed from: e0.c */
/* loaded from: classes.dex */
public final class C2470c {

    /* renamed from: a */
    private final c f10070a;

    /* renamed from: e0.c$b */
    private static final class b implements c {

        /* renamed from: a */
        private final Uri f10072a;

        /* renamed from: b */
        private final ClipDescription f10073b;

        /* renamed from: c */
        private final Uri f10074c;

        b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f10072a = uri;
            this.f10073b = clipDescription;
            this.f10074c = uri2;
        }

        @Override // p079e0.C2470c.c
        /* renamed from: a */
        public ClipDescription mo8243a() {
            return this.f10073b;
        }

        @Override // p079e0.C2470c.c
        /* renamed from: b */
        public Object mo8244b() {
            return null;
        }

        @Override // p079e0.C2470c.c
        /* renamed from: c */
        public Uri mo8245c() {
            return this.f10072a;
        }

        @Override // p079e0.C2470c.c
        /* renamed from: d */
        public void mo8246d() {
        }

        @Override // p079e0.C2470c.c
        /* renamed from: e */
        public Uri mo8247e() {
            return this.f10074c;
        }
    }

    /* renamed from: e0.c$c */
    private interface c {
        /* renamed from: a */
        ClipDescription mo8243a();

        /* renamed from: b */
        Object mo8244b();

        /* renamed from: c */
        Uri mo8245c();

        /* renamed from: d */
        void mo8246d();

        /* renamed from: e */
        Uri mo8247e();
    }

    public C2470c(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f10070a = new a(uri, clipDescription, uri2);
        } else {
            this.f10070a = new b(uri, clipDescription, uri2);
        }
    }

    /* renamed from: f */
    public static C2470c m8237f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new C2470c(new a(obj));
        }
        return null;
    }

    /* renamed from: a */
    public Uri m8238a() {
        return this.f10070a.mo8245c();
    }

    /* renamed from: b */
    public ClipDescription m8239b() {
        return this.f10070a.mo8243a();
    }

    /* renamed from: c */
    public Uri m8240c() {
        return this.f10070a.mo8247e();
    }

    /* renamed from: d */
    public void m8241d() {
        this.f10070a.mo8246d();
    }

    /* renamed from: e */
    public Object m8242e() {
        return this.f10070a.mo8244b();
    }

    /* renamed from: e0.c$a */
    private static final class a implements c {

        /* renamed from: a */
        final InputContentInfo f10071a;

        a(Object obj) {
            this.f10071a = (InputContentInfo) obj;
        }

        @Override // p079e0.C2470c.c
        /* renamed from: a */
        public ClipDescription mo8243a() {
            return this.f10071a.getDescription();
        }

        @Override // p079e0.C2470c.c
        /* renamed from: b */
        public Object mo8244b() {
            return this.f10071a;
        }

        @Override // p079e0.C2470c.c
        /* renamed from: c */
        public Uri mo8245c() {
            return this.f10071a.getContentUri();
        }

        @Override // p079e0.C2470c.c
        /* renamed from: d */
        public void mo8246d() {
            this.f10071a.requestPermission();
        }

        @Override // p079e0.C2470c.c
        /* renamed from: e */
        public Uri mo8247e() {
            return this.f10071a.getLinkUri();
        }

        a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f10071a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    private C2470c(c cVar) {
        this.f10070a = cVar;
    }
}
