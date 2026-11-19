package com.zykj.evaluation.p057ui.sheet.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import com.zykj.evaluation.p057ui.sheet.widget.AnswerSheetCorrectViewKt;
import com.zykj.evaluation.p057ui.widget.AnswerSheetCorrectView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p026b7.C5031t0;
import p079e7.AnswerCorrectData;

/* loaded from: classes4.dex */
public abstract class AnswerSheetCorrectViewKt {
    /* renamed from: e */
    public static final void m10332e(Modifier modifier, final Bitmap bitmap, final List dataList, final C5031t0 correctFunction, final Function1 onClickListener, Composer composer, final int i10, final int i11) {
        int i12;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        Intrinsics.checkNotNullParameter(correctFunction, "correctFunction");
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        Composer composerStartRestartGroup = composer.startRestartGroup(246672577);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(bitmap) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(dataList) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(correctFunction) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(onClickListener) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 9363) != 9362, i12 & 1)) {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(246672577, i12, -1, "com.zykj.evaluation.ui.sheet.widget.AnswerSheetCorrectView (AnswerSheetCorrectView.kt:23)");
            }
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(correctFunction) | ((57344 & i12) == 16384);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: b7.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AnswerSheetCorrectViewKt.m10333f(onClickListener, correctFunction, (Context) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(bitmap) | composerStartRestartGroup.changedInstance(dataList);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: b7.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AnswerSheetCorrectViewKt.m10335h(bitmap, dataList, (AnswerSheetCorrectView) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            AndroidView_androidKt.AndroidView(function1, modifier3, (Function1) objRememberedValue2, composerStartRestartGroup, (i12 << 3) & 112, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: b7.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AnswerSheetCorrectViewKt.m10336i(modifier2, bitmap, dataList, correctFunction, onClickListener, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: f */
    public static final AnswerSheetCorrectView m10333f(Function1 function1, C5031t0 c5031t0, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        final AnswerSheetCorrectView answerSheetCorrectView = new AnswerSheetCorrectView(context, null, 2, null);
        answerSheetCorrectView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        answerSheetCorrectView.setOnClickListener((Function1<? super List<AnswerCorrectData>, Unit>) function1);
        c5031t0.m2513d(new AnswerSheetCorrectViewKt$AnswerSheetCorrectView$1$1$1$1(answerSheetCorrectView, null));
        c5031t0.m2512c(new Function0() { // from class: b7.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AnswerSheetCorrectViewKt.m10334g(answerSheetCorrectView);
            }
        });
        return answerSheetCorrectView;
    }

    /* renamed from: g */
    public static final List m10334g(AnswerSheetCorrectView answerSheetCorrectView) {
        return answerSheetCorrectView.m10442o();
    }

    /* renamed from: h */
    public static final Unit m10335h(Bitmap bitmap, List list, AnswerSheetCorrectView it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setImageBitmap(bitmap);
        it.m10444q(list);
        return Unit.INSTANCE;
    }

    /* renamed from: i */
    public static final Unit m10336i(Modifier modifier, Bitmap bitmap, List list, C5031t0 c5031t0, Function1 function1, int i10, int i11, Composer composer, int i12) {
        m10332e(modifier, bitmap, list, c5031t0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }
}
