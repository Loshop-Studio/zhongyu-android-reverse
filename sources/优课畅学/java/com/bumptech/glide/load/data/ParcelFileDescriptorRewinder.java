package com.bumptech.glide.load.data;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.data.InterfaceC5406e;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class ParcelFileDescriptorRewinder implements InterfaceC5406e {

    /* renamed from: a */
    public final InternalRewinder f2926a;

    @RequiresApi(21)
    public static final class InternalRewinder {

        /* renamed from: a */
        public final ParcelFileDescriptor f2927a;

        public InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.f2927a = parcelFileDescriptor;
        }

        public ParcelFileDescriptor rewind() throws IOException, ErrnoException {
            try {
                Os.lseek(this.f2927a.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return this.f2927a;
            } catch (ErrnoException e10) {
                throw new IOException(e10);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$a */
    public static final class C5401a implements InterfaceC5406e.a {
        @Override // com.bumptech.glide.load.data.InterfaceC5406e.a
        /* renamed from: a */
        public Class mo2843a() {
            return ParcelFileDescriptor.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5406e.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC5406e mo2844b(ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }
    }

    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f2926a = new InternalRewinder(parcelFileDescriptor);
    }

    /* renamed from: c */
    public static boolean m2839c() {
        return !"robolectric".equals(Build.FINGERPRINT);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5406e
    /* renamed from: b */
    public void mo2841b() {
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5406e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public ParcelFileDescriptor mo2840a() {
        return this.f2926a.rewind();
    }
}
