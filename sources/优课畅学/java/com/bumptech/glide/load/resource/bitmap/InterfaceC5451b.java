package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.AbstractC5400a;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.C5412k;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p116h0.AbstractC8697a;
import p116h0.AbstractC8706j;
import p193o.InterfaceC9498b;

/* renamed from: com.bumptech.glide.load.resource.bitmap.b */
/* loaded from: classes3.dex */
public interface InterfaceC5451b {

    /* renamed from: com.bumptech.glide.load.resource.bitmap.b$a */
    public static final class a implements InterfaceC5451b {

        /* renamed from: a */
        public final ByteBuffer f3200a;

        /* renamed from: b */
        public final List f3201b;

        /* renamed from: c */
        public final InterfaceC9498b f3202c;

        public a(ByteBuffer byteBuffer, List list, InterfaceC9498b interfaceC9498b) {
            this.f3200a = byteBuffer;
            this.f3201b = list;
            this.f3202c = interfaceC9498b;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC5451b
        /* renamed from: a */
        public Bitmap mo3106a(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(m3110e(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC5451b
        /* renamed from: b */
        public void mo3107b() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC5451b
        /* renamed from: c */
        public int mo3108c() {
            return AbstractC5400a.m2831c(this.f3201b, AbstractC8697a.m14151d(this.f3200a), this.f3202c);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC5451b
        /* renamed from: d */
        public ImageHeaderParser.ImageType mo3109d() {
            return AbstractC5400a.m2835g(this.f3201b, AbstractC8697a.m14151d(this.f3200a));
        }

        /* renamed from: e */
        public final InputStream m3110e() {
            return AbstractC8697a.m14154g(AbstractC8697a.m14151d(this.f3200a));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.b$b */
    public static final class b implements InterfaceC5451b {

        /* renamed from: a */
        public final C5412k f3203a;

        /* renamed from: b */
        public final InterfaceC9498b f3204b;

        /* renamed from: c */
        public final List f3205c;

        public b(InputStream inputStream, List list, InterfaceC9498b interfaceC9498b) {
            this.f3204b = (InterfaceC9498b) AbstractC8706j.m14181d(interfaceC9498b);
            this.f3205c = (List) AbstractC8706j.m14181d(list);
            this.f3203a = new C5412k(inputStream, interfaceC9498b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC5451b
        /* renamed from: a */
        public Bitmap mo3106a(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(this.f3203a.mo2840a(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC5451b
        /* renamed from: b */
        public void mo3107b() {
            this.f3203a.m2873c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC5451b
        /* renamed from: c */
        public int mo3108c() {
            return AbstractC5400a.m2830b(this.f3205c, this.f3203a.mo2840a(), this.f3204b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC5451b
        /* renamed from: d */
        public ImageHeaderParser.ImageType mo3109d() {
            return AbstractC5400a.m2834f(this.f3205c, this.f3203a.mo2840a(), this.f3204b);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.b$c */
    public static final class c implements InterfaceC5451b {

        /* renamed from: a */
        public final InterfaceC9498b f3206a;

        /* renamed from: b */
        public final List f3207b;

        /* renamed from: c */
        public final ParcelFileDescriptorRewinder f3208c;

        public c(ParcelFileDescriptor parcelFileDescriptor, List list, InterfaceC9498b interfaceC9498b) {
            this.f3206a = (InterfaceC9498b) AbstractC8706j.m14181d(interfaceC9498b);
            this.f3207b = (List) AbstractC8706j.m14181d(list);
            this.f3208c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC5451b
        /* renamed from: a */
        public Bitmap mo3106a(BitmapFactory.Options options) {
            return BitmapFactory.decodeFileDescriptor(this.f3208c.mo2840a().getFileDescriptor(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC5451b
        /* renamed from: b */
        public void mo3107b() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC5451b
        /* renamed from: c */
        public int mo3108c() {
            return AbstractC5400a.m2829a(this.f3207b, this.f3208c, this.f3206a);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC5451b
        /* renamed from: d */
        public ImageHeaderParser.ImageType mo3109d() {
            return AbstractC5400a.m2833e(this.f3207b, this.f3208c, this.f3206a);
        }
    }

    /* renamed from: a */
    Bitmap mo3106a(BitmapFactory.Options options);

    /* renamed from: b */
    void mo3107b();

    /* renamed from: c */
    int mo3108c();

    /* renamed from: d */
    ImageHeaderParser.ImageType mo3109d();
}
