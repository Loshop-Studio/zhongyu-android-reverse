package com.friday.document.view;

import android.app.Dialog;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.friday.document.R$dimen;
import com.friday.document.R$layout;
import com.friday.document.adapter.SyncFileAdapter;
import com.friday.document.databinding.DialogSyncFileBinding;
import com.friday.document.model.ManualSyncEntity;
import com.friday.document.view.ManualSyncFileDialog;
import com.friday.document.viewmodel.ManualSyncViewModel;
import com.taobao.sophix.PatchStatus;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC9923a;
import kotlin.AbstractC9924b;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import kotlin.jvm.internal.InterfaceC9975q;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p309qc.InterfaceC10772c;
import p309qc.InterfaceC10773d;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11612u;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class ManualSyncFileDialog extends Hilt_ManualSyncFileDialog<DialogSyncFileBinding> {

    /* renamed from: k */
    public final InterfaceC10773d f7162k;

    /* renamed from: l */
    public final InterfaceC10773d f7163l;

    /* renamed from: com.friday.document.view.ManualSyncFileDialog$a */
    public static final class C6008a implements Observer, InterfaceC9975q {

        /* renamed from: c */
        public final /* synthetic */ InterfaceC9540l f7171c;

        public C6008a(InterfaceC9540l function) {
            AbstractC9979u.m20294g(function, "function");
            this.f7171c = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9975q)) {
                return AbstractC9979u.m20289b(getFunctionDelegate(), ((InterfaceC9975q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9975q
        public final InterfaceC10772c getFunctionDelegate() {
            return this.f7171c;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f7171c.invoke(obj);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.document.view.ManualSyncFileDialog$initData$1", m26211f = "ManualSyncFileDialog.kt", m26212l = {PatchStatus.CODE_LOAD_FIND_CLASS}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.view.ManualSyncFileDialog$initData$1 */
    public static final class C60091 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f7172c;

        @InterfaceC11829d(m26210c = "com.friday.document.view.ManualSyncFileDialog$initData$1$1", m26211f = "ManualSyncFileDialog.kt", m26212l = {}, m26213m = "invokeSuspend")
        /* renamed from: com.friday.document.view.ManualSyncFileDialog$initData$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public int f7174c;

            /* renamed from: d */
            public /* synthetic */ Object f7175d;

            /* renamed from: e */
            public final /* synthetic */ ManualSyncFileDialog f7176e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ManualSyncFileDialog manualSyncFileDialog, InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
                this.f7176e = manualSyncFileDialog;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f7176e, interfaceC11588c);
                anonymousClass1.f7175d = obj;
                return anonymousClass1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object obj2 = this.f7175d;
                AbstractC11725a.m25952f();
                if (this.f7174c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                if (obj2 != null) {
                    List list = (List) this.f7176e.m5711y().m6305i().getValue();
                    if (list != null) {
                        this.f7176e.m5710x().setList(list);
                    }
                    this.f7176e.updateTitle();
                }
                return C10786q.f26013a;
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(Object obj, InterfaceC11588c interfaceC11588c) {
                return ((AnonymousClass1) create(obj, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        public C60091(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return ManualSyncFileDialog.this.new C60091(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f7172c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC11612u interfaceC11612uM6308l = ManualSyncFileDialog.this.m5711y().m6308l();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ManualSyncFileDialog.this, null);
                this.f7172c = 1;
                if (AbstractC11596e.m25559i(interfaceC11612uM6308l, anonymousClass1, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C60091) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public ManualSyncFileDialog() {
        final InterfaceC9529a interfaceC9529a = new InterfaceC9529a() { // from class: com.friday.document.view.ManualSyncFileDialog$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC10773d interfaceC10773dM20069b = AbstractC9923a.m20069b(LazyThreadSafetyMode.f23258e, new InterfaceC9529a() { // from class: com.friday.document.view.ManualSyncFileDialog$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC9529a.invoke();
            }
        });
        final InterfaceC9529a interfaceC9529a2 = null;
        this.f7162k = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9983y.m20315b(ManualSyncViewModel.class), new InterfaceC9529a() { // from class: com.friday.document.view.ManualSyncFileDialog$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m33785viewModels$lambda1(interfaceC10773dM20069b).getViewModelStore();
            }
        }, new InterfaceC9529a() { // from class: com.friday.document.view.ManualSyncFileDialog$special$$inlined$viewModels$default$4
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
        }, new InterfaceC9529a() { // from class: com.friday.document.view.ManualSyncFileDialog$special$$inlined$viewModels$default$5
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
        this.f7163l = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: u2.n
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return ManualSyncFileDialog.m5702B();
            }
        });
    }

    /* renamed from: A */
    public static final C10786q m5701A(ManualSyncFileDialog manualSyncFileDialog, List list) {
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(manualSyncFileDialog), null, null, new ManualSyncFileDialog$initData$4$1(list, manualSyncFileDialog, null), 3, null);
        return C10786q.f26013a;
    }

    /* renamed from: B */
    public static final SyncFileAdapter m5702B() {
        return new SyncFileAdapter();
    }

    /* renamed from: z */
    public static final void m5709z(ManualSyncFileDialog manualSyncFileDialog, View view) {
        manualSyncFileDialog.m5711y().m6307k().m5600E();
        manualSyncFileDialog.dismissAllowingStateLoss();
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public int getLayoutId() {
        return R$layout.dialog_sync_file;
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public void initData() {
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C60091(null), 3, null);
        RecyclerView recyclerView = ((DialogSyncFileBinding) getMBinding()).f6345f;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.setAdapter(m5710x());
        m5711y().m6304h();
        ((DialogSyncFileBinding) getMBinding()).f6344e.setOnClickListener(new View.OnClickListener() { // from class: u2.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ManualSyncFileDialog.m5709z(this.f27165c, view);
            }
        });
        m5711y().m6305i().observe(getViewLifecycleOwner(), new C6008a(new InterfaceC9540l() { // from class: u2.m
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ManualSyncFileDialog.m5701A(this.f27166c, (List) obj);
            }
        }));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        WindowManager windowManager;
        Display defaultDisplay;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        FragmentActivity activity = getActivity();
        if (activity != null && (windowManager = activity.getWindowManager()) != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout((int) getResources().getDimension(R$dimen.view_351), (int) getResources().getDimension(R$dimen.view_180));
            window.getAttributes().dimAmount = 0.0f;
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setCancelable(false);
            dialog2.setCanceledOnTouchOutside(false);
        }
        super.onStart();
    }

    public final void updateTitle() {
        List<ManualSyncEntity> data = m5710x().getData();
        Iterator<T> it = data.iterator();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (it.hasNext()) {
            int syncState = ((ManualSyncEntity) it.next()).getSyncState();
            if (syncState == 0) {
                i13++;
            } else if (syncState == 1) {
                i12++;
            } else if (syncState == 2) {
                i11++;
            } else if (syncState == 3) {
                i10++;
            }
        }
        ((DialogSyncFileBinding) getMBinding()).f6351l.setText("成功" + i10);
        ((DialogSyncFileBinding) getMBinding()).f6346g.setText("失败" + i11);
        int i14 = i12 + i13;
        ((DialogSyncFileBinding) getMBinding()).f6349j.setText("剩余" + i14);
        if (i14 == 0) {
            ((DialogSyncFileBinding) getMBinding()).f6353n.setText("同步已完成");
            return;
        }
        SpannableString spannableString = new SpannableString("同步进行中" + (data.size() - i13) + MqttTopic.TOPIC_LEVEL_SEPARATOR + data.size());
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#4797F3")), 5, String.valueOf(data.size() - i13).length() + 5, 33);
        ((DialogSyncFileBinding) getMBinding()).f6353n.setText(spannableString);
    }

    /* renamed from: x */
    public final SyncFileAdapter m5710x() {
        return (SyncFileAdapter) this.f7163l.getValue();
    }

    /* renamed from: y */
    public final ManualSyncViewModel m5711y() {
        return (ManualSyncViewModel) this.f7162k.getValue();
    }
}
