package com.friday.paint.view;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.alibaba.fastjson.asm.Opcodes;
import com.blankj.utilcode.util.CacheMemoryUtils;
import com.blankj.utilcode.util.ClickUtils;
import com.blankj.utilcode.util.GsonUtils;
import com.blankj.utilcode.util.ImageUtils;
import com.blankj.utilcode.util.NetworkUtils;
import com.blankj.utilcode.util.PathUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.friday.common.classtest.MqttRequestEntity;
import com.friday.common.classtest.MqttResponse;
import com.friday.common.entity.AnswerCache;
import com.friday.common.entity.MqttEntity;
import com.friday.common.entity.MqttType;
import com.friday.common.entity.PayloadKey;
import com.friday.common.helper.C5962b;
import com.friday.paint.databinding.FragmentThePaintBinding;
import com.friday.paint.dialog.HomeworkSubmitConfirmDialog;
import com.friday.paint.dialog.ObjectiveHomeworkSubmitDialog;
import com.friday.paint.dialog.ReceiveClassTestDialog;
import com.friday.paint.model.NoteListEntity;
import com.friday.paint.view.StudentPaintFragment;
import com.friday.paint.viewmodel.DoHomeworkViewModel;
import com.friday.paint.viewmodel.NoteViewModel;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC10045g;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import p141f2.C9166c;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p215k2.AbstractC9796n;
import p215k2.C9799q;
import p309qc.C10786q;
import p309qc.InterfaceC10773d;
import p325rc.AbstractC10978w;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11612u;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import p429z1.AbstractC11958b;
import sd.AbstractC11117h;
import sd.C11157r0;
import sd.InterfaceC11122i0;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class StudentPaintFragment extends Hilt_StudentPaintFragment {

    /* renamed from: r */
    public final InterfaceC10773d f9916r;

    /* renamed from: s */
    public final InterfaceC10773d f9917s;

    /* renamed from: t */
    public long f9918t;

    /* renamed from: u */
    public int f9919u;

    /* renamed from: v */
    public boolean f9920v;

    /* renamed from: w */
    public InterfaceC10045g f9921w;

    @InterfaceC11829d(m26210c = "com.friday.paint.view.StudentPaintFragment$handleHomework$1", m26211f = "StudentPaintFragment.kt", m26212l = {315, 324}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.paint.view.StudentPaintFragment$handleHomework$1 */
    public static final class C62511 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public Object f9930c;

        /* renamed from: d */
        public Object f9931d;

        /* renamed from: e */
        public int f9932e;

        /* renamed from: g */
        public final /* synthetic */ MqttResponse f9934g;

        @InterfaceC11829d(m26210c = "com.friday.paint.view.StudentPaintFragment$handleHomework$1$3", m26211f = "StudentPaintFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
        /* renamed from: com.friday.paint.view.StudentPaintFragment$handleHomework$1$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public int f9935c;

            /* renamed from: d */
            public final /* synthetic */ MqttResponse f9936d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(MqttResponse mqttResponse, InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
                this.f9936d = mqttResponse;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                return new AnonymousClass3(this.f9936d, interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                AbstractC11725a.m25952f();
                if (this.f9935c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                String strM19799a = C9799q.f22994a.m19799a(this.f9936d.getData().getImagePath());
                if (strM19799a != null) {
                    return ImageUtils.getBitmap(strM19799a);
                }
                return null;
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
                return ((AnonymousClass3) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C62511(MqttResponse mqttResponse, InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
            this.f9934g = mqttResponse;
        }

        /* renamed from: m */
        public static final C10786q m7381m(MqttResponse mqttResponse, StudentPaintFragment studentPaintFragment, Ref$ObjectRef ref$ObjectRef) {
            if (mqttResponse.getData().getQstType() != 0) {
                MqttResponse.QuestionInfo questionInfo = mqttResponse.getData().getQuestionInfo();
                if ((questionInfo != null ? Integer.valueOf(questionInfo.getQstCount()) : null) != null) {
                    MqttResponse.QuestionInfo questionInfo2 = mqttResponse.getData().getQuestionInfo();
                    if ((questionInfo2 != null ? Integer.valueOf(questionInfo2.getOptions()) : null) != null) {
                        DoHomeworkViewModel viewModel = studentPaintFragment.getViewModel();
                        MqttResponse.QuestionInfo questionInfo3 = mqttResponse.getData().getQuestionInfo();
                        Integer numValueOf = questionInfo3 != null ? Integer.valueOf(questionInfo3.getOptions()) : null;
                        AbstractC9979u.m20291d(numValueOf);
                        viewModel.m7641x(numValueOf.intValue());
                        DoHomeworkViewModel viewModel2 = studentPaintFragment.getViewModel();
                        MqttResponse.QuestionInfo questionInfo4 = mqttResponse.getData().getQuestionInfo();
                        Integer numValueOf2 = questionInfo4 != null ? Integer.valueOf(questionInfo4.getQstCount()) : null;
                        AbstractC9979u.m20291d(numValueOf2);
                        viewModel2.m7642y(numValueOf2.intValue());
                        studentPaintFragment.getViewModel().m7643z(mqttResponse.getData().getQstType() == 1);
                        studentPaintFragment.getViewModel().m7639v(false);
                        studentPaintFragment.getViewModel().m7627j().setValue(Boolean.valueOf(!mqttResponse.getData().getCanSubmit()));
                        studentPaintFragment.getViewModel().m7638u(true);
                        studentPaintFragment.getViewModel().m7637t(false);
                        try {
                            Fragment fragmentFindFragmentByTag = studentPaintFragment.getChildFragmentManager().findFragmentByTag(ObjectiveHomeworkSubmitDialog.class.getSimpleName());
                            AbstractC9979u.m20292e(fragmentFindFragmentByTag, "null cannot be cast to non-null type com.friday.paint.dialog.ObjectiveHomeworkSubmitDialog");
                            ((ObjectiveHomeworkSubmitDialog) fragmentFindFragmentByTag).dismissAllowingStateLoss();
                        } catch (Exception unused) {
                        }
                        ObjectiveHomeworkSubmitDialog objectiveHomeworkSubmitDialog = new ObjectiveHomeworkSubmitDialog();
                        FragmentManager childFragmentManager = studentPaintFragment.getChildFragmentManager();
                        AbstractC9979u.m20293f(childFragmentManager, "getChildFragmentManager(...)");
                        objectiveHomeworkSubmitDialog.show(childFragmentManager, ObjectiveHomeworkSubmitDialog.class.getSimpleName());
                        StudentPaintFragment.m7371r1(studentPaintFragment).f9782f.setVisibility(0);
                        StudentPaintFragment.m7371r1(studentPaintFragment).f9799w.setVisibility(8);
                    }
                }
            } else {
                StudentPaintFragment.m7371r1(studentPaintFragment).f9799w.setVisibility(0);
                StudentPaintFragment.m7371r1(studentPaintFragment).f9799w.setEnabled(true);
                StudentPaintFragment.m7371r1(studentPaintFragment).f9782f.setVisibility(8);
            }
            Bitmap bitmap = (Bitmap) ref$ObjectRef.f23402c;
            if (bitmap != null) {
                LiveEventBus.get("addBitmap").postDelay(bitmap, 200L);
            }
            return C10786q.f26013a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return StudentPaintFragment.this.new C62511(this.f9934g, interfaceC11588c);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(14:0|2|(1:(1:(11:6|33|34|(2:36|(3:38|(2:39|(2:41|(1:90)(1:44))(2:89|45))|(1:47)(1:48))(1:49))|50|87|51|52|(1:54)(2:55|(3:57|(1:59)(1:60)|(3:62|(1:64)(1:65)|(10:67|(1:69)(1:70)|71|(1:73)|74|(1:76)(1:77)|78|85|79|80))))|81|82)(2:7|8))(1:9))(3:10|(1:(2:12|(1:92)(1:93))(2:91|15))|(2:17|18)(3:19|(0)|31))|22|(4:24|(1:26)|27|(3:29|(2:32|33)|31))|34|(0)|50|87|51|52|(0)(0)|81|82) */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00eb  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0173  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0193  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 688
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.friday.paint.view.StudentPaintFragment.C62511.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes4/com/friday/paint/view/StudentPaintFragment$handleHomework$1.smali:762
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C62511) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.paint.view.StudentPaintFragment$initData$2", m26211f = "StudentPaintFragment.kt", m26212l = {93, 98}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.paint.view.StudentPaintFragment$initData$2 */
    public static final class C62522 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f9937c;

        public C62522(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return StudentPaintFragment.this.new C62522(interfaceC11588c);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
        
            if (r7 == r0) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                int r1 = r6.f9937c
                r2 = 1047904911(0x3e75c28f, float:0.24)
                r3 = 0
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L22
                if (r1 == r5) goto L1e
                if (r1 != r4) goto L16
                kotlin.AbstractC9924b.m20071b(r7)
                goto L61
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                kotlin.AbstractC9924b.m20071b(r7)
                goto L34
            L22:
                kotlin.AbstractC9924b.m20071b(r7)
                com.friday.paint.view.StudentPaintFragment r7 = com.friday.paint.view.StudentPaintFragment.this
                com.friday.paint.viewmodel.NoteViewModel r7 = com.friday.paint.view.StudentPaintFragment.m7374u1(r7)
                r6.f9937c = r5
                java.lang.Object r7 = r7.m7741v(r6)
                if (r7 != r0) goto L34
                goto L60
            L34:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 != 0) goto L52
                com.friday.paint.view.StudentPaintFragment r7 = com.friday.paint.view.StudentPaintFragment.this
                com.friday.paint.databinding.FragmentThePaintBinding r7 = com.friday.paint.view.StudentPaintFragment.m7371r1(r7)
                android.widget.ImageView r7 = r7.f9785i
                r7.setEnabled(r3)
                com.friday.paint.view.StudentPaintFragment r7 = com.friday.paint.view.StudentPaintFragment.this
                com.friday.paint.databinding.FragmentThePaintBinding r7 = com.friday.paint.view.StudentPaintFragment.m7371r1(r7)
                android.widget.ImageView r7 = r7.f9785i
                r7.setAlpha(r2)
            L52:
                com.friday.paint.view.StudentPaintFragment r7 = com.friday.paint.view.StudentPaintFragment.this
                com.friday.paint.viewmodel.NoteViewModel r7 = com.friday.paint.view.StudentPaintFragment.m7374u1(r7)
                r6.f9937c = r4
                java.lang.Object r7 = r7.m7739t(r6)
                if (r7 != r0) goto L61
            L60:
                return r0
            L61:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 != 0) goto L7f
                com.friday.paint.view.StudentPaintFragment r7 = com.friday.paint.view.StudentPaintFragment.this
                com.friday.paint.databinding.FragmentThePaintBinding r7 = com.friday.paint.view.StudentPaintFragment.m7371r1(r7)
                android.widget.ImageView r7 = r7.f9792p
                r7.setEnabled(r3)
                com.friday.paint.view.StudentPaintFragment r7 = com.friday.paint.view.StudentPaintFragment.this
                com.friday.paint.databinding.FragmentThePaintBinding r7 = com.friday.paint.view.StudentPaintFragment.m7371r1(r7)
                android.widget.ImageView r7 = r7.f9792p
                r7.setAlpha(r2)
            L7f:
                qc.q r7 = p309qc.C10786q.f26013a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.friday.paint.view.StudentPaintFragment.C62522.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes4/com/friday/paint/view/StudentPaintFragment$initData$2.smali:119
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C62522) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.paint.view.StudentPaintFragment$initData$5", m26211f = "StudentPaintFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.paint.view.StudentPaintFragment$initData$5 */
    public static final class C62535 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f9939c;

        public C62535(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return StudentPaintFragment.this.new C62535(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.f9939c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            AnswerCache answerCache = (AnswerCache) CacheMemoryUtils.getInstance().get("answer_cache");
            if (answerCache != null) {
                StudentPaintFragment studentPaintFragment = StudentPaintFragment.this;
                if (!answerCache.isSubjective()) {
                    studentPaintFragment.getViewModel().m7627j().setValue(answerCache.getHasStopped());
                    studentPaintFragment.getViewModel().m7642y(answerCache.getQstCount());
                    studentPaintFragment.getViewModel().m7636s(answerCache.getDataList());
                    studentPaintFragment.getViewModel().m7638u(answerCache.getFromServer());
                    studentPaintFragment.getViewModel().m7639v(answerCache.getHasSubmit());
                    studentPaintFragment.getViewModel().m7643z(answerCache.isSingle());
                    studentPaintFragment.getViewModel().m7641x(answerCache.getOptions());
                    if (studentPaintFragment.getViewModel().m7628k()) {
                        StudentPaintFragment.m7371r1(studentPaintFragment).f9782f.setVisibility(0);
                        studentPaintFragment.m7472u0().notifyDataSetChanged();
                    }
                }
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C62535) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.paint.view.StudentPaintFragment$initData$9", m26211f = "StudentPaintFragment.kt", m26212l = {Opcodes.INVOKESTATIC}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.paint.view.StudentPaintFragment$initData$9 */
    public static final class C62549 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f9941c;

        @InterfaceC11829d(m26210c = "com.friday.paint.view.StudentPaintFragment$initData$9$1", m26211f = "StudentPaintFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
        /* renamed from: com.friday.paint.view.StudentPaintFragment$initData$9$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public int f9943c;

            /* renamed from: d */
            public /* synthetic */ Object f9944d;

            /* renamed from: e */
            public final /* synthetic */ StudentPaintFragment f9945e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(StudentPaintFragment studentPaintFragment, InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
                this.f9945e = studentPaintFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f9945e, interfaceC11588c);
                anonymousClass1.f9944d = obj;
                return anonymousClass1;
            }

            @Override // p181hd.InterfaceC9544p
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(MqttResponse mqttResponse, InterfaceC11588c interfaceC11588c) {
                return ((AnonymousClass1) create(mqttResponse, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                MqttResponse mqttResponse = (MqttResponse) this.f9944d;
                AbstractC11725a.m25952f();
                if (this.f9943c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                if (mqttResponse != null) {
                    this.f9945e.handleHomework(mqttResponse);
                }
                return C10786q.f26013a;
            }
        }

        public C62549(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return StudentPaintFragment.this.new C62549(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f9941c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC11612u interfaceC11612uM7630m = StudentPaintFragment.this.getViewModel().m7630m();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(StudentPaintFragment.this, null);
                this.f9941c = 1;
                if (AbstractC11596e.m25559i(interfaceC11612uM7630m, anonymousClass1, this) == objM25952f) {
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
            return ((C62549) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.paint.view.StudentPaintFragment$onResume$1", m26211f = "StudentPaintFragment.kt", m26212l = {517}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.paint.view.StudentPaintFragment$onResume$1 */
    public static final class C62561 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public Object f9957c;

        /* renamed from: d */
        public int f9958d;

        public C62561(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return StudentPaintFragment.this.new C62561(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            StudentPaintFragment studentPaintFragment;
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f9958d;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                StudentPaintFragment studentPaintFragment2 = StudentPaintFragment.this;
                NoteViewModel noteViewModelM7379y1 = studentPaintFragment2.m7379y1();
                this.f9957c = studentPaintFragment2;
                this.f9958d = 1;
                Object objM7720J = noteViewModelM7379y1.m7720J(this);
                if (objM7720J == objM25952f) {
                    return objM25952f;
                }
                studentPaintFragment = studentPaintFragment2;
                obj = objM7720J;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                studentPaintFragment = (StudentPaintFragment) this.f9957c;
                AbstractC9924b.m20071b(obj);
            }
            studentPaintFragment.f9920v = ((Boolean) obj).booleanValue();
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C62561) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.paint.view.StudentPaintFragment$startBtEnableStatusJob$1", m26211f = "StudentPaintFragment.kt", m26212l = {ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.paint.view.StudentPaintFragment$startBtEnableStatusJob$1 */
    public static final class C62571 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f9960c;

        public C62571(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return StudentPaintFragment.this.new C62571(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f9960c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                StudentPaintFragment.m7371r1(StudentPaintFragment.this).f9799w.setEnabled(false);
                this.f9960c = 1;
                if (DelayKt.m20376b(CoroutineLiveDataKt.DEFAULT_TIMEOUT, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            StudentPaintFragment.m7371r1(StudentPaintFragment.this).f9799w.setEnabled(true);
            ToastUtils.showShort("随堂测数据连接异常，暂时无法提交", new Object[0]);
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C62571) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public StudentPaintFragment() {
        final InterfaceC9529a interfaceC9529a = null;
        this.f9916r = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9983y.m20315b(DoHomeworkViewModel.class), new InterfaceC9529a() { // from class: com.friday.paint.view.StudentPaintFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new InterfaceC9529a() { // from class: com.friday.paint.view.StudentPaintFragment$special$$inlined$activityViewModels$default$2
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
        }, new InterfaceC9529a() { // from class: com.friday.paint.view.StudentPaintFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
        this.f9917s = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9983y.m20315b(NoteViewModel.class), new InterfaceC9529a() { // from class: com.friday.paint.view.StudentPaintFragment$special$$inlined$activityViewModels$default$4
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new InterfaceC9529a() { // from class: com.friday.paint.view.StudentPaintFragment$special$$inlined$activityViewModels$default$5
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
        }, new InterfaceC9529a() { // from class: com.friday.paint.view.StudentPaintFragment$special$$inlined$activityViewModels$default$6
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
    }

    /* renamed from: A1 */
    public static final C10786q m7344A1(StudentPaintFragment studentPaintFragment, HomeworkSubmitConfirmDialog homeworkSubmitConfirmDialog) {
        studentPaintFragment.submitSubjectiveHomework();
        homeworkSubmitConfirmDialog.dismissAllowingStateLoss();
        return C10786q.f26013a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: B1 */
    public static final void m7345B1(StudentPaintFragment studentPaintFragment, String str) {
        if (AbstractC9979u.m20289b(str, "TIME_UP")) {
            ((FragmentThePaintBinding) studentPaintFragment.getMBinding()).f9799w.setVisibility(8);
            studentPaintFragment.getViewModel().m7627j().setValue(Boolean.TRUE);
        } else if (AbstractC9979u.m20289b(str, "END_CLASS")) {
            CacheMemoryUtils.getInstance().remove("answer_cache");
            ((FragmentThePaintBinding) studentPaintFragment.getMBinding()).f9799w.setVisibility(8);
            ((FragmentThePaintBinding) studentPaintFragment.getMBinding()).f9782f.setVisibility(8);
            studentPaintFragment.getViewModel().m7637t(true);
            try {
                Fragment fragmentFindFragmentByTag = studentPaintFragment.getChildFragmentManager().findFragmentByTag(ObjectiveHomeworkSubmitDialog.class.getSimpleName());
                AbstractC9979u.m20292e(fragmentFindFragmentByTag, "null cannot be cast to non-null type com.friday.paint.dialog.ObjectiveHomeworkSubmitDialog");
                ((ObjectiveHomeworkSubmitDialog) fragmentFindFragmentByTag).dismissAllowingStateLoss();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: C1 */
    public static final void m7346C1(StudentPaintFragment studentPaintFragment, String str) {
        InterfaceC10045g interfaceC10045g = studentPaintFragment.f9921w;
        if (interfaceC10045g != null) {
            InterfaceC10045g.a.m20900a(interfaceC10045g, null, 1, null);
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -1986416409:
                    if (str.equals("NORMAL")) {
                        studentPaintFragment.getViewModel().m7639v(true);
                        AbstractC11958b.m26588i("提交答案成功");
                        ((FragmentThePaintBinding) studentPaintFragment.getMBinding()).f9799w.setEnabled(true);
                        ((FragmentThePaintBinding) studentPaintFragment.getMBinding()).f9799w.setVisibility(8);
                        break;
                    }
                    break;
                case -595913395:
                    if (str.equals("TIME_UP")) {
                        ((FragmentThePaintBinding) studentPaintFragment.getMBinding()).f9799w.setVisibility(8);
                        studentPaintFragment.getViewModel().m7627j().setValue(Boolean.TRUE);
                        AbstractC11958b.m26588i("答题已截止");
                        break;
                    }
                    break;
                case 1344628948:
                    if (str.equals("END_CLASS")) {
                        CacheMemoryUtils.getInstance().remove("answer_cache");
                        ((FragmentThePaintBinding) studentPaintFragment.getMBinding()).f9799w.setVisibility(8);
                        ((FragmentThePaintBinding) studentPaintFragment.getMBinding()).f9782f.setVisibility(8);
                        studentPaintFragment.getViewModel().m7637t(true);
                        try {
                            Fragment fragmentFindFragmentByTag = studentPaintFragment.getChildFragmentManager().findFragmentByTag(ObjectiveHomeworkSubmitDialog.class.getSimpleName());
                            AbstractC9979u.m20292e(fragmentFindFragmentByTag, "null cannot be cast to non-null type com.friday.paint.dialog.ObjectiveHomeworkSubmitDialog");
                            ((ObjectiveHomeworkSubmitDialog) fragmentFindFragmentByTag).dismissAllowingStateLoss();
                        } catch (Exception unused) {
                        }
                        AbstractC11958b.m26588i("随堂测已结束");
                        break;
                    }
                    break;
                case 1382860228:
                    if (str.equals("ID_ERROR")) {
                        ((FragmentThePaintBinding) studentPaintFragment.getMBinding()).f9799w.setVisibility(8);
                        AbstractC11958b.m26588i("题目不一致，请重新接收随堂测答题");
                        break;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: D1 */
    public static final void m7347D1(StudentPaintFragment studentPaintFragment, String str) {
        studentPaintFragment.getViewModel().m7625h().add(str);
        CacheMemoryUtils.getInstance().remove("answer_cache");
        AbstractC11958b.m26588i("随堂测已结束");
        studentPaintFragment.getViewModel().m7640w(null);
        studentPaintFragment.getViewModel().m7637t(true);
        ((FragmentThePaintBinding) studentPaintFragment.getMBinding()).f9799w.setVisibility(8);
        ((FragmentThePaintBinding) studentPaintFragment.getMBinding()).f9782f.setVisibility(8);
        try {
            Fragment fragmentFindFragmentByTag = studentPaintFragment.getChildFragmentManager().findFragmentByTag(ObjectiveHomeworkSubmitDialog.class.getSimpleName());
            AbstractC9979u.m20292e(fragmentFindFragmentByTag, "null cannot be cast to non-null type com.friday.paint.dialog.ObjectiveHomeworkSubmitDialog");
            ((ObjectiveHomeworkSubmitDialog) fragmentFindFragmentByTag).dismissAllowingStateLoss();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        try {
            Fragment fragmentFindFragmentByTag2 = studentPaintFragment.getChildFragmentManager().findFragmentByTag(ReceiveClassTestDialog.class.getSimpleName());
            AbstractC9979u.m20292e(fragmentFindFragmentByTag2, "null cannot be cast to non-null type com.friday.paint.dialog.ReceiveClassTestDialog");
            ((ReceiveClassTestDialog) fragmentFindFragmentByTag2).dismissAllowingStateLoss();
        } catch (Exception unused) {
        }
        int i10 = 0;
        for (Object obj : studentPaintFragment.m7472u0().getData()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC10978w.m24145w();
            }
            ((NoteListEntity) obj).setInClass(false);
            studentPaintFragment.m7472u0().notifyItemChanged(i10, PayloadKey.IN_CLASS);
            i10 = i11;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: E1 */
    public static final void m7348E1(StudentPaintFragment studentPaintFragment, Object obj) {
        ((FragmentThePaintBinding) studentPaintFragment.getMBinding()).f9799w.setVisibility(8);
        studentPaintFragment.getViewModel().m7627j().setValue(Boolean.TRUE);
        AbstractC11958b.m26588i("答题已截止");
    }

    /* renamed from: F1 */
    public static final void m7349F1(StudentPaintFragment studentPaintFragment, View view) {
        if (studentPaintFragment.getChildFragmentManager().findFragmentByTag(ObjectiveHomeworkSubmitDialog.class.getSimpleName()) != null) {
            return;
        }
        ObjectiveHomeworkSubmitDialog objectiveHomeworkSubmitDialog = new ObjectiveHomeworkSubmitDialog();
        FragmentManager childFragmentManager = studentPaintFragment.getChildFragmentManager();
        AbstractC9979u.m20293f(childFragmentManager, "getChildFragmentManager(...)");
        objectiveHomeworkSubmitDialog.show(childFragmentManager, ObjectiveHomeworkSubmitDialog.class.getSimpleName());
    }

    /* renamed from: G1 */
    public static final void m7350G1(StudentPaintFragment studentPaintFragment, View view) {
        if (!C9166c.f21406a.m18061e()) {
            AbstractC11958b.m26588i("网络未连接");
            return;
        }
        if (!studentPaintFragment.f9920v) {
            AbstractC11958b.m26588i("您的截图权限已关闭，请联系学校工作人员进行开启");
            return;
        }
        if (System.currentTimeMillis() - studentPaintFragment.f9918t < 3000) {
            AbstractC11958b.m26588i("截图过于频繁");
            return;
        }
        studentPaintFragment.f9918t = System.currentTimeMillis();
        AbstractC11958b.m26588i("正在截图");
        Observable observable = LiveEventBus.get(MqttEntity.class);
        MqttType mqttType = MqttType.NONE;
        String json = GsonUtils.toJson(new MqttRequestEntity(IMediaPlayer.MEDIA_INFO_OPEN_INPUT, null, 2, null));
        AbstractC9979u.m20293f(json, "toJson(...)");
        observable.post(new MqttEntity(mqttType, json, "board"));
    }

    /* renamed from: H1 */
    public static final void m7351H1(StudentPaintFragment studentPaintFragment, String str) {
        AbstractC9979u.m20291d(str);
        studentPaintFragment.saveScreenShoot(str, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: I1 */
    public static final void m7352I1(StudentPaintFragment studentPaintFragment, Boolean bool) {
        ImageView ivScreenShoot = ((FragmentThePaintBinding) studentPaintFragment.getMBinding()).f9797u;
        AbstractC9979u.m20293f(ivScreenShoot, "ivScreenShoot");
        AbstractC9979u.m20291d(bool);
        ivScreenShoot.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    /* renamed from: J1 */
    public static final void m7353J1(StudentPaintFragment studentPaintFragment, String str) {
        AnswerCache answerCache = (AnswerCache) CacheMemoryUtils.getInstance().get("answer_cache");
        MqttResponse mqttResponse = (MqttResponse) GsonUtils.fromJson(str, MqttResponse.class);
        if (answerCache == null || !AbstractC9979u.m20289b(mqttResponse.getGuid(), answerCache.getGuid())) {
            studentPaintFragment.getViewModel().m7622A(mqttResponse);
        }
    }

    /* renamed from: K1 */
    public static final void m7354K1(final StudentPaintFragment studentPaintFragment, Object obj) {
        FragmentActivity activity = studentPaintFragment.getActivity();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: c4.f
                @Override // java.lang.Runnable
                public final void run() {
                    StudentPaintFragment.m7355L1(this.f3384c);
                }
            });
        }
    }

    /* renamed from: L1 */
    public static final void m7355L1(StudentPaintFragment studentPaintFragment) {
        int i10 = 0;
        for (Object obj : studentPaintFragment.m7472u0().getData()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC10978w.m24145w();
            }
            NoteListEntity noteListEntity = (NoteListEntity) obj;
            if (noteListEntity.getInClass()) {
                noteListEntity.setInClass(false);
                studentPaintFragment.m7472u0().notifyItemChanged(i10, PayloadKey.IN_CLASS);
            }
            i10 = i11;
        }
    }

    /* renamed from: M1 */
    public static final void m7356M1(StudentPaintFragment studentPaintFragment, Object obj) {
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(studentPaintFragment), C11157r0.m24799b(), null, new StudentPaintFragment$initObserver$1$1(studentPaintFragment, null), 2, null);
    }

    private final void initObserver() {
        LiveEventBus.get("submitHomework").observe(getViewLifecycleOwner(), new Observer() { // from class: c4.e
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                StudentPaintFragment.m7356M1(this.f3381c, obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: r1 */
    public static final /* synthetic */ FragmentThePaintBinding m7371r1(StudentPaintFragment studentPaintFragment) {
        return (FragmentThePaintBinding) studentPaintFragment.getMBinding();
    }

    /* renamed from: z1 */
    public static final void m7378z1(final StudentPaintFragment studentPaintFragment, View view) {
        final HomeworkSubmitConfirmDialog homeworkSubmitConfirmDialog = new HomeworkSubmitConfirmDialog();
        homeworkSubmitConfirmDialog.m7313s(new InterfaceC9529a() { // from class: c4.g
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return StudentPaintFragment.m7344A1(this.f3386c, homeworkSubmitConfirmDialog);
            }
        });
        homeworkSubmitConfirmDialog.show(studentPaintFragment.getChildFragmentManager(), HomeworkSubmitConfirmDialog.class.getSimpleName());
    }

    public final Bitmap base64ToBitmap(String str) {
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            AbstractC9979u.m20293f(bArrDecode, "decode(...)");
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public final DoHomeworkViewModel getViewModel() {
        return (DoHomeworkViewModel) this.f9916r.getValue();
    }

    public final void handleHomework(MqttResponse mqttResponse) {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new C62511(mqttResponse, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.friday.paint.view.ThePaintFragment, com.friday.common.base.InterfaceC5929c
    public void initData() {
        super.initData();
        initObserver();
        ((FragmentThePaintBinding) getMBinding()).f9802z.setVisibility(0);
        ClickUtils.applyGlobalDebouncing(((FragmentThePaintBinding) getMBinding()).f9799w, new View.OnClickListener() { // from class: c4.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StudentPaintFragment.m7378z1(this.f3377c, view);
            }
        });
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C62522(null), 3, null);
        ImageView ivScreenShoot = ((FragmentThePaintBinding) getMBinding()).f9797u;
        AbstractC9979u.m20293f(ivScreenShoot, "ivScreenShoot");
        ivScreenShoot.setVisibility(getIClassManager().mo99g() ? 0 : 8);
        ClickUtils.applyGlobalDebouncing(((FragmentThePaintBinding) getMBinding()).f9782f, new View.OnClickListener() { // from class: c4.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StudentPaintFragment.m7349F1(this.f3392c, view);
            }
        });
        ClickUtils.applyGlobalDebouncing(((FragmentThePaintBinding) getMBinding()).f9797u, new View.OnClickListener() { // from class: c4.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StudentPaintFragment.m7350G1(this.f3394c, view);
            }
        });
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C62535(null), 3, null);
        LiveEventBus.get("LiveSnapshot", String.class).observe(this, new Observer() { // from class: c4.k
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                StudentPaintFragment.m7351H1(this.f3397c, (String) obj);
            }
        });
        LiveEventBus.get("mqttServiceStatus", Boolean.TYPE).observe(getViewLifecycleOwner(), new Observer() { // from class: c4.l
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                StudentPaintFragment.m7352I1(this.f3399c, (Boolean) obj);
            }
        });
        LiveEventBus.get("receiveHomework", String.class).observe(this, new Observer() { // from class: c4.m
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                StudentPaintFragment.m7353J1(this.f3402c, (String) obj);
            }
        });
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new C62549(null));
        LiveEventBus.get("submitHomeworkOver").observe(this, new Observer() { // from class: c4.n
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                StudentPaintFragment.m7354K1(this.f3404c, obj);
            }
        });
        LiveEventBus.get("requestHomeworkStatusReply", String.class).observe(this, new Observer() { // from class: c4.o
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                StudentPaintFragment.m7345B1(this.f3407c, (String) obj);
            }
        });
        LiveEventBus.get("submitHomeworkReply", String.class).observe(this, new Observer() { // from class: c4.p
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                StudentPaintFragment.m7346C1(this.f3410c, (String) obj);
            }
        });
        LiveEventBus.get("homeworkEndClass", String.class).observe(this, new Observer() { // from class: c4.d
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                StudentPaintFragment.m7347D1(this.f3379c, (String) obj);
            }
        });
        LiveEventBus.get("homeworkTimeUp").observe(this, new Observer() { // from class: c4.h
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                StudentPaintFragment.m7348E1(this.f3390c, obj);
            }
        });
        LiveEventBus.get(MqttEntity.class).post(new MqttEntity(MqttType.REQUEST_HOMEWORK_STATUS, String.valueOf(C5962b.f6082a.m5299a().m5292t()), null, 4, null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C62561(null), 3, null);
    }

    public final void saveScreenShoot(String str, boolean z10) {
        String str2;
        if (z10) {
            String str3 = PathUtils.getExternalAppCachePath() + MqttTopic.TOPIC_LEVEL_SEPARATOR + System.currentTimeMillis() + ".webp";
            ImageUtils.save(base64ToBitmap(str), str3, Bitmap.CompressFormat.WEBP, 70);
            str2 = str3;
        } else {
            str2 = str;
        }
        AbstractC9796n.a.m19788b(AbstractC9796n.f22990a, str2, null, 0, 6, null);
    }

    public final void startBtEnableStatusJob() {
        InterfaceC10045g interfaceC10045g = this.f9921w;
        if (interfaceC10045g != null) {
            InterfaceC10045g.a.m20900a(interfaceC10045g, null, 1, null);
        }
        this.f9921w = AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C62571(null), 3, null);
    }

    public final void submitSubjectiveHomework() {
        if (!NetworkUtils.isWifiConnected()) {
            AbstractC11958b.m26588i("网络异常，提交失败，请重试。");
            return;
        }
        isShowLoading(true);
        LiveEventBus.get("updateThumbnailForHomework").post(null);
        startBtEnableStatusJob();
    }

    /* renamed from: y1 */
    public final NoteViewModel m7379y1() {
        return (NoteViewModel) this.f9917s.getValue();
    }
}
