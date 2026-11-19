package androidx.compose.p011ui.platform;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.p011ui.unit.TextUnit;
import androidx.compose.p011ui.unit.TextUnitType;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0010J\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u000b\u0010\u0016J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001aJ\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b\u000b\u0010$J\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b\u000b\u0010'J\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b\u000b\u0010*J\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b\u000b\u0010-J\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b\u000b\u0010\u001aJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u00101\u001a\u000200¢\u0006\u0004\b\u000b\u0010!J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u00103\u001a\u000202ø\u0001\u0000¢\u0006\u0004\b4\u0010\u0010J\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u00106R\u0016\u00108\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006:"}, m5110d2 = {"Landroidx/compose/ui/platform/EncodeHelper;", "", "<init>", "()V", "Ld6/s;", "reset", "", "encodedString", "()Ljava/lang/String;", "Landroidx/compose/ui/text/SpanStyle;", "spanStyle", "encode", "(Landroidx/compose/ui/text/SpanStyle;)V", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "encode-8_81llA", "(J)V", "Landroidx/compose/ui/unit/TextUnit;", "textUnit", "encode--R2X_6o", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "(Landroidx/compose/ui/text/font/FontWeight;)V", "Landroidx/compose/ui/text/font/FontStyle;", "fontStyle", "encode-nzbMABs", "(I)V", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontSynthesis", "encode-6p3vJLY", "Landroidx/compose/ui/text/style/BaselineShift;", "baselineShift", "encode-4Dl_Bck", "(F)V", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "textGeometricTransform", "(Landroidx/compose/ui/text/style/TextGeometricTransform;)V", "Landroidx/compose/ui/text/style/TextDecoration;", "textDecoration", "(Landroidx/compose/ui/text/style/TextDecoration;)V", "Landroidx/compose/ui/graphics/Shadow;", "shadow", "(Landroidx/compose/ui/graphics/Shadow;)V", "", "byte", "(B)V", "", "int", "", TypedValues.Custom.S_FLOAT, "Ld6/n;", "uLong", "encode-VKZWuLQ", TypedValues.Custom.S_STRING, "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "parcel", "Landroid/os/Parcel;", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAndroidClipboardManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidClipboardManager.android.kt\nandroidx/compose/ui/platform/EncodeHelper\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,599:1\n65#2:600\n69#2:603\n60#3:601\n70#3:604\n22#4:602\n22#4:605\n*S KotlinDebug\n*F\n+ 1 AndroidClipboardManager.android.kt\nandroidx/compose/ui/platform/EncodeHelper\n*L\n313#1:600\n314#1:603\n313#1:601\n314#1:604\n313#1:602\n314#1:605\n*E\n"})
/* loaded from: classes2.dex */
public final class EncodeHelper {
    public static final int $stable = 8;

    @NotNull
    private Parcel parcel = Parcel.obtain();

    public final void encode(@NotNull SpanStyle spanStyle) {
        long jM12711getColor0d7_KjU = spanStyle.m12711getColor0d7_KjU();
        Color.Companion companion = Color.INSTANCE;
        if (!Color.m10683equalsimpl0(jM12711getColor0d7_KjU, companion.m10718getUnspecified0d7_KjU())) {
            encode((byte) 1);
            m12465encode8_81llA(spanStyle.m12711getColor0d7_KjU());
        }
        long fontSize = spanStyle.getFontSize();
        TextUnit.Companion companion2 = TextUnit.INSTANCE;
        if (!TextUnit.m13496equalsimpl0(fontSize, companion2.m13510getUnspecifiedXSAIIZE())) {
            encode((byte) 2);
            m12462encodeR2X_6o(spanStyle.getFontSize());
        }
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight != null) {
            encode((byte) 3);
            encode(fontWeight);
        }
        FontStyle fontStyle = spanStyle.getFontStyle();
        if (fontStyle != null) {
            int iM12884unboximpl = fontStyle.m12884unboximpl();
            encode((byte) 4);
            m12467encodenzbMABs(iM12884unboximpl);
        }
        FontSynthesis fontSynthesis = spanStyle.getFontSynthesis();
        if (fontSynthesis != null) {
            int value = fontSynthesis.getValue();
            encode((byte) 5);
            m12464encode6p3vJLY(value);
        }
        String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings != null) {
            encode((byte) 6);
            encode(fontFeatureSettings);
        }
        if (!TextUnit.m13496equalsimpl0(spanStyle.getLetterSpacing(), companion2.m13510getUnspecifiedXSAIIZE())) {
            encode((byte) 7);
            m12462encodeR2X_6o(spanStyle.getLetterSpacing());
        }
        BaselineShift baselineShift = spanStyle.getBaselineShift();
        if (baselineShift != null) {
            float fM13067unboximpl = baselineShift.m13067unboximpl();
            encode((byte) 8);
            m12463encode4Dl_Bck(fM13067unboximpl);
        }
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform != null) {
            encode((byte) 9);
            encode(textGeometricTransform);
        }
        if (!Color.m10683equalsimpl0(spanStyle.getBackground(), companion.m10718getUnspecified0d7_KjU())) {
            encode((byte) 10);
            m12465encode8_81llA(spanStyle.getBackground());
        }
        TextDecoration background = spanStyle.getBackground();
        if (background != null) {
            encode((byte) 11);
            encode(background);
        }
        Shadow shadow = spanStyle.getShadow();
        if (shadow != null) {
            encode((byte) 12);
            encode(shadow);
        }
    }

    /* renamed from: encode--R2X_6o, reason: not valid java name */
    public final void m12462encodeR2X_6o(long textUnit) {
        long jM13498getTypeUIouoOA = TextUnit.m13498getTypeUIouoOA(textUnit);
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        byte b6 = 0;
        if (!TextUnitType.m13527equalsimpl0(jM13498getTypeUIouoOA, companion.m13533getUnspecifiedUIouoOA())) {
            if (TextUnitType.m13527equalsimpl0(jM13498getTypeUIouoOA, companion.m13532getSpUIouoOA())) {
                b6 = 1;
            } else if (TextUnitType.m13527equalsimpl0(jM13498getTypeUIouoOA, companion.m13531getEmUIouoOA())) {
                b6 = 2;
            }
        }
        encode(b6);
        if (TextUnitType.m13527equalsimpl0(TextUnit.m13498getTypeUIouoOA(textUnit), companion.m13533getUnspecifiedUIouoOA())) {
            return;
        }
        encode(TextUnit.m13499getValueimpl(textUnit));
    }

    /* renamed from: encode-4Dl_Bck, reason: not valid java name */
    public final void m12463encode4Dl_Bck(float baselineShift) {
        encode(baselineShift);
    }

    /* renamed from: encode-6p3vJLY, reason: not valid java name */
    public final void m12464encode6p3vJLY(int fontSynthesis) {
        FontSynthesis.Companion companion = FontSynthesis.INSTANCE;
        byte b6 = 0;
        if (!FontSynthesis.m12892equalsimpl0(fontSynthesis, companion.m12899getNoneGVVA2EU())) {
            if (FontSynthesis.m12892equalsimpl0(fontSynthesis, companion.m12898getAllGVVA2EU())) {
                b6 = 1;
            } else if (FontSynthesis.m12892equalsimpl0(fontSynthesis, companion.m12901getWeightGVVA2EU())) {
                b6 = 2;
            } else if (FontSynthesis.m12892equalsimpl0(fontSynthesis, companion.m12900getStyleGVVA2EU())) {
                b6 = 3;
            }
        }
        encode(b6);
    }

    /* renamed from: encode-8_81llA, reason: not valid java name */
    public final void m12465encode8_81llA(long color) {
        m12466encodeVKZWuLQ(color);
    }

    /* renamed from: encode-VKZWuLQ, reason: not valid java name */
    public final void m12466encodeVKZWuLQ(long uLong) {
        this.parcel.writeLong(uLong);
    }

    /* renamed from: encode-nzbMABs, reason: not valid java name */
    public final void m12467encodenzbMABs(int fontStyle) {
        FontStyle.Companion companion = FontStyle.INSTANCE;
        byte b6 = 0;
        if (!FontStyle.m12881equalsimpl0(fontStyle, companion.m12888getNormal_LCdwA()) && FontStyle.m12881equalsimpl0(fontStyle, companion.m12887getItalic_LCdwA())) {
            b6 = 1;
        }
        encode(b6);
    }

    @NotNull
    public final String encodedString() {
        return Base64.encodeToString(this.parcel.marshall(), 0);
    }

    public final void reset() {
        this.parcel.recycle();
        this.parcel = Parcel.obtain();
    }

    public final void encode(@NotNull FontWeight fontWeight) {
        encode(fontWeight.getWeight());
    }

    public final void encode(@NotNull TextGeometricTransform textGeometricTransform) {
        encode(textGeometricTransform.getScaleX());
        encode(textGeometricTransform.getSkewX());
    }

    public final void encode(@NotNull TextDecoration textDecoration) {
        encode(textDecoration.getMask());
    }

    public final void encode(@NotNull Shadow shadow) {
        m12465encode8_81llA(shadow.getColor());
        encode(Float.intBitsToFloat((int) (shadow.getOffset() >> 32)));
        encode(Float.intBitsToFloat((int) (shadow.getOffset() & 4294967295L)));
        encode(shadow.getBlurRadius());
    }

    public final void encode(byte b6) {
        this.parcel.writeByte(b6);
    }

    public final void encode(int i) {
        this.parcel.writeInt(i);
    }

    public final void encode(float f) {
        this.parcel.writeFloat(f);
    }

    public final void encode(@NotNull String string) {
        this.parcel.writeString(string);
    }
}
