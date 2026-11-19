package p081k;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.IOException;
import p081k.InterfaceC3844e;

/* renamed from: k.m */
/* loaded from: classes2.dex */
public final class C3852m implements InterfaceC3844e {

    /* renamed from: a */
    public final b f4761a;

    /* renamed from: k.m$a */
    public static final class a implements InterfaceC3844e.a {
        @Override // p081k.InterfaceC3844e.a
        /* renamed from: a */
        public Class mo5129a() {
            return ParcelFileDescriptor.class;
        }

        @Override // p081k.InterfaceC3844e.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC3844e mo5130b(ParcelFileDescriptor parcelFileDescriptor) {
            return new C3852m(parcelFileDescriptor);
        }
    }

    /* renamed from: k.m$b */
    public static final class b {

        /* renamed from: a */
        public final ParcelFileDescriptor f4762a;

        public b(ParcelFileDescriptor parcelFileDescriptor) {
            this.f4762a = parcelFileDescriptor;
        }

        /* renamed from: a */
        public ParcelFileDescriptor m5148a() throws IOException, ErrnoException {
            try {
                Os.lseek(this.f4762a.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return this.f4762a;
            } catch (ErrnoException e4) {
                throw new IOException(e4);
            }
        }
    }

    public C3852m(ParcelFileDescriptor parcelFileDescriptor) {
        this.f4761a = new b(parcelFileDescriptor);
    }

    /* renamed from: c */
    public static boolean m5145c() {
        return true;
    }

    @Override // p081k.InterfaceC3844e
    /* renamed from: b */
    public void mo5128b() {
    }

    @Override // p081k.InterfaceC3844e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public ParcelFileDescriptor mo5127a() {
        return this.f4761a.m5148a();
    }
}
