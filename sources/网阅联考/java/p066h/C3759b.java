package p066h;

import android.os.Build;
import android.os.StrictMode;
import com.umeng.commonsdk.statistics.SdkVersion;
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

/* renamed from: h.b */
/* loaded from: classes2.dex */
public final class C3759b implements Closeable {

    /* renamed from: a */
    public final File f4407a;

    /* renamed from: b */
    public final File f4408b;

    /* renamed from: c */
    public final File f4409c;

    /* renamed from: d */
    public final File f4410d;

    /* renamed from: e */
    public final int f4411e;

    /* renamed from: f */
    public long f4412f;

    /* renamed from: g */
    public final int f4413g;

    /* renamed from: i */
    public Writer f4415i;

    /* renamed from: k */
    public int f4417k;

    /* renamed from: h */
    public long f4414h = 0;

    /* renamed from: j */
    public final LinkedHashMap f4416j = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: l */
    public long f4418l = 0;

    /* renamed from: m */
    public final ThreadPoolExecutor f4419m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(null));

    /* renamed from: n */
    public final Callable f4420n = new a();

    /* renamed from: h.b$a */
    public class a implements Callable {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (C3759b.this) {
                if (C3759b.this.f4415i == null) {
                    return null;
                }
                C3759b.this.m4821z();
                if (C3759b.this.m4815r()) {
                    C3759b.this.m4819w();
                    C3759b.this.f4417k = 0;
                }
                return null;
            }
        }
    }

    /* renamed from: h.b$b */
    public static final class b implements ThreadFactory {
        public b() {
        }

        public /* synthetic */ b(a aVar) {
            this();
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    /* renamed from: h.b$c */
    public final class c {

        /* renamed from: a */
        public final d f4422a;

        /* renamed from: b */
        public final boolean[] f4423b;

        /* renamed from: c */
        public boolean f4424c;

        public /* synthetic */ c(C3759b c3759b, d dVar, a aVar) {
            this(dVar);
        }

        /* renamed from: a */
        public void m4825a() {
            C3759b.this.m4810k(this, false);
        }

        /* renamed from: b */
        public void m4826b() {
            if (this.f4424c) {
                return;
            }
            try {
                m4825a();
            } catch (IOException unused) {
            }
        }

        /* renamed from: e */
        public void m4827e() {
            C3759b.this.m4810k(this, true);
            this.f4424c = true;
        }

        /* renamed from: f */
        public File m4828f(int i4) {
            File fileM4839k;
            synchronized (C3759b.this) {
                if (this.f4422a.f4431f != this) {
                    throw new IllegalStateException();
                }
                if (!this.f4422a.f4430e) {
                    this.f4423b[i4] = true;
                }
                fileM4839k = this.f4422a.m4839k(i4);
                if (!C3759b.this.f4407a.exists()) {
                    C3759b.this.f4407a.mkdirs();
                }
            }
            return fileM4839k;
        }

        public c(d dVar) {
            this.f4422a = dVar;
            this.f4423b = dVar.f4430e ? null : new boolean[C3759b.this.f4413g];
        }
    }

    /* renamed from: h.b$d */
    public final class d {

        /* renamed from: a */
        public final String f4426a;

        /* renamed from: b */
        public final long[] f4427b;

        /* renamed from: c */
        public File[] f4428c;

        /* renamed from: d */
        public File[] f4429d;

        /* renamed from: e */
        public boolean f4430e;

        /* renamed from: f */
        public c f4431f;

        /* renamed from: g */
        public long f4432g;

        public /* synthetic */ d(C3759b c3759b, String str, a aVar) {
            this(str);
        }

        /* renamed from: j */
        public File m4838j(int i4) {
            return this.f4428c[i4];
        }

        /* renamed from: k */
        public File m4839k(int i4) {
            return this.f4429d[i4];
        }

        /* renamed from: l */
        public String m4840l() {
            StringBuilder sb = new StringBuilder();
            for (long j4 : this.f4427b) {
                sb.append(' ');
                sb.append(j4);
            }
            return sb.toString();
        }

        /* renamed from: m */
        public final IOException m4841m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* renamed from: n */
        public final void m4842n(String[] strArr) throws IOException {
            if (strArr.length != C3759b.this.f4413g) {
                throw m4841m(strArr);
            }
            for (int i4 = 0; i4 < strArr.length; i4++) {
                try {
                    this.f4427b[i4] = Long.parseLong(strArr[i4]);
                } catch (NumberFormatException unused) {
                    throw m4841m(strArr);
                }
            }
        }

        public d(String str) {
            this.f4426a = str;
            this.f4427b = new long[C3759b.this.f4413g];
            this.f4428c = new File[C3759b.this.f4413g];
            this.f4429d = new File[C3759b.this.f4413g];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i4 = 0; i4 < C3759b.this.f4413g; i4++) {
                sb.append(i4);
                this.f4428c[i4] = new File(C3759b.this.f4407a, sb.toString());
                sb.append(".tmp");
                this.f4429d[i4] = new File(C3759b.this.f4407a, sb.toString());
                sb.setLength(length);
            }
        }
    }

    /* renamed from: h.b$e */
    public final class e {

        /* renamed from: a */
        public final String f4434a;

        /* renamed from: b */
        public final long f4435b;

        /* renamed from: c */
        public final long[] f4436c;

        /* renamed from: d */
        public final File[] f4437d;

        public /* synthetic */ e(C3759b c3759b, String str, long j4, File[] fileArr, long[] jArr, a aVar) {
            this(str, j4, fileArr, jArr);
        }

        /* renamed from: a */
        public File m4843a(int i4) {
            return this.f4437d[i4];
        }

        public e(String str, long j4, File[] fileArr, long[] jArr) {
            this.f4434a = str;
            this.f4435b = j4;
            this.f4437d = fileArr;
            this.f4436c = jArr;
        }
    }

    public C3759b(File file, int i4, int i5, long j4) {
        this.f4407a = file;
        this.f4411e = i4;
        this.f4408b = new File(file, "journal");
        this.f4409c = new File(file, "journal.tmp");
        this.f4410d = new File(file, "journal.bkp");
        this.f4413g = i5;
        this.f4412f = j4;
    }

    /* renamed from: j */
    public static void m4804j(Writer writer) throws IOException {
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
    public static void m4805m(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: p */
    public static void m4806p(Writer writer) throws IOException {
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
    public static C3759b m4807s(File file, int i4, int i5, long j4) throws IOException {
        if (j4 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i5 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                m4808y(file2, file3, false);
            }
        }
        C3759b c3759b = new C3759b(file, i4, i5, j4);
        if (c3759b.f4408b.exists()) {
            try {
                c3759b.m4817u();
                c3759b.m4816t();
                return c3759b;
            } catch (IOException e4) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e4.getMessage() + ", removing");
                c3759b.m4811l();
            }
        }
        file.mkdirs();
        C3759b c3759b2 = new C3759b(file, i4, i5, j4);
        c3759b2.m4819w();
        return c3759b2;
    }

    /* renamed from: y */
    public static void m4808y(File file, File file2, boolean z3) throws IOException {
        if (z3) {
            m4805m(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.f4415i == null) {
            return;
        }
        Iterator it = new ArrayList(this.f4416j.values()).iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar.f4431f != null) {
                dVar.f4431f.m4825a();
            }
        }
        m4821z();
        m4804j(this.f4415i);
        this.f4415i = null;
    }

    /* renamed from: i */
    public final void m4809i() {
        if (this.f4415i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: k */
    public final synchronized void m4810k(c cVar, boolean z3) {
        d dVar = cVar.f4422a;
        if (dVar.f4431f != cVar) {
            throw new IllegalStateException();
        }
        if (z3 && !dVar.f4430e) {
            for (int i4 = 0; i4 < this.f4413g; i4++) {
                if (!cVar.f4423b[i4]) {
                    cVar.m4825a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i4);
                }
                if (!dVar.m4839k(i4).exists()) {
                    cVar.m4825a();
                    return;
                }
            }
        }
        for (int i5 = 0; i5 < this.f4413g; i5++) {
            File fileM4839k = dVar.m4839k(i5);
            if (!z3) {
                m4805m(fileM4839k);
            } else if (fileM4839k.exists()) {
                File fileM4838j = dVar.m4838j(i5);
                fileM4839k.renameTo(fileM4838j);
                long j4 = dVar.f4427b[i5];
                long length = fileM4838j.length();
                dVar.f4427b[i5] = length;
                this.f4414h = (this.f4414h - j4) + length;
            }
        }
        this.f4417k++;
        dVar.f4431f = null;
        if (dVar.f4430e || z3) {
            dVar.f4430e = true;
            this.f4415i.append((CharSequence) "CLEAN");
            this.f4415i.append(' ');
            this.f4415i.append((CharSequence) dVar.f4426a);
            this.f4415i.append((CharSequence) dVar.m4840l());
            this.f4415i.append('\n');
            if (z3) {
                long j5 = this.f4418l;
                this.f4418l = 1 + j5;
                dVar.f4432g = j5;
            }
        } else {
            this.f4416j.remove(dVar.f4426a);
            this.f4415i.append((CharSequence) "REMOVE");
            this.f4415i.append(' ');
            this.f4415i.append((CharSequence) dVar.f4426a);
            this.f4415i.append('\n');
        }
        m4806p(this.f4415i);
        if (this.f4414h > this.f4412f || m4815r()) {
            this.f4419m.submit(this.f4420n);
        }
    }

    /* renamed from: l */
    public void m4811l() throws IOException {
        close();
        AbstractC3761d.m4849b(this.f4407a);
    }

    /* renamed from: n */
    public c m4812n(String str) {
        return m4813o(str, -1L);
    }

    /* renamed from: o */
    public final synchronized c m4813o(String str, long j4) {
        m4809i();
        d dVar = (d) this.f4416j.get(str);
        a aVar = null;
        if (j4 != -1 && (dVar == null || dVar.f4432g != j4)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, aVar);
            this.f4416j.put(str, dVar);
        } else if (dVar.f4431f != null) {
            return null;
        }
        c cVar = new c(this, dVar, aVar);
        dVar.f4431f = cVar;
        this.f4415i.append((CharSequence) "DIRTY");
        this.f4415i.append(' ');
        this.f4415i.append((CharSequence) str);
        this.f4415i.append('\n');
        m4806p(this.f4415i);
        return cVar;
    }

    /* renamed from: q */
    public synchronized e m4814q(String str) {
        m4809i();
        d dVar = (d) this.f4416j.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f4430e) {
            return null;
        }
        for (File file : dVar.f4428c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f4417k++;
        this.f4415i.append((CharSequence) "READ");
        this.f4415i.append(' ');
        this.f4415i.append((CharSequence) str);
        this.f4415i.append('\n');
        if (m4815r()) {
            this.f4419m.submit(this.f4420n);
        }
        return new e(this, str, dVar.f4432g, dVar.f4428c, dVar.f4427b, null);
    }

    /* renamed from: r */
    public final boolean m4815r() {
        int i4 = this.f4417k;
        return i4 >= 2000 && i4 >= this.f4416j.size();
    }

    /* renamed from: t */
    public final void m4816t() throws IOException {
        m4805m(this.f4409c);
        Iterator it = this.f4416j.values().iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            int i4 = 0;
            if (dVar.f4431f == null) {
                while (i4 < this.f4413g) {
                    this.f4414h += dVar.f4427b[i4];
                    i4++;
                }
            } else {
                dVar.f4431f = null;
                while (i4 < this.f4413g) {
                    m4805m(dVar.m4838j(i4));
                    m4805m(dVar.m4839k(i4));
                    i4++;
                }
                it.remove();
            }
        }
    }

    /* renamed from: u */
    public final void m4817u() throws IOException {
        C3760c c3760c = new C3760c(new FileInputStream(this.f4408b), AbstractC3761d.f4445a);
        try {
            String strM4847d = c3760c.m4847d();
            String strM4847d2 = c3760c.m4847d();
            String strM4847d3 = c3760c.m4847d();
            String strM4847d4 = c3760c.m4847d();
            String strM4847d5 = c3760c.m4847d();
            if (!"libcore.io.DiskLruCache".equals(strM4847d) || !SdkVersion.MINI_VERSION.equals(strM4847d2) || !Integer.toString(this.f4411e).equals(strM4847d3) || !Integer.toString(this.f4413g).equals(strM4847d4) || !"".equals(strM4847d5)) {
                throw new IOException("unexpected journal header: [" + strM4847d + ", " + strM4847d2 + ", " + strM4847d4 + ", " + strM4847d5 + "]");
            }
            int i4 = 0;
            while (true) {
                try {
                    m4818v(c3760c.m4847d());
                    i4++;
                } catch (EOFException unused) {
                    this.f4417k = i4 - this.f4416j.size();
                    if (c3760c.m4846c()) {
                        m4819w();
                    } else {
                        this.f4415i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f4408b, true), AbstractC3761d.f4445a));
                    }
                    AbstractC3761d.m4848a(c3760c);
                    return;
                }
            }
        } catch (Throwable th) {
            AbstractC3761d.m4848a(c3760c);
            throw th;
        }
    }

    /* renamed from: v */
    public final void m4818v(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i4 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i4);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i4);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.f4416j.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i4, iIndexOf2);
        }
        d dVar = (d) this.f4416j.get(strSubstring);
        a aVar = null;
        if (dVar == null) {
            dVar = new d(this, strSubstring, aVar);
            this.f4416j.put(strSubstring, dVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            dVar.f4430e = true;
            dVar.f4431f = null;
            dVar.m4842n(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            dVar.f4431f = new c(this, dVar, aVar);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* renamed from: w */
    public final synchronized void m4819w() {
        Writer writer = this.f4415i;
        if (writer != null) {
            m4804j(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f4409c), AbstractC3761d.f4445a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write(SdkVersion.MINI_VERSION);
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f4411e));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f4413g));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (d dVar : this.f4416j.values()) {
                if (dVar.f4431f != null) {
                    bufferedWriter.write("DIRTY " + dVar.f4426a + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + dVar.f4426a + dVar.m4840l() + '\n');
                }
            }
            m4804j(bufferedWriter);
            if (this.f4408b.exists()) {
                m4808y(this.f4408b, this.f4410d, true);
            }
            m4808y(this.f4409c, this.f4408b, false);
            this.f4410d.delete();
            this.f4415i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f4408b, true), AbstractC3761d.f4445a));
        } catch (Throwable th) {
            m4804j(bufferedWriter);
            throw th;
        }
    }

    /* renamed from: x */
    public synchronized boolean m4820x(String str) {
        m4809i();
        d dVar = (d) this.f4416j.get(str);
        if (dVar != null && dVar.f4431f == null) {
            for (int i4 = 0; i4 < this.f4413g; i4++) {
                File fileM4838j = dVar.m4838j(i4);
                if (fileM4838j.exists() && !fileM4838j.delete()) {
                    throw new IOException("failed to delete " + fileM4838j);
                }
                this.f4414h -= dVar.f4427b[i4];
                dVar.f4427b[i4] = 0;
            }
            this.f4417k++;
            this.f4415i.append((CharSequence) "REMOVE");
            this.f4415i.append(' ');
            this.f4415i.append((CharSequence) str);
            this.f4415i.append('\n');
            this.f4416j.remove(str);
            if (m4815r()) {
                this.f4419m.submit(this.f4420n);
            }
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public final void m4821z() {
        while (this.f4414h > this.f4412f) {
            m4820x((String) ((Map.Entry) this.f4416j.entrySet().iterator().next()).getKey());
        }
    }
}
