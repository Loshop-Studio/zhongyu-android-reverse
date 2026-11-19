.class public final Lcom/zykj/blackboard/core/record/SourceRouterRecord;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/record/SourceRouterRecord$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\r\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\nR\u0014\u0010\u0015\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\u001c\u001a\u00020\u00198F\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/record/SourceRouterRecord;",
        "",
        "Lcom/zykj/blackboard/core/record/TimeRecord;",
        "timeRecord",
        "<init>",
        "(Lcom/zykj/blackboard/core/record/TimeRecord;)V",
        "Lcom/zykj/blackboard/core/data/dao/RecordEntity;",
        "record",
        "Ld6/s;",
        "initRecord",
        "(Lcom/zykj/blackboard/core/data/dao/RecordEntity;)V",
        "Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;",
        "getCommandRecord",
        "()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;",
        "Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord;",
        "getAudioRecord",
        "()Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord;",
        "Lcom/zykj/blackboard/core/data/dao/RecordEntity;",
        "getRecord",
        "()Lcom/zykj/blackboard/core/data/dao/RecordEntity;",
        "setRecord",
        "commandRecord",
        "Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;",
        "audioCommandRecord",
        "Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord;",
        "",
        "getCanSave",
        "()Z",
        "canSave",
        "Companion",
        "blackboard_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/zykj/blackboard/core/record/SourceRouterRecord$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final SOURCE_RES_IMAGE:Ljava/lang/String; = "res"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final audioCommandRecord:Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final commandRecord:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private record:Lcom/zykj/blackboard/core/data/dao/RecordEntity;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/blackboard/core/record/SourceRouterRecord$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/blackboard/core/record/SourceRouterRecord$Companion;-><init>(Lkotlin/jvm/internal/e;)V

    sput-object v0, Lcom/zykj/blackboard/core/record/SourceRouterRecord;->Companion:Lcom/zykj/blackboard/core/record/SourceRouterRecord$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/zykj/blackboard/core/record/TimeRecord;)V
    .locals 1
    .param p1    # Lcom/zykj/blackboard/core/record/TimeRecord;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "timeRecord"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

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
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/SourceRouterRecord;->commandRecord:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRecord()Lcom/zykj/blackboard/core/data/dao/RecordEntity;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/SourceRouterRecord;->record:Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 2
    .line 3
    return-object v0
.end method

.method public final initRecord(Lcom/zykj/blackboard/core/data/dao/RecordEntity;)V
    .locals 1
    .param p1    # Lcom/zykj/blackboard/core/data/dao/RecordEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "record"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    .param p1    # Lcom/zykj/blackboard/core/data/dao/RecordEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/record/SourceRouterRecord;->record:Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 2
    .line 3
    return-void
.end method
