package androidx.compose.foundation.internal;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.p014ui.geometry.Offset;
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
import androidx.compose.p014ui.unit.TextUnitKt;
import androidx.compose.p014ui.unit.TextUnitType;
import androidx.compose.runtime.internal.StabilityInferred;
import p309qc.C10781l;
import p325rc.AbstractC10978w;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
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
    private final float m27281decodeBaselineShifty9eOQZs() {
        return BaselineShift.m33258constructorimpl(decodeFloat());
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
        long jM27283decodeColor0d7_KjU = m27283decodeColor0d7_KjU();
        float fDecodeFloat = decodeFloat();
        float fDecodeFloat2 = decodeFloat();
        return new Shadow(jM27283decodeColor0d7_KjU, Offset.m30629constructorimpl((Float.floatToRawIntBits(fDecodeFloat2) & 4294967295L) | (Float.floatToRawIntBits(fDecodeFloat) << 32)), decodeFloat(), null);
    }

    private final String decodeString() {
        return this.parcel.readString();
    }

    private final TextDecoration decodeTextDecoration() {
        int iDecodeInt = decodeInt();
        TextDecoration.Companion companion = TextDecoration.Companion;
        boolean z10 = (companion.getLineThrough().getMask() & iDecodeInt) != 0;
        boolean z11 = (iDecodeInt & companion.getUnderline().getMask()) != 0;
        return (z10 && z11) ? companion.combine(AbstractC10978w.m24139q(companion.getLineThrough(), companion.getUnderline())) : z10 ? companion.getLineThrough() : z11 ? companion.getUnderline() : companion.getNone();
    }

    private final TextGeometricTransform decodeTextGeometricTransform() {
        return new TextGeometricTransform(decodeFloat(), decodeFloat());
    }

    /* renamed from: decodeULong-s-VKNKU, reason: not valid java name */
    private final long m27282decodeULongsVKNKU() {
        return C10781l.m23023b(this.parcel.readLong());
    }

    /* renamed from: decodeColor-0d7_KjU, reason: not valid java name */
    public final long m27283decodeColor0d7_KjU() {
        return Color.m30874constructorimpl(m27282decodeULongsVKNKU());
    }

    /* renamed from: decodeFontStyle-_-LCdwA, reason: not valid java name */
    public final int m27284decodeFontStyle_LCdwA() {
        byte bDecodeByte = decodeByte();
        return bDecodeByte == 0 ? FontStyle.Companion.m33084getNormal_LCdwA() : bDecodeByte == 1 ? FontStyle.Companion.m33083getItalic_LCdwA() : FontStyle.Companion.m33084getNormal_LCdwA();
    }

    /* renamed from: decodeFontSynthesis-GVVA2EU, reason: not valid java name */
    public final int m27285decodeFontSynthesisGVVA2EU() {
        byte bDecodeByte = decodeByte();
        return bDecodeByte == 0 ? FontSynthesis.Companion.m33095getNoneGVVA2EU() : bDecodeByte == 1 ? FontSynthesis.Companion.m33094getAllGVVA2EU() : bDecodeByte == 3 ? FontSynthesis.Companion.m33096getStyleGVVA2EU() : bDecodeByte == 2 ? FontSynthesis.Companion.m33097getWeightGVVA2EU() : FontSynthesis.Companion.m33095getNoneGVVA2EU();
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
                                                    mutableSpanStyle.m27300setBackground8_81llA(m27283decodeColor0d7_KjU());
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
                                            mutableSpanStyle.m27301setBaselineShift_isdbwI(BaselineShift.m33257boximpl(m27281decodeBaselineShifty9eOQZs()));
                                        }
                                    } else {
                                        if (dataAvailable() < 5) {
                                            break;
                                        }
                                        mutableSpanStyle.m27306setLetterSpacingR2X_6o(m27286decodeTextUnitXSAIIZE());
                                    }
                                } else {
                                    mutableSpanStyle.setFontFeatureSettings(decodeString());
                                }
                            } else {
                                if (dataAvailable() < 1) {
                                    break;
                                }
                                mutableSpanStyle.m27305setFontSynthesistDdu0R4(FontSynthesis.m33085boximpl(m27285decodeFontSynthesisGVVA2EU()));
                            }
                        } else {
                            if (dataAvailable() < 1) {
                                break;
                            }
                            mutableSpanStyle.m27304setFontStylemLjRB2g(FontStyle.m33074boximpl(m27284decodeFontStyle_LCdwA()));
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
                    mutableSpanStyle.m27303setFontSizeR2X_6o(m27286decodeTextUnitXSAIIZE());
                }
            } else {
                if (dataAvailable() < 8) {
                    break;
                }
                mutableSpanStyle.m27302setColor8_81llA(m27283decodeColor0d7_KjU());
            }
        }
        return mutableSpanStyle.toSpanStyle();
    }

    /* renamed from: decodeTextUnit-XSAIIZE, reason: not valid java name */
    public final long m27286decodeTextUnitXSAIIZE() {
        byte bDecodeByte = decodeByte();
        long jM33728getSpUIouoOA = bDecodeByte == 1 ? TextUnitType.Companion.m33728getSpUIouoOA() : bDecodeByte == 2 ? TextUnitType.Companion.m33727getEmUIouoOA() : TextUnitType.Companion.m33729getUnspecifiedUIouoOA();
        return TextUnitType.m33723equalsimpl0(jM33728getSpUIouoOA, TextUnitType.Companion.m33729getUnspecifiedUIouoOA()) ? TextUnit.Companion.m33706getUnspecifiedXSAIIZE() : TextUnitKt.m33707TextUnitanM5pPY(decodeFloat(), jM33728getSpUIouoOA);
    }
}
