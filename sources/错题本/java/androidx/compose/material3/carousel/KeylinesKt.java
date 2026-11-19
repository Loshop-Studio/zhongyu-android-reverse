package androidx.compose.material3.carousel;

import androidx.compose.material3.AbstractC1923c;
import androidx.compose.p011ui.unit.Density;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.collections.AbstractC5802q;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a0\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0000\u001aD\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0014\u001a\u00020\u0001H\u0000\u001a(\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001H\u0000¨\u0006\u0017"}, m5110d2 = {"calculateMediumChildSize", "", "minimumMediumSize", "largeItemSize", "remainingSpace", "createLeftAlignedKeylineList", "Landroidx/compose/material3/carousel/KeylineList;", "carouselMainAxisSize", "itemSpacing", "leftAnchorSize", "rightAnchorSize", "arrangement", "Landroidx/compose/material3/carousel/Arrangement;", "multiBrowseKeylineList", "density", "Landroidx/compose/ui/unit/Density;", "preferredItemSize", "itemCount", "", "minSmallItemSize", "maxSmallItemSize", "uncontainedKeylineList", "itemSize", "material3_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nKeylines.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Keylines.kt\nandroidx/compose/material3/carousel/KeylinesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,248:1\n1#2:249\n*E\n"})
/* loaded from: classes.dex */
public final class KeylinesKt {
    private static final float calculateMediumChildSize(float f, float f7, float f8) {
        float fMax = Math.max(1.5f * f8, f);
        float f9 = f7 * 0.85f;
        return fMax > f9 ? Math.max(f9, f8 * 1.2f) : fMax;
    }

    @NotNull
    public static final KeylineList createLeftAlignedKeylineList(float f, float f7, final float f8, final float f9, @NotNull final Arrangement arrangement) {
        return KeylineListKt.m9302keylineListOfWNYm7Xg(f, f7, CarouselAlignment.INSTANCE.m9293getStartNUL3oTo(), new InterfaceC6471c() { // from class: androidx.compose.material3.carousel.KeylinesKt.createLeftAlignedKeylineList.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((KeylineListScope) obj);
                return C5443s.f8405a;
            }

            public final void invoke(@NotNull KeylineListScope keylineListScope) {
                keylineListScope.add(f8, true);
                int largeCount = arrangement.getLargeCount();
                Arrangement arrangement2 = arrangement;
                for (int i = 0; i < largeCount; i++) {
                    KeylineListScope.add$default(keylineListScope, arrangement2.getLargeSize(), false, 2, null);
                }
                int mediumCount = arrangement.getMediumCount();
                Arrangement arrangement3 = arrangement;
                for (int i8 = 0; i8 < mediumCount; i8++) {
                    KeylineListScope.add$default(keylineListScope, arrangement3.getMediumSize(), false, 2, null);
                }
                int smallCount = arrangement.getSmallCount();
                Arrangement arrangement4 = arrangement;
                for (int i9 = 0; i9 < smallCount; i9++) {
                    KeylineListScope.add$default(keylineListScope, arrangement4.getSmallSize(), false, 2, null);
                }
                keylineListScope.add(f9, true);
            }
        });
    }

    @NotNull
    public static final KeylineList multiBrowseKeylineList(@NotNull Density density, float f, float f7, float f8, int i, float f9, float f10) {
        float f11;
        if (f == 0.0f || f7 == 0.0f) {
            return KeylineListKt.emptyKeylineList();
        }
        int[] iArr = {1};
        int[] iArr2 = {1, 0};
        float fMin = Math.min(f7, f);
        float fM5273l = AbstractC5806u.m5273l(fMin / 3.0f, f9, f10);
        float f12 = (fMin + fM5273l) / 2.0f;
        if (f < 2 * f9) {
            iArr = new int[]{0};
        }
        int[] iArr3 = iArr;
        int iCeil = (int) Math.ceil(f / fMin);
        int iMax = (iCeil - Math.max(1, (int) Math.floor(AbstractC1923c.m1037a(f10, AbstractC5802q.m5197X(iArr3), f - (AbstractC5802q.m5197X(iArr2) * f12), fMin)))) + 1;
        int[] iArr4 = new int[iMax];
        for (int i8 = 0; i8 < iMax; i8++) {
            iArr4[i8] = iCeil - i8;
        }
        float fMo6903toPx0680j_4 = density.mo6903toPx0680j_4(CarouselDefaults.INSTANCE.m9294getAnchorSizeD9Ej5fM$material3_release());
        Arrangement arrangementFindLowestCostArrangement = Arrangement.INSTANCE.findLowestCostArrangement(f, f8, fM5273l, f9, f10, iArr3, f12, iArr2, fMin, iArr4);
        if (arrangementFindLowestCostArrangement == null || arrangementFindLowestCostArrangement.itemCount() <= i) {
            f11 = f;
        } else {
            int smallCount = arrangementFindLowestCostArrangement.getSmallCount();
            int mediumCount = arrangementFindLowestCostArrangement.getMediumCount();
            for (int iItemCount = arrangementFindLowestCostArrangement.itemCount() - i; iItemCount > 0; iItemCount--) {
                if (smallCount > 0) {
                    smallCount--;
                } else if (mediumCount > 1) {
                    mediumCount--;
                }
            }
            f11 = f;
            arrangementFindLowestCostArrangement = Arrangement.INSTANCE.findLowestCostArrangement(f11, f8, fM5273l, f9, f10, new int[]{smallCount}, f12, new int[]{mediumCount}, fMin, iArr4);
        }
        return arrangementFindLowestCostArrangement == null ? KeylineListKt.emptyKeylineList() : createLeftAlignedKeylineList(f11, f8, fMo6903toPx0680j_4, fMo6903toPx0680j_4, arrangementFindLowestCostArrangement);
    }

    public static /* synthetic */ KeylineList multiBrowseKeylineList$default(Density density, float f, float f7, float f8, int i, float f9, float f10, int i8, Object obj) {
        if ((i8 & 32) != 0) {
            f9 = density.mo6903toPx0680j_4(CarouselDefaults.INSTANCE.m9296getMinSmallItemSizeD9Ej5fM$material3_release());
        }
        float f11 = f9;
        if ((i8 & 64) != 0) {
            f10 = density.mo6903toPx0680j_4(CarouselDefaults.INSTANCE.m9295getMaxSmallItemSizeD9Ej5fM$material3_release());
        }
        return multiBrowseKeylineList(density, f, f7, f8, i, f11, f10);
    }

    @NotNull
    public static final KeylineList uncontainedKeylineList(@NotNull Density density, float f, float f7, float f8) {
        if (f == 0.0f || f7 == 0.0f) {
            return KeylineListKt.emptyKeylineList();
        }
        float fMin = Math.min(f7 + f8, f);
        int iMax = Math.max(1, (int) Math.floor(f / fMin));
        float f9 = f - (iMax * fMin);
        int i = f9 <= 0.0f ? 0 : 1;
        float fMo6903toPx0680j_4 = density.mo6903toPx0680j_4(CarouselDefaults.INSTANCE.m9294getAnchorSizeD9Ej5fM$material3_release());
        float fCalculateMediumChildSize = calculateMediumChildSize(fMo6903toPx0680j_4, fMin, f9);
        return createLeftAlignedKeylineList(f, f8, Math.max(Math.min(fMo6903toPx0680j_4, f7), fCalculateMediumChildSize * 0.5f), fMo6903toPx0680j_4, new Arrangement(0, 0.0f, 0, fCalculateMediumChildSize, i, fMin, iMax));
    }
}
