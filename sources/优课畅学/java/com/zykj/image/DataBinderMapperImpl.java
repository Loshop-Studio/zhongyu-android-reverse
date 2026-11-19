package com.zykj.image;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.image.databinding.FragmentImageCropBindingImpl;
import com.zykj.image.databinding.FragmentImagePickBindingImpl;
import com.zykj.image.databinding.FragmentQrCodeBindingImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes4.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a */
    public static final SparseIntArray f9717a;

    /* renamed from: com.zykj.image.DataBinderMapperImpl$a */
    public static class C7301a {

        /* renamed from: a */
        public static final SparseArray f9718a;

        static {
            SparseArray sparseArray = new SparseArray(1);
            f9718a = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    /* renamed from: com.zykj.image.DataBinderMapperImpl$b */
    public static class C7302b {

        /* renamed from: a */
        public static final HashMap f9719a;

        static {
            HashMap map = new HashMap(3);
            f9719a = map;
            map.put("layout/fragment_image_crop_0", Integer.valueOf(R$layout.fragment_image_crop));
            map.put("layout/fragment_image_pick_0", Integer.valueOf(R$layout.fragment_image_pick));
            map.put("layout/fragment_qr_code_0", Integer.valueOf(R$layout.fragment_qr_code));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(3);
        f9717a = sparseIntArray;
        sparseIntArray.put(R$layout.fragment_image_crop, 1);
        sparseIntArray.put(R$layout.fragment_image_pick, 2);
        sparseIntArray.put(R$layout.fragment_qr_code, 3);
    }

    @Override // androidx.databinding.DataBinderMapper
    public List collectDependencies() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.zykj.base.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int i10) {
        return (String) C7301a.f9718a.get(i10);
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i10) {
        int i11 = f9717a.get(i10);
        if (i11 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i11 == 1) {
            if ("layout/fragment_image_crop_0".equals(tag)) {
                return new FragmentImageCropBindingImpl(dataBindingComponent, view);
            }
            throw new IllegalArgumentException("The tag for fragment_image_crop is invalid. Received: " + tag);
        }
        if (i11 == 2) {
            if ("layout/fragment_image_pick_0".equals(tag)) {
                return new FragmentImagePickBindingImpl(dataBindingComponent, view);
            }
            throw new IllegalArgumentException("The tag for fragment_image_pick is invalid. Received: " + tag);
        }
        if (i11 != 3) {
            return null;
        }
        if ("layout/fragment_qr_code_0".equals(tag)) {
            return new FragmentQrCodeBindingImpl(dataBindingComponent, view);
        }
        throw new IllegalArgumentException("The tag for fragment_qr_code is invalid. Received: " + tag);
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = (Integer) C7302b.f9719a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i10) {
        if (viewArr == null || viewArr.length == 0 || f9717a.get(i10) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
