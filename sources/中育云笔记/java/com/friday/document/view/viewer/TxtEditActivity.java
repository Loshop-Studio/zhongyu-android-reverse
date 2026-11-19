package com.friday.document.view.viewer;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.friday.common.databinding.PopupWindowNoteInfoBinding;
import com.friday.common.entity.FileEntity;
import com.friday.common.entity.FromPage;
import com.friday.common.entity.UpdateSpecifiedItem;
import com.friday.document.R$dimen;
import com.friday.document.R$layout;
import com.friday.document.databinding.ActivityTxtEditBinding;
import com.friday.document.view.viewer.TxtEditActivity;
import com.friday.document.viewmodel.TxtEditViewModel;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.zykj.view.widget.LimitEditText;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import kotlin.jvm.internal.InterfaceC9975q;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p244m2.C10193a;
import p244m2.C10193a.a;
import p309qc.C10786q;
import p309qc.InterfaceC10772c;
import p309qc.InterfaceC10773d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import p429z1.AbstractC11958b;
import sd.AbstractC11109f;
import sd.AbstractC11117h;
import sd.AbstractC11164t1;
import sd.C11157r0;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
@Route(path = "/document/TxtEditActivity")
/* loaded from: classes3.dex */
public final class TxtEditActivity extends Hilt_TxtEditActivity<ActivityTxtEditBinding> {

    /* renamed from: g */
    public final InterfaceC10773d f7755g;

    /* renamed from: i */
    public String f7757i;

    /* renamed from: m */
    public boolean f7761m;

    /* renamed from: o */
    public FileEntity f7763o;

    /* renamed from: p */
    public String f7764p;

    /* renamed from: h */
    public String f7756h = "";

    /* renamed from: j */
    public String f7758j = "";

    /* renamed from: k */
    public String f7759k = "";

    /* renamed from: l */
    public String f7760l = "";

    /* renamed from: n */
    public String f7762n = "";

    /* renamed from: com.friday.document.view.viewer.TxtEditActivity$a */
    public static final class ActionModeCallbackC6099a implements ActionMode.Callback {
        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            AbstractC9979u.m20294g(mode, "mode");
            AbstractC9979u.m20294g(item, "item");
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            AbstractC9979u.m20294g(mode, "mode");
            AbstractC9979u.m20294g(menu, "menu");
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode mode) {
            AbstractC9979u.m20294g(mode, "mode");
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            AbstractC9979u.m20294g(mode, "mode");
            AbstractC9979u.m20294g(menu, "menu");
            return false;
        }
    }

    /* renamed from: com.friday.document.view.viewer.TxtEditActivity$b */
    public static final class C6100b implements Observer, InterfaceC9975q {

        /* renamed from: c */
        public final /* synthetic */ InterfaceC9540l f7769c;

        public C6100b(InterfaceC9540l function) {
            AbstractC9979u.m20294g(function, "function");
            this.f7769c = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9975q)) {
                return AbstractC9979u.m20289b(getFunctionDelegate(), ((InterfaceC9975q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9975q
        public final InterfaceC10772c getFunctionDelegate() {
            return this.f7769c;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f7769c.invoke(obj);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.document.view.viewer.TxtEditActivity$initData$2", m26211f = "TxtEditActivity.kt", m26212l = {111}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.view.viewer.TxtEditActivity$initData$2 */
    public static final class C61012 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f7770c;

        @InterfaceC11829d(m26210c = "com.friday.document.view.viewer.TxtEditActivity$initData$2$1", m26211f = "TxtEditActivity.kt", m26212l = {}, m26213m = "invokeSuspend")
        /* renamed from: com.friday.document.view.viewer.TxtEditActivity$initData$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public int f7772c;

            /* renamed from: d */
            public final /* synthetic */ TxtEditActivity f7773d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TxtEditActivity txtEditActivity, InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
                this.f7773d = txtEditActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                return new AnonymousClass1(this.f7773d, interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                AbstractC11725a.m25952f();
                if (this.f7772c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                TxtEditActivity txtEditActivity = this.f7773d;
                if (txtEditActivity.f7761m) {
                    TxtEditActivity.m6183U(txtEditActivity).f6321c.setText(this.f7773d.f7764p);
                } else {
                    TxtEditActivity.m6183U(txtEditActivity).f6325g.setText(this.f7773d.f7764p);
                }
                this.f7773d.isShowLoading(false);
                return C10786q.f26013a;
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
                return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        public C61012(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return TxtEditActivity.this.new C61012(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f7770c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                TxtEditActivity txtEditActivity = TxtEditActivity.this;
                txtEditActivity.f7764p = AbstractC11958b.m26590k(txtEditActivity.f7762n, null, true, 2, null);
                AbstractC11164t1 abstractC11164t1M24800c = C11157r0.m24800c();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(TxtEditActivity.this, null);
                this.f7770c = 1;
                if (AbstractC11109f.m24709g(abstractC11164t1M24800c, anonymousClass1, this) == objM25952f) {
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
            return ((C61012) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.document.view.viewer.TxtEditActivity$onBackPressed$1", m26211f = "TxtEditActivity.kt", m26212l = {234, 263}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.view.viewer.TxtEditActivity$onBackPressed$1 */
    public static final class C61031 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public Object f7779c;

        /* renamed from: d */
        public Object f7780d;

        /* renamed from: e */
        public Object f7781e;

        /* renamed from: f */
        public boolean f7782f;

        /* renamed from: g */
        public int f7783g;

        @InterfaceC11829d(m26210c = "com.friday.document.view.viewer.TxtEditActivity$onBackPressed$1$1", m26211f = "TxtEditActivity.kt", m26212l = {}, m26213m = "invokeSuspend")
        /* renamed from: com.friday.document.view.viewer.TxtEditActivity$onBackPressed$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public int f7785c;

            /* renamed from: d */
            public final /* synthetic */ TxtEditActivity f7786d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TxtEditActivity txtEditActivity, InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
                this.f7786d = txtEditActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                return new AnonymousClass1(this.f7786d, interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                AbstractC11725a.m25952f();
                if (this.f7785c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                AbstractC11958b.m26588i("创建文本失败");
                TxtEditActivity.m6183U(this.f7786d).f6321c.setEnabled(false);
                return C10786q.f26013a;
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
                return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        @InterfaceC11829d(m26210c = "com.friday.document.view.viewer.TxtEditActivity$onBackPressed$1$3", m26211f = "TxtEditActivity.kt", m26212l = {}, m26213m = "invokeSuspend")
        /* renamed from: com.friday.document.view.viewer.TxtEditActivity$onBackPressed$1$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public int f7787c;

            /* renamed from: d */
            public final /* synthetic */ TxtEditActivity f7788d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(TxtEditActivity txtEditActivity, InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
                this.f7788d = txtEditActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                return new AnonymousClass3(this.f7788d, interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                AbstractC11725a.m25952f();
                if (this.f7787c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                AbstractC11958b.m26588i("本地文件丢失");
                this.f7788d.finish();
                return C10786q.f26013a;
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
                return ((AnonymousClass3) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        public C61031(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return TxtEditActivity.this.new C61031(interfaceC11588c);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0124, code lost:
        
            if (sd.AbstractC11109f.m24709g(r6, r7, r19) == r1) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x020a, code lost:
        
            if (sd.AbstractC11109f.m24709g(r4, r5, r19) == r1) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x020c, code lost:
        
            return r1;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 528
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.friday.document.view.viewer.TxtEditActivity.C61031.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/view/viewer/TxtEditActivity$onBackPressed$1.smali:127
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C61031) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public TxtEditActivity() {
        final InterfaceC9529a interfaceC9529a = null;
        this.f7755g = new ViewModelLazy(AbstractC9983y.m20315b(TxtEditViewModel.class), new InterfaceC9529a() { // from class: com.friday.document.view.viewer.TxtEditActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelStore invoke() {
                return this.getViewModelStore();
            }
        }, new InterfaceC9529a() { // from class: com.friday.document.view.viewer.TxtEditActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelProvider.Factory invoke() {
                return this.getDefaultViewModelProviderFactory();
            }
        }, new InterfaceC9529a() { // from class: com.friday.document.view.viewer.TxtEditActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC9529a interfaceC9529a2 = interfaceC9529a;
                return (interfaceC9529a2 == null || (creationExtras = (CreationExtras) interfaceC9529a2.invoke()) == null) ? this.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: U */
    public static final /* synthetic */ ActivityTxtEditBinding m6183U(TxtEditActivity txtEditActivity) {
        return (ActivityTxtEditBinding) txtEditActivity.getMBinding();
    }

    /* renamed from: a0 */
    public static final C10786q m6187a0(TxtEditActivity txtEditActivity, FileEntity fileEntity) {
        if (fileEntity != null) {
            LiveEventBus.get("UpdateSelectedNote").post(new UpdateSpecifiedItem(fileEntity.getFileId(), FromPage.valueOf(txtEditActivity.f7759k)));
            txtEditActivity.finish();
        }
        return C10786q.f26013a;
    }

    /* renamed from: b0 */
    public static final void m6188b0(final TxtEditActivity txtEditActivity, View view) {
        C10193a.a aVar = new C10193a(txtEditActivity).new a();
        PopupWindowNoteInfoBinding popupWindowNoteInfoBindingM5238a = PopupWindowNoteInfoBinding.m5238a(txtEditActivity.getLayoutInflater());
        AbstractC9979u.m20293f(popupWindowNoteInfoBindingM5238a, "inflate(...)");
        aVar.m21278b(popupWindowNoteInfoBindingM5238a).m21281e((int) txtEditActivity.getResources().getDimension(R$dimen.view_168), -2).m21280d(true).m21279c(new InterfaceC9545q() { // from class: y2.q
            @Override // p181hd.InterfaceC9545q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return TxtEditActivity.m6189c0(this.f28219c, (View) obj, (PopupWindow) obj2, (PopupWindowNoteInfoBinding) obj3);
            }
        }).m21277a().showAsDropDown(view, 0, 0, 80);
    }

    /* renamed from: c0 */
    public static final C10786q m6189c0(TxtEditActivity txtEditActivity, View view, PopupWindow popupWindow, PopupWindowNoteInfoBinding dataBinding) {
        AbstractC9979u.m20294g(view, "<unused var>");
        AbstractC9979u.m20294g(popupWindow, "popupWindow");
        AbstractC9979u.m20294g(dataBinding, "dataBinding");
        dataBinding.f6013f.setText("收到分享：" + txtEditActivity.f7760l);
        dataBinding.f6012e.setVisibility(8);
        popupWindow.dismiss();
        return C10786q.f26013a;
    }

    /* renamed from: d0 */
    public static final C10786q m6190d0(TxtEditActivity txtEditActivity, FileEntity fileEntity) {
        if (fileEntity != null) {
            txtEditActivity.f7763o = fileEntity;
            AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(txtEditActivity), C11157r0.m24799b(), null, new TxtEditActivity$initData$4$1(txtEditActivity, fileEntity, null), 2, null);
        } else {
            txtEditActivity.isShowLoading(false);
            AbstractC11958b.m26588i("未找到该文本");
            txtEditActivity.finish();
        }
        return C10786q.f26013a;
    }

    /* renamed from: e0 */
    public static final C10786q m6191e0(TxtEditActivity txtEditActivity, FileEntity fileEntity) {
        if (fileEntity != null) {
            txtEditActivity.finish();
            LiveEventBus.get("UpdateSelectedNote").post(new UpdateSpecifiedItem(fileEntity.getFileId(), FromPage.valueOf(txtEditActivity.f7759k)));
        }
        return C10786q.f26013a;
    }

    /* renamed from: f0 */
    public static final void m6192f0(TxtEditActivity txtEditActivity, View view) {
        txtEditActivity.onBackPressed();
    }

    /* renamed from: Y */
    public final void m6193Y(EditText editText) {
        try {
            editText.setLongClickable(false);
            editText.setTextIsSelectable(false);
            editText.setCustomSelectionActionModeCallback(new ActionModeCallbackC6099a());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: Z */
    public final TxtEditViewModel m6194Z() {
        return (TxtEditViewModel) this.f7755g.getValue();
    }

    /* renamed from: g0 */
    public final boolean m6195g0() {
        return !this.f7761m && this.f7762n.length() > 0;
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public int getLayoutId() {
        return R$layout.activity_txt_edit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.friday.common.base.InterfaceC5929c
    public void initData() {
        ARouter.getInstance().inject(this);
        ((ActivityTxtEditBinding) getMBinding()).f6326h.setText(this.f7758j);
        if (this.f7761m) {
            LimitEditText etTxt = ((ActivityTxtEditBinding) getMBinding()).f6321c;
            AbstractC9979u.m20293f(etTxt, "etTxt");
            etTxt.setVisibility(0);
            NestedScrollView nsvTxt = ((ActivityTxtEditBinding) getMBinding()).f6324f;
            AbstractC9979u.m20293f(nsvTxt, "nsvTxt");
            nsvTxt.setVisibility(8);
        } else {
            LimitEditText etTxt2 = ((ActivityTxtEditBinding) getMBinding()).f6321c;
            AbstractC9979u.m20293f(etTxt2, "etTxt");
            etTxt2.setVisibility(8);
            NestedScrollView nsvTxt2 = ((ActivityTxtEditBinding) getMBinding()).f6324f;
            AbstractC9979u.m20293f(nsvTxt2, "nsvTxt");
            nsvTxt2.setVisibility(0);
        }
        m6194Z().m6484k().observe(this, new C6100b(new InterfaceC9540l() { // from class: y2.l
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return TxtEditActivity.m6187a0(this.f28214c, (FileEntity) obj);
            }
        }));
        if (m6195g0()) {
            ImageView ivNoteInfo = ((ActivityTxtEditBinding) getMBinding()).f6323e;
            AbstractC9979u.m20293f(ivNoteInfo, "ivNoteInfo");
            ivNoteInfo.setVisibility(0);
            AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this), C11157r0.m24799b(), null, new C61012(null), 2, null);
        } else if (this.f7756h.length() > 0) {
            isShowLoading(true);
            m6194Z().m6483j(this.f7756h);
        }
        ImageView ivNoteInfo2 = ((ActivityTxtEditBinding) getMBinding()).f6323e;
        AbstractC9979u.m20293f(ivNoteInfo2, "ivNoteInfo");
        ivNoteInfo2.setVisibility(m6195g0() ? 0 : 8);
        ((ActivityTxtEditBinding) getMBinding()).f6323e.setOnClickListener(new View.OnClickListener() { // from class: y2.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TxtEditActivity.m6188b0(this.f28215c, view);
            }
        });
        m6194Z().m6485l().observe(this, new C6100b(new InterfaceC9540l() { // from class: y2.n
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return TxtEditActivity.m6190d0(this.f28216c, (FileEntity) obj);
            }
        }));
        m6194Z().m6486m().observe(this, new C6100b(new InterfaceC9540l() { // from class: y2.o
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return TxtEditActivity.m6191e0(this.f28217c, (FileEntity) obj);
            }
        }));
        ((ActivityTxtEditBinding) getMBinding()).f6322d.setOnClickListener(new View.OnClickListener() { // from class: y2.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TxtEditActivity.m6192f0(this.f28218c, view);
            }
        });
        LimitEditText etTxt3 = ((ActivityTxtEditBinding) getMBinding()).f6321c;
        AbstractC9979u.m20293f(etTxt3, "etTxt");
        m6193Y(etTxt3);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this), C11157r0.m24799b(), null, new C61031(null), 2, null);
    }
}
