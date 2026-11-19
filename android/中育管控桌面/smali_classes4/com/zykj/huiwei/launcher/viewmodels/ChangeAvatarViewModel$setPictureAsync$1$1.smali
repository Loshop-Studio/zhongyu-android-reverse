# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class final Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel;->f(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lcom/zykj/huiwei/launcher/proto/m;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lcom/zykj/huiwei/launcher/proto/m;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lcom/zykj/huiwei/launcher/proto/m;",
        "it",
        "<anonymous>",
        "(Lcom/zykj/huiwei/launcher/proto/m;)Lcom/zykj/huiwei/launcher/proto/m;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.huiwei.launcher.viewmodels.ChangeAvatarViewModel$setPictureAsync$1$1"
    f = "ChangeAvatarViewModel.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/zykj/huiwei/launcher/bean/StudentInfoBean;


# direct methods
.method public constructor <init>(Lcom/zykj/huiwei/launcher/bean/StudentInfoBean;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$1$1;->c:Lcom/zykj/huiwei/launcher/bean/StudentInfoBean;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/zykj/huiwei/launcher/proto/m;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$1$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    new-instance v0, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$1$1;

    iget-object v1, p0, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$1$1;->c:Lcom/zykj/huiwei/launcher/bean/StudentInfoBean;

    invoke-direct {v0, v1, p2}, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$1$1;-><init>(Lcom/zykj/huiwei/launcher/bean/StudentInfoBean;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$1$1;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/zykj/huiwei/launcher/proto/m;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$1$1;->a(Lcom/zykj/huiwei/launcher/proto/m;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$1$1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/m;

    .line 4
    .line 5
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$1$1;->a:I

    .line 9
    .line 10
    if-nez v1, :cond_a

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite;->toBuilder()Lcom/google/protobuf/GeneratedMessageLite$Builder;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Lcom/zykj/huiwei/launcher/proto/m$b;

    .line 20
    .line 21
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$1$1;->c:Lcom/zykj/huiwei/launcher/bean/StudentInfoBean;

    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/bean/StudentInfoBean;->getUser()Lcom/zykj/huiwei/launcher/bean/UserBean;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, ""

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/bean/UserBean;->getId()J

    .line 32
    .line 33
    .line 34
    move-result-wide v2

    .line 35
    invoke-static {v2, v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, Ljava/lang/Long;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-nez v0, :cond_1

    .line 44
    .line 45
    :cond_0
    move-object v0, v1

    .line 46
    :cond_1
    invoke-virtual {p1, v0}, Lcom/zykj/huiwei/launcher/proto/m$b;->setId(Ljava/lang/String;)Lcom/zykj/huiwei/launcher/proto/m$b;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$1$1;->c:Lcom/zykj/huiwei/launcher/bean/StudentInfoBean;

    .line 51
    .line 52
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/bean/StudentInfoBean;->getUser()Lcom/zykj/huiwei/launcher/bean/UserBean;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/bean/UserBean;->getUserName()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    if-nez v0, :cond_3

    .line 63
    .line 64
    :cond_2
    move-object v0, v1

    .line 65
    :cond_3
    invoke-virtual {p1, v0}, Lcom/zykj/huiwei/launcher/proto/m$b;->setUserName(Ljava/lang/String;)Lcom/zykj/huiwei/launcher/proto/m$b;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$1$1;->c:Lcom/zykj/huiwei/launcher/bean/StudentInfoBean;

    .line 70
    .line 71
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/bean/StudentInfoBean;->getUser()Lcom/zykj/huiwei/launcher/bean/UserBean;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    if-eqz v0, :cond_4

    .line 76
    .line 77
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/bean/UserBean;->getPicture()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    if-nez v0, :cond_5

    .line 82
    .line 83
    :cond_4
    move-object v0, v1

    .line 84
    :cond_5
    invoke-virtual {p1, v0}, Lcom/zykj/huiwei/launcher/proto/m$b;->setAvatar(Ljava/lang/String;)Lcom/zykj/huiwei/launcher/proto/m$b;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$1$1;->c:Lcom/zykj/huiwei/launcher/bean/StudentInfoBean;

    .line 89
    .line 90
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/bean/StudentInfoBean;->getUser()Lcom/zykj/huiwei/launcher/bean/UserBean;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    if-eqz v0, :cond_6

    .line 95
    .line 96
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/bean/UserBean;->getSurname()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    if-nez v0, :cond_7

    .line 101
    .line 102
    :cond_6
    move-object v0, v1

    .line 103
    :cond_7
    iget-object v2, p0, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$1$1;->c:Lcom/zykj/huiwei/launcher/bean/StudentInfoBean;

    .line 104
    .line 105
    invoke-virtual {v2}, Lcom/zykj/huiwei/launcher/bean/StudentInfoBean;->getUser()Lcom/zykj/huiwei/launcher/bean/UserBean;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    if-eqz v2, :cond_9

    .line 110
    .line 111
    invoke-virtual {v2}, Lcom/zykj/huiwei/launcher/bean/UserBean;->getName()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    if-nez v2, :cond_8

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_8
    move-object v1, v2

    .line 119
    :cond_9
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 120
    .line 121
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-virtual {p1, v0}, Lcom/zykj/huiwei/launcher/proto/m$b;->setRealName(Ljava/lang/String;)Lcom/zykj/huiwei/launcher/proto/m$b;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/RoleType;->STUDENT:Lcom/zykj/huiwei/launcher/proto/RoleType;

    .line 139
    .line 140
    invoke-virtual {p1, v0}, Lcom/zykj/huiwei/launcher/proto/m$b;->setRole(Lcom/zykj/huiwei/launcher/proto/RoleType;)Lcom/zykj/huiwei/launcher/proto/m$b;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    const-string v0, "build(...)"

    .line 149
    .line 150
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    return-object p1

    .line 154
    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 155
    .line 156
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 157
    .line 158
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    throw p1
.end method
