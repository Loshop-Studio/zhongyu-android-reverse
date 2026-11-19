package com.tencent.liteav.txcvodplayer.p054a;

import com.tencent.ijk.media.player.IjkMediaMeta;

/* renamed from: com.tencent.liteav.txcvodplayer.a.a */
/* loaded from: classes4.dex */
public class C6705a {

    /* renamed from: a */
    String f6298a;

    /* renamed from: b */
    String f6299b;

    /* renamed from: c */
    String f6300c;

    public C6705a(String str, String str2, String str3) {
        this.f6298a = str2;
        this.f6299b = str;
        this.f6300c = str3;
    }

    /* renamed from: a */
    public String m5619a() {
        if ("mp4".equals(this.f6300c)) {
            return m5621c();
        }
        return null;
    }

    /* renamed from: b */
    public String m5620b() {
        if (IjkMediaMeta.IJKM_KEY_M3U8.equals(this.f6300c)) {
            return m5621c();
        }
        return null;
    }

    /* renamed from: c */
    public String m5621c() {
        return this.f6298a + "/" + this.f6299b;
    }

    /* renamed from: d */
    public String m5622d() {
        return this.f6299b;
    }
}
