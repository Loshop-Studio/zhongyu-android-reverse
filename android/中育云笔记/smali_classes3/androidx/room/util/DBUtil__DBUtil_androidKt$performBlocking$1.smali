.class final Landroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/room/util/DBUtil__DBUtil_androidKt;->performBlocking(Landroidx/room/RoomDatabase;ZZLhd/l;)Ljava/lang/Object;
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
    c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1"
    f = "DBUtil.android.kt"
    l = {
        0xf7
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

.field final synthetic $db:Landroidx/room/RoomDatabase;

.field final synthetic $inTransaction:Z

.field final synthetic $isReadOnly:Z

.field label:I


# direct methods
.method public constructor <init>(Landroidx/room/RoomDatabase;ZZLhd/l;Lvc/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/room/RoomDatabase;",
            "ZZ",
            "Lhd/l;",
            "Lvc/c<",
            "-",
            "Landroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1;->$db:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    iput-boolean p2, p0, Landroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1;->$inTransaction:Z

    .line 4
    .line 5
    iput-boolean p3, p0, Landroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1;->$isReadOnly:Z

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1;->$block:Lhd/l;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 6
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
    new-instance v0, Landroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1;->$db:Landroidx/room/RoomDatabase;

    .line 4
    .line 5
    iget-boolean v2, p0, Landroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1;->$inTransaction:Z

    .line 6
    .line 7
    iget-boolean v3, p0, Landroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1;->$isReadOnly:Z

    .line 8
    .line 9
    iget-object v4, p0, Landroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1;->$block:Lhd/l;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Landroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1;-><init>(Landroidx/room/RoomDatabase;ZZLhd/l;Lvc/c;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Landroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Landroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Landroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Landroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Landroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1;->label:I

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
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Landroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1;->$db:Landroidx/room/RoomDatabase;

    .line 28
    .line 29
    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->inCompatibilityMode$room_runtime_release()Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    iget-object p1, p0, Landroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1;->$db:Landroidx/room/RoomDatabase;

    .line 36
    .line 37
    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->inTransaction()Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-nez p1, :cond_3

    .line 42
    .line 43
    :cond_2
    iget-boolean p1, p0, Landroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1;->$inTransaction:Z

    .line 44
    .line 45
    if-eqz p1, :cond_3

    .line 46
    .line 47
    move v4, v2

    .line 48
    goto :goto_0

    .line 49
    :cond_3
    const/4 p1, 0x0

    .line 50
    move v4, p1

    .line 51
    :goto_0
    iget-object v6, p0, Landroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1;->$db:Landroidx/room/RoomDatabase;

    .line 52
    .line 53
    iget-boolean v5, p0, Landroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1;->$isReadOnly:Z

    .line 54
    .line 55
    iget-object v8, p0, Landroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1;->$block:Lhd/l;

    .line 56
    .line 57
    new-instance v3, Landroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1;

    .line 58
    .line 59
    const/4 v7, 0x0

    .line 60
    invoke-direct/range {v3 .. v8}, Landroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1;-><init>(ZZLandroidx/room/RoomDatabase;Lvc/c;Lhd/l;)V

    .line 61
    .line 62
    .line 63
    iput v2, p0, Landroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1;->label:I

    .line 64
    .line 65
    invoke-virtual {v6, v5, v3, p0}, Landroidx/room/RoomDatabase;->useConnection$room_runtime_release(ZLhd/p;Lvc/c;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    if-ne p1, v0, :cond_4

    .line 70
    .line 71
    return-object v0

    .line 72
    :cond_4
    return-object p1
.end method
