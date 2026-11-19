package p132i0;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.IOException;
import p132i0.InterfaceC8116e;

/* renamed from: i0.m */
/* loaded from: classes3.dex */
public final class C8124m implements InterfaceC8116e {

    /* renamed from: a */
    public final b f13893a;

    /* renamed from: i0.m$a */
    public static final class a implements InterfaceC8116e.a {
        @Override // p132i0.InterfaceC8116e.a
        /* renamed from: a */
        public Class mo12993a() {
            return ParcelFileDescriptor.class;
        }

        @Override // p132i0.InterfaceC8116e.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC8116e mo12994b(ParcelFileDescriptor parcelFileDescriptor) {
            return new C8124m(parcelFileDescriptor);
        }
    }

    /* renamed from: i0.m$b */
    public static final class b {

        /* renamed from: a */
        public final ParcelFileDescriptor f13894a;

        public b(ParcelFileDescriptor parcelFileDescriptor) {
            this.f13894a = parcelFileDescriptor;
        }

        /* renamed from: a */
        public ParcelFileDescriptor m13012a() throws IOException, ErrnoException {
            try {
                Os.lseek(this.f13894a.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return this.f13894a;
            } catch (ErrnoException e10) {
                throw new IOException(e10);
            }
        }
    }

    public C8124m(ParcelFileDescriptor parcelFileDescriptor) {
        this.f13893a = new b(parcelFileDescriptor);
    }

    /* renamed from: c */
    public static boolean m13009c() {
        return true;
    }

    @Override // p132i0.InterfaceC8116e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public ParcelFileDescriptor mo12991a() {
        return this.f13893a.m13012a();
    }

    @Override // p132i0.InterfaceC8116e
    /* renamed from: b */
    public void mo12992b() {
    }
}
