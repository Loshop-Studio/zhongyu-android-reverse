package com.zykj.lib.login.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
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
import com.zykj.lib.login.p062ui.teacher.TeacherLoginViewModel;
import com.zykj.policy.p064ui.PolicyCheckView;
import p152k3.AbstractC9053a;
import p164l3.ViewOnClickListenerC9247a;

/* loaded from: classes4.dex */
public class LoginFragmentLoginTeacherBindingImpl extends LoginFragmentLoginTeacherBinding implements ViewOnClickListenerC9247a.a {

    /* renamed from: q */
    public static final ViewDataBinding.IncludedLayouts f9893q = null;

    /* renamed from: r */
    public static final SparseIntArray f9894r;

    /* renamed from: i */
    public final LoadingDialogView f9895i;

    /* renamed from: j */
    public final ToastView f9896j;

    /* renamed from: k */
    public final View.OnClickListener f9897k;

    /* renamed from: l */
    public InverseBindingListener f9898l;

    /* renamed from: m */
    public InverseBindingListener f9899m;

    /* renamed from: n */
    public InverseBindingListener f9900n;

    /* renamed from: o */
    public InverseBindingListener f9901o;

    /* renamed from: p */
    public long f9902p;

    /* renamed from: com.zykj.lib.login.databinding.LoginFragmentLoginTeacherBindingImpl$a */
    public class C7319a implements InverseBindingListener {
        public C7319a() {
        }

        @Override // androidx.databinding.InverseBindingListener
        public void onChange() {
            MutableLiveData mutableLiveDataM9320e;
            String textString = TextViewBindingAdapter.getTextString(LoginFragmentLoginTeacherBindingImpl.this.f9886b);
            TeacherLoginViewModel teacherLoginViewModel = LoginFragmentLoginTeacherBindingImpl.this.f9892h;
            if (teacherLoginViewModel == null || (mutableLiveDataM9320e = teacherLoginViewModel.m9320e()) == null) {
                return;
            }
            mutableLiveDataM9320e.setValue(textString);
        }
    }

    /* renamed from: com.zykj.lib.login.databinding.LoginFragmentLoginTeacherBindingImpl$b */
    public class C7320b implements InverseBindingListener {
        public C7320b() {
        }

        @Override // androidx.databinding.InverseBindingListener
        public void onChange() {
            MutableLiveData mutableLiveDataM9321f;
            String textString = TextViewBindingAdapter.getTextString(LoginFragmentLoginTeacherBindingImpl.this.f9887c);
            TeacherLoginViewModel teacherLoginViewModel = LoginFragmentLoginTeacherBindingImpl.this.f9892h;
            if (teacherLoginViewModel == null || (mutableLiveDataM9321f = teacherLoginViewModel.m9321f()) == null) {
                return;
            }
            mutableLiveDataM9321f.setValue(textString);
        }
    }

    /* renamed from: com.zykj.lib.login.databinding.LoginFragmentLoginTeacherBindingImpl$c */
    public class C7321c implements InverseBindingListener {
        public C7321c() {
        }

        @Override // androidx.databinding.InverseBindingListener
        public void onChange() {
            MutableLiveData mutableLiveDataM9324i;
            String textString = TextViewBindingAdapter.getTextString(LoginFragmentLoginTeacherBindingImpl.this.f9888d);
            TeacherLoginViewModel teacherLoginViewModel = LoginFragmentLoginTeacherBindingImpl.this.f9892h;
            if (teacherLoginViewModel == null || (mutableLiveDataM9324i = teacherLoginViewModel.m9324i()) == null) {
                return;
            }
            mutableLiveDataM9324i.setValue(textString);
        }
    }

    /* renamed from: com.zykj.lib.login.databinding.LoginFragmentLoginTeacherBindingImpl$d */
    public class C7322d implements InverseBindingListener {
        public C7322d() {
        }

        @Override // androidx.databinding.InverseBindingListener
        public void onChange() {
            MutableLiveData mutableLiveDataM9326k;
            boolean zIsChecked = LoginFragmentLoginTeacherBindingImpl.this.f9891g.isChecked();
            TeacherLoginViewModel teacherLoginViewModel = LoginFragmentLoginTeacherBindingImpl.this.f9892h;
            if (teacherLoginViewModel == null || (mutableLiveDataM9326k = teacherLoginViewModel.m9326k()) == null) {
                return;
            }
            mutableLiveDataM9326k.setValue(Boolean.valueOf(zIsChecked));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f9894r = sparseIntArray;
        sparseIntArray.put(R$id.ic_login, 8);
    }

    public LoginFragmentLoginTeacherBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, f9893q, f9894r));
    }

    @Override // p164l3.ViewOnClickListenerC9247a.a
    public final void _internalCallbackOnClick(int i10, View view) {
        TeacherLoginViewModel teacherLoginViewModel = this.f9892h;
        if (teacherLoginViewModel != null) {
            teacherLoginViewModel.m9328m();
        }
    }

    @Override // com.zykj.lib.login.databinding.LoginFragmentLoginTeacherBinding
    /* renamed from: a */
    public void mo9250a(TeacherLoginViewModel teacherLoginViewModel) {
        this.f9892h = teacherLoginViewModel;
        synchronized (this) {
            this.f9902p |= 64;
        }
        notifyPropertyChanged(AbstractC9053a.f17324b);
        super.requestRebind();
    }

    /* renamed from: b */
    public final boolean m9251b(MutableLiveData mutableLiveData, int i10) {
        if (i10 != AbstractC9053a.f17323a) {
            return false;
        }
        synchronized (this) {
            this.f9902p |= 32;
        }
        return true;
    }

    /* renamed from: d */
    public final boolean m9252d(UnPeekLiveData unPeekLiveData, int i10) {
        if (i10 != AbstractC9053a.f17323a) {
            return false;
        }
        synchronized (this) {
            this.f9902p |= 1;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.lib.login.databinding.LoginFragmentLoginTeacherBindingImpl.executeBindings():void"); // DEX body: android/优课畅学/smali_classes4/com/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl.smali:464
    }

    /* renamed from: h */
    public final boolean m9253h(MutableLiveData mutableLiveData, int i10) {
        if (i10 != AbstractC9053a.f17323a) {
            return false;
        }
        synchronized (this) {
            this.f9902p |= 16;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f9902p != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: i */
    public final boolean m9254i(MutableLiveData mutableLiveData, int i10) {
        if (i10 != AbstractC9053a.f17323a) {
            return false;
        }
        synchronized (this) {
            this.f9902p |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f9902p = 128L;
        }
        requestRebind();
    }

    /* renamed from: j */
    public final boolean m9255j(UnPeekLiveData unPeekLiveData, int i10) {
        if (i10 != AbstractC9053a.f17323a) {
            return false;
        }
        synchronized (this) {
            this.f9902p |= 4;
        }
        return true;
    }

    /* renamed from: k */
    public final boolean m9256k(MutableLiveData mutableLiveData, int i10) {
        if (i10 != AbstractC9053a.f17323a) {
            return false;
        }
        synchronized (this) {
            this.f9902p |= 8;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return m9252d((UnPeekLiveData) obj, i11);
        }
        if (i10 == 1) {
            return m9254i((MutableLiveData) obj, i11);
        }
        if (i10 == 2) {
            return m9255j((UnPeekLiveData) obj, i11);
        }
        if (i10 == 3) {
            return m9256k((MutableLiveData) obj, i11);
        }
        if (i10 == 4) {
            return m9253h((MutableLiveData) obj, i11);
        }
        if (i10 != 5) {
            return false;
        }
        return m9251b((MutableLiveData) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, Object obj) {
        if (AbstractC9053a.f17324b != i10) {
            return false;
        }
        mo9250a((TeacherLoginViewModel) obj);
        return true;
    }

    public LoginFragmentLoginTeacherBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 6, (TextView) objArr[4], (EditText) objArr[3], (EditText) objArr[1], (EditText) objArr[2], (LinearLayout) objArr[0], (ImageView) objArr[8], (PolicyCheckView) objArr[5]);
        this.f9898l = new C7319a();
        this.f9899m = new C7320b();
        this.f9900n = new C7321c();
        this.f9901o = new C7322d();
        this.f9902p = -1L;
        this.f9885a.setTag(null);
        this.f9886b.setTag(null);
        this.f9887c.setTag(null);
        this.f9888d.setTag(null);
        this.f9889e.setTag(null);
        LoadingDialogView loadingDialogView = (LoadingDialogView) objArr[6];
        this.f9895i = loadingDialogView;
        loadingDialogView.setTag(null);
        ToastView toastView = (ToastView) objArr[7];
        this.f9896j = toastView;
        toastView.setTag(null);
        this.f9891g.setTag(null);
        setRootTag(view);
        this.f9897k = new ViewOnClickListenerC9247a(this, 1);
        invalidateAll();
    }
}
