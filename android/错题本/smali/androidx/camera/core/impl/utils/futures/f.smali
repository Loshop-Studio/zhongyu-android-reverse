.class public final synthetic Landroidx/camera/core/impl/utils/futures/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:J

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;Le1/a;J)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Landroidx/camera/core/impl/utils/futures/f;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/impl/utils/futures/f;->c:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/camera/core/impl/utils/futures/f;->d:Ljava/lang/Object;

    iput-wide p3, p0, Landroidx/camera/core/impl/utils/futures/f;->b:J

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLjava/util/List;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Landroidx/camera/core/impl/utils/futures/f;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/impl/utils/futures/f;->c:Ljava/lang/Object;

    iput-wide p2, p0, Landroidx/camera/core/impl/utils/futures/f;->b:J

    iput-object p4, p0, Landroidx/camera/core/impl/utils/futures/f;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Landroidx/camera/core/impl/utils/futures/f;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/camera/core/impl/utils/futures/f;->c:Ljava/lang/Object;

    check-cast v0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    iget-object v1, p0, Landroidx/camera/core/impl/utils/futures/f;->d:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-wide v2, p0, Landroidx/camera/core/impl/utils/futures/f;->b:J

    invoke-static {v0, v2, v3, v1}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->j(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLjava/util/List;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Landroidx/camera/core/impl/utils/futures/f;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;

    iget-object v1, p0, Landroidx/camera/core/impl/utils/futures/f;->d:Ljava/lang/Object;

    check-cast v1, Le1/a;

    iget-wide v2, p0, Landroidx/camera/core/impl/utils/futures/f;->b:J

    invoke-static {v0, v1, v2, v3}, Landroidx/camera/core/impl/utils/futures/Futures;->e(Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;Le1/a;J)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
