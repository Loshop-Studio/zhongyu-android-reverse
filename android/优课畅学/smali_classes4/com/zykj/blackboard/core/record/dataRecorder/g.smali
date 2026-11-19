.class public final synthetic Lcom/zykj/blackboard/core/record/dataRecorder/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

.field public final synthetic b:J

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

.field public final synthetic f:Lcom/zykj/blackboard/bean/BackgroundLineConfig;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JIILcom/zykj/blackboard/bean/BackgroundLineConfig;Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/g;->a:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    iput-wide p2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/g;->b:J

    iput p4, p0, Lcom/zykj/blackboard/core/record/dataRecorder/g;->c:I

    iput p5, p0, Lcom/zykj/blackboard/core/record/dataRecorder/g;->d:I

    iput-object p6, p0, Lcom/zykj/blackboard/core/record/dataRecorder/g;->e:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    iput-object p7, p0, Lcom/zykj/blackboard/core/record/dataRecorder/g;->f:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/g;->a:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    iget-wide v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/g;->b:J

    iget v3, p0, Lcom/zykj/blackboard/core/record/dataRecorder/g;->c:I

    iget v4, p0, Lcom/zykj/blackboard/core/record/dataRecorder/g;->d:I

    iget-object v5, p0, Lcom/zykj/blackboard/core/record/dataRecorder/g;->e:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    iget-object v6, p0, Lcom/zykj/blackboard/core/record/dataRecorder/g;->f:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    invoke-static/range {v0 .. v6}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->g(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JIILcom/zykj/blackboard/bean/BackgroundLineConfig;Lcom/zykj/blackboard/bean/BackgroundLineConfig;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    move-result-object v0

    return-object v0
.end method
