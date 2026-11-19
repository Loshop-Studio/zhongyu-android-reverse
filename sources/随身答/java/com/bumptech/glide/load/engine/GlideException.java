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
import p122h0.InterfaceC8082b;

/* loaded from: classes3.dex */
public final class GlideException extends Exception {

    /* renamed from: g */
    public static final StackTraceElement[] f3374g = new StackTraceElement[0];

    /* renamed from: a */
    public final List f3375a;

    /* renamed from: b */
    public InterfaceC8082b f3376b;

    /* renamed from: c */
    public DataSource f3377c;

    /* renamed from: d */
    public Class f3378d;

    /* renamed from: e */
    public String f3379e;

    /* renamed from: f */
    public Exception f3380f;

    public GlideException(String str) {
        this(str, Collections.EMPTY_LIST);
    }

    /* renamed from: c */
    public static void m3133c(List list, Appendable appendable) {
        try {
            m3134g(list, appendable);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: g */
    public static void m3134g(List list, Appendable appendable) throws IOException {
        int size = list.size();
        int i9 = 0;
        while (i9 < size) {
            int i10 = i9 + 1;
            appendable.append("Cause (").append(String.valueOf(i10)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = (Throwable) list.get(i9);
            if (th instanceof GlideException) {
                ((GlideException) th).m3140u(appendable);
            } else {
                m3135k(th, appendable);
            }
            i9 = i10;
        }
    }

    /* renamed from: k */
    public static void m3135k(Throwable th, Appendable appendable) throws IOException {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: a */
    public final void m3136a(Throwable th, List list) {
        if (!(th instanceof GlideException)) {
            list.add(th);
            return;
        }
        Iterator it = ((GlideException) th).m3137n().iterator();
        while (it.hasNext()) {
            m3136a((Throwable) it.next(), list);
        }
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f3379e);
        sb.append(this.f3378d != null ? ", " + this.f3378d : "");
        sb.append(this.f3377c != null ? ", " + this.f3377c : "");
        sb.append(this.f3376b != null ? ", " + this.f3376b : "");
        List<Throwable> listM3138q = m3138q();
        if (listM3138q.isEmpty()) {
            return sb.toString();
        }
        if (listM3138q.size() == 1) {
            sb.append("\nThere was 1 cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(listM3138q.size());
            sb.append(" causes:");
        }
        for (Throwable th : listM3138q) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    /* renamed from: n */
    public List m3137n() {
        return this.f3375a;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() throws IOException {
        printStackTrace(System.err);
    }

    /* renamed from: q */
    public List m3138q() {
        ArrayList arrayList = new ArrayList();
        m3136a(this, arrayList);
        return arrayList;
    }

    /* renamed from: t */
    public void m3139t(String str) {
        List listM3138q = m3138q();
        int size = listM3138q.size();
        int i9 = 0;
        while (i9 < size) {
            StringBuilder sb = new StringBuilder();
            sb.append("Root cause (");
            int i10 = i9 + 1;
            sb.append(i10);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i(str, sb.toString(), (Throwable) listM3138q.get(i9));
            i9 = i10;
        }
    }

    /* renamed from: u */
    public final void m3140u(Appendable appendable) throws IOException {
        m3135k(this, appendable);
        m3133c(m3137n(), new C5484a(appendable));
    }

    /* renamed from: v */
    public void m3141v(InterfaceC8082b interfaceC8082b, DataSource dataSource) {
        m3142w(interfaceC8082b, dataSource, null);
    }

    /* renamed from: w */
    public void m3142w(InterfaceC8082b interfaceC8082b, DataSource dataSource, Class cls) {
        this.f3376b = interfaceC8082b;
        this.f3377c = dataSource;
        this.f3378d = cls;
    }

    /* renamed from: x */
    public void m3143x(Exception exc) {
        this.f3380f = exc;
    }

    public GlideException(String str, Throwable th) {
        this(str, Collections.singletonList(th));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) throws IOException {
        m3140u(printStream);
    }

    public GlideException(String str, List list) {
        this.f3379e = str;
        setStackTrace(f3374g);
        this.f3375a = list;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) throws IOException {
        m3140u(printWriter);
    }

    /* renamed from: com.bumptech.glide.load.engine.GlideException$a */
    public static final class C5484a implements Appendable {

        /* renamed from: a */
        public final Appendable f3381a;

        /* renamed from: b */
        public boolean f3382b = true;

        public C5484a(Appendable appendable) {
            this.f3381a = appendable;
        }

        /* renamed from: a */
        public final CharSequence m3144a(CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c10) throws IOException {
            if (this.f3382b) {
                this.f3382b = false;
                this.f3381a.append("  ");
            }
            this.f3382b = c10 == '\n';
            this.f3381a.append(c10);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) {
            CharSequence charSequenceM3144a = m3144a(charSequence);
            return append(charSequenceM3144a, 0, charSequenceM3144a.length());
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i9, int i10) throws IOException {
            CharSequence charSequenceM3144a = m3144a(charSequence);
            boolean z9 = false;
            if (this.f3382b) {
                this.f3382b = false;
                this.f3381a.append("  ");
            }
            if (charSequenceM3144a.length() > 0 && charSequenceM3144a.charAt(i10 - 1) == '\n') {
                z9 = true;
            }
            this.f3382b = z9;
            this.f3381a.append(charSequenceM3144a, i9, i10);
            return this;
        }
    }
}
