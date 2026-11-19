package androidx.compose.material3;

import androidx.collection.AbstractC0584a;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.DialogTokens;
import androidx.compose.p011ui.ComposedModifierKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.window.DialogProperties;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aD\u0010\t\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001aD\u0010\u000b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\n\u001aÇ\u0001\u0010\u001c\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0013\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00072\u0013\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00072\u0013\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00072\u0013\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u0005H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a¦\u0001\u0010!\u001a\u00020\u00012\u0011\u0010\u001d\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0013\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00072\u0013\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00072\u0013\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0013H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a5\u0010&\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u00182\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0007H\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010%\"\u001a\u0010'\u001a\u00020\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u001a\u0010+\u001a\u00020\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*\"\u0014\u0010-\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010(\"\u0014\u0010.\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010(\"\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101\"\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00101\"\u0014\u00103\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00101\"\u0014\u00104\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00101\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00065"}, m5110d2 = {"Lkotlin/Function0;", "Ld6/s;", "onDismissRequest", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/window/DialogProperties;", "properties", "Landroidx/compose/runtime/Composable;", "content", "BasicAlertDialog", "(Lr6/a;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/window/DialogProperties;Lr6/e;Landroidx/compose/runtime/Composer;II)V", "AlertDialog", "confirmButton", "dismissButton", "icon", "title", "text", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "containerColor", "iconContentColor", "titleContentColor", "textContentColor", "Landroidx/compose/ui/unit/Dp;", "tonalElevation", "AlertDialogImpl-wrnwzgE", "(Lr6/a;Lr6/e;Landroidx/compose/ui/Modifier;Lr6/e;Lr6/e;Lr6/e;Lr6/e;Landroidx/compose/ui/graphics/Shape;JJJJFLandroidx/compose/ui/window/DialogProperties;Landroidx/compose/runtime/Composer;II)V", "AlertDialogImpl", "buttons", "buttonContentColor", "AlertDialogContent-4hvqGtA", "(Lr6/e;Landroidx/compose/ui/Modifier;Lr6/e;Lr6/e;Lr6/e;Landroidx/compose/ui/graphics/Shape;JFJJJJLandroidx/compose/runtime/Composer;III)V", "AlertDialogContent", "mainAxisSpacing", "crossAxisSpacing", "AlertDialogFlowRow-ixp7dh8", "(FFLr6/e;Landroidx/compose/runtime/Composer;I)V", "AlertDialogFlowRow", "DialogMinWidth", "F", "getDialogMinWidth", "()F", "DialogMaxWidth", "getDialogMaxWidth", "ButtonsMainAxisSpacing", "ButtonsCrossAxisSpacing", "Landroidx/compose/foundation/layout/PaddingValues;", "DialogPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "IconPadding", "TitlePadding", "TextPadding", "material3_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,464:1\n1223#2,6:465\n78#3:471\n76#3,8:472\n85#3,4:489\n89#3,2:499\n93#3:504\n368#4,9:480\n377#4,3:501\n4032#5,6:493\n148#6:505\n148#6:506\n148#6:507\n148#6:508\n148#6:509\n148#6:510\n148#6:511\n148#6:512\n*S KotlinDebug\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogKt\n*L\n366#1:465,6\n366#1:471\n366#1:472,8\n366#1:489,4\n366#1:499,2\n366#1:504\n366#1:480,9\n366#1:501,3\n366#1:493,6\n453#1:505\n454#1:506\n456#1:507\n457#1:508\n460#1:509\n461#1:510\n462#1:511\n463#1:512\n*E\n"})
/* loaded from: classes.dex */
public final class AlertDialogKt {

    @NotNull
    private static final PaddingValues DialogPadding;

    @NotNull
    private static final PaddingValues IconPadding;

    @NotNull
    private static final PaddingValues TextPadding;

    @NotNull
    private static final PaddingValues TitlePadding;
    private static final float DialogMinWidth = C2331Dp.m13305constructorimpl(280);
    private static final float DialogMaxWidth = C2331Dp.m13305constructorimpl(560);
    private static final float ButtonsMainAxisSpacing = C2331Dp.m13305constructorimpl(8);
    private static final float ButtonsCrossAxisSpacing = C2331Dp.m13305constructorimpl(12);

    static {
        float f = 24;
        DialogPadding = PaddingKt.m7255PaddingValues0680j_4(C2331Dp.m13305constructorimpl(f));
        float f7 = 16;
        IconPadding = PaddingKt.m7259PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, C2331Dp.m13305constructorimpl(f7), 7, null);
        TitlePadding = PaddingKt.m7259PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, C2331Dp.m13305constructorimpl(f7), 7, null);
        TextPadding = PaddingKt.m7259PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, C2331Dp.m13305constructorimpl(f), 7, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @kotlin.Deprecated(message = "Use BasicAlertDialog instead", replaceWith = @kotlin.ReplaceWith(expression = "BasicAlertDialog(onDismissRequest, modifier, properties, content)", imports = {}))
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AlertDialog(@org.jetbrains.annotations.NotNull final p152r6.InterfaceC6469a r17, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r18, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.window.DialogProperties r19, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6473e r20, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AlertDialogKt.AlertDialog(r6.a, androidx.compose.ui.Modifier, androidx.compose.ui.window.DialogProperties, r6.e, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fc  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: AlertDialogContent-4hvqGtA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m8139AlertDialogContent4hvqGtA(@org.jetbrains.annotations.NotNull final p152r6.InterfaceC6473e r29, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r30, @org.jetbrains.annotations.Nullable final p152r6.InterfaceC6473e r31, @org.jetbrains.annotations.Nullable final p152r6.InterfaceC6473e r32, @org.jetbrains.annotations.Nullable final p152r6.InterfaceC6473e r33, @org.jetbrains.annotations.NotNull final androidx.compose.p011ui.graphics.Shape r34, final long r35, final float r37, final long r38, final long r40, final long r42, final long r44, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r46, final int r47, final int r48, final int r49) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AlertDialogKt.m8139AlertDialogContent4hvqGtA(r6.e, androidx.compose.ui.Modifier, r6.e, r6.e, r6.e, androidx.compose.ui.graphics.Shape, long, float, long, long, long, long, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: AlertDialogFlowRow-ixp7dh8, reason: not valid java name */
    public static final void m8140AlertDialogFlowRowixp7dh8(final float f, final float f7, @NotNull final InterfaceC6473e interfaceC6473e, @Nullable Composer composer, final int i) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(586821353);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(f7) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6473e) ? 256 : 128;
        }
        if ((i8 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(586821353, i8, -1, "androidx.compose.material3.AlertDialogFlowRow (AlertDialog.kt:364)");
            }
            boolean z8 = ((i8 & 14) == 4) | ((i8 & 112) == 32);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z8 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogFlowRow$1$1
                    private static final boolean measure_3p2s80s$canAddToCurrentSequence(List<Placeable> list, Ref$IntRef ref$IntRef, MeasureScope measureScope, float f8, long j7, Placeable placeable) {
                        if (list.isEmpty()) {
                            return true;
                        }
                        return placeable.getWidth() + (measureScope.mo6897roundToPx0680j_4(f8) + ref$IntRef.element) <= Constraints.m13258getMaxWidthimpl(j7);
                    }

                    private static final void measure_3p2s80s$startNewSequence(List<List<Placeable>> list, Ref$IntRef ref$IntRef, MeasureScope measureScope, float f8, List<Placeable> list2, List<Integer> list3, Ref$IntRef ref$IntRef2, List<Integer> list4, Ref$IntRef ref$IntRef3, Ref$IntRef ref$IntRef4) {
                        if (!list.isEmpty()) {
                            ref$IntRef.element = measureScope.mo6897roundToPx0680j_4(f8) + ref$IntRef.element;
                        }
                        list.add(0, AbstractC5805t.m5217D0(list2));
                        list3.add(Integer.valueOf(ref$IntRef2.element));
                        list4.add(Integer.valueOf(ref$IntRef.element));
                        ref$IntRef.element += ref$IntRef2.element;
                        ref$IntRef3.element = Math.max(ref$IntRef3.element, ref$IntRef4.element);
                        list2.clear();
                        ref$IntRef4.element = 0;
                        ref$IntRef2.element = 0;
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    @NotNull
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo6545measure3p2s80s(@NotNull final MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j7) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        final ArrayList arrayList3 = new ArrayList();
                        Ref$IntRef ref$IntRef = new Ref$IntRef();
                        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
                        ArrayList arrayList4 = new ArrayList();
                        Ref$IntRef ref$IntRef3 = new Ref$IntRef();
                        Ref$IntRef ref$IntRef4 = new Ref$IntRef();
                        float f8 = f;
                        float f9 = f7;
                        int size = list.size();
                        int i9 = 0;
                        while (i9 < size) {
                            ArrayList arrayList5 = arrayList;
                            Ref$IntRef ref$IntRef5 = ref$IntRef2;
                            Placeable placeableMo12033measureBRTryo0 = list.get(i9).mo12033measureBRTryo0(j7);
                            int i10 = i9;
                            Ref$IntRef ref$IntRef6 = ref$IntRef3;
                            ref$IntRef3 = ref$IntRef6;
                            int i11 = size;
                            if (measure_3p2s80s$canAddToCurrentSequence(arrayList4, ref$IntRef6, measureScope, f8, j7, placeableMo12033measureBRTryo0)) {
                                arrayList = arrayList5;
                                ref$IntRef2 = ref$IntRef5;
                            } else {
                                arrayList = arrayList5;
                                ref$IntRef2 = ref$IntRef5;
                                measure_3p2s80s$startNewSequence(arrayList, ref$IntRef2, measureScope, f9, arrayList4, arrayList2, ref$IntRef4, arrayList3, ref$IntRef, ref$IntRef3);
                            }
                            if (!arrayList4.isEmpty()) {
                                ref$IntRef3.element = measureScope.mo6897roundToPx0680j_4(f8) + ref$IntRef3.element;
                            }
                            arrayList4.add(placeableMo12033measureBRTryo0);
                            ref$IntRef3.element = placeableMo12033measureBRTryo0.getWidth() + ref$IntRef3.element;
                            ref$IntRef4.element = Math.max(ref$IntRef4.element, placeableMo12033measureBRTryo0.getHeight());
                            i9 = i10 + 1;
                            size = i11;
                        }
                        if (!arrayList4.isEmpty()) {
                            measure_3p2s80s$startNewSequence(arrayList, ref$IntRef2, measureScope, f7, arrayList4, arrayList2, ref$IntRef4, arrayList3, ref$IntRef, ref$IntRef3);
                        }
                        final int iMax = Math.max(ref$IntRef.element, Constraints.m13260getMinWidthimpl(j7));
                        int iMax2 = Math.max(ref$IntRef2.element, Constraints.m13259getMinHeightimpl(j7));
                        final float f10 = f;
                        final ArrayList arrayList6 = arrayList;
                        return MeasureScope.layout$default(measureScope, iMax, iMax2, null, new InterfaceC6471c() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogFlowRow$1$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p152r6.InterfaceC6471c
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Placeable.PlacementScope) obj);
                                return C5443s.f8405a;
                            }

                            public final void invoke(@NotNull Placeable.PlacementScope placementScope) {
                                List<List<Placeable>> list2 = arrayList6;
                                MeasureScope measureScope2 = measureScope;
                                float f11 = f10;
                                int i12 = iMax;
                                List<Integer> list3 = arrayList3;
                                int size2 = list2.size();
                                for (int i13 = 0; i13 < size2; i13++) {
                                    List<Placeable> list4 = list2.get(i13);
                                    int size3 = list4.size();
                                    int[] iArr = new int[size3];
                                    int i14 = 0;
                                    while (i14 < size3) {
                                        iArr[i14] = list4.get(i14).getWidth() + (i14 < AbstractC5806u.m5282u(list4) ? measureScope2.mo6897roundToPx0680j_4(f11) : 0);
                                        i14++;
                                    }
                                    Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                                    int[] iArr2 = new int[size3];
                                    for (int i15 = 0; i15 < size3; i15++) {
                                        iArr2[i15] = 0;
                                    }
                                    end.arrange(measureScope2, i12, iArr, measureScope2.getLayoutDirection(), iArr2);
                                    int size4 = list4.size();
                                    for (int i16 = 0; i16 < size4; i16++) {
                                        Placeable.PlacementScope.place$default(placementScope, list4.get(i16), iArr2[i16], list3.get(i13).intValue(), 0.0f, 4, null);
                                    }
                                }
                            }
                        }, 4, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
            int i9 = (i8 >> 6) & 14;
            Modifier.Companion companion = Modifier.INSTANCE;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            InterfaceC6469a constructor = companion2.getConstructor();
            int i10 = ((i9 << 6) & 896) | 6;
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10109constructorimpl = Updater.m10109constructorimpl(composerStartRestartGroup);
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion2, composerM10109constructorimpl, measurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            if (AbstractC0584a.m924y(composerStartRestartGroup, (i10 >> 6) & 14, interfaceC6473e)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogFlowRow$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(@Nullable Composer composer2, int i11) {
                    AlertDialogKt.m8140AlertDialogFlowRowixp7dh8(f, f7, interfaceC6473e, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: AlertDialogImpl-wrnwzgE, reason: not valid java name */
    public static final void m8141AlertDialogImplwrnwzgE(@NotNull final InterfaceC6469a interfaceC6469a, @NotNull final InterfaceC6473e interfaceC6473e, @NotNull final Modifier modifier, @Nullable final InterfaceC6473e interfaceC6473e2, @Nullable final InterfaceC6473e interfaceC6473e3, @Nullable final InterfaceC6473e interfaceC6473e4, @Nullable final InterfaceC6473e interfaceC6473e5, @NotNull final Shape shape, final long j7, final long j8, final long j9, final long j10, final float f, @NotNull final DialogProperties dialogProperties, @Nullable Composer composer, final int i, final int i8) {
        int i9;
        InterfaceC6473e interfaceC6473e6;
        InterfaceC6473e interfaceC6473e7;
        InterfaceC6473e interfaceC6473e8;
        int i10;
        float f7;
        Composer composerStartRestartGroup = composer.startRestartGroup(-919826268);
        if ((i & 6) == 0) {
            i9 = (composerStartRestartGroup.changedInstance(interfaceC6469a) ? 4 : 2) | i;
        } else {
            i9 = i;
        }
        if ((i & 48) == 0) {
            interfaceC6473e6 = interfaceC6473e;
            i9 |= composerStartRestartGroup.changedInstance(interfaceC6473e6) ? 32 : 16;
        } else {
            interfaceC6473e6 = interfaceC6473e;
        }
        if ((i & 384) == 0) {
            i9 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            interfaceC6473e7 = interfaceC6473e2;
            i9 |= composerStartRestartGroup.changedInstance(interfaceC6473e7) ? 2048 : 1024;
        } else {
            interfaceC6473e7 = interfaceC6473e2;
        }
        if ((i & 24576) == 0) {
            interfaceC6473e8 = interfaceC6473e3;
            i9 |= composerStartRestartGroup.changedInstance(interfaceC6473e8) ? 16384 : 8192;
        } else {
            interfaceC6473e8 = interfaceC6473e3;
        }
        if ((i & ProfileVerifier.CompilationStatus.f1352xf2722a21) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(interfaceC6473e4) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(interfaceC6473e5) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i9 |= composerStartRestartGroup.changed(shape) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i9 |= composerStartRestartGroup.changed(j7) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i & 805306368) == 0) {
            i9 |= composerStartRestartGroup.changed(j8) ? 536870912 : 268435456;
        }
        if ((i8 & 6) == 0) {
            i10 = i8 | (composerStartRestartGroup.changed(j9) ? 4 : 2);
        } else {
            i10 = i8;
        }
        if ((i8 & 48) == 0) {
            i10 |= composerStartRestartGroup.changed(j10) ? 32 : 16;
        }
        if ((i8 & 384) == 0) {
            f7 = f;
            i10 |= composerStartRestartGroup.changed(f7) ? 256 : 128;
        } else {
            f7 = f;
        }
        if ((i8 & 3072) == 0) {
            i10 |= composerStartRestartGroup.changed(dialogProperties) ? 2048 : 1024;
        }
        int i11 = i10;
        if ((i9 & 306783379) == 306783378 && (i11 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-919826268, i9, i11, "androidx.compose.material3.AlertDialogImpl (AlertDialog.kt:247)");
            }
            final InterfaceC6473e interfaceC6473e9 = interfaceC6473e6;
            final InterfaceC6473e interfaceC6473e10 = interfaceC6473e7;
            final float f8 = f7;
            final InterfaceC6473e interfaceC6473e11 = interfaceC6473e8;
            BasicAlertDialog(interfaceC6469a, modifier, dialogProperties, ComposableLambdaKt.rememberComposableLambda(-1852840226, true, new InterfaceC6473e() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogImpl$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer2, int i12) {
                    if ((i12 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1852840226, i12, -1, "androidx.compose.material3.AlertDialogImpl.<anonymous> (AlertDialog.kt:252)");
                    }
                    final InterfaceC6473e interfaceC6473e12 = interfaceC6473e10;
                    final InterfaceC6473e interfaceC6473e13 = interfaceC6473e9;
                    AlertDialogKt.m8139AlertDialogContent4hvqGtA(ComposableLambdaKt.rememberComposableLambda(1163543932, true, new InterfaceC6473e() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogImpl$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // p152r6.InterfaceC6473e
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return C5443s.f8405a;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer3, int i13) {
                            if ((i13 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1163543932, i13, -1, "androidx.compose.material3.AlertDialogImpl.<anonymous>.<anonymous> (AlertDialog.kt:254)");
                            }
                            float f9 = AlertDialogKt.ButtonsMainAxisSpacing;
                            float f10 = AlertDialogKt.ButtonsCrossAxisSpacing;
                            final InterfaceC6473e interfaceC6473e14 = interfaceC6473e12;
                            final InterfaceC6473e interfaceC6473e15 = interfaceC6473e13;
                            AlertDialogKt.m8140AlertDialogFlowRowixp7dh8(f9, f10, ComposableLambdaKt.rememberComposableLambda(1887135077, true, new InterfaceC6473e() { // from class: androidx.compose.material3.AlertDialogKt.AlertDialogImpl.1.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // p152r6.InterfaceC6473e
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                    return C5443s.f8405a;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer4, int i14) {
                                    if ((i14 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1887135077, i14, -1, "androidx.compose.material3.AlertDialogImpl.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:258)");
                                    }
                                    InterfaceC6473e interfaceC6473e16 = interfaceC6473e14;
                                    composer4.startReplaceGroup(1497073862);
                                    if (interfaceC6473e16 != null) {
                                        interfaceC6473e16.invoke(composer4, 0);
                                    }
                                    composer4.endReplaceGroup();
                                    interfaceC6473e15.invoke(composer4, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 438);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), null, interfaceC6473e11, interfaceC6473e4, interfaceC6473e5, shape, j7, f8, ColorSchemeKt.getValue(DialogTokens.INSTANCE.getActionLabelTextColor(), composer2, 6), j8, j9, j10, composer2, 6, 0, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i9 & 14) | 3072 | ((i9 >> 3) & 112) | ((i11 >> 3) & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogImpl$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(@Nullable Composer composer2, int i12) {
                    AlertDialogKt.m8141AlertDialogImplwrnwzgE(interfaceC6469a, interfaceC6473e, modifier, interfaceC6473e2, interfaceC6473e3, interfaceC6473e4, interfaceC6473e5, shape, j7, j8, j9, j10, f, dialogProperties, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i8));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void BasicAlertDialog(@org.jetbrains.annotations.NotNull final p152r6.InterfaceC6469a r16, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r17, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.window.DialogProperties r18, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6473e r19, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AlertDialogKt.BasicAlertDialog(r6.a, androidx.compose.ui.Modifier, androidx.compose.ui.window.DialogProperties, r6.e, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final float getDialogMaxWidth() {
        return DialogMaxWidth;
    }

    public static final float getDialogMinWidth() {
        return DialogMinWidth;
    }
}
