package com.friday.paint;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.friday.paint.databinding.FragmentThePaintBindingImpl;
import com.friday.paint.databinding.FragmentTheSketchBindingImpl;
import com.friday.paint.databinding.ItemPaintPenColorBindingImpl;
import com.friday.paint.databinding.LayoutObjectiveConfirmBindingImpl;
import com.friday.paint.databinding.LayoutStudentObjectiveBindingImpl;
import com.friday.paint.databinding.NoteActivityBindingImpl;
import com.friday.paint.databinding.ResFragmentNewPaintBindingImpl;
import com.friday.paint.databinding.ResFragmentNoteDetailBindingImpl;
import com.friday.paint.databinding.WindowObjectiveHomeworkBindingImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes4.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a */
    public static final SparseIntArray f9720a;

    /* renamed from: com.friday.paint.DataBinderMapperImpl$a */
    public static class C6230a {

        /* renamed from: a */
        public static final SparseArray f9721a;

        static {
            SparseArray sparseArray = new SparseArray(1);
            f9721a = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    /* renamed from: com.friday.paint.DataBinderMapperImpl$b */
    public static class C6231b {

        /* renamed from: a */
        public static final HashMap f9722a;

        static {
            HashMap map = new HashMap(9);
            f9722a = map;
            map.put("layout/fragment_the_paint_0", Integer.valueOf(R$layout.fragment_the_paint));
            map.put("layout/fragment_the_sketch_0", Integer.valueOf(R$layout.fragment_the_sketch));
            map.put("layout/item_paint_pen_color_0", Integer.valueOf(R$layout.item_paint_pen_color));
            map.put("layout/layout_objective_confirm_0", Integer.valueOf(R$layout.layout_objective_confirm));
            map.put("layout/layout_student_objective_0", Integer.valueOf(R$layout.layout_student_objective));
            map.put("layout/note_activity_0", Integer.valueOf(R$layout.note_activity));
            map.put("layout/res_fragment_new_paint_0", Integer.valueOf(R$layout.res_fragment_new_paint));
            map.put("layout/res_fragment_note_detail_0", Integer.valueOf(R$layout.res_fragment_note_detail));
            map.put("layout/window_objective_homework_0", Integer.valueOf(R$layout.window_objective_homework));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(9);
        f9720a = sparseIntArray;
        sparseIntArray.put(R$layout.fragment_the_paint, 1);
        sparseIntArray.put(R$layout.fragment_the_sketch, 2);
        sparseIntArray.put(R$layout.item_paint_pen_color, 3);
        sparseIntArray.put(R$layout.layout_objective_confirm, 4);
        sparseIntArray.put(R$layout.layout_student_objective, 5);
        sparseIntArray.put(R$layout.note_activity, 6);
        sparseIntArray.put(R$layout.res_fragment_new_paint, 7);
        sparseIntArray.put(R$layout.res_fragment_note_detail, 8);
        sparseIntArray.put(R$layout.window_objective_homework, 9);
    }

    @Override // androidx.databinding.DataBinderMapper
    public List collectDependencies() {
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.friday.common.DataBinderMapperImpl());
        arrayList.add(new com.zykj.download.DataBinderMapperImpl());
        arrayList.add(new com.zykj.policy.DataBinderMapperImpl());
        arrayList.add(new com.zykj.view.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int i10) {
        return (String) C6230a.f9721a.get(i10);
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i10) {
        int i11 = f9720a.get(i10);
        if (i11 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        switch (i11) {
            case 1:
                if ("layout/fragment_the_paint_0".equals(tag)) {
                    return new FragmentThePaintBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_the_paint is invalid. Received: " + tag);
            case 2:
                if ("layout/fragment_the_sketch_0".equals(tag)) {
                    return new FragmentTheSketchBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_the_sketch is invalid. Received: " + tag);
            case 3:
                if ("layout/item_paint_pen_color_0".equals(tag)) {
                    return new ItemPaintPenColorBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_paint_pen_color is invalid. Received: " + tag);
            case 4:
                if ("layout/layout_objective_confirm_0".equals(tag)) {
                    return new LayoutObjectiveConfirmBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_objective_confirm is invalid. Received: " + tag);
            case 5:
                if ("layout/layout_student_objective_0".equals(tag)) {
                    return new LayoutStudentObjectiveBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_student_objective is invalid. Received: " + tag);
            case 6:
                if ("layout/note_activity_0".equals(tag)) {
                    return new NoteActivityBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for note_activity is invalid. Received: " + tag);
            case 7:
                if ("layout/res_fragment_new_paint_0".equals(tag)) {
                    return new ResFragmentNewPaintBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for res_fragment_new_paint is invalid. Received: " + tag);
            case 8:
                if ("layout/res_fragment_note_detail_0".equals(tag)) {
                    return new ResFragmentNoteDetailBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for res_fragment_note_detail is invalid. Received: " + tag);
            case 9:
                if ("layout/window_objective_homework_0".equals(tag)) {
                    return new WindowObjectiveHomeworkBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for window_objective_homework is invalid. Received: " + tag);
            default:
                return null;
        }
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = (Integer) C6231b.f9722a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i10) {
        if (viewArr == null || viewArr.length == 0 || f9720a.get(i10) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
