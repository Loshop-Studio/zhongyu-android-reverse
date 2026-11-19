package com.zykj.download;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes6.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a */
    public static final SparseIntArray f19584a = new SparseIntArray(0);

    /* renamed from: com.zykj.download.DataBinderMapperImpl$a */
    public static class C8556a {

        /* renamed from: a */
        public static final SparseArray f19585a;

        static {
            SparseArray sparseArray = new SparseArray(1);
            f19585a = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    /* renamed from: com.zykj.download.DataBinderMapperImpl$b */
    public static class C8557b {

        /* renamed from: a */
        public static final HashMap f19586a = new HashMap(0);
    }

    @Override // androidx.databinding.DataBinderMapper
    public List collectDependencies() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int i10) {
        return (String) C8556a.f19585a.get(i10);
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i10) {
        if (f19584a.get(i10) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = (Integer) C8557b.f19586a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i10) {
        if (viewArr == null || viewArr.length == 0 || f19584a.get(i10) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
