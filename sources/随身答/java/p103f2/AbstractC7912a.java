package p103f2;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.framework.AbstractC6782a;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import p176m2.AbstractC8959h;
import p210p2.AbstractC9318a;
import p270v2.AbstractC9755c;
import p280w2.C9802b;
import p310z2.AbstractC9993d;
import p310z2.C9991b;
import p310z2.InterfaceC9990a;

/* renamed from: f2.a */
/* loaded from: classes4.dex */
public abstract class AbstractC7912a extends AbstractC7915d implements InterfaceC9990a {

    /* renamed from: a */
    public String f13326a;

    /* renamed from: b */
    public String f13327b;

    /* renamed from: c */
    public String f13328c;

    /* renamed from: d */
    public Context f13329d;

    /* renamed from: e */
    public String f13330e;

    /* renamed from: f */
    public C9991b f13331f = new C9991b();

    public AbstractC7912a(String str, String str2) {
        this.f13326a = str;
        this.f13327b = str;
        this.f13330e = str2;
    }

    @Override // p310z2.InterfaceC9990a
    /* renamed from: a */
    public boolean mo6244a(String str) {
        return false;
    }

    @Override // p290x2.InterfaceC9868c
    /* renamed from: b */
    public void mo12451b(String str, String str2) {
        if ("ekv_bl_ver".equals(str) && str2 == null) {
            AbstractC8959h.m14293c("MobclickRT", "--->>> disable black list for ekv.");
            this.f13331f.m17311b(new File(this.f13329d.getFilesDir(), this.f13326a), this, 2);
        }
        if ("ekv_wl_ver".equals(str) && str2 == null) {
            AbstractC8959h.m14293c("MobclickRT", "--->>> disable white list for ekv.");
            this.f13331f.m17311b(new File(this.f13329d.getFilesDir(), this.f13326a), this, 2);
        }
    }

    @Override // p310z2.InterfaceC9990a
    /* renamed from: c */
    public boolean mo6245c(String str, Object obj) {
        return false;
    }

    @Override // p290x2.InterfaceC9869d
    /* renamed from: d */
    public boolean mo12452d(String str, String str2) throws IOException {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return true;
        }
        AbstractC8959h.m14293c("MobclickRT", "--->>> onPreProcessImprintKey: key = " + str + "; len of value=" + str2.length());
        StringBuilder sb = new StringBuilder();
        sb.append("--->>> onPreProcessImprintKey: value = ");
        sb.append(str2);
        AbstractC8959h.m14293c("MobclickRT", sb.toString());
        this.f13328c = str2;
        mo12455h();
        File file = new File(this.f13329d.getFilesDir(), this.f13326a);
        if (!file.exists()) {
            try {
                try {
                    file.createNewFile();
                } catch (IOException e10) {
                    AbstractC9318a.m15200b(this.f13329d, e10);
                }
            } catch (IOException unused) {
                file.createNewFile();
            }
        }
        this.f13331f.m17311b(file, this, 0);
        mo12459l(false);
        return true;
    }

    @Override // p310z2.InterfaceC9990a
    /* renamed from: e */
    public boolean mo6246e(File file, int i9) {
        if (i9 == 0) {
            synchronized (this) {
                m12458k(this.f13329d, file);
            }
        } else if (i9 == 1) {
            synchronized (this) {
                try {
                    if (m12456i(this.f13329d, file)) {
                        AbstractC8959h.m14293c("MobclickRT", "--->>> find event list data file, load it.");
                    } else {
                        AbstractC8959h.m14293c("MobclickRT", "--->>> can't find event list file.");
                    }
                } finally {
                }
            }
        } else if (i9 == 2) {
            synchronized (this) {
                this.f13328c = null;
                m12453f(file);
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void m12453f(File file) {
        if (this.f13329d != null) {
            synchronized (this.f13331f) {
                try {
                    if (file.exists()) {
                        file.delete();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: g */
    public boolean m12454g() {
        synchronized (this) {
            try {
                return this.f13328c != null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: h */
    public abstract void mo12455h();

    /* renamed from: i */
    public final boolean m12456i(Context context, File file) {
        Throwable th;
        BufferedReader bufferedReader;
        if (file.exists() && TextUtils.isEmpty(this.f13328c)) {
            try {
                bufferedReader = new BufferedReader(new FileReader(file));
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                    }
                    String string = sb.toString();
                    if (!TextUtils.isEmpty(string)) {
                        String strM16393b = AbstractC9755c.m16393b(string);
                        String strM6274h = AbstractC6782a.m6274h(context, this.f13330e, "");
                        this.f13328c = string;
                        mo12455h();
                        AbstractC8959h.m14293c("MobclickRT", "--->>> loadEventListFromFile: mEventList = " + this.f13328c);
                        if (!AbstractC9993d.m17334s(context)) {
                            if (strM16393b.equalsIgnoreCase(strM6274h)) {
                                this.f13328c = string;
                                mo12455h();
                                bufferedReader.close();
                                return true;
                            }
                            bufferedReader.close();
                            return false;
                        }
                        if (!strM16393b.equalsIgnoreCase(strM6274h)) {
                            mo12459l(true);
                            try {
                                bufferedReader.close();
                                return false;
                            } catch (Throwable th2) {
                                AbstractC9318a.m15200b(context, th2);
                                return false;
                            }
                        }
                        this.f13328c = string;
                        mo12459l(false);
                        try {
                            bufferedReader.close();
                            return true;
                        } catch (Throwable th3) {
                            AbstractC9318a.m15200b(context, th3);
                            return true;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    try {
                        AbstractC9318a.m15200b(context, th);
                        return false;
                    } finally {
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable th5) {
                                AbstractC9318a.m15200b(context, th5);
                            }
                        }
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                bufferedReader = null;
            }
        }
        return false;
    }

    /* renamed from: j */
    public void m12457j(Context context) {
        if (this.f13329d == null) {
            this.f13329d = context.getApplicationContext();
        }
        File file = new File(this.f13329d.getFilesDir(), this.f13326a);
        if (!TextUtils.isEmpty(AbstractC6782a.m6274h(this.f13329d, this.f13330e, ""))) {
            if (file.exists()) {
                this.f13331f.m17311b(file, this, 1);
            } else {
                mo12459l(true);
            }
        }
        if (AbstractC9993d.m17334s(this.f13329d)) {
            C9802b.m16620u(this.f13329d).m16636w(this.f13327b, this);
            C9802b.m16620u(this.f13329d).m16635v(this.f13330e, this);
        }
    }

    /* renamed from: k */
    public final void m12458k(Context context, File file) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(this.f13328c.getBytes());
            fileOutputStream.close();
        } catch (Throwable th) {
            AbstractC9318a.m15200b(context, th);
        }
    }

    /* renamed from: l */
    public abstract void mo12459l(boolean z9);

    public String toString() {
        if (TextUtils.isEmpty(this.f13326a) || TextUtils.isEmpty(this.f13327b)) {
            return "Uninitialized EventList.";
        }
        StringBuilder sb = new StringBuilder("[");
        sb.append("EventListName:" + this.f13326a + ",");
        sb.append("listKey:" + this.f13327b + ",");
        if (TextUtils.isEmpty(this.f13328c)) {
            sb.append("listKeyValue:empty,");
        } else {
            sb.append("listKeyValue:" + this.f13328c + "]");
        }
        if (TextUtils.isEmpty(this.f13330e)) {
            sb.append("listKeyVer:empty]");
        } else {
            sb.append("listKeyVer:" + this.f13330e + "]");
        }
        return sb.toString();
    }
}
