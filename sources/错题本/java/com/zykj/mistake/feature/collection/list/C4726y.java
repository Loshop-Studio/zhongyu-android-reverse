package com.zykj.mistake.feature.collection.list;

import android.view.C2764i;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorKt;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.navigation.C2857e;
import com.zykj.mistake.entity.resp.CustomTagInfo;
import com.zykj.mistake.feature.notebook.list.C4941e1;
import com.zykj.mistake.main.C5021a1;
import com.zykj.mistake.main.drawer.AbstractC5041l;
import com.zykj.mistake.main.drawer.C5037h;
import kotlin.jvm.internal.AbstractC5830k;
import p045d6.C5443s;
import p045d6.InterfaceC5428d;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;

/* renamed from: com.zykj.mistake.feature.collection.list.y */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4726y implements InterfaceC6474f {

    /* renamed from: a */
    public final /* synthetic */ int f6797a;

    /* renamed from: b */
    public final /* synthetic */ Object f6798b;

    /* renamed from: c */
    public final /* synthetic */ Object f6799c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC5428d f6800d;

    /* renamed from: e */
    public final /* synthetic */ Object f6801e;

    public /* synthetic */ C4726y(Object obj, Object obj2, Object obj3, InterfaceC5428d interfaceC5428d, int i) {
        this.f6797a = i;
        this.f6798b = obj;
        this.f6801e = obj2;
        this.f6799c = obj3;
        this.f6800d = interfaceC5428d;
    }

    @Override // p152r6.InterfaceC6474f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z8;
        switch (this.f6797a) {
            case 0:
                LazyGridState lazyGridState = (LazyGridState) this.f6798b;
                C4723v c4723v = (C4723v) this.f6801e;
                InterfaceC6471c interfaceC6471c = (InterfaceC6471c) this.f6799c;
                InterfaceC6471c interfaceC6471c2 = (InterfaceC6471c) this.f6800d;
                BoxScope PullToRefreshBox = (BoxScope) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                AbstractC5830k.m5330g(PullToRefreshBox, "$this$PullToRefreshBox");
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(56582481, iIntValue, -1, "com.zykj.mistake.feature.collection.list.MistakeCollectionListContent.<anonymous> (MistakeCollectionScreen.kt:218)");
                    }
                    GridCells.Fixed fixed = new GridCells.Fixed(3);
                    Modifier modifierM6754backgroundbw27NRU$default = BackgroundKt.m6754backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ColorKt.Color(4294309882L), null, 2, null);
                    float f = 18;
                    float f7 = 16;
                    PaddingValues paddingValuesM7258PaddingValuesa9UjIt4 = PaddingKt.m7258PaddingValuesa9UjIt4(C2331Dp.m13305constructorimpl(f), C2331Dp.m13305constructorimpl(f7), C2331Dp.m13305constructorimpl(f), C2331Dp.m13305constructorimpl(f7));
                    Arrangement arrangement = Arrangement.INSTANCE;
                    float f8 = 14;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM7143spacedBy0680j_4 = arrangement.m7143spacedBy0680j_4(C2331Dp.m13305constructorimpl(f8));
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM7143spacedBy0680j_42 = arrangement.m7143spacedBy0680j_4(C2331Dp.m13305constructorimpl(f8));
                    boolean zChangedInstance = composer.changedInstance(c4723v) | composer.changed(interfaceC6471c) | composer.changed(interfaceC6471c2);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new C2764i(c4723v, interfaceC6471c, interfaceC6471c2, 7);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    LazyGridDslKt.LazyVerticalGrid(fixed, modifierM6754backgroundbw27NRU$default, lazyGridState, paddingValuesM7258PaddingValuesa9UjIt4, false, horizontalOrVerticalM7143spacedBy0680j_42, horizontalOrVerticalM7143spacedBy0680j_4, null, false, null, (InterfaceC6471c) objRememberedValue, composer, 1772592, 0, 912);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            case 1:
                LazyGridState lazyGridState2 = (LazyGridState) this.f6798b;
                C4941e1 c4941e1 = (C4941e1) this.f6801e;
                InterfaceC6471c interfaceC6471c3 = (InterfaceC6471c) this.f6799c;
                InterfaceC6471c interfaceC6471c4 = (InterfaceC6471c) this.f6800d;
                BoxScope PullToRefreshBox2 = (BoxScope) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                AbstractC5830k.m5330g(PullToRefreshBox2, "$this$PullToRefreshBox");
                if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(362082046, iIntValue2, -1, "com.zykj.mistake.feature.notebook.list.MistakeNotebookGrid.<anonymous> (MistakeNotebookScreen.kt:223)");
                    }
                    GridCells.Fixed fixed2 = new GridCells.Fixed(3);
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    PaddingValues paddingValuesM7255PaddingValues0680j_4 = PaddingKt.m7255PaddingValues0680j_4(C2331Dp.m13305constructorimpl(16));
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    float f9 = 12;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM7143spacedBy0680j_43 = arrangement2.m7143spacedBy0680j_4(C2331Dp.m13305constructorimpl(f9));
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM7143spacedBy0680j_44 = arrangement2.m7143spacedBy0680j_4(C2331Dp.m13305constructorimpl(f9));
                    boolean zChangedInstance2 = composer2.changedInstance(c4941e1) | composer2.changed(interfaceC6471c3) | composer2.changed(interfaceC6471c4);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new C2764i(c4941e1, interfaceC6471c3, interfaceC6471c4, 12);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    LazyGridDslKt.LazyVerticalGrid(fixed2, modifierFillMaxSize$default, lazyGridState2, paddingValuesM7255PaddingValues0680j_4, false, horizontalOrVerticalM7143spacedBy0680j_44, horizontalOrVerticalM7143spacedBy0680j_43, null, false, null, (InterfaceC6471c) objRememberedValue2, composer2, 1772592, 0, 912);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                break;
            default:
                InterfaceC6469a interfaceC6469a = (InterfaceC6469a) this.f6798b;
                C5021a1 c5021a1 = (C5021a1) this.f6801e;
                SnapshotStateList<CustomTagInfo> snapshotStateList = (SnapshotStateList) this.f6799c;
                InterfaceC6473e interfaceC6473e = (InterfaceC6473e) this.f6800d;
                FlowRowScope FlowRow = (FlowRowScope) obj;
                Composer composer3 = (Composer) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                AbstractC5830k.m5330g(FlowRow, "$this$FlowRow");
                if (composer3.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1879525952, iIntValue3, -1, "com.zykj.mistake.main.drawer.MistakeTagEditorPanel.<anonymous>.<anonymous>.<anonymous> (MistakeTagEditorPanel.kt:159)");
                    }
                    AbstractC5041l.m4371c(interfaceC6469a, composer3, 0);
                    for (CustomTagInfo customTagInfo : c5021a1.f7829b) {
                        if (snapshotStateList == null || !snapshotStateList.isEmpty()) {
                            for (CustomTagInfo customTagInfo2 : snapshotStateList) {
                                if (customTagInfo2.getId() == customTagInfo.getId() && customTagInfo2.getLocalType() == customTagInfo.getLocalType()) {
                                    z8 = true;
                                }
                            }
                            z8 = false;
                        } else {
                            z8 = false;
                        }
                        String name = customTagInfo.getName();
                        boolean zChanged = composer3.changed(snapshotStateList) | composer3.changedInstance(customTagInfo);
                        Object objRememberedValue3 = composer3.rememberedValue();
                        if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new C2857e(19, snapshotStateList, customTagInfo);
                            composer3.updateRememberedValue(objRememberedValue3);
                        }
                        InterfaceC6469a interfaceC6469a2 = (InterfaceC6469a) objRememberedValue3;
                        boolean zChanged2 = composer3.changed(interfaceC6473e) | composer3.changedInstance(customTagInfo);
                        Object objRememberedValue4 = composer3.rememberedValue();
                        if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new C5037h(interfaceC6473e, customTagInfo, 1);
                            composer3.updateRememberedValue(objRememberedValue4);
                        }
                        AbstractC5041l.m4372d(name, z8, interfaceC6469a2, (InterfaceC6469a) objRememberedValue4, composer3, 0, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                break;
        }
        return C5443s.f8405a;
    }
}
