package androidx.compose.p014ui.spatial;

import androidx.compose.p014ui.geometry.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.asm.Opcodes;
import com.alibaba.fastjson.parser.JSONLexer;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9545q;
import p181hd.InterfaceC9546r;
import p181hd.InterfaceC9547s;
import p181hd.InterfaceC9548t;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class RectList {
    public static final int $stable = 8;
    public int itemsSize;
    public long[] items = new long[Opcodes.CHECKCAST];
    public long[] stack = new long[Opcodes.CHECKCAST];

    private final int allocateItemsIndex() {
        long[] jArr = this.items;
        int i10 = this.itemsSize;
        int i11 = i10 + 3;
        this.itemsSize = i11;
        int length = jArr.length;
        if (length <= i11) {
            resizeStorage(length, i10, jArr);
        }
        return i10;
    }

    public static /* synthetic */ void insert$default(RectList rectList, int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, boolean z11, int i16, Object obj) {
        boolean z12;
        RectList rectList2;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22 = (i16 & 32) != 0 ? -1 : i15;
        boolean z13 = (i16 & 64) != 0 ? false : z10;
        if ((i16 & 128) != 0) {
            z12 = false;
            i17 = i10;
            i18 = i11;
            i19 = i12;
            i20 = i13;
            i21 = i14;
            rectList2 = rectList;
        } else {
            z12 = z11;
            rectList2 = rectList;
            i17 = i10;
            i18 = i11;
            i19 = i12;
            i20 = i13;
            i21 = i14;
        }
        rectList2.insert(i17, i18, i19, i20, i21, i22, z13, z12);
    }

    private final void resizeStorage(int i10, int i11, long[] jArr) {
        int iMax = Math.max(i10 * 2, i11 + 3);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
        AbstractC9979u.m20293f(jArrCopyOf, "copyOf(...)");
        this.items = jArrCopyOf;
        long[] jArrCopyOf2 = Arrays.copyOf(this.stack, iMax);
        AbstractC9979u.m20293f(jArrCopyOf2, "copyOf(...)");
        this.stack = jArrCopyOf2;
    }

    public final void clearUpdated() {
        long[] jArr = this.items;
        int i10 = this.itemsSize;
        for (int i11 = 0; i11 < jArr.length - 2 && i11 < i10; i11 += 3) {
            int i12 = i11 + 2;
            jArr[i12] = jArr[i12] & (-2305843009213693953L);
        }
    }

    public final boolean contains(int i10) {
        int i11 = i10 & RectListKt.Lower26Bits;
        long[] jArr = this.items;
        int i12 = this.itemsSize;
        for (int i13 = 0; i13 < jArr.length - 2 && i13 < i12; i13 += 3) {
            if ((((int) jArr[i13 + 2]) & RectListKt.Lower26Bits) == i11) {
                return true;
            }
        }
        return false;
    }

    public final String debugString() {
        StringBuilder sb2 = new StringBuilder();
        long[] jArr = this.items;
        int i10 = this.itemsSize;
        for (int i11 = 0; i11 < jArr.length - 2 && i11 < i10; i11 += 3) {
            long j10 = jArr[i11];
            long j11 = jArr[i11 + 1];
            long j12 = jArr[i11 + 2];
            sb2.append("id=" + (((int) j12) & RectListKt.Lower26Bits) + ", rect=[" + ((int) (j10 >> 32)) + ',' + ((int) j10) + ',' + ((int) (j11 >> 32)) + ',' + ((int) j11) + "], parent=" + (((int) (j12 >> 26)) & RectListKt.Lower26Bits));
            AbstractC9979u.m20293f(sb2, "append(...)");
            sb2.append('\n');
            AbstractC9979u.m20293f(sb2, "append(...)");
        }
        String string = sb2.toString();
        AbstractC9979u.m20293f(string, "toString(...)");
        return string;
    }

    public final void defragment() {
        long[] jArr = this.items;
        int i10 = this.itemsSize;
        long[] jArr2 = this.stack;
        int i11 = 0;
        for (int i12 = 0; i12 < jArr.length - 2 && i11 < jArr2.length - 2 && i12 < i10; i12 += 3) {
            int i13 = i12 + 2;
            if (jArr[i13] != RectListKt.TombStone) {
                jArr2[i11] = jArr[i12];
                jArr2[i11 + 1] = jArr[i12 + 1];
                jArr2[i11 + 2] = jArr[i13];
                i11 += 3;
            }
        }
        this.itemsSize = i11;
        this.items = jArr2;
        this.stack = jArr;
    }

    public final void findKNearestNeighbors(int i10, int i11, int i12, int i13, int i14, int i15, InterfaceC9548t interfaceC9548t) {
        int i16;
        int[] iArrNeighborsScoredByDistance$ui_release = neighborsScoredByDistance$ui_release(i10, i12, i13, i14, i15);
        long[] jArr = this.items;
        int i17 = 1;
        int i18 = 0;
        int i19 = 0;
        while (i18 <= i11) {
            int iMin = Integer.MAX_VALUE;
            int i20 = 0;
            while (i20 < iArrNeighborsScoredByDistance$ui_release.length) {
                int i21 = iArrNeighborsScoredByDistance$ui_release[i20];
                if (i21 > i17) {
                    iMin = Math.min(iMin, i21);
                }
                if (i21 == i17) {
                    int i22 = i20 * 3;
                    long j10 = jArr[i22];
                    long j11 = jArr[i22 + 1];
                    i16 = i17;
                    interfaceC9548t.invoke(Integer.valueOf(i21), Integer.valueOf(((int) jArr[i22 + 2]) & RectListKt.Lower26Bits), Integer.valueOf((int) (j10 >> 32)), Integer.valueOf((int) j10), Integer.valueOf((int) (j11 >> 32)), Integer.valueOf((int) j11));
                    i19++;
                    if (i19 == i11) {
                        return;
                    }
                } else {
                    i16 = i17;
                }
                i20++;
                i17 = i16;
            }
            i18++;
            i17 = iMin;
        }
    }

    public final int findNearestNeighbor(int i10, int i11, int i12, int i13, int i14) {
        long[] jArr = this.items;
        int i15 = this.itemsSize;
        int i16 = Integer.MAX_VALUE;
        int i17 = -1;
        for (int i18 = 0; i18 < jArr.length - 2 && i18 < i15; i18 += 3) {
            long j10 = jArr[i18];
            int i19 = i18 + 1;
            long j11 = jArr[i19];
            int iDistanceScore = RectListKt.distanceScore(i10, i11, i12, i13, i14, (int) (j10 >> 32), (int) j10, (int) (j11 >> 32), (int) j11);
            boolean z10 = (iDistanceScore < i16) & (iDistanceScore > 0);
            if (z10) {
                i16 = iDistanceScore;
            }
            if (z10) {
                i17 = i19;
            }
        }
        if (i17 < 0 || i17 >= jArr.length) {
            return -1;
        }
        return ((int) jArr[i17]) & RectListKt.Lower26Bits;
    }

    public final void forEachIntersectingRectWithValueAt(int i10, InterfaceC9547s interfaceC9547s) {
        long[] jArr = this.items;
        int i11 = this.itemsSize;
        long j10 = jArr[i10];
        long j11 = jArr[i10 + 1];
        for (int i12 = 0; i12 < jArr.length - 2 && i12 < i11; i12 += 3) {
            if (i12 != i10) {
                long j12 = jArr[i12];
                long j13 = jArr[i12 + 1];
                if (((((j11 - j12) - InlineClassHelperKt.Uint64Low32) | ((j13 - j10) - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) == 0) {
                    interfaceC9547s.invoke(Integer.valueOf((int) (j12 >> 32)), Integer.valueOf((int) j12), Integer.valueOf((int) (j13 >> 32)), Integer.valueOf((int) j13), Integer.valueOf(((int) jArr[i12 + 2]) & RectListKt.Lower26Bits));
                }
            }
        }
    }

    public final void forEachIntersection(int i10, int i11, int i12, int i13, InterfaceC9540l interfaceC9540l) {
        long j10 = (i10 << 32) | (i11 & 4294967295L);
        long j11 = (i12 << 32) | (i13 & 4294967295L);
        long[] jArr = this.items;
        int i14 = this.itemsSize;
        for (int i15 = 0; i15 < jArr.length - 2 && i15 < i14; i15 += 3) {
            if (((((j11 - jArr[i15]) - InlineClassHelperKt.Uint64Low32) | ((jArr[i15 + 1] - j10) - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) == 0) {
                interfaceC9540l.invoke(Integer.valueOf(((int) jArr[i15 + 2]) & RectListKt.Lower26Bits));
            }
        }
    }

    public final void forEachRect(InterfaceC9547s interfaceC9547s) {
        long[] jArr = this.items;
        int i10 = this.itemsSize;
        for (int i11 = 0; i11 < jArr.length - 2 && i11 < i10; i11 += 3) {
            long j10 = jArr[i11];
            long j11 = jArr[i11 + 1];
            interfaceC9547s.invoke(Integer.valueOf(((int) jArr[i11 + 2]) & RectListKt.Lower26Bits), Integer.valueOf((int) (j10 >> 32)), Integer.valueOf((int) j10), Integer.valueOf((int) (j11 >> 32)), Integer.valueOf((int) j11));
        }
    }

    public final void forEachUpdatedRect(InterfaceC9545q interfaceC9545q) {
        long[] jArr = this.items;
        int i10 = this.itemsSize;
        for (int i11 = 0; i11 < jArr.length - 2 && i11 < i10; i11 += 3) {
            long j10 = jArr[i11 + 2];
            if ((((int) (j10 >> 61)) & 1) != 0) {
                interfaceC9545q.invoke(Integer.valueOf(((int) j10) & RectListKt.Lower26Bits), Long.valueOf(jArr[i11]), Long.valueOf(jArr[i11 + 1]));
            }
        }
    }

    public final int getSize() {
        return this.itemsSize / 3;
    }

    public final int indexOf(int i10) {
        int i11 = i10 & RectListKt.Lower26Bits;
        long[] jArr = this.items;
        int i12 = this.itemsSize;
        for (int i13 = 0; i13 < jArr.length - 2 && i13 < i12; i13 += 3) {
            if ((((int) jArr[i13 + 2]) & RectListKt.Lower26Bits) == i11) {
                return i13;
            }
        }
        return -1;
    }

    public final void insert(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, boolean z11) {
        long[] jArr = this.items;
        int i16 = this.itemsSize;
        int i17 = i16 + 3;
        this.itemsSize = i17;
        int length = jArr.length;
        if (length <= i17) {
            resizeStorage(length, i16, jArr);
        }
        long[] jArr2 = this.items;
        jArr2[i16] = (i11 << 32) | (i12 & 4294967295L);
        jArr2[i16 + 1] = (i13 << 32) | (i14 & 4294967295L);
        long j10 = ((z11 ? 1L : 0L) << 63) | ((z10 ? 1L : 0L) << 62) | (1 << 61) | (0 << 52);
        int i18 = i15 & RectListKt.Lower26Bits;
        jArr2[i16 + 2] = j10 | (i18 << 26) | (i10 & RectListKt.Lower26Bits);
        if (i15 < 0) {
            return;
        }
        for (int i19 = i16 - 3; i19 >= 0; i19 -= 3) {
            int i20 = i19 + 2;
            long j11 = jArr2[i20];
            if ((((int) j11) & RectListKt.Lower26Bits) == i18) {
                jArr2[i20] = (j11 & RectListKt.EverythingButLastChildOffset) | (((i16 - i19) & 511) << 52);
                return;
            }
        }
    }

    public final void markUpdated(int i10) {
        int i11 = i10 & RectListKt.Lower26Bits;
        long[] jArr = this.items;
        int i12 = this.itemsSize;
        for (int i13 = 0; i13 < jArr.length - 2 && i13 < i12; i13 += 3) {
            int i14 = i13 + 2;
            long j10 = jArr[i14];
            if ((((int) j10) & RectListKt.Lower26Bits) == i11) {
                jArr[i14] = 2305843009213693952L | j10;
                return;
            }
        }
    }

    public final long metaFor(int i10) {
        int i11 = i10 & RectListKt.Lower26Bits;
        long[] jArr = this.items;
        int i12 = this.itemsSize;
        for (int i13 = 0; i13 < jArr.length - 2 && i13 < i12; i13 += 3) {
            long j10 = jArr[i13 + 2];
            if ((((int) j10) & RectListKt.Lower26Bits) == i11) {
                return j10;
            }
        }
        return RectListKt.TombStone;
    }

    public final boolean move(int i10, int i11, int i12, int i13, int i14) {
        int i15 = i10 & RectListKt.Lower26Bits;
        long[] jArr = this.items;
        int i16 = this.itemsSize;
        for (int i17 = 0; i17 < jArr.length - 2 && i17 < i16; i17 += 3) {
            int i18 = i17 + 2;
            long j10 = jArr[i18];
            if ((((int) j10) & RectListKt.Lower26Bits) == i15) {
                long j11 = jArr[i17];
                jArr[i17] = (i12 & 4294967295L) | (i11 << 32);
                int i19 = i17;
                jArr[i17 + 1] = (i14 & 4294967295L) | (i13 << 32);
                jArr[i18] = 2305843009213693952L | j10;
                int i20 = i11 - ((int) (j11 >> 32));
                int i21 = i12 - ((int) j11);
                if ((i20 != 0) | (i21 != 0)) {
                    updateSubhierarchy((RectListKt.EverythingButParentId & j10) | (((i19 + 3) & RectListKt.Lower26Bits) << 26), i20, i21);
                }
                return true;
            }
        }
        return false;
    }

    public final int[] neighborsScoredByDistance$ui_release(int i10, int i11, int i12, int i13, int i14) {
        long[] jArr = this.items;
        int i15 = this.itemsSize / 3;
        int[] iArr = new int[i15];
        for (int i16 = 0; i16 < i15; i16++) {
            int i17 = i16 * 3;
            if (i17 < 0 || i17 >= jArr.length - 1) {
                break;
            }
            long j10 = jArr[i17];
            long j11 = jArr[i17 + 1];
            iArr[i16] = RectListKt.distanceScore(i10, i11, i12, i13, i14, (int) (j10 >> 32), (int) j10, (int) (j11 >> 32), (int) j11);
        }
        return iArr;
    }

    public final boolean remove(int i10) {
        int i11 = i10 & RectListKt.Lower26Bits;
        long[] jArr = this.items;
        int i12 = this.itemsSize;
        for (int i13 = 0; i13 < jArr.length - 2 && i13 < i12; i13 += 3) {
            int i14 = i13 + 2;
            if ((((int) jArr[i14]) & RectListKt.Lower26Bits) == i11) {
                jArr[i13] = -1;
                jArr[i13 + 1] = -1;
                jArr[i14] = 2305843009213693951L;
                return true;
            }
        }
        return false;
    }

    public final boolean update(int i10, int i11, int i12, int i13, int i14) {
        int i15 = i10 & RectListKt.Lower26Bits;
        long[] jArr = this.items;
        int i16 = this.itemsSize;
        for (int i17 = 0; i17 < jArr.length - 2 && i17 < i16; i17 += 3) {
            int i18 = i17 + 2;
            long j10 = jArr[i18];
            if ((((int) j10) & RectListKt.Lower26Bits) == i15) {
                jArr[i17] = (i11 << 32) | (i12 & 4294967295L);
                jArr[i17 + 1] = (i13 << 32) | (i14 & 4294967295L);
                jArr[i18] = 2305843009213693952L | j10;
                return true;
            }
        }
        return false;
    }

    public final void updateSubhierarchy(int i10, int i11, int i12) {
        updateSubhierarchy(((this.itemsSize & 511) << 52) | (0 << 26) | (i10 & RectListKt.Lower26Bits), i11, i12);
    }

    public final boolean withRect(int i10, InterfaceC9546r interfaceC9546r) {
        int i11 = i10 & RectListKt.Lower26Bits;
        long[] jArr = this.items;
        int i12 = this.itemsSize;
        for (int i13 = 0; i13 < jArr.length - 2 && i13 < i12; i13 += 3) {
            if ((((int) jArr[i13 + 2]) & RectListKt.Lower26Bits) == i11) {
                long j10 = jArr[i13];
                long j11 = jArr[i13 + 1];
                interfaceC9546r.invoke(Integer.valueOf((int) (j10 >> 32)), Integer.valueOf((int) j10), Integer.valueOf((int) (j11 >> 32)), Integer.valueOf((int) j11));
                return true;
            }
        }
        return false;
    }

    private final void updateSubhierarchy(long j10, int i10, int i11) {
        int i12;
        char c10;
        char c11;
        long[] jArr = this.items;
        long[] jArr2 = this.stack;
        int size = getSize();
        jArr2[0] = j10;
        int i13 = 1;
        while (i13 > 0) {
            i13--;
            long j11 = jArr2[i13];
            int i14 = RectListKt.Lower26Bits;
            int i15 = ((int) j11) & RectListKt.Lower26Bits;
            char c12 = JSONLexer.EOI;
            int i16 = ((int) (j11 >> 26)) & RectListKt.Lower26Bits;
            char c13 = '4';
            char c14 = 511;
            int i17 = ((int) (j11 >> 52)) & 511;
            int i18 = i17 == 511 ? size : i17 + i16;
            if (i16 < 0) {
                return;
            }
            while (i16 < jArr.length - 2 && i16 < i18) {
                int i19 = i16 + 2;
                long j12 = jArr[i19];
                int i20 = i14;
                char c15 = c12;
                if ((((int) (j12 >> c15)) & i20) == i15) {
                    long j13 = jArr[i16];
                    int i21 = i16 + 1;
                    c10 = c13;
                    long j14 = jArr[i21];
                    i12 = i15;
                    jArr[i16] = ((((int) j13) + i11) & 4294967295L) | ((((int) (j13 >> 32)) + i10) << 32);
                    jArr[i21] = ((((int) j14) + i11) & 4294967295L) | ((((int) (j14 >> 32)) + i10) << 32);
                    jArr[i19] = 2305843009213693952L | j12;
                    c11 = 511;
                    if ((((int) (j12 >> c10)) & 511) > 0) {
                        jArr2[i13] = (((i16 + 3) & i20) << c15) | (RectListKt.EverythingButParentId & j12);
                        i13++;
                    }
                } else {
                    i12 = i15;
                    c10 = c13;
                    c11 = c14;
                }
                i16 += 3;
                i14 = i20;
                c12 = c15;
                c14 = c11;
                c13 = c10;
                i15 = i12;
            }
        }
    }

    public final void forEachIntersection(int i10, int i11, InterfaceC9540l interfaceC9540l) {
        long j10 = (i11 & 4294967295L) | (i10 << 32);
        long[] jArr = this.items;
        int i12 = this.itemsSize;
        for (int i13 = 0; i13 < jArr.length - 2 && i13 < i12; i13 += 3) {
            if (((((j10 - jArr[i13]) - InlineClassHelperKt.Uint64Low32) | ((jArr[i13 + 1] - j10) - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) == 0) {
                interfaceC9540l.invoke(Integer.valueOf(((int) jArr[i13 + 2]) & RectListKt.Lower26Bits));
            }
        }
    }
}
