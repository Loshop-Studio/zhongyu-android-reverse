package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p016b0.C3062b0;
import p202y.InterfaceC6760c;

/* loaded from: classes2.dex */
public final class GlideException extends Exception {

    /* renamed from: a */
    public static final StackTraceElement[] f2256a = new StackTraceElement[0];
    private static final long serialVersionUID = 1;
    private final List<Throwable> causes;
    private Class<?> dataClass;
    private DataSource dataSource;
    private String detailMessage;

    @Nullable
    private Exception exception;
    private InterfaceC6760c key;

    public GlideException(String str) {
        this(str, (List<Throwable>) Collections.EMPTY_LIST);
    }

    /* renamed from: a */
    public static void m2390a(Throwable th, ArrayList arrayList) {
        if (!(th instanceof GlideException)) {
            arrayList.add(th);
            return;
        }
        Iterator<Throwable> it = ((GlideException) th).getCauses().iterator();
        while (it.hasNext()) {
            m2390a(it.next(), arrayList);
        }
    }

    /* renamed from: b */
    public static void m2391b(List list, C3062b0 c3062b0) {
        try {
            m2392c(list, c3062b0);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public static void m2392c(List list, C3062b0 c3062b0) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            c3062b0.append("Cause (");
            int i8 = i + 1;
            c3062b0.append(String.valueOf(i8));
            c3062b0.append(" of ");
            c3062b0.append(String.valueOf(size));
            c3062b0.append("): ");
            Throwable th = (Throwable) list.get(i);
            if (th instanceof GlideException) {
                GlideException glideException = (GlideException) th;
                glideException.getClass();
                m2393d(glideException, c3062b0);
                m2391b(glideException.getCauses(), new C3062b0(c3062b0));
            } else {
                m2393d(th, c3062b0);
            }
            i = i8;
        }
    }

    /* renamed from: d */
    public static void m2393d(Throwable th, Appendable appendable) throws IOException {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    public List<Throwable> getCauses() {
        return this.causes;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.detailMessage);
        sb.append(this.dataClass != null ? ", " + this.dataClass : "");
        sb.append(this.dataSource != null ? ", " + this.dataSource : "");
        sb.append(this.key != null ? ", " + this.key : "");
        List<Throwable> rootCauses = getRootCauses();
        if (rootCauses.isEmpty()) {
            return sb.toString();
        }
        if (rootCauses.size() == 1) {
            sb.append("\nThere was 1 cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(rootCauses.size());
            sb.append(" causes:");
        }
        for (Throwable th : rootCauses) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Nullable
    public Exception getOrigin() {
        return this.exception;
    }

    public List<Throwable> getRootCauses() {
        ArrayList arrayList = new ArrayList();
        m2390a(this, arrayList);
        return arrayList;
    }

    public void logRootCauses(String str) {
        List<Throwable> rootCauses = getRootCauses();
        int size = rootCauses.size();
        int i = 0;
        while (i < size) {
            StringBuilder sb = new StringBuilder("Root cause (");
            int i8 = i + 1;
            sb.append(i8);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i(str, sb.toString(), rootCauses.get(i));
            i = i8;
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace() throws IOException {
        printStackTrace(System.err);
    }

    public void setLoggingDetails(InterfaceC6760c interfaceC6760c, DataSource dataSource) {
        setLoggingDetails(interfaceC6760c, dataSource, null);
    }

    public void setOrigin(@Nullable Exception exc) {
        this.exception = exc;
    }

    public GlideException(String str, Throwable th) {
        this(str, (List<Throwable>) Collections.singletonList(th));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) throws IOException {
        m2393d(this, printStream);
        m2391b(getCauses(), new C3062b0(printStream));
    }

    public void setLoggingDetails(InterfaceC6760c interfaceC6760c, DataSource dataSource, Class<?> cls) {
        this.key = interfaceC6760c;
        this.dataSource = dataSource;
        this.dataClass = cls;
    }

    public GlideException(String str, List<Throwable> list) {
        this.detailMessage = str;
        setStackTrace(f2256a);
        this.causes = list;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) throws IOException {
        m2393d(this, printWriter);
        m2391b(getCauses(), new C3062b0(printWriter));
    }
}
