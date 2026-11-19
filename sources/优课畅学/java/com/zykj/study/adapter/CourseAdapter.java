package com.zykj.study.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.study.adapter.CourseAdapter;
import com.zykj.study.bean.course.CourseSimpleBean;
import com.zykj.study.databinding.ItemCourseBinding;
import com.zykj.study.viewmodels.DictViewModel;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p121h5.C8716c;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class CourseAdapter extends PagingDataAdapter<CourseSimpleBean, ViewHolder> {

    /* renamed from: c */
    public static final C7604a f10878c = new C7604a(null);

    /* renamed from: d */
    public static final int f10879d = 8;

    /* renamed from: e */
    public static final DiffUtil.ItemCallback f10880e = new DiffUtil.ItemCallback<CourseSimpleBean>() { // from class: com.zykj.study.adapter.CourseAdapter$Companion$POST_COMPARATOR$1
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(CourseSimpleBean oldItem, CourseSimpleBean newItem) {
            AbstractC9133u.m16133g(oldItem, "oldItem");
            AbstractC9133u.m16133g(newItem, "newItem");
            return AbstractC9133u.m16128b(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(CourseSimpleBean oldItem, CourseSimpleBean newItem) {
            AbstractC9133u.m16133g(oldItem, "oldItem");
            AbstractC9133u.m16133g(newItem, "newItem");
            return oldItem.getId() == newItem.getId();
        }
    };

    /* renamed from: a */
    public final InterfaceC10570l f10881a;

    /* renamed from: b */
    public final DictViewModel f10882b;

    @StabilityInferred(parameters = 0)
    public static final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ItemCourseBinding f10883a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(ItemCourseBinding binding) {
            super(binding.getRoot());
            AbstractC9133u.m16133g(binding, "binding");
            this.f10883a = binding;
        }

        /* renamed from: a */
        public final void m9979a(View.OnClickListener listener, CourseSimpleBean item, DictViewModel dictViewModel) {
            AbstractC9133u.m16133g(listener, "listener");
            AbstractC9133u.m16133g(item, "item");
            AbstractC9133u.m16133g(dictViewModel, "dictViewModel");
            ItemCourseBinding itemCourseBinding = this.f10883a;
            itemCourseBinding.setClickListener(listener);
            itemCourseBinding.setEntity(item);
            itemCourseBinding.setDictViewModel(dictViewModel);
            itemCourseBinding.executePendingBindings();
        }
    }

    /* renamed from: com.zykj.study.adapter.CourseAdapter$a */
    public static final class C7604a {
        public /* synthetic */ C7604a(AbstractC9126n abstractC9126n) {
            this();
        }

        public C7604a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseAdapter(InterfaceC10570l callBack, DictViewModel dictViewModel) {
        super(f10880e, (InterfaceC9100d) null, (InterfaceC9100d) null, 6, (AbstractC9126n) null);
        AbstractC9133u.m16133g(callBack, "callBack");
        AbstractC9133u.m16133g(dictViewModel, "dictViewModel");
        this.f10881a = callBack;
        this.f10882b = dictViewModel;
    }

    /* renamed from: f */
    public static final void m9972f(final CourseAdapter courseAdapter, final CourseSimpleBean courseSimpleBean, View view) {
        C8716c.f16341b.m14220a(new InterfaceC10559a() { // from class: n4.t
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return CourseAdapter.m9973g(this.f18580a, courseSimpleBean);
            }
        });
    }

    /* renamed from: g */
    public static final C8736p m9973g(CourseAdapter courseAdapter, CourseSimpleBean courseSimpleBean) {
        courseAdapter.f10881a.invoke(courseSimpleBean);
        return C8736p.f16368a;
    }

    /* renamed from: e */
    public final View.OnClickListener m9974e(final CourseSimpleBean courseSimpleBean) {
        return new View.OnClickListener() { // from class: n4.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CourseAdapter.m9972f(this.f18577a, courseSimpleBean, view);
            }
        };
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ViewHolder holder, int i10) {
        AbstractC9133u.m16133g(holder, "holder");
        CourseSimpleBean item = getItem(i10);
        if (item != null) {
            holder.m9979a(m9974e(item), item, this.f10882b);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        AbstractC9133u.m16133g(parent, "parent");
        ItemCourseBinding itemCourseBindingInflate = ItemCourseBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        AbstractC9133u.m16132f(itemCourseBindingInflate, "inflate(...)");
        return new ViewHolder(itemCourseBindingInflate);
    }
}
