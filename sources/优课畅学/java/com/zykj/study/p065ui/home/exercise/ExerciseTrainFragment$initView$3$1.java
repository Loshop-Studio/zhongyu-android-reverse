package com.zykj.study.p065ui.home.exercise;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore、WebView。

import androidx.lifecycle.MutableLiveData;
import com.zykj.lib.login.proto.UserBean;
import com.zykj.study.bean.exercise.QuestionBean;
import com.zykj.study.databinding.FragmentExerciseTrainBinding;
import com.zykj.study.viewmodels.ExerciseTrainViewModel;
import java.io.File;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.exercise.ExerciseTrainFragment$initView$3$1", m17801f = "ExerciseTrainFragment.kt", m17802l = {126, 133}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ExerciseTrainFragment$initView$3$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public Object f11898a;

    /* renamed from: b */
    public Object f11899b;

    /* renamed from: c */
    public Object f11900c;

    /* renamed from: d */
    public Object f11901d;

    /* renamed from: e */
    public int f11902e;

    /* renamed from: f */
    public final /* synthetic */ ExerciseTrainFragment f11903f;

    /* renamed from: g */
    public final /* synthetic */ QuestionBean f11904g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExerciseTrainFragment$initView$3$1(ExerciseTrainFragment exerciseTrainFragment, QuestionBean questionBean, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f11903f = exerciseTrainFragment;
        this.f11904g = questionBean;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new ExerciseTrainFragment$initView$3$1(this.f11903f, this.f11904g, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((ExerciseTrainFragment$initView$3$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ExerciseTrainViewModel exerciseTrainViewModelM10644z;
        File externalCacheDir;
        String str;
        String str2;
        String id;
        MutableLiveData mutableLiveDataM12147A;
        String str3;
        File file;
        String str4;
        UserBean userBean;
        String id2;
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f11902e;
        String str5 = "";
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            ((FragmentExerciseTrainBinding) this.f11903f.getMBindView()).exerciseSubject.webView.loadData(this.f11904g.fetchAdaptContent(), "text/html; charset=UTF-8", null);
            ((FragmentExerciseTrainBinding) this.f11903f.getMBindView()).exerciseSubject.webViewAnalysis.loadData(this.f11904g.fetchAdaptAnalysis(), "text/html; charset=UTF-8", null);
            ((FragmentExerciseTrainBinding) this.f11903f.getMBindView()).exerciseSubject.webViewCorrectAnswer.loadData(this.f11904g.getAdaptStandardAnswerStr(), "text/html; charset=UTF-8", null);
            exerciseTrainViewModelM10644z = this.f11903f.m10644z();
            externalCacheDir = this.f11903f.requireContext().getExternalCacheDir();
            str = File.separator;
            InterfaceC9266c data = this.f11903f.m10607A().m9295c().getData();
            this.f11898a = exerciseTrainViewModelM10644z;
            this.f11899b = externalCacheDir;
            this.f11900c = str;
            this.f11901d = str;
            this.f11902e = 1;
            obj = AbstractC9268e.m17036z(data, this);
            if (obj != objM17291f) {
                str2 = str;
            }
            return objM17291f;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str4 = (String) this.f11901d;
            str3 = (String) this.f11900c;
            file = (File) this.f11899b;
            mutableLiveDataM12147A = (MutableLiveData) this.f11898a;
            AbstractC9079b.m15926b(obj);
            userBean = (UserBean) obj;
            if (userBean != null && (id2 = userBean.getId()) != null) {
                str5 = id2;
            }
            mutableLiveDataM12147A.setValue(new File(file + str3 + "thumbnail_dir" + str4 + str5 + File.separator + this.f11904g.getId(), this.f11904g.getId() + ".png").getAbsolutePath());
            return C8736p.f16368a;
        }
        str = (String) this.f11901d;
        str2 = (String) this.f11900c;
        externalCacheDir = (File) this.f11899b;
        exerciseTrainViewModelM10644z = (ExerciseTrainViewModel) this.f11898a;
        AbstractC9079b.m15926b(obj);
        UserBean userBean2 = (UserBean) obj;
        if (userBean2 == null || (id = userBean2.getId()) == null) {
            id = "";
        }
        String absolutePath = new File(externalCacheDir + str2 + "thumbnail_dir" + str + id, this.f11904g.getId()).getAbsolutePath();
        AbstractC9133u.m16132f(absolutePath, "getAbsolutePath(...)");
        exerciseTrainViewModelM10644z.m12154H(absolutePath);
        mutableLiveDataM12147A = this.f11903f.m10644z().m12147A();
        File externalCacheDir2 = this.f11903f.requireContext().getExternalCacheDir();
        str3 = File.separator;
        InterfaceC9266c data2 = this.f11903f.m10607A().m9295c().getData();
        this.f11898a = mutableLiveDataM12147A;
        this.f11899b = externalCacheDir2;
        this.f11900c = str3;
        this.f11901d = str3;
        this.f11902e = 2;
        Object objM17036z = AbstractC9268e.m17036z(data2, this);
        if (objM17036z != objM17291f) {
            file = externalCacheDir2;
            obj = objM17036z;
            str4 = str3;
            userBean = (UserBean) obj;
            if (userBean != null) {
                str5 = id2;
            }
            mutableLiveDataM12147A.setValue(new File(file + str3 + "thumbnail_dir" + str4 + str5 + File.separator + this.f11904g.getId(), this.f11904g.getId() + ".png").getAbsolutePath());
            return C8736p.f16368a;
        }
        return objM17291f;
    }
}
