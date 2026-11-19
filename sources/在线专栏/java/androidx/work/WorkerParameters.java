package androidx.work;

import android.net.Network;
import android.net.Uri;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import p095h1.InterfaceC2654a;
import p169x0.AbstractC3457z;
import p169x0.InterfaceC3441j;
import p169x0.InterfaceC3449r;

/* loaded from: classes.dex */
public final class WorkerParameters {

    /* renamed from: a */
    private UUID f4739a;

    /* renamed from: b */
    private C0810a f4740b;

    /* renamed from: c */
    private Set<String> f4741c;

    /* renamed from: d */
    private C0809a f4742d;

    /* renamed from: e */
    private int f4743e;

    /* renamed from: f */
    private Executor f4744f;

    /* renamed from: g */
    private InterfaceC2654a f4745g;

    /* renamed from: h */
    private AbstractC3457z f4746h;

    /* renamed from: i */
    private InterfaceC3449r f4747i;

    /* renamed from: j */
    private InterfaceC3441j f4748j;

    /* renamed from: androidx.work.WorkerParameters$a */
    public static class C0809a {

        /* renamed from: a */
        public List<String> f4749a = Collections.emptyList();

        /* renamed from: b */
        public List<Uri> f4750b = Collections.emptyList();

        /* renamed from: c */
        public Network f4751c;
    }

    public WorkerParameters(UUID uuid, C0810a c0810a, Collection<String> collection, C0809a c0809a, int i4, Executor executor, InterfaceC2654a interfaceC2654a, AbstractC3457z abstractC3457z, InterfaceC3449r interfaceC3449r, InterfaceC3441j interfaceC3441j) {
        this.f4739a = uuid;
        this.f4740b = c0810a;
        this.f4741c = new HashSet(collection);
        this.f4742d = c0809a;
        this.f4743e = i4;
        this.f4744f = executor;
        this.f4745g = interfaceC2654a;
        this.f4746h = abstractC3457z;
        this.f4747i = interfaceC3449r;
        this.f4748j = interfaceC3441j;
    }

    /* renamed from: a */
    public Executor m4130a() {
        return this.f4744f;
    }

    /* renamed from: b */
    public InterfaceC3441j m4131b() {
        return this.f4748j;
    }

    /* renamed from: c */
    public UUID m4132c() {
        return this.f4739a;
    }

    /* renamed from: d */
    public C0810a m4133d() {
        return this.f4740b;
    }

    /* renamed from: e */
    public Network m4134e() {
        return this.f4742d.f4751c;
    }

    /* renamed from: f */
    public InterfaceC3449r m4135f() {
        return this.f4747i;
    }

    /* renamed from: g */
    public int m4136g() {
        return this.f4743e;
    }

    /* renamed from: h */
    public Set<String> m4137h() {
        return this.f4741c;
    }

    /* renamed from: i */
    public InterfaceC2654a m4138i() {
        return this.f4745g;
    }

    /* renamed from: j */
    public List<String> m4139j() {
        return this.f4742d.f4749a;
    }

    /* renamed from: k */
    public List<Uri> m4140k() {
        return this.f4742d.f4750b;
    }

    /* renamed from: l */
    public AbstractC3457z m4141l() {
        return this.f4746h;
    }
}
