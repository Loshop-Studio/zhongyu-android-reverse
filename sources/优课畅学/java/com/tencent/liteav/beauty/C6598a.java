package com.tencent.liteav.beauty;

import com.tencent.liteav.basic.module.C6584a;
import java.util.HashMap;

/* renamed from: com.tencent.liteav.beauty.a */
/* loaded from: classes4.dex */
public class C6598a extends C6584a {

    /* renamed from: a */
    private a f5539a;

    /* renamed from: com.tencent.liteav.beauty.a$a */
    public static class a {

        /* renamed from: a */
        private HashMap<String, String> f5540a;

        /* renamed from: a */
        public String m5069a() {
            String str = "";
            for (String str2 : this.f5540a.keySet()) {
                str = str + str2 + ":" + this.f5540a.get(str2) + " ";
            }
            return "{" + str + "}";
        }
    }

    @Override // com.tencent.liteav.basic.module.C6584a
    public void setID(String str) {
        super.setID(str);
        setStatusValue(3001, this.f5539a.m5069a());
    }
}
