.class public final Lcom/zykj/view/board/board/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:Lcom/zykj/view/board/board/r;

.field public final d:I

.field public final e:Lcom/zykj/view/board/board/p;

.field public final f:I

.field public final g:Z


# direct methods
.method public constructor <init>(ZZLcom/zykj/view/board/board/r;ILcom/zykj/view/board/board/p;IZ)V
    .locals 1

    const-string v0, "penType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "penColor"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Lcom/zykj/view/board/board/q;->a:Z

    .line 3
    iput-boolean p2, p0, Lcom/zykj/view/board/board/q;->b:Z

    .line 4
    iput-object p3, p0, Lcom/zykj/view/board/board/q;->c:Lcom/zykj/view/board/board/r;

    .line 5
    iput p4, p0, Lcom/zykj/view/board/board/q;->d:I

    .line 6
    iput-object p5, p0, Lcom/zykj/view/board/board/q;->e:Lcom/zykj/view/board/board/p;

    .line 7
    iput p6, p0, Lcom/zykj/view/board/board/q;->f:I

    .line 8
    iput-boolean p7, p0, Lcom/zykj/view/board/board/q;->g:Z

    return-void
.end method

.method public synthetic constructor <init>(ZZLcom/zykj/view/board/board/r;ILcom/zykj/view/board/board/p;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x1

    const/4 v0, 0x0

    if-eqz p9, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    .line 9
    sget-object p3, Lcom/zykj/view/board/board/r$b;->f:Lcom/zykj/view/board/board/r$b;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    .line 10
    sget-object p5, Lcom/zykj/view/board/board/p$a;->c:Lcom/zykj/view/board/board/p$a;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    move p6, v0

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    move p8, v0

    :goto_0
    move p7, p6

    move-object p6, p5

    move p5, p4

    move-object p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_6
    move p8, p7

    goto :goto_0

    .line 11
    :goto_1
    invoke-direct/range {p1 .. p8}, Lcom/zykj/view/board/board/q;-><init>(ZZLcom/zykj/view/board/board/r;ILcom/zykj/view/board/board/p;IZ)V

    return-void
.end method

.method public static synthetic b(Lcom/zykj/view/board/board/q;ZZLcom/zykj/view/board/board/r;ILcom/zykj/view/board/board/p;IZILjava/lang/Object;)Lcom/zykj/view/board/board/q;
    .locals 0

    .line 1
    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-boolean p1, p0, Lcom/zykj/view/board/board/q;->a:Z

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-boolean p2, p0, Lcom/zykj/view/board/board/q;->b:Z

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/zykj/view/board/board/q;->c:Lcom/zykj/view/board/board/r;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget p4, p0, Lcom/zykj/view/board/board/q;->d:I

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/zykj/view/board/board/q;->e:Lcom/zykj/view/board/board/p;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget p6, p0, Lcom/zykj/view/board/board/q;->f:I

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-boolean p7, p0, Lcom/zykj/view/board/board/q;->g:Z

    :cond_6
    move p8, p6

    move p9, p7

    move p6, p4

    move-object p7, p5

    move p4, p2

    move-object p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/zykj/view/board/board/q;->a(ZZLcom/zykj/view/board/board/r;ILcom/zykj/view/board/board/p;IZ)Lcom/zykj/view/board/board/q;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(ZZLcom/zykj/view/board/board/r;ILcom/zykj/view/board/board/p;IZ)Lcom/zykj/view/board/board/q;
    .locals 9

    .line 1
    const-string v0, "penType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "penColor"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/zykj/view/board/board/q;

    move v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    move-object v6, p5

    move v7, p6

    move/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/zykj/view/board/board/q;-><init>(ZZLcom/zykj/view/board/board/r;ILcom/zykj/view/board/board/p;IZ)V

    return-object v1
.end method

.method public final c()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/q;->a:Z

    .line 2
    .line 3
    return v0
.end method

.method public final d()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/q;->b:Z

    .line 2
    .line 3
    return v0
.end method

.method public final e()Lcom/zykj/view/board/board/p;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/q;->e:Lcom/zykj/view/board/board/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/view/board/board/q;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/view/board/board/q;

    iget-boolean v1, p0, Lcom/zykj/view/board/board/q;->a:Z

    iget-boolean v3, p1, Lcom/zykj/view/board/board/q;->a:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/zykj/view/board/board/q;->b:Z

    iget-boolean v3, p1, Lcom/zykj/view/board/board/q;->b:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/zykj/view/board/board/q;->c:Lcom/zykj/view/board/board/r;

    iget-object v3, p1, Lcom/zykj/view/board/board/q;->c:Lcom/zykj/view/board/board/r;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/zykj/view/board/board/q;->d:I

    iget v3, p1, Lcom/zykj/view/board/board/q;->d:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/zykj/view/board/board/q;->e:Lcom/zykj/view/board/board/p;

    iget-object v3, p1, Lcom/zykj/view/board/board/q;->e:Lcom/zykj/view/board/board/p;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/zykj/view/board/board/q;->f:I

    iget v3, p1, Lcom/zykj/view/board/board/q;->f:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/zykj/view/board/board/q;->g:Z

    iget-boolean p1, p1, Lcom/zykj/view/board/board/q;->g:Z

    if-eq v1, p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final f()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/board/board/q;->f:I

    .line 2
    .line 3
    return v0
.end method

.method public final g()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/board/board/q;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public final h()Lcom/zykj/view/board/board/r;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/q;->c:Lcom/zykj/view/board/board/r;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Lcom/zykj/view/board/board/q;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/view/board/board/q;->b:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/view/board/board/q;->c:Lcom/zykj/view/board/board/r;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/view/board/board/q;->d:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/view/board/board/q;->e:Lcom/zykj/view/board/board/p;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/view/board/board/q;->f:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/view/board/board/q;->g:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final i()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/q;->g:Z

    .line 2
    .line 3
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-boolean v0, p0, Lcom/zykj/view/board/board/q;->a:Z

    iget-boolean v1, p0, Lcom/zykj/view/board/board/q;->b:Z

    iget-object v2, p0, Lcom/zykj/view/board/board/q;->c:Lcom/zykj/view/board/board/r;

    iget v3, p0, Lcom/zykj/view/board/board/q;->d:I

    iget-object v4, p0, Lcom/zykj/view/board/board/q;->e:Lcom/zykj/view/board/board/p;

    iget v5, p0, Lcom/zykj/view/board/board/q;->f:I

    iget-boolean v6, p0, Lcom/zykj/view/board/board/q;->g:Z

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "PenToolState(dotVisible="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", highlighterVisible="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", penType="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", penSizeLevel="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", penColor="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", penCustomColor="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", isShowCustomColor="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
