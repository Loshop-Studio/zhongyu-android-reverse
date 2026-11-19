package re;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.compose.material3.MenuKt;
import androidx.core.view.PointerIconCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.taobao.sophix.PatchStatus;
import ke.AbstractC9920d;
import kotlin.jvm.internal.AbstractC9979u;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import org.eclipse.paho.client.mqttv3.internal.wire.MqttWireMessage;
import p325rc.AbstractC10964p;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* renamed from: re.e */
/* loaded from: classes6.dex */
public final class C10998e {

    /* renamed from: a */
    public static final C10998e f26553a = new C10998e();

    /* renamed from: b */
    public static final int[] f26554b = {8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW, PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW, 4090, 8185, 21, 248, 2042, PointerIconCompat.TYPE_ZOOM_IN, PointerIconCompat.TYPE_ZOOM_OUT, 249, 2043, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, 4091, PointerIconCompat.TYPE_GRAB, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, PatchStatus.CODE_PRELOAD_REMOVE_BASEDEX, 106, PatchStatus.CODE_PRELOAD_OPT_MERGED, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, IjkMediaMeta.FF_PROFILE_H264_HIGH_10, 111, 112, 113, 114, 252, 115, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, 117, 40, 41, 42, 7, 43, 118, 44, 8, 9, 45, 119, MenuKt.InTransitionDuration, PatchStatus.CODE_LOAD_RES_INJECT_PATH, 122, PatchStatus.CODE_LOAD_RES_ADDASSERTPATH, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};

    /* renamed from: c */
    public static final byte[] f26555c;

    /* renamed from: d */
    public static final a f26556d;

    static {
        byte[] bArr = {13, 23, 28, 28, 28, 28, 28, 28, 28, 24, 30, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 28, 6, 10, 10, MqttWireMessage.MESSAGE_TYPE_PINGREQ, 13, 6, 8, MqttWireMessage.MESSAGE_TYPE_UNSUBACK, 10, 10, 8, MqttWireMessage.MESSAGE_TYPE_UNSUBACK, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, 15, 6, MqttWireMessage.MESSAGE_TYPE_PINGREQ, 10, 13, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, 13, 19, 13, MqttWireMessage.MESSAGE_TYPE_DISCONNECT, 6, 15, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, 15, MqttWireMessage.MESSAGE_TYPE_UNSUBACK, MqttWireMessage.MESSAGE_TYPE_DISCONNECT, 13, 28, 20, 22, 20, 20, 22, 22, 22, 23, 22, 23, 23, 23, 23, 23, 24, 23, 24, 24, 22, 23, 24, 23, 23, 23, 23, 21, 22, 23, 22, 23, 23, 24, 22, 21, 20, 22, 22, 23, 23, 21, 23, 22, 22, 24, 21, 22, 23, 23, 21, 21, 22, 21, 23, 22, 23, 23, 20, 22, 22, 22, 23, 22, 22, 23, 26, 26, 20, 19, 22, 23, 22, 25, 26, 26, 26, 27, 27, 26, 24, 25, 19, 21, 26, 27, 27, 26, 27, 24, 21, 21, 26, 26, 28, 27, 27, 27, 20, 24, 20, 21, 22, 21, 21, 23, 22, 22, 25, 25, 24, 24, 26, 23, 26, 27, 26, 26, 27, 27, 27, 27, 27, 28, 27, 27, 27, 27, 27, 26};
        f26555c = bArr;
        f26556d = new a();
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            f26553a.m24295a(i10, f26554b[i10], f26555c[i10]);
        }
    }

    /* renamed from: a */
    public final void m24295a(int i10, int i11, int i12) {
        a aVar = new a(i10, i12);
        a aVar2 = f26556d;
        while (i12 > 8) {
            i12 -= 8;
            int i13 = (i11 >>> i12) & 255;
            a[] aVarArrM24299a = aVar2.m24299a();
            AbstractC9979u.m20291d(aVarArrM24299a);
            a aVar3 = aVarArrM24299a[i13];
            if (aVar3 == null) {
                aVar3 = new a();
                aVarArrM24299a[i13] = aVar3;
            }
            aVar2 = aVar3;
        }
        int i14 = 8 - i12;
        int i15 = (i11 << i14) & 255;
        a[] aVarArrM24299a2 = aVar2.m24299a();
        AbstractC9979u.m20291d(aVarArrM24299a2);
        AbstractC10964p.m23987B(aVarArrM24299a2, aVar, i15, (1 << i14) + i15);
    }

    /* renamed from: b */
    public final void m24296b(BufferedSource source, long j10, BufferedSink sink) {
        AbstractC9979u.m20294g(source, "source");
        AbstractC9979u.m20294g(sink, "sink");
        a aVar = f26556d;
        int iM20022d = 0;
        int iM24301c = 0;
        for (long j11 = 0; j11 < j10; j11++) {
            iM20022d = (iM20022d << 8) | AbstractC9920d.m20022d(source.readByte(), 255);
            iM24301c += 8;
            while (iM24301c >= 8) {
                a[] aVarArrM24299a = aVar.m24299a();
                AbstractC9979u.m20291d(aVarArrM24299a);
                aVar = aVarArrM24299a[(iM20022d >>> (iM24301c - 8)) & 255];
                AbstractC9979u.m20291d(aVar);
                if (aVar.m24299a() == null) {
                    sink.writeByte(aVar.m24300b());
                    iM24301c -= aVar.m24301c();
                    aVar = f26556d;
                } else {
                    iM24301c -= 8;
                }
            }
        }
        while (iM24301c > 0) {
            a[] aVarArrM24299a2 = aVar.m24299a();
            AbstractC9979u.m20291d(aVarArrM24299a2);
            a aVar2 = aVarArrM24299a2[(iM20022d << (8 - iM24301c)) & 255];
            AbstractC9979u.m20291d(aVar2);
            if (aVar2.m24299a() != null || aVar2.m24301c() > iM24301c) {
                return;
            }
            sink.writeByte(aVar2.m24300b());
            iM24301c -= aVar2.m24301c();
            aVar = f26556d;
        }
    }

    /* renamed from: c */
    public final void m24297c(ByteString source, BufferedSink sink) {
        AbstractC9979u.m20294g(source, "source");
        AbstractC9979u.m20294g(sink, "sink");
        int size = source.size();
        long j10 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            int iM20022d = AbstractC9920d.m20022d(source.getByte(i11), 255);
            int i12 = f26554b[iM20022d];
            byte b10 = f26555c[iM20022d];
            j10 = (j10 << b10) | i12;
            i10 += b10;
            while (i10 >= 8) {
                i10 -= 8;
                sink.writeByte((int) (j10 >> i10));
            }
        }
        if (i10 > 0) {
            sink.writeByte((int) ((j10 << (8 - i10)) | (255 >>> i10)));
        }
    }

    /* renamed from: d */
    public final int m24298d(ByteString bytes) {
        AbstractC9979u.m20294g(bytes, "bytes");
        long j10 = 0;
        for (int i10 = 0; i10 < bytes.size(); i10++) {
            j10 += f26555c[AbstractC9920d.m20022d(bytes.getByte(i10), 255)];
        }
        return (int) ((j10 + 7) >> 3);
    }

    /* renamed from: re.e$a */
    public static final class a {

        /* renamed from: a */
        public final a[] f26557a;

        /* renamed from: b */
        public final int f26558b;

        /* renamed from: c */
        public final int f26559c;

        public a() {
            this.f26557a = new a[256];
            this.f26558b = 0;
            this.f26559c = 0;
        }

        /* renamed from: a */
        public final a[] m24299a() {
            return this.f26557a;
        }

        /* renamed from: b */
        public final int m24300b() {
            return this.f26558b;
        }

        /* renamed from: c */
        public final int m24301c() {
            return this.f26559c;
        }

        public a(int i10, int i11) {
            this.f26557a = null;
            this.f26558b = i10;
            int i12 = i11 & 7;
            this.f26559c = i12 == 0 ? 8 : i12;
        }
    }
}
