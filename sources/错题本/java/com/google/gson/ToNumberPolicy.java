package com.google.gson;

import android.support.v4.media.AbstractC0037f;
import com.google.gson.internal.AbstractC3848e;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.math.BigDecimal;
import p104l1.C6046a;

/* loaded from: classes2.dex */
public enum ToNumberPolicy implements InterfaceC3867n {
    DOUBLE { // from class: com.google.gson.ToNumberPolicy.1
        @Override // com.google.gson.ToNumberPolicy, com.google.gson.InterfaceC3867n
        public Double readNumber(C6046a c6046a) throws IOException {
            return Double.valueOf(c6046a.m5755o());
        }
    },
    LAZILY_PARSED_NUMBER { // from class: com.google.gson.ToNumberPolicy.2
        @Override // com.google.gson.ToNumberPolicy, com.google.gson.InterfaceC3867n
        public Number readNumber(C6046a c6046a) throws IOException {
            return new LazilyParsedNumber(c6046a.m5762v());
        }
    },
    LONG_OR_DOUBLE { // from class: com.google.gson.ToNumberPolicy.3
        /* renamed from: a */
        public static Double m2778a(String str, C6046a c6046a) throws MalformedJsonException, NumberFormatException {
            try {
                Double dValueOf = Double.valueOf(str);
                if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                    if (c6046a.f9611b != Strictness.LENIENT) {
                        throw new MalformedJsonException("JSON forbids NaN and infinities: " + dValueOf + "; at path " + c6046a.m5750h(true));
                    }
                }
                return dValueOf;
            } catch (NumberFormatException e) {
                StringBuilder sbM100y = AbstractC0037f.m100y("Cannot parse ", str, "; at path ");
                sbM100y.append(c6046a.m5750h(true));
                throw new JsonParseException(sbM100y.toString(), e);
            }
        }

        @Override // com.google.gson.ToNumberPolicy, com.google.gson.InterfaceC3867n
        public Number readNumber(C6046a c6046a) throws JsonParseException, IOException {
            String strM5762v = c6046a.m5762v();
            if (strM5762v.indexOf(46) >= 0) {
                return m2778a(strM5762v, c6046a);
            }
            try {
                return Long.valueOf(Long.parseLong(strM5762v));
            } catch (NumberFormatException unused) {
                return m2778a(strM5762v, c6046a);
            }
        }
    },
    BIG_DECIMAL { // from class: com.google.gson.ToNumberPolicy.4
        @Override // com.google.gson.ToNumberPolicy, com.google.gson.InterfaceC3867n
        public BigDecimal readNumber(C6046a c6046a) throws IOException {
            String strM5762v = c6046a.m5762v();
            try {
                return AbstractC3848e.m2808i(strM5762v);
            } catch (NumberFormatException e) {
                StringBuilder sbM100y = AbstractC0037f.m100y("Cannot parse ", strM5762v, "; at path ");
                sbM100y.append(c6046a.m5750h(true));
                throw new JsonParseException(sbM100y.toString(), e);
            }
        }
    };

    ToNumberPolicy(C38311 c38311) {
    }

    @Override // com.google.gson.InterfaceC3867n
    public abstract /* synthetic */ Number readNumber(C6046a c6046a) throws IOException;
}
