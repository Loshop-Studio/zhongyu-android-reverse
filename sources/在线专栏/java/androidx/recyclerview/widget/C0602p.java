package androidx.recyclerview.widget;

import android.view.View;

/* renamed from: androidx.recyclerview.widget.p */
/* loaded from: classes.dex */
class C0602p {

    /* renamed from: a */
    final b f3891a;

    /* renamed from: b */
    a f3892b = new a();

    /* renamed from: androidx.recyclerview.widget.p$a */
    static class a {

        /* renamed from: a */
        int f3893a = 0;

        /* renamed from: b */
        int f3894b;

        /* renamed from: c */
        int f3895c;

        /* renamed from: d */
        int f3896d;

        /* renamed from: e */
        int f3897e;

        a() {
        }

        /* renamed from: a */
        void m3446a(int i4) {
            this.f3893a = i4 | this.f3893a;
        }

        /* renamed from: b */
        boolean m3447b() {
            int i4 = this.f3893a;
            if ((i4 & 7) != 0 && (i4 & (m3448c(this.f3896d, this.f3894b) << 0)) == 0) {
                return false;
            }
            int i5 = this.f3893a;
            if ((i5 & 112) != 0 && (i5 & (m3448c(this.f3896d, this.f3895c) << 4)) == 0) {
                return false;
            }
            int i6 = this.f3893a;
            if ((i6 & 1792) != 0 && (i6 & (m3448c(this.f3897e, this.f3894b) << 8)) == 0) {
                return false;
            }
            int i7 = this.f3893a;
            return (i7 & 28672) == 0 || (i7 & (m3448c(this.f3897e, this.f3895c) << 12)) != 0;
        }

        /* renamed from: c */
        int m3448c(int i4, int i5) {
            if (i4 > i5) {
                return 1;
            }
            return i4 == i5 ? 2 : 4;
        }

        /* renamed from: d */
        void m3449d() {
            this.f3893a = 0;
        }

        /* renamed from: e */
        void m3450e(int i4, int i5, int i6, int i7) {
            this.f3894b = i4;
            this.f3895c = i5;
            this.f3896d = i6;
            this.f3897e = i7;
        }
    }

    /* renamed from: androidx.recyclerview.widget.p$b */
    interface b {
        /* renamed from: a */
        View mo3091a(int i4);

        /* renamed from: b */
        int mo3092b();

        /* renamed from: c */
        int mo3093c(View view);

        /* renamed from: d */
        int mo3094d();

        /* renamed from: e */
        int mo3095e(View view);
    }

    C0602p(b bVar) {
        this.f3891a = bVar;
    }

    /* renamed from: a */
    View m3444a(int i4, int i5, int i6, int i7) {
        int iMo3094d = this.f3891a.mo3094d();
        int iMo3092b = this.f3891a.mo3092b();
        int i8 = i5 > i4 ? 1 : -1;
        View view = null;
        while (i4 != i5) {
            View viewMo3091a = this.f3891a.mo3091a(i4);
            this.f3892b.m3450e(iMo3094d, iMo3092b, this.f3891a.mo3093c(viewMo3091a), this.f3891a.mo3095e(viewMo3091a));
            if (i6 != 0) {
                this.f3892b.m3449d();
                this.f3892b.m3446a(i6);
                if (this.f3892b.m3447b()) {
                    return viewMo3091a;
                }
            }
            if (i7 != 0) {
                this.f3892b.m3449d();
                this.f3892b.m3446a(i7);
                if (this.f3892b.m3447b()) {
                    view = viewMo3091a;
                }
            }
            i4 += i8;
        }
        return view;
    }

    /* renamed from: b */
    boolean m3445b(View view, int i4) {
        this.f3892b.m3450e(this.f3891a.mo3094d(), this.f3891a.mo3092b(), this.f3891a.mo3093c(view), this.f3891a.mo3095e(view));
        if (i4 == 0) {
            return false;
        }
        this.f3892b.m3449d();
        this.f3892b.m3446a(i4);
        return this.f3892b.m3447b();
    }
}
