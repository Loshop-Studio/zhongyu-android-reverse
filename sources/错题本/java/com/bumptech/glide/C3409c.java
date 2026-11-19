package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.collection.ArrayMap;
import com.bumptech.glide.load.engine.C3417c;
import io.reactivex.internal.operators.observable.C5712h;
import java.util.List;
import p024c0.C3210g;
import p032c8.C3238c;
import p147r0.C6446d;
import p163t0.C6581b;

/* renamed from: com.bumptech.glide.c */
/* loaded from: classes2.dex */
public final class C3409c extends ContextWrapper {

    /* renamed from: j */
    public static final C3407a f2207j;

    /* renamed from: a */
    public final C3210g f2208a;

    /* renamed from: b */
    public final C3410d f2209b;

    /* renamed from: c */
    public final C3238c f2210c;

    /* renamed from: d */
    public final C5712h f2211d;

    /* renamed from: e */
    public final List f2212e;

    /* renamed from: f */
    public final ArrayMap f2213f;

    /* renamed from: g */
    public final C3417c f2214g;

    /* renamed from: h */
    public final int f2215h;

    /* renamed from: i */
    public C6446d f2216i;

    static {
        C3407a c3407a = new C3407a();
        c3407a.f2195a = C6581b.f10988a;
        f2207j = c3407a;
    }

    public C3409c(Context context, C3210g c3210g, C3410d c3410d, C3238c c3238c, C5712h c5712h, ArrayMap arrayMap, List list, C3417c c3417c) {
        super(context.getApplicationContext());
        this.f2208a = c3210g;
        this.f2209b = c3410d;
        this.f2210c = c3238c;
        this.f2211d = c5712h;
        this.f2212e = list;
        this.f2213f = arrayMap;
        this.f2214g = c3417c;
        this.f2215h = 4;
    }
}
