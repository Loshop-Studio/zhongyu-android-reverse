package io.reactivex.exceptions;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes5.dex */
public final class CompositeException extends RuntimeException {

    /* renamed from: a */
    public final List f17028a;

    /* renamed from: b */
    public final String f17029b;

    /* renamed from: c */
    public Throwable f17030c;

    public static final class CompositeExceptionCausalChain extends RuntimeException {
        @Override // java.lang.Throwable
        public String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }
    }

    /* renamed from: io.reactivex.exceptions.CompositeException$a */
    public static abstract class AbstractC8966a {
        /* renamed from: a */
        public abstract void mo15528a(Object obj);
    }

    /* renamed from: io.reactivex.exceptions.CompositeException$b */
    public static final class C8967b extends AbstractC8966a {

        /* renamed from: a */
        public final PrintStream f17031a;

        public C8967b(PrintStream printStream) {
            this.f17031a = printStream;
        }

        @Override // io.reactivex.exceptions.CompositeException.AbstractC8966a
        /* renamed from: a */
        public void mo15528a(Object obj) {
            this.f17031a.println(obj);
        }
    }

    /* renamed from: io.reactivex.exceptions.CompositeException$c */
    public static final class C8968c extends AbstractC8966a {

        /* renamed from: a */
        public final PrintWriter f17032a;

        public C8968c(PrintWriter printWriter) {
            this.f17032a = printWriter;
        }

        @Override // io.reactivex.exceptions.CompositeException.AbstractC8966a
        /* renamed from: a */
        public void mo15528a(Object obj) {
            this.f17032a.println(obj);
        }
    }

    public CompositeException(Throwable... thArr) {
        this(thArr == null ? Collections.singletonList(new NullPointerException("exceptions was null")) : Arrays.asList(thArr));
    }

    /* renamed from: a */
    public final void m15523a(StringBuilder sb, Throwable th, String str) {
        sb.append(str);
        sb.append(th);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            m15523a(sb, th.getCause(), "");
        }
    }

    /* renamed from: b */
    public List m15524b() {
        return this.f17028a;
    }

    /* renamed from: c */
    public final List m15525c(Throwable th) {
        ArrayList arrayList = new ArrayList();
        Throwable cause = th.getCause();
        if (cause != null && cause != th) {
            while (true) {
                arrayList.add(cause);
                Throwable cause2 = cause.getCause();
                if (cause2 == null || cause2 == cause) {
                    break;
                }
                cause = cause2;
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public Throwable m15526d(Throwable th) {
        Throwable cause = th.getCause();
        if (cause == null || this.f17030c == cause) {
            return th;
        }
        while (true) {
            Throwable cause2 = cause.getCause();
            if (cause2 == null || cause2 == cause) {
                break;
            }
            cause = cause2;
        }
        return cause;
    }

    /* renamed from: e */
    public final void m15527e(AbstractC8966a abstractC8966a) {
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        int i10 = 1;
        for (Throwable th : this.f17028a) {
            sb.append("  ComposedException ");
            sb.append(i10);
            sb.append(" :\n");
            m15523a(sb, th, "\t");
            i10++;
        }
        abstractC8966a.mo15528a(sb.toString());
    }

    @Override // java.lang.Throwable
    public synchronized Throwable getCause() {
        try {
            if (this.f17030c == null) {
                CompositeExceptionCausalChain compositeExceptionCausalChain = new CompositeExceptionCausalChain();
                HashSet hashSet = new HashSet();
                Throwable thM15526d = compositeExceptionCausalChain;
                for (Throwable runtimeException : this.f17028a) {
                    if (!hashSet.contains(runtimeException)) {
                        hashSet.add(runtimeException);
                        for (Throwable th : m15525c(runtimeException)) {
                            if (hashSet.contains(th)) {
                                runtimeException = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                            } else {
                                hashSet.add(th);
                            }
                        }
                        try {
                            thM15526d.initCause(runtimeException);
                        } catch (Throwable unused) {
                        }
                        thM15526d = m15526d(thM15526d);
                    }
                }
                this.f17030c = compositeExceptionCausalChain;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f17030c;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f17029b;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        m15527e(new C8967b(printStream));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        m15527e(new C8968c(printWriter));
    }

    public CompositeException(Iterable iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Throwable th = (Throwable) it.next();
                if (th instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th).m15524b());
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            arrayList.addAll(linkedHashSet);
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            this.f17028a = listUnmodifiableList;
            this.f17029b = listUnmodifiableList.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }
}
