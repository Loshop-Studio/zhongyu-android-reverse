package androidx.compose.foundation.layout;

import androidx.collection.AbstractC0584a;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.InspectorInfo;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a*\u0010\b\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0005\u001a*\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f¢\u0006\u0004\b\u0006\u0010\r\u001a*\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f¢\u0006\u0004\b\b\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, m5110d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Dp;", "x", "y", "offset-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", TypedValues.CycleType.S_WAVE_OFFSET, "absoluteOffset-VpY3zN4", "absoluteOffset", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/IntOffset;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Lr6/c;)Landroidx/compose/ui/Modifier;", "foundation-layout_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Offset.kt\nandroidx/compose/foundation/layout/OffsetKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,273:1\n113#2:274\n113#2:275\n*S KotlinDebug\n*F\n+ 1 Offset.kt\nandroidx/compose/foundation/layout/OffsetKt\n*L\n50#1:274\n78#1:275\n*E\n"})
/* loaded from: classes.dex */
public final class OffsetKt {
    @NotNull
    public static final Modifier absoluteOffset(@NotNull Modifier modifier, @NotNull final InterfaceC6471c interfaceC6471c) {
        return modifier.then(new OffsetPxElement(interfaceC6471c, false, new InterfaceC6471c() { // from class: androidx.compose.foundation.layout.OffsetKt.absoluteOffset.2
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C5443s.f8405a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("absoluteOffset");
                inspectorInfo.getProperties().set(TypedValues.CycleType.S_WAVE_OFFSET, interfaceC6471c);
            }
        }));
    }

    @Stable
    @NotNull
    /* renamed from: absoluteOffset-VpY3zN4, reason: not valid java name */
    public static final Modifier m7219absoluteOffsetVpY3zN4(@NotNull Modifier modifier, final float f, final float f7) {
        return modifier.then(new OffsetElement(f, f7, false, new InterfaceC6471c() { // from class: androidx.compose.foundation.layout.OffsetKt.absoluteOffset.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C5443s.f8405a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("absoluteOffset");
                AbstractC0584a.m909j(f, inspectorInfo.getProperties(), "x", inspectorInfo).set("y", C2331Dp.m13303boximpl(f7));
            }
        }, null));
    }

    /* renamed from: absoluteOffset-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m7220absoluteOffsetVpY3zN4$default(Modifier modifier, float f, float f7, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C2331Dp.m13305constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f7 = C2331Dp.m13305constructorimpl(0);
        }
        return m7219absoluteOffsetVpY3zN4(modifier, f, f7);
    }

    @NotNull
    public static final Modifier offset(@NotNull Modifier modifier, @NotNull final InterfaceC6471c interfaceC6471c) {
        return modifier.then(new OffsetPxElement(interfaceC6471c, true, new InterfaceC6471c() { // from class: androidx.compose.foundation.layout.OffsetKt.offset.2
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C5443s.f8405a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName(TypedValues.CycleType.S_WAVE_OFFSET);
                inspectorInfo.getProperties().set(TypedValues.CycleType.S_WAVE_OFFSET, interfaceC6471c);
            }
        }));
    }

    @Stable
    @NotNull
    /* renamed from: offset-VpY3zN4, reason: not valid java name */
    public static final Modifier m7221offsetVpY3zN4(@NotNull Modifier modifier, final float f, final float f7) {
        return modifier.then(new OffsetElement(f, f7, true, new InterfaceC6471c() { // from class: androidx.compose.foundation.layout.OffsetKt.offset.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C5443s.f8405a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName(TypedValues.CycleType.S_WAVE_OFFSET);
                AbstractC0584a.m909j(f, inspectorInfo.getProperties(), "x", inspectorInfo).set("y", C2331Dp.m13303boximpl(f7));
            }
        }, null));
    }

    /* renamed from: offset-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m7222offsetVpY3zN4$default(Modifier modifier, float f, float f7, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C2331Dp.m13305constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f7 = C2331Dp.m13305constructorimpl(0);
        }
        return m7221offsetVpY3zN4(modifier, f, f7);
    }
}
