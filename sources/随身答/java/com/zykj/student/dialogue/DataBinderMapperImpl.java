package com.zykj.student.dialogue;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.student.dialogue.databinding.DialogVersionUpgradeBindingImpl;
import com.zykj.student.dialogue.databinding.DialogueAnswerTabLayoutBindingImpl;
import com.zykj.student.dialogue.databinding.DialogueDialogDeleteBindingImpl;
import com.zykj.student.dialogue.databinding.DialogueDialogEditBindingImpl;
import com.zykj.student.dialogue.databinding.DialogueFragmentAnswerPagerBindingImpl;
import com.zykj.student.dialogue.databinding.DialogueFragmentAnswerTabBindingImpl;
import com.zykj.student.dialogue.databinding.DialogueFragmentCategoryListBindingImpl;
import com.zykj.student.dialogue.databinding.DialogueFragmentDetailTabBindingImpl;
import com.zykj.student.dialogue.databinding.DialogueFragmentEditNewBindingImpl;
import com.zykj.student.dialogue.databinding.DialogueFragmentNewAnswerBindingImpl;
import com.zykj.student.dialogue.databinding.DialogueFragmentPlayLessonBindingImpl;
import com.zykj.student.dialogue.databinding.DialogueFragmentSketchCropBindingImpl;
import com.zykj.student.dialogue.databinding.DialogueFragmentUpdateCategoryBindingImpl;
import com.zykj.student.dialogue.databinding.DialogueItemAnswerTabBindingImpl;
import com.zykj.student.dialogue.databinding.DialogueItemEditBindingImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes5.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a */
    public static final SparseIntArray f10276a;

    /* renamed from: com.zykj.student.dialogue.DataBinderMapperImpl$a */
    public static class C7446a {

        /* renamed from: a */
        public static final SparseArray f10277a;

        static {
            SparseArray sparseArray = new SparseArray(2);
            f10277a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "lightTheme");
        }
    }

    /* renamed from: com.zykj.student.dialogue.DataBinderMapperImpl$b */
    public static class C7447b {

        /* renamed from: a */
        public static final HashMap f10278a;

        static {
            HashMap map = new HashMap(15);
            f10278a = map;
            map.put("layout/dialog_version_upgrade_0", Integer.valueOf(R.layout.dialog_version_upgrade));
            map.put("layout/dialogue_answer_tab_layout_0", Integer.valueOf(R.layout.dialogue_answer_tab_layout));
            map.put("layout/dialogue_dialog_delete_0", Integer.valueOf(R.layout.dialogue_dialog_delete));
            map.put("layout/dialogue_dialog_edit_0", Integer.valueOf(R.layout.dialogue_dialog_edit));
            map.put("layout/dialogue_fragment_answer_pager_0", Integer.valueOf(R.layout.dialogue_fragment_answer_pager));
            map.put("layout/dialogue_fragment_answer_tab_0", Integer.valueOf(R.layout.dialogue_fragment_answer_tab));
            map.put("layout/dialogue_fragment_category_list_0", Integer.valueOf(R.layout.dialogue_fragment_category_list));
            map.put("layout/dialogue_fragment_detail_tab_0", Integer.valueOf(R.layout.dialogue_fragment_detail_tab));
            map.put("layout/dialogue_fragment_edit_new_0", Integer.valueOf(R.layout.dialogue_fragment_edit_new));
            map.put("layout/dialogue_fragment_new_answer_0", Integer.valueOf(R.layout.dialogue_fragment_new_answer));
            map.put("layout/dialogue_fragment_play_lesson_0", Integer.valueOf(R.layout.dialogue_fragment_play_lesson));
            map.put("layout/dialogue_fragment_sketch_crop_0", Integer.valueOf(R.layout.dialogue_fragment_sketch_crop));
            map.put("layout/dialogue_fragment_update_category_0", Integer.valueOf(R.layout.dialogue_fragment_update_category));
            map.put("layout/dialogue_item_answer_tab_0", Integer.valueOf(R.layout.dialogue_item_answer_tab));
            map.put("layout/dialogue_item_edit_0", Integer.valueOf(R.layout.dialogue_item_edit));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(15);
        f10276a = sparseIntArray;
        sparseIntArray.put(R.layout.dialog_version_upgrade, 1);
        sparseIntArray.put(R.layout.dialogue_answer_tab_layout, 2);
        sparseIntArray.put(R.layout.dialogue_dialog_delete, 3);
        sparseIntArray.put(R.layout.dialogue_dialog_edit, 4);
        sparseIntArray.put(R.layout.dialogue_fragment_answer_pager, 5);
        sparseIntArray.put(R.layout.dialogue_fragment_answer_tab, 6);
        sparseIntArray.put(R.layout.dialogue_fragment_category_list, 7);
        sparseIntArray.put(R.layout.dialogue_fragment_detail_tab, 8);
        sparseIntArray.put(R.layout.dialogue_fragment_edit_new, 9);
        sparseIntArray.put(R.layout.dialogue_fragment_new_answer, 10);
        sparseIntArray.put(R.layout.dialogue_fragment_play_lesson, 11);
        sparseIntArray.put(R.layout.dialogue_fragment_sketch_crop, 12);
        sparseIntArray.put(R.layout.dialogue_fragment_update_category, 13);
        sparseIntArray.put(R.layout.dialogue_item_answer_tab, 14);
        sparseIntArray.put(R.layout.dialogue_item_edit, 15);
    }

    @Override // androidx.databinding.DataBinderMapper
    public List collectDependencies() {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.zykj.base.DataBinderMapperImpl());
        arrayList.add(new com.zykj.download.DataBinderMapperImpl());
        arrayList.add(new com.zykj.view.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int i9) {
        return (String) C7446a.f10277a.get(i9);
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i9) {
        int i10 = f10276a.get(i9);
        if (i10 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        switch (i10) {
            case 1:
                if ("layout/dialog_version_upgrade_0".equals(tag)) {
                    return new DialogVersionUpgradeBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialog_version_upgrade is invalid. Received: " + tag);
            case 2:
                if ("layout/dialogue_answer_tab_layout_0".equals(tag)) {
                    return new DialogueAnswerTabLayoutBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialogue_answer_tab_layout is invalid. Received: " + tag);
            case 3:
                if ("layout/dialogue_dialog_delete_0".equals(tag)) {
                    return new DialogueDialogDeleteBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialogue_dialog_delete is invalid. Received: " + tag);
            case 4:
                if ("layout/dialogue_dialog_edit_0".equals(tag)) {
                    return new DialogueDialogEditBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialogue_dialog_edit is invalid. Received: " + tag);
            case 5:
                if ("layout/dialogue_fragment_answer_pager_0".equals(tag)) {
                    return new DialogueFragmentAnswerPagerBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialogue_fragment_answer_pager is invalid. Received: " + tag);
            case 6:
                if ("layout/dialogue_fragment_answer_tab_0".equals(tag)) {
                    return new DialogueFragmentAnswerTabBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialogue_fragment_answer_tab is invalid. Received: " + tag);
            case 7:
                if ("layout/dialogue_fragment_category_list_0".equals(tag)) {
                    return new DialogueFragmentCategoryListBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialogue_fragment_category_list is invalid. Received: " + tag);
            case 8:
                if ("layout/dialogue_fragment_detail_tab_0".equals(tag)) {
                    return new DialogueFragmentDetailTabBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialogue_fragment_detail_tab is invalid. Received: " + tag);
            case 9:
                if ("layout/dialogue_fragment_edit_new_0".equals(tag)) {
                    return new DialogueFragmentEditNewBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialogue_fragment_edit_new is invalid. Received: " + tag);
            case 10:
                if ("layout/dialogue_fragment_new_answer_0".equals(tag)) {
                    return new DialogueFragmentNewAnswerBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialogue_fragment_new_answer is invalid. Received: " + tag);
            case 11:
                if ("layout/dialogue_fragment_play_lesson_0".equals(tag)) {
                    return new DialogueFragmentPlayLessonBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialogue_fragment_play_lesson is invalid. Received: " + tag);
            case 12:
                if ("layout/dialogue_fragment_sketch_crop_0".equals(tag)) {
                    return new DialogueFragmentSketchCropBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialogue_fragment_sketch_crop is invalid. Received: " + tag);
            case 13:
                if ("layout/dialogue_fragment_update_category_0".equals(tag)) {
                    return new DialogueFragmentUpdateCategoryBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialogue_fragment_update_category is invalid. Received: " + tag);
            case 14:
                if ("layout/dialogue_item_answer_tab_0".equals(tag)) {
                    return new DialogueItemAnswerTabBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialogue_item_answer_tab is invalid. Received: " + tag);
            case 15:
                if ("layout/dialogue_item_edit_0".equals(tag)) {
                    return new DialogueItemEditBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialogue_item_edit is invalid. Received: " + tag);
            default:
                return null;
        }
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = (Integer) C7447b.f10278a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i9) {
        if (viewArr == null || viewArr.length == 0 || f10276a.get(i9) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
