.class public final Lcom/zykj/view/board/simple/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Lcom/zykj/view/board/board/s;

.field public final c:Lcom/zykj/view/board/board/t;

.field public final d:Lcom/zykj/view/board/simple/d;

.field public final e:Lcom/zykj/view/board/simple/c;

.field public final f:Lcom/zykj/view/board/board/u;

.field public final g:Lcom/zykj/view/board/board/l;

.field public final h:Lcom/zykj/view/board/board/n;


# direct methods
.method public constructor <init>(ZLcom/zykj/view/board/board/s;Lcom/zykj/view/board/board/t;Lcom/zykj/view/board/simple/d;Lcom/zykj/view/board/simple/c;Lcom/zykj/view/board/board/u;Lcom/zykj/view/board/board/l;Lcom/zykj/view/board/board/n;)V
    .locals 1

    const-string v0, "mainToolType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "minorToolType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "penType"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "penSize"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "penColor"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eraserType"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "expandStatus"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Lcom/zykj/view/board/simple/e;->a:Z

    .line 3
    iput-object p2, p0, Lcom/zykj/view/board/simple/e;->b:Lcom/zykj/view/board/board/s;

    .line 4
    iput-object p3, p0, Lcom/zykj/view/board/simple/e;->c:Lcom/zykj/view/board/board/t;

    .line 5
    iput-object p4, p0, Lcom/zykj/view/board/simple/e;->d:Lcom/zykj/view/board/simple/d;

    .line 6
    iput-object p5, p0, Lcom/zykj/view/board/simple/e;->e:Lcom/zykj/view/board/simple/c;

    .line 7
    iput-object p6, p0, Lcom/zykj/view/board/simple/e;->f:Lcom/zykj/view/board/board/u;

    .line 8
    iput-object p7, p0, Lcom/zykj/view/board/simple/e;->g:Lcom/zykj/view/board/board/l;

    .line 9
    iput-object p8, p0, Lcom/zykj/view/board/simple/e;->h:Lcom/zykj/view/board/board/n;

    return-void
.end method

.method public synthetic constructor <init>(ZLcom/zykj/view/board/board/s;Lcom/zykj/view/board/board/t;Lcom/zykj/view/board/simple/d;Lcom/zykj/view/board/simple/c;Lcom/zykj/view/board/board/u;Lcom/zykj/view/board/board/l;Lcom/zykj/view/board/board/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    .line 10
    sget-object p2, Lcom/zykj/view/board/board/s$c;->e:Lcom/zykj/view/board/board/s$c;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    .line 11
    sget-object p3, Lcom/zykj/view/board/board/t$d;->f:Lcom/zykj/view/board/board/t$d;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    .line 12
    sget-object p4, Lcom/zykj/view/board/simple/d$a;->d:Lcom/zykj/view/board/simple/d$a;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    .line 13
    sget-object p5, Lcom/zykj/view/board/simple/c$b;->c:Lcom/zykj/view/board/simple/c$b;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    .line 14
    sget-object p6, Lcom/zykj/view/board/board/u$a;->c:Lcom/zykj/view/board/board/u$a;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    .line 15
    sget-object p7, Lcom/zykj/view/board/board/l$b;->c:Lcom/zykj/view/board/board/l$b;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    .line 16
    sget-object p8, Lcom/zykj/view/board/board/n$b;->b:Lcom/zykj/view/board/board/n$b;

    :cond_7
    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move p3, p1

    move-object p4, p2

    move-object p2, p0

    .line 17
    invoke-direct/range {p2 .. p10}, Lcom/zykj/view/board/simple/e;-><init>(ZLcom/zykj/view/board/board/s;Lcom/zykj/view/board/board/t;Lcom/zykj/view/board/simple/d;Lcom/zykj/view/board/simple/c;Lcom/zykj/view/board/board/u;Lcom/zykj/view/board/board/l;Lcom/zykj/view/board/board/n;)V

    return-void
.end method

.method public static synthetic b(Lcom/zykj/view/board/simple/e;ZLcom/zykj/view/board/board/s;Lcom/zykj/view/board/board/t;Lcom/zykj/view/board/simple/d;Lcom/zykj/view/board/simple/c;Lcom/zykj/view/board/board/u;Lcom/zykj/view/board/board/l;Lcom/zykj/view/board/board/n;ILjava/lang/Object;)Lcom/zykj/view/board/simple/e;
    .locals 0

    .line 1
    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-boolean p1, p0, Lcom/zykj/view/board/simple/e;->a:Z

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/zykj/view/board/simple/e;->b:Lcom/zykj/view/board/board/s;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lcom/zykj/view/board/simple/e;->c:Lcom/zykj/view/board/board/t;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lcom/zykj/view/board/simple/e;->d:Lcom/zykj/view/board/simple/d;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Lcom/zykj/view/board/simple/e;->e:Lcom/zykj/view/board/simple/c;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Lcom/zykj/view/board/simple/e;->f:Lcom/zykj/view/board/board/u;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lcom/zykj/view/board/simple/e;->g:Lcom/zykj/view/board/board/l;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lcom/zykj/view/board/simple/e;->h:Lcom/zykj/view/board/board/n;

    :cond_7
    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lcom/zykj/view/board/simple/e;->a(ZLcom/zykj/view/board/board/s;Lcom/zykj/view/board/board/t;Lcom/zykj/view/board/simple/d;Lcom/zykj/view/board/simple/c;Lcom/zykj/view/board/board/u;Lcom/zykj/view/board/board/l;Lcom/zykj/view/board/board/n;)Lcom/zykj/view/board/simple/e;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(ZLcom/zykj/view/board/board/s;Lcom/zykj/view/board/board/t;Lcom/zykj/view/board/simple/d;Lcom/zykj/view/board/simple/c;Lcom/zykj/view/board/board/u;Lcom/zykj/view/board/board/l;Lcom/zykj/view/board/board/n;)Lcom/zykj/view/board/simple/e;
    .locals 10

    .line 1
    const-string v0, "mainToolType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "minorToolType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "penType"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "penSize"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "penColor"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eraserType"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "expandStatus"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/zykj/view/board/simple/e;

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v9}, Lcom/zykj/view/board/simple/e;-><init>(ZLcom/zykj/view/board/board/s;Lcom/zykj/view/board/board/t;Lcom/zykj/view/board/simple/d;Lcom/zykj/view/board/simple/c;Lcom/zykj/view/board/board/u;Lcom/zykj/view/board/board/l;Lcom/zykj/view/board/board/n;)V

    return-object v1
.end method

.method public final c()Lcom/zykj/view/board/board/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/simple/e;->g:Lcom/zykj/view/board/board/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Lcom/zykj/view/board/board/n;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/simple/e;->h:Lcom/zykj/view/board/board/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()Lcom/zykj/view/board/board/s;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/simple/e;->b:Lcom/zykj/view/board/board/s;

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
    instance-of v1, p1, Lcom/zykj/view/board/simple/e;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/view/board/simple/e;

    iget-boolean v1, p0, Lcom/zykj/view/board/simple/e;->a:Z

    iget-boolean v3, p1, Lcom/zykj/view/board/simple/e;->a:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/zykj/view/board/simple/e;->b:Lcom/zykj/view/board/board/s;

    iget-object v3, p1, Lcom/zykj/view/board/simple/e;->b:Lcom/zykj/view/board/board/s;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/zykj/view/board/simple/e;->c:Lcom/zykj/view/board/board/t;

    iget-object v3, p1, Lcom/zykj/view/board/simple/e;->c:Lcom/zykj/view/board/board/t;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/zykj/view/board/simple/e;->d:Lcom/zykj/view/board/simple/d;

    iget-object v3, p1, Lcom/zykj/view/board/simple/e;->d:Lcom/zykj/view/board/simple/d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/zykj/view/board/simple/e;->e:Lcom/zykj/view/board/simple/c;

    iget-object v3, p1, Lcom/zykj/view/board/simple/e;->e:Lcom/zykj/view/board/simple/c;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/zykj/view/board/simple/e;->f:Lcom/zykj/view/board/board/u;

    iget-object v3, p1, Lcom/zykj/view/board/simple/e;->f:Lcom/zykj/view/board/board/u;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/zykj/view/board/simple/e;->g:Lcom/zykj/view/board/board/l;

    iget-object v3, p1, Lcom/zykj/view/board/simple/e;->g:Lcom/zykj/view/board/board/l;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/zykj/view/board/simple/e;->h:Lcom/zykj/view/board/board/n;

    iget-object p1, p1, Lcom/zykj/view/board/simple/e;->h:Lcom/zykj/view/board/board/n;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final f()Lcom/zykj/view/board/board/t;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/simple/e;->c:Lcom/zykj/view/board/board/t;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()Lcom/zykj/view/board/board/u;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/simple/e;->f:Lcom/zykj/view/board/board/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()Lcom/zykj/view/board/simple/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/simple/e;->e:Lcom/zykj/view/board/simple/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Lcom/zykj/view/board/simple/e;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/view/board/simple/e;->b:Lcom/zykj/view/board/board/s;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/view/board/simple/e;->c:Lcom/zykj/view/board/board/t;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/view/board/simple/e;->d:Lcom/zykj/view/board/simple/d;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/view/board/simple/e;->e:Lcom/zykj/view/board/simple/c;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/view/board/simple/e;->f:Lcom/zykj/view/board/board/u;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/view/board/simple/e;->g:Lcom/zykj/view/board/board/l;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/view/board/simple/e;->h:Lcom/zykj/view/board/board/n;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final i()Lcom/zykj/view/board/simple/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/simple/e;->d:Lcom/zykj/view/board/simple/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/simple/e;->a:Z

    .line 2
    .line 3
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-boolean v0, p0, Lcom/zykj/view/board/simple/e;->a:Z

    iget-object v1, p0, Lcom/zykj/view/board/simple/e;->b:Lcom/zykj/view/board/board/s;

    iget-object v2, p0, Lcom/zykj/view/board/simple/e;->c:Lcom/zykj/view/board/board/t;

    iget-object v3, p0, Lcom/zykj/view/board/simple/e;->d:Lcom/zykj/view/board/simple/d;

    iget-object v4, p0, Lcom/zykj/view/board/simple/e;->e:Lcom/zykj/view/board/simple/c;

    iget-object v5, p0, Lcom/zykj/view/board/simple/e;->f:Lcom/zykj/view/board/board/u;

    iget-object v6, p0, Lcom/zykj/view/board/simple/e;->g:Lcom/zykj/view/board/board/l;

    iget-object v7, p0, Lcom/zykj/view/board/simple/e;->h:Lcom/zykj/view/board/board/n;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "SimpleUIState(isTouchable="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", mainToolType="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", minorToolType="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", penType="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", penSize="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", penColor="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", eraserType="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", expandStatus="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
