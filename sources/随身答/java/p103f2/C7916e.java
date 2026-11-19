package p103f2;

import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.UByte;

/* renamed from: f2.e */
/* loaded from: classes4.dex */
public class C7916e {

    /* renamed from: b */
    public MessageDigest f13337b;

    /* renamed from: d */
    public boolean f13339d;

    /* renamed from: a */
    public final String f13336a = "MD5";

    /* renamed from: c */
    public Set f13338c = new HashSet();

    public C7916e(boolean z9, String str) {
        this.f13339d = z9;
        try {
            this.f13337b = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e10) {
            e10.printStackTrace();
        }
        if (str != null) {
            int i9 = 0;
            if (!z9) {
                String[] strArrSplit = str.split("Ă");
                int length = strArrSplit.length;
                while (i9 < length) {
                    this.f13338c.add(strArrSplit[i9]);
                    i9++;
                }
                return;
            }
            try {
                byte[] bArrDecode = Base64.decode(str.getBytes(), 0);
                while (i9 < bArrDecode.length / 4) {
                    int i10 = i9 * 4;
                    this.f13338c.add(Integer.valueOf(((bArrDecode[i10] & UByte.MAX_VALUE) << 24) + ((bArrDecode[i10 + 1] & UByte.MAX_VALUE) << 16) + ((bArrDecode[i10 + 2] & UByte.MAX_VALUE) << 8) + (bArrDecode[i10 + 3] & UByte.MAX_VALUE)));
                    i9++;
                }
            } catch (IllegalArgumentException e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public boolean m12462a(String str) {
        return this.f13339d ? this.f13338c.contains(m12463b(str)) : this.f13338c.contains(str);
    }

    /* renamed from: b */
    public final Integer m12463b(String str) {
        try {
            this.f13337b.update(str.getBytes());
            byte[] bArrDigest = this.f13337b.digest();
            return Integer.valueOf(((bArrDigest[0] & UByte.MAX_VALUE) << 24) + ((bArrDigest[1] & UByte.MAX_VALUE) << 16) + ((bArrDigest[2] & UByte.MAX_VALUE) << 8) + (bArrDigest[3] & UByte.MAX_VALUE));
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public String toString() {
        if (!this.f13339d) {
            StringBuilder sb = new StringBuilder();
            for (Object obj : this.f13338c) {
                if (sb.length() > 0) {
                    sb.append("Ă");
                }
                sb.append(obj.toString());
            }
            return sb.toString();
        }
        byte[] bArr = new byte[this.f13338c.size() * 4];
        Iterator it = this.f13338c.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            bArr[i9] = (byte) (((-16777216) & iIntValue) >> 24);
            bArr[i9 + 1] = (byte) ((16711680 & iIntValue) >> 16);
            int i10 = i9 + 3;
            bArr[i9 + 2] = (byte) ((65280 & iIntValue) >> 8);
            i9 += 4;
            bArr[i10] = (byte) (iIntValue & 255);
        }
        return new String(Base64.encode(bArr, 0));
    }
}
