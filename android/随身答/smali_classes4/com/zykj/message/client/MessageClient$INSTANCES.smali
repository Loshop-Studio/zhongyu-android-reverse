.class final Lcom/zykj/message/client/MessageClient$INSTANCES;
.super Lcom/zykj/message/client/MessageClient;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/message/client/MessageClient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "INSTANCES"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010!\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001;\u0008\u00c6\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0004J#\u0010\n\u001a\u00020\u00022\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u000fJ#\u0010\u0014\u001a\u00020\u00022\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J#\u0010\u0016\u001a\u00020\u00022\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0015J%\u0010\u0017\u001a\u00020\u00022\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ;\u0010\"\u001a\u00020\u00022\u0014\u0010 \u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00020\u00112\u0014\u0010!\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\"\u0010#J\u000f\u0010$\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008$\u0010%R$\u0010-\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\'\u0010(\u001a\u0004\u0008)\u0010*\"\u0004\u0008+\u0010,R\u0016\u00100\u001a\u00020\u000c8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008.\u0010/R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00082\u00103R\u001c\u00107\u001a\u0008\u0012\u0004\u0012\u00020\u001c058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000e\u00106R \u0010:\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000208058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00089\u00106R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008<\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008@\u0010A\u00a8\u0006C"
    }
    d2 = {
        "Lcom/zykj/message/client/MessageClient$INSTANCES;",
        "Lcom/zykj/message/client/MessageClient;",
        "",
        "I",
        "()V",
        "G",
        "Lcom/zykj/message/server/bean/ServerInfo;",
        "serverInfo",
        "",
        "hidden",
        "C",
        "(Lcom/zykj/message/server/bean/ServerInfo;Z)V",
        "Landroid/app/Application;",
        "context",
        "g",
        "(Landroid/app/Application;)V",
        "t",
        "Lkotlin/Function1;",
        "Lcom/zykj/message/server/bean/UserInfo;",
        "callBack",
        "c",
        "(Lkotlin/jvm/functions/Function1;)V",
        "a",
        "n",
        "Landroid/content/Context;",
        "E",
        "(Landroid/content/Context;Z)V",
        "F",
        "Ld6/a;",
        "messageCallBack",
        "H",
        "(Ld6/a;)V",
        "serverCallBack",
        "userCallBack",
        "q",
        "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V",
        "k",
        "()Z",
        "Le6/b;",
        "d",
        "Le6/b;",
        "D",
        "()Le6/b;",
        "J",
        "(Le6/b;)V",
        "remoteServer",
        "e",
        "Landroid/app/Application;",
        "mContext",
        "Ljava/util/Timer;",
        "f",
        "Ljava/util/Timer;",
        "timeOut",
        "",
        "Ljava/util/List;",
        "listenerList",
        "Lkotlin/Function0;",
        "h",
        "doTask",
        "com/zykj/message/client/MessageClient$INSTANCES$mConnection$1",
        "i",
        "Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;",
        "mConnection",
        "Landroid/os/Handler;",
        "j",
        "Landroid/os/Handler;",
        "mHandler",
        "messageclient_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# instance fields
.field public d:Le6/b;

.field public e:Landroid/app/Application;

.field public f:Ljava/util/Timer;

.field public g:Ljava/util/List;

.field public final h:Ljava/util/List;

.field public final i:Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;

.field public final j:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/message/client/MessageClient;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    .line 4
    .line 5
    new-instance p1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->g:Ljava/util/List;

    .line 11
    .line 12
    new-instance p1, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->h:Ljava/util/List;

    .line 18
    .line 19
    new-instance p1, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;

    .line 20
    .line 21
    invoke-direct {p1, p0}, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;-><init>(Lcom/zykj/message/client/MessageClient$INSTANCES;)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->i:Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;

    .line 25
    .line 26
    new-instance p1, Landroid/os/Handler;

    .line 27
    .line 28
    new-instance p2, Lcom/zykj/message/client/MessageClient$INSTANCES$c;

    .line 29
    .line 30
    invoke-direct {p2, p0}, Lcom/zykj/message/client/MessageClient$INSTANCES$c;-><init>(Lcom/zykj/message/client/MessageClient$INSTANCES;)V

    .line 31
    .line 32
    .line 33
    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->j:Landroid/os/Handler;

    .line 37
    .line 38
    return-void
.end method

.method public static final synthetic A(Lcom/zykj/message/client/MessageClient$INSTANCES;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/message/client/MessageClient$INSTANCES;->I()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic B(Lcom/zykj/message/client/MessageClient$INSTANCES;Ljava/util/Timer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->f:Ljava/util/Timer;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic u(Lcom/zykj/message/client/MessageClient$INSTANCES;Lcom/zykj/message/server/bean/ServerInfo;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/message/client/MessageClient$INSTANCES;->C(Lcom/zykj/message/server/bean/ServerInfo;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic v(Lcom/zykj/message/client/MessageClient$INSTANCES;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->g:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic w(Lcom/zykj/message/client/MessageClient$INSTANCES;)Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->i:Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic x(Lcom/zykj/message/client/MessageClient$INSTANCES;)Landroid/app/Application;
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->e:Landroid/app/Application;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const-string v0, "mContext"

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-object p0
.end method

.method public static final synthetic y(Lcom/zykj/message/client/MessageClient$INSTANCES;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->j:Landroid/os/Handler;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic z(Lcom/zykj/message/client/MessageClient$INSTANCES;)Ljava/util/Timer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->f:Ljava/util/Timer;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final C(Lcom/zykj/message/server/bean/ServerInfo;Z)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/zykj/message/server/bean/ServerInfo;->b()Lcom/zykj/message/server/bean/Status;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sget-object p1, Lcom/zykj/message/server/bean/Status;->c:Lcom/zykj/message/server/bean/Status;

    .line 11
    .line 12
    :goto_0
    sget-object v0, Lc6/b;->a:[I

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    aget p1, v0, p1

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    if-eq p1, v0, :cond_5

    .line 22
    .line 23
    const/4 v0, 0x2

    .line 24
    const-string v1, "mContext"

    .line 25
    .line 26
    if-eq p1, v0, :cond_3

    .line 27
    .line 28
    const/4 v0, 0x3

    .line 29
    if-eq p1, v0, :cond_1

    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->e:Landroid/app/Application;

    .line 33
    .line 34
    if-nez p1, :cond_2

    .line 35
    .line 36
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :cond_2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/message/client/MessageClient$INSTANCES;->F(Landroid/content/Context;Z)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_3
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->e:Landroid/app/Application;

    .line 44
    .line 45
    if-nez p1, :cond_4

    .line 46
    .line 47
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    :cond_4
    invoke-virtual {p0, p1, p2}, Lcom/zykj/message/client/MessageClient$INSTANCES;->F(Landroid/content/Context;Z)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_5
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->h:Ljava/util/List;

    .line 55
    .line 56
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    if-eqz p2, :cond_6

    .line 65
    .line 66
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    check-cast p2, Lkotlin/jvm/functions/Function0;

    .line 71
    .line 72
    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_6
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->h:Ljava/util/List;

    .line 77
    .line 78
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method public final D()Le6/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->d:Le6/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public E(Landroid/content/Context;Z)V
    .locals 3

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lc6/a;->h()Lc6/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "ActivityCollectionHelper.with()"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lc6/a;->e()Landroid/app/Activity;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-class v2, Lcom/zykj/message/UnInstallActivity;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-static {}, Lc6/a;->h()Lc6/a;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lc6/a;->e()Landroid/app/Activity;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_0

    .line 51
    .line 52
    return-void

    .line 53
    :cond_0
    invoke-static {}, Lc6/a;->h()Lc6/a;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0}, Lc6/a;->d()V

    .line 58
    .line 59
    .line 60
    new-instance v0, Landroid/content/Intent;

    .line 61
    .line 62
    invoke-direct {v0, p1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 63
    .line 64
    .line 65
    const-string v1, "hidden"

    .line 66
    .line 67
    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 68
    .line 69
    .line 70
    const/high16 p2, 0x10000000

    .line 71
    .line 72
    invoke-virtual {v0, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 73
    .line 74
    .line 75
    const/high16 p2, 0x4000000

    .line 76
    .line 77
    invoke-virtual {v0, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public F(Landroid/content/Context;Z)V
    .locals 3

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lc6/a;->h()Lc6/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "ActivityCollectionHelper.with()"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lc6/a;->e()Landroid/app/Activity;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-class v2, Lcom/zykj/message/UnLoginActivity;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-static {}, Lc6/a;->h()Lc6/a;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lc6/a;->e()Landroid/app/Activity;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_0

    .line 51
    .line 52
    return-void

    .line 53
    :cond_0
    invoke-static {}, Lc6/a;->h()Lc6/a;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0}, Lc6/a;->d()V

    .line 58
    .line 59
    .line 60
    new-instance v0, Landroid/content/Intent;

    .line 61
    .line 62
    invoke-direct {v0, p1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 63
    .line 64
    .line 65
    const-string v1, "hidden"

    .line 66
    .line 67
    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 68
    .line 69
    .line 70
    const/high16 p2, 0x10000000

    .line 71
    .line 72
    invoke-virtual {v0, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 73
    .line 74
    .line 75
    const/high16 p2, 0x4000000

    .line 76
    .line 77
    invoke-virtual {v0, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public final G()V
    .locals 4

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "com.zykj.action.zykj.message.service.awaken"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 9
    .line 10
    .line 11
    const/high16 v1, 0x10000000

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->e:Landroid/app/Application;

    .line 17
    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    const-string v2, "mContext"

    .line 21
    .line 22
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 26
    .line 27
    .line 28
    new-instance v0, Ljava/util/Timer;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->f:Ljava/util/Timer;

    .line 34
    .line 35
    new-instance v1, Lcom/zykj/message/client/MessageClient$INSTANCES$d;

    .line 36
    .line 37
    invoke-direct {v1, p0}, Lcom/zykj/message/client/MessageClient$INSTANCES$d;-><init>(Lcom/zykj/message/client/MessageClient$INSTANCES;)V

    .line 38
    .line 39
    .line 40
    const-wide/16 v2, 0x3e8

    .line 41
    .line 42
    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public H(Ld6/a;)V
    .locals 2

    .line 1
    const-string v0, "messageCallBack"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->d:Le6/b;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {v0}, Landroid/os/IBinder;->pingBinder()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    new-instance v0, Ljava/lang/Thread;

    .line 26
    .line 27
    new-instance v1, Lcom/zykj/message/client/MessageClient$INSTANCES$f;

    .line 28
    .line 29
    invoke-direct {v1, p0, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES$f;-><init>(Lcom/zykj/message/client/MessageClient$INSTANCES;Ld6/a;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->g:Ljava/util/List;

    .line 40
    .line 41
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->e:Landroid/app/Application;

    .line 45
    .line 46
    if-nez p1, :cond_2

    .line 47
    .line 48
    const-string v0, "mContext"

    .line 49
    .line 50
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    :cond_2
    invoke-virtual {p0, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES;->t(Landroid/app/Application;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public final I()V
    .locals 2

    .line 1
    invoke-static {}, Lc6/a;->h()Lc6/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/zykj/message/client/MessageClient$INSTANCES$registerResumeListener$1;

    .line 6
    .line 7
    invoke-direct {v1, p0}, Lcom/zykj/message/client/MessageClient$INSTANCES$registerResumeListener$1;-><init>(Lcom/zykj/message/client/MessageClient$INSTANCES;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lc6/a;->g(Lc6/a$b;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final J(Le6/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->d:Le6/b;

    .line 2
    .line 3
    return-void
.end method

.method public a(Lkotlin/jvm/functions/Function1;)V
    .locals 2

    .line 1
    const-string v0, "callBack"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->d:Le6/b;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {v0}, Landroid/os/IBinder;->pingBinder()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    new-instance v0, Ljava/lang/Thread;

    .line 26
    .line 27
    new-instance v1, Lcom/zykj/message/client/MessageClient$INSTANCES$a;

    .line 28
    .line 29
    invoke-direct {v1, p0, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES$a;-><init>(Lcom/zykj/message/client/MessageClient$INSTANCES;Lkotlin/jvm/functions/Function1;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->h:Ljava/util/List;

    .line 40
    .line 41
    new-instance v1, Lcom/zykj/message/client/MessageClient$INSTANCES$getServerInfo$4;

    .line 42
    .line 43
    invoke-direct {v1, p0, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES$getServerInfo$4;-><init>(Lcom/zykj/message/client/MessageClient$INSTANCES;Lkotlin/jvm/functions/Function1;)V

    .line 44
    .line 45
    .line 46
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->e:Landroid/app/Application;

    .line 50
    .line 51
    if-nez p1, :cond_2

    .line 52
    .line 53
    const-string v0, "mContext"

    .line 54
    .line 55
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    :cond_2
    invoke-virtual {p0, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES;->t(Landroid/app/Application;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public c(Lkotlin/jvm/functions/Function1;)V
    .locals 2

    .line 1
    const-string v0, "callBack"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->d:Le6/b;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {v0}, Landroid/os/IBinder;->pingBinder()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    new-instance v0, Ljava/lang/Thread;

    .line 26
    .line 27
    new-instance v1, Lcom/zykj/message/client/MessageClient$INSTANCES$b;

    .line 28
    .line 29
    invoke-direct {v1, p0, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES$b;-><init>(Lcom/zykj/message/client/MessageClient$INSTANCES;Lkotlin/jvm/functions/Function1;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->h:Ljava/util/List;

    .line 40
    .line 41
    new-instance v1, Lcom/zykj/message/client/MessageClient$INSTANCES$getUserInfo$4;

    .line 42
    .line 43
    invoke-direct {v1, p0, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES$getUserInfo$4;-><init>(Lcom/zykj/message/client/MessageClient$INSTANCES;Lkotlin/jvm/functions/Function1;)V

    .line 44
    .line 45
    .line 46
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->e:Landroid/app/Application;

    .line 50
    .line 51
    if-nez p1, :cond_2

    .line 52
    .line 53
    const-string v0, "mContext"

    .line 54
    .line 55
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    :cond_2
    invoke-virtual {p0, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES;->t(Landroid/app/Application;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public g(Landroid/app/Application;)V
    .locals 2

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->e:Landroid/app/Application;

    .line 7
    .line 8
    invoke-static {}, Lc6/a;->h()Lc6/a;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->e:Landroid/app/Application;

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    const-string v1, "mContext"

    .line 17
    .line 18
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {p1, v0}, Lc6/a;->f(Landroid/app/Application;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public k()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->e:Landroid/app/Application;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v1, "mContext"

    .line 6
    .line 7
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    :try_start_0
    const-string v2, "com.zykj.manage"

    .line 16
    .line 17
    invoke-virtual {v0, v2, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    return v0

    .line 22
    :catch_0
    return v1
.end method

.method public declared-synchronized n(Lkotlin/jvm/functions/Function1;)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "callBack"

    .line 3
    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->d:Le6/b;

    .line 8
    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    goto :goto_5

    .line 19
    :cond_0
    :goto_0
    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {v0}, Landroid/os/IBinder;->pingBinder()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->d:Le6/b;

    .line 30
    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    .line 34
    .line 35
    .line 36
    :cond_1
    new-instance v1, Lcom/zykj/message/client/MessageClient$INSTANCES$e;

    .line 37
    .line 38
    invoke-direct {v1, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES$e;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 39
    .line 40
    .line 41
    invoke-interface {v0, v1}, Le6/b;->f(Le6/a;)V

    .line 42
    .line 43
    .line 44
    goto :goto_4

    .line 45
    :cond_2
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->e:Landroid/app/Application;

    .line 46
    .line 47
    if-nez v0, :cond_3

    .line 48
    .line 49
    const-string v1, "mContext"

    .line 50
    .line 51
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :cond_3
    invoke-virtual {p0, v0}, Lcom/zykj/message/client/MessageClient$INSTANCES;->t(Landroid/app/Application;)V

    .line 55
    .line 56
    .line 57
    const/4 v0, 0x0

    .line 58
    :goto_1
    const v1, 0x7fffffff

    .line 59
    .line 60
    .line 61
    if-ge v0, v1, :cond_8

    .line 62
    .line 63
    const-wide/16 v1, 0x64

    .line 64
    .line 65
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V

    .line 66
    .line 67
    .line 68
    iget-object v1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->d:Le6/b;

    .line 69
    .line 70
    const/4 v2, 0x0

    .line 71
    if-eqz v1, :cond_4

    .line 72
    .line 73
    invoke-interface {v1}, Le6/b;->e()Lcom/zykj/message/server/bean/ServerInfo;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    goto :goto_2

    .line 78
    :cond_4
    move-object v1, v2

    .line 79
    :goto_2
    if-nez v1, :cond_6

    .line 80
    .line 81
    const/16 v1, 0x28

    .line 82
    .line 83
    if-le v0, v1, :cond_5

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_5
    add-int/lit8 v0, v0, 0x1

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_6
    :goto_3
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->d:Le6/b;

    .line 90
    .line 91
    if-eqz v0, :cond_7

    .line 92
    .line 93
    invoke-interface {v0}, Le6/b;->e()Lcom/zykj/message/server/bean/ServerInfo;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    :cond_7
    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 98
    .line 99
    .line 100
    monitor-exit p0

    .line 101
    return-void

    .line 102
    :cond_8
    :goto_4
    monitor-exit p0

    .line 103
    return-void

    .line 104
    :goto_5
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 105
    throw p1
.end method

.method public q(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 2

    .line 1
    const-string v0, "serverCallBack"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "userCallBack"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->d:Le6/b;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-interface {v0}, Landroid/os/IBinder;->pingBinder()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    new-instance v0, Ljava/lang/Thread;

    .line 31
    .line 32
    new-instance v1, Lcom/zykj/message/client/MessageClient$INSTANCES$g;

    .line 33
    .line 34
    invoke-direct {v1, p0, p1, p2}, Lcom/zykj/message/client/MessageClient$INSTANCES$g;-><init>(Lcom/zykj/message/client/MessageClient$INSTANCES;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 35
    .line 36
    .line 37
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_1
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->g:Ljava/util/List;

    .line 45
    .line 46
    new-instance v1, Ld6/b;

    .line 47
    .line 48
    invoke-direct {v1, p1, p2}, Ld6/b;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 49
    .line 50
    .line 51
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->e:Landroid/app/Application;

    .line 55
    .line 56
    if-nez p1, :cond_2

    .line 57
    .line 58
    const-string p2, "mContext"

    .line 59
    .line 60
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    :cond_2
    invoke-virtual {p0, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES;->t(Landroid/app/Application;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public t(Landroid/app/Application;)V
    .locals 3

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->e:Landroid/app/Application;

    .line 7
    .line 8
    invoke-static {}, Lc6/a;->h()Lc6/a;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->e:Landroid/app/Application;

    .line 13
    .line 14
    const-string v1, "mContext"

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {p1, v0}, Lc6/a;->f(Landroid/app/Application;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/zykj/message/client/MessageClient$INSTANCES;->k()Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-nez p1, :cond_2

    .line 29
    .line 30
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->e:Landroid/app/Application;

    .line 31
    .line 32
    if-nez p1, :cond_1

    .line 33
    .line 34
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    const/4 v0, 0x0

    .line 38
    invoke-virtual {p0, p1, v0}, Lcom/zykj/message/client/MessageClient$INSTANCES;->E(Landroid/content/Context;Z)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_2
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->d:Le6/b;

    .line 43
    .line 44
    if-eqz p1, :cond_5

    .line 45
    .line 46
    if-eqz p1, :cond_4

    .line 47
    .line 48
    invoke-interface {p1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-eqz p1, :cond_4

    .line 53
    .line 54
    invoke-interface {p1}, Landroid/os/IBinder;->pingBinder()Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-nez p1, :cond_4

    .line 59
    .line 60
    :try_start_0
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->e:Landroid/app/Application;

    .line 61
    .line 62
    if-nez p1, :cond_3

    .line 63
    .line 64
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    :cond_3
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->i:Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;

    .line 68
    .line 69
    invoke-virtual {p1, v0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    .line 71
    .line 72
    :catch_0
    :cond_4
    const/4 p1, 0x0

    .line 73
    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->d:Le6/b;

    .line 74
    .line 75
    :cond_5
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->d:Le6/b;

    .line 76
    .line 77
    if-nez p1, :cond_9

    .line 78
    .line 79
    :try_start_1
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->e:Landroid/app/Application;

    .line 80
    .line 81
    if-nez p1, :cond_6

    .line 82
    .line 83
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    :cond_6
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->i:Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;

    .line 87
    .line 88
    invoke-virtual {p1, v0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 89
    .line 90
    .line 91
    :catch_1
    new-instance p1, Landroid/content/Intent;

    .line 92
    .line 93
    const-string v0, "com.zykj.action.zykj.message.service"

    .line 94
    .line 95
    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    const-string v0, "com.zykj.manage"

    .line 99
    .line 100
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 101
    .line 102
    .line 103
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 104
    .line 105
    .line 106
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->e:Landroid/app/Application;

    .line 107
    .line 108
    if-nez v0, :cond_7

    .line 109
    .line 110
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    :cond_7
    iget-object v1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->i:Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;

    .line 114
    .line 115
    const/4 v2, 0x1

    .line 116
    invoke-virtual {v0, p1, v1, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    if-nez p1, :cond_8

    .line 121
    .line 122
    new-instance p1, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 125
    .line 126
    .line 127
    const-string v0, "\u7ed1\u5b9a\u4e2a\u4eba\u4e2d\u5fc3\u670d\u52a1\u5931\u8d25,\u51c6\u5907\u91cd\u65b0\u542f\u52a8\u8be5\u4efb\u52a1 "

    .line 128
    .line 129
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 133
    .line 134
    .line 135
    move-result-wide v0

    .line 136
    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    const-string v0, "MessageClient"

    .line 144
    .line 145
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0}, Lcom/zykj/message/client/MessageClient$INSTANCES;->G()V

    .line 149
    .line 150
    .line 151
    goto :goto_0

    .line 152
    :cond_8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 153
    .line 154
    .line 155
    :cond_9
    :goto_0
    return-void
.end method
