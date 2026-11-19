.class public final Lcom/zykj/download/FileCheckDownloadResult;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# instance fields
.field private final downloadEntity:Lcom/zykj/download/data/DownloadEntity;

.field private final resultType:Lcom/zykj/download/FileCheckResultType;


# direct methods
.method public constructor <init>(Lcom/zykj/download/FileCheckResultType;Lcom/zykj/download/data/DownloadEntity;)V
    .locals 1

    const-string v0, "resultType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/zykj/download/FileCheckDownloadResult;->resultType:Lcom/zykj/download/FileCheckResultType;

    .line 3
    iput-object p2, p0, Lcom/zykj/download/FileCheckDownloadResult;->downloadEntity:Lcom/zykj/download/data/DownloadEntity;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/download/FileCheckResultType;Lcom/zykj/download/data/DownloadEntity;ILkotlin/jvm/internal/n;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 4
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/zykj/download/FileCheckDownloadResult;-><init>(Lcom/zykj/download/FileCheckResultType;Lcom/zykj/download/data/DownloadEntity;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/download/FileCheckDownloadResult;Lcom/zykj/download/FileCheckResultType;Lcom/zykj/download/data/DownloadEntity;ILjava/lang/Object;)Lcom/zykj/download/FileCheckDownloadResult;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/zykj/download/FileCheckDownloadResult;->resultType:Lcom/zykj/download/FileCheckResultType;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/zykj/download/FileCheckDownloadResult;->downloadEntity:Lcom/zykj/download/data/DownloadEntity;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/download/FileCheckDownloadResult;->copy(Lcom/zykj/download/FileCheckResultType;Lcom/zykj/download/data/DownloadEntity;)Lcom/zykj/download/FileCheckDownloadResult;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/zykj/download/FileCheckResultType;
    .locals 1

    iget-object v0, p0, Lcom/zykj/download/FileCheckDownloadResult;->resultType:Lcom/zykj/download/FileCheckResultType;

    return-object v0
.end method

.method public final component2()Lcom/zykj/download/data/DownloadEntity;
    .locals 1

    iget-object v0, p0, Lcom/zykj/download/FileCheckDownloadResult;->downloadEntity:Lcom/zykj/download/data/DownloadEntity;

    return-object v0
.end method

.method public final copy(Lcom/zykj/download/FileCheckResultType;Lcom/zykj/download/data/DownloadEntity;)Lcom/zykj/download/FileCheckDownloadResult;
    .locals 1

    const-string v0, "resultType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/zykj/download/FileCheckDownloadResult;

    invoke-direct {v0, p1, p2}, Lcom/zykj/download/FileCheckDownloadResult;-><init>(Lcom/zykj/download/FileCheckResultType;Lcom/zykj/download/data/DownloadEntity;)V

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
    iget-object v1, p0, Lcom/zykj/download/FileCheckDownloadResult;->downloadEntity:Lcom/zykj/download/data/DownloadEntity;

    iget-object p1, p1, Lcom/zykj/download/FileCheckDownloadResult;->downloadEntity:Lcom/zykj/download/data/DownloadEntity;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getDownloadEntity()Lcom/zykj/download/data/DownloadEntity;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/download/FileCheckDownloadResult;->downloadEntity:Lcom/zykj/download/data/DownloadEntity;

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

    iget-object v1, p0, Lcom/zykj/download/FileCheckDownloadResult;->downloadEntity:Lcom/zykj/download/data/DownloadEntity;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/zykj/download/data/DownloadEntity;->hashCode()I

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

    iget-object v1, p0, Lcom/zykj/download/FileCheckDownloadResult;->downloadEntity:Lcom/zykj/download/data/DownloadEntity;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
