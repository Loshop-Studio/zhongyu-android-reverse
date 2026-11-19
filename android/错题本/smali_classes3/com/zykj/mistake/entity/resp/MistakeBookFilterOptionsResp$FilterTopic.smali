.class public final Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterTopic;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "FilterTopic"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0008\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0010\u0008\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000b\u0010\u0007\"\u0004\u0008\u000c\u0010\tR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0014\u0010\u0010\"\u0004\u0008\u0015\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019\"\u0004\u0008\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001d\u0010\u0019\"\u0004\u0008\u001e\u0010\u001b\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterTopic;",
        "",
        "<init>",
        "()V",
        "bookId",
        "",
        "getBookId",
        "()J",
        "setBookId",
        "(J)V",
        "topicId",
        "getTopicId",
        "setTopicId",
        "topicName",
        "",
        "getTopicName",
        "()Ljava/lang/String;",
        "setTopicName",
        "(Ljava/lang/String;)V",
        "topicColor",
        "getTopicColor",
        "setTopicColor",
        "totalQstCount",
        "",
        "getTotalQstCount",
        "()I",
        "setTotalQstCount",
        "(I)V",
        "sort",
        "getSort",
        "setSort",
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
.field public static final $stable:I = 0x8


# instance fields
.field private bookId:J

.field private sort:I

.field private topicColor:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private topicId:J

.field private topicName:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private totalQstCount:I


# direct methods
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
    iput-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterTopic;->topicName:Ljava/lang/String;

    .line 7
    .line 8
    iput-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterTopic;->topicColor:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final getBookId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterTopic;->bookId:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getSort()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterTopic;->sort:I

    .line 2
    .line 3
    return v0
.end method

.method public final getTopicColor()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterTopic;->topicColor:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTopicId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterTopic;->topicId:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getTopicName()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterTopic;->topicName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTotalQstCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterTopic;->totalQstCount:I

    .line 2
    .line 3
    return v0
.end method

.method public final setBookId(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterTopic;->bookId:J

    .line 2
    .line 3
    return-void
.end method

.method public final setSort(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterTopic;->sort:I

    .line 2
    .line 3
    return-void
.end method

.method public final setTopicColor(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterTopic;->topicColor:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public final setTopicId(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterTopic;->topicId:J

    .line 2
    .line 3
    return-void
.end method

.method public final setTopicName(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterTopic;->topicName:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public final setTotalQstCount(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterTopic;->totalQstCount:I

    .line 2
    .line 3
    return-void
.end method
