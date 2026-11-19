package com.alibaba.fastjson.parser.deserializer;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONLexer;
import java.lang.reflect.Type;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class EnumDeserializer implements ObjectDeserializer {
    protected final Class<?> enumClass;
    protected long[] enumNameHashCodes;
    protected final Enum[] enums;
    protected final Enum[] ordinalEnums;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EnumDeserializer(java.lang.Class<?> r22) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.deserializer.EnumDeserializer.<init>(java.lang.Class):void");
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj) {
        try {
            JSONLexer jSONLexer = defaultJSONParser.lexer;
            int i10 = jSONLexer.token();
            if (i10 == 2) {
                int iIntValue = jSONLexer.intValue();
                jSONLexer.nextToken(16);
                if (iIntValue >= 0) {
                    Object[] objArr = this.ordinalEnums;
                    if (iIntValue < objArr.length) {
                        return (T) objArr[iIntValue];
                    }
                }
                throw new JSONException("parse enum " + this.enumClass.getName() + " error, value : " + iIntValue);
            }
            if (i10 != 4) {
                if (i10 == 8) {
                    jSONLexer.nextToken(16);
                    return null;
                }
                throw new JSONException("parse enum " + this.enumClass.getName() + " error, value : " + defaultJSONParser.parse());
            }
            String strStringVal = jSONLexer.stringVal();
            jSONLexer.nextToken(16);
            if (strStringVal.length() == 0) {
                return null;
            }
            long j10 = -3750763034362895579L;
            long j11 = -3750763034362895579L;
            for (int i11 = 0; i11 < strStringVal.length(); i11++) {
                int iCharAt = strStringVal.charAt(i11);
                long j12 = j10 ^ iCharAt;
                if (iCharAt >= 65 && iCharAt <= 90) {
                    iCharAt += 32;
                }
                j10 = j12 * 1099511628211L;
                j11 = (j11 ^ iCharAt) * 1099511628211L;
            }
            T t10 = (T) getEnumByHashCode(j10);
            if (t10 == null && j11 != j10) {
                t10 = (T) getEnumByHashCode(j11);
            }
            if (t10 == null && jSONLexer.isEnabled(Feature.ErrorOnEnumNotMatch)) {
                throw new JSONException("not match enum value, " + this.enumClass.getName() + " : " + strStringVal);
            }
            return t10;
        } catch (JSONException e10) {
            throw e10;
        } catch (Exception e11) {
            throw new JSONException(e11.getMessage(), e11);
        }
    }

    public Enum getEnumByHashCode(long j10) {
        int iBinarySearch;
        if (this.enums != null && (iBinarySearch = Arrays.binarySearch(this.enumNameHashCodes, j10)) >= 0) {
            return this.enums[iBinarySearch];
        }
        return null;
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
        return 2;
    }

    public Enum<?> valueOf(int i10) {
        return this.ordinalEnums[i10];
    }
}
