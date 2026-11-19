package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.AbstractC2864a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.util.List;
import p062g0.AbstractC3749i;
import p081k.C3850k;
import p081k.C3852m;
import p098n.InterfaceC4393b;

/* renamed from: com.bumptech.glide.load.resource.bitmap.b */
/* loaded from: classes2.dex */
public interface InterfaceC2893b {

    /* renamed from: com.bumptech.glide.load.resource.bitmap.b$a */
    public static final class a implements InterfaceC2893b {

        /* renamed from: a */
        public final C3850k f898a;

        /* renamed from: b */
        public final InterfaceC4393b f899b;

        /* renamed from: c */
        public final List f900c;

        public a(InputStream inputStream, List list, InterfaceC4393b interfaceC4393b) {
            this.f899b = (InterfaceC4393b) AbstractC3749i.m4768d(interfaceC4393b);
            this.f900c = (List) AbstractC3749i.m4768d(list);
            this.f898a = new C3850k(inputStream, interfaceC4393b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC2893b
        /* renamed from: a */
        public int mo1961a() {
            return AbstractC2864a.m1756a(this.f900c, this.f898a.mo5127a(), this.f899b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC2893b
        /* renamed from: b */
        public Bitmap mo1962b(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(this.f898a.mo5127a(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC2893b
        /* renamed from: c */
        public void mo1963c() {
            this.f898a.m5142c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC2893b
        /* renamed from: d */
        public ImageHeaderParser.ImageType mo1964d() {
            return AbstractC2864a.m1759d(this.f900c, this.f898a.mo5127a(), this.f899b);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.b$b */
    public static final class b implements InterfaceC2893b {

        /* renamed from: a */
        public final InterfaceC4393b f901a;

        /* renamed from: b */
        public final List f902b;

        /* renamed from: c */
        public final C3852m f903c;

        public b(ParcelFileDescriptor parcelFileDescriptor, List list, InterfaceC4393b interfaceC4393b) {
            this.f901a = (InterfaceC4393b) AbstractC3749i.m4768d(interfaceC4393b);
            this.f902b = (List) AbstractC3749i.m4768d(list);
            this.f903c = new C3852m(parcelFileDescriptor);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC2893b
        /* renamed from: a */
        public int mo1961a() {
            return AbstractC2864a.m1757b(this.f902b, this.f903c, this.f901a);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC2893b
        /* renamed from: b */
        public Bitmap mo1962b(BitmapFactory.Options options) {
            return BitmapFactory.decodeFileDescriptor(this.f903c.mo5127a().getFileDescriptor(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC2893b
        /* renamed from: c */
        public void mo1963c() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC2893b
        /* renamed from: d */
        public ImageHeaderParser.ImageType mo1964d() {
            return AbstractC2864a.m1761f(this.f902b, this.f903c, this.f901a);
        }
    }

    /* renamed from: a */
    int mo1961a();

    /* renamed from: b */
    Bitmap mo1962b(BitmapFactory.Options options);

    /* renamed from: c */
    void mo1963c();

    /* renamed from: d */
    ImageHeaderParser.ImageType mo1964d();
}
