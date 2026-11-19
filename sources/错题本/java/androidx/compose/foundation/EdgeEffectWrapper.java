package androidx.compose.foundation;

import android.content.Context;
import android.widget.EdgeEffect;
import androidx.annotation.ColorInt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p011ui.unit.IntSize;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\f\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0086\b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0012J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0012J\r\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0012J\r\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0012J\r\u0010\u0018\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0012J\r\u0010\u0019\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u0012J\r\u0010\u001a\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u0012J\r\u0010\u001b\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u0012J\r\u0010\u001c\u001a\u00020\u0010¢\u0006\u0004\b\u001c\u0010\u0012J\r\u0010\u001d\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u0012J\r\u0010\u001e\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\t¢\u0006\u0004\b \u0010\u001fJ\r\u0010!\u001a\u00020\t¢\u0006\u0004\b!\u0010\u001fJ\r\u0010\"\u001a\u00020\t¢\u0006\u0004\b\"\u0010\u001fJ\r\u0010#\u001a\u00020\t¢\u0006\u0004\b#\u0010\u001fJ\r\u0010$\u001a\u00020\t¢\u0006\u0004\b$\u0010\u001fJ\r\u0010%\u001a\u00020\t¢\u0006\u0004\b%\u0010\u001fJ\r\u0010&\u001a\u00020\t¢\u0006\u0004\b&\u0010\u001fJ\u0018\u0010+\u001a\u00020\n2\u0006\u0010(\u001a\u00020'ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u0017\u0010.\u001a\u00020\t2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00101R\u001c\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b(\u00102R\u0018\u00103\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00105\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00104R\u0018\u00106\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00104R\u0018\u00107\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00104R\u0018\u00108\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00104R\u0018\u00109\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00104R\u0018\u0010:\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00104R\u0018\u0010;\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00104R\u001a\u0010<\u001a\u00020\u0010*\u0004\u0018\u00010\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u001a\u0010>\u001a\u00020\u0010*\u0004\u0018\u00010\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010=\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006?"}, m5110d2 = {"Landroidx/compose/foundation/EdgeEffectWrapper;", "", "Landroid/content/Context;", "context", "", "glowColor", "<init>", "(Landroid/content/Context;I)V", "Lkotlin/Function1;", "Landroid/widget/EdgeEffect;", "Ld6/s;", "action", "forEachEffect", "(Lr6/c;)V", "finishAll", "()V", "", "isTopStretched", "()Z", "isBottomStretched", "isLeftStretched", "isRightStretched", "isTopNegationStretched", "isBottomNegationStretched", "isLeftNegationStretched", "isRightNegationStretched", "isTopAnimating", "isBottomAnimating", "isLeftAnimating", "isRightAnimating", "getOrCreateTopEffect", "()Landroid/widget/EdgeEffect;", "getOrCreateBottomEffect", "getOrCreateLeftEffect", "getOrCreateRightEffect", "getOrCreateTopEffectNegation", "getOrCreateBottomEffectNegation", "getOrCreateLeftEffectNegation", "getOrCreateRightEffectNegation", "Landroidx/compose/ui/unit/IntSize;", "size", "updateSize-ozmzZPI", "(J)V", "updateSize", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "createEdgeEffect", "(Landroidx/compose/foundation/gestures/Orientation;)Landroid/widget/EdgeEffect;", "Landroid/content/Context;", "I", "J", "topEffect", "Landroid/widget/EdgeEffect;", "bottomEffect", "leftEffect", "rightEffect", "topEffectNegation", "bottomEffectNegation", "leftEffectNegation", "rightEffectNegation", "isStretched", "(Landroid/widget/EdgeEffect;)Z", "isAnimating", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAndroidOverscroll.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/EdgeEffectWrapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1073:1\n1#2:1074\n54#3:1075\n59#3:1077\n59#3:1079\n54#3:1081\n54#3:1083\n59#3:1085\n54#3:1087\n59#3:1089\n59#3:1091\n54#3:1093\n59#3:1095\n54#3:1097\n54#3:1099\n59#3:1101\n54#3:1103\n59#3:1105\n59#3:1107\n54#3:1109\n59#3:1111\n54#3:1113\n85#4:1076\n90#4:1078\n90#4:1080\n85#4:1082\n85#4:1084\n90#4:1086\n85#4:1088\n90#4:1090\n90#4:1092\n85#4:1094\n90#4:1096\n85#4:1098\n85#4:1100\n90#4:1102\n85#4:1104\n90#4:1106\n90#4:1108\n85#4:1110\n90#4:1112\n85#4:1114\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/EdgeEffectWrapper\n*L\n1034#1:1075\n1034#1:1077\n1036#1:1079\n1036#1:1081\n1043#1:1083\n1043#1:1085\n1044#1:1087\n1044#1:1089\n1045#1:1091\n1045#1:1093\n1046#1:1095\n1046#1:1097\n1048#1:1099\n1048#1:1101\n1049#1:1103\n1049#1:1105\n1050#1:1107\n1050#1:1109\n1051#1:1111\n1051#1:1113\n1034#1:1076\n1034#1:1078\n1036#1:1080\n1036#1:1082\n1043#1:1084\n1043#1:1086\n1044#1:1088\n1044#1:1090\n1045#1:1092\n1045#1:1094\n1046#1:1096\n1046#1:1098\n1048#1:1100\n1048#1:1102\n1049#1:1104\n1049#1:1106\n1050#1:1108\n1050#1:1110\n1051#1:1112\n1051#1:1114\n*E\n"})
/* loaded from: classes.dex */
final class EdgeEffectWrapper {

    @Nullable
    private EdgeEffect bottomEffect;

    @Nullable
    private EdgeEffect bottomEffectNegation;

    @NotNull
    private final Context context;
    private final int glowColor;

    @Nullable
    private EdgeEffect leftEffect;

    @Nullable
    private EdgeEffect leftEffectNegation;

    @Nullable
    private EdgeEffect rightEffect;

    @Nullable
    private EdgeEffect rightEffectNegation;
    private long size = IntSize.INSTANCE.m13481getZeroYbymL2g();

    @Nullable
    private EdgeEffect topEffect;

    @Nullable
    private EdgeEffect topEffectNegation;

    public EdgeEffectWrapper(@NotNull Context context, @ColorInt int i) {
        this.context = context;
        this.glowColor = i;
    }

    private final EdgeEffect createEdgeEffect(Orientation orientation) {
        EdgeEffect edgeEffectCreate = EdgeEffectCompat.INSTANCE.create(this.context);
        edgeEffectCreate.setColor(this.glowColor);
        if (!IntSize.m13474equalsimpl0(this.size, IntSize.INSTANCE.m13481getZeroYbymL2g())) {
            if (orientation == Orientation.Vertical) {
                long j7 = this.size;
                edgeEffectCreate.setSize((int) (j7 >> 32), (int) (j7 & 4294967295L));
                return edgeEffectCreate;
            }
            long j8 = this.size;
            edgeEffectCreate.setSize((int) (j8 & 4294967295L), (int) (j8 >> 32));
        }
        return edgeEffectCreate;
    }

    private final boolean isAnimating(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    private final boolean isStretched(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !(EdgeEffectCompat.INSTANCE.getDistanceCompat(edgeEffect) == 0.0f);
    }

    public final void finishAll() {
        EdgeEffect edgeEffect = this.topEffect;
        if (edgeEffect != null) {
            edgeEffect.finish();
        }
        EdgeEffect edgeEffect2 = this.bottomEffect;
        if (edgeEffect2 != null) {
            edgeEffect2.finish();
        }
        EdgeEffect edgeEffect3 = this.leftEffect;
        if (edgeEffect3 != null) {
            edgeEffect3.finish();
        }
        EdgeEffect edgeEffect4 = this.rightEffect;
        if (edgeEffect4 != null) {
            edgeEffect4.finish();
        }
        EdgeEffect edgeEffect5 = this.topEffectNegation;
        if (edgeEffect5 != null) {
            edgeEffect5.finish();
        }
        EdgeEffect edgeEffect6 = this.bottomEffectNegation;
        if (edgeEffect6 != null) {
            edgeEffect6.finish();
        }
        EdgeEffect edgeEffect7 = this.leftEffectNegation;
        if (edgeEffect7 != null) {
            edgeEffect7.finish();
        }
        EdgeEffect edgeEffect8 = this.rightEffectNegation;
        if (edgeEffect8 != null) {
            edgeEffect8.finish();
        }
    }

    public final void forEachEffect(@NotNull InterfaceC6471c action) {
        EdgeEffect edgeEffect = this.topEffect;
        if (edgeEffect != null) {
            action.invoke(edgeEffect);
        }
        EdgeEffect edgeEffect2 = this.bottomEffect;
        if (edgeEffect2 != null) {
            action.invoke(edgeEffect2);
        }
        EdgeEffect edgeEffect3 = this.leftEffect;
        if (edgeEffect3 != null) {
            action.invoke(edgeEffect3);
        }
        EdgeEffect edgeEffect4 = this.rightEffect;
        if (edgeEffect4 != null) {
            action.invoke(edgeEffect4);
        }
    }

    @NotNull
    public final EdgeEffect getOrCreateBottomEffect() {
        EdgeEffect edgeEffect = this.bottomEffect;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectCreateEdgeEffect = createEdgeEffect(Orientation.Vertical);
        this.bottomEffect = edgeEffectCreateEdgeEffect;
        return edgeEffectCreateEdgeEffect;
    }

    @NotNull
    public final EdgeEffect getOrCreateBottomEffectNegation() {
        EdgeEffect edgeEffect = this.bottomEffectNegation;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectCreateEdgeEffect = createEdgeEffect(Orientation.Vertical);
        this.bottomEffectNegation = edgeEffectCreateEdgeEffect;
        return edgeEffectCreateEdgeEffect;
    }

    @NotNull
    public final EdgeEffect getOrCreateLeftEffect() {
        EdgeEffect edgeEffect = this.leftEffect;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectCreateEdgeEffect = createEdgeEffect(Orientation.Horizontal);
        this.leftEffect = edgeEffectCreateEdgeEffect;
        return edgeEffectCreateEdgeEffect;
    }

    @NotNull
    public final EdgeEffect getOrCreateLeftEffectNegation() {
        EdgeEffect edgeEffect = this.leftEffectNegation;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectCreateEdgeEffect = createEdgeEffect(Orientation.Horizontal);
        this.leftEffectNegation = edgeEffectCreateEdgeEffect;
        return edgeEffectCreateEdgeEffect;
    }

    @NotNull
    public final EdgeEffect getOrCreateRightEffect() {
        EdgeEffect edgeEffect = this.rightEffect;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectCreateEdgeEffect = createEdgeEffect(Orientation.Horizontal);
        this.rightEffect = edgeEffectCreateEdgeEffect;
        return edgeEffectCreateEdgeEffect;
    }

    @NotNull
    public final EdgeEffect getOrCreateRightEffectNegation() {
        EdgeEffect edgeEffect = this.rightEffectNegation;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectCreateEdgeEffect = createEdgeEffect(Orientation.Horizontal);
        this.rightEffectNegation = edgeEffectCreateEdgeEffect;
        return edgeEffectCreateEdgeEffect;
    }

    @NotNull
    public final EdgeEffect getOrCreateTopEffect() {
        EdgeEffect edgeEffect = this.topEffect;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectCreateEdgeEffect = createEdgeEffect(Orientation.Vertical);
        this.topEffect = edgeEffectCreateEdgeEffect;
        return edgeEffectCreateEdgeEffect;
    }

    @NotNull
    public final EdgeEffect getOrCreateTopEffectNegation() {
        EdgeEffect edgeEffect = this.topEffectNegation;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectCreateEdgeEffect = createEdgeEffect(Orientation.Vertical);
        this.topEffectNegation = edgeEffectCreateEdgeEffect;
        return edgeEffectCreateEdgeEffect;
    }

    public final boolean isBottomAnimating() {
        return isAnimating(this.bottomEffect);
    }

    public final boolean isBottomNegationStretched() {
        return isStretched(this.bottomEffectNegation);
    }

    public final boolean isBottomStretched() {
        return isStretched(this.bottomEffect);
    }

    public final boolean isLeftAnimating() {
        return isAnimating(this.leftEffect);
    }

    public final boolean isLeftNegationStretched() {
        return isStretched(this.leftEffectNegation);
    }

    public final boolean isLeftStretched() {
        return isStretched(this.leftEffect);
    }

    public final boolean isRightAnimating() {
        return isAnimating(this.rightEffect);
    }

    public final boolean isRightNegationStretched() {
        return isStretched(this.rightEffectNegation);
    }

    public final boolean isRightStretched() {
        return isStretched(this.rightEffect);
    }

    public final boolean isTopAnimating() {
        return isAnimating(this.topEffect);
    }

    public final boolean isTopNegationStretched() {
        return isStretched(this.topEffectNegation);
    }

    public final boolean isTopStretched() {
        return isStretched(this.topEffect);
    }

    /* renamed from: updateSize-ozmzZPI, reason: not valid java name */
    public final void m6810updateSizeozmzZPI(long size) {
        this.size = size;
        EdgeEffect edgeEffect = this.topEffect;
        if (edgeEffect != null) {
            edgeEffect.setSize((int) (size >> 32), (int) (size & 4294967295L));
        }
        EdgeEffect edgeEffect2 = this.bottomEffect;
        if (edgeEffect2 != null) {
            edgeEffect2.setSize((int) (size >> 32), (int) (size & 4294967295L));
        }
        EdgeEffect edgeEffect3 = this.leftEffect;
        if (edgeEffect3 != null) {
            edgeEffect3.setSize((int) (size & 4294967295L), (int) (size >> 32));
        }
        EdgeEffect edgeEffect4 = this.rightEffect;
        if (edgeEffect4 != null) {
            edgeEffect4.setSize((int) (size & 4294967295L), (int) (size >> 32));
        }
        EdgeEffect edgeEffect5 = this.topEffectNegation;
        if (edgeEffect5 != null) {
            edgeEffect5.setSize((int) (size >> 32), (int) (size & 4294967295L));
        }
        EdgeEffect edgeEffect6 = this.bottomEffectNegation;
        if (edgeEffect6 != null) {
            edgeEffect6.setSize((int) (size >> 32), (int) (size & 4294967295L));
        }
        EdgeEffect edgeEffect7 = this.leftEffectNegation;
        if (edgeEffect7 != null) {
            edgeEffect7.setSize((int) (size & 4294967295L), (int) (size >> 32));
        }
        EdgeEffect edgeEffect8 = this.rightEffectNegation;
        if (edgeEffect8 != null) {
            edgeEffect8.setSize((int) (4294967295L & size), (int) (size >> 32));
        }
    }
}
