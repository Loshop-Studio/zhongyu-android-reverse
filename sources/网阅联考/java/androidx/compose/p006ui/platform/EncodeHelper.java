package androidx.compose.p006ui.platform;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.p006ui.geometry.Offset;
import androidx.compose.p006ui.graphics.Color;
import androidx.compose.p006ui.graphics.Shadow;
import androidx.compose.p006ui.text.SpanStyle;
import androidx.compose.p006ui.text.font.FontStyle;
import androidx.compose.p006ui.text.font.FontSynthesis;
import androidx.compose.p006ui.text.font.FontWeight;
import androidx.compose.p006ui.text.style.BaselineShift;
import androidx.compose.p006ui.text.style.TextDecoration;
import androidx.compose.p006ui.text.style.TextGeometricTransform;
import androidx.compose.p006ui.unit.TextUnit;
import androidx.compose.p006ui.unit.TextUnitType;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001b\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eJ\u001b\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017J\u001b\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0019ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001fJ\u001b\u0010\u0005\u001a\u00020\u00062\u0006\u0010 \u001a\u00020!ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010#\u001a\u00020$J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010%\u001a\u00020&J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010'\u001a\u00020(J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010)\u001a\u00020*J\u001b\u0010\u0005\u001a\u00020\u00062\u0006\u0010+\u001a\u00020,ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010\nJ\u0006\u0010.\u001a\u00020*J\u0006\u0010/\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00060"}, m5175d2 = {"Landroidx/compose/ui/platform/EncodeHelper;", "", "()V", "parcel", "Landroid/os/Parcel;", "encode", "", "color", "Landroidx/compose/ui/graphics/Color;", "encode-8_81llA", "(J)V", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "spanStyle", "Landroidx/compose/ui/text/SpanStyle;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "encode-nzbMABs", "(I)V", "fontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "encode-6p3vJLY", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "baselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "encode-4Dl_Bck", "(F)V", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "textGeometricTransform", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "textUnit", "Landroidx/compose/ui/unit/TextUnit;", "encode--R2X_6o", "byte", "", "float", "", "int", "", "string", "", "uLong", "Lkotlin/ULong;", "encode-VKZWuLQ", "encodedString", "reset", "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class EncodeHelper {
    private Parcel parcel;

    public EncodeHelper() {
        Parcel parcelObtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain()");
        this.parcel = parcelObtain;
    }

    public final void encode(SpanStyle spanStyle) {
        Intrinsics.checkNotNullParameter(spanStyle, "spanStyle");
        long jM11037getColor0d7_KjU = spanStyle.m11037getColor0d7_KjU();
        Color.Companion companion = Color.INSTANCE;
        if (!Color.m9179equalsimpl0(jM11037getColor0d7_KjU, companion.m9214getUnspecified0d7_KjU())) {
            encode((byte) 1);
            m10872encode8_81llA(spanStyle.m11037getColor0d7_KjU());
        }
        long fontSize = spanStyle.getFontSize();
        TextUnit.Companion companion2 = TextUnit.INSTANCE;
        if (!TextUnit.m11703equalsimpl0(fontSize, companion2.m11717getUnspecifiedXSAIIZE())) {
            encode((byte) 2);
            m10869encodeR2X_6o(spanStyle.getFontSize());
        }
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight != null) {
            encode((byte) 3);
            encode(fontWeight);
        }
        FontStyle fontStyle = spanStyle.getFontStyle();
        if (fontStyle != null) {
            int iM11165unboximpl = fontStyle.m11165unboximpl();
            encode((byte) 4);
            m10874encodenzbMABs(iM11165unboximpl);
        }
        FontSynthesis fontSynthesis = spanStyle.getFontSynthesis();
        if (fontSynthesis != null) {
            int value = fontSynthesis.getValue();
            encode((byte) 5);
            m10871encode6p3vJLY(value);
        }
        String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings != null) {
            encode((byte) 6);
            encode(fontFeatureSettings);
        }
        if (!TextUnit.m11703equalsimpl0(spanStyle.getLetterSpacing(), companion2.m11717getUnspecifiedXSAIIZE())) {
            encode((byte) 7);
            m10869encodeR2X_6o(spanStyle.getLetterSpacing());
        }
        BaselineShift baselineShift = spanStyle.getBaselineShift();
        if (baselineShift != null) {
            float fM11326unboximpl = baselineShift.m11326unboximpl();
            encode((byte) 8);
            m10870encode4Dl_Bck(fM11326unboximpl);
        }
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform != null) {
            encode((byte) 9);
            encode(textGeometricTransform);
        }
        if (!Color.m9179equalsimpl0(spanStyle.getBackground(), companion.m9214getUnspecified0d7_KjU())) {
            encode((byte) 10);
            m10872encode8_81llA(spanStyle.getBackground());
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
    public final void m10869encodeR2X_6o(long textUnit) {
        long jM11705getTypeUIouoOA = TextUnit.m11705getTypeUIouoOA(textUnit);
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        byte b4 = 0;
        if (!TextUnitType.m11734equalsimpl0(jM11705getTypeUIouoOA, companion.m11740getUnspecifiedUIouoOA())) {
            if (TextUnitType.m11734equalsimpl0(jM11705getTypeUIouoOA, companion.m11739getSpUIouoOA())) {
                b4 = 1;
            } else if (TextUnitType.m11734equalsimpl0(jM11705getTypeUIouoOA, companion.m11738getEmUIouoOA())) {
                b4 = 2;
            }
        }
        encode(b4);
        if (TextUnitType.m11734equalsimpl0(TextUnit.m11705getTypeUIouoOA(textUnit), companion.m11740getUnspecifiedUIouoOA())) {
            return;
        }
        encode(TextUnit.m11706getValueimpl(textUnit));
    }

    /* renamed from: encode-4Dl_Bck, reason: not valid java name */
    public final void m10870encode4Dl_Bck(float baselineShift) {
        encode(baselineShift);
    }

    /* renamed from: encode-6p3vJLY, reason: not valid java name */
    public final void m10871encode6p3vJLY(int fontSynthesis) {
        FontSynthesis.Companion companion = FontSynthesis.INSTANCE;
        byte b4 = 0;
        if (!FontSynthesis.m11171equalsimpl0(fontSynthesis, companion.m11178getNoneGVVA2EU())) {
            if (FontSynthesis.m11171equalsimpl0(fontSynthesis, companion.m11177getAllGVVA2EU())) {
                b4 = 1;
            } else if (FontSynthesis.m11171equalsimpl0(fontSynthesis, companion.m11180getWeightGVVA2EU())) {
                b4 = 2;
            } else if (FontSynthesis.m11171equalsimpl0(fontSynthesis, companion.m11179getStyleGVVA2EU())) {
                b4 = 3;
            }
        }
        encode(b4);
    }

    /* renamed from: encode-8_81llA, reason: not valid java name */
    public final void m10872encode8_81llA(long color) {
        m10873encodeVKZWuLQ(color);
    }

    /* renamed from: encode-VKZWuLQ, reason: not valid java name */
    public final void m10873encodeVKZWuLQ(long uLong) {
        this.parcel.writeLong(uLong);
    }

    /* renamed from: encode-nzbMABs, reason: not valid java name */
    public final void m10874encodenzbMABs(int fontStyle) {
        FontStyle.Companion companion = FontStyle.INSTANCE;
        byte b4 = 0;
        if (!FontStyle.m11162equalsimpl0(fontStyle, companion.m11167getNormal_LCdwA()) && FontStyle.m11162equalsimpl0(fontStyle, companion.m11166getItalic_LCdwA())) {
            b4 = 1;
        }
        encode(b4);
    }

    public final String encodedString() {
        String strEncodeToString = Base64.encodeToString(this.parcel.marshall(), 0);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(bytes, Base64.DEFAULT)");
        return strEncodeToString;
    }

    public final void reset() {
        this.parcel.recycle();
        Parcel parcelObtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain()");
        this.parcel = parcelObtain;
    }

    public final void encode(FontWeight fontWeight) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        encode(fontWeight.getWeight());
    }

    public final void encode(TextGeometricTransform textGeometricTransform) {
        Intrinsics.checkNotNullParameter(textGeometricTransform, "textGeometricTransform");
        encode(textGeometricTransform.getScaleX());
        encode(textGeometricTransform.getSkewX());
    }

    public final void encode(TextDecoration textDecoration) {
        Intrinsics.checkNotNullParameter(textDecoration, "textDecoration");
        encode(textDecoration.getMask());
    }

    public final void encode(Shadow shadow) {
        Intrinsics.checkNotNullParameter(shadow, "shadow");
        m10872encode8_81llA(shadow.getColor());
        encode(Offset.m8945getXimpl(shadow.getOffset()));
        encode(Offset.m8946getYimpl(shadow.getOffset()));
        encode(shadow.getBlurRadius());
    }

    public final void encode(byte b4) {
        this.parcel.writeByte(b4);
    }

    public final void encode(int i4) {
        this.parcel.writeInt(i4);
    }

    public final void encode(float f4) {
        this.parcel.writeFloat(f4);
    }

    public final void encode(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        this.parcel.writeString(string);
    }
}
