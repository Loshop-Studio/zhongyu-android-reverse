package com.zykj.huiwei.launcher.p035ui.fragment.applist;

import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C4641d0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.chad.library.adapter.base.listener.OnItemDragListener;
import com.google.gson.Gson;
import com.zykj.huiwei.launcher.bean.resp.AppData;
import com.zykj.huiwei.launcher.databinding.HwFragmentAppBinding;
import com.zykj.huiwei.launcher.ext.CommonExtKt;
import com.zykj.huiwei.launcher.p035ui.adapter.AppListAdapter;
import com.zykj.huiwei.launcher.p035ui.fragment.applist.BaseAppFragment;
import com.zykj.manage.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p078i4.AbstractC6537g;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0094@¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppFragment;", "Lcom/zykj/base/BaseFragment;", "Lcom/zykj/huiwei/launcher/databinding/HwFragmentAppBinding;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "initView", "(Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "layoutId", "()I", "Lcom/zykj/huiwei/launcher/ui/adapter/AppListAdapter;", "f", "Lkotlin/Lazy;", "m", "()Lcom/zykj/huiwei/launcher/ui/adapter/AppListAdapter;", "adapter", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public abstract class BaseAppFragment extends Hilt_BaseAppFragment<HwFragmentAppBinding> {

    /* renamed from: f, reason: from kotlin metadata */
    public final Lazy adapter = LazyKt.lazy(new Function0() { // from class: g4.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BaseAppFragment.m5986l();
        }
    });

    /* renamed from: com.zykj.huiwei.launcher.ui.fragment.applist.BaseAppFragment$a */
    public static final class C6161a implements OnItemDragListener {
        public C6161a() {
        }

        @Override // com.chad.library.adapter.base.listener.OnItemDragListener
        public void onItemDragEnd(RecyclerView.ViewHolder viewHolder, int i6) {
            List<AppData> data = BaseAppFragment.this.m5989m().getData();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(data, 10));
            Iterator<T> it = data.iterator();
            while (it.hasNext()) {
                arrayList.add(((AppData) it.next()).getAppInfo().getLabel());
            }
            C4641d0.m2157a().m2163g("SP_APP_SORT_LIST", new Gson().toJson(arrayList));
        }

        @Override // com.chad.library.adapter.base.listener.OnItemDragListener
        public void onItemDragMoving(RecyclerView.ViewHolder viewHolder, int i6, RecyclerView.ViewHolder viewHolder2, int i7) {
        }

        @Override // com.chad.library.adapter.base.listener.OnItemDragListener
        public void onItemDragStart(RecyclerView.ViewHolder viewHolder, int i6) {
        }
    }

    /* renamed from: l */
    public static final AppListAdapter m5986l() {
        return new AppListAdapter();
    }

    /* renamed from: n */
    public static final void m5987n(BaseAppFragment baseAppFragment, BaseQuickAdapter baseQuickAdapter, View view, int i6) {
        Intrinsics.checkNotNullParameter(baseQuickAdapter, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        if (Intrinsics.areEqual(baseAppFragment.m5989m().getItem(i6).getAppInfo().getPackageName(), "com.android.launcher3") && AbstractC6537g.f8372a.m7316g()) {
            Intent intent = new Intent();
            intent.setClassName(baseAppFragment.m5989m().getItem(i6).getAppInfo().getPackageName(), baseAppFragment.m5989m().getItem(i6).getAppInfo().getActivityName());
            baseAppFragment.startActivity(intent);
        } else {
            CommonExtKt.m5313f(baseAppFragment, baseAppFragment.m5989m().getItem(i6).getAppInfo().getPackageName(), null, 2, null);
        }
        AbstractC6537g.a aVar = AbstractC6537g.f8372a;
        if (aVar.m7316g()) {
            FragmentActivity fragmentActivityRequireActivity = baseAppFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            aVar.m7314e(fragmentActivityRequireActivity);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: o */
    public static /* synthetic */ Object m5988o(final BaseAppFragment baseAppFragment, Bundle bundle, Continuation continuation) {
        ((HwFragmentAppBinding) baseAppFragment.getMBindView()).rvList.addItemDecoration(new RecyclerView.ItemDecoration(baseAppFragment) { // from class: com.zykj.huiwei.launcher.ui.fragment.applist.BaseAppFragment.initView.2

            /* renamed from: a, reason: from kotlin metadata */
            public final int space30;

            {
                this.space30 = baseAppFragment.getResources().getDimensionPixelOffset(R.dimen.pt30);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                Intrinsics.checkNotNullParameter(outRect, "outRect");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(state, "state");
                outRect.bottom = this.space30;
            }
        });
        baseAppFragment.m5989m().setOnItemClickListener(new OnItemClickListener() { // from class: g4.b
            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i6) {
                BaseAppFragment.m5987n(this.f8086a, baseQuickAdapter, view, i6);
            }
        });
        ((HwFragmentAppBinding) baseAppFragment.getMBindView()).rvList.setAdapter(baseAppFragment.m5989m());
        baseAppFragment.m5989m().getDraggableModule().setDragEnabled(true);
        baseAppFragment.m5989m().getDraggableModule().setOnItemDragListener(baseAppFragment.new C6161a());
        return Unit.INSTANCE;
    }

    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, Continuation continuation) {
        return m5988o(this, bundle, continuation);
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R.layout.hw_fragment_app;
    }

    /* renamed from: m */
    public final AppListAdapter m5989m() {
        return (AppListAdapter) this.adapter.getValue();
    }
}
