package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.AbstractC5819a;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.C5831k;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p109d1.AbstractC8900a;
import p109d1.AbstractC8909j;
import p213k0.InterfaceC9770b;

/* renamed from: com.bumptech.glide.load.resource.bitmap.b */
/* loaded from: classes3.dex */
public interface InterfaceC5870b {

    /* renamed from: com.bumptech.glide.load.resource.bitmap.b$a */
    public static final class a implements InterfaceC5870b {

        /* renamed from: a */
        public final ByteBuffer f4970a;

        /* renamed from: b */
        public final List f4971b;

        /* renamed from: c */
        public final InterfaceC9770b f4972c;

        public a(ByteBuffer byteBuffer, List list, InterfaceC9770b interfaceC9770b) {
            this.f4970a = byteBuffer;
            this.f4971b = list;
            this.f4972c = interfaceC9770b;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC5870b
        /* renamed from: a */
        public Bitmap mo4310a(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(m4314e(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC5870b
        /* renamed from: b */
        public void mo4311b() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC5870b
        /* renamed from: c */
        public int mo4312c() {
            return AbstractC5819a.m4037c(this.f4971b, AbstractC8900a.m17438d(this.f4970a), this.f4972c);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC5870b
        /* renamed from: d */
        public ImageHeaderParser.ImageType mo4313d() {
            return AbstractC5819a.m4041g(this.f4971b, AbstractC8900a.m17438d(this.f4970a));
        }

        /* renamed from: e */
        public final InputStream m4314e() {
            return AbstractC8900a.m17441g(AbstractC8900a.m17438d(this.f4970a));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.b$b */
    public static final class b implements InterfaceC5870b {

        /* renamed from: a */
        public final C5831k f4973a;

        /* renamed from: b */
        public final InterfaceC9770b f4974b;

        /* renamed from: c */
        public final List f4975c;

        public b(InputStream inputStream, List list, InterfaceC9770b interfaceC9770b) {
            this.f4974b = (InterfaceC9770b) AbstractC8909j.m17468d(interfaceC9770b);
            this.f4975c = (List) AbstractC8909j.m17468d(list);
            this.f4973a = new C5831k(inputStream, interfaceC9770b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC5870b
        /* renamed from: a */
        public Bitmap mo4310a(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(this.f4973a.mo4046a(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC5870b
        /* renamed from: b */
        public void mo4311b() {
            this.f4973a.m4077b();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC5870b
        /* renamed from: c */
        public int mo4312c() {
            return AbstractC5819a.m4036b(this.f4975c, this.f4973a.mo4046a(), this.f4974b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC5870b
        /* renamed from: d */
        public ImageHeaderParser.ImageType mo4313d() {
            return AbstractC5819a.m4040f(this.f4975c, this.f4973a.mo4046a(), this.f4974b);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.b$c */
    public static final class c implements InterfaceC5870b {

        /* renamed from: a */
        public final InterfaceC9770b f4976a;

        /* renamed from: b */
        public final List f4977b;

        /* renamed from: c */
        public final ParcelFileDescriptorRewinder f4978c;

        public c(ParcelFileDescriptor parcelFileDescriptor, List list, InterfaceC9770b interfaceC9770b) {
            this.f4976a = (InterfaceC9770b) AbstractC8909j.m17468d(interfaceC9770b);
            this.f4977b = (List) AbstractC8909j.m17468d(list);
            this.f4978c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC5870b
        /* renamed from: a */
        public Bitmap mo4310a(BitmapFactory.Options options) {
            return BitmapFactory.decodeFileDescriptor(this.f4978c.mo4046a().getFileDescriptor(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC5870b
        /* renamed from: b */
        public void mo4311b() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC5870b
        /* renamed from: c */
        public int mo4312c() {
            return AbstractC5819a.m4035a(this.f4977b, this.f4978c, this.f4976a);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC5870b
        /* renamed from: d */
        public ImageHeaderParser.ImageType mo4313d() {
            return AbstractC5819a.m4039e(this.f4977b, this.f4978c, this.f4976a);
        }
    }

    /* renamed from: a */
    Bitmap mo4310a(BitmapFactory.Options options);

    /* renamed from: b */
    void mo4311b();

    /* renamed from: c */
    int mo4312c();

    /* renamed from: d */
    ImageHeaderParser.ImageType mo4313d();
}
