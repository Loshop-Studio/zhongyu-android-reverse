package androidx.compose.p011ui.platform;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.p011ui.geometry.Offset;
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
import androidx.compose.p011ui.unit.TextUnitKt;
import androidx.compose.p011ui.unit.TextUnitType;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001c\u001a\u00020\u0019H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\bJ\u0011\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0016H\u0002¢\u0006\u0004\b!\u0010\u0018J\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\u0013\u0010'\u001a\u00020%ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010\u001bJ\u0013\u0010*\u001a\u00020(ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010\u001bJ\r\u0010,\u001a\u00020+¢\u0006\u0004\b,\u0010-J\u0013\u00100\u001a\u00020.ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u0010\u0018J\u0013\u00103\u001a\u000201ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u0010\u0018R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00067"}, m5110d2 = {"Landroidx/compose/ui/platform/DecodeHelper;", "", "", TypedValues.Custom.S_STRING, "<init>", "(Ljava/lang/String;)V", "Landroidx/compose/ui/text/style/BaselineShift;", "decodeBaselineShift-y9eOQZs", "()F", "decodeBaselineShift", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "decodeTextGeometricTransform", "()Landroidx/compose/ui/text/style/TextGeometricTransform;", "Landroidx/compose/ui/text/style/TextDecoration;", "decodeTextDecoration", "()Landroidx/compose/ui/text/style/TextDecoration;", "Landroidx/compose/ui/graphics/Shadow;", "decodeShadow", "()Landroidx/compose/ui/graphics/Shadow;", "", "decodeByte", "()B", "", "decodeInt", "()I", "Ld6/n;", "decodeULong-s-VKNKU", "()J", "decodeULong", "", "decodeFloat", "decodeString", "()Ljava/lang/String;", "dataAvailable", "Landroidx/compose/ui/text/SpanStyle;", "decodeSpanStyle", "()Landroidx/compose/ui/text/SpanStyle;", "Landroidx/compose/ui/graphics/Color;", "decodeColor-0d7_KjU", "decodeColor", "Landroidx/compose/ui/unit/TextUnit;", "decodeTextUnit-XSAIIZE", "decodeTextUnit", "Landroidx/compose/ui/text/font/FontWeight;", "decodeFontWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "decodeFontStyle-_-LCdwA", "decodeFontStyle", "Landroidx/compose/ui/text/font/FontSynthesis;", "decodeFontSynthesis-GVVA2EU", "decodeFontSynthesis", "Landroid/os/Parcel;", "parcel", "Landroid/os/Parcel;", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAndroidClipboardManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidClipboardManager.android.kt\nandroidx/compose/ui/platform/DecodeHelper\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,599:1\n30#2:600\n53#3,3:601\n*S KotlinDebug\n*F\n+ 1 AndroidClipboardManager.android.kt\nandroidx/compose/ui/platform/DecodeHelper\n*L\n495#1:600\n495#1:601,3\n*E\n"})
/* loaded from: classes2.dex */
public final class DecodeHelper {
    public static final int $stable = 8;

    @NotNull
    private final Parcel parcel;

    public DecodeHelper(@NotNull String str) {
        Parcel parcelObtain = Parcel.obtain();
        this.parcel = parcelObtain;
        byte[] bArrDecode = Base64.decode(str, 0);
        parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
        parcelObtain.setDataPosition(0);
    }

    private final int dataAvailable() {
        return this.parcel.dataAvail();
    }

    /* renamed from: decodeBaselineShift-y9eOQZs, reason: not valid java name */
    private final float m12448decodeBaselineShifty9eOQZs() {
        return BaselineShift.m13062constructorimpl(decodeFloat());
    }

    private final byte decodeByte() {
        return this.parcel.readByte();
    }

    private final float decodeFloat() {
        return this.parcel.readFloat();
    }

    private final int decodeInt() {
        return this.parcel.readInt();
    }

    private final Shadow decodeShadow() {
        long jM12450decodeColor0d7_KjU = m12450decodeColor0d7_KjU();
        float fDecodeFloat = decodeFloat();
        float fDecodeFloat2 = decodeFloat();
        return new Shadow(jM12450decodeColor0d7_KjU, Offset.m10433constructorimpl((Float.floatToRawIntBits(fDecodeFloat2) & 4294967295L) | (Float.floatToRawIntBits(fDecodeFloat) << 32)), decodeFloat(), null);
    }

    private final String decodeString() {
        return this.parcel.readString();
    }

    private final TextDecoration decodeTextDecoration() {
        int iDecodeInt = decodeInt();
        TextDecoration.Companion companion = TextDecoration.INSTANCE;
        boolean z8 = (companion.getLineThrough().getMask() & iDecodeInt) != 0;
        boolean z9 = (iDecodeInt & companion.getUnderline().getMask()) != 0;
        return (z8 && z9) ? companion.combine(AbstractC5806u.m5287z(companion.getLineThrough(), companion.getUnderline())) : z8 ? companion.getLineThrough() : z9 ? companion.getUnderline() : companion.getNone();
    }

    private final TextGeometricTransform decodeTextGeometricTransform() {
        return new TextGeometricTransform(decodeFloat(), decodeFloat());
    }

    /* renamed from: decodeULong-s-VKNKU, reason: not valid java name */
    private final long m12449decodeULongsVKNKU() {
        return this.parcel.readLong();
    }

    /* renamed from: decodeColor-0d7_KjU, reason: not valid java name */
    public final long m12450decodeColor0d7_KjU() {
        return Color.m10678constructorimpl(m12449decodeULongsVKNKU());
    }

    /* renamed from: decodeFontStyle-_-LCdwA, reason: not valid java name */
    public final int m12451decodeFontStyle_LCdwA() {
        byte bDecodeByte = decodeByte();
        return bDecodeByte == 0 ? FontStyle.INSTANCE.m12888getNormal_LCdwA() : bDecodeByte == 1 ? FontStyle.INSTANCE.m12887getItalic_LCdwA() : FontStyle.INSTANCE.m12888getNormal_LCdwA();
    }

    /* renamed from: decodeFontSynthesis-GVVA2EU, reason: not valid java name */
    public final int m12452decodeFontSynthesisGVVA2EU() {
        byte bDecodeByte = decodeByte();
        return bDecodeByte == 0 ? FontSynthesis.INSTANCE.m12899getNoneGVVA2EU() : bDecodeByte == 1 ? FontSynthesis.INSTANCE.m12898getAllGVVA2EU() : bDecodeByte == 3 ? FontSynthesis.INSTANCE.m12900getStyleGVVA2EU() : bDecodeByte == 2 ? FontSynthesis.INSTANCE.m12901getWeightGVVA2EU() : FontSynthesis.INSTANCE.m12899getNoneGVVA2EU();
    }

    @NotNull
    public final FontWeight decodeFontWeight() {
        return new FontWeight(decodeInt());
    }

    @NotNull
    public final SpanStyle decodeSpanStyle() {
        MutableSpanStyle mutableSpanStyle = new MutableSpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 16383, null);
        while (this.parcel.dataAvail() > 1) {
            byte bDecodeByte = decodeByte();
            if (bDecodeByte != 1) {
                if (bDecodeByte != 2) {
                    if (bDecodeByte != 3) {
                        if (bDecodeByte != 4) {
                            if (bDecodeByte != 5) {
                                if (bDecodeByte != 6) {
                                    if (bDecodeByte != 7) {
                                        if (bDecodeByte != 8) {
                                            if (bDecodeByte != 9) {
                                                if (bDecodeByte != 10) {
                                                    if (bDecodeByte != 11) {
                                                        if (bDecodeByte == 12) {
                                                            if (dataAvailable() < 20) {
                                                                break;
                                                            }
                                                            mutableSpanStyle.setShadow(decodeShadow());
                                                        } else {
                                                            continue;
                                                        }
                                                    } else {
                                                        if (dataAvailable() < 4) {
                                                            break;
                                                        }
                                                        mutableSpanStyle.setTextDecoration(decodeTextDecoration());
                                                    }
                                                } else {
                                                    if (dataAvailable() < 8) {
                                                        break;
                                                    }
                                                    mutableSpanStyle.m12487setBackground8_81llA(m12450decodeColor0d7_KjU());
                                                }
                                            } else {
                                                if (dataAvailable() < 8) {
                                                    break;
                                                }
                                                mutableSpanStyle.setTextGeometricTransform(decodeTextGeometricTransform());
                                            }
                                        } else {
                                            if (dataAvailable() < 4) {
                                                break;
                                            }
                                            mutableSpanStyle.m12488setBaselineShift_isdbwI(BaselineShift.m13061boximpl(m12448decodeBaselineShifty9eOQZs()));
                                        }
                                    } else {
                                        if (dataAvailable() < 5) {
                                            break;
                                        }
                                        mutableSpanStyle.m12493setLetterSpacingR2X_6o(m12453decodeTextUnitXSAIIZE());
                                    }
                                } else {
                                    mutableSpanStyle.setFontFeatureSettings(decodeString());
                                }
                            } else {
                                if (dataAvailable() < 1) {
                                    break;
                                }
                                mutableSpanStyle.m12492setFontSynthesistDdu0R4(FontSynthesis.m12889boximpl(m12452decodeFontSynthesisGVVA2EU()));
                            }
                        } else {
                            if (dataAvailable() < 1) {
                                break;
                            }
                            mutableSpanStyle.m12491setFontStylemLjRB2g(FontStyle.m12878boximpl(m12451decodeFontStyle_LCdwA()));
                        }
                    } else {
                        if (dataAvailable() < 4) {
                            break;
                        }
                        mutableSpanStyle.setFontWeight(decodeFontWeight());
                    }
                } else {
                    if (dataAvailable() < 5) {
                        break;
                    }
                    mutableSpanStyle.m12490setFontSizeR2X_6o(m12453decodeTextUnitXSAIIZE());
                }
            } else {
                if (dataAvailable() < 8) {
                    break;
                }
                mutableSpanStyle.m12489setColor8_81llA(m12450decodeColor0d7_KjU());
            }
        }
        return mutableSpanStyle.toSpanStyle();
    }

    /* renamed from: decodeTextUnit-XSAIIZE, reason: not valid java name */
    public final long m12453decodeTextUnitXSAIIZE() {
        byte bDecodeByte = decodeByte();
        long jM13532getSpUIouoOA = bDecodeByte == 1 ? TextUnitType.INSTANCE.m13532getSpUIouoOA() : bDecodeByte == 2 ? TextUnitType.INSTANCE.m13531getEmUIouoOA() : TextUnitType.INSTANCE.m13533getUnspecifiedUIouoOA();
        return TextUnitType.m13527equalsimpl0(jM13532getSpUIouoOA, TextUnitType.INSTANCE.m13533getUnspecifiedUIouoOA()) ? TextUnit.INSTANCE.m13510getUnspecifiedXSAIIZE() : TextUnitKt.m13511TextUnitanM5pPY(decodeFloat(), jM13532getSpUIouoOA);
    }
}
