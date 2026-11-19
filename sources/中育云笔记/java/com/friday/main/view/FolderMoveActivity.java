package com.friday.main.view;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.blankj.utilcode.util.NetworkUtils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.friday.common.entity.FileEntity;
import com.friday.main.R$color;
import com.friday.main.R$drawable;
import com.friday.main.R$layout;
import com.friday.main.R$string;
import com.friday.main.adapter.FolderMoveAdapter;
import com.friday.main.adapter.PathNameAdapter;
import com.friday.main.databinding.FolderMoveActivityBinding;
import com.friday.main.model.FileDiffCallback;
import com.friday.main.view.FolderMoveActivity;
import com.friday.main.viewmodel.FolderMoveViewModel;
import com.jeremyliao.liveeventbus.LiveEventBus;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC9923a;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p268o1.InterfaceC10427d;
import p309qc.C10786q;
import p309qc.InterfaceC10773d;
import p325rc.AbstractC10947g0;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11602k;
import p379vd.InterfaceC11607p;
import p379vd.InterfaceC11612u;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import p429z1.AbstractC11958b;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
@Route(path = "/main/FolderMoveActivity")
/* loaded from: classes4.dex */
public final class FolderMoveActivity extends Hilt_FolderMoveActivity<FolderMoveActivityBinding> {

    /* renamed from: j */
    public boolean f9270j;

    /* renamed from: k */
    public boolean f9271k;

    /* renamed from: l */
    public boolean f9272l;

    /* renamed from: n */
    public final InterfaceC10773d f9274n;

    /* renamed from: g */
    public String f9267g = "";

    /* renamed from: h */
    public ArrayList f9268h = new ArrayList();

    /* renamed from: i */
    public String f9269i = "";

    /* renamed from: m */
    public ArrayList f9273m = new ArrayList();

    /* renamed from: o */
    public final InterfaceC10773d f9275o = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: v3.l0
        @Override // p181hd.InterfaceC9529a
        public final Object invoke() {
            return FolderMoveActivity.m7046h0();
        }
    });

    /* renamed from: p */
    public final InterfaceC10773d f9276p = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: v3.m0
        @Override // p181hd.InterfaceC9529a
        public final Object invoke() {
            return FolderMoveActivity.m7041X(this.f27347c);
        }
    });

    @InterfaceC11829d(m26210c = "com.friday.main.view.FolderMoveActivity$initDataSource$1", m26211f = "FolderMoveActivity.kt", m26212l = {206}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.main.view.FolderMoveActivity$initDataSource$1 */
    public static final class C61981 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f9281c;

        @InterfaceC11829d(m26210c = "com.friday.main.view.FolderMoveActivity$initDataSource$1$1", m26211f = "FolderMoveActivity.kt", m26212l = {}, m26213m = "invokeSuspend")
        /* renamed from: com.friday.main.view.FolderMoveActivity$initDataSource$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public int f9283c;

            /* renamed from: d */
            public /* synthetic */ Object f9284d;

            /* renamed from: e */
            public final /* synthetic */ FolderMoveActivity f9285e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(FolderMoveActivity folderMoveActivity, InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
                this.f9285e = folderMoveActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f9285e, interfaceC11588c);
                anonymousClass1.f9284d = obj;
                return anonymousClass1;
            }

            @Override // p181hd.InterfaceC9544p
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(List list, InterfaceC11588c interfaceC11588c) {
                return ((AnonymousClass1) create(list, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                List list = (List) this.f9284d;
                AbstractC11725a.m25952f();
                if (this.f9283c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                BaseQuickAdapter.setDiffNewData$default(this.f9285e.m7047Y(), AbstractC10947g0.m23925a1(list), null, 2, null);
                return C10786q.f26013a;
            }
        }

        public C61981(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return FolderMoveActivity.this.new C61981(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f9281c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC11612u interfaceC11612uM7224w = FolderMoveActivity.this.m7048Z().m7224w();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(FolderMoveActivity.this, null);
                this.f9281c = 1;
                if (AbstractC11596e.m25559i(interfaceC11612uM7224w, anonymousClass1, this) == objM25952f) {
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
            return ((C61981) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.main.view.FolderMoveActivity$initDataSource$2", m26211f = "FolderMoveActivity.kt", m26212l = {212}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.main.view.FolderMoveActivity$initDataSource$2 */
    public static final class C61992 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f9286c;

        @InterfaceC11829d(m26210c = "com.friday.main.view.FolderMoveActivity$initDataSource$2$1", m26211f = "FolderMoveActivity.kt", m26212l = {}, m26213m = "invokeSuspend")
        /* renamed from: com.friday.main.view.FolderMoveActivity$initDataSource$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public int f9288c;

            /* renamed from: d */
            public /* synthetic */ Object f9289d;

            /* renamed from: e */
            public final /* synthetic */ FolderMoveActivity f9290e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(FolderMoveActivity folderMoveActivity, InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
                this.f9290e = folderMoveActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f9290e, interfaceC11588c);
                anonymousClass1.f9289d = obj;
                return anonymousClass1;
            }

            @Override // p181hd.InterfaceC9544p
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(List list, InterfaceC11588c interfaceC11588c) {
                return ((AnonymousClass1) create(list, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                List list = (List) this.f9289d;
                AbstractC11725a.m25952f();
                if (this.f9288c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                PathNameAdapter pathNameAdapterM7049a0 = this.f9290e.m7049a0();
                FolderMoveActivity folderMoveActivity = this.f9290e;
                pathNameAdapterM7049a0.setList(AbstractC10947g0.m23925a1(list));
                FolderMoveActivity.m7038U(folderMoveActivity).f9162e.scrollToPosition(pathNameAdapterM7049a0.getItemCount() - 1);
                return C10786q.f26013a;
            }
        }

        public C61992(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return FolderMoveActivity.this.new C61992(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f9286c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC11612u interfaceC11612uM7227z = FolderMoveActivity.this.m7048Z().m7227z();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(FolderMoveActivity.this, null);
                this.f9286c = 1;
                if (AbstractC11596e.m25559i(interfaceC11612uM7227z, anonymousClass1, this) == objM25952f) {
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
            return ((C61992) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.main.view.FolderMoveActivity$initDataSource$3", m26211f = "FolderMoveActivity.kt", m26212l = {221}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.main.view.FolderMoveActivity$initDataSource$3 */
    public static final class C62003 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f9291c;

        @InterfaceC11829d(m26210c = "com.friday.main.view.FolderMoveActivity$initDataSource$3$1", m26211f = "FolderMoveActivity.kt", m26212l = {}, m26213m = "invokeSuspend")
        /* renamed from: com.friday.main.view.FolderMoveActivity$initDataSource$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public int f9293c;

            /* renamed from: d */
            public /* synthetic */ boolean f9294d;

            /* renamed from: e */
            public final /* synthetic */ FolderMoveActivity f9295e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(FolderMoveActivity folderMoveActivity, InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
                this.f9295e = folderMoveActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f9295e, interfaceC11588c);
                anonymousClass1.f9294d = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // p181hd.InterfaceC9544p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (InterfaceC11588c) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                boolean z10 = this.f9294d;
                AbstractC11725a.m25952f();
                if (this.f9293c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                if (z10) {
                    this.f9295e.finish();
                    AbstractC11958b.m26588i("复制成功");
                } else {
                    AbstractC11958b.m26588i("复制失败");
                }
                return C10786q.f26013a;
            }

            public final Object invoke(boolean z10, InterfaceC11588c interfaceC11588c) {
                return ((AnonymousClass1) create(Boolean.valueOf(z10), interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        public C62003(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return FolderMoveActivity.this.new C62003(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f9291c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC11607p interfaceC11607pM7212E = FolderMoveActivity.this.m7048Z().m7212E();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(FolderMoveActivity.this, null);
                this.f9291c = 1;
                if (AbstractC11596e.m25559i(interfaceC11607pM7212E, anonymousClass1, this) == objM25952f) {
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
            return ((C62003) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.main.view.FolderMoveActivity$initDataSource$4", m26211f = "FolderMoveActivity.kt", m26212l = {232}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.main.view.FolderMoveActivity$initDataSource$4 */
    public static final class C62014 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f9296c;

        @InterfaceC11829d(m26210c = "com.friday.main.view.FolderMoveActivity$initDataSource$4$1", m26211f = "FolderMoveActivity.kt", m26212l = {}, m26213m = "invokeSuspend")
        /* renamed from: com.friday.main.view.FolderMoveActivity$initDataSource$4$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public int f9298c;

            /* renamed from: d */
            public /* synthetic */ boolean f9299d;

            /* renamed from: e */
            public final /* synthetic */ FolderMoveActivity f9300e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(FolderMoveActivity folderMoveActivity, InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
                this.f9300e = folderMoveActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f9300e, interfaceC11588c);
                anonymousClass1.f9299d = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // p181hd.InterfaceC9544p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (InterfaceC11588c) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                boolean z10 = this.f9299d;
                AbstractC11725a.m25952f();
                if (this.f9298c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                this.f9300e.isShowLoading(false);
                if (z10) {
                    LiveEventBus.get("MoveFileSuccess").post(null);
                    AbstractC11958b.m26588i("移动成功");
                    this.f9300e.finish();
                } else {
                    AbstractC11958b.m26588i("移动失败");
                }
                return C10786q.f26013a;
            }

            public final Object invoke(boolean z10, InterfaceC11588c interfaceC11588c) {
                return ((AnonymousClass1) create(Boolean.valueOf(z10), interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        public C62014(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return FolderMoveActivity.this.new C62014(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f9296c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC11607p interfaceC11607pM7213F = FolderMoveActivity.this.m7048Z().m7213F();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(FolderMoveActivity.this, null);
                this.f9296c = 1;
                if (AbstractC11596e.m25559i(interfaceC11607pM7213F, anonymousClass1, this) == objM25952f) {
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
            return ((C62014) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.main.view.FolderMoveActivity$initDataSource$5", m26211f = "FolderMoveActivity.kt", m26212l = {245}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.main.view.FolderMoveActivity$initDataSource$5 */
    public static final class C62025 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f9301c;

        @InterfaceC11829d(m26210c = "com.friday.main.view.FolderMoveActivity$initDataSource$5$1", m26211f = "FolderMoveActivity.kt", m26212l = {}, m26213m = "invokeSuspend")
        /* renamed from: com.friday.main.view.FolderMoveActivity$initDataSource$5$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public int f9303c;

            /* renamed from: d */
            public /* synthetic */ boolean f9304d;

            /* renamed from: e */
            public final /* synthetic */ FolderMoveActivity f9305e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(FolderMoveActivity folderMoveActivity, InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
                this.f9305e = folderMoveActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f9305e, interfaceC11588c);
                anonymousClass1.f9304d = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // p181hd.InterfaceC9544p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (InterfaceC11588c) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                boolean z10 = this.f9304d;
                AbstractC11725a.m25952f();
                if (this.f9303c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                if (z10) {
                    AbstractC11958b.m26588i("恢复成功");
                    this.f9305e.finish();
                } else {
                    AbstractC11958b.m26588i("恢复失败");
                }
                return C10786q.f26013a;
            }

            public final Object invoke(boolean z10, InterfaceC11588c interfaceC11588c) {
                return ((AnonymousClass1) create(Boolean.valueOf(z10), interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        public C62025(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return FolderMoveActivity.this.new C62025(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f9301c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC11602k interfaceC11602kM7210A = FolderMoveActivity.this.m7048Z().m7210A();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(FolderMoveActivity.this, null);
                this.f9301c = 1;
                if (AbstractC11596e.m25559i(interfaceC11602kM7210A, anonymousClass1, this) == objM25952f) {
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
            return ((C62025) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public FolderMoveActivity() {
        final InterfaceC9529a interfaceC9529a = null;
        this.f9274n = new ViewModelLazy(AbstractC9983y.m20315b(FolderMoveViewModel.class), new InterfaceC9529a() { // from class: com.friday.main.view.FolderMoveActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelStore invoke() {
                return this.getViewModelStore();
            }
        }, new InterfaceC9529a() { // from class: com.friday.main.view.FolderMoveActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelProvider.Factory invoke() {
                return this.getDefaultViewModelProviderFactory();
            }
        }, new InterfaceC9529a() { // from class: com.friday.main.view.FolderMoveActivity$special$$inlined$viewModels$default$3
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
    public static final /* synthetic */ FolderMoveActivityBinding m7038U(FolderMoveActivity folderMoveActivity) {
        return (FolderMoveActivityBinding) folderMoveActivity.getMBinding();
    }

    /* renamed from: X */
    public static final FolderMoveAdapter m7041X(FolderMoveActivity folderMoveActivity) {
        FolderMoveAdapter folderMoveAdapter = new FolderMoveAdapter();
        folderMoveAdapter.setDiffCallback(new FileDiffCallback());
        TextView textView = new TextView(folderMoveActivity.getBaseContext());
        textView.setTextSize(16.0f);
        textView.setText(AbstractC11958b.m26585f(R$string.no_content));
        textView.setTextColor(AbstractC11958b.m26580a(R$color.app_l_dark));
        textView.setGravity(17);
        folderMoveAdapter.setEmptyView(textView);
        return folderMoveAdapter;
    }

    /* renamed from: c0 */
    public static final void m7042c0(FolderMoveActivity folderMoveActivity, BaseQuickAdapter baseQuickAdapter, View view, int i10) {
        AbstractC9979u.m20294g(baseQuickAdapter, "<unused var>");
        AbstractC9979u.m20294g(view, "<unused var>");
        FileEntity item = folderMoveActivity.m7047Y().getItem(i10);
        if (AbstractC9979u.m20289b(item.getFileType(), "0")) {
            folderMoveActivity.m7047Y().m6917l(null);
            folderMoveActivity.m7048Z().m7218K(item);
            folderMoveActivity.m7051g0(item.getFileId());
        } else {
            if (AbstractC9979u.m20289b(folderMoveActivity.m7047Y().m6916k(), item)) {
                return;
            }
            if (!item.getCached()) {
                AbstractC11958b.m26588i("该笔记未下载，无法选中");
                return;
            }
            int itemPosition = folderMoveActivity.m7047Y().getItemPosition(folderMoveActivity.m7047Y().m6916k());
            folderMoveActivity.m7047Y().m6917l(item);
            if (itemPosition >= 0 && itemPosition < folderMoveActivity.m7047Y().getItemCount()) {
                folderMoveActivity.m7047Y().notifyItemChanged(itemPosition);
            }
            folderMoveActivity.m7047Y().notifyItemChanged(folderMoveActivity.m7047Y().getItemPosition(item));
        }
    }

    /* renamed from: d0 */
    public static final void m7043d0(FolderMoveActivity folderMoveActivity, View view) {
        folderMoveActivity.finish();
    }

    /* renamed from: e0 */
    public static final void m7044e0(FolderMoveActivity folderMoveActivity, BaseQuickAdapter baseQuickAdapter, View view, int i10) {
        AbstractC9979u.m20294g(baseQuickAdapter, "<unused var>");
        AbstractC9979u.m20294g(view, "<unused var>");
        FileEntity item = folderMoveActivity.m7049a0().getItem(i10);
        folderMoveActivity.m7047Y().m6917l(null);
        folderMoveActivity.m7048Z().m7218K(item);
        folderMoveActivity.m7051g0(item.getFileId());
    }

    /* renamed from: f0 */
    public static final void m7045f0(FolderMoveActivity folderMoveActivity, View view) {
        if (!NetworkUtils.isConnected()) {
            AbstractC11958b.m26588i("当前没有网络，请检查网络连接后再次尝试");
            return;
        }
        if (folderMoveActivity.f9272l) {
            folderMoveActivity.isShowLoading(true);
            folderMoveActivity.m7048Z().m7217J(((FileEntity) AbstractC10947g0.m23956y0((List) folderMoveActivity.m7048Z().m7227z().getValue())).getFileId(), folderMoveActivity.f9267g);
            return;
        }
        if (folderMoveActivity.f9270j) {
            if (folderMoveActivity.m7047Y().m6916k() == null) {
                AbstractC11958b.m26588i("请先选中一个目标笔记");
                return;
            }
            FolderMoveViewModel folderMoveViewModelM7048Z = folderMoveActivity.m7048Z();
            ArrayList arrayList = folderMoveActivity.f9273m;
            FileEntity fileEntityM6916k = folderMoveActivity.m7047Y().m6916k();
            AbstractC9979u.m20291d(fileEntityM6916k);
            folderMoveViewModelM7048Z.m7220s(arrayList, fileEntityM6916k);
            return;
        }
        FileEntity fileEntity = (FileEntity) AbstractC10947g0.m23957z0((List) folderMoveActivity.m7048Z().m7227z().getValue());
        if (AbstractC9979u.m20289b(fileEntity != null ? fileEntity.getFileId() : null, folderMoveActivity.f9269i)) {
            AbstractC11958b.m26588i("文件不可以移动到他当前所处的位置");
            return;
        }
        folderMoveActivity.isShowLoading(true);
        if (folderMoveActivity.f9267g.length() > 0) {
            folderMoveActivity.m7048Z().m7214G(((FileEntity) AbstractC10947g0.m23956y0((List) folderMoveActivity.m7048Z().m7227z().getValue())).getFileId(), folderMoveActivity.f9267g);
        } else {
            folderMoveActivity.m7048Z().m7215H(((FileEntity) AbstractC10947g0.m23956y0((List) folderMoveActivity.m7048Z().m7227z().getValue())).getFileId(), folderMoveActivity.f9268h);
        }
    }

    /* renamed from: h0 */
    public static final PathNameAdapter m7046h0() {
        return new PathNameAdapter();
    }

    /* renamed from: Y */
    public final FolderMoveAdapter m7047Y() {
        return (FolderMoveAdapter) this.f9276p.getValue();
    }

    /* renamed from: Z */
    public final FolderMoveViewModel m7048Z() {
        return (FolderMoveViewModel) this.f9274n.getValue();
    }

    /* renamed from: a0 */
    public final PathNameAdapter m7049a0() {
        return (PathNameAdapter) this.f9275o.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b0 */
    public final void m7050b0() {
        ((FolderMoveActivityBinding) getMBinding()).f9160c.setOnClickListener(new View.OnClickListener() { // from class: v3.o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FolderMoveActivity.m7043d0(this.f27356c, view);
            }
        });
        RecyclerView recyclerView = ((FolderMoveActivityBinding) getMBinding()).f9162e;
        recyclerView.setLayoutManager(new LinearLayoutManager(this, 0, false));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(m7049a0());
        m7049a0().setOnItemClickListener(new InterfaceC10427d() { // from class: v3.p0
            @Override // p268o1.InterfaceC10427d
            /* renamed from: a */
            public final void mo2825a(BaseQuickAdapter baseQuickAdapter, View view, int i10) {
                FolderMoveActivity.m7044e0(this.f27361a, baseQuickAdapter, view, i10);
            }
        });
        RecyclerView recyclerView2 = ((FolderMoveActivityBinding) getMBinding()).f9161d;
        recyclerView2.setLayoutManager(new LinearLayoutManager(getBaseContext()));
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(getBaseContext(), 1);
        Drawable drawable = ContextCompat.getDrawable(recyclerView2.getContext(), R$drawable.shape_ground);
        if (drawable != null) {
            dividerItemDecoration.setDrawable(drawable);
        }
        recyclerView2.addItemDecoration(dividerItemDecoration);
        recyclerView2.setAdapter(m7047Y());
        m7047Y().setOnItemClickListener(new InterfaceC10427d() { // from class: v3.q0
            @Override // p268o1.InterfaceC10427d
            /* renamed from: a */
            public final void mo2825a(BaseQuickAdapter baseQuickAdapter, View view, int i10) {
                FolderMoveActivity.m7042c0(this.f27367a, baseQuickAdapter, view, i10);
            }
        });
    }

    /* renamed from: g0 */
    public final void m7051g0(String str) {
        if (this.f9267g.length() > 0) {
            m7048Z().m7226y(this.f9271k, this.f9270j, str, this.f9267g);
        } else {
            m7048Z().m7225x(str);
        }
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public int getLayoutId() {
        return R$layout.folder_move_activity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.friday.common.base.InterfaceC5929c
    public void initData() {
        ARouter.getInstance().inject(this);
        if (this.f9272l) {
            ((FolderMoveActivityBinding) getMBinding()).f9164g.setText("恢复到此处");
            ((FolderMoveActivityBinding) getMBinding()).f9165h.setText("恢复");
        } else if (this.f9270j) {
            ((FolderMoveActivityBinding) getMBinding()).f9164g.setText("复制到此笔记");
            ((FolderMoveActivityBinding) getMBinding()).f9165h.setText("跨笔记复制");
        } else {
            ((FolderMoveActivityBinding) getMBinding()).f9164g.setText(getString(R$string.move_to_here));
            ((FolderMoveActivityBinding) getMBinding()).f9165h.setText(getString(R$string.move));
        }
        initView();
        initDataSource();
        m7048Z().m7223v(this.f9269i);
    }

    @Override // com.friday.common.base.BaseActivity
    public void initDataSource() {
        super.initDataSource();
        m7051g0(this.f9269i);
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C61981(null), 3, null);
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C61992(null), 3, null);
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C62003(null), 3, null);
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C62014(null), 3, null);
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C62025(null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.friday.common.base.BaseActivity
    public void initView() {
        super.initView();
        setSupportActionBar(((FolderMoveActivityBinding) getMBinding()).f9163f);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayShowTitleEnabled(false);
        }
        TextView tvConfirm = ((FolderMoveActivityBinding) getMBinding()).f9164g;
        AbstractC9979u.m20293f(tvConfirm, "tvConfirm");
        AbstractC11958b.m26591l(tvConfirm, 2000L, new View.OnClickListener() { // from class: v3.n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FolderMoveActivity.m7045f0(this.f27351c, view);
            }
        });
        m7050b0();
    }
}
