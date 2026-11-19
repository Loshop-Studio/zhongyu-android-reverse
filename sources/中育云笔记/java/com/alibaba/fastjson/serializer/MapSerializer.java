package com.alibaba.fastjson.serializer;

import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public class MapSerializer extends SerializeFilterable implements ObjectSerializer {
    public static MapSerializer instance = new MapSerializer();
    private static final int NON_STRINGKEY_AS_STRING = SerializerFeature.m3381of(new SerializerFeature[]{SerializerFeature.BrowserCompatible, SerializerFeature.WriteNonStringKeyAsString, SerializerFeature.BrowserSecure});

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type, int i10) throws Throwable {
        write(jSONSerializer, obj, obj2, type, i10, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x014f A[Catch: all -> 0x0055, TryCatch #1 {all -> 0x0055, blocks: (B:28:0x0051, B:31:0x0058, B:33:0x0064, B:42:0x007f, B:44:0x0090, B:45:0x009b, B:47:0x00a1, B:49:0x00b3, B:52:0x00bb, B:55:0x00c0, B:57:0x00ca, B:59:0x00ce, B:62:0x00dd, B:65:0x00e7, B:67:0x00eb, B:70:0x00f3, B:73:0x00f8, B:75:0x0102, B:77:0x0106, B:80:0x0111, B:83:0x011b, B:85:0x011f, B:88:0x0127, B:91:0x012c, B:93:0x0136, B:95:0x013a, B:98:0x0145, B:101:0x014f, B:103:0x0153, B:106:0x015b, B:109:0x0160, B:111:0x016a, B:113:0x016e, B:116:0x017a, B:119:0x0185, B:121:0x0189, B:124:0x0191, B:127:0x0196, B:129:0x01a0, B:131:0x01a4, B:132:0x01ad, B:133:0x01b3, B:135:0x01b7, B:138:0x01bf, B:141:0x01c4, B:143:0x01ce, B:145:0x01d2, B:146:0x01db, B:164:0x0223, B:168:0x0235, B:170:0x023b, B:172:0x0240, B:173:0x0243, B:175:0x024b, B:176:0x024e, B:189:0x027d, B:191:0x0287, B:193:0x028d, B:194:0x0292, B:200:0x02a4, B:202:0x02af, B:178:0x0254, B:179:0x0257, B:181:0x025f, B:186:0x0273, B:187:0x0276, B:183:0x0267, B:185:0x026b, B:162:0x021c, B:39:0x0078), top: B:226:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0021 A[PHI: r0
      0x0021: PHI (r0v51 java.util.Map<java.lang.String, java.lang.Object>) = 
      (r0v2 java.util.Map<java.lang.String, java.lang.Object>)
      (r0v2 java.util.Map<java.lang.String, java.lang.Object>)
      (r0v2 java.util.Map<java.lang.String, java.lang.Object>)
      (r0v1 java.util.Map<java.lang.String, java.lang.Object>)
     binds: [B:16:0x002f, B:18:0x0033, B:223:0x0021, B:9:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:235:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a1 A[Catch: all -> 0x0055, TryCatch #1 {all -> 0x0055, blocks: (B:28:0x0051, B:31:0x0058, B:33:0x0064, B:42:0x007f, B:44:0x0090, B:45:0x009b, B:47:0x00a1, B:49:0x00b3, B:52:0x00bb, B:55:0x00c0, B:57:0x00ca, B:59:0x00ce, B:62:0x00dd, B:65:0x00e7, B:67:0x00eb, B:70:0x00f3, B:73:0x00f8, B:75:0x0102, B:77:0x0106, B:80:0x0111, B:83:0x011b, B:85:0x011f, B:88:0x0127, B:91:0x012c, B:93:0x0136, B:95:0x013a, B:98:0x0145, B:101:0x014f, B:103:0x0153, B:106:0x015b, B:109:0x0160, B:111:0x016a, B:113:0x016e, B:116:0x017a, B:119:0x0185, B:121:0x0189, B:124:0x0191, B:127:0x0196, B:129:0x01a0, B:131:0x01a4, B:132:0x01ad, B:133:0x01b3, B:135:0x01b7, B:138:0x01bf, B:141:0x01c4, B:143:0x01ce, B:145:0x01d2, B:146:0x01db, B:164:0x0223, B:168:0x0235, B:170:0x023b, B:172:0x0240, B:173:0x0243, B:175:0x024b, B:176:0x024e, B:189:0x027d, B:191:0x0287, B:193:0x028d, B:194:0x0292, B:200:0x02a4, B:202:0x02af, B:178:0x0254, B:179:0x0257, B:181:0x025f, B:186:0x0273, B:187:0x0276, B:183:0x0267, B:185:0x026b, B:162:0x021c, B:39:0x0078), top: B:226:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e7 A[Catch: all -> 0x0055, TryCatch #1 {all -> 0x0055, blocks: (B:28:0x0051, B:31:0x0058, B:33:0x0064, B:42:0x007f, B:44:0x0090, B:45:0x009b, B:47:0x00a1, B:49:0x00b3, B:52:0x00bb, B:55:0x00c0, B:57:0x00ca, B:59:0x00ce, B:62:0x00dd, B:65:0x00e7, B:67:0x00eb, B:70:0x00f3, B:73:0x00f8, B:75:0x0102, B:77:0x0106, B:80:0x0111, B:83:0x011b, B:85:0x011f, B:88:0x0127, B:91:0x012c, B:93:0x0136, B:95:0x013a, B:98:0x0145, B:101:0x014f, B:103:0x0153, B:106:0x015b, B:109:0x0160, B:111:0x016a, B:113:0x016e, B:116:0x017a, B:119:0x0185, B:121:0x0189, B:124:0x0191, B:127:0x0196, B:129:0x01a0, B:131:0x01a4, B:132:0x01ad, B:133:0x01b3, B:135:0x01b7, B:138:0x01bf, B:141:0x01c4, B:143:0x01ce, B:145:0x01d2, B:146:0x01db, B:164:0x0223, B:168:0x0235, B:170:0x023b, B:172:0x0240, B:173:0x0243, B:175:0x024b, B:176:0x024e, B:189:0x027d, B:191:0x0287, B:193:0x028d, B:194:0x0292, B:200:0x02a4, B:202:0x02af, B:178:0x0254, B:179:0x0257, B:181:0x025f, B:186:0x0273, B:187:0x0276, B:183:0x0267, B:185:0x026b, B:162:0x021c, B:39:0x0078), top: B:226:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011b A[Catch: all -> 0x0055, TryCatch #1 {all -> 0x0055, blocks: (B:28:0x0051, B:31:0x0058, B:33:0x0064, B:42:0x007f, B:44:0x0090, B:45:0x009b, B:47:0x00a1, B:49:0x00b3, B:52:0x00bb, B:55:0x00c0, B:57:0x00ca, B:59:0x00ce, B:62:0x00dd, B:65:0x00e7, B:67:0x00eb, B:70:0x00f3, B:73:0x00f8, B:75:0x0102, B:77:0x0106, B:80:0x0111, B:83:0x011b, B:85:0x011f, B:88:0x0127, B:91:0x012c, B:93:0x0136, B:95:0x013a, B:98:0x0145, B:101:0x014f, B:103:0x0153, B:106:0x015b, B:109:0x0160, B:111:0x016a, B:113:0x016e, B:116:0x017a, B:119:0x0185, B:121:0x0189, B:124:0x0191, B:127:0x0196, B:129:0x01a0, B:131:0x01a4, B:132:0x01ad, B:133:0x01b3, B:135:0x01b7, B:138:0x01bf, B:141:0x01c4, B:143:0x01ce, B:145:0x01d2, B:146:0x01db, B:164:0x0223, B:168:0x0235, B:170:0x023b, B:172:0x0240, B:173:0x0243, B:175:0x024b, B:176:0x024e, B:189:0x027d, B:191:0x0287, B:193:0x028d, B:194:0x0292, B:200:0x02a4, B:202:0x02af, B:178:0x0254, B:179:0x0257, B:181:0x025f, B:186:0x0273, B:187:0x0276, B:183:0x0267, B:185:0x026b, B:162:0x021c, B:39:0x0078), top: B:226:0x0051 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void write(com.alibaba.fastjson.serializer.JSONSerializer r19, java.lang.Object r20, java.lang.Object r21, java.lang.reflect.Type r22, int r23, boolean r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.serializer.MapSerializer.write(com.alibaba.fastjson.serializer.JSONSerializer, java.lang.Object, java.lang.Object, java.lang.reflect.Type, int, boolean):void");
    }
}
