package p116n5;

import androidx.core.view.PointerIconCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import p065g5.AbstractC6424h;

/* renamed from: n5.q */
/* loaded from: classes4.dex */
public final class C7483q {

    /* renamed from: c */
    public static final byte[] f9654c;

    /* renamed from: a */
    public static final C7483q f9652a = new C7483q();

    /* renamed from: b */
    public static final int[] f9653b = {8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW, PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW, 4090, 8185, 21, 248, 2042, PointerIconCompat.TYPE_ZOOM_IN, PointerIconCompat.TYPE_ZOOM_OUT, 249, 2043, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, 4091, PointerIconCompat.TYPE_GRAB, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 252, 115, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, 117, 40, 41, 42, 7, 43, 118, 44, 8, 9, 45, 119, 120, 121, 122, 123, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};

    /* renamed from: d */
    public static final a f9655d = new a();

    static {
        byte[] bArr = {13, 23, 28, 28, 28, 28, 28, 28, 28, 24, 30, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 28, 6, 10, 10, 12, 13, 6, 8, 11, 10, 10, 8, 11, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, 15, 6, 12, 10, 13, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, 13, 19, 13, 14, 6, 15, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, 15, 11, 14, 13, 28, 20, 22, 20, 20, 22, 22, 22, 23, 22, 23, 23, 23, 23, 23, 24, 23, 24, 24, 22, 23, 24, 23, 23, 23, 23, 21, 22, 23, 22, 23, 23, 24, 22, 21, 20, 22, 22, 23, 23, 21, 23, 22, 22, 24, 21, 22, 23, 23, 21, 21, 22, 21, 23, 22, 23, 23, 20, 22, 22, 22, 23, 22, 22, 23, 26, 26, 20, 19, 22, 23, 22, 25, 26, 26, 26, 27, 27, 26, 24, 25, 19, 21, 26, 27, 27, 26, 27, 24, 21, 21, 26, 26, 28, 27, 27, 27, 20, 24, 20, 21, 22, 21, 21, 23, 22, 22, 25, 25, 24, 24, 26, 23, 26, 27, 26, 26, 27, 27, 27, 27, 27, 28, 27, 27, 27, 27, 27, 26};
        f9654c = bArr;
        int length = bArr.length;
        for (int i6 = 0; i6 < length; i6++) {
            f9652a.m8592a(i6, f9653b[i6], f9654c[i6]);
        }
    }

    /* renamed from: a */
    public final void m8592a(int i6, int i7, int i8) {
        a aVar = new a(i6, i8);
        a aVar2 = f9655d;
        while (i8 > 8) {
            i8 -= 8;
            int i9 = (i7 >>> i8) & 255;
            a[] aVarArrM8596a = aVar2.m8596a();
            Intrinsics.checkNotNull(aVarArrM8596a);
            a aVar3 = aVarArrM8596a[i9];
            if (aVar3 == null) {
                aVar3 = new a();
                aVarArrM8596a[i9] = aVar3;
            }
            aVar2 = aVar3;
        }
        int i10 = 8 - i8;
        int i11 = (i7 << i10) & 255;
        a[] aVarArrM8596a2 = aVar2.m8596a();
        Intrinsics.checkNotNull(aVarArrM8596a2);
        ArraysKt.fill(aVarArrM8596a2, aVar, i11, (1 << i10) + i11);
    }

    /* renamed from: b */
    public final void m8593b(BufferedSource source, long j6, BufferedSink sink) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        a aVar = f9655d;
        int iM6988b = 0;
        int iM8598c = 0;
        for (long j7 = 0; j7 < j6; j7++) {
            iM6988b = (iM6988b << 8) | AbstractC6424h.m6988b(source.readByte(), 255);
            iM8598c += 8;
            while (iM8598c >= 8) {
                a[] aVarArrM8596a = aVar.m8596a();
                Intrinsics.checkNotNull(aVarArrM8596a);
                aVar = aVarArrM8596a[(iM6988b >>> (iM8598c - 8)) & 255];
                Intrinsics.checkNotNull(aVar);
                if (aVar.m8596a() == null) {
                    sink.writeByte(aVar.m8597b());
                    iM8598c -= aVar.m8598c();
                    aVar = f9655d;
                } else {
                    iM8598c -= 8;
                }
            }
        }
        while (iM8598c > 0) {
            a[] aVarArrM8596a2 = aVar.m8596a();
            Intrinsics.checkNotNull(aVarArrM8596a2);
            a aVar2 = aVarArrM8596a2[(iM6988b << (8 - iM8598c)) & 255];
            Intrinsics.checkNotNull(aVar2);
            if (aVar2.m8596a() != null || aVar2.m8598c() > iM8598c) {
                return;
            }
            sink.writeByte(aVar2.m8597b());
            iM8598c -= aVar2.m8598c();
            aVar = f9655d;
        }
    }

    /* renamed from: c */
    public final void m8594c(ByteString source, BufferedSink sink) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        int size = source.size();
        long j6 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            int iM6988b = AbstractC6424h.m6988b(source.getByte(i7), 255);
            int i8 = f9653b[iM6988b];
            byte b7 = f9654c[iM6988b];
            j6 = (j6 << b7) | i8;
            i6 += b7;
            while (i6 >= 8) {
                i6 -= 8;
                sink.writeByte((int) (j6 >> i6));
            }
        }
        if (i6 > 0) {
            sink.writeByte((int) ((j6 << (8 - i6)) | (255 >>> i6)));
        }
    }

    /* renamed from: d */
    public final int m8595d(ByteString bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        long j6 = 0;
        for (int i6 = 0; i6 < bytes.size(); i6++) {
            j6 += f9654c[AbstractC6424h.m6988b(bytes.getByte(i6), 255)];
        }
        return (int) ((j6 + 7) >> 3);
    }

    /* renamed from: n5.q$a */
    public static final class a {

        /* renamed from: a */
        public final a[] f9656a;

        /* renamed from: b */
        public final int f9657b;

        /* renamed from: c */
        public final int f9658c;

        public a() {
            this.f9656a = new a[256];
            this.f9657b = 0;
            this.f9658c = 0;
        }

        /* renamed from: a */
        public final a[] m8596a() {
            return this.f9656a;
        }

        /* renamed from: b */
        public final int m8597b() {
            return this.f9657b;
        }

        /* renamed from: c */
        public final int m8598c() {
            return this.f9658c;
        }

        public a(int i6, int i7) {
            this.f9656a = null;
            this.f9657b = i6;
            int i8 = i7 & 7;
            this.f9658c = i8 == 0 ? 8 : i8;
        }
    }
}
