package com.chad.library.adapter.base;

import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.AbstractC0037f;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.zykj.mistake.activity.ViewOnLongClickListenerC4476l;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import p006a5.ViewOnClickListenerC0015f;
import p203y0.C6767a;
import p209z0.AbstractC6809a;

@Metadata(m5109d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, m5110d2 = {"Lcom/chad/library/adapter/base/BaseBinderAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "y0/a", "com.github.CymChad.brvah"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nBaseBinderAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseBinderAdapter.kt\ncom/chad/library/adapter/base/BaseBinderAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,233:1\n1#2:234\n1855#3,2:235\n1855#3,2:237\n*S KotlinDebug\n*F\n+ 1 BaseBinderAdapter.kt\ncom/chad/library/adapter/base/BaseBinderAdapter\n*L\n160#1:235,2\n180#1:237,2\n*E\n"})
/* loaded from: classes2.dex */
public class BaseBinderAdapter extends BaseQuickAdapter<Object, BaseViewHolder> {

    /* renamed from: e */
    public final HashMap f2638e;

    /* renamed from: f */
    public final HashMap f2639f;

    /* renamed from: g */
    public final SparseArray f2640g;

    public BaseBinderAdapter() {
        super(0);
        this.f2638e = new HashMap();
        this.f2639f = new HashMap();
        this.f2640g = new SparseArray();
        new C6767a(this);
        synchronized (AbstractC6809a.f11488a) {
            if (AbstractC6809a.f11489b == null) {
                AbstractC6809a.f11489b = Executors.newFixedThreadPool(2);
            }
        }
        AbstractC5830k.m5327d(AbstractC6809a.f11489b);
        new Handler(Looper.getMainLooper());
        new CopyOnWriteArrayList();
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: a */
    public final void mo2493a(BaseViewHolder viewHolder, int i) {
        AbstractC5830k.m5330g(viewHolder, "viewHolder");
        super.mo2493a(viewHolder, i);
        if (this.f2646c == null) {
            viewHolder.itemView.setOnClickListener(new ViewOnClickListenerC0015f(13, viewHolder, this));
        }
        viewHolder.itemView.setOnLongClickListener(new ViewOnLongClickListenerC4476l(3, viewHolder, this));
        m2499j(i);
        throw null;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: b */
    public final void mo2494b(BaseViewHolder holder, Object item) {
        AbstractC5830k.m5330g(holder, "holder");
        AbstractC5830k.m5330g(item, "item");
        m2499j(holder.getItemViewType());
        throw null;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: c */
    public final void mo2495c(BaseViewHolder holder, Object item, List payloads) {
        AbstractC5830k.m5330g(holder, "holder");
        AbstractC5830k.m5330g(item, "item");
        AbstractC5830k.m5330g(payloads, "payloads");
        m2499j(holder.getItemViewType());
        throw null;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: d */
    public final int mo2496d(int i) {
        Class<?> cls = this.f2645b.get(i).getClass();
        Integer num = (Integer) this.f2639f.get(cls);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException(("findViewType: ViewType: " + cls + " Not Find!").toString());
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: h */
    public final BaseViewHolder mo2497h(ViewGroup viewGroup, int i) {
        m2499j(i);
        throw null;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: i */
    public final void onViewAttachedToWindow(BaseViewHolder holder) {
        AbstractC5830k.m5330g(holder, "holder");
        super.onViewAttachedToWindow(holder);
        if (this.f2640g.get(holder.getItemViewType()) != null) {
            throw new ClassCastException();
        }
    }

    /* renamed from: j */
    public final void m2499j(int i) {
        if (this.f2640g.get(i) != null) {
            throw new ClassCastException();
        }
        throw new IllegalStateException(AbstractC0037f.m82g(i, "getItemBinder: viewType '", "' no such Binder found，please use addItemBinder() first!").toString());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        BaseViewHolder holder = (BaseViewHolder) viewHolder;
        AbstractC5830k.m5330g(holder, "holder");
        if (this.f2640g.get(holder.getItemViewType()) == null) {
            return false;
        }
        throw new ClassCastException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        BaseViewHolder holder = (BaseViewHolder) viewHolder;
        AbstractC5830k.m5330g(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        if (this.f2640g.get(holder.getItemViewType()) != null) {
            throw new ClassCastException();
        }
    }
}
