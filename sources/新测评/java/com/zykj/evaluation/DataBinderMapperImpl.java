package com.zykj.evaluation;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.evaluation.databinding.DialogVersionUpgradeBindingImpl;
import com.zykj.evaluation.databinding.FragmentDatePickerBindingImpl;
import com.zykj.evaluation.databinding.FragmentWhiteBoardBindingImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes4.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a */
    public static final SparseIntArray f8618a;

    /* renamed from: com.zykj.evaluation.DataBinderMapperImpl$a */
    public static class C6851a {

        /* renamed from: a */
        public static final SparseArray f8619a;

        static {
            SparseArray sparseArray = new SparseArray(1);
            f8619a = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    /* renamed from: com.zykj.evaluation.DataBinderMapperImpl$b */
    public static class C6852b {

        /* renamed from: a */
        public static final HashMap f8620a;

        static {
            HashMap map = new HashMap(3);
            f8620a = map;
            map.put("layout/dialog_version_upgrade_0", Integer.valueOf(R.layout.dialog_version_upgrade));
            map.put("layout/fragment_date_picker_0", Integer.valueOf(R.layout.fragment_date_picker));
            map.put("layout/fragment_white_board_0", Integer.valueOf(R.layout.fragment_white_board));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(3);
        f8618a = sparseIntArray;
        sparseIntArray.put(R.layout.dialog_version_upgrade, 1);
        sparseIntArray.put(R.layout.fragment_date_picker, 2);
        sparseIntArray.put(R.layout.fragment_white_board, 3);
    }

    @Override // androidx.databinding.DataBinderMapper
    public List collectDependencies() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.zykj.base.DataBinderMapperImpl());
        arrayList.add(new com.zykj.view.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int i10) {
        return (String) C6851a.f8619a.get(i10);
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i10) {
        int i11 = f8618a.get(i10);
        if (i11 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i11 == 1) {
            if ("layout/dialog_version_upgrade_0".equals(tag)) {
                return new DialogVersionUpgradeBindingImpl(dataBindingComponent, view);
            }
            throw new IllegalArgumentException("The tag for dialog_version_upgrade is invalid. Received: " + tag);
        }
        if (i11 == 2) {
            if ("layout/fragment_date_picker_0".equals(tag)) {
                return new FragmentDatePickerBindingImpl(dataBindingComponent, view);
            }
            throw new IllegalArgumentException("The tag for fragment_date_picker is invalid. Received: " + tag);
        }
        if (i11 != 3) {
            return null;
        }
        if ("layout/fragment_white_board_0".equals(tag)) {
            return new FragmentWhiteBoardBindingImpl(dataBindingComponent, view);
        }
        throw new IllegalArgumentException("The tag for fragment_white_board is invalid. Received: " + tag);
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = (Integer) C6852b.f8620a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i10) {
        if (viewArr == null || viewArr.length == 0 || f8618a.get(i10) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
