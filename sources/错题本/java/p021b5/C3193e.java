package p021b5;

import com.zykj.mistake.activity.MistakeListActivity;
import com.zykj.mistake.adapter.MistakeListAdapter;
import com.zykj.mistake.databinding.ActivityMistakeListBinding;
import com.zykj.mistake.entity.resp.MistakeListResp;
import com.zykj.mistake.presenter.MistakeListPresenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC5830k;
import p000a.AbstractC0000a;

/* renamed from: b5.e */
/* loaded from: classes3.dex */
public final class C3193e extends AbstractC0000a {

    /* renamed from: a */
    public final /* synthetic */ MistakeListPresenter f1721a;

    /* renamed from: b */
    public final /* synthetic */ boolean f1722b;

    public C3193e(MistakeListPresenter mistakeListPresenter, boolean z8) {
        this.f1721a = mistakeListPresenter;
        this.f1722b = z8;
    }

    @Override // p000a.AbstractC0000a
    /* renamed from: m */
    public final void mo15m(String e) {
        AbstractC5830k.m5330g(e, "e");
        MistakeListActivity mistakeListActivity = (MistakeListActivity) this.f1721a.f6001c;
        if (mistakeListActivity != null) {
            if (((ActivityMistakeListBinding) mistakeListActivity.m3957p()).f6077l.isRefreshing()) {
                ((ActivityMistakeListBinding) mistakeListActivity.m3957p()).f6077l.setRefreshing(false);
            }
            mistakeListActivity.mo3962b(e);
        }
    }

    @Override // p000a.AbstractC0000a
    /* renamed from: n */
    public final void mo16n(Object obj) {
        MistakeListResp resp = (MistakeListResp) obj;
        AbstractC5830k.m5330g(resp, "resp");
        MistakeListActivity mistakeListActivity = (MistakeListActivity) this.f1721a.f6001c;
        if (mistakeListActivity != null) {
            List<MistakeListResp.MistakeInfo> result = resp.getResult().getItems();
            ArrayList arrayList = mistakeListActivity.f5832e;
            AbstractC5830k.m5330g(result, "result");
            boolean z8 = this.f1722b;
            if (z8) {
                arrayList.clear();
            }
            mistakeListActivity.f5838k = !result.isEmpty();
            arrayList.addAll(result);
            if (z8) {
                MistakeListAdapter mistakeListAdapter = mistakeListActivity.f5833f;
                if (mistakeListAdapter == null) {
                    AbstractC5830k.m5339p("mMistakeListAdapter");
                    throw null;
                }
                mistakeListAdapter.notifyDataSetChanged();
                if (((ActivityMistakeListBinding) mistakeListActivity.m3957p()).f6077l.isRefreshing()) {
                    ((ActivityMistakeListBinding) mistakeListActivity.m3957p()).f6077l.setRefreshing(false);
                }
            } else {
                MistakeListAdapter mistakeListAdapter2 = mistakeListActivity.f5833f;
                if (mistakeListAdapter2 == null) {
                    AbstractC5830k.m5339p("mMistakeListAdapter");
                    throw null;
                }
                mistakeListAdapter2.notifyItemRangeInserted(arrayList.size(), result.size());
            }
            mistakeListActivity.m3938u();
        }
    }
}
