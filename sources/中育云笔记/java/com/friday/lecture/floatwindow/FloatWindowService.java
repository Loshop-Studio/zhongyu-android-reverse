package com.friday.lecture.floatwindow;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import com.friday.common.entity.EventBusKey;
import com.friday.common.service.BaseLifecycleService;
import com.friday.lecture.floatwindow.FloatWindowService;
import com.friday.lecture.floatwindow.FloatWindowStatus;
import com.friday.lecture.floatwindow.homework.C6148b;
import com.friday.lecture.floatwindow.options.C6149a;
import com.jeremyliao.liveeventbus.LiveEventBus;
import kotlin.jvm.internal.AbstractC9979u;
import p111d3.C8925a;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class FloatWindowService extends BaseLifecycleService {

    /* renamed from: d */
    public static final int f8676d = BaseLifecycleService.f6150c;

    /* renamed from: e */
    public static final void m6518e(FloatWindowStatus floatWindowStatus) {
        C6149a c6149aM6662a = C6149a.f8778g.m6662a();
        AbstractC9979u.m20291d(floatWindowStatus);
        c6149aM6662a.m6657m(floatWindowStatus);
    }

    /* renamed from: f */
    public static final void m6519f(Bitmap bitmap) {
        C6148b.f8768d.m6626a().m6622f(bitmap);
    }

    /* renamed from: g */
    public static final void m6520g(FloatWindowService floatWindowService, Object obj) {
        floatWindowService.stopSelf();
    }

    @Override // com.friday.common.service.BaseLifecycleService, androidx.lifecycle.LifecycleService, android.app.Service
    public void onCreate() {
        super.onCreate();
        C8925a.f20887a.m17518b();
        C6149a.f8778g.m6662a().m6660p(true);
        LiveEventBus.get(EventBusKey.KEY_CURRENT_CLASS_STATE, FloatWindowStatus.class).observe(this, new Observer() { // from class: d3.b
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                FloatWindowService.m6518e((FloatWindowStatus) obj);
            }
        });
        LiveEventBus.get(EventBusKey.KEY_CLASS_BITMAP, Bitmap.class).observe(this, new Observer() { // from class: d3.c
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                FloatWindowService.m6519f((Bitmap) obj);
            }
        });
        LiveEventBus.get("killClassService").observe(this, new Observer() { // from class: d3.d
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                FloatWindowService.m6520g(this.f20892c, obj);
            }
        });
    }

    @Override // com.friday.common.service.BaseLifecycleService, androidx.lifecycle.LifecycleService, android.app.Service
    public void onDestroy() {
        C8925a.f20887a.m17518b();
        super.onDestroy();
    }
}
