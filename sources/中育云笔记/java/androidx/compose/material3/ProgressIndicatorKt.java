package androidx.compose.material3;

import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.tokens.ProgressIndicatorTokens;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.geometry.OffsetKt;
import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.geometry.SizeKt;
import androidx.compose.p014ui.graphics.StrokeCap;
import androidx.compose.p014ui.graphics.drawscope.DrawScope;
import androidx.compose.p014ui.graphics.drawscope.Stroke;
import androidx.compose.p014ui.layout.LayoutModifierKt;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.semantics.SemanticsModifierKt;
import androidx.compose.p014ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.ConstraintsKt;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p265nd.AbstractC10409n;
import p265nd.AbstractC10410o;
import p265nd.InterfaceC10401f;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;

/* loaded from: classes2.dex */
public final class ProgressIndicatorKt {
    private static final float BaseRotationAngle = 286.0f;
    private static final CubicBezierEasing CircularEasing;
    private static final float CircularIndicatorDiameter;
    private static final int FirstLineHeadDelay = 0;
    private static final int FirstLineHeadDuration = 750;
    private static final CubicBezierEasing FirstLineHeadEasing;
    private static final int FirstLineTailDelay = 333;
    private static final int FirstLineTailDuration = 850;
    private static final CubicBezierEasing FirstLineTailEasing;
    private static final int HeadAndTailAnimationDuration = 666;
    private static final int HeadAndTailDelayDuration = 666;
    private static final Modifier IncreaseSemanticsBounds;
    private static final float JumpRotationAngle = 290.0f;
    private static final int LinearAnimationDuration = 1800;
    private static final float LinearIndicatorHeight;
    private static final float LinearIndicatorWidth;
    private static final float RotationAngleOffset = 216.0f;
    private static final int RotationDuration = 1332;
    private static final int RotationsPerCycle = 5;
    private static final int SecondLineHeadDelay = 1000;
    private static final int SecondLineHeadDuration = 567;
    private static final CubicBezierEasing SecondLineHeadEasing;
    private static final int SecondLineTailDelay = 1267;
    private static final int SecondLineTailDuration = 533;
    private static final CubicBezierEasing SecondLineTailEasing;
    private static final float SemanticsBoundsPadding;
    private static final float StartAngleOffset = -90.0f;

    static {
        float fM33501constructorimpl = C3186Dp.m33501constructorimpl(10);
        SemanticsBoundsPadding = fM33501constructorimpl;
        IncreaseSemanticsBounds = PaddingKt.m27460paddingVpY3zN4$default(SemanticsModifierKt.semantics(LayoutModifierKt.layout(Modifier.Companion, new InterfaceC9545q() { // from class: androidx.compose.material3.ProgressIndicatorKt$IncreaseSemanticsBounds$1
            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return m28989invoke3p2s80s((MeasureScope) obj, (Measurable) obj2, ((Constraints) obj3).m33460unboximpl());
            }

            /* renamed from: invoke-3p2s80s, reason: not valid java name */
            public final MeasureResult m28989invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
                final int iMo27093roundToPx0680j_4 = measureScope.mo27093roundToPx0680j_4(ProgressIndicatorKt.SemanticsBoundsPadding);
                int i10 = iMo27093roundToPx0680j_4 * 2;
                final Placeable placeableMo32229measureBRTryo0 = measurable.mo32229measureBRTryo0(ConstraintsKt.m33473offsetNN6EwU(j10, 0, i10));
                return MeasureScope.layout$default(measureScope, placeableMo32229measureBRTryo0.getWidth(), placeableMo32229measureBRTryo0.getHeight() - i10, null, new InterfaceC9540l() { // from class: androidx.compose.material3.ProgressIndicatorKt$IncreaseSemanticsBounds$1.1
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
                        Placeable.PlacementScope.place$default(placementScope, placeableMo32229measureBRTryo0, 0, -iMo27093roundToPx0680j_4, 0.0f, 4, null);
                    }
                }, 4, null);
            }
        }), true, new InterfaceC9540l() { // from class: androidx.compose.material3.ProgressIndicatorKt$IncreaseSemanticsBounds$2
            public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SemanticsPropertyReceiver) obj);
                return C10786q.f26013a;
            }
        }), 0.0f, fM33501constructorimpl, 1, null);
        LinearIndicatorWidth = C3186Dp.m33501constructorimpl(240);
        ProgressIndicatorTokens progressIndicatorTokens = ProgressIndicatorTokens.INSTANCE;
        LinearIndicatorHeight = progressIndicatorTokens.m30082getTrackThicknessD9Ej5fM();
        CircularIndicatorDiameter = C3186Dp.m33501constructorimpl(progressIndicatorTokens.m30079getSizeD9Ej5fM() - C3186Dp.m33501constructorimpl(progressIndicatorTokens.m30082getTrackThicknessD9Ej5fM() * 2));
        FirstLineHeadEasing = new CubicBezierEasing(0.2f, 0.0f, 0.8f, 1.0f);
        FirstLineTailEasing = new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);
        SecondLineHeadEasing = new CubicBezierEasing(0.0f, 0.0f, 0.65f, 1.0f);
        SecondLineTailEasing = new CubicBezierEasing(0.1f, 0.0f, 0.45f, 1.0f);
        CircularEasing = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011c  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @p309qc.InterfaceC10770a
    /* renamed from: CircularProgressIndicator-DUhRLBM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m28967CircularProgressIndicatorDUhRLBM(final p181hd.InterfaceC9529a r22, androidx.compose.p014ui.Modifier r23, long r24, float r26, long r27, int r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m28967CircularProgressIndicatorDUhRLBM(hd.a, androidx.compose.ui.Modifier, long, float, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0114  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: CircularProgressIndicator-IyT6zlY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m28968CircularProgressIndicatorIyT6zlY(final p181hd.InterfaceC9529a r31, androidx.compose.p014ui.Modifier r32, long r33, float r35, long r36, int r38, float r39, androidx.compose.runtime.Composer r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m28968CircularProgressIndicatorIyT6zlY(hd.a, androidx.compose.ui.Modifier, long, float, long, int, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x025c  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: CircularProgressIndicator-LxG7B9w, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m28969CircularProgressIndicatorLxG7B9w(androidx.compose.p014ui.Modifier r32, long r33, float r35, long r36, int r38, androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m28969CircularProgressIndicatorLxG7B9w(androidx.compose.ui.Modifier, long, float, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @p309qc.InterfaceC10770a
    /* renamed from: CircularProgressIndicator-MBs18nI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m28970CircularProgressIndicatorMBs18nI(final float r20, androidx.compose.p014ui.Modifier r21, long r22, float r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m28970CircularProgressIndicatorMBs18nI(float, androidx.compose.ui.Modifier, long, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @p309qc.InterfaceC10770a
    /* renamed from: CircularProgressIndicator-aM-cp0Q, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m28971CircularProgressIndicatoraMcp0Q(androidx.compose.p014ui.Modifier r16, long r17, float r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m28971CircularProgressIndicatoraMcp0Q(androidx.compose.ui.Modifier, long, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @p309qc.InterfaceC10770a
    /* renamed from: LinearProgressIndicator-2cYBFYY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m28972LinearProgressIndicator2cYBFYY(androidx.compose.p014ui.Modifier r18, long r19, long r21, int r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m28972LinearProgressIndicator2cYBFYY(androidx.compose.ui.Modifier, long, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0114  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: LinearProgressIndicator-GJbTh5U, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m28973LinearProgressIndicatorGJbTh5U(final p181hd.InterfaceC9529a r30, androidx.compose.p014ui.Modifier r31, long r32, long r34, int r36, float r37, p181hd.InterfaceC9540l r38, androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m28973LinearProgressIndicatorGJbTh5U(hd.a, androidx.compose.ui.Modifier, long, long, int, float, hd.l, androidx.compose.runtime.Composer, int, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @InterfaceC10770a
    /* renamed from: LinearProgressIndicator-RIQooxk, reason: not valid java name */
    public static final /* synthetic */ void m28974LinearProgressIndicatorRIQooxk(Modifier modifier, long j10, long j11, Composer composer, final int i10, final int i11) {
        Modifier modifier2;
        int i12;
        long linearColor;
        long linearTrackColor;
        long j12;
        Modifier modifier3;
        final Modifier modifier4;
        final long j13;
        final long j14;
        Composer composerStartRestartGroup = composer.startRestartGroup(585576195);
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
            if ((i11 & 2) == 0) {
                linearColor = j10;
                int i14 = composerStartRestartGroup.changed(linearColor) ? 32 : 16;
                i12 |= i14;
            } else {
                linearColor = j10;
            }
            i12 |= i14;
        } else {
            linearColor = j10;
        }
        if ((i10 & 384) == 0) {
            if ((i11 & 4) == 0) {
                linearTrackColor = j11;
                int i15 = composerStartRestartGroup.changed(linearTrackColor) ? 256 : 128;
                i12 |= i15;
            } else {
                linearTrackColor = j11;
            }
            i12 |= i15;
        } else {
            linearTrackColor = j11;
        }
        if ((i12 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier4 = modifier2;
            j13 = linearColor;
            j14 = linearTrackColor;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                Modifier modifier5 = i13 != 0 ? Modifier.Companion : modifier2;
                if ((i11 & 2) != 0) {
                    linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                    i12 &= -897;
                }
                j12 = linearTrackColor;
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                }
                j12 = linearTrackColor;
                modifier3 = modifier2;
            }
            long j15 = linearColor;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(585576195, i12, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:421)");
            }
            m28978LinearProgressIndicatorrIrjwxo(modifier3, j15, j12, ProgressIndicatorDefaults.INSTANCE.m28964getLinearStrokeCapKaPHkGw(), 0.0f, composerStartRestartGroup, (i12 & 14) | 3072 | (i12 & 112) | (i12 & 896), 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            j13 = j15;
            j14 = j12;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$12
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer2, int i16) {
                    ProgressIndicatorKt.m28974LinearProgressIndicatorRIQooxk(modifier4, j13, j14, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @p309qc.InterfaceC10770a
    /* renamed from: LinearProgressIndicator-_5eSR-E, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m28976LinearProgressIndicator_5eSRE(final p181hd.InterfaceC9529a r21, androidx.compose.p014ui.Modifier r22, long r23, long r25, int r27, androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m28976LinearProgressIndicator_5eSRE(hd.a, androidx.compose.ui.Modifier, long, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @p309qc.InterfaceC10770a
    /* renamed from: LinearProgressIndicator-eaDK9VM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m28977LinearProgressIndicatoreaDK9VM(final float r18, androidx.compose.p014ui.Modifier r19, long r20, long r22, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m28977LinearProgressIndicatoreaDK9VM(float, androidx.compose.ui.Modifier, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0237  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: LinearProgressIndicator-rIrjwxo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m28978LinearProgressIndicatorrIrjwxo(androidx.compose.p014ui.Modifier r28, long r29, long r31, int r33, float r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m28978LinearProgressIndicatorrIrjwxo(androidx.compose.ui.Modifier, long, long, int, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawCircularIndicator-42QJj7c, reason: not valid java name */
    public static final void m28984drawCircularIndicator42QJj7c(DrawScope drawScope, float f10, float f11, long j10, Stroke stroke) {
        float f12 = 2;
        float width = stroke.getWidth() / f12;
        float fM30706getWidthimpl = Size.m30706getWidthimpl(drawScope.mo31429getSizeNHjbRc()) - (f12 * width);
        DrawScope.m31408drawArcyD3GUKo$default(drawScope, j10, f10, f11, false, OffsetKt.Offset(width, width), SizeKt.Size(fM30706getWidthimpl, fM30706getWidthimpl), 0.0f, stroke, null, 0, 832, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawCircularIndicatorTrack-bw27NRU, reason: not valid java name */
    public static final void m28985drawCircularIndicatorTrackbw27NRU(DrawScope drawScope, long j10, Stroke stroke) {
        m28984drawCircularIndicator42QJj7c(drawScope, 0.0f, 360.0f, j10, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawDeterminateCircularIndicator-42QJj7c, reason: not valid java name */
    public static final void m28986drawDeterminateCircularIndicator42QJj7c(DrawScope drawScope, float f10, float f11, long j10, Stroke stroke) {
        m28984drawCircularIndicator42QJj7c(drawScope, f10, f11, j10, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawIndeterminateCircularIndicator-hrjfTZI, reason: not valid java name */
    public static final void m28987drawIndeterminateCircularIndicatorhrjfTZI(DrawScope drawScope, float f10, float f11, float f12, long j10, Stroke stroke) {
        m28984drawCircularIndicator42QJj7c(drawScope, f10 + (StrokeCap.m31227equalsimpl0(stroke.m31498getCapKaPHkGw(), StrokeCap.Companion.m31231getButtKaPHkGw()) ? 0.0f : ((f11 / C3186Dp.m33501constructorimpl(CircularIndicatorDiameter / 2)) * 57.29578f) / 2.0f), Math.max(f12, 0.1f), j10, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawLinearIndicator-qYKTg0g, reason: not valid java name */
    public static final void m28988drawLinearIndicatorqYKTg0g(DrawScope drawScope, float f10, float f11, long j10, float f12, int i10) {
        float fM30706getWidthimpl = Size.m30706getWidthimpl(drawScope.mo31429getSizeNHjbRc());
        float fM30703getHeightimpl = Size.m30703getHeightimpl(drawScope.mo31429getSizeNHjbRc());
        float f13 = 2;
        float f14 = fM30703getHeightimpl / f13;
        boolean z10 = drawScope.getLayoutDirection() == LayoutDirection.Ltr;
        float f15 = (z10 ? f10 : 1.0f - f11) * fM30706getWidthimpl;
        float f16 = (z10 ? f11 : 1.0f - f10) * fM30706getWidthimpl;
        if (StrokeCap.m31227equalsimpl0(i10, StrokeCap.Companion.m31231getButtKaPHkGw()) || fM30703getHeightimpl > fM30706getWidthimpl) {
            DrawScope.m31415drawLineNGM6Ib0$default(drawScope, j10, OffsetKt.Offset(f15, f14), OffsetKt.Offset(f16, f14), f12, 0, null, 0.0f, null, 0, 496, null);
            return;
        }
        float f17 = f12 / f13;
        InterfaceC10401f interfaceC10401fM21749b = AbstractC10409n.m21749b(f17, fM30706getWidthimpl - f17);
        float fFloatValue = ((Number) AbstractC10410o.m21764q(Float.valueOf(f15), interfaceC10401fM21749b)).floatValue();
        float fFloatValue2 = ((Number) AbstractC10410o.m21764q(Float.valueOf(f16), interfaceC10401fM21749b)).floatValue();
        if (Math.abs(f11 - f10) > 0.0f) {
            DrawScope.m31415drawLineNGM6Ib0$default(drawScope, j10, OffsetKt.Offset(fFloatValue, f14), OffsetKt.Offset(fFloatValue2, f14), f12, i10, null, 0.0f, null, 0, 480, null);
        }
    }

    public static final float getCircularIndicatorDiameter() {
        return CircularIndicatorDiameter;
    }

    public static final float getLinearIndicatorHeight() {
        return LinearIndicatorHeight;
    }

    public static final float getLinearIndicatorWidth() {
        return LinearIndicatorWidth;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0134  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @p309qc.InterfaceC10770a
    /* renamed from: LinearProgressIndicator-_5eSR-E, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m28975LinearProgressIndicator_5eSRE(final float r21, androidx.compose.p014ui.Modifier r22, long r23, long r25, int r27, androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m28975LinearProgressIndicator_5eSRE(float, androidx.compose.ui.Modifier, long, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011c  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @p309qc.InterfaceC10770a
    /* renamed from: CircularProgressIndicator-DUhRLBM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m28966CircularProgressIndicatorDUhRLBM(final float r22, androidx.compose.p014ui.Modifier r23, long r24, float r26, long r27, int r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m28966CircularProgressIndicatorDUhRLBM(float, androidx.compose.ui.Modifier, long, float, long, int, androidx.compose.runtime.Composer, int, int):void");
    }
}
