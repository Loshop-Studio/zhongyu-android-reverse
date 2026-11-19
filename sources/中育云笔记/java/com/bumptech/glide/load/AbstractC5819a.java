package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import com.taobao.accs.utl.UtilityImpl;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p109d1.AbstractC8900a;
import p213k0.InterfaceC9770b;

/* renamed from: com.bumptech.glide.load.a */
/* loaded from: classes3.dex */
public abstract class AbstractC5819a {

    /* renamed from: com.bumptech.glide.load.a$a */
    public class a implements h {

        /* renamed from: a */
        public final /* synthetic */ InputStream f4686a;

        public a(InputStream inputStream) {
            this.f4686a = inputStream;
        }

        @Override // com.bumptech.glide.load.AbstractC5819a.h
        /* renamed from: a */
        public ImageHeaderParser.ImageType mo4043a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.mo4031c(this.f4686a);
            } finally {
                this.f4686a.reset();
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$b */
    public class b implements h {

        /* renamed from: a */
        public final /* synthetic */ ByteBuffer f4687a;

        public b(ByteBuffer byteBuffer) {
            this.f4687a = byteBuffer;
        }

        @Override // com.bumptech.glide.load.AbstractC5819a.h
        /* renamed from: a */
        public ImageHeaderParser.ImageType mo4043a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.mo4030b(this.f4687a);
            } finally {
                AbstractC8900a.m17438d(this.f4687a);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$c */
    public class c implements h {

        /* renamed from: a */
        public final /* synthetic */ ParcelFileDescriptorRewinder f4688a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC9770b f4689b;

        public c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC9770b interfaceC9770b) {
            this.f4688a = parcelFileDescriptorRewinder;
            this.f4689b = interfaceC9770b;
        }

        @Override // com.bumptech.glide.load.AbstractC5819a.h
        /* renamed from: a */
        public ImageHeaderParser.ImageType mo4043a(ImageHeaderParser imageHeaderParser) throws Throwable {
            RecyclableBufferedInputStream recyclableBufferedInputStream = null;
            try {
                RecyclableBufferedInputStream recyclableBufferedInputStream2 = new RecyclableBufferedInputStream(new FileInputStream(this.f4688a.mo4046a().getFileDescriptor()), this.f4689b);
                try {
                    ImageHeaderParser.ImageType imageTypeMo4031c = imageHeaderParser.mo4031c(recyclableBufferedInputStream2);
                    recyclableBufferedInputStream2.m4255f();
                    this.f4688a.mo4046a();
                    return imageTypeMo4031c;
                } catch (Throwable th) {
                    th = th;
                    recyclableBufferedInputStream = recyclableBufferedInputStream2;
                    if (recyclableBufferedInputStream != null) {
                        recyclableBufferedInputStream.m4255f();
                    }
                    this.f4688a.mo4046a();
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
        public final /* synthetic */ ByteBuffer f4690a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC9770b f4691b;

        public d(ByteBuffer byteBuffer, InterfaceC9770b interfaceC9770b) {
            this.f4690a = byteBuffer;
            this.f4691b = interfaceC9770b;
        }

        @Override // com.bumptech.glide.load.AbstractC5819a.g
        /* renamed from: a */
        public int mo4044a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.mo4032d(this.f4690a, this.f4691b);
            } finally {
                AbstractC8900a.m17438d(this.f4690a);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$e */
    public class e implements g {

        /* renamed from: a */
        public final /* synthetic */ InputStream f4692a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC9770b f4693b;

        public e(InputStream inputStream, InterfaceC9770b interfaceC9770b) {
            this.f4692a = inputStream;
            this.f4693b = interfaceC9770b;
        }

        @Override // com.bumptech.glide.load.AbstractC5819a.g
        /* renamed from: a */
        public int mo4044a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.mo4029a(this.f4692a, this.f4693b);
            } finally {
                this.f4692a.reset();
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$f */
    public class f implements g {

        /* renamed from: a */
        public final /* synthetic */ ParcelFileDescriptorRewinder f4694a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC9770b f4695b;

        public f(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC9770b interfaceC9770b) {
            this.f4694a = parcelFileDescriptorRewinder;
            this.f4695b = interfaceC9770b;
        }

        @Override // com.bumptech.glide.load.AbstractC5819a.g
        /* renamed from: a */
        public int mo4044a(ImageHeaderParser imageHeaderParser) throws Throwable {
            RecyclableBufferedInputStream recyclableBufferedInputStream = null;
            try {
                RecyclableBufferedInputStream recyclableBufferedInputStream2 = new RecyclableBufferedInputStream(new FileInputStream(this.f4694a.mo4046a().getFileDescriptor()), this.f4695b);
                try {
                    int iMo4029a = imageHeaderParser.mo4029a(recyclableBufferedInputStream2, this.f4695b);
                    recyclableBufferedInputStream2.m4255f();
                    this.f4694a.mo4046a();
                    return iMo4029a;
                } catch (Throwable th) {
                    th = th;
                    recyclableBufferedInputStream = recyclableBufferedInputStream2;
                    if (recyclableBufferedInputStream != null) {
                        recyclableBufferedInputStream.m4255f();
                    }
                    this.f4694a.mo4046a();
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
        int mo4044a(ImageHeaderParser imageHeaderParser);
    }

    /* renamed from: com.bumptech.glide.load.a$h */
    public interface h {
        /* renamed from: a */
        ImageHeaderParser.ImageType mo4043a(ImageHeaderParser imageHeaderParser);
    }

    /* renamed from: a */
    public static int m4035a(List list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC9770b interfaceC9770b) {
        return m4038d(list, new f(parcelFileDescriptorRewinder, interfaceC9770b));
    }

    /* renamed from: b */
    public static int m4036b(List list, InputStream inputStream, InterfaceC9770b interfaceC9770b) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, interfaceC9770b);
        }
        inputStream.mark(UtilityImpl.TNET_FILE_SIZE);
        return m4038d(list, new e(inputStream, interfaceC9770b));
    }

    /* renamed from: c */
    public static int m4037c(List list, ByteBuffer byteBuffer, InterfaceC9770b interfaceC9770b) {
        if (byteBuffer == null) {
            return -1;
        }
        return m4038d(list, new d(byteBuffer, interfaceC9770b));
    }

    /* renamed from: d */
    public static int m4038d(List list, g gVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iMo4044a = gVar.mo4044a((ImageHeaderParser) list.get(i10));
            if (iMo4044a != -1) {
                return iMo4044a;
            }
        }
        return -1;
    }

    /* renamed from: e */
    public static ImageHeaderParser.ImageType m4039e(List list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC9770b interfaceC9770b) {
        return m4042h(list, new c(parcelFileDescriptorRewinder, interfaceC9770b));
    }

    /* renamed from: f */
    public static ImageHeaderParser.ImageType m4040f(List list, InputStream inputStream, InterfaceC9770b interfaceC9770b) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, interfaceC9770b);
        }
        inputStream.mark(UtilityImpl.TNET_FILE_SIZE);
        return m4042h(list, new a(inputStream));
    }

    /* renamed from: g */
    public static ImageHeaderParser.ImageType m4041g(List list, ByteBuffer byteBuffer) {
        return byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : m4042h(list, new b(byteBuffer));
    }

    /* renamed from: h */
    public static ImageHeaderParser.ImageType m4042h(List list, h hVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ImageHeaderParser.ImageType imageTypeMo4043a = hVar.mo4043a((ImageHeaderParser) list.get(i10));
            if (imageTypeMo4043a != ImageHeaderParser.ImageType.UNKNOWN) {
                return imageTypeMo4043a;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
