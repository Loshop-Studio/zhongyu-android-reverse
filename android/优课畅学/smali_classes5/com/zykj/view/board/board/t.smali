.class public final Lcom/zykj/view/board/board/t;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:Lcom/zykj/view/board/board/u;

.field public final d:I

.field public final e:Lcom/zykj/view/board/board/s;


# direct methods
.method public constructor <init>(ZZLcom/zykj/view/board/board/u;ILcom/zykj/view/board/board/s;)V
    .locals 1

    const-string v0, "penType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "penColor"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Lcom/zykj/view/board/board/t;->a:Z

    .line 3
    iput-boolean p2, p0, Lcom/zykj/view/board/board/t;->b:Z

    .line 4
    iput-object p3, p0, Lcom/zykj/view/board/board/t;->c:Lcom/zykj/view/board/board/u;

    .line 5
    iput p4, p0, Lcom/zykj/view/board/board/t;->d:I

    .line 6
    iput-object p5, p0, Lcom/zykj/view/board/board/t;->e:Lcom/zykj/view/board/board/s;

    return-void
.end method

.method public synthetic constructor <init>(ZZLcom/zykj/view/board/board/u;ILcom/zykj/view/board/board/s;ILkotlin/jvm/internal/n;)V
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

    .line 7
    sget-object p3, Lcom/zykj/view/board/board/u$b;->f:Lcom/zykj/view/board/board/u$b;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    .line 8
    sget-object p5, Lcom/zykj/view/board/board/s$a;->c:Lcom/zykj/view/board/board/s$a;

    :cond_4
    move-object p6, p5

    move p5, p4

    move-object p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    .line 9
    invoke-direct/range {p1 .. p6}, Lcom/zykj/view/board/board/t;-><init>(ZZLcom/zykj/view/board/board/u;ILcom/zykj/view/board/board/s;)V

    return-void
.end method

.method public static synthetic b(Lcom/zykj/view/board/board/t;ZZLcom/zykj/view/board/board/u;ILcom/zykj/view/board/board/s;ILjava/lang/Object;)Lcom/zykj/view/board/board/t;
    .locals 0

    .line 1
    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-boolean p1, p0, Lcom/zykj/view/board/board/t;->a:Z

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-boolean p2, p0, Lcom/zykj/view/board/board/t;->b:Z

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/zykj/view/board/board/t;->c:Lcom/zykj/view/board/board/u;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget p4, p0, Lcom/zykj/view/board/board/t;->d:I

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/zykj/view/board/board/t;->e:Lcom/zykj/view/board/board/s;

    :cond_4
    move p6, p4

    move-object p7, p5

    move p4, p2

    move-object p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/zykj/view/board/board/t;->a(ZZLcom/zykj/view/board/board/u;ILcom/zykj/view/board/board/s;)Lcom/zykj/view/board/board/t;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(ZZLcom/zykj/view/board/board/u;ILcom/zykj/view/board/board/s;)Lcom/zykj/view/board/board/t;
    .locals 7

    .line 1
    const-string v0, "penType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "penColor"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/zykj/view/board/board/t;

    move v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/zykj/view/board/board/t;-><init>(ZZLcom/zykj/view/board/board/u;ILcom/zykj/view/board/board/s;)V

    return-object v1
.end method

.method public final c()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/t;->a:Z

    .line 2
    .line 3
    return v0
.end method

.method public final d()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/t;->b:Z

    .line 2
    .line 3
    return v0
.end method

.method public final e()Lcom/zykj/view/board/board/s;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/t;->e:Lcom/zykj/view/board/board/s;

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
    instance-of v1, p1, Lcom/zykj/view/board/board/t;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/view/board/board/t;

    iget-boolean v1, p0, Lcom/zykj/view/board/board/t;->a:Z

    iget-boolean v3, p1, Lcom/zykj/view/board/board/t;->a:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/zykj/view/board/board/t;->b:Z

    iget-boolean v3, p1, Lcom/zykj/view/board/board/t;->b:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/zykj/view/board/board/t;->c:Lcom/zykj/view/board/board/u;

    iget-object v3, p1, Lcom/zykj/view/board/board/t;->c:Lcom/zykj/view/board/board/u;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/zykj/view/board/board/t;->d:I

    iget v3, p1, Lcom/zykj/view/board/board/t;->d:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/zykj/view/board/board/t;->e:Lcom/zykj/view/board/board/s;

    iget-object p1, p1, Lcom/zykj/view/board/board/t;->e:Lcom/zykj/view/board/board/s;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final f()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/board/board/t;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public final g()Lcom/zykj/view/board/board/u;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/t;->c:Lcom/zykj/view/board/board/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Lcom/zykj/view/board/board/t;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/view/board/board/t;->b:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/view/board/board/t;->c:Lcom/zykj/view/board/board/u;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/view/board/board/t;->d:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/view/board/board/t;->e:Lcom/zykj/view/board/board/s;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-boolean v0, p0, Lcom/zykj/view/board/board/t;->a:Z

    iget-boolean v1, p0, Lcom/zykj/view/board/board/t;->b:Z

    iget-object v2, p0, Lcom/zykj/view/board/board/t;->c:Lcom/zykj/view/board/board/u;

    iget v3, p0, Lcom/zykj/view/board/board/t;->d:I

    iget-object v4, p0, Lcom/zykj/view/board/board/t;->e:Lcom/zykj/view/board/board/s;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "PenToolState(dotVisible="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", highlighterVisible="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", penType="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", penSizeLevel="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", penColor="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
