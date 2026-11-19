package com.zykj.study.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.study.adapter.MyTeachCourseAdapter;
import com.zykj.study.bean.course.CourseDetailsBean;
import com.zykj.study.databinding.ItemMyTeachCourseBinding;
import com.zykj.study.viewmodels.DictViewModel;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class MyTeachCourseAdapter extends PagingDataAdapter<CourseDetailsBean, ViewHolder> {

    /* renamed from: c */
    public static final C7608a f10922c = new C7608a(null);

    /* renamed from: d */
    public static final int f10923d = 8;

    /* renamed from: e */
    public static final DiffUtil.ItemCallback f10924e = new DiffUtil.ItemCallback<CourseDetailsBean>() { // from class: com.zykj.study.adapter.MyTeachCourseAdapter$Companion$POST_COMPARATOR$1
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(CourseDetailsBean oldItem, CourseDetailsBean newItem) {
            AbstractC9133u.m16133g(oldItem, "oldItem");
            AbstractC9133u.m16133g(newItem, "newItem");
            return AbstractC9133u.m16128b(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(CourseDetailsBean oldItem, CourseDetailsBean newItem) {
            AbstractC9133u.m16133g(oldItem, "oldItem");
            AbstractC9133u.m16133g(newItem, "newItem");
            return oldItem.getId() == newItem.getId();
        }
    };

    /* renamed from: a */
    public final InterfaceC10570l f10925a;

    /* renamed from: b */
    public final DictViewModel f10926b;

    @StabilityInferred(parameters = 0)
    public static final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ItemMyTeachCourseBinding f10927a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(ItemMyTeachCourseBinding binding) {
            super(binding.getRoot());
            AbstractC9133u.m16133g(binding, "binding");
            this.f10927a = binding;
        }

        /* renamed from: a */
        public final void m10061a(View.OnClickListener listener, CourseDetailsBean item, DictViewModel dictViewModel) {
            AbstractC9133u.m16133g(listener, "listener");
            AbstractC9133u.m16133g(item, "item");
            AbstractC9133u.m16133g(dictViewModel, "dictViewModel");
            ItemMyTeachCourseBinding itemMyTeachCourseBinding = this.f10927a;
            itemMyTeachCourseBinding.setClickListener(listener);
            itemMyTeachCourseBinding.setEntity(item);
            itemMyTeachCourseBinding.setDictViewModel(dictViewModel);
            itemMyTeachCourseBinding.executePendingBindings();
        }
    }

    /* renamed from: com.zykj.study.adapter.MyTeachCourseAdapter$a */
    public static final class C7608a {
        public /* synthetic */ C7608a(AbstractC9126n abstractC9126n) {
            this();
        }

        public C7608a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyTeachCourseAdapter(InterfaceC10570l callBack, DictViewModel dictViewModel) {
        super(f10924e, (InterfaceC9100d) null, (InterfaceC9100d) null, 6, (AbstractC9126n) null);
        AbstractC9133u.m16133g(callBack, "callBack");
        AbstractC9133u.m16133g(dictViewModel, "dictViewModel");
        this.f10925a = callBack;
        this.f10926b = dictViewModel;
    }

    /* renamed from: e */
    public static final void m10055e(MyTeachCourseAdapter myTeachCourseAdapter, CourseDetailsBean courseDetailsBean, View view) {
        myTeachCourseAdapter.f10925a.invoke(courseDetailsBean);
    }

    /* renamed from: d */
    public final View.OnClickListener m10056d(final CourseDetailsBean courseDetailsBean) {
        return new View.OnClickListener() { // from class: n4.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyTeachCourseAdapter.m10055e(this.f18544a, courseDetailsBean, view);
            }
        };
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ViewHolder holder, int i10) {
        AbstractC9133u.m16133g(holder, "holder");
        CourseDetailsBean item = getItem(i10);
        if (item != null) {
            holder.m10061a(m10056d(item), item, this.f10926b);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        AbstractC9133u.m16133g(parent, "parent");
        ItemMyTeachCourseBinding itemMyTeachCourseBindingInflate = ItemMyTeachCourseBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        AbstractC9133u.m16132f(itemMyTeachCourseBindingInflate, "inflate(...)");
        return new ViewHolder(itemMyTeachCourseBindingInflate);
    }
}
