package com.zykj.study.p065ui.home.p066my;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.ComposedModifierKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.graphics.ColorFilter;
import androidx.compose.p013ui.layout.ContentScale;
import androidx.compose.p013ui.layout.MeasurePolicy;
import androidx.compose.p013ui.node.ComposeUiNode;
import androidx.compose.p013ui.platform.ComposeView;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavArgsLazy;
import androidx.navigation.fragment.FragmentKt;
import androidx.profileinstaller.ProfileVerifier;
import com.tencent.smtt.sdk.TbsListener;
import com.xuexiang.xui.utils.AbstractViewTreeObserverOnGlobalLayoutListenerC6874d;
import com.xuexiang.xui.widget.dialog.materialdialog.DialogAction;
import com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog;
import com.zykj.base.utils.XToastUtils;
import com.zykj.http.exception.RemoteCodeException;
import com.zykj.lib.p063ui.R$dimen;
import com.zykj.study.R$color;
import com.zykj.study.R$drawable;
import com.zykj.study.R$string;
import com.zykj.study.bean.UiState;
import com.zykj.study.bean.exercise.AuthorizeLesson;
import com.zykj.study.p065ui.home.p066my.AuthorizedLessonFragment;
import com.zykj.study.p065ui.home.p066my.card.AuthorizationSearchListKt;
import com.zykj.study.p065ui.home.p066my.card.AuthorizedResultCardKt;
import com.zykj.study.utils.ContextExtKt;
import com.zykj.study.utils.CustomIndication;
import com.zykj.study.viewmodels.AuthorizedLessonViewModel;
import kotlin.AbstractC9078a;
import kotlin.AbstractC9079b;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p086e5.AbstractC8366o;
import p123h7.C8736p;
import p123h7.InterfaceC8724d;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9275l;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class AuthorizedLessonFragment extends Hilt_AuthorizedLessonFragment {

    /* renamed from: f */
    public final NavArgsLazy f12788f = new NavArgsLazy(AbstractC9137y.m16154b(AuthorizedLessonFragmentArgs.class), new C7983a(this));

    /* renamed from: g */
    public final InterfaceC8724d f12789g;

    /* renamed from: com.zykj.study.ui.home.my.AuthorizedLessonFragment$a */
    public static final class C7983a implements InterfaceC10559a {

        /* renamed from: a */
        public final /* synthetic */ Fragment f12797a;

        public C7983a(Fragment fragment) {
            this.f12797a = fragment;
        }

        @Override // p300x7.InterfaceC10559a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f12797a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f12797a + " has null arguments");
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.AuthorizedLessonFragment$onViewCreated$1", m17801f = "AuthorizedLessonFragment.kt", m17802l = {97}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.my.AuthorizedLessonFragment$onViewCreated$1 */
    public static final class C79841 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f12798a;

        @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.AuthorizedLessonFragment$onViewCreated$1$1", m17801f = "AuthorizedLessonFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.study.ui.home.my.AuthorizedLessonFragment$onViewCreated$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f12800a;

            /* renamed from: b */
            public /* synthetic */ Object f12801b;

            public AnonymousClass1(InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object invoke(UiState uiState, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass1) create(uiState, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(interfaceC9324c);
                anonymousClass1.f12801b = obj;
                return anonymousClass1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object t10;
                UiState uiState = (UiState) this.f12801b;
                AbstractC9434a.m17291f();
                if (this.f12800a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
                try {
                    AbstractC9133u.m16131e(uiState, "null cannot be cast to non-null type com.zykj.study.bean.UiState.Success<*>");
                    t10 = ((UiState.Success) uiState).getT();
                } catch (ClassCastException unused) {
                }
                if (t10 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                }
                AbstractC8366o.m13651c(XToastUtils.INSTANCE, R$string.authorizing_success);
                if (uiState instanceof UiState.Error) {
                    UiState.Error error = (UiState.Error) uiState;
                    if (error.getException() instanceof RemoteCodeException) {
                        Integer messageResId = ((RemoteCodeException) error.getException()).getErrorCodeInfo().getMessageResId();
                        if (messageResId != null) {
                            AbstractC8366o.m13651c(XToastUtils.INSTANCE, messageResId.intValue());
                        } else {
                            String message = ((RemoteCodeException) error.getException()).getErrorCodeInfo().getMessage();
                            if (message != null) {
                                AbstractC8366o.m13652d(XToastUtils.INSTANCE, message);
                            }
                        }
                    } else {
                        AbstractC8366o.m13651c(XToastUtils.INSTANCE, R$string.authorizing_fail);
                    }
                }
                return C8736p.f16368a;
            }
        }

        public C79841(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return AuthorizedLessonFragment.this.new C79841(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C79841) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f12798a;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                InterfaceC9275l interfaceC9275lM11990k = AuthorizedLessonFragment.this.m11203s().m11990k();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                this.f12798a = 1;
                if (AbstractC9268e.m17019i(interfaceC9275lM11990k, anonymousClass1, this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            return C8736p.f16368a;
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.AuthorizedLessonFragment$onViewCreated$2", m17801f = "AuthorizedLessonFragment.kt", m17802l = {117}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.my.AuthorizedLessonFragment$onViewCreated$2 */
    public static final class C79852 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f12802a;

        @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.AuthorizedLessonFragment$onViewCreated$2$1", m17801f = "AuthorizedLessonFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.study.ui.home.my.AuthorizedLessonFragment$onViewCreated$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f12804a;

            /* renamed from: b */
            public /* synthetic */ Object f12805b;

            public AnonymousClass1(InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object invoke(UiState uiState, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass1) create(uiState, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(interfaceC9324c);
                anonymousClass1.f12805b = obj;
                return anonymousClass1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object t10;
                UiState uiState = (UiState) this.f12805b;
                AbstractC9434a.m17291f();
                if (this.f12804a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
                try {
                    AbstractC9133u.m16131e(uiState, "null cannot be cast to non-null type com.zykj.study.bean.UiState.Success<*>");
                    t10 = ((UiState.Success) uiState).getT();
                } catch (ClassCastException unused) {
                }
                if (t10 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                }
                AbstractC8366o.m13651c(XToastUtils.INSTANCE, R$string.deauthorizing_success);
                if (uiState instanceof UiState.Error) {
                    UiState.Error error = (UiState.Error) uiState;
                    if (error.getException() instanceof RemoteCodeException) {
                        Integer messageResId = ((RemoteCodeException) error.getException()).getErrorCodeInfo().getMessageResId();
                        if (messageResId != null) {
                            AbstractC8366o.m13651c(XToastUtils.INSTANCE, messageResId.intValue());
                        } else {
                            String message = ((RemoteCodeException) error.getException()).getErrorCodeInfo().getMessage();
                            if (message != null) {
                                AbstractC8366o.m13652d(XToastUtils.INSTANCE, message);
                            }
                        }
                    } else {
                        AbstractC8366o.m13651c(XToastUtils.INSTANCE, R$string.deauthorizing_fail);
                    }
                }
                return C8736p.f16368a;
            }
        }

        public C79852(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return AuthorizedLessonFragment.this.new C79852(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C79852) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f12802a;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                InterfaceC9275l interfaceC9275lM11992m = AuthorizedLessonFragment.this.m11203s().m11992m();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                this.f12802a = 1;
                if (AbstractC9268e.m17019i(interfaceC9275lM11992m, anonymousClass1, this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            return C8736p.f16368a;
        }
    }

    public AuthorizedLessonFragment() {
        final InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.AuthorizedLessonFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC8724d interfaceC8724dM15923a = AbstractC9078a.m15923a(LazyThreadSafetyMode.f17345c, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.AuthorizedLessonFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a.invoke();
            }
        });
        final InterfaceC10559a interfaceC10559a2 = null;
        this.f12789g = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(AuthorizedLessonViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.AuthorizedLessonFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.AuthorizedLessonFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC10559a interfaceC10559a3 = interfaceC10559a2;
                if (interfaceC10559a3 != null && (creationExtras = (CreationExtras) interfaceC10559a3.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM27188viewModels$lambda1 = FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM27188viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM27188viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.AuthorizedLessonFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM27188viewModels$lambda1 = FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM27188viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM27188viewModels$lambda1 : null;
                return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            }
        });
    }

    /* renamed from: o */
    public static final C8736p m11193o(AuthorizedLessonFragment authorizedLessonFragment) {
        AbstractViewTreeObserverOnGlobalLayoutListenerC6874d.m6435d(authorizedLessonFragment.getView());
        FragmentKt.findNavController(authorizedLessonFragment).navigateUp();
        return C8736p.f16368a;
    }

    /* renamed from: p */
    public static final C8736p m11194p(AuthorizedLessonFragment authorizedLessonFragment, int i10, Composer composer, int i11) {
        authorizedLessonFragment.m11201n(composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return C8736p.f16368a;
    }

    /* renamed from: t */
    public static final C8736p m11196t(final AuthorizedLessonFragment authorizedLessonFragment, Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(104269477, i10, -1, "com.zykj.study.ui.home.my.AuthorizedLessonFragment.onCreateView.<anonymous>.<anonymous> (AuthorizedLessonFragment.kt:55)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top2, companion2.getStart(), composer, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            InterfaceC10559a constructor = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM23703constructorimpl = Updater.m23703constructorimpl(composer);
            Updater.m23710setimpl(composerM23703constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m23710setimpl(composerM23703constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            InterfaceC10574p setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM23703constructorimpl.getInserting() || !AbstractC9133u.m16128b(composerM23703constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM23703constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM23703constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m23710setimpl(composerM23703constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            authorizedLessonFragment.m11201n(composer, 0);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer, 0);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, companion);
            InterfaceC10559a constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM23703constructorimpl2 = Updater.m23703constructorimpl(composer);
            Updater.m23710setimpl(composerM23703constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m23710setimpl(composerM23703constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            InterfaceC10574p setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM23703constructorimpl2.getInserting() || !AbstractC9133u.m16128b(composerM23703constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM23703constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM23703constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m23710setimpl(composerM23703constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier modifierM20860paddingqDBjuR0$default = PaddingKt.m20860paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion, 0.5f), PrimitiveResources_androidKt.dimensionResource(R$dimen.view_7, composer, 0), PrimitiveResources_androidKt.dimensionResource(R$dimen.view_10, composer, 0), PrimitiveResources_androidKt.dimensionResource(R$dimen.view_7, composer, 0), 0.0f, 8, null);
            AuthorizedLessonViewModel authorizedLessonViewModelM11203s = authorizedLessonFragment.m11203s();
            boolean zChangedInstance = composer.changedInstance(authorizedLessonFragment);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new InterfaceC10574p() { // from class: b5.b
                    @Override // p300x7.InterfaceC10574p
                    public final Object invoke(Object obj, Object obj2) {
                        return AuthorizedLessonFragment.m11197u(this.f2124a, ((Integer) obj).intValue(), (AuthorizeLesson) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            AuthorizationSearchListKt.m11770p(modifierM20860paddingqDBjuR0$default, authorizedLessonViewModelM11203s, (InterfaceC10574p) objRememberedValue, composer, 0);
            DividerKt.m22061HorizontalDivider9IZ8Weo(SizeKt.fillMaxHeight$default(SizeKt.m20908width3ABfNKs(companion, C3156Dp.m26899constructorimpl((float) 0.5d)), 0.0f, 1, null), 0.0f, ColorResources_androidKt.colorResource(R$color.divider_color, composer, 0), composer, 6, 2);
            Modifier modifierM20860paddingqDBjuR0$default2 = PaddingKt.m20860paddingqDBjuR0$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R$dimen.view_11, composer, 0), 0.0f, PrimitiveResources_androidKt.dimensionResource(R$dimen.view_11, composer, 0), 0.0f, 10, null);
            AuthorizedLessonViewModel authorizedLessonViewModelM11203s2 = authorizedLessonFragment.m11203s();
            boolean zChangedInstance2 = composer.changedInstance(authorizedLessonFragment);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new InterfaceC10570l() { // from class: b5.c
                    @Override // p300x7.InterfaceC10570l
                    public final Object invoke(Object obj) {
                        return AuthorizedLessonFragment.m11198v(this.f2130a, (AuthorizeLesson) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            InterfaceC10570l interfaceC10570l = (InterfaceC10570l) objRememberedValue2;
            boolean zChangedInstance3 = composer.changedInstance(authorizedLessonFragment);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new InterfaceC10559a() { // from class: b5.d
                    @Override // p300x7.InterfaceC10559a
                    public final Object invoke() {
                        return AuthorizedLessonFragment.m11199w(this.f2135a);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            AuthorizedResultCardKt.m11791j(modifierM20860paddingqDBjuR0$default2, authorizedLessonViewModelM11203s2, interfaceC10570l, (InterfaceC10559a) objRememberedValue3, composer, 0, 0);
            composer.endNode();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return C8736p.f16368a;
    }

    /* renamed from: u */
    public static final C8736p m11197u(AuthorizedLessonFragment authorizedLessonFragment, int i10, AuthorizeLesson authorizeLesson) {
        AbstractC9133u.m16133g(authorizeLesson, "authorizeLesson");
        authorizedLessonFragment.m11203s().m11985f(i10, authorizeLesson);
        return C8736p.f16368a;
    }

    /* renamed from: v */
    public static final C8736p m11198v(AuthorizedLessonFragment authorizedLessonFragment, AuthorizeLesson it) {
        AbstractC9133u.m16133g(it, "it");
        authorizedLessonFragment.m11204x(it);
        return C8736p.f16368a;
    }

    /* renamed from: w */
    public static final C8736p m11199w(AuthorizedLessonFragment authorizedLessonFragment) {
        authorizedLessonFragment.m11203s().m11988i();
        return C8736p.f16368a;
    }

    /* renamed from: y */
    public static final void m11200y(AuthorizedLessonFragment authorizedLessonFragment, AuthorizeLesson authorizeLesson, MaterialDialog materialDialog, DialogAction dialogAction) {
        AbstractC9133u.m16133g(materialDialog, "<unused var>");
        AbstractC9133u.m16133g(dialogAction, "<unused var>");
        authorizedLessonFragment.m11203s().m11986g(authorizeLesson);
    }

    /* renamed from: n */
    public final void m11201n(Composer composer, final int i10) {
        int i11;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2009164032);
        if ((i10 & 6) == 0) {
            i11 = i10 | (composerStartRestartGroup.changedInstance(this) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2009164032, i11, -1, "com.zykj.study.ui.home.my.AuthorizedLessonFragment.TitleBar (AuthorizedLessonFragment.kt:137)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            Updater.m23710setimpl(composerM23703constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m23710setimpl(composerM23703constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            InterfaceC10574p setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM23703constructorimpl.getInserting() || !AbstractC9133u.m16128b(composerM23703constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM23703constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM23703constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m23710setimpl(composerM23703constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierM20889height3ABfNKs = SizeKt.m20889height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R$dimen.view_30, composerStartRestartGroup, 0));
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM20889height3ABfNKs);
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
            Updater.m23710setimpl(composerM23703constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m23710setimpl(composerM23703constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            InterfaceC10574p setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM23703constructorimpl2.getInserting() || !AbstractC9133u.m16128b(composerM23703constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM23703constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM23703constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m23710setimpl(composerM23703constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Alignment.Vertical centerVertically2 = companion2.getCenterVertically();
            Modifier modifierM20860paddingqDBjuR0$default = PaddingKt.m20860paddingqDBjuR0$default(companion, PrimitiveResources_androidKt.dimensionResource(R$dimen.view_9, composerStartRestartGroup, 0), 0.0f, 0.0f, 0.0f, 14, null);
            MutableInteractionSource MutableInteractionSource = InteractionSourceKt.MutableInteractionSource();
            CustomIndication customIndication = CustomIndication.f13729a;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new InterfaceC10559a() { // from class: b5.e
                    @Override // p300x7.InterfaceC10559a
                    public final Object invoke() {
                        return AuthorizedLessonFragment.m11193o(this.f2141a);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierM20382clickableO2vRcR0$default = ClickableKt.m20382clickableO2vRcR0$default(modifierM20860paddingqDBjuR0$default, MutableInteractionSource, customIndication, false, null, null, (InterfaceC10559a) objRememberedValue, 28, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically2, composerStartRestartGroup, 48);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM20382clickableO2vRcR0$default);
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
            Updater.m23710setimpl(composerM23703constructorimpl3, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m23710setimpl(composerM23703constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            InterfaceC10574p setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (composerM23703constructorimpl3.getInserting() || !AbstractC9133u.m16128b(composerM23703constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM23703constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM23703constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m23710setimpl(composerM23703constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            ImageKt.Image(PainterResources_androidKt.painterResource(R$drawable.ic_arrow_left, composerStartRestartGroup, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 48, TbsListener.ErrorCode.DOWNLOAD_REDIRECT_EMPTY);
            composer2 = composerStartRestartGroup;
            TextKt.m22699Text4IGK_g(StringResources_androidKt.stringResource(R$string.arrow_left_return, composerStartRestartGroup, 0), (Modifier) null, ColorResources_androidKt.colorResource(R$color.text_sub_title, composerStartRestartGroup, 0), ContextExtKt.m11877c(PrimitiveResources_androidKt.dimensionResource(R$dimen.text_9, composerStartRestartGroup, 0), composerStartRestartGroup, 0), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC10570l) null, (TextStyle) null, composer2, 0, 0, 131058);
            composer2.endNode();
            composer2.endNode();
            TextKt.m22699Text4IGK_g(StringResources_androidKt.stringResource(R$string.authorize_management, composer2, 0), boxScopeInstance.align(companion, companion2.getCenter()), 0L, ContextExtKt.m11877c(PrimitiveResources_androidKt.dimensionResource(R$dimen.text_10, composer2, 0), composer2, 0), (FontStyle) null, FontWeight.Companion.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC10570l) null, (TextStyle) null, composer2, ProfileVerifier.CompilationStatus.f1860xf2722a21, 0, 131028);
            DividerKt.m22061HorizontalDivider9IZ8Weo(boxScopeInstance.align(SizeKt.m20889height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), C3156Dp.m26899constructorimpl((float) 0.5d)), companion2.getBottomCenter()), 0.0f, ColorResources_androidKt.colorResource(R$color.divider_color, composer2, 0), composer2, 0, 2);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC10574p() { // from class: b5.f
                @Override // p300x7.InterfaceC10574p
                public final Object invoke(Object obj, Object obj2) {
                    return AuthorizedLessonFragment.m11194p(this.f2149a, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC9133u.m16133g(inflater, "inflater");
        Context contextRequireContext = requireContext();
        AbstractC9133u.m16132f(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(104269477, true, new InterfaceC10574p() { // from class: b5.a
            @Override // p300x7.InterfaceC10574p
            public final Object invoke(Object obj, Object obj2) {
                return AuthorizedLessonFragment.m11196t(this.f2118a, (Composer) obj, ((Integer) obj2).intValue());
            }
        }));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        AbstractC9133u.m16133g(view, "view");
        super.onViewCreated(view, bundle);
        m11203s().m11997r(m11202r().m11208a());
        m11203s().m11988i();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C79841(null), 3, null);
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new C79852(null), 3, null);
    }

    /* renamed from: r */
    public final AuthorizedLessonFragmentArgs m11202r() {
        return (AuthorizedLessonFragmentArgs) this.f12788f.getValue();
    }

    /* renamed from: s */
    public final AuthorizedLessonViewModel m11203s() {
        return (AuthorizedLessonViewModel) this.f12789g.getValue();
    }

    /* renamed from: x */
    public final void m11204x(final AuthorizeLesson authorizeLesson) {
        new MaterialDialog.C6913g(requireContext()).m6749j(getString(R$string.is_deauthorize)).m6765z(R$string.sure).m6759t(R$string.cancel).m6762w(new MaterialDialog.InterfaceC6915i() { // from class: b5.g
            @Override // com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog.InterfaceC6915i
            /* renamed from: a */
            public final void mo2080a(MaterialDialog materialDialog, DialogAction dialogAction) {
                AuthorizedLessonFragment.m11200y(this.f2156a, authorizeLesson, materialDialog, dialogAction);
            }
        }).m6734E();
    }
}
