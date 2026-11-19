package com.zykj.huiwei.launcher.app;

import android.content.Intent;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blankj.utilcode.util.AbstractC4668s;
import com.zykj.huiwei.launcher.app.App;
import com.zykj.huiwei.launcher.p035ui.activity.CrashActivity;
import com.zykj.message.server.MessageManage;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p078i4.AbstractC6537g;
import p078i4.C6535e;
import p183x2.AbstractC7832b;

@StabilityInferred(parameters = 0)
@Keep
@Metadata(m7879d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003¨\u0006\t"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/app/App;", "Lcom/zykj/base/BaseApplication;", "<init>", "()V", "", "onCreate", "onTerminate", "Companion", "a", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class App extends Hilt_App {
    public static App app;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: com.zykj.huiwei.launcher.app.App$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final App m5206a() {
            App app = App.app;
            if (app != null) {
                return app;
            }
            Intrinsics.throwUninitializedPropertyAccessException("app");
            return null;
        }

        /* renamed from: b */
        public final void m5207b(App app) {
            Intrinsics.checkNotNullParameter(app, "<set-?>");
            App.app = app;
        }

        public Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(App app2, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Intent intent = new Intent(app2, (Class<?>) CrashActivity.class);
        intent.addFlags(32768);
        intent.addFlags(268435456);
        app2.startActivity(intent);
        return Unit.INSTANCE;
    }

    @Override // com.zykj.huiwei.launcher.app.Hilt_App, com.zykj.base.BaseApplication, android.app.Application
    public void onCreate() {
        super.onCreate();
        INSTANCE.m5207b(this);
        AbstractC7832b.b.m9504k().m9506l(255);
        AbstractC4668s.m2384p().m2418x("HWLauncherLog");
        if (AbstractC6537g.f8372a.m7316g()) {
            C6535e.f8368a.m7306e(new Function1() { // from class: r3.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return App.onCreate$lambda$0(this.f10090a, (String) obj);
                }
            });
        }
    }

    @Override // android.app.Application
    public void onTerminate() {
        super.onTerminate();
        MessageManage.f7396a.mo6207b(this);
    }
}
