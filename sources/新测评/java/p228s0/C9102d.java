package p228s0;

import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC5356d;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p106h1.C7617b;
import p117i1.AbstractC7642a;
import p162m0.C8539d;
import p228s0.InterfaceC9112n;

/* renamed from: s0.d */
/* loaded from: classes3.dex */
public class C9102d implements InterfaceC9112n {

    /* renamed from: s0.d$b */
    public static class b implements InterfaceC9113o {
        @Override // p228s0.InterfaceC9113o
        /* renamed from: d */
        public InterfaceC9112n mo15359d(C9116r c9116r) {
            return new C9102d();
        }
    }

    @Override // p228s0.InterfaceC9112n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9112n.a mo15355b(File file, int i10, int i11, C8539d c8539d) {
        return new InterfaceC9112n.a(new C7617b(file), new a(file));
    }

    @Override // p228s0.InterfaceC9112n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo15354a(File file) {
        return true;
    }

    /* renamed from: s0.d$a */
    public static final class a implements InterfaceC5356d {

        /* renamed from: a */
        public final File f15734a;

        public a(File file) {
            this.f15734a = file;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5356d
        /* renamed from: a */
        public Class mo3399a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5356d
        /* renamed from: d */
        public DataSource mo3406d() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5356d
        /* renamed from: e */
        public void mo3407e(Priority priority, InterfaceC5356d.a aVar) {
            try {
                aVar.mo3413f(AbstractC7642a.m12650a(this.f15734a));
            } catch (IOException e10) {
                Log.isLoggable("ByteBufferFileLoader", 3);
                aVar.mo3412c(e10);
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5356d
        /* renamed from: b */
        public void mo3404b() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5356d
        public void cancel() {
        }
    }
}
