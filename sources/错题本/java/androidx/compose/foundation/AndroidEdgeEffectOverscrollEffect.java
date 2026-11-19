package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p011ui.geometry.InlineClassHelperKt;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.geometry.SizeKt;
import androidx.compose.p011ui.graphics.ColorKt;
import androidx.compose.p011ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p011ui.input.pointer.PointerId;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.p011ui.node.DelegatableNode;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;
import p169t6.AbstractC6600a;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0018J\u001a\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0018J\u001a\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0018J6\u0010&\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\"H\u0016ø\u0001\u0000¢\u0006\u0004\b$\u0010%J?\u0010/\u001a\u00020\f2\u0006\u0010(\u001a\u00020'2\"\u0010,\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020'\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0*\u0012\u0006\u0012\u0004\u0018\u00010+0)H\u0096@ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u001a\u00104\u001a\u00020\f2\u0006\u00101\u001a\u000200H\u0000ø\u0001\u0000¢\u0006\u0004\b2\u00103J\u0015\u00107\u001a\u00020\u000fH\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b5\u00106J\u000f\u00109\u001a\u00020\fH\u0000¢\u0006\u0004\b8\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010:R\u001c\u0010;\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R \u0010A\u001a\b\u0012\u0004\u0012\u00020\f0@8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR(\u0010E\u001a\u00020\u00118\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bE\u0010F\u0012\u0004\bK\u0010\u000e\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u0016\u0010L\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010FR\u001c\u0010M\u001a\u0002008\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bM\u0010<R\u001c\u0010O\u001a\u00020N8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bO\u0010<R\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u001a\u0010T\u001a\u00020S8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0014\u0010X\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010H\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Y"}, m5110d2 = {"Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;", "Landroidx/compose/foundation/OverscrollEffect;", "Landroid/content/Context;", "context", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/graphics/Color;", "glowColor", "Landroidx/compose/foundation/layout/PaddingValues;", "glowDrawPadding", "<init>", "(Landroid/content/Context;Landroidx/compose/ui/unit/Density;JLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/internal/e;)V", "Ld6/s;", "animateToReleaseIfNeeded", "()V", "Landroidx/compose/ui/geometry/Offset;", "delta", "", "releaseOppositeOverscroll-k-4lQ0M", "(J)Z", "releaseOppositeOverscroll", "scroll", "", "pullTop-k-4lQ0M", "(J)F", "pullTop", "pullBottom-k-4lQ0M", "pullBottom", "pullLeft-k-4lQ0M", "pullLeft", "pullRight-k-4lQ0M", "pullRight", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "Lkotlin/Function1;", "performScroll", "applyToScroll-Rhakbz0", "(JILr6/c;)J", "applyToScroll", "Landroidx/compose/ui/unit/Velocity;", "velocity", "Lkotlin/Function2;", "Lh6/c;", "", "performFling", "applyToFling-BMRW4eQ", "(JLr6/e;Lh6/c;)Ljava/lang/Object;", "applyToFling", "Landroidx/compose/ui/geometry/Size;", "size", "updateSize-uvyYCjk$foundation_release", "(J)V", "updateSize", "displacement-F1C5BW0$foundation_release", "()J", "displacement", "invalidateOverscroll$foundation_release", "invalidateOverscroll", "Landroidx/compose/ui/unit/Density;", "pointerPosition", "J", "Landroidx/compose/foundation/EdgeEffectWrapper;", "edgeEffectWrapper", "Landroidx/compose/foundation/EdgeEffectWrapper;", "Landroidx/compose/runtime/MutableState;", "redrawSignal", "Landroidx/compose/runtime/MutableState;", "getRedrawSignal$foundation_release", "()Landroidx/compose/runtime/MutableState;", "invalidationEnabled", "Z", "getInvalidationEnabled$foundation_release", "()Z", "setInvalidationEnabled$foundation_release", "(Z)V", "getInvalidationEnabled$foundation_release$annotations", "scrollCycleInProgress", "containerSize", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerId", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "pointerInputNode", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "Landroidx/compose/ui/node/DelegatableNode;", "node", "Landroidx/compose/ui/node/DelegatableNode;", "getNode", "()Landroidx/compose/ui/node/DelegatableNode;", "isInProgress", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAndroidOverscroll.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 6 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 7 AndroidOverscroll.android.kt\nandroidx/compose/foundation/EdgeEffectWrapper\n+ 8 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n*L\n1#1,1073:1\n69#2:1074\n69#2:1077\n69#2:1080\n69#2:1083\n69#2:1086\n65#2:1089\n65#2:1092\n65#2:1095\n65#2:1098\n65#2:1101\n65#2:1108\n69#2:1111\n65#2:1113\n69#2:1116\n65#2:1118\n65#2:1121\n69#2:1124\n69#2:1127\n65#2:1155\n69#2:1159\n65#2:1172\n65#2:1175\n65#2:1178\n65#2:1181\n69#2:1184\n69#2:1187\n69#2:1190\n69#2:1193\n65#2:1196\n69#2:1199\n69#2:1206\n65#2:1209\n69#2:1212\n69#2:1219\n69#2:1222\n65#2:1225\n65#2:1232\n69#2:1235\n65#2:1238\n65#2:1245\n70#3:1075\n70#3:1078\n70#3:1081\n70#3:1084\n70#3:1087\n60#3:1090\n60#3:1093\n60#3:1096\n60#3:1099\n60#3:1102\n53#3,3:1105\n60#3:1109\n70#3:1112\n60#3:1114\n70#3:1117\n60#3:1119\n60#3:1122\n70#3:1125\n70#3:1128\n60#3:1131\n60#3:1134\n70#3:1137\n70#3:1140\n60#3:1148\n70#3:1151\n80#3:1153\n60#3:1156\n70#3:1160\n53#3,3:1164\n60#3:1173\n60#3:1176\n60#3:1179\n60#3:1182\n70#3:1185\n70#3:1188\n70#3:1191\n70#3:1194\n60#3:1197\n70#3:1200\n70#3:1204\n70#3:1207\n60#3:1210\n70#3:1213\n70#3:1217\n70#3:1220\n70#3:1223\n60#3:1226\n60#3:1230\n60#3:1233\n70#3:1236\n60#3:1239\n60#3:1243\n60#3:1246\n22#4:1076\n22#4:1079\n22#4:1082\n22#4:1085\n22#4:1088\n22#4:1091\n22#4:1094\n22#4:1097\n22#4:1100\n22#4:1103\n22#4:1110\n22#4:1115\n22#4:1120\n22#4:1123\n22#4:1126\n22#4:1129\n22#4:1132\n22#4:1135\n22#4:1138\n22#4:1141\n22#4:1149\n22#4:1157\n22#4:1161\n22#4:1174\n22#4:1177\n22#4:1180\n22#4:1183\n22#4:1186\n22#4:1189\n22#4:1192\n22#4:1195\n22#4:1198\n22#4:1201\n22#4:1205\n22#4:1208\n22#4:1211\n22#4:1214\n22#4:1218\n22#4:1221\n22#4:1224\n22#4:1227\n22#4:1231\n22#4:1234\n22#4:1237\n22#4:1240\n22#4:1244\n22#4:1247\n30#5:1104\n273#5:1154\n30#5:1163\n57#6:1130\n57#6:1133\n61#6:1136\n61#6:1139\n57#6:1147\n61#6:1150\n57#6:1158\n61#6:1162\n61#6:1202\n61#6:1203\n61#6:1215\n61#6:1216\n57#6:1228\n57#6:1229\n57#6:1241\n57#6:1242\n948#7,5:1142\n948#7,5:1167\n30#8:1152\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect\n*L\n562#1:1074\n563#1:1077\n572#1:1080\n574#1:1083\n583#1:1086\n589#1:1089\n590#1:1092\n599#1:1095\n601#1:1098\n610#1:1101\n628#1:1108\n628#1:1111\n629#1:1113\n629#1:1116\n648#1:1118\n651#1:1121\n658#1:1124\n661#1:1127\n776#1:1155\n777#1:1159\n850#1:1172\n851#1:1175\n854#1:1178\n855#1:1181\n858#1:1184\n859#1:1187\n862#1:1190\n863#1:1193\n870#1:1196\n871#1:1199\n877#1:1206\n884#1:1209\n885#1:1212\n892#1:1219\n899#1:1222\n900#1:1225\n907#1:1232\n914#1:1235\n915#1:1238\n922#1:1245\n562#1:1075\n563#1:1078\n572#1:1081\n574#1:1084\n583#1:1087\n589#1:1090\n590#1:1093\n599#1:1096\n601#1:1099\n610#1:1102\n614#1:1105,3\n628#1:1109\n628#1:1112\n629#1:1114\n629#1:1117\n648#1:1119\n651#1:1122\n658#1:1125\n661#1:1128\n696#1:1131\n700#1:1134\n708#1:1137\n712#1:1140\n764#1:1148\n764#1:1151\n764#1:1153\n776#1:1156\n777#1:1160\n778#1:1164,3\n850#1:1173\n851#1:1176\n854#1:1179\n855#1:1182\n858#1:1185\n859#1:1188\n862#1:1191\n863#1:1194\n870#1:1197\n871#1:1200\n873#1:1204\n877#1:1207\n884#1:1210\n885#1:1213\n888#1:1217\n892#1:1220\n899#1:1223\n900#1:1226\n903#1:1230\n907#1:1233\n914#1:1236\n915#1:1239\n918#1:1243\n922#1:1246\n562#1:1076\n563#1:1079\n572#1:1082\n574#1:1085\n583#1:1088\n589#1:1091\n590#1:1094\n599#1:1097\n601#1:1100\n610#1:1103\n628#1:1110\n629#1:1115\n648#1:1120\n651#1:1123\n658#1:1126\n661#1:1129\n696#1:1132\n700#1:1135\n708#1:1138\n712#1:1141\n764#1:1149\n776#1:1157\n777#1:1161\n850#1:1174\n851#1:1177\n854#1:1180\n855#1:1183\n858#1:1186\n859#1:1189\n862#1:1192\n863#1:1195\n870#1:1198\n871#1:1201\n873#1:1205\n877#1:1208\n884#1:1211\n885#1:1214\n888#1:1218\n892#1:1221\n899#1:1224\n900#1:1227\n903#1:1231\n907#1:1234\n914#1:1237\n915#1:1240\n918#1:1244\n922#1:1247\n614#1:1104\n775#1:1154\n778#1:1163\n696#1:1130\n700#1:1133\n708#1:1136\n712#1:1139\n764#1:1147\n764#1:1150\n776#1:1158\n777#1:1162\n871#1:1202\n873#1:1203\n885#1:1215\n888#1:1216\n900#1:1228\n903#1:1229\n915#1:1241\n918#1:1242\n755#1:1142,5\n834#1:1167,5\n764#1:1152\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidEdgeEffectOverscrollEffect implements OverscrollEffect {
    public static final int $stable = 0;
    private long containerSize;

    @NotNull
    private final Density density;

    @NotNull
    private final EdgeEffectWrapper edgeEffectWrapper;
    private boolean invalidationEnabled;

    @NotNull
    private final DelegatableNode node;
    private long pointerId;

    @NotNull
    private final SuspendingPointerInputModifierNode pointerInputNode;
    private long pointerPosition;

    @NotNull
    private final MutableState<C5443s> redrawSignal;
    private boolean scrollCycleInProgress;

    public /* synthetic */ AndroidEdgeEffectOverscrollEffect(Context context, Density density, long j7, PaddingValues paddingValues, AbstractC5824e abstractC5824e) {
        this(context, density, j7, paddingValues);
    }

    private final void animateToReleaseIfNeeded() {
        boolean z8;
        EdgeEffectWrapper edgeEffectWrapper = this.edgeEffectWrapper;
        EdgeEffect edgeEffect = edgeEffectWrapper.topEffect;
        boolean z9 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z8 = !edgeEffect.isFinished();
        } else {
            z8 = false;
        }
        EdgeEffect edgeEffect2 = edgeEffectWrapper.bottomEffect;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z8 = !edgeEffect2.isFinished() || z8;
        }
        EdgeEffect edgeEffect3 = edgeEffectWrapper.leftEffect;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z8 = !edgeEffect3.isFinished() || z8;
        }
        EdgeEffect edgeEffect4 = edgeEffectWrapper.rightEffect;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z8) {
                z9 = false;
            }
            z8 = z9;
        }
        if (z8) {
            invalidateOverscroll$foundation_release();
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getInvalidationEnabled$foundation_release$annotations() {
    }

    /* renamed from: pullBottom-k-4lQ0M, reason: not valid java name */
    private final float m6727pullBottomk4lQ0M(long scroll) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m6734displacementF1C5BW0$foundation_release() >> 32));
        int i = (int) (scroll & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.containerSize & 4294967295L));
        EdgeEffect orCreateBottomEffect = this.edgeEffectWrapper.getOrCreateBottomEffect();
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        return edgeEffectCompat.getDistanceCompat(orCreateBottomEffect) == 0.0f ? Float.intBitsToFloat((int) (this.containerSize & 4294967295L)) * (-edgeEffectCompat.onPullDistanceCompat(orCreateBottomEffect, -fIntBitsToFloat2, 1 - fIntBitsToFloat)) : Float.intBitsToFloat(i);
    }

    /* renamed from: pullLeft-k-4lQ0M, reason: not valid java name */
    private final float m6728pullLeftk4lQ0M(long scroll) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m6734displacementF1C5BW0$foundation_release() & 4294967295L));
        int i = (int) (scroll >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.containerSize >> 32));
        EdgeEffect orCreateLeftEffect = this.edgeEffectWrapper.getOrCreateLeftEffect();
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        return edgeEffectCompat.getDistanceCompat(orCreateLeftEffect) == 0.0f ? Float.intBitsToFloat((int) (this.containerSize >> 32)) * edgeEffectCompat.onPullDistanceCompat(orCreateLeftEffect, fIntBitsToFloat2, 1 - fIntBitsToFloat) : Float.intBitsToFloat(i);
    }

    /* renamed from: pullRight-k-4lQ0M, reason: not valid java name */
    private final float m6729pullRightk4lQ0M(long scroll) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m6734displacementF1C5BW0$foundation_release() & 4294967295L));
        int i = (int) (scroll >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.containerSize >> 32));
        EdgeEffect orCreateRightEffect = this.edgeEffectWrapper.getOrCreateRightEffect();
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        return edgeEffectCompat.getDistanceCompat(orCreateRightEffect) == 0.0f ? Float.intBitsToFloat((int) (this.containerSize >> 32)) * (-edgeEffectCompat.onPullDistanceCompat(orCreateRightEffect, -fIntBitsToFloat2, fIntBitsToFloat)) : Float.intBitsToFloat(i);
    }

    /* renamed from: pullTop-k-4lQ0M, reason: not valid java name */
    private final float m6730pullTopk4lQ0M(long scroll) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m6734displacementF1C5BW0$foundation_release() >> 32));
        int i = (int) (scroll & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.containerSize & 4294967295L));
        EdgeEffect orCreateTopEffect = this.edgeEffectWrapper.getOrCreateTopEffect();
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        return edgeEffectCompat.getDistanceCompat(orCreateTopEffect) == 0.0f ? Float.intBitsToFloat((int) (this.containerSize & 4294967295L)) * edgeEffectCompat.onPullDistanceCompat(orCreateTopEffect, fIntBitsToFloat2, fIntBitsToFloat) : Float.intBitsToFloat(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /* renamed from: releaseOppositeOverscroll-k-4lQ0M, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean m6731releaseOppositeOverscrollk4lQ0M(long r11) {
        /*
            r10 = this;
            androidx.compose.foundation.EdgeEffectWrapper r0 = r10.edgeEffectWrapper
            boolean r0 = r0.isLeftAnimating()
            r1 = 32
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L2d
            long r4 = r11 >> r1
            int r0 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r0)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 >= 0) goto L2d
            androidx.compose.foundation.EdgeEffectCompat r4 = androidx.compose.foundation.EdgeEffectCompat.INSTANCE
            androidx.compose.foundation.EdgeEffectWrapper r5 = r10.edgeEffectWrapper
            android.widget.EdgeEffect r5 = r5.getOrCreateLeftEffect()
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r4.onReleaseWithOppositeDelta(r5, r0)
            androidx.compose.foundation.EdgeEffectWrapper r0 = r10.edgeEffectWrapper
            boolean r0 = r0.isLeftAnimating()
            goto L2e
        L2d:
            r0 = r3
        L2e:
            androidx.compose.foundation.EdgeEffectWrapper r4 = r10.edgeEffectWrapper
            boolean r4 = r4.isRightAnimating()
            r5 = 1
            if (r4 == 0) goto L5f
            long r6 = r11 >> r1
            int r1 = (int) r6
            float r4 = java.lang.Float.intBitsToFloat(r1)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 <= 0) goto L5f
            androidx.compose.foundation.EdgeEffectCompat r4 = androidx.compose.foundation.EdgeEffectCompat.INSTANCE
            androidx.compose.foundation.EdgeEffectWrapper r6 = r10.edgeEffectWrapper
            android.widget.EdgeEffect r6 = r6.getOrCreateRightEffect()
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r4.onReleaseWithOppositeDelta(r6, r1)
            if (r0 != 0) goto L5e
            androidx.compose.foundation.EdgeEffectWrapper r0 = r10.edgeEffectWrapper
            boolean r0 = r0.isRightAnimating()
            if (r0 == 0) goto L5c
            goto L5e
        L5c:
            r0 = r3
            goto L5f
        L5e:
            r0 = r5
        L5f:
            androidx.compose.foundation.EdgeEffectWrapper r1 = r10.edgeEffectWrapper
            boolean r1 = r1.isTopAnimating()
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r1 == 0) goto L94
            long r8 = r11 & r6
            int r1 = (int) r8
            float r4 = java.lang.Float.intBitsToFloat(r1)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 >= 0) goto L94
            androidx.compose.foundation.EdgeEffectCompat r4 = androidx.compose.foundation.EdgeEffectCompat.INSTANCE
            androidx.compose.foundation.EdgeEffectWrapper r8 = r10.edgeEffectWrapper
            android.widget.EdgeEffect r8 = r8.getOrCreateTopEffect()
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r4.onReleaseWithOppositeDelta(r8, r1)
            if (r0 != 0) goto L93
            androidx.compose.foundation.EdgeEffectWrapper r0 = r10.edgeEffectWrapper
            boolean r0 = r0.isTopAnimating()
            if (r0 == 0) goto L91
            goto L93
        L91:
            r0 = r3
            goto L94
        L93:
            r0 = r5
        L94:
            androidx.compose.foundation.EdgeEffectWrapper r1 = r10.edgeEffectWrapper
            boolean r1 = r1.isBottomAnimating()
            if (r1 == 0) goto Lc2
            long r11 = r11 & r6
            int r11 = (int) r11
            float r12 = java.lang.Float.intBitsToFloat(r11)
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 <= 0) goto Lc2
            androidx.compose.foundation.EdgeEffectCompat r12 = androidx.compose.foundation.EdgeEffectCompat.INSTANCE
            androidx.compose.foundation.EdgeEffectWrapper r1 = r10.edgeEffectWrapper
            android.widget.EdgeEffect r1 = r1.getOrCreateBottomEffect()
            float r11 = java.lang.Float.intBitsToFloat(r11)
            r12.onReleaseWithOppositeDelta(r1, r11)
            if (r0 != 0) goto Lc1
            androidx.compose.foundation.EdgeEffectWrapper r11 = r10.edgeEffectWrapper
            boolean r11 = r11.isBottomAnimating()
            if (r11 == 0) goto Lc0
            goto Lc1
        Lc0:
            return r3
        Lc1:
            return r5
        Lc2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.m6731releaseOppositeOverscrollk4lQ0M(long):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // androidx.compose.foundation.OverscrollEffect
    @org.jetbrains.annotations.Nullable
    /* renamed from: applyToFling-BMRW4eQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo6732applyToFlingBMRW4eQ(long r15, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6473e r17, @org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super p045d6.C5443s> r18) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.mo6732applyToFlingBMRW4eQ(long, r6.e, h6.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x023e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8 A[PHI: r11
      0x00b8: PHI (r11v9 float) = (r11v8 float), (r11v12 float) binds: [B:43:0x00e9, B:32:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0132 A[PHI: r14
      0x0132: PHI (r14v9 float) = (r14v8 float), (r14v12 float) binds: [B:67:0x0162, B:56:0x012b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: applyToScroll-Rhakbz0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long mo6733applyToScrollRhakbz0(long r20, int r22, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6471c r23) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.mo6733applyToScrollRhakbz0(long, int, r6.c):long");
    }

    /* renamed from: displacement-F1C5BW0$foundation_release, reason: not valid java name */
    public final long m6734displacementF1C5BW0$foundation_release() {
        long jM10520getCenteruvyYCjk = this.pointerPosition;
        if ((9223372034707292159L & jM10520getCenteruvyYCjk) == InlineClassHelperKt.UnspecifiedPackedFloats) {
            jM10520getCenteruvyYCjk = SizeKt.m10520getCenteruvyYCjk(this.containerSize);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM10520getCenteruvyYCjk >> 32)) / Float.intBitsToFloat((int) (this.containerSize >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM10520getCenteruvyYCjk & 4294967295L)) / Float.intBitsToFloat((int) (this.containerSize & 4294967295L));
        return Offset.m10433constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }

    /* renamed from: getInvalidationEnabled$foundation_release, reason: from getter */
    public final boolean getInvalidationEnabled() {
        return this.invalidationEnabled;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    @NotNull
    public DelegatableNode getNode() {
        return this.node;
    }

    @NotNull
    public final MutableState<C5443s> getRedrawSignal$foundation_release() {
        return this.redrawSignal;
    }

    public final void invalidateOverscroll$foundation_release() {
        if (this.invalidationEnabled) {
            this.redrawSignal.setValue(C5443s.f8405a);
        }
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public boolean isInProgress() {
        EdgeEffectWrapper edgeEffectWrapper = this.edgeEffectWrapper;
        EdgeEffect edgeEffect = edgeEffectWrapper.topEffect;
        if (edgeEffect != null && EdgeEffectCompat.INSTANCE.getDistanceCompat(edgeEffect) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect2 = edgeEffectWrapper.bottomEffect;
        if (edgeEffect2 != null && EdgeEffectCompat.INSTANCE.getDistanceCompat(edgeEffect2) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect3 = edgeEffectWrapper.leftEffect;
        if (edgeEffect3 != null && EdgeEffectCompat.INSTANCE.getDistanceCompat(edgeEffect3) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect4 = edgeEffectWrapper.rightEffect;
        return (edgeEffect4 == null || EdgeEffectCompat.INSTANCE.getDistanceCompat(edgeEffect4) == 0.0f) ? false : true;
    }

    public final void setInvalidationEnabled$foundation_release(boolean z8) {
        this.invalidationEnabled = z8;
    }

    /* renamed from: updateSize-uvyYCjk$foundation_release, reason: not valid java name */
    public final void m6735updateSizeuvyYCjk$foundation_release(long size) {
        boolean zM10506equalsimpl0 = Size.m10506equalsimpl0(this.containerSize, Size.INSTANCE.m10519getZeroNHjbRc());
        boolean zM10506equalsimpl02 = Size.m10506equalsimpl0(size, this.containerSize);
        this.containerSize = size;
        if (!zM10506equalsimpl02) {
            this.edgeEffectWrapper.m6810updateSizeozmzZPI(IntSize.m13471constructorimpl((AbstractC6600a.m6241q(Float.intBitsToFloat((int) (size & 4294967295L))) & 4294967295L) | (AbstractC6600a.m6241q(Float.intBitsToFloat((int) (size >> 32))) << 32)));
        }
        if (zM10506equalsimpl0 || zM10506equalsimpl02) {
            return;
        }
        animateToReleaseIfNeeded();
    }

    private AndroidEdgeEffectOverscrollEffect(Context context, Density density, long j7, PaddingValues paddingValues) {
        this.density = density;
        this.pointerPosition = Offset.INSTANCE.m10456getUnspecifiedF1C5BW0();
        EdgeEffectWrapper edgeEffectWrapper = new EdgeEffectWrapper(context, ColorKt.m10736toArgb8_81llA(j7));
        this.edgeEffectWrapper = edgeEffectWrapper;
        this.redrawSignal = SnapshotStateKt.mutableStateOf(C5443s.f8405a, SnapshotStateKt.neverEqualPolicy());
        this.invalidationEnabled = true;
        this.containerSize = Size.INSTANCE.m10519getZeroNHjbRc();
        this.pointerId = PointerId.m11888constructorimpl(-1L);
        SuspendingPointerInputModifierNode SuspendingPointerInputModifierNode = SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new PointerInputEventHandler() { // from class: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1

            @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Ld6/s;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
            @DebugMetadata(m5302c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1", m5303f = "AndroidOverscroll.android.kt", m5304i = {0, 1}, m5305l = {783, 787}, m5306m = "invokeSuspend", m5307n = {"$this$awaitEachGesture", "$this$awaitEachGesture"}, m5308s = {"L$0", "L$0"})
            @SourceDebugExtension({"SMAP\nAndroidOverscroll.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1073:1\n230#2,3:1074\n34#2,6:1077\n233#2:1083\n117#2,2:1084\n34#2,6:1086\n119#2:1092\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1\n*L\n787#1:1074,3\n787#1:1077,6\n787#1:1083\n791#1:1084,2\n791#1:1086,6\n791#1:1092\n*E\n"})
            /* renamed from: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1 */
            public static final class C07301 extends RestrictedSuspendLambda implements InterfaceC6473e {
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ AndroidEdgeEffectOverscrollEffect this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C07301(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, InterfaceC5631c<? super C07301> interfaceC5631c) {
                    super(2, interfaceC5631c);
                    this.this$0 = androidEdgeEffectOverscrollEffect;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                    C07301 c07301 = new C07301(this.this$0, interfaceC5631c);
                    c07301.L$0 = obj;
                    return c07301;
                }

                @Override // p152r6.InterfaceC6473e
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                    return ((C07301) create(awaitPointerEventScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
                
                    if (r15 != r0) goto L18;
                 */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005c -> B:18:0x005f). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                    /*
                        r14 = this;
                        kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                        int r1 = r14.label
                        r2 = 2
                        r3 = 0
                        r4 = 1
                        if (r1 == 0) goto L27
                        if (r1 == r4) goto L1e
                        if (r1 != r2) goto L16
                        java.lang.Object r1 = r14.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r1
                        kotlin.AbstractC5774b.m5119b(r15)
                        r8 = r14
                        goto L5f
                    L16:
                        java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r15.<init>(r0)
                        throw r15
                    L1e:
                        java.lang.Object r1 = r14.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r1
                        kotlin.AbstractC5774b.m5119b(r15)
                        r8 = r14
                        goto L40
                    L27:
                        kotlin.AbstractC5774b.m5119b(r15)
                        java.lang.Object r15 = r14.L$0
                        r5 = r15
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r5
                        r14.L$0 = r5
                        r14.label = r4
                        r6 = 0
                        r7 = 0
                        r9 = 2
                        r10 = 0
                        r8 = r14
                        java.lang.Object r15 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r5, r6, r7, r8, r9, r10)
                        if (r15 != r0) goto L3f
                        goto L5e
                    L3f:
                        r1 = r5
                    L40:
                        androidx.compose.ui.input.pointer.PointerInputChange r15 = (androidx.compose.p011ui.input.pointer.PointerInputChange) r15
                        androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r5 = r8.this$0
                        long r6 = r15.getId()
                        androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.access$setPointerId$p(r5, r6)
                        androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r5 = r8.this$0
                        long r6 = r15.getPosition()
                        androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.access$setPointerPosition$p(r5, r6)
                    L54:
                        r8.L$0 = r1
                        r8.label = r2
                        java.lang.Object r15 = androidx.compose.p011ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r1, r3, r14, r4, r3)
                        if (r15 != r0) goto L5f
                    L5e:
                        return r0
                    L5f:
                        androidx.compose.ui.input.pointer.PointerEvent r15 = (androidx.compose.p011ui.input.pointer.PointerEvent) r15
                        java.util.List r15 = r15.getChanges()
                        java.util.ArrayList r5 = new java.util.ArrayList
                        int r6 = r15.size()
                        r5.<init>(r6)
                        int r6 = r15.size()
                        r7 = 0
                        r9 = r7
                    L74:
                        if (r9 >= r6) goto L89
                        java.lang.Object r10 = r15.get(r9)
                        r11 = r10
                        androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.p011ui.input.pointer.PointerInputChange) r11
                        boolean r11 = r11.getPressed()
                        if (r11 == 0) goto L86
                        r5.add(r10)
                    L86:
                        int r9 = r9 + 1
                        goto L74
                    L89:
                        androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r15 = r8.this$0
                        int r6 = r5.size()
                    L8f:
                        if (r7 >= r6) goto Laa
                        java.lang.Object r9 = r5.get(r7)
                        r10 = r9
                        androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.p011ui.input.pointer.PointerInputChange) r10
                        long r10 = r10.getId()
                        long r12 = androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.access$getPointerId$p(r15)
                        boolean r10 = androidx.compose.p011ui.input.pointer.PointerId.m11890equalsimpl0(r10, r12)
                        if (r10 == 0) goto La7
                        goto Lab
                    La7:
                        int r7 = r7 + 1
                        goto L8f
                    Laa:
                        r9 = r3
                    Lab:
                        androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.p011ui.input.pointer.PointerInputChange) r9
                        if (r9 != 0) goto Lb6
                        java.lang.Object r15 = kotlin.collections.AbstractC5805t.m5229i0(r5)
                        r9 = r15
                        androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.p011ui.input.pointer.PointerInputChange) r9
                    Lb6:
                        if (r9 == 0) goto Lca
                        androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r15 = r8.this$0
                        long r6 = r9.getId()
                        androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.access$setPointerId$p(r15, r6)
                        androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r15 = r8.this$0
                        long r6 = r9.getPosition()
                        androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.access$setPointerPosition$p(r15, r6)
                    Lca:
                        boolean r15 = r5.isEmpty()
                        if (r15 == 0) goto L54
                        androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r15 = r8.this$0
                        r0 = -1
                        long r0 = androidx.compose.p011ui.input.pointer.PointerId.m11888constructorimpl(r0)
                        androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.access$setPointerId$p(r15, r0)
                        d6.s r15 = p045d6.C5443s.f8405a
                        return r15
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1.C07301.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C07301(this.this$0, null), interfaceC5631c);
                return objAwaitEachGesture == CoroutineSingletons.COROUTINE_SUSPENDED ? objAwaitEachGesture : C5443s.f8405a;
            }
        });
        this.pointerInputNode = SuspendingPointerInputModifierNode;
        this.node = Build.VERSION.SDK_INT >= 31 ? new StretchOverscrollNode(SuspendingPointerInputModifierNode, this, edgeEffectWrapper) : new GlowOverscrollNode(SuspendingPointerInputModifierNode, this, edgeEffectWrapper, paddingValues);
    }
}
