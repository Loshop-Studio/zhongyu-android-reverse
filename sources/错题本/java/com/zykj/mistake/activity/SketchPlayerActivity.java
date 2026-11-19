package com.zykj.mistake.activity;

import android.media.AudioManager;
import android.view.KeyEvent;
import android.widget.Toast;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.zykj.mistake.R;
import com.zykj.mistake.base.BaseMVPActivity;
import com.zykj.mistake.databinding.ActivityLessonPlayerBinding;
import com.zykj.mistake.network.C5088a;
import com.zykj.mistake.presenter.SketchPlayerPresenter;
import com.zykj.mistake.utils.AbstractC5101f;
import com.zykj.mistake.utils.C5103h;
import com.zykj.view.board.play.NewPlayerConfig;
import com.zykj.view.board.play.SketchPlayFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5855p;
import p021b5.C3197i;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m5110d2 = {"Lcom/zykj/mistake/activity/SketchPlayerActivity;", "Lcom/zykj/mistake/base/BaseMVPActivity;", "Lcom/zykj/mistake/presenter/SketchPlayerPresenter;", "Lcom/zykj/mistake/databinding/ActivityLessonPlayerBinding;", "", "<init>", "()V", "io/reactivex/internal/operators/observable/c", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class SketchPlayerActivity extends BaseMVPActivity<SketchPlayerPresenter, ActivityLessonPlayerBinding> {

    /* renamed from: g */
    public static final /* synthetic */ int f5871g = 0;

    /* renamed from: e */
    public SketchPlayFragment f5872e;

    /* renamed from: f */
    public final String f5873f = "Lessons";

    @Override // com.zykj.mistake.base.BaseActivity
    /* renamed from: o */
    public final int mo3905o() {
        return R.layout.activity_lesson_player;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent event) {
        AbstractC5830k.m5330g(event, "event");
        Object systemService = getSystemService("audio");
        AbstractC5830k.m5328e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        AudioManager audioManager = (AudioManager) systemService;
        if (i == 24) {
            audioManager.adjustStreamVolume(3, 1, 1);
            audioManager.adjustStreamVolume(8, 1, 0);
        } else if (i == 25) {
            audioManager.adjustStreamVolume(3, -1, 1);
            audioManager.adjustStreamVolume(8, 1, 0);
        }
        return super.onKeyDown(i, event);
    }

    @Override // com.zykj.mistake.base.BaseActivity
    /* renamed from: q */
    public final void mo3906q() {
        Fragment fragmentFindFragmentById = getSupportFragmentManager().findFragmentById(R.id.sketch_play_fragment);
        AbstractC5830k.m5328e(fragmentFindFragmentById, "null cannot be cast to non-null type com.zykj.view.board.play.SketchPlayFragment");
        SketchPlayFragment sketchPlayFragment = (SketchPlayFragment) fragmentFindFragmentById;
        this.f5872e = sketchPlayFragment;
        sketchPlayFragment.setNewPlayerConfig(new NewPlayerConfig(false, new C4461b0(this, 1), null, false, null, null, null, null, true, false, 765, null));
    }

    @Override // com.zykj.mistake.base.BaseMVPActivity
    /* renamed from: s */
    public final Class mo3916s() {
        return SketchPlayerPresenter.class;
    }

    @Override // com.zykj.mistake.base.BaseMVPActivity
    /* renamed from: t */
    public final void mo3917t() {
        String stringExtra = getIntent().getStringExtra("url");
        String strSubstring = "";
        if (stringExtra == null) {
            stringExtra = "";
        }
        String str = AbstractC5101f.f8039a;
        int iM5385S = AbstractC5855p.m5385S(stringExtra, '/', 0, 6);
        if (iM5385S != -1) {
            strSubstring = stringExtra.substring(iM5385S + 1);
            AbstractC5830k.m5329f(strSubstring, "substring(...)");
        }
        final String strM4464b = AbstractC5101f.m4464b(this.f5873f + "/" + AbstractC5855p.m5390X(strSubstring, ".zip"));
        final int intExtra = getIntent().getIntExtra("examId", -1);
        final int intExtra2 = getIntent().getIntExtra("questionId", -1);
        mo3964d(true);
        C5103h c5103h = new C5103h(strM4464b, stringExtra);
        InterfaceC6469a interfaceC6469a = new InterfaceC6469a() { // from class: com.zykj.mistake.activity.f0
            @Override // p152r6.InterfaceC6469a
            public final Object invoke() {
                int i;
                int i8 = SketchPlayerActivity.f5871g;
                SketchPlayerActivity sketchPlayerActivity = this.f5897a;
                sketchPlayerActivity.mo3963c();
                SketchPlayFragment sketchPlayFragment = sketchPlayerActivity.f5872e;
                if (sketchPlayFragment == null) {
                    AbstractC5830k.m5339p("mSketchPlayFragment");
                    throw null;
                }
                SketchPlayFragment.play$default(sketchPlayFragment, strM4464b, 0, false, null, null, 30, null);
                int i9 = intExtra;
                if (i9 != -1 && (i = intExtra2) != -1) {
                    SketchPlayerPresenter sketchPlayerPresenter = (SketchPlayerPresenter) sketchPlayerActivity.m3965r();
                    sketchPlayerPresenter.m3970b(C5088a.m4381b().m4385c(i9, i), new C3197i(sketchPlayerPresenter, 1), false);
                }
                return C5443s.f8405a;
            }
        };
        InterfaceC6469a interfaceC6469a2 = new InterfaceC6469a() { // from class: com.zykj.mistake.activity.g0
            @Override // p152r6.InterfaceC6469a
            public final Object invoke() {
                int i;
                int i8 = SketchPlayerActivity.f5871g;
                SketchPlayerActivity sketchPlayerActivity = this.f5902a;
                sketchPlayerActivity.mo3963c();
                String string = sketchPlayerActivity.getString(R.string.tips_play_err);
                AbstractC5830k.m5329f(string, "getString(...)");
                Toast toastMakeText = Toast.makeText(sketchPlayerActivity, string, 0);
                toastMakeText.setGravity(81, 0, 220);
                toastMakeText.show();
                int i9 = intExtra;
                if (i9 != -1 && (i = intExtra2) != -1) {
                    SketchPlayerPresenter sketchPlayerPresenter = (SketchPlayerPresenter) sketchPlayerActivity.m3965r();
                    sketchPlayerPresenter.m3970b(C5088a.m4381b().m4385c(i9, i), new C3197i(sketchPlayerPresenter, 1), false);
                }
                return C5443s.f8405a;
            }
        };
        if (c5103h.m4470e()) {
            interfaceC6469a.invoke();
        } else {
            c5103h.m4466a(stringExtra, interfaceC6469a, interfaceC6469a2);
        }
    }
}
