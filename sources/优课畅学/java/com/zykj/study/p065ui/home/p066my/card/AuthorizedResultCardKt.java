package com.zykj.study.p065ui.home.p066my.card;

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
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.pulltorefresh.PullToRefreshKt;
import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.ComposedModifierKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.graphics.ColorFilter;
import androidx.compose.p013ui.layout.ContentScale;
import androidx.compose.p013ui.layout.MeasurePolicy;
import androidx.compose.p013ui.node.ComposeUiNode;
import androidx.compose.p013ui.res.ColorResources_androidKt;
import androidx.compose.p013ui.res.PainterResources_androidKt;
import androidx.compose.p013ui.res.PrimitiveResources_androidKt;
import androidx.compose.p013ui.res.StringResources_androidKt;
import androidx.compose.p013ui.text.TextStyle;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.text.font.FontStyle;
import androidx.compose.p013ui.text.font.FontWeight;
import androidx.compose.p013ui.text.style.TextAlign;
import androidx.compose.p013ui.text.style.TextDecoration;
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
import com.zykj.study.p065ui.home.p066my.card.AuthorizedResultCardKt;
import com.zykj.study.utils.ContextExtKt;
import com.zykj.study.viewmodels.AuthorizedLessonViewModel;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p036c5.C5237b0;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;
import p300x7.InterfaceC10576r;

/* loaded from: classes5.dex */
public abstract class AuthorizedResultCardKt {

    /* renamed from: com.zykj.study.ui.home.my.card.AuthorizedResultCardKt$a */
    public static final class C8097a implements InterfaceC10559a {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10570l f13540a;

        /* renamed from: b */
        public final /* synthetic */ AuthorizeLesson f13541b;

        public C8097a(InterfaceC10570l interfaceC10570l, AuthorizeLesson authorizeLesson) {
            this.f13540a = interfaceC10570l;
            this.f13541b = authorizeLesson;
        }

        /* renamed from: a */
        public final void m11797a() {
            InterfaceC10570l interfaceC10570l = this.f13540a;
            if (interfaceC10570l != null) {
                interfaceC10570l.invoke(this.f13541b);
            }
        }

        @Override // p300x7.InterfaceC10559a
        public /* bridge */ /* synthetic */ Object invoke() {
            m11797a();
            return C8736p.f16368a;
        }
    }

    /* renamed from: g */
    public static final void m11788g(final AuthorizeLesson authorizeLesson, final InterfaceC10559a interfaceC10559a, Composer composer, final int i10) {
        int i11;
        Composer composer2;
        AbstractC9133u.m16133g(authorizeLesson, "authorizeLesson");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1997383274);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(authorizeLesson) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC10559a) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 19) != 18, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1997383274, i11, -1, "com.zykj.study.ui.home.my.card.AuthorizedListItem (AuthorizedResultCard.kt:122)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM20889height3ABfNKs = SizeKt.m20889height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R$dimen.view_28, composerStartRestartGroup, 0));
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
            int i12 = i11;
            ImageKt.Image(PainterResources_androidKt.painterResource(R$mipmap.icon_autorized_teacher_avatar, composerStartRestartGroup, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 48, TbsListener.ErrorCode.DOWNLOAD_REDIRECT_EMPTY);
            SpacerKt.Spacer(SizeKt.m20908width3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R$dimen.view_2, composerStartRestartGroup, 0)), composerStartRestartGroup, 0);
            Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween, companion2.getCenterVertically(), composerStartRestartGroup, 54);
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
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getCenter(), companion2.getStart(), composerStartRestartGroup, 6);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            InterfaceC10559a constructor3 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM23703constructorimpl3 = Updater.m23703constructorimpl(composerStartRestartGroup);
            Updater.m23710setimpl(composerM23703constructorimpl3, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m23710setimpl(composerM23703constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            InterfaceC10574p setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (composerM23703constructorimpl3.getInserting() || !AbstractC9133u.m16128b(composerM23703constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM23703constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM23703constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m23710setimpl(composerM23703constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            AuthorizationSearchListKt.m11753C(authorizeLesson.getName() + " (" + authorizeLesson.getUserName() + ")", null, composerStartRestartGroup, 0, 2);
            String createTime = authorizeLesson.getCreateTime();
            if (createTime == null) {
                createTime = "";
            }
            boolean z10 = true;
            TextKt.m22699Text4IGK_g(createTime, (Modifier) null, ColorResources_androidKt.colorResource(R$color.text_sub_title, composerStartRestartGroup, 0), ContextExtKt.m11877c(PrimitiveResources_androidKt.dimensionResource(R$dimen.text_7, composerStartRestartGroup, 0), composerStartRestartGroup, 0), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC10570l) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 131058);
            composerStartRestartGroup.endNode();
            String strStringResource = StringResources_androidKt.stringResource(R$string.deauthorize, composerStartRestartGroup, 0);
            long jColorResource = ColorResources_androidKt.colorResource(R$color.warn, composerStartRestartGroup, 0);
            long jM11877c = ContextExtKt.m11877c(PrimitiveResources_androidKt.dimensionResource(R$dimen.text_7, composerStartRestartGroup, 0), composerStartRestartGroup, 0);
            if ((i12 & TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW) != 32) {
                z10 = false;
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z10 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new InterfaceC10559a() { // from class: c5.s
                    @Override // p300x7.InterfaceC10559a
                    public final Object invoke() {
                        return AuthorizedResultCardKt.m11789h(interfaceC10559a);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC10574p() { // from class: c5.t
                @Override // p300x7.InterfaceC10574p
                public final Object invoke(Object obj, Object obj2) {
                    return AuthorizedResultCardKt.m11790i(authorizeLesson, interfaceC10559a, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: h */
    public static final C8736p m11789h(InterfaceC10559a interfaceC10559a) {
        if (interfaceC10559a != null) {
            interfaceC10559a.invoke();
        }
        return C8736p.f16368a;
    }

    /* renamed from: i */
    public static final C8736p m11790i(AuthorizeLesson authorizeLesson, InterfaceC10559a interfaceC10559a, int i10, Composer composer, int i11) {
        m11788g(authorizeLesson, interfaceC10559a, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return C8736p.f16368a;
    }

    /* renamed from: j */
    public static final void m11791j(Modifier modifier, final AuthorizedLessonViewModel vm, final InterfaceC10570l interfaceC10570l, final InterfaceC10559a interfaceC10559a, Composer composer, final int i10, final int i11) {
        Modifier modifier2;
        int i12;
        final Modifier modifier3;
        AbstractC9133u.m16133g(vm, "vm");
        Composer composerStartRestartGroup = composer.startRestartGroup(1346913680);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            modifier2 = modifier;
        } else if ((i10 & 6) == 0) {
            modifier2 = modifier;
            i12 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i10;
        } else {
            modifier2 = modifier;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(vm) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(interfaceC10570l) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(interfaceC10559a) ? 2048 : 1024;
        }
        int i14 = i12;
        if (composerStartRestartGroup.shouldExecute((i14 & 1171) != 1170, i14 & 1)) {
            Modifier modifier4 = i13 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1346913680, i14, -1, "com.zykj.study.ui.home.my.card.AuthorizedPage (AuthorizedResultCard.kt:42)");
            }
            final UiState uiState = (UiState) SnapshotStateKt.collectAsState(vm.m11989j(), null, composerStartRestartGroup, 0, 1).getValue();
            State stateCollectAsState = SnapshotStateKt.collectAsState(vm.m11995p(), Boolean.FALSE, null, composerStartRestartGroup, 48, 2);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier4);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            InterfaceC10559a constructor = companion.getConstructor();
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
            Updater.m23710setimpl(composerM23703constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m23710setimpl(composerM23703constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            InterfaceC10574p setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM23703constructorimpl.getInserting() || !AbstractC9133u.m16128b(composerM23703constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM23703constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM23703constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m23710setimpl(composerM23703constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            String strStringResource = StringResources_androidKt.stringResource(R$string.teachers_authorized_to_use, composerStartRestartGroup, 0);
            long jColorResource = ColorResources_androidKt.colorResource(R$color.text_title, composerStartRestartGroup, 0);
            long jM11877c = ContextExtKt.m11877c(PrimitiveResources_androidKt.dimensionResource(R$dimen.text_8, composerStartRestartGroup, 0), composerStartRestartGroup, 0);
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier modifier5 = modifier4;
            TextKt.m22699Text4IGK_g(strStringResource, PaddingKt.m20860paddingqDBjuR0$default(companion2, 0.0f, PrimitiveResources_androidKt.dimensionResource(R$dimen.view_12, composerStartRestartGroup, 0), 0.0f, 0.0f, 13, null), jColorResource, jM11877c, (FontStyle) null, FontWeight.Companion.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC10570l) null, (TextStyle) null, composerStartRestartGroup, ProfileVerifier.CompilationStatus.f1860xf2722a21, 0, 131024);
            SpacerKt.Spacer(SizeKt.m20889height3ABfNKs(companion2, PrimitiveResources_androidKt.dimensionResource(R$dimen.view_5, composerStartRestartGroup, 0)), composerStartRestartGroup, 0);
            boolean zM11792k = m11792k(stateCollectAsState);
            boolean z10 = (i14 & 7168) == 2048;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z10 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new InterfaceC10559a() { // from class: c5.o
                    @Override // p300x7.InterfaceC10559a
                    public final Object invoke() {
                        return AuthorizedResultCardKt.m11795n(interfaceC10559a);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            PullToRefreshKt.PullToRefreshBox(zM11792k, (InterfaceC10559a) objRememberedValue, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(960290240, true, new InterfaceC10575q() { // from class: c5.p
                @Override // p300x7.InterfaceC10575q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AuthorizedResultCardKt.m11793l(uiState, interfaceC10570l, (BoxScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 1572864, 60);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC10574p() { // from class: c5.q
                @Override // p300x7.InterfaceC10574p
                public final Object invoke(Object obj, Object obj2) {
                    return AuthorizedResultCardKt.m11796o(modifier3, vm, interfaceC10570l, interfaceC10559a, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: k */
    public static final boolean m11792k(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    /* renamed from: l */
    public static final C8736p m11793l(final UiState uiState, final InterfaceC10570l interfaceC10570l, BoxScope PullToRefreshBox, Composer composer, int i10) {
        Object t10;
        AbstractC9133u.m16133g(PullToRefreshBox, "$this$PullToRefreshBox");
        boolean z10 = false;
        if (composer.shouldExecute((i10 & 17) != 16, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(960290240, i10, -1, "com.zykj.study.ui.home.my.card.AuthorizedPage.<anonymous>.<anonymous> (AuthorizedResultCard.kt:65)");
            }
            try {
                AbstractC9133u.m16131e(uiState, "null cannot be cast to non-null type com.zykj.study.bean.UiState.Success<*>");
                t10 = ((UiState.Success) uiState).getT();
            } catch (ClassCastException unused) {
            }
            if (t10 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<com.zykj.study.bean.exercise.AuthorizeLesson>");
            }
            z10 = !((List) t10).isEmpty();
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
            Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = z10 ? arrangement.getTop() : arrangement.getCenter();
            boolean zChanged = composer.changed(uiState) | composer.changed(interfaceC10570l);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new InterfaceC10570l() { // from class: c5.r
                    @Override // p300x7.InterfaceC10570l
                    public final Object invoke(Object obj) {
                        return AuthorizedResultCardKt.m11794m(uiState, interfaceC10570l, (LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            LazyDslKt.LazyColumn(modifierFillMaxSize$default, null, null, false, top2, centerHorizontally, null, false, null, (InterfaceC10570l) objRememberedValue, composer, 196614, 462);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return C8736p.f16368a;
    }

    /* renamed from: m */
    public static final C8736p m11794m(UiState uiState, final InterfaceC10570l interfaceC10570l, LazyListScope LazyColumn) {
        LazyListScope lazyListScope;
        Object t10;
        AbstractC9133u.m16133g(LazyColumn, "$this$LazyColumn");
        if (!(uiState instanceof UiState.Error)) {
            lazyListScope = LazyColumn;
        } else if (((UiState.Error) uiState).isBadNetwork()) {
            LazyListScope.item$default(LazyColumn, null, null, C5237b0.f2323a.m2154f(), 3, null);
            lazyListScope = LazyColumn;
        } else {
            lazyListScope = LazyColumn;
            LazyListScope.item$default(lazyListScope, null, null, C5237b0.f2323a.m2153e(), 3, null);
        }
        try {
            AbstractC9133u.m16131e(uiState, "null cannot be cast to non-null type com.zykj.study.bean.UiState.Success<*>");
            t10 = ((UiState.Success) uiState).getT();
        } catch (ClassCastException unused) {
        }
        if (t10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<com.zykj.study.bean.exercise.AuthorizeLesson>");
        }
        final List list = (List) t10;
        if (list.isEmpty()) {
            LazyListScope.item$default(lazyListScope, null, null, C5237b0.f2323a.m2152d(), 3, null);
        } else {
            lazyListScope.items(list.size(), null, new InterfaceC10570l() { // from class: com.zykj.study.ui.home.my.card.AuthorizedResultCardKt$AuthorizedPage$lambda$11$lambda$10$lambda$9$lambda$8$lambda$7$$inlined$itemsIndexed$default$2
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
            }, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new InterfaceC10576r() { // from class: com.zykj.study.ui.home.my.card.AuthorizedResultCardKt$AuthorizedPage$lambda$11$lambda$10$lambda$9$lambda$8$lambda$7$$inlined$itemsIndexed$default$3
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
                    composer.startReplaceGroup(-705048284);
                    boolean zChanged = composer.changed(interfaceC10570l) | composer.changed(authorizeLesson);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new AuthorizedResultCardKt.C8097a(interfaceC10570l, authorizeLesson);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    AuthorizedResultCardKt.m11788g(authorizeLesson, (InterfaceC10559a) objRememberedValue, composer, 0);
                    DividerKt.m22061HorizontalDivider9IZ8Weo(SizeKt.m20889height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), C3156Dp.m26899constructorimpl(1)), 0.0f, ColorResources_androidKt.colorResource(R$color.divider_color, composer, 0), composer, 6, 2);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        }
        return C8736p.f16368a;
    }

    /* renamed from: n */
    public static final C8736p m11795n(InterfaceC10559a interfaceC10559a) {
        if (interfaceC10559a != null) {
            interfaceC10559a.invoke();
        }
        return C8736p.f16368a;
    }

    /* renamed from: o */
    public static final C8736p m11796o(Modifier modifier, AuthorizedLessonViewModel authorizedLessonViewModel, InterfaceC10570l interfaceC10570l, InterfaceC10559a interfaceC10559a, int i10, int i11, Composer composer, int i12) {
        m11791j(modifier, authorizedLessonViewModel, interfaceC10570l, interfaceC10559a, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return C8736p.f16368a;
    }
}
