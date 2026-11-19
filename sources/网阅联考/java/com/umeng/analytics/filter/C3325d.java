package com.umeng.analytics.filter;

import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.UByte;

/* renamed from: com.umeng.analytics.filter.d */
/* loaded from: classes2.dex */
public class C3325d {

    /* renamed from: b */
    private static final String f1607b = "Ă";

    /* renamed from: c */
    private MessageDigest f1609c;

    /* renamed from: e */
    private boolean f1611e;

    /* renamed from: a */
    private final String f1608a = "MD5";

    /* renamed from: d */
    private Set<Object> f1610d = new HashSet();

    public C3325d(boolean z3, String str) {
        this.f1611e = z3;
        try {
            this.f1609c = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e4) {
            e4.printStackTrace();
        }
        if (str != null) {
            int i4 = 0;
            if (!z3) {
                String[] strArrSplit = str.split(f1607b);
                int length = strArrSplit.length;
                while (i4 < length) {
                    this.f1610d.add(strArrSplit[i4]);
                    i4++;
                }
                return;
            }
            try {
                byte[] bArrDecode = Base64.decode(str.getBytes(), 0);
                while (i4 < bArrDecode.length / 4) {
                    int i5 = i4 * 4;
                    this.f1610d.add(Integer.valueOf(((bArrDecode[i5 + 0] & UByte.MAX_VALUE) << 24) + ((bArrDecode[i5 + 1] & UByte.MAX_VALUE) << 16) + ((bArrDecode[i5 + 2] & UByte.MAX_VALUE) << 8) + (bArrDecode[i5 + 3] & UByte.MAX_VALUE)));
                    i4++;
                }
            } catch (IllegalArgumentException e5) {
                e5.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    private Integer m2816c(String str) {
        try {
            this.f1609c.update(str.getBytes());
            byte[] bArrDigest = this.f1609c.digest();
            return Integer.valueOf(((bArrDigest[0] & UByte.MAX_VALUE) << 24) + ((bArrDigest[1] & UByte.MAX_VALUE) << 16) + ((bArrDigest[2] & UByte.MAX_VALUE) << 8) + (bArrDigest[3] & UByte.MAX_VALUE));
        } catch (Exception e4) {
            e4.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public boolean m2818a(String str) {
        return this.f1611e ? this.f1610d.contains(m2816c(str)) : this.f1610d.contains(str);
    }

    /* renamed from: b */
    public void m2819b(String str) {
        if (this.f1611e) {
            this.f1610d.add(m2816c(str));
        } else {
            this.f1610d.add(str);
        }
    }

    public String toString() {
        if (!this.f1611e) {
            StringBuilder sb = new StringBuilder();
            for (Object obj : this.f1610d) {
                if (sb.length() > 0) {
                    sb.append(f1607b);
                }
                sb.append(obj.toString());
            }
            return sb.toString();
        }
        byte[] bArr = new byte[this.f1610d.size() * 4];
        Iterator<Object> it = this.f1610d.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            int i5 = i4 + 1;
            bArr[i4] = (byte) (((-16777216) & iIntValue) >> 24);
            int i6 = i5 + 1;
            bArr[i5] = (byte) ((16711680 & iIntValue) >> 16);
            int i7 = i6 + 1;
            bArr[i6] = (byte) ((65280 & iIntValue) >> 8);
            i4 = i7 + 1;
            bArr[i7] = (byte) (iIntValue & 255);
        }
        return new String(Base64.encode(bArr, 0));
    }

    /* renamed from: a */
    public void m2817a() {
        StringBuilder sb = new StringBuilder();
        Iterator<Object> it = this.f1610d.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (sb.length() > 0) {
                sb.append(",");
            }
        }
        System.out.println(sb.toString());
    }
}
