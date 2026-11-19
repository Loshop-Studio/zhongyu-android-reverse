package com.friday.common;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.friday.common.databinding.ActivityImageBindingImpl;
import com.friday.common.databinding.DialogDownloadWpsBindingImpl;
import com.friday.common.databinding.DialogFbiWarningBindingImpl;
import com.friday.common.databinding.DialogGetShareBindingImpl;
import com.friday.common.databinding.DialogShareBindingImpl;
import com.friday.common.databinding.DialogSharedFileBindingImpl;
import com.friday.common.databinding.DialogWithEditTextBindingImpl;
import com.friday.common.databinding.FragmentImageCropBindingImpl;
import com.friday.common.databinding.FragmentImagePickBindingImpl;
import com.friday.common.databinding.PopupWindowNoteInfoBindingImpl;
import com.friday.common.databinding.ViewNoteInfoShareToMeBindingImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a */
    public static final SparseIntArray f5529a;

    /* renamed from: com.friday.common.DataBinderMapperImpl$a */
    public static class C5920a {

        /* renamed from: a */
        public static final SparseArray f5530a;

        static {
            SparseArray sparseArray = new SparseArray(1);
            f5530a = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    /* renamed from: com.friday.common.DataBinderMapperImpl$b */
    public static class C5921b {

        /* renamed from: a */
        public static final HashMap f5531a;

        static {
            HashMap map = new HashMap(11);
            f5531a = map;
            map.put("layout/activity_image_0", Integer.valueOf(R$layout.activity_image));
            map.put("layout/dialog_download_wps_0", Integer.valueOf(R$layout.dialog_download_wps));
            map.put("layout/dialog_fbi_warning_0", Integer.valueOf(R$layout.dialog_fbi_warning));
            map.put("layout/dialog_get_share_0", Integer.valueOf(R$layout.dialog_get_share));
            map.put("layout/dialog_share_0", Integer.valueOf(R$layout.dialog_share));
            map.put("layout/dialog_shared_file_0", Integer.valueOf(R$layout.dialog_shared_file));
            map.put("layout/dialog_with_edit_text_0", Integer.valueOf(R$layout.dialog_with_edit_text));
            map.put("layout/fragment_image_crop_0", Integer.valueOf(R$layout.fragment_image_crop));
            map.put("layout/fragment_image_pick_0", Integer.valueOf(R$layout.fragment_image_pick));
            map.put("layout/popup_window_note_info_0", Integer.valueOf(R$layout.popup_window_note_info));
            map.put("layout/view_note_info_share_to_me_0", Integer.valueOf(R$layout.view_note_info_share_to_me));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(11);
        f5529a = sparseIntArray;
        sparseIntArray.put(R$layout.activity_image, 1);
        sparseIntArray.put(R$layout.dialog_download_wps, 2);
        sparseIntArray.put(R$layout.dialog_fbi_warning, 3);
        sparseIntArray.put(R$layout.dialog_get_share, 4);
        sparseIntArray.put(R$layout.dialog_share, 5);
        sparseIntArray.put(R$layout.dialog_shared_file, 6);
        sparseIntArray.put(R$layout.dialog_with_edit_text, 7);
        sparseIntArray.put(R$layout.fragment_image_crop, 8);
        sparseIntArray.put(R$layout.fragment_image_pick, 9);
        sparseIntArray.put(R$layout.popup_window_note_info, 10);
        sparseIntArray.put(R$layout.view_note_info_share_to_me, 11);
    }

    @Override // androidx.databinding.DataBinderMapper
    public List collectDependencies() {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.zykj.download.DataBinderMapperImpl());
        arrayList.add(new com.zykj.policy.DataBinderMapperImpl());
        arrayList.add(new com.zykj.view.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int i10) {
        return (String) C5920a.f5530a.get(i10);
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i10) {
        int i11 = f5529a.get(i10);
        if (i11 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        switch (i11) {
            case 1:
                if ("layout/activity_image_0".equals(tag)) {
                    return new ActivityImageBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_image is invalid. Received: " + tag);
            case 2:
                if ("layout/dialog_download_wps_0".equals(tag)) {
                    return new DialogDownloadWpsBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialog_download_wps is invalid. Received: " + tag);
            case 3:
                if ("layout/dialog_fbi_warning_0".equals(tag)) {
                    return new DialogFbiWarningBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialog_fbi_warning is invalid. Received: " + tag);
            case 4:
                if ("layout/dialog_get_share_0".equals(tag)) {
                    return new DialogGetShareBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialog_get_share is invalid. Received: " + tag);
            case 5:
                if ("layout/dialog_share_0".equals(tag)) {
                    return new DialogShareBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialog_share is invalid. Received: " + tag);
            case 6:
                if ("layout/dialog_shared_file_0".equals(tag)) {
                    return new DialogSharedFileBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialog_shared_file is invalid. Received: " + tag);
            case 7:
                if ("layout/dialog_with_edit_text_0".equals(tag)) {
                    return new DialogWithEditTextBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialog_with_edit_text is invalid. Received: " + tag);
            case 8:
                if ("layout/fragment_image_crop_0".equals(tag)) {
                    return new FragmentImageCropBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_image_crop is invalid. Received: " + tag);
            case 9:
                if ("layout/fragment_image_pick_0".equals(tag)) {
                    return new FragmentImagePickBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_image_pick is invalid. Received: " + tag);
            case 10:
                if ("layout/popup_window_note_info_0".equals(tag)) {
                    return new PopupWindowNoteInfoBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popup_window_note_info is invalid. Received: " + tag);
            case 11:
                if ("layout/view_note_info_share_to_me_0".equals(tag)) {
                    return new ViewNoteInfoShareToMeBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_note_info_share_to_me is invalid. Received: " + tag);
            default:
                return null;
        }
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = (Integer) C5921b.f5531a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i10) {
        if (viewArr == null || viewArr.length == 0 || f5529a.get(i10) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
