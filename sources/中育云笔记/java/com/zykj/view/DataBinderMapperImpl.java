package com.zykj.view;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.view.databinding.ViewActivityEzyCameraBindingImpl;
import com.zykj.view.databinding.ViewActivityEzyCropBindingImpl;
import com.zykj.view.databinding.ViewDialogCommonTipBindingImpl;
import com.zykj.view.databinding.ViewDialogTextEditBindingImpl;
import com.zykj.view.databinding.ViewFragmentBlackboardCropBindingImpl;
import com.zykj.view.databinding.ViewFragmentBlackboardEvaluationBindingImpl;
import com.zykj.view.databinding.ViewFragmentBoardBindingImpl;
import com.zykj.view.databinding.ViewFragmentImagePickBindingImpl;
import com.zykj.view.databinding.ViewFragmentSimpleBindingImpl;
import com.zykj.view.databinding.ViewFragmentSketchPlayBindingImpl;
import com.zykj.view.databinding.ViewIncludeBackgroundColorBindingImpl;
import com.zykj.view.databinding.ViewIncludeEraserBindingImpl;
import com.zykj.view.databinding.ViewIncludeImageAddBindingImpl;
import com.zykj.view.databinding.ViewIncludeMenuBindingImpl;
import com.zykj.view.databinding.ViewIncludePenBindingImpl;
import com.zykj.view.databinding.ViewItemSketchPlayBindingImpl;
import com.zykj.view.databinding.ViewItemSketchRecordAudioBindingImpl;
import com.zykj.view.databinding.ViewItemSketchRecordBindingImpl;
import com.zykj.view.databinding.ViewPopupPlaySettingBindingImpl;
import com.zykj.view.databinding.ViewPopupPlaySpeedRateBindingImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes6.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a */
    public static final SparseIntArray f20007a;

    /* renamed from: com.zykj.view.DataBinderMapperImpl$a */
    public static class C8828a {

        /* renamed from: a */
        public static final SparseArray f20008a;

        static {
            SparseArray sparseArray = new SparseArray(1);
            f20008a = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    /* renamed from: com.zykj.view.DataBinderMapperImpl$b */
    public static class C8829b {

        /* renamed from: a */
        public static final HashMap f20009a;

        static {
            HashMap map = new HashMap(20);
            f20009a = map;
            map.put("layout/view_activity_ezy_camera_0", Integer.valueOf(R$layout.view_activity_ezy_camera));
            map.put("layout/view_activity_ezy_crop_0", Integer.valueOf(R$layout.view_activity_ezy_crop));
            map.put("layout/view_dialog_common_tip_0", Integer.valueOf(R$layout.view_dialog_common_tip));
            map.put("layout/view_dialog_text_edit_0", Integer.valueOf(R$layout.view_dialog_text_edit));
            map.put("layout/view_fragment_blackboard_crop_0", Integer.valueOf(R$layout.view_fragment_blackboard_crop));
            map.put("layout/view_fragment_blackboard_evaluation_0", Integer.valueOf(R$layout.view_fragment_blackboard_evaluation));
            map.put("layout/view_fragment_board_0", Integer.valueOf(R$layout.view_fragment_board));
            map.put("layout/view_fragment_image_pick_0", Integer.valueOf(R$layout.view_fragment_image_pick));
            map.put("layout/view_fragment_simple_0", Integer.valueOf(R$layout.view_fragment_simple));
            map.put("layout/view_fragment_sketch_play_0", Integer.valueOf(R$layout.view_fragment_sketch_play));
            map.put("layout/view_include_background_color_0", Integer.valueOf(R$layout.view_include_background_color));
            map.put("layout/view_include_eraser_0", Integer.valueOf(R$layout.view_include_eraser));
            map.put("layout/view_include_image_add_0", Integer.valueOf(R$layout.view_include_image_add));
            map.put("layout/view_include_menu_0", Integer.valueOf(R$layout.view_include_menu));
            map.put("layout/view_include_pen_0", Integer.valueOf(R$layout.view_include_pen));
            map.put("layout/view_item_sketch_play_0", Integer.valueOf(R$layout.view_item_sketch_play));
            map.put("layout/view_item_sketch_record_0", Integer.valueOf(R$layout.view_item_sketch_record));
            map.put("layout/view_item_sketch_record_audio_0", Integer.valueOf(R$layout.view_item_sketch_record_audio));
            map.put("layout/view_popup_play_setting_0", Integer.valueOf(R$layout.view_popup_play_setting));
            map.put("layout/view_popup_play_speed_rate_0", Integer.valueOf(R$layout.view_popup_play_speed_rate));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(20);
        f20007a = sparseIntArray;
        sparseIntArray.put(R$layout.view_activity_ezy_camera, 1);
        sparseIntArray.put(R$layout.view_activity_ezy_crop, 2);
        sparseIntArray.put(R$layout.view_dialog_common_tip, 3);
        sparseIntArray.put(R$layout.view_dialog_text_edit, 4);
        sparseIntArray.put(R$layout.view_fragment_blackboard_crop, 5);
        sparseIntArray.put(R$layout.view_fragment_blackboard_evaluation, 6);
        sparseIntArray.put(R$layout.view_fragment_board, 7);
        sparseIntArray.put(R$layout.view_fragment_image_pick, 8);
        sparseIntArray.put(R$layout.view_fragment_simple, 9);
        sparseIntArray.put(R$layout.view_fragment_sketch_play, 10);
        sparseIntArray.put(R$layout.view_include_background_color, 11);
        sparseIntArray.put(R$layout.view_include_eraser, 12);
        sparseIntArray.put(R$layout.view_include_image_add, 13);
        sparseIntArray.put(R$layout.view_include_menu, 14);
        sparseIntArray.put(R$layout.view_include_pen, 15);
        sparseIntArray.put(R$layout.view_item_sketch_play, 16);
        sparseIntArray.put(R$layout.view_item_sketch_record, 17);
        sparseIntArray.put(R$layout.view_item_sketch_record_audio, 18);
        sparseIntArray.put(R$layout.view_popup_play_setting, 19);
        sparseIntArray.put(R$layout.view_popup_play_speed_rate, 20);
    }

    @Override // androidx.databinding.DataBinderMapper
    public List collectDependencies() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int i10) {
        return (String) C8828a.f20008a.get(i10);
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i10) {
        int i11 = f20007a.get(i10);
        if (i11 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        switch (i11) {
            case 1:
                if ("layout/view_activity_ezy_camera_0".equals(tag)) {
                    return new ViewActivityEzyCameraBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_activity_ezy_camera is invalid. Received: " + tag);
            case 2:
                if ("layout/view_activity_ezy_crop_0".equals(tag)) {
                    return new ViewActivityEzyCropBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_activity_ezy_crop is invalid. Received: " + tag);
            case 3:
                if ("layout/view_dialog_common_tip_0".equals(tag)) {
                    return new ViewDialogCommonTipBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_dialog_common_tip is invalid. Received: " + tag);
            case 4:
                if ("layout/view_dialog_text_edit_0".equals(tag)) {
                    return new ViewDialogTextEditBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_dialog_text_edit is invalid. Received: " + tag);
            case 5:
                if ("layout/view_fragment_blackboard_crop_0".equals(tag)) {
                    return new ViewFragmentBlackboardCropBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_fragment_blackboard_crop is invalid. Received: " + tag);
            case 6:
                if ("layout/view_fragment_blackboard_evaluation_0".equals(tag)) {
                    return new ViewFragmentBlackboardEvaluationBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_fragment_blackboard_evaluation is invalid. Received: " + tag);
            case 7:
                if ("layout/view_fragment_board_0".equals(tag)) {
                    return new ViewFragmentBoardBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_fragment_board is invalid. Received: " + tag);
            case 8:
                if ("layout/view_fragment_image_pick_0".equals(tag)) {
                    return new ViewFragmentImagePickBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_fragment_image_pick is invalid. Received: " + tag);
            case 9:
                if ("layout/view_fragment_simple_0".equals(tag)) {
                    return new ViewFragmentSimpleBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_fragment_simple is invalid. Received: " + tag);
            case 10:
                if ("layout/view_fragment_sketch_play_0".equals(tag)) {
                    return new ViewFragmentSketchPlayBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_fragment_sketch_play is invalid. Received: " + tag);
            case 11:
                if ("layout/view_include_background_color_0".equals(tag)) {
                    return new ViewIncludeBackgroundColorBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_include_background_color is invalid. Received: " + tag);
            case 12:
                if ("layout/view_include_eraser_0".equals(tag)) {
                    return new ViewIncludeEraserBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_include_eraser is invalid. Received: " + tag);
            case 13:
                if ("layout/view_include_image_add_0".equals(tag)) {
                    return new ViewIncludeImageAddBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_include_image_add is invalid. Received: " + tag);
            case 14:
                if ("layout/view_include_menu_0".equals(tag)) {
                    return new ViewIncludeMenuBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_include_menu is invalid. Received: " + tag);
            case 15:
                if ("layout/view_include_pen_0".equals(tag)) {
                    return new ViewIncludePenBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_include_pen is invalid. Received: " + tag);
            case 16:
                if ("layout/view_item_sketch_play_0".equals(tag)) {
                    return new ViewItemSketchPlayBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_item_sketch_play is invalid. Received: " + tag);
            case 17:
                if ("layout/view_item_sketch_record_0".equals(tag)) {
                    return new ViewItemSketchRecordBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_item_sketch_record is invalid. Received: " + tag);
            case 18:
                if ("layout/view_item_sketch_record_audio_0".equals(tag)) {
                    return new ViewItemSketchRecordAudioBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_item_sketch_record_audio is invalid. Received: " + tag);
            case 19:
                if ("layout/view_popup_play_setting_0".equals(tag)) {
                    return new ViewPopupPlaySettingBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_popup_play_setting is invalid. Received: " + tag);
            case 20:
                if ("layout/view_popup_play_speed_rate_0".equals(tag)) {
                    return new ViewPopupPlaySpeedRateBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_popup_play_speed_rate is invalid. Received: " + tag);
            default:
                return null;
        }
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = (Integer) C8829b.f20009a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i10) {
        if (viewArr == null || viewArr.length == 0 || f20007a.get(i10) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
