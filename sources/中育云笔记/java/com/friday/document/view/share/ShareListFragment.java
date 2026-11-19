package com.friday.document.view.share;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.friday.document.R$layout;
import com.friday.document.model.ShareFile;
import com.friday.document.viewmodel.ShareFileViewModel;
import kotlin.AbstractC9923a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p181hd.InterfaceC9529a;
import p200j2.InterfaceC9669i;
import p309qc.InterfaceC10773d;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class ShareListFragment extends Hilt_ShareListFragment implements InterfaceC9669i {

    /* renamed from: o */
    public final InterfaceC10773d f7626o;

    public ShareListFragment() {
        final InterfaceC9529a interfaceC9529a = new InterfaceC9529a() { // from class: com.friday.document.view.share.ShareListFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC10773d interfaceC10773dM20069b = AbstractC9923a.m20069b(LazyThreadSafetyMode.f23258e, new InterfaceC9529a() { // from class: com.friday.document.view.share.ShareListFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC9529a.invoke();
            }
        });
        final InterfaceC9529a interfaceC9529a2 = null;
        this.f7626o = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9983y.m20315b(ShareFileViewModel.class), new InterfaceC9529a() { // from class: com.friday.document.view.share.ShareListFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m33785viewModels$lambda1(interfaceC10773dM20069b).getViewModelStore();
            }
        }, new InterfaceC9529a() { // from class: com.friday.document.view.share.ShareListFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC9529a() { // from class: com.friday.document.view.share.ShareListFragment$special$$inlined$viewModels$default$5
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
    }

    @Override // com.friday.document.view.share.ShareBaseFileFragment
    /* renamed from: E */
    public ShareFileViewModel mo6028E() {
        return (ShareFileViewModel) this.f7626o.getValue();
    }

    @Override // com.friday.document.view.share.ShareBaseFileFragment
    /* renamed from: H */
    public void mo6031H() {
        ShareFileViewModel.m6397D(mo6028E(), false, 1, null);
    }

    @Override // com.friday.document.view.share.ShareBaseFileFragment
    /* renamed from: I */
    public void mo6032I() {
        mo6028E().m6418C(true);
    }

    @Override // com.friday.document.view.share.ShareBaseFileFragment
    /* renamed from: P */
    public boolean mo6036P() {
        return false;
    }

    /* renamed from: X */
    public void m6070X(ShareFile file) {
        AbstractC9979u.m20294g(file, "file");
        m6034M(file);
        mo6028E().m6421L(file.getParentId(), file.getOwnerId());
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public int getLayoutId() {
        return R$layout.fragment_share_file;
    }

    @Override // p200j2.InterfaceC9669i
    /* renamed from: l */
    public void mo6068l() {
        mo6028E().m6423O();
        mo6031H();
    }
}
