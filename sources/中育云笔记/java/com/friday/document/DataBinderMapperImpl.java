package com.friday.document;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.friday.document.databinding.ActivityImagePreviewBindingImpl;
import com.friday.document.databinding.ActivityMicroClassPlayerBindingImpl;
import com.friday.document.databinding.ActivityOfficeWebBindingImpl;
import com.friday.document.databinding.ActivityTeacherOnlyBindingImpl;
import com.friday.document.databinding.ActivityTxtEditBindingImpl;
import com.friday.document.databinding.ActivityVideoPlayerBindingImpl;
import com.friday.document.databinding.DialogImageViewPagerBindingImpl;
import com.friday.document.databinding.DialogSyncFileBindingImpl;
import com.friday.document.databinding.DocumentFragmentBindingImpl;
import com.friday.document.databinding.FolderFragmentBindingImpl;
import com.friday.document.databinding.FragmentFileListBindingImpl;
import com.friday.document.databinding.FragmentPreviewEmptyBindingImpl;
import com.friday.document.databinding.FragmentPreviewMicroClassBindingImpl;
import com.friday.document.databinding.FragmentPreviewNoteBindingImpl;
import com.friday.document.databinding.FragmentPreviewPdfBindingImpl;
import com.friday.document.databinding.FragmentPreviewPicBindingImpl;
import com.friday.document.databinding.FragmentPreviewTxtBindingImpl;
import com.friday.document.databinding.FragmentPreviewVideoBindingImpl;
import com.friday.document.databinding.FragmentRecycleBinBindingImpl;
import com.friday.document.databinding.FragmentShareByTeacherBindingImpl;
import com.friday.document.databinding.FragmentShareFileBindingImpl;
import com.friday.document.databinding.FragmentStudentShareBindingImpl;
import com.friday.document.databinding.IncludePreviewTitleBindingImpl;
import com.friday.document.databinding.ItemFragmentShareByTeacherBindingImpl;
import com.friday.document.databinding.ItemListTeacherFileShareBindingImpl;
import com.friday.document.databinding.ItemNoteListBindingImpl;
import com.friday.document.databinding.ItemNoteThumbnailBindingImpl;
import com.friday.document.databinding.ItemPhotoPreviewBindingImpl;
import com.friday.document.databinding.ItemRecycleBinBindingImpl;
import com.friday.document.databinding.ItemShareSearchBindingImpl;
import com.friday.document.databinding.LayoutEmptyNoShareBindingImpl;
import com.friday.document.databinding.LayoutEmptyPreviewBindingImpl;
import com.friday.document.databinding.LayoutFileBrowserBindingImpl;
import com.friday.document.databinding.LayoutFileFolderBindingImpl;
import com.friday.document.databinding.LayoutNotePreviewBindingImpl;
import com.friday.document.databinding.LayoutNotePreviewOthersBindingImpl;
import com.friday.document.databinding.LayoutShareNotePreviewBindingImpl;
import com.friday.document.databinding.PopSortBindingImpl;
import com.friday.document.databinding.PreviewFragmentBindingImpl;
import com.friday.document.databinding.RecyclePreviewFragmentBindingImpl;
import com.friday.document.databinding.SharePreviewFragmentBindingImpl;
import com.friday.document.databinding.ShareSearchActivityBindingImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a */
    public static final SparseIntArray f6197a;

    /* renamed from: com.friday.document.DataBinderMapperImpl$a */
    public static class C5976a {

        /* renamed from: a */
        public static final SparseArray f6198a;

        static {
            SparseArray sparseArray = new SparseArray(3);
            f6198a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "isInMultiSelectMode");
            sparseArray.put(2, "isSelectFunctionEnable");
        }
    }

    /* renamed from: com.friday.document.DataBinderMapperImpl$b */
    public static class C5977b {

        /* renamed from: a */
        public static final HashMap f6199a;

        static {
            HashMap map = new HashMap(42);
            f6199a = map;
            map.put("layout/activity_image_preview_0", Integer.valueOf(R$layout.activity_image_preview));
            map.put("layout/activity_micro_class_player_0", Integer.valueOf(R$layout.activity_micro_class_player));
            map.put("layout/activity_office_web_0", Integer.valueOf(R$layout.activity_office_web));
            map.put("layout/activity_teacher_only_0", Integer.valueOf(R$layout.activity_teacher_only));
            map.put("layout/activity_txt_edit_0", Integer.valueOf(R$layout.activity_txt_edit));
            map.put("layout/activity_video_player_0", Integer.valueOf(R$layout.activity_video_player));
            map.put("layout/dialog_image_view_pager_0", Integer.valueOf(R$layout.dialog_image_view_pager));
            map.put("layout/dialog_sync_file_0", Integer.valueOf(R$layout.dialog_sync_file));
            map.put("layout/document_fragment_0", Integer.valueOf(R$layout.document_fragment));
            map.put("layout/folder_fragment_0", Integer.valueOf(R$layout.folder_fragment));
            map.put("layout/fragment_file_list_0", Integer.valueOf(R$layout.fragment_file_list));
            map.put("layout/fragment_preview_empty_0", Integer.valueOf(R$layout.fragment_preview_empty));
            map.put("layout/fragment_preview_micro_class_0", Integer.valueOf(R$layout.fragment_preview_micro_class));
            map.put("layout/fragment_preview_note_0", Integer.valueOf(R$layout.fragment_preview_note));
            map.put("layout/fragment_preview_pdf_0", Integer.valueOf(R$layout.fragment_preview_pdf));
            map.put("layout/fragment_preview_pic_0", Integer.valueOf(R$layout.fragment_preview_pic));
            map.put("layout/fragment_preview_txt_0", Integer.valueOf(R$layout.fragment_preview_txt));
            map.put("layout/fragment_preview_video_0", Integer.valueOf(R$layout.fragment_preview_video));
            map.put("layout/fragment_recycle_bin_0", Integer.valueOf(R$layout.fragment_recycle_bin));
            map.put("layout/fragment_share_by_teacher_0", Integer.valueOf(R$layout.fragment_share_by_teacher));
            map.put("layout/fragment_share_file_0", Integer.valueOf(R$layout.fragment_share_file));
            map.put("layout/fragment_student_share_0", Integer.valueOf(R$layout.fragment_student_share));
            map.put("layout/include_preview_title_0", Integer.valueOf(R$layout.include_preview_title));
            map.put("layout/item_fragment_share_by_teacher_0", Integer.valueOf(R$layout.item_fragment_share_by_teacher));
            map.put("layout/item_list_teacher_file_share_0", Integer.valueOf(R$layout.item_list_teacher_file_share));
            map.put("layout/item_note_list_0", Integer.valueOf(R$layout.item_note_list));
            map.put("layout/item_note_thumbnail_0", Integer.valueOf(R$layout.item_note_thumbnail));
            map.put("layout/item_photo_preview_0", Integer.valueOf(R$layout.item_photo_preview));
            map.put("layout/item_recycle_bin_0", Integer.valueOf(R$layout.item_recycle_bin));
            map.put("layout/item_share_search_0", Integer.valueOf(R$layout.item_share_search));
            map.put("layout/layout_empty_no_share_0", Integer.valueOf(R$layout.layout_empty_no_share));
            map.put("layout/layout_empty_preview_0", Integer.valueOf(R$layout.layout_empty_preview));
            map.put("layout/layout_file_browser_0", Integer.valueOf(R$layout.layout_file_browser));
            map.put("layout/layout_file_folder_0", Integer.valueOf(R$layout.layout_file_folder));
            map.put("layout/layout_note_preview_0", Integer.valueOf(R$layout.layout_note_preview));
            map.put("layout/layout_note_preview_others_0", Integer.valueOf(R$layout.layout_note_preview_others));
            map.put("layout/layout_share_note_preview_0", Integer.valueOf(R$layout.layout_share_note_preview));
            map.put("layout/pop_sort_0", Integer.valueOf(R$layout.pop_sort));
            map.put("layout/preview_fragment_0", Integer.valueOf(R$layout.preview_fragment));
            map.put("layout/recycle_preview_fragment_0", Integer.valueOf(R$layout.recycle_preview_fragment));
            map.put("layout/share_preview_fragment_0", Integer.valueOf(R$layout.share_preview_fragment));
            map.put("layout/share_search_activity_0", Integer.valueOf(R$layout.share_search_activity));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(42);
        f6197a = sparseIntArray;
        sparseIntArray.put(R$layout.activity_image_preview, 1);
        sparseIntArray.put(R$layout.activity_micro_class_player, 2);
        sparseIntArray.put(R$layout.activity_office_web, 3);
        sparseIntArray.put(R$layout.activity_teacher_only, 4);
        sparseIntArray.put(R$layout.activity_txt_edit, 5);
        sparseIntArray.put(R$layout.activity_video_player, 6);
        sparseIntArray.put(R$layout.dialog_image_view_pager, 7);
        sparseIntArray.put(R$layout.dialog_sync_file, 8);
        sparseIntArray.put(R$layout.document_fragment, 9);
        sparseIntArray.put(R$layout.folder_fragment, 10);
        sparseIntArray.put(R$layout.fragment_file_list, 11);
        sparseIntArray.put(R$layout.fragment_preview_empty, 12);
        sparseIntArray.put(R$layout.fragment_preview_micro_class, 13);
        sparseIntArray.put(R$layout.fragment_preview_note, 14);
        sparseIntArray.put(R$layout.fragment_preview_pdf, 15);
        sparseIntArray.put(R$layout.fragment_preview_pic, 16);
        sparseIntArray.put(R$layout.fragment_preview_txt, 17);
        sparseIntArray.put(R$layout.fragment_preview_video, 18);
        sparseIntArray.put(R$layout.fragment_recycle_bin, 19);
        sparseIntArray.put(R$layout.fragment_share_by_teacher, 20);
        sparseIntArray.put(R$layout.fragment_share_file, 21);
        sparseIntArray.put(R$layout.fragment_student_share, 22);
        sparseIntArray.put(R$layout.include_preview_title, 23);
        sparseIntArray.put(R$layout.item_fragment_share_by_teacher, 24);
        sparseIntArray.put(R$layout.item_list_teacher_file_share, 25);
        sparseIntArray.put(R$layout.item_note_list, 26);
        sparseIntArray.put(R$layout.item_note_thumbnail, 27);
        sparseIntArray.put(R$layout.item_photo_preview, 28);
        sparseIntArray.put(R$layout.item_recycle_bin, 29);
        sparseIntArray.put(R$layout.item_share_search, 30);
        sparseIntArray.put(R$layout.layout_empty_no_share, 31);
        sparseIntArray.put(R$layout.layout_empty_preview, 32);
        sparseIntArray.put(R$layout.layout_file_browser, 33);
        sparseIntArray.put(R$layout.layout_file_folder, 34);
        sparseIntArray.put(R$layout.layout_note_preview, 35);
        sparseIntArray.put(R$layout.layout_note_preview_others, 36);
        sparseIntArray.put(R$layout.layout_share_note_preview, 37);
        sparseIntArray.put(R$layout.pop_sort, 38);
        sparseIntArray.put(R$layout.preview_fragment, 39);
        sparseIntArray.put(R$layout.recycle_preview_fragment, 40);
        sparseIntArray.put(R$layout.share_preview_fragment, 41);
        sparseIntArray.put(R$layout.share_search_activity, 42);
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
        return (String) C5976a.f6198a.get(i10);
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i10) {
        int i11 = f6197a.get(i10);
        if (i11 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        switch (i11) {
            case 1:
                if ("layout/activity_image_preview_0".equals(tag)) {
                    return new ActivityImagePreviewBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_image_preview is invalid. Received: " + tag);
            case 2:
                if ("layout/activity_micro_class_player_0".equals(tag)) {
                    return new ActivityMicroClassPlayerBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_micro_class_player is invalid. Received: " + tag);
            case 3:
                if ("layout/activity_office_web_0".equals(tag)) {
                    return new ActivityOfficeWebBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_office_web is invalid. Received: " + tag);
            case 4:
                if ("layout/activity_teacher_only_0".equals(tag)) {
                    return new ActivityTeacherOnlyBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_teacher_only is invalid. Received: " + tag);
            case 5:
                if ("layout/activity_txt_edit_0".equals(tag)) {
                    return new ActivityTxtEditBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_txt_edit is invalid. Received: " + tag);
            case 6:
                if ("layout/activity_video_player_0".equals(tag)) {
                    return new ActivityVideoPlayerBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_video_player is invalid. Received: " + tag);
            case 7:
                if ("layout/dialog_image_view_pager_0".equals(tag)) {
                    return new DialogImageViewPagerBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialog_image_view_pager is invalid. Received: " + tag);
            case 8:
                if ("layout/dialog_sync_file_0".equals(tag)) {
                    return new DialogSyncFileBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialog_sync_file is invalid. Received: " + tag);
            case 9:
                if ("layout/document_fragment_0".equals(tag)) {
                    return new DocumentFragmentBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for document_fragment is invalid. Received: " + tag);
            case 10:
                if ("layout/folder_fragment_0".equals(tag)) {
                    return new FolderFragmentBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for folder_fragment is invalid. Received: " + tag);
            case 11:
                if ("layout/fragment_file_list_0".equals(tag)) {
                    return new FragmentFileListBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_file_list is invalid. Received: " + tag);
            case 12:
                if ("layout/fragment_preview_empty_0".equals(tag)) {
                    return new FragmentPreviewEmptyBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_preview_empty is invalid. Received: " + tag);
            case 13:
                if ("layout/fragment_preview_micro_class_0".equals(tag)) {
                    return new FragmentPreviewMicroClassBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_preview_micro_class is invalid. Received: " + tag);
            case 14:
                if ("layout/fragment_preview_note_0".equals(tag)) {
                    return new FragmentPreviewNoteBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_preview_note is invalid. Received: " + tag);
            case 15:
                if ("layout/fragment_preview_pdf_0".equals(tag)) {
                    return new FragmentPreviewPdfBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_preview_pdf is invalid. Received: " + tag);
            case 16:
                if ("layout/fragment_preview_pic_0".equals(tag)) {
                    return new FragmentPreviewPicBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_preview_pic is invalid. Received: " + tag);
            case 17:
                if ("layout/fragment_preview_txt_0".equals(tag)) {
                    return new FragmentPreviewTxtBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_preview_txt is invalid. Received: " + tag);
            case 18:
                if ("layout/fragment_preview_video_0".equals(tag)) {
                    return new FragmentPreviewVideoBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_preview_video is invalid. Received: " + tag);
            case 19:
                if ("layout/fragment_recycle_bin_0".equals(tag)) {
                    return new FragmentRecycleBinBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_recycle_bin is invalid. Received: " + tag);
            case 20:
                if ("layout/fragment_share_by_teacher_0".equals(tag)) {
                    return new FragmentShareByTeacherBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_share_by_teacher is invalid. Received: " + tag);
            case 21:
                if ("layout/fragment_share_file_0".equals(tag)) {
                    return new FragmentShareFileBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_share_file is invalid. Received: " + tag);
            case 22:
                if ("layout/fragment_student_share_0".equals(tag)) {
                    return new FragmentStudentShareBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_student_share is invalid. Received: " + tag);
            case 23:
                if ("layout/include_preview_title_0".equals(tag)) {
                    return new IncludePreviewTitleBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for include_preview_title is invalid. Received: " + tag);
            case 24:
                if ("layout/item_fragment_share_by_teacher_0".equals(tag)) {
                    return new ItemFragmentShareByTeacherBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_fragment_share_by_teacher is invalid. Received: " + tag);
            case 25:
                if ("layout/item_list_teacher_file_share_0".equals(tag)) {
                    return new ItemListTeacherFileShareBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_list_teacher_file_share is invalid. Received: " + tag);
            case 26:
                if ("layout/item_note_list_0".equals(tag)) {
                    return new ItemNoteListBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_note_list is invalid. Received: " + tag);
            case 27:
                if ("layout/item_note_thumbnail_0".equals(tag)) {
                    return new ItemNoteThumbnailBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_note_thumbnail is invalid. Received: " + tag);
            case 28:
                if ("layout/item_photo_preview_0".equals(tag)) {
                    return new ItemPhotoPreviewBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_photo_preview is invalid. Received: " + tag);
            case 29:
                if ("layout/item_recycle_bin_0".equals(tag)) {
                    return new ItemRecycleBinBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_recycle_bin is invalid. Received: " + tag);
            case 30:
                if ("layout/item_share_search_0".equals(tag)) {
                    return new ItemShareSearchBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_share_search is invalid. Received: " + tag);
            case 31:
                if ("layout/layout_empty_no_share_0".equals(tag)) {
                    return new LayoutEmptyNoShareBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_empty_no_share is invalid. Received: " + tag);
            case 32:
                if ("layout/layout_empty_preview_0".equals(tag)) {
                    return new LayoutEmptyPreviewBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_empty_preview is invalid. Received: " + tag);
            case 33:
                if ("layout/layout_file_browser_0".equals(tag)) {
                    return new LayoutFileBrowserBindingImpl(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for layout_file_browser is invalid. Received: " + tag);
            case 34:
                if ("layout/layout_file_folder_0".equals(tag)) {
                    return new LayoutFileFolderBindingImpl(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for layout_file_folder is invalid. Received: " + tag);
            case 35:
                if ("layout/layout_note_preview_0".equals(tag)) {
                    return new LayoutNotePreviewBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_note_preview is invalid. Received: " + tag);
            case 36:
                if ("layout/layout_note_preview_others_0".equals(tag)) {
                    return new LayoutNotePreviewOthersBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_note_preview_others is invalid. Received: " + tag);
            case 37:
                if ("layout/layout_share_note_preview_0".equals(tag)) {
                    return new LayoutShareNotePreviewBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_share_note_preview is invalid. Received: " + tag);
            case 38:
                if ("layout/pop_sort_0".equals(tag)) {
                    return new PopSortBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for pop_sort is invalid. Received: " + tag);
            case 39:
                if ("layout/preview_fragment_0".equals(tag)) {
                    return new PreviewFragmentBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for preview_fragment is invalid. Received: " + tag);
            case 40:
                if ("layout/recycle_preview_fragment_0".equals(tag)) {
                    return new RecyclePreviewFragmentBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for recycle_preview_fragment is invalid. Received: " + tag);
            case 41:
                if ("layout/share_preview_fragment_0".equals(tag)) {
                    return new SharePreviewFragmentBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for share_preview_fragment is invalid. Received: " + tag);
            case 42:
                if ("layout/share_search_activity_0".equals(tag)) {
                    return new ShareSearchActivityBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for share_search_activity is invalid. Received: " + tag);
            default:
                return null;
        }
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = (Integer) C5977b.f6199a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i10) {
        int i11;
        if (viewArr != null && viewArr.length != 0 && (i11 = f6197a.get(i10)) > 0) {
            Object tag = viewArr[0].getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            if (i11 == 33) {
                if ("layout/layout_file_browser_0".equals(tag)) {
                    return new LayoutFileBrowserBindingImpl(dataBindingComponent, viewArr);
                }
                throw new IllegalArgumentException("The tag for layout_file_browser is invalid. Received: " + tag);
            }
            if (i11 == 34) {
                if ("layout/layout_file_folder_0".equals(tag)) {
                    return new LayoutFileFolderBindingImpl(dataBindingComponent, viewArr);
                }
                throw new IllegalArgumentException("The tag for layout_file_folder is invalid. Received: " + tag);
            }
        }
        return null;
    }
}
