package com.zykj.lib.login.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.MutableLiveData;
import com.kunminx.architecture.p043ui.callback.UnPeekLiveData;
import com.zykj.base.view.LoadingDialogView;
import com.zykj.base.view.ToastView;
import com.zykj.lib.login.R$id;
import com.zykj.lib.login.p062ui.teacher.sms.SendSmsViewModel;
import p152k3.AbstractC9053a;
import p164l3.ViewOnClickListenerC9247a;

/* loaded from: classes4.dex */
public class LoginDialogSendSmsBindingImpl extends LoginDialogSendSmsBinding implements ViewOnClickListenerC9247a.a {

    /* renamed from: r */
    public static final ViewDataBinding.IncludedLayouts f9868r = null;

    /* renamed from: s */
    public static final SparseIntArray f9869s;

    /* renamed from: l */
    public final LinearLayout f9870l;

    /* renamed from: m */
    public final LoadingDialogView f9871m;

    /* renamed from: n */
    public final ToastView f9872n;

    /* renamed from: o */
    public final View.OnClickListener f9873o;

    /* renamed from: p */
    public InverseBindingListener f9874p;

    /* renamed from: q */
    public long f9875q;

    /* renamed from: com.zykj.lib.login.databinding.LoginDialogSendSmsBindingImpl$a */
    public class C7318a implements InverseBindingListener {
        public C7318a() {
        }

        @Override // androidx.databinding.InverseBindingListener
        public void onChange() {
            MutableLiveData mutableLiveDataM9407g;
            String textString = TextViewBindingAdapter.getTextString(LoginDialogSendSmsBindingImpl.this.f9858b);
            SendSmsViewModel sendSmsViewModel = LoginDialogSendSmsBindingImpl.this.f9867k;
            if (sendSmsViewModel == null || (mutableLiveDataM9407g = sendSmsViewModel.m9407g()) == null) {
                return;
            }
            mutableLiveDataM9407g.setValue(textString);
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f9869s = sparseIntArray;
        sparseIntArray.put(R$id.iv_close, 9);
        sparseIntArray.put(R$id.tv_title, 10);
        sparseIntArray.put(R$id.barrier, 11);
        sparseIntArray.put(R$id.verify_code_barrier, 12);
    }

    public LoginDialogSendSmsBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, f9868r, f9869s));
    }

    private boolean onChangeViewModelIsDialogVisible(UnPeekLiveData unPeekLiveData, int i10) {
        if (i10 != AbstractC9053a.f17323a) {
            return false;
        }
        synchronized (this) {
            this.f9875q |= 2;
        }
        return true;
    }

    private boolean onChangeViewModelToastLiveData(UnPeekLiveData unPeekLiveData, int i10) {
        if (i10 != AbstractC9053a.f17323a) {
            return false;
        }
        synchronized (this) {
            this.f9875q |= 4;
        }
        return true;
    }

    @Override // p164l3.ViewOnClickListenerC9247a.a
    public final void _internalCallbackOnClick(int i10, View view) {
        SendSmsViewModel sendSmsViewModel = this.f9867k;
        if (sendSmsViewModel != null) {
            sendSmsViewModel.m9409i();
        }
    }

    @Override // com.zykj.lib.login.databinding.LoginDialogSendSmsBinding
    /* renamed from: a */
    public void mo9245a(SendSmsViewModel sendSmsViewModel) {
        this.f9867k = sendSmsViewModel;
        synchronized (this) {
            this.f9875q |= 64;
        }
        notifyPropertyChanged(AbstractC9053a.f17326d);
        super.requestRebind();
    }

    /* renamed from: b */
    public final boolean m9246b(MutableLiveData mutableLiveData, int i10) {
        if (i10 != AbstractC9053a.f17323a) {
            return false;
        }
        synchronized (this) {
            this.f9875q |= 32;
        }
        return true;
    }

    /* renamed from: d */
    public final boolean m9247d(MutableLiveData mutableLiveData, int i10) {
        if (i10 != AbstractC9053a.f17323a) {
            return false;
        }
        synchronized (this) {
            this.f9875q |= 8;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x013d  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.lib.login.databinding.LoginDialogSendSmsBindingImpl.executeBindings():void"); // DEX body: android/优课畅学/smali_classes4/com/zykj/lib/login/databinding/LoginDialogSendSmsBindingImpl.smali:634
    }

    /* renamed from: h */
    public final boolean m9248h(MutableLiveData mutableLiveData, int i10) {
        if (i10 != AbstractC9053a.f17323a) {
            return false;
        }
        synchronized (this) {
            this.f9875q |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f9875q != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: i */
    public final boolean m9249i(MutableLiveData mutableLiveData, int i10) {
        if (i10 != AbstractC9053a.f17323a) {
            return false;
        }
        synchronized (this) {
            this.f9875q |= 16;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f9875q = 128L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return m9248h((MutableLiveData) obj, i11);
        }
        if (i10 == 1) {
            return onChangeViewModelIsDialogVisible((UnPeekLiveData) obj, i11);
        }
        if (i10 == 2) {
            return onChangeViewModelToastLiveData((UnPeekLiveData) obj, i11);
        }
        if (i10 == 3) {
            return m9247d((MutableLiveData) obj, i11);
        }
        if (i10 == 4) {
            return m9249i((MutableLiveData) obj, i11);
        }
        if (i10 != 5) {
            return false;
        }
        return m9246b((MutableLiveData) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, Object obj) {
        if (AbstractC9053a.f17326d != i10) {
            return false;
        }
        mo9245a((SendSmsViewModel) obj);
        return true;
    }

    public LoginDialogSendSmsBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 6, (Barrier) objArr[11], (EditText) objArr[3], (TextView) objArr[4], (ImageView) objArr[9], (TextView) objArr[6], (TextView) objArr[1], (TextView) objArr[2], (TextView) objArr[5], (TextView) objArr[10], (Barrier) objArr[12]);
        this.f9874p = new C7318a();
        this.f9875q = -1L;
        this.f9858b.setTag(null);
        this.f9859c.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f9870l = linearLayout;
        linearLayout.setTag(null);
        LoadingDialogView loadingDialogView = (LoadingDialogView) objArr[7];
        this.f9871m = loadingDialogView;
        loadingDialogView.setTag(null);
        ToastView toastView = (ToastView) objArr[8];
        this.f9872n = toastView;
        toastView.setTag(null);
        this.f9861e.setTag(null);
        this.f9862f.setTag(null);
        this.f9863g.setTag(null);
        this.f9864h.setTag(null);
        setRootTag(view);
        this.f9873o = new ViewOnClickListenerC9247a(this, 1);
        invalidateAll();
    }
}
