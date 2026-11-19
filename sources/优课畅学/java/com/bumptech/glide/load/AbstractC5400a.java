package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p116h0.AbstractC8697a;
import p193o.InterfaceC9498b;

/* renamed from: com.bumptech.glide.load.a */
/* loaded from: classes3.dex */
public abstract class AbstractC5400a {

    /* renamed from: com.bumptech.glide.load.a$a */
    public class a implements h {

        /* renamed from: a */
        public final /* synthetic */ InputStream f2916a;

        public a(InputStream inputStream) {
            this.f2916a = inputStream;
        }

        @Override // com.bumptech.glide.load.AbstractC5400a.h
        /* renamed from: a */
        public ImageHeaderParser.ImageType mo2837a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.mo2826d(this.f2916a);
            } finally {
                this.f2916a.reset();
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$b */
    public class b implements h {

        /* renamed from: a */
        public final /* synthetic */ ByteBuffer f2917a;

        public b(ByteBuffer byteBuffer) {
            this.f2917a = byteBuffer;
        }

        @Override // com.bumptech.glide.load.AbstractC5400a.h
        /* renamed from: a */
        public ImageHeaderParser.ImageType mo2837a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.mo2824b(this.f2917a);
            } finally {
                AbstractC8697a.m14151d(this.f2917a);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$c */
    public class c implements h {

        /* renamed from: a */
        public final /* synthetic */ ParcelFileDescriptorRewinder f2918a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC9498b f2919b;

        public c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC9498b interfaceC9498b) {
            this.f2918a = parcelFileDescriptorRewinder;
            this.f2919b = interfaceC9498b;
        }

        @Override // com.bumptech.glide.load.AbstractC5400a.h
        /* renamed from: a */
        public ImageHeaderParser.ImageType mo2837a(ImageHeaderParser imageHeaderParser) throws Throwable {
            RecyclableBufferedInputStream recyclableBufferedInputStream = null;
            try {
                RecyclableBufferedInputStream recyclableBufferedInputStream2 = new RecyclableBufferedInputStream(new FileInputStream(this.f2918a.mo2840a().getFileDescriptor()), this.f2919b);
                try {
                    ImageHeaderParser.ImageType imageTypeMo2826d = imageHeaderParser.mo2826d(recyclableBufferedInputStream2);
                    recyclableBufferedInputStream2.m3051c();
                    this.f2918a.mo2840a();
                    return imageTypeMo2826d;
                } catch (Throwable th) {
                    th = th;
                    recyclableBufferedInputStream = recyclableBufferedInputStream2;
                    if (recyclableBufferedInputStream != null) {
                        recyclableBufferedInputStream.m3051c();
                    }
                    this.f2918a.mo2840a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$d */
    public class d implements g {

        /* renamed from: a */
        public final /* synthetic */ ByteBuffer f2920a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC9498b f2921b;

        public d(ByteBuffer byteBuffer, InterfaceC9498b interfaceC9498b) {
            this.f2920a = byteBuffer;
            this.f2921b = interfaceC9498b;
        }

        @Override // com.bumptech.glide.load.AbstractC5400a.g
        /* renamed from: a */
        public int mo2838a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.mo2823a(this.f2920a, this.f2921b);
            } finally {
                AbstractC8697a.m14151d(this.f2920a);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$e */
    public class e implements g {

        /* renamed from: a */
        public final /* synthetic */ InputStream f2922a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC9498b f2923b;

        public e(InputStream inputStream, InterfaceC9498b interfaceC9498b) {
            this.f2922a = inputStream;
            this.f2923b = interfaceC9498b;
        }

        @Override // com.bumptech.glide.load.AbstractC5400a.g
        /* renamed from: a */
        public int mo2838a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.mo2825c(this.f2922a, this.f2923b);
            } finally {
                this.f2922a.reset();
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$f */
    public class f implements g {

        /* renamed from: a */
        public final /* synthetic */ ParcelFileDescriptorRewinder f2924a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC9498b f2925b;

        public f(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC9498b interfaceC9498b) {
            this.f2924a = parcelFileDescriptorRewinder;
            this.f2925b = interfaceC9498b;
        }

        @Override // com.bumptech.glide.load.AbstractC5400a.g
        /* renamed from: a */
        public int mo2838a(ImageHeaderParser imageHeaderParser) throws Throwable {
            RecyclableBufferedInputStream recyclableBufferedInputStream = null;
            try {
                RecyclableBufferedInputStream recyclableBufferedInputStream2 = new RecyclableBufferedInputStream(new FileInputStream(this.f2924a.mo2840a().getFileDescriptor()), this.f2925b);
                try {
                    int iMo2825c = imageHeaderParser.mo2825c(recyclableBufferedInputStream2, this.f2925b);
                    recyclableBufferedInputStream2.m3051c();
                    this.f2924a.mo2840a();
                    return iMo2825c;
                } catch (Throwable th) {
                    th = th;
                    recyclableBufferedInputStream = recyclableBufferedInputStream2;
                    if (recyclableBufferedInputStream != null) {
                        recyclableBufferedInputStream.m3051c();
                    }
                    this.f2924a.mo2840a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$g */
    public interface g {
        /* renamed from: a */
        int mo2838a(ImageHeaderParser imageHeaderParser);
    }

    /* renamed from: com.bumptech.glide.load.a$h */
    public interface h {
        /* renamed from: a */
        ImageHeaderParser.ImageType mo2837a(ImageHeaderParser imageHeaderParser);
    }

    /* renamed from: a */
    public static int m2829a(List list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC9498b interfaceC9498b) {
        return m2832d(list, new f(parcelFileDescriptorRewinder, interfaceC9498b));
    }

    /* renamed from: b */
    public static int m2830b(List list, InputStream inputStream, InterfaceC9498b interfaceC9498b) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, interfaceC9498b);
        }
        inputStream.mark(5242880);
        return m2832d(list, new e(inputStream, interfaceC9498b));
    }

    /* renamed from: c */
    public static int m2831c(List list, ByteBuffer byteBuffer, InterfaceC9498b interfaceC9498b) {
        if (byteBuffer == null) {
            return -1;
        }
        return m2832d(list, new d(byteBuffer, interfaceC9498b));
    }

    /* renamed from: d */
    public static int m2832d(List list, g gVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iMo2838a = gVar.mo2838a((ImageHeaderParser) list.get(i10));
            if (iMo2838a != -1) {
                return iMo2838a;
            }
        }
        return -1;
    }

    /* renamed from: e */
    public static ImageHeaderParser.ImageType m2833e(List list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC9498b interfaceC9498b) {
        return m2836h(list, new c(parcelFileDescriptorRewinder, interfaceC9498b));
    }

    /* renamed from: f */
    public static ImageHeaderParser.ImageType m2834f(List list, InputStream inputStream, InterfaceC9498b interfaceC9498b) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, interfaceC9498b);
        }
        inputStream.mark(5242880);
        return m2836h(list, new a(inputStream));
    }

    /* renamed from: g */
    public static ImageHeaderParser.ImageType m2835g(List list, ByteBuffer byteBuffer) {
        return byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : m2836h(list, new b(byteBuffer));
    }

    /* renamed from: h */
    public static ImageHeaderParser.ImageType m2836h(List list, h hVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ImageHeaderParser.ImageType imageTypeMo2837a = hVar.mo2837a((ImageHeaderParser) list.get(i10));
            if (imageTypeMo2837a != ImageHeaderParser.ImageType.UNKNOWN) {
                return imageTypeMo2837a;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
