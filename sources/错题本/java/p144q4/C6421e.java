package p144q4;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.zykj.mistake.dialog.ImageDialogFragment;
import com.zykj.mistake.dialog.PictureNoteDeleteDialogFragment;
import com.zykj.mistake.entity.req.RemovePicReq;
import com.zykj.mistake.fragment.NoteFragment;
import com.zykj.mistake.network.C5088a;
import com.zykj.mistake.presenter.NotePresenter;
import kotlin.jvm.internal.AbstractC5830k;
import p021b5.C3196h;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;

/* renamed from: q4.e */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6421e implements InterfaceC6469a {

    /* renamed from: a */
    public final /* synthetic */ int f10535a;

    /* renamed from: b */
    public final /* synthetic */ NoteFragment f10536b;

    /* renamed from: c */
    public final /* synthetic */ String f10537c;

    /* renamed from: d */
    public final /* synthetic */ ImageDialogFragment f10538d;

    public /* synthetic */ C6421e(NoteFragment noteFragment, String str, ImageDialogFragment imageDialogFragment, int i) {
        this.f10535a = i;
        this.f10536b = noteFragment;
        this.f10537c = str;
        this.f10538d = imageDialogFragment;
    }

    @Override // p152r6.InterfaceC6469a
    public final Object invoke() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        int i = this.f10535a;
        C5443s c5443s = C5443s.f8405a;
        int i8 = 1;
        ImageDialogFragment imageDialogFragment = this.f10538d;
        String str = this.f10537c;
        NoteFragment noteFragment = this.f10536b;
        switch (i) {
            case 0:
                PictureNoteDeleteDialogFragment pictureNoteDeleteDialogFragment = new PictureNoteDeleteDialogFragment();
                FragmentActivity fragmentActivityRequireActivity = noteFragment.requireActivity();
                AbstractC5830k.m5329f(fragmentActivityRequireActivity, "requireActivity(...)");
                pictureNoteDeleteDialogFragment.f6178c = new C6421e(noteFragment, str, imageDialogFragment, i8);
                FragmentManager supportFragmentManager = fragmentActivityRequireActivity.getSupportFragmentManager();
                AbstractC5830k.m5329f(supportFragmentManager, "getSupportFragmentManager(...)");
                pictureNoteDeleteDialogFragment.m3988k(supportFragmentManager);
                break;
            default:
                NotePresenter notePresenter = (NotePresenter) noteFragment.m3966h();
                long j7 = noteFragment.f7783e;
                C5088a c5088a = C5088a.f7986a;
                notePresenter.m3969a(C5088a.m4381b().m4389g(new RemovePicReq(j7, str)), new C3196h(notePresenter, str, i8));
                imageDialogFragment.dismiss();
                break;
        }
        return c5443s;
    }
}
