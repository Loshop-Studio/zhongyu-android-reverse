package com.bumptech.glide.load.data;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.data.InterfaceC5825e;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class ParcelFileDescriptorRewinder implements InterfaceC5825e {

    /* renamed from: a */
    public final InternalRewinder f4696a;

    @RequiresApi(21)
    public static final class InternalRewinder {

        /* renamed from: a */
        public final ParcelFileDescriptor f4697a;

        public InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.f4697a = parcelFileDescriptor;
        }

        public ParcelFileDescriptor rewind() throws IOException, ErrnoException {
            try {
                Os.lseek(this.f4697a.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return this.f4697a;
            } catch (ErrnoException e10) {
                throw new IOException(e10);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$a */
    public static final class C5820a implements InterfaceC5825e.a {
        @Override // com.bumptech.glide.load.data.InterfaceC5825e.a
        /* renamed from: a */
        public Class mo4048a() {
            return ParcelFileDescriptor.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5825e.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC5825e mo4049b(ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }
    }

    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f4696a = new InternalRewinder(parcelFileDescriptor);
    }

    /* renamed from: b */
    public static boolean m4045b() {
        return !"robolectric".equals(Build.FINGERPRINT);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5825e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ParcelFileDescriptor mo4046a() {
        return this.f4696a.rewind();
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5825e
    public void cleanup() {
    }
}
