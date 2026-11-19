package p000a.p031h.p043j.p045b0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* renamed from: a.h.j.b0.e */
/* loaded from: classes.dex */
public final class C0253e {

    /* renamed from: a */
    public final c f1586a;

    /* renamed from: a.h.j.b0.e$a */
    public static final class a implements c {

        /* renamed from: a */
        public final InputContentInfo f1587a;

        public a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f1587a = new InputContentInfo(uri, clipDescription, uri2);
        }

        public a(Object obj) {
            this.f1587a = (InputContentInfo) obj;
        }

        @Override // p000a.p031h.p043j.p045b0.C0253e.c
        /* renamed from: a */
        public ClipDescription mo835a() {
            return this.f1587a.getDescription();
        }

        @Override // p000a.p031h.p043j.p045b0.C0253e.c
        /* renamed from: b */
        public void mo836b() {
            this.f1587a.requestPermission();
        }

        @Override // p000a.p031h.p043j.p045b0.C0253e.c
        /* renamed from: c */
        public Uri mo837c() {
            return this.f1587a.getLinkUri();
        }

        @Override // p000a.p031h.p043j.p045b0.C0253e.c
        /* renamed from: d */
        public Object mo838d() {
            return this.f1587a;
        }

        @Override // p000a.p031h.p043j.p045b0.C0253e.c
        /* renamed from: e */
        public Uri mo839e() {
            return this.f1587a.getContentUri();
        }
    }

    /* renamed from: a.h.j.b0.e$b */
    public static final class b implements c {

        /* renamed from: a */
        public final Uri f1588a;

        /* renamed from: b */
        public final ClipDescription f1589b;

        /* renamed from: c */
        public final Uri f1590c;

        public b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f1588a = uri;
            this.f1589b = clipDescription;
            this.f1590c = uri2;
        }

        @Override // p000a.p031h.p043j.p045b0.C0253e.c
        /* renamed from: a */
        public ClipDescription mo835a() {
            return this.f1589b;
        }

        @Override // p000a.p031h.p043j.p045b0.C0253e.c
        /* renamed from: b */
        public void mo836b() {
        }

        @Override // p000a.p031h.p043j.p045b0.C0253e.c
        /* renamed from: c */
        public Uri mo837c() {
            return this.f1590c;
        }

        @Override // p000a.p031h.p043j.p045b0.C0253e.c
        /* renamed from: d */
        public Object mo838d() {
            return null;
        }

        @Override // p000a.p031h.p043j.p045b0.C0253e.c
        /* renamed from: e */
        public Uri mo839e() {
            return this.f1588a;
        }
    }

    /* renamed from: a.h.j.b0.e$c */
    public interface c {
        /* renamed from: a */
        ClipDescription mo835a();

        /* renamed from: b */
        void mo836b();

        /* renamed from: c */
        Uri mo837c();

        /* renamed from: d */
        Object mo838d();

        /* renamed from: e */
        Uri mo839e();
    }

    public C0253e(c cVar) {
        this.f1586a = cVar;
    }
}
