package com.zykj.huiwei.launcher.viewmodels;

// RE note 本类字节码直接引用的读写或显示接口包括Protobuf。

import com.google.protobuf.GeneratedMessageLite;
import com.zykj.huiwei.launcher.bean.StudentInfoBean;
import com.zykj.huiwei.launcher.bean.UserBean;
import com.zykj.huiwei.launcher.proto.C6075m;
import com.zykj.huiwei.launcher.proto.RoleType;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m7879d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/proto/m;", "it", "<anonymous>", "(Lcom/zykj/huiwei/launcher/proto/m;)Lcom/zykj/huiwei/launcher/proto/m;"}, m7881k = 3, m7882mv = {2, 2, 0})
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.viewmodels.LoginViewModel$updateUserCache$2", m7918f = "LoginViewModel.kt", m7919i = {}, m7920l = {}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
/* loaded from: classes4.dex */
public final class LoginViewModel$updateUserCache$2 extends SuspendLambda implements Function2<C6075m, Continuation<? super C6075m>, Object> {

    /* renamed from: a */
    public int f7199a;

    /* renamed from: b */
    public /* synthetic */ Object f7200b;

    /* renamed from: c */
    public final /* synthetic */ StudentInfoBean f7201c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginViewModel$updateUserCache$2(StudentInfoBean studentInfoBean, Continuation continuation) {
        super(2, continuation);
        this.f7201c = studentInfoBean;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(C6075m c6075m, Continuation continuation) {
        return ((LoginViewModel$updateUserCache$2) create(c6075m, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LoginViewModel$updateUserCache$2 loginViewModel$updateUserCache$2 = new LoginViewModel$updateUserCache$2(this.f7201c, continuation);
        loginViewModel$updateUserCache$2.f7200b = obj;
        return loginViewModel$updateUserCache$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String string;
        String userName;
        String picture;
        String surname;
        String name;
        C6075m c6075m = (C6075m) this.f7200b;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f7199a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C6075m.b bVar = (C6075m.b) c6075m.toBuilder();
        UserBean user = this.f7201c.getUser();
        String str = "";
        if (user == null || (string = Boxing.boxLong(user.getId()).toString()) == null) {
            string = "";
        }
        C6075m.b id = bVar.setId(string);
        UserBean user2 = this.f7201c.getUser();
        if (user2 == null || (userName = user2.getUserName()) == null) {
            userName = "";
        }
        C6075m.b userName2 = id.setUserName(userName);
        UserBean user3 = this.f7201c.getUser();
        if (user3 == null || (picture = user3.getPicture()) == null) {
            picture = "";
        }
        C6075m.b password = userName2.setAvatar(picture).setPassword("");
        UserBean user4 = this.f7201c.getUser();
        if (user4 == null || (surname = user4.getSurname()) == null) {
            surname = "";
        }
        UserBean user5 = this.f7201c.getUser();
        if (user5 != null && (name = user5.getName()) != null) {
            str = name;
        }
        GeneratedMessageLite generatedMessageLiteBuild = password.setRealName(surname + str).setRole(RoleType.STUDENT).build();
        Intrinsics.checkNotNullExpressionValue(generatedMessageLiteBuild, "build(...)");
        return generatedMessageLiteBuild;
    }
}
