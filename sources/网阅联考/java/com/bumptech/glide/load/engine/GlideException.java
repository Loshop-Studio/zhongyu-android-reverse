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
import p076j.InterfaceC3792b;

/* loaded from: classes2.dex */
public final class GlideException extends Exception {

    /* renamed from: g */
    public static final StackTraceElement[] f720g = new StackTraceElement[0];

    /* renamed from: a */
    public final List f721a;

    /* renamed from: b */
    public InterfaceC3792b f722b;

    /* renamed from: c */
    public DataSource f723c;

    /* renamed from: d */
    public Class f724d;

    /* renamed from: e */
    public String f725e;

    /* renamed from: f */
    public Exception f726f;

    public GlideException(String str) {
        this(str, Collections.emptyList());
    }

    /* renamed from: b */
    public static void m1808b(List list, Appendable appendable) {
        try {
            m1809c(list, appendable);
        } catch (IOException e4) {
            throw new RuntimeException(e4);
        }
    }

    /* renamed from: c */
    public static void m1809c(List list, Appendable appendable) throws IOException {
        int size = list.size();
        int i4 = 0;
        while (i4 < size) {
            int i5 = i4 + 1;
            appendable.append("Cause (").append(String.valueOf(i5)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = (Throwable) list.get(i4);
            if (th instanceof GlideException) {
                ((GlideException) th).m1815h(appendable);
            } else {
                m1810d(th, appendable);
            }
            i4 = i5;
        }
    }

    /* renamed from: d */
    public static void m1810d(Throwable th, Appendable appendable) throws IOException {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: a */
    public final void m1811a(Throwable th, List list) {
        if (!(th instanceof GlideException)) {
            list.add(th);
            return;
        }
        Iterator it = ((GlideException) th).m1812e().iterator();
        while (it.hasNext()) {
            m1811a((Throwable) it.next(), list);
        }
    }

    /* renamed from: e */
    public List m1812e() {
        return this.f721a;
    }

    /* renamed from: f */
    public List m1813f() {
        ArrayList arrayList = new ArrayList();
        m1811a(this, arrayList);
        return arrayList;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    /* renamed from: g */
    public void m1814g(String str) {
        List listM1813f = m1813f();
        int size = listM1813f.size();
        int i4 = 0;
        while (i4 < size) {
            StringBuilder sb = new StringBuilder();
            sb.append("Root cause (");
            int i5 = i4 + 1;
            sb.append(i5);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i(str, sb.toString(), (Throwable) listM1813f.get(i4));
            i4 = i5;
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f725e);
        sb.append(this.f724d != null ? ", " + this.f724d : "");
        sb.append(this.f723c != null ? ", " + this.f723c : "");
        sb.append(this.f722b != null ? ", " + this.f722b : "");
        List<Throwable> listM1813f = m1813f();
        if (listM1813f.isEmpty()) {
            return sb.toString();
        }
        if (listM1813f.size() == 1) {
            sb.append("\nThere was 1 cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(listM1813f.size());
            sb.append(" causes:");
        }
        for (Throwable th : listM1813f) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    /* renamed from: h */
    public final void m1815h(Appendable appendable) throws IOException {
        m1810d(this, appendable);
        m1808b(m1812e(), new C2871a(appendable));
    }

    /* renamed from: i */
    public void m1816i(InterfaceC3792b interfaceC3792b, DataSource dataSource) {
        m1817j(interfaceC3792b, dataSource, null);
    }

    /* renamed from: j */
    public void m1817j(InterfaceC3792b interfaceC3792b, DataSource dataSource, Class cls) {
        this.f722b = interfaceC3792b;
        this.f723c = dataSource;
        this.f724d = cls;
    }

    /* renamed from: k */
    public void m1818k(Exception exc) {
        this.f726f = exc;
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
        m1815h(printStream);
    }

    public GlideException(String str, List list) {
        this.f725e = str;
        setStackTrace(f720g);
        this.f721a = list;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) throws IOException {
        m1815h(printWriter);
    }

    /* renamed from: com.bumptech.glide.load.engine.GlideException$a */
    public static final class C2871a implements Appendable {

        /* renamed from: a */
        public final Appendable f727a;

        /* renamed from: b */
        public boolean f728b = true;

        public C2871a(Appendable appendable) {
            this.f727a = appendable;
        }

        /* renamed from: a */
        public final CharSequence m1819a(CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c4) throws IOException {
            if (this.f728b) {
                this.f728b = false;
                this.f727a.append("  ");
            }
            this.f728b = c4 == '\n';
            this.f727a.append(c4);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) {
            CharSequence charSequenceM1819a = m1819a(charSequence);
            return append(charSequenceM1819a, 0, charSequenceM1819a.length());
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i4, int i5) throws IOException {
            CharSequence charSequenceM1819a = m1819a(charSequence);
            boolean z3 = false;
            if (this.f728b) {
                this.f728b = false;
                this.f727a.append("  ");
            }
            if (charSequenceM1819a.length() > 0 && charSequenceM1819a.charAt(i5 - 1) == '\n') {
                z3 = true;
            }
            this.f728b = z3;
            this.f727a.append(charSequenceM1819a, i4, i5);
            return this;
        }
    }
}
