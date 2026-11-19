.class public final Ln5/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln5/c$a;
    }
.end annotation


# static fields
.field public static final d:Ln5/c$a;


# instance fields
.field public a:Lcom/zykj/blackboard/core/data/dao/RecordEntity;

.field public final b:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

.field public final c:Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ln5/c$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ln5/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ln5/c;->d:Ln5/c$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ln5/e;)V
    .locals 1

    .line 1
    const-string v0, "timeRecord"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-direct {v0, p1}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;-><init>(Ln5/e;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Ln5/c;->b:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 15
    .line 16
    new-instance v0, Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord;

    .line 17
    .line 18
    invoke-direct {v0, p1}, Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord;-><init>(Ln5/e;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Ln5/c;->c:Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final a()Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord;
    .locals 1

    .line 1
    iget-object v0, p0, Ln5/c;->c:Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ln5/c;->b:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->U()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final c()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;
    .locals 1

    .line 1
    iget-object v0, p0, Ln5/c;->b:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d(Lcom/zykj/blackboard/core/data/dao/RecordEntity;)V
    .locals 1

    .line 1
    const-string v0, "record"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Ln5/c;->a:Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 7
    .line 8
    iget-object v0, p0, Ln5/c;->b:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->d0(Lcom/zykj/blackboard/core/data/dao/RecordEntity;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Ln5/c;->c:Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord;->i(Lcom/zykj/blackboard/core/data/dao/RecordEntity;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
