package com.zykj.huiwei.launcher.viewmodels;

// RE note 本类字节码直接引用的读写或显示接口包括Protobuf。

import com.google.protobuf.GeneratedMessageLite;
import com.zykj.huiwei.launcher.bean.StudentInfoBean;
import com.zykj.huiwei.launcher.proto.C6069g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m7879d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/proto/g;", "it", "<anonymous>", "(Lcom/zykj/huiwei/launcher/proto/g;)Lcom/zykj/huiwei/launcher/proto/g;"}, m7881k = 3, m7882mv = {2, 2, 0})
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.viewmodels.LoginViewModel$updateUserCache$3", m7918f = "LoginViewModel.kt", m7919i = {}, m7920l = {}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
/* loaded from: classes4.dex */
public final class LoginViewModel$updateUserCache$3 extends SuspendLambda implements Function2<C6069g, Continuation<? super C6069g>, Object> {

    /* renamed from: a */
    public int f7202a;

    /* renamed from: b */
    public /* synthetic */ Object f7203b;

    /* renamed from: c */
    public final /* synthetic */ StudentInfoBean f7204c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginViewModel$updateUserCache$3(StudentInfoBean studentInfoBean, Continuation continuation) {
        super(2, continuation);
        this.f7204c = studentInfoBean;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(C6069g c6069g, Continuation continuation) {
        return ((LoginViewModel$updateUserCache$3) create(c6069g, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LoginViewModel$updateUserCache$3 loginViewModel$updateUserCache$3 = new LoginViewModel$updateUserCache$3(this.f7204c, continuation);
        loginViewModel$updateUserCache$3.f7203b = obj;
        return loginViewModel$updateUserCache$3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C6069g c6069g = (C6069g) this.f7203b;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f7202a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C6069g.b id = ((C6069g.b) c6069g.toBuilder()).setId(this.f7204c.getId());
        String number = this.f7204c.getNumber();
        if (number == null) {
            number = "";
        }
        C6069g.b classId = id.setStudentNumber(number).setClassId(this.f7204c.getClassId());
        String className = this.f7204c.getClassName();
        if (className == null) {
            className = "";
        }
        C6069g.b className2 = classId.setClassName(className);
        String enterSchoolYear = this.f7204c.getEnterSchoolYear();
        if (enterSchoolYear == null) {
            enterSchoolYear = "";
        }
        C6069g.b enterSchoolYear2 = className2.setEnterSchoolYear(enterSchoolYear);
        String gradeName = this.f7204c.getGradeName();
        GeneratedMessageLite generatedMessageLiteBuild = enterSchoolYear2.setGradeName(gradeName != null ? gradeName : "").build();
        Intrinsics.checkNotNullExpressionValue(generatedMessageLiteBuild, "build(...)");
        return generatedMessageLiteBuild;
    }
}
