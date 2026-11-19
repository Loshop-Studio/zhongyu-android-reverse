package androidx.compose.p014ui.text.font;

import androidx.compose.p014ui.text.font.FontWeight;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class FontMatcher {
    public static final int $stable = 0;

    public static /* synthetic */ List filterByClosestWeight$ui_text_release$default(FontMatcher fontMatcher, List list, FontWeight fontWeight, boolean z10, FontWeight fontWeight2, FontWeight fontWeight3, int i10, Object obj) {
        FontWeight fontWeight4 = null;
        if ((i10 & 4) != 0) {
            fontWeight2 = null;
        }
        if ((i10 & 8) != 0) {
            fontWeight3 = null;
        }
        int size = list.size();
        int i11 = 0;
        FontWeight fontWeight5 = null;
        while (true) {
            if (i11 >= size) {
                break;
            }
            FontWeight weight = ((Font) list.get(i11)).getWeight();
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
            i11++;
        }
        if (!z10 ? fontWeight5 != null : fontWeight4 == null) {
            fontWeight4 = fontWeight5;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        for (int i12 = 0; i12 < size2; i12++) {
            Object obj2 = list.get(i12);
            if (AbstractC9979u.m20289b(((Font) obj2).getWeight(), fontWeight4)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public final List<Font> filterByClosestWeight$ui_text_release(List<? extends Font> list, FontWeight fontWeight, boolean z10, FontWeight fontWeight2, FontWeight fontWeight3) {
        int size = list.size();
        FontWeight fontWeight4 = null;
        FontWeight fontWeight5 = null;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            FontWeight weight = list.get(i10).getWeight();
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
            i10++;
        }
        if (!z10 ? fontWeight5 != null : fontWeight4 == null) {
            fontWeight4 = fontWeight5;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        for (int i11 = 0; i11 < size2; i11++) {
            Font font = list.get(i11);
            if (AbstractC9979u.m20289b(font.getWeight(), fontWeight4)) {
                arrayList.add(font);
            }
        }
        return arrayList;
    }

    /* renamed from: matchFont-RetOiIg, reason: not valid java name */
    public final List<Font> m33071matchFontRetOiIg(FontFamily fontFamily, FontWeight fontWeight, int i10) {
        if (fontFamily instanceof FontListFontFamily) {
            return m33072matchFontRetOiIg((FontListFontFamily) fontFamily, fontWeight, i10);
        }
        throw new IllegalArgumentException("Only FontFamily instances that presents a list of Fonts can be used");
    }

    /* renamed from: matchFont-RetOiIg, reason: not valid java name */
    public final List<Font> m33072matchFontRetOiIg(FontListFontFamily fontListFontFamily, FontWeight fontWeight, int i10) {
        return m33073matchFontRetOiIg(fontListFontFamily.getFonts(), fontWeight, i10);
    }

    /* renamed from: matchFont-RetOiIg, reason: not valid java name */
    public final List<Font> m33073matchFontRetOiIg(List<? extends Font> list, FontWeight fontWeight, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        List<? extends Font> list2 = list;
        int size = list2.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Font font = list.get(i12);
            Font font2 = font;
            if (AbstractC9979u.m20289b(font2.getWeight(), fontWeight) && FontStyle.m33077equalsimpl0(font2.mo33030getStyle_LCdwA(), i10)) {
                arrayList.add(font);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list2.size();
        for (int i13 = 0; i13 < size2; i13++) {
            Font font3 = list.get(i13);
            if (FontStyle.m33077equalsimpl0(font3.mo33030getStyle_LCdwA(), i10)) {
                arrayList2.add(font3);
            }
        }
        if (!arrayList2.isEmpty()) {
            list = arrayList2;
        }
        List<? extends Font> list3 = list;
        FontWeight.Companion companion = FontWeight.Companion;
        FontWeight fontWeight2 = null;
        if (fontWeight.compareTo(companion.getW400()) < 0) {
            List<? extends Font> list4 = list3;
            int size3 = list4.size();
            FontWeight fontWeight3 = null;
            int i14 = 0;
            while (true) {
                if (i14 >= size3) {
                    break;
                }
                FontWeight weight = list3.get(i14).getWeight();
                if (weight.compareTo(fontWeight) < 0) {
                    if (fontWeight2 == null || weight.compareTo(fontWeight2) > 0) {
                        fontWeight2 = weight;
                    }
                } else {
                    if (weight.compareTo(fontWeight) <= 0) {
                        fontWeight2 = weight;
                        fontWeight3 = fontWeight2;
                        break;
                    }
                    if (fontWeight3 == null || weight.compareTo(fontWeight3) < 0) {
                        fontWeight3 = weight;
                    }
                }
                i14++;
            }
            if (fontWeight2 == null) {
                fontWeight2 = fontWeight3;
            }
            ArrayList arrayList3 = new ArrayList(list3.size());
            int size4 = list4.size();
            while (i11 < size4) {
                Font font4 = list3.get(i11);
                if (AbstractC9979u.m20289b(font4.getWeight(), fontWeight2)) {
                    arrayList3.add(font4);
                }
                i11++;
            }
            return arrayList3;
        }
        if (fontWeight.compareTo(companion.getW500()) > 0) {
            List<? extends Font> list5 = list3;
            int size5 = list5.size();
            FontWeight fontWeight4 = null;
            int i15 = 0;
            while (true) {
                if (i15 >= size5) {
                    break;
                }
                FontWeight weight2 = list3.get(i15).getWeight();
                if (weight2.compareTo(fontWeight) < 0) {
                    if (fontWeight2 == null || weight2.compareTo(fontWeight2) > 0) {
                        fontWeight2 = weight2;
                    }
                } else {
                    if (weight2.compareTo(fontWeight) <= 0) {
                        fontWeight2 = weight2;
                        fontWeight4 = fontWeight2;
                        break;
                    }
                    if (fontWeight4 == null || weight2.compareTo(fontWeight4) < 0) {
                        fontWeight4 = weight2;
                    }
                }
                i15++;
            }
            if (fontWeight4 != null) {
                fontWeight2 = fontWeight4;
            }
            ArrayList arrayList4 = new ArrayList(list3.size());
            int size6 = list5.size();
            while (i11 < size6) {
                Font font5 = list3.get(i11);
                if (AbstractC9979u.m20289b(font5.getWeight(), fontWeight2)) {
                    arrayList4.add(font5);
                }
                i11++;
            }
            return arrayList4;
        }
        FontWeight w500 = companion.getW500();
        List<? extends Font> list6 = list3;
        int size7 = list6.size();
        FontWeight fontWeight5 = null;
        FontWeight fontWeight6 = null;
        int i16 = 0;
        while (true) {
            if (i16 >= size7) {
                break;
            }
            FontWeight weight3 = list3.get(i16).getWeight();
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
            i16++;
        }
        if (fontWeight6 != null) {
            fontWeight5 = fontWeight6;
        }
        ArrayList arrayList5 = new ArrayList(list3.size());
        int size8 = list6.size();
        for (int i17 = 0; i17 < size8; i17++) {
            Font font6 = list3.get(i17);
            if (AbstractC9979u.m20289b(font6.getWeight(), fontWeight5)) {
                arrayList5.add(font6);
            }
        }
        if (!arrayList5.isEmpty()) {
            return arrayList5;
        }
        FontWeight w5002 = FontWeight.Companion.getW500();
        int size9 = list6.size();
        FontWeight fontWeight7 = null;
        int i18 = 0;
        while (true) {
            if (i18 >= size9) {
                break;
            }
            FontWeight weight4 = list3.get(i18).getWeight();
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
            i18++;
        }
        if (fontWeight7 != null) {
            fontWeight2 = fontWeight7;
        }
        ArrayList arrayList6 = new ArrayList(list3.size());
        int size10 = list6.size();
        while (i11 < size10) {
            Font font7 = list3.get(i11);
            if (AbstractC9979u.m20289b(font7.getWeight(), fontWeight2)) {
                arrayList6.add(font7);
            }
            i11++;
        }
        return arrayList6;
    }
}
