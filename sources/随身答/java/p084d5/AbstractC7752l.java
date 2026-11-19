package p084d5;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import com.zykj.blackboard.core.edit.PageControl;
import com.zykj.blackboard.enums.DocumentType;
import com.zykj.board.EzyPositionEnum;
import com.zykj.board.EzyScaleTypeEnum;
import java.io.File;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p189n5.C9097c;
import p263u5.C9692k;

/* renamed from: d5.l */
/* loaded from: classes4.dex */
public abstract class AbstractC7752l {

    /* renamed from: d5.l$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f13070a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f13071b;

        static {
            int[] iArr = new int[EzyScaleTypeEnum.ScaleTypeEnum.values().length];
            iArr[EzyScaleTypeEnum.ScaleTypeEnum.MODE_ADAPTER.ordinal()] = 1;
            iArr[EzyScaleTypeEnum.ScaleTypeEnum.MODE_ADAPTER_8.ordinal()] = 2;
            iArr[EzyScaleTypeEnum.ScaleTypeEnum.MODE_MIN_VALUE.ordinal()] = 3;
            iArr[EzyScaleTypeEnum.ScaleTypeEnum.MODE_MAX_VALUE.ordinal()] = 4;
            iArr[EzyScaleTypeEnum.ScaleTypeEnum.MODE_MAX_WIDTH.ordinal()] = 5;
            iArr[EzyScaleTypeEnum.ScaleTypeEnum.MODE_MAX_HEIGHT.ordinal()] = 6;
            iArr[EzyScaleTypeEnum.ScaleTypeEnum.MODE_MATRIX_HEIGHT.ordinal()] = 7;
            f13070a = iArr;
            int[] iArr2 = new int[EzyPositionEnum.PositionEnum.values().length];
            iArr2[EzyPositionEnum.PositionEnum.TOP_LEFT.ordinal()] = 1;
            iArr2[EzyPositionEnum.PositionEnum.TOP_CENTER.ordinal()] = 2;
            iArr2[EzyPositionEnum.PositionEnum.TOP_RIGHT.ordinal()] = 3;
            iArr2[EzyPositionEnum.PositionEnum.CENTER_LEFT.ordinal()] = 4;
            iArr2[EzyPositionEnum.PositionEnum.CENTER_RIGHT.ordinal()] = 5;
            iArr2[EzyPositionEnum.PositionEnum.BOTTOM_LEFT.ordinal()] = 6;
            iArr2[EzyPositionEnum.PositionEnum.BOTTOM_CENTER.ordinal()] = 7;
            iArr2[EzyPositionEnum.PositionEnum.BOTTOM_RIGHT.ordinal()] = 8;
            f13071b = iArr2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0070  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float m12102a(com.zykj.blackboard.core.edit.PageControl r5, int r6, int r7, com.zykj.board.EzyScaleTypeEnum.ScaleTypeEnum r8) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "scaleType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            com.zykj.blackboard.core.edit.BoardControl r0 = r5.m7764O()
            v4.b r0 = r0.getConfig()
            int r0 = r0.m16465P()
            float r0 = (float) r0
            com.zykj.blackboard.core.edit.BoardControl r5 = r5.m7764O()
            v4.b r5 = r5.getConfig()
            int r5 = r5.m16514u()
            float r5 = (float) r5
            int[] r1 = p084d5.AbstractC7752l.a.f13070a
            int r2 = r8.ordinal()
            r2 = r1[r2]
            r3 = 1
            if (r2 == r3) goto L39
            r4 = 2
            if (r2 == r4) goto L33
            goto L3c
        L33:
            r2 = 1061997773(0x3f4ccccd, float:0.8)
        L36:
            float r0 = r0 * r2
            float r5 = r5 * r2
            goto L3c
        L39:
            r2 = 1056964608(0x3f000000, float:0.5)
            goto L36
        L3c:
            float r6 = (float) r6
            float r0 = r0 / r6
            float r6 = (float) r7
            float r5 = r5 / r6
            int r6 = r8.ordinal()
            r6 = r1[r6]
            if (r6 == r3) goto L70
            r7 = 3
            if (r6 == r7) goto L6b
            r7 = 4
            if (r6 == r7) goto L66
            r7 = 5
            if (r6 == r7) goto L65
            r7 = 6
            if (r6 == r7) goto L64
            r7 = 7
            if (r6 == r7) goto L5c
            float r5 = java.lang.Math.min(r0, r5)
            return r5
        L5c:
            r6 = 1065353216(0x3f800000, float:1.0)
            int r7 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r7 >= 0) goto L63
            goto L64
        L63:
            return r6
        L64:
            return r5
        L65:
            return r0
        L66:
            float r5 = java.lang.Math.max(r0, r5)
            return r5
        L6b:
            float r5 = java.lang.Math.min(r0, r5)
            return r5
        L70:
            float r5 = java.lang.Math.min(r0, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p084d5.AbstractC7752l.m12102a(com.zykj.blackboard.core.edit.PageControl, int, int, com.zykj.board.EzyScaleTypeEnum$ScaleTypeEnum):float");
    }

    /* renamed from: b */
    public static final Matrix m12103b(int i9, int i10, int i11, int i12, boolean z9, int i13, int i14) {
        Matrix matrix = new Matrix();
        float f10 = i11;
        float f11 = i9;
        float f12 = f10 / f11;
        float f13 = i12;
        float f14 = i10;
        float f15 = f13 / f14;
        boolean z10 = f12 < f15;
        if (!z10) {
            f12 = f15;
        }
        int i15 = i9 / 2;
        int i16 = i10 / 2;
        int i17 = (i11 / 2) - i15;
        int i18 = (i12 / 2) - i16;
        boolean z11 = (((float) i13) * f12) * f11 > f10;
        boolean z12 = (((float) i14) * f12) * f14 > f13;
        matrix.setScale(f12, f12, i15, i16);
        matrix.postTranslate(i17, i18);
        if (!z9 && (z11 || z12)) {
            if (z11) {
                if (!z10) {
                    matrix.setScale(f12, f12, 0.0f, 0.0f);
                    return matrix;
                }
            } else if (z10) {
                matrix.setScale(f12, f12, 0.0f, 0.0f);
            }
        }
        return matrix;
    }

    /* renamed from: c */
    public static /* synthetic */ Matrix m12104c(int i9, int i10, int i11, int i12, boolean z9, int i13, int i14, int i15, Object obj) {
        if ((i15 & 16) != 0) {
            z9 = true;
        }
        if ((i15 & 32) != 0) {
            i13 = 1;
        }
        if ((i15 & 64) != 0) {
            i14 = 1;
        }
        return m12103b(i9, i10, i11, i12, z9, i13, i14);
    }

    /* renamed from: d */
    public static final Matrix m12105d(PageControl pageControl, float f10, float f11, EzyPositionEnum.PositionEnum positionEnum, int i9) {
        Intrinsics.checkNotNullParameter(pageControl, "<this>");
        Intrinsics.checkNotNullParameter(positionEnum, "positionEnum");
        float fM16465P = pageControl.m7764O().getConfig().m16465P();
        float fM16514u = pageControl.m7764O().getConfig().m16514u();
        switch (a.f13071b[positionEnum.ordinal()]) {
            case 1:
                Matrix matrix = new Matrix();
                float f12 = i9 + 0.0f;
                matrix.setTranslate(f12, f12);
                return matrix;
            case 2:
                Matrix matrix2 = new Matrix();
                matrix2.setTranslate((fM16465P - f10) / 2, i9 + 0.0f);
                return matrix2;
            case 3:
                Matrix matrix3 = new Matrix();
                float f13 = fM16465P - f10;
                float f14 = i9;
                matrix3.setTranslate(f13 + f14, 0.0f - f14);
                return matrix3;
            case 4:
                Matrix matrix4 = new Matrix();
                matrix4.setTranslate(i9 + 0.0f, (fM16514u - f11) / 2);
                return matrix4;
            case 5:
                Matrix matrix5 = new Matrix();
                matrix5.setTranslate((fM16465P - f10) - i9, (fM16514u - f11) / 2);
                return matrix5;
            case 6:
                Matrix matrix6 = new Matrix();
                float f15 = i9;
                matrix6.setTranslate(0.0f + f15, (fM16514u - f11) - f15);
                return matrix6;
            case 7:
                Matrix matrix7 = new Matrix();
                matrix7.setTranslate((fM16465P - f10) / 2, (fM16514u - f11) - i9);
                return matrix7;
            case 8:
                Matrix matrix8 = new Matrix();
                float f16 = fM16465P - f10;
                float f17 = i9;
                matrix8.setTranslate(f16 - f17, (fM16514u - f11) - f17);
                return matrix8;
            default:
                Matrix matrix9 = new Matrix();
                float f18 = fM16465P - f10;
                float f19 = 2;
                matrix9.setTranslate(f18 / f19, (fM16514u - f11) / f19);
                return matrix9;
        }
    }

    /* renamed from: e */
    public static /* synthetic */ Matrix m12106e(PageControl pageControl, float f10, float f11, EzyPositionEnum.PositionEnum positionEnum, int i9, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            i9 = 0;
        }
        return m12105d(pageControl, f10, f11, positionEnum, i9);
    }

    /* renamed from: f */
    public static final Float[] m12107f(PageControl pageControl, String path, EzyScaleTypeEnum.ScaleTypeEnum scaleType, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(pageControl, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(path, options);
        int iIntValue = options.outWidth;
        int iIntValue2 = options.outHeight;
        if (iIntValue == -1 && num != null) {
            iIntValue = num.intValue();
        }
        if (iIntValue2 == -1 && num2 != null) {
            iIntValue2 = num2.intValue();
        }
        float fM12102a = m12102a(pageControl, iIntValue, iIntValue2, scaleType);
        return new Float[]{Float.valueOf(iIntValue * fM12102a), Float.valueOf(iIntValue2 * fM12102a)};
    }

    /* renamed from: g */
    public static /* synthetic */ Float[] m12108g(PageControl pageControl, String str, EzyScaleTypeEnum.ScaleTypeEnum scaleTypeEnum, Integer num, Integer num2, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            num = null;
        }
        if ((i9 & 8) != 0) {
            num2 = null;
        }
        return m12107f(pageControl, str, scaleTypeEnum, num, num2);
    }

    /* renamed from: h */
    public static final File m12109h(PageControl pageControl, Bitmap bitmap, boolean z9, String filename) {
        Intrinsics.checkNotNullParameter(pageControl, "<this>");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(filename, "filename");
        String strM14637a = C9097c.f15322d.m14637a(pageControl.m7770U(), DocumentType.IMAGE);
        StringBuilder sb = new StringBuilder();
        if (StringsKt.isBlank(filename)) {
            filename = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(filename, "randomUUID().toString()");
        }
        sb.append(filename);
        sb.append(".webp");
        File file = new File(strM14637a, sb.toString());
        C9692k c9692k = C9692k.f17130a;
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "newFile.absolutePath");
        if (c9692k.m16186c(bitmap, absolutePath, z9).length() > 0) {
            return file;
        }
        return null;
    }

    /* renamed from: i */
    public static final File m12110i(PageControl pageControl, String path) throws Throwable {
        String strSubstring;
        Intrinsics.checkNotNullParameter(pageControl, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        File file = new File(path);
        if (!file.exists()) {
            return null;
        }
        String path2 = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path2, "f.path");
        int iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) path2, '.', 0, false, 6, (Object) null);
        if (iLastIndexOf$default != -1) {
            String path3 = file.getPath();
            Intrinsics.checkNotNullExpressionValue(path3, "f.path");
            strSubstring = path3.substring(iLastIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        } else {
            strSubstring = "";
        }
        File file2 = new File(C9097c.f15322d.m14637a(pageControl.m7770U(), DocumentType.IMAGE), UUID.randomUUID().toString() + strSubstring);
        C9692k.f17130a.m16184a(new File(path), file2);
        return file2;
    }
}
