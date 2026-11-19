package p094h0;

import android.content.res.AssetManager;
import android.util.Log;
import com.umeng.commonsdk.stateless.C1985b;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* renamed from: h0.a */
/* loaded from: classes.dex */
public class C2653a {

    /* renamed from: D */
    private static final c[] f10485D;

    /* renamed from: E */
    private static final c[] f10486E;

    /* renamed from: F */
    private static final c[] f10487F;

    /* renamed from: G */
    private static final c[] f10488G;

    /* renamed from: H */
    private static final c[] f10489H;

    /* renamed from: I */
    private static final c f10490I;

    /* renamed from: J */
    private static final c[] f10491J;

    /* renamed from: K */
    private static final c[] f10492K;

    /* renamed from: L */
    private static final c[] f10493L;

    /* renamed from: M */
    private static final c[] f10494M;

    /* renamed from: N */
    static final c[][] f10495N;

    /* renamed from: O */
    private static final c[] f10496O;

    /* renamed from: P */
    private static final c f10497P;

    /* renamed from: Q */
    private static final c f10498Q;

    /* renamed from: R */
    private static final HashMap<Integer, c>[] f10499R;

    /* renamed from: S */
    private static final HashMap<String, c>[] f10500S;

    /* renamed from: T */
    private static final HashSet<String> f10501T;

    /* renamed from: U */
    private static final HashMap<Integer, Integer> f10502U;

    /* renamed from: V */
    static final Charset f10503V;

    /* renamed from: W */
    static final byte[] f10504W;

    /* renamed from: X */
    private static final Pattern f10505X;

    /* renamed from: Y */
    private static final Pattern f10506Y;

    /* renamed from: z */
    private static SimpleDateFormat f10515z;

    /* renamed from: a */
    private final String f10516a;

    /* renamed from: b */
    private final AssetManager.AssetInputStream f10517b;

    /* renamed from: c */
    private int f10518c;

    /* renamed from: d */
    private final HashMap<String, b>[] f10519d;

    /* renamed from: e */
    private Set<Integer> f10520e;

    /* renamed from: f */
    private ByteOrder f10521f;

    /* renamed from: g */
    private boolean f10522g;

    /* renamed from: h */
    private int f10523h;

    /* renamed from: i */
    private int f10524i;

    /* renamed from: j */
    private byte[] f10525j;

    /* renamed from: k */
    private int f10526k;

    /* renamed from: l */
    private int f10527l;

    /* renamed from: m */
    private int f10528m;

    /* renamed from: n */
    private int f10529n;

    /* renamed from: o */
    private int f10530o;

    /* renamed from: p */
    private int f10531p;

    /* renamed from: q */
    private boolean f10532q;

    /* renamed from: r */
    private static final List<Integer> f10507r = Arrays.asList(1, 6, 3, 8);

    /* renamed from: s */
    private static final List<Integer> f10508s = Arrays.asList(2, 7, 4, 5);

    /* renamed from: t */
    public static final int[] f10509t = {8, 8, 8};

    /* renamed from: u */
    public static final int[] f10510u = {4};

    /* renamed from: v */
    public static final int[] f10511v = {8};

    /* renamed from: w */
    static final byte[] f10512w = {-1, -40, -1};

    /* renamed from: x */
    private static final byte[] f10513x = {79, 76, 89, 77, 80, 0};

    /* renamed from: y */
    private static final byte[] f10514y = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: A */
    static final String[] f10482A = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};

    /* renamed from: B */
    static final int[] f10483B = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: C */
    static final byte[] f10484C = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: h0.a$b */
    private static class b {

        /* renamed from: a */
        public final int f10539a;

        /* renamed from: b */
        public final int f10540b;

        /* renamed from: c */
        public final byte[] f10541c;

        b(int i4, int i5, byte[] bArr) {
            this.f10539a = i4;
            this.f10540b = i5;
            this.f10541c = bArr;
        }

        /* renamed from: a */
        public static b m8900a(String str) {
            byte[] bytes = (str + (char) 0).getBytes(C2653a.f10503V);
            return new b(2, bytes.length, bytes);
        }

        /* renamed from: b */
        public static b m8901b(long j4, ByteOrder byteOrder) {
            return m8902c(new long[]{j4}, byteOrder);
        }

        /* renamed from: c */
        public static b m8902c(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C2653a.f10483B[4] * jArr.length]);
            byteBufferWrap.order(byteOrder);
            for (long j4 : jArr) {
                byteBufferWrap.putInt((int) j4);
            }
            return new b(4, jArr.length, byteBufferWrap.array());
        }

        /* renamed from: d */
        public static b m8903d(d dVar, ByteOrder byteOrder) {
            return m8904e(new d[]{dVar}, byteOrder);
        }

        /* renamed from: e */
        public static b m8904e(d[] dVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C2653a.f10483B[5] * dVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (d dVar : dVarArr) {
                byteBufferWrap.putInt((int) dVar.f10546a);
                byteBufferWrap.putInt((int) dVar.f10547b);
            }
            return new b(5, dVarArr.length, byteBufferWrap.array());
        }

        /* renamed from: f */
        public static b m8905f(int i4, ByteOrder byteOrder) {
            return m8906g(new int[]{i4}, byteOrder);
        }

        /* renamed from: g */
        public static b m8906g(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C2653a.f10483B[3] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i4 : iArr) {
                byteBufferWrap.putShort((short) i4);
            }
            return new b(3, iArr.length, byteBufferWrap.array());
        }

        /* renamed from: h */
        public double m8907h(ByteOrder byteOrder) throws Throwable {
            Object objM8910k = m8910k(byteOrder);
            if (objM8910k == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objM8910k instanceof String) {
                return Double.parseDouble((String) objM8910k);
            }
            if (objM8910k instanceof long[]) {
                if (((long[]) objM8910k).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objM8910k instanceof int[]) {
                if (((int[]) objM8910k).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objM8910k instanceof double[]) {
                double[] dArr = (double[]) objM8910k;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objM8910k instanceof d[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            d[] dVarArr = (d[]) objM8910k;
            if (dVarArr.length == 1) {
                return dVarArr[0].m8912a();
            }
            throw new NumberFormatException("There are more than one component");
        }

        /* renamed from: i */
        public int m8908i(ByteOrder byteOrder) throws Throwable {
            Object objM8910k = m8910k(byteOrder);
            if (objM8910k == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (objM8910k instanceof String) {
                return Integer.parseInt((String) objM8910k);
            }
            if (objM8910k instanceof long[]) {
                long[] jArr = (long[]) objM8910k;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objM8910k instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) objM8910k;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        /* renamed from: j */
        public String m8909j(ByteOrder byteOrder) throws Throwable {
            Object objM8910k = m8910k(byteOrder);
            if (objM8910k == null) {
                return null;
            }
            if (objM8910k instanceof String) {
                return (String) objM8910k;
            }
            StringBuilder sb = new StringBuilder();
            int i4 = 0;
            if (objM8910k instanceof long[]) {
                long[] jArr = (long[]) objM8910k;
                while (i4 < jArr.length) {
                    sb.append(jArr[i4]);
                    i4++;
                    if (i4 != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objM8910k instanceof int[]) {
                int[] iArr = (int[]) objM8910k;
                while (i4 < iArr.length) {
                    sb.append(iArr[i4]);
                    i4++;
                    if (i4 != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objM8910k instanceof double[]) {
                double[] dArr = (double[]) objM8910k;
                while (i4 < dArr.length) {
                    sb.append(dArr[i4]);
                    i4++;
                    if (i4 != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (!(objM8910k instanceof d[])) {
                return null;
            }
            d[] dVarArr = (d[]) objM8910k;
            while (i4 < dVarArr.length) {
                sb.append(dVarArr[i4].f10546a);
                sb.append('/');
                sb.append(dVarArr[i4].f10547b);
                i4++;
                if (i4 != dVarArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }

        /* JADX WARN: Not initialized variable reg: 3, insn: 0x019c: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:152:0x019c */
        /* JADX WARN: Removed duplicated region for block: B:176:0x019f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        java.lang.Object m8910k(java.nio.ByteOrder r11) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 452
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p094h0.C2653a.b.m8910k(java.nio.ByteOrder):java.lang.Object");
        }

        public String toString() {
            return "(" + C2653a.f10482A[this.f10539a] + ", data length:" + this.f10541c.length + ")";
        }
    }

    /* renamed from: h0.a$d */
    private static class d {

        /* renamed from: a */
        public final long f10546a;

        /* renamed from: b */
        public final long f10547b;

        d(long j4, long j5) {
            if (j5 == 0) {
                this.f10546a = 0L;
                this.f10547b = 1L;
            } else {
                this.f10546a = j4;
                this.f10547b = j5;
            }
        }

        /* renamed from: a */
        public double m8912a() {
            return this.f10546a / this.f10547b;
        }

        public String toString() {
            return this.f10546a + "/" + this.f10547b;
        }
    }

    static {
        c[] cVarArr = {new c("NewSubfileType", 254, 4), new c("SubfileType", 255, 4), new c("ImageWidth", 256, 3, 4), new c("ImageLength", 257, 3, 4), new c("BitsPerSample", 258, 3), new c("Compression", 259, 3), new c("PhotometricInterpretation", 262, 3), new c("ImageDescription", 270, 2), new c("Make", 271, 2), new c("Model", 272, 2), new c("StripOffsets", C1985b.f9296a, 3, 4), new c("Orientation", 274, 3), new c("SamplesPerPixel", 277, 3), new c("RowsPerStrip", 278, 3, 4), new c("StripByteCounts", 279, 3, 4), new c("XResolution", 282, 5), new c("YResolution", 283, 5), new c("PlanarConfiguration", 284, 3), new c("ResolutionUnit", 296, 3), new c("TransferFunction", 301, 3), new c("Software", 305, 2), new c("DateTime", 306, 2), new c("Artist", 315, 2), new c("WhitePoint", 318, 5), new c("PrimaryChromaticities", 319, 5), new c("SubIFDPointer", 330, 4), new c("JPEGInterchangeFormat", 513, 4), new c("JPEGInterchangeFormatLength", 514, 4), new c("YCbCrCoefficients", 529, 5), new c("YCbCrSubSampling", 530, 3), new c("YCbCrPositioning", 531, 3), new c("ReferenceBlackWhite", 532, 5), new c("Copyright", 33432, 2), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("SensorTopBorder", 4, 4), new c("SensorLeftBorder", 5, 4), new c("SensorBottomBorder", 6, 4), new c("SensorRightBorder", 7, 4), new c("ISO", 23, 3), new c("JpgFromRaw", 46, 7)};
        f10485D = cVarArr;
        c[] cVarArr2 = {new c("ExposureTime", 33434, 5), new c("FNumber", 33437, 5), new c("ExposureProgram", 34850, 3), new c("SpectralSensitivity", 34852, 2), new c("PhotographicSensitivity", 34855, 3), new c("OECF", 34856, 7), new c("ExifVersion", 36864, 2), new c("DateTimeOriginal", 36867, 2), new c("DateTimeDigitized", 36868, 2), new c("ComponentsConfiguration", 37121, 7), new c("CompressedBitsPerPixel", 37122, 5), new c("ShutterSpeedValue", 37377, 10), new c("ApertureValue", 37378, 5), new c("BrightnessValue", 37379, 10), new c("ExposureBiasValue", 37380, 10), new c("MaxApertureValue", 37381, 5), new c("SubjectDistance", 37382, 5), new c("MeteringMode", 37383, 3), new c("LightSource", 37384, 3), new c("Flash", 37385, 3), new c("FocalLength", 37386, 5), new c("SubjectArea", 37396, 3), new c("MakerNote", 37500, 7), new c("UserComment", 37510, 7), new c("SubSecTime", 37520, 2), new c("SubSecTimeOriginal", 37521, 2), new c("SubSecTimeDigitized", 37522, 2), new c("FlashpixVersion", 40960, 7), new c("ColorSpace", 40961, 3), new c("PixelXDimension", 40962, 3, 4), new c("PixelYDimension", 40963, 3, 4), new c("RelatedSoundFile", 40964, 2), new c("InteroperabilityIFDPointer", 40965, 4), new c("FlashEnergy", 41483, 5), new c("SpatialFrequencyResponse", 41484, 7), new c("FocalPlaneXResolution", 41486, 5), new c("FocalPlaneYResolution", 41487, 5), new c("FocalPlaneResolutionUnit", 41488, 3), new c("SubjectLocation", 41492, 3), new c("ExposureIndex", 41493, 5), new c("SensingMethod", 41495, 3), new c("FileSource", 41728, 7), new c("SceneType", 41729, 7), new c("CFAPattern", 41730, 7), new c("CustomRendered", 41985, 3), new c("ExposureMode", 41986, 3), new c("WhiteBalance", 41987, 3), new c("DigitalZoomRatio", 41988, 5), new c("FocalLengthIn35mmFilm", 41989, 3), new c("SceneCaptureType", 41990, 3), new c("GainControl", 41991, 3), new c("Contrast", 41992, 3), new c("Saturation", 41993, 3), new c("Sharpness", 41994, 3), new c("DeviceSettingDescription", 41995, 7), new c("SubjectDistanceRange", 41996, 3), new c("ImageUniqueID", 42016, 2), new c("DNGVersion", 50706, 1), new c("DefaultCropSize", 50720, 3, 4)};
        f10486E = cVarArr2;
        c[] cVarArr3 = {new c("GPSVersionID", 0, 1), new c("GPSLatitudeRef", 1, 2), new c("GPSLatitude", 2, 5), new c("GPSLongitudeRef", 3, 2), new c("GPSLongitude", 4, 5), new c("GPSAltitudeRef", 5, 1), new c("GPSAltitude", 6, 5), new c("GPSTimeStamp", 7, 5), new c("GPSSatellites", 8, 2), new c("GPSStatus", 9, 2), new c("GPSMeasureMode", 10, 2), new c("GPSDOP", 11, 5), new c("GPSSpeedRef", 12, 2), new c("GPSSpeed", 13, 5), new c("GPSTrackRef", 14, 2), new c("GPSTrack", 15, 5), new c("GPSImgDirectionRef", 16, 2), new c("GPSImgDirection", 17, 5), new c("GPSMapDatum", 18, 2), new c("GPSDestLatitudeRef", 19, 2), new c("GPSDestLatitude", 20, 5), new c("GPSDestLongitudeRef", 21, 2), new c("GPSDestLongitude", 22, 5), new c("GPSDestBearingRef", 23, 2), new c("GPSDestBearing", 24, 5), new c("GPSDestDistanceRef", 25, 2), new c("GPSDestDistance", 26, 5), new c("GPSProcessingMethod", 27, 7), new c("GPSAreaInformation", 28, 7), new c("GPSDateStamp", 29, 2), new c("GPSDifferential", 30, 3)};
        f10487F = cVarArr3;
        c[] cVarArr4 = {new c("InteroperabilityIndex", 1, 2)};
        f10488G = cVarArr4;
        c[] cVarArr5 = {new c("NewSubfileType", 254, 4), new c("SubfileType", 255, 4), new c("ThumbnailImageWidth", 256, 3, 4), new c("ThumbnailImageLength", 257, 3, 4), new c("BitsPerSample", 258, 3), new c("Compression", 259, 3), new c("PhotometricInterpretation", 262, 3), new c("ImageDescription", 270, 2), new c("Make", 271, 2), new c("Model", 272, 2), new c("StripOffsets", C1985b.f9296a, 3, 4), new c("Orientation", 274, 3), new c("SamplesPerPixel", 277, 3), new c("RowsPerStrip", 278, 3, 4), new c("StripByteCounts", 279, 3, 4), new c("XResolution", 282, 5), new c("YResolution", 283, 5), new c("PlanarConfiguration", 284, 3), new c("ResolutionUnit", 296, 3), new c("TransferFunction", 301, 3), new c("Software", 305, 2), new c("DateTime", 306, 2), new c("Artist", 315, 2), new c("WhitePoint", 318, 5), new c("PrimaryChromaticities", 319, 5), new c("SubIFDPointer", 330, 4), new c("JPEGInterchangeFormat", 513, 4), new c("JPEGInterchangeFormatLength", 514, 4), new c("YCbCrCoefficients", 529, 5), new c("YCbCrSubSampling", 530, 3), new c("YCbCrPositioning", 531, 3), new c("ReferenceBlackWhite", 532, 5), new c("Copyright", 33432, 2), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("DNGVersion", 50706, 1), new c("DefaultCropSize", 50720, 3, 4)};
        f10489H = cVarArr5;
        f10490I = new c("StripOffsets", C1985b.f9296a, 3);
        c[] cVarArr6 = {new c("ThumbnailImage", 256, 7), new c("CameraSettingsIFDPointer", 8224, 4), new c("ImageProcessingIFDPointer", 8256, 4)};
        f10491J = cVarArr6;
        c[] cVarArr7 = {new c("PreviewImageStart", 257, 4), new c("PreviewImageLength", 258, 4)};
        f10492K = cVarArr7;
        c[] cVarArr8 = {new c("AspectFrame", 4371, 3)};
        f10493L = cVarArr8;
        c[] cVarArr9 = {new c("ColorSpace", 55, 3)};
        f10494M = cVarArr9;
        c[][] cVarArr10 = {cVarArr, cVarArr2, cVarArr3, cVarArr4, cVarArr5, cVarArr, cVarArr6, cVarArr7, cVarArr8, cVarArr9};
        f10495N = cVarArr10;
        f10496O = new c[]{new c("SubIFDPointer", 330, 4), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("InteroperabilityIFDPointer", 40965, 4), new c("CameraSettingsIFDPointer", 8224, 1), new c("ImageProcessingIFDPointer", 8256, 1)};
        f10497P = new c("JPEGInterchangeFormat", 513, 4);
        f10498Q = new c("JPEGInterchangeFormatLength", 514, 4);
        f10499R = new HashMap[cVarArr10.length];
        f10500S = new HashMap[cVarArr10.length];
        f10501T = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f10502U = new HashMap<>();
        Charset charsetForName = Charset.forName("US-ASCII");
        f10503V = charsetForName;
        f10504W = "Exif\u0000\u0000".getBytes(charsetForName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        f10515z = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i4 = 0;
        while (true) {
            c[][] cVarArr11 = f10495N;
            if (i4 >= cVarArr11.length) {
                HashMap<Integer, Integer> map = f10502U;
                c[] cVarArr12 = f10496O;
                map.put(Integer.valueOf(cVarArr12[0].f10542a), 5);
                map.put(Integer.valueOf(cVarArr12[1].f10542a), 1);
                map.put(Integer.valueOf(cVarArr12[2].f10542a), 2);
                map.put(Integer.valueOf(cVarArr12[3].f10542a), 3);
                map.put(Integer.valueOf(cVarArr12[4].f10542a), 7);
                map.put(Integer.valueOf(cVarArr12[5].f10542a), 8);
                f10505X = Pattern.compile(".*[1-9].*");
                f10506Y = Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
                return;
            }
            f10499R[i4] = new HashMap<>();
            f10500S[i4] = new HashMap<>();
            for (c cVar : cVarArr11[i4]) {
                f10499R[i4].put(Integer.valueOf(cVar.f10542a), cVar);
                f10500S[i4].put(cVar.f10543b, cVar);
            }
            i4++;
        }
    }

    public C2653a(InputStream inputStream) throws IOException {
        c[][] cVarArr = f10495N;
        this.f10519d = new HashMap[cVarArr.length];
        this.f10520e = new HashSet(cVarArr.length);
        this.f10521f = ByteOrder.BIG_ENDIAN;
        if (inputStream == null) {
            throw new IllegalArgumentException("inputStream cannot be null");
        }
        this.f10516a = null;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.f10517b = (AssetManager.AssetInputStream) inputStream;
        } else {
            this.f10517b = null;
        }
        m8887t(inputStream);
    }

    /* renamed from: A */
    private void m8867A(int i4, int i5) throws Throwable {
        if (this.f10519d[i4].isEmpty() || this.f10519d[i5].isEmpty()) {
            return;
        }
        b bVar = this.f10519d[i4].get("ImageLength");
        b bVar2 = this.f10519d[i4].get("ImageWidth");
        b bVar3 = this.f10519d[i5].get("ImageLength");
        b bVar4 = this.f10519d[i5].get("ImageWidth");
        if (bVar == null || bVar2 == null || bVar3 == null || bVar4 == null) {
            return;
        }
        int iM8908i = bVar.m8908i(this.f10521f);
        int iM8908i2 = bVar2.m8908i(this.f10521f);
        int iM8908i3 = bVar3.m8908i(this.f10521f);
        int iM8908i4 = bVar4.m8908i(this.f10521f);
        if (iM8908i >= iM8908i3 || iM8908i2 >= iM8908i4) {
            return;
        }
        HashMap<String, b>[] mapArr = this.f10519d;
        HashMap<String, b> map = mapArr[i4];
        mapArr[i4] = mapArr[i5];
        mapArr[i5] = map;
    }

    /* renamed from: B */
    private void m8868B(a aVar, int i4) throws Throwable {
        b bVarM8905f;
        b bVarM8905f2;
        b bVar = this.f10519d[i4].get("DefaultCropSize");
        b bVar2 = this.f10519d[i4].get("SensorTopBorder");
        b bVar3 = this.f10519d[i4].get("SensorLeftBorder");
        b bVar4 = this.f10519d[i4].get("SensorBottomBorder");
        b bVar5 = this.f10519d[i4].get("SensorRightBorder");
        if (bVar == null) {
            if (bVar2 == null || bVar3 == null || bVar4 == null || bVar5 == null) {
                m8892y(aVar, i4);
                return;
            }
            int iM8908i = bVar2.m8908i(this.f10521f);
            int iM8908i2 = bVar4.m8908i(this.f10521f);
            int iM8908i3 = bVar5.m8908i(this.f10521f);
            int iM8908i4 = bVar3.m8908i(this.f10521f);
            if (iM8908i2 <= iM8908i || iM8908i3 <= iM8908i4) {
                return;
            }
            b bVarM8905f3 = b.m8905f(iM8908i2 - iM8908i, this.f10521f);
            b bVarM8905f4 = b.m8905f(iM8908i3 - iM8908i4, this.f10521f);
            this.f10519d[i4].put("ImageLength", bVarM8905f3);
            this.f10519d[i4].put("ImageWidth", bVarM8905f4);
            return;
        }
        if (bVar.f10539a == 5) {
            d[] dVarArr = (d[]) bVar.m8910k(this.f10521f);
            if (dVarArr == null || dVarArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(dVarArr));
                return;
            }
            bVarM8905f = b.m8903d(dVarArr[0], this.f10521f);
            bVarM8905f2 = b.m8903d(dVarArr[1], this.f10521f);
        } else {
            int[] iArr = (int[]) bVar.m8910k(this.f10521f);
            if (iArr == null || iArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                return;
            }
            bVarM8905f = b.m8905f(iArr[0], this.f10521f);
            bVarM8905f2 = b.m8905f(iArr[1], this.f10521f);
        }
        this.f10519d[i4].put("ImageWidth", bVarM8905f);
        this.f10519d[i4].put("ImageLength", bVarM8905f2);
    }

    /* renamed from: C */
    private void m8869C(InputStream inputStream) throws Throwable {
        m8867A(0, 5);
        m8867A(0, 4);
        m8867A(5, 4);
        b bVar = this.f10519d[1].get("PixelXDimension");
        b bVar2 = this.f10519d[1].get("PixelYDimension");
        if (bVar != null && bVar2 != null) {
            this.f10519d[0].put("ImageWidth", bVar);
            this.f10519d[0].put("ImageLength", bVar2);
        }
        if (this.f10519d[4].isEmpty() && m8886s(this.f10519d[5])) {
            HashMap<String, b>[] mapArr = this.f10519d;
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap<>();
        }
        if (m8886s(this.f10519d[4])) {
            return;
        }
        Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
    }

    /* renamed from: a */
    private void m8870a() {
        String strM8894c = m8894c("DateTimeOriginal");
        if (strM8894c != null && m8894c("DateTime") == null) {
            this.f10519d[0].put("DateTime", b.m8900a(strM8894c));
        }
        if (m8894c("ImageWidth") == null) {
            this.f10519d[0].put("ImageWidth", b.m8901b(0L, this.f10521f));
        }
        if (m8894c("ImageLength") == null) {
            this.f10519d[0].put("ImageLength", b.m8901b(0L, this.f10521f));
        }
        if (m8894c("Orientation") == null) {
            this.f10519d[0].put("Orientation", b.m8901b(0L, this.f10521f));
        }
        if (m8894c("LightSource") == null) {
            this.f10519d[1].put("LightSource", b.m8901b(0L, this.f10521f));
        }
    }

    /* renamed from: b */
    private static long[] m8871b(Object obj) {
        if (!(obj instanceof int[])) {
            if (obj instanceof long[]) {
                return (long[]) obj;
            }
            return null;
        }
        int[] iArr = (int[]) obj;
        long[] jArr = new long[iArr.length];
        for (int i4 = 0; i4 < iArr.length; i4++) {
            jArr[i4] = iArr[i4];
        }
        return jArr;
    }

    /* renamed from: e */
    private b m8872e(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i4 = 0; i4 < f10495N.length; i4++) {
            b bVar = this.f10519d[i4].get(str);
            if (bVar != null) {
                return bVar;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0115, code lost:
    
        r10.m8899m(r9.f10521f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x011a, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057 A[FALL_THROUGH] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m8873f(p094h0.C2653a.a r10, int r11, int r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p094h0.C2653a.m8873f(h0.a$a, int, int):void");
    }

    /* renamed from: g */
    private int m8874g(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (m8881n(bArr)) {
            return 4;
        }
        if (m8883p(bArr)) {
            return 9;
        }
        if (m8882o(bArr)) {
            return 7;
        }
        return m8884q(bArr) ? 10 : 0;
    }

    /* renamed from: h */
    private void m8875h(a aVar) throws Throwable {
        m8877j(aVar);
        b bVar = this.f10519d[1].get("MakerNote");
        if (bVar != null) {
            a aVar2 = new a(bVar.f10541c);
            aVar2.m8899m(this.f10521f);
            byte[] bArr = f10513x;
            byte[] bArr2 = new byte[bArr.length];
            aVar2.readFully(bArr2);
            aVar2.m8898d(0L);
            byte[] bArr3 = f10514y;
            byte[] bArr4 = new byte[bArr3.length];
            aVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                aVar2.m8898d(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                aVar2.m8898d(12L);
            }
            m8891x(aVar2, 6);
            b bVar2 = this.f10519d[7].get("PreviewImageStart");
            b bVar3 = this.f10519d[7].get("PreviewImageLength");
            if (bVar2 != null && bVar3 != null) {
                this.f10519d[5].put("JPEGInterchangeFormat", bVar2);
                this.f10519d[5].put("JPEGInterchangeFormatLength", bVar3);
            }
            b bVar4 = this.f10519d[8].get("AspectFrame");
            if (bVar4 != null) {
                int[] iArr = (int[]) bVar4.m8910k(this.f10521f);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                if (iArr[2] <= iArr[0] || iArr[3] <= iArr[1]) {
                    return;
                }
                int i4 = (iArr[2] - iArr[0]) + 1;
                int i5 = (iArr[3] - iArr[1]) + 1;
                if (i4 < i5) {
                    int i6 = i4 + i5;
                    i5 = i6 - i5;
                    i4 = i6 - i5;
                }
                b bVarM8905f = b.m8905f(i4, this.f10521f);
                b bVarM8905f2 = b.m8905f(i5, this.f10521f);
                this.f10519d[0].put("ImageWidth", bVarM8905f);
                this.f10519d[0].put("ImageLength", bVarM8905f2);
            }
        }
    }

    /* renamed from: i */
    private void m8876i(a aVar) throws IOException {
        aVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        aVar.read(bArr);
        aVar.skipBytes(4);
        aVar.read(bArr2);
        int i4 = ByteBuffer.wrap(bArr).getInt();
        int i5 = ByteBuffer.wrap(bArr2).getInt();
        m8873f(aVar, i4, 5);
        aVar.m8898d(i5);
        aVar.m8899m(ByteOrder.BIG_ENDIAN);
        int i6 = aVar.readInt();
        for (int i7 = 0; i7 < i6; i7++) {
            int unsignedShort = aVar.readUnsignedShort();
            int unsignedShort2 = aVar.readUnsignedShort();
            if (unsignedShort == f10490I.f10542a) {
                short s3 = aVar.readShort();
                short s4 = aVar.readShort();
                b bVarM8905f = b.m8905f(s3, this.f10521f);
                b bVarM8905f2 = b.m8905f(s4, this.f10521f);
                this.f10519d[0].put("ImageLength", bVarM8905f);
                this.f10519d[0].put("ImageWidth", bVarM8905f2);
                return;
            }
            aVar.skipBytes(unsignedShort2);
        }
    }

    /* renamed from: j */
    private void m8877j(a aVar) throws Throwable {
        b bVar;
        m8888u(aVar, aVar.available());
        m8891x(aVar, 0);
        m8868B(aVar, 0);
        m8868B(aVar, 5);
        m8868B(aVar, 4);
        m8869C(aVar);
        if (this.f10518c != 8 || (bVar = this.f10519d[1].get("MakerNote")) == null) {
            return;
        }
        a aVar2 = new a(bVar.f10541c);
        aVar2.m8899m(this.f10521f);
        aVar2.m8898d(6L);
        m8891x(aVar2, 9);
        b bVar2 = this.f10519d[9].get("ColorSpace");
        if (bVar2 != null) {
            this.f10519d[1].put("ColorSpace", bVar2);
        }
    }

    /* renamed from: k */
    private void m8878k(a aVar) throws Throwable {
        m8877j(aVar);
        if (this.f10519d[0].get("JpgFromRaw") != null) {
            m8873f(aVar, this.f10531p, 5);
        }
        b bVar = this.f10519d[0].get("ISO");
        b bVar2 = this.f10519d[1].get("PhotographicSensitivity");
        if (bVar == null || bVar2 != null) {
            return;
        }
        this.f10519d[1].put("PhotographicSensitivity", bVar);
    }

    /* renamed from: l */
    private void m8879l(a aVar, HashMap map) throws Throwable {
        int i4;
        b bVar = (b) map.get("JPEGInterchangeFormat");
        b bVar2 = (b) map.get("JPEGInterchangeFormatLength");
        if (bVar == null || bVar2 == null) {
            return;
        }
        int iM8908i = bVar.m8908i(this.f10521f);
        int iMin = Math.min(bVar2.m8908i(this.f10521f), aVar.available() - iM8908i);
        int i5 = this.f10518c;
        if (i5 != 4 && i5 != 9 && i5 != 10) {
            if (i5 == 7) {
                i4 = this.f10528m;
            }
            if (iM8908i > 0 || iMin <= 0) {
            }
            this.f10522g = true;
            this.f10523h = iM8908i;
            this.f10524i = iMin;
            if (this.f10516a == null && this.f10517b == null) {
                byte[] bArr = new byte[iMin];
                aVar.m8898d(iM8908i);
                aVar.readFully(bArr);
                this.f10525j = bArr;
                return;
            }
            return;
        }
        i4 = this.f10527l;
        iM8908i += i4;
        if (iM8908i > 0) {
        }
    }

    /* renamed from: m */
    private void m8880m(a aVar, HashMap map) throws IOException {
        b bVar = (b) map.get("StripOffsets");
        b bVar2 = (b) map.get("StripByteCounts");
        if (bVar == null || bVar2 == null) {
            return;
        }
        long[] jArrM8871b = m8871b(bVar.m8910k(this.f10521f));
        long[] jArrM8871b2 = m8871b(bVar2.m8910k(this.f10521f));
        if (jArrM8871b == null) {
            Log.w("ExifInterface", "stripOffsets should not be null.");
            return;
        }
        if (jArrM8871b2 == null) {
            Log.w("ExifInterface", "stripByteCounts should not be null.");
            return;
        }
        long j4 = 0;
        for (long j5 : jArrM8871b2) {
            j4 += j5;
        }
        int i4 = (int) j4;
        byte[] bArr = new byte[i4];
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < jArrM8871b.length; i7++) {
            int i8 = (int) jArrM8871b[i7];
            int i9 = (int) jArrM8871b2[i7];
            int i10 = i8 - i5;
            if (i10 < 0) {
                Log.d("ExifInterface", "Invalid strip offset value");
            }
            aVar.m8898d(i10);
            int i11 = i5 + i10;
            byte[] bArr2 = new byte[i9];
            aVar.read(bArr2);
            i5 = i11 + i9;
            System.arraycopy(bArr2, 0, bArr, i6, i9);
            i6 += i9;
        }
        this.f10522g = true;
        this.f10525j = bArr;
        this.f10524i = i4;
    }

    /* renamed from: n */
    private static boolean m8881n(byte[] bArr) throws IOException {
        int i4 = 0;
        while (true) {
            byte[] bArr2 = f10512w;
            if (i4 >= bArr2.length) {
                return true;
            }
            if (bArr[i4] != bArr2[i4]) {
                return false;
            }
            i4++;
        }
    }

    /* renamed from: o */
    private boolean m8882o(byte[] bArr) throws IOException {
        a aVar = new a(bArr);
        ByteOrder byteOrderM8889v = m8889v(aVar);
        this.f10521f = byteOrderM8889v;
        aVar.m8899m(byteOrderM8889v);
        short s3 = aVar.readShort();
        aVar.close();
        return s3 == 20306 || s3 == 21330;
    }

    /* renamed from: p */
    private boolean m8883p(byte[] bArr) throws IOException {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i4 = 0; i4 < bytes.length; i4++) {
            if (bArr[i4] != bytes[i4]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: q */
    private boolean m8884q(byte[] bArr) throws IOException {
        a aVar = new a(bArr);
        ByteOrder byteOrderM8889v = m8889v(aVar);
        this.f10521f = byteOrderM8889v;
        aVar.m8899m(byteOrderM8889v);
        short s3 = aVar.readShort();
        aVar.close();
        return s3 == 85;
    }

    /* renamed from: r */
    private boolean m8885r(HashMap map) throws Throwable {
        b bVar;
        b bVar2 = (b) map.get("BitsPerSample");
        if (bVar2 == null) {
            return false;
        }
        int[] iArr = (int[]) bVar2.m8910k(this.f10521f);
        int[] iArr2 = f10509t;
        if (Arrays.equals(iArr2, iArr)) {
            return true;
        }
        if (this.f10518c != 3 || (bVar = (b) map.get("PhotometricInterpretation")) == null) {
            return false;
        }
        int iM8908i = bVar.m8908i(this.f10521f);
        return (iM8908i == 1 && Arrays.equals(iArr, f10511v)) || (iM8908i == 6 && Arrays.equals(iArr, iArr2));
    }

    /* renamed from: s */
    private boolean m8886s(HashMap map) throws IOException {
        b bVar = (b) map.get("ImageLength");
        b bVar2 = (b) map.get("ImageWidth");
        if (bVar == null || bVar2 == null) {
            return false;
        }
        return bVar.m8908i(this.f10521f) <= 512 && bVar2.m8908i(this.f10521f) <= 512;
    }

    /* renamed from: t */
    private void m8887t(InputStream inputStream) throws IOException {
        for (int i4 = 0; i4 < f10495N.length; i4++) {
            try {
                try {
                    this.f10519d[i4] = new HashMap<>();
                } catch (IOException unused) {
                    this.f10532q = false;
                }
            } finally {
                m8870a();
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        this.f10518c = m8874g(bufferedInputStream);
        a aVar = new a(bufferedInputStream);
        switch (this.f10518c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
                m8877j(aVar);
                break;
            case 4:
                m8873f(aVar, 0, 0);
                break;
            case 7:
                m8875h(aVar);
                break;
            case 9:
                m8876i(aVar);
                break;
            case 10:
                m8878k(aVar);
                break;
        }
        m8893z(aVar);
        this.f10532q = true;
    }

    /* renamed from: u */
    private void m8888u(a aVar, int i4) throws IOException {
        ByteOrder byteOrderM8889v = m8889v(aVar);
        this.f10521f = byteOrderM8889v;
        aVar.m8899m(byteOrderM8889v);
        int unsignedShort = aVar.readUnsignedShort();
        int i5 = this.f10518c;
        if (i5 != 7 && i5 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i6 = aVar.readInt();
        if (i6 < 8 || i6 >= i4) {
            throw new IOException("Invalid first Ifd offset: " + i6);
        }
        int i7 = i6 - 8;
        if (i7 <= 0 || aVar.skipBytes(i7) == i7) {
            return;
        }
        throw new IOException("Couldn't jump to first Ifd: " + i7);
    }

    /* renamed from: v */
    private ByteOrder m8889v(a aVar) throws IOException {
        short s3 = aVar.readShort();
        if (s3 == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s3 == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s3));
    }

    /* renamed from: w */
    private void m8890w(byte[] bArr, int i4) throws IOException {
        a aVar = new a(bArr);
        m8888u(aVar, bArr.length);
        m8891x(aVar, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0230  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m8891x(p094h0.C2653a.a r25, int r26) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p094h0.C2653a.m8891x(h0.a$a, int):void");
    }

    /* renamed from: y */
    private void m8892y(a aVar, int i4) throws IOException {
        b bVar;
        b bVar2 = this.f10519d[i4].get("ImageLength");
        b bVar3 = this.f10519d[i4].get("ImageWidth");
        if ((bVar2 == null || bVar3 == null) && (bVar = this.f10519d[i4].get("JPEGInterchangeFormat")) != null) {
            m8873f(aVar, bVar.m8908i(this.f10521f), i4);
        }
    }

    /* renamed from: z */
    private void m8893z(a aVar) throws Throwable {
        HashMap<String, b> map = this.f10519d[4];
        b bVar = map.get("Compression");
        if (bVar == null) {
            this.f10526k = 6;
            m8879l(aVar, map);
            return;
        }
        int iM8908i = bVar.m8908i(this.f10521f);
        this.f10526k = iM8908i;
        if (iM8908i != 1) {
            if (iM8908i == 6) {
                m8879l(aVar, map);
                return;
            } else if (iM8908i != 7) {
                return;
            }
        }
        if (m8885r(map)) {
            m8880m(aVar, map);
        }
    }

    /* renamed from: c */
    public String m8894c(String str) {
        b bVarM8872e = m8872e(str);
        if (bVarM8872e != null) {
            if (!f10501T.contains(str)) {
                return bVarM8872e.m8909j(this.f10521f);
            }
            if (str.equals("GPSTimeStamp")) {
                int i4 = bVarM8872e.f10539a;
                if (i4 != 5 && i4 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + bVarM8872e.f10539a);
                    return null;
                }
                d[] dVarArr = (d[]) bVarM8872e.m8910k(this.f10521f);
                if (dVarArr != null && dVarArr.length == 3) {
                    return String.format("%02d:%02d:%02d", Integer.valueOf((int) (dVarArr[0].f10546a / dVarArr[0].f10547b)), Integer.valueOf((int) (dVarArr[1].f10546a / dVarArr[1].f10547b)), Integer.valueOf((int) (dVarArr[2].f10546a / dVarArr[2].f10547b)));
                }
                Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(dVarArr));
                return null;
            }
            try {
                return Double.toString(bVarM8872e.m8907h(this.f10521f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* renamed from: d */
    public int m8895d(String str, int i4) {
        b bVarM8872e = m8872e(str);
        if (bVarM8872e == null) {
            return i4;
        }
        try {
            return bVarM8872e.m8908i(this.f10521f);
        } catch (NumberFormatException unused) {
            return i4;
        }
    }

    /* renamed from: h0.a$a */
    private static class a extends InputStream implements DataInput {

        /* renamed from: e */
        private static final ByteOrder f10533e = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: f */
        private static final ByteOrder f10534f = ByteOrder.BIG_ENDIAN;

        /* renamed from: a */
        private DataInputStream f10535a;

        /* renamed from: b */
        private ByteOrder f10536b;

        /* renamed from: c */
        final int f10537c;

        /* renamed from: d */
        int f10538d;

        public a(InputStream inputStream) throws IOException {
            this.f10536b = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f10535a = dataInputStream;
            int iAvailable = dataInputStream.available();
            this.f10537c = iAvailable;
            this.f10538d = 0;
            this.f10535a.mark(iAvailable);
        }

        /* renamed from: a */
        public int m8896a() {
            return this.f10538d;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.f10535a.available();
        }

        /* renamed from: b */
        public long m8897b() throws IOException {
            return readInt() & 4294967295L;
        }

        /* renamed from: d */
        public void m8898d(long j4) throws IOException {
            int i4 = this.f10538d;
            if (i4 > j4) {
                this.f10538d = 0;
                this.f10535a.reset();
                this.f10535a.mark(this.f10537c);
            } else {
                j4 -= i4;
            }
            int i5 = (int) j4;
            if (skipBytes(i5) != i5) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        /* renamed from: m */
        public void m8899m(ByteOrder byteOrder) {
            this.f10536b = byteOrder;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            this.f10538d++;
            return this.f10535a.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() throws IOException {
            this.f10538d++;
            return this.f10535a.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            int i4 = this.f10538d + 1;
            this.f10538d = i4;
            if (i4 > this.f10537c) {
                throw new EOFException();
            }
            int i5 = this.f10535a.read();
            if (i5 >= 0) {
                return (byte) i5;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() throws IOException {
            this.f10538d += 2;
            return this.f10535a.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i4, int i5) throws IOException {
            int i6 = this.f10538d + i5;
            this.f10538d = i6;
            if (i6 > this.f10537c) {
                throw new EOFException();
            }
            if (this.f10535a.read(bArr, i4, i5) != i5) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            int i4 = this.f10538d + 4;
            this.f10538d = i4;
            if (i4 > this.f10537c) {
                throw new EOFException();
            }
            int i5 = this.f10535a.read();
            int i6 = this.f10535a.read();
            int i7 = this.f10535a.read();
            int i8 = this.f10535a.read();
            if ((i5 | i6 | i7 | i8) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f10536b;
            if (byteOrder == f10533e) {
                return (i8 << 24) + (i7 << 16) + (i6 << 8) + i5;
            }
            if (byteOrder == f10534f) {
                return (i5 << 24) + (i6 << 16) + (i7 << 8) + i8;
            }
            throw new IOException("Invalid byte order: " + this.f10536b);
        }

        @Override // java.io.DataInput
        public String readLine() throws IOException {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            int i4 = this.f10538d + 8;
            this.f10538d = i4;
            if (i4 > this.f10537c) {
                throw new EOFException();
            }
            int i5 = this.f10535a.read();
            int i6 = this.f10535a.read();
            int i7 = this.f10535a.read();
            int i8 = this.f10535a.read();
            int i9 = this.f10535a.read();
            int i10 = this.f10535a.read();
            int i11 = this.f10535a.read();
            int i12 = this.f10535a.read();
            if ((i5 | i6 | i7 | i8 | i9 | i10 | i11 | i12) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f10536b;
            if (byteOrder == f10533e) {
                return (i12 << 56) + (i11 << 48) + (i10 << 40) + (i9 << 32) + (i8 << 24) + (i7 << 16) + (i6 << 8) + i5;
            }
            if (byteOrder == f10534f) {
                return (i5 << 56) + (i6 << 48) + (i7 << 40) + (i8 << 32) + (i9 << 24) + (i10 << 16) + (i11 << 8) + i12;
            }
            throw new IOException("Invalid byte order: " + this.f10536b);
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            int i4 = this.f10538d + 2;
            this.f10538d = i4;
            if (i4 > this.f10537c) {
                throw new EOFException();
            }
            int i5 = this.f10535a.read();
            int i6 = this.f10535a.read();
            if ((i5 | i6) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f10536b;
            if (byteOrder == f10533e) {
                return (short) ((i6 << 8) + i5);
            }
            if (byteOrder == f10534f) {
                return (short) ((i5 << 8) + i6);
            }
            throw new IOException("Invalid byte order: " + this.f10536b);
        }

        @Override // java.io.DataInput
        public String readUTF() throws IOException {
            this.f10538d += 2;
            return this.f10535a.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() throws IOException {
            this.f10538d++;
            return this.f10535a.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            int i4 = this.f10538d + 2;
            this.f10538d = i4;
            if (i4 > this.f10537c) {
                throw new EOFException();
            }
            int i5 = this.f10535a.read();
            int i6 = this.f10535a.read();
            if ((i5 | i6) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f10536b;
            if (byteOrder == f10533e) {
                return (i6 << 8) + i5;
            }
            if (byteOrder == f10534f) {
                return (i5 << 8) + i6;
            }
            throw new IOException("Invalid byte order: " + this.f10536b);
        }

        @Override // java.io.DataInput
        public int skipBytes(int i4) throws IOException {
            int iMin = Math.min(i4, this.f10537c - this.f10538d);
            int iSkipBytes = 0;
            while (iSkipBytes < iMin) {
                iSkipBytes += this.f10535a.skipBytes(iMin - iSkipBytes);
            }
            this.f10538d += iSkipBytes;
            return iSkipBytes;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i4, int i5) throws IOException {
            int i6 = this.f10535a.read(bArr, i4, i5);
            this.f10538d += i6;
            return i6;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            int length = this.f10538d + bArr.length;
            this.f10538d = length;
            if (length <= this.f10537c) {
                if (this.f10535a.read(bArr, 0, bArr.length) != bArr.length) {
                    throw new IOException("Couldn't read up to the length of buffer");
                }
                return;
            }
            throw new EOFException();
        }

        public a(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr));
        }
    }

    /* renamed from: h0.a$c */
    static class c {

        /* renamed from: a */
        public final int f10542a;

        /* renamed from: b */
        public final String f10543b;

        /* renamed from: c */
        public final int f10544c;

        /* renamed from: d */
        public final int f10545d;

        c(String str, int i4, int i5) {
            this.f10543b = str;
            this.f10542a = i4;
            this.f10544c = i5;
            this.f10545d = -1;
        }

        /* renamed from: a */
        boolean m8911a(int i4) {
            int i5;
            int i6 = this.f10544c;
            if (i6 == 7 || i4 == 7 || i6 == i4 || (i5 = this.f10545d) == i4) {
                return true;
            }
            if ((i6 == 4 || i5 == 4) && i4 == 3) {
                return true;
            }
            if ((i6 == 9 || i5 == 9) && i4 == 8) {
                return true;
            }
            return (i6 == 12 || i5 == 12) && i4 == 11;
        }

        c(String str, int i4, int i5, int i6) {
            this.f10543b = str;
            this.f10542a = i4;
            this.f10544c = i5;
            this.f10545d = i6;
        }
    }
}
