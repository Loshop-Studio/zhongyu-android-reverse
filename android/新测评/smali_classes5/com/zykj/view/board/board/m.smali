.class public final Lcom/zykj/view/board/board/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:Z

.field public final d:Z

.field public final e:Z

.field public final f:Lcom/zykj/view/board/board/n;


# direct methods
.method public constructor <init>(ZZZZZLcom/zykj/view/board/board/n;)V
    .locals 1

    const-string v0, "mainToolType"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Lcom/zykj/view/board/board/m;->a:Z

    .line 3
    iput-boolean p2, p0, Lcom/zykj/view/board/board/m;->b:Z

    .line 4
    iput-boolean p3, p0, Lcom/zykj/view/board/board/m;->c:Z

    .line 5
    iput-boolean p4, p0, Lcom/zykj/view/board/board/m;->d:Z

    .line 6
    iput-boolean p5, p0, Lcom/zykj/view/board/board/m;->e:Z

    .line 7
    iput-object p6, p0, Lcom/zykj/view/board/board/m;->f:Lcom/zykj/view/board/board/n;

    return-void
.end method

.method public synthetic constructor <init>(ZZZZZLcom/zykj/view/board/board/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
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

    .line 8
    sget-object p6, Lcom/zykj/view/board/board/n$d;->e:Lcom/zykj/view/board/board/n$d;

    :cond_5
    move-object p7, p6

    move p6, p5

    move p5, p4

    move p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    .line 9
    invoke-direct/range {p1 .. p7}, Lcom/zykj/view/board/board/m;-><init>(ZZZZZLcom/zykj/view/board/board/n;)V

    return-void
.end method

.method public static synthetic b(Lcom/zykj/view/board/board/m;ZZZZZLcom/zykj/view/board/board/n;ILjava/lang/Object;)Lcom/zykj/view/board/board/m;
    .locals 0

    .line 1
    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-boolean p1, p0, Lcom/zykj/view/board/board/m;->a:Z

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-boolean p2, p0, Lcom/zykj/view/board/board/m;->b:Z

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-boolean p3, p0, Lcom/zykj/view/board/board/m;->c:Z

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-boolean p4, p0, Lcom/zykj/view/board/board/m;->d:Z

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-boolean p5, p0, Lcom/zykj/view/board/board/m;->e:Z

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/zykj/view/board/board/m;->f:Lcom/zykj/view/board/board/n;

    :cond_5
    move p7, p5

    move-object p8, p6

    move p5, p3

    move p6, p4

    move p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/zykj/view/board/board/m;->a(ZZZZZLcom/zykj/view/board/board/n;)Lcom/zykj/view/board/board/m;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(ZZZZZLcom/zykj/view/board/board/n;)Lcom/zykj/view/board/board/m;
    .locals 8

    .line 1
    const-string v0, "mainToolType"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/zykj/view/board/board/m;

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/zykj/view/board/board/m;-><init>(ZZZZZLcom/zykj/view/board/board/n;)V

    return-object v1
.end method

.method public final c()Lcom/zykj/view/board/board/n;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/m;->f:Lcom/zykj/view/board/board/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/m;->a:Z

    .line 2
    .line 3
    return v0
.end method

.method public final e()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/m;->b:Z

    .line 2
    .line 3
    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/view/board/board/m;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/view/board/board/m;

    iget-boolean v1, p0, Lcom/zykj/view/board/board/m;->a:Z

    iget-boolean v3, p1, Lcom/zykj/view/board/board/m;->a:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/zykj/view/board/board/m;->b:Z

    iget-boolean v3, p1, Lcom/zykj/view/board/board/m;->b:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/zykj/view/board/board/m;->c:Z

    iget-boolean v3, p1, Lcom/zykj/view/board/board/m;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/zykj/view/board/board/m;->d:Z

    iget-boolean v3, p1, Lcom/zykj/view/board/board/m;->d:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/zykj/view/board/board/m;->e:Z

    iget-boolean v3, p1, Lcom/zykj/view/board/board/m;->e:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/zykj/view/board/board/m;->f:Lcom/zykj/view/board/board/n;

    iget-object p1, p1, Lcom/zykj/view/board/board/m;->f:Lcom/zykj/view/board/board/n;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final f()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/m;->d:Z

    .line 2
    .line 3
    return v0
.end method

.method public final g()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/m;->e:Z

    .line 2
    .line 3
    return v0
.end method

.method public final h()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/m;->c:Z

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Lcom/zykj/view/board/board/m;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/view/board/board/m;->b:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/view/board/board/m;->c:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/view/board/board/m;->d:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/view/board/board/m;->e:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/view/board/board/m;->f:Lcom/zykj/view/board/board/n;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-boolean v0, p0, Lcom/zykj/view/board/board/m;->a:Z

    iget-boolean v1, p0, Lcom/zykj/view/board/board/m;->b:Z

    iget-boolean v2, p0, Lcom/zykj/view/board/board/m;->c:Z

    iget-boolean v3, p0, Lcom/zykj/view/board/board/m;->d:Z

    iget-boolean v4, p0, Lcom/zykj/view/board/board/m;->e:Z

    iget-object v5, p0, Lcom/zykj/view/board/board/m;->f:Lcom/zykj/view/board/board/n;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "MainToolState(revokeVisible="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", zoomVisible="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isWithdrawEnable="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isRecoverEnable="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isTouchable="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", mainToolType="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
