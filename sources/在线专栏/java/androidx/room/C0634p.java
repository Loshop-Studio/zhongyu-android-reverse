package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.C0633o;
import androidx.room.InterfaceC0626k;
import androidx.room.InterfaceC0628l;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.room.p */
/* loaded from: classes.dex */
class C0634p {

    /* renamed from: a */
    final Context f4085a;

    /* renamed from: b */
    final String f4086b;

    /* renamed from: c */
    int f4087c;

    /* renamed from: d */
    final C0633o f4088d;

    /* renamed from: e */
    final C0633o.c f4089e;

    /* renamed from: f */
    InterfaceC0628l f4090f;

    /* renamed from: g */
    final Executor f4091g;

    /* renamed from: h */
    final InterfaceC0626k f4092h = new a();

    /* renamed from: i */
    final AtomicBoolean f4093i = new AtomicBoolean(false);

    /* renamed from: j */
    final ServiceConnection f4094j;

    /* renamed from: k */
    final Runnable f4095k;

    /* renamed from: l */
    final Runnable f4096l;

    /* renamed from: androidx.room.p$a */
    class a extends InterfaceC0626k.a {

        /* renamed from: androidx.room.p$a$a, reason: collision with other inner class name */
        class RunnableC3519a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String[] f4098a;

            RunnableC3519a(String[] strArr) {
                this.f4098a = strArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0634p.this.f4088d.m3621h(this.f4098a);
            }
        }

        a() {
        }

        @Override // androidx.room.InterfaceC0626k
        /* renamed from: i */
        public void mo3597i(String[] strArr) {
            C0634p.this.f4091g.execute(new RunnableC3519a(strArr));
        }
    }

    /* renamed from: androidx.room.p$b */
    class b implements ServiceConnection {
        b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C0634p.this.f4090f = InterfaceC0628l.a.m3604y(iBinder);
            C0634p c0634p = C0634p.this;
            c0634p.f4091g.execute(c0634p.f4095k);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            C0634p c0634p = C0634p.this;
            c0634p.f4091g.execute(c0634p.f4096l);
            C0634p.this.f4090f = null;
        }
    }

    /* renamed from: androidx.room.p$c */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C0634p c0634p = C0634p.this;
                InterfaceC0628l interfaceC0628l = c0634p.f4090f;
                if (interfaceC0628l != null) {
                    c0634p.f4087c = interfaceC0628l.mo3472l(c0634p.f4092h, c0634p.f4086b);
                    C0634p c0634p2 = C0634p.this;
                    c0634p2.f4088d.m3616a(c0634p2.f4089e);
                }
            } catch (RemoteException e4) {
                Log.w("ROOM", "Cannot register multi-instance invalidation callback", e4);
            }
        }
    }

    /* renamed from: androidx.room.p$d */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0634p c0634p = C0634p.this;
            c0634p.f4088d.m3624k(c0634p.f4089e);
        }
    }

    /* renamed from: androidx.room.p$e */
    class e extends C0633o.c {
        e(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.C0633o.c
        /* renamed from: a */
        boolean mo3635a() {
            return true;
        }

        @Override // androidx.room.C0633o.c
        /* renamed from: b */
        public void mo3596b(Set<String> set) {
            if (C0634p.this.f4093i.get()) {
                return;
            }
            try {
                C0634p c0634p = C0634p.this;
                InterfaceC0628l interfaceC0628l = c0634p.f4090f;
                if (interfaceC0628l != null) {
                    interfaceC0628l.mo3473s(c0634p.f4087c, (String[]) set.toArray(new String[0]));
                }
            } catch (RemoteException e4) {
                Log.w("ROOM", "Cannot broadcast invalidation", e4);
            }
        }
    }

    C0634p(Context context, String str, C0633o c0633o, Executor executor) {
        b bVar = new b();
        this.f4094j = bVar;
        this.f4095k = new c();
        this.f4096l = new d();
        Context applicationContext = context.getApplicationContext();
        this.f4085a = applicationContext;
        this.f4086b = str;
        this.f4088d = c0633o;
        this.f4091g = executor;
        this.f4089e = new e((String[]) c0633o.f4059a.keySet().toArray(new String[0]));
        applicationContext.bindService(new Intent(applicationContext, (Class<?>) MultiInstanceInvalidationService.class), bVar, 1);
    }
}
