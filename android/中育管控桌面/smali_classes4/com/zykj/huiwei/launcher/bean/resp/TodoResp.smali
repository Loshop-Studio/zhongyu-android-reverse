.class public final Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0013\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B9\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J;\u0010\u0015\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;",
        "",
        "homeworkCount",
        "",
        "reviseCount",
        "quoraCount",
        "unReadSpecialCount",
        "unReplySpecialCount",
        "<init>",
        "(IIIII)V",
        "getHomeworkCount",
        "()I",
        "getReviseCount",
        "getQuoraCount",
        "getUnReadSpecialCount",
        "getUnReplySpecialCount",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "",
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
.field private final homeworkCount:I

.field private final quoraCount:I

.field private final reviseCount:I

.field private final unReadSpecialCount:I

.field private final unReplySpecialCount:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 1
    const/16 v6, 0x1f

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;-><init>(IIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIII)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;->homeworkCount:I

    .line 4
    iput p2, p0, Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;->reviseCount:I

    .line 5
    iput p3, p0, Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;->quoraCount:I

    .line 6
    iput p4, p0, Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;->unReadSpecialCount:I

    .line 7
    iput p5, p0, Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;->unReplySpecialCount:I

    return-void
.end method

.method public synthetic constructor <init>(IIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p6, 0x1

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    move p6, v0

    :goto_0
    move p5, p4

    move p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_4
    move p6, p5

    goto :goto_0

    .line 8
    :goto_1
    invoke-direct/range {p1 .. p6}, Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;-><init>(IIIII)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;IIIIIILjava/lang/Object;)Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget p1, p0, Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;->homeworkCount:I

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget p2, p0, Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;->reviseCount:I

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget p3, p0, Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;->quoraCount:I

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget p4, p0, Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;->unReadSpecialCount:I

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget p5, p0, Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;->unReplySpecialCount:I

    :cond_4
    move p6, p4

    move p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;->copy(IIIII)Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;->homeworkCount:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;->reviseCount:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;->quoraCount:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;->unReadSpecialCount:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;->unReplySpecialCount:I

    return v0
.end method

.method public final copy(IIIII)Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;
    .locals 6

    new-instance v0, Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;-><init>(IIIII)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;

    iget v1, p0, Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;->homeworkCount:I

    iget v3, p1, Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;->homeworkCount:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;->reviseCount:I

    iget v3, p1, Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;->reviseCount:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;->quoraCount:I

    iget v3, p1, Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;->quoraCount:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;->unReadSpecialCount:I

    iget v3, p1, Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;->unReadSpecialCount:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;->unReplySpecialCount:I

    iget p1, p1, Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;->unReplySpecialCount:I

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getHomeworkCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;->homeworkCount:I

    .line 2
    .line 3
    return v0
.end method

.method public final getQuoraCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;->quoraCount:I

    .line 2
    .line 3
    return v0
.end method

.method public final getReviseCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;->reviseCount:I

    .line 2
    .line 3
    return v0
.end method

.method public final getUnReadSpecialCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;->unReadSpecialCount:I

    .line 2
    .line 3
    return v0
.end method

.method public final getUnReplySpecialCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;->unReplySpecialCount:I

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;->homeworkCount:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;->reviseCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;->quoraCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;->unReadSpecialCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;->unReplySpecialCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget v0, p0, Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;->homeworkCount:I

    iget v1, p0, Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;->reviseCount:I

    iget v2, p0, Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;->quoraCount:I

    iget v3, p0, Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;->unReadSpecialCount:I

    iget v4, p0, Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;->unReplySpecialCount:I

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "TodoResp(homeworkCount="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", reviseCount="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", quoraCount="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", unReadSpecialCount="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", unReplySpecialCount="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
