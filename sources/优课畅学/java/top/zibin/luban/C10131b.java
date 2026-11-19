package top.zibin.luban;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import ga.AbstractRunnableC8692c;
import ga.InterfaceC8690a;
import ga.InterfaceC8691b;
import ga.InterfaceC8693d;
import ga.InterfaceC8694e;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: top.zibin.luban.b */
/* loaded from: classes5.dex */
public class C10131b implements Handler.Callback {

    /* renamed from: a */
    public String f20223a;

    /* renamed from: b */
    public boolean f20224b;

    /* renamed from: c */
    public int f20225c;

    /* renamed from: d */
    public List f20226d;

    /* renamed from: e */
    public Handler f20227e;

    /* renamed from: top.zibin.luban.b$a */
    public static class a {

        /* renamed from: a */
        public Context f20228a;

        /* renamed from: b */
        public String f20229b;

        /* renamed from: c */
        public int f20230c = 100;

        /* renamed from: d */
        public List f20231d = new ArrayList();

        /* renamed from: top.zibin.luban.b$a$a, reason: collision with other inner class name */
        public class C10816a implements InterfaceC8691b {

            /* renamed from: a */
            public final /* synthetic */ File f20232a;

            public C10816a(File file) {
                this.f20232a = file;
            }

            @Override // ga.InterfaceC8691b
            public String getPath() {
                return this.f20232a.getAbsolutePath();
            }

            @Override // ga.InterfaceC8691b
            public InputStream open() {
                return new FileInputStream(this.f20232a);
            }
        }

        /* renamed from: top.zibin.luban.b$a$b */
        public class b implements InterfaceC8691b {

            /* renamed from: a */
            public final /* synthetic */ String f20234a;

            public b(String str) {
                this.f20234a = str;
            }

            @Override // ga.InterfaceC8691b
            public String getPath() {
                return this.f20234a;
            }

            @Override // ga.InterfaceC8691b
            public InputStream open() {
                return new FileInputStream(this.f20234a);
            }
        }

        public a(Context context) {
            this.f20228a = context;
        }

        /* renamed from: b */
        public static /* synthetic */ InterfaceC8694e m18938b(a aVar) {
            aVar.getClass();
            return null;
        }

        /* renamed from: d */
        public static /* synthetic */ InterfaceC8693d m18940d(a aVar) {
            aVar.getClass();
            return null;
        }

        /* renamed from: f */
        public static /* synthetic */ InterfaceC8690a m18942f(a aVar) {
            aVar.getClass();
            return null;
        }

        /* renamed from: g */
        public final C10131b m18943g() {
            return new C10131b(this, null);
        }

        /* renamed from: h */
        public List m18944h() {
            return m18943g().m18934c(this.f20228a);
        }

        /* renamed from: i */
        public a m18945i(int i10) {
            this.f20230c = i10;
            return this;
        }

        /* renamed from: j */
        public a m18946j(File file) {
            this.f20231d.add(new C10816a(file));
            return this;
        }

        /* renamed from: k */
        public a m18947k(String str) {
            this.f20231d.add(new b(str));
            return this;
        }
    }

    public /* synthetic */ C10131b(a aVar, AbstractRunnableC8692c abstractRunnableC8692c) {
        this(aVar);
    }

    /* renamed from: e */
    public static File m18931e(Context context, String str) {
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir == null) {
            if (Log.isLoggable("Luban", 6)) {
                Log.e("Luban", "default disk cache dir is null");
            }
            return null;
        }
        File file = new File(externalCacheDir, str);
        if (file.mkdirs() || (file.exists() && file.isDirectory())) {
            return file;
        }
        return null;
    }

    /* renamed from: g */
    public static a m18932g(Context context) {
        return new a(context);
    }

    /* renamed from: b */
    public final File m18933b(Context context, InterfaceC8691b interfaceC8691b) {
        Checker checker = Checker.SINGLE;
        return checker.m18924g(this.f20225c, interfaceC8691b.getPath()) ? new C10130a(interfaceC8691b, m18936f(context, checker.m18919a(interfaceC8691b)), this.f20224b).m18927a() : new File(interfaceC8691b.getPath());
    }

    /* renamed from: c */
    public final List m18934c(Context context) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f20226d.iterator();
        while (it.hasNext()) {
            arrayList.add(m18933b(context, (InterfaceC8691b) it.next()));
            it.remove();
        }
        return arrayList;
    }

    /* renamed from: d */
    public final File m18935d(Context context) {
        return m18931e(context, "luban_disk_cache");
    }

    /* renamed from: f */
    public final File m18936f(Context context, String str) {
        if (TextUtils.isEmpty(this.f20223a)) {
            this.f20223a = m18935d(context).getAbsolutePath();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f20223a);
        sb.append("/");
        sb.append(System.currentTimeMillis());
        sb.append((int) (Math.random() * 1000.0d));
        if (TextUtils.isEmpty(str)) {
            str = ".jpg";
        }
        sb.append(str);
        return new File(sb.toString());
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        return false;
    }

    public C10131b(a aVar) {
        this.f20223a = aVar.f20229b;
        a.m18938b(aVar);
        this.f20226d = aVar.f20231d;
        a.m18940d(aVar);
        this.f20225c = aVar.f20230c;
        a.m18942f(aVar);
        this.f20227e = new Handler(Looper.getMainLooper(), this);
    }
}
