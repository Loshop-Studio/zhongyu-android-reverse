package com.zykj.lib.login;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.lib.login.databinding.LoginDialogChangePwdBindingImpl;
import com.zykj.lib.login.databinding.LoginDialogSendSmsBindingImpl;
import com.zykj.lib.login.databinding.LoginFragmentLoginBindingImpl;
import com.zykj.lib.login.databinding.LoginFragmentLoginStudentBindingImpl;
import com.zykj.lib.login.databinding.LoginFragmentLoginTeacherBindingImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes4.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a */
    public static final SparseIntArray f9834a;

    /* renamed from: com.zykj.lib.login.DataBinderMapperImpl$a */
    public static class C7314a {

        /* renamed from: a */
        public static final SparseArray f9835a;

        static {
            SparseArray sparseArray = new SparseArray(4);
            f9835a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "loginViewModel");
            sparseArray.put(2, "mobile");
            sparseArray.put(3, "viewModel");
        }
    }

    /* renamed from: com.zykj.lib.login.DataBinderMapperImpl$b */
    public static class C7315b {

        /* renamed from: a */
        public static final HashMap f9836a;

        static {
            HashMap map = new HashMap(5);
            f9836a = map;
            map.put("layout/login_dialog_change_pwd_0", Integer.valueOf(R$layout.login_dialog_change_pwd));
            map.put("layout/login_dialog_send_sms_0", Integer.valueOf(R$layout.login_dialog_send_sms));
            map.put("layout/login_fragment_login_0", Integer.valueOf(R$layout.login_fragment_login));
            map.put("layout/login_fragment_login_student_0", Integer.valueOf(R$layout.login_fragment_login_student));
            map.put("layout/login_fragment_login_teacher_0", Integer.valueOf(R$layout.login_fragment_login_teacher));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(5);
        f9834a = sparseIntArray;
        sparseIntArray.put(R$layout.login_dialog_change_pwd, 1);
        sparseIntArray.put(R$layout.login_dialog_send_sms, 2);
        sparseIntArray.put(R$layout.login_fragment_login, 3);
        sparseIntArray.put(R$layout.login_fragment_login_student, 4);
        sparseIntArray.put(R$layout.login_fragment_login_teacher, 5);
    }

    @Override // androidx.databinding.DataBinderMapper
    public List collectDependencies() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.zykj.base.DataBinderMapperImpl());
        arrayList.add(new com.zykj.policy.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int i10) {
        return (String) C7314a.f9835a.get(i10);
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i10) {
        int i11 = f9834a.get(i10);
        if (i11 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i11 == 1) {
            if ("layout/login_dialog_change_pwd_0".equals(tag)) {
                return new LoginDialogChangePwdBindingImpl(dataBindingComponent, view);
            }
            throw new IllegalArgumentException("The tag for login_dialog_change_pwd is invalid. Received: " + tag);
        }
        if (i11 == 2) {
            if ("layout/login_dialog_send_sms_0".equals(tag)) {
                return new LoginDialogSendSmsBindingImpl(dataBindingComponent, view);
            }
            throw new IllegalArgumentException("The tag for login_dialog_send_sms is invalid. Received: " + tag);
        }
        if (i11 == 3) {
            if ("layout/login_fragment_login_0".equals(tag)) {
                return new LoginFragmentLoginBindingImpl(dataBindingComponent, view);
            }
            throw new IllegalArgumentException("The tag for login_fragment_login is invalid. Received: " + tag);
        }
        if (i11 == 4) {
            if ("layout/login_fragment_login_student_0".equals(tag)) {
                return new LoginFragmentLoginStudentBindingImpl(dataBindingComponent, view);
            }
            throw new IllegalArgumentException("The tag for login_fragment_login_student is invalid. Received: " + tag);
        }
        if (i11 != 5) {
            return null;
        }
        if ("layout/login_fragment_login_teacher_0".equals(tag)) {
            return new LoginFragmentLoginTeacherBindingImpl(dataBindingComponent, view);
        }
        throw new IllegalArgumentException("The tag for login_fragment_login_teacher is invalid. Received: " + tag);
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = (Integer) C7315b.f9836a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i10) {
        if (viewArr == null || viewArr.length == 0 || f9834a.get(i10) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
