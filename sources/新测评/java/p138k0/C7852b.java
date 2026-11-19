package p138k0;

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

/* renamed from: k0.b */
/* loaded from: classes3.dex */
public final class C7852b implements Closeable {

    /* renamed from: a */
    public final File f13583a;

    /* renamed from: b */
    public final File f13584b;

    /* renamed from: c */
    public final File f13585c;

    /* renamed from: d */
    public final File f13586d;

    /* renamed from: e */
    public final int f13587e;

    /* renamed from: f */
    public long f13588f;

    /* renamed from: g */
    public final int f13589g;

    /* renamed from: i */
    public Writer f13591i;

    /* renamed from: k */
    public int f13593k;

    /* renamed from: h */
    public long f13590h = 0;

    /* renamed from: j */
    public final LinkedHashMap f13592j = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: l */
    public long f13594l = 0;

    /* renamed from: m */
    public final ThreadPoolExecutor f13595m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(null));

    /* renamed from: n */
    public final Callable f13596n = new a();

    /* renamed from: k0.b$a */
    public class a implements Callable {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (C7852b.this) {
                try {
                    if (C7852b.this.f13591i == null) {
                        return null;
                    }
                    C7852b.this.m13339D();
                    if (C7852b.this.m13346v()) {
                        C7852b.this.m13337A();
                        C7852b.this.f13593k = 0;
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: k0.b$b */
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

    /* renamed from: k0.b$c */
    public final class c {

        /* renamed from: a */
        public final d f13598a;

        /* renamed from: b */
        public final boolean[] f13599b;

        /* renamed from: c */
        public boolean f13600c;

        public /* synthetic */ c(C7852b c7852b, d dVar, a aVar) {
            this(dVar);
        }

        /* renamed from: a */
        public void m13353a() {
            C7852b.this.m13341o(this, false);
        }

        /* renamed from: b */
        public void m13354b() {
            if (this.f13600c) {
                return;
            }
            try {
                m13353a();
            } catch (IOException unused) {
            }
        }

        /* renamed from: e */
        public void m13355e() {
            C7852b.this.m13341o(this, true);
            this.f13600c = true;
        }

        /* renamed from: f */
        public File m13356f(int i10) {
            File fileM13367k;
            synchronized (C7852b.this) {
                try {
                    if (this.f13598a.f13607f != this) {
                        throw new IllegalStateException();
                    }
                    if (!this.f13598a.f13606e) {
                        this.f13599b[i10] = true;
                    }
                    fileM13367k = this.f13598a.m13367k(i10);
                    C7852b.this.f13583a.mkdirs();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return fileM13367k;
        }

        public c(d dVar) {
            this.f13598a = dVar;
            this.f13599b = dVar.f13606e ? null : new boolean[C7852b.this.f13589g];
        }
    }

    /* renamed from: k0.b$d */
    public final class d {

        /* renamed from: a */
        public final String f13602a;

        /* renamed from: b */
        public final long[] f13603b;

        /* renamed from: c */
        public File[] f13604c;

        /* renamed from: d */
        public File[] f13605d;

        /* renamed from: e */
        public boolean f13606e;

        /* renamed from: f */
        public c f13607f;

        /* renamed from: g */
        public long f13608g;

        public /* synthetic */ d(C7852b c7852b, String str, a aVar) {
            this(str);
        }

        /* renamed from: j */
        public File m13366j(int i10) {
            return this.f13604c[i10];
        }

        /* renamed from: k */
        public File m13367k(int i10) {
            return this.f13605d[i10];
        }

        /* renamed from: l */
        public String m13368l() {
            StringBuilder sb = new StringBuilder();
            for (long j10 : this.f13603b) {
                sb.append(' ');
                sb.append(j10);
            }
            return sb.toString();
        }

        /* renamed from: m */
        public final IOException m13369m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* renamed from: n */
        public final void m13370n(String[] strArr) throws IOException {
            if (strArr.length != C7852b.this.f13589g) {
                throw m13369m(strArr);
            }
            for (int i10 = 0; i10 < strArr.length; i10++) {
                try {
                    this.f13603b[i10] = Long.parseLong(strArr[i10]);
                } catch (NumberFormatException unused) {
                    throw m13369m(strArr);
                }
            }
        }

        public d(String str) {
            this.f13602a = str;
            this.f13603b = new long[C7852b.this.f13589g];
            this.f13604c = new File[C7852b.this.f13589g];
            this.f13605d = new File[C7852b.this.f13589g];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i10 = 0; i10 < C7852b.this.f13589g; i10++) {
                sb.append(i10);
                this.f13604c[i10] = new File(C7852b.this.f13583a, sb.toString());
                sb.append(".tmp");
                this.f13605d[i10] = new File(C7852b.this.f13583a, sb.toString());
                sb.setLength(length);
            }
        }
    }

    /* renamed from: k0.b$e */
    public final class e {

        /* renamed from: a */
        public final String f13610a;

        /* renamed from: b */
        public final long f13611b;

        /* renamed from: c */
        public final long[] f13612c;

        /* renamed from: d */
        public final File[] f13613d;

        public /* synthetic */ e(C7852b c7852b, String str, long j10, File[] fileArr, long[] jArr, a aVar) {
            this(str, j10, fileArr, jArr);
        }

        /* renamed from: a */
        public File m13371a(int i10) {
            return this.f13613d[i10];
        }

        public e(String str, long j10, File[] fileArr, long[] jArr) {
            this.f13610a = str;
            this.f13611b = j10;
            this.f13613d = fileArr;
            this.f13612c = jArr;
        }
    }

    public C7852b(File file, int i10, int i11, long j10) {
        this.f13583a = file;
        this.f13587e = i10;
        this.f13584b = new File(file, "journal");
        this.f13585c = new File(file, "journal.tmp");
        this.f13586d = new File(file, "journal.bkp");
        this.f13589g = i11;
        this.f13588f = j10;
    }

    /* renamed from: C */
    public static void m13324C(File file, File file2, boolean z9) throws IOException {
        if (z9) {
            m13334q(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* renamed from: n */
    public static void m13333n(Writer writer) throws IOException {
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
    public static void m13334q(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: t */
    public static void m13335t(Writer writer) throws IOException {
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
    public static C7852b m13336w(File file, int i10, int i11, long j10) throws IOException {
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
                m13324C(file2, file3, false);
            }
        }
        C7852b c7852b = new C7852b(file, i10, i11, j10);
        if (c7852b.f13584b.exists()) {
            try {
                c7852b.m13348y();
                c7852b.m13347x();
                return c7852b;
            } catch (IOException e10) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                c7852b.m13342p();
            }
        }
        file.mkdirs();
        C7852b c7852b2 = new C7852b(file, i10, i11, j10);
        c7852b2.m13337A();
        return c7852b2;
    }

    /* renamed from: A */
    public final synchronized void m13337A() {
        try {
            Writer writer = this.f13591i;
            if (writer != null) {
                m13333n(writer);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f13585c), AbstractC7854d.f13621a));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write(SignParameters.NEW_LINE);
                bufferedWriter.write("1");
                bufferedWriter.write(SignParameters.NEW_LINE);
                bufferedWriter.write(Integer.toString(this.f13587e));
                bufferedWriter.write(SignParameters.NEW_LINE);
                bufferedWriter.write(Integer.toString(this.f13589g));
                bufferedWriter.write(SignParameters.NEW_LINE);
                bufferedWriter.write(SignParameters.NEW_LINE);
                for (d dVar : this.f13592j.values()) {
                    if (dVar.f13607f != null) {
                        bufferedWriter.write("DIRTY " + dVar.f13602a + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + dVar.f13602a + dVar.m13368l() + '\n');
                    }
                }
                m13333n(bufferedWriter);
                if (this.f13584b.exists()) {
                    m13324C(this.f13584b, this.f13586d, true);
                }
                m13324C(this.f13585c, this.f13584b, false);
                this.f13586d.delete();
                this.f13591i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f13584b, true), AbstractC7854d.f13621a));
            } catch (Throwable th) {
                m13333n(bufferedWriter);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: B */
    public synchronized boolean m13338B(String str) {
        try {
            m13340m();
            d dVar = (d) this.f13592j.get(str);
            if (dVar != null && dVar.f13607f == null) {
                for (int i10 = 0; i10 < this.f13589g; i10++) {
                    File fileM13366j = dVar.m13366j(i10);
                    if (fileM13366j.exists() && !fileM13366j.delete()) {
                        throw new IOException("failed to delete " + fileM13366j);
                    }
                    this.f13590h -= dVar.f13603b[i10];
                    dVar.f13603b[i10] = 0;
                }
                this.f13593k++;
                this.f13591i.append((CharSequence) "REMOVE");
                this.f13591i.append(' ');
                this.f13591i.append((CharSequence) str);
                this.f13591i.append('\n');
                this.f13592j.remove(str);
                if (m13346v()) {
                    this.f13595m.submit(this.f13596n);
                }
                return true;
            }
            return false;
        } finally {
        }
    }

    /* renamed from: D */
    public final void m13339D() {
        while (this.f13590h > this.f13588f) {
            m13338B((String) ((Map.Entry) this.f13592j.entrySet().iterator().next()).getKey());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (this.f13591i == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f13592j.values());
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                d dVar = (d) obj;
                if (dVar.f13607f != null) {
                    dVar.f13607f.m13353a();
                }
            }
            m13339D();
            m13333n(this.f13591i);
            this.f13591i = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: m */
    public final void m13340m() {
        if (this.f13591i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: o */
    public final synchronized void m13341o(c cVar, boolean z9) {
        d dVar = cVar.f13598a;
        if (dVar.f13607f != cVar) {
            throw new IllegalStateException();
        }
        if (z9 && !dVar.f13606e) {
            for (int i10 = 0; i10 < this.f13589g; i10++) {
                if (!cVar.f13599b[i10]) {
                    cVar.m13353a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                }
                if (!dVar.m13367k(i10).exists()) {
                    cVar.m13353a();
                    return;
                }
            }
        }
        for (int i11 = 0; i11 < this.f13589g; i11++) {
            File fileM13367k = dVar.m13367k(i11);
            if (!z9) {
                m13334q(fileM13367k);
            } else if (fileM13367k.exists()) {
                File fileM13366j = dVar.m13366j(i11);
                fileM13367k.renameTo(fileM13366j);
                long j10 = dVar.f13603b[i11];
                long length = fileM13366j.length();
                dVar.f13603b[i11] = length;
                this.f13590h = (this.f13590h - j10) + length;
            }
        }
        this.f13593k++;
        dVar.f13607f = null;
        if (dVar.f13606e || z9) {
            dVar.f13606e = true;
            this.f13591i.append((CharSequence) "CLEAN");
            this.f13591i.append(' ');
            this.f13591i.append((CharSequence) dVar.f13602a);
            this.f13591i.append((CharSequence) dVar.m13368l());
            this.f13591i.append('\n');
            if (z9) {
                long j11 = this.f13594l;
                this.f13594l = 1 + j11;
                dVar.f13608g = j11;
            }
        } else {
            this.f13592j.remove(dVar.f13602a);
            this.f13591i.append((CharSequence) "REMOVE");
            this.f13591i.append(' ');
            this.f13591i.append((CharSequence) dVar.f13602a);
            this.f13591i.append('\n');
        }
        m13335t(this.f13591i);
        if (this.f13590h > this.f13588f || m13346v()) {
            this.f13595m.submit(this.f13596n);
        }
    }

    /* renamed from: p */
    public void m13342p() throws IOException {
        close();
        AbstractC7854d.m13377b(this.f13583a);
    }

    /* renamed from: r */
    public c m13343r(String str) {
        return m13344s(str, -1L);
    }

    /* renamed from: s */
    public final synchronized c m13344s(String str, long j10) {
        m13340m();
        d dVar = (d) this.f13592j.get(str);
        a aVar = null;
        if (j10 != -1 && (dVar == null || dVar.f13608g != j10)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, aVar);
            this.f13592j.put(str, dVar);
        } else if (dVar.f13607f != null) {
            return null;
        }
        c cVar = new c(this, dVar, aVar);
        dVar.f13607f = cVar;
        this.f13591i.append((CharSequence) "DIRTY");
        this.f13591i.append(' ');
        this.f13591i.append((CharSequence) str);
        this.f13591i.append('\n');
        m13335t(this.f13591i);
        return cVar;
    }

    /* renamed from: u */
    public synchronized e m13345u(String str) {
        Throwable th;
        try {
            try {
                m13340m();
                d dVar = (d) this.f13592j.get(str);
                if (dVar == null) {
                    return null;
                }
                if (!dVar.f13606e) {
                    return null;
                }
                for (File file : dVar.f13604c) {
                    try {
                        if (!file.exists()) {
                            return null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                this.f13593k++;
                this.f13591i.append((CharSequence) "READ");
                this.f13591i.append(' ');
                this.f13591i.append((CharSequence) str);
                this.f13591i.append('\n');
                if (m13346v()) {
                    this.f13595m.submit(this.f13596n);
                }
                return new e(this, str, dVar.f13608g, dVar.f13604c, dVar.f13603b, null);
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
    public final boolean m13346v() {
        int i10 = this.f13593k;
        return i10 >= 2000 && i10 >= this.f13592j.size();
    }

    /* renamed from: x */
    public final void m13347x() throws IOException {
        m13334q(this.f13585c);
        Iterator it = this.f13592j.values().iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            int i10 = 0;
            if (dVar.f13607f == null) {
                while (i10 < this.f13589g) {
                    this.f13590h += dVar.f13603b[i10];
                    i10++;
                }
            } else {
                dVar.f13607f = null;
                while (i10 < this.f13589g) {
                    m13334q(dVar.m13366j(i10));
                    m13334q(dVar.m13367k(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    /* renamed from: y */
    public final void m13348y() throws IOException {
        C7853c c7853c = new C7853c(new FileInputStream(this.f13584b), AbstractC7854d.f13621a);
        try {
            String strM13375h = c7853c.m13375h();
            String strM13375h2 = c7853c.m13375h();
            String strM13375h3 = c7853c.m13375h();
            String strM13375h4 = c7853c.m13375h();
            String strM13375h5 = c7853c.m13375h();
            if (!"libcore.io.DiskLruCache".equals(strM13375h) || !"1".equals(strM13375h2) || !Integer.toString(this.f13587e).equals(strM13375h3) || !Integer.toString(this.f13589g).equals(strM13375h4) || !"".equals(strM13375h5)) {
                throw new IOException("unexpected journal header: [" + strM13375h + ", " + strM13375h2 + ", " + strM13375h4 + ", " + strM13375h5 + "]");
            }
            int i10 = 0;
            while (true) {
                try {
                    m13349z(c7853c.m13375h());
                    i10++;
                } catch (EOFException unused) {
                    this.f13593k = i10 - this.f13592j.size();
                    if (c7853c.m13374g()) {
                        m13337A();
                    } else {
                        this.f13591i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f13584b, true), AbstractC7854d.f13621a));
                    }
                    AbstractC7854d.m13376a(c7853c);
                    return;
                }
            }
        } catch (Throwable th) {
            AbstractC7854d.m13376a(c7853c);
            throw th;
        }
    }

    /* renamed from: z */
    public final void m13349z(String str) throws IOException {
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
                this.f13592j.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iIndexOf2);
        }
        d dVar = (d) this.f13592j.get(strSubstring);
        a aVar = null;
        if (dVar == null) {
            dVar = new d(this, strSubstring, aVar);
            this.f13592j.put(strSubstring, dVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            dVar.f13606e = true;
            dVar.f13607f = null;
            dVar.m13370n(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            dVar.f13607f = new c(this, dVar, aVar);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }
}
