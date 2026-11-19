package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.AbstractC5351a;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.C5363k;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p117i1.AbstractC7642a;
import p117i1.AbstractC7651j;
import p195p0.InterfaceC8802b;

/* renamed from: com.bumptech.glide.load.resource.bitmap.b */
/* loaded from: classes3.dex */
public interface InterfaceC5402b {

    /* renamed from: com.bumptech.glide.load.resource.bitmap.b$a */
    public static final class a implements InterfaceC5402b {

        /* renamed from: a */
        public final ByteBuffer f3767a;

        /* renamed from: b */
        public final List f3768b;

        /* renamed from: c */
        public final InterfaceC8802b f3769c;

        public a(ByteBuffer byteBuffer, List list, InterfaceC8802b interfaceC8802b) {
            this.f3767a = byteBuffer;
            this.f3768b = list;
            this.f3769c = interfaceC8802b;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC5402b
        /* renamed from: a */
        public Bitmap mo3661a(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(m3665e(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC5402b
        /* renamed from: b */
        public void mo3662b() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC5402b
        /* renamed from: c */
        public int mo3663c() {
            return AbstractC5351a.m3384c(this.f3768b, AbstractC7642a.m12653d(this.f3767a), this.f3769c);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC5402b
        /* renamed from: d */
        public ImageHeaderParser.ImageType mo3664d() {
            return AbstractC5351a.m3388g(this.f3768b, AbstractC7642a.m12653d(this.f3767a));
        }

        /* renamed from: e */
        public final InputStream m3665e() {
            return AbstractC7642a.m12656g(AbstractC7642a.m12653d(this.f3767a));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.b$b */
    public static final class b implements InterfaceC5402b {

        /* renamed from: a */
        public final C5363k f3770a;

        /* renamed from: b */
        public final InterfaceC8802b f3771b;

        /* renamed from: c */
        public final List f3772c;

        public b(InputStream inputStream, List list, InterfaceC8802b interfaceC8802b) {
            this.f3771b = (InterfaceC8802b) AbstractC7651j.m12683d(interfaceC8802b);
            this.f3772c = (List) AbstractC7651j.m12683d(list);
            this.f3770a = new C5363k(inputStream, interfaceC8802b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC5402b
        /* renamed from: a */
        public Bitmap mo3661a(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(this.f3770a.mo3393a(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC5402b
        /* renamed from: b */
        public void mo3662b() {
            this.f3770a.m3427c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC5402b
        /* renamed from: c */
        public int mo3663c() {
            return AbstractC5351a.m3383b(this.f3772c, this.f3770a.mo3393a(), this.f3771b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC5402b
        /* renamed from: d */
        public ImageHeaderParser.ImageType mo3664d() {
            return AbstractC5351a.m3387f(this.f3772c, this.f3770a.mo3393a(), this.f3771b);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.b$c */
    public static final class c implements InterfaceC5402b {

        /* renamed from: a */
        public final InterfaceC8802b f3773a;

        /* renamed from: b */
        public final List f3774b;

        /* renamed from: c */
        public final ParcelFileDescriptorRewinder f3775c;

        public c(ParcelFileDescriptor parcelFileDescriptor, List list, InterfaceC8802b interfaceC8802b) {
            this.f3773a = (InterfaceC8802b) AbstractC7651j.m12683d(interfaceC8802b);
            this.f3774b = (List) AbstractC7651j.m12683d(list);
            this.f3775c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC5402b
        /* renamed from: a */
        public Bitmap mo3661a(BitmapFactory.Options options) {
            return BitmapFactory.decodeFileDescriptor(this.f3775c.mo3393a().getFileDescriptor(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC5402b
        /* renamed from: b */
        public void mo3662b() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC5402b
        /* renamed from: c */
        public int mo3663c() {
            return AbstractC5351a.m3382a(this.f3774b, this.f3775c, this.f3773a);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC5402b
        /* renamed from: d */
        public ImageHeaderParser.ImageType mo3664d() {
            return AbstractC5351a.m3386e(this.f3774b, this.f3775c, this.f3773a);
        }
    }

    /* renamed from: a */
    Bitmap mo3661a(BitmapFactory.Options options);

    /* renamed from: b */
    void mo3662b();

    /* renamed from: c */
    int mo3663c();

    /* renamed from: d */
    ImageHeaderParser.ImageType mo3664d();
}
