package com.friday.document.view.viewer;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.blankj.utilcode.util.FileUtils;
import com.friday.document.R$id;
import com.friday.document.R$layout;
import com.friday.document.databinding.ActivityMicroClassPlayerBinding;
import com.friday.document.view.viewer.MicroClassPlayActivity;
import com.zykj.view.board.play.SketchPlayFragment;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p215k2.C9802t;
import p264nb.C10358a;
import p309qc.C10786q;
import p429z1.AbstractC11958b;

@StabilityInferred(parameters = 0)
@Route(path = "/document/MICRO_CLASS_ACTIVITY")
/* loaded from: classes3.dex */
public final class MicroClassPlayActivity extends Hilt_MicroClassPlayActivity<ActivityMicroClassPlayerBinding> {

    /* renamed from: g */
    public String f7751g = "";

    /* renamed from: Q */
    public static final C10786q m6171Q(MicroClassPlayActivity microClassPlayActivity) {
        microClassPlayActivity.finish();
        return C10786q.f26013a;
    }

    /* renamed from: R */
    public static final C10786q m6172R(final SketchPlayFragment sketchPlayFragment, final MicroClassPlayActivity microClassPlayActivity) {
        sketchPlayFragment.getViewLifecycleOwner().getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.friday.document.view.viewer.MicroClassPlayActivity$initView$1$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                AbstractC9979u.m20294g(source, "source");
                AbstractC9979u.m20294g(event, "event");
                if (event == Lifecycle.Event.ON_RESUME) {
                    SketchPlayFragment.m17185m0(sketchPlayFragment, microClassPlayActivity.f7751g, 0, false, null, null, 30, null);
                    sketchPlayFragment.getViewLifecycleOwner().getLifecycle().removeObserver(this);
                }
            }
        });
        return C10786q.f26013a;
    }

    /* renamed from: S */
    public static final C10786q m6173S(MicroClassPlayActivity microClassPlayActivity) {
        AbstractC11958b.m26583d("微课文件损坏");
        FileUtils.delete(microClassPlayActivity.f7751g);
        return C10786q.f26013a;
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public int getLayoutId() {
        return R$layout.activity_micro_class_player;
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public void initData() {
        ARouter.getInstance().inject(this);
        initView();
    }

    @Override // com.friday.common.base.BaseActivity
    public void initView() {
        Fragment fragmentFindFragmentById = getSupportFragmentManager().findFragmentById(R$id.sketch_play_fragment);
        AbstractC9979u.m20292e(fragmentFindFragmentById, "null cannot be cast to non-null type com.zykj.view.board.play.SketchPlayFragment");
        final SketchPlayFragment sketchPlayFragment = (SketchPlayFragment) fragmentFindFragmentById;
        sketchPlayFragment.m17210p0(new C10358a(false, new InterfaceC9529a() { // from class: y2.f
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return MicroClassPlayActivity.m6171Q(this.f28209c);
            }
        }, null, false, null, null, null, null, true, false, 765, null));
        new C9802t(this.f7751g, null).m19809a(new InterfaceC9529a() { // from class: y2.g
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return MicroClassPlayActivity.m6172R(sketchPlayFragment, this);
            }
        }, new InterfaceC9529a() { // from class: y2.h
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return MicroClassPlayActivity.m6173S(this.f28212c);
            }
        });
    }
}
