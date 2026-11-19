package com.zykj.study.p065ui.home.p066my.card;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.pulltorefresh.PullToRefreshKt;
import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.ComposedModifierKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.focus.FocusManager;
import androidx.compose.p013ui.focus.FocusRequester;
import androidx.compose.p013ui.focus.FocusRequesterModifierKt;
import androidx.compose.p013ui.graphics.ColorFilter;
import androidx.compose.p013ui.graphics.Shadow;
import androidx.compose.p013ui.graphics.drawscope.DrawStyle;
import androidx.compose.p013ui.layout.ContentScale;
import androidx.compose.p013ui.layout.MeasurePolicy;
import androidx.compose.p013ui.node.ComposeUiNode;
import androidx.compose.p013ui.platform.CompositionLocalsKt;
import androidx.compose.p013ui.res.ColorResources_androidKt;
import androidx.compose.p013ui.res.PainterResources_androidKt;
import androidx.compose.p013ui.res.PrimitiveResources_androidKt;
import androidx.compose.p013ui.res.StringResources_androidKt;
import androidx.compose.p013ui.text.PlatformTextStyle;
import androidx.compose.p013ui.text.TextStyle;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.text.font.FontStyle;
import androidx.compose.p013ui.text.font.FontSynthesis;
import androidx.compose.p013ui.text.font.FontWeight;
import androidx.compose.p013ui.text.input.TextInputService;
import androidx.compose.p013ui.text.intl.LocaleList;
import androidx.compose.p013ui.text.style.BaselineShift;
import androidx.compose.p013ui.text.style.LineHeightStyle;
import androidx.compose.p013ui.text.style.TextAlign;
import androidx.compose.p013ui.text.style.TextDecoration;
import androidx.compose.p013ui.text.style.TextGeometricTransform;
import androidx.compose.p013ui.text.style.TextIndent;
import androidx.compose.p013ui.text.style.TextMotion;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.tencent.smtt.sdk.TbsListener;
import com.zykj.lib.p063ui.R$dimen;
import com.zykj.study.R$color;
import com.zykj.study.R$mipmap;
import com.zykj.study.R$string;
import com.zykj.study.bean.UiState;
import com.zykj.study.bean.exercise.AuthorizeLesson;
import com.zykj.study.p065ui.home.p066my.card.AuthorizationSearchListKt;
import com.zykj.study.utils.ContextExtKt;
import com.zykj.study.viewmodels.AuthorizedLessonViewModel;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.Ref$BooleanRef;
import p036c5.AbstractC5236b;
import p036c5.AbstractC5253j0;
import p036c5.C5267x;
import p113g8.AbstractC8661c0;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;
import p300x7.InterfaceC10576r;

/* loaded from: classes5.dex */
public abstract class AuthorizationSearchListKt {

    /* renamed from: com.zykj.study.ui.home.my.card.AuthorizationSearchListKt$a */
    public static final class C8094a implements InterfaceC10559a {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10574p f13534a;

        /* renamed from: b */
        public final /* synthetic */ int f13535b;

        /* renamed from: c */
        public final /* synthetic */ AuthorizeLesson f13536c;

        public C8094a(InterfaceC10574p interfaceC10574p, int i10, AuthorizeLesson authorizeLesson) {
            this.f13534a = interfaceC10574p;
            this.f13535b = i10;
            this.f13536c = authorizeLesson;
        }

        /* renamed from: a */
        public final void m11781a() {
            InterfaceC10574p interfaceC10574p = this.f13534a;
            if (interfaceC10574p != null) {
                interfaceC10574p.invoke(Integer.valueOf(this.f13535b), this.f13536c);
            }
        }

        @Override // p300x7.InterfaceC10559a
        public /* bridge */ /* synthetic */ Object invoke() {
            m11781a();
            return C8736p.f16368a;
        }
    }

    /* renamed from: A */
    public static final void m11751A(final String str, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-273127196);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-273127196, i11, -1, "com.zykj.study.ui.home.my.card.ShowEmptyView (AuthorizationSearchList.kt:170)");
            }
            if (AbstractC8661c0.m13993h0(str)) {
                composerStartRestartGroup.startReplaceGroup(-2063966160);
                AbstractC5236b.m2144b(StringResources_androidKt.stringResource(R$string.hint_page_of_searching_teacher, composerStartRestartGroup, 0), R$mipmap.icon_search_no_keyword, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-2064145681);
                AbstractC5236b.m2144b(StringResources_androidKt.stringResource(R$string.empty_page_of_searching_teacher, composerStartRestartGroup, 0), R$mipmap.icon_empty_placehodler, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC10574p() { // from class: c5.m
                @Override // p300x7.InterfaceC10574p
                public final Object invoke(Object obj, Object obj2) {
                    return AuthorizationSearchListKt.m11752B(str, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: B */
    public static final C8736p m11752B(String str, int i10, Composer composer, int i11) {
        m11751A(str, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return C8736p.f16368a;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m11753C(final java.lang.String r25, androidx.compose.p013ui.Modifier r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            r0 = r25
            java.lang.String r1 = "text"
            kotlin.jvm.internal.AbstractC9133u.m16133g(r0, r1)
            r1 = -458228470(0xffffffffe4affd0a, float:-2.5971309E22)
            r2 = r27
            androidx.compose.runtime.Composer r2 = r2.startRestartGroup(r1)
            r3 = r28 & 6
            if (r3 != 0) goto L20
            boolean r3 = r2.changed(r0)
            if (r3 == 0) goto L1c
            r3 = 4
            goto L1d
        L1c:
            r3 = 2
        L1d:
            r3 = r28 | r3
            goto L22
        L20:
            r3 = r28
        L22:
            r4 = r29 & 2
            if (r4 == 0) goto L2b
            r3 = r3 | 48
        L28:
            r5 = r26
            goto L3d
        L2b:
            r5 = r28 & 48
            if (r5 != 0) goto L28
            r5 = r26
            boolean r6 = r2.changed(r5)
            if (r6 == 0) goto L3a
            r6 = 32
            goto L3c
        L3a:
            r6 = 16
        L3c:
            r3 = r3 | r6
        L3d:
            r6 = r3 & 19
            r7 = 18
            r8 = 0
            if (r6 == r7) goto L46
            r6 = 1
            goto L47
        L46:
            r6 = r8
        L47:
            r7 = r3 & 1
            boolean r6 = r2.shouldExecute(r6, r7)
            if (r6 == 0) goto L9e
            if (r4 == 0) goto L54
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.p013ui.Modifier.Companion
            goto L55
        L54:
            r4 = r5
        L55:
            boolean r5 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r5 == 0) goto L61
            r5 = -1
            java.lang.String r6 = "com.zykj.study.ui.home.my.card.TextItem (AuthorizationSearchList.kt:223)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r1, r3, r5, r6)
        L61:
            int r1 = com.zykj.study.R$color.text_title
            long r5 = androidx.compose.p013ui.res.ColorResources_androidKt.colorResource(r1, r2, r8)
            int r1 = com.zykj.lib.p063ui.R$dimen.text_8
            float r1 = androidx.compose.p013ui.res.PrimitiveResources_androidKt.dimensionResource(r1, r2, r8)
            long r7 = com.zykj.study.utils.ContextExtKt.m11877c(r1, r2, r8)
            r22 = r3 & 126(0x7e, float:1.77E-43)
            r23 = 0
            r24 = 131056(0x1fff0, float:1.83649E-40)
            r21 = r2
            r2 = r5
            r6 = 0
            r1 = r4
            r4 = r7
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            androidx.compose.material3.TextKt.m22699Text4IGK_g(r0, r1, r2, r4, r6, r7, r8, r9, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto La4
            androidx.compose.runtime.ComposerKt.traceEventEnd()
            goto La4
        L9e:
            r21 = r2
            r21.skipToGroupEnd()
            r1 = r5
        La4:
            androidx.compose.runtime.ScopeUpdateScope r2 = r21.endRestartGroup()
            if (r2 == 0) goto Lb6
            c5.e r3 = new c5.e
            r4 = r28
            r5 = r29
            r3.<init>()
            r2.updateScope(r3)
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.p065ui.home.p066my.card.AuthorizationSearchListKt.m11753C(java.lang.String, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/card/AuthorizationSearchListKt.smali:307
    }

    /* renamed from: D */
    public static final C8736p m11754D(String str, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        m11753C(str, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return C8736p.f16368a;
    }

    /* renamed from: m */
    public static final void m11767m(final AuthorizeLesson authorizeLesson, final InterfaceC10559a interfaceC10559a, Composer composer, final int i10) {
        int i11;
        Composer composer2;
        int i12;
        int i13;
        AbstractC9133u.m16133g(authorizeLesson, "authorizeLesson");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1514606050);
        if ((i10 & 6) == 0) {
            i11 = i10 | (composerStartRestartGroup.changed(authorizeLesson) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC10559a) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 19) != 18, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1514606050, i11, -1, "com.zykj.study.ui.home.my.card.SearchListItem (AuthorizationSearchList.kt:186)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM20889height3ABfNKs = SizeKt.m20889height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R$dimen.view_22, composerStartRestartGroup, 0));
            Alignment.Companion companion2 = Alignment.Companion;
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM20889height3ABfNKs);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            InterfaceC10559a constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM23703constructorimpl = Updater.m23703constructorimpl(composerStartRestartGroup);
            Updater.m23710setimpl(composerM23703constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m23710setimpl(composerM23703constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            InterfaceC10574p setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM23703constructorimpl.getInserting() || !AbstractC9133u.m16128b(composerM23703constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM23703constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM23703constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m23710setimpl(composerM23703constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i14 = i11;
            boolean z10 = true;
            ImageKt.Image(PainterResources_androidKt.painterResource(R$mipmap.icon_autorized_teacher_avatar, composerStartRestartGroup, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 48, TbsListener.ErrorCode.DOWNLOAD_REDIRECT_EMPTY);
            SpacerKt.Spacer(SizeKt.m20908width3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R$dimen.view_2, composerStartRestartGroup, 0)), composerStartRestartGroup, 0);
            Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween, companion2.getTop(), composerStartRestartGroup, 6);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            InterfaceC10559a constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM23703constructorimpl2 = Updater.m23703constructorimpl(composerStartRestartGroup);
            Updater.m23710setimpl(composerM23703constructorimpl2, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m23710setimpl(composerM23703constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            InterfaceC10574p setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM23703constructorimpl2.getInserting() || !AbstractC9133u.m16128b(composerM23703constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM23703constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM23703constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m23710setimpl(composerM23703constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            m11753C(authorizeLesson.getName() + " (" + authorizeLesson.getUserName() + ")", null, composerStartRestartGroup, 0, 2);
            if (authorizeLesson.isAuthorized()) {
                composerStartRestartGroup.startReplaceGroup(-1713788571);
                i12 = R$string.authorized_to_use;
            } else {
                composerStartRestartGroup.startReplaceGroup(-1713786838);
                i12 = R$string.to_authorize_use;
            }
            String strStringResource = StringResources_androidKt.stringResource(i12, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceGroup();
            if (authorizeLesson.isAuthorized()) {
                composerStartRestartGroup.startReplaceGroup(-1713782277);
                i13 = R$color.text_gray;
            } else {
                composerStartRestartGroup.startReplaceGroup(-1713780860);
                i13 = R$color.colorPrimary;
            }
            long jColorResource = ColorResources_androidKt.colorResource(i13, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceGroup();
            long jM11877c = ContextExtKt.m11877c(PrimitiveResources_androidKt.dimensionResource(R$dimen.text_8, composerStartRestartGroup, 0), composerStartRestartGroup, 0);
            boolean z11 = (i14 & 14) == 4;
            if ((i14 & TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW) != 32) {
                z10 = false;
            }
            boolean z12 = z11 | z10;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z12 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new InterfaceC10559a() { // from class: c5.n
                    @Override // p300x7.InterfaceC10559a
                    public final Object invoke() {
                        return AuthorizationSearchListKt.m11768n(authorizeLesson, interfaceC10559a);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composer2 = composerStartRestartGroup;
            TextKt.m22699Text4IGK_g(strStringResource, ClickableKt.m20384clickableXHw0xAI$default(companion, false, null, null, (InterfaceC10559a) objRememberedValue, 7, null), jColorResource, jM11877c, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC10570l) null, (TextStyle) null, composer2, 0, 0, 131056);
            composer2.endNode();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC10574p() { // from class: c5.d
                @Override // p300x7.InterfaceC10574p
                public final Object invoke(Object obj, Object obj2) {
                    return AuthorizationSearchListKt.m11769o(authorizeLesson, interfaceC10559a, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: n */
    public static final C8736p m11768n(AuthorizeLesson authorizeLesson, InterfaceC10559a interfaceC10559a) {
        if (!authorizeLesson.isAuthorized() && interfaceC10559a != null) {
            interfaceC10559a.invoke();
        }
        return C8736p.f16368a;
    }

    /* renamed from: o */
    public static final C8736p m11769o(AuthorizeLesson authorizeLesson, InterfaceC10559a interfaceC10559a, int i10, Composer composer, int i11) {
        m11767m(authorizeLesson, interfaceC10559a, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return C8736p.f16368a;
    }

    /* renamed from: p */
    public static final void m11770p(final Modifier modifier, final AuthorizedLessonViewModel vm, final InterfaceC10574p interfaceC10574p, Composer composer, final int i10) {
        int i11;
        Object t10;
        AbstractC9133u.m16133g(modifier, "modifier");
        AbstractC9133u.m16133g(vm, "vm");
        Composer composerStartRestartGroup = composer.startRestartGroup(332204127);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(vm) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC10574p) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 147) != 146, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(332204127, i11, -1, "com.zykj.study.ui.home.my.card.SearchPage (AuthorizationSearchList.kt:42)");
            }
            final State stateCollectAsState = SnapshotStateKt.collectAsState(vm.m11994o(), null, composerStartRestartGroup, 0, 1);
            final TextInputService textInputService = (TextInputService) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextInputService());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new FocusRequester();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            FocusRequester focusRequester = (FocusRequester) objRememberedValue;
            final FocusManager focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getCenterHorizontally(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            InterfaceC10559a constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM23703constructorimpl = Updater.m23703constructorimpl(composerStartRestartGroup);
            Updater.m23710setimpl(composerM23703constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m23710setimpl(composerM23703constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            InterfaceC10574p setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM23703constructorimpl.getInserting() || !AbstractC9133u.m16128b(composerM23703constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM23703constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM23703constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m23710setimpl(composerM23703constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextStyle textStyle = new TextStyle(ColorResources_androidKt.colorResource(R$color.menu_text_color_normal, composerStartRestartGroup, 0), ContextExtKt.m11877c(PrimitiveResources_androidKt.dimensionResource(R$dimen.text_8, composerStartRestartGroup, 0), composerStartRestartGroup, 0), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777212, (AbstractC9126n) null);
            TextStyle textStyle2 = new TextStyle(ColorResources_androidKt.colorResource(R$color.text_hint, composerStartRestartGroup, 0), ContextExtKt.m11877c(PrimitiveResources_androidKt.dimensionResource(R$dimen.text_8, composerStartRestartGroup, 0), composerStartRestartGroup, 0), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777212, (AbstractC9126n) null);
            String strStringResource = StringResources_androidKt.stringResource(R$string.hint_search_teacher, composerStartRestartGroup, 0);
            Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(PaddingKt.m20860paddingqDBjuR0$default(BackgroundKt.m20347backgroundbw27NRU(SizeKt.m20905sizeVpY3zN4(Modifier.Companion, PrimitiveResources_androidKt.dimensionResource(R$dimen.view_275, composerStartRestartGroup, 0), PrimitiveResources_androidKt.dimensionResource(R$dimen.view_25, composerStartRestartGroup, 0)), ColorResources_androidKt.colorResource(R$color.bg_page, composerStartRestartGroup, 0), RoundedCornerShapeKt.m21153RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R$dimen.view_1, composerStartRestartGroup, 0))), PrimitiveResources_androidKt.dimensionResource(R$dimen.view_7, composerStartRestartGroup, 0), 0.0f, 0.0f, 0.0f, 14, null), focusRequester);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(vm);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new InterfaceC10570l() { // from class: c5.c
                    @Override // p300x7.InterfaceC10570l
                    public final Object invoke(Object obj) {
                        return AuthorizationSearchListKt.m11776v(vm, (String) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            InterfaceC10570l interfaceC10570l = (InterfaceC10570l) objRememberedValue2;
            InterfaceC10574p interfaceC10574pM2178d = C5267x.f2389a.m2178d();
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(textInputService) | composerStartRestartGroup.changedInstance(focusManager) | composerStartRestartGroup.changedInstance(vm);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new InterfaceC10570l() { // from class: c5.f
                    @Override // p300x7.InterfaceC10570l
                    public final Object invoke(Object obj) {
                        return AuthorizationSearchListKt.m11777w(textInputService, focusManager, vm, (String) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            AbstractC5253j0.m2162h(modifierFocusRequester, strStringResource, interfaceC10570l, interfaceC10574pM2178d, null, (InterfaceC10570l) objRememberedValue3, textStyle, textStyle2, composerStartRestartGroup, 3072, 16);
            composerStartRestartGroup = composerStartRestartGroup;
            final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            UiState uiStateM11771q = m11771q(stateCollectAsState);
            try {
                AbstractC9133u.m16131e(uiStateM11771q, "null cannot be cast to non-null type com.zykj.study.bean.UiState.Success<*>");
                t10 = ((UiState.Success) uiStateM11771q).getT();
            } catch (ClassCastException unused) {
            }
            if (t10 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<com.zykj.study.bean.exercise.AuthorizeLesson>");
            }
            if (!((List) t10).isEmpty()) {
                ref$BooleanRef.f17469a = true;
            }
            State stateCollectAsState2 = SnapshotStateKt.collectAsState(vm.m11996q(), Boolean.FALSE, null, composerStartRestartGroup, 48, 2);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
            boolean zM11778x = m11778x(stateCollectAsState2);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = new InterfaceC10559a() { // from class: c5.g
                    @Override // p300x7.InterfaceC10559a
                    public final Object invoke() {
                        return AuthorizationSearchListKt.m11779y();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            PullToRefreshKt.PullToRefreshBox(zM11778x, (InterfaceC10559a) objRememberedValue4, modifierFillMaxSize$default, null, null, null, ComposableLambdaKt.rememberComposableLambda(1069919791, true, new InterfaceC10575q() { // from class: c5.h
                @Override // p300x7.InterfaceC10575q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AuthorizationSearchListKt.m11772r(ref$BooleanRef, stateCollectAsState, vm, interfaceC10574p, (BoxScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 1573296, 56);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC10574p() { // from class: c5.i
                @Override // p300x7.InterfaceC10574p
                public final Object invoke(Object obj, Object obj2) {
                    return AuthorizationSearchListKt.m11780z(modifier, vm, interfaceC10574p, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: q */
    public static final UiState m11771q(State state) {
        return (UiState) state.getValue();
    }

    /* renamed from: r */
    public static final C8736p m11772r(Ref$BooleanRef ref$BooleanRef, final State state, final AuthorizedLessonViewModel authorizedLessonViewModel, final InterfaceC10574p interfaceC10574p, BoxScope PullToRefreshBox, Composer composer, int i10) {
        AbstractC9133u.m16133g(PullToRefreshBox, "$this$PullToRefreshBox");
        if (composer.shouldExecute((i10 & 17) != 16, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1069919791, i10, -1, "com.zykj.study.ui.home.my.card.SearchPage.<anonymous>.<anonymous> (AuthorizationSearchList.kt:110)");
            }
            Modifier modifierM20860paddingqDBjuR0$default = PaddingKt.m20860paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R$dimen.view_5, composer, 0), PrimitiveResources_androidKt.dimensionResource(R$dimen.view_5, composer, 0), PrimitiveResources_androidKt.dimensionResource(R$dimen.view_5, composer, 0), 0.0f, 8, null);
            Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
            Arrangement.Vertical top2 = ref$BooleanRef.f17469a ? Arrangement.INSTANCE.getTop() : Arrangement.INSTANCE.getCenter();
            boolean zChanged = composer.changed(state) | composer.changedInstance(authorizedLessonViewModel) | composer.changed(interfaceC10574p);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new InterfaceC10570l() { // from class: c5.j
                    @Override // p300x7.InterfaceC10570l
                    public final Object invoke(Object obj) {
                        return AuthorizationSearchListKt.m11773s(state, authorizedLessonViewModel, interfaceC10574p, (LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            LazyDslKt.LazyColumn(modifierM20860paddingqDBjuR0$default, null, null, false, top2, centerHorizontally, null, false, null, (InterfaceC10570l) objRememberedValue, composer, ProfileVerifier.CompilationStatus.f1860xf2722a21, 462);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return C8736p.f16368a;
    }

    /* renamed from: s */
    public static final C8736p m11773s(State state, final AuthorizedLessonViewModel authorizedLessonViewModel, final InterfaceC10574p interfaceC10574p, LazyListScope LazyColumn) {
        Object t10;
        AbstractC9133u.m16133g(LazyColumn, "$this$LazyColumn");
        UiState uiStateM11771q = m11771q(state);
        try {
            AbstractC9133u.m16131e(uiStateM11771q, "null cannot be cast to non-null type com.zykj.study.bean.UiState.Success<*>");
            t10 = ((UiState.Success) uiStateM11771q).getT();
        } catch (ClassCastException unused) {
        }
        if (t10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<com.zykj.study.bean.exercise.AuthorizeLesson>");
        }
        final List list = (List) t10;
        if (list.isEmpty()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-154070730, true, new InterfaceC10575q() { // from class: c5.k
                @Override // p300x7.InterfaceC10575q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AuthorizationSearchListKt.m11774t(authorizedLessonViewModel, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        } else {
            LazyColumn.items(list.size(), null, new InterfaceC10570l() { // from class: com.zykj.study.ui.home.my.card.AuthorizationSearchListKt$SearchPage$lambda$20$lambda$19$lambda$18$lambda$17$lambda$13$$inlined$itemsIndexed$default$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }

                public final Object invoke(int i10) {
                    list.get(i10);
                    return null;
                }
            }, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new InterfaceC10576r() { // from class: com.zykj.study.ui.home.my.card.AuthorizationSearchListKt$SearchPage$lambda$20$lambda$19$lambda$18$lambda$17$lambda$13$$inlined$itemsIndexed$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // p300x7.InterfaceC10576r
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    invoke((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                    return C8736p.f16368a;
                }

                public final void invoke(LazyItemScope lazyItemScope, int i10, Composer composer, int i11) {
                    int i12;
                    if ((i11 & 6) == 0) {
                        i12 = (composer.changed(lazyItemScope) ? 4 : 2) | i11;
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
                        ComposerKt.traceEventStart(-1091073711, i12, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                    }
                    AuthorizeLesson authorizeLesson = (AuthorizeLesson) list.get(i10);
                    composer.startReplaceGroup(-1299310398);
                    boolean zChanged = ((((i12 & TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW) ^ 48) > 32 && composer.changed(i10)) || (i12 & 48) == 32) | composer.changed(interfaceC10574p) | composer.changed(authorizeLesson);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new AuthorizationSearchListKt.C8094a(interfaceC10574p, i10, authorizeLesson);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    AuthorizationSearchListKt.m11767m(authorizeLesson, (InterfaceC10559a) objRememberedValue, composer, 0);
                    DividerKt.m22061HorizontalDivider9IZ8Weo(SizeKt.m20889height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), C3156Dp.m26899constructorimpl(1)), 0.0f, ColorResources_androidKt.colorResource(R$color.divider_color, composer, 0), composer, 6, 2);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        }
        if (uiStateM11771q instanceof UiState.Error) {
            if (((UiState.Error) uiStateM11771q).isBadNetwork()) {
                LazyListScope.item$default(LazyColumn, null, null, C5267x.f2389a.m2179e(), 3, null);
            } else {
                LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(2083318428, true, new InterfaceC10575q() { // from class: c5.l
                    @Override // p300x7.InterfaceC10575q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return AuthorizationSearchListKt.m11775u(authorizedLessonViewModel, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }), 3, null);
            }
        }
        if (uiStateM11771q instanceof UiState.Initial) {
            LazyListScope.item$default(LazyColumn, null, null, C5267x.f2389a.m2180f(), 3, null);
        }
        return C8736p.f16368a;
    }

    /* renamed from: t */
    public static final C8736p m11774t(AuthorizedLessonViewModel authorizedLessonViewModel, LazyItemScope item, Composer composer, int i10) {
        AbstractC9133u.m16133g(item, "$this$item");
        if (composer.shouldExecute((i10 & 17) != 16, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-154070730, i10, -1, "com.zykj.study.ui.home.my.card.SearchPage.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AuthorizationSearchList.kt:125)");
            }
            m11751A(authorizedLessonViewModel.m11993n(), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return C8736p.f16368a;
    }

    /* renamed from: u */
    public static final C8736p m11775u(AuthorizedLessonViewModel authorizedLessonViewModel, LazyItemScope item, Composer composer, int i10) {
        AbstractC9133u.m16133g(item, "$this$item");
        if (composer.shouldExecute((i10 & 17) != 16, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2083318428, i10, -1, "com.zykj.study.ui.home.my.card.SearchPage.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AuthorizationSearchList.kt:152)");
            }
            m11751A(authorizedLessonViewModel.m11993n(), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return C8736p.f16368a;
    }

    /* renamed from: v */
    public static final C8736p m11776v(AuthorizedLessonViewModel authorizedLessonViewModel, String CustomTextField) {
        AbstractC9133u.m16133g(CustomTextField, "$this$CustomTextField");
        authorizedLessonViewModel.m11998s(CustomTextField);
        return C8736p.f16368a;
    }

    /* renamed from: w */
    public static final C8736p m11777w(TextInputService textInputService, FocusManager focusManager, AuthorizedLessonViewModel authorizedLessonViewModel, String CustomTextField) {
        AbstractC9133u.m16133g(CustomTextField, "$this$CustomTextField");
        if (textInputService != null) {
            textInputService.hideSoftwareKeyboard();
        }
        FocusManager.clearFocus$default(focusManager, false, 1, null);
        authorizedLessonViewModel.m11987h(authorizedLessonViewModel.m11993n());
        return C8736p.f16368a;
    }

    /* renamed from: x */
    public static final boolean m11778x(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    /* renamed from: y */
    public static final C8736p m11779y() {
        return C8736p.f16368a;
    }

    /* renamed from: z */
    public static final C8736p m11780z(Modifier modifier, AuthorizedLessonViewModel authorizedLessonViewModel, InterfaceC10574p interfaceC10574p, int i10, Composer composer, int i11) {
        m11770p(modifier, authorizedLessonViewModel, interfaceC10574p, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return C8736p.f16368a;
    }
}
