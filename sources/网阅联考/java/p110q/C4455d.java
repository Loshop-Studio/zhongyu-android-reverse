package p110q;

import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p057f0.C3731b;
import p062g0.AbstractC3741a;
import p076j.C3794d;
import p081k.InterfaceC3843d;
import p110q.InterfaceC4464m;

/* renamed from: q.d */
/* loaded from: classes2.dex */
public class C4455d implements InterfaceC4464m {

    /* renamed from: q.d$a */
    public static final class a implements InterfaceC3843d {

        /* renamed from: a */
        public final File f5153a;

        public a(File file) {
            this.f5153a = file;
        }

        @Override // p081k.InterfaceC3843d
        /* renamed from: a */
        public Class mo5114a() {
            return ByteBuffer.class;
        }

        @Override // p081k.InterfaceC3843d
        /* renamed from: b */
        public void mo5119b() {
        }

        @Override // p081k.InterfaceC3843d
        public void cancel() {
        }

        @Override // p081k.InterfaceC3843d
        /* renamed from: d */
        public DataSource mo5121d() {
            return DataSource.LOCAL;
        }

        @Override // p081k.InterfaceC3843d
        /* renamed from: f */
        public void mo5123f(Priority priority, InterfaceC3843d.a aVar) {
            try {
                aVar.mo1830e(AbstractC3741a.m4737a(this.f5153a));
            } catch (IOException e4) {
                Log.isLoggable("ByteBufferFileLoader", 3);
                aVar.mo1829c(e4);
            }
        }
    }

    /* renamed from: q.d$b */
    public static class b implements InterfaceC4465n {
        @Override // p110q.InterfaceC4465n
        /* renamed from: b */
        public InterfaceC4464m mo5675b(C4468q c4468q) {
            return new C4455d();
        }
    }

    @Override // p110q.InterfaceC4464m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC4464m.a mo5671b(File file, int i4, int i5, C3794d c3794d) {
        return new InterfaceC4464m.a(new C3731b(file), new a(file));
    }

    @Override // p110q.InterfaceC4464m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo5670a(File file) {
        return true;
    }
}
