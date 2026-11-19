.class public final Lcom/zykj/blackboard/core/record/SourceRouterRecord;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/record/SourceRouterRecord$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/zykj/blackboard/core/record/SourceRouterRecord$Companion;

.field public static final SOURCE_RES_IMAGE:Ljava/lang/String; = "res"


# instance fields
.field private final audioCommandRecord:Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord;

.field private final commandRecord:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

.field private record:Lcom/zykj/blackboard/core/data/dao/RecordEntity;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/blackboard/core/record/SourceRouterRecord$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/blackboard/core/record/SourceRouterRecord$Companion;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/blackboard/core/record/SourceRouterRecord;->Companion:Lcom/zykj/blackboard/core/record/SourceRouterRecord$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/zykj/blackboard/core/record/TimeRecord;)V
    .locals 1

    .line 1
    const-string v0, "timeRecord"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;-><init>(Lcom/zykj/blackboard/core/record/TimeRecord;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/zykj/blackboard/core/record/SourceRouterRecord;->commandRecord:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 15
    .line 16
    new-instance v0, Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord;

    .line 17
    .line 18
    invoke-direct {v0, p1}, Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord;-><init>(Lcom/zykj/blackboard/core/record/TimeRecord;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lcom/zykj/blackboard/core/record/SourceRouterRecord;->audioCommandRecord:Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final getAudioRecord()Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/SourceRouterRecord;->audioCommandRecord:Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCanSave()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/SourceRouterRecord;->commandRecord:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->isExecutorsTaskDone()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final getCommandRecord()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/SourceRouterRecord;->commandRecord:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRecord()Lcom/zykj/blackboard/core/data/dao/RecordEntity;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/SourceRouterRecord;->record:Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 2
    .line 3
    return-object v0
.end method

.method public final initRecord(Lcom/zykj/blackboard/core/data/dao/RecordEntity;)V
    .locals 1

    .line 1
    const-string v0, "record"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/core/record/SourceRouterRecord;->record:Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/SourceRouterRecord;->commandRecord:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->setRecord(Lcom/zykj/blackboard/core/data/dao/RecordEntity;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/SourceRouterRecord;->audioCommandRecord:Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord;->setRecord(Lcom/zykj/blackboard/core/data/dao/RecordEntity;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final setRecord(Lcom/zykj/blackboard/core/data/dao/RecordEntity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/record/SourceRouterRecord;->record:Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 2
    .line 3
    return-void
.end method
