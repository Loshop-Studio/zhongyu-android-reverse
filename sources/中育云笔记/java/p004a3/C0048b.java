package p004a3;

import android.app.Application;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;
import com.blankj.utilcode.util.ServiceUtils;
import com.blankj.utilcode.util.Utils;
import com.friday.common.activity.PusherService;
import com.friday.lecture.floatwindow.options.C6149a;
import com.friday.lecture.floatwindow.options.OptionLayout;
import com.friday.lecture.service.MyMqttService;
import com.friday.lecture.view.LectureDialogFragment;
import com.friday.lecture.viewmodel.offline.LectureDialogViewModel;
import kotlin.jvm.internal.AbstractC9979u;
import p200j2.InterfaceC9662b;

/* renamed from: a3.b */
/* loaded from: classes4.dex */
public final class C0048b implements InterfaceC9662b {

    /* renamed from: a */
    public static final C0048b f39a = new C0048b();

    @Override // p200j2.InterfaceC9662b
    /* renamed from: a */
    public void mo93a(boolean z10) {
        OptionLayout optionLayoutM6652h = C6149a.f8778g.m6662a().m6652h();
        if (optionLayoutM6652h != null) {
            optionLayoutM6652h.setVisibility(z10 ? 0 : 4);
        }
    }

    @Override // p200j2.InterfaceC9662b
    /* renamed from: b */
    public void mo94b() {
        ServiceUtils.stopService((Class<?>) MyMqttService.class);
    }

    @Override // p200j2.InterfaceC9662b
    /* renamed from: c */
    public void mo95c() {
        ServiceUtils.stopService((Class<?>) PusherService.class);
    }

    @Override // p200j2.InterfaceC9662b
    /* renamed from: d */
    public boolean mo96d() {
        return ServiceUtils.isServiceRunning((Class<?>) PusherService.class);
    }

    @Override // p200j2.InterfaceC9662b
    /* renamed from: e */
    public void mo97e(AppCompatActivity activity) {
        AbstractC9979u.m20294g(activity, "activity");
        try {
            Application app = Utils.getApp();
            AbstractC9979u.m20293f(app, "getApp(...)");
            ((LectureDialogViewModel) new ViewModelProvider(activity, new ViewModelProvider.AndroidViewModelFactory(app)).get(LectureDialogViewModel.class)).m6846s();
        } catch (Exception unused) {
        }
    }

    @Override // p200j2.InterfaceC9662b
    /* renamed from: f */
    public void mo98f(AppCompatActivity activity) {
        AbstractC9979u.m20294g(activity, "activity");
        LectureDialogFragment lectureDialogFragment = new LectureDialogFragment();
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        AbstractC9979u.m20293f(supportFragmentManager, "getSupportFragmentManager(...)");
        lectureDialogFragment.show(supportFragmentManager, LectureDialogFragment.class.getSimpleName());
    }

    @Override // p200j2.InterfaceC9662b
    /* renamed from: g */
    public boolean mo99g() {
        return ServiceUtils.isServiceRunning((Class<?>) MyMqttService.class);
    }
}
