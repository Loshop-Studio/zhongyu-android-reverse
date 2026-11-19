package com.friday.paint.view.six;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cd.AbstractC5423b;
import com.alibaba.fastjson.asm.Opcodes;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.PathUtils;
import com.blankj.utilcode.util.TimeUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.Utils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.friday.common.entity.PayloadKey;
import com.friday.common.helper.C5962b;
import com.friday.common.helper.C5963c;
import com.friday.common.util.CustomException;
import com.friday.common.widget.dialog.BaseDialog;
import com.friday.common.widget.dialog.C5975a;
import com.friday.paint.R$dimen;
import com.friday.paint.R$layout;
import com.friday.paint.R$string;
import com.friday.paint.databinding.ResFragmentNewPaintBinding;
import com.friday.paint.model.NoteListEntity;
import com.friday.paint.view.six.AbstractC6320i;
import com.friday.paint.view.six.NewPaintFragment;
import com.friday.paint.viewmodel.DoHomeworkViewModel;
import com.friday.paint.viewmodel.NewNoteViewModel;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.tencent.bugly.crashreport.CrashReport;
import com.zykj.blackboard.core.data.dao.AbstractC8434a;
import com.zykj.blackboard.core.data.dao.BlackBoardEntity;
import com.zykj.blackboard.core.data.dao.PageEntity;
import com.zykj.board.EzyPageSnapshot;
import com.zykj.board.EzyRouterRecord;
import com.zykj.view.board.board.BoardFragment;
import io.objectbox.BoxStore;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.AbstractC9923a;
import kotlin.AbstractC9924b;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import kotlinx.coroutines.DelayKt;
import p141f2.C9164a;
import p141f2.C9168e;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p200j2.InterfaceC9662b;
import p210jc.C9710a;
import p215k2.AbstractC9795m;
import p215k2.AbstractC9805w;
import p224kb.C9905y1;
import p268o1.InterfaceC10427d;
import p268o1.InterfaceC10428e;
import p285p1.C10599a;
import p309qc.C10786q;
import p309qc.InterfaceC10773d;
import p310qd.AbstractC10793c0;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10978w;
import p325rc.AbstractC10980x;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11607p;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import p429z1.AbstractC11958b;
import sd.AbstractC11109f;
import sd.AbstractC11117h;
import sd.C11157r0;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
@Keep
/* loaded from: classes4.dex */
public class NewPaintFragment extends Hilt_NewPaintFragment<ResFragmentNewPaintBinding> {
    public static final String TAG_NOTE_FRAGMENT = "NoteFragment";
    private final ActivityResultLauncher<Intent> askLauncher;
    private final InterfaceC10773d homeworkViewModel$delegate;
    public InterfaceC9662b iClassManager;
    private final InterfaceC10773d rightNoteListAdapter$delegate = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: d4.m
        @Override // p181hd.InterfaceC9529a
        public final Object invoke() {
            return NewPaintFragment.rightNoteListAdapter_delegate$lambda$0();
        }
    });
    private boolean screensPermission;
    private final ActivityResultLauncher<Intent> shareLauncher;
    private final InterfaceC10773d viewModel$delegate;
    public static final C6281a Companion = new C6281a(null);
    public static final int $stable = 8;

    /* renamed from: com.friday.paint.view.six.NewPaintFragment$a */
    public static final class C6281a {
        public /* synthetic */ C6281a(AbstractC9972n abstractC9972n) {
            this();
        }

        public C6281a() {
        }
    }

    /* renamed from: com.friday.paint.view.six.NewPaintFragment$b */
    public static final class C6282b implements InterfaceC10428e {

        /* renamed from: a */
        public int f10084a;

        /* renamed from: b */
        public NoteListEntity f10085b;

        public C6282b() {
        }

        @Override // p268o1.InterfaceC10428e
        /* renamed from: a */
        public void mo7473a(RecyclerView.ViewHolder viewHolder, int i10) {
            AbstractC9979u.m20294g(viewHolder, "viewHolder");
            if (viewHolder.itemView.getAlpha() == 0.5f) {
                C9164a.f21403a.m18055b(viewHolder.itemView, 1.0f, 1.2f, 600L);
            }
            NewPaintFragment.this.isShowLoading(true);
            NoteListEntity noteListEntity = this.f10085b;
            if (noteListEntity != null) {
                NewPaintFragment newPaintFragment = NewPaintFragment.this;
                int iIndexOf = newPaintFragment.getRightNoteListAdapter().getData().indexOf(noteListEntity);
                if (i10 == iIndexOf) {
                    newPaintFragment.getViewModel().m7685b0(i10);
                } else {
                    newPaintFragment.getViewModel().m7685b0(iIndexOf);
                }
            }
            if (!NewPaintFragment.access$getMBinding(NewPaintFragment.this).f9844i.isEnabled()) {
                NewPaintFragment newPaintFragment2 = NewPaintFragment.this;
                ImageView ivCopyPage = NewPaintFragment.access$getMBinding(newPaintFragment2).f9844i;
                AbstractC9979u.m20293f(ivCopyPage, "ivCopyPage");
                ImageView ivAddPage = NewPaintFragment.access$getMBinding(NewPaintFragment.this).f9840e;
                AbstractC9979u.m20293f(ivAddPage, "ivAddPage");
                ImageView ivRemovePage = NewPaintFragment.access$getMBinding(NewPaintFragment.this).f9849n;
                AbstractC9979u.m20293f(ivRemovePage, "ivRemovePage");
                newPaintFragment2.convertEnable(ivCopyPage, ivAddPage, ivRemovePage);
            }
            NewPaintFragment.this.getViewModel().m7686c0(true);
            NewPaintFragment.this.getRightNoteListAdapter().notifyDataSetChanged();
            NewPaintFragment.this.isShowLoading(false);
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
            if (NewPaintFragment.access$getMBinding(NewPaintFragment.this).f9844i.isEnabled()) {
                NewPaintFragment newPaintFragment = NewPaintFragment.this;
                ImageView ivCopyPage = NewPaintFragment.access$getMBinding(newPaintFragment).f9844i;
                AbstractC9979u.m20293f(ivCopyPage, "ivCopyPage");
                ImageView ivAddPage = NewPaintFragment.access$getMBinding(NewPaintFragment.this).f9840e;
                AbstractC9979u.m20293f(ivAddPage, "ivAddPage");
                ImageView ivRemovePage = NewPaintFragment.access$getMBinding(NewPaintFragment.this).f9849n;
                AbstractC9979u.m20293f(ivRemovePage, "ivRemovePage");
                newPaintFragment.convertEnable(ivCopyPage, ivAddPage, ivRemovePage);
            }
            if (viewHolder.itemView.getAlpha() == 1.0f) {
                C9164a.f21403a.m18055b(viewHolder.itemView, 1.0f, 1.2f, 600L);
            }
            this.f10084a = i10;
            Iterator<T> it = NewPaintFragment.this.getRightNoteListAdapter().getData().iterator();
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
            this.f10085b = (NoteListEntity) next;
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.paint.view.six.NewPaintFragment", m26211f = "NewPaintFragment.kt", m26212l = {1050}, m26213m = "changeNote")
    /* renamed from: com.friday.paint.view.six.NewPaintFragment$changeNote$1 */
    public static final class C62831 extends ContinuationImpl {

        /* renamed from: c */
        public Object f10087c;

        /* renamed from: d */
        public Object f10088d;

        /* renamed from: e */
        public Object f10089e;

        /* renamed from: f */
        public int f10090f;

        /* renamed from: g */
        public /* synthetic */ Object f10091g;

        /* renamed from: i */
        public int f10093i;

        public C62831(InterfaceC11588c interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f10091g = obj;
            this.f10093i |= Integer.MIN_VALUE;
            return NewPaintFragment.this.changeNote(null, this);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.paint.view.six.NewPaintFragment$checkImageSafety$1", m26211f = "NewPaintFragment.kt", m26212l = {433, 437, 442}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.paint.view.six.NewPaintFragment$checkImageSafety$1 */
    public static final class C62841 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public Object f10094c;

        /* renamed from: d */
        public Object f10095d;

        /* renamed from: e */
        public int f10096e;

        /* renamed from: f */
        public int f10097f;

        /* renamed from: g */
        public int f10098g;

        /* renamed from: i */
        public final /* synthetic */ String f10100i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C62841(String str, InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
            this.f10100i = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return NewPaintFragment.this.new C62841(this.f10100i, interfaceC11588c);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x009f, code lost:
        
            if (r10.m7676S(r6, r9) != r0) goto L31;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                r9 = this;
                java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                int r1 = r9.f10098g
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L40
                if (r1 == r4) goto L32
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                kotlin.AbstractC9924b.m20071b(r10)     // Catch: java.lang.Throwable -> L17
                goto La2
            L17:
                r10 = move-exception
                goto La8
            L1a:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L22:
                int r1 = r9.f10097f
                int r3 = r9.f10096e
                java.lang.Object r4 = r9.f10095d
                java.lang.String r4 = (java.lang.String) r4
                java.lang.Object r6 = r9.f10094c
                com.friday.paint.view.six.NewPaintFragment r6 = (com.friday.paint.view.six.NewPaintFragment) r6
                kotlin.AbstractC9924b.m20071b(r10)     // Catch: java.lang.Throwable -> L17
                goto L88
            L32:
                int r1 = r9.f10096e
                java.lang.Object r4 = r9.f10095d
                java.lang.String r4 = (java.lang.String) r4
                java.lang.Object r6 = r9.f10094c
                com.friday.paint.view.six.NewPaintFragment r6 = (com.friday.paint.view.six.NewPaintFragment) r6
                kotlin.AbstractC9924b.m20071b(r10)     // Catch: java.lang.Throwable -> L17
                goto L66
            L40:
                kotlin.AbstractC9924b.m20071b(r10)
                com.friday.paint.view.six.NewPaintFragment r10 = com.friday.paint.view.six.NewPaintFragment.this
                java.lang.String r1 = r9.f10100i
                kotlin.Result$a r6 = kotlin.Result.f23263d     // Catch: java.lang.Throwable -> L17
                sd.e0 r6 = sd.C11157r0.m24799b()     // Catch: java.lang.Throwable -> L17
                com.friday.paint.view.six.NewPaintFragment$checkImageSafety$1$1$riskScore$1 r7 = new com.friday.paint.view.six.NewPaintFragment$checkImageSafety$1$1$riskScore$1     // Catch: java.lang.Throwable -> L17
                r7.<init>(r1, r5)     // Catch: java.lang.Throwable -> L17
                r9.f10094c = r10     // Catch: java.lang.Throwable -> L17
                r9.f10095d = r1     // Catch: java.lang.Throwable -> L17
                r8 = 0
                r9.f10096e = r8     // Catch: java.lang.Throwable -> L17
                r9.f10098g = r4     // Catch: java.lang.Throwable -> L17
                java.lang.Object r4 = sd.AbstractC11109f.m24709g(r6, r7, r9)     // Catch: java.lang.Throwable -> L17
                if (r4 != r0) goto L62
                goto La1
            L62:
                r6 = r10
                r10 = r4
                r4 = r1
                r1 = r8
            L66:
                java.lang.Number r10 = (java.lang.Number) r10     // Catch: java.lang.Throwable -> L17
                int r10 = r10.intValue()     // Catch: java.lang.Throwable -> L17
                sd.t1 r7 = sd.C11157r0.m24800c()     // Catch: java.lang.Throwable -> L17
                com.friday.paint.view.six.NewPaintFragment$checkImageSafety$1$1$1 r8 = new com.friday.paint.view.six.NewPaintFragment$checkImageSafety$1$1$1     // Catch: java.lang.Throwable -> L17
                r8.<init>(r10, r5)     // Catch: java.lang.Throwable -> L17
                r9.f10094c = r6     // Catch: java.lang.Throwable -> L17
                r9.f10095d = r4     // Catch: java.lang.Throwable -> L17
                r9.f10096e = r1     // Catch: java.lang.Throwable -> L17
                r9.f10097f = r10     // Catch: java.lang.Throwable -> L17
                r9.f10098g = r3     // Catch: java.lang.Throwable -> L17
                java.lang.Object r3 = sd.AbstractC11109f.m24709g(r7, r8, r9)     // Catch: java.lang.Throwable -> L17
                if (r3 != r0) goto L86
                goto La1
            L86:
                r3 = r1
                r1 = r10
            L88:
                com.friday.paint.viewmodel.NewNoteViewModel r10 = com.friday.paint.view.six.NewPaintFragment.access$getViewModel(r6)     // Catch: java.lang.Throwable -> L17
                com.friday.common.entity.ImageSafetyEntity r6 = new com.friday.common.entity.ImageSafetyEntity     // Catch: java.lang.Throwable -> L17
                r6.<init>(r4, r1)     // Catch: java.lang.Throwable -> L17
                r9.f10094c = r5     // Catch: java.lang.Throwable -> L17
                r9.f10095d = r5     // Catch: java.lang.Throwable -> L17
                r9.f10096e = r3     // Catch: java.lang.Throwable -> L17
                r9.f10097f = r1     // Catch: java.lang.Throwable -> L17
                r9.f10098g = r2     // Catch: java.lang.Throwable -> L17
                java.lang.Object r10 = r10.m7676S(r6, r9)     // Catch: java.lang.Throwable -> L17
                if (r10 != r0) goto La2
            La1:
                return r0
            La2:
                qc.q r10 = p309qc.C10786q.f26013a     // Catch: java.lang.Throwable -> L17
                kotlin.Result.m20054c(r10)     // Catch: java.lang.Throwable -> L17
                goto Lb1
            La8:
                kotlin.Result$a r0 = kotlin.Result.f23263d
                java.lang.Object r10 = kotlin.AbstractC9924b.m20070a(r10)
                kotlin.Result.m20054c(r10)
            Lb1:
                qc.q r10 = p309qc.C10786q.f26013a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.friday.paint.view.six.NewPaintFragment.C62841.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes4/com/friday/paint/view/six/NewPaintFragment$checkImageSafety$1.smali:138
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C62841) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.paint.view.six.NewPaintFragment$copyNote$1", m26211f = "NewPaintFragment.kt", m26212l = {738, 902, 907}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.paint.view.six.NewPaintFragment$copyNote$1 */
    public static final class C62851 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public Object f10105c;

        /* renamed from: d */
        public Object f10106d;

        /* renamed from: e */
        public Object f10107e;

        /* renamed from: f */
        public Object f10108f;

        /* renamed from: g */
        public Object f10109g;

        /* renamed from: h */
        public Object f10110h;

        /* renamed from: i */
        public Object f10111i;

        /* renamed from: j */
        public Object f10112j;

        /* renamed from: k */
        public Object f10113k;

        /* renamed from: l */
        public Object f10114l;

        /* renamed from: m */
        public Object f10115m;

        /* renamed from: n */
        public Object f10116n;

        /* renamed from: o */
        public int f10117o;

        /* renamed from: p */
        public int f10118p;

        /* renamed from: q */
        public int f10119q;

        /* renamed from: r */
        public int f10120r;

        /* renamed from: s */
        public int f10121s;

        /* renamed from: t */
        public int f10122t;

        /* renamed from: v */
        public final /* synthetic */ int f10124v;

        @InterfaceC11829d(m26210c = "com.friday.paint.view.six.NewPaintFragment$copyNote$1$1", m26211f = "NewPaintFragment.kt", m26212l = {869}, m26213m = "invokeSuspend")
        /* renamed from: com.friday.paint.view.six.NewPaintFragment$copyNote$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public Object f10125c;

            /* renamed from: d */
            public Object f10126d;

            /* renamed from: e */
            public Object f10127e;

            /* renamed from: f */
            public Object f10128f;

            /* renamed from: g */
            public Object f10129g;

            /* renamed from: h */
            public Object f10130h;

            /* renamed from: i */
            public Object f10131i;

            /* renamed from: j */
            public Object f10132j;

            /* renamed from: k */
            public Object f10133k;

            /* renamed from: l */
            public Object f10134l;

            /* renamed from: m */
            public Object f10135m;

            /* renamed from: n */
            public Object f10136n;

            /* renamed from: o */
            public Object f10137o;

            /* renamed from: p */
            public Object f10138p;

            /* renamed from: q */
            public int f10139q;

            /* renamed from: r */
            public int f10140r;

            /* renamed from: s */
            public int f10141s;

            /* renamed from: t */
            public int f10142t;

            /* renamed from: u */
            public int f10143u;

            /* renamed from: v */
            public int f10144v;

            /* renamed from: w */
            public final /* synthetic */ String f10145w;

            /* renamed from: x */
            public final /* synthetic */ String f10146x;

            /* renamed from: y */
            public final /* synthetic */ NewPaintFragment f10147y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(String str, String str2, NewPaintFragment newPaintFragment, InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
                this.f10145w = str;
                this.f10146x = str2;
                this.f10147y = newPaintFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                return new AnonymousClass1(this.f10145w, this.f10146x, this.f10147y, interfaceC11588c);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:14:0x00b8  */
            /* JADX WARN: Removed duplicated region for block: B:63:0x02c3  */
            /* JADX WARN: Removed duplicated region for block: B:81:0x0376  */
            /* JADX WARN: Removed duplicated region for block: B:83:0x0386  */
            /* JADX WARN: Removed duplicated region for block: B:87:0x0397  */
            /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v54, types: [java.lang.Iterable] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x02a3 -> B:61:0x02bd). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x0365 -> B:79:0x036e). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x038f -> B:84:0x038c). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r27) throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 922
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.friday.paint.view.six.NewPaintFragment.C62851.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes4/com/friday/paint/view/six/NewPaintFragment$copyNote$1$1.smali:177
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
                return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C62851(int i10, InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
            this.f10124v = i10;
        }

        /* renamed from: m */
        public static final void m7583m(NewPaintFragment newPaintFragment, int i10) {
            newPaintFragment.getViewModel().m7685b0(i10);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return NewPaintFragment.this.new C62851(this.f10124v, interfaceC11588c);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0154, code lost:
        
            if (sd.AbstractC11109f.m24709g(r7, r8, r25) == r2) goto L60;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:54:0x01e8 A[Catch: all -> 0x005c, TryCatch #1 {all -> 0x005c, blocks: (B:8:0x0049, B:52:0x01e2, B:54:0x01e8, B:58:0x0263, B:63:0x02f3, B:65:0x02f7, B:15:0x009f, B:31:0x0178, B:32:0x0187, B:34:0x018d, B:38:0x01a2, B:40:0x01a6, B:42:0x01ac, B:43:0x01b2, B:45:0x01b8, B:49:0x01cd, B:51:0x01d1), top: B:75:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:61:0x02df  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x02f3 A[Catch: all -> 0x005c, TryCatch #1 {all -> 0x005c, blocks: (B:8:0x0049, B:52:0x01e2, B:54:0x01e8, B:58:0x0263, B:63:0x02f3, B:65:0x02f7, B:15:0x009f, B:31:0x0178, B:32:0x0187, B:34:0x018d, B:38:0x01a2, B:40:0x01a6, B:42:0x01ac, B:43:0x01b2, B:45:0x01b8, B:49:0x01cd, B:51:0x01d1), top: B:75:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0316 A[LOOP:0: B:69:0x0314->B:70:0x0316, LOOP_END] */
        /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Iterable] */
        /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Iterable] */
        /* JADX WARN: Type inference failed for: r3v0, types: [int] */
        /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r3v18 */
        /* JADX WARN: Type inference failed for: r3v32 */
        /* JADX WARN: Type inference failed for: r3v33 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x02df -> B:62:0x02f0). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 853
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.friday.paint.view.six.NewPaintFragment.C62851.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes4/com/friday/paint/view/six/NewPaintFragment$copyNote$1.smali:193
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C62851) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.paint.view.six.NewPaintFragment", m26211f = "NewPaintFragment.kt", m26212l = {1066, 1067}, m26213m = "getNoteFragment")
    /* renamed from: com.friday.paint.view.six.NewPaintFragment$getNoteFragment$1 */
    public static final class C62861 extends ContinuationImpl {

        /* renamed from: c */
        public Object f10150c;

        /* renamed from: d */
        public Object f10151d;

        /* renamed from: e */
        public Object f10152e;

        /* renamed from: f */
        public Object f10153f;

        /* renamed from: g */
        public boolean f10154g;

        /* renamed from: h */
        public /* synthetic */ Object f10155h;

        /* renamed from: j */
        public int f10157j;

        public C62861(InterfaceC11588c interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f10155h = obj;
            this.f10157j |= Integer.MIN_VALUE;
            return NewPaintFragment.this.getNoteFragment(null, null, this);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.paint.view.six.NewPaintFragment$initObserver$1", m26211f = "NewPaintFragment.kt", m26212l = {194}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.paint.view.six.NewPaintFragment$initObserver$1 */
    public static final class C62871 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f10166c;

        @InterfaceC11829d(m26210c = "com.friday.paint.view.six.NewPaintFragment$initObserver$1$1", m26211f = "NewPaintFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
        /* renamed from: com.friday.paint.view.six.NewPaintFragment$initObserver$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public int f10168c;

            /* renamed from: d */
            public /* synthetic */ boolean f10169d;

            /* renamed from: e */
            public final /* synthetic */ NewPaintFragment f10170e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(NewPaintFragment newPaintFragment, InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
                this.f10170e = newPaintFragment;
            }

            /* renamed from: n */
            public static final C10786q m7586n(NewPaintFragment newPaintFragment, Throwable th) {
                newPaintFragment.isShowLoading(false);
                ToastUtils.showShort("该页数据异常", new Object[0]);
                return C10786q.f26013a;
            }

            /* renamed from: p */
            public static final C10786q m7587p(NewPaintFragment newPaintFragment, String str) {
                newPaintFragment.isShowLoading(false);
                if (str != null) {
                    try {
                        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(newPaintFragment), null, null, new NewPaintFragment$initObserver$1$1$2$1$1(newPaintFragment, str, null), 3, null);
                    } catch (Exception unused) {
                    }
                }
                return C10786q.f26013a;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f10170e, interfaceC11588c);
                anonymousClass1.f10169d = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // p181hd.InterfaceC9544p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (InterfaceC11588c) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                boolean z10 = this.f10169d;
                AbstractC11725a.m25952f();
                if (this.f10168c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                BoardFragment currentNoteFragment = this.f10170e.getCurrentNoteFragment();
                if (z10 && currentNoteFragment != null) {
                    this.f10170e.isShowLoading(true);
                    final NewPaintFragment newPaintFragment = this.f10170e;
                    InterfaceC9540l interfaceC9540l = new InterfaceC9540l() { // from class: com.friday.paint.view.six.b
                        @Override // p181hd.InterfaceC9540l
                        public final Object invoke(Object obj2) {
                            return NewPaintFragment.C62871.AnonymousClass1.m7586n(newPaintFragment, (Throwable) obj2);
                        }
                    };
                    final NewPaintFragment newPaintFragment2 = this.f10170e;
                    newPaintFragment.save(currentNoteFragment, false, interfaceC9540l, new InterfaceC9540l() { // from class: com.friday.paint.view.six.c
                        @Override // p181hd.InterfaceC9540l
                        public final Object invoke(Object obj2) {
                            return NewPaintFragment.C62871.AnonymousClass1.m7587p(newPaintFragment2, (String) obj2);
                        }
                    });
                }
                return C10786q.f26013a;
            }

            public final Object invoke(boolean z10, InterfaceC11588c interfaceC11588c) {
                return ((AnonymousClass1) create(Boolean.valueOf(z10), interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        public C62871(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return NewPaintFragment.this.new C62871(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f10166c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC11607p interfaceC11607pM7696y = NewPaintFragment.this.getViewModel().m7696y();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(NewPaintFragment.this, null);
                this.f10166c = 1;
                if (AbstractC11596e.m25559i(interfaceC11607pM7696y, anonymousClass1, this) == objM25952f) {
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
            return ((C62871) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.paint.view.six.NewPaintFragment$initObserver$8", m26211f = "NewPaintFragment.kt", m26212l = {377}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.paint.view.six.NewPaintFragment$initObserver$8 */
    public static final class C62888 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f10189c;

        @InterfaceC11829d(m26210c = "com.friday.paint.view.six.NewPaintFragment$initObserver$8$1", m26211f = "NewPaintFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
        /* renamed from: com.friday.paint.view.six.NewPaintFragment$initObserver$8$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public int f10191c;

            /* renamed from: d */
            public /* synthetic */ Object f10192d;

            /* renamed from: e */
            public final /* synthetic */ NewPaintFragment f10193e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(NewPaintFragment newPaintFragment, InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
                this.f10193e = newPaintFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f10193e, interfaceC11588c);
                anonymousClass1.f10192d = ((Result) obj).m20061n();
                return anonymousClass1;
            }

            @Override // p181hd.InterfaceC9544p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Result) obj).m20061n(), (InterfaceC11588c) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                String message;
                Object obj2 = this.f10192d;
                AbstractC11725a.m25952f();
                if (this.f10191c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                if (Result.m20059k(obj2)) {
                    C5963c c5963c = C5963c.f6084a;
                    FragmentActivity fragmentActivityRequireActivity = this.f10193e.requireActivity();
                    AbstractC9979u.m20293f(fragmentActivityRequireActivity, "requireActivity(...)");
                    String strM7669K = this.f10193e.getViewModel().m7669K();
                    String strM7665G = this.f10193e.getViewModel().m7665G();
                    List listM24136n = AbstractC10978w.m24136n();
                    if (Result.m20058g(obj2)) {
                        obj2 = listM24136n;
                    }
                    C5963c.m5300b(c5963c, fragmentActivityRequireActivity, strM7669K, strM7665G, true, new ArrayList((Collection) obj2), true, false, null, Opcodes.CHECKCAST, null);
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

        public C62888(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return NewPaintFragment.this.new C62888(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f10189c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC11607p interfaceC11607pM7659A = NewPaintFragment.this.getViewModel().m7659A();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(NewPaintFragment.this, null);
                this.f10189c = 1;
                if (AbstractC11596e.m25559i(interfaceC11607pM7659A, anonymousClass1, this) == objM25952f) {
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
            return ((C62888) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.paint.view.six.NewPaintFragment$initObserver$9", m26211f = "NewPaintFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.paint.view.six.NewPaintFragment$initObserver$9 */
    public static final class C62899 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f10194c;

        public C62899(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return new C62899(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.f10194c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C62899) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.paint.view.six.NewPaintFragment$initPaint$1", m26211f = "NewPaintFragment.kt", m26212l = {TypedValues.PositionType.TYPE_PERCENT_X}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.paint.view.six.NewPaintFragment$initPaint$1 */
    public static final class C62901 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f10195c;

        @InterfaceC11829d(m26210c = "com.friday.paint.view.six.NewPaintFragment$initPaint$1$1", m26211f = "NewPaintFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
        /* renamed from: com.friday.paint.view.six.NewPaintFragment$initPaint$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public int f10197c;

            /* renamed from: d */
            public /* synthetic */ Object f10198d;

            /* renamed from: e */
            public final /* synthetic */ NewPaintFragment f10199e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(NewPaintFragment newPaintFragment, InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
                this.f10199e = newPaintFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f10199e, interfaceC11588c);
                anonymousClass1.f10198d = obj;
                return anonymousClass1;
            }

            @Override // p181hd.InterfaceC9544p
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(List list, InterfaceC11588c interfaceC11588c) {
                return ((AnonymousClass1) create(list, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                List list = (List) this.f10198d;
                AbstractC11725a.m25952f();
                if (this.f10197c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                if (list.isEmpty()) {
                    NewPaintFragment.addNote$default(this.f10199e, 0, false, 2, null);
                } else {
                    this.f10199e.getRightNoteListAdapter().setList(list);
                    NewNoteViewModel viewModel = this.f10199e.getViewModel();
                    Integer num = (Integer) this.f10199e.getViewModel().m7660B().getValue();
                    viewModel.m7685b0(num != null ? num.intValue() : 0);
                }
                return C10786q.f26013a;
            }
        }

        public C62901(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return NewPaintFragment.this.new C62901(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f10195c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC11607p interfaceC11607pM7670L = NewPaintFragment.this.getViewModel().m7670L();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(NewPaintFragment.this, null);
                this.f10195c = 1;
                if (AbstractC11596e.m25559i(interfaceC11607pM7670L, anonymousClass1, this) == objM25952f) {
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
            return ((C62901) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.paint.view.six.NewPaintFragment$onResume$1", m26211f = "NewPaintFragment.kt", m26212l = {128}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.paint.view.six.NewPaintFragment$onResume$1 */
    public static final class C62911 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public Object f10202c;

        /* renamed from: d */
        public int f10203d;

        public C62911(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return NewPaintFragment.this.new C62911(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            NewPaintFragment newPaintFragment;
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f10203d;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                NewPaintFragment newPaintFragment2 = NewPaintFragment.this;
                DoHomeworkViewModel homeworkViewModel = newPaintFragment2.getHomeworkViewModel();
                this.f10202c = newPaintFragment2;
                this.f10203d = 1;
                Object objM7634q = homeworkViewModel.m7634q(this);
                if (objM7634q == objM25952f) {
                    return objM25952f;
                }
                newPaintFragment = newPaintFragment2;
                obj = objM7634q;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                newPaintFragment = (NewPaintFragment) this.f10202c;
                AbstractC9924b.m20071b(obj);
            }
            newPaintFragment.screensPermission = ((Boolean) obj).booleanValue();
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C62911) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.paint.view.six.NewPaintFragment$save$2", m26211f = "NewPaintFragment.kt", m26212l = {1139}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.paint.view.six.NewPaintFragment$save$2 */
    public static final class C62922 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f10205c;

        /* renamed from: d */
        public final /* synthetic */ BoardFragment f10206d;

        /* renamed from: e */
        public final /* synthetic */ InterfaceC9540l f10207e;

        /* renamed from: f */
        public final /* synthetic */ boolean f10208f;

        /* renamed from: g */
        public final /* synthetic */ InterfaceC9540l f10209g;

        /* renamed from: h */
        public final /* synthetic */ NewPaintFragment f10210h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C62922(BoardFragment boardFragment, InterfaceC9540l interfaceC9540l, boolean z10, InterfaceC9540l interfaceC9540l2, NewPaintFragment newPaintFragment, InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
            this.f10206d = boardFragment;
            this.f10207e = interfaceC9540l;
            this.f10208f = z10;
            this.f10209g = interfaceC9540l2;
            this.f10210h = newPaintFragment;
        }

        /* renamed from: m */
        public static final C10786q m7598m(NewPaintFragment newPaintFragment, InterfaceC9540l interfaceC9540l, BoardFragment boardFragment, String str) {
            AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(newPaintFragment), null, null, new NewPaintFragment$save$2$1$1(str, interfaceC9540l, boardFragment, newPaintFragment, null), 3, null);
            return C10786q.f26013a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return new C62922(this.f10206d, this.f10207e, this.f10208f, this.f10209g, this.f10210h, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f10205c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                this.f10205c = 1;
                if (DelayKt.m20376b(100L, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            Bundle arguments = this.f10206d.getArguments();
            String string = arguments != null ? arguments.getString("path") : null;
            if (string != null && string.length() != 0 && C9168e.f21413a.m18067a(new File(string))) {
                this.f10207e.invoke(null);
                return C10786q.f26013a;
            }
            final BoardFragment boardFragment = this.f10206d;
            boolean z10 = this.f10208f;
            InterfaceC9540l interfaceC9540l = this.f10209g;
            final NewPaintFragment newPaintFragment = this.f10210h;
            final InterfaceC9540l interfaceC9540l2 = this.f10207e;
            boardFragment.m16798z0(z10, true, interfaceC9540l, new InterfaceC9540l() { // from class: com.friday.paint.view.six.h
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj2) {
                    return NewPaintFragment.C62922.m7598m(newPaintFragment, interfaceC9540l2, boardFragment, (String) obj2);
                }
            });
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C62922) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.paint.view.six.NewPaintFragment$saveScreenCaptureToPng$2", m26211f = "NewPaintFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.paint.view.six.NewPaintFragment$saveScreenCaptureToPng$2 */
    public static final class C62932 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f10218c;

        /* renamed from: d */
        public /* synthetic */ Object f10219d;

        /* renamed from: e */
        public final /* synthetic */ String f10220e;

        /* renamed from: f */
        public final /* synthetic */ Bitmap f10221f;

        /* renamed from: g */
        public final /* synthetic */ NewPaintFragment f10222g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C62932(String str, Bitmap bitmap, NewPaintFragment newPaintFragment, InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
            this.f10220e = str;
            this.f10221f = bitmap;
            this.f10222g = newPaintFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            C62932 c62932 = new C62932(this.f10220e, this.f10221f, this.f10222g, interfaceC11588c);
            c62932.f10219d = obj;
            return c62932;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM20054c;
            AbstractC11725a.m25952f();
            if (this.f10218c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            String str = this.f10220e;
            Bitmap bitmap = this.f10221f;
            try {
                Result.C9921a c9921a = Result.f23263d;
                File file = new File(PathUtils.getExternalAppCachePath(), str + ".png");
                if (!file.getParentFile().exists()) {
                    file.getParentFile().mkdirs();
                }
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, bufferedOutputStream);
                    AbstractC5423b.m2902a(bufferedOutputStream, null);
                    objM20054c = Result.m20054c(file.getAbsolutePath());
                } finally {
                }
            } catch (Throwable th) {
                Result.C9921a c9921a2 = Result.f23263d;
                objM20054c = Result.m20054c(AbstractC9924b.m20070a(th));
            }
            NewPaintFragment newPaintFragment = this.f10222g;
            Throwable thM20056e = Result.m20056e(objM20054c);
            if (thM20056e != null) {
                LogUtils.m3887e("[" + newPaintFragment.getViewModel().m7665G() + "] 添加图片:屏幕截图保存 PNG 失败, " + thM20056e.getMessage());
            }
            if (Result.m20058g(objM20054c)) {
                return null;
            }
            return objM20054c;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C62932) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public NewPaintFragment() {
        final InterfaceC9529a interfaceC9529a = null;
        this.viewModel$delegate = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9983y.m20315b(NewNoteViewModel.class), new InterfaceC9529a() { // from class: com.friday.paint.view.six.NewPaintFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new InterfaceC9529a() { // from class: com.friday.paint.view.six.NewPaintFragment$special$$inlined$activityViewModels$default$2
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
        }, new InterfaceC9529a() { // from class: com.friday.paint.view.six.NewPaintFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
        this.homeworkViewModel$delegate = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9983y.m20315b(DoHomeworkViewModel.class), new InterfaceC9529a() { // from class: com.friday.paint.view.six.NewPaintFragment$special$$inlined$activityViewModels$default$4
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new InterfaceC9529a() { // from class: com.friday.paint.view.six.NewPaintFragment$special$$inlined$activityViewModels$default$5
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
        }, new InterfaceC9529a() { // from class: com.friday.paint.view.six.NewPaintFragment$special$$inlined$activityViewModels$default$6
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: d4.x
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                NewPaintFragment.askLauncher$lambda$11((ActivityResult) obj);
            }
        });
        AbstractC9979u.m20293f(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.askLauncher = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: d4.i0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) throws Throwable {
                NewPaintFragment.shareLauncher$lambda$72(this.f20917a, (ActivityResult) obj);
            }
        });
        AbstractC9979u.m20293f(activityResultLauncherRegisterForActivityResult2, "registerForActivityResult(...)");
        this.shareLauncher = activityResultLauncherRegisterForActivityResult2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ ResFragmentNewPaintBinding access$getMBinding(NewPaintFragment newPaintFragment) {
        return (ResFragmentNewPaintBinding) newPaintFragment.getMBinding();
    }

    public static /* synthetic */ void addNote$default(NewPaintFragment newPaintFragment, int i10, boolean z10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addNote");
        }
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        newPaintFragment.addNote(i10, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addNote$lambda$57(NewPaintFragment newPaintFragment, int i10) {
        newPaintFragment.getViewModel().m7685b0(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void askLauncher$lambda$11(ActivityResult activityResult) {
        Intent data;
        String stringExtra;
        AbstractC9979u.m20294g(activityResult, "activityResult");
        if (activityResult.getResultCode() != 0 || (data = activityResult.getData()) == null || (stringExtra = data.getStringExtra("errorMsg")) == null) {
            return;
        }
        ToastUtils.showShort(stringExtra, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object changeNote(java.lang.String r7, vc.InterfaceC11588c<? super p309qc.C10786q> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.friday.paint.view.six.NewPaintFragment.C62831
            if (r0 == 0) goto L13
            r0 = r8
            com.friday.paint.view.six.NewPaintFragment$changeNote$1 r0 = (com.friday.paint.view.six.NewPaintFragment.C62831) r0
            int r1 = r0.f10093i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10093i = r1
            goto L18
        L13:
            com.friday.paint.view.six.NewPaintFragment$changeNote$1 r0 = new com.friday.paint.view.six.NewPaintFragment$changeNote$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f10091g
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f10093i
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            int r7 = r0.f10090f
            java.lang.Object r1 = r0.f10089e
            androidx.fragment.app.FragmentTransaction r1 = (androidx.fragment.app.FragmentTransaction) r1
            java.lang.Object r2 = r0.f10088d
            kb.y1 r2 = (p224kb.C9905y1) r2
            java.lang.Object r0 = r0.f10087c
            java.lang.String r0 = (java.lang.String) r0
            kotlin.AbstractC9924b.m20071b(r8)
            goto L9b
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            kotlin.AbstractC9924b.m20071b(r8)
            r6.isShowLoading(r3)
            int r8 = r7.length()
            if (r8 <= 0) goto L52
            com.friday.paint.viewmodel.NewNoteViewModel r8 = r6.getViewModel()
            r8.m7678U(r7)
        L52:
            com.zykj.view.board.board.BoardFragment r8 = r6.getCurrentNoteFragment()
            if (r8 == 0) goto L5d
            kb.y1 r8 = r8.m16773B0()
            goto L5e
        L5d:
            r8 = 0
        L5e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "BBD: NewPaintFragment.changeNote to: "
            r2.append(r4)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            com.blankj.utilcode.util.LogUtils.m3888i(r2)
            androidx.fragment.app.FragmentManager r2 = r6.getChildFragmentManager()
            androidx.fragment.app.FragmentTransaction r2 = r2.beginTransaction()
            int r4 = com.friday.paint.R$id.flSketch
            java.lang.Object r5 = p409xc.AbstractC11833h.m26224a(r7)
            r0.f10087c = r5
            java.lang.Object r5 = p409xc.AbstractC11833h.m26224a(r8)
            r0.f10088d = r5
            r0.f10089e = r2
            r0.f10090f = r4
            r0.f10093i = r3
            java.lang.Object r8 = r6.getNoteFragment(r7, r8, r0)
            if (r8 != r1) goto L99
            return r1
        L99:
            r1 = r2
            r7 = r4
        L9b:
            androidx.fragment.app.Fragment r8 = (androidx.fragment.app.Fragment) r8
            java.lang.String r0 = "NoteFragment"
            androidx.fragment.app.FragmentTransaction r7 = r1.replace(r7, r8, r0)
            r7.commitNowAllowingStateLoss()
            qc.q r7 = p309qc.C10786q.f26013a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.paint.view.six.NewPaintFragment.changeNote(java.lang.String, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes4/com/friday/paint/view/six/NewPaintFragment.smali:960
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkImageSafety(String str) {
        if (C5962b.f6082a.m5299a().m5294v() && FileUtils.isFileExists(str)) {
            AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C62841(str, null), 3, null);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    /* JADX INFO: Access modifiers changed from: private */
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
        throw new UnsupportedOperationException("Method not decompiled: com.friday.paint.view.six.NewPaintFragment.convertEnable(android.view.View[]):void"); // DEX body: android/中育云笔记/smali_classes4/com/friday/paint/view/six/NewPaintFragment.smali:1404
    }

    private final void copyNote(int i10) {
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C62851(i10, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DoHomeworkViewModel getHomeworkViewModel() {
        return (DoHomeworkViewModel) this.homeworkViewModel$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getNoteFragment(java.lang.String r33, p224kb.C9905y1 r34, vc.InterfaceC11588c<? super com.zykj.view.board.board.BoardFragment> r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.paint.view.six.NewPaintFragment.getNoteFragment(java.lang.String, kb.y1, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes4/com/friday/paint/view/six/NewPaintFragment.smali:1559
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q getNoteFragment$lambda$61(final NewPaintFragment newPaintFragment, final View view) {
        AbstractC9979u.m20294g(view, "view");
        view.setEnabled(false);
        newPaintFragment.getViewModel().m7664F().setValue(Boolean.TRUE);
        BoardFragment currentNoteFragment = newPaintFragment.getCurrentNoteFragment();
        if (currentNoteFragment != null) {
            save$default(newPaintFragment, currentNoteFragment, false, null, new InterfaceC9540l() { // from class: d4.k
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return NewPaintFragment.getNoteFragment$lambda$61$lambda$59$lambda$58(view, newPaintFragment, (String) obj);
                }
            }, 6, null);
        } else {
            view.setEnabled(true);
        }
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q getNoteFragment$lambda$61$lambda$59$lambda$58(View view, NewPaintFragment newPaintFragment, String str) {
        view.setEnabled(true);
        newPaintFragment.updateThumbnailAndDb(str);
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q getNoteFragment$lambda$62(NewPaintFragment newPaintFragment, InterfaceC9529a it) {
        AbstractC9979u.m20294g(it, "it");
        newPaintFragment.startActivityToGallery();
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q getNoteFragment$lambda$64(C9905y1 c9905y1, NewPaintFragment newPaintFragment) {
        BoardFragment currentNoteFragment;
        if (c9905y1 != null && (currentNoteFragment = newPaintFragment.getCurrentNoteFragment()) != null) {
            currentNoteFragment.m16785M1(c9905y1);
        }
        newPaintFragment.isShowLoading(false);
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q getNoteFragment$lambda$65(NewPaintFragment newPaintFragment) {
        newPaintFragment.isShowLoading(false);
        AbstractC11958b.m26588i("该页数据异常");
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q getNoteFragment$lambda$66(NewPaintFragment newPaintFragment, String imagePath) {
        AbstractC9979u.m20294g(imagePath, "imagePath");
        if (imagePath.length() > 0) {
            LogUtils.m3888i("页面NewPaintFragment -> onImageDelete, imagePath=" + imagePath);
            newPaintFragment.getViewModel().m7677T(imagePath);
        }
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q getNoteFragment$lambda$67(String it) {
        AbstractC9979u.m20294g(it, "it");
        CrashReport.postCatchedException(new CustomException("[" + C5962b.f6082a.m5299a().m5292t() + "][" + TimeUtils.getNowString() + "]" + it));
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NewNoteViewModel getViewModel() {
        return (NewNoteViewModel) this.viewModel$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleMdbUpdate(final String str) {
        LogUtils.m3886d("NewPaintFragment.kt -> copyNote(),开始复制新笔记");
        final BoxStore boxStoreM19242b = AbstractC8434a.m14380y().m19241a(Utils.getApp()).m19245f(new File(str, "page_mdb")).m19242b();
        try {
            final C9710a c9710aM18954g = boxStoreM19242b.m18954g(PageEntity.class);
            final List listM19219e = c9710aM18954g.m19219e();
            boxStoreM19242b.m18946I(new Runnable() { // from class: d4.l
                @Override // java.lang.Runnable
                public final void run() {
                    NewPaintFragment.handleMdbUpdate$lambda$51(listM19219e, c9710aM18954g, str, boxStoreM19242b);
                }
            });
            LogUtils.m3888i("页面NewPaintFragment.kt -> ObjectBox ， MDB模式数据同步修正完成");
        } catch (Exception e10) {
            LogUtils.m3887e("页面NewPaintFragment.kt -> ObjectBox，MDB失败: " + e10.getMessage());
            e10.printStackTrace();
        } finally {
            boxStoreM19242b.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleMdbUpdate$lambda$51(List list, C9710a c9710a, String str, BoxStore boxStore) {
        AbstractC9979u.m20291d(list);
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC10978w.m24145w();
            }
            PageEntity pageEntity = (PageEntity) obj;
            String strM14239d = pageEntity.m14239d();
            String string = UUID.randomUUID().toString();
            AbstractC9979u.m20293f(string, "toString(...)");
            File file = new File(str, strM14239d);
            if (file.exists()) {
                boolean zRename = FileUtils.rename(file, string);
                LogUtils.m3888i("页面NewPaintFragment.kt -> ObjectBox,  copyNote()，页面 " + pageEntity.m14241f() + ": 物理重命名 [" + strM14239d + "] -> [" + string + "] " + (zRename ? "成功" : "失败"));
            } else {
                LogUtils.m3887e("页面NewPaintFragment.kt -> ObjectBox,  copyNote()，ObjectBox,找不到物理文件夹 " + strM14239d);
            }
            pageEntity.m14248m(string);
            LogUtils.m3886d("页面NewPaintFragment.kt -> ObjectBox,copyNote()", "更新 PageEntity 字段: dirName 已设为 " + string);
            BlackBoardEntity blackBoardEntity = (BlackBoardEntity) pageEntity.m14236a().m19036d();
            if (blackBoardEntity != null) {
                blackBoardEntity.m14043e(str);
                boxStore.m18954g(BlackBoardEntity.class).m19227m(blackBoardEntity);
            }
            i10 = i11;
        }
        c9710a.m19228n(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initClick() {
        ImageView ivBack = ((ResFragmentNewPaintBinding) getMBinding()).f9843h;
        AbstractC9979u.m20293f(ivBack, "ivBack");
        AbstractC6320i.m7619b(ivBack, new InterfaceC9540l() { // from class: d4.h0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return NewPaintFragment.initClick$lambda$7(this.f20913c, (View) obj);
            }
        });
        ImageView ivAsk = ((ResFragmentNewPaintBinding) getMBinding()).f9842g;
        AbstractC9979u.m20293f(ivAsk, "ivAsk");
        AbstractC6320i.m7619b(ivAsk, new InterfaceC9540l() { // from class: d4.j0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return NewPaintFragment.initClick$lambda$8(this.f20920c, (View) obj);
            }
        });
        OnBackPressedDispatcherKt.addCallback$default(requireActivity().getOnBackPressedDispatcher(), getViewLifecycleOwner(), false, new InterfaceC9540l() { // from class: d4.k0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return NewPaintFragment.initClick$lambda$9(this.f20923c, (OnBackPressedCallback) obj);
            }
        }, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q initClick$lambda$7(final NewPaintFragment newPaintFragment, View it) {
        AbstractC9979u.m20294g(it, "it");
        newPaintFragment.isShowLoading(true);
        BoardFragment currentNoteFragment = newPaintFragment.getCurrentNoteFragment();
        if (currentNoteFragment != null) {
            save$default(newPaintFragment, currentNoteFragment, false, new InterfaceC9540l() { // from class: d4.f0
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return NewPaintFragment.initClick$lambda$7$lambda$5$lambda$3(this.f20907c, (Throwable) obj);
                }
            }, new InterfaceC9540l() { // from class: d4.g0
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return NewPaintFragment.initClick$lambda$7$lambda$5$lambda$4(this.f20910c, (String) obj);
                }
            }, 2, null);
        } else {
            newPaintFragment.getViewModel().m7664F().setValue(Boolean.TRUE);
            newPaintFragment.getViewModel().m7686c0(true);
        }
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q initClick$lambda$7$lambda$5$lambda$3(NewPaintFragment newPaintFragment, Throwable it) {
        AbstractC9979u.m20294g(it, "it");
        newPaintFragment.isShowLoading(false);
        ToastUtils.showShort("笔记保存失败", new Object[0]);
        LogUtils.m3887e("NewPaintFragment -> initClick -> save保存笔记失败");
        newPaintFragment.requireActivity().finish();
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q initClick$lambda$7$lambda$5$lambda$4(NewPaintFragment newPaintFragment, String str) {
        newPaintFragment.getViewModel().m7664F().setValue(Boolean.TRUE);
        newPaintFragment.getViewModel().m7686c0(true);
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q initClick$lambda$8(NewPaintFragment newPaintFragment, View it) {
        AbstractC9979u.m20294g(it, "it");
        LifecycleOwner viewLifecycleOwner = newPaintFragment.getViewLifecycleOwner();
        AbstractC9979u.m20293f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new NewPaintFragment$initClick$2$1(newPaintFragment, null), 3, null);
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final C10786q initClick$lambda$9(NewPaintFragment newPaintFragment, OnBackPressedCallback addCallback) {
        AbstractC9979u.m20294g(addCallback, "$this$addCallback");
        ((ResFragmentNewPaintBinding) newPaintFragment.getMBinding()).f9843h.performClick();
        return C10786q.f26013a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initDrawerRight() {
        ImageView ivDrawerHint = ((ResFragmentNewPaintBinding) getMBinding()).f9846k;
        AbstractC9979u.m20293f(ivDrawerHint, "ivDrawerHint");
        AbstractC6320i.m7619b(ivDrawerHint, new InterfaceC9540l() { // from class: d4.n
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return NewPaintFragment.initDrawerRight$lambda$28(this.f20930c, (View) obj);
            }
        });
        ImageView ivNextPage = ((ResFragmentNewPaintBinding) getMBinding()).f9847l;
        AbstractC9979u.m20293f(ivNextPage, "ivNextPage");
        AbstractC6320i.m7619b(ivNextPage, new InterfaceC9540l() { // from class: d4.o
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return NewPaintFragment.initDrawerRight$lambda$30(this.f20932c, (View) obj);
            }
        });
        ImageView ivPrevPage = ((ResFragmentNewPaintBinding) getMBinding()).f9848m;
        AbstractC9979u.m20293f(ivPrevPage, "ivPrevPage");
        AbstractC6320i.m7619b(ivPrevPage, new InterfaceC9540l() { // from class: d4.p
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return NewPaintFragment.initDrawerRight$lambda$32(this.f20934c, (View) obj);
            }
        });
        ((ResFragmentNewPaintBinding) getMBinding()).f9852q.setClickable(true);
        final RecyclerView recyclerView = ((ResFragmentNewPaintBinding) getMBinding()).f9854s;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireActivity()));
        recyclerView.setAdapter(getRightNoteListAdapter());
        getRightNoteListAdapter().setOnItemClickListener(new InterfaceC10427d() { // from class: d4.q
            @Override // p268o1.InterfaceC10427d
            /* renamed from: a */
            public final void mo2825a(BaseQuickAdapter baseQuickAdapter, View view, int i10) {
                NewPaintFragment.initDrawerRight$lambda$34$lambda$33(this.f20936a, baseQuickAdapter, view, i10);
            }
        });
        recyclerView.addItemDecoration(new RecyclerView.ItemDecoration(recyclerView) { // from class: com.friday.paint.view.six.NewPaintFragment$initDrawerRight$4$2

            /* renamed from: a */
            public final int f10163a;

            {
                this.f10163a = recyclerView.getResources().getDimensionPixelSize(R$dimen.view_5);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                AbstractC9979u.m20294g(outRect, "outRect");
                AbstractC9979u.m20294g(view, "view");
                AbstractC9979u.m20294g(parent, "parent");
                AbstractC9979u.m20294g(state, "state");
                outRect.bottom = this.f10163a;
            }
        });
        ((ResFragmentNewPaintBinding) getMBinding()).f9838c.setDrawerLockMode(1);
        ImageView ivRemovePage = ((ResFragmentNewPaintBinding) getMBinding()).f9849n;
        AbstractC9979u.m20293f(ivRemovePage, "ivRemovePage");
        AbstractC6320i.m7619b(ivRemovePage, new InterfaceC9540l() { // from class: d4.r
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return NewPaintFragment.initDrawerRight$lambda$38(this.f20939c, (View) obj);
            }
        });
        ImageView ivCopyToOthers = ((ResFragmentNewPaintBinding) getMBinding()).f9845j;
        AbstractC9979u.m20293f(ivCopyToOthers, "ivCopyToOthers");
        AbstractC6320i.m7619b(ivCopyToOthers, new InterfaceC9540l() { // from class: d4.s
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return NewPaintFragment.initDrawerRight$lambda$41(this.f20942c, (View) obj);
            }
        });
        ImageView ivCopyPage = ((ResFragmentNewPaintBinding) getMBinding()).f9844i;
        AbstractC9979u.m20293f(ivCopyPage, "ivCopyPage");
        AbstractC6320i.m7619b(ivCopyPage, new InterfaceC9540l() { // from class: d4.t
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return NewPaintFragment.initDrawerRight$lambda$45(this.f20943c, (View) obj);
            }
        });
        ImageView ivAddPage = ((ResFragmentNewPaintBinding) getMBinding()).f9840e;
        AbstractC9979u.m20293f(ivAddPage, "ivAddPage");
        AbstractC6320i.m7619b(ivAddPage, new InterfaceC9540l() { // from class: d4.u
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return NewPaintFragment.initDrawerRight$lambda$47(this.f20944c, (View) obj);
            }
        });
        C10599a draggableModule = getRightNoteListAdapter().getDraggableModule();
        draggableModule.m22439s(true);
        draggableModule.m22423c().m4701b(3);
        getRightNoteListAdapter().getDraggableModule().m22442v(new C6282b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final C10786q initDrawerRight$lambda$28(final NewPaintFragment newPaintFragment, View it) {
        AbstractC9979u.m20294g(it, "it");
        BoardFragment currentNoteFragment = newPaintFragment.getCurrentNoteFragment();
        if (currentNoteFragment != null) {
            newPaintFragment.isShowLoading(true);
            newPaintFragment.save(currentNoteFragment, false, new InterfaceC9540l() { // from class: d4.f
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return NewPaintFragment.initDrawerRight$lambda$28$lambda$24(this.f20906c, (Throwable) obj);
                }
            }, new InterfaceC9540l() { // from class: d4.g
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return NewPaintFragment.initDrawerRight$lambda$28$lambda$26(this.f20909c, (String) obj);
                }
            });
        } else {
            ResFragmentNewPaintBinding resFragmentNewPaintBinding = (ResFragmentNewPaintBinding) newPaintFragment.getMBinding();
            if (!resFragmentNewPaintBinding.f9838c.isDrawerOpen(resFragmentNewPaintBinding.f9852q)) {
                resFragmentNewPaintBinding.f9838c.openDrawer(resFragmentNewPaintBinding.f9852q);
            }
        }
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final C10786q initDrawerRight$lambda$28$lambda$24(NewPaintFragment newPaintFragment, Throwable it) {
        AbstractC9979u.m20294g(it, "it");
        newPaintFragment.isShowLoading(false);
        ResFragmentNewPaintBinding resFragmentNewPaintBinding = (ResFragmentNewPaintBinding) newPaintFragment.getMBinding();
        if (!resFragmentNewPaintBinding.f9838c.isDrawerOpen(resFragmentNewPaintBinding.f9852q)) {
            resFragmentNewPaintBinding.f9838c.openDrawer(resFragmentNewPaintBinding.f9852q);
        }
        ToastUtils.showShort("该页数据异常", new Object[0]);
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final C10786q initDrawerRight$lambda$28$lambda$26(NewPaintFragment newPaintFragment, String str) {
        newPaintFragment.isShowLoading(false);
        ResFragmentNewPaintBinding resFragmentNewPaintBinding = (ResFragmentNewPaintBinding) newPaintFragment.getMBinding();
        if (!resFragmentNewPaintBinding.f9838c.isDrawerOpen(resFragmentNewPaintBinding.f9852q)) {
            resFragmentNewPaintBinding.f9838c.openDrawer(resFragmentNewPaintBinding.f9852q);
        }
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(newPaintFragment), null, null, new NewPaintFragment$initDrawerRight$1$2$2(newPaintFragment, str, null), 3, null);
        newPaintFragment.getViewModel().m7686c0(true);
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final C10786q initDrawerRight$lambda$30(NewPaintFragment newPaintFragment, View it) {
        AbstractC9979u.m20294g(it, "it");
        Integer num = (Integer) newPaintFragment.getViewModel().m7660B().getValue();
        if (num != null) {
            int iIntValue = num.intValue();
            if (iIntValue == newPaintFragment.getRightNoteListAdapter().getItemCount() - 1) {
                addNote$default(newPaintFragment, iIntValue + 1, false, 2, null);
            } else {
                newPaintFragment.getViewModel().m7685b0(iIntValue + 1);
            }
        }
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final C10786q initDrawerRight$lambda$32(NewPaintFragment newPaintFragment, View it) {
        int iIntValue;
        AbstractC9979u.m20294g(it, "it");
        Integer num = (Integer) newPaintFragment.getViewModel().m7660B().getValue();
        if (num != null && (iIntValue = num.intValue()) > 0) {
            newPaintFragment.getViewModel().m7685b0(iIntValue - 1);
        }
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initDrawerRight$lambda$34$lambda$33(NewPaintFragment newPaintFragment, BaseQuickAdapter baseQuickAdapter, View view, int i10) {
        AbstractC9979u.m20294g(baseQuickAdapter, "<unused var>");
        AbstractC9979u.m20294g(view, "<unused var>");
        if (AbstractC9795m.f22988a.m19787a() || newPaintFragment.getRightNoteListAdapter().getData().get(i10).getSelected()) {
            return;
        }
        newPaintFragment.getViewModel().m7685b0(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final C10786q initDrawerRight$lambda$38(final NewPaintFragment newPaintFragment, View it) {
        AbstractC9979u.m20294g(it, "it");
        Integer num = (Integer) newPaintFragment.getViewModel().m7660B().getValue();
        if (num != null) {
            final int iIntValue = num.intValue();
            if (newPaintFragment.getRightNoteListAdapter().getItemCount() == 1) {
                ToastUtils.showShort("不能删除所有笔记", new Object[0]);
            } else {
                BaseDialog baseDialogM5436B = C5975a.f6196a.m5436B(new InterfaceC9529a() { // from class: d4.j
                    @Override // p181hd.InterfaceC9529a
                    public final Object invoke() {
                        return NewPaintFragment.initDrawerRight$lambda$38$lambda$37$lambda$36(this.f20918c, iIntValue);
                    }
                });
                FragmentManager childFragmentManager = newPaintFragment.getChildFragmentManager();
                AbstractC9979u.m20293f(childFragmentManager, "getChildFragmentManager(...)");
                baseDialogM5436B.show(childFragmentManager, RequestParameters.SUBRESOURCE_DELETE);
            }
        }
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q initDrawerRight$lambda$38$lambda$37$lambda$36(NewPaintFragment newPaintFragment, int i10) {
        NewNoteViewModel viewModel = newPaintFragment.getViewModel();
        List<NoteListEntity> data = newPaintFragment.getRightNoteListAdapter().getData();
        ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(data, 10));
        Iterator<T> it = data.iterator();
        while (it.hasNext()) {
            arrayList.add(((NoteListEntity) it.next()).getNoteDir());
        }
        viewModel.m7693v(i10, arrayList);
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q initDrawerRight$lambda$41(final NewPaintFragment newPaintFragment, View it) {
        AbstractC9979u.m20294g(it, "it");
        BoardFragment currentNoteFragment = newPaintFragment.getCurrentNoteFragment();
        if (currentNoteFragment != null) {
            newPaintFragment.isShowLoading(true);
            newPaintFragment.save(currentNoteFragment, false, new InterfaceC9540l() { // from class: d4.m0
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return NewPaintFragment.initDrawerRight$lambda$41$lambda$39(this.f20929c, (Throwable) obj);
                }
            }, new InterfaceC9540l() { // from class: d4.n0
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return NewPaintFragment.initDrawerRight$lambda$41$lambda$40(this.f20931c, (String) obj);
                }
            });
        }
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q initDrawerRight$lambda$41$lambda$39(NewPaintFragment newPaintFragment, Throwable it) {
        AbstractC9979u.m20294g(it, "it");
        newPaintFragment.isShowLoading(false);
        ToastUtils.showShort("该页数据异常", new Object[0]);
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q initDrawerRight$lambda$41$lambda$40(NewPaintFragment newPaintFragment, String str) {
        newPaintFragment.isShowLoading(false);
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(newPaintFragment), null, null, new NewPaintFragment$initDrawerRight$6$2$1(newPaintFragment, null), 3, null);
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q initDrawerRight$lambda$45(final NewPaintFragment newPaintFragment, View it) {
        AbstractC9979u.m20294g(it, "it");
        BoardFragment currentNoteFragment = newPaintFragment.getCurrentNoteFragment();
        if (currentNoteFragment != null) {
            newPaintFragment.isShowLoading(true);
            newPaintFragment.save(currentNoteFragment, false, new InterfaceC9540l() { // from class: d4.v
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return NewPaintFragment.initDrawerRight$lambda$45$lambda$42(this.f20946c, (Throwable) obj);
                }
            }, new InterfaceC9540l() { // from class: d4.w
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return NewPaintFragment.initDrawerRight$lambda$45$lambda$44(this.f20948c, (String) obj);
                }
            });
        }
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q initDrawerRight$lambda$45$lambda$42(NewPaintFragment newPaintFragment, Throwable it) {
        AbstractC9979u.m20294g(it, "it");
        newPaintFragment.isShowLoading(false);
        ToastUtils.showShort("该页数据异常", new Object[0]);
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final C10786q initDrawerRight$lambda$45$lambda$44(NewPaintFragment newPaintFragment, String str) {
        newPaintFragment.isShowLoading(false);
        Integer num = (Integer) newPaintFragment.getViewModel().m7660B().getValue();
        if (num != null) {
            newPaintFragment.copyNote(num.intValue() + 1);
        }
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final C10786q initDrawerRight$lambda$47(NewPaintFragment newPaintFragment, View it) {
        AbstractC9979u.m20294g(it, "it");
        Integer num = (Integer) newPaintFragment.getViewModel().m7660B().getValue();
        if (num != null) {
            addNote$default(newPaintFragment, num.intValue() + 1, false, 2, null);
        }
        return C10786q.f26013a;
    }

    private final void initObserver() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9979u.m20293f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C62871(null), 3, null);
        getViewModel().m7662D().observe(getViewLifecycleOwner(), new AbstractC6320i.a(new InterfaceC9540l() { // from class: d4.z
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return NewPaintFragment.initObserver$lambda$12(this.f20953c, (Integer) obj);
            }
        }));
        LiveEventBus.get("updateCurrentThumbnailSuccess", Object.class).observe(getViewLifecycleOwner(), new Observer() { // from class: d4.a0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                NewPaintFragment.initObserver$lambda$14(this.f20893c, obj);
            }
        });
        getViewModel().m7660B().observe(getViewLifecycleOwner(), new AbstractC6320i.a(new InterfaceC9540l() { // from class: d4.b0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return NewPaintFragment.initObserver$lambda$15(this.f20896c, (Integer) obj);
            }
        }));
        getViewModel().m7661C().observe(getViewLifecycleOwner(), new AbstractC6320i.a(new InterfaceC9540l() { // from class: d4.c0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return NewPaintFragment.initObserver$lambda$16(this.f20899c, (Boolean) obj);
            }
        }));
        LiveEventBus.get("addBitmap", Bitmap.class).observe(getViewLifecycleOwner(), new Observer() { // from class: d4.d0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                NewPaintFragment.initObserver$lambda$19(this.f20902c, (Bitmap) obj);
            }
        });
        LiveEventBus.get("ScreenCaptureImage", Pair.class).observe(getViewLifecycleOwner(), new Observer() { // from class: d4.e0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                NewPaintFragment.initObserver$lambda$20(this.f20904c, (Pair) obj);
            }
        });
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        AbstractC9979u.m20293f(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new C62888(null), 3, null);
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C62899(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q initObserver$lambda$12(NewPaintFragment newPaintFragment, Integer num) {
        if (num != null) {
            if (num.intValue() >= 0) {
                ToastUtils.showShort("删除成功", new Object[0]);
                int iIntValue = num.intValue() == newPaintFragment.getRightNoteListAdapter().getItemCount() + (-1) ? num.intValue() - 1 : num.intValue();
                newPaintFragment.getRightNoteListAdapter().removeAt(num.intValue());
                newPaintFragment.getViewModel().m7685b0(iIntValue);
            } else {
                ToastUtils.showShort("删除失败", new Object[0]);
            }
        }
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initObserver$lambda$14(NewPaintFragment newPaintFragment, Object obj) {
        Integer num = (Integer) newPaintFragment.getViewModel().m7660B().getValue();
        if (num != null) {
            newPaintFragment.getRightNoteListAdapter().notifyItemChanged(num.intValue(), PayloadKey.THUMBNAIL);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q initObserver$lambda$15(NewPaintFragment newPaintFragment, Integer num) {
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(newPaintFragment), null, null, new NewPaintFragment$initObserver$4$1(newPaintFragment, num, null), 3, null);
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q initObserver$lambda$16(NewPaintFragment newPaintFragment, Boolean bool) {
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(newPaintFragment), null, null, new NewPaintFragment$initObserver$5$1(bool, newPaintFragment, null), 3, null);
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initObserver$lambda$19(final NewPaintFragment newPaintFragment, Bitmap bitmap) {
        BoardFragment currentNoteFragment = newPaintFragment.getCurrentNoteFragment();
        if (currentNoteFragment != null) {
            BoardFragment.m16761u0(currentNoteFragment, bitmap, null, null, true, new InterfaceC9540l() { // from class: d4.y
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return NewPaintFragment.initObserver$lambda$19$lambda$18(this.f20951c, (String) obj);
                }
            }, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q initObserver$lambda$19$lambda$18(NewPaintFragment newPaintFragment, String str) {
        if (str != null) {
            newPaintFragment.checkImageSafety(str);
            LogUtils.m3888i("[" + newPaintFragment.getViewModel().m7665G() + "] 添加图片:裁剪,路径:" + str);
        }
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initObserver$lambda$20(NewPaintFragment newPaintFragment, Pair pair) {
        if ((pair.m20051f() instanceof String) && (pair.m20052g() instanceof Bitmap)) {
            Object objM20051f = pair.m20051f();
            AbstractC9979u.m20292e(objM20051f, "null cannot be cast to non-null type kotlin.String");
            String str = ((String) objM20051f) + "screenCapture" + UUID.randomUUID();
            Object objM20052g = pair.m20052g();
            AbstractC9979u.m20292e(objM20052g, "null cannot be cast to non-null type android.graphics.Bitmap");
            LifecycleOwner viewLifecycleOwner = newPaintFragment.getViewLifecycleOwner();
            AbstractC9979u.m20293f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new NewPaintFragment$initObserver$7$1(newPaintFragment, (Bitmap) objM20052g, str, null), 3, null);
        }
    }

    private final void initPaint() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9979u.m20293f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C62901(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q onPause$lambda$2$lambda$1(NewPaintFragment newPaintFragment, String str) {
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(newPaintFragment), null, null, new NewPaintFragment$onPause$1$1$1(newPaintFragment, null), 3, null);
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<EzyRouterRecord.RouterRecord.SourceCommandRecord> renameBin(String str, List<EzyRouterRecord.RouterRecord.SourceCommandRecord> list, String str2, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        for (EzyRouterRecord.RouterRecord.SourceCommandRecord sourceCommandRecord : list) {
            String str3 = UUID.randomUUID() + str2;
            EzyRouterRecord.RouterRecord.SourceCommandRecord.C8511b c8511bM15872p = sourceCommandRecord.toBuilder();
            map.put(c8511bM15872p.getFileName(), str3);
            arrayList.add(c8511bM15872p.m15888q(str3).build());
            FileUtils.rename(new File(str, sourceCommandRecord.getFileName()), str3);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NewThumbnailListAdapter rightNoteListAdapter_delegate$lambda$0() {
        return new NewThumbnailListAdapter();
    }

    public static /* synthetic */ void save$default(NewPaintFragment newPaintFragment, BoardFragment boardFragment, boolean z10, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: save");
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            interfaceC9540l = new InterfaceC9540l() { // from class: d4.b
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj2) {
                    return NewPaintFragment.save$lambda$69((Throwable) obj2);
                }
            };
        }
        newPaintFragment.save(boardFragment, z10, interfaceC9540l, interfaceC9540l2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q save$lambda$69(Throwable it) {
        AbstractC9979u.m20294g(it, "it");
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object saveScreenCaptureToPng(Bitmap bitmap, String str, InterfaceC11588c<? super String> interfaceC11588c) {
        return AbstractC11109f.m24709g(C11157r0.m24799b(), new C62932(str, bitmap, this, null), interfaceC11588c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void shareLauncher$lambda$72(NewPaintFragment newPaintFragment, ActivityResult result) throws Throwable {
        BoardFragment currentNoteFragment;
        AbstractC9979u.m20294g(result, "result");
        if (result.getResultCode() == -1) {
            Intent data = result.getData();
            Uri data2 = data != null ? data.getData() : null;
            if (data2 != null) {
                String.valueOf(data2);
                final String strM19816a = AbstractC9805w.m19816a(data2);
                if (strM19816a == null || (currentNoteFragment = newPaintFragment.getCurrentNoteFragment()) == null) {
                    return;
                }
                BoardFragment.m16761u0(currentNoteFragment, null, strM19816a, null, true, new InterfaceC9540l() { // from class: d4.l0
                    @Override // p181hd.InterfaceC9540l
                    public final Object invoke(Object obj) {
                        return NewPaintFragment.shareLauncher$lambda$72$lambda$71$lambda$70(strM19816a, (String) obj);
                    }
                }, 5, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q shareLauncher$lambda$72$lambda$71$lambda$70(String str, String str2) {
        FileUtils.delete(str);
        return C10786q.f26013a;
    }

    private final void startActivityToGallery() {
        Object objM20054c;
        try {
            Result.C9921a c9921a = Result.f23263d;
            ActivityResultLauncher<Intent> activityResultLauncher = this.shareLauncher;
            Intent intent = new Intent();
            intent.setClassName("com.zykj.manage", "com.zykj.gallery.ui.share.ShareActivity");
            activityResultLauncher.launch(intent);
            objM20054c = Result.m20054c(C10786q.f26013a);
        } catch (Throwable th) {
            Result.C9921a c9921a2 = Result.f23263d;
            objM20054c = Result.m20054c(AbstractC9924b.m20070a(th));
        }
        if (Result.m20056e(objM20054c) != null) {
            ToastUtils.showShort("图库打开失败", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void updateCurrentPage(int i10, int i11) {
        ((ResFragmentNewPaintBinding) getMBinding()).f9856u.setText(getResources().getString(R$string.res_page_and_total_replace, Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EzyPageSnapshot.PageSnapshot.GraphSnapshot updateGraphName(EzyPageSnapshot.PageSnapshot.GraphSnapshot graphSnapshot, HashMap<String, String> map) {
        if (graphSnapshot.getChildGraphCount() <= 0) {
            EzyPageSnapshot.PageSnapshot.GraphSnapshot.C8496b builder = graphSnapshot.toBuilder();
            String strM15638A = map.get(builder.m15638A());
            if (strM15638A == null) {
                strM15638A = builder.m15638A();
            }
            builder.m15657T(strM15638A);
            EzyPageSnapshot.PageSnapshot.GraphSnapshot graphSnapshotBuild = builder.build();
            AbstractC9979u.m20291d(graphSnapshotBuild);
            return graphSnapshotBuild;
        }
        EzyPageSnapshot.PageSnapshot.GraphSnapshot.C8496b builder2 = graphSnapshot.toBuilder();
        String strM15638A2 = map.get(builder2.m15638A());
        if (strM15638A2 == null) {
            strM15638A2 = builder2.m15638A();
        }
        builder2.m15657T(strM15638A2);
        List childGraphList = graphSnapshot.getChildGraphList();
        AbstractC9979u.m20293f(childGraphList, "getChildGraphList(...)");
        List<EzyPageSnapshot.PageSnapshot.GraphSnapshot> list = childGraphList;
        ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(list, 10));
        for (EzyPageSnapshot.PageSnapshot.GraphSnapshot graphSnapshot2 : list) {
            AbstractC9979u.m20291d(graphSnapshot2);
            arrayList.add(updateGraphName(graphSnapshot2, map));
        }
        builder2.m15669l();
        builder2.m15660b(arrayList);
        EzyPageSnapshot.PageSnapshot.GraphSnapshot graphSnapshotBuild2 = builder2.build();
        AbstractC9979u.m20291d(graphSnapshotBuild2);
        return graphSnapshotBuild2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateNoteScreenShotByNotePath(String str) {
        Object next;
        if (str == null || AbstractC10793c0.m23132h0(str)) {
            return;
        }
        String strM7668J = getViewModel().m7668J(str);
        Iterator<T> it = getRightNoteListAdapter().getData().iterator();
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
        NoteListEntity noteListEntity = (NoteListEntity) next;
        int iM23949r0 = AbstractC10947g0.m23949r0(getRightNoteListAdapter().getData(), noteListEntity);
        if (noteListEntity != null) {
            noteListEntity.setNoteDir(str);
        }
        if (noteListEntity != null) {
            noteListEntity.setThumbnailFile(strM7668J);
        }
        getRightNoteListAdapter().notifyItemChanged(iM23949r0, PayloadKey.THUMBNAIL);
    }

    private final void updateThumbnailAndDb(String str) {
        if (str != null) {
            String strM7668J = getViewModel().m7668J(str);
            int currentPosition = getCurrentPosition();
            NoteListEntity itemOrNull = getRightNoteListAdapter().getItemOrNull(currentPosition);
            if (itemOrNull != null) {
                itemOrNull.setThumbnailFile(strM7668J);
            }
            getRightNoteListAdapter().notifyItemChanged(currentPosition, PayloadKey.THUMBNAIL);
            getViewModel().m7686c0(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void addNote(final int i10, boolean z10) {
        if (getRightNoteListAdapter().getData().size() >= 99) {
            ToastUtils.showShort("已达页数上限，无法新增笔记页", new Object[0]);
            return;
        }
        String strValueOf = String.valueOf(System.currentTimeMillis());
        String str = getViewModel().m7663E() + strValueOf;
        FileUtils.createOrExistsDir(str);
        getRightNoteListAdapter().addData(i10, (int) new NoteListEntity("", true, z10, str));
        int size = getRightNoteListAdapter().getData().size();
        for (int i11 = i10; i11 < size; i11++) {
            getRightNoteListAdapter().notifyItemChanged(i11);
        }
        ((ResFragmentNewPaintBinding) getMBinding()).f9854s.post(new Runnable() { // from class: d4.i
            @Override // java.lang.Runnable
            public final void run() {
                NewPaintFragment.addNote$lambda$57(this.f20915c, i10);
            }
        });
    }

    public final BoardFragment getCurrentNoteFragment() {
        if (!isAdded()) {
            return null;
        }
        Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag(TAG_NOTE_FRAGMENT);
        if (fragmentFindFragmentByTag instanceof BoardFragment) {
            return (BoardFragment) fragmentFindFragmentByTag;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getCurrentPosition() {
        Integer num = (Integer) getViewModel().m7660B().getValue();
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final InterfaceC9662b getIClassManager() {
        InterfaceC9662b interfaceC9662b = this.iClassManager;
        if (interfaceC9662b != null) {
            return interfaceC9662b;
        }
        AbstractC9979u.m20312y("iClassManager");
        return null;
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public int getLayoutId() {
        return R$layout.res_fragment_new_paint;
    }

    public final NewThumbnailListAdapter getRightNoteListAdapter() {
        return (NewThumbnailListAdapter) this.rightNoteListAdapter$delegate.getValue();
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public void initData() {
        initDrawerRight();
        initPaint();
        initObserver();
        initClick();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        BoardFragment currentNoteFragment;
        super.onPause();
        if (getViewModel().m7664F().getValue() != 0 || (currentNoteFragment = getCurrentNoteFragment()) == null) {
            return;
        }
        save$default(this, currentNoteFragment, false, null, new InterfaceC9540l() { // from class: d4.h
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return NewPaintFragment.onPause$lambda$2$lambda$1(this.f20912c, (String) obj);
            }
        }, 4, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C62911(null), 3, null);
    }

    public final void save(BoardFragment noteFragment, boolean z10, InterfaceC9540l error, InterfaceC9540l callback) {
        AbstractC9979u.m20294g(noteFragment, "noteFragment");
        AbstractC9979u.m20294g(error, "error");
        AbstractC9979u.m20294g(callback, "callback");
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C62922(noteFragment, callback, z10, error, this, null), 3, null);
    }

    public final void setIClassManager(InterfaceC9662b interfaceC9662b) {
        AbstractC9979u.m20294g(interfaceC9662b, "<set-?>");
        this.iClassManager = interfaceC9662b;
    }
}
