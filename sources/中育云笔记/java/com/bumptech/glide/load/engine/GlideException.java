package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p168h0.InterfaceC9435b;

/* loaded from: classes3.dex */
public final class GlideException extends Exception {

    /* renamed from: i */
    public static final StackTraceElement[] f4780i = new StackTraceElement[0];

    /* renamed from: c */
    public final List f4781c;

    /* renamed from: d */
    public InterfaceC9435b f4782d;

    /* renamed from: e */
    public DataSource f4783e;

    /* renamed from: f */
    public Class f4784f;

    /* renamed from: g */
    public String f4785g;

    /* renamed from: h */
    public Exception f4786h;

    public GlideException(String str) {
        this(str, Collections.EMPTY_LIST);
    }

    /* renamed from: c */
    public static void m4132c(List list, Appendable appendable) {
        try {
            m4133d(list, appendable);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: d */
    public static void m4133d(List list, Appendable appendable) throws IOException {
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            appendable.append("Cause (").append(String.valueOf(i11)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = (Throwable) list.get(i10);
            if (th instanceof GlideException) {
                ((GlideException) th).m4139m(appendable);
            } else {
                m4134e(th, appendable);
            }
            i10 = i11;
        }
    }

    /* renamed from: e */
    public static void m4134e(Throwable th, Appendable appendable) throws IOException {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: a */
    public final void m4135a(Throwable th, List list) {
        if (!(th instanceof GlideException)) {
            list.add(th);
            return;
        }
        Iterator it = ((GlideException) th).m4136f().iterator();
        while (it.hasNext()) {
            m4135a((Throwable) it.next(), list);
        }
    }

    /* renamed from: f */
    public List m4136f() {
        return this.f4781c;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    /* renamed from: g */
    public List m4137g() {
        ArrayList arrayList = new ArrayList();
        m4135a(this, arrayList);
        return arrayList;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb2 = new StringBuilder(71);
        sb2.append(this.f4785g);
        sb2.append(this.f4784f != null ? ", " + this.f4784f : "");
        sb2.append(this.f4783e != null ? ", " + this.f4783e : "");
        sb2.append(this.f4782d != null ? ", " + this.f4782d : "");
        List<Throwable> listM4137g = m4137g();
        if (listM4137g.isEmpty()) {
            return sb2.toString();
        }
        if (listM4137g.size() == 1) {
            sb2.append("\nThere was 1 root cause:");
        } else {
            sb2.append("\nThere were ");
            sb2.append(listM4137g.size());
            sb2.append(" root causes:");
        }
        for (Throwable th : listM4137g) {
            sb2.append('\n');
            sb2.append(th.getClass().getName());
            sb2.append('(');
            sb2.append(th.getMessage());
            sb2.append(')');
        }
        sb2.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb2.toString();
    }

    /* renamed from: k */
    public void m4138k(String str) {
        List listM4137g = m4137g();
        int size = listM4137g.size();
        int i10 = 0;
        while (i10 < size) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Root cause (");
            int i11 = i10 + 1;
            sb2.append(i11);
            sb2.append(" of ");
            sb2.append(size);
            sb2.append(")");
            Log.i(str, sb2.toString(), (Throwable) listM4137g.get(i10));
            i10 = i11;
        }
    }

    /* renamed from: m */
    public final void m4139m(Appendable appendable) throws IOException {
        m4134e(this, appendable);
        m4132c(m4136f(), new C5841a(appendable));
    }

    /* renamed from: n */
    public void m4140n(InterfaceC9435b interfaceC9435b, DataSource dataSource) {
        m4141o(interfaceC9435b, dataSource, null);
    }

    /* renamed from: o */
    public void m4141o(InterfaceC9435b interfaceC9435b, DataSource dataSource, Class cls) {
        this.f4782d = interfaceC9435b;
        this.f4783e = dataSource;
        this.f4784f = cls;
    }

    /* renamed from: p */
    public void m4142p(Exception exc) {
        this.f4786h = exc;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() throws IOException {
        printStackTrace(System.err);
    }

    public GlideException(String str, Throwable th) {
        this(str, Collections.singletonList(th));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) throws IOException {
        m4139m(printStream);
    }

    public GlideException(String str, List list) {
        this.f4785g = str;
        setStackTrace(f4780i);
        this.f4781c = list;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) throws IOException {
        m4139m(printWriter);
    }

    /* renamed from: com.bumptech.glide.load.engine.GlideException$a */
    public static final class C5841a implements Appendable {

        /* renamed from: c */
        public final Appendable f4787c;

        /* renamed from: d */
        public boolean f4788d = true;

        public C5841a(Appendable appendable) {
            this.f4787c = appendable;
        }

        /* renamed from: a */
        public final CharSequence m4143a(CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c10) throws IOException {
            if (this.f4788d) {
                this.f4788d = false;
                this.f4787c.append("  ");
            }
            this.f4788d = c10 == '\n';
            this.f4787c.append(c10);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) {
            CharSequence charSequenceM4143a = m4143a(charSequence);
            return append(charSequenceM4143a, 0, charSequenceM4143a.length());
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i10, int i11) throws IOException {
            CharSequence charSequenceM4143a = m4143a(charSequence);
            boolean z10 = false;
            if (this.f4788d) {
                this.f4788d = false;
                this.f4787c.append("  ");
            }
            if (charSequenceM4143a.length() > 0 && charSequenceM4143a.charAt(i11 - 1) == '\n') {
                z10 = true;
            }
            this.f4788d = z10;
            this.f4787c.append(charSequenceM4143a, i10, i11);
            return this;
        }
    }
}
