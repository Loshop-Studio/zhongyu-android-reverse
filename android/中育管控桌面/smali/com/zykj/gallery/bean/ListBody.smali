.class public final Lcom/zykj/gallery/bean/ListBody;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u000e\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u000c\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/zykj/gallery/bean/ListBody;",
        "",
        "skipCount",
        "",
        "maxResultCount",
        "isRecycleBin",
        "",
        "<init>",
        "(IIZ)V",
        "getSkipCount",
        "()I",
        "getMaxResultCount",
        "()Z",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "other",
        "hashCode",
        "toString",
        "",
        "module_gallery_release"
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
.field private final isRecycleBin:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "IsRecycleBin"
    .end annotation
.end field

.field private final maxResultCount:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "MaxResultCount"
    .end annotation
.end field

.field private final skipCount:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "SkipCount"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(IIZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/zykj/gallery/bean/ListBody;->skipCount:I

    .line 5
    .line 6
    iput p2, p0, Lcom/zykj/gallery/bean/ListBody;->maxResultCount:I

    .line 7
    .line 8
    iput-boolean p3, p0, Lcom/zykj/gallery/bean/ListBody;->isRecycleBin:Z

    .line 9
    .line 10
    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/gallery/bean/ListBody;IIZILjava/lang/Object;)Lcom/zykj/gallery/bean/ListBody;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget p1, p0, Lcom/zykj/gallery/bean/ListBody;->skipCount:I

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget p2, p0, Lcom/zykj/gallery/bean/ListBody;->maxResultCount:I

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-boolean p3, p0, Lcom/zykj/gallery/bean/ListBody;->isRecycleBin:Z

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/gallery/bean/ListBody;->copy(IIZ)Lcom/zykj/gallery/bean/ListBody;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/zykj/gallery/bean/ListBody;->skipCount:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/zykj/gallery/bean/ListBody;->maxResultCount:I

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/gallery/bean/ListBody;->isRecycleBin:Z

    return v0
.end method

.method public final copy(IIZ)Lcom/zykj/gallery/bean/ListBody;
    .locals 1

    new-instance v0, Lcom/zykj/gallery/bean/ListBody;

    invoke-direct {v0, p1, p2, p3}, Lcom/zykj/gallery/bean/ListBody;-><init>(IIZ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/gallery/bean/ListBody;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/gallery/bean/ListBody;

    iget v1, p0, Lcom/zykj/gallery/bean/ListBody;->skipCount:I

    iget v3, p1, Lcom/zykj/gallery/bean/ListBody;->skipCount:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/zykj/gallery/bean/ListBody;->maxResultCount:I

    iget v3, p1, Lcom/zykj/gallery/bean/ListBody;->maxResultCount:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/zykj/gallery/bean/ListBody;->isRecycleBin:Z

    iget-boolean p1, p1, Lcom/zykj/gallery/bean/ListBody;->isRecycleBin:Z

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getMaxResultCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/gallery/bean/ListBody;->maxResultCount:I

    .line 2
    .line 3
    return v0
.end method

.method public final getSkipCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/gallery/bean/ListBody;->skipCount:I

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/zykj/gallery/bean/ListBody;->skipCount:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/gallery/bean/ListBody;->maxResultCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/gallery/bean/ListBody;->isRecycleBin:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isRecycleBin()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/gallery/bean/ListBody;->isRecycleBin:Z

    .line 2
    .line 3
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget v0, p0, Lcom/zykj/gallery/bean/ListBody;->skipCount:I

    iget v1, p0, Lcom/zykj/gallery/bean/ListBody;->maxResultCount:I

    iget-boolean v2, p0, Lcom/zykj/gallery/bean/ListBody;->isRecycleBin:Z

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "ListBody(skipCount="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", maxResultCount="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", isRecycleBin="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
