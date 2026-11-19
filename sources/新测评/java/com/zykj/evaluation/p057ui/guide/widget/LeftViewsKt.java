package com.zykj.evaluation.p057ui.guide.widget;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.ComposedModifierKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.graphics.ColorKt;
import androidx.compose.p013ui.layout.LayoutKt;
import androidx.compose.p013ui.layout.MeasurePolicy;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.node.ComposeUiNode;
import androidx.compose.p013ui.platform.CompositionLocalsKt;
import androidx.compose.p013ui.res.StringResources_androidKt;
import androidx.compose.p013ui.semantics.SemanticsModifierKt;
import androidx.compose.p013ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p013ui.text.TextLayoutResult;
import androidx.compose.p013ui.text.TextStyle;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.text.font.FontStyle;
import androidx.compose.p013ui.text.font.FontWeight;
import androidx.compose.p013ui.text.style.TextAlign;
import androidx.compose.p013ui.text.style.TextDecoration;
import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.compose.HorizontalAnchorable;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtilsKt;
import androidx.constraintlayout.compose.VerticalAnchorable;
import androidx.profileinstaller.ProfileVerifier;
import com.zykj.evaluation.R;
import com.zykj.evaluation.p057ui.guide.widget.LeftViewsKt;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import p068d7.AbstractC7305a;
import p079e7.AbstractC7411w;
import p101g7.AbstractC7593i;
import p189o5.AbstractC8709e;
import p223r6.C9015d;

/* loaded from: classes4.dex */
public abstract class LeftViewsKt {

    /* renamed from: com.zykj.evaluation.ui.guide.widget.LeftViewsKt$a */
    public static final class C6914a implements Function1 {

        /* renamed from: a */
        public static final C6914a f9744a = new C6914a();

        /* renamed from: a */
        public final void m9925a(ConstrainScope constrainAs) {
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            HorizontalAnchorable.m23937linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, (Object) null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m9925a((ConstrainScope) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.zykj.evaluation.ui.guide.widget.LeftViewsKt$b */
    public static final class C6915b implements Function1 {

        /* renamed from: a */
        public final /* synthetic */ ConstrainedLayoutReference f9745a;

        public C6915b(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f9745a = constrainedLayoutReference;
        }

        /* renamed from: a */
        public final void m9926a(ConstrainScope constrainAs) {
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            HorizontalAnchorable.m23937linkToVpY3zN4$default(constrainAs.getTop(), this.f9745a.getBottom(), C3127Dp.m23561constructorimpl((8 / 600) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 4, (Object) null);
            VerticalAnchorable.m24034linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m9926a((ConstrainScope) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.zykj.evaluation.ui.guide.widget.LeftViewsKt$c */
    public static final class C6916c implements Function1 {

        /* renamed from: a */
        public final /* synthetic */ ConstrainedLayoutReference f9746a;

        public C6916c(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f9746a = constrainedLayoutReference;
        }

        /* renamed from: a */
        public final void m9927a(ConstrainScope constrainAs) {
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            HorizontalAnchorable.m23937linkToVpY3zN4$default(constrainAs.getTop(), this.f9746a.getTop(), 0.0f, 0.0f, 6, (Object) null);
            HorizontalAnchorable.m23937linkToVpY3zN4$default(constrainAs.getBottom(), this.f9746a.getBottom(), 0.0f, 0.0f, 6, (Object) null);
            VerticalAnchorable.m24034linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m9927a((ConstrainScope) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.zykj.evaluation.ui.guide.widget.LeftViewsKt$d */
    public static final class C6917d implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ Function0 f9747a;

        public C6917d(Function0 function0) {
            this.f9747a = function0;
        }

        /* renamed from: a */
        public final void m9928a() {
            this.f9747a.invoke();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m9928a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.zykj.evaluation.ui.guide.widget.LeftViewsKt$e */
    public static final class C6918e implements Function1 {

        /* renamed from: a */
        public final /* synthetic */ ConstrainedLayoutReference f9748a;

        public C6918e(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f9748a = constrainedLayoutReference;
        }

        /* renamed from: a */
        public final void m9929a(ConstrainScope constrainAs) {
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            Dimension.Companion companion = Dimension.INSTANCE;
            constrainAs.setWidth(companion.getMatchParent());
            float f10 = 600;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            constrainAs.setHeight(companion.m23919value0680j_4(C3127Dp.m23561constructorimpl((66 / f10) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density))));
            HorizontalAnchorable top2 = constrainAs.getTop();
            ConstraintLayoutBaseScope.HorizontalAnchor bottom = this.f9748a.getBottom();
            float f11 = 5 / f10;
            DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
            HorizontalAnchorable.m23937linkToVpY3zN4$default(top2, bottom, C3127Dp.m23561constructorimpl(f11 * (RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 4, (Object) null);
            HorizontalAnchorable.m23937linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, (Object) null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m9929a((ConstrainScope) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.zykj.evaluation.ui.guide.widget.LeftViewsKt$f */
    public static final class C6919f implements Function1 {

        /* renamed from: a */
        public static final C6919f f9749a = new C6919f();

        /* renamed from: a */
        public final void m9930a(ConstrainScope constrainAs) {
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            HorizontalAnchorable.m23937linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, (Object) null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m9930a((ConstrainScope) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.zykj.evaluation.ui.guide.widget.LeftViewsKt$g */
    public static final class C6920g implements Function1 {

        /* renamed from: a */
        public final /* synthetic */ ConstrainedLayoutReference f9750a;

        public C6920g(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f9750a = constrainedLayoutReference;
        }

        /* renamed from: a */
        public final void m9931a(ConstrainScope constrainAs) {
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            HorizontalAnchorable.m23937linkToVpY3zN4$default(constrainAs.getTop(), this.f9750a.getBottom(), C3127Dp.m23561constructorimpl((8 / 600) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 4, (Object) null);
            VerticalAnchorable.m24034linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m9931a((ConstrainScope) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.zykj.evaluation.ui.guide.widget.LeftViewsKt$h */
    public static final class C6921h implements Function1 {

        /* renamed from: a */
        public final /* synthetic */ ConstrainedLayoutReference f9751a;

        public C6921h(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f9751a = constrainedLayoutReference;
        }

        /* renamed from: a */
        public final void m9932a(ConstrainScope constrainAs) {
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            HorizontalAnchorable.m23937linkToVpY3zN4$default(constrainAs.getTop(), this.f9751a.getTop(), 0.0f, 0.0f, 6, (Object) null);
            HorizontalAnchorable.m23937linkToVpY3zN4$default(constrainAs.getBottom(), this.f9751a.getBottom(), 0.0f, 0.0f, 6, (Object) null);
            VerticalAnchorable.m24034linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m9932a((ConstrainScope) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.zykj.evaluation.ui.guide.widget.LeftViewsKt$i */
    public static final class C6922i implements Function1 {

        /* renamed from: a */
        public final /* synthetic */ ConstrainedLayoutReference f9752a;

        public C6922i(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f9752a = constrainedLayoutReference;
        }

        /* renamed from: a */
        public final void m9933a(ConstrainScope constrainAs) {
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            HorizontalAnchorable.m23937linkToVpY3zN4$default(constrainAs.getTop(), this.f9752a.getBottom(), C3127Dp.m23561constructorimpl((5 / 600) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 4, (Object) null);
            VerticalAnchorable.m24034linkToVpY3zN4$default(constrainAs.getStart(), this.f9752a.getStart(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m9933a((ConstrainScope) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.zykj.evaluation.ui.guide.widget.LeftViewsKt$j */
    public static final class C6923j implements Function1 {

        /* renamed from: a */
        public final /* synthetic */ ConstrainedLayoutReference f9753a;

        public C6923j(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f9753a = constrainedLayoutReference;
        }

        /* renamed from: a */
        public final void m9934a(ConstrainScope constrainAs) {
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            HorizontalAnchorable top2 = constrainAs.getTop();
            ConstraintLayoutBaseScope.HorizontalAnchor bottom = this.f9753a.getBottom();
            float f10 = 600;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            HorizontalAnchorable.m23937linkToVpY3zN4$default(top2, bottom, C3127Dp.m23561constructorimpl((5 / f10) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 4, (Object) null);
            HorizontalAnchorable bottom2 = constrainAs.getBottom();
            ConstraintLayoutBaseScope.HorizontalAnchor bottom3 = constrainAs.getParent().getBottom();
            DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
            HorizontalAnchorable.m23937linkToVpY3zN4$default(bottom2, bottom3, C3127Dp.m23561constructorimpl((9 / f10) * (RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 4, (Object) null);
            VerticalAnchorable.m24034linkToVpY3zN4$default(constrainAs.getStart(), this.f9753a.getStart(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m9934a((ConstrainScope) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.zykj.evaluation.ui.guide.widget.LeftViewsKt$k */
    public static final class C6924k implements Function1 {

        /* renamed from: a */
        public final /* synthetic */ ConstrainedLayoutReference f9754a;

        public C6924k(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f9754a = constrainedLayoutReference;
        }

        /* renamed from: a */
        public final void m9935a(ConstrainScope constrainAs) {
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            HorizontalAnchorable.m23937linkToVpY3zN4$default(constrainAs.getTop(), this.f9754a.getTop(), 0.0f, 0.0f, 6, (Object) null);
            HorizontalAnchorable.m23937linkToVpY3zN4$default(constrainAs.getBottom(), this.f9754a.getBottom(), 0.0f, 0.0f, 6, (Object) null);
            VerticalAnchorable.m24034linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m9935a((ConstrainScope) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.zykj.evaluation.ui.guide.widget.LeftViewsKt$l */
    public static final class C6925l implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ Function0 f9755a;

        public C6925l(Function0 function0) {
            this.f9755a = function0;
        }

        /* renamed from: a */
        public final void m9936a() {
            this.f9755a.invoke();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m9936a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: d */
    public static final void m9919d(Modifier modifier, final String title, final String content, final Function0 onClickDetail, Composer composer, final int i10, final int i11) {
        final Modifier modifier2;
        int i12;
        Composer composer2;
        final Modifier modifier3;
        final MutableState mutableState;
        MutableState mutableState2;
        final ConstraintSetForInlineDsl constraintSetForInlineDsl;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(onClickDetail, "onClickDetail");
        Composer composerStartRestartGroup = composer.startRestartGroup(624872512);
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
            i12 |= composerStartRestartGroup.changed(title) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changed(content) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(onClickDetail) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 1171) != 1170, i12 & 1)) {
            if (i13 != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(624872512, i12, -1, "com.zykj.evaluation.ui.guide.widget.ExamDescriptionLeftView (LeftViews.kt:195)");
            }
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17683paddingVpY3zN4$default = PaddingKt.m17683paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), C3127Dp.m23561constructorimpl((8 / 600) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 2, null);
            composerStartRestartGroup.startReplaceGroup(-1003410150);
            composerStartRestartGroup.startReplaceGroup(212064437);
            composerStartRestartGroup.endReplaceGroup();
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Measurer2(density);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final Measurer2 measurer2 = (Measurer2) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new ConstraintLayoutScope();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final MutableState mutableState3 = (MutableState) objRememberedValue3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            final ConstraintSetForInlineDsl constraintSetForInlineDsl2 = (ConstraintSetForInlineDsl) objRememberedValue4;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            final MutableState mutableState4 = (MutableState) objRememberedValue5;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(measurer2) | composerStartRestartGroup.changed(257);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue6 == companion.getEmpty()) {
                final int i14 = 257;
                objRememberedValue6 = new MeasurePolicy() { // from class: com.zykj.evaluation.ui.guide.widget.LeftViewsKt$ExamDescriptionLeftView$$inlined$ConstraintLayout$2
                    @Override // androidx.compose.p013ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo16988measure3p2s80s(MeasureScope measureScope, final List list, long j10) {
                        final LinkedHashMap linkedHashMap = new LinkedHashMap();
                        mutableState4.getValue();
                        long jM23962performMeasureDjhGOtQ = measurer2.m23962performMeasureDjhGOtQ(j10, measureScope.getLayoutDirection(), constraintSetForInlineDsl2, list, linkedHashMap, i14);
                        mutableState3.getValue();
                        int iM23732getWidthimpl = IntSize.m23732getWidthimpl(jM23962performMeasureDjhGOtQ);
                        int iM23731getHeightimpl = IntSize.m23731getHeightimpl(jM23962performMeasureDjhGOtQ);
                        final Measurer2 measurer22 = measurer2;
                        return MeasureScope.layout$default(measureScope, iM23732getWidthimpl, iM23731getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.zykj.evaluation.ui.guide.widget.LeftViewsKt$ExamDescriptionLeftView$$inlined$ConstraintLayout$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Placeable.PlacementScope placementScope) {
                                measurer22.performLayout(placementScope, list, linkedHashMap);
                            }
                        }, 4, null);
                    }
                };
                mutableState = mutableState3;
                mutableState2 = mutableState4;
                constraintSetForInlineDsl = constraintSetForInlineDsl2;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            } else {
                mutableState2 = mutableState4;
                constraintSetForInlineDsl = constraintSetForInlineDsl2;
                mutableState = mutableState3;
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue6;
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = new Function0<Unit>() { // from class: com.zykj.evaluation.ui.guide.widget.LeftViewsKt$ExamDescriptionLeftView$$inlined$ConstraintLayout$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        mutableState.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                        constraintSetForInlineDsl.setKnownDirty(true);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            final Function0 function0 = (Function0) objRememberedValue7;
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(measurer2);
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.zykj.evaluation.ui.guide.widget.LeftViewsKt$ExamDescriptionLeftView$$inlined$ConstraintLayout$4
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        ToolingUtilsKt.setDesignInfoProvider(semanticsPropertyReceiver, measurer2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierM17683paddingVpY3zN4$default, false, (Function1) objRememberedValue8, 1, null);
            final MutableState mutableState5 = mutableState2;
            Modifier modifier4 = modifier2;
            composer2 = composerStartRestartGroup;
            LayoutKt.MultiMeasureLayout(modifierSemantics$default, ComposableLambdaKt.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.zykj.evaluation.ui.guide.widget.LeftViewsKt$ExamDescriptionLeftView$$inlined$ConstraintLayout$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i15) {
                    if ((i15 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1200550679, i15, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                    }
                    mutableState5.setValue(Unit.INSTANCE);
                    int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                    constraintLayoutScope.reset();
                    ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                    composer3.startReplaceGroup(1362822457);
                    ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
                    ConstrainedLayoutReference constrainedLayoutReferenceComponent1 = constrainedLayoutReferencesCreateRefs.component1();
                    ConstrainedLayoutReference constrainedLayoutReferenceComponent2 = constrainedLayoutReferencesCreateRefs.component2();
                    ConstrainedLayoutReference constrainedLayoutReferenceComponent3 = constrainedLayoutReferencesCreateRefs.component3();
                    ConstrainedLayoutReference constrainedLayoutReferenceComponent4 = constrainedLayoutReferencesCreateRefs.component4();
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Object objRememberedValue9 = composer3.rememberedValue();
                    Composer.Companion companion3 = Composer.INSTANCE;
                    if (objRememberedValue9 == companion3.getEmpty()) {
                        objRememberedValue9 = LeftViewsKt.C6914a.f9744a;
                        composer3.updateRememberedValue(objRememberedValue9);
                    }
                    DividerKt.m18809HorizontalDivider9IZ8Weo(constraintLayoutScope2.constrainAs(companion2, constrainedLayoutReferenceComponent4, (Function1) objRememberedValue9), 0.0f, ColorKt.Color(4293651952L), composer3, 384, 2);
                    boolean zChanged = composer3.changed(constrainedLayoutReferenceComponent4);
                    Object objRememberedValue10 = composer3.rememberedValue();
                    if (zChanged || objRememberedValue10 == companion3.getEmpty()) {
                        objRememberedValue10 = new LeftViewsKt.C6915b(constrainedLayoutReferenceComponent4);
                        composer3.updateRememberedValue(objRememberedValue10);
                    }
                    Modifier modifierConstrainAs = constraintLayoutScope2.constrainAs(companion2, constrainedLayoutReferenceComponent1, (Function1) objRememberedValue10);
                    Alignment.Companion companion4 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion4.getCenterVertically(), composer3, 48);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierConstrainAs);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion5.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM20418constructorimpl = Updater.m20418constructorimpl(composer3);
                    Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyRowMeasurePolicy, companion5.getSetMeasurePolicy());
                    Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                    if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    float f10 = 600;
                    float f11 = 2 / f10;
                    DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
                    float fM23561constructorimpl = C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f11);
                    DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
                    BoxKt.Box(BackgroundKt.m17190backgroundbw27NRU$default(SizeKt.m17730sizeVpY3zN4(companion2, fM23561constructorimpl, C3127Dp.m23561constructorimpl((5 / f10) * (RangesKt.coerceAtLeast(displayMetrics3.widthPixels, displayMetrics3.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), AbstractC7305a.m11585i(), null, 2, null), composer3, 6);
                    Modifier modifier5 = modifier2;
                    DisplayMetrics displayMetrics4 = Resources.getSystem().getDisplayMetrics();
                    TextKt.m19430Text4IGK_g(title, PaddingKt.m17685paddingqDBjuR0$default(modifier5, C3127Dp.m23561constructorimpl((3 / f10) * (RangesKt.coerceAtLeast(displayMetrics4.widthPixels, displayMetrics4.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 0.0f, 0.0f, 14, null), AbstractC7305a.m11577a(), AbstractC8709e.m14344k(8), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 200064, 0, 131024);
                    composer3.endNode();
                    boolean zChanged2 = composer3.changed(constrainedLayoutReferenceComponent1);
                    Object objRememberedValue11 = composer3.rememberedValue();
                    if (zChanged2 || objRememberedValue11 == companion3.getEmpty()) {
                        objRememberedValue11 = new LeftViewsKt.C6916c(constrainedLayoutReferenceComponent1);
                        composer3.updateRememberedValue(objRememberedValue11);
                    }
                    Modifier modifierConstrainAs2 = constraintLayoutScope2.constrainAs(companion2, constrainedLayoutReferenceComponent2, (Function1) objRememberedValue11);
                    boolean zChanged3 = composer3.changed(onClickDetail);
                    Object objRememberedValue12 = composer3.rememberedValue();
                    if (zChanged3 || objRememberedValue12 == companion3.getEmpty()) {
                        objRememberedValue12 = new LeftViewsKt.C6917d(onClickDetail);
                        composer3.updateRememberedValue(objRememberedValue12);
                    }
                    Modifier modifierM12480g = AbstractC7593i.m12480g(modifierConstrainAs2, false, (Function0) objRememberedValue12, 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierM12480g);
                    Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor2);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM20418constructorimpl2 = Updater.m20418constructorimpl(composer3);
                    Updater.m20425setimpl(composerM20418constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion5.getSetMeasurePolicy());
                    Updater.m20425setimpl(composerM20418constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                    if (composerM20418constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM20418constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM20418constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m20425setimpl(composerM20418constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    DisplayMetrics displayMetrics5 = Resources.getSystem().getDisplayMetrics();
                    float fM23561constructorimpl2 = C3127Dp.m23561constructorimpl((1 / f10) * (RangesKt.coerceAtLeast(displayMetrics5.widthPixels, displayMetrics5.heightPixels) / Resources.getSystem().getDisplayMetrics().density));
                    DisplayMetrics displayMetrics6 = Resources.getSystem().getDisplayMetrics();
                    TextKt.m19430Text4IGK_g(StringResources_androidKt.stringResource(R.string.watch_detail, composer3, 6), PaddingKt.m17682paddingVpY3zN4(companion2, C3127Dp.m23561constructorimpl(f11 * (RangesKt.coerceAtLeast(displayMetrics6.widthPixels, displayMetrics6.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), fM23561constructorimpl2), AbstractC7305a.m11585i(), AbstractC8709e.m14344k(8), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 3456, 0, 131056);
                    composer3.endNode();
                    boolean zChanged4 = composer3.changed(constrainedLayoutReferenceComponent1);
                    Object objRememberedValue13 = composer3.rememberedValue();
                    if (zChanged4 || objRememberedValue13 == companion3.getEmpty()) {
                        objRememberedValue13 = new LeftViewsKt.C6918e(constrainedLayoutReferenceComponent1);
                        composer3.updateRememberedValue(objRememberedValue13);
                    }
                    AbstractC7411w.m11905e(constraintLayoutScope2.constrainAs(companion2, constrainedLayoutReferenceComponent3, (Function1) objRememberedValue13), content, composer3, 0, 0);
                    composer3.endReplaceGroup();
                    if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                        EffectsKt.SideEffect(function0, composer3, 6);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), measurePolicy, composer2, 48, 0);
            composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: r6.t
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LeftViewsKt.m9920e(modifier3, title, content, onClickDetail, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: e */
    public static final Unit m9920e(Modifier modifier, String str, String str2, Function0 function0, int i10, int i11, Composer composer, int i12) {
        m9919d(modifier, str, str2, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0088  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m9921f(androidx.compose.p013ui.Modifier r38, final java.lang.String r39, final java.util.List r40, boolean r41, androidx.compose.runtime.Composer r42, final int r43, final int r44) {
        /*
            Method dump skipped, instructions count: 1122
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.guide.widget.LeftViewsKt.m9921f(androidx.compose.ui.Modifier, java.lang.String, java.util.List, boolean, androidx.compose.runtime.Composer, int, int):void"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/guide/widget/LeftViewsKt.smali:1152
    }

    /* renamed from: g */
    public static final Unit m9922g(Modifier modifier, String str, List list, boolean z9, int i10, int i11, Composer composer, int i12) {
        m9921f(modifier, str, list, z9, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }

    /* renamed from: h */
    public static final void m9923h(Modifier modifier, final String title, final String noSubmitContent, final String noCorrectContent, final Function0 onClickRefresh, final Function0 onClickProgressDetail, Composer composer, final int i10, final int i11) {
        Modifier modifier2;
        int i12;
        Composer composer2;
        final Modifier modifier3;
        final ConstraintSetForInlineDsl constraintSetForInlineDsl;
        final MutableState mutableState;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(noSubmitContent, "noSubmitContent");
        Intrinsics.checkNotNullParameter(noCorrectContent, "noCorrectContent");
        Intrinsics.checkNotNullParameter(onClickRefresh, "onClickRefresh");
        Intrinsics.checkNotNullParameter(onClickProgressDetail, "onClickProgressDetail");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1120737765);
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
            i12 |= composerStartRestartGroup.changed(title) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changed(noSubmitContent) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.changed(noCorrectContent) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(onClickRefresh) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(onClickProgressDetail) ? 131072 : 65536;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i12) != 74898, i12 & 1)) {
            Modifier modifier4 = i13 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1120737765, i12, -1, "com.zykj.evaluation.ui.guide.widget.SubmitProgressLeftView (LeftViews.kt:89)");
            }
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17683paddingVpY3zN4$default = PaddingKt.m17683paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), C3127Dp.m23561constructorimpl((8 / 600) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 2, null);
            composerStartRestartGroup.startReplaceGroup(-1003410150);
            composerStartRestartGroup.startReplaceGroup(212064437);
            composerStartRestartGroup.endReplaceGroup();
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Measurer2(density);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final Measurer2 measurer2 = (Measurer2) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new ConstraintLayoutScope();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final MutableState mutableState2 = (MutableState) objRememberedValue3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            final ConstraintSetForInlineDsl constraintSetForInlineDsl2 = (ConstraintSetForInlineDsl) objRememberedValue4;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            final MutableState mutableState3 = (MutableState) objRememberedValue5;
            final int i14 = 257;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(measurer2) | composerStartRestartGroup.changed(257);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new MeasurePolicy() { // from class: com.zykj.evaluation.ui.guide.widget.LeftViewsKt$SubmitProgressLeftView$$inlined$ConstraintLayout$2
                    @Override // androidx.compose.p013ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo16988measure3p2s80s(MeasureScope measureScope, final List list, long j10) {
                        final LinkedHashMap linkedHashMap = new LinkedHashMap();
                        mutableState3.getValue();
                        long jM23962performMeasureDjhGOtQ = measurer2.m23962performMeasureDjhGOtQ(j10, measureScope.getLayoutDirection(), constraintSetForInlineDsl2, list, linkedHashMap, i14);
                        mutableState2.getValue();
                        int iM23732getWidthimpl = IntSize.m23732getWidthimpl(jM23962performMeasureDjhGOtQ);
                        int iM23731getHeightimpl = IntSize.m23731getHeightimpl(jM23962performMeasureDjhGOtQ);
                        final Measurer2 measurer22 = measurer2;
                        return MeasureScope.layout$default(measureScope, iM23732getWidthimpl, iM23731getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.zykj.evaluation.ui.guide.widget.LeftViewsKt$SubmitProgressLeftView$$inlined$ConstraintLayout$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Placeable.PlacementScope placementScope) {
                                measurer22.performLayout(placementScope, list, linkedHashMap);
                            }
                        }, 4, null);
                    }
                };
                constraintSetForInlineDsl = constraintSetForInlineDsl2;
                mutableState = mutableState2;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            } else {
                constraintSetForInlineDsl = constraintSetForInlineDsl2;
                mutableState = mutableState2;
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue6;
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            final Modifier modifier5 = modifier4;
            if (objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = new Function0<Unit>() { // from class: com.zykj.evaluation.ui.guide.widget.LeftViewsKt$SubmitProgressLeftView$$inlined$ConstraintLayout$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        mutableState.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                        constraintSetForInlineDsl.setKnownDirty(true);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            final Function0 function0 = (Function0) objRememberedValue7;
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(measurer2);
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.zykj.evaluation.ui.guide.widget.LeftViewsKt$SubmitProgressLeftView$$inlined$ConstraintLayout$4
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        ToolingUtilsKt.setDesignInfoProvider(semanticsPropertyReceiver, measurer2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            composer2 = composerStartRestartGroup;
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierM17683paddingVpY3zN4$default, false, (Function1) objRememberedValue8, 1, null), ComposableLambdaKt.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.zykj.evaluation.ui.guide.widget.LeftViewsKt$SubmitProgressLeftView$$inlined$ConstraintLayout$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i15) {
                    if ((i15 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1200550679, i15, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                    }
                    mutableState3.setValue(Unit.INSTANCE);
                    int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                    constraintLayoutScope.reset();
                    ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                    composer3.startReplaceGroup(-1875798887);
                    ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
                    ConstrainedLayoutReference constrainedLayoutReferenceComponent1 = constrainedLayoutReferencesCreateRefs.component1();
                    ConstrainedLayoutReference constrainedLayoutReferenceComponent2 = constrainedLayoutReferencesCreateRefs.component2();
                    ConstrainedLayoutReference constrainedLayoutReferenceComponent3 = constrainedLayoutReferencesCreateRefs.component3();
                    ConstrainedLayoutReference constrainedLayoutReferenceComponent4 = constrainedLayoutReferencesCreateRefs.component4();
                    ConstrainedLayoutReference constrainedLayoutReferenceComponent5 = constrainedLayoutReferencesCreateRefs.component5();
                    ConstrainedLayoutReference constrainedLayoutReferenceComponent6 = constrainedLayoutReferencesCreateRefs.component6();
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Object objRememberedValue9 = composer3.rememberedValue();
                    Composer.Companion companion3 = Composer.INSTANCE;
                    if (objRememberedValue9 == companion3.getEmpty()) {
                        objRememberedValue9 = LeftViewsKt.C6919f.f9749a;
                        composer3.updateRememberedValue(objRememberedValue9);
                    }
                    DividerKt.m18809HorizontalDivider9IZ8Weo(constraintLayoutScope2.constrainAs(companion2, constrainedLayoutReferenceComponent6, (Function1) objRememberedValue9), 0.0f, ColorKt.Color(4293651952L), composer3, 384, 2);
                    boolean zChanged = composer3.changed(constrainedLayoutReferenceComponent6);
                    Object objRememberedValue10 = composer3.rememberedValue();
                    if (zChanged || objRememberedValue10 == companion3.getEmpty()) {
                        objRememberedValue10 = new LeftViewsKt.C6920g(constrainedLayoutReferenceComponent6);
                        composer3.updateRememberedValue(objRememberedValue10);
                    }
                    Modifier modifierConstrainAs = constraintLayoutScope2.constrainAs(companion2, constrainedLayoutReferenceComponent1, (Function1) objRememberedValue10);
                    Alignment.Companion companion4 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion4.getCenterVertically(), composer3, 48);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierConstrainAs);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion5.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM20418constructorimpl = Updater.m20418constructorimpl(composer3);
                    Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyRowMeasurePolicy, companion5.getSetMeasurePolicy());
                    Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                    if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    float f10 = 600;
                    float f11 = 2 / f10;
                    DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
                    float fM23561constructorimpl = C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f11);
                    DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
                    BoxKt.Box(BackgroundKt.m17190backgroundbw27NRU$default(SizeKt.m17730sizeVpY3zN4(companion2, fM23561constructorimpl, C3127Dp.m23561constructorimpl((5 / f10) * (RangesKt.coerceAtLeast(displayMetrics3.widthPixels, displayMetrics3.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), AbstractC7305a.m11585i(), null, 2, null), composer3, 6);
                    Modifier modifier6 = modifier5;
                    DisplayMetrics displayMetrics4 = Resources.getSystem().getDisplayMetrics();
                    TextKt.m19430Text4IGK_g(title, PaddingKt.m17685paddingqDBjuR0$default(modifier6, C3127Dp.m23561constructorimpl((3 / f10) * (RangesKt.coerceAtLeast(displayMetrics4.widthPixels, displayMetrics4.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 0.0f, 0.0f, 14, null), AbstractC7305a.m11577a(), AbstractC8709e.m14344k(8), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 200064, 0, 131024);
                    composer3.endNode();
                    boolean zChanged2 = composer3.changed(constrainedLayoutReferenceComponent1);
                    Object objRememberedValue11 = composer3.rememberedValue();
                    if (zChanged2 || objRememberedValue11 == companion3.getEmpty()) {
                        objRememberedValue11 = new LeftViewsKt.C6921h(constrainedLayoutReferenceComponent1);
                        composer3.updateRememberedValue(objRememberedValue11);
                    }
                    IconButtonKt.IconButton(onClickRefresh, constraintLayoutScope2.constrainAs(companion2, constrainedLayoutReferenceComponent2, (Function1) objRememberedValue11), false, null, null, C9015d.f15438a.m15170b(), composer3, ProfileVerifier.CompilationStatus.f2100xf2722a21, 28);
                    boolean zChanged3 = composer3.changed(constrainedLayoutReferenceComponent1);
                    Object objRememberedValue12 = composer3.rememberedValue();
                    if (zChanged3 || objRememberedValue12 == companion3.getEmpty()) {
                        objRememberedValue12 = new LeftViewsKt.C6922i(constrainedLayoutReferenceComponent1);
                        composer3.updateRememberedValue(objRememberedValue12);
                    }
                    TextKt.m19430Text4IGK_g(noSubmitContent, constraintLayoutScope2.constrainAs(companion2, constrainedLayoutReferenceComponent3, (Function1) objRememberedValue12), ColorKt.Color(4284769638L), AbstractC8709e.m14344k(8), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 3456, 0, 131056);
                    boolean zChanged4 = composer3.changed(constrainedLayoutReferenceComponent3);
                    Object objRememberedValue13 = composer3.rememberedValue();
                    if (zChanged4 || objRememberedValue13 == companion3.getEmpty()) {
                        objRememberedValue13 = new LeftViewsKt.C6923j(constrainedLayoutReferenceComponent3);
                        composer3.updateRememberedValue(objRememberedValue13);
                    }
                    TextKt.m19430Text4IGK_g(noCorrectContent, constraintLayoutScope2.constrainAs(companion2, constrainedLayoutReferenceComponent4, (Function1) objRememberedValue13), ColorKt.Color(4284769638L), AbstractC8709e.m14344k(8), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 3456, 0, 131056);
                    boolean zChanged5 = composer3.changed(constrainedLayoutReferenceComponent4);
                    Object objRememberedValue14 = composer3.rememberedValue();
                    if (zChanged5 || objRememberedValue14 == companion3.getEmpty()) {
                        objRememberedValue14 = new LeftViewsKt.C6924k(constrainedLayoutReferenceComponent4);
                        composer3.updateRememberedValue(objRememberedValue14);
                    }
                    Modifier modifierConstrainAs2 = constraintLayoutScope2.constrainAs(companion2, constrainedLayoutReferenceComponent5, (Function1) objRememberedValue14);
                    boolean zChanged6 = composer3.changed(onClickProgressDetail);
                    Object objRememberedValue15 = composer3.rememberedValue();
                    if (zChanged6 || objRememberedValue15 == companion3.getEmpty()) {
                        objRememberedValue15 = new LeftViewsKt.C6925l(onClickProgressDetail);
                        composer3.updateRememberedValue(objRememberedValue15);
                    }
                    Modifier modifierM12480g = AbstractC7593i.m12480g(modifierConstrainAs2, false, (Function0) objRememberedValue15, 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierM12480g);
                    Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor2);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM20418constructorimpl2 = Updater.m20418constructorimpl(composer3);
                    Updater.m20425setimpl(composerM20418constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion5.getSetMeasurePolicy());
                    Updater.m20425setimpl(composerM20418constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                    if (composerM20418constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM20418constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM20418constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m20425setimpl(composerM20418constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    float f12 = 1 / f10;
                    DisplayMetrics displayMetrics5 = Resources.getSystem().getDisplayMetrics();
                    float fM23561constructorimpl2 = C3127Dp.m23561constructorimpl(f12 * (RangesKt.coerceAtLeast(displayMetrics5.widthPixels, displayMetrics5.heightPixels) / Resources.getSystem().getDisplayMetrics().density));
                    DisplayMetrics displayMetrics6 = Resources.getSystem().getDisplayMetrics();
                    TextKt.m19430Text4IGK_g(StringResources_androidKt.stringResource(R.string.watch_detail, composer3, 6), PaddingKt.m17682paddingVpY3zN4(companion2, C3127Dp.m23561constructorimpl(f11 * (RangesKt.coerceAtLeast(displayMetrics6.widthPixels, displayMetrics6.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), fM23561constructorimpl2), AbstractC7305a.m11585i(), AbstractC8709e.m14344k(8), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 3456, 0, 131056);
                    composer3.endNode();
                    composer3.endReplaceGroup();
                    if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                        EffectsKt.SideEffect(function0, composer3, 6);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), measurePolicy, composer2, 48, 0);
            composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: r6.u
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LeftViewsKt.m9924i(modifier3, title, noSubmitContent, noCorrectContent, onClickRefresh, onClickProgressDetail, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: i */
    public static final Unit m9924i(Modifier modifier, String str, String str2, String str3, Function0 function0, Function0 function02, int i10, int i11, Composer composer, int i12) {
        m9923h(modifier, str, str2, str3, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }
}
