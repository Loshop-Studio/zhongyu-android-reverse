package p021b5;

import android.content.SharedPreferences;
import android.widget.TextView;
import androidx.navigation.C2827b;
import com.zykj.mistake.R;
import com.zykj.mistake.adapter.MainLessonAdapter;
import com.zykj.mistake.databinding.FragmentMistakeNotebookBinding;
import com.zykj.mistake.entity.resp.CameraPermissionResp;
import com.zykj.mistake.entity.resp.MistakeBookResp;
import com.zykj.mistake.fragment.MistakeCollectionLegacyFragment;
import com.zykj.mistake.presenter.MainPresenter;
import com.zykj.mistake.utils.AbstractC5099d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC5830k;
import p000a.AbstractC0000a;
import p090j4.InterfaceC5745a;
import p106l4.DialogC6054e;

/* renamed from: b5.a */
/* loaded from: classes3.dex */
public final class C3189a extends AbstractC0000a {

    /* renamed from: a */
    public final /* synthetic */ int f1710a;

    /* renamed from: b */
    public final /* synthetic */ MainPresenter f1711b;

    public /* synthetic */ C3189a(MainPresenter mainPresenter, int i) {
        this.f1710a = i;
        this.f1711b = mainPresenter;
    }

    @Override // p000a.AbstractC0000a
    /* renamed from: m */
    public final void mo15m(String e) {
        switch (this.f1710a) {
            case 0:
                AbstractC5830k.m5330g(e, "e");
                break;
            default:
                AbstractC5830k.m5330g(e, "e");
                InterfaceC5745a interfaceC5745a = (InterfaceC5745a) this.f1711b.f6001c;
                if (interfaceC5745a != null) {
                    MistakeCollectionLegacyFragment mistakeCollectionLegacyFragment = (MistakeCollectionLegacyFragment) interfaceC5745a;
                    if (((FragmentMistakeNotebookBinding) mistakeCollectionLegacyFragment.m3960f()).f6138d.isRefreshing()) {
                        ((FragmentMistakeNotebookBinding) mistakeCollectionLegacyFragment.m3960f()).f6138d.setRefreshing(false);
                    }
                    mistakeCollectionLegacyFragment.m3958b(e);
                    break;
                }
                break;
        }
    }

    @Override // p000a.AbstractC0000a
    /* renamed from: n */
    public final void mo16n(Object obj) {
        switch (this.f1710a) {
            case 0:
                CameraPermissionResp resp = (CameraPermissionResp) obj;
                AbstractC5830k.m5330g(resp, "resp");
                InterfaceC5745a interfaceC5745a = (InterfaceC5745a) this.f1711b.f6001c;
                if (interfaceC5745a != null) {
                    MistakeCollectionLegacyFragment mistakeCollectionLegacyFragment = (MistakeCollectionLegacyFragment) interfaceC5745a;
                    SharedPreferences sharedPreferences = mistakeCollectionLegacyFragment.requireContext().getSharedPreferences("zykjMistake", 0);
                    if (sharedPreferences == null ? false : sharedPreferences.contains("SP_CAN_OPEN_CAMERA")) {
                        boolean zM4453c = AbstractC5099d.m4453c(mistakeCollectionLegacyFragment.requireContext(), "SP_CAN_OPEN_CAMERA", false);
                        boolean zM4453c2 = AbstractC5099d.m4453c(mistakeCollectionLegacyFragment.requireContext(), "SP_NEED_SHOW_CAMERA_DIALOG", true);
                        if (resp.getResult() == zM4453c || !zM4453c2) {
                            return;
                        }
                        DialogC6054e dialogC6054e = mistakeCollectionLegacyFragment.f7780g;
                        if (dialogC6054e == null) {
                            AbstractC5830k.m5339p("mCameraWarningDialog");
                            throw null;
                        }
                        boolean result = resp.getResult();
                        dialogC6054e.f9650a = new C2827b(mistakeCollectionLegacyFragment, 20);
                        dialogC6054e.show();
                        ((TextView) dialogC6054e.findViewById(R.id.tv_content)).setText(result ? dialogC6054e.getContext().getString(R.string.camera_open_warning) : dialogC6054e.getContext().getString(R.string.camera_close_warning));
                        return;
                    }
                    return;
                }
                return;
            default:
                MistakeBookResp resp2 = (MistakeBookResp) obj;
                AbstractC5830k.m5330g(resp2, "resp");
                InterfaceC5745a interfaceC5745a2 = (InterfaceC5745a) this.f1711b.f6001c;
                if (interfaceC5745a2 != null) {
                    List<MistakeBookResp.MistakeBook> result2 = resp2.getResult();
                    MistakeCollectionLegacyFragment mistakeCollectionLegacyFragment2 = (MistakeCollectionLegacyFragment) interfaceC5745a2;
                    ArrayList arrayList = mistakeCollectionLegacyFragment2.f7778e;
                    AbstractC5830k.m5330g(result2, "result");
                    if (((FragmentMistakeNotebookBinding) mistakeCollectionLegacyFragment2.m3960f()).f6138d.isRefreshing()) {
                        ((FragmentMistakeNotebookBinding) mistakeCollectionLegacyFragment2.m3960f()).f6138d.setRefreshing(false);
                    }
                    if (result2.isEmpty()) {
                        arrayList.clear();
                        MainLessonAdapter mainLessonAdapter = mistakeCollectionLegacyFragment2.f7779f;
                        if (mainLessonAdapter == null) {
                            AbstractC5830k.m5339p("mMistakeAdapter");
                            throw null;
                        }
                        mainLessonAdapter.notifyDataSetChanged();
                        ((FragmentMistakeNotebookBinding) mistakeCollectionLegacyFragment2.m3960f()).f6136b.setVisibility(0);
                        return;
                    }
                    arrayList.clear();
                    arrayList.addAll(result2);
                    MainLessonAdapter mainLessonAdapter2 = mistakeCollectionLegacyFragment2.f7779f;
                    if (mainLessonAdapter2 == null) {
                        AbstractC5830k.m5339p("mMistakeAdapter");
                        throw null;
                    }
                    mainLessonAdapter2.notifyDataSetChanged();
                    ((FragmentMistakeNotebookBinding) mistakeCollectionLegacyFragment2.m3960f()).f6136b.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
