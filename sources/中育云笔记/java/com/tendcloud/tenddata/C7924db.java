package com.tendcloud.tenddata;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import java.io.OutputStream;
import java.net.HttpURLConnection;

/* renamed from: com.tendcloud.tenddata.db */
/* loaded from: classes5.dex */
public final class C7924db {

    /* renamed from: a */
    private final a f14678a;

    /* renamed from: b */
    private final byte[] f14679b;

    /* renamed from: com.tendcloud.tenddata.db$a */
    public enum a {
        UNIVERSAL_STREAM(OSSConstants.DEFAULT_OBJECT_CONTENT_TYPE),
        JSON("application/json"),
        FORM("application/x-www-form-urlencoded"),
        EMPTY("");

        private String name;

        a(String str) {
            this.name = str;
        }

        public String getName() {
            return this.name;
        }
    }

    public C7924db(a aVar, byte[] bArr) {
        this.f14678a = aVar;
        this.f14679b = bArr;
    }

    /* renamed from: a */
    public byte[] m11675a() {
        return this.f14679b;
    }

    /* renamed from: b */
    public a m11676b() {
        return this.f14678a;
    }

    /* renamed from: a */
    public void m11674a(HttpURLConnection httpURLConnection) {
        OutputStream outputStream;
        httpURLConnection.setFixedLengthStreamingMode(this.f14679b.length);
        httpURLConnection.setRequestProperty("Content-Type", this.f14678a.getName());
        try {
            try {
                outputStream = httpURLConnection.getOutputStream();
            } catch (Throwable unused) {
                return;
            }
        } catch (Throwable unused2) {
            outputStream = null;
        }
        try {
            outputStream.write(this.f14679b);
            outputStream.close();
        } catch (Throwable unused3) {
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
