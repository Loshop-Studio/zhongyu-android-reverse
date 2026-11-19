package p149z2;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.view.PointerIconCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.p040uc.crashsdk.export.ExitType;
import com.umeng.analytics.pro.C3376bw;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import p121s2.AbstractC4550b;

/* renamed from: z2.i */
/* loaded from: classes2.dex */
public final class C4716i {

    /* renamed from: a */
    public static final int[] f6268a;

    /* renamed from: b */
    public static final byte[] f6269b;

    /* renamed from: c */
    public static final a f6270c;

    /* renamed from: d */
    public static final C4716i f6271d;

    static {
        C4716i c4716i = new C4716i();
        f6271d = c4716i;
        f6268a = new int[]{8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW, PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW, 4090, 8185, 21, 248, 2042, PointerIconCompat.TYPE_ZOOM_IN, PointerIconCompat.TYPE_ZOOM_OUT, 249, 2043, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, 4091, PointerIconCompat.TYPE_GRAB, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, ExitType.UNEXP_REASON_ANR, 104, ExitType.UNEXP_REASON_KILL_PROCESS, ExitType.UNEXP_REASON_RESTART, ExitType.UNEXP_REASON_LOW_MEMORY, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, UMErrorCode.E_UM_BE_JSON_FAILED, UMErrorCode.E_UM_BE_CREATE_FAILED, UMErrorCode.E_UM_BE_DEFLATE_FAILED, UMErrorCode.E_UM_BE_RAW_OVERSIZE, UMErrorCode.E_UM_BE_FILE_OVERSIZE, 252, 115, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, 117, 40, 41, 42, 7, 43, 118, 44, 8, 9, 45, 119, 120, UMErrorCode.E_UM_BE_EMPTY_URL_PATH, 122, 123, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};
        byte[] bArr = {C3376bw.f1944k, 23, 28, 28, 28, 28, 28, 28, 28, 24, 30, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 28, 6, 10, 10, 12, C3376bw.f1944k, 6, 8, 11, 10, 10, 8, 11, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, C3376bw.f1946m, 6, 12, 10, C3376bw.f1944k, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, C3376bw.f1944k, 19, C3376bw.f1944k, C3376bw.f1945l, 6, C3376bw.f1946m, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, C3376bw.f1946m, 11, C3376bw.f1945l, C3376bw.f1944k, 28, 20, 22, 20, 20, 22, 22, 22, 23, 22, 23, 23, 23, 23, 23, 24, 23, 24, 24, 22, 23, 24, 23, 23, 23, 23, 21, 22, 23, 22, 23, 23, 24, 22, 21, 20, 22, 22, 23, 23, 21, 23, 22, 22, 24, 21, 22, 23, 23, 21, 21, 22, 21, 23, 22, 23, 23, 20, 22, 22, 22, 23, 22, 22, 23, 26, 26, 20, 19, 22, 23, 22, 25, 26, 26, 26, 27, 27, 26, 24, 25, 19, 21, 26, 27, 27, 26, 27, 24, 21, 21, 26, 26, 28, 27, 27, 27, 20, 24, 20, 21, 22, 21, 21, 23, 22, 22, 25, 25, 24, 24, 26, 23, 26, 27, 26, 26, 27, 27, 27, 27, 27, 28, 27, 27, 27, 27, 27, 26};
        f6269b = bArr;
        f6270c = new a();
        int length = bArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            c4716i.m6904a(i4, f6268a[i4], f6269b[i4]);
        }
    }

    /* renamed from: a */
    public final void m6904a(int i4, int i5, int i6) {
        a aVar = new a(i4, i6);
        a aVar2 = f6270c;
        while (i6 > 8) {
            i6 -= 8;
            int i7 = (i5 >>> i6) & 255;
            a[] aVarArrM6908a = aVar2.m6908a();
            Intrinsics.checkNotNull(aVarArrM6908a);
            a aVar3 = aVarArrM6908a[i7];
            if (aVar3 == null) {
                aVar3 = new a();
                aVarArrM6908a[i7] = aVar3;
            }
            aVar2 = aVar3;
        }
        int i8 = 8 - i6;
        int i9 = (i5 << i8) & 255;
        a[] aVarArrM6908a2 = aVar2.m6908a();
        Intrinsics.checkNotNull(aVarArrM6908a2);
        ArraysKt___ArraysJvmKt.fill(aVarArrM6908a2, aVar, i9, (1 << i8) + i9);
    }

    /* renamed from: b */
    public final void m6905b(BufferedSource source, long j4, BufferedSink sink) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        a aVar = f6270c;
        int iM6220b = 0;
        int iM6910c = 0;
        for (long j5 = 0; j5 < j4; j5++) {
            iM6220b = (iM6220b << 8) | AbstractC4550b.m6220b(source.readByte(), 255);
            iM6910c += 8;
            while (iM6910c >= 8) {
                int i4 = iM6910c - 8;
                a[] aVarArrM6908a = aVar.m6908a();
                Intrinsics.checkNotNull(aVarArrM6908a);
                aVar = aVarArrM6908a[(iM6220b >>> i4) & 255];
                Intrinsics.checkNotNull(aVar);
                if (aVar.m6908a() == null) {
                    sink.writeByte(aVar.m6909b());
                    iM6910c -= aVar.m6910c();
                    aVar = f6270c;
                } else {
                    iM6910c = i4;
                }
            }
        }
        while (iM6910c > 0) {
            a[] aVarArrM6908a2 = aVar.m6908a();
            Intrinsics.checkNotNull(aVarArrM6908a2);
            a aVar2 = aVarArrM6908a2[(iM6220b << (8 - iM6910c)) & 255];
            Intrinsics.checkNotNull(aVar2);
            if (aVar2.m6908a() != null || aVar2.m6910c() > iM6910c) {
                return;
            }
            sink.writeByte(aVar2.m6909b());
            iM6910c -= aVar2.m6910c();
            aVar = f6270c;
        }
    }

    /* renamed from: c */
    public final void m6906c(ByteString source, BufferedSink sink) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        int size = source.size();
        long j4 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            int iM6220b = AbstractC4550b.m6220b(source.getByte(i5), 255);
            int i6 = f6268a[iM6220b];
            byte b4 = f6269b[iM6220b];
            j4 = (j4 << b4) | i6;
            i4 += b4;
            while (i4 >= 8) {
                i4 -= 8;
                sink.writeByte((int) (j4 >> i4));
            }
        }
        if (i4 > 0) {
            sink.writeByte((int) ((j4 << (8 - i4)) | (255 >>> i4)));
        }
    }

    /* renamed from: d */
    public final int m6907d(ByteString bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        long j4 = 0;
        for (int i4 = 0; i4 < bytes.size(); i4++) {
            j4 += f6269b[AbstractC4550b.m6220b(bytes.getByte(i4), 255)];
        }
        return (int) ((j4 + 7) >> 3);
    }

    /* renamed from: z2.i$a */
    public static final class a {

        /* renamed from: a */
        public final a[] f6272a;

        /* renamed from: b */
        public final int f6273b;

        /* renamed from: c */
        public final int f6274c;

        public a() {
            this.f6272a = new a[256];
            this.f6273b = 0;
            this.f6274c = 0;
        }

        /* renamed from: a */
        public final a[] m6908a() {
            return this.f6272a;
        }

        /* renamed from: b */
        public final int m6909b() {
            return this.f6273b;
        }

        /* renamed from: c */
        public final int m6910c() {
            return this.f6274c;
        }

        public a(int i4, int i5) {
            this.f6272a = null;
            this.f6273b = i4;
            int i6 = i5 & 7;
            this.f6274c = i6 == 0 ? 8 : i6;
        }
    }
}
