package p097l0;

import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC4692d;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p002a1.C0007b;
import p016b1.AbstractC4399a;
import p053f0.C6285d;
import p097l0.InterfaceC7280n;

/* renamed from: l0.d */
/* loaded from: classes3.dex */
public class C7270d implements InterfaceC7280n {

    /* renamed from: l0.d$b */
    public static class b implements InterfaceC7281o {
        @Override // p097l0.InterfaceC7281o
        /* renamed from: d */
        public InterfaceC7280n mo8195d(C7284r c7284r) {
            return new C7270d();
        }
    }

    @Override // p097l0.InterfaceC7280n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC7280n.a mo8191b(File file, int i6, int i7, C6285d c6285d) {
        return new InterfaceC7280n.a(new C0007b(file), new a(file));
    }

    @Override // p097l0.InterfaceC7280n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo8190a(File file) {
        return true;
    }

    /* renamed from: l0.d$a */
    public static final class a implements InterfaceC4692d {

        /* renamed from: a */
        public final File f9180a;

        public a(File file) {
            this.f9180a = file;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC4692d
        /* renamed from: a */
        public Class mo2580a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC4692d
        /* renamed from: d */
        public DataSource mo2587d() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC4692d
        /* renamed from: e */
        public void mo2588e(Priority priority, InterfaceC4692d.a aVar) {
            try {
                aVar.mo2594f(AbstractC4399a.m1405a(this.f9180a));
            } catch (IOException e6) {
                Log.isLoggable("ByteBufferFileLoader", 3);
                aVar.mo2593c(e6);
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC4692d
        /* renamed from: b */
        public void mo2585b() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC4692d
        public void cancel() {
        }
    }
}
