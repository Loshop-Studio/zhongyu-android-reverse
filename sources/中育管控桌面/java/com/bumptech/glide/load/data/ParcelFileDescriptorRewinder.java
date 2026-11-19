package com.bumptech.glide.load.data;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.data.InterfaceC4693e;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class ParcelFileDescriptorRewinder implements InterfaceC4693e {

    /* renamed from: a */
    public final InternalRewinder f2284a;

    @RequiresApi(21)
    public static final class InternalRewinder {

        /* renamed from: a */
        public final ParcelFileDescriptor f2285a;

        public InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.f2285a = parcelFileDescriptor;
        }

        public ParcelFileDescriptor rewind() throws IOException, ErrnoException {
            try {
                Os.lseek(this.f2285a.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return this.f2285a;
            } catch (ErrnoException e6) {
                throw new IOException(e6);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$a */
    public static final class C4688a implements InterfaceC4693e.a {
        @Override // com.bumptech.glide.load.data.InterfaceC4693e.a
        /* renamed from: a */
        public Class mo2577a() {
            return ParcelFileDescriptor.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC4693e.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC4693e mo2578b(ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }
    }

    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f2284a = new InternalRewinder(parcelFileDescriptor);
    }

    /* renamed from: c */
    public static boolean m2573c() {
        return !"robolectric".equals(Build.FINGERPRINT);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC4693e
    /* renamed from: b */
    public void mo2575b() {
    }

    @Override // com.bumptech.glide.load.data.InterfaceC4693e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public ParcelFileDescriptor mo2574a() {
        return this.f2284a.rewind();
    }
}
