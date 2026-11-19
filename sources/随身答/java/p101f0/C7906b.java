package p101f0;

import android.os.Build;
import android.os.StrictMode;
import com.efs.sdk.base.protocol.file.section.AbsSection;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: f0.b */
/* loaded from: classes3.dex */
public final class C7906b implements Closeable {

    /* renamed from: a */
    public final File f13281a;

    /* renamed from: b */
    public final File f13282b;

    /* renamed from: c */
    public final File f13283c;

    /* renamed from: d */
    public final File f13284d;

    /* renamed from: e */
    public final int f13285e;

    /* renamed from: f */
    public long f13286f;

    /* renamed from: g */
    public final int f13287g;

    /* renamed from: i */
    public Writer f13289i;

    /* renamed from: k */
    public int f13291k;

    /* renamed from: h */
    public long f13288h = 0;

    /* renamed from: j */
    public final LinkedHashMap f13290j = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: l */
    public long f13292l = 0;

    /* renamed from: m */
    public final ThreadPoolExecutor f13293m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(null));

    /* renamed from: n */
    public final Callable f13294n = new a();

    /* renamed from: f0.b$a */
    public class a implements Callable {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (C7906b.this) {
                try {
                    if (C7906b.this.f13289i == null) {
                        return null;
                    }
                    C7906b.this.m12396D();
                    if (C7906b.this.m12403v()) {
                        C7906b.this.m12394A();
                        C7906b.this.f13291k = 0;
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: f0.b$b */
    public static final class b implements ThreadFactory {
        public b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    /* renamed from: f0.b$c */
    public final class c {

        /* renamed from: a */
        public final d f13296a;

        /* renamed from: b */
        public final boolean[] f13297b;

        /* renamed from: c */
        public boolean f13298c;

        public /* synthetic */ c(C7906b c7906b, d dVar, a aVar) {
            this(dVar);
        }

        /* renamed from: a */
        public void m12410a() {
            C7906b.this.m12398o(this, false);
        }

        /* renamed from: b */
        public void m12411b() {
            if (this.f13298c) {
                return;
            }
            try {
                m12410a();
            } catch (IOException unused) {
            }
        }

        /* renamed from: e */
        public void m12412e() {
            C7906b.this.m12398o(this, true);
            this.f13298c = true;
        }

        /* renamed from: f */
        public File m12413f(int i9) {
            File fileM12424k;
            synchronized (C7906b.this) {
                try {
                    if (this.f13296a.f13305f != this) {
                        throw new IllegalStateException();
                    }
                    if (!this.f13296a.f13304e) {
                        this.f13297b[i9] = true;
                    }
                    fileM12424k = this.f13296a.m12424k(i9);
                    if (!C7906b.this.f13281a.exists()) {
                        C7906b.this.f13281a.mkdirs();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return fileM12424k;
        }

        public c(d dVar) {
            this.f13296a = dVar;
            this.f13297b = dVar.f13304e ? null : new boolean[C7906b.this.f13287g];
        }
    }

    /* renamed from: f0.b$d */
    public final class d {

        /* renamed from: a */
        public final String f13300a;

        /* renamed from: b */
        public final long[] f13301b;

        /* renamed from: c */
        public File[] f13302c;

        /* renamed from: d */
        public File[] f13303d;

        /* renamed from: e */
        public boolean f13304e;

        /* renamed from: f */
        public c f13305f;

        /* renamed from: g */
        public long f13306g;

        public /* synthetic */ d(C7906b c7906b, String str, a aVar) {
            this(str);
        }

        /* renamed from: j */
        public File m12423j(int i9) {
            return this.f13302c[i9];
        }

        /* renamed from: k */
        public File m12424k(int i9) {
            return this.f13303d[i9];
        }

        /* renamed from: l */
        public String m12425l() {
            StringBuilder sb = new StringBuilder();
            for (long j9 : this.f13301b) {
                sb.append(' ');
                sb.append(j9);
            }
            return sb.toString();
        }

        /* renamed from: m */
        public final IOException m12426m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* renamed from: n */
        public final void m12427n(String[] strArr) throws IOException {
            if (strArr.length != C7906b.this.f13287g) {
                throw m12426m(strArr);
            }
            for (int i9 = 0; i9 < strArr.length; i9++) {
                try {
                    this.f13301b[i9] = Long.parseLong(strArr[i9]);
                } catch (NumberFormatException unused) {
                    throw m12426m(strArr);
                }
            }
        }

        public d(String str) {
            this.f13300a = str;
            this.f13301b = new long[C7906b.this.f13287g];
            this.f13302c = new File[C7906b.this.f13287g];
            this.f13303d = new File[C7906b.this.f13287g];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i9 = 0; i9 < C7906b.this.f13287g; i9++) {
                sb.append(i9);
                this.f13302c[i9] = new File(C7906b.this.f13281a, sb.toString());
                sb.append(".tmp");
                this.f13303d[i9] = new File(C7906b.this.f13281a, sb.toString());
                sb.setLength(length);
            }
        }
    }

    /* renamed from: f0.b$e */
    public final class e {

        /* renamed from: a */
        public final String f13308a;

        /* renamed from: b */
        public final long f13309b;

        /* renamed from: c */
        public final long[] f13310c;

        /* renamed from: d */
        public final File[] f13311d;

        public /* synthetic */ e(C7906b c7906b, String str, long j9, File[] fileArr, long[] jArr, a aVar) {
            this(str, j9, fileArr, jArr);
        }

        /* renamed from: a */
        public File m12428a(int i9) {
            return this.f13311d[i9];
        }

        public e(String str, long j9, File[] fileArr, long[] jArr) {
            this.f13308a = str;
            this.f13309b = j9;
            this.f13311d = fileArr;
            this.f13310c = jArr;
        }
    }

    public C7906b(File file, int i9, int i10, long j9) {
        this.f13281a = file;
        this.f13285e = i9;
        this.f13282b = new File(file, "journal");
        this.f13283c = new File(file, "journal.tmp");
        this.f13284d = new File(file, "journal.bkp");
        this.f13287g = i10;
        this.f13286f = j9;
    }

    /* renamed from: C */
    public static void m12381C(File file, File file2, boolean z9) throws IOException {
        if (z9) {
            m12391q(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* renamed from: n */
    public static void m12390n(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: q */
    public static void m12391q(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: t */
    public static void m12392t(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: w */
    public static C7906b m12393w(File file, int i9, int i10, long j9) throws IOException {
        if (j9 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i10 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                m12381C(file2, file3, false);
            }
        }
        C7906b c7906b = new C7906b(file, i9, i10, j9);
        if (c7906b.f13282b.exists()) {
            try {
                c7906b.m12405y();
                c7906b.m12404x();
                return c7906b;
            } catch (IOException e10) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                c7906b.m12399p();
            }
        }
        file.mkdirs();
        C7906b c7906b2 = new C7906b(file, i9, i10, j9);
        c7906b2.m12394A();
        return c7906b2;
    }

    /* renamed from: A */
    public final synchronized void m12394A() {
        try {
            Writer writer = this.f13289i;
            if (writer != null) {
                m12390n(writer);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f13283c), AbstractC7908d.f13319a));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write(AbsSection.SEP_ORIGIN_LINE_BREAK);
                bufferedWriter.write("1");
                bufferedWriter.write(AbsSection.SEP_ORIGIN_LINE_BREAK);
                bufferedWriter.write(Integer.toString(this.f13285e));
                bufferedWriter.write(AbsSection.SEP_ORIGIN_LINE_BREAK);
                bufferedWriter.write(Integer.toString(this.f13287g));
                bufferedWriter.write(AbsSection.SEP_ORIGIN_LINE_BREAK);
                bufferedWriter.write(AbsSection.SEP_ORIGIN_LINE_BREAK);
                for (d dVar : this.f13290j.values()) {
                    if (dVar.f13305f != null) {
                        bufferedWriter.write("DIRTY " + dVar.f13300a + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + dVar.f13300a + dVar.m12425l() + '\n');
                    }
                }
                m12390n(bufferedWriter);
                if (this.f13282b.exists()) {
                    m12381C(this.f13282b, this.f13284d, true);
                }
                m12381C(this.f13283c, this.f13282b, false);
                this.f13284d.delete();
                this.f13289i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f13282b, true), AbstractC7908d.f13319a));
            } catch (Throwable th) {
                m12390n(bufferedWriter);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: B */
    public synchronized boolean m12395B(String str) {
        try {
            m12397m();
            d dVar = (d) this.f13290j.get(str);
            if (dVar != null && dVar.f13305f == null) {
                for (int i9 = 0; i9 < this.f13287g; i9++) {
                    File fileM12423j = dVar.m12423j(i9);
                    if (fileM12423j.exists() && !fileM12423j.delete()) {
                        throw new IOException("failed to delete " + fileM12423j);
                    }
                    this.f13288h -= dVar.f13301b[i9];
                    dVar.f13301b[i9] = 0;
                }
                this.f13291k++;
                this.f13289i.append((CharSequence) "REMOVE");
                this.f13289i.append(' ');
                this.f13289i.append((CharSequence) str);
                this.f13289i.append('\n');
                this.f13290j.remove(str);
                if (m12403v()) {
                    this.f13293m.submit(this.f13294n);
                }
                return true;
            }
            return false;
        } finally {
        }
    }

    /* renamed from: D */
    public final void m12396D() {
        while (this.f13288h > this.f13286f) {
            m12395B((String) ((Map.Entry) this.f13290j.entrySet().iterator().next()).getKey());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (this.f13289i == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f13290j.values());
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                d dVar = (d) obj;
                if (dVar.f13305f != null) {
                    dVar.f13305f.m12410a();
                }
            }
            m12396D();
            m12390n(this.f13289i);
            this.f13289i = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: m */
    public final void m12397m() {
        if (this.f13289i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: o */
    public final synchronized void m12398o(c cVar, boolean z9) {
        d dVar = cVar.f13296a;
        if (dVar.f13305f != cVar) {
            throw new IllegalStateException();
        }
        if (z9 && !dVar.f13304e) {
            for (int i9 = 0; i9 < this.f13287g; i9++) {
                if (!cVar.f13297b[i9]) {
                    cVar.m12410a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i9);
                }
                if (!dVar.m12424k(i9).exists()) {
                    cVar.m12410a();
                    return;
                }
            }
        }
        for (int i10 = 0; i10 < this.f13287g; i10++) {
            File fileM12424k = dVar.m12424k(i10);
            if (!z9) {
                m12391q(fileM12424k);
            } else if (fileM12424k.exists()) {
                File fileM12423j = dVar.m12423j(i10);
                fileM12424k.renameTo(fileM12423j);
                long j9 = dVar.f13301b[i10];
                long length = fileM12423j.length();
                dVar.f13301b[i10] = length;
                this.f13288h = (this.f13288h - j9) + length;
            }
        }
        this.f13291k++;
        dVar.f13305f = null;
        if (dVar.f13304e || z9) {
            dVar.f13304e = true;
            this.f13289i.append((CharSequence) "CLEAN");
            this.f13289i.append(' ');
            this.f13289i.append((CharSequence) dVar.f13300a);
            this.f13289i.append((CharSequence) dVar.m12425l());
            this.f13289i.append('\n');
            if (z9) {
                long j10 = this.f13292l;
                this.f13292l = 1 + j10;
                dVar.f13306g = j10;
            }
        } else {
            this.f13290j.remove(dVar.f13300a);
            this.f13289i.append((CharSequence) "REMOVE");
            this.f13289i.append(' ');
            this.f13289i.append((CharSequence) dVar.f13300a);
            this.f13289i.append('\n');
        }
        m12392t(this.f13289i);
        if (this.f13288h > this.f13286f || m12403v()) {
            this.f13293m.submit(this.f13294n);
        }
    }

    /* renamed from: p */
    public void m12399p() throws IOException {
        close();
        AbstractC7908d.m12434b(this.f13281a);
    }

    /* renamed from: r */
    public c m12400r(String str) {
        return m12401s(str, -1L);
    }

    /* renamed from: s */
    public final synchronized c m12401s(String str, long j9) {
        m12397m();
        d dVar = (d) this.f13290j.get(str);
        a aVar = null;
        if (j9 != -1 && (dVar == null || dVar.f13306g != j9)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, aVar);
            this.f13290j.put(str, dVar);
        } else if (dVar.f13305f != null) {
            return null;
        }
        c cVar = new c(this, dVar, aVar);
        dVar.f13305f = cVar;
        this.f13289i.append((CharSequence) "DIRTY");
        this.f13289i.append(' ');
        this.f13289i.append((CharSequence) str);
        this.f13289i.append('\n');
        m12392t(this.f13289i);
        return cVar;
    }

    /* renamed from: u */
    public synchronized e m12402u(String str) {
        Throwable th;
        try {
            try {
                m12397m();
                d dVar = (d) this.f13290j.get(str);
                if (dVar == null) {
                    return null;
                }
                if (!dVar.f13304e) {
                    return null;
                }
                for (File file : dVar.f13302c) {
                    try {
                        if (!file.exists()) {
                            return null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                this.f13291k++;
                this.f13289i.append((CharSequence) "READ");
                this.f13289i.append(' ');
                this.f13289i.append((CharSequence) str);
                this.f13289i.append('\n');
                if (m12403v()) {
                    this.f13293m.submit(this.f13294n);
                }
                return new e(this, str, dVar.f13306g, dVar.f13302c, dVar.f13301b, null);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    /* renamed from: v */
    public final boolean m12403v() {
        int i9 = this.f13291k;
        return i9 >= 2000 && i9 >= this.f13290j.size();
    }

    /* renamed from: x */
    public final void m12404x() throws IOException {
        m12391q(this.f13283c);
        Iterator it = this.f13290j.values().iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            int i9 = 0;
            if (dVar.f13305f == null) {
                while (i9 < this.f13287g) {
                    this.f13288h += dVar.f13301b[i9];
                    i9++;
                }
            } else {
                dVar.f13305f = null;
                while (i9 < this.f13287g) {
                    m12391q(dVar.m12423j(i9));
                    m12391q(dVar.m12424k(i9));
                    i9++;
                }
                it.remove();
            }
        }
    }

    /* renamed from: y */
    public final void m12405y() throws IOException {
        C7907c c7907c = new C7907c(new FileInputStream(this.f13282b), AbstractC7908d.f13319a);
        try {
            String strM12432h = c7907c.m12432h();
            String strM12432h2 = c7907c.m12432h();
            String strM12432h3 = c7907c.m12432h();
            String strM12432h4 = c7907c.m12432h();
            String strM12432h5 = c7907c.m12432h();
            if (!"libcore.io.DiskLruCache".equals(strM12432h) || !"1".equals(strM12432h2) || !Integer.toString(this.f13285e).equals(strM12432h3) || !Integer.toString(this.f13287g).equals(strM12432h4) || !"".equals(strM12432h5)) {
                throw new IOException("unexpected journal header: [" + strM12432h + ", " + strM12432h2 + ", " + strM12432h4 + ", " + strM12432h5 + "]");
            }
            int i9 = 0;
            while (true) {
                try {
                    m12406z(c7907c.m12432h());
                    i9++;
                } catch (EOFException unused) {
                    this.f13291k = i9 - this.f13290j.size();
                    if (c7907c.m12431g()) {
                        m12394A();
                    } else {
                        this.f13289i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f13282b, true), AbstractC7908d.f13319a));
                    }
                    AbstractC7908d.m12433a(c7907c);
                    return;
                }
            }
        } catch (Throwable th) {
            AbstractC7908d.m12433a(c7907c);
            throw th;
        }
    }

    /* renamed from: z */
    public final void m12406z(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i9 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i9);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i9);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.f13290j.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i9, iIndexOf2);
        }
        d dVar = (d) this.f13290j.get(strSubstring);
        a aVar = null;
        if (dVar == null) {
            dVar = new d(this, strSubstring, aVar);
            this.f13290j.put(strSubstring, dVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            dVar.f13304e = true;
            dVar.f13305f = null;
            dVar.m12427n(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            dVar.f13305f = new c(this, dVar, aVar);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }
}
