package androidx.navigation.serialization;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.TextUnitKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.zykj.mistake.entity.req.CreateOrUpdateMistakeReq;
import com.zykj.mistake.feature.ask.AbstractC4539o0;
import com.zykj.mistake.feature.ask.C4515c0;
import com.zykj.mistake.feature.collection.filter.AbstractC4655i;
import com.zykj.mistake.feature.collection.filter.C4643c;
import com.zykj.mistake.feature.notebook.detail.C4847o1;
import com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel;
import com.zykj.mistake.feature.notebook.list.C4941e1;
import com.zykj.mistake.main.drawer.AbstractC5036g;
import com.zykj.mistake.main.drawer.C5042m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.coroutines.sync.C6001a;
import kotlinx.coroutines.sync.C6002b;
import p045d6.C5443s;
import p076h7.C5639b;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6474f;

/* renamed from: androidx.navigation.serialization.b */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2872b implements InterfaceC6474f {

    /* renamed from: a */
    public final /* synthetic */ int f1346a;

    /* renamed from: b */
    public final /* synthetic */ Object f1347b;

    public /* synthetic */ C2872b(Object obj, int i) {
        this.f1346a = i;
        this.f1347b = obj;
    }

    @Override // p152r6.InterfaceC6474f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f1346a) {
            case 0:
                break;
            case 1:
                C4515c0 c4515c0 = (C4515c0) this.f1347b;
                FlowRowScope FlowRow = (FlowRowScope) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                AbstractC5830k.m5330g(FlowRow, "$this$FlowRow");
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-230376897, iIntValue, -1, "com.zykj.mistake.feature.ask.TextAnswerMaterialPreview.<anonymous>.<anonymous> (MistakeAskMaterialScreen.kt:383)");
                    }
                    List list = c4515c0.f6218b;
                    boolean z8 = c4515c0.f6221e;
                    List list2 = c4515c0.f6219c;
                    boolean z9 = list.containsAll(list2) && list2.containsAll(list);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        Composer composer2 = composer;
                        TextKt.m9105Text4IGK_g((String) it.next(), PaddingKt.m7263paddingVpY3zN4(BackgroundKt.m6753backgroundbw27NRU(Modifier.INSTANCE, !z8 ? AbstractC4539o0.f6288g : z9 ? AbstractC4539o0.f6290i : AbstractC4539o0.f6291j, RoundedCornerShapeKt.m7559RoundedCornerShape0680j_4(C2331Dp.m13305constructorimpl(3))), C2331Dp.m13305constructorimpl(12), C2331Dp.m13305constructorimpl(7)), z8 ? Color.INSTANCE.m10719getWhite0d7_KjU() : AbstractC4539o0.f6289h, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (InterfaceC6471c) null, (TextStyle) null, composer2, 3072, 3072, 122864);
                        composer = composer2;
                        z8 = z8;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            case 2:
                ArrayList arrayList = (ArrayList) this.f1347b;
                FlowRowScope FlowRow2 = (FlowRowScope) obj;
                Composer composer3 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                AbstractC5830k.m5330g(FlowRow2, "$this$FlowRow");
                if (composer3.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1133135619, iIntValue2, -1, "com.zykj.mistake.feature.collection.filter.FilterSection.<anonymous> (MistakeCollectionFilterPanel.kt:271)");
                    }
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        C4643c c4643c = (C4643c) arrayList.get(i);
                        AbstractC4655i.m4076b(c4643c.f6585a, c4643c.f6586b, c4643c.f6587c, c4643c.f6588d, c4643c.f6589e, composer3, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                break;
            case 3:
                CreateOrUpdateMistakeReq createOrUpdateMistakeReq = (CreateOrUpdateMistakeReq) obj;
                ((MistakeDetailNewViewModel) this.f1347b).m4162t(new C4847o1(createOrUpdateMistakeReq.getTopicId(), (String) obj2, createOrUpdateMistakeReq.getTitle(), createOrUpdateMistakeReq.getStemShoot(), (List) obj3));
                break;
            case 4:
                C4941e1 c4941e1 = (C4941e1) this.f1347b;
                LazyGridItemScope item = (LazyGridItemScope) obj;
                Composer composer4 = (Composer) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                AbstractC5830k.m5330g(item, "$this$item");
                if (composer4.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2035243661, iIntValue3, -1, "com.zykj.mistake.feature.notebook.list.MistakeNotebookGrid.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MistakeNotebookScreen.kt:255)");
                    }
                    TextKt.m9105Text4IGK_g(c4941e1.f7506f ? "加载中..." : "没有更多了", PaddingKt.m7264paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, C2331Dp.m13305constructorimpl(4), 1, null), ColorKt.Color(4288256409L), TextUnitKt.getSp(10), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m13182boximpl(TextAlign.INSTANCE.m13189getCentere0LSkKk()), 0L, 0, false, 0, 0, (InterfaceC6471c) null, (TextStyle) null, composer4, 3504, 0, 130544);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                break;
            case 5:
                InterfaceC6469a interfaceC6469a = (InterfaceC6469a) this.f1347b;
                AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj;
                Composer composer5 = (Composer) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                AbstractC5830k.m5330g(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(56123094, iIntValue4, -1, "com.zykj.mistake.main.drawer.MainEndDrawerHost.<anonymous>.<anonymous> (MainEndDrawerHost.kt:50)");
                }
                BoxKt.Box(ClickableKt.m6790clickableXHw0xAI$default(BackgroundKt.m6754backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Color.m10681copywmQWz5c$default(Color.INSTANCE.m10708getBlack0d7_KjU(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), false, null, null, interfaceC6469a, 7, null), composer5, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                break;
            case 6:
                List<C5042m> list3 = (List) this.f1347b;
                FlowRowScope FlowRow3 = (FlowRowScope) obj;
                Composer composer6 = (Composer) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                AbstractC5830k.m5330g(FlowRow3, "$this$FlowRow");
                if (composer6.shouldExecute((iIntValue5 & 17) != 16, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-449650903, iIntValue5, -1, "com.zykj.mistake.main.drawer.NotebookFilterSection.<anonymous> (MistakeNotebookFilterPanel.kt:248)");
                    }
                    for (C5042m c5042m : list3) {
                        AbstractC5036g.m4366c(c5042m.f7898a, c5042m.f7899b, c5042m.f7900c, c5042m.f7901d, c5042m.f7902e, c5042m.f7903f, composer6, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                break;
            case 7:
                break;
            case 8:
                C6001a c6001a = (C6001a) this.f1347b;
                C6001a.f9500h.set(c6001a, null);
                c6001a.m5617g(null);
                break;
            default:
                ((C6002b) this.f1347b).m5620c();
                break;
        }
        return C5443s.f8405a;
    }

    public /* synthetic */ C2872b(C6001a c6001a, C5639b c5639b) {
        this.f1346a = 8;
        this.f1347b = c6001a;
    }
}
