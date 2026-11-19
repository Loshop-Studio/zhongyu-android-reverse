package androidx.compose.p013ui.unit.fontscaling;

import androidx.annotation.AnyThread;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.collection.SparseArrayCompat;
import androidx.compose.p013ui.unit.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import p123h7.C8736p;

@StabilityInferred(parameters = 0)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class FontScaleConverterFactory {
    public static final int $stable;
    private static final float[] CommonFontSizes;
    public static final FontScaleConverterFactory INSTANCE;
    private static final Object[] LookupTablesWriteLock;
    private static final float MinScaleForNonLinear = 1.03f;
    private static final float ScaleKeyMultiplier = 100.0f;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    private static volatile SparseArrayCompat<FontScaleConverter> sLookupTables;

    static {
        FontScaleConverterFactory fontScaleConverterFactory = new FontScaleConverterFactory();
        INSTANCE = fontScaleConverterFactory;
        CommonFontSizes = new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, ScaleKeyMultiplier};
        sLookupTables = new SparseArrayCompat<>(0, 1, null);
        Object[] objArr = new Object[0];
        LookupTablesWriteLock = objArr;
        synchronized (objArr) {
            fontScaleConverterFactory.putInto(sLookupTables, 1.15f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, ScaleKeyMultiplier}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, ScaleKeyMultiplier}));
            fontScaleConverterFactory.putInto(sLookupTables, 1.3f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, ScaleKeyMultiplier}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, ScaleKeyMultiplier}));
            fontScaleConverterFactory.putInto(sLookupTables, 1.5f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, ScaleKeyMultiplier}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, ScaleKeyMultiplier}));
            fontScaleConverterFactory.putInto(sLookupTables, 1.8f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, ScaleKeyMultiplier}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, ScaleKeyMultiplier}));
            fontScaleConverterFactory.putInto(sLookupTables, 2.0f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, ScaleKeyMultiplier}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, ScaleKeyMultiplier}));
            C8736p c8736p = C8736p.f16368a;
        }
        if (!(fontScaleConverterFactory.getScaleFromKey(sLookupTables.keyAt(0)) - 0.01f > MinScaleForNonLinear)) {
            InlineClassHelperKt.throwIllegalStateException("You should only apply non-linear scaling to font scales > 1");
        }
        $stable = 8;
    }

    private FontScaleConverterFactory() {
    }

    private final FontScaleConverter createInterpolatedTableBetween(FontScaleConverter fontScaleConverter, FontScaleConverter fontScaleConverter2, float f10) {
        float[] fArr = CommonFontSizes;
        float[] fArr2 = new float[fArr.length];
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            float f11 = CommonFontSizes[i10];
            fArr2[i10] = MathUtils.INSTANCE.lerp(fontScaleConverter.convertSpToDp(f11), fontScaleConverter2.convertSpToDp(f11), f10);
        }
        return new FontScaleConverterTable(CommonFontSizes, fArr2);
    }

    private final FontScaleConverter get(float f10) {
        return sLookupTables.get(getKey(f10));
    }

    private final int getKey(float f10) {
        return (int) (f10 * ScaleKeyMultiplier);
    }

    @VisibleForTesting
    public static /* synthetic */ void getSLookupTables$annotations() {
    }

    private final float getScaleFromKey(int i10) {
        return i10 / ScaleKeyMultiplier;
    }

    private final void put(float f10, FontScaleConverter fontScaleConverter) {
        synchronized (LookupTablesWriteLock) {
            SparseArrayCompat<FontScaleConverter> sparseArrayCompatM20133clone = sLookupTables.m20133clone();
            INSTANCE.putInto(sparseArrayCompatM20133clone, f10, fontScaleConverter);
            sLookupTables = sparseArrayCompatM20133clone;
            C8736p c8736p = C8736p.f16368a;
        }
    }

    private final void putInto(SparseArrayCompat<FontScaleConverter> sparseArrayCompat, float f10, FontScaleConverter fontScaleConverter) {
        sparseArrayCompat.put(getKey(f10), fontScaleConverter);
    }

    @AnyThread
    public final FontScaleConverter forScale(float f10) {
        FontScaleConverter fontScaleConverterValueAt;
        if (!isNonLinearFontScalingActive(f10)) {
            return null;
        }
        FontScaleConverter fontScaleConverter = INSTANCE.get(f10);
        if (fontScaleConverter != null) {
            return fontScaleConverter;
        }
        int iIndexOfKey = sLookupTables.indexOfKey(getKey(f10));
        if (iIndexOfKey >= 0) {
            return sLookupTables.valueAt(iIndexOfKey);
        }
        int i10 = -(iIndexOfKey + 1);
        int i11 = i10 - 1;
        float scaleFromKey = 1.0f;
        if (i10 >= sLookupTables.size()) {
            FontScaleConverterTable fontScaleConverterTable = new FontScaleConverterTable(new float[]{1.0f}, new float[]{f10});
            put(f10, fontScaleConverterTable);
            return fontScaleConverterTable;
        }
        if (i11 < 0) {
            float[] fArr = CommonFontSizes;
            fontScaleConverterValueAt = new FontScaleConverterTable(fArr, fArr);
        } else {
            scaleFromKey = getScaleFromKey(sLookupTables.keyAt(i11));
            fontScaleConverterValueAt = sLookupTables.valueAt(i11);
        }
        FontScaleConverter fontScaleConverterCreateInterpolatedTableBetween = createInterpolatedTableBetween(fontScaleConverterValueAt, sLookupTables.valueAt(i10), MathUtils.INSTANCE.constrainedMap(0.0f, 1.0f, scaleFromKey, getScaleFromKey(sLookupTables.keyAt(i10)), f10));
        put(f10, fontScaleConverterCreateInterpolatedTableBetween);
        return fontScaleConverterCreateInterpolatedTableBetween;
    }

    public final SparseArrayCompat<FontScaleConverter> getSLookupTables() {
        return sLookupTables;
    }

    @AnyThread
    public final boolean isNonLinearFontScalingActive(float f10) {
        return f10 >= MinScaleForNonLinear;
    }

    public final void setSLookupTables(SparseArrayCompat<FontScaleConverter> sparseArrayCompat) {
        sLookupTables = sparseArrayCompat;
    }
}
