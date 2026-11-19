package androidx.compose.material3;

import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.ComposedModifierKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p014ui.layout.AlignmentLineKt;
import androidx.compose.p014ui.layout.LayoutIdKt;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasurePolicy;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.node.ComposeUiNode;
import androidx.compose.p014ui.semantics.SemanticsModifierKt;
import androidx.compose.p014ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p014ui.text.TextStyle;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p211jd.AbstractC9719c;
import p265nd.AbstractC10410o;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
public final class AppBarKt {
    private static final float BottomAppBarHorizontalPadding;
    private static final float BottomAppBarVerticalPadding;
    private static final float FABHorizontalPadding;
    private static final float FABVerticalPadding;
    private static final float LargeTitleBottomPadding;
    private static final float MediumTitleBottomPadding;
    private static final float TopAppBarHorizontalPadding;
    private static final float TopAppBarTitleInset;
    private static final CubicBezierEasing TopTitleAlphaEasing;

    @InterfaceC11829d(m26210c = "androidx.compose.material3.AppBarKt", m26211f = "AppBar.kt", m26212l = {2501, 2515}, m26213m = "settleAppBar")
    /* renamed from: androidx.compose.material3.AppBarKt$settleAppBar$1 */
    public static final class C20491 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C20491(InterfaceC11588c<? super C20491> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppBarKt.settleAppBar(null, 0.0f, null, null, this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.material3.AppBarKt", m26211f = "AppBar.kt", m26212l = {1803, 1817}, m26213m = "settleAppBarBottom")
    /* renamed from: androidx.compose.material3.AppBarKt$settleAppBarBottom$1 */
    public static final class C20521 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C20521(InterfaceC11588c<? super C20521> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppBarKt.settleAppBarBottom(null, 0.0f, null, null, this);
        }
    }

    static {
        float f10 = 16;
        float f11 = 12;
        float fM33501constructorimpl = C3186Dp.m33501constructorimpl(C3186Dp.m33501constructorimpl(f10) - C3186Dp.m33501constructorimpl(f11));
        BottomAppBarHorizontalPadding = fM33501constructorimpl;
        float fM33501constructorimpl2 = C3186Dp.m33501constructorimpl(C3186Dp.m33501constructorimpl(f10) - C3186Dp.m33501constructorimpl(f11));
        BottomAppBarVerticalPadding = fM33501constructorimpl2;
        FABHorizontalPadding = C3186Dp.m33501constructorimpl(C3186Dp.m33501constructorimpl(f10) - fM33501constructorimpl);
        FABVerticalPadding = C3186Dp.m33501constructorimpl(C3186Dp.m33501constructorimpl(f11) - fM33501constructorimpl2);
        TopTitleAlphaEasing = new CubicBezierEasing(0.8f, 0.0f, 0.8f, 0.15f);
        MediumTitleBottomPadding = C3186Dp.m33501constructorimpl(24);
        LargeTitleBottomPadding = C3186Dp.m33501constructorimpl(28);
        float fM33501constructorimpl3 = C3186Dp.m33501constructorimpl(4);
        TopAppBarHorizontalPadding = fM33501constructorimpl3;
        TopAppBarTitleInset = C3186Dp.m33501constructorimpl(C3186Dp.m33501constructorimpl(f10) - fM33501constructorimpl3);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ef  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: BottomAppBar-1oL4kX8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m28344BottomAppBar1oL4kX8(androidx.compose.p014ui.Modifier r24, long r25, long r27, float r29, androidx.compose.foundation.layout.PaddingValues r30, androidx.compose.foundation.layout.WindowInsets r31, final p181hd.InterfaceC9545q r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m28344BottomAppBar1oL4kX8(androidx.compose.ui.Modifier, long, long, float, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.layout.WindowInsets, hd.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010f  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: BottomAppBar-Snr_uVM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m28345BottomAppBarSnr_uVM(final p181hd.InterfaceC9545q r27, androidx.compose.p014ui.Modifier r28, p181hd.InterfaceC9544p r29, long r30, long r32, float r34, androidx.compose.foundation.layout.PaddingValues r35, androidx.compose.foundation.layout.WindowInsets r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m28345BottomAppBarSnr_uVM(hd.q, androidx.compose.ui.Modifier, hd.p, long, long, float, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.layout.WindowInsets, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010f  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: BottomAppBar-e-3WI5M, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m28346BottomAppBare3WI5M(androidx.compose.p014ui.Modifier r35, long r36, long r38, float r40, androidx.compose.foundation.layout.PaddingValues r41, androidx.compose.foundation.layout.WindowInsets r42, androidx.compose.material3.BottomAppBarScrollBehavior r43, final p181hd.InterfaceC9545q r44, androidx.compose.runtime.Composer r45, final int r46, final int r47) {
        /*
            Method dump skipped, instructions count: 698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m28346BottomAppBare3WI5M(androidx.compose.ui.Modifier, long, long, float, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.BottomAppBarScrollBehavior, hd.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f7  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: BottomAppBar-qhFBPw4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m28347BottomAppBarqhFBPw4(final p181hd.InterfaceC9545q r27, androidx.compose.p014ui.Modifier r28, p181hd.InterfaceC9544p r29, long r30, long r32, float r34, androidx.compose.foundation.layout.PaddingValues r35, androidx.compose.foundation.layout.WindowInsets r36, androidx.compose.material3.BottomAppBarScrollBehavior r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m28347BottomAppBarqhFBPw4(hd.q, androidx.compose.ui.Modifier, hd.p, long, long, float, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.BottomAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int):void");
    }

    @ExperimentalMaterial3Api
    public static final BottomAppBarState BottomAppBarState(float f10, float f11, float f12) {
        return new BottomAppBarStateImpl(f10, f11, f12);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0118  */
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    @p309qc.InterfaceC10770a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void CenterAlignedTopAppBar(final p181hd.InterfaceC9544p r20, androidx.compose.p014ui.Modifier r21, p181hd.InterfaceC9544p r22, p181hd.InterfaceC9545q r23, androidx.compose.foundation.layout.WindowInsets r24, androidx.compose.material3.TopAppBarColors r25, androidx.compose.material3.TopAppBarScrollBehavior r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.CenterAlignedTopAppBar(hd.p, androidx.compose.ui.Modifier, hd.p, hd.q, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0111  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: CenterAlignedTopAppBar-GHTll3U, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m28348CenterAlignedTopAppBarGHTll3U(final p181hd.InterfaceC9544p r24, androidx.compose.p014ui.Modifier r25, p181hd.InterfaceC9544p r26, p181hd.InterfaceC9545q r27, float r28, androidx.compose.foundation.layout.WindowInsets r29, androidx.compose.material3.TopAppBarColors r30, androidx.compose.material3.TopAppBarScrollBehavior r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m28348CenterAlignedTopAppBarGHTll3U(hd.p, androidx.compose.ui.Modifier, hd.p, hd.q, float, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0119  */
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    @p309qc.InterfaceC10770a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void LargeTopAppBar(final p181hd.InterfaceC9544p r21, androidx.compose.p014ui.Modifier r22, p181hd.InterfaceC9544p r23, p181hd.InterfaceC9545q r24, androidx.compose.foundation.layout.WindowInsets r25, androidx.compose.material3.TopAppBarColors r26, androidx.compose.material3.TopAppBarScrollBehavior r27, androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.LargeTopAppBar(hd.p, androidx.compose.ui.Modifier, hd.p, hd.q, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f7  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: LargeTopAppBar-oKE7A98, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m28349LargeTopAppBaroKE7A98(final p181hd.InterfaceC9544p r29, androidx.compose.p014ui.Modifier r30, p181hd.InterfaceC9544p r31, p181hd.InterfaceC9545q r32, float r33, float r34, androidx.compose.foundation.layout.WindowInsets r35, androidx.compose.material3.TopAppBarColors r36, androidx.compose.material3.TopAppBarScrollBehavior r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 647
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m28349LargeTopAppBaroKE7A98(hd.p, androidx.compose.ui.Modifier, hd.p, hd.q, float, float, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0119  */
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    @p309qc.InterfaceC10770a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void MediumTopAppBar(final p181hd.InterfaceC9544p r21, androidx.compose.p014ui.Modifier r22, p181hd.InterfaceC9544p r23, p181hd.InterfaceC9545q r24, androidx.compose.foundation.layout.WindowInsets r25, androidx.compose.material3.TopAppBarColors r26, androidx.compose.material3.TopAppBarScrollBehavior r27, androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.MediumTopAppBar(hd.p, androidx.compose.ui.Modifier, hd.p, hd.q, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f7  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: MediumTopAppBar-oKE7A98, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m28350MediumTopAppBaroKE7A98(final p181hd.InterfaceC9544p r29, androidx.compose.p014ui.Modifier r30, p181hd.InterfaceC9544p r31, p181hd.InterfaceC9545q r32, float r33, float r34, androidx.compose.foundation.layout.WindowInsets r35, androidx.compose.material3.TopAppBarColors r36, androidx.compose.material3.TopAppBarScrollBehavior r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 647
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m28350MediumTopAppBaroKE7A98(hd.p, androidx.compose.ui.Modifier, hd.p, hd.q, float, float, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f8  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: SingleRowTopAppBar-cJHQLPU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m28351SingleRowTopAppBarcJHQLPU(androidx.compose.p014ui.Modifier r31, final p181hd.InterfaceC9544p r32, final androidx.compose.p014ui.text.TextStyle r33, final boolean r34, final p181hd.InterfaceC9544p r35, final p181hd.InterfaceC9545q r36, final float r37, final androidx.compose.foundation.layout.WindowInsets r38, final androidx.compose.material3.TopAppBarColors r39, final androidx.compose.material3.TopAppBarScrollBehavior r40, androidx.compose.runtime.Composer r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 713
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m28351SingleRowTopAppBarcJHQLPU(androidx.compose.ui.Modifier, hd.p, androidx.compose.ui.text.TextStyle, boolean, hd.p, hd.q, float, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final long SingleRowTopAppBar_cJHQLPU$lambda$10(State<Color> state) {
        return state.getValue().m30888unboximpl();
    }

    private static final float SingleRowTopAppBar_cJHQLPU$lambda$9(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0118  */
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    @p309qc.InterfaceC10770a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void TopAppBar(final p181hd.InterfaceC9544p r20, androidx.compose.p014ui.Modifier r21, p181hd.InterfaceC9544p r22, p181hd.InterfaceC9545q r23, androidx.compose.foundation.layout.WindowInsets r24, androidx.compose.material3.TopAppBarColors r25, androidx.compose.material3.TopAppBarScrollBehavior r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.TopAppBar(hd.p, androidx.compose.ui.Modifier, hd.p, hd.q, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0111  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: TopAppBar-GHTll3U, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m28352TopAppBarGHTll3U(final p181hd.InterfaceC9544p r24, androidx.compose.p014ui.Modifier r25, p181hd.InterfaceC9544p r26, p181hd.InterfaceC9545q r27, float r28, androidx.compose.foundation.layout.WindowInsets r29, androidx.compose.material3.TopAppBarColors r30, androidx.compose.material3.TopAppBarScrollBehavior r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m28352TopAppBarGHTll3U(hd.p, androidx.compose.ui.Modifier, hd.p, hd.q, float, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: TopAppBarLayout-kXwM9vE, reason: not valid java name */
    public static final void m28353TopAppBarLayoutkXwM9vE(final Modifier modifier, final ScrolledOffset scrolledOffset, long j10, final long j11, final long j12, final InterfaceC9544p interfaceC9544p, final TextStyle textStyle, final float f10, final Arrangement.Vertical vertical, final Arrangement.Horizontal horizontal, final int i10, final boolean z10, final InterfaceC9544p interfaceC9544p2, final InterfaceC9544p interfaceC9544p3, Composer composer, final int i11, final int i12) {
        int i13;
        long j13;
        int i14;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-742442296);
        if ((i11 & 6) == 0) {
            i13 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= (i11 & 64) == 0 ? composerStartRestartGroup.changed(scrolledOffset) : composerStartRestartGroup.changedInstance(scrolledOffset) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            j13 = j10;
            i13 |= composerStartRestartGroup.changed(j13) ? 256 : 128;
        } else {
            j13 = j10;
        }
        int i15 = i13;
        if ((i11 & 3072) == 0) {
            i15 |= composerStartRestartGroup.changed(j11) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i15 |= composerStartRestartGroup.changed(j12) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i15 |= composerStartRestartGroup.changedInstance(interfaceC9544p) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i15 |= composerStartRestartGroup.changed(textStyle) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i15 |= composerStartRestartGroup.changed(f10) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i15 |= composerStartRestartGroup.changed(vertical) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i15 |= composerStartRestartGroup.changed(horizontal) ? 536870912 : 268435456;
        }
        int i16 = i15;
        if ((i12 & 6) == 0) {
            i14 = i12 | (composerStartRestartGroup.changed(i10) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= composerStartRestartGroup.changed(z10) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i14 |= composerStartRestartGroup.changedInstance(interfaceC9544p2) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i14 |= composerStartRestartGroup.changedInstance(interfaceC9544p3) ? 2048 : 1024;
        }
        int i17 = i14;
        if ((i16 & 306783379) == 306783378 && (i17 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-742442296, i16, i17, "androidx.compose.material3.TopAppBarLayout (AppBar.kt:2134)");
            }
            boolean z11 = ((i16 & 112) == 32 || ((i16 & 64) != 0 && composerStartRestartGroup.changedInstance(scrolledOffset))) | ((1879048192 & i16) == 536870912) | ((234881024 & i16) == 67108864) | ((i17 & 14) == 4);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z11 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.AppBarKt$TopAppBarLayout$2$1
                    @Override // androidx.compose.p014ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo26741measure3p2s80s(final MeasureScope measureScope, List<? extends Measurable> list, final long j14) {
                        int size = list.size();
                        for (int i18 = 0; i18 < size; i18++) {
                            Measurable measurable = list.get(i18);
                            if (AbstractC9979u.m20289b(LayoutIdKt.getLayoutId(measurable), "navigationIcon")) {
                                final Placeable placeableMo32229measureBRTryo0 = measurable.mo32229measureBRTryo0(Constraints.m33444copyZbe2FdA$default(j14, 0, 0, 0, 0, 14, null));
                                int size2 = list.size();
                                for (int i19 = 0; i19 < size2; i19++) {
                                    Measurable measurable2 = list.get(i19);
                                    if (AbstractC9979u.m20289b(LayoutIdKt.getLayoutId(measurable2), "actionIcons")) {
                                        final Placeable placeableMo32229measureBRTryo02 = measurable2.mo32229measureBRTryo0(Constraints.m33444copyZbe2FdA$default(j14, 0, 0, 0, 0, 14, null));
                                        int iM33454getMaxWidthimpl = Constraints.m33454getMaxWidthimpl(j14) == Integer.MAX_VALUE ? Constraints.m33454getMaxWidthimpl(j14) : AbstractC10410o.m21752e((Constraints.m33454getMaxWidthimpl(j14) - placeableMo32229measureBRTryo0.getWidth()) - placeableMo32229measureBRTryo02.getWidth(), 0);
                                        int size3 = list.size();
                                        for (int i20 = 0; i20 < size3; i20++) {
                                            Measurable measurable3 = list.get(i20);
                                            if (AbstractC9979u.m20289b(LayoutIdKt.getLayoutId(measurable3), "title")) {
                                                final Placeable placeableMo32229measureBRTryo03 = measurable3.mo32229measureBRTryo0(Constraints.m33444copyZbe2FdA$default(j14, 0, iM33454getMaxWidthimpl, 0, 0, 12, null));
                                                final int i21 = placeableMo32229measureBRTryo03.get(AlignmentLineKt.getLastBaseline()) != Integer.MIN_VALUE ? placeableMo32229measureBRTryo03.get(AlignmentLineKt.getLastBaseline()) : 0;
                                                float fOffset = scrolledOffset.offset();
                                                final int iM33453getMaxHeightimpl = Constraints.m33453getMaxHeightimpl(j14) == Integer.MAX_VALUE ? Constraints.m33453getMaxHeightimpl(j14) : Constraints.m33453getMaxHeightimpl(j14) + (Float.isNaN(fOffset) ? 0 : AbstractC9719c.m19282d(fOffset));
                                                int iM33454getMaxWidthimpl2 = Constraints.m33454getMaxWidthimpl(j14);
                                                final Arrangement.Horizontal horizontal2 = horizontal;
                                                final Arrangement.Vertical vertical2 = vertical;
                                                final int i22 = i10;
                                                return MeasureScope.layout$default(measureScope, iM33454getMaxWidthimpl2, iM33453getMaxHeightimpl, null, new InterfaceC9540l() { // from class: androidx.compose.material3.AppBarKt$TopAppBarLayout$2$1.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // p181hd.InterfaceC9540l
                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                        invoke((Placeable.PlacementScope) obj);
                                                        return C10786q.f26013a;
                                                    }

                                                    public final void invoke(Placeable.PlacementScope placementScope) {
                                                        int iM33454getMaxWidthimpl3;
                                                        int i23;
                                                        int height;
                                                        int iM33454getMaxWidthimpl4;
                                                        Placeable placeable = placeableMo32229measureBRTryo0;
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, (iM33453getMaxHeightimpl - placeable.getHeight()) / 2, 0.0f, 4, null);
                                                        Placeable placeable2 = placeableMo32229measureBRTryo03;
                                                        Arrangement.Horizontal horizontal3 = horizontal2;
                                                        Arrangement arrangement = Arrangement.INSTANCE;
                                                        if (AbstractC9979u.m20289b(horizontal3, arrangement.getCenter())) {
                                                            iM33454getMaxWidthimpl3 = (Constraints.m33454getMaxWidthimpl(j14) - placeableMo32229measureBRTryo03.getWidth()) / 2;
                                                            if (iM33454getMaxWidthimpl3 < placeableMo32229measureBRTryo0.getWidth()) {
                                                                iM33454getMaxWidthimpl4 = placeableMo32229measureBRTryo0.getWidth() - iM33454getMaxWidthimpl3;
                                                            } else if (placeableMo32229measureBRTryo03.getWidth() + iM33454getMaxWidthimpl3 > Constraints.m33454getMaxWidthimpl(j14) - placeableMo32229measureBRTryo02.getWidth()) {
                                                                iM33454getMaxWidthimpl4 = (Constraints.m33454getMaxWidthimpl(j14) - placeableMo32229measureBRTryo02.getWidth()) - (placeableMo32229measureBRTryo03.getWidth() + iM33454getMaxWidthimpl3);
                                                            }
                                                            iM33454getMaxWidthimpl3 += iM33454getMaxWidthimpl4;
                                                        } else {
                                                            iM33454getMaxWidthimpl3 = AbstractC9979u.m20289b(horizontal3, arrangement.getEnd()) ? (Constraints.m33454getMaxWidthimpl(j14) - placeableMo32229measureBRTryo03.getWidth()) - placeableMo32229measureBRTryo02.getWidth() : Math.max(measureScope.mo27093roundToPx0680j_4(AppBarKt.TopAppBarTitleInset), placeableMo32229measureBRTryo0.getWidth());
                                                        }
                                                        int i24 = iM33454getMaxWidthimpl3;
                                                        Arrangement.Vertical vertical3 = vertical2;
                                                        if (AbstractC9979u.m20289b(vertical3, arrangement.getCenter())) {
                                                            height = (iM33453getMaxHeightimpl - placeableMo32229measureBRTryo03.getHeight()) / 2;
                                                        } else {
                                                            if (!AbstractC9979u.m20289b(vertical3, arrangement.getBottom())) {
                                                                i23 = 0;
                                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i24, i23, 0.0f, 4, null);
                                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo32229measureBRTryo02, Constraints.m33454getMaxWidthimpl(j14) - placeableMo32229measureBRTryo02.getWidth(), (iM33453getMaxHeightimpl - placeableMo32229measureBRTryo02.getHeight()) / 2, 0.0f, 4, null);
                                                            }
                                                            int i25 = i22;
                                                            if (i25 == 0) {
                                                                height = iM33453getMaxHeightimpl - placeableMo32229measureBRTryo03.getHeight();
                                                            } else {
                                                                int height2 = i25 - (placeableMo32229measureBRTryo03.getHeight() - i21);
                                                                int height3 = placeableMo32229measureBRTryo03.getHeight() + height2;
                                                                if (height3 > Constraints.m33453getMaxHeightimpl(j14)) {
                                                                    height2 -= height3 - Constraints.m33453getMaxHeightimpl(j14);
                                                                }
                                                                height = (iM33453getMaxHeightimpl - placeableMo32229measureBRTryo03.getHeight()) - Math.max(0, height2);
                                                            }
                                                        }
                                                        i23 = height;
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i24, i23, 0.0f, 4, null);
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo32229measureBRTryo02, Constraints.m33454getMaxWidthimpl(j14) - placeableMo32229measureBRTryo02.getWidth(), (iM33453getMaxHeightimpl - placeableMo32229measureBRTryo02.getHeight()) / 2, 0.0f, 4, null);
                                                    }
                                                }, 4, null);
                                            }
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            InterfaceC9529a constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM30305constructorimpl = Updater.m30305constructorimpl(composerStartRestartGroup);
            Updater.m30312setimpl(composerM30305constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
            Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            InterfaceC9544p setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier modifierLayoutId = LayoutIdKt.layoutId(companion2, "navigationIcon");
            float f11 = TopAppBarHorizontalPadding;
            Modifier modifierM27462paddingqDBjuR0$default = PaddingKt.m27462paddingqDBjuR0$default(modifierLayoutId, f11, 0.0f, 0.0f, 0.0f, 14, null);
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM27462paddingqDBjuR0$default);
            InterfaceC9529a constructor2 = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM30305constructorimpl2 = Updater.m30305constructorimpl(composerStartRestartGroup);
            Updater.m30312setimpl(composerM30305constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m30312setimpl(composerM30305constructorimpl2, currentCompositionLocalMap2, companion.getSetResolvedCompositionLocals());
            InterfaceC9544p setCompositeKeyHash2 = companion.getSetCompositeKeyHash();
            if (composerM30305constructorimpl2.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM30305constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM30305constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m30312setimpl(composerM30305constructorimpl2, modifierMaterializeModifier2, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ProvidedValue<Color> providedValueProvides = ContentColorKt.getLocalContentColor().provides(Color.m30868boximpl(j13));
            int i18 = ProvidedValue.$stable;
            CompositionLocalKt.CompositionLocalProvider(providedValueProvides, interfaceC9544p2, composerStartRestartGroup, ((i17 >> 3) & 112) | i18);
            composerStartRestartGroup.endNode();
            Modifier modifierM31038graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m31038graphicsLayerAp8cVGQ$default(PaddingKt.m27460paddingVpY3zN4$default(LayoutIdKt.layoutId(companion2, "title"), f11, 0.0f, 2, null).then(z10 ? SemanticsModifierKt.clearAndSetSemantics(companion2, new InterfaceC9540l() { // from class: androidx.compose.material3.AppBarKt$TopAppBarLayout$1$2
                public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((SemanticsPropertyReceiver) obj);
                    return C10786q.f26013a;
                }
            }) : companion2), 0.0f, 0.0f, f10, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131067, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM31038graphicsLayerAp8cVGQ$default);
            InterfaceC9529a constructor3 = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM30305constructorimpl3 = Updater.m30305constructorimpl(composerStartRestartGroup);
            Updater.m30312setimpl(composerM30305constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, companion.getSetMeasurePolicy());
            Updater.m30312setimpl(composerM30305constructorimpl3, currentCompositionLocalMap3, companion.getSetResolvedCompositionLocals());
            InterfaceC9544p setCompositeKeyHash3 = companion.getSetCompositeKeyHash();
            if (composerM30305constructorimpl3.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM30305constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM30305constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m30312setimpl(composerM30305constructorimpl3, modifierMaterializeModifier3, companion.getSetModifier());
            int i19 = i16 >> 9;
            ProvideContentColorTextStyleKt.m29517ProvideContentColorTextStyle3JVO9M(j11, textStyle, interfaceC9544p, composerStartRestartGroup, (i19 & 14) | ((i16 >> 15) & 112) | (i19 & 896));
            composer2 = composerStartRestartGroup;
            composer2.endNode();
            Modifier modifierM27462paddingqDBjuR0$default2 = PaddingKt.m27462paddingqDBjuR0$default(LayoutIdKt.layoutId(companion2, "actionIcons"), 0.0f, 0.0f, f11, 0.0f, 11, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierM27462paddingqDBjuR0$default2);
            InterfaceC9529a constructor4 = companion.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor4);
            } else {
                composer2.useNode();
            }
            Composer composerM30305constructorimpl4 = Updater.m30305constructorimpl(composer2);
            Updater.m30312setimpl(composerM30305constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy3, companion.getSetMeasurePolicy());
            Updater.m30312setimpl(composerM30305constructorimpl4, currentCompositionLocalMap4, companion.getSetResolvedCompositionLocals());
            InterfaceC9544p setCompositeKeyHash4 = companion.getSetCompositeKeyHash();
            if (composerM30305constructorimpl4.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composerM30305constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM30305constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m30312setimpl(composerM30305constructorimpl4, modifierMaterializeModifier4, companion.getSetModifier());
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m30868boximpl(j12)), interfaceC9544p3, composer2, ((i17 >> 6) & 112) | i18);
            composer2.endNode();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final long j14 = j13;
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.AppBarKt$TopAppBarLayout$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer3, int i20) {
                    AppBarKt.m28353TopAppBarLayoutkXwM9vE(modifier, scrolledOffset, j14, j11, j12, interfaceC9544p, textStyle, f10, vertical, horizontal, i10, z10, interfaceC9544p2, interfaceC9544p3, composer3, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), RecomposeScopeImplKt.updateChangedFlags(i12));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:220:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0121  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: TwoRowsTopAppBar-nS6u9G4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m28354TwoRowsTopAppBarnS6u9G4(androidx.compose.p014ui.Modifier r40, final p181hd.InterfaceC9544p r41, final androidx.compose.p014ui.text.TextStyle r42, final float r43, final p181hd.InterfaceC9544p r44, final androidx.compose.p014ui.text.TextStyle r45, final p181hd.InterfaceC9544p r46, final p181hd.InterfaceC9545q r47, final float r48, final float r49, final androidx.compose.foundation.layout.WindowInsets r50, final androidx.compose.material3.TopAppBarColors r51, final androidx.compose.material3.TopAppBarScrollBehavior r52, androidx.compose.runtime.Composer r53, final int r54, final int r55, final int r56) {
        /*
            Method dump skipped, instructions count: 875
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m28354TwoRowsTopAppBarnS6u9G4(androidx.compose.ui.Modifier, hd.p, androidx.compose.ui.text.TextStyle, float, hd.p, androidx.compose.ui.text.TextStyle, hd.p, hd.q, float, float, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final float getBottomAppBarVerticalPadding() {
        return BottomAppBarVerticalPadding;
    }

    public static final CubicBezierEasing getTopTitleAlphaEasing() {
        return TopTitleAlphaEasing;
    }

    @Composable
    @ExperimentalMaterial3Api
    public static final BottomAppBarState rememberBottomAppBarState(final float f10, final float f11, final float f12, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = -3.4028235E38f;
        }
        if ((i11 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i11 & 4) != 0) {
            f12 = 0.0f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1420874240, i10, -1, "androidx.compose.material3.rememberBottomAppBarState (AppBar.kt:1610)");
        }
        Object[] objArr = new Object[0];
        Saver<BottomAppBarState, ?> saver = BottomAppBarState.Companion.getSaver();
        boolean z10 = ((((i10 & 14) ^ 6) > 4 && composer.changed(f10)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && composer.changed(f11)) || (i10 & 48) == 32) | ((((i10 & 896) ^ 384) > 256 && composer.changed(f12)) || (i10 & 384) == 256);
        Object objRememberedValue = composer.rememberedValue();
        if (z10 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new InterfaceC9529a() { // from class: androidx.compose.material3.AppBarKt$rememberBottomAppBarState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public final BottomAppBarState invoke() {
                    return AppBarKt.BottomAppBarState(f10, f11, f12);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        BottomAppBarState bottomAppBarState = (BottomAppBarState) RememberSaveableKt.m30420rememberSaveable(objArr, (Saver) saver, (String) null, (InterfaceC9529a) objRememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return bottomAppBarState;
    }

    @Composable
    @ExperimentalMaterial3Api
    public static final TopAppBarState rememberTopAppBarState(final float f10, final float f11, final float f12, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = -3.4028235E38f;
        }
        if ((i11 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i11 & 4) != 0) {
            f12 = 0.0f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1801969826, i10, -1, "androidx.compose.material3.rememberTopAppBarState (AppBar.kt:1291)");
        }
        Object[] objArr = new Object[0];
        Saver<TopAppBarState, ?> saver = TopAppBarState.Companion.getSaver();
        boolean z10 = ((((i10 & 14) ^ 6) > 4 && composer.changed(f10)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && composer.changed(f11)) || (i10 & 48) == 32) | ((((i10 & 896) ^ 384) > 256 && composer.changed(f12)) || (i10 & 384) == 256);
        Object objRememberedValue = composer.rememberedValue();
        if (z10 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new InterfaceC9529a() { // from class: androidx.compose.material3.AppBarKt$rememberTopAppBarState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public final TopAppBarState invoke() {
                    return new TopAppBarState(f10, f11, f12);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        TopAppBarState topAppBarState = (TopAppBarState) RememberSaveableKt.m30420rememberSaveable(objArr, (Saver) saver, (String) null, (InterfaceC9529a) objRememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return topAppBarState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object settleAppBar(androidx.compose.material3.TopAppBarState r21, float r22, androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> r23, androidx.compose.animation.core.AnimationSpec<java.lang.Float> r24, vc.InterfaceC11588c<? super androidx.compose.p014ui.unit.Velocity> r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.settleAppBar(androidx.compose.material3.TopAppBarState, float, androidx.compose.animation.core.DecayAnimationSpec, androidx.compose.animation.core.AnimationSpec, vc.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object settleAppBarBottom(androidx.compose.material3.BottomAppBarState r21, float r22, androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> r23, androidx.compose.animation.core.AnimationSpec<java.lang.Float> r24, vc.InterfaceC11588c<? super androidx.compose.p014ui.unit.Velocity> r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.settleAppBarBottom(androidx.compose.material3.BottomAppBarState, float, androidx.compose.animation.core.DecayAnimationSpec, androidx.compose.animation.core.AnimationSpec, vc.c):java.lang.Object");
    }
}
