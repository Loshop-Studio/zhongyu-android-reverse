.class public final Lcom/zykj/download/FileCheckDownloadResult;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\u0008\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\n\u0010\u000bJ&\u0010\u000c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0018\u001a\u0004\u0008\u0019\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u000b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/zykj/download/FileCheckDownloadResult;",
        "",
        "Lcom/zykj/download/FileCheckResultType;",
        "resultType",
        "Lb3/b;",
        "downloadEntity",
        "<init>",
        "(Lcom/zykj/download/FileCheckResultType;Lb3/b;)V",
        "component1",
        "()Lcom/zykj/download/FileCheckResultType;",
        "component2",
        "()Lb3/b;",
        "copy",
        "(Lcom/zykj/download/FileCheckResultType;Lb3/b;)Lcom/zykj/download/FileCheckDownloadResult;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/zykj/download/FileCheckResultType;",
        "getResultType",
        "Lb3/b;",
        "getDownloadEntity",
        "download_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field private final downloadEntity:Lb3/b;

.field private final resultType:Lcom/zykj/download/FileCheckResultType;


# direct methods
.method public constructor <init>(Lcom/zykj/download/FileCheckResultType;Lb3/b;)V
    .locals 1

    const-string v0, "resultType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/zykj/download/FileCheckDownloadResult;->resultType:Lcom/zykj/download/FileCheckResultType;

    .line 3
    iput-object p2, p0, Lcom/zykj/download/FileCheckDownloadResult;->downloadEntity:Lb3/b;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/download/FileCheckResultType;Lb3/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 4
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/zykj/download/FileCheckDownloadResult;-><init>(Lcom/zykj/download/FileCheckResultType;Lb3/b;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/download/FileCheckDownloadResult;Lcom/zykj/download/FileCheckResultType;Lb3/b;ILjava/lang/Object;)Lcom/zykj/download/FileCheckDownloadResult;
    .locals 0

    .line 1
    and-int/lit8 p4, p3, 0x1

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/zykj/download/FileCheckDownloadResult;->resultType:Lcom/zykj/download/FileCheckResultType;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 8
    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Lcom/zykj/download/FileCheckDownloadResult;->downloadEntity:Lb3/b;

    .line 12
    .line 13
    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/download/FileCheckDownloadResult;->copy(Lcom/zykj/download/FileCheckResultType;Lb3/b;)Lcom/zykj/download/FileCheckDownloadResult;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/zykj/download/FileCheckResultType;
    .locals 1

    iget-object v0, p0, Lcom/zykj/download/FileCheckDownloadResult;->resultType:Lcom/zykj/download/FileCheckResultType;

    return-object v0
.end method

.method public final component2()Lb3/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/download/FileCheckDownloadResult;->downloadEntity:Lb3/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final copy(Lcom/zykj/download/FileCheckResultType;Lb3/b;)Lcom/zykj/download/FileCheckDownloadResult;
    .locals 1

    .line 1
    const-string v0, "resultType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/zykj/download/FileCheckDownloadResult;

    .line 7
    .line 8
    invoke-direct {v0, p1, p2}, Lcom/zykj/download/FileCheckDownloadResult;-><init>(Lcom/zykj/download/FileCheckResultType;Lb3/b;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/download/FileCheckDownloadResult;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/download/FileCheckDownloadResult;

    iget-object v1, p0, Lcom/zykj/download/FileCheckDownloadResult;->resultType:Lcom/zykj/download/FileCheckResultType;

    iget-object v3, p1, Lcom/zykj/download/FileCheckDownloadResult;->resultType:Lcom/zykj/download/FileCheckResultType;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/zykj/download/FileCheckDownloadResult;->downloadEntity:Lb3/b;

    iget-object p1, p1, Lcom/zykj/download/FileCheckDownloadResult;->downloadEntity:Lb3/b;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getDownloadEntity()Lb3/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/download/FileCheckDownloadResult;->downloadEntity:Lb3/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getResultType()Lcom/zykj/download/FileCheckResultType;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/download/FileCheckDownloadResult;->resultType:Lcom/zykj/download/FileCheckResultType;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/zykj/download/FileCheckDownloadResult;->resultType:Lcom/zykj/download/FileCheckResultType;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/download/FileCheckDownloadResult;->downloadEntity:Lb3/b;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lb3/b;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FileCheckDownloadResult(resultType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zykj/download/FileCheckDownloadResult;->resultType:Lcom/zykj/download/FileCheckResultType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", downloadEntity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zykj/download/FileCheckDownloadResult;->downloadEntity:Lb3/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
