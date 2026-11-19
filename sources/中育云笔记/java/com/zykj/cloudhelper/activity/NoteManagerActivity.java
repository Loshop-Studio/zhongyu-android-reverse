package com.zykj.cloudhelper.activity;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blankj.utilcode.util.ActivityUtils;
import com.friday.common.base.BaseActivity;
import com.friday.common.helper.C5962b;
import com.friday.common.helper.C5963c;
import com.zykj.cloudhelper.R$id;
import com.zykj.cloudhelper.R$layout;
import com.zykj.cloudhelper.databinding.ActivityNoteManagerBinding;
import com.zykj.cloudhelper.fragment.PickNoteFragment;
import com.zykj.cloudhelper.fragment.StoreNoteFragment;
import kotlin.jvm.internal.AbstractC9979u;
import p141f2.C9166c;
import p429z1.AbstractC11958b;

@StabilityInferred(parameters = 0)
/* loaded from: classes6.dex */
public final class NoteManagerActivity extends Hilt_NoteManagerActivity<ActivityNoteManagerBinding> {

    /* renamed from: g */
    public static final int f19456g = BaseActivity.$stable;

    @Override // com.friday.common.base.InterfaceC5929c
    public int getLayoutId() {
        return R$layout.activity_note_manager;
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public void initData() {
        if (getIntent() == null) {
            finish();
            AbstractC11958b.m26583d("未检测到相关参数");
            return;
        }
        if (!C9166c.f21406a.m18061e()) {
            finish();
            AbstractC11958b.m26583d("网络未连接");
            return;
        }
        C5962b.a aVar = C5962b.f6082a;
        if (aVar.m5299a().m5291s().length() == 0) {
            AbstractC11958b.m26583d("云笔记未登录");
            ActivityUtils.finishAllActivities();
            C5963c.f6084a.m5310f();
        } else if (!AbstractC9979u.m20289b(getIntent().getStringExtra("userId"), String.valueOf(aVar.m5299a().m5292t()))) {
            finish();
            AbstractC11958b.m26583d("用户不一致");
        } else if (AbstractC9979u.m20289b(getIntent().getAction(), "com.zykj.pickfile")) {
            getSupportFragmentManager().beginTransaction().add(R$id.fl_container, PickNoteFragment.f19513i.m16448a()).commitNow();
        } else {
            getSupportFragmentManager().beginTransaction().add(R$id.fl_container, StoreNoteFragment.f19524m.m16475a(getIntent().getData(), getIntent().getStringExtra("ossUrl"))).commitNow();
        }
    }
}
