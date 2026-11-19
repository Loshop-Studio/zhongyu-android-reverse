package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p016b1.AbstractC4399a;
import p074i0.InterfaceC6497b;

/* renamed from: com.bumptech.glide.load.a */
/* loaded from: classes3.dex */
public abstract class AbstractC4687a {

    /* renamed from: com.bumptech.glide.load.a$a */
    public class a implements h {

        /* renamed from: a */
        public final /* synthetic */ InputStream f2274a;

        public a(InputStream inputStream) {
            this.f2274a = inputStream;
        }

        @Override // com.bumptech.glide.load.AbstractC4687a.h
        /* renamed from: a */
        public ImageHeaderParser.ImageType mo2571a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.mo2560d(this.f2274a);
            } finally {
                this.f2274a.reset();
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$b */
    public class b implements h {

        /* renamed from: a */
        public final /* synthetic */ ByteBuffer f2275a;

        public b(ByteBuffer byteBuffer) {
            this.f2275a = byteBuffer;
        }

        @Override // com.bumptech.glide.load.AbstractC4687a.h
        /* renamed from: a */
        public ImageHeaderParser.ImageType mo2571a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.mo2558b(this.f2275a);
            } finally {
                AbstractC4399a.m1408d(this.f2275a);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$c */
    public class c implements h {

        /* renamed from: a */
        public final /* synthetic */ ParcelFileDescriptorRewinder f2276a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC6497b f2277b;

        public c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC6497b interfaceC6497b) {
            this.f2276a = parcelFileDescriptorRewinder;
            this.f2277b = interfaceC6497b;
        }

        @Override // com.bumptech.glide.load.AbstractC4687a.h
        /* renamed from: a */
        public ImageHeaderParser.ImageType mo2571a(ImageHeaderParser imageHeaderParser) throws Throwable {
            RecyclableBufferedInputStream recyclableBufferedInputStream = null;
            try {
                RecyclableBufferedInputStream recyclableBufferedInputStream2 = new RecyclableBufferedInputStream(new FileInputStream(this.f2276a.mo2574a().getFileDescriptor()), this.f2277b);
                try {
                    ImageHeaderParser.ImageType imageTypeMo2560d = imageHeaderParser.mo2560d(recyclableBufferedInputStream2);
                    recyclableBufferedInputStream2.m2786g();
                    this.f2276a.mo2574a();
                    return imageTypeMo2560d;
                } catch (Throwable th) {
                    th = th;
                    recyclableBufferedInputStream = recyclableBufferedInputStream2;
                    if (recyclableBufferedInputStream != null) {
                        recyclableBufferedInputStream.m2786g();
                    }
                    this.f2276a.mo2574a();
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
        public final /* synthetic */ ByteBuffer f2278a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC6497b f2279b;

        public d(ByteBuffer byteBuffer, InterfaceC6497b interfaceC6497b) {
            this.f2278a = byteBuffer;
            this.f2279b = interfaceC6497b;
        }

        @Override // com.bumptech.glide.load.AbstractC4687a.g
        /* renamed from: a */
        public int mo2572a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.mo2559c(this.f2278a, this.f2279b);
            } finally {
                AbstractC4399a.m1408d(this.f2278a);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$e */
    public class e implements g {

        /* renamed from: a */
        public final /* synthetic */ InputStream f2280a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC6497b f2281b;

        public e(InputStream inputStream, InterfaceC6497b interfaceC6497b) {
            this.f2280a = inputStream;
            this.f2281b = interfaceC6497b;
        }

        @Override // com.bumptech.glide.load.AbstractC4687a.g
        /* renamed from: a */
        public int mo2572a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.mo2557a(this.f2280a, this.f2281b);
            } finally {
                this.f2280a.reset();
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$f */
    public class f implements g {

        /* renamed from: a */
        public final /* synthetic */ ParcelFileDescriptorRewinder f2282a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC6497b f2283b;

        public f(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC6497b interfaceC6497b) {
            this.f2282a = parcelFileDescriptorRewinder;
            this.f2283b = interfaceC6497b;
        }

        @Override // com.bumptech.glide.load.AbstractC4687a.g
        /* renamed from: a */
        public int mo2572a(ImageHeaderParser imageHeaderParser) throws Throwable {
            RecyclableBufferedInputStream recyclableBufferedInputStream = null;
            try {
                RecyclableBufferedInputStream recyclableBufferedInputStream2 = new RecyclableBufferedInputStream(new FileInputStream(this.f2282a.mo2574a().getFileDescriptor()), this.f2283b);
                try {
                    int iMo2557a = imageHeaderParser.mo2557a(recyclableBufferedInputStream2, this.f2283b);
                    recyclableBufferedInputStream2.m2786g();
                    this.f2282a.mo2574a();
                    return iMo2557a;
                } catch (Throwable th) {
                    th = th;
                    recyclableBufferedInputStream = recyclableBufferedInputStream2;
                    if (recyclableBufferedInputStream != null) {
                        recyclableBufferedInputStream.m2786g();
                    }
                    this.f2282a.mo2574a();
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
        int mo2572a(ImageHeaderParser imageHeaderParser);
    }

    /* renamed from: com.bumptech.glide.load.a$h */
    public interface h {
        /* renamed from: a */
        ImageHeaderParser.ImageType mo2571a(ImageHeaderParser imageHeaderParser);
    }

    /* renamed from: a */
    public static int m2563a(List list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC6497b interfaceC6497b) {
        return m2566d(list, new f(parcelFileDescriptorRewinder, interfaceC6497b));
    }

    /* renamed from: b */
    public static int m2564b(List list, InputStream inputStream, InterfaceC6497b interfaceC6497b) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, interfaceC6497b);
        }
        inputStream.mark(5242880);
        return m2566d(list, new e(inputStream, interfaceC6497b));
    }

    /* renamed from: c */
    public static int m2565c(List list, ByteBuffer byteBuffer, InterfaceC6497b interfaceC6497b) {
        if (byteBuffer == null) {
            return -1;
        }
        return m2566d(list, new d(byteBuffer, interfaceC6497b));
    }

    /* renamed from: d */
    public static int m2566d(List list, g gVar) {
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            int iMo2572a = gVar.mo2572a((ImageHeaderParser) list.get(i6));
            if (iMo2572a != -1) {
                return iMo2572a;
            }
        }
        return -1;
    }

    /* renamed from: e */
    public static ImageHeaderParser.ImageType m2567e(List list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC6497b interfaceC6497b) {
        return m2570h(list, new c(parcelFileDescriptorRewinder, interfaceC6497b));
    }

    /* renamed from: f */
    public static ImageHeaderParser.ImageType m2568f(List list, InputStream inputStream, InterfaceC6497b interfaceC6497b) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, interfaceC6497b);
        }
        inputStream.mark(5242880);
        return m2570h(list, new a(inputStream));
    }

    /* renamed from: g */
    public static ImageHeaderParser.ImageType m2569g(List list, ByteBuffer byteBuffer) {
        return byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : m2570h(list, new b(byteBuffer));
    }

    /* renamed from: h */
    public static ImageHeaderParser.ImageType m2570h(List list, h hVar) {
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            ImageHeaderParser.ImageType imageTypeMo2571a = hVar.mo2571a((ImageHeaderParser) list.get(i6));
            if (imageTypeMo2571a != ImageHeaderParser.ImageType.UNKNOWN) {
                return imageTypeMo2571a;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
