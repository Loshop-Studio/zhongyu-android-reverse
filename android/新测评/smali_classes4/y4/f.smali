.class public final synthetic Ly4/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

.field public final synthetic b:J

.field public final synthetic c:F

.field public final synthetic d:F

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:I

.field public final synthetic g:Ljava/util/List;

.field public final synthetic h:Lcom/zykj/board/EzyPaint$Paint;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JFFLjava/lang/String;ILjava/util/List;Lcom/zykj/board/EzyPaint$Paint;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly4/f;->a:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    iput-wide p2, p0, Ly4/f;->b:J

    iput p4, p0, Ly4/f;->c:F

    iput p5, p0, Ly4/f;->d:F

    iput-object p6, p0, Ly4/f;->e:Ljava/lang/String;

    iput p7, p0, Ly4/f;->f:I

    iput-object p8, p0, Ly4/f;->g:Ljava/util/List;

    iput-object p9, p0, Ly4/f;->h:Lcom/zykj/board/EzyPaint$Paint;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Ly4/f;->a:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    iget-wide v1, p0, Ly4/f;->b:J

    iget v3, p0, Ly4/f;->c:F

    iget v4, p0, Ly4/f;->d:F

    iget-object v5, p0, Ly4/f;->e:Ljava/lang/String;

    iget v6, p0, Ly4/f;->f:I

    iget-object v7, p0, Ly4/f;->g:Ljava/util/List;

    iget-object v8, p0, Ly4/f;->h:Lcom/zykj/board/EzyPaint$Paint;

    invoke-static/range {v0 .. v8}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->e(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JFFLjava/lang/String;ILjava/util/List;Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    move-result-object v0

    return-object v0
.end method
