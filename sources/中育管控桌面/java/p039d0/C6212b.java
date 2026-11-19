package p039d0;

import android.os.Build;
import android.os.StrictMode;
import com.alibaba.sdk.android.oss.signer.SignParameters;
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

/* renamed from: d0.b */
/* loaded from: classes3.dex */
public final class C6212b implements Closeable {

    /* renamed from: a */
    public final File f7463a;

    /* renamed from: b */
    public final File f7464b;

    /* renamed from: c */
    public final File f7465c;

    /* renamed from: d */
    public final File f7466d;

    /* renamed from: e */
    public final int f7467e;

    /* renamed from: f */
    public long f7468f;

    /* renamed from: g */
    public final int f7469g;

    /* renamed from: i */
    public Writer f7471i;

    /* renamed from: k */
    public int f7473k;

    /* renamed from: h */
    public long f7470h = 0;

    /* renamed from: j */
    public final LinkedHashMap f7472j = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: l */
    public long f7474l = 0;

    /* renamed from: m */
    public final ThreadPoolExecutor f7475m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(null));

    /* renamed from: n */
    public final Callable f7476n = new a();

    /* renamed from: d0.b$a */
    public class a implements Callable {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (C6212b.this) {
                try {
                    if (C6212b.this.f7471i == null) {
                        return null;
                    }
                    C6212b.this.m6280D();
                    if (C6212b.this.m6287v()) {
                        C6212b.this.m6278A();
                        C6212b.this.f7473k = 0;
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: d0.b$b */
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

    /* renamed from: d0.b$c */
    public final class c {

        /* renamed from: a */
        public final d f7478a;

        /* renamed from: b */
        public final boolean[] f7479b;

        /* renamed from: c */
        public boolean f7480c;

        public /* synthetic */ c(C6212b c6212b, d dVar, a aVar) {
            this(dVar);
        }

        /* renamed from: a */
        public void m6294a() {
            C6212b.this.m6282o(this, false);
        }

        /* renamed from: b */
        public void m6295b() {
            if (this.f7480c) {
                return;
            }
            try {
                m6294a();
            } catch (IOException unused) {
            }
        }

        /* renamed from: e */
        public void m6296e() {
            C6212b.this.m6282o(this, true);
            this.f7480c = true;
        }

        /* renamed from: f */
        public File m6297f(int i6) {
            File fileM6308k;
            synchronized (C6212b.this) {
                try {
                    if (this.f7478a.f7487f != this) {
                        throw new IllegalStateException();
                    }
                    if (!this.f7478a.f7486e) {
                        this.f7479b[i6] = true;
                    }
                    fileM6308k = this.f7478a.m6308k(i6);
                    C6212b.this.f7463a.mkdirs();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return fileM6308k;
        }

        public c(d dVar) {
            this.f7478a = dVar;
            this.f7479b = dVar.f7486e ? null : new boolean[C6212b.this.f7469g];
        }
    }

    /* renamed from: d0.b$d */
    public final class d {

        /* renamed from: a */
        public final String f7482a;

        /* renamed from: b */
        public final long[] f7483b;

        /* renamed from: c */
        public File[] f7484c;

        /* renamed from: d */
        public File[] f7485d;

        /* renamed from: e */
        public boolean f7486e;

        /* renamed from: f */
        public c f7487f;

        /* renamed from: g */
        public long f7488g;

        public /* synthetic */ d(C6212b c6212b, String str, a aVar) {
            this(str);
        }

        /* renamed from: j */
        public File m6307j(int i6) {
            return this.f7484c[i6];
        }

        /* renamed from: k */
        public File m6308k(int i6) {
            return this.f7485d[i6];
        }

        /* renamed from: l */
        public String m6309l() {
            StringBuilder sb = new StringBuilder();
            for (long j6 : this.f7483b) {
                sb.append(' ');
                sb.append(j6);
            }
            return sb.toString();
        }

        /* renamed from: m */
        public final IOException m6310m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* renamed from: n */
        public final void m6311n(String[] strArr) throws IOException {
            if (strArr.length != C6212b.this.f7469g) {
                throw m6310m(strArr);
            }
            for (int i6 = 0; i6 < strArr.length; i6++) {
                try {
                    this.f7483b[i6] = Long.parseLong(strArr[i6]);
                } catch (NumberFormatException unused) {
                    throw m6310m(strArr);
                }
            }
        }

        public d(String str) {
            this.f7482a = str;
            this.f7483b = new long[C6212b.this.f7469g];
            this.f7484c = new File[C6212b.this.f7469g];
            this.f7485d = new File[C6212b.this.f7469g];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i6 = 0; i6 < C6212b.this.f7469g; i6++) {
                sb.append(i6);
                this.f7484c[i6] = new File(C6212b.this.f7463a, sb.toString());
                sb.append(".tmp");
                this.f7485d[i6] = new File(C6212b.this.f7463a, sb.toString());
                sb.setLength(length);
            }
        }
    }

    /* renamed from: d0.b$e */
    public final class e {

        /* renamed from: a */
        public final String f7490a;

        /* renamed from: b */
        public final long f7491b;

        /* renamed from: c */
        public final long[] f7492c;

        /* renamed from: d */
        public final File[] f7493d;

        public /* synthetic */ e(C6212b c6212b, String str, long j6, File[] fileArr, long[] jArr, a aVar) {
            this(str, j6, fileArr, jArr);
        }

        /* renamed from: a */
        public File m6312a(int i6) {
            return this.f7493d[i6];
        }

        public e(String str, long j6, File[] fileArr, long[] jArr) {
            this.f7490a = str;
            this.f7491b = j6;
            this.f7493d = fileArr;
            this.f7492c = jArr;
        }
    }

    public C6212b(File file, int i6, int i7, long j6) {
        this.f7463a = file;
        this.f7467e = i6;
        this.f7464b = new File(file, "journal");
        this.f7465c = new File(file, "journal.tmp");
        this.f7466d = new File(file, "journal.bkp");
        this.f7469g = i7;
        this.f7468f = j6;
    }

    /* renamed from: C */
    public static void m6265C(File file, File file2, boolean z6) throws IOException {
        if (z6) {
            m6275q(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* renamed from: n */
    public static void m6274n(Writer writer) throws IOException {
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
    public static void m6275q(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: t */
    public static void m6276t(Writer writer) throws IOException {
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
    public static C6212b m6277w(File file, int i6, int i7, long j6) throws IOException {
        if (j6 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i7 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                m6265C(file2, file3, false);
            }
        }
        C6212b c6212b = new C6212b(file, i6, i7, j6);
        if (c6212b.f7464b.exists()) {
            try {
                c6212b.m6289y();
                c6212b.m6288x();
                return c6212b;
            } catch (IOException e6) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e6.getMessage() + ", removing");
                c6212b.m6283p();
            }
        }
        file.mkdirs();
        C6212b c6212b2 = new C6212b(file, i6, i7, j6);
        c6212b2.m6278A();
        return c6212b2;
    }

    /* renamed from: A */
    public final synchronized void m6278A() {
        try {
            Writer writer = this.f7471i;
            if (writer != null) {
                m6274n(writer);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f7465c), AbstractC6214d.f7501a));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write(SignParameters.NEW_LINE);
                bufferedWriter.write("1");
                bufferedWriter.write(SignParameters.NEW_LINE);
                bufferedWriter.write(Integer.toString(this.f7467e));
                bufferedWriter.write(SignParameters.NEW_LINE);
                bufferedWriter.write(Integer.toString(this.f7469g));
                bufferedWriter.write(SignParameters.NEW_LINE);
                bufferedWriter.write(SignParameters.NEW_LINE);
                for (d dVar : this.f7472j.values()) {
                    if (dVar.f7487f != null) {
                        bufferedWriter.write("DIRTY " + dVar.f7482a + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + dVar.f7482a + dVar.m6309l() + '\n');
                    }
                }
                m6274n(bufferedWriter);
                if (this.f7464b.exists()) {
                    m6265C(this.f7464b, this.f7466d, true);
                }
                m6265C(this.f7465c, this.f7464b, false);
                this.f7466d.delete();
                this.f7471i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f7464b, true), AbstractC6214d.f7501a));
            } catch (Throwable th) {
                m6274n(bufferedWriter);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: B */
    public synchronized boolean m6279B(String str) {
        try {
            m6281m();
            d dVar = (d) this.f7472j.get(str);
            if (dVar != null && dVar.f7487f == null) {
                for (int i6 = 0; i6 < this.f7469g; i6++) {
                    File fileM6307j = dVar.m6307j(i6);
                    if (fileM6307j.exists() && !fileM6307j.delete()) {
                        throw new IOException("failed to delete " + fileM6307j);
                    }
                    this.f7470h -= dVar.f7483b[i6];
                    dVar.f7483b[i6] = 0;
                }
                this.f7473k++;
                this.f7471i.append((CharSequence) "REMOVE");
                this.f7471i.append(' ');
                this.f7471i.append((CharSequence) str);
                this.f7471i.append('\n');
                this.f7472j.remove(str);
                if (m6287v()) {
                    this.f7475m.submit(this.f7476n);
                }
                return true;
            }
            return false;
        } finally {
        }
    }

    /* renamed from: D */
    public final void m6280D() {
        while (this.f7470h > this.f7468f) {
            m6279B((String) ((Map.Entry) this.f7472j.entrySet().iterator().next()).getKey());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (this.f7471i == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f7472j.values());
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList.get(i6);
                i6++;
                d dVar = (d) obj;
                if (dVar.f7487f != null) {
                    dVar.f7487f.m6294a();
                }
            }
            m6280D();
            m6274n(this.f7471i);
            this.f7471i = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: m */
    public final void m6281m() {
        if (this.f7471i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: o */
    public final synchronized void m6282o(c cVar, boolean z6) {
        d dVar = cVar.f7478a;
        if (dVar.f7487f != cVar) {
            throw new IllegalStateException();
        }
        if (z6 && !dVar.f7486e) {
            for (int i6 = 0; i6 < this.f7469g; i6++) {
                if (!cVar.f7479b[i6]) {
                    cVar.m6294a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i6);
                }
                if (!dVar.m6308k(i6).exists()) {
                    cVar.m6294a();
                    return;
                }
            }
        }
        for (int i7 = 0; i7 < this.f7469g; i7++) {
            File fileM6308k = dVar.m6308k(i7);
            if (!z6) {
                m6275q(fileM6308k);
            } else if (fileM6308k.exists()) {
                File fileM6307j = dVar.m6307j(i7);
                fileM6308k.renameTo(fileM6307j);
                long j6 = dVar.f7483b[i7];
                long length = fileM6307j.length();
                dVar.f7483b[i7] = length;
                this.f7470h = (this.f7470h - j6) + length;
            }
        }
        this.f7473k++;
        dVar.f7487f = null;
        if (dVar.f7486e || z6) {
            dVar.f7486e = true;
            this.f7471i.append((CharSequence) "CLEAN");
            this.f7471i.append(' ');
            this.f7471i.append((CharSequence) dVar.f7482a);
            this.f7471i.append((CharSequence) dVar.m6309l());
            this.f7471i.append('\n');
            if (z6) {
                long j7 = this.f7474l;
                this.f7474l = 1 + j7;
                dVar.f7488g = j7;
            }
        } else {
            this.f7472j.remove(dVar.f7482a);
            this.f7471i.append((CharSequence) "REMOVE");
            this.f7471i.append(' ');
            this.f7471i.append((CharSequence) dVar.f7482a);
            this.f7471i.append('\n');
        }
        m6276t(this.f7471i);
        if (this.f7470h > this.f7468f || m6287v()) {
            this.f7475m.submit(this.f7476n);
        }
    }

    /* renamed from: p */
    public void m6283p() throws IOException {
        close();
        AbstractC6214d.m6318b(this.f7463a);
    }

    /* renamed from: r */
    public c m6284r(String str) {
        return m6285s(str, -1L);
    }

    /* renamed from: s */
    public final synchronized c m6285s(String str, long j6) {
        m6281m();
        d dVar = (d) this.f7472j.get(str);
        a aVar = null;
        if (j6 != -1 && (dVar == null || dVar.f7488g != j6)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, aVar);
            this.f7472j.put(str, dVar);
        } else if (dVar.f7487f != null) {
            return null;
        }
        c cVar = new c(this, dVar, aVar);
        dVar.f7487f = cVar;
        this.f7471i.append((CharSequence) "DIRTY");
        this.f7471i.append(' ');
        this.f7471i.append((CharSequence) str);
        this.f7471i.append('\n');
        m6276t(this.f7471i);
        return cVar;
    }

    /* renamed from: u */
    public synchronized e m6286u(String str) {
        Throwable th;
        try {
            try {
                m6281m();
                d dVar = (d) this.f7472j.get(str);
                if (dVar == null) {
                    return null;
                }
                if (!dVar.f7486e) {
                    return null;
                }
                for (File file : dVar.f7484c) {
                    try {
                        if (!file.exists()) {
                            return null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                this.f7473k++;
                this.f7471i.append((CharSequence) "READ");
                this.f7471i.append(' ');
                this.f7471i.append((CharSequence) str);
                this.f7471i.append('\n');
                if (m6287v()) {
                    this.f7475m.submit(this.f7476n);
                }
                return new e(this, str, dVar.f7488g, dVar.f7484c, dVar.f7483b, null);
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
    public final boolean m6287v() {
        int i6 = this.f7473k;
        return i6 >= 2000 && i6 >= this.f7472j.size();
    }

    /* renamed from: x */
    public final void m6288x() throws IOException {
        m6275q(this.f7465c);
        Iterator it = this.f7472j.values().iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            int i6 = 0;
            if (dVar.f7487f == null) {
                while (i6 < this.f7469g) {
                    this.f7470h += dVar.f7483b[i6];
                    i6++;
                }
            } else {
                dVar.f7487f = null;
                while (i6 < this.f7469g) {
                    m6275q(dVar.m6307j(i6));
                    m6275q(dVar.m6308k(i6));
                    i6++;
                }
                it.remove();
            }
        }
    }

    /* renamed from: y */
    public final void m6289y() throws IOException {
        C6213c c6213c = new C6213c(new FileInputStream(this.f7464b), AbstractC6214d.f7501a);
        try {
            String strM6316h = c6213c.m6316h();
            String strM6316h2 = c6213c.m6316h();
            String strM6316h3 = c6213c.m6316h();
            String strM6316h4 = c6213c.m6316h();
            String strM6316h5 = c6213c.m6316h();
            if (!"libcore.io.DiskLruCache".equals(strM6316h) || !"1".equals(strM6316h2) || !Integer.toString(this.f7467e).equals(strM6316h3) || !Integer.toString(this.f7469g).equals(strM6316h4) || !"".equals(strM6316h5)) {
                throw new IOException("unexpected journal header: [" + strM6316h + ", " + strM6316h2 + ", " + strM6316h4 + ", " + strM6316h5 + "]");
            }
            int i6 = 0;
            while (true) {
                try {
                    m6290z(c6213c.m6316h());
                    i6++;
                } catch (EOFException unused) {
                    this.f7473k = i6 - this.f7472j.size();
                    if (c6213c.m6315g()) {
                        m6278A();
                    } else {
                        this.f7471i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f7464b, true), AbstractC6214d.f7501a));
                    }
                    AbstractC6214d.m6317a(c6213c);
                    return;
                }
            }
        } catch (Throwable th) {
            AbstractC6214d.m6317a(c6213c);
            throw th;
        }
    }

    /* renamed from: z */
    public final void m6290z(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i6 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i6);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i6);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.f7472j.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i6, iIndexOf2);
        }
        d dVar = (d) this.f7472j.get(strSubstring);
        a aVar = null;
        if (dVar == null) {
            dVar = new d(this, strSubstring, aVar);
            this.f7472j.put(strSubstring, dVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            dVar.f7486e = true;
            dVar.f7487f = null;
            dVar.m6311n(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            dVar.f7487f = new c(this, dVar, aVar);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }
}
