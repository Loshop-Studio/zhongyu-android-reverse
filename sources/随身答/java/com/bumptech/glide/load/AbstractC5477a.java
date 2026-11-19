package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p132i0.C8124m;
import p164l0.InterfaceC8865b;

/* renamed from: com.bumptech.glide.load.a */
/* loaded from: classes3.dex */
public abstract class AbstractC5477a {

    /* renamed from: com.bumptech.glide.load.a$a */
    public class a implements g {

        /* renamed from: a */
        public final /* synthetic */ InputStream f3313a;

        public a(InputStream inputStream) {
            this.f3313a = inputStream;
        }

        @Override // com.bumptech.glide.load.AbstractC5477a.g
        /* renamed from: a */
        public ImageHeaderParser.ImageType mo3088a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.mo3080c(this.f3313a);
            } finally {
                this.f3313a.reset();
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$b */
    public class b implements g {

        /* renamed from: a */
        public final /* synthetic */ ByteBuffer f3314a;

        public b(ByteBuffer byteBuffer) {
            this.f3314a = byteBuffer;
        }

        @Override // com.bumptech.glide.load.AbstractC5477a.g
        /* renamed from: a */
        public ImageHeaderParser.ImageType mo3088a(ImageHeaderParser imageHeaderParser) {
            return imageHeaderParser.mo3079b(this.f3314a);
        }
    }

    /* renamed from: com.bumptech.glide.load.a$c */
    public class c implements g {

        /* renamed from: a */
        public final /* synthetic */ C8124m f3315a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC8865b f3316b;

        public c(C8124m c8124m, InterfaceC8865b interfaceC8865b) {
            this.f3315a = c8124m;
            this.f3316b = interfaceC8865b;
        }

        @Override // com.bumptech.glide.load.AbstractC5477a.g
        /* renamed from: a */
        public ImageHeaderParser.ImageType mo3088a(ImageHeaderParser imageHeaderParser) throws Throwable {
            RecyclableBufferedInputStream recyclableBufferedInputStream = null;
            try {
                RecyclableBufferedInputStream recyclableBufferedInputStream2 = new RecyclableBufferedInputStream(new FileInputStream(this.f3315a.mo12991a().getFileDescriptor()), this.f3316b);
                try {
                    ImageHeaderParser.ImageType imageTypeMo3080c = imageHeaderParser.mo3080c(recyclableBufferedInputStream2);
                    try {
                        recyclableBufferedInputStream2.close();
                    } catch (IOException unused) {
                    }
                    this.f3315a.mo12991a();
                    return imageTypeMo3080c;
                } catch (Throwable th) {
                    th = th;
                    recyclableBufferedInputStream = recyclableBufferedInputStream2;
                    if (recyclableBufferedInputStream != null) {
                        try {
                            recyclableBufferedInputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    this.f3315a.mo12991a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$d */
    public class d implements f {

        /* renamed from: a */
        public final /* synthetic */ InputStream f3317a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC8865b f3318b;

        public d(InputStream inputStream, InterfaceC8865b interfaceC8865b) {
            this.f3317a = inputStream;
            this.f3318b = interfaceC8865b;
        }

        @Override // com.bumptech.glide.load.AbstractC5477a.f
        /* renamed from: a */
        public int mo3089a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.mo3078a(this.f3317a, this.f3318b);
            } finally {
                this.f3317a.reset();
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$e */
    public class e implements f {

        /* renamed from: a */
        public final /* synthetic */ C8124m f3319a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC8865b f3320b;

        public e(C8124m c8124m, InterfaceC8865b interfaceC8865b) {
            this.f3319a = c8124m;
            this.f3320b = interfaceC8865b;
        }

        @Override // com.bumptech.glide.load.AbstractC5477a.f
        /* renamed from: a */
        public int mo3089a(ImageHeaderParser imageHeaderParser) throws Throwable {
            RecyclableBufferedInputStream recyclableBufferedInputStream = null;
            try {
                RecyclableBufferedInputStream recyclableBufferedInputStream2 = new RecyclableBufferedInputStream(new FileInputStream(this.f3319a.mo12991a().getFileDescriptor()), this.f3320b);
                try {
                    int iMo3078a = imageHeaderParser.mo3078a(recyclableBufferedInputStream2, this.f3320b);
                    try {
                        recyclableBufferedInputStream2.close();
                    } catch (IOException unused) {
                    }
                    this.f3319a.mo12991a();
                    return iMo3078a;
                } catch (Throwable th) {
                    th = th;
                    recyclableBufferedInputStream = recyclableBufferedInputStream2;
                    if (recyclableBufferedInputStream != null) {
                        try {
                            recyclableBufferedInputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    this.f3319a.mo12991a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$f */
    public interface f {
        /* renamed from: a */
        int mo3089a(ImageHeaderParser imageHeaderParser);
    }

    /* renamed from: com.bumptech.glide.load.a$g */
    public interface g {
        /* renamed from: a */
        ImageHeaderParser.ImageType mo3088a(ImageHeaderParser imageHeaderParser);
    }

    /* renamed from: a */
    public static int m3081a(List list, C8124m c8124m, InterfaceC8865b interfaceC8865b) {
        return m3083c(list, new e(c8124m, interfaceC8865b));
    }

    /* renamed from: b */
    public static int m3082b(List list, InputStream inputStream, InterfaceC8865b interfaceC8865b) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, interfaceC8865b);
        }
        inputStream.mark(5242880);
        return m3083c(list, new d(inputStream, interfaceC8865b));
    }

    /* renamed from: c */
    public static int m3083c(List list, f fVar) {
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            int iMo3089a = fVar.mo3089a((ImageHeaderParser) list.get(i9));
            if (iMo3089a != -1) {
                return iMo3089a;
            }
        }
        return -1;
    }

    /* renamed from: d */
    public static ImageHeaderParser.ImageType m3084d(List list, C8124m c8124m, InterfaceC8865b interfaceC8865b) {
        return m3087g(list, new c(c8124m, interfaceC8865b));
    }

    /* renamed from: e */
    public static ImageHeaderParser.ImageType m3085e(List list, InputStream inputStream, InterfaceC8865b interfaceC8865b) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, interfaceC8865b);
        }
        inputStream.mark(5242880);
        return m3087g(list, new a(inputStream));
    }

    /* renamed from: f */
    public static ImageHeaderParser.ImageType m3086f(List list, ByteBuffer byteBuffer) {
        return byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : m3087g(list, new b(byteBuffer));
    }

    /* renamed from: g */
    public static ImageHeaderParser.ImageType m3087g(List list, g gVar) {
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            ImageHeaderParser.ImageType imageTypeMo3088a = gVar.mo3088a((ImageHeaderParser) list.get(i9));
            if (imageTypeMo3088a != ImageHeaderParser.ImageType.UNKNOWN) {
                return imageTypeMo3088a;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
