package com.zykj.blackboard.core.edit;

// RE note 本类字节码直接引用的读写或显示接口包括位图。

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.core.record.SourceRouterRecord;
import com.zykj.blackboard.enums.DocumentType;
import com.zykj.blackboard.utils.FileUtils;
import com.zykj.board.EzyPositionEnum$PositionEnum;
import com.zykj.board.EzyScaleTypeEnum$ScaleTypeEnum;
import java.io.File;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5855p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aD\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003\u001a\"\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011\u001a,\u0010\u0012\u001a\u00020\u0001*\u00020\r2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u001a=\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u0019*\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001c\u001a&\u0010\u001d\u001a\u0004\u0018\u00010\u001e*\u00020\r2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020\u001b\u001a\u0014\u0010#\u001a\u0004\u0018\u00010\u001e*\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001b¨\u0006$"}, m5110d2 = {"getScreenMatrix", "Landroid/graphics/Matrix;", "boardWidth", "", "boardHeight", "targetWidth", "targetHeight", "isPlay", "", "widthTime", "heightTime", "countScale", "", "Lcom/zykj/blackboard/core/edit/PageControl;", "width", "height", "scaleType", "Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;", "getTranslateMatrix", "imageWidth", "imageHeight", "positionEnum", "Lcom/zykj/board/EzyPositionEnum$PositionEnum;", TypedValues.CycleType.S_WAVE_OFFSET, "getWHFromLocalByType", "", "path", "", "(Lcom/zykj/blackboard/core/edit/PageControl;Ljava/lang/String;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;Ljava/lang/Integer;Ljava/lang/Integer;)[Ljava/lang/Float;", "saveBitmapToLocal", "Ljava/io/File;", "bitmap", "Landroid/graphics/Bitmap;", "isRecycle", "filename", "saveFileToLocal", "blackboard_release"}, m5111k = 2, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class PageControlExtKt {

    @Metadata(m5111k = 3, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[EzyScaleTypeEnum$ScaleTypeEnum.values().length];
            iArr[EzyScaleTypeEnum$ScaleTypeEnum.MODE_ADAPTER.ordinal()] = 1;
            iArr[EzyScaleTypeEnum$ScaleTypeEnum.MODE_ADAPTER_8.ordinal()] = 2;
            iArr[EzyScaleTypeEnum$ScaleTypeEnum.MODE_MIN_VALUE.ordinal()] = 3;
            iArr[EzyScaleTypeEnum$ScaleTypeEnum.MODE_MAX_VALUE.ordinal()] = 4;
            iArr[EzyScaleTypeEnum$ScaleTypeEnum.MODE_MAX_WIDTH.ordinal()] = 5;
            iArr[EzyScaleTypeEnum$ScaleTypeEnum.MODE_MAX_HEIGHT.ordinal()] = 6;
            iArr[EzyScaleTypeEnum$ScaleTypeEnum.MODE_MATRIX_HEIGHT.ordinal()] = 7;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EzyPositionEnum$PositionEnum.values().length];
            iArr2[EzyPositionEnum$PositionEnum.TOP_LEFT.ordinal()] = 1;
            iArr2[EzyPositionEnum$PositionEnum.TOP_CENTER.ordinal()] = 2;
            iArr2[EzyPositionEnum$PositionEnum.TOP_RIGHT.ordinal()] = 3;
            iArr2[EzyPositionEnum$PositionEnum.CENTER_LEFT.ordinal()] = 4;
            iArr2[EzyPositionEnum$PositionEnum.CENTER_RIGHT.ordinal()] = 5;
            iArr2[EzyPositionEnum$PositionEnum.BOTTOM_LEFT.ordinal()] = 6;
            iArr2[EzyPositionEnum$PositionEnum.BOTTOM_CENTER.ordinal()] = 7;
            iArr2[EzyPositionEnum$PositionEnum.BOTTOM_RIGHT.ordinal()] = 8;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float countScale(@org.jetbrains.annotations.NotNull com.zykj.blackboard.core.edit.PageControl r5, int r6, int r7, @org.jetbrains.annotations.NotNull com.zykj.board.EzyScaleTypeEnum$ScaleTypeEnum r8) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.AbstractC5830k.m5330g(r5, r0)
            java.lang.String r0 = "scaleType"
            kotlin.jvm.internal.AbstractC5830k.m5330g(r8, r0)
            com.zykj.blackboard.core.edit.BoardControl r0 = r5.getBoardControl()
            com.zykj.blackboard.bean.BoardConfig r0 = r0.getBoardConfig()
            int r0 = r0.getWidth()
            float r0 = (float) r0
            com.zykj.blackboard.core.edit.BoardControl r5 = r5.getBoardControl()
            com.zykj.blackboard.bean.BoardConfig r5 = r5.getBoardConfig()
            int r5 = r5.getHeight()
            float r5 = (float) r5
            int[] r1 = com.zykj.blackboard.core.edit.PageControlExtKt.WhenMappings.$EnumSwitchMapping$0
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
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.blackboard.core.edit.PageControlExtKt.countScale(com.zykj.blackboard.core.edit.PageControl, int, int, com.zykj.board.EzyScaleTypeEnum$ScaleTypeEnum):float"); // DEX body: android/错题本/smali_classes3/com/zykj/blackboard/core/edit/PageControlExtKt.smali:68
    }

    @NotNull
    public static final Matrix getScreenMatrix(int i, int i8, int i9, int i10, boolean z8, int i11, int i12) {
        Matrix matrix = new Matrix();
        float f = i9;
        float f7 = i;
        float f8 = f / f7;
        float f9 = i10;
        float f10 = i8;
        float f11 = f9 / f10;
        boolean z9 = f8 < f11;
        if (!z9) {
            f8 = f11;
        }
        int i13 = i / 2;
        int i14 = i8 / 2;
        int i15 = (i9 / 2) - i13;
        int i16 = (i10 / 2) - i14;
        boolean z10 = (((float) i11) * f8) * f7 > f;
        boolean z11 = (((float) i12) * f8) * f10 > f9;
        matrix.setScale(f8, f8, i13, i14);
        matrix.postTranslate(i15, i16);
        if (!z8 && (z10 || z11)) {
            if (z10) {
                if (!z9) {
                    matrix.setScale(f8, f8, 0.0f, 0.0f);
                    return matrix;
                }
            } else if (z9) {
                matrix.setScale(f8, f8, 0.0f, 0.0f);
            }
        }
        return matrix;
    }

    public static /* synthetic */ Matrix getScreenMatrix$default(int i, int i8, int i9, int i10, boolean z8, int i11, int i12, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            z8 = true;
        }
        if ((i13 & 32) != 0) {
            i11 = 1;
        }
        if ((i13 & 64) != 0) {
            i12 = 1;
        }
        return getScreenMatrix(i, i8, i9, i10, z8, i11, i12);
    }

    @NotNull
    public static final Matrix getTranslateMatrix(@NotNull PageControl pageControl, float f, float f7, @NotNull EzyPositionEnum$PositionEnum positionEnum, int i) {
        AbstractC5830k.m5330g(pageControl, "<this>");
        AbstractC5830k.m5330g(positionEnum, "positionEnum");
        float width = pageControl.getBoardControl().getBoardConfig().getWidth();
        float height = pageControl.getBoardControl().getBoardConfig().getHeight();
        switch (WhenMappings.$EnumSwitchMapping$1[positionEnum.ordinal()]) {
            case 1:
                Matrix matrix = new Matrix();
                float f8 = i + 0.0f;
                matrix.setTranslate(f8, f8);
                return matrix;
            case 2:
                Matrix matrix2 = new Matrix();
                matrix2.setTranslate((width - f) / 2, i + 0.0f);
                return matrix2;
            case 3:
                Matrix matrix3 = new Matrix();
                float f9 = width - f;
                float f10 = i;
                matrix3.setTranslate(f9 + f10, 0.0f - f10);
                return matrix3;
            case 4:
                Matrix matrix4 = new Matrix();
                matrix4.setTranslate(i + 0.0f, (height - f7) / 2);
                return matrix4;
            case 5:
                Matrix matrix5 = new Matrix();
                matrix5.setTranslate((width - f) - i, (height - f7) / 2);
                return matrix5;
            case 6:
                Matrix matrix6 = new Matrix();
                float f11 = i;
                matrix6.setTranslate(0.0f + f11, (height - f7) - f11);
                return matrix6;
            case 7:
                Matrix matrix7 = new Matrix();
                matrix7.setTranslate((width - f) / 2, (height - f7) - i);
                return matrix7;
            case 8:
                Matrix matrix8 = new Matrix();
                float f12 = width - f;
                float f13 = i;
                matrix8.setTranslate(f12 - f13, (height - f7) - f13);
                return matrix8;
            default:
                Matrix matrix9 = new Matrix();
                float f14 = width - f;
                float f15 = 2;
                matrix9.setTranslate(f14 / f15, (height - f7) / f15);
                return matrix9;
        }
    }

    public static /* synthetic */ Matrix getTranslateMatrix$default(PageControl pageControl, float f, float f7, EzyPositionEnum$PositionEnum ezyPositionEnum$PositionEnum, int i, int i8, Object obj) {
        if ((i8 & 8) != 0) {
            i = 0;
        }
        return getTranslateMatrix(pageControl, f, f7, ezyPositionEnum$PositionEnum, i);
    }

    @NotNull
    public static final Float[] getWHFromLocalByType(@NotNull PageControl pageControl, @NotNull String path, @NotNull EzyScaleTypeEnum$ScaleTypeEnum scaleType, @Nullable Integer num, @Nullable Integer num2) {
        AbstractC5830k.m5330g(pageControl, "<this>");
        AbstractC5830k.m5330g(path, "path");
        AbstractC5830k.m5330g(scaleType, "scaleType");
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
        float fCountScale = countScale(pageControl, iIntValue, iIntValue2, scaleType);
        return new Float[]{Float.valueOf(iIntValue * fCountScale), Float.valueOf(iIntValue2 * fCountScale)};
    }

    public static /* synthetic */ Float[] getWHFromLocalByType$default(PageControl pageControl, String str, EzyScaleTypeEnum$ScaleTypeEnum ezyScaleTypeEnum$ScaleTypeEnum, Integer num, Integer num2, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            num2 = null;
        }
        return getWHFromLocalByType(pageControl, str, ezyScaleTypeEnum$ScaleTypeEnum, num, num2);
    }

    @Nullable
    public static final File saveBitmapToLocal(@NotNull PageControl pageControl, @NotNull Bitmap bitmap, boolean z8, @NotNull String filename) {
        AbstractC5830k.m5330g(pageControl, "<this>");
        AbstractC5830k.m5330g(bitmap, "bitmap");
        AbstractC5830k.m5330g(filename, "filename");
        String resPath = SourceRouterRecord.INSTANCE.getResPath(pageControl.getPagePath(), DocumentType.IMAGE);
        if (AbstractC5855p.m5382P(filename)) {
            filename = UUID.randomUUID().toString();
            AbstractC5830k.m5329f(filename, "randomUUID().toString()");
        }
        File file = new File(resPath, filename.concat(".webp"));
        FileUtils fileUtils = FileUtils.INSTANCE;
        String absolutePath = file.getAbsolutePath();
        AbstractC5830k.m5329f(absolutePath, "newFile.absolutePath");
        if (fileUtils.saveBitmap2SDCard(bitmap, absolutePath, z8).length() > 0) {
            return file;
        }
        return null;
    }

    public static /* synthetic */ File saveBitmapToLocal$default(PageControl pageControl, Bitmap bitmap, boolean z8, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = UUID.randomUUID().toString();
            AbstractC5830k.m5329f(str, "randomUUID().toString()");
        }
        return saveBitmapToLocal(pageControl, bitmap, z8, str);
    }

    @Nullable
    public static final File saveFileToLocal(@NotNull PageControl pageControl, @NotNull String path) {
        String strSubstring;
        AbstractC5830k.m5330g(pageControl, "<this>");
        AbstractC5830k.m5330g(path, "path");
        File file = new File(path);
        if (!file.exists()) {
            return null;
        }
        String path2 = file.getPath();
        AbstractC5830k.m5329f(path2, "f.path");
        int iM5385S = AbstractC5855p.m5385S(path2, '.', 0, 6);
        if (iM5385S != -1) {
            String path3 = file.getPath();
            AbstractC5830k.m5329f(path3, "f.path");
            strSubstring = path3.substring(iM5385S);
            AbstractC5830k.m5329f(strSubstring, "this as java.lang.String).substring(startIndex)");
        } else {
            strSubstring = "";
        }
        File file2 = new File(SourceRouterRecord.INSTANCE.getResPath(pageControl.getPagePath(), DocumentType.IMAGE), UUID.randomUUID().toString() + strSubstring);
        FileUtils.INSTANCE.copyFileUsingFileChannels(new File(path), file2);
        return file2;
    }
}
