package com.friday.login;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.friday.login.databinding.DialogSmsVerificationBindingImpl;
import com.friday.login.databinding.LoginActivityBindingImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes4.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a */
    public static final SparseIntArray f8965a;

    /* renamed from: com.friday.login.DataBinderMapperImpl$a */
    public static class C6168a {

        /* renamed from: a */
        public static final SparseArray f8966a;

        static {
            SparseArray sparseArray = new SparseArray(1);
            f8966a = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    /* renamed from: com.friday.login.DataBinderMapperImpl$b */
    public static class C6169b {

        /* renamed from: a */
        public static final HashMap f8967a;

        static {
            HashMap map = new HashMap(2);
            f8967a = map;
            map.put("layout/dialog_sms_verification_0", Integer.valueOf(R$layout.dialog_sms_verification));
            map.put("layout/login_activity_0", Integer.valueOf(R$layout.login_activity));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(2);
        f8965a = sparseIntArray;
        sparseIntArray.put(R$layout.dialog_sms_verification, 1);
        sparseIntArray.put(R$layout.login_activity, 2);
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
        return (String) C6168a.f8966a.get(i10);
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i10) {
        int i11 = f8965a.get(i10);
        if (i11 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i11 == 1) {
            if ("layout/dialog_sms_verification_0".equals(tag)) {
                return new DialogSmsVerificationBindingImpl(dataBindingComponent, view);
            }
            throw new IllegalArgumentException("The tag for dialog_sms_verification is invalid. Received: " + tag);
        }
        if (i11 != 2) {
            return null;
        }
        if ("layout/login_activity_0".equals(tag)) {
            return new LoginActivityBindingImpl(dataBindingComponent, view);
        }
        throw new IllegalArgumentException("The tag for login_activity is invalid. Received: " + tag);
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = (Integer) C6169b.f8967a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i10) {
        if (viewArr == null || viewArr.length == 0 || f8965a.get(i10) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
