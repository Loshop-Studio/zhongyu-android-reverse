package p139f0;

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

/* renamed from: f0.b */
/* loaded from: classes3.dex */
public final class C9146b implements Closeable {

    /* renamed from: c */
    public final File f21349c;

    /* renamed from: d */
    public final File f21350d;

    /* renamed from: e */
    public final File f21351e;

    /* renamed from: f */
    public final File f21352f;

    /* renamed from: g */
    public final int f21353g;

    /* renamed from: h */
    public long f21354h;

    /* renamed from: i */
    public final int f21355i;

    /* renamed from: k */
    public Writer f21357k;

    /* renamed from: m */
    public int f21359m;

    /* renamed from: j */
    public long f21356j = 0;

    /* renamed from: l */
    public final LinkedHashMap f21358l = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: n */
    public long f21360n = 0;

    /* renamed from: o */
    public final ThreadPoolExecutor f21361o = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(null));

    /* renamed from: p */
    public final Callable f21362p = new a();

    /* renamed from: f0.b$a */
    public class a implements Callable {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (C9146b.this) {
                try {
                    if (C9146b.this.f21357k == null) {
                        return null;
                    }
                    C9146b.this.m18006D();
                    if (C9146b.this.m18013v()) {
                        C9146b.this.m18004A();
                        C9146b.this.f21359m = 0;
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
        public final d f21364a;

        /* renamed from: b */
        public final boolean[] f21365b;

        /* renamed from: c */
        public boolean f21366c;

        public /* synthetic */ c(C9146b c9146b, d dVar, a aVar) {
            this(dVar);
        }

        /* renamed from: a */
        public void m18020a() {
            C9146b.this.m18008m(this, false);
        }

        /* renamed from: b */
        public void m18021b() {
            if (this.f21366c) {
                return;
            }
            try {
                m18020a();
            } catch (IOException unused) {
            }
        }

        /* renamed from: e */
        public void m18022e() {
            C9146b.this.m18008m(this, true);
            this.f21366c = true;
        }

        /* renamed from: f */
        public File m18023f(int i10) {
            File fileM18034k;
            synchronized (C9146b.this) {
                try {
                    if (this.f21364a.f21373f != this) {
                        throw new IllegalStateException();
                    }
                    if (!this.f21364a.f21372e) {
                        this.f21365b[i10] = true;
                    }
                    fileM18034k = this.f21364a.m18034k(i10);
                    C9146b.this.f21349c.mkdirs();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return fileM18034k;
        }

        public c(d dVar) {
            this.f21364a = dVar;
            this.f21365b = dVar.f21372e ? null : new boolean[C9146b.this.f21355i];
        }
    }

    /* renamed from: f0.b$d */
    public final class d {

        /* renamed from: a */
        public final String f21368a;

        /* renamed from: b */
        public final long[] f21369b;

        /* renamed from: c */
        public File[] f21370c;

        /* renamed from: d */
        public File[] f21371d;

        /* renamed from: e */
        public boolean f21372e;

        /* renamed from: f */
        public c f21373f;

        /* renamed from: g */
        public long f21374g;

        public /* synthetic */ d(C9146b c9146b, String str, a aVar) {
            this(str);
        }

        /* renamed from: j */
        public File m18033j(int i10) {
            return this.f21370c[i10];
        }

        /* renamed from: k */
        public File m18034k(int i10) {
            return this.f21371d[i10];
        }

        /* renamed from: l */
        public String m18035l() {
            StringBuilder sb2 = new StringBuilder();
            for (long j10 : this.f21369b) {
                sb2.append(' ');
                sb2.append(j10);
            }
            return sb2.toString();
        }

        /* renamed from: m */
        public final IOException m18036m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* renamed from: n */
        public final void m18037n(String[] strArr) throws IOException {
            if (strArr.length != C9146b.this.f21355i) {
                throw m18036m(strArr);
            }
            for (int i10 = 0; i10 < strArr.length; i10++) {
                try {
                    this.f21369b[i10] = Long.parseLong(strArr[i10]);
                } catch (NumberFormatException unused) {
                    throw m18036m(strArr);
                }
            }
        }

        public d(String str) {
            this.f21368a = str;
            this.f21369b = new long[C9146b.this.f21355i];
            this.f21370c = new File[C9146b.this.f21355i];
            this.f21371d = new File[C9146b.this.f21355i];
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            for (int i10 = 0; i10 < C9146b.this.f21355i; i10++) {
                sb2.append(i10);
                this.f21370c[i10] = new File(C9146b.this.f21349c, sb2.toString());
                sb2.append(".tmp");
                this.f21371d[i10] = new File(C9146b.this.f21349c, sb2.toString());
                sb2.setLength(length);
            }
        }
    }

    /* renamed from: f0.b$e */
    public final class e {

        /* renamed from: a */
        public final String f21376a;

        /* renamed from: b */
        public final long f21377b;

        /* renamed from: c */
        public final long[] f21378c;

        /* renamed from: d */
        public final File[] f21379d;

        public /* synthetic */ e(C9146b c9146b, String str, long j10, File[] fileArr, long[] jArr, a aVar) {
            this(str, j10, fileArr, jArr);
        }

        /* renamed from: a */
        public File m18038a(int i10) {
            return this.f21379d[i10];
        }

        public e(String str, long j10, File[] fileArr, long[] jArr) {
            this.f21376a = str;
            this.f21377b = j10;
            this.f21379d = fileArr;
            this.f21378c = jArr;
        }
    }

    public C9146b(File file, int i10, int i11, long j10) {
        this.f21349c = file;
        this.f21353g = i10;
        this.f21350d = new File(file, "journal");
        this.f21351e = new File(file, "journal.tmp");
        this.f21352f = new File(file, "journal.bkp");
        this.f21355i = i11;
        this.f21354h = j10;
    }

    /* renamed from: C */
    public static void m17991C(File file, File file2, boolean z10) throws IOException {
        if (z10) {
            m18001p(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* renamed from: l */
    public static void m18000l(Writer writer) throws IOException {
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

    /* renamed from: p */
    public static void m18001p(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: t */
    public static void m18002t(Writer writer) throws IOException {
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
    public static C9146b m18003w(File file, int i10, int i11, long j10) throws IOException {
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
                m17991C(file2, file3, false);
            }
        }
        C9146b c9146b = new C9146b(file, i10, i11, j10);
        if (c9146b.f21350d.exists()) {
            try {
                c9146b.m18015y();
                c9146b.m18014x();
                return c9146b;
            } catch (IOException e10) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                c9146b.m18009n();
            }
        }
        file.mkdirs();
        C9146b c9146b2 = new C9146b(file, i10, i11, j10);
        c9146b2.m18004A();
        return c9146b2;
    }

    /* renamed from: A */
    public final synchronized void m18004A() {
        try {
            Writer writer = this.f21357k;
            if (writer != null) {
                m18000l(writer);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f21351e), AbstractC9148d.f21387a));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write(SignParameters.NEW_LINE);
                bufferedWriter.write("1");
                bufferedWriter.write(SignParameters.NEW_LINE);
                bufferedWriter.write(Integer.toString(this.f21353g));
                bufferedWriter.write(SignParameters.NEW_LINE);
                bufferedWriter.write(Integer.toString(this.f21355i));
                bufferedWriter.write(SignParameters.NEW_LINE);
                bufferedWriter.write(SignParameters.NEW_LINE);
                for (d dVar : this.f21358l.values()) {
                    if (dVar.f21373f != null) {
                        bufferedWriter.write("DIRTY " + dVar.f21368a + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + dVar.f21368a + dVar.m18035l() + '\n');
                    }
                }
                m18000l(bufferedWriter);
                if (this.f21350d.exists()) {
                    m17991C(this.f21350d, this.f21352f, true);
                }
                m17991C(this.f21351e, this.f21350d, false);
                this.f21352f.delete();
                this.f21357k = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f21350d, true), AbstractC9148d.f21387a));
            } catch (Throwable th) {
                m18000l(bufferedWriter);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: B */
    public synchronized boolean m18005B(String str) {
        try {
            m18007k();
            d dVar = (d) this.f21358l.get(str);
            if (dVar != null && dVar.f21373f == null) {
                for (int i10 = 0; i10 < this.f21355i; i10++) {
                    File fileM18033j = dVar.m18033j(i10);
                    if (fileM18033j.exists() && !fileM18033j.delete()) {
                        throw new IOException("failed to delete " + fileM18033j);
                    }
                    this.f21356j -= dVar.f21369b[i10];
                    dVar.f21369b[i10] = 0;
                }
                this.f21359m++;
                this.f21357k.append((CharSequence) "REMOVE");
                this.f21357k.append(' ');
                this.f21357k.append((CharSequence) str);
                this.f21357k.append('\n');
                this.f21358l.remove(str);
                if (m18013v()) {
                    this.f21361o.submit(this.f21362p);
                }
                return true;
            }
            return false;
        } finally {
        }
    }

    /* renamed from: D */
    public final void m18006D() {
        while (this.f21356j > this.f21354h) {
            m18005B((String) ((Map.Entry) this.f21358l.entrySet().iterator().next()).getKey());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (this.f21357k == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f21358l.values());
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                d dVar = (d) obj;
                if (dVar.f21373f != null) {
                    dVar.f21373f.m18020a();
                }
            }
            m18006D();
            m18000l(this.f21357k);
            this.f21357k = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: k */
    public final void m18007k() {
        if (this.f21357k == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: m */
    public final synchronized void m18008m(c cVar, boolean z10) {
        d dVar = cVar.f21364a;
        if (dVar.f21373f != cVar) {
            throw new IllegalStateException();
        }
        if (z10 && !dVar.f21372e) {
            for (int i10 = 0; i10 < this.f21355i; i10++) {
                if (!cVar.f21365b[i10]) {
                    cVar.m18020a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                }
                if (!dVar.m18034k(i10).exists()) {
                    cVar.m18020a();
                    return;
                }
            }
        }
        for (int i11 = 0; i11 < this.f21355i; i11++) {
            File fileM18034k = dVar.m18034k(i11);
            if (!z10) {
                m18001p(fileM18034k);
            } else if (fileM18034k.exists()) {
                File fileM18033j = dVar.m18033j(i11);
                fileM18034k.renameTo(fileM18033j);
                long j10 = dVar.f21369b[i11];
                long length = fileM18033j.length();
                dVar.f21369b[i11] = length;
                this.f21356j = (this.f21356j - j10) + length;
            }
        }
        this.f21359m++;
        dVar.f21373f = null;
        if (dVar.f21372e || z10) {
            dVar.f21372e = true;
            this.f21357k.append((CharSequence) "CLEAN");
            this.f21357k.append(' ');
            this.f21357k.append((CharSequence) dVar.f21368a);
            this.f21357k.append((CharSequence) dVar.m18035l());
            this.f21357k.append('\n');
            if (z10) {
                long j11 = this.f21360n;
                this.f21360n = 1 + j11;
                dVar.f21374g = j11;
            }
        } else {
            this.f21358l.remove(dVar.f21368a);
            this.f21357k.append((CharSequence) "REMOVE");
            this.f21357k.append(' ');
            this.f21357k.append((CharSequence) dVar.f21368a);
            this.f21357k.append('\n');
        }
        m18002t(this.f21357k);
        if (this.f21356j > this.f21354h || m18013v()) {
            this.f21361o.submit(this.f21362p);
        }
    }

    /* renamed from: n */
    public void m18009n() throws IOException {
        close();
        AbstractC9148d.m18044b(this.f21349c);
    }

    /* renamed from: r */
    public c m18010r(String str) {
        return m18011s(str, -1L);
    }

    /* renamed from: s */
    public final synchronized c m18011s(String str, long j10) {
        m18007k();
        d dVar = (d) this.f21358l.get(str);
        a aVar = null;
        if (j10 != -1 && (dVar == null || dVar.f21374g != j10)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, aVar);
            this.f21358l.put(str, dVar);
        } else if (dVar.f21373f != null) {
            return null;
        }
        c cVar = new c(this, dVar, aVar);
        dVar.f21373f = cVar;
        this.f21357k.append((CharSequence) "DIRTY");
        this.f21357k.append(' ');
        this.f21357k.append((CharSequence) str);
        this.f21357k.append('\n');
        m18002t(this.f21357k);
        return cVar;
    }

    /* renamed from: u */
    public synchronized e m18012u(String str) {
        Throwable th;
        try {
            try {
                m18007k();
                d dVar = (d) this.f21358l.get(str);
                if (dVar == null) {
                    return null;
                }
                if (!dVar.f21372e) {
                    return null;
                }
                for (File file : dVar.f21370c) {
                    try {
                        if (!file.exists()) {
                            return null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                this.f21359m++;
                this.f21357k.append((CharSequence) "READ");
                this.f21357k.append(' ');
                this.f21357k.append((CharSequence) str);
                this.f21357k.append('\n');
                if (m18013v()) {
                    this.f21361o.submit(this.f21362p);
                }
                return new e(this, str, dVar.f21374g, dVar.f21370c, dVar.f21369b, null);
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
    public final boolean m18013v() {
        int i10 = this.f21359m;
        return i10 >= 2000 && i10 >= this.f21358l.size();
    }

    /* renamed from: x */
    public final void m18014x() throws IOException {
        m18001p(this.f21351e);
        Iterator it = this.f21358l.values().iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            int i10 = 0;
            if (dVar.f21373f == null) {
                while (i10 < this.f21355i) {
                    this.f21356j += dVar.f21369b[i10];
                    i10++;
                }
            } else {
                dVar.f21373f = null;
                while (i10 < this.f21355i) {
                    m18001p(dVar.m18033j(i10));
                    m18001p(dVar.m18034k(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    /* renamed from: y */
    public final void m18015y() throws IOException {
        C9147c c9147c = new C9147c(new FileInputStream(this.f21350d), AbstractC9148d.f21387a);
        try {
            String strM18042g = c9147c.m18042g();
            String strM18042g2 = c9147c.m18042g();
            String strM18042g3 = c9147c.m18042g();
            String strM18042g4 = c9147c.m18042g();
            String strM18042g5 = c9147c.m18042g();
            if (!"libcore.io.DiskLruCache".equals(strM18042g) || !"1".equals(strM18042g2) || !Integer.toString(this.f21353g).equals(strM18042g3) || !Integer.toString(this.f21355i).equals(strM18042g4) || !"".equals(strM18042g5)) {
                throw new IOException("unexpected journal header: [" + strM18042g + ", " + strM18042g2 + ", " + strM18042g4 + ", " + strM18042g5 + "]");
            }
            int i10 = 0;
            while (true) {
                try {
                    m18016z(c9147c.m18042g());
                    i10++;
                } catch (EOFException unused) {
                    this.f21359m = i10 - this.f21358l.size();
                    if (c9147c.m18041f()) {
                        m18004A();
                    } else {
                        this.f21357k = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f21350d, true), AbstractC9148d.f21387a));
                    }
                    AbstractC9148d.m18043a(c9147c);
                    return;
                }
            }
        } catch (Throwable th) {
            AbstractC9148d.m18043a(c9147c);
            throw th;
        }
    }

    /* renamed from: z */
    public final void m18016z(String str) throws IOException {
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
                this.f21358l.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iIndexOf2);
        }
        d dVar = (d) this.f21358l.get(strSubstring);
        a aVar = null;
        if (dVar == null) {
            dVar = new d(this, strSubstring, aVar);
            this.f21358l.put(strSubstring, dVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            dVar.f21372e = true;
            dVar.f21373f = null;
            dVar.m18037n(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            dVar.f21373f = new c(this, dVar, aVar);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }
}
