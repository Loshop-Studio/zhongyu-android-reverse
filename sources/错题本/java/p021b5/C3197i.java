package p021b5;

import androidx.appcompat.app.AlertDialog;
import com.zykj.mistake.activity.SketchActivity;
import com.zykj.mistake.base.BasePresenter;
import com.zykj.mistake.entity.resp.CameraPermissionResp;
import com.zykj.mistake.fragment.NoteFragment;
import com.zykj.mistake.network.ApiResp;
import com.zykj.mistake.presenter.NotePresenter;
import com.zykj.mistake.presenter.SketchPresenter;
import com.zykj.mistake.utils.AbstractC5099d;
import kotlin.jvm.internal.AbstractC5830k;
import p000a.AbstractC0000a;

/* renamed from: b5.i */
/* loaded from: classes3.dex */
public final class C3197i extends AbstractC0000a {

    /* renamed from: a */
    public final /* synthetic */ int f1730a;

    /* renamed from: b */
    public final /* synthetic */ BasePresenter f1731b;

    public /* synthetic */ C3197i(BasePresenter basePresenter, int i) {
        this.f1730a = i;
        this.f1731b = basePresenter;
    }

    @Override // p000a.AbstractC0000a
    /* renamed from: m */
    public final void mo15m(String e) {
        switch (this.f1730a) {
            case 0:
            case 1:
                AbstractC5830k.m5330g(e, "e");
                return;
            default:
                AbstractC5830k.m5330g(e, "e");
                SketchActivity sketchActivity = (SketchActivity) ((SketchPresenter) this.f1731b).f6001c;
                if (sketchActivity != null) {
                    AlertDialog alertDialog = sketchActivity.f5861l;
                    if (alertDialog != null) {
                        alertDialog.show();
                        return;
                    } else {
                        AbstractC5830k.m5339p("mSubmitFailedDialog");
                        throw null;
                    }
                }
                return;
        }
    }

    @Override // p000a.AbstractC0000a
    /* renamed from: n */
    public final void mo16n(Object obj) {
        switch (this.f1730a) {
            case 0:
                CameraPermissionResp resp = (CameraPermissionResp) obj;
                AbstractC5830k.m5330g(resp, "resp");
                NoteFragment noteFragment = (NoteFragment) ((NotePresenter) this.f1731b).f6001c;
                if (noteFragment != null) {
                    noteFragment.f7789k = resp.getResult();
                    AbstractC5099d.m4455e(noteFragment.requireContext(), "SP_CAN_OPEN_CAMERA", resp.getResult());
                    AbstractC5099d.m4455e(noteFragment.requireContext(), "SP_NEED_SHOW_CAMERA_DIALOG", true);
                    break;
                }
                break;
            case 1:
                AbstractC5830k.m5330g((ApiResp) obj, "resp");
                break;
            default:
                AbstractC5830k.m5330g((ApiResp) obj, "resp");
                SketchActivity sketchActivity = (SketchActivity) ((SketchPresenter) this.f1731b).f6001c;
                if (sketchActivity != null) {
                    try {
                        sketchActivity.m3944v();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    sketchActivity.finish();
                    break;
                }
                break;
        }
    }
}
