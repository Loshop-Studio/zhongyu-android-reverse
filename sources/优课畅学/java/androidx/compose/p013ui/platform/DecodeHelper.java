package androidx.compose.p013ui.platform;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.p013ui.geometry.Offset;
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
import androidx.compose.p013ui.unit.TextUnitKt;
import androidx.compose.p013ui.unit.TextUnitType;
import androidx.compose.runtime.internal.StabilityInferred;
import p123h7.C8731k;
import p134i7.AbstractC8809v;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class DecodeHelper {
    public static final int $stable = 8;
    private final Parcel parcel;

    public DecodeHelper(String str) {
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
    private final float m26042decodeBaselineShifty9eOQZs() {
        return BaselineShift.m26656constructorimpl(decodeFloat());
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
        long jM26044decodeColor0d7_KjU = m26044decodeColor0d7_KjU();
        float fDecodeFloat = decodeFloat();
        float fDecodeFloat2 = decodeFloat();
        return new Shadow(jM26044decodeColor0d7_KjU, Offset.m24027constructorimpl((Float.floatToRawIntBits(fDecodeFloat2) & 4294967295L) | (Float.floatToRawIntBits(fDecodeFloat) << 32)), decodeFloat(), null);
    }

    private final String decodeString() {
        return this.parcel.readString();
    }

    private final TextDecoration decodeTextDecoration() {
        int iDecodeInt = decodeInt();
        TextDecoration.Companion companion = TextDecoration.Companion;
        boolean z10 = (companion.getLineThrough().getMask() & iDecodeInt) != 0;
        boolean z11 = (iDecodeInt & companion.getUnderline().getMask()) != 0;
        return (z10 && z11) ? companion.combine(AbstractC8809v.m14774q(companion.getLineThrough(), companion.getUnderline())) : z10 ? companion.getLineThrough() : z11 ? companion.getUnderline() : companion.getNone();
    }

    private final TextGeometricTransform decodeTextGeometricTransform() {
        return new TextGeometricTransform(decodeFloat(), decodeFloat());
    }

    /* renamed from: decodeULong-s-VKNKU, reason: not valid java name */
    private final long m26043decodeULongsVKNKU() {
        return C8731k.m14278b(this.parcel.readLong());
    }

    /* renamed from: decodeColor-0d7_KjU, reason: not valid java name */
    public final long m26044decodeColor0d7_KjU() {
        return Color.m24272constructorimpl(m26043decodeULongsVKNKU());
    }

    /* renamed from: decodeFontStyle-_-LCdwA, reason: not valid java name */
    public final int m26045decodeFontStyle_LCdwA() {
        byte bDecodeByte = decodeByte();
        return bDecodeByte == 0 ? FontStyle.Companion.m26482getNormal_LCdwA() : bDecodeByte == 1 ? FontStyle.Companion.m26481getItalic_LCdwA() : FontStyle.Companion.m26482getNormal_LCdwA();
    }

    /* renamed from: decodeFontSynthesis-GVVA2EU, reason: not valid java name */
    public final int m26046decodeFontSynthesisGVVA2EU() {
        byte bDecodeByte = decodeByte();
        return bDecodeByte == 0 ? FontSynthesis.Companion.m26493getNoneGVVA2EU() : bDecodeByte == 1 ? FontSynthesis.Companion.m26492getAllGVVA2EU() : bDecodeByte == 3 ? FontSynthesis.Companion.m26494getStyleGVVA2EU() : bDecodeByte == 2 ? FontSynthesis.Companion.m26495getWeightGVVA2EU() : FontSynthesis.Companion.m26493getNoneGVVA2EU();
    }

    public final FontWeight decodeFontWeight() {
        return new FontWeight(decodeInt());
    }

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
                                                    mutableSpanStyle.m26081setBackground8_81llA(m26044decodeColor0d7_KjU());
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
                                            mutableSpanStyle.m26082setBaselineShift_isdbwI(BaselineShift.m26655boximpl(m26042decodeBaselineShifty9eOQZs()));
                                        }
                                    } else {
                                        if (dataAvailable() < 5) {
                                            break;
                                        }
                                        mutableSpanStyle.m26087setLetterSpacingR2X_6o(m26047decodeTextUnitXSAIIZE());
                                    }
                                } else {
                                    mutableSpanStyle.setFontFeatureSettings(decodeString());
                                }
                            } else {
                                if (dataAvailable() < 1) {
                                    break;
                                }
                                mutableSpanStyle.m26086setFontSynthesistDdu0R4(FontSynthesis.m26483boximpl(m26046decodeFontSynthesisGVVA2EU()));
                            }
                        } else {
                            if (dataAvailable() < 1) {
                                break;
                            }
                            mutableSpanStyle.m26085setFontStylemLjRB2g(FontStyle.m26472boximpl(m26045decodeFontStyle_LCdwA()));
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
                    mutableSpanStyle.m26084setFontSizeR2X_6o(m26047decodeTextUnitXSAIIZE());
                }
            } else {
                if (dataAvailable() < 8) {
                    break;
                }
                mutableSpanStyle.m26083setColor8_81llA(m26044decodeColor0d7_KjU());
            }
        }
        return mutableSpanStyle.toSpanStyle();
    }

    /* renamed from: decodeTextUnit-XSAIIZE, reason: not valid java name */
    public final long m26047decodeTextUnitXSAIIZE() {
        byte bDecodeByte = decodeByte();
        long jM27126getSpUIouoOA = bDecodeByte == 1 ? TextUnitType.Companion.m27126getSpUIouoOA() : bDecodeByte == 2 ? TextUnitType.Companion.m27125getEmUIouoOA() : TextUnitType.Companion.m27127getUnspecifiedUIouoOA();
        return TextUnitType.m27121equalsimpl0(jM27126getSpUIouoOA, TextUnitType.Companion.m27127getUnspecifiedUIouoOA()) ? TextUnit.Companion.m27104getUnspecifiedXSAIIZE() : TextUnitKt.m27105TextUnitanM5pPY(decodeFloat(), jM27126getSpUIouoOA);
    }
}
