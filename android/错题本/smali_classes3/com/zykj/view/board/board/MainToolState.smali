.class public final Lcom/zykj/view/board/board/MainToolState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001BC\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\tH\u00c6\u0003JE\u0010\u0017\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0008\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00032\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\rR\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/zykj/view/board/board/MainToolState;",
        "",
        "revokeVisible",
        "",
        "zoomVisible",
        "isWithdrawEnable",
        "isRecoverEnable",
        "isTouchable",
        "mainToolType",
        "Lcom/zykj/view/board/board/MainToolType;",
        "<init>",
        "(ZZZZZLcom/zykj/view/board/board/MainToolType;)V",
        "getRevokeVisible",
        "()Z",
        "getZoomVisible",
        "getMainToolType",
        "()Lcom/zykj/view/board/board/MainToolType;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
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
.field private final isRecoverEnable:Z

.field private final isTouchable:Z

.field private final isWithdrawEnable:Z

.field private final mainToolType:Lcom/zykj/view/board/board/MainToolType;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final revokeVisible:Z

.field private final zoomVisible:Z


# direct methods
.method public constructor <init>()V
    .locals 9

    .line 1
    const/16 v7, 0x3f

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Lcom/zykj/view/board/board/MainToolState;-><init>(ZZZZZLcom/zykj/view/board/board/MainToolType;ILkotlin/jvm/internal/e;)V

    return-void
.end method

.method public constructor <init>(ZZZZZLcom/zykj/view/board/board/MainToolType;)V
    .locals 1
    .param p6    # Lcom/zykj/view/board/board/MainToolType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "mainToolType"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Lcom/zykj/view/board/board/MainToolState;->revokeVisible:Z

    .line 4
    iput-boolean p2, p0, Lcom/zykj/view/board/board/MainToolState;->zoomVisible:Z

    .line 5
    iput-boolean p3, p0, Lcom/zykj/view/board/board/MainToolState;->isWithdrawEnable:Z

    .line 6
    iput-boolean p4, p0, Lcom/zykj/view/board/board/MainToolState;->isRecoverEnable:Z

    .line 7
    iput-boolean p5, p0, Lcom/zykj/view/board/board/MainToolState;->isTouchable:Z

    .line 8
    iput-object p6, p0, Lcom/zykj/view/board/board/MainToolState;->mainToolType:Lcom/zykj/view/board/board/MainToolType;

    return-void
.end method

.method public synthetic constructor <init>(ZZZZZLcom/zykj/view/board/board/MainToolType;ILkotlin/jvm/internal/e;)V
    .locals 1

    and-int/lit8 p8, p7, 0x1

    const/4 v0, 0x0

    if-eqz p8, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    move p5, v0

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    .line 9
    sget-object p6, Lcom/zykj/view/board/board/MainToolType$Select;->INSTANCE:Lcom/zykj/view/board/board/MainToolType$Select;

    :cond_5
    move-object p7, p6

    move p6, p5

    move p5, p4

    move p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    .line 10
    invoke-direct/range {p1 .. p7}, Lcom/zykj/view/board/board/MainToolState;-><init>(ZZZZZLcom/zykj/view/board/board/MainToolType;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/view/board/board/MainToolState;ZZZZZLcom/zykj/view/board/board/MainToolType;ILjava/lang/Object;)Lcom/zykj/view/board/board/MainToolState;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-boolean p1, p0, Lcom/zykj/view/board/board/MainToolState;->revokeVisible:Z

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-boolean p2, p0, Lcom/zykj/view/board/board/MainToolState;->zoomVisible:Z

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-boolean p3, p0, Lcom/zykj/view/board/board/MainToolState;->isWithdrawEnable:Z

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-boolean p4, p0, Lcom/zykj/view/board/board/MainToolState;->isRecoverEnable:Z

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-boolean p5, p0, Lcom/zykj/view/board/board/MainToolState;->isTouchable:Z

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/zykj/view/board/board/MainToolState;->mainToolType:Lcom/zykj/view/board/board/MainToolType;

    :cond_5
    move p7, p5

    move-object p8, p6

    move p5, p3

    move p6, p4

    move p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/zykj/view/board/board/MainToolState;->copy(ZZZZZLcom/zykj/view/board/board/MainToolType;)Lcom/zykj/view/board/board/MainToolState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/view/board/board/MainToolState;->revokeVisible:Z

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/view/board/board/MainToolState;->zoomVisible:Z

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/view/board/board/MainToolState;->isWithdrawEnable:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/view/board/board/MainToolState;->isRecoverEnable:Z

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/view/board/board/MainToolState;->isTouchable:Z

    return v0
.end method

.method public final component6()Lcom/zykj/view/board/board/MainToolType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/zykj/view/board/board/MainToolState;->mainToolType:Lcom/zykj/view/board/board/MainToolType;

    return-object v0
.end method

.method public final copy(ZZZZZLcom/zykj/view/board/board/MainToolType;)Lcom/zykj/view/board/board/MainToolState;
    .locals 8
    .param p6    # Lcom/zykj/view/board/board/MainToolType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "mainToolType"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/zykj/view/board/board/MainToolState;

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/zykj/view/board/board/MainToolState;-><init>(ZZZZZLcom/zykj/view/board/board/MainToolType;)V

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
    instance-of v1, p1, Lcom/zykj/view/board/board/MainToolState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/view/board/board/MainToolState;

    iget-boolean v1, p0, Lcom/zykj/view/board/board/MainToolState;->revokeVisible:Z

    iget-boolean v3, p1, Lcom/zykj/view/board/board/MainToolState;->revokeVisible:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/zykj/view/board/board/MainToolState;->zoomVisible:Z

    iget-boolean v3, p1, Lcom/zykj/view/board/board/MainToolState;->zoomVisible:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/zykj/view/board/board/MainToolState;->isWithdrawEnable:Z

    iget-boolean v3, p1, Lcom/zykj/view/board/board/MainToolState;->isWithdrawEnable:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/zykj/view/board/board/MainToolState;->isRecoverEnable:Z

    iget-boolean v3, p1, Lcom/zykj/view/board/board/MainToolState;->isRecoverEnable:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/zykj/view/board/board/MainToolState;->isTouchable:Z

    iget-boolean v3, p1, Lcom/zykj/view/board/board/MainToolState;->isTouchable:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/zykj/view/board/board/MainToolState;->mainToolType:Lcom/zykj/view/board/board/MainToolType;

    iget-object p1, p1, Lcom/zykj/view/board/board/MainToolState;->mainToolType:Lcom/zykj/view/board/board/MainToolType;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getMainToolType()Lcom/zykj/view/board/board/MainToolType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/MainToolState;->mainToolType:Lcom/zykj/view/board/board/MainToolType;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRevokeVisible()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/MainToolState;->revokeVisible:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getZoomVisible()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/MainToolState;->zoomVisible:Z

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/MainToolState;->revokeVisible:Z

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
    iget-boolean v2, p0, Lcom/zykj/view/board/board/MainToolState;->zoomVisible:Z

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean v2, p0, Lcom/zykj/view/board/board/MainToolState;->isWithdrawEnable:Z

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-boolean v2, p0, Lcom/zykj/view/board/board/MainToolState;->isRecoverEnable:Z

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-boolean v2, p0, Lcom/zykj/view/board/board/MainToolState;->isTouchable:Z

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v1, p0, Lcom/zykj/view/board/board/MainToolState;->mainToolType:Lcom/zykj/view/board/board/MainToolType;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    add-int/2addr v1, v0

    .line 41
    return v1
.end method

.method public final isRecoverEnable()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/MainToolState;->isRecoverEnable:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isTouchable()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/MainToolState;->isTouchable:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isWithdrawEnable()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/MainToolState;->isWithdrawEnable:Z

    .line 2
    .line 3
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/MainToolState;->revokeVisible:Z

    .line 2
    .line 3
    iget-boolean v1, p0, Lcom/zykj/view/board/board/MainToolState;->zoomVisible:Z

    .line 4
    .line 5
    iget-boolean v2, p0, Lcom/zykj/view/board/board/MainToolState;->isWithdrawEnable:Z

    .line 6
    .line 7
    iget-boolean v3, p0, Lcom/zykj/view/board/board/MainToolState;->isRecoverEnable:Z

    .line 8
    .line 9
    iget-boolean v4, p0, Lcom/zykj/view/board/board/MainToolState;->isTouchable:Z

    .line 10
    .line 11
    iget-object v5, p0, Lcom/zykj/view/board/board/MainToolState;->mainToolType:Lcom/zykj/view/board/board/MainToolType;

    .line 12
    .line 13
    new-instance v6, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v7, "MainToolState(revokeVisible="

    .line 16
    .line 17
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v0, ", zoomVisible="

    .line 24
    .line 25
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v0, ", isWithdrawEnable="

    .line 32
    .line 33
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v0, ", isRecoverEnable="

    .line 37
    .line 38
    const-string v1, ", isTouchable="

    .line 39
    .line 40
    invoke-static {v0, v1, v6, v2, v3}, Landroidx/compose/material3/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v0, ", mainToolType="

    .line 47
    .line 48
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v0, ")"

    .line 55
    .line 56
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    return-object v0
.end method
