package androidx.compose.p006ui.text.font;

import androidx.compose.p006ui.text.font.FontWeight;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J1\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\u000fJ7\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\u0011JF\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\tH\u0080\b¢\u0006\u0002\b\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0018"}, m5175d2 = {"Landroidx/compose/ui/text/font/FontMatcher;", "", "()V", "matchFont", "", "Landroidx/compose/ui/text/font/Font;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "matchFont-RetOiIg", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;I)Ljava/util/List;", "Landroidx/compose/ui/text/font/FontListFontFamily;", "(Landroidx/compose/ui/text/font/FontListFontFamily;Landroidx/compose/ui/text/font/FontWeight;I)Ljava/util/List;", "fontList", "(Ljava/util/List;Landroidx/compose/ui/text/font/FontWeight;I)Ljava/util/List;", "filterByClosestWeight", "preferBelow", "", "minSearchRange", "maxSearchRange", "filterByClosestWeight$ui_text_release", "ui-text_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nFontMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontMatcher.kt\nandroidx/compose/ui/text/font/FontMatcher\n+ 2 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n102#1,34:189\n102#1,34:234\n108#1,28:279\n108#1,28:318\n35#2,3:166\n38#2,2:173\n40#2:176\n35#2,3:177\n38#2,2:184\n40#2:187\n35#2,3:223\n38#2,2:230\n40#2:233\n35#2,3:268\n38#2,2:275\n40#2:278\n35#2,3:307\n38#2,2:314\n40#2:317\n35#2,3:346\n38#2,2:353\n40#2:356\n35#2,3:357\n38#2,2:364\n40#2:367\n35#2,3:368\n38#2,2:375\n40#2:378\n33#3,4:169\n38#3:175\n33#3,4:180\n38#3:186\n33#3,4:226\n38#3:232\n33#3,4:271\n38#3:277\n33#3,4:310\n38#3:316\n33#3,4:349\n38#3:355\n33#3,4:360\n38#3:366\n33#3,4:371\n38#3:377\n1#4:188\n*S KotlinDebug\n*F\n+ 1 FontMatcher.kt\nandroidx/compose/ui/text/font/FontMatcher\n*L\n65#1:189,34\n71#1:234,34\n80#1:279,28\n87#1:318,28\n49#1:166,3\n49#1:173,2\n49#1:176\n57#1:177,3\n57#1:184,2\n57#1:187\n65#1:223,3\n65#1:230,2\n65#1:233\n71#1:268,3\n71#1:275,2\n71#1:278\n80#1:307,3\n80#1:314,2\n80#1:317\n87#1:346,3\n87#1:353,2\n87#1:356\n135#1:357,3\n135#1:364,2\n135#1:367\n135#1:368,3\n135#1:375,2\n135#1:378\n49#1:169,4\n49#1:175\n57#1:180,4\n57#1:186\n65#1:226,4\n65#1:232\n71#1:271,4\n71#1:277\n80#1:310,4\n80#1:316\n87#1:349,4\n87#1:355\n135#1:360,4\n135#1:366\n135#1:371,4\n135#1:377\n*E\n"})
/* loaded from: classes.dex */
public final class FontMatcher {
    public static /* synthetic */ List filterByClosestWeight$ui_text_release$default(FontMatcher fontMatcher, List list, FontWeight fontWeight, boolean z3, FontWeight fontWeight2, FontWeight fontWeight3, int i4, Object obj) {
        FontWeight fontWeight4 = null;
        if ((i4 & 4) != 0) {
            fontWeight2 = null;
        }
        if ((i4 & 8) != 0) {
            fontWeight3 = null;
        }
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        int size = list.size();
        int i5 = 0;
        FontWeight fontWeight5 = null;
        while (true) {
            if (i5 >= size) {
                break;
            }
            FontWeight weight = ((Font) list.get(i5)).getWeight();
            if ((fontWeight2 == null || weight.compareTo(fontWeight2) >= 0) && (fontWeight3 == null || weight.compareTo(fontWeight3) <= 0)) {
                if (weight.compareTo(fontWeight) >= 0) {
                    if (weight.compareTo(fontWeight) <= 0) {
                        fontWeight4 = weight;
                        fontWeight5 = fontWeight4;
                        break;
                    }
                    if (fontWeight5 == null || weight.compareTo(fontWeight5) < 0) {
                        fontWeight5 = weight;
                    }
                } else if (fontWeight4 == null || weight.compareTo(fontWeight4) > 0) {
                    fontWeight4 = weight;
                }
            }
            i5++;
        }
        if (!z3 ? fontWeight5 != null : fontWeight4 == null) {
            fontWeight4 = fontWeight5;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        for (int i6 = 0; i6 < size2; i6++) {
            Object obj2 = list.get(i6);
            if (Intrinsics.areEqual(((Font) obj2).getWeight(), fontWeight4)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public final List<Font> filterByClosestWeight$ui_text_release(List<? extends Font> list, FontWeight fontWeight, boolean z3, FontWeight fontWeight2, FontWeight fontWeight3) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        int size = list.size();
        FontWeight fontWeight4 = null;
        FontWeight fontWeight5 = null;
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                break;
            }
            FontWeight weight = list.get(i4).getWeight();
            if ((fontWeight2 == null || weight.compareTo(fontWeight2) >= 0) && (fontWeight3 == null || weight.compareTo(fontWeight3) <= 0)) {
                if (weight.compareTo(fontWeight) >= 0) {
                    if (weight.compareTo(fontWeight) <= 0) {
                        fontWeight4 = weight;
                        fontWeight5 = fontWeight4;
                        break;
                    }
                    if (fontWeight5 == null || weight.compareTo(fontWeight5) < 0) {
                        fontWeight5 = weight;
                    }
                } else if (fontWeight4 == null || weight.compareTo(fontWeight4) > 0) {
                    fontWeight4 = weight;
                }
            }
            i4++;
        }
        if (!z3 ? fontWeight5 != null : fontWeight4 == null) {
            fontWeight4 = fontWeight5;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        for (int i5 = 0; i5 < size2; i5++) {
            Font font = list.get(i5);
            if (Intrinsics.areEqual(font.getWeight(), fontWeight4)) {
                arrayList.add(font);
            }
        }
        return arrayList;
    }

    /* renamed from: matchFont-RetOiIg, reason: not valid java name */
    public final List<Font> m11156matchFontRetOiIg(FontFamily fontFamily, FontWeight fontWeight, int fontStyle) {
        Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        if (fontFamily instanceof FontListFontFamily) {
            return m11157matchFontRetOiIg((FontListFontFamily) fontFamily, fontWeight, fontStyle);
        }
        throw new IllegalArgumentException("Only FontFamily instances that presents a list of Fonts can be used");
    }

    /* renamed from: matchFont-RetOiIg, reason: not valid java name */
    public final List<Font> m11157matchFontRetOiIg(FontListFontFamily fontFamily, FontWeight fontWeight, int fontStyle) {
        Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        return m11158matchFontRetOiIg(fontFamily.getFonts(), fontWeight, fontStyle);
    }

    /* renamed from: matchFont-RetOiIg, reason: not valid java name */
    public final List<Font> m11158matchFontRetOiIg(List<? extends Font> fontList, FontWeight fontWeight, int fontStyle) {
        Intrinsics.checkNotNullParameter(fontList, "fontList");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        ArrayList arrayList = new ArrayList(fontList.size());
        int size = fontList.size();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                break;
            }
            Font font = fontList.get(i5);
            Font font2 = font;
            if (Intrinsics.areEqual(font2.getWeight(), fontWeight) && FontStyle.m11162equalsimpl0(font2.getStyle(), fontStyle)) {
                arrayList.add(font);
            }
            i5++;
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(fontList.size());
        int size2 = fontList.size();
        for (int i6 = 0; i6 < size2; i6++) {
            Font font3 = fontList.get(i6);
            if (FontStyle.m11162equalsimpl0(font3.getStyle(), fontStyle)) {
                arrayList2.add(font3);
            }
        }
        if (!arrayList2.isEmpty()) {
            fontList = arrayList2;
        }
        FontWeight.Companion companion = FontWeight.INSTANCE;
        FontWeight fontWeight2 = null;
        if (fontWeight.compareTo(companion.getW400()) < 0) {
            int size3 = fontList.size();
            FontWeight fontWeight3 = null;
            int i7 = 0;
            while (true) {
                if (i7 >= size3) {
                    break;
                }
                FontWeight weight = fontList.get(i7).getWeight();
                if (weight.compareTo(fontWeight) < 0) {
                    if (fontWeight2 == null || weight.compareTo(fontWeight2) > 0) {
                        fontWeight2 = weight;
                    }
                } else {
                    if (weight.compareTo(fontWeight) <= 0) {
                        fontWeight3 = weight;
                        fontWeight2 = fontWeight3;
                        break;
                    }
                    if (fontWeight3 == null || weight.compareTo(fontWeight3) < 0) {
                        fontWeight3 = weight;
                    }
                }
                i7++;
            }
            if (fontWeight2 != null) {
                fontWeight3 = fontWeight2;
            }
            ArrayList arrayList3 = new ArrayList(fontList.size());
            int size4 = fontList.size();
            while (i4 < size4) {
                Font font4 = fontList.get(i4);
                if (Intrinsics.areEqual(font4.getWeight(), fontWeight3)) {
                    arrayList3.add(font4);
                }
                i4++;
            }
            return arrayList3;
        }
        if (fontWeight.compareTo(companion.getW500()) > 0) {
            int size5 = fontList.size();
            FontWeight fontWeight4 = null;
            int i8 = 0;
            while (true) {
                if (i8 >= size5) {
                    break;
                }
                FontWeight weight2 = fontList.get(i8).getWeight();
                if (weight2.compareTo(fontWeight) < 0) {
                    if (fontWeight2 == null || weight2.compareTo(fontWeight2) > 0) {
                        fontWeight2 = weight2;
                    }
                } else {
                    if (weight2.compareTo(fontWeight) <= 0) {
                        fontWeight4 = weight2;
                        fontWeight2 = fontWeight4;
                        break;
                    }
                    if (fontWeight4 == null || weight2.compareTo(fontWeight4) < 0) {
                        fontWeight4 = weight2;
                    }
                }
                i8++;
            }
            if (fontWeight4 == null) {
                fontWeight4 = fontWeight2;
            }
            ArrayList arrayList4 = new ArrayList(fontList.size());
            int size6 = fontList.size();
            while (i4 < size6) {
                Font font5 = fontList.get(i4);
                if (Intrinsics.areEqual(font5.getWeight(), fontWeight4)) {
                    arrayList4.add(font5);
                }
                i4++;
            }
            return arrayList4;
        }
        FontWeight w500 = companion.getW500();
        int size7 = fontList.size();
        FontWeight fontWeight5 = null;
        FontWeight fontWeight6 = null;
        int i9 = 0;
        while (true) {
            if (i9 >= size7) {
                break;
            }
            FontWeight weight3 = fontList.get(i9).getWeight();
            if (w500 == null || weight3.compareTo(w500) <= 0) {
                if (weight3.compareTo(fontWeight) < 0) {
                    if (fontWeight5 == null || weight3.compareTo(fontWeight5) > 0) {
                        fontWeight5 = weight3;
                    }
                } else {
                    if (weight3.compareTo(fontWeight) <= 0) {
                        fontWeight5 = weight3;
                        fontWeight6 = fontWeight5;
                        break;
                    }
                    if (fontWeight6 == null || weight3.compareTo(fontWeight6) < 0) {
                        fontWeight6 = weight3;
                    }
                }
            }
            i9++;
        }
        if (fontWeight6 != null) {
            fontWeight5 = fontWeight6;
        }
        ArrayList arrayList5 = new ArrayList(fontList.size());
        int size8 = fontList.size();
        for (int i10 = 0; i10 < size8; i10++) {
            Font font6 = fontList.get(i10);
            if (Intrinsics.areEqual(font6.getWeight(), fontWeight5)) {
                arrayList5.add(font6);
            }
        }
        if (!arrayList5.isEmpty()) {
            return arrayList5;
        }
        FontWeight w5002 = FontWeight.INSTANCE.getW500();
        int size9 = fontList.size();
        FontWeight fontWeight7 = null;
        int i11 = 0;
        while (true) {
            if (i11 >= size9) {
                break;
            }
            FontWeight weight4 = fontList.get(i11).getWeight();
            if (w5002 == null || weight4.compareTo(w5002) >= 0) {
                if (weight4.compareTo(fontWeight) < 0) {
                    if (fontWeight2 == null || weight4.compareTo(fontWeight2) > 0) {
                        fontWeight2 = weight4;
                    }
                } else {
                    if (weight4.compareTo(fontWeight) <= 0) {
                        fontWeight2 = weight4;
                        fontWeight7 = fontWeight2;
                        break;
                    }
                    if (fontWeight7 == null || weight4.compareTo(fontWeight7) < 0) {
                        fontWeight7 = weight4;
                    }
                }
            }
            i11++;
        }
        if (fontWeight7 != null) {
            fontWeight2 = fontWeight7;
        }
        ArrayList arrayList6 = new ArrayList(fontList.size());
        int size10 = fontList.size();
        while (i4 < size10) {
            Font font7 = fontList.get(i4);
            if (Intrinsics.areEqual(font7.getWeight(), fontWeight2)) {
                arrayList6.add(font7);
            }
            i4++;
        }
        return arrayList6;
    }
}
