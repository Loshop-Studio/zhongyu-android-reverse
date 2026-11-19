package androidx.navigation;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.LifecycleOwner;
import android.widget.ImageView;
import androidx.camera.core.impl.utils.RunnableC0377a;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.internal.C2863b;
import coil3.compose.C3249f;
import coil3.compose.C3250g;
import coil3.compose.InterfaceC3252i;
import coil3.request.NullRequestDataException;
import com.blankj.utilcode.util.AbstractC3382c;
import com.zykj.message.server.bean.ServerInfo;
import com.zykj.mistake.feature.ask.C4506xaf40617d;
import com.zykj.mistake.feature.ask.C4536n;
import com.zykj.mistake.feature.collection.detail.C4588e0;
import com.zykj.mistake.feature.collection.detail.C4624v0;
import com.zykj.mistake.feature.collection.detail.C4632z0;
import com.zykj.mistake.feature.notebook.detail.AbstractC4880t4;
import com.zykj.mistake.feature.notebook.detail.C4764a5;
import com.zykj.mistake.feature.notebook.detail.C4782d2;
import com.zykj.mistake.feature.notebook.detail.C4788e2;
import com.zykj.mistake.feature.notebook.detail.DraftActionMode;
import com.zykj.mistake.feature.notebook.detail.MistakeDetailNewContract$DraftNavigation;
import com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel;
import com.zykj.mistake.feature.notebook.detail.ViewOnClickListenerC4758a;
import com.zykj.mistake.main.AbstractC5057l;
import com.zykj.mistake.main.C5019a;
import com.zykj.mistake.main.C5021a1;
import com.zykj.mistake.main.C5028d;
import com.zykj.mistake.main.C5066p;
import com.zykj.mistake.main.C5087z0;
import com.zykj.mistake.utils.C5106k;
import java.util.List;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.AbstractC5855p;
import p045d6.C5443s;
import p046d7.C5447d;
import p115m4.C6107e;
import p115m4.C6108f;
import p115m4.InterfaceC6106d;
import p137p4.C6383b;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6475g;
import p154s.C6528b;
import p169t6.AbstractC6600a;

/* renamed from: androidx.navigation.d */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2856d implements InterfaceC6471c {

    /* renamed from: a */
    public final /* synthetic */ int f1301a;

    /* renamed from: b */
    public final /* synthetic */ Object f1302b;

    /* renamed from: c */
    public final /* synthetic */ Object f1303c;

    public /* synthetic */ C2856d(int i, Object obj, Object obj2) {
        this.f1301a = i;
        this.f1302b = obj;
        this.f1303c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v66, types: [T, java.lang.Object, java.lang.String] */
    @Override // p152r6.InterfaceC6471c
    public final Object invoke(Object obj) {
        switch (this.f1301a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.f1302b;
                InterfaceC6471c interfaceC6471c = (InterfaceC6471c) this.f1303c;
                Uri uri = (Uri) obj;
                AbstractC3382c.m2317r((Uri) ref$ObjectRef.element).delete();
                interfaceC6471c.invoke(uri != null ? AbstractC3382c.m2317r(uri).getAbsolutePath() : null);
                break;
            case 4:
                final C4536n c4536n = (C4536n) this.f1302b;
                final InterfaceC6471c interfaceC6471c2 = (InterfaceC6471c) this.f1303c;
                LazyGridScope LazyVerticalGrid = (LazyGridScope) obj;
                AbstractC5830k.m5330g(LazyVerticalGrid, "$this$LazyVerticalGrid");
                final List list = c4536n.f6278e;
                final C2826a c2826a = new C2826a(26);
                final C4506xaf40617d c4506xaf40617d = new InterfaceC6471c() { // from class: com.zykj.mistake.feature.ask.MistakeAskMaterialScreenKt$AskMaterialContent$lambda$35$lambda$34$lambda$33$$inlined$items$default$1
                    @Override // p152r6.InterfaceC6471c
                    public final Void invoke(C4549y c4549y) {
                        return null;
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        return invoke((C4549y) obj2);
                    }
                };
                LazyVerticalGrid.items(list.size(), new InterfaceC6471c() { // from class: com.zykj.mistake.feature.ask.MistakeAskMaterialScreenKt$AskMaterialContent$lambda$35$lambda$34$lambda$33$$inlined$items$default$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        return invoke(((Number) obj2).intValue());
                    }

                    public final Object invoke(int i) {
                        return c2826a.invoke(list.get(i));
                    }
                }, null, new InterfaceC6471c() { // from class: com.zykj.mistake.feature.ask.MistakeAskMaterialScreenKt$AskMaterialContent$lambda$35$lambda$34$lambda$33$$inlined$items$default$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        return invoke(((Number) obj2).intValue());
                    }

                    public final Object invoke(int i) {
                        return c4506xaf40617d.invoke(list.get(i));
                    }
                }, ComposableLambdaKt.composableLambdaInstance(699646206, true, new InterfaceC6475g() { // from class: com.zykj.mistake.feature.ask.MistakeAskMaterialScreenKt$AskMaterialContent$lambda$35$lambda$34$lambda$33$$inlined$items$default$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // p152r6.InterfaceC6475g
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        invoke((LazyGridItemScope) obj2, ((Number) obj3).intValue(), (Composer) obj4, ((Number) obj5).intValue());
                        return C5443s.f8405a;
                    }

                    @Composable
                    public final void invoke(LazyGridItemScope lazyGridItemScope, int i, Composer composer, int i8) {
                        int i9;
                        if ((i8 & 6) == 0) {
                            i9 = (composer.changed(lazyGridItemScope) ? 4 : 2) | i8;
                        } else {
                            i9 = i8;
                        }
                        if ((i8 & 48) == 0) {
                            i9 |= composer.changed(i) ? 32 : 16;
                        }
                        if (!composer.shouldExecute((i9 & 147) != 146, i9 & 1)) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(699646206, i9, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:542)");
                        }
                        C4549y c4549y = (C4549y) list.get(i);
                        composer.startReplaceGroup(-1865827378);
                        MistakeAskMaterialContract$MaterialType mistakeAskMaterialContract$MaterialType = c4536n.f6274a;
                        Modifier modifierAspectRatio$default = AspectRatioKt.aspectRatio$default(Modifier.INSTANCE, 1.65f, false, 2, null);
                        boolean zChanged = composer.changed(interfaceC6471c2) | composer.changedInstance(c4536n) | composer.changedInstance(c4549y);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new C4535m0(interfaceC6471c2, c4536n, c4549y, 2);
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        AbstractC4539o0.m4007e(mistakeAskMaterialContract$MaterialType, c4549y, modifierAspectRatio$default, true, (InterfaceC6469a) objRememberedValue, composer, 3456);
                        composer.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
                break;
            case 5:
                InterfaceC6471c interfaceC6471c3 = (InterfaceC6471c) this.f1302b;
                Integer num = (Integer) this.f1303c;
                String value = (String) obj;
                AbstractC5830k.m5330g(value, "value");
                if (num != null) {
                    value = AbstractC5855p.m5401i0(num.intValue(), value);
                }
                interfaceC6471c3.invoke(value);
                break;
            case 6:
                C4632z0 c4632z0 = (C4632z0) this.f1302b;
                InterfaceC6471c interfaceC6471c4 = (InterfaceC6471c) this.f1303c;
                C6383b item = (C6383b) obj;
                AbstractC5830k.m5330g(item, "item");
                if (!c4632z0.f6542G) {
                    interfaceC6471c4.invoke(C4588e0.f6472a);
                    interfaceC6471c4.invoke(new C4624v0(item.f10446a));
                }
                break;
            case 7:
                String str = (String) this.f1302b;
                InterfaceC6469a interfaceC6469a = (InterfaceC6469a) this.f1303c;
                Context context = (Context) obj;
                AbstractC5830k.m5330g(context, "context");
                ImageView imageView = new ImageView(context);
                int iM6241q = AbstractC6600a.m6241q(((AbstractC4880t4.f7325q - AbstractC4880t4.f7326r) / 2.0f) * context.getResources().getDisplayMetrics().density);
                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                imageView.setPadding(iM6241q, iM6241q, iM6241q, iM6241q);
                imageView.setContentDescription(str);
                imageView.setOnClickListener(new ViewOnClickListenerC4758a(interfaceC6469a, 2));
                break;
            case 8:
                C4764a5 c4764a5 = (C4764a5) this.f1302b;
                MutableState mutableState = (MutableState) this.f1303c;
                DraftActionMode mode = (DraftActionMode) obj;
                AbstractC5830k.m5330g(mode, "mode");
                mutableState.setValue(mode);
                c4764a5.getClass();
                c4764a5.f6897d = mode;
                c4764a5.m4167c();
                break;
            case 9:
                final LifecycleOwner lifecycleOwner = (LifecycleOwner) this.f1302b;
                MistakeDetailNewViewModel mistakeDetailNewViewModel = (MistakeDetailNewViewModel) this.f1303c;
                DisposableEffectScope DisposableEffect = (DisposableEffectScope) obj;
                AbstractC5830k.m5330g(DisposableEffect, "$this$DisposableEffect");
                final C2863b c2863b = new C2863b(mistakeDetailNewViewModel, 2);
                lifecycleOwner.getLifecycle().addObserver(c2863b);
                break;
            case 10:
                InterfaceC6471c interfaceC6471c5 = (InterfaceC6471c) this.f1302b;
                MistakeDetailNewContract$DraftNavigation mistakeDetailNewContract$DraftNavigation = (MistakeDetailNewContract$DraftNavigation) this.f1303c;
                if (((Boolean) obj).booleanValue()) {
                    interfaceC6471c5.invoke(new C4782d2(mistakeDetailNewContract$DraftNavigation));
                } else {
                    interfaceC6471c5.invoke(new C4788e2(mistakeDetailNewContract$DraftNavigation));
                }
                break;
            case 11:
                String str2 = (String) this.f1302b;
                String str3 = (String) this.f1303c;
                C5066p draft = (C5066p) obj;
                AbstractC5830k.m5330g(draft, "draft");
                break;
            case 12:
                C5019a c5019a = (C5019a) this.f1302b;
                String str4 = (String) this.f1303c;
                C5021a1 state = (C5021a1) obj;
                AbstractC5830k.m5330g(state, "state");
                break;
            case 13:
                InterfaceC6473e interfaceC6473e = (InterfaceC6473e) this.f1302b;
                AbstractC5057l abstractC5057l = (AbstractC5057l) this.f1303c;
                C5087z0 selection = (C5087z0) obj;
                AbstractC5830k.m5330g(selection, "selection");
                interfaceC6473e.invoke(((C5028d) abstractC5057l).f7838a, selection);
                break;
            case 14:
                C5106k c5106k = (C5106k) this.f1302b;
                State state2 = (State) this.f1303c;
                long jLongValue = ((Number) c5106k.f8049b.invoke()).longValue();
                Long l = c5106k.f8050c;
                if (l == null || jLongValue - l.longValue() >= c5106k.f8048a) {
                    c5106k.f8050c = Long.valueOf(jLongValue);
                    ((InterfaceC6471c) state2.getValue()).invoke(obj);
                }
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                ((C5447d) this.f1302b).f8408a.removeCallbacks((RunnableC0377a) this.f1303c);
                break;
            case 18:
                Painter painter = (Painter) this.f1302b;
                Painter painter2 = (Painter) this.f1303c;
                InterfaceC3252i interfaceC3252i = (InterfaceC3252i) obj;
                if (!(interfaceC3252i instanceof C3250g)) {
                    if (interfaceC3252i instanceof C3249f) {
                        C3249f c3249f = (C3249f) interfaceC3252i;
                        C6528b c6528b = c3249f.f1855b;
                        if (!(c6528b.f10817c instanceof NullRequestDataException)) {
                            if (painter2 != null) {
                                break;
                            }
                        } else if (painter != null) {
                            break;
                        }
                    }
                } else {
                    break;
                }
                break;
            case 19:
                C6108f c6108f = (C6108f) this.f1302b;
                C6107e c6107e = (C6107e) this.f1303c;
                Long l3 = (Long) obj;
                long jContentLength = c6108f.f9751b.contentLength();
                Long lValueOf = Long.valueOf(jContentLength);
                if (jContentLength == -1 || jContentLength == 0) {
                    lValueOf = null;
                }
                if (lValueOf != null) {
                    InterfaceC6106d interfaceC6106d = (InterfaceC6106d) c6108f.f9753d;
                    int iLongValue = (int) ((c6107e.f9748a * 100) / lValueOf.longValue());
                    if (l3 != null) {
                        int i = (l3.longValue() > (-1L) ? 1 : (l3.longValue() == (-1L) ? 0 : -1));
                    }
                    interfaceC6106d.update(iLongValue);
                }
                break;
            default:
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) this.f1302b;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.f1303c;
                ServerInfo serverInfo = (ServerInfo) obj;
                Log.i("OkHttp", "回调开始");
                String str5 = serverInfo != null ? serverInfo.f5730c : null;
                if (str5 != null && str5.length() != 0) {
                    AbstractC5830k.m5327d(serverInfo);
                    ?? r1 = serverInfo.f5730c;
                    AbstractC5830k.m5329f(r1, "getToken(...)");
                    ref$ObjectRef2.element = r1;
                }
                ref$BooleanRef.element = false;
                break;
        }
        return C5443s.f8405a;
    }
}
