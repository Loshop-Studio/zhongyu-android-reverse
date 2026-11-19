package p173y0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.multiprocess.RemoteWorkManagerClient;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p002a1.C0008b;
import p085f1.C2520r;
import p090g1.AbstractRunnableC2629a;
import p090g1.AbstractRunnableC2639k;
import p090g1.C2632d;
import p090g1.C2634f;
import p090g1.RunnableC2638j;
import p090g1.RunnableC2640l;
import p095h1.C2655b;
import p095h1.InterfaceC2654a;
import p100i1.AbstractC2665a;
import p103j.InterfaceC2685a;
import p169x0.AbstractC3445n;
import p169x0.AbstractC3454w;
import p169x0.AbstractC3456y;
import p169x0.C3433b;
import p169x0.C3450s;
import p169x0.C3453v;
import p169x0.C3455x;
import p169x0.InterfaceC3448q;
import p177z0.C3507b;

/* renamed from: y0.i */
/* loaded from: classes.dex */
public class C3494i extends AbstractC3454w {

    /* renamed from: k */
    private static final String f12191k = AbstractC3445n.m10503f("WorkManagerImpl");

    /* renamed from: l */
    private static C3494i f12192l = null;

    /* renamed from: m */
    private static C3494i f12193m = null;

    /* renamed from: n */
    private static final Object f12194n = new Object();

    /* renamed from: a */
    private Context f12195a;

    /* renamed from: b */
    private C3433b f12196b;

    /* renamed from: c */
    private WorkDatabase f12197c;

    /* renamed from: d */
    private InterfaceC2654a f12198d;

    /* renamed from: e */
    private List<InterfaceC3490e> f12199e;

    /* renamed from: f */
    private C3489d f12200f;

    /* renamed from: g */
    private C2634f f12201g;

    /* renamed from: h */
    private boolean f12202h;

    /* renamed from: i */
    private BroadcastReceiver.PendingResult f12203i;

    /* renamed from: j */
    private volatile AbstractC2665a f12204j;

    /* renamed from: y0.i$a */
    class a implements InterfaceC2685a<List<C2520r.c>, C3453v> {
        a() {
        }

        @Override // p103j.InterfaceC2685a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3453v apply(List<C2520r.c> list) {
            if (list == null || list.size() <= 0) {
                return null;
            }
            return list.get(0).m8452a();
        }
    }

    public C3494i(Context context, C3433b c3433b, InterfaceC2654a interfaceC2654a) {
        this(context, c3433b, interfaceC2654a, context.getResources().getBoolean(C3450s.f12084a));
    }

    /* renamed from: D */
    private void m10596D() {
        try {
            int i4 = RemoteWorkManagerClient.f4903g;
            this.f12204j = (AbstractC2665a) RemoteWorkManagerClient.class.getConstructor(Context.class, C3494i.class).newInstance(this.f12195a, this);
        } catch (Throwable th) {
            AbstractC3445n.m10501c().mo10504a(f12191k, "Unable to initialize multi-process support", th);
        }
    }

    /* renamed from: g */
    public static void m10597g(Context context, C3433b c3433b) {
        synchronized (f12194n) {
            C3494i c3494i = f12192l;
            if (c3494i != null && f12193m != null) {
                throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
            }
            if (c3494i == null) {
                Context applicationContext = context.getApplicationContext();
                if (f12193m == null) {
                    f12193m = new C3494i(applicationContext, c3433b, new C2655b(c3433b.m10458k()));
                }
                f12192l = f12193m;
            }
        }
    }

    @Deprecated
    /* renamed from: m */
    public static C3494i m10598m() {
        synchronized (f12194n) {
            C3494i c3494i = f12192l;
            if (c3494i != null) {
                return c3494i;
            }
            return f12193m;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n */
    public static C3494i m10599n(Context context) {
        C3494i c3494iM10598m;
        synchronized (f12194n) {
            c3494iM10598m = m10598m();
            if (c3494iM10598m == null) {
                Context applicationContext = context.getApplicationContext();
                if (!(applicationContext instanceof C3433b.b)) {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
                m10597g(applicationContext, ((C3433b.b) applicationContext).m10461a());
                c3494iM10598m = m10599n(applicationContext);
            }
        }
        return c3494iM10598m;
    }

    /* renamed from: v */
    private void m10600v(Context context, C3433b c3433b, InterfaceC2654a interfaceC2654a, WorkDatabase workDatabase, List<InterfaceC3490e> list, C3489d c3489d) {
        Context applicationContext = context.getApplicationContext();
        this.f12195a = applicationContext;
        this.f12196b = c3433b;
        this.f12198d = interfaceC2654a;
        this.f12197c = workDatabase;
        this.f12199e = list;
        this.f12200f = c3489d;
        this.f12201g = new C2634f(workDatabase);
        this.f12202h = false;
        if (Build.VERSION.SDK_INT >= 24 && applicationContext.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.f12198d.mo8914b(new ForceStopRunnable(applicationContext, this));
    }

    /* renamed from: A */
    public void m10601A(String str, WorkerParameters.C0809a c0809a) {
        this.f12198d.mo8914b(new RunnableC2638j(this, str, c0809a));
    }

    /* renamed from: B */
    public void m10602B(String str) {
        this.f12198d.mo8914b(new RunnableC2640l(this, str, true));
    }

    /* renamed from: C */
    public void m10603C(String str) {
        this.f12198d.mo8914b(new RunnableC2640l(this, str, false));
    }

    @Override // p169x0.AbstractC3454w
    /* renamed from: a */
    public InterfaceC3448q mo10527a() {
        AbstractRunnableC2629a abstractRunnableC2629aM8811b = AbstractRunnableC2629a.m8811b(this);
        this.f12198d.mo8914b(abstractRunnableC2629aM8811b);
        return abstractRunnableC2629aM8811b.m8817f();
    }

    @Override // p169x0.AbstractC3454w
    /* renamed from: b */
    public InterfaceC3448q mo10528b(UUID uuid) {
        AbstractRunnableC2629a abstractRunnableC2629aM8812c = AbstractRunnableC2629a.m8812c(uuid, this);
        this.f12198d.mo8914b(abstractRunnableC2629aM8812c);
        return abstractRunnableC2629aM8812c.m8817f();
    }

    @Override // p169x0.AbstractC3454w
    /* renamed from: c */
    public InterfaceC3448q mo10529c(List<? extends AbstractC3456y> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new C3492g(this, list).m10580a();
    }

    @Override // p169x0.AbstractC3454w
    /* renamed from: f */
    public LiveData<C3453v> mo10531f(UUID uuid) {
        return C2632d.m8833a(this.f12197c.mo4171M().mo8466n(Collections.singletonList(uuid.toString())), new a(), this.f12198d);
    }

    /* renamed from: h */
    public InterfaceC3448q m10604h(String str) {
        AbstractRunnableC2629a abstractRunnableC2629aM8814e = AbstractRunnableC2629a.m8814e(str, this);
        this.f12198d.mo8914b(abstractRunnableC2629aM8814e);
        return abstractRunnableC2629aM8814e.m8817f();
    }

    /* renamed from: i */
    public InterfaceC3448q m10605i(String str) {
        AbstractRunnableC2629a abstractRunnableC2629aM8813d = AbstractRunnableC2629a.m8813d(str, this, true);
        this.f12198d.mo8914b(abstractRunnableC2629aM8813d);
        return abstractRunnableC2629aM8813d.m8817f();
    }

    /* renamed from: j */
    public List<InterfaceC3490e> m10606j(Context context, C3433b c3433b, InterfaceC2654a interfaceC2654a) {
        return Arrays.asList(C3491f.m10575a(context, this), new C3507b(context, c3433b, interfaceC2654a, this));
    }

    /* renamed from: k */
    public Context m10607k() {
        return this.f12195a;
    }

    /* renamed from: l */
    public C3433b m10608l() {
        return this.f12196b;
    }

    /* renamed from: o */
    public C2634f m10609o() {
        return this.f12201g;
    }

    /* renamed from: p */
    public C3489d m10610p() {
        return this.f12200f;
    }

    /* renamed from: q */
    public AbstractC2665a m10611q() {
        if (this.f12204j == null) {
            synchronized (f12194n) {
                if (this.f12204j == null) {
                    m10596D();
                    if (this.f12204j == null && !TextUtils.isEmpty(this.f12196b.m10449b())) {
                        throw new IllegalStateException("Invalid multiprocess configuration. Define an `implementation` dependency on :work:work-multiprocess library");
                    }
                }
            }
        }
        return this.f12204j;
    }

    /* renamed from: r */
    public List<InterfaceC3490e> m10612r() {
        return this.f12199e;
    }

    /* renamed from: s */
    public WorkDatabase m10613s() {
        return this.f12197c;
    }

    /* renamed from: t */
    public ListenableFuture<List<C3453v>> m10614t(C3455x c3455x) {
        AbstractRunnableC2639k<List<C3453v>> abstractRunnableC2639kM8845a = AbstractRunnableC2639k.m8845a(this, c3455x);
        this.f12198d.mo8915c().execute(abstractRunnableC2639kM8845a);
        return abstractRunnableC2639kM8845a.m8846b();
    }

    /* renamed from: u */
    public InterfaceC2654a m10615u() {
        return this.f12198d;
    }

    /* renamed from: w */
    public void m10616w() {
        synchronized (f12194n) {
            this.f12202h = true;
            BroadcastReceiver.PendingResult pendingResult = this.f12203i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f12203i = null;
            }
        }
    }

    /* renamed from: x */
    public void m10617x() {
        if (Build.VERSION.SDK_INT >= 23) {
            C0008b.m50a(m10607k());
        }
        m10613s().mo4171M().mo8474v();
        C3491f.m10576b(m10608l(), m10613s(), m10612r());
    }

    /* renamed from: y */
    public void m10618y(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f12194n) {
            this.f12203i = pendingResult;
            if (this.f12202h) {
                pendingResult.finish();
                this.f12203i = null;
            }
        }
    }

    /* renamed from: z */
    public void m10619z(String str) {
        m10601A(str, null);
    }

    public C3494i(Context context, C3433b c3433b, InterfaceC2654a interfaceC2654a, boolean z3) {
        this(context, c3433b, interfaceC2654a, WorkDatabase.m4161C(context.getApplicationContext(), interfaceC2654a.mo8915c(), z3));
    }

    public C3494i(Context context, C3433b c3433b, InterfaceC2654a interfaceC2654a, WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        AbstractC3445n.m10502e(new AbstractC3445n.a(c3433b.m10456i()));
        List<InterfaceC3490e> listM10606j = m10606j(applicationContext, c3433b, interfaceC2654a);
        m10600v(context, c3433b, interfaceC2654a, workDatabase, listM10606j, new C3489d(context, c3433b, interfaceC2654a, workDatabase, listM10606j));
    }
}
