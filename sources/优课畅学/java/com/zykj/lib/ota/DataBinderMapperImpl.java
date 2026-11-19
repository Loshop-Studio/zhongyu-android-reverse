package com.zykj.lib.ota;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.lib.ota.databinding.DialogCheckUpdateBindingImpl;
import com.zykj.lib.ota.databinding.DialogCheckVersionProgressBindingImpl;
import com.zykj.lib.ota.databinding.DialogDownloadBindingImpl;
import com.zykj.lib.ota.databinding.DialogLatestVersionBindingImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes4.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a */
    public static final SparseIntArray f10168a;

    /* renamed from: com.zykj.lib.ota.DataBinderMapperImpl$a */
    public static class C7362a {

        /* renamed from: a */
        public static final SparseArray f10169a;

        static {
            SparseArray sparseArray = new SparseArray(4);
            f10169a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "silence");
            sparseArray.put(2, "versionName");
            sparseArray.put(3, "versionViewModel");
        }
    }

    /* renamed from: com.zykj.lib.ota.DataBinderMapperImpl$b */
    public static class C7363b {

        /* renamed from: a */
        public static final HashMap f10170a;

        static {
            HashMap map = new HashMap(4);
            f10170a = map;
            map.put("layout/dialog_check_update_0", Integer.valueOf(R$layout.dialog_check_update));
            map.put("layout/dialog_check_version_progress_0", Integer.valueOf(R$layout.dialog_check_version_progress));
            map.put("layout/dialog_download_0", Integer.valueOf(R$layout.dialog_download));
            map.put("layout/dialog_latest_version_0", Integer.valueOf(R$layout.dialog_latest_version));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(4);
        f10168a = sparseIntArray;
        sparseIntArray.put(R$layout.dialog_check_update, 1);
        sparseIntArray.put(R$layout.dialog_check_version_progress, 2);
        sparseIntArray.put(R$layout.dialog_download, 3);
        sparseIntArray.put(R$layout.dialog_latest_version, 4);
    }

    @Override // androidx.databinding.DataBinderMapper
    public List collectDependencies() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.zykj.base.DataBinderMapperImpl());
        arrayList.add(new com.zykj.download.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int i10) {
        return (String) C7362a.f10169a.get(i10);
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i10) {
        int i11 = f10168a.get(i10);
        if (i11 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i11 == 1) {
            if ("layout/dialog_check_update_0".equals(tag)) {
                return new DialogCheckUpdateBindingImpl(dataBindingComponent, view);
            }
            throw new IllegalArgumentException("The tag for dialog_check_update is invalid. Received: " + tag);
        }
        if (i11 == 2) {
            if ("layout/dialog_check_version_progress_0".equals(tag)) {
                return new DialogCheckVersionProgressBindingImpl(dataBindingComponent, view);
            }
            throw new IllegalArgumentException("The tag for dialog_check_version_progress is invalid. Received: " + tag);
        }
        if (i11 == 3) {
            if ("layout/dialog_download_0".equals(tag)) {
                return new DialogDownloadBindingImpl(dataBindingComponent, view);
            }
            throw new IllegalArgumentException("The tag for dialog_download is invalid. Received: " + tag);
        }
        if (i11 != 4) {
            return null;
        }
        if ("layout/dialog_latest_version_0".equals(tag)) {
            return new DialogLatestVersionBindingImpl(dataBindingComponent, view);
        }
        throw new IllegalArgumentException("The tag for dialog_latest_version is invalid. Received: " + tag);
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = (Integer) C7363b.f10170a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i10) {
        if (viewArr == null || viewArr.length == 0 || f10168a.get(i10) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
