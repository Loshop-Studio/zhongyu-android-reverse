.class final Lcom/zykj/mistake/activity/MainActivity$connection$1$onServiceConnected$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lr6/e;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lkotlinx/coroutines/v;",
        "Ld6/s;",
        "<anonymous>",
        "(Lkotlinx/coroutines/v;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.mistake.activity.MainActivity$connection$1$onServiceConnected$1"
    f = "MainActivity.kt"
    i = {}
    l = {
        0x11d
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field label:I

.field final synthetic this$0:Lcom/zykj/mistake/activity/MainActivity;


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/activity/MainActivity;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/activity/MainActivity;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/activity/MainActivity$connection$1$onServiceConnected$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/activity/MainActivity$connection$1$onServiceConnected$1;->this$0:Lcom/zykj/mistake/activity/MainActivity;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lh6/c<",
            "*>;)",
            "Lh6/c<",
            "Ld6/s;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p1, Lcom/zykj/mistake/activity/MainActivity$connection$1$onServiceConnected$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/mistake/activity/MainActivity$connection$1$onServiceConnected$1;->this$0:Lcom/zykj/mistake/activity/MainActivity;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/zykj/mistake/activity/MainActivity$connection$1$onServiceConnected$1;-><init>(Lcom/zykj/mistake/activity/MainActivity;Lh6/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/activity/MainActivity$connection$1$onServiceConnected$1;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/v;",
            "Lh6/c<",
            "-",
            "Ld6/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/activity/MainActivity$connection$1$onServiceConnected$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/activity/MainActivity$connection$1$onServiceConnected$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/mistake/activity/MainActivity$connection$1$onServiceConnected$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Lcom/zykj/mistake/activity/MainActivity$connection$1$onServiceConnected$1;->label:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    goto :goto_2

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1

    .line 22
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lcom/zykj/mistake/activity/MainActivity$connection$1$onServiceConnected$1;->this$0:Lcom/zykj/mistake/activity/MainActivity;

    .line 26
    .line 27
    iget-object v1, p1, Lcom/zykj/mistake/activity/MainActivity;->c:Lo1/c;

    .line 28
    .line 29
    if-eqz v1, :cond_4

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast v1, Lo1/a;

    .line 36
    .line 37
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    :try_start_0
    const-string v5, "com.techvision.aldl.ICheckAppUpdate"

    .line 46
    .line 47
    invoke-virtual {v3, v5}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    iget-object p1, v1, Lo1/a;->c:Landroid/os/IBinder;

    .line 54
    .line 55
    const/4 v1, 0x0

    .line 56
    invoke-interface {p1, v2, v3, v4, v1}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-nez p1, :cond_2

    .line 61
    .line 62
    sget p1, Lo1/b;->c:I

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :catchall_0
    move-exception p1

    .line 66
    goto :goto_1

    .line 67
    :cond_2
    :goto_0
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I

    .line 71
    .line 72
    .line 73
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    if-eqz p1, :cond_3

    .line 75
    .line 76
    move v1, v2

    .line 77
    :cond_3
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 81
    .line 82
    .line 83
    if-ne v1, v2, :cond_4

    .line 84
    .line 85
    sget-object p1, Lkotlinx/coroutines/f0;->a:Lg7/e;

    .line 86
    .line 87
    sget-object p1, Le7/k;->a:Ld7/d;

    .line 88
    .line 89
    new-instance v1, Lcom/zykj/mistake/activity/MainActivity$connection$1$onServiceConnected$1$1;

    .line 90
    .line 91
    iget-object v3, p0, Lcom/zykj/mistake/activity/MainActivity$connection$1$onServiceConnected$1;->this$0:Lcom/zykj/mistake/activity/MainActivity;

    .line 92
    .line 93
    const/4 v4, 0x0

    .line 94
    invoke-direct {v1, v3, v4}, Lcom/zykj/mistake/activity/MainActivity$connection$1$onServiceConnected$1$1;-><init>(Lcom/zykj/mistake/activity/MainActivity;Lh6/c;)V

    .line 95
    .line 96
    .line 97
    iput v2, p0, Lcom/zykj/mistake/activity/MainActivity$connection$1$onServiceConnected$1;->label:I

    .line 98
    .line 99
    invoke-static {p1, v1, p0}, Lkotlinx/coroutines/x;->F(Lh6/h;Lr6/e;Lh6/c;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    if-ne p1, v0, :cond_4

    .line 104
    .line 105
    return-object v0

    .line 106
    :goto_1
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 110
    .line 111
    .line 112
    throw p1

    .line 113
    :cond_4
    :goto_2
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 114
    .line 115
    return-object p1
.end method
