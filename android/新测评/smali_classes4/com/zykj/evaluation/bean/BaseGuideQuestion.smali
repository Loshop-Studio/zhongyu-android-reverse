.class public Lcom/zykj/evaluation/bean/BaseGuideQuestion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u0006\n\u0002\u0008\u0006\u0008\u0017\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0006\u0010\u001a\u001a\u00020\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0013\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000c\u001a\u00020\tX\u0086D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u000fX\u0086D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000fX\u0086D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u0015X\u0086D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u0015X\u0086D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0017\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/zykj/evaluation/bean/BaseGuideQuestion;",
        "",
        "<init>",
        "()V",
        "id",
        "",
        "getId",
        "()J",
        "name",
        "",
        "getName",
        "()Ljava/lang/String;",
        "number",
        "getNumber",
        "askForHelp",
        "",
        "getAskForHelp",
        "()Z",
        "completed",
        "getCompleted",
        "score",
        "",
        "getScore",
        "()D",
        "myScore",
        "getMyScore",
        "getTitle",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final askForHelp:Z

.field private final completed:Z

.field private final id:J

.field private final myScore:D

.field private final name:Ljava/lang/String;

.field private final number:Ljava/lang/String;

.field private final score:D


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lcom/zykj/evaluation/bean/BaseGuideQuestion;->number:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final getAskForHelp()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/evaluation/bean/BaseGuideQuestion;->askForHelp:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getCompleted()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/evaluation/bean/BaseGuideQuestion;->completed:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/evaluation/bean/BaseGuideQuestion;->id:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getMyScore()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/evaluation/bean/BaseGuideQuestion;->myScore:D

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/bean/BaseGuideQuestion;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getNumber()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/bean/BaseGuideQuestion;->number:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getScore()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/evaluation/bean/BaseGuideQuestion;->score:D

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/bean/BaseGuideQuestion;->name:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/zykj/evaluation/bean/BaseGuideQuestion;->name:Ljava/lang/String;

    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/zykj/evaluation/bean/BaseGuideQuestion;->number:Ljava/lang/String;

    .line 16
    .line 17
    return-object v0
.end method
