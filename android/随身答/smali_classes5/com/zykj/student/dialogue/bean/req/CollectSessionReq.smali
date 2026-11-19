.class public final Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J;\u0010\u0019\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00052\u0008\u0008\u0002\u0010\t\u001a\u00020\u0005H\u00c6\u0001J\u0006\u0010\u001a\u001a\u00020\u0005J\u0013\u0010\u001b\u001a\u00020\u001c2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00d6\u0001J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0008\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u000f\u00a8\u0006&"
    }
    d2 = {
        "Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;",
        "Landroid/os/Parcelable;",
        "keyword",
        "",
        "topicId",
        "",
        "collectTime",
        "Lcom/zykj/student/dialogue/bean/req/JoinTimeReq;",
        "skip",
        "take",
        "<init>",
        "(Ljava/lang/String;ILcom/zykj/student/dialogue/bean/req/JoinTimeReq;II)V",
        "getKeyword",
        "()Ljava/lang/String;",
        "getTopicId",
        "()I",
        "getCollectTime",
        "()Lcom/zykj/student/dialogue/bean/req/JoinTimeReq;",
        "getSkip",
        "getTake",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "describeContents",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
        "writeToParcel",
        "",
        "dest",
        "Landroid/os/Parcel;",
        "flags",
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

.annotation build Lkotlinx/parcelize/Parcelize;
.end annotation


# static fields
.field public static final $stable:I

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final collectTime:Lcom/zykj/student/dialogue/bean/req/JoinTimeReq;

.field private final keyword:Ljava/lang/String;

.field private final skip:I

.field private final take:I

.field private final topicId:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq$Creator;

    invoke-direct {v0}, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq$Creator;-><init>()V

    sput-object v0, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILcom/zykj/student/dialogue/bean/req/JoinTimeReq;II)V
    .locals 1

    .line 1
    const-string v0, "keyword"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "collectTime"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;->keyword:Ljava/lang/String;

    .line 15
    .line 16
    iput p2, p0, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;->topicId:I

    .line 17
    .line 18
    iput-object p3, p0, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;->collectTime:Lcom/zykj/student/dialogue/bean/req/JoinTimeReq;

    .line 19
    .line 20
    iput p4, p0, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;->skip:I

    .line 21
    .line 22
    iput p5, p0, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;->take:I

    .line 23
    .line 24
    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;Ljava/lang/String;ILcom/zykj/student/dialogue/bean/req/JoinTimeReq;IIILjava/lang/Object;)Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;->keyword:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget p2, p0, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;->topicId:I

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;->collectTime:Lcom/zykj/student/dialogue/bean/req/JoinTimeReq;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget p4, p0, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;->skip:I

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget p5, p0, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;->take:I

    :cond_4
    move p6, p4

    move p7, p5

    move p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;->copy(Ljava/lang/String;ILcom/zykj/student/dialogue/bean/req/JoinTimeReq;II)Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;->keyword:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;->topicId:I

    return v0
.end method

.method public final component3()Lcom/zykj/student/dialogue/bean/req/JoinTimeReq;
    .locals 1

    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;->collectTime:Lcom/zykj/student/dialogue/bean/req/JoinTimeReq;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;->skip:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;->take:I

    return v0
.end method

.method public final copy(Ljava/lang/String;ILcom/zykj/student/dialogue/bean/req/JoinTimeReq;II)Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;
    .locals 7

    const-string v0, "keyword"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "collectTime"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;-><init>(Ljava/lang/String;ILcom/zykj/student/dialogue/bean/req/JoinTimeReq;II)V

    return-object v1
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;

    iget-object v1, p0, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;->keyword:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;->keyword:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;->topicId:I

    iget v3, p1, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;->topicId:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;->collectTime:Lcom/zykj/student/dialogue/bean/req/JoinTimeReq;

    iget-object v3, p1, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;->collectTime:Lcom/zykj/student/dialogue/bean/req/JoinTimeReq;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;->skip:I

    iget v3, p1, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;->skip:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;->take:I

    iget p1, p1, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;->take:I

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getCollectTime()Lcom/zykj/student/dialogue/bean/req/JoinTimeReq;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;->collectTime:Lcom/zykj/student/dialogue/bean/req/JoinTimeReq;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getKeyword()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;->keyword:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSkip()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;->skip:I

    .line 2
    .line 3
    return v0
.end method

.method public final getTake()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;->take:I

    .line 2
    .line 3
    return v0
.end method

.method public final getTopicId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;->topicId:I

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;->keyword:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;->topicId:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;->collectTime:Lcom/zykj/student/dialogue/bean/req/JoinTimeReq;

    invoke-virtual {v1}, Lcom/zykj/student/dialogue/bean/req/JoinTimeReq;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;->skip:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;->take:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;->keyword:Ljava/lang/String;

    iget v1, p0, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;->topicId:I

    iget-object v2, p0, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;->collectTime:Lcom/zykj/student/dialogue/bean/req/JoinTimeReq;

    iget v3, p0, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;->skip:I

    iget v4, p0, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;->take:I

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "CollectSessionReq(keyword="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", topicId="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", collectTime="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", skip="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", take="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;->keyword:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget v0, p0, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;->topicId:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;->collectTime:Lcom/zykj/student/dialogue/bean/req/JoinTimeReq;

    invoke-virtual {v0, p1, p2}, Lcom/zykj/student/dialogue/bean/req/JoinTimeReq;->writeToParcel(Landroid/os/Parcel;I)V

    iget p2, p0, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;->skip:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;->take:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
