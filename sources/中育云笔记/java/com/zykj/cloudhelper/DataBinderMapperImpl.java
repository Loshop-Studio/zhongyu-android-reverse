package com.zykj.cloudhelper;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.cloudhelper.databinding.ActivityNoteManagerBindingImpl;
import com.zykj.cloudhelper.databinding.FragmentPickNoteBindingImpl;
import com.zykj.cloudhelper.databinding.FragmentStoreNoteBindingImpl;
import com.zykj.cloudhelper.databinding.NoteHelperCreateFolderBindingImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes6.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a */
    public static final SparseIntArray f19412a;

    /* renamed from: com.zykj.cloudhelper.DataBinderMapperImpl$a */
    public static class C8544a {

        /* renamed from: a */
        public static final SparseArray f19413a;

        static {
            SparseArray sparseArray = new SparseArray(1);
            f19413a = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    /* renamed from: com.zykj.cloudhelper.DataBinderMapperImpl$b */
    public static class C8545b {

        /* renamed from: a */
        public static final HashMap f19414a;

        static {
            HashMap map = new HashMap(4);
            f19414a = map;
            map.put("layout/activity_note_manager_0", Integer.valueOf(R$layout.activity_note_manager));
            map.put("layout/fragment_pick_note_0", Integer.valueOf(R$layout.fragment_pick_note));
            map.put("layout/fragment_store_note_0", Integer.valueOf(R$layout.fragment_store_note));
            map.put("layout/note_helper_create_folder_0", Integer.valueOf(R$layout.note_helper_create_folder));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(4);
        f19412a = sparseIntArray;
        sparseIntArray.put(R$layout.activity_note_manager, 1);
        sparseIntArray.put(R$layout.fragment_pick_note, 2);
        sparseIntArray.put(R$layout.fragment_store_note, 3);
        sparseIntArray.put(R$layout.note_helper_create_folder, 4);
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
        return (String) C8544a.f19413a.get(i10);
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i10) {
        int i11 = f19412a.get(i10);
        if (i11 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i11 == 1) {
            if ("layout/activity_note_manager_0".equals(tag)) {
                return new ActivityNoteManagerBindingImpl(dataBindingComponent, view);
            }
            throw new IllegalArgumentException("The tag for activity_note_manager is invalid. Received: " + tag);
        }
        if (i11 == 2) {
            if ("layout/fragment_pick_note_0".equals(tag)) {
                return new FragmentPickNoteBindingImpl(dataBindingComponent, view);
            }
            throw new IllegalArgumentException("The tag for fragment_pick_note is invalid. Received: " + tag);
        }
        if (i11 == 3) {
            if ("layout/fragment_store_note_0".equals(tag)) {
                return new FragmentStoreNoteBindingImpl(dataBindingComponent, view);
            }
            throw new IllegalArgumentException("The tag for fragment_store_note is invalid. Received: " + tag);
        }
        if (i11 != 4) {
            return null;
        }
        if ("layout/note_helper_create_folder_0".equals(tag)) {
            return new NoteHelperCreateFolderBindingImpl(dataBindingComponent, view);
        }
        throw new IllegalArgumentException("The tag for note_helper_create_folder is invalid. Received: " + tag);
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = (Integer) C8545b.f19414a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i10) {
        if (viewArr == null || viewArr.length == 0 || f19412a.get(i10) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
