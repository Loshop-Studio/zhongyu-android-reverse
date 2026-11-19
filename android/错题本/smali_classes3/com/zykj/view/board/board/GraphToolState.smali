.class public final Lcom/zykj/view/board/board/GraphToolState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B9\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0008H\u00c6\u0003J;\u0010\u0017\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008H\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00032\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000cR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000cR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000cR\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/zykj/view/board/board/GraphToolState;",
        "",
        "galleryVisible",
        "",
        "cameraVisible",
        "textVisible",
        "graphVisible",
        "graphType",
        "Lcom/zykj/view/board/board/GraphType;",
        "<init>",
        "(ZZZZLcom/zykj/view/board/board/GraphType;)V",
        "getGalleryVisible",
        "()Z",
        "getCameraVisible",
        "getTextVisible",
        "getGraphVisible",
        "getGraphType",
        "()Lcom/zykj/view/board/board/GraphType;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "view_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final cameraVisible:Z

.field private final galleryVisible:Z

.field private final graphType:Lcom/zykj/view/board/board/GraphType;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final graphVisible:Z

.field private final textVisible:Z


# direct methods
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

    invoke-direct/range {v0 .. v7}, Lcom/zykj/view/board/board/GraphToolState;-><init>(ZZZZLcom/zykj/view/board/board/GraphType;ILkotlin/jvm/internal/e;)V

    return-void
.end method

.method public constructor <init>(ZZZZLcom/zykj/view/board/board/GraphType;)V
    .locals 1
    .param p5    # Lcom/zykj/view/board/board/GraphType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "graphType"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Lcom/zykj/view/board/board/GraphToolState;->galleryVisible:Z

    .line 4
    iput-boolean p2, p0, Lcom/zykj/view/board/board/GraphToolState;->cameraVisible:Z

    .line 5
    iput-boolean p3, p0, Lcom/zykj/view/board/board/GraphToolState;->textVisible:Z

    .line 6
    iput-boolean p4, p0, Lcom/zykj/view/board/board/GraphToolState;->graphVisible:Z

    .line 7
    iput-object p5, p0, Lcom/zykj/view/board/board/GraphToolState;->graphType:Lcom/zykj/view/board/board/GraphType;

    return-void
.end method

.method public synthetic constructor <init>(ZZZZLcom/zykj/view/board/board/GraphType;ILkotlin/jvm/internal/e;)V
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

    .line 8
    sget-object p5, Lcom/zykj/view/board/board/GraphType$Null;->INSTANCE:Lcom/zykj/view/board/board/GraphType$Null;

    :cond_4
    move-object p6, p5

    move p5, p4

    move p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    .line 9
    invoke-direct/range {p1 .. p6}, Lcom/zykj/view/board/board/GraphToolState;-><init>(ZZZZLcom/zykj/view/board/board/GraphType;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/view/board/board/GraphToolState;ZZZZLcom/zykj/view/board/board/GraphType;ILjava/lang/Object;)Lcom/zykj/view/board/board/GraphToolState;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-boolean p1, p0, Lcom/zykj/view/board/board/GraphToolState;->galleryVisible:Z

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-boolean p2, p0, Lcom/zykj/view/board/board/GraphToolState;->cameraVisible:Z

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-boolean p3, p0, Lcom/zykj/view/board/board/GraphToolState;->textVisible:Z

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-boolean p4, p0, Lcom/zykj/view/board/board/GraphToolState;->graphVisible:Z

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/zykj/view/board/board/GraphToolState;->graphType:Lcom/zykj/view/board/board/GraphType;

    :cond_4
    move p6, p4

    move-object p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/zykj/view/board/board/GraphToolState;->copy(ZZZZLcom/zykj/view/board/board/GraphType;)Lcom/zykj/view/board/board/GraphToolState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/view/board/board/GraphToolState;->galleryVisible:Z

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/view/board/board/GraphToolState;->cameraVisible:Z

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/view/board/board/GraphToolState;->textVisible:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/view/board/board/GraphToolState;->graphVisible:Z

    return v0
.end method

.method public final component5()Lcom/zykj/view/board/board/GraphType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/zykj/view/board/board/GraphToolState;->graphType:Lcom/zykj/view/board/board/GraphType;

    return-object v0
.end method

.method public final copy(ZZZZLcom/zykj/view/board/board/GraphType;)Lcom/zykj/view/board/board/GraphToolState;
    .locals 7
    .param p5    # Lcom/zykj/view/board/board/GraphType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "graphType"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/zykj/view/board/board/GraphToolState;

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/zykj/view/board/board/GraphToolState;-><init>(ZZZZLcom/zykj/view/board/board/GraphType;)V

    return-object v1
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
    instance-of v1, p1, Lcom/zykj/view/board/board/GraphToolState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/view/board/board/GraphToolState;

    iget-boolean v1, p0, Lcom/zykj/view/board/board/GraphToolState;->galleryVisible:Z

    iget-boolean v3, p1, Lcom/zykj/view/board/board/GraphToolState;->galleryVisible:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/zykj/view/board/board/GraphToolState;->cameraVisible:Z

    iget-boolean v3, p1, Lcom/zykj/view/board/board/GraphToolState;->cameraVisible:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/zykj/view/board/board/GraphToolState;->textVisible:Z

    iget-boolean v3, p1, Lcom/zykj/view/board/board/GraphToolState;->textVisible:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/zykj/view/board/board/GraphToolState;->graphVisible:Z

    iget-boolean v3, p1, Lcom/zykj/view/board/board/GraphToolState;->graphVisible:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/zykj/view/board/board/GraphToolState;->graphType:Lcom/zykj/view/board/board/GraphType;

    iget-object p1, p1, Lcom/zykj/view/board/board/GraphToolState;->graphType:Lcom/zykj/view/board/board/GraphType;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getCameraVisible()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/GraphToolState;->cameraVisible:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getGalleryVisible()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/GraphToolState;->galleryVisible:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getGraphType()Lcom/zykj/view/board/board/GraphType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/GraphToolState;->graphType:Lcom/zykj/view/board/board/GraphType;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getGraphVisible()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/GraphToolState;->graphVisible:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getTextVisible()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/GraphToolState;->textVisible:Z

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/GraphToolState;->galleryVisible:Z

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-boolean v2, p0, Lcom/zykj/view/board/board/GraphToolState;->cameraVisible:Z

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean v2, p0, Lcom/zykj/view/board/board/GraphToolState;->textVisible:Z

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-boolean v2, p0, Lcom/zykj/view/board/board/GraphToolState;->graphVisible:Z

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v1, p0, Lcom/zykj/view/board/board/GraphToolState;->graphType:Lcom/zykj/view/board/board/GraphType;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    add-int/2addr v1, v0

    .line 35
    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/GraphToolState;->galleryVisible:Z

    .line 2
    .line 3
    iget-boolean v1, p0, Lcom/zykj/view/board/board/GraphToolState;->cameraVisible:Z

    .line 4
    .line 5
    iget-boolean v2, p0, Lcom/zykj/view/board/board/GraphToolState;->textVisible:Z

    .line 6
    .line 7
    iget-boolean v3, p0, Lcom/zykj/view/board/board/GraphToolState;->graphVisible:Z

    .line 8
    .line 9
    iget-object v4, p0, Lcom/zykj/view/board/board/GraphToolState;->graphType:Lcom/zykj/view/board/board/GraphType;

    .line 10
    .line 11
    new-instance v5, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v6, "GraphToolState(galleryVisible="

    .line 14
    .line 15
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v0, ", cameraVisible="

    .line 22
    .line 23
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v0, ", textVisible="

    .line 30
    .line 31
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v0, ", graphVisible="

    .line 35
    .line 36
    const-string v1, ", graphType="

    .line 37
    .line 38
    invoke-static {v0, v1, v5, v2, v3}, Landroidx/compose/material3/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v0, ")"

    .line 45
    .line 46
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    return-object v0
.end method
