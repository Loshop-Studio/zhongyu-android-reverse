package p137j;

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

/* renamed from: j.b */
/* loaded from: classes3.dex */
public final class C8976b implements Closeable {

    /* renamed from: a */
    public final File f17132a;

    /* renamed from: b */
    public final File f17133b;

    /* renamed from: c */
    public final File f17134c;

    /* renamed from: d */
    public final File f17135d;

    /* renamed from: e */
    public final int f17136e;

    /* renamed from: f */
    public long f17137f;

    /* renamed from: g */
    public final int f17138g;

    /* renamed from: i */
    public Writer f17140i;

    /* renamed from: k */
    public int f17142k;

    /* renamed from: h */
    public long f17139h = 0;

    /* renamed from: j */
    public final LinkedHashMap f17141j = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: l */
    public long f17143l = 0;

    /* renamed from: m */
    public final ThreadPoolExecutor f17144m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(null));

    /* renamed from: n */
    public final Callable f17145n = new a();

    /* renamed from: j.b$a */
    public class a implements Callable {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (C8976b.this) {
                try {
                    if (C8976b.this.f17140i == null) {
                        return null;
                    }
                    C8976b.this.m15607z();
                    if (C8976b.this.m15601r()) {
                        C8976b.this.m15605w();
                        C8976b.this.f17142k = 0;
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: j.b$b */
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

    /* renamed from: j.b$c */
    public final class c {

        /* renamed from: a */
        public final d f17147a;

        /* renamed from: b */
        public final boolean[] f17148b;

        /* renamed from: c */
        public boolean f17149c;

        public /* synthetic */ c(C8976b c8976b, d dVar, a aVar) {
            this(dVar);
        }

        /* renamed from: a */
        public void m15611a() {
            C8976b.this.m15596k(this, false);
        }

        /* renamed from: b */
        public void m15612b() {
            if (this.f17149c) {
                return;
            }
            try {
                m15611a();
            } catch (IOException unused) {
            }
        }

        /* renamed from: e */
        public void m15613e() {
            C8976b.this.m15596k(this, true);
            this.f17149c = true;
        }

        /* renamed from: f */
        public File m15614f(int i10) {
            File fileM15625k;
            synchronized (C8976b.this) {
                try {
                    if (this.f17147a.f17156f != this) {
                        throw new IllegalStateException();
                    }
                    if (!this.f17147a.f17155e) {
                        this.f17148b[i10] = true;
                    }
                    fileM15625k = this.f17147a.m15625k(i10);
                    C8976b.this.f17132a.mkdirs();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return fileM15625k;
        }

        public c(d dVar) {
            this.f17147a = dVar;
            this.f17148b = dVar.f17155e ? null : new boolean[C8976b.this.f17138g];
        }
    }

    /* renamed from: j.b$d */
    public final class d {

        /* renamed from: a */
        public final String f17151a;

        /* renamed from: b */
        public final long[] f17152b;

        /* renamed from: c */
        public File[] f17153c;

        /* renamed from: d */
        public File[] f17154d;

        /* renamed from: e */
        public boolean f17155e;

        /* renamed from: f */
        public c f17156f;

        /* renamed from: g */
        public long f17157g;

        public /* synthetic */ d(C8976b c8976b, String str, a aVar) {
            this(str);
        }

        /* renamed from: j */
        public File m15624j(int i10) {
            return this.f17153c[i10];
        }

        /* renamed from: k */
        public File m15625k(int i10) {
            return this.f17154d[i10];
        }

        /* renamed from: l */
        public String m15626l() {
            StringBuilder sb = new StringBuilder();
            for (long j10 : this.f17152b) {
                sb.append(' ');
                sb.append(j10);
            }
            return sb.toString();
        }

        /* renamed from: m */
        public final IOException m15627m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* renamed from: n */
        public final void m15628n(String[] strArr) throws IOException {
            if (strArr.length != C8976b.this.f17138g) {
                throw m15627m(strArr);
            }
            for (int i10 = 0; i10 < strArr.length; i10++) {
                try {
                    this.f17152b[i10] = Long.parseLong(strArr[i10]);
                } catch (NumberFormatException unused) {
                    throw m15627m(strArr);
                }
            }
        }

        public d(String str) {
            this.f17151a = str;
            this.f17152b = new long[C8976b.this.f17138g];
            this.f17153c = new File[C8976b.this.f17138g];
            this.f17154d = new File[C8976b.this.f17138g];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i10 = 0; i10 < C8976b.this.f17138g; i10++) {
                sb.append(i10);
                this.f17153c[i10] = new File(C8976b.this.f17132a, sb.toString());
                sb.append(".tmp");
                this.f17154d[i10] = new File(C8976b.this.f17132a, sb.toString());
                sb.setLength(length);
            }
        }
    }

    /* renamed from: j.b$e */
    public final class e {

        /* renamed from: a */
        public final String f17159a;

        /* renamed from: b */
        public final long f17160b;

        /* renamed from: c */
        public final long[] f17161c;

        /* renamed from: d */
        public final File[] f17162d;

        public /* synthetic */ e(C8976b c8976b, String str, long j10, File[] fileArr, long[] jArr, a aVar) {
            this(str, j10, fileArr, jArr);
        }

        /* renamed from: a */
        public File m15629a(int i10) {
            return this.f17162d[i10];
        }

        public e(String str, long j10, File[] fileArr, long[] jArr) {
            this.f17159a = str;
            this.f17160b = j10;
            this.f17162d = fileArr;
            this.f17161c = jArr;
        }
    }

    public C8976b(File file, int i10, int i11, long j10) {
        this.f17132a = file;
        this.f17136e = i10;
        this.f17133b = new File(file, "journal");
        this.f17134c = new File(file, "journal.tmp");
        this.f17135d = new File(file, "journal.bkp");
        this.f17138g = i11;
        this.f17137f = j10;
    }

    /* renamed from: j */
    public static void m15590j(Writer writer) throws IOException {
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

    /* renamed from: m */
    public static void m15591m(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: p */
    public static void m15592p(Writer writer) throws IOException {
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

    /* renamed from: s */
    public static C8976b m15593s(File file, int i10, int i11, long j10) throws IOException {
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                m15594y(file2, file3, false);
            }
        }
        C8976b c8976b = new C8976b(file, i10, i11, j10);
        if (c8976b.f17133b.exists()) {
            try {
                c8976b.m15603u();
                c8976b.m15602t();
                return c8976b;
            } catch (IOException e10) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                c8976b.m15597l();
            }
        }
        file.mkdirs();
        C8976b c8976b2 = new C8976b(file, i10, i11, j10);
        c8976b2.m15605w();
        return c8976b2;
    }

    /* renamed from: y */
    public static void m15594y(File file, File file2, boolean z10) throws IOException {
        if (z10) {
            m15591m(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (this.f17140i == null) {
                return;
            }
            Iterator it = new ArrayList(this.f17141j.values()).iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                if (dVar.f17156f != null) {
                    dVar.f17156f.m15611a();
                }
            }
            m15607z();
            m15590j(this.f17140i);
            this.f17140i = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: i */
    public final void m15595i() {
        if (this.f17140i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: k */
    public final synchronized void m15596k(c cVar, boolean z10) {
        d dVar = cVar.f17147a;
        if (dVar.f17156f != cVar) {
            throw new IllegalStateException();
        }
        if (z10 && !dVar.f17155e) {
            for (int i10 = 0; i10 < this.f17138g; i10++) {
                if (!cVar.f17148b[i10]) {
                    cVar.m15611a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                }
                if (!dVar.m15625k(i10).exists()) {
                    cVar.m15611a();
                    return;
                }
            }
        }
        for (int i11 = 0; i11 < this.f17138g; i11++) {
            File fileM15625k = dVar.m15625k(i11);
            if (!z10) {
                m15591m(fileM15625k);
            } else if (fileM15625k.exists()) {
                File fileM15624j = dVar.m15624j(i11);
                fileM15625k.renameTo(fileM15624j);
                long j10 = dVar.f17152b[i11];
                long length = fileM15624j.length();
                dVar.f17152b[i11] = length;
                this.f17139h = (this.f17139h - j10) + length;
            }
        }
        this.f17142k++;
        dVar.f17156f = null;
        if (dVar.f17155e || z10) {
            dVar.f17155e = true;
            this.f17140i.append((CharSequence) "CLEAN");
            this.f17140i.append(' ');
            this.f17140i.append((CharSequence) dVar.f17151a);
            this.f17140i.append((CharSequence) dVar.m15626l());
            this.f17140i.append('\n');
            if (z10) {
                long j11 = this.f17143l;
                this.f17143l = 1 + j11;
                dVar.f17157g = j11;
            }
        } else {
            this.f17141j.remove(dVar.f17151a);
            this.f17140i.append((CharSequence) "REMOVE");
            this.f17140i.append(' ');
            this.f17140i.append((CharSequence) dVar.f17151a);
            this.f17140i.append('\n');
        }
        m15592p(this.f17140i);
        if (this.f17139h > this.f17137f || m15601r()) {
            this.f17144m.submit(this.f17145n);
        }
    }

    /* renamed from: l */
    public void m15597l() throws IOException {
        close();
        AbstractC8978d.m15635b(this.f17132a);
    }

    /* renamed from: n */
    public c m15598n(String str) {
        return m15599o(str, -1L);
    }

    /* renamed from: o */
    public final synchronized c m15599o(String str, long j10) {
        m15595i();
        d dVar = (d) this.f17141j.get(str);
        a aVar = null;
        if (j10 != -1 && (dVar == null || dVar.f17157g != j10)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, aVar);
            this.f17141j.put(str, dVar);
        } else if (dVar.f17156f != null) {
            return null;
        }
        c cVar = new c(this, dVar, aVar);
        dVar.f17156f = cVar;
        this.f17140i.append((CharSequence) "DIRTY");
        this.f17140i.append(' ');
        this.f17140i.append((CharSequence) str);
        this.f17140i.append('\n');
        m15592p(this.f17140i);
        return cVar;
    }

    /* renamed from: q */
    public synchronized e m15600q(String str) {
        Throwable th;
        try {
            try {
                m15595i();
                d dVar = (d) this.f17141j.get(str);
                if (dVar == null) {
                    return null;
                }
                if (!dVar.f17155e) {
                    return null;
                }
                for (File file : dVar.f17153c) {
                    try {
                        if (!file.exists()) {
                            return null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                this.f17142k++;
                this.f17140i.append((CharSequence) "READ");
                this.f17140i.append(' ');
                this.f17140i.append((CharSequence) str);
                this.f17140i.append('\n');
                if (m15601r()) {
                    this.f17144m.submit(this.f17145n);
                }
                return new e(this, str, dVar.f17157g, dVar.f17153c, dVar.f17152b, null);
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

    /* renamed from: r */
    public final boolean m15601r() {
        int i10 = this.f17142k;
        return i10 >= 2000 && i10 >= this.f17141j.size();
    }

    /* renamed from: t */
    public final void m15602t() throws IOException {
        m15591m(this.f17134c);
        Iterator it = this.f17141j.values().iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            int i10 = 0;
            if (dVar.f17156f == null) {
                while (i10 < this.f17138g) {
                    this.f17139h += dVar.f17152b[i10];
                    i10++;
                }
            } else {
                dVar.f17156f = null;
                while (i10 < this.f17138g) {
                    m15591m(dVar.m15624j(i10));
                    m15591m(dVar.m15625k(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    /* renamed from: u */
    public final void m15603u() throws IOException {
        C8977c c8977c = new C8977c(new FileInputStream(this.f17133b), AbstractC8978d.f17170a);
        try {
            String strM15633d = c8977c.m15633d();
            String strM15633d2 = c8977c.m15633d();
            String strM15633d3 = c8977c.m15633d();
            String strM15633d4 = c8977c.m15633d();
            String strM15633d5 = c8977c.m15633d();
            if (!"libcore.io.DiskLruCache".equals(strM15633d) || !"1".equals(strM15633d2) || !Integer.toString(this.f17136e).equals(strM15633d3) || !Integer.toString(this.f17138g).equals(strM15633d4) || !"".equals(strM15633d5)) {
                throw new IOException("unexpected journal header: [" + strM15633d + ", " + strM15633d2 + ", " + strM15633d4 + ", " + strM15633d5 + "]");
            }
            int i10 = 0;
            while (true) {
                try {
                    m15604v(c8977c.m15633d());
                    i10++;
                } catch (EOFException unused) {
                    this.f17142k = i10 - this.f17141j.size();
                    if (c8977c.m15632c()) {
                        m15605w();
                    } else {
                        this.f17140i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f17133b, true), AbstractC8978d.f17170a));
                    }
                    AbstractC8978d.m15634a(c8977c);
                    return;
                }
            }
        } catch (Throwable th) {
            AbstractC8978d.m15634a(c8977c);
            throw th;
        }
    }

    /* renamed from: v */
    public final void m15604v(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i10 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i10);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i10);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.f17141j.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iIndexOf2);
        }
        d dVar = (d) this.f17141j.get(strSubstring);
        a aVar = null;
        if (dVar == null) {
            dVar = new d(this, strSubstring, aVar);
            this.f17141j.put(strSubstring, dVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            dVar.f17155e = true;
            dVar.f17156f = null;
            dVar.m15628n(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            dVar.f17156f = new c(this, dVar, aVar);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* renamed from: w */
    public final synchronized void m15605w() {
        try {
            Writer writer = this.f17140i;
            if (writer != null) {
                m15590j(writer);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f17134c), AbstractC8978d.f17170a));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write(SignParameters.NEW_LINE);
                bufferedWriter.write("1");
                bufferedWriter.write(SignParameters.NEW_LINE);
                bufferedWriter.write(Integer.toString(this.f17136e));
                bufferedWriter.write(SignParameters.NEW_LINE);
                bufferedWriter.write(Integer.toString(this.f17138g));
                bufferedWriter.write(SignParameters.NEW_LINE);
                bufferedWriter.write(SignParameters.NEW_LINE);
                for (d dVar : this.f17141j.values()) {
                    if (dVar.f17156f != null) {
                        bufferedWriter.write("DIRTY " + dVar.f17151a + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + dVar.f17151a + dVar.m15626l() + '\n');
                    }
                }
                m15590j(bufferedWriter);
                if (this.f17133b.exists()) {
                    m15594y(this.f17133b, this.f17135d, true);
                }
                m15594y(this.f17134c, this.f17133b, false);
                this.f17135d.delete();
                this.f17140i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f17133b, true), AbstractC8978d.f17170a));
            } catch (Throwable th) {
                m15590j(bufferedWriter);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: x */
    public synchronized boolean m15606x(String str) {
        try {
            m15595i();
            d dVar = (d) this.f17141j.get(str);
            if (dVar != null && dVar.f17156f == null) {
                for (int i10 = 0; i10 < this.f17138g; i10++) {
                    File fileM15624j = dVar.m15624j(i10);
                    if (fileM15624j.exists() && !fileM15624j.delete()) {
                        throw new IOException("failed to delete " + fileM15624j);
                    }
                    this.f17139h -= dVar.f17152b[i10];
                    dVar.f17152b[i10] = 0;
                }
                this.f17142k++;
                this.f17140i.append((CharSequence) "REMOVE");
                this.f17140i.append(' ');
                this.f17140i.append((CharSequence) str);
                this.f17140i.append('\n');
                this.f17141j.remove(str);
                if (m15601r()) {
                    this.f17144m.submit(this.f17145n);
                }
                return true;
            }
            return false;
        } finally {
        }
    }

    /* renamed from: z */
    public final void m15607z() {
        while (this.f17139h > this.f17137f) {
            m15606x((String) ((Map.Entry) this.f17141j.entrySet().iterator().next()).getKey());
        }
    }
}
