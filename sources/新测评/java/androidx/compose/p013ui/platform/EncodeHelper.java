package androidx.compose.p013ui.platform;

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
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eJ\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0019ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001fJ\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010 \u001a\u00020!ø\u0001\u0000¢\u0006\u0004\b\"\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010#\u001a\u00020$J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010%\u001a\u00020&J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010'\u001a\u00020(J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010)\u001a\u00020*J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010+\u001a\u00020,ø\u0001\u0000¢\u0006\u0004\b-\u0010\nJ\u0006\u0010.\u001a\u00020*J\u0006\u0010/\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00060"}, m13558d2 = {"Landroidx/compose/ui/platform/EncodeHelper;", "", "()V", "parcel", "Landroid/os/Parcel;", "encode", "", TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/Color;", "encode-8_81llA", "(J)V", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "spanStyle", "Landroidx/compose/ui/text/SpanStyle;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "encode-nzbMABs", "(I)V", "fontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "encode-6p3vJLY", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "baselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "encode-4Dl_Bck", "(F)V", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "textGeometricTransform", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "textUnit", "Landroidx/compose/ui/unit/TextUnit;", "encode--R2X_6o", "byte", "", TypedValues.Custom.S_FLOAT, "", "int", "", TypedValues.Custom.S_STRING, "", "uLong", "Lkotlin/ULong;", "encode-VKZWuLQ", "encodedString", "reset", "ui_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nAndroidClipboardManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidClipboardManager.android.kt\nandroidx/compose/ui/platform/EncodeHelper\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,599:1\n65#2:600\n69#2:603\n60#3:601\n70#3:604\n22#4:602\n22#4:605\n*S KotlinDebug\n*F\n+ 1 AndroidClipboardManager.android.kt\nandroidx/compose/ui/platform/EncodeHelper\n*L\n313#1:600\n314#1:603\n313#1:601\n314#1:604\n313#1:602\n314#1:605\n*E\n"})
/* loaded from: classes2.dex */
public final class EncodeHelper {
    public static final int $stable = 8;
    private Parcel parcel = Parcel.obtain();

    public final void encode(SpanStyle spanStyle) {
        long jM22968getColor0d7_KjU = spanStyle.m22968getColor0d7_KjU();
        Color.Companion companion = Color.INSTANCE;
        if (!Color.m20977equalsimpl0(jM22968getColor0d7_KjU, companion.m21012getUnspecified0d7_KjU())) {
            encode((byte) 1);
            m22730encode8_81llA(spanStyle.m22968getColor0d7_KjU());
        }
        long fontSize = spanStyle.getFontSize();
        TextUnit.Companion companion2 = TextUnit.INSTANCE;
        if (!TextUnit.m23752equalsimpl0(fontSize, companion2.m23766getUnspecifiedXSAIIZE())) {
            encode((byte) 2);
            m22727encodeR2X_6o(spanStyle.getFontSize());
        }
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight != null) {
            encode((byte) 3);
            encode(fontWeight);
        }
        FontStyle fontStyle = spanStyle.getFontStyle();
        if (fontStyle != null) {
            int iM23141unboximpl = fontStyle.m23141unboximpl();
            encode((byte) 4);
            m22732encodenzbMABs(iM23141unboximpl);
        }
        FontSynthesis fontSynthesis = spanStyle.getFontSynthesis();
        if (fontSynthesis != null) {
            int value = fontSynthesis.getValue();
            encode((byte) 5);
            m22729encode6p3vJLY(value);
        }
        String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings != null) {
            encode((byte) 6);
            encode(fontFeatureSettings);
        }
        if (!TextUnit.m23752equalsimpl0(spanStyle.getLetterSpacing(), companion2.m23766getUnspecifiedXSAIIZE())) {
            encode((byte) 7);
            m22727encodeR2X_6o(spanStyle.getLetterSpacing());
        }
        BaselineShift baselineShift = spanStyle.getBaselineShift();
        if (baselineShift != null) {
            float fM23323unboximpl = baselineShift.m23323unboximpl();
            encode((byte) 8);
            m22728encode4Dl_Bck(fM23323unboximpl);
        }
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform != null) {
            encode((byte) 9);
            encode(textGeometricTransform);
        }
        if (!Color.m20977equalsimpl0(spanStyle.getBackground(), companion.m21012getUnspecified0d7_KjU())) {
            encode((byte) 10);
            m22730encode8_81llA(spanStyle.getBackground());
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
    public final void m22727encodeR2X_6o(long textUnit) {
        long jM23754getTypeUIouoOA = TextUnit.m23754getTypeUIouoOA(textUnit);
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        byte b10 = 0;
        if (!TextUnitType.m23783equalsimpl0(jM23754getTypeUIouoOA, companion.m23789getUnspecifiedUIouoOA())) {
            if (TextUnitType.m23783equalsimpl0(jM23754getTypeUIouoOA, companion.m23788getSpUIouoOA())) {
                b10 = 1;
            } else if (TextUnitType.m23783equalsimpl0(jM23754getTypeUIouoOA, companion.m23787getEmUIouoOA())) {
                b10 = 2;
            }
        }
        encode(b10);
        if (TextUnitType.m23783equalsimpl0(TextUnit.m23754getTypeUIouoOA(textUnit), companion.m23789getUnspecifiedUIouoOA())) {
            return;
        }
        encode(TextUnit.m23755getValueimpl(textUnit));
    }

    /* renamed from: encode-4Dl_Bck, reason: not valid java name */
    public final void m22728encode4Dl_Bck(float baselineShift) {
        encode(baselineShift);
    }

    /* renamed from: encode-6p3vJLY, reason: not valid java name */
    public final void m22729encode6p3vJLY(int fontSynthesis) {
        FontSynthesis.Companion companion = FontSynthesis.INSTANCE;
        byte b10 = 0;
        if (!FontSynthesis.m23149equalsimpl0(fontSynthesis, companion.m23156getNoneGVVA2EU())) {
            if (FontSynthesis.m23149equalsimpl0(fontSynthesis, companion.m23155getAllGVVA2EU())) {
                b10 = 1;
            } else if (FontSynthesis.m23149equalsimpl0(fontSynthesis, companion.m23158getWeightGVVA2EU())) {
                b10 = 2;
            } else if (FontSynthesis.m23149equalsimpl0(fontSynthesis, companion.m23157getStyleGVVA2EU())) {
                b10 = 3;
            }
        }
        encode(b10);
    }

    /* renamed from: encode-8_81llA, reason: not valid java name */
    public final void m22730encode8_81llA(long color) {
        m22731encodeVKZWuLQ(color);
    }

    /* renamed from: encode-VKZWuLQ, reason: not valid java name */
    public final void m22731encodeVKZWuLQ(long uLong) {
        this.parcel.writeLong(uLong);
    }

    /* renamed from: encode-nzbMABs, reason: not valid java name */
    public final void m22732encodenzbMABs(int fontStyle) {
        FontStyle.Companion companion = FontStyle.INSTANCE;
        byte b10 = 0;
        if (!FontStyle.m23138equalsimpl0(fontStyle, companion.m23145getNormal_LCdwA()) && FontStyle.m23138equalsimpl0(fontStyle, companion.m23144getItalic_LCdwA())) {
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
        m22730encode8_81llA(shadow.getColor());
        encode(Float.intBitsToFloat((int) (shadow.getOffset() >> 32)));
        encode(Float.intBitsToFloat((int) (shadow.getOffset() & 4294967295L)));
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

    public final void encode(String string) {
        this.parcel.writeString(string);
    }
}
