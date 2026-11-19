package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.AbstractC5477a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.util.List;
import p091e1.AbstractC7837i;
import p132i0.C8122k;
import p132i0.C8124m;
import p164l0.InterfaceC8865b;

/* renamed from: com.bumptech.glide.load.resource.bitmap.b */
/* loaded from: classes3.dex */
public interface InterfaceC5506b {

    /* renamed from: com.bumptech.glide.load.resource.bitmap.b$a */
    public static final class a implements InterfaceC5506b {

        /* renamed from: a */
        public final C8122k f3552a;

        /* renamed from: b */
        public final InterfaceC8865b f3553b;

        /* renamed from: c */
        public final List f3554c;

        public a(InputStream inputStream, List list, InterfaceC8865b interfaceC8865b) {
            this.f3553b = (InterfaceC8865b) AbstractC7837i.m12256d(interfaceC8865b);
            this.f3554c = (List) AbstractC7837i.m12256d(list);
            this.f3552a = new C8122k(inputStream, interfaceC8865b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC5506b
        /* renamed from: a */
        public Bitmap mo3285a(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(this.f3552a.mo12991a(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC5506b
        /* renamed from: b */
        public void mo3286b() {
            this.f3552a.m13006c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC5506b
        /* renamed from: c */
        public int mo3287c() {
            return AbstractC5477a.m3082b(this.f3554c, this.f3552a.mo12991a(), this.f3553b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC5506b
        /* renamed from: d */
        public ImageHeaderParser.ImageType mo3288d() {
            return AbstractC5477a.m3085e(this.f3554c, this.f3552a.mo12991a(), this.f3553b);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.b$b */
    public static final class b implements InterfaceC5506b {

        /* renamed from: a */
        public final InterfaceC8865b f3555a;

        /* renamed from: b */
        public final List f3556b;

        /* renamed from: c */
        public final C8124m f3557c;

        public b(ParcelFileDescriptor parcelFileDescriptor, List list, InterfaceC8865b interfaceC8865b) {
            this.f3555a = (InterfaceC8865b) AbstractC7837i.m12256d(interfaceC8865b);
            this.f3556b = (List) AbstractC7837i.m12256d(list);
            this.f3557c = new C8124m(parcelFileDescriptor);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC5506b
        /* renamed from: a */
        public Bitmap mo3285a(BitmapFactory.Options options) {
            return BitmapFactory.decodeFileDescriptor(this.f3557c.mo12991a().getFileDescriptor(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC5506b
        /* renamed from: b */
        public void mo3286b() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC5506b
        /* renamed from: c */
        public int mo3287c() {
            return AbstractC5477a.m3081a(this.f3556b, this.f3557c, this.f3555a);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC5506b
        /* renamed from: d */
        public ImageHeaderParser.ImageType mo3288d() {
            return AbstractC5477a.m3084d(this.f3556b, this.f3557c, this.f3555a);
        }
    }

    /* renamed from: a */
    Bitmap mo3285a(BitmapFactory.Options options);

    /* renamed from: b */
    void mo3286b();

    /* renamed from: c */
    int mo3287c();

    /* renamed from: d */
    ImageHeaderParser.ImageType mo3288d();
}
