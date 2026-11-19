package p004a3;

import com.blankj.utilcode.util.ServiceUtils;
import com.friday.lecture.floatwindow.FloatWindowService;
import com.friday.lecture.floatwindow.StudentDemoService;
import com.friday.lecture.floatwindow.options.C6149a;
import p111d3.C8925a;
import p200j2.InterfaceC9665e;

/* renamed from: a3.c */
/* loaded from: classes4.dex */
public final class C0049c implements InterfaceC9665e {

    /* renamed from: a */
    public static final C0049c f40a = new C0049c();

    @Override // p200j2.InterfaceC9665e
    /* renamed from: a */
    public void mo100a() {
        ServiceUtils.stopService((Class<?>) FloatWindowService.class);
    }

    @Override // p200j2.InterfaceC9665e
    /* renamed from: b */
    public void mo101b() {
        ServiceUtils.stopService((Class<?>) StudentDemoService.class);
    }

    @Override // p200j2.InterfaceC9665e
    /* renamed from: c */
    public void mo102c() {
        C8925a.f20887a.m17519c();
    }

    @Override // p200j2.InterfaceC9665e
    /* renamed from: d */
    public void mo103d(boolean z10) {
        C6149a.f8778g.m6662a().m6656l(z10);
    }

    @Override // p200j2.InterfaceC9665e
    /* renamed from: e */
    public boolean mo104e() {
        return ServiceUtils.isServiceRunning((Class<?>) StudentDemoService.class);
    }

    @Override // p200j2.InterfaceC9665e
    /* renamed from: f */
    public void mo105f() {
        ServiceUtils.startService((Class<?>) StudentDemoService.class);
    }

    /* renamed from: g */
    public void m106g() {
        C8925a.f20887a.m17520d();
    }

    /* renamed from: h */
    public void m107h() {
        C8925a.f20887a.m17525i();
    }
}
