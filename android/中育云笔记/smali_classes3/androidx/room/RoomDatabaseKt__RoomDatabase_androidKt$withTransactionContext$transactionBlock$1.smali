.class final Landroidx/room/RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/room/RoomDatabaseKt__RoomDatabase_androidKt;->withTransactionContext(Landroidx/room/RoomDatabase;Lhd/l;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1"
    f = "RoomDatabase.android.kt"
    l = {
        0x7df
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $block:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lhd/l;Lvc/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            "Lvc/c<",
            "-",
            "Landroidx/room/RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/room/RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1;->$block:Lhd/l;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lvc/c<",
            "*>;)",
            "Lvc/c<",
            "Lqc/q;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/room/RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/room/RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1;->$block:Lhd/l;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Landroidx/room/RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1;-><init>(Lhd/l;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Landroidx/room/RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1;->L$0:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Landroidx/room/RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsd/i0;",
            "Lvc/c<",
            "-TR;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Landroidx/room/RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Landroidx/room/RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Landroidx/room/RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Landroidx/room/RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1;->label:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/room/RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1;->L$0:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Landroidx/room/TransactionElement;

    .line 15
    .line 16
    :try_start_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p1

    .line 30
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Landroidx/room/RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1;->L$0:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, Lsd/i0;

    .line 36
    .line 37
    invoke-interface {p1}, Lsd/i0;->getCoroutineContext()Lkotlin/coroutines/d;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    sget-object v1, Landroidx/room/TransactionElement;->Key:Landroidx/room/TransactionElement$Key;

    .line 42
    .line 43
    invoke-interface {p1, v1}, Lkotlin/coroutines/d;->get(Lkotlin/coroutines/d$c;)Lkotlin/coroutines/d$b;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    check-cast p1, Landroidx/room/TransactionElement;

    .line 51
    .line 52
    invoke-virtual {p1}, Landroidx/room/TransactionElement;->acquire()V

    .line 53
    .line 54
    .line 55
    :try_start_1
    iget-object v1, p0, Landroidx/room/RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1;->$block:Lhd/l;

    .line 56
    .line 57
    iput-object p1, p0, Landroidx/room/RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1;->L$0:Ljava/lang/Object;

    .line 58
    .line 59
    iput v2, p0, Landroidx/room/RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1;->label:I

    .line 60
    .line 61
    invoke-interface {v1, p0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 65
    if-ne v1, v0, :cond_2

    .line 66
    .line 67
    return-object v0

    .line 68
    :cond_2
    move-object v0, p1

    .line 69
    move-object p1, v1

    .line 70
    :goto_0
    invoke-virtual {v0}, Landroidx/room/TransactionElement;->release()V

    .line 71
    .line 72
    .line 73
    return-object p1

    .line 74
    :catchall_1
    move-exception v0

    .line 75
    move-object v3, v0

    .line 76
    move-object v0, p1

    .line 77
    move-object p1, v3

    .line 78
    :goto_1
    invoke-virtual {v0}, Landroidx/room/TransactionElement;->release()V

    .line 79
    .line 80
    .line 81
    throw p1
.end method
