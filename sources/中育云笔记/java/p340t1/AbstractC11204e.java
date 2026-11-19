package p340t1;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p329s1.AbstractC11039f;

/* renamed from: t1.e */
/* loaded from: classes3.dex */
public abstract class AbstractC11204e implements InterfaceC11200a {

    /* renamed from: a */
    public final ExecutorService f26891a = Executors.newSingleThreadExecutor();

    /* renamed from: t1.e$a */
    public class a implements Callable {

        /* renamed from: a */
        public final File f26892a;

        public a(File file) {
            this.f26892a = file;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws IOException {
            AbstractC11204e.this.m24923e(this.f26892a);
            return null;
        }
    }

    @Override // p340t1.InterfaceC11200a
    /* renamed from: a */
    public void mo24910a(File file) {
        this.f26891a.submit(new a(file));
    }

    /* renamed from: b */
    public abstract boolean mo24921b(File file, long j10, int i10);

    /* renamed from: d */
    public final long m24922d(List list) {
        Iterator it = list.iterator();
        long length = 0;
        while (it.hasNext()) {
            length += ((File) it.next()).length();
        }
        return length;
    }

    /* renamed from: e */
    public final void m24923e(File file) throws IOException {
        AbstractC11203d.m24917e(file);
        m24924f(AbstractC11203d.m24913a(file.getParentFile()));
    }

    /* renamed from: f */
    public final void m24924f(List list) {
        long jM24922d = m24922d(list);
        int size = list.size();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (!mo24921b(file, jM24922d, size)) {
                long length = file.length();
                if (file.delete()) {
                    size--;
                    jM24922d -= length;
                    AbstractC11039f.m24404d("Cache file " + file + " is deleted because it exceeds cache limit");
                } else {
                    AbstractC11039f.m24401a("Error deleting file " + file + " for trimming cache");
                }
            }
        }
    }
}
