.class final Lcom/zykj/mistake/activity/MainActivity$connection$1$onServiceConnected$1$1$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/mistake/activity/MainActivity$connection$1$onServiceConnected$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

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
    c = "com.zykj.mistake.activity.MainActivity$connection$1$onServiceConnected$1$1$1$1"
    f = "MainActivity.kt"
    i = {}
    l = {}
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
            "Lcom/zykj/mistake/activity/MainActivity$connection$1$onServiceConnected$1$1$1$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/activity/MainActivity$connection$1$onServiceConnected$1$1$1$1;->this$0:Lcom/zykj/mistake/activity/MainActivity;

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
    new-instance p1, Lcom/zykj/mistake/activity/MainActivity$connection$1$onServiceConnected$1$1$1$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/mistake/activity/MainActivity$connection$1$onServiceConnected$1$1$1$1;->this$0:Lcom/zykj/mistake/activity/MainActivity;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/zykj/mistake/activity/MainActivity$connection$1$onServiceConnected$1$1$1$1;-><init>(Lcom/zykj/mistake/activity/MainActivity;Lh6/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/activity/MainActivity$connection$1$onServiceConnected$1$1$1$1;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/activity/MainActivity$connection$1$onServiceConnected$1$1$1$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/activity/MainActivity$connection$1$onServiceConnected$1$1$1$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/mistake/activity/MainActivity$connection$1$onServiceConnected$1$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v0, p0, Lcom/zykj/mistake/activity/MainActivity$connection$1$onServiceConnected$1$1$1$1;->label:I

    .line 4
    .line 5
    if-nez v0, :cond_4

    .line 6
    .line 7
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lcom/zykj/mistake/activity/MainActivity$connection$1$onServiceConnected$1$1$1$1;->this$0:Lcom/zykj/mistake/activity/MainActivity;

    .line 11
    .line 12
    iget-object p1, p1, Lcom/zykj/mistake/activity/MainActivity;->c:Lo1/c;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    const-string v1, "com.techvision.aldl.ICheckAppUpdate"

    .line 16
    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    check-cast p1, Lo1/a;

    .line 20
    .line 21
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    :try_start_0
    invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p1, Lo1/a;->c:Landroid/os/IBinder;

    .line 33
    .line 34
    const/4 v4, 0x2

    .line 35
    invoke-interface {p1, v4, v2, v3, v0}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-nez p1, :cond_0

    .line 40
    .line 41
    sget p1, Lo1/b;->c:I

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception p1

    .line 45
    goto :goto_1

    .line 46
    :cond_0
    :goto_0
    invoke-virtual {v3}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V

    .line 53
    .line 54
    .line 55
    goto :goto_2

    .line 56
    :goto_1
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V

    .line 60
    .line 61
    .line 62
    throw p1

    .line 63
    :cond_1
    :goto_2
    iget-object p1, p0, Lcom/zykj/mistake/activity/MainActivity$connection$1$onServiceConnected$1$1$1$1;->this$0:Lcom/zykj/mistake/activity/MainActivity;

    .line 64
    .line 65
    iget-object v2, p1, Lcom/zykj/mistake/activity/MainActivity;->c:Lo1/c;

    .line 66
    .line 67
    if-eqz v2, :cond_3

    .line 68
    .line 69
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    check-cast v2, Lo1/a;

    .line 74
    .line 75
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    :try_start_1
    invoke-virtual {v3, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    iget-object p1, v2, Lo1/a;->c:Landroid/os/IBinder;

    .line 90
    .line 91
    const/4 v1, 0x3

    .line 92
    invoke-interface {p1, v1, v3, v4, v0}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    if-nez p1, :cond_2

    .line 97
    .line 98
    sget p1, Lo1/b;->c:I

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :catchall_1
    move-exception p1

    .line 102
    goto :goto_4

    .line 103
    :cond_2
    :goto_3
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 104
    .line 105
    .line 106
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 110
    .line 111
    .line 112
    goto :goto_5

    .line 113
    :goto_4
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 117
    .line 118
    .line 119
    throw p1

    .line 120
    :cond_3
    :goto_5
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 121
    .line 122
    return-object p1

    .line 123
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 124
    .line 125
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 126
    .line 127
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    throw p1
.end method
