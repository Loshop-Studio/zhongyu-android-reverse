package p125n7;

import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.TweenSpec;
import com.zykj.mistake.feature.collection.component.C4564j;
import com.zykj.mistake.feature.notebook.detail.C4846o0;
import com.zykj.view.board.play.C5353b;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.serialization.json.internal.AbstractC6044y;
import okio.internal.ResourceFileSystem;
import okio.internal.ZipEntry;
import okio.internal.ZipFilesKt;
import p045d6.C5443s;
import p101k7.C5759a;
import p152r6.InterfaceC6471c;
import p167t4.AbstractC6594g;

/* renamed from: n7.l */
/* loaded from: classes4.dex */
public final /* synthetic */ class C6237l implements InterfaceC6471c {

    /* renamed from: a */
    public final /* synthetic */ int f9983a;

    public /* synthetic */ C6237l(int i) {
        this.f9983a = i;
    }

    @Override // p152r6.InterfaceC6471c
    public final Object invoke(Object obj) {
        int i = 1;
        switch (this.f9983a) {
            case 0:
                C5759a buildSerialDescriptor = (C5759a) obj;
                AbstractC5830k.m5330g(buildSerialDescriptor, "$this$buildSerialDescriptor");
                C5759a.m5098a(buildSerialDescriptor, "JsonPrimitive", new C6239n(new C5353b(16)));
                C5759a.m5098a(buildSerialDescriptor, "JsonNull", new C6239n(new C5353b(17)));
                C5759a.m5098a(buildSerialDescriptor, "JsonLiteral", new C6239n(new C5353b(18)));
                C5759a.m5098a(buildSerialDescriptor, "JsonObject", new C6239n(new C5353b(19)));
                C5759a.m5098a(buildSerialDescriptor, "JsonArray", new C6239n(new C5353b(20)));
                return C5443s.f8405a;
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                AbstractC5830k.m5330g(entry, "<destruct>");
                String str = (String) entry.getKey();
                AbstractC6235j abstractC6235j = (AbstractC6235j) entry.getValue();
                StringBuilder sb = new StringBuilder();
                AbstractC6044y.m5728a(sb, str);
                sb.append(':');
                sb.append(abstractC6235j);
                return sb.toString();
            case 2:
                return Boolean.valueOf(ResourceFileSystem.toJarRoot$lambda$7((ZipEntry) obj));
            case 3:
                return Boolean.valueOf(ZipFilesKt.openZip$lambda$0((ZipEntry) obj));
            case 4:
                AnimatedContentTransitionScope composable = (AnimatedContentTransitionScope) obj;
                AbstractC5830k.m5330g(composable, "$this$composable");
                return AbstractC6594g.m6227c();
            case 5:
                AnimatedContentTransitionScope composable2 = (AnimatedContentTransitionScope) obj;
                AbstractC5830k.m5330g(composable2, "$this$composable");
                return AbstractC6594g.m6226b();
            case 6:
                AnimatedContentTransitionScope composable3 = (AnimatedContentTransitionScope) obj;
                AbstractC5830k.m5330g(composable3, "$this$composable");
                return AbstractC6594g.m6228d();
            case 7:
                AnimatedContentTransitionScope composable4 = (AnimatedContentTransitionScope) obj;
                AbstractC5830k.m5330g(composable4, "$this$composable");
                return EnterExitTransitionKt.slideInHorizontally(AbstractC6594g.f11006a, new C4564j(i));
            case 8:
                AnimatedContentTransitionScope composable5 = (AnimatedContentTransitionScope) obj;
                AbstractC5830k.m5330g(composable5, "$this$composable");
                return AbstractC6594g.m6228d();
            case 9:
                AnimatedContentTransitionScope composable6 = (AnimatedContentTransitionScope) obj;
                AbstractC5830k.m5330g(composable6, "$this$composable");
                return AbstractC6594g.m6227c();
            case 10:
                AnimatedContentTransitionScope composable7 = (AnimatedContentTransitionScope) obj;
                AbstractC5830k.m5330g(composable7, "$this$composable");
                return AbstractC6594g.m6226b();
            case 11:
                AnimatedContentTransitionScope composable8 = (AnimatedContentTransitionScope) obj;
                AbstractC5830k.m5330g(composable8, "$this$composable");
                return AbstractC6594g.m6227c();
            case 12:
                AnimatedContentTransitionScope composable9 = (AnimatedContentTransitionScope) obj;
                AbstractC5830k.m5330g(composable9, "$this$composable");
                return AbstractC6594g.m6226b();
            case 13:
                AnimatedContentTransitionScope composable10 = (AnimatedContentTransitionScope) obj;
                AbstractC5830k.m5330g(composable10, "$this$composable");
                return EnterExitTransitionKt.slideInHorizontally(AbstractC6594g.f11006a, new C4564j(i));
            case 14:
                AnimatedContentTransitionScope composable11 = (AnimatedContentTransitionScope) obj;
                AbstractC5830k.m5330g(composable11, "$this$composable");
                return AbstractC6594g.m6228d();
            case 15:
                AnimatedContentTransitionScope composable12 = (AnimatedContentTransitionScope) obj;
                AbstractC5830k.m5330g(composable12, "$this$composable");
                return AbstractC6594g.m6227c();
            case 16:
                AnimatedContentTransitionScope composable13 = (AnimatedContentTransitionScope) obj;
                AbstractC5830k.m5330g(composable13, "$this$composable");
                return AbstractC6594g.m6226b();
            case 17:
                ((Integer) obj).getClass();
                TweenSpec tweenSpec = AbstractC6594g.f11006a;
                return 0;
            case 18:
                AnimatedContentTransitionScope composable14 = (AnimatedContentTransitionScope) obj;
                AbstractC5830k.m5330g(composable14, "$this$composable");
                return EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(0, 0, null, 6, null), 0.0f, 2, null);
            case 19:
                AnimatedContentTransitionScope composable15 = (AnimatedContentTransitionScope) obj;
                AbstractC5830k.m5330g(composable15, "$this$composable");
                return EnterExitTransitionKt.slideInHorizontally(AbstractC6594g.f11006a, new C4564j(i));
            case 20:
                AnimatedContentTransitionScope composable16 = (AnimatedContentTransitionScope) obj;
                AbstractC5830k.m5330g(composable16, "$this$composable");
                return AbstractC6594g.m6228d();
            case 21:
                AnimatedContentTransitionScope composable17 = (AnimatedContentTransitionScope) obj;
                AbstractC5830k.m5330g(composable17, "$this$composable");
                return AbstractC6594g.m6227c();
            case 22:
                AnimatedContentTransitionScope composable18 = (AnimatedContentTransitionScope) obj;
                AbstractC5830k.m5330g(composable18, "$this$composable");
                return AbstractC6594g.m6226b();
            case 23:
                AnimatedContentTransitionScope composable19 = (AnimatedContentTransitionScope) obj;
                AbstractC5830k.m5330g(composable19, "$this$composable");
                return EnterExitTransitionKt.slideInHorizontally(AbstractC6594g.f11006a, new C4564j(i));
            case 24:
                AnimatedContentTransitionScope composable20 = (AnimatedContentTransitionScope) obj;
                AbstractC5830k.m5330g(composable20, "$this$composable");
                return AbstractC6594g.m6228d();
            case 25:
                C4846o0 it = (C4846o0) obj;
                AbstractC5830k.m5330g(it, "it");
                return it.f7218d;
            case 26:
                C4846o0 it2 = (C4846o0) obj;
                AbstractC5830k.m5330g(it2, "it");
                return it2.f7219e;
            case 27:
                C4846o0 it3 = (C4846o0) obj;
                AbstractC5830k.m5330g(it3, "it");
                return it3.f7220f;
            case 28:
                C4846o0 it4 = (C4846o0) obj;
                AbstractC5830k.m5330g(it4, "it");
                return it4.f7221g;
            default:
                return Boolean.valueOf(obj == null);
        }
    }
}
