package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p117i1.AbstractC7642a;
import p195p0.InterfaceC8802b;

/* renamed from: com.bumptech.glide.load.a */
/* loaded from: classes3.dex */
public abstract class AbstractC5351a {

    /* renamed from: com.bumptech.glide.load.a$a */
    public class a implements h {

        /* renamed from: a */
        public final /* synthetic */ InputStream f3483a;

        public a(InputStream inputStream) {
            this.f3483a = inputStream;
        }

        @Override // com.bumptech.glide.load.AbstractC5351a.h
        /* renamed from: a */
        public ImageHeaderParser.ImageType mo3390a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.mo3379d(this.f3483a);
            } finally {
                this.f3483a.reset();
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$b */
    public class b implements h {

        /* renamed from: a */
        public final /* synthetic */ ByteBuffer f3484a;

        public b(ByteBuffer byteBuffer) {
            this.f3484a = byteBuffer;
        }

        @Override // com.bumptech.glide.load.AbstractC5351a.h
        /* renamed from: a */
        public ImageHeaderParser.ImageType mo3390a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.mo3377b(this.f3484a);
            } finally {
                AbstractC7642a.m12653d(this.f3484a);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$c */
    public class c implements h {

        /* renamed from: a */
        public final /* synthetic */ ParcelFileDescriptorRewinder f3485a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC8802b f3486b;

        public c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC8802b interfaceC8802b) {
            this.f3485a = parcelFileDescriptorRewinder;
            this.f3486b = interfaceC8802b;
        }

        @Override // com.bumptech.glide.load.AbstractC5351a.h
        /* renamed from: a */
        public ImageHeaderParser.ImageType mo3390a(ImageHeaderParser imageHeaderParser) throws Throwable {
            RecyclableBufferedInputStream recyclableBufferedInputStream = null;
            try {
                RecyclableBufferedInputStream recyclableBufferedInputStream2 = new RecyclableBufferedInputStream(new FileInputStream(this.f3485a.mo3393a().getFileDescriptor()), this.f3486b);
                try {
                    ImageHeaderParser.ImageType imageTypeMo3379d = imageHeaderParser.mo3379d(recyclableBufferedInputStream2);
                    recyclableBufferedInputStream2.m3606g();
                    this.f3485a.mo3393a();
                    return imageTypeMo3379d;
                } catch (Throwable th) {
                    th = th;
                    recyclableBufferedInputStream = recyclableBufferedInputStream2;
                    if (recyclableBufferedInputStream != null) {
                        recyclableBufferedInputStream.m3606g();
                    }
                    this.f3485a.mo3393a();
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
        public final /* synthetic */ ByteBuffer f3487a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC8802b f3488b;

        public d(ByteBuffer byteBuffer, InterfaceC8802b interfaceC8802b) {
            this.f3487a = byteBuffer;
            this.f3488b = interfaceC8802b;
        }

        @Override // com.bumptech.glide.load.AbstractC5351a.g
        /* renamed from: a */
        public int mo3391a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.mo3376a(this.f3487a, this.f3488b);
            } finally {
                AbstractC7642a.m12653d(this.f3487a);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$e */
    public class e implements g {

        /* renamed from: a */
        public final /* synthetic */ InputStream f3489a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC8802b f3490b;

        public e(InputStream inputStream, InterfaceC8802b interfaceC8802b) {
            this.f3489a = inputStream;
            this.f3490b = interfaceC8802b;
        }

        @Override // com.bumptech.glide.load.AbstractC5351a.g
        /* renamed from: a */
        public int mo3391a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.mo3378c(this.f3489a, this.f3490b);
            } finally {
                this.f3489a.reset();
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$f */
    public class f implements g {

        /* renamed from: a */
        public final /* synthetic */ ParcelFileDescriptorRewinder f3491a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC8802b f3492b;

        public f(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC8802b interfaceC8802b) {
            this.f3491a = parcelFileDescriptorRewinder;
            this.f3492b = interfaceC8802b;
        }

        @Override // com.bumptech.glide.load.AbstractC5351a.g
        /* renamed from: a */
        public int mo3391a(ImageHeaderParser imageHeaderParser) throws Throwable {
            RecyclableBufferedInputStream recyclableBufferedInputStream = null;
            try {
                RecyclableBufferedInputStream recyclableBufferedInputStream2 = new RecyclableBufferedInputStream(new FileInputStream(this.f3491a.mo3393a().getFileDescriptor()), this.f3492b);
                try {
                    int iMo3378c = imageHeaderParser.mo3378c(recyclableBufferedInputStream2, this.f3492b);
                    recyclableBufferedInputStream2.m3606g();
                    this.f3491a.mo3393a();
                    return iMo3378c;
                } catch (Throwable th) {
                    th = th;
                    recyclableBufferedInputStream = recyclableBufferedInputStream2;
                    if (recyclableBufferedInputStream != null) {
                        recyclableBufferedInputStream.m3606g();
                    }
                    this.f3491a.mo3393a();
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
        int mo3391a(ImageHeaderParser imageHeaderParser);
    }

    /* renamed from: com.bumptech.glide.load.a$h */
    public interface h {
        /* renamed from: a */
        ImageHeaderParser.ImageType mo3390a(ImageHeaderParser imageHeaderParser);
    }

    /* renamed from: a */
    public static int m3382a(List list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC8802b interfaceC8802b) {
        return m3385d(list, new f(parcelFileDescriptorRewinder, interfaceC8802b));
    }

    /* renamed from: b */
    public static int m3383b(List list, InputStream inputStream, InterfaceC8802b interfaceC8802b) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, interfaceC8802b);
        }
        inputStream.mark(5242880);
        return m3385d(list, new e(inputStream, interfaceC8802b));
    }

    /* renamed from: c */
    public static int m3384c(List list, ByteBuffer byteBuffer, InterfaceC8802b interfaceC8802b) {
        if (byteBuffer == null) {
            return -1;
        }
        return m3385d(list, new d(byteBuffer, interfaceC8802b));
    }

    /* renamed from: d */
    public static int m3385d(List list, g gVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iMo3391a = gVar.mo3391a((ImageHeaderParser) list.get(i10));
            if (iMo3391a != -1) {
                return iMo3391a;
            }
        }
        return -1;
    }

    /* renamed from: e */
    public static ImageHeaderParser.ImageType m3386e(List list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC8802b interfaceC8802b) {
        return m3389h(list, new c(parcelFileDescriptorRewinder, interfaceC8802b));
    }

    /* renamed from: f */
    public static ImageHeaderParser.ImageType m3387f(List list, InputStream inputStream, InterfaceC8802b interfaceC8802b) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, interfaceC8802b);
        }
        inputStream.mark(5242880);
        return m3389h(list, new a(inputStream));
    }

    /* renamed from: g */
    public static ImageHeaderParser.ImageType m3388g(List list, ByteBuffer byteBuffer) {
        return byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : m3389h(list, new b(byteBuffer));
    }

    /* renamed from: h */
    public static ImageHeaderParser.ImageType m3389h(List list, h hVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ImageHeaderParser.ImageType imageTypeMo3390a = hVar.mo3390a((ImageHeaderParser) list.get(i10));
            if (imageTypeMo3390a != ImageHeaderParser.ImageType.UNKNOWN) {
                return imageTypeMo3390a;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
