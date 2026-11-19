package com.friday.main;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.friday.main.databinding.DialogVersionUpdateBindingImpl;
import com.friday.main.databinding.FolderMoveActivityBindingImpl;
import com.friday.main.databinding.FullScreenActivityBindingImpl;
import com.friday.main.databinding.HomeActivityBindingImpl;
import com.friday.main.databinding.ItemSearchBindingImpl;
import com.friday.main.databinding.LayoutTabBindingImpl;
import com.friday.main.databinding.PopupWindowCreateNewBindingImpl;
import com.friday.main.databinding.PopupWindowDbDebugBindingImpl;
import com.friday.main.databinding.ResItemFolderBindingImpl;
import com.friday.main.databinding.SearchActivityBindingImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes4.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a */
    public static final SparseIntArray f9098a;

    /* renamed from: com.friday.main.DataBinderMapperImpl$a */
    public static class C6181a {

        /* renamed from: a */
        public static final SparseArray f9099a;

        static {
            SparseArray sparseArray = new SparseArray(2);
            f9099a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "vm");
        }
    }

    /* renamed from: com.friday.main.DataBinderMapperImpl$b */
    public static class C6182b {

        /* renamed from: a */
        public static final HashMap f9100a;

        static {
            HashMap map = new HashMap(10);
            f9100a = map;
            map.put("layout/dialog_version_update_0", Integer.valueOf(R$layout.dialog_version_update));
            map.put("layout/folder_move_activity_0", Integer.valueOf(R$layout.folder_move_activity));
            map.put("layout/full_screen_activity_0", Integer.valueOf(R$layout.full_screen_activity));
            map.put("layout/home_activity_0", Integer.valueOf(R$layout.home_activity));
            map.put("layout/item_search_0", Integer.valueOf(R$layout.item_search));
            map.put("layout/layout_tab_0", Integer.valueOf(R$layout.layout_tab));
            map.put("layout/popup_window_create_new_0", Integer.valueOf(R$layout.popup_window_create_new));
            map.put("layout/popup_window_db_debug_0", Integer.valueOf(R$layout.popup_window_db_debug));
            map.put("layout/res_item_folder_0", Integer.valueOf(R$layout.res_item_folder));
            map.put("layout/search_activity_0", Integer.valueOf(R$layout.search_activity));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(10);
        f9098a = sparseIntArray;
        sparseIntArray.put(R$layout.dialog_version_update, 1);
        sparseIntArray.put(R$layout.folder_move_activity, 2);
        sparseIntArray.put(R$layout.full_screen_activity, 3);
        sparseIntArray.put(R$layout.home_activity, 4);
        sparseIntArray.put(R$layout.item_search, 5);
        sparseIntArray.put(R$layout.layout_tab, 6);
        sparseIntArray.put(R$layout.popup_window_create_new, 7);
        sparseIntArray.put(R$layout.popup_window_db_debug, 8);
        sparseIntArray.put(R$layout.res_item_folder, 9);
        sparseIntArray.put(R$layout.search_activity, 10);
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
        return (String) C6181a.f9099a.get(i10);
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i10) {
        int i11 = f9098a.get(i10);
        if (i11 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        switch (i11) {
            case 1:
                if ("layout/dialog_version_update_0".equals(tag)) {
                    return new DialogVersionUpdateBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialog_version_update is invalid. Received: " + tag);
            case 2:
                if ("layout/folder_move_activity_0".equals(tag)) {
                    return new FolderMoveActivityBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for folder_move_activity is invalid. Received: " + tag);
            case 3:
                if ("layout/full_screen_activity_0".equals(tag)) {
                    return new FullScreenActivityBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for full_screen_activity is invalid. Received: " + tag);
            case 4:
                if ("layout/home_activity_0".equals(tag)) {
                    return new HomeActivityBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for home_activity is invalid. Received: " + tag);
            case 5:
                if ("layout/item_search_0".equals(tag)) {
                    return new ItemSearchBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_search is invalid. Received: " + tag);
            case 6:
                if ("layout/layout_tab_0".equals(tag)) {
                    return new LayoutTabBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_tab is invalid. Received: " + tag);
            case 7:
                if ("layout/popup_window_create_new_0".equals(tag)) {
                    return new PopupWindowCreateNewBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popup_window_create_new is invalid. Received: " + tag);
            case 8:
                if ("layout/popup_window_db_debug_0".equals(tag)) {
                    return new PopupWindowDbDebugBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popup_window_db_debug is invalid. Received: " + tag);
            case 9:
                if ("layout/res_item_folder_0".equals(tag)) {
                    return new ResItemFolderBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for res_item_folder is invalid. Received: " + tag);
            case 10:
                if ("layout/search_activity_0".equals(tag)) {
                    return new SearchActivityBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for search_activity is invalid. Received: " + tag);
            default:
                return null;
        }
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = (Integer) C6182b.f9100a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i10) {
        if (viewArr == null || viewArr.length == 0 || f9098a.get(i10) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
