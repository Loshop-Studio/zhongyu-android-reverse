package com.friday.lecture;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.friday.lecture.databinding.FloatViewBindingImpl;
import com.friday.lecture.databinding.ItemOnlineListBindingImpl;
import com.friday.lecture.databinding.LayoutBeforeStopAnswerBindingImpl;
import com.friday.lecture.databinding.LayoutConfirmEndClassBindingImpl;
import com.friday.lecture.databinding.LayoutConfirmTimeUpBindingImpl;
import com.friday.lecture.databinding.LayoutRandomBindingImpl;
import com.friday.lecture.databinding.LayoutSimpleCanvasBindingImpl;
import com.friday.lecture.databinding.LayoutSubjectiveDetailBindingImpl;
import com.friday.lecture.databinding.LayoutSubjectiveListBindingImpl;
import com.friday.lecture.databinding.LectureDialogFragmentBindingImpl;
import com.friday.lecture.databinding.ViewInDemoBindingImpl;
import com.friday.lecture.databinding.WindowDanmakuBindingImpl;
import com.friday.lecture.databinding.WindowStudentDemoListBindingImpl;
import com.friday.lecture.databinding.WindowSubjectiveAnswerBindingImpl;
import com.friday.lecture.databinding.WindowViewObjectiveAnswerBindingImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes4.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a */
    public static final SparseIntArray f8443a;

    /* renamed from: com.friday.lecture.DataBinderMapperImpl$a */
    public static class C6137a {

        /* renamed from: a */
        public static final SparseArray f8444a;

        static {
            SparseArray sparseArray = new SparseArray(1);
            f8444a = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    /* renamed from: com.friday.lecture.DataBinderMapperImpl$b */
    public static class C6138b {

        /* renamed from: a */
        public static final HashMap f8445a;

        static {
            HashMap map = new HashMap(15);
            f8445a = map;
            map.put("layout/float_view_0", Integer.valueOf(R$layout.float_view));
            map.put("layout/item_online_list_0", Integer.valueOf(R$layout.item_online_list));
            map.put("layout/layout_before_stop_answer_0", Integer.valueOf(R$layout.layout_before_stop_answer));
            map.put("layout/layout_confirm_end_class_0", Integer.valueOf(R$layout.layout_confirm_end_class));
            map.put("layout/layout_confirm_time_up_0", Integer.valueOf(R$layout.layout_confirm_time_up));
            map.put("layout/layout_random_0", Integer.valueOf(R$layout.layout_random));
            map.put("layout/layout_simple_canvas_0", Integer.valueOf(R$layout.layout_simple_canvas));
            map.put("layout/layout_subjective_detail_0", Integer.valueOf(R$layout.layout_subjective_detail));
            map.put("layout/layout_subjective_list_0", Integer.valueOf(R$layout.layout_subjective_list));
            map.put("layout/lecture_dialog_fragment_0", Integer.valueOf(R$layout.lecture_dialog_fragment));
            map.put("layout/view_in_demo_0", Integer.valueOf(R$layout.view_in_demo));
            map.put("layout/window_danmaku_0", Integer.valueOf(R$layout.window_danmaku));
            map.put("layout/window_student_demo_list_0", Integer.valueOf(R$layout.window_student_demo_list));
            map.put("layout/window_subjective_answer_0", Integer.valueOf(R$layout.window_subjective_answer));
            map.put("layout/window_view_objective_answer_0", Integer.valueOf(R$layout.window_view_objective_answer));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(15);
        f8443a = sparseIntArray;
        sparseIntArray.put(R$layout.float_view, 1);
        sparseIntArray.put(R$layout.item_online_list, 2);
        sparseIntArray.put(R$layout.layout_before_stop_answer, 3);
        sparseIntArray.put(R$layout.layout_confirm_end_class, 4);
        sparseIntArray.put(R$layout.layout_confirm_time_up, 5);
        sparseIntArray.put(R$layout.layout_random, 6);
        sparseIntArray.put(R$layout.layout_simple_canvas, 7);
        sparseIntArray.put(R$layout.layout_subjective_detail, 8);
        sparseIntArray.put(R$layout.layout_subjective_list, 9);
        sparseIntArray.put(R$layout.lecture_dialog_fragment, 10);
        sparseIntArray.put(R$layout.view_in_demo, 11);
        sparseIntArray.put(R$layout.window_danmaku, 12);
        sparseIntArray.put(R$layout.window_student_demo_list, 13);
        sparseIntArray.put(R$layout.window_subjective_answer, 14);
        sparseIntArray.put(R$layout.window_view_objective_answer, 15);
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
        return (String) C6137a.f8444a.get(i10);
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i10) {
        int i11 = f8443a.get(i10);
        if (i11 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        switch (i11) {
            case 1:
                if ("layout/float_view_0".equals(tag)) {
                    return new FloatViewBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for float_view is invalid. Received: " + tag);
            case 2:
                if ("layout/item_online_list_0".equals(tag)) {
                    return new ItemOnlineListBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_online_list is invalid. Received: " + tag);
            case 3:
                if ("layout/layout_before_stop_answer_0".equals(tag)) {
                    return new LayoutBeforeStopAnswerBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_before_stop_answer is invalid. Received: " + tag);
            case 4:
                if ("layout/layout_confirm_end_class_0".equals(tag)) {
                    return new LayoutConfirmEndClassBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_confirm_end_class is invalid. Received: " + tag);
            case 5:
                if ("layout/layout_confirm_time_up_0".equals(tag)) {
                    return new LayoutConfirmTimeUpBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_confirm_time_up is invalid. Received: " + tag);
            case 6:
                if ("layout/layout_random_0".equals(tag)) {
                    return new LayoutRandomBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_random is invalid. Received: " + tag);
            case 7:
                if ("layout/layout_simple_canvas_0".equals(tag)) {
                    return new LayoutSimpleCanvasBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_simple_canvas is invalid. Received: " + tag);
            case 8:
                if ("layout/layout_subjective_detail_0".equals(tag)) {
                    return new LayoutSubjectiveDetailBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_subjective_detail is invalid. Received: " + tag);
            case 9:
                if ("layout/layout_subjective_list_0".equals(tag)) {
                    return new LayoutSubjectiveListBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_subjective_list is invalid. Received: " + tag);
            case 10:
                if ("layout/lecture_dialog_fragment_0".equals(tag)) {
                    return new LectureDialogFragmentBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for lecture_dialog_fragment is invalid. Received: " + tag);
            case 11:
                if ("layout/view_in_demo_0".equals(tag)) {
                    return new ViewInDemoBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_in_demo is invalid. Received: " + tag);
            case 12:
                if ("layout/window_danmaku_0".equals(tag)) {
                    return new WindowDanmakuBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for window_danmaku is invalid. Received: " + tag);
            case 13:
                if ("layout/window_student_demo_list_0".equals(tag)) {
                    return new WindowStudentDemoListBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for window_student_demo_list is invalid. Received: " + tag);
            case 14:
                if ("layout/window_subjective_answer_0".equals(tag)) {
                    return new WindowSubjectiveAnswerBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for window_subjective_answer is invalid. Received: " + tag);
            case 15:
                if ("layout/window_view_objective_answer_0".equals(tag)) {
                    return new WindowViewObjectiveAnswerBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for window_view_objective_answer is invalid. Received: " + tag);
            default:
                return null;
        }
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = (Integer) C6138b.f8445a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i10) {
        if (viewArr == null || viewArr.length == 0 || f8443a.get(i10) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
