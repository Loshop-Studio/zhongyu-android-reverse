package p226r;

import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC5405d;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p105g0.C8514b;
import p116h0.AbstractC8697a;
import p160l.C9230d;
import p226r.InterfaceC9888n;

/* renamed from: r.d */
/* loaded from: classes3.dex */
public class C9878d implements InterfaceC9888n {

    /* renamed from: r.d$b */
    public static class b implements InterfaceC9889o {
        @Override // p226r.InterfaceC9889o
        /* renamed from: d */
        public InterfaceC9888n mo18450d(C9892r c9892r) {
            return new C9878d();
        }
    }

    @Override // p226r.InterfaceC9888n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9888n.a mo18446b(File file, int i10, int i11, C9230d c9230d) {
        return new InterfaceC9888n.a(new C8514b(file), new a(file));
    }

    @Override // p226r.InterfaceC9888n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo18445a(File file) {
        return true;
    }

    /* renamed from: r.d$a */
    public static final class a implements InterfaceC5405d {

        /* renamed from: a */
        public final File f19769a;

        public a(File file) {
            this.f19769a = file;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5405d
        /* renamed from: a */
        public Class mo2846a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5405d
        /* renamed from: d */
        public void mo2853d(Priority priority, InterfaceC5405d.a aVar) {
            try {
                aVar.mo2859e(AbstractC8697a.m14148a(this.f19769a));
            } catch (IOException e10) {
                Log.isLoggable("ByteBufferFileLoader", 3);
                aVar.mo2858c(e10);
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5405d
        public DataSource getDataSource() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5405d
        /* renamed from: b */
        public void mo2851b() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5405d
        public void cancel() {
        }
    }
}
