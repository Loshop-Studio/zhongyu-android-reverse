package android.view;

import android.net.Uri;
import android.os.Messenger;
import android.view.Lifecycle;
import android.view.compose.C2755f;
import android.view.compose.LifecycleEffectKt;
import android.view.compose.LifecycleResumePauseEffectScope;
import android.view.compose.LifecycleStartStopEffectScope;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.C2826a;
import androidx.navigation.C2861i;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import androidx.navigation.serialization.C2872b;
import com.zykj.mistake.R;
import com.zykj.mistake.entity.resp.CustomTagInfo;
import com.zykj.mistake.feature.ask.C4498x51986525;
import com.zykj.mistake.feature.ask.C4536n;
import com.zykj.mistake.feature.collection.component.C4564j;
import com.zykj.mistake.feature.collection.detail.C4624v0;
import com.zykj.mistake.feature.collection.detail.C4632z0;
import com.zykj.mistake.feature.collection.list.C4692x153f4377;
import com.zykj.mistake.feature.collection.list.C4700a0;
import com.zykj.mistake.feature.collection.list.C4702b0;
import com.zykj.mistake.feature.collection.list.C4723v;
import com.zykj.mistake.feature.mistake.model.MistakeTagType;
import com.zykj.mistake.feature.notebook.detail.C4779d;
import com.zykj.mistake.feature.notebook.detail.C4804h0;
import com.zykj.mistake.feature.notebook.detail.C4817j1;
import com.zykj.mistake.feature.notebook.detail.C4837m3;
import com.zykj.mistake.feature.notebook.detail.C4889v1;
import com.zykj.mistake.feature.notebook.detail.MistakeDetailNewContract$EntryMode;
import com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel;
import com.zykj.mistake.feature.notebook.detail.ViewOnClickListenerC4758a;
import com.zykj.mistake.feature.notebook.list.C4917xd71aa854;
import com.zykj.mistake.feature.notebook.list.C4941e1;
import com.zykj.mistake.feature.review.C5009q;
import com.zykj.mistake.network.ApiResp;
import com.zykj.mistake.utils.AbstractC5099d;
import com.zykj.view.board.evaluation.BlackboardEvaluationFragment$initBoardConfig$1$2;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC5802q;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.AbstractC5855p;
import kotlinx.coroutines.flow.C5946n0;
import p045d6.C5443s;
import p045d6.InterfaceC5428d;
import p137p4.C6383b;
import p137p4.C6390i;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6475g;
import p154s.C6537k;
import p175u4.C6620g;
import p191w4.InterfaceC6718c;
import p212z4.C6818e;

/* renamed from: androidx.lifecycle.i */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2764i implements InterfaceC6471c {

    /* renamed from: a */
    public final /* synthetic */ int f1179a;

    /* renamed from: b */
    public final /* synthetic */ Object f1180b;

    /* renamed from: c */
    public final /* synthetic */ Object f1181c;

    /* renamed from: d */
    public final /* synthetic */ Object f1182d;

    public /* synthetic */ C2764i(int i, Object obj, Object obj2, InterfaceC6471c interfaceC6471c) {
        this.f1179a = i;
        this.f1181c = obj;
        this.f1182d = obj2;
        this.f1180b = interfaceC6471c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v24, types: [com.zykj.mistake.feature.notebook.detail.b] */
    /* JADX WARN: Type inference failed for: r2v13, types: [com.zykj.mistake.feature.notebook.detail.b] */
    @Override // p152r6.InterfaceC6471c
    public final Object invoke(Object obj) {
        C4779d c4779d;
        int i = this.f1179a;
        C5443s c5443s = C5443s.f8405a;
        final int i8 = 1;
        Object obj2 = this.f1182d;
        Object obj3 = this.f1180b;
        Object obj4 = this.f1181c;
        switch (i) {
            case 0:
                return Transformations.switchMap$lambda$3((InterfaceC6471c) obj3, (Ref$ObjectRef) obj4, (MediatorLiveData) obj2, obj);
            case 1:
                return LifecycleEffectKt.LifecycleEventEffect$lambda$4$lambda$3((LifecycleOwner) obj3, (Lifecycle.Event) obj4, (State) obj2, (DisposableEffectScope) obj);
            case 2:
                return LifecycleEffectKt.LifecycleStartEffectImpl$lambda$19$lambda$18((LifecycleOwner) obj4, (LifecycleStartStopEffectScope) obj2, (InterfaceC6471c) obj3, (DisposableEffectScope) obj);
            case 3:
                return LifecycleEffectKt.LifecycleResumeEffectImpl$lambda$34$lambda$33((LifecycleOwner) obj4, (LifecycleResumePauseEffectScope) obj2, (InterfaceC6471c) obj3, (DisposableEffectScope) obj);
            case 4:
                return Navigator.navigate$lambda$1((Navigator) obj3, (NavOptions) obj4, (Navigator.Extras) obj2, (NavBackStackEntry) obj);
            case 5:
                final C4536n c4536n = (C4536n) obj4;
                final BoxWithConstraintsScope boxWithConstraintsScope = (BoxWithConstraintsScope) obj2;
                final InterfaceC6471c interfaceC6471c = (InterfaceC6471c) obj3;
                LazyGridScope LazyVerticalGrid = (LazyGridScope) obj;
                AbstractC5830k.m5330g(LazyVerticalGrid, "$this$LazyVerticalGrid");
                final List list = c4536n.f6278e;
                final C2826a c2826a = new C2826a(28);
                final C4498x51986525 c4498x51986525 = new InterfaceC6471c() { // from class: com.zykj.mistake.feature.ask.MistakeAskMaterialScreenKt$AskMaterialContent$lambda$35$lambda$23$lambda$22$lambda$21$$inlined$items$default$1
                    @Override // p152r6.InterfaceC6471c
                    public final Void invoke(C4549y c4549y) {
                        return null;
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj5) {
                        return invoke((C4549y) obj5);
                    }
                };
                LazyVerticalGrid.items(list.size(), new InterfaceC6471c() { // from class: com.zykj.mistake.feature.ask.MistakeAskMaterialScreenKt$AskMaterialContent$lambda$35$lambda$23$lambda$22$lambda$21$$inlined$items$default$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj5) {
                        return invoke(((Number) obj5).intValue());
                    }

                    public final Object invoke(int i9) {
                        return c2826a.invoke(list.get(i9));
                    }
                }, null, new InterfaceC6471c() { // from class: com.zykj.mistake.feature.ask.MistakeAskMaterialScreenKt$AskMaterialContent$lambda$35$lambda$23$lambda$22$lambda$21$$inlined$items$default$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj5) {
                        return invoke(((Number) obj5).intValue());
                    }

                    public final Object invoke(int i9) {
                        return c4498x51986525.invoke(list.get(i9));
                    }
                }, ComposableLambdaKt.composableLambdaInstance(699646206, true, new InterfaceC6475g() { // from class: com.zykj.mistake.feature.ask.MistakeAskMaterialScreenKt$AskMaterialContent$lambda$35$lambda$23$lambda$22$lambda$21$$inlined$items$default$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // p152r6.InterfaceC6475g
                    public /* bridge */ /* synthetic */ Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                        invoke((LazyGridItemScope) obj5, ((Number) obj6).intValue(), (Composer) obj7, ((Number) obj8).intValue());
                        return C5443s.f8405a;
                    }

                    @Composable
                    public final void invoke(LazyGridItemScope lazyGridItemScope, int i9, Composer composer, int i10) {
                        int i11;
                        if ((i10 & 6) == 0) {
                            i11 = (composer.changed(lazyGridItemScope) ? 4 : 2) | i10;
                        } else {
                            i11 = i10;
                        }
                        if ((i10 & 48) == 0) {
                            i11 |= composer.changed(i9) ? 32 : 16;
                        }
                        if (!composer.shouldExecute((i11 & 147) != 146, i11 & 1)) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(699646206, i11, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:542)");
                        }
                        C4549y c4549y = (C4549y) list.get(i9);
                        composer.startReplaceGroup(534751001);
                        MistakeAskMaterialContract$MaterialType mistakeAskMaterialContract$MaterialType = c4536n.f6274a;
                        Modifier modifierM7295height3ABfNKs = SizeKt.m7295height3ABfNKs(Modifier.INSTANCE, boxWithConstraintsScope.mo7168getMaxHeightD9Ej5fM());
                        boolean zChanged = composer.changed(interfaceC6471c) | composer.changedInstance(c4536n) | composer.changedInstance(c4549y);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new C4535m0(interfaceC6471c, c4536n, c4549y, 0);
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        AbstractC4539o0.m4007e(mistakeAskMaterialContract$MaterialType, c4549y, modifierM7295height3ABfNKs, true, (InterfaceC6469a) objRememberedValue, composer, 3072);
                        composer.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
                return c5443s;
            case 6:
                InterfaceC6471c interfaceC6471c2 = (InterfaceC6471c) obj3;
                InterfaceC6471c interfaceC6471c3 = (InterfaceC6471c) obj2;
                C6383b it = (C6383b) obj;
                AbstractC5830k.m5330g(it, "it");
                String str = it.f10446a;
                if (((C4632z0) obj4).f6542G) {
                    interfaceC6471c2.invoke(new C4624v0(str));
                } else {
                    interfaceC6471c3.invoke(str);
                }
                return c5443s;
            case 7:
                final C4723v c4723v = (C4723v) obj4;
                final InterfaceC6471c interfaceC6471c4 = (InterfaceC6471c) obj3;
                final InterfaceC6471c interfaceC6471c5 = (InterfaceC6471c) obj2;
                LazyGridScope LazyVerticalGrid2 = (LazyGridScope) obj;
                AbstractC5830k.m5330g(LazyVerticalGrid2, "$this$LazyVerticalGrid");
                final List list2 = c4723v.f6776c;
                final C4564j c4564j = new C4564j(2);
                final C4692x153f4377 c4692x153f4377 = new InterfaceC6471c() { // from class: com.zykj.mistake.feature.collection.list.MistakeCollectionScreenKt$MistakeCollectionListContent$lambda$33$lambda$32$lambda$31$$inlined$items$default$1
                    @Override // p152r6.InterfaceC6471c
                    public final Void invoke(C4701b c4701b) {
                        return null;
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj5) {
                        return invoke((C4701b) obj5);
                    }
                };
                LazyVerticalGrid2.items(list2.size(), new InterfaceC6471c() { // from class: com.zykj.mistake.feature.collection.list.MistakeCollectionScreenKt$MistakeCollectionListContent$lambda$33$lambda$32$lambda$31$$inlined$items$default$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj5) {
                        return invoke(((Number) obj5).intValue());
                    }

                    public final Object invoke(int i9) {
                        return c4564j.invoke(list2.get(i9));
                    }
                }, null, new InterfaceC6471c() { // from class: com.zykj.mistake.feature.collection.list.MistakeCollectionScreenKt$MistakeCollectionListContent$lambda$33$lambda$32$lambda$31$$inlined$items$default$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj5) {
                        return invoke(((Number) obj5).intValue());
                    }

                    public final Object invoke(int i9) {
                        return c4692x153f4377.invoke(list2.get(i9));
                    }
                }, ComposableLambdaKt.composableLambdaInstance(699646206, true, new InterfaceC6475g() { // from class: com.zykj.mistake.feature.collection.list.MistakeCollectionScreenKt$MistakeCollectionListContent$lambda$33$lambda$32$lambda$31$$inlined$items$default$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // p152r6.InterfaceC6475g
                    public /* bridge */ /* synthetic */ Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                        invoke((LazyGridItemScope) obj5, ((Number) obj6).intValue(), (Composer) obj7, ((Number) obj8).intValue());
                        return C5443s.f8405a;
                    }

                    @Composable
                    public final void invoke(LazyGridItemScope lazyGridItemScope, int i9, Composer composer, int i10) {
                        int i11;
                        C4701b c4701b;
                        if ((i10 & 6) == 0) {
                            i11 = (composer.changed(lazyGridItemScope) ? 4 : 2) | i10;
                        } else {
                            i11 = i10;
                        }
                        if ((i10 & 48) == 0) {
                            i11 |= composer.changed(i9) ? 32 : 16;
                        }
                        if (!composer.shouldExecute((i11 & 147) != 146, i11 & 1)) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(699646206, i11, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:542)");
                        }
                        C4701b c4701b2 = (C4701b) list2.get(i9);
                        composer.startReplaceGroup(1909017013);
                        C4723v c4723v2 = c4723v;
                        boolean z8 = c4723v2.f6784k;
                        boolean zContains = c4723v2.f6785l.contains(c4701b2.f6746a);
                        boolean zChangedInstance = composer.changedInstance(c4723v) | composer.changed(interfaceC6471c4) | composer.changed(c4701b2) | composer.changed(interfaceC6471c5);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            c4701b = c4701b2;
                            Object c4700a0 = new C4700a0(c4723v, interfaceC6471c4, c4701b, interfaceC6471c5, 0);
                            composer.updateRememberedValue(c4700a0);
                            objRememberedValue = c4700a0;
                        } else {
                            c4701b = c4701b2;
                        }
                        InterfaceC6469a interfaceC6469a = (InterfaceC6469a) objRememberedValue;
                        boolean zChangedInstance2 = composer.changedInstance(c4723v) | composer.changed(interfaceC6471c4) | composer.changed(c4701b);
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new C4702b0(0, c4723v, c4701b, interfaceC6471c4);
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        AbstractC4704c0.m4094b(c4701b, z8, zContains, interfaceC6469a, (InterfaceC6469a) objRememberedValue2, composer, 0);
                        composer.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
                return c5443s;
            case 8:
                String str2 = (String) obj3;
                String str3 = (String) obj4;
                InterfaceC6469a onClick = (InterfaceC6469a) obj2;
                final C4779d container = (C4779d) obj;
                AbstractC5830k.m5330g(container, "container");
                AbstractC5830k.m5330g(onClick, "onClick");
                container.setOnClickListener(new ViewOnClickListenerC4758a(onClick, 0));
                if (AbstractC5830k.m5325b(container.f6949d, str2)) {
                    c4779d = container;
                } else {
                    container.f6949d = str2;
                    C6537k c6537k = container.f6952g;
                    if (c6537k != null) {
                        c6537k.m6187a();
                    }
                    container.f6948c.setVisibility(8);
                    C4779d c4779d2 = container;
                    c4779d2.f6952g = c4779d2.m4179b(container.f6946a, str2, false, new InterfaceC6469a() { // from class: com.zykj.mistake.feature.notebook.detail.b
                        @Override // p152r6.InterfaceC6469a
                        public final Object invoke() {
                            switch (i) {
                                case 0:
                                    C4779d c4779d3 = container;
                                    c4779d3.f6946a.setVisibility(8);
                                    c4779d3.f6947b.setVisibility(8);
                                    c4779d3.f6948c.setVisibility(0);
                                    break;
                                default:
                                    container.f6948c.setVisibility(8);
                                    break;
                            }
                            return C5443s.f8405a;
                        }
                    }, new InterfaceC6469a() { // from class: com.zykj.mistake.feature.notebook.detail.b
                        @Override // p152r6.InterfaceC6469a
                        public final Object invoke() {
                            switch (i8) {
                                case 0:
                                    C4779d c4779d3 = container;
                                    c4779d3.f6946a.setVisibility(8);
                                    c4779d3.f6947b.setVisibility(8);
                                    c4779d3.f6948c.setVisibility(0);
                                    break;
                                default:
                                    container.f6948c.setVisibility(8);
                                    break;
                            }
                            return C5443s.f8405a;
                        }
                    });
                    c4779d = c4779d2;
                }
                boolean z8 = ((str2 == null || str2.length() == 0) ? 1 : 0) ^ 1;
                if (!AbstractC5830k.m5325b(c4779d.f6950e, str3) || c4779d.f6951f != z8) {
                    c4779d.f6950e = str3;
                    c4779d.f6951f = z8;
                    C6537k c6537k2 = c4779d.f6953h;
                    if (c6537k2 != null) {
                        c6537k2.m6187a();
                    }
                    c4779d.f6953h = c4779d.m4179b(c4779d.f6947b, str3, z8, null, null);
                }
                return c5443s;
            case 9:
                C6818e c6818e = (C6818e) obj3;
                c6818e.f11548c.startCrop((Uri) obj, new C4804h0((InterfaceC6718c) obj4, c6818e.f11546a, (Messenger) obj2, i8));
                return c5443s;
            case 10:
                MistakeDetailNewViewModel mistakeDetailNewViewModel = (MistakeDetailNewViewModel) obj3;
                C4889v1 c4889v1 = (C4889v1) obj4;
                ArrayList arrayList = c4889v1.f7360e;
                C4837m3 c4837m3 = (C4837m3) obj2;
                AbstractC5830k.m5330g((ApiResp) obj, "it");
                ListBuilder listBuilderM5278q = AbstractC5806u.m5278q();
                Integer num = c4889v1.f7356a;
                if (num != null) {
                    int iIntValue = num.intValue();
                    String str4 = (String) AbstractC5802q.m5195V(iIntValue - 1, AbstractC5099d.f8030a);
                    listBuilderM5278q.add(new CustomTagInfo(str4 == null ? "" : str4, iIntValue, 0, 0, 4, null));
                }
                Integer num2 = c4889v1.f7357b;
                if (num2 != null) {
                    int iIntValue2 = num2.intValue();
                    String str5 = (String) AbstractC5802q.m5195V(iIntValue2 - 1, AbstractC5099d.f8031b);
                    listBuilderM5278q.add(new CustomTagInfo(str5 == null ? "" : str5, iIntValue2, 0, 1, 4, null));
                }
                Integer num3 = c4889v1.f7358c;
                if (num3 != null) {
                    int iIntValue3 = num3.intValue();
                    String str6 = (String) AbstractC5802q.m5195V(iIntValue3 - 1, AbstractC5099d.f8032c);
                    listBuilderM5278q.add(new CustomTagInfo(str6 == null ? "" : str6, iIntValue3, 0, 2, 4, null));
                }
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj5 = arrayList.get(i9);
                    i9++;
                    C6390i c6390i = (C6390i) obj5;
                    if (c6390i.f10481b == MistakeTagType.BLUE && c6390i.f10482c != null) {
                        arrayList2.add(obj5);
                    }
                }
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj6 = arrayList2.get(i);
                    i++;
                    C6390i c6390i2 = (C6390i) obj6;
                    String str7 = c6390i2.f10480a;
                    AbstractC5830k.m5327d(c6390i2.f10482c);
                    listBuilderM5278q.add(new CustomTagInfo(str7, r9.intValue(), 0, -1, 4, null));
                }
                List listBuild = listBuilderM5278q.build();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj7 : listBuild) {
                    if (!AbstractC5855p.m5382P(((CustomTagInfo) obj7).getName())) {
                        arrayList3.add(obj7);
                    }
                }
                ArrayList arrayListM4150e0 = mistakeDetailNewViewModel.m4150e0(new C2861i(c4889v1, 14));
                C5946n0 c5946n0 = mistakeDetailNewViewModel.f6876e;
                while (true) {
                    Object value = c5946n0.getValue();
                    ArrayList arrayList4 = arrayList3;
                    ArrayList arrayList5 = arrayList;
                    if (c5946n0.m5569i(value, C4837m3.m4207a((C4837m3) value, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, arrayList4, false, false, false, arrayList5, null, false, false, true, null, false, false, false, false, false, null, null, null, null, null, null, null, false, false, false, null, false, false, 0, arrayListM4150e0, 0, false, null, null, null, null, false, false, false, false, null, null, false, null, false, false, false, false, false, null, 0, -4472833, -2049, 1))) {
                        if (c4837m3.f7153d == MistakeDetailNewContract$EntryMode.REVIEW_RECOMMEND) {
                            C5009q c5009q = C5009q.f7711a;
                            C5009q.m4327g(c4837m3.f7155e, c4837m3.f7149b, arrayList4);
                        }
                        mistakeDetailNewViewModel.m4144S(new C4817j1(mistakeDetailNewViewModel.m4131B(R.string.set_tag_success)));
                        return c5443s;
                    }
                    arrayList3 = arrayList4;
                    arrayList = arrayList5;
                }
                break;
            case 11:
                DisposableEffectScope DisposableEffect = (DisposableEffectScope) obj;
                AbstractC5830k.m5330g(DisposableEffect, "$this$DisposableEffect");
                ((NavBackStackEntry) obj3).getLifecycle().addObserver(new C2755f(i8, (String) obj4, (C6620g) obj2));
                return new DisposableEffectResult() { // from class: com.zykj.mistake.feature.notebook.detail.MistakeDetailRouteKt$MistakeDetailRoute$lambda$6$lambda$5$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                    }
                };
            case 12:
                final C4941e1 c4941e1 = (C4941e1) obj4;
                final InterfaceC6471c interfaceC6471c6 = (InterfaceC6471c) obj3;
                final InterfaceC6471c interfaceC6471c7 = (InterfaceC6471c) obj2;
                LazyGridScope LazyVerticalGrid3 = (LazyGridScope) obj;
                AbstractC5830k.m5330g(LazyVerticalGrid3, "$this$LazyVerticalGrid");
                final List list3 = c4941e1.f7504d;
                final C4564j c4564j2 = new C4564j(26);
                final C4917xd71aa854 c4917xd71aa854 = new InterfaceC6471c() { // from class: com.zykj.mistake.feature.notebook.list.MistakeNotebookScreenKt$MistakeNotebookGrid$lambda$37$lambda$36$lambda$35$$inlined$items$default$1
                    @Override // p152r6.InterfaceC6471c
                    public final Void invoke(C6383b c6383b) {
                        return null;
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj8) {
                        return invoke((C6383b) obj8);
                    }
                };
                LazyVerticalGrid3.items(list3.size(), new InterfaceC6471c() { // from class: com.zykj.mistake.feature.notebook.list.MistakeNotebookScreenKt$MistakeNotebookGrid$lambda$37$lambda$36$lambda$35$$inlined$items$default$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj8) {
                        return invoke(((Number) obj8).intValue());
                    }

                    public final Object invoke(int i10) {
                        return c4564j2.invoke(list3.get(i10));
                    }
                }, null, new InterfaceC6471c() { // from class: com.zykj.mistake.feature.notebook.list.MistakeNotebookScreenKt$MistakeNotebookGrid$lambda$37$lambda$36$lambda$35$$inlined$items$default$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj8) {
                        return invoke(((Number) obj8).intValue());
                    }

                    public final Object invoke(int i10) {
                        return c4917xd71aa854.invoke(list3.get(i10));
                    }
                }, ComposableLambdaKt.composableLambdaInstance(699646206, true, new InterfaceC6475g() { // from class: com.zykj.mistake.feature.notebook.list.MistakeNotebookScreenKt$MistakeNotebookGrid$lambda$37$lambda$36$lambda$35$$inlined$items$default$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // p152r6.InterfaceC6475g
                    public /* bridge */ /* synthetic */ Object invoke(Object obj8, Object obj9, Object obj10, Object obj11) {
                        invoke((LazyGridItemScope) obj8, ((Number) obj9).intValue(), (Composer) obj10, ((Number) obj11).intValue());
                        return C5443s.f8405a;
                    }

                    @Composable
                    public final void invoke(LazyGridItemScope lazyGridItemScope, int i10, Composer composer, int i11) {
                        int i12;
                        C6383b c6383b;
                        if ((i11 & 6) == 0) {
                            i12 = (composer.changed(lazyGridItemScope) ? 4 : 2) | i11;
                        } else {
                            i12 = i11;
                        }
                        if ((i11 & 48) == 0) {
                            i12 |= composer.changed(i10) ? 32 : 16;
                        }
                        if (!composer.shouldExecute((i12 & 147) != 146, i12 & 1)) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(699646206, i12, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:542)");
                        }
                        C6383b c6383b2 = (C6383b) list3.get(i10);
                        composer.startReplaceGroup(-357185891);
                        C4941e1 c4941e12 = c4941e1;
                        boolean z9 = c4941e12.f7509i;
                        boolean zContains = c4941e12.f7510j.contains(c6383b2.f10446a);
                        boolean zChangedInstance = composer.changedInstance(c4941e1) | composer.changed(interfaceC6471c6) | composer.changedInstance(c6383b2) | composer.changed(interfaceC6471c7);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            c6383b = c6383b2;
                            Object c4700a0 = new C4700a0(c4941e1, interfaceC6471c6, c6383b, interfaceC6471c7, 1);
                            composer.updateRememberedValue(c4700a0);
                            objRememberedValue = c4700a0;
                        } else {
                            c6383b = c6383b2;
                        }
                        InterfaceC6469a interfaceC6469a = (InterfaceC6469a) objRememberedValue;
                        boolean zChangedInstance2 = composer.changedInstance(c4941e1) | composer.changed(interfaceC6471c6) | composer.changedInstance(c6383b);
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new C4702b0(1, c4941e1, c6383b, interfaceC6471c6);
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        AbstractC4953i1.m4304a(c6383b, z9, zContains, interfaceC6469a, (InterfaceC6469a) objRememberedValue2, composer, 0);
                        composer.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
                if (c4941e1.f7506f || !c4941e1.f7507g) {
                    LazyGridScope.item$default(LazyVerticalGrid3, null, new C4564j(27), null, ComposableLambdaKt.composableLambdaInstance(2035243661, true, new C2872b(c4941e1, 4)), 5, null);
                }
                return c5443s;
            default:
                return BlackboardEvaluationFragment$initBoardConfig$1$2.showCropView$lambda$3((File) obj4, (InterfaceC6471c) obj3, (InterfaceC6469a) obj2, (Uri) obj);
        }
    }

    public /* synthetic */ C2764i(Object obj, Object obj2, int i, Object obj3) {
        this.f1179a = i;
        this.f1180b = obj;
        this.f1181c = obj2;
        this.f1182d = obj3;
    }

    public /* synthetic */ C2764i(Object obj, InterfaceC6471c interfaceC6471c, InterfaceC5428d interfaceC5428d, int i) {
        this.f1179a = i;
        this.f1181c = obj;
        this.f1180b = interfaceC6471c;
        this.f1182d = interfaceC5428d;
    }
}
