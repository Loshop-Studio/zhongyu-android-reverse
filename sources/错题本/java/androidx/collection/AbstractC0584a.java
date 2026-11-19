package androidx.collection;

import androidx.compose.foundation.text.selection.BaseTextPreparedSelection;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.drawscope.DrawContext;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.InspectorInfo;
import androidx.compose.p011ui.platform.ValueElementSequence;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import java.util.List;
import kotlin.jvm.internal.AbstractC5830k;
import p152r6.InterfaceC6473e;

/* renamed from: androidx.collection.a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0584a {
    /* renamed from: A */
    public static int m896A(float f, int i, int i8) {
        return (C2331Dp.m13311hashCodeimpl(f) + i) * i8;
    }

    /* renamed from: B */
    public static int m897B(long j7, int i, int i8) {
        return (Long.hashCode(j7) + i) * i8;
    }

    /* renamed from: C */
    public static int m898C(Placeable placeable, int i, int i8) {
        return (i - placeable.getWidth()) / i8;
    }

    /* renamed from: D */
    public static boolean m899D(Composer composer) {
        composer.endNode();
        composer.endNode();
        return ComposerKt.isTraceInProgress();
    }

    /* renamed from: a */
    public static float m900a(float f, float f7, float f8, float f9) {
        return ((f - f7) / f8) + f9;
    }

    /* renamed from: b */
    public static int m901b(float f, int i, int i8) {
        return (Float.hashCode(f) + i) * i8;
    }

    /* renamed from: c */
    public static int m902c(int i, int i8, int i9) {
        return (Integer.hashCode(i) + i8) * i9;
    }

    /* renamed from: d */
    public static int m903d(int i, int i8, String str) {
        return (str.hashCode() + i) * i8;
    }

    /* renamed from: e */
    public static int m904e(long j7, int i, int i8) {
        return (Color.m10689hashCodeimpl(j7) + i) * i8;
    }

    /* renamed from: f */
    public static int m905f(BaseTextPreparedSelection baseTextPreparedSelection) {
        baseTextPreparedSelection.getState().resetCachedX();
        return baseTextPreparedSelection.getText$foundation_release().length();
    }

    /* renamed from: g */
    public static int m906g(Placeable placeable, int i, int i8) {
        return (i - placeable.getHeight()) / i8;
    }

    /* renamed from: h */
    public static int m907h(List list, int i, int i8) {
        return (list.hashCode() + i) * i8;
    }

    /* renamed from: i */
    public static int m908i(boolean z8, int i, int i8) {
        return (Boolean.hashCode(z8) + i) * i8;
    }

    /* renamed from: j */
    public static ValueElementSequence m909j(float f, ValueElementSequence valueElementSequence, String str, InspectorInfo inspectorInfo) {
        valueElementSequence.set(str, C2331Dp.m13303boximpl(f));
        return inspectorInfo.getProperties();
    }

    /* renamed from: k */
    public static ValueElementSequence m910k(boolean z8, ValueElementSequence valueElementSequence, String str, InspectorInfo inspectorInfo) {
        valueElementSequence.set(str, Boolean.valueOf(z8));
        return inspectorInfo.getProperties();
    }

    /* renamed from: l */
    public static String m911l(char c, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    /* renamed from: m */
    public static String m912m(int i, int i8, String str, String str2) {
        return str + i + str2 + i8;
    }

    /* renamed from: n */
    public static String m913n(long j7, String str) {
        return str + j7;
    }

    /* renamed from: o */
    public static String m914o(String str, int i, char c) {
        return str + i + c;
    }

    /* renamed from: p */
    public static String m915p(StringBuilder sb, float f, char c) {
        sb.append(f);
        sb.append(c);
        return sb.toString();
    }

    /* renamed from: q */
    public static StringBuilder m916q(CharSequence charSequence, String str, InterfaceC6473e interfaceC6473e, String str2, CharSequence charSequence2) {
        AbstractC5830k.m5330g(charSequence, str);
        AbstractC5830k.m5330g(interfaceC6473e, str2);
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        return sb;
    }

    /* renamed from: r */
    public static InterfaceC6473e m917r(ComposeUiNode.Companion companion, Composer composer, MeasurePolicy measurePolicy, Composer composer2, CompositionLocalMap compositionLocalMap) {
        Updater.m10116setimpl(composer, measurePolicy, companion.getSetMeasurePolicy());
        Updater.m10116setimpl(composer2, compositionLocalMap, companion.getSetResolvedCompositionLocals());
        return companion.getSetCompositeKeyHash();
    }

    /* renamed from: s */
    public static void m918s(int i, Composer composer, int i8, InterfaceC6473e interfaceC6473e) {
        composer.updateRememberedValue(Integer.valueOf(i));
        composer.apply(Integer.valueOf(i8), interfaceC6473e);
    }

    /* renamed from: t */
    public static void m919t(long j7, String str, StringBuilder sb) {
        sb.append((Object) Color.m10690toStringimpl(j7));
        sb.append(str);
    }

    /* renamed from: u */
    public static void m920u(Composer composer, int i, InterfaceC6473e interfaceC6473e) {
        interfaceC6473e.invoke(composer, Integer.valueOf(i));
        composer.endNode();
    }

    /* renamed from: v */
    public static void m921v(DrawContext drawContext, long j7) {
        drawContext.getCanvas().restore();
        drawContext.mo11155setSizeuvyYCjk(j7);
    }

    /* renamed from: w */
    public static void m922w(StringBuilder sb, String str, float f) {
        sb.append((Object) C2331Dp.m13316toStringimpl(f));
        sb.append(str);
    }

    /* renamed from: x */
    public static boolean m923x(Composer composer) {
        composer.endReplaceGroup();
        composer.endNode();
        return ComposerKt.isTraceInProgress();
    }

    /* renamed from: y */
    public static boolean m924y(Composer composer, int i, InterfaceC6473e interfaceC6473e) {
        interfaceC6473e.invoke(composer, Integer.valueOf(i));
        composer.endNode();
        return ComposerKt.isTraceInProgress();
    }

    /* renamed from: z */
    public static float m925z(float f, float f7, float f8, float f9) {
        return ((f * f7) + f8) * f9;
    }
}
