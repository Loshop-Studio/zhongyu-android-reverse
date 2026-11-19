package p254n0;

import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC5824d;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p039c1.C5222d;
import p109d1.AbstractC8900a;
import p168h0.C9438e;
import p254n0.InterfaceC10300n;

/* renamed from: n0.d */
/* loaded from: classes3.dex */
public class C10290d implements InterfaceC10300n {

    /* renamed from: n0.d$b */
    public static class b implements InterfaceC10301o {
        @Override // p254n0.InterfaceC10301o
        /* renamed from: c */
        public InterfaceC10300n mo21425c(C10304r c10304r) {
            return new C10290d();
        }
    }

    @Override // p254n0.InterfaceC10300n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC10300n.a mo21421b(File file, int i10, int i11, C9438e c9438e) {
        return new InterfaceC10300n.a(new C5222d(file), new a(file));
    }

    @Override // p254n0.InterfaceC10300n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo21420a(File file) {
        return true;
    }

    /* renamed from: n0.d$a */
    public static final class a implements InterfaceC5824d {

        /* renamed from: c */
        public final File f24492c;

        public a(File file) {
            this.f24492c = file;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5824d
        /* renamed from: a */
        public Class mo4051a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5824d
        /* renamed from: c */
        public void mo4057c(Priority priority, InterfaceC5824d.a aVar) {
            try {
                aVar.mo4063d(AbstractC8900a.m17435a(this.f24492c));
            } catch (IOException e10) {
                Log.isLoggable("ByteBufferFileLoader", 3);
                aVar.mo4062b(e10);
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5824d
        public DataSource getDataSource() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5824d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5824d
        public void cleanup() {
        }
    }
}
