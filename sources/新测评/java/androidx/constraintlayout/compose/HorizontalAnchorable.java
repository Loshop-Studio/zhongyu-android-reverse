package androidx.constraintlayout.compose;

import androidx.compose.p013ui.unit.C3127Dp;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ.\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000¢\u0006\u0004\b\t\u0010\fø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0003"}, m13558d2 = {"Landroidx/constraintlayout/compose/HorizontalAnchorable;", "", "linkTo", "", "anchor", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$BaselineAnchor;", "margin", "Landroidx/compose/ui/unit/Dp;", "goneMargin", "linkTo-VpY3zN4", "(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$BaselineAnchor;FF)V", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;FF)V", "constraintlayout-compose_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nConstraintScopeCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintScopeCommon.kt\nandroidx/constraintlayout/compose/HorizontalAnchorable\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,167:1\n149#2:168\n149#2:169\n149#2:170\n149#2:171\n*S KotlinDebug\n*F\n+ 1 ConstraintScopeCommon.kt\nandroidx/constraintlayout/compose/HorizontalAnchorable\n*L\n51#1:168\n52#1:169\n58#1:170\n59#1:171\n*E\n"})
/* loaded from: classes2.dex */
public interface HorizontalAnchorable {

    @Metadata(m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
    public static final class DefaultImpls {
    }

    /* renamed from: linkTo-VpY3zN4$default, reason: not valid java name */
    static /* synthetic */ void m23937linkToVpY3zN4$default(HorizontalAnchorable horizontalAnchorable, ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor, float f10, float f11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: linkTo-VpY3zN4");
        }
        if ((i10 & 2) != 0) {
            f10 = C3127Dp.m23561constructorimpl(0);
        }
        if ((i10 & 4) != 0) {
            f11 = C3127Dp.m23561constructorimpl(0);
        }
        horizontalAnchorable.mo23820linkToVpY3zN4(horizontalAnchor, f10, f11);
    }

    /* renamed from: linkTo-VpY3zN4 */
    void mo23819linkToVpY3zN4(ConstraintLayoutBaseScope.BaselineAnchor anchor, float margin, float goneMargin);

    /* renamed from: linkTo-VpY3zN4 */
    void mo23820linkToVpY3zN4(ConstraintLayoutBaseScope.HorizontalAnchor anchor, float margin, float goneMargin);

    /* renamed from: linkTo-VpY3zN4$default, reason: not valid java name */
    static /* synthetic */ void m23936linkToVpY3zN4$default(HorizontalAnchorable horizontalAnchorable, ConstraintLayoutBaseScope.BaselineAnchor baselineAnchor, float f10, float f11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: linkTo-VpY3zN4");
        }
        if ((i10 & 2) != 0) {
            f10 = C3127Dp.m23561constructorimpl(0);
        }
        if ((i10 & 4) != 0) {
            f11 = C3127Dp.m23561constructorimpl(0);
        }
        horizontalAnchorable.mo23819linkToVpY3zN4(baselineAnchor, f10, f11);
    }
}
