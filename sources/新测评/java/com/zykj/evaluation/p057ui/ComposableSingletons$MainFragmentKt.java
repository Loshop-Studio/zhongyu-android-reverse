package com.zykj.evaluation.p057ui;

// RE note 本类字节码直接引用的读写或显示接口包括JSON。

import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavBackStackEntry;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.zykj.evaluation.p057ui.ComposableSingletons$MainFragmentKt;
import com.zykj.evaluation.p057ui.description.DescriptionPageKt;
import com.zykj.evaluation.p057ui.progress.ProgressPageKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import p101g7.AbstractC7586b;

/* loaded from: classes4.dex */
public final class ComposableSingletons$MainFragmentKt {

    /* renamed from: a */
    public static final ComposableSingletons$MainFragmentKt f8973a = new ComposableSingletons$MainFragmentKt();

    /* renamed from: b */
    public static Function3 f8974b = ComposableLambdaKt.composableLambdaInstance(-442186620, false, new Function3() { // from class: s5.a
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$MainFragmentKt.m8823i((NavBackStackEntry) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: c */
    public static Function3 f8975c = ComposableLambdaKt.composableLambdaInstance(1366087139, false, new Function3() { // from class: s5.b
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$MainFragmentKt.m8821g((NavBackStackEntry) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: g */
    public static final Unit m8821g(final NavBackStackEntry it, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1366087139, i10, -1, "com.zykj.evaluation.ui.ComposableSingletons$MainFragmentKt.lambda$1366087139.<anonymous> (MainFragment.kt:632)");
        }
        MainFragmentKt.m9078b("DescriptionPage", ComposableLambdaKt.rememberComposableLambda(-1039606006, true, new Function2() { // from class: s5.c
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ComposableSingletons$MainFragmentKt.m8822h(it, (Composer) obj, ((Integer) obj2).intValue());
            }
        }, composer, 54), composer, 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: h */
    public static final Unit m8822h(NavBackStackEntry navBackStackEntry, Composer composer, int i10) {
        String string;
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1039606006, i10, -1, "com.zykj.evaluation.ui.ComposableSingletons$MainFragmentKt.lambda$1366087139.<anonymous>.<anonymous> (MainFragment.kt:633)");
            }
            Bundle arguments = navBackStackEntry.getArguments();
            if (arguments == null || (string = arguments.getString("DESCRIPTION_KEY_TITLE")) == null) {
                string = "";
            }
            String string2 = AbstractC7586b.m12450a().getString("DESCRIPTION_KEY_CONTENT");
            DescriptionPageKt.m9252b(string, string2 != null ? string2 : "", composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: i */
    public static final Unit m8823i(NavBackStackEntry it, Composer composer, int i10) {
        String string;
        String string2;
        Intrinsics.checkNotNullParameter(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-442186620, i10, -1, "com.zykj.evaluation.ui.ComposableSingletons$MainFragmentKt.lambda$-442186620.<anonymous> (MainFragment.kt:604)");
        }
        Gson gson = new Gson();
        Bundle arguments = it.getArguments();
        String str = "";
        if (arguments == null || (string = arguments.getString("PROGRESS_KEY_PROGRESS_TODO")) == null) {
            string = "";
        }
        final List list = (List) gson.fromJson(string, new TypeToken<List<? extends String>>() { // from class: com.zykj.evaluation.ui.ComposableSingletons$MainFragmentKt$lambda$-442186620$1$todoStudents$1
        }.getType());
        Bundle arguments2 = it.getArguments();
        if (arguments2 != null && (string2 = arguments2.getString("PROGRESS_KEY_PROGRESS_CORRECT")) != null) {
            str = string2;
        }
        final List list2 = (List) gson.fromJson(str, new TypeToken<List<? extends String>>() { // from class: com.zykj.evaluation.ui.ComposableSingletons$MainFragmentKt$lambda$-442186620$1$correctStudents$1
        }.getType());
        MainFragmentKt.m9078b("ProgressPage", ComposableLambdaKt.rememberComposableLambda(1447087531, true, new Function2() { // from class: s5.d
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ComposableSingletons$MainFragmentKt.m8824j(list, list2, (Composer) obj, ((Integer) obj2).intValue());
            }
        }, composer, 54), composer, 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: j */
    public static final Unit m8824j(List list, List list2, Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1447087531, i10, -1, "com.zykj.evaluation.ui.ComposableSingletons$MainFragmentKt.lambda$-442186620.<anonymous>.<anonymous> (MainFragment.kt:616)");
            }
            Intrinsics.checkNotNull(list);
            Intrinsics.checkNotNull(list2);
            ProgressPageKt.m10113n(list, list2, null, composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: e */
    public final Function3 m8825e() {
        return f8974b;
    }

    /* renamed from: f */
    public final Function3 m8826f() {
        return f8975c;
    }
}
