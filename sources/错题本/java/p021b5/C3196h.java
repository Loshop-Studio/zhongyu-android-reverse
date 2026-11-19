package p021b5;

import com.zykj.mistake.adapter.DetailNoteImageAdapter;
import com.zykj.mistake.fragment.NoteFragment;
import com.zykj.mistake.network.ApiResp;
import com.zykj.mistake.presenter.NotePresenter;
import java.util.List;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5830k;
import p000a.AbstractC0000a;

/* renamed from: b5.h */
/* loaded from: classes3.dex */
public final class C3196h extends AbstractC0000a {

    /* renamed from: a */
    public final /* synthetic */ int f1727a;

    /* renamed from: b */
    public final /* synthetic */ NotePresenter f1728b;

    /* renamed from: c */
    public final /* synthetic */ String f1729c;

    public /* synthetic */ C3196h(NotePresenter notePresenter, String str, int i) {
        this.f1727a = i;
        this.f1728b = notePresenter;
        this.f1729c = str;
    }

    @Override // p000a.AbstractC0000a
    /* renamed from: m */
    public final void mo15m(String e) {
        switch (this.f1727a) {
            case 0:
                AbstractC5830k.m5330g(e, "e");
                NoteFragment noteFragment = (NoteFragment) this.f1728b.f6001c;
                if (noteFragment != null) {
                    noteFragment.mo3963c();
                    break;
                }
                break;
            default:
                AbstractC5830k.m5330g(e, "e");
                break;
        }
    }

    @Override // p000a.AbstractC0000a
    /* renamed from: n */
    public final void mo16n(Object obj) {
        switch (this.f1727a) {
            case 0:
                ApiResp resp = (ApiResp) obj;
                AbstractC5830k.m5330g(resp, "resp");
                NoteFragment noteFragment = (NoteFragment) this.f1728b.f6001c;
                if (noteFragment != null) {
                    DetailNoteImageAdapter detailNoteImageAdapter = noteFragment.f7787i;
                    List list = detailNoteImageAdapter.f2645b;
                    int size = list.size() - 1;
                    List list2 = detailNoteImageAdapter.f2645b;
                    if (size < list2.size()) {
                        list2.set(size, this.f1729c);
                        detailNoteImageAdapter.notifyItemChanged(size);
                    }
                    if (list.size() < noteFragment.f7788j) {
                        List list3 = detailNoteImageAdapter.f2645b;
                        list3.add("");
                        detailNoteImageAdapter.notifyItemInserted(list3.size());
                        if (detailNoteImageAdapter.f2645b.size() == 1) {
                            detailNoteImageAdapter.notifyDataSetChanged();
                        }
                    }
                    noteFragment.mo3963c();
                    break;
                }
                break;
            default:
                ApiResp resp2 = (ApiResp) obj;
                AbstractC5830k.m5330g(resp2, "resp");
                NoteFragment noteFragment2 = (NoteFragment) this.f1728b.f6001c;
                if (noteFragment2 != null) {
                    DetailNoteImageAdapter detailNoteImageAdapter2 = noteFragment2.f7787i;
                    int iIndexOf = detailNoteImageAdapter2.f2645b.indexOf(this.f1729c);
                    if (iIndexOf != -1) {
                        List list4 = detailNoteImageAdapter2.f2645b;
                        if (iIndexOf < list4.size()) {
                            list4.remove(iIndexOf);
                            detailNoteImageAdapter2.notifyItemRemoved(iIndexOf);
                            if (detailNoteImageAdapter2.f2645b.size() == 0) {
                                detailNoteImageAdapter2.notifyDataSetChanged();
                            }
                            detailNoteImageAdapter2.notifyItemRangeChanged(iIndexOf, list4.size() - iIndexOf);
                        }
                    }
                    if (((CharSequence) AbstractC5805t.m5235o0(detailNoteImageAdapter2.f2645b)).length() > 0) {
                        List list5 = detailNoteImageAdapter2.f2645b;
                        list5.add("");
                        detailNoteImageAdapter2.notifyItemInserted(list5.size());
                        if (detailNoteImageAdapter2.f2645b.size() == 1) {
                            detailNoteImageAdapter2.notifyDataSetChanged();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
