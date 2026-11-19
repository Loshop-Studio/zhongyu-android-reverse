package com.zykj.lib.ota.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import com.xuexiang.xui.widget.progress.HorizontalProgressView;
import com.zykj.lib.ota.R$id;
import com.zykj.lib.ota.viewmodel.VersionViewModel;
import p123h7.C8736p;
import p241s3.AbstractC9972a;
import p300x7.InterfaceC10559a;

/* loaded from: classes4.dex */
public class DialogCheckUpdateBindingImpl extends DialogCheckUpdateBinding {

    /* renamed from: v */
    public static final ViewDataBinding.IncludedLayouts f10243v = null;

    /* renamed from: w */
    public static final SparseIntArray f10244w;

    /* renamed from: o */
    public final FrameLayout f10245o;

    /* renamed from: p */
    public final TextView f10246p;

    /* renamed from: q */
    public C7381d f10247q;

    /* renamed from: r */
    public C7378a f10248r;

    /* renamed from: s */
    public C7379b f10249s;

    /* renamed from: t */
    public C7380c f10250t;

    /* renamed from: u */
    public long f10251u;

    /* renamed from: com.zykj.lib.ota.databinding.DialogCheckUpdateBindingImpl$a */
    public static class C7378a implements InterfaceC10559a {

        /* renamed from: a */
        public VersionViewModel f10252a;

        @Override // p300x7.InterfaceC10559a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C8736p invoke() {
            this.f10252a.m9498j();
            return null;
        }

        /* renamed from: b */
        public C7378a m9469b(VersionViewModel versionViewModel) {
            this.f10252a = versionViewModel;
            if (versionViewModel == null) {
                return null;
            }
            return this;
        }
    }

    /* renamed from: com.zykj.lib.ota.databinding.DialogCheckUpdateBindingImpl$b */
    public static class C7379b implements InterfaceC10559a {

        /* renamed from: a */
        public VersionViewModel f10253a;

        @Override // p300x7.InterfaceC10559a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C8736p invoke() {
            this.f10253a.m9489a();
            return null;
        }

        /* renamed from: b */
        public C7379b m9471b(VersionViewModel versionViewModel) {
            this.f10253a = versionViewModel;
            if (versionViewModel == null) {
                return null;
            }
            return this;
        }
    }

    /* renamed from: com.zykj.lib.ota.databinding.DialogCheckUpdateBindingImpl$c */
    public static class C7380c implements InterfaceC10559a {

        /* renamed from: a */
        public VersionViewModel f10254a;

        @Override // p300x7.InterfaceC10559a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C8736p invoke() {
            this.f10254a.m9499k();
            return null;
        }

        /* renamed from: b */
        public C7380c m9473b(VersionViewModel versionViewModel) {
            this.f10254a = versionViewModel;
            if (versionViewModel == null) {
                return null;
            }
            return this;
        }
    }

    /* renamed from: com.zykj.lib.ota.databinding.DialogCheckUpdateBindingImpl$d */
    public static class C7381d implements InterfaceC10559a {

        /* renamed from: a */
        public VersionViewModel f10255a;

        @Override // p300x7.InterfaceC10559a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C8736p invoke() {
            this.f10255a.m9500l();
            return null;
        }

        /* renamed from: b */
        public C7381d m9475b(VersionViewModel versionViewModel) {
            this.f10255a = versionViewModel;
            if (versionViewModel == null) {
                return null;
            }
            return this;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f10244w = sparseIntArray;
        sparseIntArray.put(R$id.imageView, 11);
        sparseIntArray.put(R$id.textView, 12);
        sparseIntArray.put(R$id.nestedScrollView, 13);
        sparseIntArray.put(R$id.ll_button, 14);
    }

    public DialogCheckUpdateBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 15, f10243v, f10244w));
    }

    @Override // com.zykj.lib.ota.databinding.DialogCheckUpdateBinding
    /* renamed from: a */
    public void mo9463a(VersionViewModel versionViewModel) {
        this.f10242n = versionViewModel;
        synchronized (this) {
            this.f10251u |= 16;
        }
        notifyPropertyChanged(AbstractC9972a.f20019d);
        super.requestRebind();
    }

    /* renamed from: b */
    public final boolean m9464b(MutableLiveData mutableLiveData, int i10) {
        if (i10 != AbstractC9972a.f20016a) {
            return false;
        }
        synchronized (this) {
            this.f10251u |= 8;
        }
        return true;
    }

    /* renamed from: d */
    public final boolean m9465d(MutableLiveData mutableLiveData, int i10) {
        if (i10 != AbstractC9972a.f20016a) {
            return false;
        }
        synchronized (this) {
            this.f10251u |= 1;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.lib.ota.databinding.DialogCheckUpdateBindingImpl.executeBindings():void"); // DEX body: android/优课畅学/smali_classes4/com/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl.smali:518
    }

    /* renamed from: h */
    public final boolean m9466h(MutableLiveData mutableLiveData, int i10) {
        if (i10 != AbstractC9972a.f20016a) {
            return false;
        }
        synchronized (this) {
            this.f10251u |= 4;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f10251u != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: i */
    public final boolean m9467i(MutableLiveData mutableLiveData, int i10) {
        if (i10 != AbstractC9972a.f20016a) {
            return false;
        }
        synchronized (this) {
            this.f10251u |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f10251u = 32L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return m9465d((MutableLiveData) obj, i11);
        }
        if (i10 == 1) {
            return m9467i((MutableLiveData) obj, i11);
        }
        if (i10 == 2) {
            return m9466h((MutableLiveData) obj, i11);
        }
        if (i10 != 3) {
            return false;
        }
        return m9464b((MutableLiveData) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, Object obj) {
        if (AbstractC9972a.f20019d != i10) {
            return false;
        }
        mo9463a((VersionViewModel) obj);
        return true;
    }

    public DialogCheckUpdateBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 4, (ImageView) objArr[11], (LinearLayout) objArr[14], (NestedScrollView) objArr[13], (HorizontalProgressView) objArr[3], (TextView) objArr[12], (TextView) objArr[1], (TextView) objArr[5], (TextView) objArr[6], (TextView) objArr[9], (TextView) objArr[7], (TextView) objArr[8], (TextView) objArr[4], (TextView) objArr[10]);
        this.f10251u = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f10245o = frameLayout;
        frameLayout.setTag(null);
        TextView textView = (TextView) objArr[2];
        this.f10246p = textView;
        textView.setTag(null);
        this.f10232d.setTag(null);
        this.f10234f.setTag(null);
        this.f10235g.setTag(null);
        this.f10236h.setTag(null);
        this.f10237i.setTag(null);
        this.f10238j.setTag(null);
        this.f10239k.setTag(null);
        this.f10240l.setTag(null);
        this.f10241m.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
