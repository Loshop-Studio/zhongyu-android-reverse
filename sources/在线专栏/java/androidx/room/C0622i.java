package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.room.AbstractC0621h0;
import java.io.File;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p149s0.InterfaceC3372c;

/* renamed from: androidx.room.i */
/* loaded from: classes.dex */
public class C0622i {

    /* renamed from: a */
    public final InterfaceC3372c.c f3997a;

    /* renamed from: b */
    public final Context f3998b;

    /* renamed from: c */
    public final String f3999c;

    /* renamed from: d */
    public final AbstractC0621h0.d f4000d;

    /* renamed from: e */
    public final List<AbstractC0621h0.b> f4001e;

    /* renamed from: f */
    public final List<Object> f4002f;

    /* renamed from: g */
    public final boolean f4003g;

    /* renamed from: h */
    public final AbstractC0621h0.c f4004h;

    /* renamed from: i */
    public final Executor f4005i;

    /* renamed from: j */
    public final Executor f4006j;

    /* renamed from: k */
    public final boolean f4007k;

    /* renamed from: l */
    public final boolean f4008l;

    /* renamed from: m */
    public final boolean f4009m;

    /* renamed from: n */
    private final Set<Integer> f4010n;

    /* renamed from: o */
    public final String f4011o;

    /* renamed from: p */
    public final File f4012p;

    /* renamed from: q */
    public final Callable<InputStream> f4013q;

    @SuppressLint({"LambdaLast"})
    public C0622i(Context context, String str, InterfaceC3372c.c cVar, AbstractC0621h0.d dVar, List<AbstractC0621h0.b> list, boolean z3, AbstractC0621h0.c cVar2, Executor executor, Executor executor2, boolean z4, boolean z5, boolean z6, Set<Integer> set, String str2, File file, Callable<InputStream> callable, AbstractC0621h0.e eVar, List<Object> list2) {
        this.f3997a = cVar;
        this.f3998b = context;
        this.f3999c = str;
        this.f4000d = dVar;
        this.f4001e = list;
        this.f4003g = z3;
        this.f4004h = cVar2;
        this.f4005i = executor;
        this.f4006j = executor2;
        this.f4007k = z4;
        this.f4008l = z5;
        this.f4009m = z6;
        this.f4010n = set;
        this.f4011o = str2;
        this.f4012p = file;
        this.f4013q = callable;
        this.f4002f = list2 == null ? Collections.emptyList() : list2;
    }

    /* renamed from: a */
    public boolean m3576a(int i4, int i5) {
        Set<Integer> set;
        return !((i4 > i5) && this.f4009m) && this.f4008l && ((set = this.f4010n) == null || !set.contains(Integer.valueOf(i4)));
    }
}
