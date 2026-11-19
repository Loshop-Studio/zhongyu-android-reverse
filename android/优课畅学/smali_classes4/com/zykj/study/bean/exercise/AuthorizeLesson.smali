.class public final Lcom/zykj/study/bean/exercise/AuthorizeLesson;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final createTime:Ljava/lang/String;

.field private final isAuthorized:Z

.field private final name:Ljava/lang/String;

.field private final userId:I

.field private final userName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V
    .locals 1

    .line 1
    const-string v0, "name"

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
    iput-object p1, p0, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->name:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p2, p0, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->userName:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p3, p0, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->createTime:Ljava/lang/String;

    .line 14
    .line 15
    iput-boolean p4, p0, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->isAuthorized:Z

    .line 16
    .line 17
    iput p5, p0, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->userId:I

    .line 18
    .line 19
    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/study/bean/exercise/AuthorizeLesson;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZIILjava/lang/Object;)Lcom/zykj/study/bean/exercise/AuthorizeLesson;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->name:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->userName:Ljava/lang/String;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->createTime:Ljava/lang/String;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-boolean p4, p0, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->isAuthorized:Z

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget p5, p0, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->userId:I

    :cond_4
    move p6, p4

    move p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)Lcom/zykj/study/bean/exercise/AuthorizeLesson;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->userName:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->createTime:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->isAuthorized:Z

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->userId:I

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)Lcom/zykj/study/bean/exercise/AuthorizeLesson;
    .locals 7

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/zykj/study/bean/exercise/AuthorizeLesson;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/zykj/study/bean/exercise/AuthorizeLesson;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/study/bean/exercise/AuthorizeLesson;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/study/bean/exercise/AuthorizeLesson;

    iget-object v1, p0, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->userName:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->userName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->createTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->createTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->isAuthorized:Z

    iget-boolean v3, p1, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->isAuthorized:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->userId:I

    iget p1, p1, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->userId:I

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getCreateTime()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->createTime:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getUserId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->userId:I

    .line 2
    .line 3
    return v0
.end method

.method public final getUserName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->userName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->name:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->userName:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->createTime:Ljava/lang/String;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->isAuthorized:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->userId:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isAuthorized()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->isAuthorized:Z

    .line 2
    .line 3
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->name:Ljava/lang/String;

    iget-object v1, p0, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->userName:Ljava/lang/String;

    iget-object v2, p0, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->createTime:Ljava/lang/String;

    iget-boolean v3, p0, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->isAuthorized:Z

    iget v4, p0, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->userId:I

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "AuthorizeLesson(name="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", userName="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", createTime="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", isAuthorized="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", userId="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
