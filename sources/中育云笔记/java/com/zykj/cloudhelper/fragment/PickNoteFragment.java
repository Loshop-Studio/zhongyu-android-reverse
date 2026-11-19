package com.zykj.cloudhelper.fragment;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.ToastUtils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.friday.common.entity.NoteBean;
import com.zykj.cloudhelper.R$drawable;
import com.zykj.cloudhelper.R$layout;
import com.zykj.cloudhelper.adapter.NotePickAdapter;
import com.zykj.cloudhelper.databinding.FragmentPickNoteBinding;
import com.zykj.cloudhelper.fragment.PickNoteFragment;
import com.zykj.cloudhelper.viewmodel.PickNoteViewModel;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.AbstractC9923a;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import kotlin.jvm.internal.InterfaceC9975q;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p255n1.AbstractC10313b;
import p268o1.InterfaceC10427d;
import p309qc.C10786q;
import p309qc.InterfaceC10772c;
import p309qc.InterfaceC10773d;
import p429z1.AbstractC11958b;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
import ua.C11376a;

@StabilityInferred(parameters = 0)
/* loaded from: classes6.dex */
public final class PickNoteFragment extends BaseNoteFragment<FragmentPickNoteBinding> {

    /* renamed from: i */
    public static final C8552a f19513i = new C8552a(null);

    /* renamed from: j */
    public static final int f19514j = 8;

    /* renamed from: e */
    public C11376a f19515e;

    /* renamed from: f */
    public final InterfaceC10773d f19516f;

    /* renamed from: g */
    public final InterfaceC10773d f19517g = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: va.e
        @Override // p181hd.InterfaceC9529a
        public final Object invoke() {
            return PickNoteFragment.m16441G();
        }
    });

    /* renamed from: h */
    public C11376a f19518h;

    /* renamed from: com.zykj.cloudhelper.fragment.PickNoteFragment$a */
    public static final class C8552a {
        public /* synthetic */ C8552a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final PickNoteFragment m16448a() {
            return new PickNoteFragment();
        }

        public C8552a() {
        }
    }

    /* renamed from: com.zykj.cloudhelper.fragment.PickNoteFragment$b */
    public static final class C8553b implements Observer, InterfaceC9975q {

        /* renamed from: c */
        public final /* synthetic */ InterfaceC9540l f19523c;

        public C8553b(InterfaceC9540l function) {
            AbstractC9979u.m20294g(function, "function");
            this.f19523c = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9975q)) {
                return AbstractC9979u.m20289b(getFunctionDelegate(), ((InterfaceC9975q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9975q
        public final InterfaceC10772c getFunctionDelegate() {
            return this.f19523c;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f19523c.invoke(obj);
        }
    }

    public PickNoteFragment() {
        final InterfaceC9529a interfaceC9529a = null;
        this.f19516f = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9983y.m20315b(PickNoteViewModel.class), new InterfaceC9529a() { // from class: com.zykj.cloudhelper.fragment.PickNoteFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new InterfaceC9529a() { // from class: com.zykj.cloudhelper.fragment.PickNoteFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC9529a interfaceC9529a2 = interfaceC9529a;
                return (interfaceC9529a2 == null || (creationExtras = (CreationExtras) interfaceC9529a2.invoke()) == null) ? this.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
            }
        }, new InterfaceC9529a() { // from class: com.zykj.cloudhelper.fragment.PickNoteFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
    }

    /* renamed from: B */
    private final PickNoteViewModel m16436B() {
        return (PickNoteViewModel) this.f19516f.getValue();
    }

    /* renamed from: C */
    public static final C10786q m16437C(PickNoteFragment pickNoteFragment, LinkedHashMap linkedHashMap) {
        pickNoteFragment.isShowLoading(false);
        if (linkedHashMap == null) {
            AbstractC11958b.m26588i("暂无数据");
            return C10786q.f26013a;
        }
        pickNoteFragment.m16447A().setList(pickNoteFragment.m16433s(linkedHashMap, true));
        AbstractC10313b item = pickNoteFragment.m16447A().getItem(0);
        AbstractC9979u.m20292e(item, "null cannot be cast to non-null type com.zykj.cloudhelper.entity.NoteHelperNode");
        C11376a c11376a = (C11376a) item;
        pickNoteFragment.f19515e = c11376a;
        List listMo21520a = c11376a.mo21520a();
        Integer numValueOf = listMo21520a != null ? Integer.valueOf(listMo21520a.size()) : null;
        if (numValueOf == null || numValueOf.intValue() != 0) {
            pickNoteFragment.m16447A().m4656C(0, true, true, Integer.valueOf(IjkMediaMeta.FF_PROFILE_H264_HIGH_10));
        }
        return C10786q.f26013a;
    }

    /* renamed from: D */
    public static final void m16438D(PickNoteFragment pickNoteFragment, View view) {
        if (pickNoteFragment.f19518h == null) {
            ToastUtils.showShort("请选择微课文件", new Object[0]);
            return;
        }
        FragmentActivity activity = pickNoteFragment.getActivity();
        Intent intent = activity != null ? activity.getIntent() : null;
        C11376a c11376a = pickNoteFragment.f19518h;
        AbstractC9979u.m20291d(c11376a);
        String fullMicroLessonOssUrl = c11376a.m25323d().getFullMicroLessonOssUrl();
        C11376a c11376a2 = pickNoteFragment.f19518h;
        AbstractC9979u.m20291d(c11376a2);
        String microCoverOssUrl = c11376a2.m25323d().getMicroCoverOssUrl();
        if (intent != null) {
            intent.putExtra("ossUrl", fullMicroLessonOssUrl);
        }
        if (intent != null) {
            intent.putExtra("microCoverOssUrl", microCoverOssUrl);
        }
        FragmentActivity activity2 = pickNoteFragment.getActivity();
        if (activity2 != null) {
            activity2.setResult(-1, intent);
        }
        FragmentActivity activity3 = pickNoteFragment.getActivity();
        if (activity3 != null) {
            activity3.finish();
        }
    }

    /* renamed from: E */
    public static final void m16439E(PickNoteFragment pickNoteFragment, View view) {
        FragmentActivity activity = pickNoteFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* renamed from: F */
    public static final void m16440F(PickNoteFragment pickNoteFragment, BaseQuickAdapter baseQuickAdapter, View view, int i10) {
        NoteBean noteBeanM25323d;
        NoteBean noteBeanM25323d2;
        AbstractC9979u.m20294g(baseQuickAdapter, "<unused var>");
        AbstractC9979u.m20294g(view, "<unused var>");
        AbstractC10313b item = pickNoteFragment.m16447A().getItem(i10);
        if (item instanceof C11376a) {
            C11376a c11376a = (C11376a) item;
            NoteBean noteBeanM25323d3 = c11376a.m25323d();
            if (!AbstractC9979u.m20289b(noteBeanM25323d3.getType(), "0")) {
                C11376a c11376a2 = pickNoteFragment.f19518h;
                if (c11376a2 != null && (noteBeanM25323d = c11376a2.m25323d()) != null) {
                    noteBeanM25323d.setSelected(false);
                }
                noteBeanM25323d3.setSelected(true);
                pickNoteFragment.m16447A().notifyDataSetChanged();
                pickNoteFragment.f19518h = c11376a;
                return;
            }
            List listMo21520a = c11376a.mo21520a();
            Integer numValueOf = listMo21520a != null ? Integer.valueOf(listMo21520a.size()) : null;
            if (numValueOf == null || numValueOf.intValue() != 0) {
                pickNoteFragment.m16447A().m4656C(i10, true, true, Integer.valueOf(IjkMediaMeta.FF_PROFILE_H264_HIGH_10));
            }
            C11376a c11376a3 = pickNoteFragment.f19515e;
            if (c11376a3 != null && (noteBeanM25323d2 = c11376a3.m25323d()) != null) {
                noteBeanM25323d2.setSelected(false);
            }
            noteBeanM25323d3.setSelected(true);
            pickNoteFragment.m16447A().notifyDataSetChanged();
            pickNoteFragment.f19515e = c11376a;
        }
    }

    /* renamed from: G */
    public static final NotePickAdapter m16441G() {
        return new NotePickAdapter();
    }

    /* renamed from: A */
    public final NotePickAdapter m16447A() {
        return (NotePickAdapter) this.f19517g.getValue();
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public int getLayoutId() {
        return R$layout.fragment_pick_note;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.friday.common.base.InterfaceC5929c
    public void initData() {
        RecyclerView recyclerView = ((FragmentPickNoteBinding) getMBinding()).f19465c;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(m16447A());
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(), 1);
        Drawable drawable = ContextCompat.getDrawable(recyclerView.getContext(), R$drawable.shape_item_divider);
        AbstractC9979u.m20291d(drawable);
        dividerItemDecoration.setDrawable(drawable);
        recyclerView.addItemDecoration(dividerItemDecoration);
        m16436B().m16485n().observe(getViewLifecycleOwner(), new C8553b(new InterfaceC9540l() { // from class: va.a
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return PickNoteFragment.m16437C(this.f27438c, (LinkedHashMap) obj);
            }
        }));
        TextView tvEnsure = ((FragmentPickNoteBinding) getMBinding()).f19467e;
        AbstractC9979u.m20293f(tvEnsure, "tvEnsure");
        AbstractC11958b.m26591l(tvEnsure, 1000L, new View.OnClickListener() { // from class: va.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PickNoteFragment.m16438D(this.f27439c, view);
            }
        });
        ((FragmentPickNoteBinding) getMBinding()).f19466d.setOnClickListener(new View.OnClickListener() { // from class: va.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PickNoteFragment.m16439E(this.f27440c, view);
            }
        });
        m16447A().setOnItemClickListener(new InterfaceC10427d() { // from class: va.d
            @Override // p268o1.InterfaceC10427d
            /* renamed from: a */
            public final void mo2825a(BaseQuickAdapter baseQuickAdapter, View view, int i10) {
                PickNoteFragment.m16440F(this.f27441a, baseQuickAdapter, view, i10);
            }
        });
        isShowLoading(true);
        m16436B().m16484l(true);
    }
}
