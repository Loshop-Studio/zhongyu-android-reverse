package p280w2;

import android.content.Context;
import android.content.SharedPreferences;
import com.umeng.analytics.pro.C6754aj;
import com.umeng.analytics.pro.C6757b;
import com.umeng.commonsdk.framework.AbstractC6782a;
import java.io.File;
import java.security.NoSuchAlgorithmException;
import org.json.JSONObject;
import p210p2.AbstractC9318a;
import p270v2.AbstractC9753a;
import p270v2.AbstractC9755c;
import p270v2.AbstractC9760h;
import p290x2.AbstractC9866a;
import p310z2.AbstractC9993d;

/* renamed from: w2.a */
/* loaded from: classes4.dex */
public class C9801a {

    /* renamed from: e */
    public String f17435e;

    /* renamed from: j */
    public int f17440j;

    /* renamed from: k */
    public int f17441k;

    /* renamed from: l */
    public byte[] f17442l;

    /* renamed from: m */
    public byte[] f17443m;

    /* renamed from: a */
    public final byte[] f17431a = {0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: b */
    public final int f17432b = 1;

    /* renamed from: c */
    public final int f17433c = 0;

    /* renamed from: d */
    public String f17434d = "1.0";

    /* renamed from: f */
    public byte[] f17436f = null;

    /* renamed from: g */
    public byte[] f17437g = null;

    /* renamed from: h */
    public byte[] f17438h = null;

    /* renamed from: i */
    public int f17439i = 0;

    /* renamed from: n */
    public boolean f17444n = false;

    public C9801a(byte[] bArr, String str, byte[] bArr2) throws Exception {
        this.f17435e = null;
        this.f17440j = 0;
        this.f17441k = 0;
        this.f17442l = null;
        this.f17443m = null;
        if (bArr == null || bArr.length == 0) {
            throw new Exception("entity is null or empty");
        }
        this.f17435e = str;
        this.f17441k = bArr.length;
        this.f17442l = AbstractC9760h.m16444a(bArr);
        this.f17440j = (int) (System.currentTimeMillis() / 1000);
        this.f17443m = bArr2;
    }

    /* renamed from: c */
    public static C9801a m16604c(Context context, String str, byte[] bArr) {
        try {
            SharedPreferences sharedPreferencesM16841a = AbstractC9866a.m16841a(context);
            String string = sharedPreferencesM16841a.getString("signature", null);
            int i9 = sharedPreferencesM16841a.getInt("serial", 1);
            C9801a c9801a = new C9801a(bArr, str, "123456789098765432102:00:00:00:00:00".getBytes());
            c9801a.m16613j(true);
            c9801a.m16615l(string);
            c9801a.m16614k(i9);
            c9801a.m16612i();
            sharedPreferencesM16841a.edit().putInt("serial", i9 + 1).putString("signature", c9801a.m16611g()).commit();
            c9801a.m16607a(context);
            return c9801a;
        } catch (Exception e10) {
            AbstractC9318a.m15200b(context, e10);
            return null;
        }
    }

    /* renamed from: d */
    public static C9801a m16605d(Context context, String str, byte[] bArr) {
        try {
            SharedPreferences sharedPreferencesM16841a = AbstractC9866a.m16841a(context);
            String string = sharedPreferencesM16841a.getString("signature", null);
            int i9 = sharedPreferencesM16841a.getInt("serial", 1);
            C9801a c9801a = new C9801a(bArr, str, "123456789098765432102:00:00:00:00:00".getBytes());
            c9801a.m16615l(string);
            c9801a.m16614k(i9);
            c9801a.m16612i();
            sharedPreferencesM16841a.edit().putInt("serial", i9 + 1).putString("signature", c9801a.m16611g()).commit();
            c9801a.m16607a(context);
            return c9801a;
        } catch (Exception e10) {
            AbstractC9318a.m15200b(context, e10);
            return null;
        }
    }

    /* renamed from: h */
    public static String m16606h(Context context) {
        SharedPreferences sharedPreferencesM16841a = AbstractC9866a.m16841a(context);
        if (sharedPreferencesM16841a == null) {
            return null;
        }
        return sharedPreferencesM16841a.getString("signature", null);
    }

    /* renamed from: a */
    public void m16607a(Context context) {
        String str = this.f17435e;
        String strM6274h = AbstractC6782a.m6274h(context, "umid", null);
        String strM16345k = AbstractC9753a.m16345k(this.f17436f);
        byte[] bArr = new byte[16];
        System.arraycopy(this.f17436f, 2, bArr, 0, 16);
        String strM16345k2 = AbstractC9753a.m16345k(AbstractC9753a.m16342h(bArr));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appkey", str);
            if (strM6274h != null) {
                jSONObject.put("umid", strM6274h);
            }
            jSONObject.put("signature", strM16345k);
            jSONObject.put("checksum", strM16345k2);
            File file = new File(context.getFilesDir(), ".umeng");
            if (!file.exists()) {
                file.mkdir();
            }
            AbstractC9755c.m16400i(new File(file, "exchangeIdentity.json"), jSONObject.toString());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("appkey", str);
            jSONObject2.put("channel", AbstractC9993d.m17323h(context));
            if (strM6274h != null) {
                jSONObject2.put("umid", AbstractC9755c.m16394c(strM6274h));
            }
            AbstractC9755c.m16400i(new File(context.getFilesDir(), "exid.dat"), jSONObject2.toString());
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    /* renamed from: b */
    public final byte[] m16608b() {
        return AbstractC9753a.m16342h((AbstractC9753a.m16345k(this.f17436f) + this.f17439i + this.f17440j + this.f17441k + AbstractC9753a.m16345k(this.f17437g)).getBytes());
    }

    /* renamed from: e */
    public final byte[] m16609e(byte[] bArr, int i9) throws NoSuchAlgorithmException {
        byte[] bArrM16342h = AbstractC9753a.m16342h(this.f17443m);
        byte[] bArrM16342h2 = AbstractC9753a.m16342h(this.f17442l);
        int length = bArrM16342h.length;
        int i10 = length * 2;
        byte[] bArr2 = new byte[i10];
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = i11 * 2;
            bArr2[i12] = bArrM16342h2[i11];
            bArr2[i12 + 1] = bArrM16342h[i11];
        }
        for (int i13 = 0; i13 < 2; i13++) {
            bArr2[i13] = bArr[i13];
            bArr2[(i10 - i13) - 1] = bArr[(bArr.length - i13) - 1];
        }
        byte[] bArr3 = {(byte) (i9 & 255), (byte) ((i9 >> 8) & 255), (byte) ((i9 >> 16) & 255), (byte) (i9 >>> 24)};
        for (int i14 = 0; i14 < i10; i14++) {
            bArr2[i14] = (byte) (bArr2[i14] ^ bArr3[i14 % 4]);
        }
        return bArr2;
    }

    /* renamed from: f */
    public final byte[] m16610f() {
        return m16609e(this.f17431a, (int) (System.currentTimeMillis() / 1000));
    }

    /* renamed from: g */
    public String m16611g() {
        return AbstractC9753a.m16345k(this.f17436f);
    }

    /* renamed from: i */
    public void m16612i() {
        if (this.f17436f == null) {
            this.f17436f = m16610f();
        }
        if (this.f17444n) {
            byte[] bArr = new byte[16];
            try {
                System.arraycopy(this.f17436f, 1, bArr, 0, 16);
                this.f17442l = AbstractC9753a.m16340f(this.f17442l, bArr);
            } catch (Exception unused) {
            }
        }
        this.f17437g = m16609e(this.f17436f, this.f17440j);
        this.f17438h = m16608b();
    }

    /* renamed from: j */
    public void m16613j(boolean z9) {
        this.f17444n = z9;
    }

    /* renamed from: k */
    public void m16614k(int i9) {
        this.f17439i = i9;
    }

    /* renamed from: l */
    public void m16615l(String str) {
        this.f17436f = AbstractC9753a.m16344j(str);
    }

    /* renamed from: m */
    public byte[] m16616m() {
        C6754aj c6754aj = new C6754aj();
        c6754aj.m6031E(this.f17434d);
        c6754aj.m6036J(this.f17435e);
        c6754aj.m6039M(AbstractC9753a.m16345k(this.f17436f));
        c6754aj.m6030D(this.f17439i);
        c6754aj.m6035I(this.f17440j);
        c6754aj.m6038L(this.f17441k);
        c6754aj.m6033G(this.f17442l);
        c6754aj.m6041O(this.f17444n ? 1 : 0);
        c6754aj.m6042P(AbstractC9753a.m16345k(this.f17437g));
        c6754aj.m6044R(AbstractC9753a.m16345k(this.f17438h));
        try {
            return new C6757b().m6068a(c6754aj);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public String toString() {
        return String.format("version : %s\n", this.f17434d) + String.format("address : %s\n", this.f17435e) + String.format("signature : %s\n", AbstractC9753a.m16345k(this.f17436f)) + String.format("serial : %s\n", Integer.valueOf(this.f17439i)) + String.format("timestamp : %d\n", Integer.valueOf(this.f17440j)) + String.format("length : %d\n", Integer.valueOf(this.f17441k)) + String.format("guid : %s\n", AbstractC9753a.m16345k(this.f17437g)) + String.format("checksum : %s ", AbstractC9753a.m16345k(this.f17438h)) + String.format("codex : %d", Integer.valueOf(this.f17444n ? 1 : 0));
    }
}
