.class public final Landroidx/room/coroutines/FlowUtil$createFlow$$inlined$map$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvd/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/room/coroutines/FlowUtil;->createFlow(Landroidx/room/RoomDatabase;Z[Ljava/lang/String;Lhd/l;)Lvd/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lvd/c;"
    }
.end annotation


# instance fields
.field final synthetic $block$inlined:Lhd/l;

.field final synthetic $db$inlined:Landroidx/room/RoomDatabase;

.field final synthetic $inTransaction$inlined:Z

.field final synthetic $this_unsafeTransform$inlined:Lvd/c;


# direct methods
.method public constructor <init>(Lvd/c;Landroidx/room/RoomDatabase;ZLhd/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/room/coroutines/FlowUtil$createFlow$$inlined$map$1;->$this_unsafeTransform$inlined:Lvd/c;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/room/coroutines/FlowUtil$createFlow$$inlined$map$1;->$db$inlined:Landroidx/room/RoomDatabase;

    .line 4
    .line 5
    iput-boolean p3, p0, Landroidx/room/coroutines/FlowUtil$createFlow$$inlined$map$1;->$inTransaction$inlined:Z

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/room/coroutines/FlowUtil$createFlow$$inlined$map$1;->$block$inlined:Lhd/l;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public collect(Lvd/d;Lvc/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/room/coroutines/FlowUtil$createFlow$$inlined$map$1;->$this_unsafeTransform$inlined:Lvd/c;

    .line 2
    .line 3
    new-instance v1, Landroidx/room/coroutines/FlowUtil$createFlow$$inlined$map$1$2;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/room/coroutines/FlowUtil$createFlow$$inlined$map$1;->$db$inlined:Landroidx/room/RoomDatabase;

    .line 6
    .line 7
    iget-boolean v3, p0, Landroidx/room/coroutines/FlowUtil$createFlow$$inlined$map$1;->$inTransaction$inlined:Z

    .line 8
    .line 9
    iget-object v4, p0, Landroidx/room/coroutines/FlowUtil$createFlow$$inlined$map$1;->$block$inlined:Lhd/l;

    .line 10
    .line 11
    invoke-direct {v1, p1, v2, v3, v4}, Landroidx/room/coroutines/FlowUtil$createFlow$$inlined$map$1$2;-><init>(Lvd/d;Landroidx/room/RoomDatabase;ZLhd/l;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, v1, p2}, Lvd/c;->collect(Lvd/d;Lvc/c;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    if-ne p1, p2, :cond_0

    .line 23
    .line 24
    return-object p1

    .line 25
    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 26
    .line 27
    return-object p1
.end method
