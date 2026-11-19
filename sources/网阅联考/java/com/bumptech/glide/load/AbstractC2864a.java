package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p081k.C3852m;
import p098n.InterfaceC4393b;

/* renamed from: com.bumptech.glide.load.a */
/* loaded from: classes2.dex */
public abstract class AbstractC2864a {

    /* renamed from: com.bumptech.glide.load.a$a */
    public class a implements g {

        /* renamed from: a */
        public final /* synthetic */ InputStream f659a;

        public a(InputStream inputStream) {
            this.f659a = inputStream;
        }

        @Override // com.bumptech.glide.load.AbstractC2864a.g
        /* renamed from: a */
        public ImageHeaderParser.ImageType mo1763a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.mo1754b(this.f659a);
            } finally {
                this.f659a.reset();
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$b */
    public class b implements g {

        /* renamed from: a */
        public final /* synthetic */ ByteBuffer f660a;

        public b(ByteBuffer byteBuffer) {
            this.f660a = byteBuffer;
        }

        @Override // com.bumptech.glide.load.AbstractC2864a.g
        /* renamed from: a */
        public ImageHeaderParser.ImageType mo1763a(ImageHeaderParser imageHeaderParser) {
            return imageHeaderParser.mo1753a(this.f660a);
        }
    }

    /* renamed from: com.bumptech.glide.load.a$c */
    public class c implements g {

        /* renamed from: a */
        public final /* synthetic */ C3852m f661a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC4393b f662b;

        public c(C3852m c3852m, InterfaceC4393b interfaceC4393b) {
            this.f661a = c3852m;
            this.f662b = interfaceC4393b;
        }

        @Override // com.bumptech.glide.load.AbstractC2864a.g
        /* renamed from: a */
        public ImageHeaderParser.ImageType mo1763a(ImageHeaderParser imageHeaderParser) throws Throwable {
            RecyclableBufferedInputStream recyclableBufferedInputStream = null;
            try {
                RecyclableBufferedInputStream recyclableBufferedInputStream2 = new RecyclableBufferedInputStream(new FileInputStream(this.f661a.mo5127a().getFileDescriptor()), this.f662b);
                try {
                    ImageHeaderParser.ImageType imageTypeMo1754b = imageHeaderParser.mo1754b(recyclableBufferedInputStream2);
                    try {
                        recyclableBufferedInputStream2.close();
                    } catch (IOException unused) {
                    }
                    this.f661a.mo5127a();
                    return imageTypeMo1754b;
                } catch (Throwable th) {
                    th = th;
                    recyclableBufferedInputStream = recyclableBufferedInputStream2;
                    if (recyclableBufferedInputStream != null) {
                        try {
                            recyclableBufferedInputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    this.f661a.mo5127a();
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
        public final /* synthetic */ InputStream f663a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC4393b f664b;

        public d(InputStream inputStream, InterfaceC4393b interfaceC4393b) {
            this.f663a = inputStream;
            this.f664b = interfaceC4393b;
        }

        @Override // com.bumptech.glide.load.AbstractC2864a.f
        /* renamed from: a */
        public int mo1764a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.mo1755c(this.f663a, this.f664b);
            } finally {
                this.f663a.reset();
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$e */
    public class e implements f {

        /* renamed from: a */
        public final /* synthetic */ C3852m f665a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC4393b f666b;

        public e(C3852m c3852m, InterfaceC4393b interfaceC4393b) {
            this.f665a = c3852m;
            this.f666b = interfaceC4393b;
        }

        @Override // com.bumptech.glide.load.AbstractC2864a.f
        /* renamed from: a */
        public int mo1764a(ImageHeaderParser imageHeaderParser) throws Throwable {
            RecyclableBufferedInputStream recyclableBufferedInputStream = null;
            try {
                RecyclableBufferedInputStream recyclableBufferedInputStream2 = new RecyclableBufferedInputStream(new FileInputStream(this.f665a.mo5127a().getFileDescriptor()), this.f666b);
                try {
                    int iMo1755c = imageHeaderParser.mo1755c(recyclableBufferedInputStream2, this.f666b);
                    try {
                        recyclableBufferedInputStream2.close();
                    } catch (IOException unused) {
                    }
                    this.f665a.mo5127a();
                    return iMo1755c;
                } catch (Throwable th) {
                    th = th;
                    recyclableBufferedInputStream = recyclableBufferedInputStream2;
                    if (recyclableBufferedInputStream != null) {
                        try {
                            recyclableBufferedInputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    this.f665a.mo5127a();
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
        int mo1764a(ImageHeaderParser imageHeaderParser);
    }

    /* renamed from: com.bumptech.glide.load.a$g */
    public interface g {
        /* renamed from: a */
        ImageHeaderParser.ImageType mo1763a(ImageHeaderParser imageHeaderParser);
    }

    /* renamed from: a */
    public static int m1756a(List list, InputStream inputStream, InterfaceC4393b interfaceC4393b) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, interfaceC4393b);
        }
        inputStream.mark(5242880);
        return m1758c(list, new d(inputStream, interfaceC4393b));
    }

    /* renamed from: b */
    public static int m1757b(List list, C3852m c3852m, InterfaceC4393b interfaceC4393b) {
        return m1758c(list, new e(c3852m, interfaceC4393b));
    }

    /* renamed from: c */
    public static int m1758c(List list, f fVar) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            int iMo1764a = fVar.mo1764a((ImageHeaderParser) list.get(i4));
            if (iMo1764a != -1) {
                return iMo1764a;
            }
        }
        return -1;
    }

    /* renamed from: d */
    public static ImageHeaderParser.ImageType m1759d(List list, InputStream inputStream, InterfaceC4393b interfaceC4393b) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, interfaceC4393b);
        }
        inputStream.mark(5242880);
        return m1762g(list, new a(inputStream));
    }

    /* renamed from: e */
    public static ImageHeaderParser.ImageType m1760e(List list, ByteBuffer byteBuffer) {
        return byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : m1762g(list, new b(byteBuffer));
    }

    /* renamed from: f */
    public static ImageHeaderParser.ImageType m1761f(List list, C3852m c3852m, InterfaceC4393b interfaceC4393b) {
        return m1762g(list, new c(c3852m, interfaceC4393b));
    }

    /* renamed from: g */
    public static ImageHeaderParser.ImageType m1762g(List list, g gVar) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            ImageHeaderParser.ImageType imageTypeMo1763a = gVar.mo1763a((ImageHeaderParser) list.get(i4));
            if (imageTypeMo1763a != ImageHeaderParser.ImageType.UNKNOWN) {
                return imageTypeMo1763a;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
