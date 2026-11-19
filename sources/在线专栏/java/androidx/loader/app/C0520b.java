package androidx.loader.app;

import android.os.Bundle;
import android.util.Log;
import androidx.collection.C0254h;
import androidx.lifecycle.AbstractC0489b0;
import androidx.lifecycle.C0491c0;
import androidx.lifecycle.C0493d0;
import androidx.lifecycle.C0511s;
import androidx.lifecycle.InterfaceC0504l;
import androidx.lifecycle.InterfaceC0512t;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p011b0.C1019b;
import p118m0.C2859a;

/* renamed from: androidx.loader.app.b */
/* loaded from: classes.dex */
class C0520b extends AbstractC0519a {

    /* renamed from: c */
    static boolean f3469c = false;

    /* renamed from: a */
    private final InterfaceC0504l f3470a;

    /* renamed from: b */
    private final b f3471b;

    /* renamed from: androidx.loader.app.b$a */
    public static class a<D> extends C0511s<D> {

        /* renamed from: a */
        private final int f3472a;

        /* renamed from: b */
        private final Bundle f3473b;

        /* renamed from: c */
        private InterfaceC0504l f3474c;

        /* renamed from: a */
        C2859a<D> m2925a(boolean z3) {
            if (C0520b.f3469c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            throw null;
        }

        /* renamed from: b */
        public void m2926b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f3472a);
            printWriter.print(" mArgs=");
            printWriter.println(this.f3473b);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println((Object) null);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("  ");
            throw null;
        }

        /* renamed from: c */
        void m2927c() {
        }

        @Override // androidx.lifecycle.LiveData
        protected void onActive() {
            if (C0520b.f3469c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            throw null;
        }

        @Override // androidx.lifecycle.LiveData
        protected void onInactive() {
            if (C0520b.f3469c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void removeObserver(InterfaceC0512t<? super D> interfaceC0512t) {
            super.removeObserver(interfaceC0512t);
            this.f3474c = null;
        }

        @Override // androidx.lifecycle.C0511s, androidx.lifecycle.LiveData
        public void setValue(D d4) {
            super.setValue(d4);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f3472a);
            sb.append(" : ");
            C1019b.m4772a(null, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: androidx.loader.app.b$b */
    static class b extends AbstractC0489b0 {

        /* renamed from: e */
        private static final C0491c0.b f3475e = new a();

        /* renamed from: c */
        private C0254h<a> f3476c = new C0254h<>();

        /* renamed from: d */
        private boolean f3477d = false;

        /* renamed from: androidx.loader.app.b$b$a */
        static class a implements C0491c0.b {
            a() {
            }

            @Override // androidx.lifecycle.C0491c0.b
            /* renamed from: a */
            public <T extends AbstractC0489b0> T mo2650a(Class<T> cls) {
                return new b();
            }
        }

        b() {
        }

        /* renamed from: g */
        static b m2928g(C0493d0 c0493d0) {
            return (b) new C0491c0(c0493d0, f3475e).m2850a(b.class);
        }

        @Override // androidx.lifecycle.AbstractC0489b0
        /* renamed from: d */
        protected void mo2639d() {
            super.mo2639d();
            int iM1149j = this.f3476c.m1149j();
            for (int i4 = 0; i4 < iM1149j; i4++) {
                this.f3476c.m1150k(i4).m2925a(true);
            }
            this.f3476c.m1142b();
        }

        /* renamed from: f */
        public void m2929f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f3476c.m1149j() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i4 = 0; i4 < this.f3476c.m1149j(); i4++) {
                    a aVarM1150k = this.f3476c.m1150k(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f3476c.m1147h(i4));
                    printWriter.print(": ");
                    printWriter.println(aVarM1150k.toString());
                    aVarM1150k.m2926b(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* renamed from: h */
        void m2930h() {
            int iM1149j = this.f3476c.m1149j();
            for (int i4 = 0; i4 < iM1149j; i4++) {
                this.f3476c.m1150k(i4).m2927c();
            }
        }
    }

    C0520b(InterfaceC0504l interfaceC0504l, C0493d0 c0493d0) {
        this.f3470a = interfaceC0504l;
        this.f3471b = b.m2928g(c0493d0);
    }

    @Override // androidx.loader.app.AbstractC0519a
    @Deprecated
    /* renamed from: a */
    public void mo2923a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f3471b.m2929f(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.AbstractC0519a
    /* renamed from: c */
    public void mo2924c() {
        this.f3471b.m2930h();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C1019b.m4772a(this.f3470a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
