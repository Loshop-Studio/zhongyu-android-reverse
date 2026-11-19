package com.alibaba.fastjson.parser.deserializer;

import com.alibaba.android.arouter.utils.Consts;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONPObject;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONLexerBase;
import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public class JSONPDeserializer implements ObjectDeserializer {
    public static final JSONPDeserializer instance = new JSONPDeserializer();

    /* JADX WARN: Type inference failed for: r1v1, types: [T, com.alibaba.fastjson.JSONPObject] */
    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj) throws NumberFormatException {
        int i10;
        JSONLexerBase jSONLexerBase = (JSONLexerBase) defaultJSONParser.getLexer();
        String strScanSymbolUnQuoted = jSONLexerBase.scanSymbolUnQuoted(defaultJSONParser.getSymbolTable());
        jSONLexerBase.nextToken();
        int i11 = jSONLexerBase.token();
        if (i11 == 25) {
            String strScanSymbolUnQuoted2 = jSONLexerBase.scanSymbolUnQuoted(defaultJSONParser.getSymbolTable());
            strScanSymbolUnQuoted = (strScanSymbolUnQuoted + Consts.DOT) + strScanSymbolUnQuoted2;
            jSONLexerBase.nextToken();
            i11 = jSONLexerBase.token();
        }
        ?? r12 = (T) new JSONPObject(strScanSymbolUnQuoted);
        if (i11 != 10) {
            throw new JSONException("illegal jsonp : " + jSONLexerBase.info());
        }
        jSONLexerBase.nextToken();
        while (true) {
            r12.addParameter(defaultJSONParser.parse());
            i10 = jSONLexerBase.token();
            if (i10 != 16) {
                break;
            }
            jSONLexerBase.nextToken();
        }
        if (i10 == 11) {
            jSONLexerBase.nextToken();
            if (jSONLexerBase.token() == 24) {
                jSONLexerBase.nextToken();
            }
            return r12;
        }
        throw new JSONException("illegal jsonp : " + jSONLexerBase.info());
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
        return 0;
    }
}
