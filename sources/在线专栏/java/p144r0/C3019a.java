package p144r0;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: r0.a */
/* loaded from: classes.dex */
public class C3019a {

    /* renamed from: e */
    private static final Map<String, Lock> f11701e = new HashMap();

    /* renamed from: a */
    private final File f11702a;

    /* renamed from: b */
    private final Lock f11703b;

    /* renamed from: c */
    private final boolean f11704c;

    /* renamed from: d */
    private FileChannel f11705d;

    public C3019a(String str, File file, boolean z3) {
        File file2 = new File(file, str + ".lck");
        this.f11702a = file2;
        this.f11703b = m10136a(file2.getAbsolutePath());
        this.f11704c = z3;
    }

    /* renamed from: a */
    private static Lock m10136a(String str) {
        Lock reentrantLock;
        Map<String, Lock> map = f11701e;
        synchronized (map) {
            reentrantLock = map.get(str);
            if (reentrantLock == null) {
                reentrantLock = new ReentrantLock();
                map.put(str, reentrantLock);
            }
        }
        return reentrantLock;
    }

    /* renamed from: b */
    public void m10137b() throws IOException {
        this.f11703b.lock();
        if (this.f11704c) {
            try {
                FileChannel channel = new FileOutputStream(this.f11702a).getChannel();
                this.f11705d = channel;
                channel.lock();
            } catch (IOException e4) {
                throw new IllegalStateException("Unable to grab copy lock.", e4);
            }
        }
    }

    /* renamed from: c */
    public void m10138c() {
        FileChannel fileChannel = this.f11705d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f11703b.unlock();
    }
}
