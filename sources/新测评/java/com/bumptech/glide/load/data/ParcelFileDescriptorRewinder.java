package com.bumptech.glide.load.data;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.data.InterfaceC5357e;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class ParcelFileDescriptorRewinder implements InterfaceC5357e {

    /* renamed from: a */
    public final InternalRewinder f3493a;

    @RequiresApi(21)
    public static final class InternalRewinder {

        /* renamed from: a */
        public final ParcelFileDescriptor f3494a;

        public InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.f3494a = parcelFileDescriptor;
        }

        public ParcelFileDescriptor rewind() throws IOException, ErrnoException {
            try {
                Os.lseek(this.f3494a.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return this.f3494a;
            } catch (ErrnoException e10) {
                throw new IOException(e10);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$a */
    public static final class C5352a implements InterfaceC5357e.a {
        @Override // com.bumptech.glide.load.data.InterfaceC5357e.a
        /* renamed from: a */
        public Class mo3396a() {
            return ParcelFileDescriptor.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5357e.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC5357e mo3397b(ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }
    }

    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f3493a = new InternalRewinder(parcelFileDescriptor);
    }

    /* renamed from: c */
    public static boolean m3392c() {
        return !"robolectric".equals(Build.FINGERPRINT);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5357e
    /* renamed from: b */
    public void mo3394b() {
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5357e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public ParcelFileDescriptor mo3393a() {
        return this.f3493a.rewind();
    }
}
