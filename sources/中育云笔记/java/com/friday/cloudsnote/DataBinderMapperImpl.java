package com.friday.cloudsnote;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.friday.cloudsnote.databinding.MainActivityBindingImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a */
    public static final SparseIntArray f5445a;

    /* renamed from: com.friday.cloudsnote.DataBinderMapperImpl$a */
    public static class C5913a {

        /* renamed from: a */
        public static final SparseArray f5446a;

        static {
            SparseArray sparseArray = new SparseArray(4);
            f5446a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "isInMultiSelectMode");
            sparseArray.put(2, "isSelectFunctionEnable");
            sparseArray.put(3, "vm");
        }
    }

    /* renamed from: com.friday.cloudsnote.DataBinderMapperImpl$b */
    public static class C5914b {

        /* renamed from: a */
        public static final HashMap f5447a;

        static {
            HashMap map = new HashMap(1);
            f5447a = map;
            map.put("layout/main_activity_0", Integer.valueOf(R.layout.main_activity));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(1);
        f5445a = sparseIntArray;
        sparseIntArray.put(R.layout.main_activity, 1);
    }

    @Override // androidx.databinding.DataBinderMapper
    public List collectDependencies() {
        ArrayList arrayList = new ArrayList(12);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.friday.common.DataBinderMapperImpl());
        arrayList.add(new com.friday.document.DataBinderMapperImpl());
        arrayList.add(new com.friday.lecture.DataBinderMapperImpl());
        arrayList.add(new com.friday.login.DataBinderMapperImpl());
        arrayList.add(new com.friday.main.DataBinderMapperImpl());
        arrayList.add(new com.friday.paint.DataBinderMapperImpl());
        arrayList.add(new com.friday.user.DataBinderMapperImpl());
        arrayList.add(new com.zykj.cloudhelper.DataBinderMapperImpl());
        arrayList.add(new com.zykj.download.DataBinderMapperImpl());
        arrayList.add(new com.zykj.policy.DataBinderMapperImpl());
        arrayList.add(new com.zykj.view.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int i10) {
        return (String) C5913a.f5446a.get(i10);
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i10) {
        int i11 = f5445a.get(i10);
        if (i11 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i11 != 1) {
            return null;
        }
        if ("layout/main_activity_0".equals(tag)) {
            return new MainActivityBindingImpl(dataBindingComponent, view);
        }
        throw new IllegalArgumentException("The tag for main_activity is invalid. Received: " + tag);
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = (Integer) C5914b.f5447a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i10) {
        if (viewArr == null || viewArr.length == 0 || f5445a.get(i10) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
