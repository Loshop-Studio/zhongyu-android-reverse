package androidx.compose.p014ui.graphics;

import androidx.compose.p014ui.geometry.Offset;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;

/* loaded from: classes2.dex */
public final class Vertices {
    private final int[] colors;
    private final short[] indices;
    private final float[] positions;
    private final float[] textureCoordinates;
    private final int vertexMode;

    public /* synthetic */ Vertices(int i10, List list, List list2, List list3, List list4, AbstractC9972n abstractC9972n) {
        this(i10, list, list2, list3, list4);
    }

    private final int[] encodeColorList(List<Color> list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = ColorKt.m30932toArgb8_81llA(list.get(i10).m30888unboximpl());
        }
        return iArr;
    }

    private final float[] encodePointList(List<Offset> list) {
        int size = list.size() * 2;
        float[] fArr = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            long jM30647unboximpl = list.get(i10 / 2).m30647unboximpl();
            fArr[i10] = i10 % 2 == 0 ? Float.intBitsToFloat((int) (jM30647unboximpl >> 32)) : Float.intBitsToFloat((int) (jM30647unboximpl & 4294967295L));
        }
        return fArr;
    }

    public final int[] getColors() {
        return this.colors;
    }

    public final short[] getIndices() {
        return this.indices;
    }

    public final float[] getPositions() {
        return this.positions;
    }

    public final float[] getTextureCoordinates() {
        return this.textureCoordinates;
    }

    /* renamed from: getVertexMode-c2xauaI, reason: not valid java name */
    public final int m31280getVertexModec2xauaI() {
        return this.vertexMode;
    }

    private Vertices(int i10, List<Offset> list, List<Offset> list2, List<Color> list3, List<Integer> list4) {
        this.vertexMode = i10;
        if (list2.size() != list.size()) {
            InlineClassHelperKt.throwIllegalArgumentException("positions and textureCoordinates lengths must match.");
        }
        if (list3.size() != list.size()) {
            InlineClassHelperKt.throwIllegalArgumentException("positions and colors lengths must match.");
        }
        int size = list4.size();
        for (int i11 = 0; i11 < size; i11++) {
            int iIntValue = list4.get(i11).intValue();
            if (iIntValue < 0 || iIntValue >= list.size()) {
                InlineClassHelperKt.throwIllegalArgumentException("indices values must be valid indices in the positions list.");
                break;
            }
        }
        this.positions = encodePointList(list);
        this.textureCoordinates = encodePointList(list2);
        this.colors = encodeColorList(list3);
        int size2 = list4.size();
        short[] sArr = new short[size2];
        for (int i12 = 0; i12 < size2; i12++) {
            sArr[i12] = (short) list4.get(i12).intValue();
        }
        this.indices = sArr;
    }
}
