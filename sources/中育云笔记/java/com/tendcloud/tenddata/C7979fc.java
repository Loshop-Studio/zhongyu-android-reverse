package com.tendcloud.tenddata;

import android.os.Process;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.Properties;
import java.util.zip.CRC32;

/* renamed from: com.tendcloud.tenddata.fc */
/* loaded from: classes5.dex */
public class C7979fc extends Properties implements Comparable<C7979fc> {

    /* renamed from: a */
    private String f14922a;

    /* renamed from: b */
    private byte[] f14923b;

    /* renamed from: c */
    private int f14924c;

    /* renamed from: d */
    private int f14925d;

    /* renamed from: e */
    private CRC32 f14926e;

    /* renamed from: com.tendcloud.tenddata.fc$a */
    public static final class a {
        public static final String DATA = "data";
        public static final String LENGTH = "length";
        public static final String RCS32 = "rcs32";
    }

    public C7979fc(String str) {
        this.f14922a = str;
    }

    /* renamed from: a */
    public static String m11948a() {
        return System.currentTimeMillis() + BundleUtil.UNDERLINE_TAG + Long.toString(Process.myPid());
    }

    /* renamed from: b */
    public String m11954b() {
        return this.f14922a;
    }

    /* renamed from: c */
    public byte[] m11956c() {
        return this.f14923b;
    }

    /* renamed from: d */
    public int m11958d() {
        return this.f14924c;
    }

    /* renamed from: e */
    public int m11959e() {
        return this.f14925d;
    }

    public final void writeData(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        if (this.f14926e == null) {
            this.f14926e = new CRC32();
        }
        byte[] bArr2 = new byte[bArr.length];
        this.f14923b = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        this.f14925d = this.f14923b.length;
        this.f14926e.reset();
        this.f14926e.update(this.f14923b);
        this.f14924c = (int) this.f14926e.getValue();
    }

    /* renamed from: a */
    public int m11951a(String str, int i10) {
        String str2 = (String) setProperty(str, String.valueOf(i10));
        if (str2 == null) {
            return 0;
        }
        return Integer.parseInt(str2);
    }

    /* renamed from: b */
    public byte[] m11955b(String str) {
        return m11957c(super.getProperty(str));
    }

    /* renamed from: c */
    public byte[] m11957c(String str) {
        if (str != null) {
            return str.getBytes();
        }
        return null;
    }

    public C7979fc(byte[] bArr) {
        this(m11948a(), bArr);
    }

    private C7979fc(String str, byte[] bArr) {
        this(str);
        this.f14926e = new CRC32();
        writeData(bArr);
    }

    /* renamed from: a */
    public byte[] m11953a(String str, byte[] bArr) {
        String str2 = (String) setProperty(str, m11952a(bArr));
        if (str2 == null) {
            return null;
        }
        return m11957c(str2);
    }

    /* renamed from: a */
    public int m11950a(String str) {
        return Integer.parseInt(super.getProperty(str));
    }

    /* renamed from: a */
    public String m11952a(byte[] bArr) {
        return new String(bArr);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C7979fc c7979fc) {
        return m11954b().compareTo(c7979fc.m11954b());
    }
}
