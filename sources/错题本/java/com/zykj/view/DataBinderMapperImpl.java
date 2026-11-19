package com.zykj.view;

import android.support.v4.media.AbstractC0037f;
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
import com.zykj.view.databinding.ViewIncludeCustomColorBindingImpl;
import com.zykj.view.databinding.ViewIncludeEraserBindingImpl;
import com.zykj.view.databinding.ViewIncludeEvaluationPenBindingImpl;
import com.zykj.view.databinding.ViewIncludeEvaluationPenProxyBindingImpl;
import com.zykj.view.databinding.ViewIncludeImageAddBindingImpl;
import com.zykj.view.databinding.ViewIncludeMenuBindingImpl;
import com.zykj.view.databinding.ViewIncludePenBindingImpl;
import com.zykj.view.databinding.ViewIncludeSelectTypeBindingImpl;
import com.zykj.view.databinding.ViewItemSketchPlayBindingImpl;
import com.zykj.view.databinding.ViewItemSketchRecordAudioBindingImpl;
import com.zykj.view.databinding.ViewItemSketchRecordBindingImpl;
import com.zykj.view.databinding.ViewPopupPlaySettingBindingImpl;
import com.zykj.view.databinding.ViewPopupPlaySpeedRateBindingImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP;
    private static final int LAYOUT_VIEWACTIVITYEZYCAMERA = 1;
    private static final int LAYOUT_VIEWACTIVITYEZYCROP = 2;
    private static final int LAYOUT_VIEWDIALOGCOMMONTIP = 3;
    private static final int LAYOUT_VIEWDIALOGTEXTEDIT = 4;
    private static final int LAYOUT_VIEWFRAGMENTBLACKBOARDCROP = 5;
    private static final int LAYOUT_VIEWFRAGMENTBLACKBOARDEVALUATION = 6;
    private static final int LAYOUT_VIEWFRAGMENTBOARD = 7;
    private static final int LAYOUT_VIEWFRAGMENTIMAGEPICK = 8;
    private static final int LAYOUT_VIEWFRAGMENTSIMPLE = 9;
    private static final int LAYOUT_VIEWFRAGMENTSKETCHPLAY = 10;
    private static final int LAYOUT_VIEWINCLUDEBACKGROUNDCOLOR = 11;
    private static final int LAYOUT_VIEWINCLUDECUSTOMCOLOR = 12;
    private static final int LAYOUT_VIEWINCLUDEERASER = 13;
    private static final int LAYOUT_VIEWINCLUDEEVALUATIONPEN = 14;
    private static final int LAYOUT_VIEWINCLUDEEVALUATIONPENPROXY = 15;
    private static final int LAYOUT_VIEWINCLUDEIMAGEADD = 16;
    private static final int LAYOUT_VIEWINCLUDEMENU = 17;
    private static final int LAYOUT_VIEWINCLUDEPEN = 18;
    private static final int LAYOUT_VIEWINCLUDESELECTTYPE = 19;
    private static final int LAYOUT_VIEWITEMSKETCHPLAY = 20;
    private static final int LAYOUT_VIEWITEMSKETCHRECORD = 21;
    private static final int LAYOUT_VIEWITEMSKETCHRECORDAUDIO = 22;
    private static final int LAYOUT_VIEWPOPUPPLAYSETTING = 23;
    private static final int LAYOUT_VIEWPOPUPPLAYSPEEDRATE = 24;

    public static class InnerBrLookup {
        static final SparseArray<String> sKeys;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            sKeys = sparseArray;
            sparseArray.put(0, "_all");
        }

        private InnerBrLookup() {
        }
    }

    public static class InnerLayoutIdLookup {
        static final HashMap<String, Integer> sKeys;

        static {
            HashMap<String, Integer> map = new HashMap<>(24);
            sKeys = map;
            map.put("layout/view_activity_ezy_camera_0", Integer.valueOf(C5280R.layout.view_activity_ezy_camera));
            map.put("layout/view_activity_ezy_crop_0", Integer.valueOf(C5280R.layout.view_activity_ezy_crop));
            map.put("layout/view_dialog_common_tip_0", Integer.valueOf(C5280R.layout.view_dialog_common_tip));
            map.put("layout/view_dialog_text_edit_0", Integer.valueOf(C5280R.layout.view_dialog_text_edit));
            map.put("layout/view_fragment_blackboard_crop_0", Integer.valueOf(C5280R.layout.view_fragment_blackboard_crop));
            map.put("layout/view_fragment_blackboard_evaluation_0", Integer.valueOf(C5280R.layout.view_fragment_blackboard_evaluation));
            map.put("layout/view_fragment_board_0", Integer.valueOf(C5280R.layout.view_fragment_board));
            map.put("layout/view_fragment_image_pick_0", Integer.valueOf(C5280R.layout.view_fragment_image_pick));
            map.put("layout/view_fragment_simple_0", Integer.valueOf(C5280R.layout.view_fragment_simple));
            map.put("layout/view_fragment_sketch_play_0", Integer.valueOf(C5280R.layout.view_fragment_sketch_play));
            map.put("layout/view_include_background_color_0", Integer.valueOf(C5280R.layout.view_include_background_color));
            map.put("layout/view_include_custom_color_0", Integer.valueOf(C5280R.layout.view_include_custom_color));
            map.put("layout/view_include_eraser_0", Integer.valueOf(C5280R.layout.view_include_eraser));
            map.put("layout/view_include_evaluation_pen_0", Integer.valueOf(C5280R.layout.view_include_evaluation_pen));
            map.put("layout/view_include_evaluation_pen_proxy_0", Integer.valueOf(C5280R.layout.view_include_evaluation_pen_proxy));
            map.put("layout/view_include_image_add_0", Integer.valueOf(C5280R.layout.view_include_image_add));
            map.put("layout/view_include_menu_0", Integer.valueOf(C5280R.layout.view_include_menu));
            map.put("layout/view_include_pen_0", Integer.valueOf(C5280R.layout.view_include_pen));
            map.put("layout/view_include_select_type_0", Integer.valueOf(C5280R.layout.view_include_select_type));
            map.put("layout/view_item_sketch_play_0", Integer.valueOf(C5280R.layout.view_item_sketch_play));
            map.put("layout/view_item_sketch_record_0", Integer.valueOf(C5280R.layout.view_item_sketch_record));
            map.put("layout/view_item_sketch_record_audio_0", Integer.valueOf(C5280R.layout.view_item_sketch_record_audio));
            map.put("layout/view_popup_play_setting_0", Integer.valueOf(C5280R.layout.view_popup_play_setting));
            map.put("layout/view_popup_play_speed_rate_0", Integer.valueOf(C5280R.layout.view_popup_play_speed_rate));
        }

        private InnerLayoutIdLookup() {
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(24);
        INTERNAL_LAYOUT_ID_LOOKUP = sparseIntArray;
        sparseIntArray.put(C5280R.layout.view_activity_ezy_camera, 1);
        sparseIntArray.put(C5280R.layout.view_activity_ezy_crop, 2);
        sparseIntArray.put(C5280R.layout.view_dialog_common_tip, 3);
        sparseIntArray.put(C5280R.layout.view_dialog_text_edit, 4);
        sparseIntArray.put(C5280R.layout.view_fragment_blackboard_crop, 5);
        sparseIntArray.put(C5280R.layout.view_fragment_blackboard_evaluation, 6);
        sparseIntArray.put(C5280R.layout.view_fragment_board, 7);
        sparseIntArray.put(C5280R.layout.view_fragment_image_pick, 8);
        sparseIntArray.put(C5280R.layout.view_fragment_simple, 9);
        sparseIntArray.put(C5280R.layout.view_fragment_sketch_play, 10);
        sparseIntArray.put(C5280R.layout.view_include_background_color, 11);
        sparseIntArray.put(C5280R.layout.view_include_custom_color, 12);
        sparseIntArray.put(C5280R.layout.view_include_eraser, 13);
        sparseIntArray.put(C5280R.layout.view_include_evaluation_pen, 14);
        sparseIntArray.put(C5280R.layout.view_include_evaluation_pen_proxy, 15);
        sparseIntArray.put(C5280R.layout.view_include_image_add, 16);
        sparseIntArray.put(C5280R.layout.view_include_menu, 17);
        sparseIntArray.put(C5280R.layout.view_include_pen, 18);
        sparseIntArray.put(C5280R.layout.view_include_select_type, 19);
        sparseIntArray.put(C5280R.layout.view_item_sketch_play, 20);
        sparseIntArray.put(C5280R.layout.view_item_sketch_record, 21);
        sparseIntArray.put(C5280R.layout.view_item_sketch_record_audio, 22);
        sparseIntArray.put(C5280R.layout.view_popup_play_setting, 23);
        sparseIntArray.put(C5280R.layout.view_popup_play_speed_rate, 24);
    }

    @Override // androidx.databinding.DataBinderMapper
    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int i) {
        return InnerBrLookup.sKeys.get(i);
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        int i8 = INTERNAL_LAYOUT_ID_LOOKUP.get(i);
        if (i8 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        switch (i8) {
            case 1:
                if ("layout/view_activity_ezy_camera_0".equals(tag)) {
                    return new ViewActivityEzyCameraBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(AbstractC0037f.m84i(tag, "The tag for view_activity_ezy_camera is invalid. Received: "));
            case 2:
                if ("layout/view_activity_ezy_crop_0".equals(tag)) {
                    return new ViewActivityEzyCropBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(AbstractC0037f.m84i(tag, "The tag for view_activity_ezy_crop is invalid. Received: "));
            case 3:
                if ("layout/view_dialog_common_tip_0".equals(tag)) {
                    return new ViewDialogCommonTipBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(AbstractC0037f.m84i(tag, "The tag for view_dialog_common_tip is invalid. Received: "));
            case 4:
                if ("layout/view_dialog_text_edit_0".equals(tag)) {
                    return new ViewDialogTextEditBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(AbstractC0037f.m84i(tag, "The tag for view_dialog_text_edit is invalid. Received: "));
            case 5:
                if ("layout/view_fragment_blackboard_crop_0".equals(tag)) {
                    return new ViewFragmentBlackboardCropBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(AbstractC0037f.m84i(tag, "The tag for view_fragment_blackboard_crop is invalid. Received: "));
            case 6:
                if ("layout/view_fragment_blackboard_evaluation_0".equals(tag)) {
                    return new ViewFragmentBlackboardEvaluationBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(AbstractC0037f.m84i(tag, "The tag for view_fragment_blackboard_evaluation is invalid. Received: "));
            case 7:
                if ("layout/view_fragment_board_0".equals(tag)) {
                    return new ViewFragmentBoardBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(AbstractC0037f.m84i(tag, "The tag for view_fragment_board is invalid. Received: "));
            case 8:
                if ("layout/view_fragment_image_pick_0".equals(tag)) {
                    return new ViewFragmentImagePickBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(AbstractC0037f.m84i(tag, "The tag for view_fragment_image_pick is invalid. Received: "));
            case 9:
                if ("layout/view_fragment_simple_0".equals(tag)) {
                    return new ViewFragmentSimpleBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(AbstractC0037f.m84i(tag, "The tag for view_fragment_simple is invalid. Received: "));
            case 10:
                if ("layout/view_fragment_sketch_play_0".equals(tag)) {
                    return new ViewFragmentSketchPlayBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(AbstractC0037f.m84i(tag, "The tag for view_fragment_sketch_play is invalid. Received: "));
            case 11:
                if ("layout/view_include_background_color_0".equals(tag)) {
                    return new ViewIncludeBackgroundColorBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(AbstractC0037f.m84i(tag, "The tag for view_include_background_color is invalid. Received: "));
            case 12:
                if ("layout/view_include_custom_color_0".equals(tag)) {
                    return new ViewIncludeCustomColorBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(AbstractC0037f.m84i(tag, "The tag for view_include_custom_color is invalid. Received: "));
            case 13:
                if ("layout/view_include_eraser_0".equals(tag)) {
                    return new ViewIncludeEraserBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(AbstractC0037f.m84i(tag, "The tag for view_include_eraser is invalid. Received: "));
            case 14:
                if ("layout/view_include_evaluation_pen_0".equals(tag)) {
                    return new ViewIncludeEvaluationPenBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(AbstractC0037f.m84i(tag, "The tag for view_include_evaluation_pen is invalid. Received: "));
            case 15:
                if ("layout/view_include_evaluation_pen_proxy_0".equals(tag)) {
                    return new ViewIncludeEvaluationPenProxyBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(AbstractC0037f.m84i(tag, "The tag for view_include_evaluation_pen_proxy is invalid. Received: "));
            case 16:
                if ("layout/view_include_image_add_0".equals(tag)) {
                    return new ViewIncludeImageAddBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(AbstractC0037f.m84i(tag, "The tag for view_include_image_add is invalid. Received: "));
            case 17:
                if ("layout/view_include_menu_0".equals(tag)) {
                    return new ViewIncludeMenuBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(AbstractC0037f.m84i(tag, "The tag for view_include_menu is invalid. Received: "));
            case 18:
                if ("layout/view_include_pen_0".equals(tag)) {
                    return new ViewIncludePenBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(AbstractC0037f.m84i(tag, "The tag for view_include_pen is invalid. Received: "));
            case 19:
                if ("layout/view_include_select_type_0".equals(tag)) {
                    return new ViewIncludeSelectTypeBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(AbstractC0037f.m84i(tag, "The tag for view_include_select_type is invalid. Received: "));
            case 20:
                if ("layout/view_item_sketch_play_0".equals(tag)) {
                    return new ViewItemSketchPlayBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(AbstractC0037f.m84i(tag, "The tag for view_item_sketch_play is invalid. Received: "));
            case 21:
                if ("layout/view_item_sketch_record_0".equals(tag)) {
                    return new ViewItemSketchRecordBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(AbstractC0037f.m84i(tag, "The tag for view_item_sketch_record is invalid. Received: "));
            case 22:
                if ("layout/view_item_sketch_record_audio_0".equals(tag)) {
                    return new ViewItemSketchRecordAudioBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(AbstractC0037f.m84i(tag, "The tag for view_item_sketch_record_audio is invalid. Received: "));
            case 23:
                if ("layout/view_popup_play_setting_0".equals(tag)) {
                    return new ViewPopupPlaySettingBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(AbstractC0037f.m84i(tag, "The tag for view_popup_play_setting is invalid. Received: "));
            case 24:
                if ("layout/view_popup_play_speed_rate_0".equals(tag)) {
                    return new ViewPopupPlaySpeedRateBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(AbstractC0037f.m84i(tag, "The tag for view_popup_play_speed_rate is invalid. Received: "));
            default:
                return null;
        }
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = InnerLayoutIdLookup.sKeys.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || INTERNAL_LAYOUT_ID_LOOKUP.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
