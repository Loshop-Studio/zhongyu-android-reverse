package com.chad.library.adapter.base;

import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.zykj.mistake.activity.ViewOnLongClickListenerC4476l;
import java.util.List;
import kotlin.AbstractC5773a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p006a5.ViewOnClickListenerC0015f;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, m5110d2 = {"Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "com.github.CymChad.brvah"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nBaseProviderMultiAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseProviderMultiAdapter.kt\ncom/chad/library/adapter/base/BaseProviderMultiAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,166:1\n1#2:167\n1855#3,2:168\n1855#3,2:170\n*S KotlinDebug\n*F\n+ 1 BaseProviderMultiAdapter.kt\ncom/chad/library/adapter/base/BaseProviderMultiAdapter\n*L\n130#1:168,2\n149#1:170,2\n*E\n"})
/* loaded from: classes2.dex */
public abstract class BaseProviderMultiAdapter<T> extends BaseQuickAdapter<T, BaseViewHolder> {

    /* renamed from: e */
    public final Object f2643e;

    public BaseProviderMultiAdapter() {
        this(0);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: a */
    public final void mo2493a(BaseViewHolder viewHolder, int i) {
        AbstractC5830k.m5330g(viewHolder, "viewHolder");
        super.mo2493a(viewHolder, i);
        if (this.f2646c == null) {
            viewHolder.itemView.setOnClickListener(new ViewOnClickListenerC0015f(14, viewHolder, this));
        }
        viewHolder.itemView.setOnLongClickListener(new ViewOnLongClickListenerC4476l(4, viewHolder, this));
        m2501j(i);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: b */
    public final void mo2494b(BaseViewHolder holder, Object obj) {
        AbstractC5830k.m5330g(holder, "holder");
        m2501j(holder.getItemViewType());
        AbstractC5830k.m5327d(null);
        throw null;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: c */
    public final void mo2495c(BaseViewHolder holder, Object obj, List payloads) {
        AbstractC5830k.m5330g(holder, "holder");
        AbstractC5830k.m5330g(payloads, "payloads");
        m2501j(holder.getItemViewType());
        AbstractC5830k.m5327d(null);
        throw null;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: d */
    public final int mo2496d(int i) {
        return m2502k();
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: h */
    public final BaseViewHolder mo2497h(ViewGroup viewGroup, int i) {
        m2501j(i);
        throw new IllegalStateException(("ViewType: " + i + " no such provider found，please use addItemProvider() first!").toString());
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: i */
    public final void onViewAttachedToWindow(BaseViewHolder holder) {
        AbstractC5830k.m5330g(holder, "holder");
        super.onViewAttachedToWindow(holder);
        m2501j(holder.getItemViewType());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d6.e, java.lang.Object] */
    /* renamed from: j */
    public final void m2501j(int i) {
        if (((SparseArray) this.f2643e.getValue()).get(i) != null) {
            throw new ClassCastException();
        }
    }

    /* renamed from: k */
    public abstract int m2502k();

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        BaseViewHolder holder = (BaseViewHolder) viewHolder;
        AbstractC5830k.m5330g(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        m2501j(holder.getItemViewType());
    }

    public BaseProviderMultiAdapter(int i) {
        super(0);
        this.f2643e = AbstractC5773a.m5116a(LazyThreadSafetyMode.NONE, new InterfaceC6469a() { // from class: com.chad.library.adapter.base.BaseProviderMultiAdapter$mItemProviders$2
            @Override // p152r6.InterfaceC6469a
            @NotNull
            public final SparseArray<Object> invoke() {
                return new SparseArray<>();
            }
        });
    }
}
