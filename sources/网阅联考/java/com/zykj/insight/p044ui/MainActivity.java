package com.zykj.insight.p044ui;

import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p006ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.zykj.base.utils.XToastUtils;
import com.zykj.insight.p044ui.theme.ThemeKt;
import com.zykj.message.client.MessageClient;
import com.zykj.message.server.bean.ServerInfo;
import com.zykj.message.server.bean.Status;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m5174d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014R\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m5175d2 = {"Lcom/zykj/insight/ui/MainActivity;", "Landroidx/activity/ComponentActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "Lcom/zykj/insight/ui/MainViewModel;", "d", "Lkotlin/Lazy;", "j", "()Lcom/zykj/insight/ui/MainViewModel;", "mainViewModel", "<init>", "()V", "app_release"}, m5176k = 1, m5177mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivity.kt\ncom/zykj/insight/ui/MainActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,125:1\n75#2,13:126\n*S KotlinDebug\n*F\n+ 1 MainActivity.kt\ncom/zykj/insight/ui/MainActivity\n*L\n28#1:126,13\n*E\n"})
/* loaded from: classes2.dex */
public final class MainActivity extends Hilt_MainActivity {

    /* renamed from: d, reason: from kotlin metadata */
    public final Lazy mainViewModel;

    public MainActivity() {
        final Function0 function0 = null;
        this.mainViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(MainViewModel.class), new Function0<ViewModelStore>() { // from class: com.zykj.insight.ui.MainActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.zykj.insight.ui.MainActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.zykj.insight.ui.MainActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        });
    }

    /* renamed from: j */
    public final MainViewModel m4613j() {
        return (MainViewModel) this.mainViewModel.getValue();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-514967381, true, new Function2<Composer, Integer, Unit>() { // from class: com.zykj.insight.ui.MainActivity.onCreate.1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i4) {
                if ((i4 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-514967381, i4, -1, "com.zykj.insight.ui.MainActivity.onCreate.<anonymous> (MainActivity.kt:31)");
                }
                final MainActivity mainActivity = MainActivity.this;
                ThemeKt.m4624a(false, false, ComposableLambdaKt.composableLambda(composer, -1482172448, true, new Function2<Composer, Integer, Unit>() { // from class: com.zykj.insight.ui.MainActivity.onCreate.1.1
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1482172448, i5, -1, "com.zykj.insight.ui.MainActivity.onCreate.<anonymous>.<anonymous> (MainActivity.kt:32)");
                        }
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        long jM7855getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).m7855getBackground0d7_KjU();
                        final MainActivity mainActivity2 = mainActivity;
                        SurfaceKt.m8142SurfaceT9BRK9s(modifierFillMaxSize$default, null, jM7855getBackground0d7_KjU, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, 1326692581, true, new Function2<Composer, Integer, Unit>() { // from class: com.zykj.insight.ui.MainActivity.onCreate.1.1.1
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i6) {
                                if ((i6 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1326692581, i6, -1, "com.zykj.insight.ui.MainActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:37)");
                                }
                                MainActivityKt.m4615a(mainActivity2.m4613j().m4621d().m6416b(), SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer3, 48, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, 12582918, 122);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composer, 384, 3);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 1, null);
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        MessageClient.f4242a.mo4631a(new Function1<ServerInfo, Unit>() { // from class: com.zykj.insight.ui.MainActivity.onResume.1
            {
                super(1);
            }

            /* renamed from: a */
            public final void m4614a(ServerInfo it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.m4655d() != Status.LOGIN) {
                    XToastUtils.INSTANCE.toast("用户未登录");
                } else {
                    MainActivity.this.m4613j().m4623f(it);
                    MainActivity.this.m4613j().m4620c();
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ServerInfo serverInfo) {
                m4614a(serverInfo);
                return Unit.INSTANCE;
            }
        });
    }
}
