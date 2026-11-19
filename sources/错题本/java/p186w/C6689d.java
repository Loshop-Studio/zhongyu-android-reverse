package p186w;

import android.os.Build;
import android.os.StrictMode;
import coil3.disk.C3284b;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p140q.C6400d;

/* renamed from: w.d */
/* loaded from: classes2.dex */
public final class C6689d implements Closeable {

    /* renamed from: a */
    public final File f11286a;

    /* renamed from: b */
    public final File f11287b;

    /* renamed from: c */
    public final File f11288c;

    /* renamed from: d */
    public final File f11289d;

    /* renamed from: f */
    public final long f11291f;

    /* renamed from: i */
    public BufferedWriter f11294i;

    /* renamed from: k */
    public int f11296k;

    /* renamed from: h */
    public long f11293h = 0;

    /* renamed from: j */
    public final LinkedHashMap f11295j = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: l */
    public long f11297l = 0;

    /* renamed from: m */
    public final ThreadPoolExecutor f11298m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC6687b());

    /* renamed from: n */
    public final CallableC6686a f11299n = new CallableC6686a(this);

    /* renamed from: e */
    public final int f11290e = 1;

    /* renamed from: g */
    public final int f11292g = 1;

    public C6689d(File file, long j7) {
        this.f11286a = file;
        this.f11287b = new File(file, "journal");
        this.f11288c = new File(file, "journal.tmp");
        this.f11289d = new File(file, "journal.bkp");
        this.f11291f = j7;
    }

    /* renamed from: a */
    public static void m6382a(C6689d c6689d, C3284b c3284b, boolean z8) {
        synchronized (c6689d) {
            C6688c c6688c = (C6688c) c3284b.f1935c;
            if (c6688c.f11284f != c3284b) {
                throw new IllegalStateException();
            }
            if (z8 && !c6688c.f11283e) {
                for (int i = 0; i < c6689d.f11292g; i++) {
                    if (!c3284b.f1933a[i]) {
                        c3284b.m2209a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    if (!c6688c.f11282d[i].exists()) {
                        c3284b.m2209a();
                        return;
                    }
                }
            }
            for (int i8 = 0; i8 < c6689d.f11292g; i8++) {
                File file = c6688c.f11282d[i8];
                if (!z8) {
                    m6384c(file);
                } else if (file.exists()) {
                    File file2 = c6688c.f11281c[i8];
                    file.renameTo(file2);
                    long j7 = c6688c.f11280b[i8];
                    long length = file2.length();
                    c6688c.f11280b[i8] = length;
                    c6689d.f11293h = (c6689d.f11293h - j7) + length;
                }
            }
            c6689d.f11296k++;
            c6688c.f11284f = null;
            if (c6688c.f11283e || z8) {
                c6688c.f11283e = true;
                c6689d.f11294i.append((CharSequence) "CLEAN");
                c6689d.f11294i.append(' ');
                c6689d.f11294i.append((CharSequence) c6688c.f11279a);
                c6689d.f11294i.append((CharSequence) c6688c.m6381a());
                c6689d.f11294i.append('\n');
                if (z8) {
                    c6689d.f11297l++;
                }
            } else {
                c6689d.f11295j.remove(c6688c.f11279a);
                c6689d.f11294i.append((CharSequence) "REMOVE");
                c6689d.f11294i.append(' ');
                c6689d.f11294i.append((CharSequence) c6688c.f11279a);
                c6689d.f11294i.append('\n');
            }
            m6385e(c6689d.f11294i);
            if (c6689d.f11293h > c6689d.f11291f || c6689d.m6390g()) {
                c6689d.f11298m.submit(c6689d.f11299n);
            }
        }
    }

    /* renamed from: b */
    public static void m6383b(BufferedWriter bufferedWriter) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: c */
    public static void m6384c(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: e */
    public static void m6385e(BufferedWriter bufferedWriter) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: h */
    public static C6689d m6386h(File file, long j7) throws IOException {
        if (j7 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                m6387o(file2, file3, false);
            }
        }
        C6689d c6689d = new C6689d(file, j7);
        if (c6689d.f11287b.exists()) {
            try {
                c6689d.m6392l();
                c6689d.m6391k();
                return c6689d;
            } catch (IOException e) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                c6689d.close();
                AbstractC6692g.m6397a(c6689d.f11286a);
            }
        }
        file.mkdirs();
        C6689d c6689d2 = new C6689d(file, j7);
        c6689d2.m6394n();
        return c6689d2;
    }

    /* renamed from: o */
    public static void m6387o(File file, File file2, boolean z8) throws IOException {
        if (z8) {
            m6384c(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f11294i == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f11295j.values());
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                C3284b c3284b = ((C6688c) obj).f11284f;
                if (c3284b != null) {
                    c3284b.m2209a();
                }
            }
            m6395p();
            m6383b(this.f11294i);
            this.f11294i = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: d */
    public final C3284b m6388d(String str) {
        synchronized (this) {
            try {
                if (this.f11294i == null) {
                    throw new IllegalStateException("cache is closed");
                }
                C6688c c6688c = (C6688c) this.f11295j.get(str);
                if (c6688c == null) {
                    c6688c = new C6688c(this, str);
                    this.f11295j.put(str, c6688c);
                } else if (c6688c.f11284f != null) {
                    return null;
                }
                C3284b c3284b = new C3284b(this, c6688c);
                c6688c.f11284f = c3284b;
                this.f11294i.append((CharSequence) "DIRTY");
                this.f11294i.append(' ');
                this.f11294i.append((CharSequence) str);
                this.f11294i.append('\n');
                m6385e(this.f11294i);
                return c3284b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: f */
    public final synchronized C6400d m6389f(String str) {
        if (this.f11294i == null) {
            throw new IllegalStateException("cache is closed");
        }
        C6688c c6688c = (C6688c) this.f11295j.get(str);
        if (c6688c == null) {
            return null;
        }
        if (!c6688c.f11283e) {
            return null;
        }
        for (File file : c6688c.f11281c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f11296k++;
        this.f11294i.append((CharSequence) "READ");
        this.f11294i.append(' ');
        this.f11294i.append((CharSequence) str);
        this.f11294i.append('\n');
        if (m6390g()) {
            this.f11298m.submit(this.f11299n);
        }
        return new C6400d(c6688c.f11281c);
    }

    /* renamed from: g */
    public final boolean m6390g() {
        int i = this.f11296k;
        return i >= 2000 && i >= this.f11295j.size();
    }

    /* renamed from: k */
    public final void m6391k() throws IOException {
        m6384c(this.f11288c);
        Iterator it = this.f11295j.values().iterator();
        while (it.hasNext()) {
            C6688c c6688c = (C6688c) it.next();
            C3284b c3284b = c6688c.f11284f;
            int i = this.f11292g;
            int i8 = 0;
            if (c3284b == null) {
                while (i8 < i) {
                    this.f11293h += c6688c.f11280b[i8];
                    i8++;
                }
            } else {
                c6688c.f11284f = null;
                while (i8 < i) {
                    m6384c(c6688c.f11281c[i8]);
                    m6384c(c6688c.f11282d[i8]);
                    i8++;
                }
                it.remove();
            }
        }
    }

    /* renamed from: l */
    public final void m6392l() {
        File file = this.f11287b;
        C6691f c6691f = new C6691f(new FileInputStream(file), AbstractC6692g.f11306a);
        try {
            String strM6396a = c6691f.m6396a();
            String strM6396a2 = c6691f.m6396a();
            String strM6396a3 = c6691f.m6396a();
            String strM6396a4 = c6691f.m6396a();
            String strM6396a5 = c6691f.m6396a();
            if (!"libcore.io.DiskLruCache".equals(strM6396a) || !"1".equals(strM6396a2) || !Integer.toString(this.f11290e).equals(strM6396a3) || !Integer.toString(this.f11292g).equals(strM6396a4) || !"".equals(strM6396a5)) {
                throw new IOException("unexpected journal header: [" + strM6396a + ", " + strM6396a2 + ", " + strM6396a4 + ", " + strM6396a5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    m6393m(c6691f.m6396a());
                    i++;
                } catch (EOFException unused) {
                    this.f11296k = i - this.f11295j.size();
                    if (c6691f.f11305e == -1) {
                        m6394n();
                    } else {
                        this.f11294i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), AbstractC6692g.f11306a));
                    }
                    try {
                        c6691f.close();
                        return;
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                c6691f.close();
            } catch (RuntimeException e4) {
                throw e4;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    /* renamed from: m */
    public final void m6393m(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        LinkedHashMap linkedHashMap = this.f11295j;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        C6688c c6688c = (C6688c) linkedHashMap.get(strSubstring);
        if (c6688c == null) {
            c6688c = new C6688c(this, strSubstring);
            linkedHashMap.put(strSubstring, c6688c);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                c6688c.f11284f = new C3284b(this, c6688c);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        c6688c.f11283e = true;
        c6688c.f11284f = null;
        if (strArrSplit.length != c6688c.f11285g.f11292g) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
        }
        for (int i8 = 0; i8 < strArrSplit.length; i8++) {
            try {
                c6688c.f11280b[i8] = Long.parseLong(strArrSplit[i8]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
        }
    }

    /* renamed from: n */
    public final synchronized void m6394n() {
        try {
            BufferedWriter bufferedWriter = this.f11294i;
            if (bufferedWriter != null) {
                m6383b(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f11288c), AbstractC6692g.f11306a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write(SignParameters.NEW_LINE);
                bufferedWriter2.write("1");
                bufferedWriter2.write(SignParameters.NEW_LINE);
                bufferedWriter2.write(Integer.toString(this.f11290e));
                bufferedWriter2.write(SignParameters.NEW_LINE);
                bufferedWriter2.write(Integer.toString(this.f11292g));
                bufferedWriter2.write(SignParameters.NEW_LINE);
                bufferedWriter2.write(SignParameters.NEW_LINE);
                for (C6688c c6688c : this.f11295j.values()) {
                    if (c6688c.f11284f != null) {
                        bufferedWriter2.write("DIRTY " + c6688c.f11279a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + c6688c.f11279a + c6688c.m6381a() + '\n');
                    }
                }
                m6383b(bufferedWriter2);
                if (this.f11287b.exists()) {
                    m6387o(this.f11287b, this.f11289d, true);
                }
                m6387o(this.f11288c, this.f11287b, false);
                this.f11289d.delete();
                this.f11294i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f11287b, true), AbstractC6692g.f11306a));
            } catch (Throwable th) {
                m6383b(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: p */
    public final void m6395p() {
        while (this.f11293h > this.f11291f) {
            String str = (String) ((Map.Entry) this.f11295j.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.f11294i == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    C6688c c6688c = (C6688c) this.f11295j.get(str);
                    if (c6688c != null && c6688c.f11284f == null) {
                        for (int i = 0; i < this.f11292g; i++) {
                            File file = c6688c.f11281c[i];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j7 = this.f11293h;
                            long[] jArr = c6688c.f11280b;
                            this.f11293h = j7 - jArr[i];
                            jArr[i] = 0;
                        }
                        this.f11296k++;
                        this.f11294i.append((CharSequence) "REMOVE");
                        this.f11294i.append(' ');
                        this.f11294i.append((CharSequence) str);
                        this.f11294i.append('\n');
                        this.f11295j.remove(str);
                        if (m6390g()) {
                            this.f11298m.submit(this.f11299n);
                        }
                    }
                } finally {
                }
            }
        }
    }
}
