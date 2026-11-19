package com.friday.paint.view;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioGroup;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.alibaba.fastjson.asm.Opcodes;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.ClickUtils;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.PathUtils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.friday.common.entity.PayloadKey;
import com.friday.common.helper.C5963c;
import com.friday.common.helper.RightListDecoration;
import com.friday.common.widget.dialog.BaseDialog;
import com.friday.common.widget.dialog.C5975a;
import com.friday.paint.R$drawable;
import com.friday.paint.R$id;
import com.friday.paint.R$layout;
import com.friday.paint.R$string;
import com.friday.paint.adapter.NoteFragmentStateAdapter;
import com.friday.paint.adapter.ThumbnailListAdapter;
import com.friday.paint.databinding.FragmentThePaintBinding;
import com.friday.paint.databinding.ItemPaintPenColorBinding;
import com.friday.paint.model.NoteListEntity;
import com.friday.paint.model.PaintEntity;
import com.friday.paint.view.ThePaintFragment;
import com.friday.paint.viewmodel.NoteViewModel;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.zykj.sketch.core.config.GraphConfig;
import com.zykj.sketch.core.config.SketchConfig;
import com.zykj.sketch.core.data.Mode;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC9923a;
import kotlin.AbstractC9924b;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import kotlin.jvm.internal.InterfaceC9975q;
import p141f2.C9164a;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p200j2.InterfaceC9662b;
import p215k2.AbstractC9796n;
import p215k2.AbstractC9804v;
import p268o1.InterfaceC10427d;
import p268o1.InterfaceC10428e;
import p285p1.C10599a;
import p309qc.C10786q;
import p309qc.InterfaceC10772c;
import p309qc.InterfaceC10773d;
import p325rc.AbstractC10978w;
import p325rc.AbstractC10980x;
import p378vb.AbstractC11584n;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11607p;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import p429z1.AbstractC11958b;
import sd.AbstractC11117h;
import sd.C11157r0;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public class ThePaintFragment extends Hilt_ThePaintFragment<FragmentThePaintBinding> {

    /* renamed from: m */
    public static final C6258a f9962m = new C6258a(null);

    /* renamed from: n */
    public static final int f9963n = 8;

    /* renamed from: i */
    public final InterfaceC10773d f9964i;

    /* renamed from: k */
    public InterfaceC9662b f9966k;

    /* renamed from: j */
    public final InterfaceC10773d f9965j = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: c4.r
        @Override // p181hd.InterfaceC9529a
        public final Object invoke() {
            return ThePaintFragment.m7439c1();
        }
    });

    /* renamed from: l */
    public final InterfaceC10773d f9967l = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: c4.c0
        @Override // p181hd.InterfaceC9529a
        public final Object invoke() {
            return ThePaintFragment.m7452s0(this.f3378c);
        }
    });

    /* renamed from: com.friday.paint.view.ThePaintFragment$a */
    public static final class C6258a {
        public /* synthetic */ C6258a(AbstractC9972n abstractC9972n) {
            this();
        }

        public C6258a() {
        }
    }

    /* renamed from: com.friday.paint.view.ThePaintFragment$b */
    public static final class C6259b implements InterfaceC10428e {

        /* renamed from: a */
        public int f9972a;

        /* renamed from: b */
        public NoteListEntity f9973b;

        public C6259b() {
        }

        @Override // p268o1.InterfaceC10428e
        /* renamed from: a */
        public void mo7473a(RecyclerView.ViewHolder viewHolder, int i10) {
            AbstractC9979u.m20294g(viewHolder, "viewHolder");
            if (viewHolder.itemView.getAlpha() == 0.5f) {
                C9164a.f21403a.m18055b(viewHolder.itemView, 1.0f, 1.2f, 600L);
            }
            ThePaintFragment.this.isShowLoading(true);
            ThePaintFragment.this.m7471t0().m7300d(this.f9972a, i10);
            NoteListEntity noteListEntity = this.f9973b;
            if (noteListEntity != null) {
                ThePaintFragment thePaintFragment = ThePaintFragment.this;
                int iIndexOf = thePaintFragment.m7472u0().getData().indexOf(noteListEntity);
                if (i10 == iIndexOf) {
                    thePaintFragment.m7456v0().m7731V(i10);
                } else {
                    thePaintFragment.m7456v0().m7731V(iIndexOf);
                }
            }
            if (!ThePaintFragment.m7441e0(ThePaintFragment.this).f9786j.isEnabled()) {
                ThePaintFragment thePaintFragment2 = ThePaintFragment.this;
                ImageView ivCopyPage = ThePaintFragment.m7441e0(thePaintFragment2).f9786j;
                AbstractC9979u.m20293f(ivCopyPage, "ivCopyPage");
                ImageView ivAddPage = ThePaintFragment.m7441e0(ThePaintFragment.this).f9781e;
                AbstractC9979u.m20293f(ivAddPage, "ivAddPage");
                ImageView ivRemovePage = ThePaintFragment.m7441e0(ThePaintFragment.this).f9796t;
                AbstractC9979u.m20293f(ivRemovePage, "ivRemovePage");
                thePaintFragment2.convertEnable(ivCopyPage, ivAddPage, ivRemovePage);
            }
            ThePaintFragment.this.m7456v0().m7732W(true);
            ThePaintFragment.this.m7472u0().notifyDataSetChanged();
            ThePaintFragment.this.isShowLoading(false);
        }

        @Override // p268o1.InterfaceC10428e
        /* renamed from: b */
        public void mo7474b(RecyclerView.ViewHolder source, int i10, RecyclerView.ViewHolder target, int i11) {
            AbstractC9979u.m20294g(source, "source");
            AbstractC9979u.m20294g(target, "target");
        }

        @Override // p268o1.InterfaceC10428e
        /* renamed from: c */
        public void mo7475c(RecyclerView.ViewHolder viewHolder, int i10) {
            Object next;
            AbstractC9979u.m20294g(viewHolder, "viewHolder");
            if (ThePaintFragment.m7441e0(ThePaintFragment.this).f9786j.isEnabled()) {
                ThePaintFragment thePaintFragment = ThePaintFragment.this;
                ImageView ivCopyPage = ThePaintFragment.m7441e0(thePaintFragment).f9786j;
                AbstractC9979u.m20293f(ivCopyPage, "ivCopyPage");
                ImageView ivAddPage = ThePaintFragment.m7441e0(ThePaintFragment.this).f9781e;
                AbstractC9979u.m20293f(ivAddPage, "ivAddPage");
                ImageView ivRemovePage = ThePaintFragment.m7441e0(ThePaintFragment.this).f9796t;
                AbstractC9979u.m20293f(ivRemovePage, "ivRemovePage");
                thePaintFragment.convertEnable(ivCopyPage, ivAddPage, ivRemovePage);
            }
            if (viewHolder.itemView.getAlpha() == 1.0f) {
                C9164a.f21403a.m18055b(viewHolder.itemView, 1.0f, 1.2f, 600L);
            }
            this.f9972a = i10;
            Iterator<T> it = ThePaintFragment.this.m7472u0().getData().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((NoteListEntity) next).getSelected()) {
                        break;
                    }
                }
            }
            this.f9973b = (NoteListEntity) next;
        }
    }

    /* renamed from: com.friday.paint.view.ThePaintFragment$c */
    public static final class C6260c implements Observer, InterfaceC9975q {

        /* renamed from: c */
        public final /* synthetic */ InterfaceC9540l f9975c;

        public C6260c(InterfaceC9540l function) {
            AbstractC9979u.m20294g(function, "function");
            this.f9975c = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9975q)) {
                return AbstractC9979u.m20289b(getFunctionDelegate(), ((InterfaceC9975q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9975q
        public final InterfaceC10772c getFunctionDelegate() {
            return this.f9975c;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f9975c.invoke(obj);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.paint.view.ThePaintFragment$copyNote$1", m26211f = "ThePaintFragment.kt", m26212l = {543, 548, 559, 561}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.paint.view.ThePaintFragment$copyNote$1 */
    public static final class C62611 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public Object f9989c;

        /* renamed from: d */
        public Object f9990d;

        /* renamed from: e */
        public Object f9991e;

        /* renamed from: f */
        public int f9992f;

        /* renamed from: h */
        public final /* synthetic */ int f9994h;

        @InterfaceC11829d(m26210c = "com.friday.paint.view.ThePaintFragment$copyNote$1$1", m26211f = "ThePaintFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
        /* renamed from: com.friday.paint.view.ThePaintFragment$copyNote$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public int f9995c;

            public AnonymousClass1(InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                return new AnonymousClass1(interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                AbstractC11725a.m25952f();
                if (this.f9995c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                AbstractC11958b.m26588i("已达页数上限，无法新增笔记页");
                return C10786q.f26013a;
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
                return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        @InterfaceC11829d(m26210c = "com.friday.paint.view.ThePaintFragment$copyNote$1$2", m26211f = "ThePaintFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
        /* renamed from: com.friday.paint.view.ThePaintFragment$copyNote$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public int f9996c;

            /* renamed from: d */
            public final /* synthetic */ ThePaintFragment f9997d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(ThePaintFragment thePaintFragment, InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
                this.f9997d = thePaintFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                return new AnonymousClass2(this.f9997d, interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                AbstractC11725a.m25952f();
                if (this.f9996c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                this.f9997d.isShowLoading(true);
                return C10786q.f26013a;
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
                return ((AnonymousClass2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        @InterfaceC11829d(m26210c = "com.friday.paint.view.ThePaintFragment$copyNote$1$3", m26211f = "ThePaintFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
        /* renamed from: com.friday.paint.view.ThePaintFragment$copyNote$1$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public int f9998c;

            /* renamed from: d */
            public final /* synthetic */ ThePaintFragment f9999d;

            /* renamed from: e */
            public final /* synthetic */ int f10000e;

            /* renamed from: f */
            public final /* synthetic */ String f10001f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(ThePaintFragment thePaintFragment, int i10, String str, InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
                this.f9999d = thePaintFragment;
                this.f10000e = i10;
                this.f10001f = str;
            }

            /* renamed from: m */
            public static final void m7477m(ThePaintFragment thePaintFragment, int i10) {
                thePaintFragment.m7456v0().m7731V(i10);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                return new AnonymousClass3(this.f9999d, this.f10000e, this.f10001f, interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                AbstractC11725a.m25952f();
                if (this.f9998c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                this.f9999d.m7472u0().addData(this.f10000e, (int) new NoteListEntity(this.f10001f + "/thumbnail.jpg", false, false, null, 14, null));
                int size = this.f9999d.m7472u0().getData().size();
                for (int i10 = this.f10000e; i10 < size; i10++) {
                    this.f9999d.m7472u0().notifyItemChanged(i10);
                }
                this.f9999d.m7471t0().m7297a(this.f10000e, new PaintEntity(this.f10001f));
                RecyclerView recyclerView = ThePaintFragment.m7441e0(this.f9999d).f9774E;
                final ThePaintFragment thePaintFragment = this.f9999d;
                final int i11 = this.f10000e;
                recyclerView.post(new Runnable() { // from class: com.friday.paint.view.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        ThePaintFragment.C62611.AnonymousClass3.m7477m(thePaintFragment, i11);
                    }
                });
                this.f9999d.isShowLoading(false);
                return C10786q.f26013a;
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
                return ((AnonymousClass3) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C62611(int i10, InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
            this.f9994h = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return ThePaintFragment.this.new C62611(this.f9994h, interfaceC11588c);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
        
            if (sd.AbstractC11109f.m24709g(r11, r1, r10) == r0) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x010c, code lost:
        
            if (sd.AbstractC11109f.m24709g(r3, r6, r10) == r0) goto L36;
         */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00cc  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00e7 A[PHI: r1 r4 r11
          0x00e7: PHI (r1v8 java.lang.String) = (r1v7 java.lang.String), (r1v9 java.lang.String) binds: [B:28:0x00ca, B:33:0x00e6] A[DONT_GENERATE, DONT_INLINE]
          0x00e7: PHI (r4v3 com.friday.paint.model.PaintEntity) = (r4v2 com.friday.paint.model.PaintEntity), (r4v5 com.friday.paint.model.PaintEntity) binds: [B:28:0x00ca, B:33:0x00e6] A[DONT_GENERATE, DONT_INLINE]
          0x00e7: PHI (r11v14 java.lang.String) = (r11v13 java.lang.String), (r11v18 java.lang.String) binds: [B:28:0x00ca, B:33:0x00e6] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 274
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.friday.paint.view.ThePaintFragment.C62611.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes4/com/friday/paint/view/ThePaintFragment$copyNote$1.smali:137
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C62611) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.paint.view.ThePaintFragment$initObserver$6", m26211f = "ThePaintFragment.kt", m26212l = {305}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.paint.view.ThePaintFragment$initObserver$6 */
    public static final class C62636 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f10011c;

        @InterfaceC11829d(m26210c = "com.friday.paint.view.ThePaintFragment$initObserver$6$1", m26211f = "ThePaintFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
        /* renamed from: com.friday.paint.view.ThePaintFragment$initObserver$6$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public int f10013c;

            /* renamed from: d */
            public /* synthetic */ Object f10014d;

            /* renamed from: e */
            public final /* synthetic */ ThePaintFragment f10015e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ThePaintFragment thePaintFragment, InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
                this.f10015e = thePaintFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f10015e, interfaceC11588c);
                anonymousClass1.f10014d = ((Result) obj).m20061n();
                return anonymousClass1;
            }

            @Override // p181hd.InterfaceC9544p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Result) obj).m20061n(), (InterfaceC11588c) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                String message;
                Object obj2 = this.f10014d;
                AbstractC11725a.m25952f();
                if (this.f10013c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                if (Result.m20059k(obj2)) {
                    C5963c c5963c = C5963c.f6084a;
                    FragmentActivity fragmentActivityRequireActivity = this.f10015e.requireActivity();
                    AbstractC9979u.m20293f(fragmentActivityRequireActivity, "requireActivity(...)");
                    String strM7717G = this.f10015e.m7456v0().m7717G();
                    String strM7712B = this.f10015e.m7456v0().m7712B();
                    List listM24136n = AbstractC10978w.m24136n();
                    if (Result.m20058g(obj2)) {
                        obj2 = listM24136n;
                    }
                    C5963c.m5300b(c5963c, fragmentActivityRequireActivity, strM7717G, strM7712B, true, new ArrayList((Collection) obj2), false, false, null, Opcodes.CHECKCAST, null);
                } else {
                    Throwable thM20056e = Result.m20056e(obj2);
                    if (thM20056e != null && (message = thM20056e.getMessage()) != null) {
                        AbstractC11958b.m26588i(message);
                    }
                }
                return C10786q.f26013a;
            }

            public final Object invoke(Object obj, InterfaceC11588c interfaceC11588c) {
                return ((AnonymousClass1) create(Result.m20053a(obj), interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        public C62636(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return ThePaintFragment.this.new C62636(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f10011c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC11607p interfaceC11607pM7742w = ThePaintFragment.this.m7456v0().m7742w();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ThePaintFragment.this, null);
                this.f10011c = 1;
                if (AbstractC11596e.m25559i(interfaceC11607pM7742w, anonymousClass1, this) == objM25952f) {
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
            return ((C62636) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public ThePaintFragment() {
        final InterfaceC9529a interfaceC9529a = null;
        this.f9964i = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9983y.m20315b(NoteViewModel.class), new InterfaceC9529a() { // from class: com.friday.paint.view.ThePaintFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new InterfaceC9529a() { // from class: com.friday.paint.view.ThePaintFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC9529a interfaceC9529a2 = interfaceC9529a;
                return (interfaceC9529a2 == null || (creationExtras = (CreationExtras) interfaceC9529a2.invoke()) == null) ? this.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
            }
        }, new InterfaceC9529a() { // from class: com.friday.paint.view.ThePaintFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: A0 */
    public static final void m7384A0(ItemPaintPenColorBinding itemPaintPenColorBinding, ThePaintFragment thePaintFragment, View view) {
        view.setSelected(true);
        itemPaintPenColorBinding.f9812d.setSelected(false);
        itemPaintPenColorBinding.f9813e.setSelected(false);
        GraphConfig graphConfig = (GraphConfig) thePaintFragment.m7456v0().m7715E().getValue();
        if (graphConfig != null) {
            thePaintFragment.m7456v0().m7715E().setValue(new GraphConfig(3.0f, graphConfig.getColor()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: B0 */
    public static final void m7386B0(ItemPaintPenColorBinding itemPaintPenColorBinding, ThePaintFragment thePaintFragment, View view) {
        view.setSelected(true);
        itemPaintPenColorBinding.f9811c.setSelected(false);
        itemPaintPenColorBinding.f9813e.setSelected(false);
        GraphConfig graphConfig = (GraphConfig) thePaintFragment.m7456v0().m7715E().getValue();
        if (graphConfig != null) {
            thePaintFragment.m7456v0().m7715E().setValue(new GraphConfig(8.0f, graphConfig.getColor()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: C0 */
    public static final void m7388C0(ItemPaintPenColorBinding itemPaintPenColorBinding, ThePaintFragment thePaintFragment, View view) {
        view.setSelected(true);
        itemPaintPenColorBinding.f9811c.setSelected(false);
        itemPaintPenColorBinding.f9812d.setSelected(false);
        GraphConfig graphConfig = (GraphConfig) thePaintFragment.m7456v0().m7715E().getValue();
        if (graphConfig != null) {
            thePaintFragment.m7456v0().m7715E().setValue(new GraphConfig(15.0f, graphConfig.getColor()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: D0 */
    public static final void m7390D0(final ThePaintFragment thePaintFragment, View view) {
        if (((FragmentThePaintBinding) thePaintFragment.getMBinding()).f9776G.getVisibility() == 0) {
            C9164a c9164a = C9164a.f21403a;
            ConstraintLayout tooBox = ((FragmentThePaintBinding) thePaintFragment.getMBinding()).f9776G;
            AbstractC9979u.m20293f(tooBox, "tooBox");
            ConstraintLayout penEraser = ((FragmentThePaintBinding) thePaintFragment.getMBinding()).f9770A;
            AbstractC9979u.m20293f(penEraser, "penEraser");
            ImageView ivExpansion = ((FragmentThePaintBinding) thePaintFragment.getMBinding()).f9791o;
            AbstractC9979u.m20293f(ivExpansion, "ivExpansion");
            c9164a.m18056c(500L, true, new View[]{tooBox, penEraser, ivExpansion}, new InterfaceC9529a() { // from class: c4.r0
                @Override // p181hd.InterfaceC9529a
                public final Object invoke() {
                    return ThePaintFragment.m7392E0(this.f3414c);
                }
            });
            return;
        }
        ((FragmentThePaintBinding) thePaintFragment.getMBinding()).f9776G.setVisibility(0);
        C9164a c9164a2 = C9164a.f21403a;
        ConstraintLayout tooBox2 = ((FragmentThePaintBinding) thePaintFragment.getMBinding()).f9776G;
        AbstractC9979u.m20293f(tooBox2, "tooBox");
        ConstraintLayout penEraser2 = ((FragmentThePaintBinding) thePaintFragment.getMBinding()).f9770A;
        AbstractC9979u.m20293f(penEraser2, "penEraser");
        ImageView ivExpansion2 = ((FragmentThePaintBinding) thePaintFragment.getMBinding()).f9791o;
        AbstractC9979u.m20293f(ivExpansion2, "ivExpansion");
        c9164a2.m18056c(500L, false, new View[]{tooBox2, penEraser2, ivExpansion2}, new InterfaceC9529a() { // from class: c4.s0
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return ThePaintFragment.m7394F0(this.f3417c);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: E0 */
    public static final C10786q m7392E0(ThePaintFragment thePaintFragment) {
        ((FragmentThePaintBinding) thePaintFragment.getMBinding()).f9791o.setImageResource(R$drawable.view_icon_expansion_right);
        ((FragmentThePaintBinding) thePaintFragment.getMBinding()).f9770A.setVisibility(8);
        ((FragmentThePaintBinding) thePaintFragment.getMBinding()).f9776G.setVisibility(8);
        ((FragmentThePaintBinding) thePaintFragment.getMBinding()).f9773D.setVisibility(8);
        ((FragmentThePaintBinding) thePaintFragment.getMBinding()).f9779c.getRoot().setVisibility(8);
        return C10786q.f26013a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: F0 */
    public static final C10786q m7394F0(ThePaintFragment thePaintFragment) {
        ((FragmentThePaintBinding) thePaintFragment.getMBinding()).f9791o.setImageResource(R$drawable.view_icon_expansion_left);
        return C10786q.f26013a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: G0 */
    public static final void m7396G0(ThePaintFragment thePaintFragment, View view) {
        if (((SketchConfig) thePaintFragment.m7456v0().m7721K().getValue()) != null) {
            MutableLiveData mutableLiveDataM7721K = thePaintFragment.m7456v0().m7721K();
            SketchConfig.Builder touchable = new SketchConfig.Builder().setTouchable(!r3.isTouchable());
            Context contextRequireContext = thePaintFragment.requireContext();
            AbstractC9979u.m20293f(contextRequireContext, "requireContext(...)");
            mutableLiveDataM7721K.setValue(touchable.build(contextRequireContext));
        }
    }

    /* renamed from: H0 */
    public static final void m7398H0(ThePaintFragment thePaintFragment, View view) {
        thePaintFragment.m7468o0();
    }

    /* renamed from: I0 */
    public static final void m7400I0(ThePaintFragment thePaintFragment, View view) {
        thePaintFragment.m7470q0();
    }

    /* renamed from: J0 */
    public static final void m7402J0(ThePaintFragment thePaintFragment, RadioGroup radioGroup, int i10) {
        if (i10 == R$id.rb_line) {
            thePaintFragment.m7456v0().m7722L().setValue(Mode.ACTION_ERASER_WRITING);
        } else if (i10 == R$id.rb_image) {
            thePaintFragment.m7456v0().m7722L().setValue(Mode.ACTION_ERASER_VIEW);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: K0 */
    public static final void m7404K0(ThePaintFragment thePaintFragment, View view) {
        if (((FragmentThePaintBinding) thePaintFragment.getMBinding()).f9773D.getCheckedRadioButtonId() == -1) {
            ((FragmentThePaintBinding) thePaintFragment.getMBinding()).f9773D.check(R$id.rb_line);
        }
        thePaintFragment.m7456v0().m7722L().setValue(((FragmentThePaintBinding) thePaintFragment.getMBinding()).f9773D.getCheckedRadioButtonId() == R$id.rb_line ? Mode.ACTION_ERASER_WRITING : Mode.ACTION_ERASER_VIEW);
        ((FragmentThePaintBinding) thePaintFragment.getMBinding()).f9773D.setVisibility(((FragmentThePaintBinding) thePaintFragment.getMBinding()).f9773D.getVisibility() == 8 ? 0 : 8);
        ((FragmentThePaintBinding) thePaintFragment.getMBinding()).f9770A.setVisibility(((FragmentThePaintBinding) thePaintFragment.getMBinding()).f9773D.getVisibility() == 0 ? 0 : 8);
        ((FragmentThePaintBinding) thePaintFragment.getMBinding()).f9779c.getRoot().setVisibility(8);
        ((FragmentThePaintBinding) thePaintFragment.getMBinding()).f9798v.setSelected(false);
        ((FragmentThePaintBinding) thePaintFragment.getMBinding()).f9794r.setSelected(false);
        ((FragmentThePaintBinding) thePaintFragment.getMBinding()).f9790n.setSelected(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: L0 */
    public static final void m7406L0(ThePaintFragment thePaintFragment, View view) {
        thePaintFragment.m7456v0().m7722L().setValue(Mode.ACTION_SELECT);
        ((FragmentThePaintBinding) thePaintFragment.getMBinding()).f9779c.getRoot().setVisibility(8);
        ((FragmentThePaintBinding) thePaintFragment.getMBinding()).f9773D.setVisibility(8);
        ((FragmentThePaintBinding) thePaintFragment.getMBinding()).f9779c.getRoot().setVisibility(8);
        ((FragmentThePaintBinding) thePaintFragment.getMBinding()).f9770A.setVisibility(8);
        ((FragmentThePaintBinding) thePaintFragment.getMBinding()).f9798v.setSelected(true);
        ((FragmentThePaintBinding) thePaintFragment.getMBinding()).f9794r.setSelected(false);
        ((FragmentThePaintBinding) thePaintFragment.getMBinding()).f9790n.setSelected(false);
    }

    /* renamed from: M0 */
    public static final void m7408M0(ThePaintFragment thePaintFragment, BaseQuickAdapter baseQuickAdapter, View view, int i10) {
        AbstractC9979u.m20294g(baseQuickAdapter, "<unused var>");
        AbstractC9979u.m20294g(view, "<unused var>");
        thePaintFragment.m7456v0().m7731V(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: N0 */
    public static final void m7410N0(final ThePaintFragment thePaintFragment, View view) {
        Integer num = (Integer) thePaintFragment.m7456v0().m7743x().getValue();
        if (num != null) {
            final int iIntValue = num.intValue();
            if (thePaintFragment.m7471t0().getItemCount() == 1) {
                AbstractC11958b.m26588i("不能删除所有笔记");
                return;
            }
            BaseDialog baseDialogM5436B = C5975a.f6196a.m5436B(new InterfaceC9529a() { // from class: c4.t0
                @Override // p181hd.InterfaceC9529a
                public final Object invoke() {
                    return ThePaintFragment.m7412O0(this.f3420c, iIntValue);
                }
            });
            FragmentManager childFragmentManager = thePaintFragment.getChildFragmentManager();
            AbstractC9979u.m20293f(childFragmentManager, "getChildFragmentManager(...)");
            baseDialogM5436B.show(childFragmentManager, RequestParameters.SUBRESOURCE_DELETE);
        }
    }

    /* renamed from: O0 */
    public static final C10786q m7412O0(ThePaintFragment thePaintFragment, int i10) {
        NoteViewModel noteViewModelM7456v0 = thePaintFragment.m7456v0();
        List data = thePaintFragment.m7471t0().getData();
        ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(data, 10));
        Iterator it = data.iterator();
        while (it.hasNext()) {
            arrayList.add(((PaintEntity) it.next()).getPath());
        }
        noteViewModelM7456v0.m7736q(i10, arrayList);
        return C10786q.f26013a;
    }

    /* renamed from: P0 */
    public static final void m7414P0(ThePaintFragment thePaintFragment, View view) {
        thePaintFragment.m7456v0().m7734n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: Q0 */
    public static final void m7416Q0(ThePaintFragment thePaintFragment, View view) {
        Integer num = (Integer) thePaintFragment.m7456v0().m7743x().getValue();
        if (num != null) {
            thePaintFragment.copyNote(num.intValue() + 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: R0 */
    public static final void m7418R0(ThePaintFragment thePaintFragment, View view) {
        Integer num = (Integer) thePaintFragment.m7456v0().m7743x().getValue();
        if (num != null) {
            m7445j0(thePaintFragment, num.intValue() + 1, null, false, 6, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: S0 */
    public static final C10786q m7420S0(ThePaintFragment thePaintFragment, SketchConfig sketchConfig) {
        AbstractC11584n.m25520q(Boolean.valueOf(sketchConfig.isTouchable()));
        ((FragmentThePaintBinding) thePaintFragment.getMBinding()).f9800x.setSelected(sketchConfig.isTouchable());
        return C10786q.f26013a;
    }

    /* renamed from: T0 */
    public static final C10786q m7422T0(ThePaintFragment thePaintFragment, Integer num) {
        if (num != null) {
            if (num.intValue() >= 0) {
                AbstractC11958b.m26588i("删除成功");
                int iIntValue = num.intValue() == thePaintFragment.m7471t0().getItemCount() + (-1) ? num.intValue() - 1 : num.intValue();
                thePaintFragment.m7471t0().m7299c(num.intValue());
                thePaintFragment.m7472u0().removeAt(num.intValue());
                thePaintFragment.m7456v0().m7731V(iIntValue);
            } else {
                AbstractC11958b.m26588i("删除失败");
            }
        }
        return C10786q.f26013a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: U0 */
    public static final void m7424U0(ThePaintFragment thePaintFragment, Object obj) {
        Integer num = (Integer) thePaintFragment.m7456v0().m7743x().getValue();
        if (num != null) {
            thePaintFragment.m7472u0().notifyItemChanged(num.intValue(), PayloadKey.THUMBNAIL);
        }
    }

    /* renamed from: V0 */
    public static final C10786q m7426V0(ThePaintFragment thePaintFragment, Integer num) {
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(thePaintFragment), null, null, new ThePaintFragment$initObserver$4$1(thePaintFragment, num, null), 3, null);
        return C10786q.f26013a;
    }

    /* renamed from: W0 */
    public static final C10786q m7428W0(ThePaintFragment thePaintFragment, Boolean bool) {
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(thePaintFragment), null, null, new ThePaintFragment$initObserver$5$1(bool, thePaintFragment, null), 3, null);
        return C10786q.f26013a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: Y0 */
    public static final void m7431Y0(ThePaintFragment thePaintFragment, View view) {
        FragmentThePaintBinding fragmentThePaintBinding = (FragmentThePaintBinding) thePaintFragment.getMBinding();
        if (fragmentThePaintBinding.f9780d.isDrawerOpen(fragmentThePaintBinding.f9801y)) {
            return;
        }
        fragmentThePaintBinding.f9780d.openDrawer(fragmentThePaintBinding.f9801y);
        thePaintFragment.m7456v0().m7732W(true);
        AbstractC9804v.f23002a.m19815a("PageDrawer");
    }

    /* renamed from: Z0 */
    public static final void m7433Z0(ThePaintFragment thePaintFragment, View view) {
        LifecycleOwner viewLifecycleOwner = thePaintFragment.getViewLifecycleOwner();
        AbstractC9979u.m20293f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new ThePaintFragment$initViewPager2$3$1(thePaintFragment, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a1 */
    public static final void m7435a1(ThePaintFragment thePaintFragment, View view) {
        Integer num = (Integer) thePaintFragment.m7456v0().m7743x().getValue();
        if (num != null) {
            int iIntValue = num.intValue();
            if (iIntValue == thePaintFragment.m7471t0().getItemCount() - 1) {
                m7445j0(thePaintFragment, iIntValue + 1, null, false, 6, null);
            } else {
                thePaintFragment.m7456v0().m7731V(iIntValue + 1);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b1 */
    public static final void m7437b1(ThePaintFragment thePaintFragment, View view) {
        Integer num = (Integer) thePaintFragment.m7456v0().m7743x().getValue();
        if (num != null) {
            int iIntValue = num.intValue();
            NoteViewModel noteViewModelM7456v0 = thePaintFragment.m7456v0();
            if (iIntValue != 0) {
                iIntValue--;
            }
            noteViewModelM7456v0.m7731V(iIntValue);
        }
    }

    /* renamed from: c1 */
    public static final ThumbnailListAdapter m7439c1() {
        return new ThumbnailListAdapter();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e0 */
    public static final /* synthetic */ FragmentThePaintBinding m7441e0(ThePaintFragment thePaintFragment) {
        return (FragmentThePaintBinding) thePaintFragment.getMBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initClick() {
        ((FragmentThePaintBinding) getMBinding()).f9794r.setSelected(true);
        ClickUtils.applyGlobalDebouncing(((FragmentThePaintBinding) getMBinding()).f9784h, 1000L, new View.OnClickListener() { // from class: c4.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ThePaintFragment.m7462y0(this.f3423c, view);
            }
        });
        ((FragmentThePaintBinding) getMBinding()).f9800x.setOnClickListener(new View.OnClickListener() { // from class: c4.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ThePaintFragment.m7396G0(this.f3439c, view);
            }
        });
        ImageView ivCamera = ((FragmentThePaintBinding) getMBinding()).f9785i;
        AbstractC9979u.m20293f(ivCamera, "ivCamera");
        AbstractC11958b.m26591l(ivCamera, 1000L, new View.OnClickListener() { // from class: c4.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ThePaintFragment.m7398H0(this.f3373c, view);
            }
        });
        ImageView ivGallery = ((FragmentThePaintBinding) getMBinding()).f9792p;
        AbstractC9979u.m20293f(ivGallery, "ivGallery");
        AbstractC11958b.m26591l(ivGallery, 1000L, new View.OnClickListener() { // from class: c4.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ThePaintFragment.m7400I0(this.f3375c, view);
            }
        });
        ((FragmentThePaintBinding) getMBinding()).f9773D.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: c4.d0
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i10) {
                ThePaintFragment.m7402J0(this.f3380a, radioGroup, i10);
            }
        });
        ((FragmentThePaintBinding) getMBinding()).f9790n.setOnClickListener(new View.OnClickListener() { // from class: c4.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ThePaintFragment.m7404K0(this.f3382c, view);
            }
        });
        ((FragmentThePaintBinding) getMBinding()).f9798v.setOnClickListener(new View.OnClickListener() { // from class: c4.f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ThePaintFragment.m7406L0(this.f3385c, view);
            }
        });
        ImageView ivDelete = ((FragmentThePaintBinding) getMBinding()).f9788l;
        AbstractC9979u.m20293f(ivDelete, "ivDelete");
        AbstractC11958b.m26591l(ivDelete, 1000L, new View.OnClickListener() { // from class: c4.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ThePaintFragment.m7458w0(this.f3388c, view);
            }
        });
        ((FragmentThePaintBinding) getMBinding()).f9794r.setOnClickListener(new View.OnClickListener() { // from class: c4.h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ThePaintFragment.m7460x0(this.f3391c, view);
            }
        });
        final ItemPaintPenColorBinding itemPaintPenColorBinding = ((FragmentThePaintBinding) getMBinding()).f9779c;
        itemPaintPenColorBinding.f9815g.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: c4.i0
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i10) {
                ThePaintFragment.m7464z0(this.f3393a, radioGroup, i10);
            }
        });
        RadioGroup radioGroup = itemPaintPenColorBinding.f9815g;
        radioGroup.check(radioGroup.getChildAt(0).getId());
        if (!itemPaintPenColorBinding.f9811c.isSelected() && !itemPaintPenColorBinding.f9812d.isSelected() && !itemPaintPenColorBinding.f9813e.isSelected()) {
            itemPaintPenColorBinding.f9811c.setSelected(true);
        }
        itemPaintPenColorBinding.f9811c.setOnClickListener(new View.OnClickListener() { // from class: c4.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ThePaintFragment.m7384A0(itemPaintPenColorBinding, this, view);
            }
        });
        itemPaintPenColorBinding.f9812d.setOnClickListener(new View.OnClickListener() { // from class: c4.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ThePaintFragment.m7386B0(itemPaintPenColorBinding, this, view);
            }
        });
        itemPaintPenColorBinding.f9813e.setOnClickListener(new View.OnClickListener() { // from class: c4.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ThePaintFragment.m7388C0(itemPaintPenColorBinding, this, view);
            }
        });
        ((FragmentThePaintBinding) getMBinding()).f9791o.setOnClickListener(new View.OnClickListener() { // from class: c4.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ThePaintFragment.m7390D0(this.f3437c, view);
            }
        });
    }

    private final void initObserver() {
        m7456v0().m7721K().observe(getViewLifecycleOwner(), new C6260c(new InterfaceC9540l() { // from class: c4.n0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ThePaintFragment.m7420S0(this.f3405c, (SketchConfig) obj);
            }
        }));
        m7456v0().m7745z().observe(getViewLifecycleOwner(), new C6260c(new InterfaceC9540l() { // from class: c4.v0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ThePaintFragment.m7422T0(this.f3429c, (Integer) obj);
            }
        }));
        LiveEventBus.get("updateCurrentThumbnailSuccess").observe(getViewLifecycleOwner(), new Observer() { // from class: c4.w0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ThePaintFragment.m7424U0(this.f3433c, obj);
            }
        });
        m7456v0().m7743x().observe(getViewLifecycleOwner(), new C6260c(new InterfaceC9540l() { // from class: c4.x0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ThePaintFragment.m7426V0(this.f3436c, (Integer) obj);
            }
        }));
        m7456v0().m7744y().observe(getViewLifecycleOwner(), new C6260c(new InterfaceC9540l() { // from class: c4.y0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ThePaintFragment.m7428W0(this.f3438c, (Boolean) obj);
            }
        }));
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9979u.m20293f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C62636(null), 3, null);
    }

    /* renamed from: j0 */
    public static /* synthetic */ void m7445j0(ThePaintFragment thePaintFragment, int i10, Bitmap bitmap, boolean z10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addNote");
        }
        if ((i11 & 2) != 0) {
            bitmap = null;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        thePaintFragment.m7466i0(i10, bitmap, z10);
    }

    /* renamed from: k0 */
    public static final void m7446k0(ThePaintFragment thePaintFragment, int i10) {
        thePaintFragment.m7456v0().m7731V(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m0 */
    public static final void m7447m0(ThePaintFragment thePaintFragment, DialogInterface dialogInterface, int i10) {
        Integer num = (Integer) thePaintFragment.m7456v0().m7743x().getValue();
        if (num != null) {
            LiveEventBus.get("clearBoard").post(((PaintEntity) thePaintFragment.m7471t0().getData().get(num.intValue())).getPath());
        }
    }

    /* renamed from: n0 */
    public static final void m7448n0(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    /* renamed from: r0 */
    public static final C10786q m7450r0(ThePaintFragment thePaintFragment, int i10) {
        if (i10 == 0) {
            thePaintFragment.getIClassManager().mo93a(false);
        } else {
            thePaintFragment.getIClassManager().mo93a(true);
        }
        return C10786q.f26013a;
    }

    /* renamed from: s0 */
    public static final NoteFragmentStateAdapter m7452s0(ThePaintFragment thePaintFragment) {
        FragmentManager childFragmentManager = thePaintFragment.getChildFragmentManager();
        AbstractC9979u.m20293f(childFragmentManager, "getChildFragmentManager(...)");
        Lifecycle lifecycle = thePaintFragment.getLifecycle();
        AbstractC9979u.m20293f(lifecycle, "<get-lifecycle>(...)");
        return new NoteFragmentStateAdapter(childFragmentManager, lifecycle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v0 */
    public final NoteViewModel m7456v0() {
        return (NoteViewModel) this.f9964i.getValue();
    }

    /* renamed from: w0 */
    public static final void m7458w0(ThePaintFragment thePaintFragment, View view) {
        thePaintFragment.m7467l0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: x0 */
    public static final void m7460x0(ThePaintFragment thePaintFragment, View view) {
        thePaintFragment.m7456v0().m7722L().setValue(Mode.ACTION_WRITING);
        ((FragmentThePaintBinding) thePaintFragment.getMBinding()).f9779c.getRoot().setVisibility(((FragmentThePaintBinding) thePaintFragment.getMBinding()).f9779c.getRoot().getVisibility() == 8 ? 0 : 8);
        ((FragmentThePaintBinding) thePaintFragment.getMBinding()).f9770A.setVisibility(((FragmentThePaintBinding) thePaintFragment.getMBinding()).f9779c.getRoot().getVisibility() == 0 ? 0 : 8);
        ((FragmentThePaintBinding) thePaintFragment.getMBinding()).f9773D.setVisibility(8);
        ((FragmentThePaintBinding) thePaintFragment.getMBinding()).f9798v.setSelected(false);
        ((FragmentThePaintBinding) thePaintFragment.getMBinding()).f9794r.setSelected(true);
        ((FragmentThePaintBinding) thePaintFragment.getMBinding()).f9790n.setSelected(false);
    }

    /* renamed from: y0 */
    public static final void m7462y0(ThePaintFragment thePaintFragment, View view) {
        FragmentActivity activity = thePaintFragment.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: z0 */
    public static final void m7464z0(ThePaintFragment thePaintFragment, RadioGroup radioGroup, int i10) {
        String string;
        GraphConfig graphConfig;
        Object tag = radioGroup.findViewById(i10).getTag();
        if (tag == null || (string = tag.toString()) == null || (graphConfig = (GraphConfig) thePaintFragment.m7456v0().m7715E().getValue()) == null) {
            return;
        }
        thePaintFragment.m7456v0().m7715E().setValue(new GraphConfig(graphConfig.getWidth(), Color.parseColor(string)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: X0 */
    public final void m7465X0() {
        ViewPager2 viewPager2 = ((FragmentThePaintBinding) getMBinding()).f9778I;
        viewPager2.setAdapter(m7471t0());
        viewPager2.setUserInputEnabled(false);
        ((FragmentThePaintBinding) getMBinding()).f9789m.setOnClickListener(new View.OnClickListener() { // from class: c4.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ThePaintFragment.m7431Y0(this.f3395c, view);
            }
        });
        ImageView ivAsk = ((FragmentThePaintBinding) getMBinding()).f9783g;
        AbstractC9979u.m20293f(ivAsk, "ivAsk");
        AbstractC11958b.m26591l(ivAsk, 2000L, new View.OnClickListener() { // from class: c4.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ThePaintFragment.m7433Z0(this.f3398c, view);
            }
        });
        ImageView ivNextPage = ((FragmentThePaintBinding) getMBinding()).f9793q;
        AbstractC9979u.m20293f(ivNextPage, "ivNextPage");
        AbstractC11958b.m26591l(ivNextPage, 1000L, new View.OnClickListener() { // from class: c4.l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ThePaintFragment.m7435a1(this.f3400c, view);
            }
        });
        ImageView ivPrevPage = ((FragmentThePaintBinding) getMBinding()).f9795s;
        AbstractC9979u.m20293f(ivPrevPage, "ivPrevPage");
        AbstractC11958b.m26591l(ivPrevPage, 1000L, new View.OnClickListener() { // from class: c4.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ThePaintFragment.m7437b1(this.f3403c, view);
            }
        });
        ((FragmentThePaintBinding) getMBinding()).f9801y.setClickable(true);
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    public final void convertEnable(android.view.View... r5) {
        /*
            r4 = this;
            int r0 = r5.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L12
            r2 = r5[r1]
            boolean r3 = r2.isEnabled()
            r3 = r3 ^ 1
            r2.setEnabled(r3)
            int r1 = r1 + 1
            goto L2
        L12:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.paint.view.ThePaintFragment.convertEnable(android.view.View[]):void"); // DEX body: android/中育云笔记/smali_classes4/com/friday/paint/view/ThePaintFragment.smali:5119
    }

    public final void copyNote(int i10) {
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this), C11157r0.m24799b(), null, new C62611(i10, null), 2, null);
    }

    public final InterfaceC9662b getIClassManager() {
        InterfaceC9662b interfaceC9662b = this.f9966k;
        if (interfaceC9662b != null) {
            return interfaceC9662b;
        }
        AbstractC9979u.m20312y("iClassManager");
        return null;
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public int getLayoutId() {
        return R$layout.fragment_the_paint;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i0 */
    public final void m7466i0(final int i10, Bitmap bitmap, boolean z10) {
        if (!z10 && m7472u0().getData().size() >= 99) {
            AbstractC11958b.m26588i("已达页数上限，无法新增笔记页");
            return;
        }
        String str = PathUtils.getExternalAppDocumentsPath() + File.separator + System.currentTimeMillis();
        if (bitmap != null) {
            m7456v0().m7716F().put(str, bitmap);
        }
        FileUtils.createOrExistsDir(str);
        m7471t0().m7297a(i10, new PaintEntity(str));
        if (z10) {
            int i11 = 0;
            for (Object obj : m7472u0().getData()) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    AbstractC10978w.m24145w();
                }
                ((NoteListEntity) obj).setInClass(false);
                m7472u0().notifyItemChanged(i11, PayloadKey.IN_CLASS);
                i11 = i12;
            }
        }
        m7472u0().addData(i10, (int) new NoteListEntity(str + "/thumbnail.jpg", true, z10, null, 8, null));
        int size = m7472u0().getData().size();
        for (int i13 = i10; i13 < size; i13++) {
            m7472u0().notifyItemChanged(i13);
        }
        ((FragmentThePaintBinding) getMBinding()).f9774E.post(new Runnable() { // from class: c4.u0
            @Override // java.lang.Runnable
            public final void run() {
                ThePaintFragment.m7446k0(this.f3424c, i10);
            }
        });
    }

    public void initData() {
        m7465X0();
        initDrawerRight();
        initPaint();
        initObserver();
        initClick();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initDrawerRight() {
        RecyclerView recyclerView = ((FragmentThePaintBinding) getMBinding()).f9774E;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireActivity()));
        recyclerView.setAdapter(m7472u0());
        m7472u0().setOnItemClickListener(new InterfaceC10427d() { // from class: c4.z0
            @Override // p268o1.InterfaceC10427d
            /* renamed from: a */
            public final void mo2825a(BaseQuickAdapter baseQuickAdapter, View view, int i10) {
                ThePaintFragment.m7408M0(this.f3440a, baseQuickAdapter, view, i10);
            }
        });
        Context context = recyclerView.getContext();
        AbstractC9979u.m20293f(context, "getContext(...)");
        recyclerView.addItemDecoration(new RightListDecoration(context));
        ((FragmentThePaintBinding) getMBinding()).f9780d.addDrawerListener(new DrawerLayout.SimpleDrawerListener() { // from class: com.friday.paint.view.ThePaintFragment.initDrawerRight.2
            @Override // androidx.drawerlayout.widget.DrawerLayout.SimpleDrawerListener, androidx.drawerlayout.widget.DrawerLayout.DrawerListener
            public void onDrawerOpened(View drawerView) {
                AbstractC9979u.m20294g(drawerView, "drawerView");
                AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(ThePaintFragment.this), null, null, new ThePaintFragment$initDrawerRight$2$onDrawerOpened$1(ThePaintFragment.this, null), 3, null);
            }
        });
        ((FragmentThePaintBinding) getMBinding()).f9780d.setDrawerLockMode(1);
        ((FragmentThePaintBinding) getMBinding()).f9796t.setOnClickListener(new View.OnClickListener() { // from class: c4.a1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ThePaintFragment.m7410N0(this.f3374c, view);
            }
        });
        ImageView ivCopyToOthers = ((FragmentThePaintBinding) getMBinding()).f9787k;
        AbstractC9979u.m20293f(ivCopyToOthers, "ivCopyToOthers");
        AbstractC11958b.m26591l(ivCopyToOthers, 1000L, new View.OnClickListener() { // from class: c4.b1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ThePaintFragment.m7414P0(this.f3376c, view);
            }
        });
        ImageView ivCopyPage = ((FragmentThePaintBinding) getMBinding()).f9786j;
        AbstractC9979u.m20293f(ivCopyPage, "ivCopyPage");
        AbstractC11958b.m26591l(ivCopyPage, 2000L, new View.OnClickListener() { // from class: c4.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ThePaintFragment.m7416Q0(this.f3416c, view);
            }
        });
        ImageView ivAddPage = ((FragmentThePaintBinding) getMBinding()).f9781e;
        AbstractC9979u.m20293f(ivAddPage, "ivAddPage");
        AbstractC11958b.m26591l(ivAddPage, 1000L, new View.OnClickListener() { // from class: c4.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ThePaintFragment.m7418R0(this.f3419c, view);
            }
        });
        C10599a draggableModule = m7472u0().getDraggableModule();
        draggableModule.m22439s(true);
        draggableModule.m22423c().m4701b(3);
        m7472u0().getDraggableModule().m22442v(new C6259b());
    }

    public final void initPaint() {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (Object obj : m7456v0().m7713C()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC10978w.m24145w();
            }
            String absolutePath = ((File) obj).getAbsolutePath();
            AbstractC9979u.m20291d(absolutePath);
            arrayList.add(new PaintEntity(absolutePath));
            m7472u0().addData((ThumbnailListAdapter) new NoteListEntity(absolutePath + "/thumbnail.jpg", i10 == 0, false, null, 12, null));
            i10 = i11;
        }
        if (arrayList.isEmpty()) {
            m7445j0(this, 0, null, false, 6, null);
        } else {
            m7471t0().m7298b(arrayList);
            m7456v0().m7731V(0);
        }
    }

    /* renamed from: l0 */
    public final void m7467l0() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            new AlertDialog.Builder(activity).setMessage(R$string.clear_canvas).setPositiveButton(getString(R$string.sure), new DialogInterface.OnClickListener() { // from class: c4.p0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    ThePaintFragment.m7447m0(this.f3411c, dialogInterface, i10);
                }
            }).setNegativeButton(getString(R$string.cancel), new DialogInterface.OnClickListener() { // from class: c4.q0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    ThePaintFragment.m7448n0(dialogInterface, i10);
                }
            }).create().show();
        }
    }

    public final void moveToPosition(RecyclerView recyclerView, int i10) {
        View childAt;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        AbstractC9979u.m20292e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
        int iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
        if ((iFindFirstCompletelyVisibleItemPosition > i10 || i10 > iFindLastCompletelyVisibleItemPosition) && (childAt = recyclerView.getChildAt(0)) != null) {
            int childLayoutPosition = recyclerView.getChildLayoutPosition(childAt);
            int childLayoutPosition2 = recyclerView.getChildLayoutPosition(recyclerView.getChildAt(recyclerView.getChildCount() - 1));
            if (i10 < childLayoutPosition || i10 > childLayoutPosition2) {
                recyclerView.scrollToPosition(i10);
                return;
            }
            View childAt2 = recyclerView.getChildAt(i10 - childLayoutPosition);
            if (childAt2 != null) {
                recyclerView.scrollBy(0, childAt2.getTop());
            }
        }
    }

    /* renamed from: o0 */
    public final void m7468o0() {
        AbstractC9796n.a.m19789g(AbstractC9796n.f22990a, 0, 1, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:54|(1:115)|55|56|111|70|71|107|72|73|123|74|(6:77|121|78|79|39|(6:95|131|(3:34|(2:130|96)(4:128|38|39|(0)(0))|32)|127|97|98)(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(13:54|115|55|56|111|70|71|107|72|73|123|74|(6:77|121|78|79|39|(6:95|131|(3:34|(2:130|96)(4:128|38|39|(0)(0))|32)|127|97|98)(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(16:65|(1:125)|66|67|117|68|69|111|70|71|107|72|73|123|74|(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:(1:109)|47|48|101|49|50|119|51|(13:54|115|55|56|111|70|71|107|72|73|123|74|(6:77|121|78|79|39|(6:95|131|(3:34|(2:130|96)(4:128|38|39|(0)(0))|32)|127|97|98)(0)))) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:109|47|48|101|49|50|119|51|(13:54|115|55|56|111|70|71|107|72|73|123|74|(6:77|121|78|79|39|(6:95|131|(3:34|(2:130|96)(4:128|38|39|(0)(0))|32)|127|97|98)(0)))) */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01d7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01d8, code lost:
    
        r5 = r11;
        r11 = r10;
        r10 = r5;
        r9 = r1;
        r5 = r12;
        r1 = r15;
        r12 = r4;
        r4 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01e3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x027a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x027b, code lost:
    
        r5 = r11;
        r11 = r10;
        r10 = r5;
        r9 = r1;
        r1 = r2;
        r13 = r12;
        r5 = r14;
        r12 = r4;
        r4 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0285, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0288, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0289, code lost:
    
        r2 = r16;
        r7 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x028e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x028f, code lost:
    
        r5 = r11;
        r11 = r10;
        r10 = r5;
        r9 = r1;
        r5 = r12;
        r1 = r18;
        r12 = r4;
        r4 = r19;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x017f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02b0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0123 -> B:39:0x0131). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0263 -> B:121:0x026c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:94:0x02a6 -> B:79:0x0271). Please report as a decompilation issue!!! */
    /* renamed from: p0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m7469p0(java.lang.String r26, java.lang.String r27, vc.InterfaceC11588c r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.paint.view.ThePaintFragment.m7469p0(java.lang.String, java.lang.String, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes4/com/friday/paint/view/ThePaintFragment.smali:6664
    }

    /* renamed from: q0 */
    public final void m7470q0() {
        AbstractC9796n.f22990a.m19793e(this, new InterfaceC9540l() { // from class: c4.o0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ThePaintFragment.m7450r0(this.f3408c, ((Integer) obj).intValue());
            }
        });
    }

    /* renamed from: t0 */
    public final NoteFragmentStateAdapter m7471t0() {
        return (NoteFragmentStateAdapter) this.f9967l.getValue();
    }

    /* renamed from: u0 */
    public final ThumbnailListAdapter m7472u0() {
        return (ThumbnailListAdapter) this.f9965j.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void updateCurrentPage(int i10, int i11) {
        ((FragmentThePaintBinding) getMBinding()).f9777H.setText(getResources().getString(R$string.current_page_and_total, Integer.valueOf(i10), Integer.valueOf(i11)));
    }
}
