package androidx.compose.foundation.internal;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.Shadow;
import androidx.compose.p013ui.text.SpanStyle;
import androidx.compose.p013ui.text.font.FontStyle;
import androidx.compose.p013ui.text.font.FontSynthesis;
import androidx.compose.p013ui.text.font.FontWeight;
import androidx.compose.p013ui.text.style.BaselineShift;
import androidx.compose.p013ui.text.style.TextDecoration;
import androidx.compose.p013ui.text.style.TextGeometricTransform;
import androidx.compose.p013ui.unit.TextUnit;
import androidx.compose.p013ui.unit.TextUnitType;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class EncodeHelper {
    public static final int $stable = 8;
    private Parcel parcel = Parcel.obtain();

    public final void encode(SpanStyle spanStyle) {
        long jM26305getColor0d7_KjU = spanStyle.m26305getColor0d7_KjU();
        Color.Companion companion = Color.Companion;
        if (!Color.m24277equalsimpl0(jM26305getColor0d7_KjU, companion.m24312getUnspecified0d7_KjU())) {
            encode((byte) 1);
            m20688encode8_81llA(spanStyle.m26305getColor0d7_KjU());
        }
        long jM26306getFontSizeXSAIIZE = spanStyle.m26306getFontSizeXSAIIZE();
        TextUnit.Companion companion2 = TextUnit.Companion;
        if (!TextUnit.m27090equalsimpl0(jM26306getFontSizeXSAIIZE, companion2.m27104getUnspecifiedXSAIIZE())) {
            encode((byte) 2);
            m20685encodeR2X_6o(spanStyle.m26306getFontSizeXSAIIZE());
        }
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight != null) {
            encode((byte) 3);
            encode(fontWeight);
        }
        FontStyle fontStyleM26307getFontStyle4Lr2A7w = spanStyle.m26307getFontStyle4Lr2A7w();
        if (fontStyleM26307getFontStyle4Lr2A7w != null) {
            int iM26478unboximpl = fontStyleM26307getFontStyle4Lr2A7w.m26478unboximpl();
            encode((byte) 4);
            m20690encodenzbMABs(iM26478unboximpl);
        }
        FontSynthesis fontSynthesisM26308getFontSynthesisZQGJjVo = spanStyle.m26308getFontSynthesisZQGJjVo();
        if (fontSynthesisM26308getFontSynthesisZQGJjVo != null) {
            int iM26491unboximpl = fontSynthesisM26308getFontSynthesisZQGJjVo.m26491unboximpl();
            encode((byte) 5);
            m20687encode6p3vJLY(iM26491unboximpl);
        }
        String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings != null) {
            encode((byte) 6);
            encode(fontFeatureSettings);
        }
        if (!TextUnit.m27090equalsimpl0(spanStyle.m26309getLetterSpacingXSAIIZE(), companion2.m27104getUnspecifiedXSAIIZE())) {
            encode((byte) 7);
            m20685encodeR2X_6o(spanStyle.m26309getLetterSpacingXSAIIZE());
        }
        BaselineShift baselineShiftM26304getBaselineShift5SSeXJ0 = spanStyle.m26304getBaselineShift5SSeXJ0();
        if (baselineShiftM26304getBaselineShift5SSeXJ0 != null) {
            float fM26661unboximpl = baselineShiftM26304getBaselineShift5SSeXJ0.m26661unboximpl();
            encode((byte) 8);
            m20686encode4Dl_Bck(fM26661unboximpl);
        }
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform != null) {
            encode((byte) 9);
            encode(textGeometricTransform);
        }
        if (!Color.m24277equalsimpl0(spanStyle.m26303getBackground0d7_KjU(), companion.m24312getUnspecified0d7_KjU())) {
            encode((byte) 10);
            m20688encode8_81llA(spanStyle.m26303getBackground0d7_KjU());
        }
        TextDecoration textDecoration = spanStyle.getTextDecoration();
        if (textDecoration != null) {
            encode((byte) 11);
            encode(textDecoration);
        }
        Shadow shadow = spanStyle.getShadow();
        if (shadow != null) {
            encode((byte) 12);
            encode(shadow);
        }
    }

    /* renamed from: encode--R2X_6o, reason: not valid java name */
    public final void m20685encodeR2X_6o(long j10) {
        long jM27092getTypeUIouoOA = TextUnit.m27092getTypeUIouoOA(j10);
        TextUnitType.Companion companion = TextUnitType.Companion;
        byte b10 = 0;
        if (!TextUnitType.m27121equalsimpl0(jM27092getTypeUIouoOA, companion.m27127getUnspecifiedUIouoOA())) {
            if (TextUnitType.m27121equalsimpl0(jM27092getTypeUIouoOA, companion.m27126getSpUIouoOA())) {
                b10 = 1;
            } else if (TextUnitType.m27121equalsimpl0(jM27092getTypeUIouoOA, companion.m27125getEmUIouoOA())) {
                b10 = 2;
            }
        }
        encode(b10);
        if (TextUnitType.m27121equalsimpl0(TextUnit.m27092getTypeUIouoOA(j10), companion.m27127getUnspecifiedUIouoOA())) {
            return;
        }
        encode(TextUnit.m27093getValueimpl(j10));
    }

    /* renamed from: encode-4Dl_Bck, reason: not valid java name */
    public final void m20686encode4Dl_Bck(float f10) {
        encode(f10);
    }

    /* renamed from: encode-6p3vJLY, reason: not valid java name */
    public final void m20687encode6p3vJLY(int i10) {
        FontSynthesis.Companion companion = FontSynthesis.Companion;
        byte b10 = 0;
        if (!FontSynthesis.m26486equalsimpl0(i10, companion.m26493getNoneGVVA2EU())) {
            if (FontSynthesis.m26486equalsimpl0(i10, companion.m26492getAllGVVA2EU())) {
                b10 = 1;
            } else if (FontSynthesis.m26486equalsimpl0(i10, companion.m26495getWeightGVVA2EU())) {
                b10 = 2;
            } else if (FontSynthesis.m26486equalsimpl0(i10, companion.m26494getStyleGVVA2EU())) {
                b10 = 3;
            }
        }
        encode(b10);
    }

    /* renamed from: encode-8_81llA, reason: not valid java name */
    public final void m20688encode8_81llA(long j10) {
        m20689encodeVKZWuLQ(j10);
    }

    /* renamed from: encode-VKZWuLQ, reason: not valid java name */
    public final void m20689encodeVKZWuLQ(long j10) {
        this.parcel.writeLong(j10);
    }

    /* renamed from: encode-nzbMABs, reason: not valid java name */
    public final void m20690encodenzbMABs(int i10) {
        FontStyle.Companion companion = FontStyle.Companion;
        byte b10 = 0;
        if (!FontStyle.m26475equalsimpl0(i10, companion.m26482getNormal_LCdwA()) && FontStyle.m26475equalsimpl0(i10, companion.m26481getItalic_LCdwA())) {
            b10 = 1;
        }
        encode(b10);
    }

    public final String encodedString() {
        return Base64.encodeToString(this.parcel.marshall(), 0);
    }

    public final void reset() {
        this.parcel.recycle();
        this.parcel = Parcel.obtain();
    }

    public final void encode(FontWeight fontWeight) {
        encode(fontWeight.getWeight());
    }

    public final void encode(TextGeometricTransform textGeometricTransform) {
        encode(textGeometricTransform.getScaleX());
        encode(textGeometricTransform.getSkewX());
    }

    public final void encode(TextDecoration textDecoration) {
        encode(textDecoration.getMask());
    }

    public final void encode(Shadow shadow) {
        m20688encode8_81llA(shadow.m24601getColor0d7_KjU());
        encode(Float.intBitsToFloat((int) (shadow.m24602getOffsetF1C5BW0() >> 32)));
        encode(Float.intBitsToFloat((int) (shadow.m24602getOffsetF1C5BW0() & 4294967295L)));
        encode(shadow.getBlurRadius());
    }

    public final void encode(byte b10) {
        this.parcel.writeByte(b10);
    }

    public final void encode(int i10) {
        this.parcel.writeInt(i10);
    }

    public final void encode(float f10) {
        this.parcel.writeFloat(f10);
    }

    public final void encode(String str) {
        this.parcel.writeString(str);
    }
}
