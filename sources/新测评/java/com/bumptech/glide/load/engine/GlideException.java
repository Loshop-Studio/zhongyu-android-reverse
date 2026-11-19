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
import p162m0.InterfaceC8537b;

/* loaded from: classes3.dex */
public final class GlideException extends Exception {

    /* renamed from: g */
    public static final StackTraceElement[] f3577g = new StackTraceElement[0];

    /* renamed from: a */
    public final List f3578a;

    /* renamed from: b */
    public InterfaceC8537b f3579b;

    /* renamed from: c */
    public DataSource f3580c;

    /* renamed from: d */
    public Class f3581d;

    /* renamed from: e */
    public String f3582e;

    /* renamed from: f */
    public Exception f3583f;

    public GlideException(String str) {
        this(str, Collections.EMPTY_LIST);
    }

    /* renamed from: f */
    public static void m3482f(List list, Appendable appendable) {
        try {
            m3483j(list, appendable);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: j */
    public static void m3483j(List list, Appendable appendable) throws IOException {
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            appendable.append("Cause (").append(String.valueOf(i11)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = (Throwable) list.get(i10);
            if (th instanceof GlideException) {
                ((GlideException) th).m3489r(appendable);
            } else {
                m3484k(th, appendable);
            }
            i10 = i11;
        }
    }

    /* renamed from: k */
    public static void m3484k(Throwable th, Appendable appendable) throws IOException {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: a */
    public final void m3485a(Throwable th, List list) {
        if (!(th instanceof GlideException)) {
            list.add(th);
            return;
        }
        Iterator it = ((GlideException) th).m3486m().iterator();
        while (it.hasNext()) {
            m3485a((Throwable) it.next(), list);
        }
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f3582e);
        sb.append(this.f3581d != null ? ", " + this.f3581d : "");
        sb.append(this.f3580c != null ? ", " + this.f3580c : "");
        sb.append(this.f3579b != null ? ", " + this.f3579b : "");
        List<Throwable> listM3487o = m3487o();
        if (listM3487o.isEmpty()) {
            return sb.toString();
        }
        if (listM3487o.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(listM3487o.size());
            sb.append(" root causes:");
        }
        for (Throwable th : listM3487o) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    /* renamed from: m */
    public List m3486m() {
        return this.f3578a;
    }

    /* renamed from: o */
    public List m3487o() {
        ArrayList arrayList = new ArrayList();
        m3485a(this, arrayList);
        return arrayList;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() throws IOException {
        printStackTrace(System.err);
    }

    /* renamed from: q */
    public void m3488q(String str) {
        List listM3487o = m3487o();
        int size = listM3487o.size();
        int i10 = 0;
        while (i10 < size) {
            StringBuilder sb = new StringBuilder();
            sb.append("Root cause (");
            int i11 = i10 + 1;
            sb.append(i11);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i(str, sb.toString(), (Throwable) listM3487o.get(i10));
            i10 = i11;
        }
    }

    /* renamed from: r */
    public final void m3489r(Appendable appendable) throws IOException {
        m3484k(this, appendable);
        m3482f(m3486m(), new C5373a(appendable));
    }

    /* renamed from: s */
    public void m3490s(InterfaceC8537b interfaceC8537b, DataSource dataSource) {
        m3491t(interfaceC8537b, dataSource, null);
    }

    /* renamed from: t */
    public void m3491t(InterfaceC8537b interfaceC8537b, DataSource dataSource, Class cls) {
        this.f3579b = interfaceC8537b;
        this.f3580c = dataSource;
        this.f3581d = cls;
    }

    /* renamed from: u */
    public void m3492u(Exception exc) {
        this.f3583f = exc;
    }

    public GlideException(String str, Throwable th) {
        this(str, Collections.singletonList(th));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) throws IOException {
        m3489r(printStream);
    }

    public GlideException(String str, List list) {
        this.f3582e = str;
        setStackTrace(f3577g);
        this.f3578a = list;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) throws IOException {
        m3489r(printWriter);
    }

    /* renamed from: com.bumptech.glide.load.engine.GlideException$a */
    public static final class C5373a implements Appendable {

        /* renamed from: a */
        public final Appendable f3584a;

        /* renamed from: b */
        public boolean f3585b = true;

        public C5373a(Appendable appendable) {
            this.f3584a = appendable;
        }

        /* renamed from: a */
        public final CharSequence m3493a(CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c10) throws IOException {
            if (this.f3585b) {
                this.f3585b = false;
                this.f3584a.append("  ");
            }
            this.f3585b = c10 == '\n';
            this.f3584a.append(c10);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) {
            CharSequence charSequenceM3493a = m3493a(charSequence);
            return append(charSequenceM3493a, 0, charSequenceM3493a.length());
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i10, int i11) throws IOException {
            CharSequence charSequenceM3493a = m3493a(charSequence);
            boolean z9 = false;
            if (this.f3585b) {
                this.f3585b = false;
                this.f3584a.append("  ");
            }
            if (charSequenceM3493a.length() > 0 && charSequenceM3493a.charAt(i11 - 1) == '\n') {
                z9 = true;
            }
            this.f3585b = z9;
            this.f3584a.append(charSequenceM3493a, i10, i11);
            return this;
        }
    }
}
