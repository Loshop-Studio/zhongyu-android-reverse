.class public final Lcom/zykj/view/board/board/BackgroundToolState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u001b\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\t\u0010\u000c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/zykj/view/board/board/BackgroundToolState;",
        "",
        "backgroundLineVisible",
        "",
        "backgroundType",
        "Lcom/zykj/view/board/board/BackgroundType;",
        "<init>",
        "(ZLcom/zykj/view/board/board/BackgroundType;)V",
        "getBackgroundLineVisible",
        "()Z",
        "getBackgroundType",
        "()Lcom/zykj/view/board/board/BackgroundType;",
        "component1",
        "component2",
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
.field private final backgroundLineVisible:Z

.field private final backgroundType:Lcom/zykj/view/board/board/BackgroundType;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1, v0}, Lcom/zykj/view/board/board/BackgroundToolState;-><init>(ZLcom/zykj/view/board/board/BackgroundType;ILkotlin/jvm/internal/e;)V

    return-void
.end method

.method public constructor <init>(ZLcom/zykj/view/board/board/BackgroundType;)V
    .locals 1
    .param p2    # Lcom/zykj/view/board/board/BackgroundType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "backgroundType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Lcom/zykj/view/board/board/BackgroundToolState;->backgroundLineVisible:Z

    .line 4
    iput-object p2, p0, Lcom/zykj/view/board/board/BackgroundToolState;->backgroundType:Lcom/zykj/view/board/board/BackgroundType;

    return-void
.end method

.method public synthetic constructor <init>(ZLcom/zykj/view/board/board/BackgroundType;ILkotlin/jvm/internal/e;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    .line 5
    sget-object p2, Lcom/zykj/view/board/board/BackgroundType$ColorWhite;->INSTANCE:Lcom/zykj/view/board/board/BackgroundType$ColorWhite;

    .line 6
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/zykj/view/board/board/BackgroundToolState;-><init>(ZLcom/zykj/view/board/board/BackgroundType;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/view/board/board/BackgroundToolState;ZLcom/zykj/view/board/board/BackgroundType;ILjava/lang/Object;)Lcom/zykj/view/board/board/BackgroundToolState;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-boolean p1, p0, Lcom/zykj/view/board/board/BackgroundToolState;->backgroundLineVisible:Z

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/zykj/view/board/board/BackgroundToolState;->backgroundType:Lcom/zykj/view/board/board/BackgroundType;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BackgroundToolState;->copy(ZLcom/zykj/view/board/board/BackgroundType;)Lcom/zykj/view/board/board/BackgroundToolState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/view/board/board/BackgroundToolState;->backgroundLineVisible:Z

    return v0
.end method

.method public final component2()Lcom/zykj/view/board/board/BackgroundType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/zykj/view/board/board/BackgroundToolState;->backgroundType:Lcom/zykj/view/board/board/BackgroundType;

    return-object v0
.end method

.method public final copy(ZLcom/zykj/view/board/board/BackgroundType;)Lcom/zykj/view/board/board/BackgroundToolState;
    .locals 1
    .param p2    # Lcom/zykj/view/board/board/BackgroundType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "backgroundType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/zykj/view/board/board/BackgroundToolState;

    invoke-direct {v0, p1, p2}, Lcom/zykj/view/board/board/BackgroundToolState;-><init>(ZLcom/zykj/view/board/board/BackgroundType;)V

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
    instance-of v1, p1, Lcom/zykj/view/board/board/BackgroundToolState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/view/board/board/BackgroundToolState;

    iget-boolean v1, p0, Lcom/zykj/view/board/board/BackgroundToolState;->backgroundLineVisible:Z

    iget-boolean v3, p1, Lcom/zykj/view/board/board/BackgroundToolState;->backgroundLineVisible:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/zykj/view/board/board/BackgroundToolState;->backgroundType:Lcom/zykj/view/board/board/BackgroundType;

    iget-object p1, p1, Lcom/zykj/view/board/board/BackgroundToolState;->backgroundType:Lcom/zykj/view/board/board/BackgroundType;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getBackgroundLineVisible()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/BackgroundToolState;->backgroundLineVisible:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getBackgroundType()Lcom/zykj/view/board/board/BackgroundType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BackgroundToolState;->backgroundType:Lcom/zykj/view/board/board/BackgroundType;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Lcom/zykj/view/board/board/BackgroundToolState;->backgroundLineVisible:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/view/board/board/BackgroundToolState;->backgroundType:Lcom/zykj/view/board/board/BackgroundType;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-boolean v0, p0, Lcom/zykj/view/board/board/BackgroundToolState;->backgroundLineVisible:Z

    iget-object v1, p0, Lcom/zykj/view/board/board/BackgroundToolState;->backgroundType:Lcom/zykj/view/board/board/BackgroundType;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "BackgroundToolState(backgroundLineVisible="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", backgroundType="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
