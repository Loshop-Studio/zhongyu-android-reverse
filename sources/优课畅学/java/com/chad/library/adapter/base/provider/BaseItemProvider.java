package com.chad.library.adapter.base.provider;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC9078a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.InterfaceC8724d;
import p271v0.AbstractC10238a;
import p300x7.InterfaceC10559a;

/* loaded from: classes3.dex */
public abstract class BaseItemProvider {

    /* renamed from: a */
    public Context f3675a;

    /* renamed from: b */
    public WeakReference f3676b;

    /* renamed from: c */
    public final InterfaceC8724d f3677c;

    /* renamed from: d */
    public final InterfaceC8724d f3678d;

    public BaseItemProvider() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f17345c;
        this.f3677c = AbstractC9078a.m15923a(lazyThreadSafetyMode, new InterfaceC10559a() { // from class: com.chad.library.adapter.base.provider.BaseItemProvider$clickViewIds$2
            @Override // p300x7.InterfaceC10559a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ArrayList invoke() {
                return new ArrayList();
            }
        });
        this.f3678d = AbstractC9078a.m15923a(lazyThreadSafetyMode, new InterfaceC10559a() { // from class: com.chad.library.adapter.base.provider.BaseItemProvider$longClickViewIds$2
            @Override // p300x7.InterfaceC10559a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ArrayList invoke() {
                return new ArrayList();
            }
        });
    }

    /* renamed from: a */
    public abstract void mo3524a(BaseViewHolder baseViewHolder, Object obj);

    /* renamed from: b */
    public void m3525b(BaseViewHolder helper, Object obj, List payloads) {
        AbstractC9133u.m16133g(helper, "helper");
        AbstractC9133u.m16133g(payloads, "payloads");
    }

    /* renamed from: c */
    public BaseProviderMultiAdapter m3526c() {
        WeakReference weakReference = this.f3676b;
        if (weakReference != null) {
            return (BaseProviderMultiAdapter) weakReference.get();
        }
        return null;
    }

    /* renamed from: d */
    public final ArrayList m3527d() {
        return m3529f();
    }

    /* renamed from: e */
    public final ArrayList m3528e() {
        return m3532i();
    }

    /* renamed from: f */
    public final ArrayList m3529f() {
        return (ArrayList) this.f3677c.getValue();
    }

    /* renamed from: g */
    public abstract int mo3530g();

    /* renamed from: h */
    public abstract int mo3531h();

    /* renamed from: i */
    public final ArrayList m3532i() {
        return (ArrayList) this.f3678d.getValue();
    }

    /* renamed from: j */
    public void m3533j(BaseViewHolder helper, View view, Object obj, int i10) {
        AbstractC9133u.m16133g(helper, "helper");
        AbstractC9133u.m16133g(view, "view");
    }

    /* renamed from: k */
    public boolean m3534k(BaseViewHolder helper, View view, Object obj, int i10) {
        AbstractC9133u.m16133g(helper, "helper");
        AbstractC9133u.m16133g(view, "view");
        return false;
    }

    /* renamed from: l */
    public void m3535l(BaseViewHolder helper, View view, Object obj, int i10) {
        AbstractC9133u.m16133g(helper, "helper");
        AbstractC9133u.m16133g(view, "view");
    }

    /* renamed from: m */
    public BaseViewHolder m3536m(ViewGroup parent, int i10) {
        AbstractC9133u.m16133g(parent, "parent");
        return new BaseViewHolder(AbstractC10238a.m19152a(parent, mo3531h()));
    }

    /* renamed from: n */
    public boolean m3537n(BaseViewHolder helper, View view, Object obj, int i10) {
        AbstractC9133u.m16133g(helper, "helper");
        AbstractC9133u.m16133g(view, "view");
        return false;
    }

    /* renamed from: o */
    public void m3538o(BaseViewHolder holder) {
        AbstractC9133u.m16133g(holder, "holder");
    }

    /* renamed from: p */
    public void m3539p(BaseViewHolder holder) {
        AbstractC9133u.m16133g(holder, "holder");
    }

    /* renamed from: q */
    public abstract void mo3540q(BaseViewHolder baseViewHolder, int i10);

    /* renamed from: r */
    public final void m3541r(BaseProviderMultiAdapter adapter) {
        AbstractC9133u.m16133g(adapter, "adapter");
        this.f3676b = new WeakReference(adapter);
    }

    /* renamed from: s */
    public final void m3542s(Context context) {
        AbstractC9133u.m16133g(context, "<set-?>");
        this.f3675a = context;
    }
}
