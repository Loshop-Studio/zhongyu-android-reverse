package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.AbstractC4687a;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.C4699k;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p016b1.AbstractC4399a;
import p016b1.AbstractC4408j;
import p074i0.InterfaceC6497b;

/* renamed from: com.bumptech.glide.load.resource.bitmap.b */
/* loaded from: classes3.dex */
public interface InterfaceC4738b {

    /* renamed from: com.bumptech.glide.load.resource.bitmap.b$a */
    public static final class a implements InterfaceC4738b {

        /* renamed from: a */
        public final ByteBuffer f2558a;

        /* renamed from: b */
        public final List f2559b;

        /* renamed from: c */
        public final InterfaceC6497b f2560c;

        public a(ByteBuffer byteBuffer, List list, InterfaceC6497b interfaceC6497b) {
            this.f2558a = byteBuffer;
            this.f2559b = list;
            this.f2560c = interfaceC6497b;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC4738b
        /* renamed from: a */
        public Bitmap mo2841a(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(m2845e(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC4738b
        /* renamed from: b */
        public void mo2842b() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC4738b
        /* renamed from: c */
        public int mo2843c() {
            return AbstractC4687a.m2565c(this.f2559b, AbstractC4399a.m1408d(this.f2558a), this.f2560c);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC4738b
        /* renamed from: d */
        public ImageHeaderParser.ImageType mo2844d() {
            return AbstractC4687a.m2569g(this.f2559b, AbstractC4399a.m1408d(this.f2558a));
        }

        /* renamed from: e */
        public final InputStream m2845e() {
            return AbstractC4399a.m1411g(AbstractC4399a.m1408d(this.f2558a));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.b$b */
    public static final class b implements InterfaceC4738b {

        /* renamed from: a */
        public final C4699k f2561a;

        /* renamed from: b */
        public final InterfaceC6497b f2562b;

        /* renamed from: c */
        public final List f2563c;

        public b(InputStream inputStream, List list, InterfaceC6497b interfaceC6497b) {
            this.f2562b = (InterfaceC6497b) AbstractC4408j.m1438d(interfaceC6497b);
            this.f2563c = (List) AbstractC4408j.m1438d(list);
            this.f2561a = new C4699k(inputStream, interfaceC6497b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC4738b
        /* renamed from: a */
        public Bitmap mo2841a(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(this.f2561a.mo2574a(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC4738b
        /* renamed from: b */
        public void mo2842b() {
            this.f2561a.m2608c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC4738b
        /* renamed from: c */
        public int mo2843c() {
            return AbstractC4687a.m2564b(this.f2563c, this.f2561a.mo2574a(), this.f2562b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC4738b
        /* renamed from: d */
        public ImageHeaderParser.ImageType mo2844d() {
            return AbstractC4687a.m2568f(this.f2563c, this.f2561a.mo2574a(), this.f2562b);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.b$c */
    public static final class c implements InterfaceC4738b {

        /* renamed from: a */
        public final InterfaceC6497b f2564a;

        /* renamed from: b */
        public final List f2565b;

        /* renamed from: c */
        public final ParcelFileDescriptorRewinder f2566c;

        public c(ParcelFileDescriptor parcelFileDescriptor, List list, InterfaceC6497b interfaceC6497b) {
            this.f2564a = (InterfaceC6497b) AbstractC4408j.m1438d(interfaceC6497b);
            this.f2565b = (List) AbstractC4408j.m1438d(list);
            this.f2566c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC4738b
        /* renamed from: a */
        public Bitmap mo2841a(BitmapFactory.Options options) {
            return BitmapFactory.decodeFileDescriptor(this.f2566c.mo2574a().getFileDescriptor(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC4738b
        /* renamed from: b */
        public void mo2842b() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC4738b
        /* renamed from: c */
        public int mo2843c() {
            return AbstractC4687a.m2563a(this.f2565b, this.f2566c, this.f2564a);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC4738b
        /* renamed from: d */
        public ImageHeaderParser.ImageType mo2844d() {
            return AbstractC4687a.m2567e(this.f2565b, this.f2566c, this.f2564a);
        }
    }

    /* renamed from: a */
    Bitmap mo2841a(BitmapFactory.Options options);

    /* renamed from: b */
    void mo2842b();

    /* renamed from: c */
    int mo2843c();

    /* renamed from: d */
    ImageHeaderParser.ImageType mo2844d();
}
