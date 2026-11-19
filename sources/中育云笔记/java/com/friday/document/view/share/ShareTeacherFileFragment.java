package com.friday.document.view.share;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.friday.document.R$layout;
import com.friday.document.R$string;
import com.friday.document.databinding.FragmentShareFileBinding;
import com.friday.document.view.share.ShareTeacherFileFragment;
import com.friday.document.viewmodel.ShareFileViewModel;
import kotlin.AbstractC9923a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p181hd.InterfaceC9529a;
import p200j2.InterfaceC9669i;
import p309qc.InterfaceC10773d;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class ShareTeacherFileFragment extends Hilt_ShareTeacherFileFragment implements InterfaceC9669i {

    /* renamed from: q */
    public static final C6080a f7655q = new C6080a(null);

    /* renamed from: r */
    public static final int f7656r = 8;

    /* renamed from: o */
    public final InterfaceC10773d f7657o;

    /* renamed from: p */
    public final InterfaceC10773d f7658p;

    /* renamed from: com.friday.document.view.share.ShareTeacherFileFragment$a */
    public static final class C6080a {
        public /* synthetic */ C6080a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final ShareTeacherFileFragment m6103a(long j10, String teacherName) {
            AbstractC9979u.m20294g(teacherName, "teacherName");
            ShareTeacherFileFragment shareTeacherFileFragment = new ShareTeacherFileFragment();
            Bundle bundle = new Bundle();
            bundle.putLong("teacher_id", j10);
            bundle.putString("teacher_name", teacherName);
            shareTeacherFileFragment.setArguments(bundle);
            return shareTeacherFileFragment;
        }

        public C6080a() {
        }
    }

    public ShareTeacherFileFragment() {
        final InterfaceC9529a interfaceC9529a = new InterfaceC9529a() { // from class: com.friday.document.view.share.ShareTeacherFileFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC10773d interfaceC10773dM20069b = AbstractC9923a.m20069b(LazyThreadSafetyMode.f23258e, new InterfaceC9529a() { // from class: com.friday.document.view.share.ShareTeacherFileFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC9529a.invoke();
            }
        });
        final InterfaceC9529a interfaceC9529a2 = null;
        this.f7657o = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9983y.m20315b(ShareFileViewModel.class), new InterfaceC9529a() { // from class: com.friday.document.view.share.ShareTeacherFileFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m33785viewModels$lambda1(interfaceC10773dM20069b).getViewModelStore();
            }
        }, new InterfaceC9529a() { // from class: com.friday.document.view.share.ShareTeacherFileFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC9529a interfaceC9529a3 = interfaceC9529a2;
                if (interfaceC9529a3 != null && (creationExtras = (CreationExtras) interfaceC9529a3.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM33785viewModels$lambda1 = FragmentViewModelLazyKt.m33785viewModels$lambda1(interfaceC10773dM20069b);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM33785viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM33785viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new InterfaceC9529a() { // from class: com.friday.document.view.share.ShareTeacherFileFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM33785viewModels$lambda1 = FragmentViewModelLazyKt.m33785viewModels$lambda1(interfaceC10773dM20069b);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM33785viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM33785viewModels$lambda1 : null;
                return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            }
        });
        this.f7658p = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: x2.v
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return Long.valueOf(ShareTeacherFileFragment.m6101Z(this.f27961c));
            }
        });
    }

    /* renamed from: Z */
    public static final long m6101Z(ShareTeacherFileFragment shareTeacherFileFragment) {
        Bundle arguments = shareTeacherFileFragment.getArguments();
        if (arguments != null) {
            return arguments.getLong("teacher_id");
        }
        return -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.friday.document.view.share.ShareBaseFileFragment
    /* renamed from: C */
    public String mo6026C() {
        Context context = ((FragmentShareFileBinding) getMBinding()).getRoot().getContext();
        int i10 = R$string.teacher_name;
        Bundle arguments = getArguments();
        return context.getString(i10, arguments != null ? arguments.getString("teacher_name") : null);
    }

    @Override // com.friday.document.view.share.ShareBaseFileFragment
    /* renamed from: E */
    public ShareFileViewModel mo6028E() {
        return (ShareFileViewModel) this.f7657o.getValue();
    }

    @Override // com.friday.document.view.share.ShareBaseFileFragment
    /* renamed from: H */
    public void mo6031H() {
        ShareFileViewModel.m6400H(mo6028E(), m6102Y(), false, 2, null);
    }

    @Override // com.friday.document.view.share.ShareBaseFileFragment
    /* renamed from: I */
    public void mo6032I() {
        mo6028E().m6419G(m6102Y(), true);
    }

    @Override // com.friday.document.view.share.ShareBaseFileFragment
    /* renamed from: P */
    public boolean mo6036P() {
        return true;
    }

    /* renamed from: Y */
    public final long m6102Y() {
        return ((Number) this.f7658p.getValue()).longValue();
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public int getLayoutId() {
        return R$layout.fragment_share_file;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.friday.document.view.share.ShareBaseFileFragment, com.friday.common.base.BaseFragment
    public void initView() {
        String string;
        super.initView();
        TextView textView = ((FragmentShareFileBinding) getMBinding()).f6445i;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("teacher_name")) == null) {
            string = "";
        }
        textView.setText(string);
    }

    @Override // p200j2.InterfaceC9669i
    /* renamed from: l */
    public void mo6068l() {
        mo6028E().m6423O();
        if (isAdded()) {
            getParentFragmentManager().popBackStack();
        }
    }
}
