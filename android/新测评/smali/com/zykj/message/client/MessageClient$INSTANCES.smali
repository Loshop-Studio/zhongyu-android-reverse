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
        "\u0000y\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001>\u0008\u00c6\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0004J#\u0010\n\u001a\u00020\u00022\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u000fJ#\u0010\u0014\u001a\u00020\u00022\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0012H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J#\u0010\u0018\u001a\u00020\u00022\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0015J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ%\u0010\u001c\u001a\u00020\u00022\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u0015J\u001f\u0010\u001e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008 \u0010\u001fJ\u0017\u0010#\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0016\u00a2\u0006\u0004\u0008#\u0010$J%\u0010%\u001a\u00020\u00022\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008%\u0010\u0015J\u000f\u0010&\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008&\u0010\'J\u000f\u0010(\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008(\u0010\'R$\u00100\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008*\u0010+\u001a\u0004\u0008,\u0010-\"\u0004\u0008.\u0010/R\u0016\u00103\u001a\u00020\u000c8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u00081\u00102R\u0018\u00106\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0018\u00105R\u001c\u0010:\u001a\u0008\u0012\u0004\u0012\u00020!078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00088\u00109R \u0010=\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020;078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008<\u00109R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008?\u0010@R\u0014\u0010D\u001a\u00020B8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010C\u00a8\u0006E"
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
        "m",
        "(Landroid/app/Application;)V",
        "t",
        "Lkotlin/Function1;",
        "Lcom/zykj/message/server/bean/UserInfo;",
        "callBack",
        "k",
        "(Lkotlin/jvm/functions/Function1;)V",
        "j",
        "()Lcom/zykj/message/server/bean/UserInfo;",
        "f",
        "",
        "a",
        "()Ljava/lang/String;",
        "r",
        "Landroid/content/Context;",
        "E",
        "(Landroid/content/Context;Z)V",
        "F",
        "Lm7/a;",
        "messageCallBack",
        "H",
        "(Lm7/a;)V",
        "s",
        "q",
        "()Z",
        "o",
        "Ln7/b;",
        "d",
        "Ln7/b;",
        "D",
        "()Ln7/b;",
        "J",
        "(Ln7/b;)V",
        "remoteServer",
        "e",
        "Landroid/app/Application;",
        "mContext",
        "Ljava/util/Timer;",
        "Ljava/util/Timer;",
        "timeOut",
        "",
        "g",
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
.field public d:Ln7/b;

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
    const-string/jumbo v0, "mContext"

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
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
    sget-object v0, Ll7/b;->a:[I

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
    const-string/jumbo v1, "mContext"

    .line 25
    .line 26
    .line 27
    if-eq p1, v0, :cond_3

    .line 28
    .line 29
    const/4 v0, 0x3

    .line 30
    if-eq p1, v0, :cond_1

    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->e:Landroid/app/Application;

    .line 34
    .line 35
    if-nez p1, :cond_2

    .line 36
    .line 37
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :cond_2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/message/client/MessageClient$INSTANCES;->F(Landroid/content/Context;Z)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_3
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->e:Landroid/app/Application;

    .line 45
    .line 46
    if-nez p1, :cond_4

    .line 47
    .line 48
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    :cond_4
    invoke-virtual {p0, p1, p2}, Lcom/zykj/message/client/MessageClient$INSTANCES;->F(Landroid/content/Context;Z)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_5
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->h:Ljava/util/List;

    .line 56
    .line 57
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    if-eqz p2, :cond_6

    .line 66
    .line 67
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    check-cast p2, Lkotlin/jvm/functions/Function0;

    .line 72
    .line 73
    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_6
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->h:Ljava/util/List;

    .line 78
    .line 79
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 80
    .line 81
    .line 82
    return-void
.end method

.method public final D()Ln7/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->d:Ln7/b;

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
    invoke-static {}, Ll7/a;->h()Ll7/a;

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
    invoke-virtual {v0}, Ll7/a;->e()Landroid/app/Activity;

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
    invoke-static {}, Ll7/a;->h()Ll7/a;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ll7/a;->e()Landroid/app/Activity;

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
    invoke-static {}, Ll7/a;->h()Ll7/a;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0}, Ll7/a;->d()V

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
    const-string/jumbo v1, "hidden"

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 69
    .line 70
    .line 71
    const/high16 p2, 0x10000000

    .line 72
    .line 73
    invoke-virtual {v0, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 74
    .line 75
    .line 76
    const/high16 p2, 0x4000000

    .line 77
    .line 78
    invoke-virtual {v0, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 82
    .line 83
    .line 84
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
    invoke-static {}, Ll7/a;->h()Ll7/a;

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
    invoke-virtual {v0}, Ll7/a;->e()Landroid/app/Activity;

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
    invoke-static {}, Ll7/a;->h()Ll7/a;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ll7/a;->e()Landroid/app/Activity;

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
    invoke-static {}, Ll7/a;->h()Ll7/a;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0}, Ll7/a;->d()V

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
    const-string/jumbo v1, "hidden"

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 69
    .line 70
    .line 71
    const/high16 p2, 0x10000000

    .line 72
    .line 73
    invoke-virtual {v0, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 74
    .line 75
    .line 76
    const/high16 p2, 0x4000000

    .line 77
    .line 78
    invoke-virtual {v0, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 82
    .line 83
    .line 84
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
    const-string/jumbo v2, "mContext"

    .line 21
    .line 22
    .line 23
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 27
    .line 28
    .line 29
    new-instance v0, Ljava/util/Timer;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->f:Ljava/util/Timer;

    .line 35
    .line 36
    new-instance v1, Lcom/zykj/message/client/MessageClient$INSTANCES$d;

    .line 37
    .line 38
    invoke-direct {v1, p0}, Lcom/zykj/message/client/MessageClient$INSTANCES$d;-><init>(Lcom/zykj/message/client/MessageClient$INSTANCES;)V

    .line 39
    .line 40
    .line 41
    const-wide/16 v2, 0x3e8

    .line 42
    .line 43
    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public H(Lm7/a;)V
    .locals 2

    .line 1
    const-string/jumbo v0, "messageCallBack"

    .line 2
    .line 3
    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->d:Ln7/b;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v0}, Landroid/os/IBinder;->pingBinder()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    new-instance v0, Ljava/lang/Thread;

    .line 27
    .line 28
    new-instance v1, Lcom/zykj/message/client/MessageClient$INSTANCES$f;

    .line 29
    .line 30
    invoke-direct {v1, p0, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES$f;-><init>(Lcom/zykj/message/client/MessageClient$INSTANCES;Lm7/a;)V

    .line 31
    .line 32
    .line 33
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->g:Ljava/util/List;

    .line 41
    .line 42
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->e:Landroid/app/Application;

    .line 46
    .line 47
    if-nez p1, :cond_2

    .line 48
    .line 49
    const-string/jumbo v0, "mContext"

    .line 50
    .line 51
    .line 52
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    :cond_2
    invoke-virtual {p0, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES;->t(Landroid/app/Application;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public final I()V
    .locals 2

    .line 1
    invoke-static {}, Ll7/a;->h()Ll7/a;

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
    invoke-virtual {v0, v1}, Ll7/a;->g(Ll7/a$b;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final J(Ln7/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->d:Ln7/b;

    .line 2
    .line 3
    return-void
.end method

.method public a()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->d:Ln7/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Landroid/os/IBinder;->pingBinder()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->d:Ln7/b;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-interface {v0}, Ln7/b;->g()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0

    .line 30
    :cond_1
    return-object v1
.end method

.method public f(Lkotlin/jvm/functions/Function1;)V
    .locals 2

    .line 1
    const-string v0, "callBack"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->d:Ln7/b;

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
    const-string/jumbo v0, "mContext"

    .line 54
    .line 55
    .line 56
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    :cond_2
    invoke-virtual {p0, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES;->t(Landroid/app/Application;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public j()Lcom/zykj/message/server/bean/UserInfo;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->d:Ln7/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Landroid/os/IBinder;->pingBinder()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->d:Ln7/b;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-interface {v0}, Ln7/b;->b()Lcom/zykj/message/server/bean/UserInfo;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0

    .line 30
    :cond_1
    return-object v1
.end method

.method public k(Lkotlin/jvm/functions/Function1;)V
    .locals 2

    .line 1
    const-string v0, "callBack"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->d:Ln7/b;

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
    const-string/jumbo v0, "mContext"

    .line 54
    .line 55
    .line 56
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    :cond_2
    invoke-virtual {p0, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES;->t(Landroid/app/Application;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public m(Landroid/app/Application;)V
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
    invoke-static {}, Ll7/a;->h()Ll7/a;

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
    const-string/jumbo v1, "mContext"

    .line 17
    .line 18
    .line 19
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {p1, v0}, Ll7/a;->f(Landroid/app/Application;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public o()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->d:Ln7/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Landroid/os/IBinder;->pingBinder()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return v0
.end method

.method public q()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->e:Landroid/app/Application;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string/jumbo v1, "mContext"

    .line 6
    .line 7
    .line 8
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x0

    .line 16
    :try_start_0
    const-string v2, "com.zykj.manage"

    .line 17
    .line 18
    invoke-virtual {v0, v2, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :catch_0
    return v1
.end method

.method public declared-synchronized r(Lkotlin/jvm/functions/Function1;)V
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
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->d:Ln7/b;

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
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->d:Ln7/b;

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
    invoke-interface {v0, v1}, Ln7/b;->d(Ln7/a;)V

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
    const-string/jumbo v1, "mContext"

    .line 50
    .line 51
    .line 52
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    :cond_3
    invoke-virtual {p0, v0}, Lcom/zykj/message/client/MessageClient$INSTANCES;->t(Landroid/app/Application;)V

    .line 56
    .line 57
    .line 58
    const/4 v0, 0x0

    .line 59
    :goto_1
    const v1, 0x7fffffff

    .line 60
    .line 61
    .line 62
    if-ge v0, v1, :cond_8

    .line 63
    .line 64
    const-wide/16 v1, 0x64

    .line 65
    .line 66
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V

    .line 67
    .line 68
    .line 69
    iget-object v1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->d:Ln7/b;

    .line 70
    .line 71
    const/4 v2, 0x0

    .line 72
    if-eqz v1, :cond_4

    .line 73
    .line 74
    invoke-interface {v1}, Ln7/b;->f()Lcom/zykj/message/server/bean/ServerInfo;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    goto :goto_2

    .line 79
    :cond_4
    move-object v1, v2

    .line 80
    :goto_2
    if-nez v1, :cond_6

    .line 81
    .line 82
    const/16 v1, 0x28

    .line 83
    .line 84
    if-le v0, v1, :cond_5

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_5
    add-int/lit8 v0, v0, 0x1

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_6
    :goto_3
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->d:Ln7/b;

    .line 91
    .line 92
    if-eqz v0, :cond_7

    .line 93
    .line 94
    invoke-interface {v0}, Ln7/b;->f()Lcom/zykj/message/server/bean/ServerInfo;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    :cond_7
    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    .line 100
    .line 101
    monitor-exit p0

    .line 102
    return-void

    .line 103
    :cond_8
    :goto_4
    monitor-exit p0

    .line 104
    return-void

    .line 105
    :goto_5
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 106
    throw p1
.end method

.method public s(Lkotlin/jvm/functions/Function1;)V
    .locals 3

    .line 1
    const-string v0, "callBack"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->d:Ln7/b;

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
    new-instance v1, Lcom/zykj/message/client/MessageClient$INSTANCES$registerServerListener$1;

    .line 28
    .line 29
    invoke-direct {v1, p0, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES$registerServerListener$1;-><init>(Lcom/zykj/message/client/MessageClient$INSTANCES;Lkotlin/jvm/functions/Function1;)V

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
    new-instance v1, Lm7/b;

    .line 42
    .line 43
    sget-object v2, Lcom/zykj/message/client/MessageClient$INSTANCES$registerServerListener$2;->a:Lcom/zykj/message/client/MessageClient$INSTANCES$registerServerListener$2;

    .line 44
    .line 45
    invoke-direct {v1, p1, v2}, Lm7/b;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->e:Landroid/app/Application;

    .line 52
    .line 53
    if-nez p1, :cond_2

    .line 54
    .line 55
    const-string/jumbo v0, "mContext"

    .line 56
    .line 57
    .line 58
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :cond_2
    invoke-virtual {p0, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES;->t(Landroid/app/Application;)V

    .line 62
    .line 63
    .line 64
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
    invoke-static {}, Ll7/a;->h()Ll7/a;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->e:Landroid/app/Application;

    .line 13
    .line 14
    const-string/jumbo v1, "mContext"

    .line 15
    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {p1, v0}, Ll7/a;->f(Landroid/app/Application;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/zykj/message/client/MessageClient$INSTANCES;->q()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-nez p1, :cond_2

    .line 30
    .line 31
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->e:Landroid/app/Application;

    .line 32
    .line 33
    if-nez p1, :cond_1

    .line 34
    .line 35
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    const/4 v0, 0x0

    .line 39
    invoke-virtual {p0, p1, v0}, Lcom/zykj/message/client/MessageClient$INSTANCES;->E(Landroid/content/Context;Z)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_2
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->d:Ln7/b;

    .line 44
    .line 45
    if-eqz p1, :cond_5

    .line 46
    .line 47
    if-eqz p1, :cond_4

    .line 48
    .line 49
    invoke-interface {p1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    if-eqz p1, :cond_4

    .line 54
    .line 55
    invoke-interface {p1}, Landroid/os/IBinder;->pingBinder()Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-nez p1, :cond_4

    .line 60
    .line 61
    :try_start_0
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->e:Landroid/app/Application;

    .line 62
    .line 63
    if-nez p1, :cond_3

    .line 64
    .line 65
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    :cond_3
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->i:Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;

    .line 69
    .line 70
    invoke-virtual {p1, v0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    .line 72
    .line 73
    :catch_0
    :cond_4
    const/4 p1, 0x0

    .line 74
    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->d:Ln7/b;

    .line 75
    .line 76
    :cond_5
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->d:Ln7/b;

    .line 77
    .line 78
    if-nez p1, :cond_9

    .line 79
    .line 80
    :try_start_1
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->e:Landroid/app/Application;

    .line 81
    .line 82
    if-nez p1, :cond_6

    .line 83
    .line 84
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    :cond_6
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->i:Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;

    .line 88
    .line 89
    invoke-virtual {p1, v0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 90
    .line 91
    .line 92
    :catch_1
    new-instance p1, Landroid/content/Intent;

    .line 93
    .line 94
    const-string v0, "com.zykj.action.zykj.message.service"

    .line 95
    .line 96
    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    const-string v0, "com.zykj.manage"

    .line 100
    .line 101
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 102
    .line 103
    .line 104
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 105
    .line 106
    .line 107
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->e:Landroid/app/Application;

    .line 108
    .line 109
    if-nez v0, :cond_7

    .line 110
    .line 111
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    :cond_7
    iget-object v1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->i:Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;

    .line 115
    .line 116
    const/4 v2, 0x1

    .line 117
    invoke-virtual {v0, p1, v1, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    if-nez p1, :cond_8

    .line 122
    .line 123
    new-instance p1, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 126
    .line 127
    .line 128
    const-string/jumbo v0, "\u7ed1\u5b9a\u4e2a\u4eba\u4e2d\u5fc3\u670d\u52a1\u5931\u8d25,\u51c6\u5907\u91cd\u65b0\u542f\u52a8\u8be5\u4efb\u52a1 "

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 135
    .line 136
    .line 137
    move-result-wide v0

    .line 138
    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    const-string v0, "MessageClient"

    .line 146
    .line 147
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 148
    .line 149
    .line 150
    invoke-virtual {p0}, Lcom/zykj/message/client/MessageClient$INSTANCES;->G()V

    .line 151
    .line 152
    .line 153
    goto :goto_0

    .line 154
    :cond_8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 155
    .line 156
    .line 157
    :cond_9
    :goto_0
    return-void
.end method
