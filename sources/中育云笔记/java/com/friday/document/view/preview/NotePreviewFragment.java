package com.friday.document.view.preview;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.friday.common.base.BaseFragment;
import com.friday.common.helper.C5963c;
import com.friday.document.R$layout;
import com.friday.document.adapter.PreviewAdapter;
import com.friday.document.databinding.FragmentPreviewNoteBinding;
import com.friday.document.view.preview.NotePreviewFragment;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC9923a;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.InterfaceC10773d;
import p325rc.AbstractC10978w;
import p383w2.InterfaceC11671b;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class NotePreviewFragment extends BaseFragment<FragmentPreviewNoteBinding> implements InterfaceC11671b {

    /* renamed from: e */
    public static final C6057a f7463e = new C6057a(null);

    /* renamed from: f */
    public static final int f7464f = 8;

    /* renamed from: d */
    public final InterfaceC10773d f7465d = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: w2.e
        @Override // p181hd.InterfaceC9529a
        public final Object invoke() {
            return NotePreviewFragment.m5949y();
        }
    });

    /* renamed from: com.friday.document.view.preview.NotePreviewFragment$a */
    public static final class C6057a {
        public /* synthetic */ C6057a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final NotePreviewFragment m5953a(String[] pathArray, String fileId, boolean z10, String shareTime) {
            AbstractC9979u.m20294g(pathArray, "pathArray");
            AbstractC9979u.m20294g(fileId, "fileId");
            AbstractC9979u.m20294g(shareTime, "shareTime");
            Bundle bundle = new Bundle();
            bundle.putStringArray("pathArray", pathArray);
            bundle.putString("fileId", fileId);
            bundle.putBoolean("isNewNote", z10);
            bundle.putString("shareTime", shareTime);
            NotePreviewFragment notePreviewFragment = new NotePreviewFragment();
            notePreviewFragment.setArguments(bundle);
            return notePreviewFragment;
        }

        public C6057a() {
        }
    }

    /* renamed from: s */
    private final String m5946s() {
        String string;
        Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("fileId")) == null) ? "" : string;
    }

    /* renamed from: v */
    private final String m5947v() {
        String string;
        Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("shareTime")) == null) ? "" : string;
    }

    /* renamed from: w */
    public static final void m5948w(NotePreviewFragment notePreviewFragment, SwipeRefreshLayout swipeRefreshLayout) {
        notePreviewFragment.m5951u().m5471d();
        swipeRefreshLayout.setRefreshing(false);
    }

    /* renamed from: y */
    public static final PreviewAdapter m5949y() {
        return new PreviewAdapter();
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public int getLayoutId() {
        return R$layout.fragment_preview_note;
    }

    @Override // p383w2.InterfaceC11671b
    /* renamed from: i */
    public void mo5940i() {
        C5963c.f6084a.m5313k(m5946s(), false, false, m5952x(), m5947v());
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public void initData() {
        initView();
        m5951u().submitList(m5950t());
    }

    @Override // com.friday.common.base.BaseFragment
    public void initView() {
        final SwipeRefreshLayout swipeRefreshLayout = getMBinding().f6392c;
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: w2.d
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                NotePreviewFragment.m5948w(this.f27789a, swipeRefreshLayout);
            }
        });
        RecyclerView recyclerView = getMBinding().f6393d;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(m5951u());
    }

    @Override // com.friday.common.base.BaseFragment
    public boolean needHideLoadingOnDestroy() {
        return false;
    }

    /* renamed from: t */
    public final List m5950t() {
        String[] stringArray;
        Bundle arguments = getArguments();
        if (arguments == null || (stringArray = arguments.getStringArray("pathArray")) == null) {
            return AbstractC10978w.m24136n();
        }
        ArrayList arrayList = new ArrayList(stringArray.length);
        for (String str : stringArray) {
            arrayList.add(new File(str));
        }
        return arrayList;
    }

    /* renamed from: u */
    public final PreviewAdapter m5951u() {
        return (PreviewAdapter) this.f7465d.getValue();
    }

    /* renamed from: x */
    public final boolean m5952x() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getBoolean("isNewNote", true);
        }
        return true;
    }
}
