package com.chad.library.adapter.base.provider;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC9923a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.InterfaceC10773d;
import p314r1.AbstractC10834a;

/* loaded from: classes3.dex */
public abstract class BaseItemProvider {

    /* renamed from: a */
    public Context f5439a;

    /* renamed from: b */
    public WeakReference f5440b;

    /* renamed from: c */
    public final InterfaceC10773d f5441c;

    /* renamed from: d */
    public final InterfaceC10773d f5442d;

    public BaseItemProvider() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f23258e;
        this.f5441c = AbstractC9923a.m20069b(lazyThreadSafetyMode, new InterfaceC9529a() { // from class: com.chad.library.adapter.base.provider.BaseItemProvider$clickViewIds$2
            @Override // p181hd.InterfaceC9529a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ArrayList invoke() {
                return new ArrayList();
            }
        });
        this.f5442d = AbstractC9923a.m20069b(lazyThreadSafetyMode, new InterfaceC9529a() { // from class: com.chad.library.adapter.base.provider.BaseItemProvider$longClickViewIds$2
            @Override // p181hd.InterfaceC9529a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ArrayList invoke() {
                return new ArrayList();
            }
        });
    }

    /* renamed from: a */
    public abstract void mo4702a(BaseViewHolder baseViewHolder, Object obj);

    /* renamed from: b */
    public abstract void mo4703b(BaseViewHolder baseViewHolder, Object obj, List list);

    /* renamed from: c */
    public final ArrayList m4704c() {
        return m4706e();
    }

    /* renamed from: d */
    public final ArrayList m4705d() {
        return m4710i();
    }

    /* renamed from: e */
    public final ArrayList m4706e() {
        return (ArrayList) this.f5441c.getValue();
    }

    /* renamed from: f */
    public final Context m4707f() {
        Context context = this.f5439a;
        if (context != null) {
            return context;
        }
        AbstractC9979u.m20312y("context");
        return null;
    }

    /* renamed from: g */
    public abstract int mo4708g();

    /* renamed from: h */
    public abstract int mo4709h();

    /* renamed from: i */
    public final ArrayList m4710i() {
        return (ArrayList) this.f5442d.getValue();
    }

    /* renamed from: j */
    public void m4711j(BaseViewHolder helper, View view, Object obj, int i10) {
        AbstractC9979u.m20294g(helper, "helper");
        AbstractC9979u.m20294g(view, "view");
    }

    /* renamed from: k */
    public boolean m4712k(BaseViewHolder helper, View view, Object obj, int i10) {
        AbstractC9979u.m20294g(helper, "helper");
        AbstractC9979u.m20294g(view, "view");
        return false;
    }

    /* renamed from: l */
    public void m4713l(BaseViewHolder helper, View view, Object obj, int i10) {
        AbstractC9979u.m20294g(helper, "helper");
        AbstractC9979u.m20294g(view, "view");
    }

    /* renamed from: m */
    public BaseViewHolder m4714m(ViewGroup parent, int i10) {
        AbstractC9979u.m20294g(parent, "parent");
        return new BaseViewHolder(AbstractC10834a.m23320a(parent, mo4709h()));
    }

    /* renamed from: n */
    public boolean m4715n(BaseViewHolder helper, View view, Object obj, int i10) {
        AbstractC9979u.m20294g(helper, "helper");
        AbstractC9979u.m20294g(view, "view");
        return false;
    }

    /* renamed from: o */
    public void m4716o(BaseViewHolder holder) {
        AbstractC9979u.m20294g(holder, "holder");
    }

    /* renamed from: p */
    public void m4717p(BaseViewHolder holder) {
        AbstractC9979u.m20294g(holder, "holder");
    }

    /* renamed from: q */
    public void m4718q(BaseViewHolder viewHolder, int i10) {
        AbstractC9979u.m20294g(viewHolder, "viewHolder");
    }

    /* renamed from: r */
    public final void m4719r(BaseProviderMultiAdapter adapter) {
        AbstractC9979u.m20294g(adapter, "adapter");
        this.f5440b = new WeakReference(adapter);
    }

    /* renamed from: s */
    public final void m4720s(Context context) {
        AbstractC9979u.m20294g(context, "<set-?>");
        this.f5439a = context;
    }
}
