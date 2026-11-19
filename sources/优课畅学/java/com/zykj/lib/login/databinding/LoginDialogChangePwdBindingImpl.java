package com.zykj.lib.login.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.MutableLiveData;
import com.kunminx.architecture.p043ui.callback.UnPeekLiveData;
import com.zykj.base.view.LoadingDialogView;
import com.zykj.base.view.ToastView;
import com.zykj.lib.login.R$id;
import com.zykj.lib.login.p062ui.teacher.pwd.ChangePwdViewModel;
import p152k3.AbstractC9053a;
import p164l3.ViewOnClickListenerC9247a;

/* loaded from: classes4.dex */
public class LoginDialogChangePwdBindingImpl extends LoginDialogChangePwdBinding implements ViewOnClickListenerC9247a.a {

    /* renamed from: q */
    public static final ViewDataBinding.IncludedLayouts f9847q = null;

    /* renamed from: r */
    public static final SparseIntArray f9848r;

    /* renamed from: k */
    public final LinearLayout f9849k;

    /* renamed from: l */
    public final ToastView f9850l;

    /* renamed from: m */
    public final View.OnClickListener f9851m;

    /* renamed from: n */
    public InverseBindingListener f9852n;

    /* renamed from: o */
    public InverseBindingListener f9853o;

    /* renamed from: p */
    public long f9854p;

    /* renamed from: com.zykj.lib.login.databinding.LoginDialogChangePwdBindingImpl$a */
    public class C7316a implements InverseBindingListener {
        public C7316a() {
        }

        @Override // androidx.databinding.InverseBindingListener
        public void onChange() {
            MutableLiveData mutableLiveDataM9347d;
            String textString = TextViewBindingAdapter.getTextString(LoginDialogChangePwdBindingImpl.this.f9837a);
            ChangePwdViewModel changePwdViewModel = LoginDialogChangePwdBindingImpl.this.f9845i;
            if (changePwdViewModel == null || (mutableLiveDataM9347d = changePwdViewModel.m9347d()) == null) {
                return;
            }
            mutableLiveDataM9347d.setValue(textString);
        }
    }

    /* renamed from: com.zykj.lib.login.databinding.LoginDialogChangePwdBindingImpl$b */
    public class C7317b implements InverseBindingListener {
        public C7317b() {
        }

        @Override // androidx.databinding.InverseBindingListener
        public void onChange() {
            MutableLiveData mutableLiveDataM9348e;
            String textString = TextViewBindingAdapter.getTextString(LoginDialogChangePwdBindingImpl.this.f9838b);
            ChangePwdViewModel changePwdViewModel = LoginDialogChangePwdBindingImpl.this.f9845i;
            if (changePwdViewModel == null || (mutableLiveDataM9348e = changePwdViewModel.m9348e()) == null) {
                return;
            }
            mutableLiveDataM9348e.setValue(textString);
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f9848r = sparseIntArray;
        sparseIntArray.put(R$id.tv_title, 6);
        sparseIntArray.put(R$id.tv_hint, 7);
        sparseIntArray.put(R$id.ll_new_pwd, 8);
        sparseIntArray.put(R$id.ll_check_pwd, 9);
    }

    public LoginDialogChangePwdBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, f9847q, f9848r));
    }

    @Override // p164l3.ViewOnClickListenerC9247a.a
    public final void _internalCallbackOnClick(int i10, View view) {
        ChangePwdViewModel changePwdViewModel = this.f9845i;
        if (changePwdViewModel != null) {
            changePwdViewModel.m9350g();
        }
    }

    @Override // com.zykj.lib.login.databinding.LoginDialogChangePwdBinding
    /* renamed from: a */
    public void mo9240a(ChangePwdViewModel changePwdViewModel) {
        this.f9845i = changePwdViewModel;
        synchronized (this) {
            this.f9854p |= 64;
        }
        notifyPropertyChanged(AbstractC9053a.f17326d);
        super.requestRebind();
    }

    /* renamed from: b */
    public final boolean m9241b(MutableLiveData mutableLiveData, int i10) {
        if (i10 != AbstractC9053a.f17323a) {
            return false;
        }
        synchronized (this) {
            this.f9854p |= 4;
        }
        return true;
    }

    /* renamed from: d */
    public final boolean m9242d(MutableLiveData mutableLiveData, int i10) {
        if (i10 != AbstractC9053a.f17323a) {
            return false;
        }
        synchronized (this) {
            this.f9854p |= 16;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d3  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.lib.login.databinding.LoginDialogChangePwdBindingImpl.executeBindings():void"); // DEX body: android/优课畅学/smali_classes4/com/zykj/lib/login/databinding/LoginDialogChangePwdBindingImpl.smali:481
    }

    /* renamed from: h */
    public final boolean m9243h(MutableLiveData mutableLiveData, int i10) {
        if (i10 != AbstractC9053a.f17323a) {
            return false;
        }
        synchronized (this) {
            this.f9854p |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f9854p != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: i */
    public void m9244i(String str) {
        this.f9846j = str;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f9854p = 128L;
        }
        requestRebind();
    }

    public final boolean onChangeViewModelIsDialogVisible(UnPeekLiveData unPeekLiveData, int i10) {
        if (i10 != AbstractC9053a.f17323a) {
            return false;
        }
        synchronized (this) {
            this.f9854p |= 1;
        }
        return true;
    }

    public final boolean onChangeViewModelToastLiveData(UnPeekLiveData unPeekLiveData, int i10) {
        if (i10 != AbstractC9053a.f17323a) {
            return false;
        }
        synchronized (this) {
            this.f9854p |= 8;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return onChangeViewModelIsDialogVisible((UnPeekLiveData) obj, i11);
        }
        if (i10 == 1) {
            return m9243h((MutableLiveData) obj, i11);
        }
        if (i10 == 2) {
            return m9241b((MutableLiveData) obj, i11);
        }
        if (i10 == 3) {
            return onChangeViewModelToastLiveData((UnPeekLiveData) obj, i11);
        }
        if (i10 != 4) {
            return false;
        }
        return m9242d((MutableLiveData) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, Object obj) {
        if (AbstractC9053a.f17325c == i10) {
            m9244i((String) obj);
            return true;
        }
        if (AbstractC9053a.f17326d != i10) {
            return false;
        }
        mo9240a((ChangePwdViewModel) obj);
        return true;
    }

    public LoginDialogChangePwdBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 5, (EditText) objArr[2], (EditText) objArr[1], (LinearLayout) objArr[9], (LinearLayout) objArr[8], (LoadingDialogView) objArr[4], (TextView) objArr[7], (TextView) objArr[3], (TextView) objArr[6]);
        this.f9852n = new C7316a();
        this.f9853o = new C7317b();
        this.f9854p = -1L;
        this.f9837a.setTag(null);
        this.f9838b.setTag(null);
        this.f9841e.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f9849k = linearLayout;
        linearLayout.setTag(null);
        ToastView toastView = (ToastView) objArr[5];
        this.f9850l = toastView;
        toastView.setTag(null);
        this.f9843g.setTag(null);
        setRootTag(view);
        this.f9851m = new ViewOnClickListenerC9247a(this, 1);
        invalidateAll();
    }
}
