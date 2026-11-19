package com.friday.lecture.view;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.utils.Consts;
import com.blankj.utilcode.util.ActivityUtils;
import com.blankj.utilcode.util.NetworkUtils;
import com.blankj.utilcode.util.ServiceUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.friday.common.activity.PusherService;
import com.friday.common.helper.C5962b;
import com.friday.common.helper.C5965e;
import com.friday.lecture.R$color;
import com.friday.lecture.R$dimen;
import com.friday.lecture.R$layout;
import com.friday.lecture.R$mipmap;
import com.friday.lecture.R$string;
import com.friday.lecture.R$style;
import com.friday.lecture.adapter.CodeAdapter;
import com.friday.lecture.adapter.KeyboardAdapter;
import com.friday.lecture.databinding.LectureDialogFragmentBinding;
import com.friday.lecture.model.ConnectMode;
import com.friday.lecture.model.ConnectionStatus;
import com.friday.lecture.model.KeyboardData;
import com.friday.lecture.service.MyMqttService;
import com.friday.lecture.view.LectureDialogFragment;
import com.friday.lecture.viewmodel.offline.LectureDialogViewModel;
import com.jeremyliao.liveeventbus.LiveEventBus;
import java.net.SocketException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p004a3.C0048b;
import p126e2.AbstractC9073b;
import p126e2.C9072a;
import p141f2.C9166c;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p268o1.InterfaceC10427d;
import p309qc.C10786q;
import p309qc.InterfaceC10773d;
import p310qd.AbstractC10793c0;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11612u;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import p429z1.AbstractC11958b;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class LectureDialogFragment extends Hilt_LectureDialogFragment<LectureDialogFragmentBinding> {

    /* renamed from: m */
    public final InterfaceC10773d f8896m;

    /* renamed from: o */
    public final ActivityResultLauncher f8898o;

    /* renamed from: k */
    public final KeyboardAdapter f8894k = new KeyboardAdapter();

    /* renamed from: l */
    public final CodeAdapter f8895l = new CodeAdapter(R$layout.item_code);

    /* renamed from: n */
    public final String f8897n = NetworkUtils.getIPAddress(true);

    /* renamed from: com.friday.lecture.view.LectureDialogFragment$a */
    public static final /* synthetic */ class C6161a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f8903a;

        static {
            int[] iArr = new int[ConnectionStatus.values().length];
            try {
                iArr[ConnectionStatus.CONNECTION_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConnectionStatus.DISCONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ConnectionStatus.CONNECTING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ConnectionStatus.CONNECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f8903a = iArr;
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.lecture.view.LectureDialogFragment$initObserver$2", m26211f = "LectureDialogFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.lecture.view.LectureDialogFragment$initObserver$2 */
    public static final class C61622 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f8904c;

        /* renamed from: d */
        public /* synthetic */ Object f8905d;

        @InterfaceC11829d(m26210c = "com.friday.lecture.view.LectureDialogFragment$initObserver$2$1", m26211f = "LectureDialogFragment.kt", m26212l = {275}, m26213m = "invokeSuspend")
        /* renamed from: com.friday.lecture.view.LectureDialogFragment$initObserver$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public int f8907c;

            /* renamed from: d */
            public final /* synthetic */ LectureDialogFragment f8908d;

            @InterfaceC11829d(m26210c = "com.friday.lecture.view.LectureDialogFragment$initObserver$2$1$1", m26211f = "LectureDialogFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
            /* renamed from: com.friday.lecture.view.LectureDialogFragment$initObserver$2$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C121061 extends SuspendLambda implements InterfaceC9544p {

                /* renamed from: c */
                public int f8909c;

                /* renamed from: d */
                public /* synthetic */ Object f8910d;

                /* renamed from: e */
                public final /* synthetic */ LectureDialogFragment f8911e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C121061(LectureDialogFragment lectureDialogFragment, InterfaceC11588c interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.f8911e = lectureDialogFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                    C121061 c121061 = new C121061(this.f8911e, interfaceC11588c);
                    c121061.f8910d = obj;
                    return c121061;
                }

                @Override // p181hd.InterfaceC9544p
                /* renamed from: g, reason: merged with bridge method [inline-methods] */
                public final Object invoke(ConnectMode connectMode, InterfaceC11588c interfaceC11588c) {
                    return ((C121061) create(connectMode, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    ConnectMode connectMode = (ConnectMode) this.f8910d;
                    AbstractC11725a.m25952f();
                    if (this.f8909c != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9924b.m20071b(obj);
                    Spanned spannedM6822D = this.f8911e.m6822D(connectMode);
                    if (spannedM6822D != null) {
                        LectureDialogFragment.m6805B(this.f8911e).f8592B.setText(spannedM6822D);
                    }
                    TextView textView = LectureDialogFragment.m6805B(this.f8911e).f8596F;
                    ConnectMode.C6153IP c6153ip = ConnectMode.C6153IP.INSTANCE;
                    textView.setText(AbstractC9979u.m20289b(connectMode, c6153ip) ? this.f8911e.getString(R$string.join_class_password_six) : this.f8911e.getString(R$string.join_class_password));
                    LectureDialogFragment.m6805B(this.f8911e).f8591A.setSelected(AbstractC9979u.m20289b(connectMode, ConnectMode.Code.INSTANCE));
                    LectureDialogFragment.m6805B(this.f8911e).f8597G.setSelected(AbstractC9979u.m20289b(connectMode, c6153ip));
                    this.f8911e.f8894k.m6496l(connectMode);
                    return C10786q.f26013a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LectureDialogFragment lectureDialogFragment, InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
                this.f8908d = lectureDialogFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                return new AnonymousClass1(this.f8908d, interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM25952f = AbstractC11725a.m25952f();
                int i10 = this.f8907c;
                if (i10 == 0) {
                    AbstractC9924b.m20071b(obj);
                    InterfaceC11612u interfaceC11612uM6841n = this.f8908d.m6824F().m6841n();
                    C121061 c121061 = new C121061(this.f8908d, null);
                    this.f8907c = 1;
                    if (AbstractC11596e.m25559i(interfaceC11612uM6841n, c121061, this) == objM25952f) {
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
                return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        @InterfaceC11829d(m26210c = "com.friday.lecture.view.LectureDialogFragment$initObserver$2$2", m26211f = "LectureDialogFragment.kt", m26212l = {294}, m26213m = "invokeSuspend")
        /* renamed from: com.friday.lecture.view.LectureDialogFragment$initObserver$2$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public int f8912c;

            /* renamed from: d */
            public final /* synthetic */ LectureDialogFragment f8913d;

            @InterfaceC11829d(m26210c = "com.friday.lecture.view.LectureDialogFragment$initObserver$2$2$1", m26211f = "LectureDialogFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
            /* renamed from: com.friday.lecture.view.LectureDialogFragment$initObserver$2$2$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

                /* renamed from: c */
                public int f8914c;

                /* renamed from: d */
                public /* synthetic */ Object f8915d;

                /* renamed from: e */
                public final /* synthetic */ LectureDialogFragment f8916e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(LectureDialogFragment lectureDialogFragment, InterfaceC11588c interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.f8916e = lectureDialogFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f8916e, interfaceC11588c);
                    anonymousClass1.f8915d = obj;
                    return anonymousClass1;
                }

                @Override // p181hd.InterfaceC9544p
                /* renamed from: g, reason: merged with bridge method [inline-methods] */
                public final Object invoke(List list, InterfaceC11588c interfaceC11588c) {
                    return ((AnonymousClass1) create(list, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    List list = (List) this.f8915d;
                    AbstractC11725a.m25952f();
                    if (this.f8914c != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9924b.m20071b(obj);
                    this.f8916e.f8895l.setList(list);
                    Button button = LectureDialogFragment.m6805B(this.f8916e).f8616t;
                    List list2 = list;
                    boolean z10 = true;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (((String) it.next()).length() <= 0) {
                                z10 = false;
                                break;
                            }
                        }
                    }
                    button.setEnabled(z10);
                    if (LectureDialogFragment.m6805B(this.f8916e).f8616t.isEnabled()) {
                        LectureDialogFragment.m6805B(this.f8916e).f8616t.setTextColor(ContextCompat.getColor(this.f8916e.requireActivity(), R$color.white));
                    } else {
                        LectureDialogFragment.m6805B(this.f8916e).f8616t.setTextColor(ContextCompat.getColor(this.f8916e.requireActivity(), R$color.text_gray));
                    }
                    return C10786q.f26013a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(LectureDialogFragment lectureDialogFragment, InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
                this.f8913d = lectureDialogFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                return new AnonymousClass2(this.f8913d, interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM25952f = AbstractC11725a.m25952f();
                int i10 = this.f8912c;
                if (i10 == 0) {
                    AbstractC9924b.m20071b(obj);
                    InterfaceC11612u interfaceC11612uM6845r = this.f8913d.m6824F().m6845r();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f8913d, null);
                    this.f8912c = 1;
                    if (AbstractC11596e.m25559i(interfaceC11612uM6845r, anonymousClass1, this) == objM25952f) {
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
                return ((AnonymousClass2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        @InterfaceC11829d(m26210c = "com.friday.lecture.view.LectureDialogFragment$initObserver$2$3", m26211f = "LectureDialogFragment.kt", m26212l = {TypedValues.AttributesType.TYPE_PATH_ROTATE}, m26213m = "invokeSuspend")
        /* renamed from: com.friday.lecture.view.LectureDialogFragment$initObserver$2$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public int f8917c;

            /* renamed from: d */
            public final /* synthetic */ LectureDialogFragment f8918d;

            @InterfaceC11829d(m26210c = "com.friday.lecture.view.LectureDialogFragment$initObserver$2$3$1", m26211f = "LectureDialogFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
            /* renamed from: com.friday.lecture.view.LectureDialogFragment$initObserver$2$3$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

                /* renamed from: c */
                public int f8919c;

                /* renamed from: d */
                public /* synthetic */ Object f8920d;

                /* renamed from: e */
                public final /* synthetic */ LectureDialogFragment f8921e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(LectureDialogFragment lectureDialogFragment, InterfaceC11588c interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.f8921e = lectureDialogFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f8921e, interfaceC11588c);
                    anonymousClass1.f8920d = obj;
                    return anonymousClass1;
                }

                @Override // p181hd.InterfaceC9544p
                /* renamed from: g, reason: merged with bridge method [inline-methods] */
                public final Object invoke(List list, InterfaceC11588c interfaceC11588c) {
                    return ((AnonymousClass1) create(list, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    List list = (List) this.f8920d;
                    AbstractC11725a.m25952f();
                    if (this.f8919c != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9924b.m20071b(obj);
                    this.f8921e.f8894k.setList(list);
                    return C10786q.f26013a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(LectureDialogFragment lectureDialogFragment, InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
                this.f8918d = lectureDialogFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                return new AnonymousClass3(this.f8918d, interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM25952f = AbstractC11725a.m25952f();
                int i10 = this.f8917c;
                if (i10 == 0) {
                    AbstractC9924b.m20071b(obj);
                    InterfaceC11612u interfaceC11612uM6843p = this.f8918d.m6824F().m6843p();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f8918d, null);
                    this.f8917c = 1;
                    if (AbstractC11596e.m25559i(interfaceC11612uM6843p, anonymousClass1, this) == objM25952f) {
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
                return ((AnonymousClass3) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        public C61622(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            C61622 c61622 = LectureDialogFragment.this.new C61622(interfaceC11588c);
            c61622.f8905d = obj;
            return c61622;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.f8905d;
            AbstractC11725a.m25952f();
            if (this.f8904c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            AbstractC11117h.m24726d(interfaceC11122i0, null, null, new AnonymousClass1(LectureDialogFragment.this, null), 3, null);
            AbstractC11117h.m24726d(interfaceC11122i0, null, null, new AnonymousClass2(LectureDialogFragment.this, null), 3, null);
            AbstractC11117h.m24726d(interfaceC11122i0, null, null, new AnonymousClass3(LectureDialogFragment.this, null), 3, null);
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C61622) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.lecture.view.LectureDialogFragment$onClick$2", m26211f = "LectureDialogFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.lecture.view.LectureDialogFragment$onClick$2 */
    public static final class C61632 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f8923c;

        public C61632(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return LectureDialogFragment.this.new C61632(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.f8923c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            LectureDialogFragment.this.m6824F().m6842o().setValue(new C9072a(AbstractC11826a.m26206a(false)));
            LectureDialogFragment.this.m6824F().m6840m();
            LiveEventBus.get("EndInClassTest").post(null);
            AbstractC11958b.m26588i("已离开课堂");
            LectureDialogFragment.this.m6823E();
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C61632) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public LectureDialogFragment() {
        final InterfaceC9529a interfaceC9529a = null;
        this.f8896m = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9983y.m20315b(LectureDialogViewModel.class), new InterfaceC9529a() { // from class: com.friday.lecture.view.LectureDialogFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new InterfaceC9529a() { // from class: com.friday.lecture.view.LectureDialogFragment$special$$inlined$activityViewModels$default$2
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
        }, new InterfaceC9529a() { // from class: com.friday.lecture.view.LectureDialogFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: l3.a
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                LectureDialogFragment.m6811L(this.f24199a, (ActivityResult) obj);
            }
        });
        AbstractC9979u.m20293f(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.f8898o = activityResultLauncherRegisterForActivityResult;
    }

    /* renamed from: B */
    public static final /* synthetic */ LectureDialogFragmentBinding m6805B(LectureDialogFragment lectureDialogFragment) {
        return (LectureDialogFragmentBinding) lectureDialogFragment.getMBinding();
    }

    /* renamed from: H */
    public static final C10786q m6807H(LectureDialogFragment lectureDialogFragment, ConnectionStatus it) {
        AbstractC9979u.m20294g(it, "it");
        lectureDialogFragment.m6826N(it);
        return C10786q.f26013a;
    }

    /* renamed from: I */
    public static final C10786q m6808I(LectureDialogFragment lectureDialogFragment, boolean z10) {
        if (z10) {
            ((LectureDialogFragmentBinding) lectureDialogFragment.getMBinding()).f8604h.setVisibility(0);
            ((LectureDialogFragmentBinding) lectureDialogFragment.getMBinding()).f8599c.setVisibility(8);
        } else {
            ((LectureDialogFragmentBinding) lectureDialogFragment.getMBinding()).f8604h.setVisibility(8);
            ((LectureDialogFragmentBinding) lectureDialogFragment.getMBinding()).f8599c.setVisibility(0);
        }
        return C10786q.f26013a;
    }

    /* renamed from: J */
    public static final void m6809J(LectureDialogFragment lectureDialogFragment, Object obj) {
        lectureDialogFragment.m6824F().m6835A();
        lectureDialogFragment.m6823E();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: K */
    public static final void m6810K(LectureDialogFragment lectureDialogFragment, BaseQuickAdapter baseQuickAdapter, View view, int i10) {
        AbstractC9979u.m20294g(baseQuickAdapter, "<unused var>");
        AbstractC9979u.m20294g(view, "<unused var>");
        C9072a c9072a = (C9072a) lectureDialogFragment.m6824F().m6844q().getValue();
        if ((c9072a != null ? (ConnectionStatus) c9072a.m17874b() : null) == ConnectionStatus.CONNECTING) {
            return;
        }
        lectureDialogFragment.m6824F().m6853z((KeyboardData) lectureDialogFragment.f8894k.getItem(i10));
    }

    /* renamed from: L */
    public static final void m6811L(LectureDialogFragment lectureDialogFragment, ActivityResult activityResult) {
        AbstractC9979u.m20294g(activityResult, "activityResult");
        if (activityResult.getResultCode() != -1) {
            lectureDialogFragment.m6824F().m6852y(false);
            ToastUtils.showShort("获取投屏权限失败", new Object[0]);
        } else {
            lectureDialogFragment.m6824F().m6847t(activityResult.getData());
            if (ServiceUtils.isServiceRunning((Class<?>) MyMqttService.class)) {
                ServiceUtils.stopService((Class<?>) MyMqttService.class);
            }
            ServiceUtils.startService((Class<?>) MyMqttService.class);
        }
    }

    /* renamed from: M */
    public static final C10786q m6812M(LectureDialogFragment lectureDialogFragment, String returnedCode) {
        AbstractC9979u.m20294g(returnedCode, "returnedCode");
        C5962b.a aVar = C5962b.f6082a;
        String strM5283k = aVar.m5299a().m5283k();
        ((LectureDialogFragmentBinding) lectureDialogFragment.getMBinding()).f8622z.setText("正在连接(" + strM5283k + ")...");
        if (ServiceUtils.isServiceRunning((Class<?>) MyMqttService.class)) {
            ServiceUtils.stopService((Class<?>) MyMqttService.class);
        }
        aVar.m5299a().m5272J(returnedCode);
        ServiceUtils.startService((Class<?>) MyMqttService.class);
        return C10786q.f26013a;
    }

    private final void initObserver() {
        AbstractC9073b.m17876a(m6824F().m6844q(), this, new InterfaceC9540l() { // from class: l3.c
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return LectureDialogFragment.m6807H(this.f24201c, (ConnectionStatus) obj);
            }
        });
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9979u.m20293f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C61622(null), 3, null);
        AbstractC9073b.m17876a(m6824F().m6842o(), this, new InterfaceC9540l() { // from class: l3.d
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return LectureDialogFragment.m6808I(this.f24202c, ((Boolean) obj).booleanValue());
            }
        });
        LiveEventBus.get("IntranetMqttConnected").observe(this, new Observer() { // from class: l3.e
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                LectureDialogFragment.m6809J(this.f24203c, obj);
            }
        });
    }

    private final void initView() throws SocketException {
        RecyclerView recyclerView = ((LectureDialogFragmentBinding) getMBinding()).f8613q;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        AbstractC9979u.m20292e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        ((LinearLayoutManager) layoutManager).setOrientation(0);
        recyclerView.setAdapter(this.f8894k);
        this.f8894k.setOnItemClickListener(new InterfaceC10427d() { // from class: l3.f
            @Override // p268o1.InterfaceC10427d
            /* renamed from: a */
            public final void mo2825a(BaseQuickAdapter baseQuickAdapter, View view, int i10) {
                LectureDialogFragment.m6810K(this.f24204a, baseQuickAdapter, view, i10);
            }
        });
        final RecyclerView recyclerView2 = ((LectureDialogFragmentBinding) getMBinding()).f8612p;
        recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext()));
        RecyclerView.LayoutManager layoutManager2 = recyclerView2.getLayoutManager();
        AbstractC9979u.m20292e(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        ((LinearLayoutManager) layoutManager2).setOrientation(0);
        recyclerView2.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.friday.lecture.view.LectureDialogFragment$initView$2$1
            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                AbstractC9979u.m20294g(outRect, "outRect");
                AbstractC9979u.m20294g(view, "view");
                AbstractC9979u.m20294g(parent, "parent");
                AbstractC9979u.m20294g(state, "state");
                super.getItemOffsets(outRect, view, parent, state);
                outRect.right = (int) recyclerView2.getResources().getDimension(R$dimen.view_12);
            }
        });
        recyclerView2.setAdapter(this.f8895l);
        ((LectureDialogFragmentBinding) getMBinding()).f8619w.setText(AbstractC11958b.m26585f(R$string.join_class));
        ((LectureDialogFragmentBinding) getMBinding()).f8615s.setText(AbstractC11958b.m26585f(R$string.join_class_big_screen));
        ((LectureDialogFragmentBinding) getMBinding()).f8595E.setText(AbstractC11958b.m26585f(R$string.join_class_network));
        ((LectureDialogFragmentBinding) getMBinding()).f8596F.setText(AbstractC11958b.m26585f(R$string.join_class_password));
        ((LectureDialogFragmentBinding) getMBinding()).f8616t.setText(AbstractC11958b.m26585f(R$string.join_class_button));
        ((LectureDialogFragmentBinding) getMBinding()).f8599c.setText(AbstractC11958b.m26585f(R$string.lecture_leave_class));
        ((LectureDialogFragmentBinding) getMBinding()).f8620x.setText(AbstractC11958b.m26585f(R$string.classing_student));
        ((LectureDialogFragmentBinding) getMBinding()).f8607k.setImageResource(R$mipmap.icon_classing_student);
        ((LectureDialogFragmentBinding) getMBinding()).f8598H.setVisibility(0);
        String iPAddress = NetworkUtils.getIPAddress(true);
        AbstractC9979u.m20291d(iPAddress);
        List listM23091I0 = AbstractC10793c0.m23091I0(iPAddress, new String[]{Consts.DOT}, false, 0, 6, null);
        if (listM23091I0.size() == 4) {
            Spanned spannedFromHtml = Html.fromHtml(listM23091I0.get(0) + Consts.DOT + listM23091I0.get(1) + Consts.DOT + listM23091I0.get(2) + ".<font color = '#B0B0B0'>" + listM23091I0.get(3) + " </font>", 0);
            AbstractC9979u.m20293f(spannedFromHtml, "fromHtml(...)");
            ((LectureDialogFragmentBinding) getMBinding()).f8592B.setText(spannedFromHtml);
        }
    }

    /* renamed from: D */
    public final Spanned m6822D(ConnectMode connectMode) {
        String ipAddress = this.f8897n;
        AbstractC9979u.m20293f(ipAddress, "ipAddress");
        List listM23091I0 = AbstractC10793c0.m23091I0(ipAddress, new String[]{Consts.DOT}, false, 0, 6, null);
        if (listM23091I0.size() != 4) {
            return null;
        }
        if (AbstractC9979u.m20289b(connectMode, ConnectMode.C6153IP.INSTANCE)) {
            return Html.fromHtml(listM23091I0.get(0) + Consts.DOT + listM23091I0.get(1) + ".<font color = '#B0B0B0'>" + listM23091I0.get(2) + ".<font color = '#B0B0B0'>" + listM23091I0.get(3) + " </font>", 0);
        }
        return Html.fromHtml(listM23091I0.get(0) + Consts.DOT + listM23091I0.get(1) + Consts.DOT + listM23091I0.get(2) + ".<font color = '#B0B0B0'>" + listM23091I0.get(3) + " </font>", 0);
    }

    /* renamed from: E */
    public final void m6823E() {
        dismissAllowingStateLoss();
    }

    /* renamed from: F */
    public final LectureDialogViewModel m6824F() {
        return (LectureDialogViewModel) this.f8896m.getValue();
    }

    /* renamed from: G */
    public final void m6825G(ConnectionStatus connectionStatus) {
        int i10 = C6161a.f8903a[connectionStatus.ordinal()];
        if (i10 == 1) {
            String string = getString(R$string.connect_error);
            AbstractC9979u.m20293f(string, "getString(...)");
            AbstractC11958b.m26588i(string);
        } else if (i10 != 2 && i10 != 3 && i10 != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: N */
    public final void m6826N(ConnectionStatus connectionStatus) {
        m6827O(connectionStatus, false);
    }

    /* renamed from: O */
    public final void m6827O(ConnectionStatus connectionStatus, boolean z10) {
        int i10 = C6161a.f8903a[connectionStatus.ordinal()];
        if (i10 == 1 || i10 == 2) {
            ((LectureDialogFragmentBinding) getMBinding()).f8614r.setVisibility(8);
            ((LectureDialogFragmentBinding) getMBinding()).f8610n.setVisibility(8);
            ((LectureDialogFragmentBinding) getMBinding()).f8612p.setVisibility(0);
            ((LectureDialogFragmentBinding) getMBinding()).f8603g.setVisibility(8);
            ((LectureDialogFragmentBinding) getMBinding()).f8600d.setVisibility(0);
            ((LectureDialogFragmentBinding) getMBinding()).f8599c.setVisibility(8);
            ((LectureDialogFragmentBinding) getMBinding()).f8616t.setVisibility(0);
            ((LectureDialogFragmentBinding) getMBinding()).f8611o.setVisibility(0);
            Button tvClassOverConfirm = ((LectureDialogFragmentBinding) getMBinding()).f8618v;
            AbstractC9979u.m20293f(tvClassOverConfirm, "tvClassOverConfirm");
            tvClassOverConfirm.setVisibility(8);
            Button tvClassOverCancel = ((LectureDialogFragmentBinding) getMBinding()).f8617u;
            AbstractC9979u.m20293f(tvClassOverCancel, "tvClassOverCancel");
            tvClassOverCancel.setVisibility(8);
        } else if (i10 == 3) {
            ((LectureDialogFragmentBinding) getMBinding()).f8614r.setVisibility(0);
            ((LectureDialogFragmentBinding) getMBinding()).f8610n.setVisibility(0);
            ((LectureDialogFragmentBinding) getMBinding()).f8612p.setVisibility(4);
            ((LectureDialogFragmentBinding) getMBinding()).f8610n.setVisibility(0);
            ((LectureDialogFragmentBinding) getMBinding()).f8603g.setVisibility(8);
            ((LectureDialogFragmentBinding) getMBinding()).f8600d.setVisibility(0);
            ((LectureDialogFragmentBinding) getMBinding()).f8599c.setVisibility(8);
            ((LectureDialogFragmentBinding) getMBinding()).f8616t.setVisibility(4);
            ((LectureDialogFragmentBinding) getMBinding()).f8611o.setVisibility(4);
        } else {
            if (i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            ((LectureDialogFragmentBinding) getMBinding()).f8614r.setVisibility(8);
            ((LectureDialogFragmentBinding) getMBinding()).f8610n.setVisibility(8);
            ((LectureDialogFragmentBinding) getMBinding()).f8612p.setVisibility(0);
            ((LectureDialogFragmentBinding) getMBinding()).f8610n.setVisibility(8);
            ((LectureDialogFragmentBinding) getMBinding()).f8603g.setVisibility(0);
            ((LectureDialogFragmentBinding) getMBinding()).f8600d.setVisibility(8);
            ((LectureDialogFragmentBinding) getMBinding()).f8599c.setVisibility(0);
            ((LectureDialogFragmentBinding) getMBinding()).f8616t.setVisibility(4);
            ((LectureDialogFragmentBinding) getMBinding()).f8611o.setVisibility(4);
        }
        if (z10) {
            return;
        }
        m6825G(connectionStatus);
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public int getLayoutId() {
        return R$layout.lecture_dialog_fragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.friday.common.base.InterfaceC5929c
    public void initData() throws SocketException {
        ConnectionStatus connectionStatus;
        initView();
        initObserver();
        C9072a c9072a = (C9072a) m6824F().m6844q().getValue();
        if (c9072a != null && (connectionStatus = (ConnectionStatus) c9072a.m17874b()) != null) {
            m6827O(connectionStatus, true);
        }
        ImageView ivBack = ((LectureDialogFragmentBinding) getMBinding()).f8605i;
        AbstractC9979u.m20293f(ivBack, "ivBack");
        AppCompatTextView tvFour = ((LectureDialogFragmentBinding) getMBinding()).f8591A;
        AbstractC9979u.m20293f(tvFour, "tvFour");
        AppCompatTextView tvSix = ((LectureDialogFragmentBinding) getMBinding()).f8597G;
        AbstractC9979u.m20293f(tvSix, "tvSix");
        Button tvClassBegin = ((LectureDialogFragmentBinding) getMBinding()).f8616t;
        AbstractC9979u.m20293f(tvClassBegin, "tvClassBegin");
        Button btnEndClass = ((LectureDialogFragmentBinding) getMBinding()).f8599c;
        AbstractC9979u.m20293f(btnEndClass, "btnEndClass");
        TextView tvAirplayCancel = ((LectureDialogFragmentBinding) getMBinding()).f8614r;
        AbstractC9979u.m20293f(tvAirplayCancel, "tvAirplayCancel");
        Button tvClassOverConfirm = ((LectureDialogFragmentBinding) getMBinding()).f8618v;
        AbstractC9979u.m20293f(tvClassOverConfirm, "tvClassOverConfirm");
        Button tvClassOverCancel = ((LectureDialogFragmentBinding) getMBinding()).f8617u;
        AbstractC9979u.m20293f(tvClassOverCancel, "tvClassOverCancel");
        ImageView ivReturn = ((LectureDialogFragmentBinding) getMBinding()).f8608l;
        AbstractC9979u.m20293f(ivReturn, "ivReturn");
        setClickListener(ivBack, tvFour, tvSix, tvClassBegin, btnEndClass, tvAirplayCancel, tvClassOverConfirm, tvClassOverCancel, ivReturn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.friday.common.base.BaseDialogFragment, com.friday.common.base.InterfaceViewOnClickListenerC5928b, android.view.View.OnClickListener
    public void onClick(View view) throws SocketException, NumberFormatException {
        AbstractC9979u.m20294g(view, "view");
        super.onClick(view);
        if (AbstractC9979u.m20289b(view, ((LectureDialogFragmentBinding) getMBinding()).f8614r)) {
            C5965e.f6091k.m5353a().m5347g();
            if (ServiceUtils.isServiceRunning((Class<?>) MyMqttService.class)) {
                ServiceUtils.stopService((Class<?>) MyMqttService.class);
            }
            if (ServiceUtils.isServiceRunning((Class<?>) PusherService.class)) {
                ServiceUtils.stopService((Class<?>) PusherService.class);
                return;
            }
            return;
        }
        if (AbstractC9979u.m20289b(view, ((LectureDialogFragmentBinding) getMBinding()).f8608l)) {
            dismissAllowingStateLoss();
            C0048b c0048b = C0048b.f39a;
            Activity topActivity = ActivityUtils.getTopActivity();
            AbstractC9979u.m20292e(topActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            c0048b.mo98f((AppCompatActivity) topActivity);
            return;
        }
        if (AbstractC9979u.m20289b(view, ((LectureDialogFragmentBinding) getMBinding()).f8605i)) {
            C9072a c9072a = (C9072a) m6824F().m6844q().getValue();
            if ((c9072a != null ? (ConnectionStatus) c9072a.m17874b() : null) == ConnectionStatus.CONNECTING) {
                C5965e.f6091k.m5353a().m5347g();
                if (ServiceUtils.isServiceRunning((Class<?>) MyMqttService.class)) {
                    ServiceUtils.stopService((Class<?>) MyMqttService.class);
                }
                if (ServiceUtils.isServiceRunning((Class<?>) PusherService.class)) {
                    ServiceUtils.stopService((Class<?>) PusherService.class);
                }
            }
            m6823E();
            return;
        }
        if (AbstractC9979u.m20289b(view, ((LectureDialogFragmentBinding) getMBinding()).f8591A)) {
            m6824F().m6836i(ConnectMode.Code.INSTANCE);
            return;
        }
        if (AbstractC9979u.m20289b(view, ((LectureDialogFragmentBinding) getMBinding()).f8597G)) {
            m6824F().m6836i(ConnectMode.C6153IP.INSTANCE);
            return;
        }
        if (AbstractC9979u.m20289b(view, ((LectureDialogFragmentBinding) getMBinding()).f8616t)) {
            if (C9166c.f21406a.m18061e()) {
                m6824F().m6837j(new InterfaceC9540l() { // from class: l3.b
                    @Override // p181hd.InterfaceC9540l
                    public final Object invoke(Object obj) {
                        return LectureDialogFragment.m6812M(this.f24200c, (String) obj);
                    }
                });
                return;
            } else {
                AbstractC11958b.m26587h(R$string.connect_network_please);
                return;
            }
        }
        if (AbstractC9979u.m20289b(view, ((LectureDialogFragmentBinding) getMBinding()).f8599c)) {
            m6824F().m6842o().setValue(new C9072a(Boolean.TRUE));
            return;
        }
        if (AbstractC9979u.m20289b(view, ((LectureDialogFragmentBinding) getMBinding()).f8618v)) {
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            AbstractC9979u.m20293f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C61632(null), 3, null);
        } else if (AbstractC9979u.m20289b(view, ((LectureDialogFragmentBinding) getMBinding()).f8617u)) {
            m6824F().m6842o().setValue(new C9072a(Boolean.FALSE));
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R$style.airPlayDialog);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f8898o.unregister();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout((int) getResources().getDimension(R$dimen.view_498), (int) getResources().getDimension(R$dimen.view_300));
            window.getAttributes().dimAmount = 0.0f;
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setCancelable(false);
            dialog2.setCanceledOnTouchOutside(false);
        }
        super.onStart();
    }
}
