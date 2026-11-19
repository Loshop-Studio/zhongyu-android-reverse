package com.umeng.analytics.process;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p176m2.AbstractC8959h;
import p310z2.C9991b;
import p310z2.InterfaceC9990a;

/* renamed from: com.umeng.analytics.process.a */
/* loaded from: classes4.dex */
public abstract class AbstractC6778a {

    /* renamed from: a */
    public static ExecutorService f6723a = Executors.newSingleThreadExecutor();

    /* renamed from: b */
    public static C9991b f6724b = new C9991b();

    /* renamed from: com.umeng.analytics.process.a$a */
    public static class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ File f6725a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC9990a f6726b;

        /* renamed from: c */
        public final /* synthetic */ b f6727c;

        public a(File file, InterfaceC9990a interfaceC9990a, b bVar) {
            this.f6725a = file;
            this.f6726b = interfaceC9990a;
            this.f6727c = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                for (File file : this.f6725a.listFiles()) {
                    if (file.getName().endsWith(".db")) {
                        AbstractC6778a.f6724b.m17310a(file, this.f6726b);
                        AbstractC8959h.m14293c("MobclickRT", "--->>> file: " + file.getName());
                    }
                }
                b bVar = this.f6727c;
                if (bVar != null) {
                    bVar.mo6243a();
                }
            } catch (Throwable unused) {
            }
            AbstractC8959h.m14293c("MobclickRT", "--->>> end *** ");
        }
    }

    /* renamed from: com.umeng.analytics.process.a$b */
    public interface b {
        /* renamed from: a */
        void mo6243a();
    }

    /* renamed from: b */
    public static void m6248b(String str, InterfaceC9990a interfaceC9990a, b bVar) {
        File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            f6723a.execute(new a(file, interfaceC9990a, bVar));
        }
    }
}
