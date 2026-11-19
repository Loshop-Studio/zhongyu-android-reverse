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
import p053f0.InterfaceC6283b;

/* loaded from: classes3.dex */
public final class GlideException extends Exception {

    /* renamed from: g */
    public static final StackTraceElement[] f2368g = new StackTraceElement[0];

    /* renamed from: a */
    public final List f2369a;

    /* renamed from: b */
    public InterfaceC6283b f2370b;

    /* renamed from: c */
    public DataSource f2371c;

    /* renamed from: d */
    public Class f2372d;

    /* renamed from: e */
    public String f2373e;

    /* renamed from: f */
    public Exception f2374f;

    public GlideException(String str) {
        this(str, Collections.EMPTY_LIST);
    }

    /* renamed from: b */
    public static void m2662b(List list, Appendable appendable) {
        try {
            m2663c(list, appendable);
        } catch (IOException e6) {
            throw new RuntimeException(e6);
        }
    }

    /* renamed from: c */
    public static void m2663c(List list, Appendable appendable) throws IOException {
        int size = list.size();
        int i6 = 0;
        while (i6 < size) {
            int i7 = i6 + 1;
            appendable.append("Cause (").append(String.valueOf(i7)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = (Throwable) list.get(i6);
            if (th instanceof GlideException) {
                ((GlideException) th).m2669h(appendable);
            } else {
                m2664d(th, appendable);
            }
            i6 = i7;
        }
    }

    /* renamed from: d */
    public static void m2664d(Throwable th, Appendable appendable) throws IOException {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: a */
    public final void m2665a(Throwable th, List list) {
        if (!(th instanceof GlideException)) {
            list.add(th);
            return;
        }
        Iterator it = ((GlideException) th).m2666e().iterator();
        while (it.hasNext()) {
            m2665a((Throwable) it.next(), list);
        }
    }

    /* renamed from: e */
    public List m2666e() {
        return this.f2369a;
    }

    /* renamed from: f */
    public List m2667f() {
        ArrayList arrayList = new ArrayList();
        m2665a(this, arrayList);
        return arrayList;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    /* renamed from: g */
    public void m2668g(String str) {
        List listM2667f = m2667f();
        int size = listM2667f.size();
        int i6 = 0;
        while (i6 < size) {
            StringBuilder sb = new StringBuilder();
            sb.append("Root cause (");
            int i7 = i6 + 1;
            sb.append(i7);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i(str, sb.toString(), (Throwable) listM2667f.get(i6));
            i6 = i7;
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f2373e);
        sb.append(this.f2372d != null ? ", " + this.f2372d : "");
        sb.append(this.f2371c != null ? ", " + this.f2371c : "");
        sb.append(this.f2370b != null ? ", " + this.f2370b : "");
        List<Throwable> listM2667f = m2667f();
        if (listM2667f.isEmpty()) {
            return sb.toString();
        }
        if (listM2667f.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(listM2667f.size());
            sb.append(" root causes:");
        }
        for (Throwable th : listM2667f) {
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
    public final void m2669h(Appendable appendable) throws IOException {
        m2664d(this, appendable);
        m2662b(m2666e(), new C4709a(appendable));
    }

    /* renamed from: i */
    public void m2670i(InterfaceC6283b interfaceC6283b, DataSource dataSource) {
        m2671j(interfaceC6283b, dataSource, null);
    }

    /* renamed from: j */
    public void m2671j(InterfaceC6283b interfaceC6283b, DataSource dataSource, Class cls) {
        this.f2370b = interfaceC6283b;
        this.f2371c = dataSource;
        this.f2372d = cls;
    }

    /* renamed from: k */
    public void m2672k(Exception exc) {
        this.f2374f = exc;
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
        m2669h(printStream);
    }

    public GlideException(String str, List list) {
        this.f2373e = str;
        setStackTrace(f2368g);
        this.f2369a = list;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) throws IOException {
        m2669h(printWriter);
    }

    /* renamed from: com.bumptech.glide.load.engine.GlideException$a */
    public static final class C4709a implements Appendable {

        /* renamed from: a */
        public final Appendable f2375a;

        /* renamed from: b */
        public boolean f2376b = true;

        public C4709a(Appendable appendable) {
            this.f2375a = appendable;
        }

        /* renamed from: a */
        public final CharSequence m2673a(CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c7) throws IOException {
            if (this.f2376b) {
                this.f2376b = false;
                this.f2375a.append("  ");
            }
            this.f2376b = c7 == '\n';
            this.f2375a.append(c7);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) {
            CharSequence charSequenceM2673a = m2673a(charSequence);
            return append(charSequenceM2673a, 0, charSequenceM2673a.length());
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i6, int i7) throws IOException {
            CharSequence charSequenceM2673a = m2673a(charSequence);
            boolean z6 = false;
            if (this.f2376b) {
                this.f2376b = false;
                this.f2375a.append("  ");
            }
            if (charSequenceM2673a.length() > 0 && charSequenceM2673a.charAt(i7 - 1) == '\n') {
                z6 = true;
            }
            this.f2376b = z6;
            this.f2375a.append(charSequenceM2673a, i6, i7);
            return this;
        }
    }
}
