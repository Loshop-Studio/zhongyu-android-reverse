.class public final Lcom/zykj/mistake/entity/resp/MistakeBookResp$MistakeBook;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/mistake/entity/resp/MistakeBookResp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "MistakeBook"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0011\u0010\u0007\"\u0004\u0008\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0014\u0010\r\"\u0004\u0008\u0015\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0017\u0010\r\"\u0004\u0008\u0018\u0010\u000fR\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001b\u0010\u001c\"\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/zykj/mistake/entity/resp/MistakeBookResp$MistakeBook;",
        "",
        "<init>",
        "()V",
        "id",
        "",
        "getId",
        "()J",
        "setId",
        "(J)V",
        "topicId",
        "",
        "getTopicId",
        "()I",
        "setTopicId",
        "(I)V",
        "studentUserId",
        "getStudentUserId",
        "setStudentUserId",
        "newQstCount",
        "getNewQstCount",
        "setNewQstCount",
        "totalQstCount",
        "getTotalQstCount",
        "setTotalQstCount",
        "topic",
        "Lcom/zykj/mistake/entity/resp/MistakeBookResp$TopicInfo;",
        "getTopic",
        "()Lcom/zykj/mistake/entity/resp/MistakeBookResp$TopicInfo;",
        "setTopic",
        "(Lcom/zykj/mistake/entity/resp/MistakeBookResp$TopicInfo;)V",
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
.field private id:J

.field private newQstCount:I

.field private studentUserId:J

.field private topic:Lcom/zykj/mistake/entity/resp/MistakeBookResp$TopicInfo;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private topicId:I

.field private totalQstCount:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/zykj/mistake/entity/resp/MistakeBookResp$TopicInfo;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/zykj/mistake/entity/resp/MistakeBookResp$TopicInfo;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeBookResp$MistakeBook;->topic:Lcom/zykj/mistake/entity/resp/MistakeBookResp$TopicInfo;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final getId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/mistake/entity/resp/MistakeBookResp$MistakeBook;->id:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getNewQstCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/entity/resp/MistakeBookResp$MistakeBook;->newQstCount:I

    .line 2
    .line 3
    return v0
.end method

.method public final getStudentUserId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/mistake/entity/resp/MistakeBookResp$MistakeBook;->studentUserId:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getTopic()Lcom/zykj/mistake/entity/resp/MistakeBookResp$TopicInfo;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeBookResp$MistakeBook;->topic:Lcom/zykj/mistake/entity/resp/MistakeBookResp$TopicInfo;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTopicId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/entity/resp/MistakeBookResp$MistakeBook;->topicId:I

    .line 2
    .line 3
    return v0
.end method

.method public final getTotalQstCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/entity/resp/MistakeBookResp$MistakeBook;->totalQstCount:I

    .line 2
    .line 3
    return v0
.end method

.method public final setId(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/mistake/entity/resp/MistakeBookResp$MistakeBook;->id:J

    .line 2
    .line 3
    return-void
.end method

.method public final setNewQstCount(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/mistake/entity/resp/MistakeBookResp$MistakeBook;->newQstCount:I

    .line 2
    .line 3
    return-void
.end method

.method public final setStudentUserId(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/mistake/entity/resp/MistakeBookResp$MistakeBook;->studentUserId:J

    .line 2
    .line 3
    return-void
.end method

.method public final setTopic(Lcom/zykj/mistake/entity/resp/MistakeBookResp$TopicInfo;)V
    .locals 1
    .param p1    # Lcom/zykj/mistake/entity/resp/MistakeBookResp$TopicInfo;
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
    iput-object p1, p0, Lcom/zykj/mistake/entity/resp/MistakeBookResp$MistakeBook;->topic:Lcom/zykj/mistake/entity/resp/MistakeBookResp$TopicInfo;

    .line 7
    .line 8
    return-void
.end method

.method public final setTopicId(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/mistake/entity/resp/MistakeBookResp$MistakeBook;->topicId:I

    .line 2
    .line 3
    return-void
.end method

.method public final setTotalQstCount(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/mistake/entity/resp/MistakeBookResp$MistakeBook;->totalQstCount:I

    .line 2
    .line 3
    return-void
.end method
