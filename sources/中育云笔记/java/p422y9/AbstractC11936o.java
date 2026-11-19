package p422y9;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import com.zykj.blackboard.core.edit.PageControl;
import com.zykj.blackboard.enums.DocumentType;
import com.zykj.board.EzyPositionEnum;
import com.zykj.board.EzyScaleTypeEnum;
import java.io.File;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC9979u;
import na.C10348k;
import p194ia.C9619c;
import p310qd.AbstractC10793c0;

/* renamed from: y9.o */
/* loaded from: classes5.dex */
public abstract class AbstractC11936o {

    /* renamed from: y9.o$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28299a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f28300b;

        static {
            int[] iArr = new int[EzyScaleTypeEnum.ScaleTypeEnum.values().length];
            iArr[EzyScaleTypeEnum.ScaleTypeEnum.MODE_ADAPTER.ordinal()] = 1;
            iArr[EzyScaleTypeEnum.ScaleTypeEnum.MODE_ADAPTER_8.ordinal()] = 2;
            iArr[EzyScaleTypeEnum.ScaleTypeEnum.MODE_MIN_VALUE.ordinal()] = 3;
            iArr[EzyScaleTypeEnum.ScaleTypeEnum.MODE_MAX_VALUE.ordinal()] = 4;
            iArr[EzyScaleTypeEnum.ScaleTypeEnum.MODE_MAX_WIDTH.ordinal()] = 5;
            iArr[EzyScaleTypeEnum.ScaleTypeEnum.MODE_MAX_HEIGHT.ordinal()] = 6;
            iArr[EzyScaleTypeEnum.ScaleTypeEnum.MODE_MATRIX_HEIGHT.ordinal()] = 7;
            f28299a = iArr;
            int[] iArr2 = new int[EzyPositionEnum.PositionEnum.values().length];
            iArr2[EzyPositionEnum.PositionEnum.TOP_LEFT.ordinal()] = 1;
            iArr2[EzyPositionEnum.PositionEnum.TOP_CENTER.ordinal()] = 2;
            iArr2[EzyPositionEnum.PositionEnum.TOP_RIGHT.ordinal()] = 3;
            iArr2[EzyPositionEnum.PositionEnum.CENTER_LEFT.ordinal()] = 4;
            iArr2[EzyPositionEnum.PositionEnum.CENTER_RIGHT.ordinal()] = 5;
            iArr2[EzyPositionEnum.PositionEnum.BOTTOM_LEFT.ordinal()] = 6;
            iArr2[EzyPositionEnum.PositionEnum.BOTTOM_CENTER.ordinal()] = 7;
            iArr2[EzyPositionEnum.PositionEnum.BOTTOM_RIGHT.ordinal()] = 8;
            f28300b = iArr2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0070  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float m26493a(com.zykj.blackboard.core.edit.PageControl r5, int r6, int r7, com.zykj.board.EzyScaleTypeEnum.ScaleTypeEnum r8) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.AbstractC9979u.m20294g(r5, r0)
            java.lang.String r0 = "scaleType"
            kotlin.jvm.internal.AbstractC9979u.m20294g(r8, r0)
            com.zykj.blackboard.core.edit.BoardControl r0 = r5.m14392O()
            q9.b r0 = r0.getConfig()
            int r0 = r0.m22869M()
            float r0 = (float) r0
            com.zykj.blackboard.core.edit.BoardControl r5 = r5.m14392O()
            q9.b r5 = r5.getConfig()
            int r5 = r5.m22914u()
            float r5 = (float) r5
            int[] r1 = p422y9.AbstractC11936o.a.f28299a
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
        throw new UnsupportedOperationException("Method not decompiled: p422y9.AbstractC11936o.m26493a(com.zykj.blackboard.core.edit.PageControl, int, int, com.zykj.board.EzyScaleTypeEnum$ScaleTypeEnum):float");
    }

    /* renamed from: b */
    public static final Matrix m26494b(int i10, int i11, int i12, int i13, boolean z10, int i14, int i15) {
        Matrix matrix = new Matrix();
        float f10 = i12;
        float f11 = i10;
        float f12 = f10 / f11;
        float f13 = i13;
        float f14 = i11;
        float f15 = f13 / f14;
        boolean z11 = f12 < f15;
        if (!z11) {
            f12 = f15;
        }
        int i16 = i10 / 2;
        int i17 = i11 / 2;
        int i18 = (i12 / 2) - i16;
        int i19 = (i13 / 2) - i17;
        boolean z12 = (((float) i14) * f12) * f11 > f10;
        boolean z13 = (((float) i15) * f12) * f14 > f13;
        matrix.setScale(f12, f12, i16, i17);
        matrix.postTranslate(i18, i19);
        if (!z10 && (z12 || z13)) {
            if (z12) {
                if (!z11) {
                    matrix.setScale(f12, f12, 0.0f, 0.0f);
                    return matrix;
                }
            } else if (z11) {
                matrix.setScale(f12, f12, 0.0f, 0.0f);
            }
        }
        return matrix;
    }

    /* renamed from: c */
    public static /* synthetic */ Matrix m26495c(int i10, int i11, int i12, int i13, boolean z10, int i14, int i15, int i16, Object obj) {
        if ((i16 & 16) != 0) {
            z10 = true;
        }
        if ((i16 & 32) != 0) {
            i14 = 1;
        }
        if ((i16 & 64) != 0) {
            i15 = 1;
        }
        return m26494b(i10, i11, i12, i13, z10, i14, i15);
    }

    /* renamed from: d */
    public static final Matrix m26496d(PageControl pageControl, float f10, float f11, EzyPositionEnum.PositionEnum positionEnum, int i10) {
        AbstractC9979u.m20294g(pageControl, "<this>");
        AbstractC9979u.m20294g(positionEnum, "positionEnum");
        float fM22869M = pageControl.m14392O().getConfig().m22869M();
        float fM22914u = pageControl.m14392O().getConfig().m22914u();
        switch (a.f28300b[positionEnum.ordinal()]) {
            case 1:
                Matrix matrix = new Matrix();
                float f12 = i10 + 0.0f;
                matrix.setTranslate(f12, f12);
                return matrix;
            case 2:
                Matrix matrix2 = new Matrix();
                matrix2.setTranslate((fM22869M - f10) / 2, i10 + 0.0f);
                return matrix2;
            case 3:
                Matrix matrix3 = new Matrix();
                float f13 = fM22869M - f10;
                float f14 = i10;
                matrix3.setTranslate(f13 + f14, 0.0f - f14);
                return matrix3;
            case 4:
                Matrix matrix4 = new Matrix();
                matrix4.setTranslate(i10 + 0.0f, (fM22914u - f11) / 2);
                return matrix4;
            case 5:
                Matrix matrix5 = new Matrix();
                matrix5.setTranslate((fM22869M - f10) - i10, (fM22914u - f11) / 2);
                return matrix5;
            case 6:
                Matrix matrix6 = new Matrix();
                float f15 = i10;
                matrix6.setTranslate(0.0f + f15, (fM22914u - f11) - f15);
                return matrix6;
            case 7:
                Matrix matrix7 = new Matrix();
                matrix7.setTranslate((fM22869M - f10) / 2, (fM22914u - f11) - i10);
                return matrix7;
            case 8:
                Matrix matrix8 = new Matrix();
                float f16 = fM22869M - f10;
                float f17 = i10;
                matrix8.setTranslate(f16 - f17, (fM22914u - f11) - f17);
                return matrix8;
            default:
                Matrix matrix9 = new Matrix();
                float f18 = fM22869M - f10;
                float f19 = 2;
                matrix9.setTranslate(f18 / f19, (fM22914u - f11) / f19);
                return matrix9;
        }
    }

    /* renamed from: e */
    public static /* synthetic */ Matrix m26497e(PageControl pageControl, float f10, float f11, EzyPositionEnum.PositionEnum positionEnum, int i10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            i10 = 0;
        }
        return m26496d(pageControl, f10, f11, positionEnum, i10);
    }

    /* renamed from: f */
    public static final Float[] m26498f(PageControl pageControl, String path, EzyScaleTypeEnum.ScaleTypeEnum scaleType, Integer num, Integer num2) {
        AbstractC9979u.m20294g(pageControl, "<this>");
        AbstractC9979u.m20294g(path, "path");
        AbstractC9979u.m20294g(scaleType, "scaleType");
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
        float fM26493a = m26493a(pageControl, iIntValue, iIntValue2, scaleType);
        return new Float[]{Float.valueOf(iIntValue * fM26493a), Float.valueOf(iIntValue2 * fM26493a)};
    }

    /* renamed from: g */
    public static final File m26499g(PageControl pageControl, Bitmap bitmap, boolean z10, String filename) {
        AbstractC9979u.m20294g(pageControl, "<this>");
        AbstractC9979u.m20294g(bitmap, "bitmap");
        AbstractC9979u.m20294g(filename, "filename");
        String strM18862a = C9619c.f22151d.m18862a(pageControl.m14398U(), DocumentType.IMAGE);
        StringBuilder sb2 = new StringBuilder();
        if (AbstractC10793c0.m23132h0(filename)) {
            filename = UUID.randomUUID().toString();
            AbstractC9979u.m20293f(filename, "randomUUID().toString()");
        }
        sb2.append(filename);
        sb2.append(".webp");
        File file = new File(strM18862a, sb2.toString());
        C10348k c10348k = C10348k.f24655a;
        String absolutePath = file.getAbsolutePath();
        AbstractC9979u.m20293f(absolutePath, "newFile.absolutePath");
        if (c10348k.m21646b(bitmap, absolutePath, z10).length() > 0) {
            return file;
        }
        return null;
    }

    /* renamed from: h */
    public static final File m26500h(PageControl pageControl, String path) throws Throwable {
        String strSubstring;
        AbstractC9979u.m20294g(pageControl, "<this>");
        AbstractC9979u.m20294g(path, "path");
        File file = new File(path);
        if (!file.exists()) {
            return null;
        }
        String path2 = file.getPath();
        AbstractC9979u.m20293f(path2, "f.path");
        int iM23135k0 = AbstractC10793c0.m23135k0(path2, '.', 0, false, 6, null);
        if (iM23135k0 != -1) {
            String path3 = file.getPath();
            AbstractC9979u.m20293f(path3, "f.path");
            strSubstring = path3.substring(iM23135k0);
            AbstractC9979u.m20293f(strSubstring, "this as java.lang.String).substring(startIndex)");
        } else {
            strSubstring = "";
        }
        File file2 = new File(C9619c.f22151d.m18862a(pageControl.m14398U(), DocumentType.IMAGE), UUID.randomUUID().toString() + strSubstring);
        C10348k.f24655a.m21645a(new File(path), file2);
        return file2;
    }
}
