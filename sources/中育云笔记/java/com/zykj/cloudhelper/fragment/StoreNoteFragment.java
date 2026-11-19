package com.zykj.cloudhelper.fragment;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.KeyboardUtils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.friday.common.R$string;
import com.friday.common.entity.NoteBean;
import com.friday.common.helper.C5962b;
import com.zykj.cloudhelper.R$drawable;
import com.zykj.cloudhelper.R$layout;
import com.zykj.cloudhelper.adapter.NoteStoreAdapter;
import com.zykj.cloudhelper.databinding.FragmentStoreNoteBinding;
import com.zykj.cloudhelper.dialog.CreateFolderDialogFragment;
import com.zykj.cloudhelper.fragment.StoreNoteFragment;
import com.zykj.cloudhelper.viewmodel.PickNoteViewModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.AbstractC9923a;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import kotlin.jvm.internal.InterfaceC9975q;
import kotlin.text.Regex;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p255n1.AbstractC10313b;
import p268o1.InterfaceC10427d;
import p309qc.C10786q;
import p309qc.InterfaceC10772c;
import p309qc.InterfaceC10773d;
import p310qd.AbstractC10793c0;
import p429z1.AbstractC11958b;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
import ua.C11376a;

@StabilityInferred(parameters = 0)
/* loaded from: classes6.dex */
public final class StoreNoteFragment extends Hilt_StoreNoteFragment<FragmentStoreNoteBinding> {

    /* renamed from: m */
    public static final C8554a f19524m = new C8554a(null);

    /* renamed from: n */
    public static final int f19525n = 8;

    /* renamed from: j */
    public C11376a f19526j;

    /* renamed from: k */
    public final InterfaceC10773d f19527k;

    /* renamed from: l */
    public final InterfaceC10773d f19528l = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: va.f
        @Override // p181hd.InterfaceC9529a
        public final Object invoke() {
            return StoreNoteFragment.m16469V();
        }
    });

    /* renamed from: com.zykj.cloudhelper.fragment.StoreNoteFragment$a */
    public static final class C8554a {
        public /* synthetic */ C8554a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final StoreNoteFragment m16475a(Uri uri, String str) {
            StoreNoteFragment storeNoteFragment = new StoreNoteFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("uri", uri);
            bundle.putString("ossUrl", str);
            storeNoteFragment.setArguments(bundle);
            return storeNoteFragment;
        }

        public C8554a() {
        }
    }

    /* renamed from: com.zykj.cloudhelper.fragment.StoreNoteFragment$b */
    public static final class C8555b implements Observer, InterfaceC9975q {

        /* renamed from: c */
        public final /* synthetic */ InterfaceC9540l f19533c;

        public C8555b(InterfaceC9540l function) {
            AbstractC9979u.m20294g(function, "function");
            this.f19533c = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9975q)) {
                return AbstractC9979u.m20289b(getFunctionDelegate(), ((InterfaceC9975q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9975q
        public final InterfaceC10772c getFunctionDelegate() {
            return this.f19533c;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f19533c.invoke(obj);
        }
    }

    public StoreNoteFragment() {
        final InterfaceC9529a interfaceC9529a = null;
        this.f19527k = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9983y.m20315b(PickNoteViewModel.class), new InterfaceC9529a() { // from class: com.zykj.cloudhelper.fragment.StoreNoteFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new InterfaceC9529a() { // from class: com.zykj.cloudhelper.fragment.StoreNoteFragment$special$$inlined$activityViewModels$default$2
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
        }, new InterfaceC9529a() { // from class: com.zykj.cloudhelper.fragment.StoreNoteFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
    }

    /* renamed from: J */
    private final PickNoteViewModel m16457J() {
        return (PickNoteViewModel) this.f19527k.getValue();
    }

    /* renamed from: K */
    public static final C10786q m16458K(StoreNoteFragment storeNoteFragment, Boolean bool) {
        storeNoteFragment.isShowLoading(false);
        if (bool.booleanValue()) {
            FragmentActivity activity = storeNoteFragment.getActivity();
            if (activity != null) {
                activity.finish();
            }
        } else {
            AbstractC11958b.m26588i("文件存储失败");
        }
        return C10786q.f26013a;
    }

    /* renamed from: L */
    public static final C10786q m16459L(StoreNoteFragment storeNoteFragment, Boolean bool) {
        storeNoteFragment.isShowLoading(false);
        if (bool.booleanValue()) {
            AbstractC11958b.m26588i("文件不存在");
        }
        return C10786q.f26013a;
    }

    /* renamed from: M */
    public static final C10786q m16460M(StoreNoteFragment storeNoteFragment, LinkedHashMap linkedHashMap) {
        storeNoteFragment.isShowLoading(false);
        if (linkedHashMap == null) {
            AbstractC11958b.m26588i("暂无数据");
            return C10786q.f26013a;
        }
        storeNoteFragment.m16474I().setList(BaseNoteFragment.m16430t(storeNoteFragment, linkedHashMap, false, 2, null));
        AbstractC10313b item = storeNoteFragment.m16474I().getItem(0);
        AbstractC9979u.m20292e(item, "null cannot be cast to non-null type com.zykj.cloudhelper.entity.NoteHelperNode");
        C11376a c11376a = (C11376a) item;
        storeNoteFragment.f19526j = c11376a;
        List listMo21520a = c11376a.mo21520a();
        Integer numValueOf = listMo21520a != null ? Integer.valueOf(listMo21520a.size()) : null;
        if (numValueOf == null || numValueOf.intValue() != 0) {
            storeNoteFragment.m16474I().m4656C(0, true, true, Integer.valueOf(IjkMediaMeta.FF_PROFILE_H264_HIGH_10));
        }
        return C10786q.f26013a;
    }

    /* renamed from: N */
    public static final void m16461N(StoreNoteFragment storeNoteFragment, BaseQuickAdapter baseQuickAdapter, View view, int i10) {
        NoteBean noteBeanM25323d;
        AbstractC9979u.m20294g(baseQuickAdapter, "<unused var>");
        AbstractC9979u.m20294g(view, "<unused var>");
        AbstractC10313b item = storeNoteFragment.m16474I().getItem(i10);
        if (item instanceof C11376a) {
            C11376a c11376a = (C11376a) item;
            NoteBean noteBeanM25323d2 = c11376a.m25323d();
            if (AbstractC9979u.m20289b(noteBeanM25323d2.getType(), "0")) {
                List listMo21520a = c11376a.mo21520a();
                Integer numValueOf = listMo21520a != null ? Integer.valueOf(listMo21520a.size()) : null;
                if (numValueOf == null || numValueOf.intValue() != 0) {
                    storeNoteFragment.m16474I().m4656C(i10, true, true, Integer.valueOf(IjkMediaMeta.FF_PROFILE_H264_HIGH_10));
                }
                C11376a c11376a2 = storeNoteFragment.f19526j;
                if (c11376a2 != null && (noteBeanM25323d = c11376a2.m25323d()) != null) {
                    noteBeanM25323d.setSelected(false);
                }
                noteBeanM25323d2.setSelected(true);
                storeNoteFragment.m16474I().notifyDataSetChanged();
                storeNoteFragment.f19526j = c11376a;
            }
        }
    }

    /* renamed from: O */
    public static final C10786q m16462O(StoreNoteFragment storeNoteFragment, NoteBean noteBean) {
        C11376a c11376a;
        if (noteBean == null || (c11376a = storeNoteFragment.f19526j) == null) {
            AbstractC11958b.m26588i("创建失败");
        } else {
            noteBean.setSelected(true);
            NoteBean noteBeanM25323d = c11376a.m25323d();
            if (noteBeanM25323d != null) {
                noteBeanM25323d.setSelected(false);
            }
            List listMo21520a = c11376a.mo21520a();
            Integer numValueOf = listMo21520a != null ? Integer.valueOf(listMo21520a.size()) : null;
            C11376a c11376a2 = new C11376a(new ArrayList(), noteBean, c11376a.m25324e() + 1);
            storeNoteFragment.m16474I().m4658F(c11376a, 0, c11376a2);
            storeNoteFragment.m16474I().notifyDataSetChanged();
            if (numValueOf != null && numValueOf.intValue() == 0) {
                storeNoteFragment.m16474I().m4656C(storeNoteFragment.m16474I().getItemPosition(c11376a), true, true, Integer.valueOf(IjkMediaMeta.FF_PROFILE_H264_HIGH_10));
            }
            storeNoteFragment.f19526j = c11376a2;
            AbstractC11958b.m26588i("创建成功");
        }
        return C10786q.f26013a;
    }

    /* renamed from: P */
    public static final C10786q m16463P(StoreNoteFragment storeNoteFragment, String str) {
        String fileId;
        NoteBean noteBeanM25323d;
        AbstractC9979u.m20291d(str);
        if (str.length() > 0) {
            PickNoteViewModel pickNoteViewModelM16457J = storeNoteFragment.m16457J();
            C11376a c11376a = storeNoteFragment.f19526j;
            if (c11376a == null || (noteBeanM25323d = c11376a.m25323d()) == null || (fileId = noteBeanM25323d.getFileId()) == null) {
                fileId = "0";
            }
            pickNoteViewModelM16457J.m16483j(str, fileId, C5962b.f6082a.m5299a().m5292t());
        }
        return C10786q.f26013a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: Q */
    public static final void m16464Q(StoreNoteFragment storeNoteFragment, View view) {
        if (AbstractC10793c0.m23132h0(String.valueOf(((FragmentStoreNoteBinding) storeNoteFragment.getMBinding()).f19472c.getText()))) {
            AbstractC11958b.m26588i("文件名不能为空");
            return;
        }
        if (!new Regex("^([\\u4e00-\\u9fa5a-zA-Z0-9\"\\s\\.\\/\\“\\”\\_\\（\\）\\(\\)\\【\\】])+$").m20341g(String.valueOf(((FragmentStoreNoteBinding) storeNoteFragment.getMBinding()).f19472c.getText()))) {
            AbstractC11958b.m26587h(R$string.name_content_rule);
            return;
        }
        ((FragmentStoreNoteBinding) storeNoteFragment.getMBinding()).f19476g.setVisibility(8);
        ((FragmentStoreNoteBinding) storeNoteFragment.getMBinding()).f19474e.setVisibility(0);
        ((FragmentStoreNoteBinding) storeNoteFragment.getMBinding()).f19481l.setText("选择文件夹目录，将文件储存到云笔记");
        ((FragmentStoreNoteBinding) storeNoteFragment.getMBinding()).f19484o.setVisibility(8);
        ((FragmentStoreNoteBinding) storeNoteFragment.getMBinding()).f19477h.setVisibility(0);
        storeNoteFragment.m16457J().m16495x(AbstractC10793c0.m23129e1(String.valueOf(((FragmentStoreNoteBinding) storeNoteFragment.getMBinding()).f19472c.getText())).toString());
        KeyboardUtils.hideSoftInput(storeNoteFragment.requireActivity());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: R */
    public static final void m16465R(StoreNoteFragment storeNoteFragment, View view) {
        Editable text = ((FragmentStoreNoteBinding) storeNoteFragment.getMBinding()).f19472c.getText();
        if (text != null) {
            text.clear();
        }
    }

    /* renamed from: S */
    public static final void m16466S(StoreNoteFragment storeNoteFragment, View view) {
        if (storeNoteFragment.m16457J().m16485n().getValue() == 0) {
            AbstractC11958b.m26588i("网络不佳");
            return;
        }
        CreateFolderDialogFragment createFolderDialogFragment = new CreateFolderDialogFragment();
        FragmentManager childFragmentManager = storeNoteFragment.getChildFragmentManager();
        AbstractC9979u.m20293f(childFragmentManager, "getChildFragmentManager(...)");
        createFolderDialogFragment.show(childFragmentManager, CreateFolderDialogFragment.class.getSimpleName());
    }

    /* renamed from: T */
    public static final void m16467T(StoreNoteFragment storeNoteFragment, View view) {
        FragmentActivity activity = storeNoteFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* renamed from: U */
    public static final void m16468U(StoreNoteFragment storeNoteFragment, View view) {
        NoteBean noteBeanM25323d;
        if (storeNoteFragment.m16457J().m16485n().getValue() == 0) {
            AbstractC11958b.m26588i("网络不佳");
            return;
        }
        if (storeNoteFragment.m16457J().m16489r() == null) {
            AbstractC11958b.m26588i("找不到微课文件");
            return;
        }
        storeNoteFragment.isShowLoading(true);
        C11376a c11376a = storeNoteFragment.f19526j;
        if (c11376a == null || (noteBeanM25323d = c11376a.m25323d()) == null) {
            AbstractC11958b.m26588i("请选择文件夹");
        } else {
            storeNoteFragment.m16457J().m16492u(noteBeanM25323d);
        }
    }

    /* renamed from: V */
    public static final NoteStoreAdapter m16469V() {
        return new NoteStoreAdapter();
    }

    /* renamed from: I */
    public final NoteStoreAdapter m16474I() {
        return (NoteStoreAdapter) this.f19528l.getValue();
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public int getLayoutId() {
        return R$layout.fragment_store_note;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.friday.common.base.InterfaceC5929c
    public void initData() {
        String string;
        Uri uri;
        Bundle arguments = getArguments();
        if (arguments != null && (uri = (Uri) arguments.getParcelable("uri")) != null) {
            m16457J().m16494w(uri);
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string = arguments2.getString("ossUrl")) != null) {
            m16457J().m16493v(string);
        }
        ((FragmentStoreNoteBinding) getMBinding()).f19481l.setText("为储存的文件命名");
        RecyclerView recyclerView = ((FragmentStoreNoteBinding) getMBinding()).f19479j;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(m16474I());
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(), 1);
        Drawable drawable = ContextCompat.getDrawable(recyclerView.getContext(), R$drawable.shape_item_divider);
        AbstractC9979u.m20291d(drawable);
        dividerItemDecoration.setDrawable(drawable);
        recyclerView.addItemDecoration(dividerItemDecoration);
        ((FragmentStoreNoteBinding) getMBinding()).f19484o.setOnClickListener(new View.OnClickListener() { // from class: va.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StoreNoteFragment.m16464Q(this.f27444c, view);
            }
        });
        ((FragmentStoreNoteBinding) getMBinding()).f19475f.setOnClickListener(new View.OnClickListener() { // from class: va.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StoreNoteFragment.m16465R(this.f27446c, view);
            }
        });
        ((FragmentStoreNoteBinding) getMBinding()).f19482m.setOnClickListener(new View.OnClickListener() { // from class: va.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StoreNoteFragment.m16466S(this.f27447c, view);
            }
        });
        ((FragmentStoreNoteBinding) getMBinding()).f19480k.setOnClickListener(new View.OnClickListener() { // from class: va.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StoreNoteFragment.m16467T(this.f27448c, view);
            }
        });
        ((FragmentStoreNoteBinding) getMBinding()).f19483n.setOnClickListener(new View.OnClickListener() { // from class: va.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StoreNoteFragment.m16468U(this.f27449c, view);
            }
        });
        m16457J().m16491t().observe(getViewLifecycleOwner(), new C8555b(new InterfaceC9540l() { // from class: va.o
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return StoreNoteFragment.m16458K(this.f27450c, (Boolean) obj);
            }
        }));
        m16457J().m16486o().observe(getViewLifecycleOwner(), new C8555b(new InterfaceC9540l() { // from class: va.p
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return StoreNoteFragment.m16459L(this.f27451c, (Boolean) obj);
            }
        }));
        m16457J().m16485n().observe(getViewLifecycleOwner(), new C8555b(new InterfaceC9540l() { // from class: va.q
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return StoreNoteFragment.m16460M(this.f27452c, (LinkedHashMap) obj);
            }
        }));
        m16474I().setOnItemClickListener(new InterfaceC10427d() { // from class: va.g
            @Override // p268o1.InterfaceC10427d
            /* renamed from: a */
            public final void mo2825a(BaseQuickAdapter baseQuickAdapter, View view, int i10) {
                StoreNoteFragment.m16461N(this.f27442a, baseQuickAdapter, view, i10);
            }
        });
        m16457J().m16488q().observe(getViewLifecycleOwner(), new C8555b(new InterfaceC9540l() { // from class: va.h
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return StoreNoteFragment.m16462O(this.f27443c, (NoteBean) obj);
            }
        }));
        m16457J().m16487p().observe(getViewLifecycleOwner(), new C8555b(new InterfaceC9540l() { // from class: va.j
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return StoreNoteFragment.m16463P(this.f27445c, (String) obj);
            }
        }));
        isShowLoading(true);
        PickNoteViewModel.m16482m(m16457J(), false, 1, null);
    }
}
