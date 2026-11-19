package androidx.compose.foundation.internal;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.Shadow;
import androidx.compose.p014ui.text.SpanStyle;
import androidx.compose.p014ui.text.font.FontStyle;
import androidx.compose.p014ui.text.font.FontSynthesis;
import androidx.compose.p014ui.text.font.FontWeight;
import androidx.compose.p014ui.text.style.BaselineShift;
import androidx.compose.p014ui.text.style.TextDecoration;
import androidx.compose.p014ui.text.style.TextGeometricTransform;
import androidx.compose.p014ui.unit.TextUnit;
import androidx.compose.p014ui.unit.TextUnitType;
import androidx.compose.runtime.internal.StabilityInferred;
import org.eclipse.paho.client.mqttv3.internal.wire.MqttWireMessage;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class EncodeHelper {
    public static final int $stable = 8;
    private Parcel parcel = Parcel.obtain();

    public final void encode(SpanStyle spanStyle) {
        long jM32907getColor0d7_KjU = spanStyle.m32907getColor0d7_KjU();
        Color.Companion companion = Color.Companion;
        if (!Color.m30879equalsimpl0(jM32907getColor0d7_KjU, companion.m30914getUnspecified0d7_KjU())) {
            encode((byte) 1);
            m27290encode8_81llA(spanStyle.m32907getColor0d7_KjU());
        }
        long jM32908getFontSizeXSAIIZE = spanStyle.m32908getFontSizeXSAIIZE();
        TextUnit.Companion companion2 = TextUnit.Companion;
        if (!TextUnit.m33692equalsimpl0(jM32908getFontSizeXSAIIZE, companion2.m33706getUnspecifiedXSAIIZE())) {
            encode((byte) 2);
            m27287encodeR2X_6o(spanStyle.m32908getFontSizeXSAIIZE());
        }
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight != null) {
            encode((byte) 3);
            encode(fontWeight);
        }
        FontStyle fontStyleM32909getFontStyle4Lr2A7w = spanStyle.m32909getFontStyle4Lr2A7w();
        if (fontStyleM32909getFontStyle4Lr2A7w != null) {
            int iM33080unboximpl = fontStyleM32909getFontStyle4Lr2A7w.m33080unboximpl();
            encode((byte) 4);
            m27292encodenzbMABs(iM33080unboximpl);
        }
        FontSynthesis fontSynthesisM32910getFontSynthesisZQGJjVo = spanStyle.m32910getFontSynthesisZQGJjVo();
        if (fontSynthesisM32910getFontSynthesisZQGJjVo != null) {
            int iM33093unboximpl = fontSynthesisM32910getFontSynthesisZQGJjVo.m33093unboximpl();
            encode((byte) 5);
            m27289encode6p3vJLY(iM33093unboximpl);
        }
        String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings != null) {
            encode((byte) 6);
            encode(fontFeatureSettings);
        }
        if (!TextUnit.m33692equalsimpl0(spanStyle.m32911getLetterSpacingXSAIIZE(), companion2.m33706getUnspecifiedXSAIIZE())) {
            encode((byte) 7);
            m27287encodeR2X_6o(spanStyle.m32911getLetterSpacingXSAIIZE());
        }
        BaselineShift baselineShiftM32906getBaselineShift5SSeXJ0 = spanStyle.m32906getBaselineShift5SSeXJ0();
        if (baselineShiftM32906getBaselineShift5SSeXJ0 != null) {
            float fM33263unboximpl = baselineShiftM32906getBaselineShift5SSeXJ0.m33263unboximpl();
            encode((byte) 8);
            m27288encode4Dl_Bck(fM33263unboximpl);
        }
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform != null) {
            encode((byte) 9);
            encode(textGeometricTransform);
        }
        if (!Color.m30879equalsimpl0(spanStyle.m32905getBackground0d7_KjU(), companion.m30914getUnspecified0d7_KjU())) {
            encode((byte) 10);
            m27290encode8_81llA(spanStyle.m32905getBackground0d7_KjU());
        }
        TextDecoration textDecoration = spanStyle.getTextDecoration();
        if (textDecoration != null) {
            encode(MqttWireMessage.MESSAGE_TYPE_UNSUBACK);
            encode(textDecoration);
        }
        Shadow shadow = spanStyle.getShadow();
        if (shadow != null) {
            encode(MqttWireMessage.MESSAGE_TYPE_PINGREQ);
            encode(shadow);
        }
    }

    /* renamed from: encode--R2X_6o, reason: not valid java name */
    public final void m27287encodeR2X_6o(long j10) {
        long jM33694getTypeUIouoOA = TextUnit.m33694getTypeUIouoOA(j10);
        TextUnitType.Companion companion = TextUnitType.Companion;
        byte b10 = 0;
        if (!TextUnitType.m33723equalsimpl0(jM33694getTypeUIouoOA, companion.m33729getUnspecifiedUIouoOA())) {
            if (TextUnitType.m33723equalsimpl0(jM33694getTypeUIouoOA, companion.m33728getSpUIouoOA())) {
                b10 = 1;
            } else if (TextUnitType.m33723equalsimpl0(jM33694getTypeUIouoOA, companion.m33727getEmUIouoOA())) {
                b10 = 2;
            }
        }
        encode(b10);
        if (TextUnitType.m33723equalsimpl0(TextUnit.m33694getTypeUIouoOA(j10), companion.m33729getUnspecifiedUIouoOA())) {
            return;
        }
        encode(TextUnit.m33695getValueimpl(j10));
    }

    /* renamed from: encode-4Dl_Bck, reason: not valid java name */
    public final void m27288encode4Dl_Bck(float f10) {
        encode(f10);
    }

    /* renamed from: encode-6p3vJLY, reason: not valid java name */
    public final void m27289encode6p3vJLY(int i10) {
        FontSynthesis.Companion companion = FontSynthesis.Companion;
        byte b10 = 0;
        if (!FontSynthesis.m33088equalsimpl0(i10, companion.m33095getNoneGVVA2EU())) {
            if (FontSynthesis.m33088equalsimpl0(i10, companion.m33094getAllGVVA2EU())) {
                b10 = 1;
            } else if (FontSynthesis.m33088equalsimpl0(i10, companion.m33097getWeightGVVA2EU())) {
                b10 = 2;
            } else if (FontSynthesis.m33088equalsimpl0(i10, companion.m33096getStyleGVVA2EU())) {
                b10 = 3;
            }
        }
        encode(b10);
    }

    /* renamed from: encode-8_81llA, reason: not valid java name */
    public final void m27290encode8_81llA(long j10) {
        m27291encodeVKZWuLQ(j10);
    }

    /* renamed from: encode-VKZWuLQ, reason: not valid java name */
    public final void m27291encodeVKZWuLQ(long j10) {
        this.parcel.writeLong(j10);
    }

    /* renamed from: encode-nzbMABs, reason: not valid java name */
    public final void m27292encodenzbMABs(int i10) {
        FontStyle.Companion companion = FontStyle.Companion;
        byte b10 = 0;
        if (!FontStyle.m33077equalsimpl0(i10, companion.m33084getNormal_LCdwA()) && FontStyle.m33077equalsimpl0(i10, companion.m33083getItalic_LCdwA())) {
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
        m27290encode8_81llA(shadow.m31203getColor0d7_KjU());
        encode(Float.intBitsToFloat((int) (shadow.m31204getOffsetF1C5BW0() >> 32)));
        encode(Float.intBitsToFloat((int) (shadow.m31204getOffsetF1C5BW0() & 4294967295L)));
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
