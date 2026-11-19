package p194o0;

import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p080d1.C7737b;
import p091e1.AbstractC7829a;
import p122h0.C8084d;
import p132i0.InterfaceC8115d;
import p194o0.InterfaceC9146m;

/* renamed from: o0.d */
/* loaded from: classes3.dex */
public class C9137d implements InterfaceC9146m {

    /* renamed from: o0.d$b */
    public static class b implements InterfaceC9147n {
        @Override // p194o0.InterfaceC9147n
        /* renamed from: b */
        public InterfaceC9146m mo14660b(C9150q c9150q) {
            return new C9137d();
        }
    }

    @Override // p194o0.InterfaceC9146m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9146m.a mo14656b(File file, int i9, int i10, C8084d c8084d) {
        return new InterfaceC9146m.a(new C7737b(file), new a(file));
    }

    @Override // p194o0.InterfaceC9146m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo14655a(File file) {
        return true;
    }

    /* renamed from: o0.d$a */
    public static final class a implements InterfaceC8115d {

        /* renamed from: a */
        public final File f15384a;

        public a(File file) {
            this.f15384a = file;
        }

        @Override // p132i0.InterfaceC8115d
        /* renamed from: a */
        public Class mo12978a() {
            return ByteBuffer.class;
        }

        @Override // p132i0.InterfaceC8115d
        /* renamed from: d */
        public void mo12985d(Priority priority, InterfaceC8115d.a aVar) {
            try {
                aVar.mo3155f(AbstractC7829a.m12225a(this.f15384a));
            } catch (IOException e10) {
                Log.isLoggable("ByteBufferFileLoader", 3);
                aVar.mo3154c(e10);
            }
        }

        @Override // p132i0.InterfaceC8115d
        /* renamed from: e */
        public DataSource mo12986e() {
            return DataSource.LOCAL;
        }

        @Override // p132i0.InterfaceC8115d
        /* renamed from: b */
        public void mo12983b() {
        }

        @Override // p132i0.InterfaceC8115d
        public void cancel() {
        }
    }
}
