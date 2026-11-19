.class public final Lcom/zykj/download/FileCheckDownloadResult;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# instance fields
.field private final downloadEntity:Lv1/b;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final resultType:Lcom/zykj/download/FileCheckResultType;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/zykj/download/FileCheckResultType;Lv1/b;)V
    .locals 1
    .param p1    # Lcom/zykj/download/FileCheckResultType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lv1/b;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "resultType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/zykj/download/FileCheckDownloadResult;->resultType:Lcom/zykj/download/FileCheckResultType;

    .line 3
    iput-object p2, p0, Lcom/zykj/download/FileCheckDownloadResult;->downloadEntity:Lv1/b;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/download/FileCheckResultType;Lv1/b;ILkotlin/jvm/internal/g;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 4
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/zykj/download/FileCheckDownloadResult;-><init>(Lcom/zykj/download/FileCheckResultType;Lv1/b;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/download/FileCheckDownloadResult;Lcom/zykj/download/FileCheckResultType;Lv1/b;ILjava/lang/Object;)Lcom/zykj/download/FileCheckDownloadResult;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/zykj/download/FileCheckDownloadResult;->resultType:Lcom/zykj/download/FileCheckResultType;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/zykj/download/FileCheckDownloadResult;->downloadEntity:Lv1/b;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/download/FileCheckDownloadResult;->copy(Lcom/zykj/download/FileCheckResultType;Lv1/b;)Lcom/zykj/download/FileCheckDownloadResult;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/zykj/download/FileCheckResultType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/zykj/download/FileCheckDownloadResult;->resultType:Lcom/zykj/download/FileCheckResultType;

    return-object v0
.end method

.method public final component2()Lv1/b;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/zykj/download/FileCheckDownloadResult;->downloadEntity:Lv1/b;

    return-object v0
.end method

.method public final copy(Lcom/zykj/download/FileCheckResultType;Lv1/b;)Lcom/zykj/download/FileCheckDownloadResult;
    .locals 1
    .param p1    # Lcom/zykj/download/FileCheckResultType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lv1/b;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "resultType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/zykj/download/FileCheckDownloadResult;

    invoke-direct {v0, p1, p2}, Lcom/zykj/download/FileCheckDownloadResult;-><init>(Lcom/zykj/download/FileCheckResultType;Lv1/b;)V

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
    iget-object v1, p0, Lcom/zykj/download/FileCheckDownloadResult;->downloadEntity:Lv1/b;

    iget-object p1, p1, Lcom/zykj/download/FileCheckDownloadResult;->downloadEntity:Lv1/b;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getDownloadEntity()Lv1/b;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/zykj/download/FileCheckDownloadResult;->downloadEntity:Lv1/b;

    return-object v0
.end method

.method public final getResultType()Lcom/zykj/download/FileCheckResultType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/zykj/download/FileCheckDownloadResult;->resultType:Lcom/zykj/download/FileCheckResultType;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/zykj/download/FileCheckDownloadResult;->resultType:Lcom/zykj/download/FileCheckResultType;

    invoke-virtual {v0}, Ljava/lang/Enum;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/download/FileCheckDownloadResult;->downloadEntity:Lv1/b;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lv1/b;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FileCheckDownloadResult(resultType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zykj/download/FileCheckDownloadResult;->resultType:Lcom/zykj/download/FileCheckResultType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", downloadEntity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zykj/download/FileCheckDownloadResult;->downloadEntity:Lv1/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
