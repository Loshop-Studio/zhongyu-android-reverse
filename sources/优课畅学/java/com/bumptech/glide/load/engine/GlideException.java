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
import p160l.InterfaceC9228b;

/* loaded from: classes3.dex */
public final class GlideException extends Exception {

    /* renamed from: g */
    public static final StackTraceElement[] f3010g = new StackTraceElement[0];

    /* renamed from: a */
    public final List f3011a;

    /* renamed from: b */
    public InterfaceC9228b f3012b;

    /* renamed from: c */
    public DataSource f3013c;

    /* renamed from: d */
    public Class f3014d;

    /* renamed from: e */
    public String f3015e;

    /* renamed from: f */
    public Exception f3016f;

    public GlideException(String str) {
        this(str, Collections.EMPTY_LIST);
    }

    /* renamed from: b */
    public static void m2928b(List list, Appendable appendable) {
        try {
            m2929c(list, appendable);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: c */
    public static void m2929c(List list, Appendable appendable) throws IOException {
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            appendable.append("Cause (").append(String.valueOf(i11)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = (Throwable) list.get(i10);
            if (th instanceof GlideException) {
                ((GlideException) th).m2935i(appendable);
            } else {
                m2930d(th, appendable);
            }
            i10 = i11;
        }
    }

    /* renamed from: d */
    public static void m2930d(Throwable th, Appendable appendable) throws IOException {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: a */
    public final void m2931a(Throwable th, List list) {
        if (!(th instanceof GlideException)) {
            list.add(th);
            return;
        }
        Iterator it = ((GlideException) th).m2932e().iterator();
        while (it.hasNext()) {
            m2931a((Throwable) it.next(), list);
        }
    }

    /* renamed from: e */
    public List m2932e() {
        return this.f3011a;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    /* renamed from: g */
    public List m2933g() {
        ArrayList arrayList = new ArrayList();
        m2931a(this, arrayList);
        return arrayList;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f3015e);
        sb.append(this.f3014d != null ? ", " + this.f3014d : "");
        sb.append(this.f3013c != null ? ", " + this.f3013c : "");
        sb.append(this.f3012b != null ? ", " + this.f3012b : "");
        List<Throwable> listM2933g = m2933g();
        if (listM2933g.isEmpty()) {
            return sb.toString();
        }
        if (listM2933g.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(listM2933g.size());
            sb.append(" root causes:");
        }
        for (Throwable th : listM2933g) {
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
    public void m2934h(String str) {
        List listM2933g = m2933g();
        int size = listM2933g.size();
        int i10 = 0;
        while (i10 < size) {
            StringBuilder sb = new StringBuilder();
            sb.append("Root cause (");
            int i11 = i10 + 1;
            sb.append(i11);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i(str, sb.toString(), (Throwable) listM2933g.get(i10));
            i10 = i11;
        }
    }

    /* renamed from: i */
    public final void m2935i(Appendable appendable) throws IOException {
        m2930d(this, appendable);
        m2928b(m2932e(), new C5422a(appendable));
    }

    /* renamed from: j */
    public void m2936j(InterfaceC9228b interfaceC9228b, DataSource dataSource) {
        m2937k(interfaceC9228b, dataSource, null);
    }

    /* renamed from: k */
    public void m2937k(InterfaceC9228b interfaceC9228b, DataSource dataSource, Class cls) {
        this.f3012b = interfaceC9228b;
        this.f3013c = dataSource;
        this.f3014d = cls;
    }

    /* renamed from: l */
    public void m2938l(Exception exc) {
        this.f3016f = exc;
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
        m2935i(printStream);
    }

    public GlideException(String str, List list) {
        this.f3015e = str;
        setStackTrace(f3010g);
        this.f3011a = list;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) throws IOException {
        m2935i(printWriter);
    }

    /* renamed from: com.bumptech.glide.load.engine.GlideException$a */
    public static final class C5422a implements Appendable {

        /* renamed from: a */
        public final Appendable f3017a;

        /* renamed from: b */
        public boolean f3018b = true;

        public C5422a(Appendable appendable) {
            this.f3017a = appendable;
        }

        /* renamed from: a */
        public final CharSequence m2939a(CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c10) throws IOException {
            if (this.f3018b) {
                this.f3018b = false;
                this.f3017a.append("  ");
            }
            this.f3018b = c10 == '\n';
            this.f3017a.append(c10);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) {
            CharSequence charSequenceM2939a = m2939a(charSequence);
            return append(charSequenceM2939a, 0, charSequenceM2939a.length());
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i10, int i11) throws IOException {
            CharSequence charSequenceM2939a = m2939a(charSequence);
            boolean z10 = false;
            if (this.f3018b) {
                this.f3018b = false;
                this.f3017a.append("  ");
            }
            if (charSequenceM2939a.length() > 0 && charSequenceM2939a.charAt(i11 - 1) == '\n') {
                z10 = true;
            }
            this.f3018b = z10;
            this.f3017a.append(charSequenceM2939a, i10, i11);
            return this;
        }
    }
}
