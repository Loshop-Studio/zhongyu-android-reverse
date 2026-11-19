.class public final Lcom/zykj/view/board/board/RecordState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000e\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B%\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0004\u0010\u000cR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/zykj/view/board/board/RecordState;",
        "",
        "recordStatus",
        "Lcom/zykj/view/board/board/RecordStatus;",
        "isMicrophoneOn",
        "",
        "progress",
        "",
        "<init>",
        "(Lcom/zykj/view/board/board/RecordStatus;ZLjava/lang/String;)V",
        "getRecordStatus",
        "()Lcom/zykj/view/board/board/RecordStatus;",
        "()Z",
        "getProgress",
        "()Ljava/lang/String;",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "view_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final isMicrophoneOn:Z

.field private final progress:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final recordStatus:Lcom/zykj/view/board/board/RecordStatus;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/zykj/view/board/board/RecordState;-><init>(Lcom/zykj/view/board/board/RecordStatus;ZLjava/lang/String;ILkotlin/jvm/internal/e;)V

    return-void
.end method

.method public constructor <init>(Lcom/zykj/view/board/board/RecordStatus;ZLjava/lang/String;)V
    .locals 1
    .param p1    # Lcom/zykj/view/board/board/RecordStatus;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "recordStatus"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "progress"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/zykj/view/board/board/RecordState;->recordStatus:Lcom/zykj/view/board/board/RecordStatus;

    .line 4
    iput-boolean p2, p0, Lcom/zykj/view/board/board/RecordState;->isMicrophoneOn:Z

    .line 5
    iput-object p3, p0, Lcom/zykj/view/board/board/RecordState;->progress:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/view/board/board/RecordStatus;ZLjava/lang/String;ILkotlin/jvm/internal/e;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    .line 6
    sget-object p1, Lcom/zykj/view/board/board/RecordStatus$Init;->INSTANCE:Lcom/zykj/view/board/board/RecordStatus$Init;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    const/4 p2, 0x0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    .line 7
    const-string p3, "00:00"

    .line 8
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/view/board/board/RecordState;-><init>(Lcom/zykj/view/board/board/RecordStatus;ZLjava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/view/board/board/RecordState;Lcom/zykj/view/board/board/RecordStatus;ZLjava/lang/String;ILjava/lang/Object;)Lcom/zykj/view/board/board/RecordState;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/zykj/view/board/board/RecordState;->recordStatus:Lcom/zykj/view/board/board/RecordStatus;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-boolean p2, p0, Lcom/zykj/view/board/board/RecordState;->isMicrophoneOn:Z

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/zykj/view/board/board/RecordState;->progress:Ljava/lang/String;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/view/board/board/RecordState;->copy(Lcom/zykj/view/board/board/RecordStatus;ZLjava/lang/String;)Lcom/zykj/view/board/board/RecordState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/zykj/view/board/board/RecordStatus;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/zykj/view/board/board/RecordState;->recordStatus:Lcom/zykj/view/board/board/RecordStatus;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/view/board/board/RecordState;->isMicrophoneOn:Z

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/zykj/view/board/board/RecordState;->progress:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/zykj/view/board/board/RecordStatus;ZLjava/lang/String;)Lcom/zykj/view/board/board/RecordState;
    .locals 1
    .param p1    # Lcom/zykj/view/board/board/RecordStatus;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "recordStatus"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "progress"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/zykj/view/board/board/RecordState;

    invoke-direct {v0, p1, p2, p3}, Lcom/zykj/view/board/board/RecordState;-><init>(Lcom/zykj/view/board/board/RecordStatus;ZLjava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/view/board/board/RecordState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/view/board/board/RecordState;

    iget-object v1, p0, Lcom/zykj/view/board/board/RecordState;->recordStatus:Lcom/zykj/view/board/board/RecordStatus;

    iget-object v3, p1, Lcom/zykj/view/board/board/RecordState;->recordStatus:Lcom/zykj/view/board/board/RecordStatus;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/zykj/view/board/board/RecordState;->isMicrophoneOn:Z

    iget-boolean v3, p1, Lcom/zykj/view/board/board/RecordState;->isMicrophoneOn:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/zykj/view/board/board/RecordState;->progress:Ljava/lang/String;

    iget-object p1, p1, Lcom/zykj/view/board/board/RecordState;->progress:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getProgress()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/RecordState;->progress:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRecordStatus()Lcom/zykj/view/board/board/RecordStatus;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/RecordState;->recordStatus:Lcom/zykj/view/board/board/RecordStatus;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/RecordState;->recordStatus:Lcom/zykj/view/board/board/RecordStatus;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-boolean v2, p0, Lcom/zykj/view/board/board/RecordState;->isMicrophoneOn:Z

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v1, p0, Lcom/zykj/view/board/board/RecordState;->progress:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    add-int/2addr v1, v0

    .line 23
    return v1
.end method

.method public final isMicrophoneOn()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/RecordState;->isMicrophoneOn:Z

    .line 2
    .line 3
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/RecordState;->recordStatus:Lcom/zykj/view/board/board/RecordStatus;

    .line 2
    .line 3
    iget-boolean v1, p0, Lcom/zykj/view/board/board/RecordState;->isMicrophoneOn:Z

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/view/board/board/RecordState;->progress:Ljava/lang/String;

    .line 6
    .line 7
    new-instance v3, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v4, "RecordState(recordStatus="

    .line 10
    .line 11
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v0, ", isMicrophoneOn="

    .line 18
    .line 19
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v0, ", progress="

    .line 26
    .line 27
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v0, ")"

    .line 31
    .line 32
    invoke-static {v3, v2, v0}, Landroid/support/v4/media/f;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    return-object v0
.end method
