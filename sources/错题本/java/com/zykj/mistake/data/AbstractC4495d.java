package com.zykj.mistake.data;

import kotlin.text.AbstractC5855p;

/* renamed from: com.zykj.mistake.data.d */
/* loaded from: classes3.dex */
public abstract class AbstractC4495d {
    /* renamed from: a */
    public static final String m3975a(String... strArr) {
        String str;
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                str = strArr[i];
                if (str != null && !AbstractC5855p.m5382P(str)) {
                    break;
                }
                i++;
            } else {
                str = null;
                break;
            }
        }
        return str == null ? "" : str;
    }

    /* renamed from: b */
    public static String m3976b(String str) {
        if (str == null) {
            return "";
        }
        if (AbstractC5855p.m5382P(str)) {
            str = null;
        }
        return str == null ? "" : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0136  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p137p4.C6383b m3977c(com.zykj.mistake.entity.resp.MistakeListResp.MistakeInfo r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.data.AbstractC4495d.m3977c(com.zykj.mistake.entity.resp.MistakeListResp$MistakeInfo, int, int):p4.b"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/data/d.smali:118
    }
}
