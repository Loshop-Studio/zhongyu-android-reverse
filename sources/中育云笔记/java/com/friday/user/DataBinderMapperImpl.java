package com.friday.user;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.friday.user.databinding.AuthorityFragmentBindingImpl;
import com.friday.user.databinding.PersonalFragmentBindingImpl;
import com.friday.user.databinding.UserFragmentBindingImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes5.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a */
    public static final SparseIntArray f10553a;

    /* renamed from: com.friday.user.DataBinderMapperImpl$a */
    public static class C6326a {

        /* renamed from: a */
        public static final SparseArray f10554a;

        static {
            SparseArray sparseArray = new SparseArray(2);
            f10554a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "vm");
        }
    }

    /* renamed from: com.friday.user.DataBinderMapperImpl$b */
    public static class C6327b {

        /* renamed from: a */
        public static final HashMap f10555a;

        static {
            HashMap map = new HashMap(3);
            f10555a = map;
            map.put("layout/authority_fragment_0", Integer.valueOf(R$layout.authority_fragment));
            map.put("layout/personal_fragment_0", Integer.valueOf(R$layout.personal_fragment));
            map.put("layout/user_fragment_0", Integer.valueOf(R$layout.user_fragment));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(3);
        f10553a = sparseIntArray;
        sparseIntArray.put(R$layout.authority_fragment, 1);
        sparseIntArray.put(R$layout.personal_fragment, 2);
        sparseIntArray.put(R$layout.user_fragment, 3);
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
        return (String) C6326a.f10554a.get(i10);
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i10) {
        int i11 = f10553a.get(i10);
        if (i11 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i11 == 1) {
            if ("layout/authority_fragment_0".equals(tag)) {
                return new AuthorityFragmentBindingImpl(dataBindingComponent, view);
            }
            throw new IllegalArgumentException("The tag for authority_fragment is invalid. Received: " + tag);
        }
        if (i11 == 2) {
            if ("layout/personal_fragment_0".equals(tag)) {
                return new PersonalFragmentBindingImpl(dataBindingComponent, view);
            }
            throw new IllegalArgumentException("The tag for personal_fragment is invalid. Received: " + tag);
        }
        if (i11 != 3) {
            return null;
        }
        if ("layout/user_fragment_0".equals(tag)) {
            return new UserFragmentBindingImpl(dataBindingComponent, view);
        }
        throw new IllegalArgumentException("The tag for user_fragment is invalid. Received: " + tag);
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = (Integer) C6327b.f10555a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i10) {
        if (viewArr == null || viewArr.length == 0 || f10553a.get(i10) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
