package com.umeng.analytics.filter;

import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.umeng.analytics.filter.d */
/* loaded from: classes.dex */
public class C1841d {

    /* renamed from: b */
    private static final String f8199b = "Ă";

    /* renamed from: c */
    private MessageDigest f8201c;

    /* renamed from: e */
    private boolean f8203e;

    /* renamed from: a */
    private final String f8200a = "MD5";

    /* renamed from: d */
    private Set<Object> f8202d = new HashSet();

    public C1841d(boolean z3, String str) {
        this.f8203e = z3;
        try {
            this.f8201c = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e4) {
            e4.printStackTrace();
        }
        if (str != null) {
            int i4 = 0;
            if (!z3) {
                String[] strArrSplit = str.split(f8199b);
                int length = strArrSplit.length;
                while (i4 < length) {
                    this.f8202d.add(strArrSplit[i4]);
                    i4++;
                }
                return;
            }
            try {
                byte[] bArrDecode = Base64.decode(str.getBytes(), 0);
                while (i4 < bArrDecode.length / 4) {
                    int i5 = i4 * 4;
                    this.f8202d.add(Integer.valueOf(((bArrDecode[i5 + 0] & 255) << 24) + ((bArrDecode[i5 + 1] & 255) << 16) + ((bArrDecode[i5 + 2] & 255) << 8) + (bArrDecode[i5 + 3] & 255)));
                    i4++;
                }
            } catch (IllegalArgumentException e5) {
                e5.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    private Integer m6739c(String str) {
        try {
            this.f8201c.update(str.getBytes());
            byte[] bArrDigest = this.f8201c.digest();
            return Integer.valueOf(((bArrDigest[0] & 255) << 24) + ((bArrDigest[1] & 255) << 16) + ((bArrDigest[2] & 255) << 8) + (bArrDigest[3] & 255));
        } catch (Exception e4) {
            e4.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public boolean m6741a(String str) {
        return this.f8203e ? this.f8202d.contains(m6739c(str)) : this.f8202d.contains(str);
    }

    /* renamed from: b */
    public void m6742b(String str) {
        if (this.f8203e) {
            this.f8202d.add(m6739c(str));
        } else {
            this.f8202d.add(str);
        }
    }

    public String toString() {
        if (!this.f8203e) {
            StringBuilder sb = new StringBuilder();
            for (Object obj : this.f8202d) {
                if (sb.length() > 0) {
                    sb.append(f8199b);
                }
                sb.append(obj.toString());
            }
            return sb.toString();
        }
        byte[] bArr = new byte[this.f8202d.size() * 4];
        Iterator<Object> it = this.f8202d.iterator();
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
    public void m6740a() {
        StringBuilder sb = new StringBuilder();
        Iterator<Object> it = this.f8202d.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (sb.length() > 0) {
                sb.append(",");
            }
        }
        System.out.println(sb.toString());
    }
}
