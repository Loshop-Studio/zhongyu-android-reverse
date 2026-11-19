package p340t1;

import com.danikula.videocache.ProxyCacheException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import p329s1.InterfaceC11034a;

/* renamed from: t1.b */
/* loaded from: classes3.dex */
public class C11201b implements InterfaceC11034a {

    /* renamed from: a */
    public final InterfaceC11200a f26888a;

    /* renamed from: b */
    public File f26889b;

    /* renamed from: c */
    public RandomAccessFile f26890c;

    public C11201b(File file, InterfaceC11200a interfaceC11200a) throws ProxyCacheException {
        File file2;
        try {
            if (interfaceC11200a == null) {
                throw new NullPointerException();
            }
            this.f26888a = interfaceC11200a;
            AbstractC11203d.m24914b(file.getParentFile());
            boolean zExists = file.exists();
            if (zExists) {
                file2 = file;
            } else {
                file2 = new File(file.getParentFile(), file.getName() + ".download");
            }
            this.f26889b = file2;
            this.f26890c = new RandomAccessFile(this.f26889b, zExists ? "r" : "rw");
        } catch (IOException e10) {
            throw new ProxyCacheException("Error using file " + file + " as disc cache", e10);
        }
    }

    @Override // p329s1.InterfaceC11034a
    /* renamed from: a */
    public synchronized void mo24387a(byte[] bArr, int i10) {
        try {
            if (isCompleted()) {
                throw new ProxyCacheException("Error append cache: cache file " + this.f26889b + " is completed!");
            }
            this.f26890c.seek(available());
            this.f26890c.write(bArr, 0, i10);
        } catch (IOException e10) {
            throw new ProxyCacheException(String.format("Error writing %d bytes to %s from buffer with size %d", Integer.valueOf(i10), this.f26890c, Integer.valueOf(bArr.length)), e10);
        }
    }

    @Override // p329s1.InterfaceC11034a
    public synchronized long available() {
        try {
        } catch (IOException e10) {
            throw new ProxyCacheException("Error reading length of file " + this.f26889b, e10);
        }
        return (int) this.f26890c.length();
    }

    @Override // p329s1.InterfaceC11034a
    /* renamed from: b */
    public synchronized int mo24388b(byte[] bArr, long j10, int i10) {
        try {
            this.f26890c.seek(j10);
        } catch (IOException e10) {
            throw new ProxyCacheException(String.format("Error reading %d bytes with offset %d from file[%d bytes] to buffer[%d bytes]", Integer.valueOf(i10), Long.valueOf(j10), Long.valueOf(available()), Integer.valueOf(bArr.length)), e10);
        }
        return this.f26890c.read(bArr, 0, i10);
    }

    /* renamed from: c */
    public final boolean m24911c(File file) {
        return file.getName().endsWith(".download");
    }

    @Override // p329s1.InterfaceC11034a
    public synchronized void close() {
        try {
            this.f26890c.close();
            this.f26888a.mo24910a(this.f26889b);
        } catch (IOException e10) {
            throw new ProxyCacheException("Error closing file " + this.f26889b, e10);
        }
    }

    @Override // p329s1.InterfaceC11034a
    public synchronized void complete() {
        if (isCompleted()) {
            return;
        }
        close();
        File file = new File(this.f26889b.getParentFile(), this.f26889b.getName().substring(0, this.f26889b.getName().length() - 9));
        if (!this.f26889b.renameTo(file)) {
            throw new ProxyCacheException("Error renaming file " + this.f26889b + " to " + file + " for completion!");
        }
        this.f26889b = file;
        try {
            this.f26890c = new RandomAccessFile(this.f26889b, "r");
            this.f26888a.mo24910a(this.f26889b);
        } catch (IOException e10) {
            throw new ProxyCacheException("Error opening " + this.f26889b + " as disc cache", e10);
        }
    }

    @Override // p329s1.InterfaceC11034a
    public synchronized boolean isCompleted() {
        return !m24911c(this.f26889b);
    }
}
