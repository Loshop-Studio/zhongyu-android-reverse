package com.zykj.blackboard.core.action.newSelectAtion;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionType;
import com.zykj.blackboard.core.action.newSelectAtion.SelectColor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000N\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\t\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\t\u0010\n\u001aU\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\u0004\u0018\u00010\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\u000fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a3\u0010\u0014\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0013\u001a\u00020\u00042\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\u000f¢\u0006\u0004\b\u0014\u0010\u0015\"\u001d\u0010\u001a\u001a\u0004\u0018\u00010\u0017*\b\u0012\u0004\u0012\u00020\u00160\u00008F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\"\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u001b*\b\u0012\u0004\u0012\u00020\u00160\u00008F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\"\u001d\u0010\"\u001a\u0004\u0018\u00010\u001f*\b\u0012\u0004\u0012\u00020\u00160\u00008F¢\u0006\u0006\u001a\u0004\b \u0010!\"\u001d\u0010\f\u001a\u0004\u0018\u00010#*\b\u0012\u0004\u0012\u00020\u00010\u00008F¢\u0006\u0006\u001a\u0004\b$\u0010%\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006&"}, m5110d2 = {"", "Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;", "defaultSelectColorList", "()Ljava/util/List;", "", "configColorList", "createSelectColorList", "(Ljava/util/List;)Ljava/util/List;", "Ld6/s;", "selectCustom", "(Ljava/util/List;)V", "colorList", "customColor", "", "isOpen", "Lkotlin/Function1;", "isCustomExist", "toSelectColorList", "(Ljava/lang/Integer;Ljava/util/List;IZLr6/c;)Ljava/util/List;", TypedValues.Custom.S_COLOR, "handleWithColor", "(Ljava/util/List;ILr6/c;)V", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$WriteEdit;", "getWriteEditType", "(Ljava/util/List;)Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$WriteEdit;", "writeEditType", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$TextEdit;", "getTextEditType", "(Ljava/util/List;)Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$TextEdit;", "textEditType", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$GeometryStroke;", "getGeometryStrokeType", "(Ljava/util/List;)Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$GeometryStroke;", "geometryStrokeType", "Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Custom;", "getCustomColor", "(Ljava/util/List;)Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Custom;", "blackboard_release"}, m5111k = 2, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class NewSelectFunctionTypeKt {
    @NotNull
    public static final List<SelectColor> createSelectColorList(@Nullable List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return defaultSelectColorList();
        }
        ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new SelectColor.Preset(((Number) it.next()).intValue(), false, 2, null));
        }
        return arrayList;
    }

    @NotNull
    public static final List<SelectColor> defaultSelectColorList() {
        return AbstractC5806u.m5287z(new SelectColor.Custom(0, false, false, 7, null), new SelectColor.Black(false, 1, null), new SelectColor.White(false, 1, null), new SelectColor.Red(false, 1, null));
    }

    @Nullable
    public static final SelectColor.Custom getCustomColor(@NotNull List<? extends SelectColor> list) {
        Object next;
        AbstractC5830k.m5330g(list, "<this>");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((SelectColor) next) instanceof SelectColor.Custom) {
                break;
            }
        }
        if (next instanceof SelectColor.Custom) {
            return (SelectColor.Custom) next;
        }
        return null;
    }

    @Nullable
    public static final NewSelectFunctionType.GeometryStroke getGeometryStrokeType(@NotNull List<? extends NewSelectFunctionType> list) {
        Object next;
        AbstractC5830k.m5330g(list, "<this>");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((NewSelectFunctionType) next) instanceof NewSelectFunctionType.GeometryStroke) {
                break;
            }
        }
        if (next instanceof NewSelectFunctionType.GeometryStroke) {
            return (NewSelectFunctionType.GeometryStroke) next;
        }
        return null;
    }

    @Nullable
    public static final NewSelectFunctionType.TextEdit getTextEditType(@NotNull List<? extends NewSelectFunctionType> list) {
        Object next;
        AbstractC5830k.m5330g(list, "<this>");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((NewSelectFunctionType) next) instanceof NewSelectFunctionType.TextEdit) {
                break;
            }
        }
        if (next instanceof NewSelectFunctionType.TextEdit) {
            return (NewSelectFunctionType.TextEdit) next;
        }
        return null;
    }

    @Nullable
    public static final NewSelectFunctionType.WriteEdit getWriteEditType(@NotNull List<? extends NewSelectFunctionType> list) {
        Object next;
        AbstractC5830k.m5330g(list, "<this>");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((NewSelectFunctionType) next) instanceof NewSelectFunctionType.WriteEdit) {
                break;
            }
        }
        if (next instanceof NewSelectFunctionType.WriteEdit) {
            return (NewSelectFunctionType.WriteEdit) next;
        }
        return null;
    }

    public static final void handleWithColor(@NotNull List<? extends SelectColor> list, int i, @NotNull InterfaceC6471c isCustomExist) {
        AbstractC5830k.m5330g(list, "<this>");
        AbstractC5830k.m5330g(isCustomExist, "isCustomExist");
        int size = list.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                i8 = -1;
                break;
            } else if (i8 != 0 && list.get(i8).getValue() == i) {
                break;
            } else {
                i8++;
            }
        }
        if (i8 == -1 && ((Boolean) isCustomExist.invoke(Integer.valueOf(i))).booleanValue()) {
            list.get(0).setValue(i);
            i8 = 0;
        }
        int i9 = 0;
        for (Object obj : list) {
            int i10 = i9 + 1;
            if (i9 < 0) {
                AbstractC5806u.m5258L();
                throw null;
            }
            ((SelectColor) obj).setSelected(i9 == i8);
            i9 = i10;
        }
    }

    public static final void selectCustom(@NotNull List<? extends SelectColor> list) {
        AbstractC5830k.m5330g(list, "<this>");
        for (SelectColor selectColor : list) {
            selectColor.setSelected(selectColor instanceof SelectColor.Custom);
            if (selectColor instanceof SelectColor.Custom) {
                ((SelectColor.Custom) selectColor).setOpen(true);
            }
        }
    }

    @NotNull
    public static final List<SelectColor> toSelectColorList(@Nullable Integer num, @NotNull List<? extends SelectColor> colorList, int i, boolean z8, @NotNull InterfaceC6471c isCustomExist) {
        int i8;
        SelectColor preset;
        int iIntValue;
        AbstractC5830k.m5330g(colorList, "colorList");
        AbstractC5830k.m5330g(isCustomExist, "isCustomExist");
        ArrayList arrayList = new ArrayList();
        if (num == null) {
            i8 = -1;
        } else {
            i8 = 0;
            for (SelectColor selectColor : colorList) {
                if (!(selectColor instanceof SelectColor.Custom) && selectColor.getValue() == num.intValue()) {
                    break;
                }
                i8++;
            }
            i8 = -1;
        }
        int i9 = 0;
        for (Object obj : colorList) {
            int i10 = i9 + 1;
            if (i9 < 0) {
                AbstractC5806u.m5258L();
                throw null;
            }
            SelectColor selectColor2 = (SelectColor) obj;
            if (selectColor2 instanceof SelectColor.Custom) {
                boolean z9 = num != null && i8 == -1 && ((Boolean) isCustomExist.invoke(num)).booleanValue();
                if (z9) {
                    AbstractC5830k.m5327d(num);
                    iIntValue = num.intValue();
                } else {
                    iIntValue = i;
                }
                preset = new SelectColor.Custom(iIntValue, z9, z9 && z8);
            } else if (selectColor2 instanceof SelectColor.Black) {
                preset = new SelectColor.Black(i9 == i8);
            } else if (selectColor2 instanceof SelectColor.White) {
                preset = new SelectColor.White(i9 == i8);
            } else if (selectColor2 instanceof SelectColor.Red) {
                preset = new SelectColor.Red(i9 == i8);
            } else {
                if (!(selectColor2 instanceof SelectColor.Preset)) {
                    throw new NoWhenBranchMatchedException();
                }
                preset = new SelectColor.Preset(selectColor2.getValue(), i9 == i8);
            }
            arrayList.add(preset);
            i9 = i10;
        }
        return arrayList;
    }

    public static /* synthetic */ List toSelectColorList$default(Integer num, List colorList, int i, boolean z8, InterfaceC6471c isCustomExist, int i8, Object obj) {
        int i9;
        SelectColor preset;
        int iIntValue;
        if ((i8 & 2) != 0) {
            i = 0;
        }
        if ((i8 & 4) != 0) {
            z8 = false;
        }
        AbstractC5830k.m5330g(colorList, "colorList");
        AbstractC5830k.m5330g(isCustomExist, "isCustomExist");
        ArrayList arrayList = new ArrayList();
        if (num == null) {
            i9 = -1;
        } else {
            Iterator it = colorList.iterator();
            i9 = 0;
            while (it.hasNext()) {
                SelectColor selectColor = (SelectColor) it.next();
                if (!(selectColor instanceof SelectColor.Custom) && selectColor.getValue() == num.intValue()) {
                    break;
                }
                i9++;
            }
            i9 = -1;
        }
        int i10 = 0;
        for (Object obj2 : colorList) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC5806u.m5258L();
                throw null;
            }
            SelectColor selectColor2 = (SelectColor) obj2;
            if (selectColor2 instanceof SelectColor.Custom) {
                boolean z9 = num != null && i9 == -1 && ((Boolean) isCustomExist.invoke(num)).booleanValue();
                if (z9) {
                    AbstractC5830k.m5327d(num);
                    iIntValue = num.intValue();
                } else {
                    iIntValue = i;
                }
                preset = new SelectColor.Custom(iIntValue, z9, z9 && z8);
            } else if (selectColor2 instanceof SelectColor.Black) {
                preset = new SelectColor.Black(i10 == i9);
            } else if (selectColor2 instanceof SelectColor.White) {
                preset = new SelectColor.White(i10 == i9);
            } else if (selectColor2 instanceof SelectColor.Red) {
                preset = new SelectColor.Red(i10 == i9);
            } else {
                if (!(selectColor2 instanceof SelectColor.Preset)) {
                    throw new NoWhenBranchMatchedException();
                }
                preset = new SelectColor.Preset(selectColor2.getValue(), i10 == i9);
            }
            arrayList.add(preset);
            i10 = i11;
        }
        return arrayList;
    }
}
