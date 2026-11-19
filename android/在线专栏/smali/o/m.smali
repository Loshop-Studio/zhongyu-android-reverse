.class public abstract Lo/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/m$b;
    }
.end annotation


# instance fields
.field public a:I

.field b:Ln/e;

.field c:Lo/k;

.field protected d:Ln/e$b;

.field e:Lo/g;

.field public f:I

.field g:Z

.field public h:Lo/f;

.field public i:Lo/f;

.field protected j:Lo/m$b;


# direct methods
.method public constructor <init>(Ln/e;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lo/g;

    invoke-direct {v0, p0}, Lo/g;-><init>(Lo/m;)V

    iput-object v0, p0, Lo/m;->e:Lo/g;

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lo/m;->f:I

    .line 4
    iput-boolean v0, p0, Lo/m;->g:Z

    .line 5
    new-instance v0, Lo/f;

    invoke-direct {v0, p0}, Lo/f;-><init>(Lo/m;)V

    iput-object v0, p0, Lo/m;->h:Lo/f;

    .line 6
    new-instance v0, Lo/f;

    invoke-direct {v0, p0}, Lo/f;-><init>(Lo/m;)V

    iput-object v0, p0, Lo/m;->i:Lo/f;

    .line 7
    sget-object v0, Lo/m$b;->a:Lo/m$b;

    iput-object v0, p0, Lo/m;->j:Lo/m$b;

    .line 8
    iput-object p1, p0, Lo/m;->b:Ln/e;

    return-void
.end method

.method private l(II)V
    .locals 7

    .line 1
    iget v0, p0, Lo/m;->a:I

    if-eqz v0, :cond_8

    const/4 v1, 0x1

    if-eq v0, v1, :cond_7

    const/4 p2, 0x2

    const/high16 v2, 0x3f000000    # 0.5f

    if-eq v0, p2, :cond_4

    const/4 p2, 0x3

    if-eq v0, p2, :cond_0

    goto/16 :goto_3

    .line 2
    :cond_0
    iget-object v0, p0, Lo/m;->b:Ln/e;

    iget-object v3, v0, Ln/e;->e:Lo/j;

    iget-object v4, v3, Lo/m;->d:Ln/e$b;

    sget-object v5, Ln/e$b;->c:Ln/e$b;

    if-ne v4, v5, :cond_1

    iget v4, v3, Lo/m;->a:I

    if-ne v4, p2, :cond_1

    iget-object v4, v0, Ln/e;->f:Lo/l;

    iget-object v6, v4, Lo/m;->d:Ln/e$b;

    if-ne v6, v5, :cond_1

    iget v4, v4, Lo/m;->a:I

    if-ne v4, p2, :cond_1

    goto/16 :goto_3

    :cond_1
    if-nez p1, :cond_2

    .line 3
    iget-object v3, v0, Ln/e;->f:Lo/l;

    .line 4
    :cond_2
    iget-object p2, v3, Lo/m;->e:Lo/g;

    iget-boolean p2, p2, Lo/f;->j:Z

    if-eqz p2, :cond_9

    .line 5
    invoke-virtual {v0}, Ln/e;->u()F

    move-result p2

    if-ne p1, v1, :cond_3

    .line 6
    iget-object p1, v3, Lo/m;->e:Lo/g;

    iget p1, p1, Lo/f;->g:I

    int-to-float p1, p1

    div-float/2addr p1, p2

    add-float/2addr p1, v2

    float-to-int p1, p1

    goto :goto_0

    .line 7
    :cond_3
    iget-object p1, v3, Lo/m;->e:Lo/g;

    iget p1, p1, Lo/f;->g:I

    int-to-float p1, p1

    mul-float p2, p2, p1

    add-float/2addr p2, v2

    float-to-int p1, p2

    .line 8
    :goto_0
    iget-object p2, p0, Lo/m;->e:Lo/g;

    invoke-virtual {p2, p1}, Lo/g;->d(I)V

    goto :goto_3

    .line 9
    :cond_4
    iget-object p2, p0, Lo/m;->b:Ln/e;

    invoke-virtual {p2}, Ln/e;->H()Ln/e;

    move-result-object p2

    if-eqz p2, :cond_9

    if-nez p1, :cond_5

    .line 10
    iget-object p2, p2, Ln/e;->e:Lo/j;

    goto :goto_1

    :cond_5
    iget-object p2, p2, Ln/e;->f:Lo/l;

    .line 11
    :goto_1
    iget-object p2, p2, Lo/m;->e:Lo/g;

    iget-boolean v0, p2, Lo/f;->j:Z

    if-eqz v0, :cond_9

    .line 12
    iget-object v0, p0, Lo/m;->b:Ln/e;

    if-nez p1, :cond_6

    iget v0, v0, Ln/e;->q:F

    goto :goto_2

    :cond_6
    iget v0, v0, Ln/e;->t:F

    .line 13
    :goto_2
    iget p2, p2, Lo/f;->g:I

    int-to-float p2, p2

    mul-float p2, p2, v0

    add-float/2addr p2, v2

    float-to-int p2, p2

    .line 14
    iget-object v0, p0, Lo/m;->e:Lo/g;

    invoke-virtual {p0, p2, p1}, Lo/m;->g(II)I

    move-result p1

    invoke-virtual {v0, p1}, Lo/g;->d(I)V

    goto :goto_3

    .line 15
    :cond_7
    iget-object v0, p0, Lo/m;->e:Lo/g;

    iget v0, v0, Lo/g;->m:I

    invoke-virtual {p0, v0, p1}, Lo/m;->g(II)I

    move-result p1

    .line 16
    iget-object v0, p0, Lo/m;->e:Lo/g;

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-virtual {v0, p1}, Lo/g;->d(I)V

    goto :goto_3

    .line 17
    :cond_8
    iget-object v0, p0, Lo/m;->e:Lo/g;

    invoke-virtual {p0, p2, p1}, Lo/m;->g(II)I

    move-result p1

    invoke-virtual {v0, p1}, Lo/g;->d(I)V

    :cond_9
    :goto_3
    return-void
.end method


# virtual methods
.method public a(Lo/d;)V
    .locals 0

    return-void
.end method

.method protected final b(Lo/f;Lo/f;I)V
    .locals 1

    .line 1
    iget-object v0, p1, Lo/f;->l:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2
    iput p3, p1, Lo/f;->f:I

    .line 3
    iget-object p2, p2, Lo/f;->k:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method protected final c(Lo/f;Lo/f;ILo/g;)V
    .locals 2

    .line 1
    iget-object v0, p1, Lo/f;->l:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2
    iget-object v0, p1, Lo/f;->l:Ljava/util/List;

    iget-object v1, p0, Lo/m;->e:Lo/g;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3
    iput p3, p1, Lo/f;->h:I

    .line 4
    iput-object p4, p1, Lo/f;->i:Lo/g;

    .line 5
    iget-object p2, p2, Lo/f;->k:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6
    iget-object p2, p4, Lo/f;->k:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method abstract d()V
.end method

.method abstract e()V
.end method

.method abstract f()V
.end method

.method protected final g(II)I
    .locals 1

    if-nez p2, :cond_1

    .line 1
    iget-object p2, p0, Lo/m;->b:Ln/e;

    iget v0, p2, Ln/e;->p:I

    .line 2
    iget p2, p2, Ln/e;->o:I

    .line 3
    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p2

    if-lez v0, :cond_0

    .line 4
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p2

    :cond_0
    if-eq p2, p1, :cond_3

    goto :goto_0

    .line 5
    :cond_1
    iget-object p2, p0, Lo/m;->b:Ln/e;

    iget v0, p2, Ln/e;->s:I

    .line 6
    iget p2, p2, Ln/e;->r:I

    .line 7
    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p2

    if-lez v0, :cond_2

    .line 8
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p2

    :cond_2
    if-eq p2, p1, :cond_3

    :goto_0
    move p1, p2

    :cond_3
    return p1
.end method

.method protected final h(Ln/d;)Lo/f;
    .locals 3

    .line 1
    iget-object p1, p1, Ln/d;->d:Ln/d;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 2
    :cond_0
    iget-object v1, p1, Ln/d;->b:Ln/e;

    .line 3
    iget-object p1, p1, Ln/d;->c:Ln/d$b;

    .line 4
    sget-object v2, Lo/m$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v2, p1

    const/4 v2, 0x1

    if-eq p1, v2, :cond_5

    const/4 v2, 0x2

    if-eq p1, v2, :cond_4

    const/4 v2, 0x3

    if-eq p1, v2, :cond_3

    const/4 v2, 0x4

    if-eq p1, v2, :cond_2

    const/4 v2, 0x5

    if-eq p1, v2, :cond_1

    goto :goto_0

    .line 5
    :cond_1
    iget-object p1, v1, Ln/e;->f:Lo/l;

    .line 6
    iget-object v0, p1, Lo/m;->i:Lo/f;

    goto :goto_0

    .line 7
    :cond_2
    iget-object p1, v1, Ln/e;->f:Lo/l;

    .line 8
    iget-object v0, p1, Lo/l;->k:Lo/f;

    goto :goto_0

    .line 9
    :cond_3
    iget-object p1, v1, Ln/e;->f:Lo/l;

    .line 10
    iget-object v0, p1, Lo/m;->h:Lo/f;

    goto :goto_0

    .line 11
    :cond_4
    iget-object p1, v1, Ln/e;->e:Lo/j;

    .line 12
    iget-object v0, p1, Lo/m;->i:Lo/f;

    goto :goto_0

    .line 13
    :cond_5
    iget-object p1, v1, Ln/e;->e:Lo/j;

    .line 14
    iget-object v0, p1, Lo/m;->h:Lo/f;

    :goto_0
    return-object v0
.end method

.method protected final i(Ln/d;I)Lo/f;
    .locals 2

    .line 1
    iget-object p1, p1, Ln/d;->d:Ln/d;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 2
    :cond_0
    iget-object v1, p1, Ln/d;->b:Ln/e;

    if-nez p2, :cond_1

    .line 3
    iget-object p2, v1, Ln/e;->e:Lo/j;

    goto :goto_0

    :cond_1
    iget-object p2, v1, Ln/e;->f:Lo/l;

    .line 4
    :goto_0
    iget-object p1, p1, Ln/d;->c:Ln/d$b;

    .line 5
    sget-object v1, Lo/m$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_3

    const/4 v1, 0x2

    if-eq p1, v1, :cond_2

    const/4 v1, 0x3

    if-eq p1, v1, :cond_3

    const/4 v1, 0x5

    if-eq p1, v1, :cond_2

    goto :goto_1

    .line 6
    :cond_2
    iget-object v0, p2, Lo/m;->i:Lo/f;

    goto :goto_1

    .line 7
    :cond_3
    iget-object v0, p2, Lo/m;->h:Lo/f;

    :goto_1
    return-object v0
.end method

.method public j()J
    .locals 2

    .line 1
    iget-object v0, p0, Lo/m;->e:Lo/g;

    iget-boolean v1, v0, Lo/f;->j:Z

    if-eqz v1, :cond_0

    .line 2
    iget v0, v0, Lo/f;->g:I

    int-to-long v0, v0

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public k()Z
    .locals 1

    iget-boolean v0, p0, Lo/m;->g:Z

    return v0
.end method

.method abstract m()Z
.end method

.method protected n(Lo/d;Ln/d;Ln/d;I)V
    .locals 4

    .line 1
    invoke-virtual {p0, p2}, Lo/m;->h(Ln/d;)Lo/f;

    move-result-object p1

    .line 2
    invoke-virtual {p0, p3}, Lo/m;->h(Ln/d;)Lo/f;

    move-result-object v0

    .line 3
    iget-boolean v1, p1, Lo/f;->j:Z

    if-eqz v1, :cond_6

    iget-boolean v1, v0, Lo/f;->j:Z

    if-nez v1, :cond_0

    goto :goto_1

    .line 4
    :cond_0
    iget v1, p1, Lo/f;->g:I

    invoke-virtual {p2}, Ln/d;->c()I

    move-result p2

    add-int/2addr v1, p2

    .line 5
    iget p2, v0, Lo/f;->g:I

    invoke-virtual {p3}, Ln/d;->c()I

    move-result p3

    sub-int/2addr p2, p3

    sub-int p3, p2, v1

    .line 6
    iget-object v2, p0, Lo/m;->e:Lo/g;

    iget-boolean v2, v2, Lo/f;->j:Z

    if-nez v2, :cond_1

    iget-object v2, p0, Lo/m;->d:Ln/e$b;

    sget-object v3, Ln/e$b;->c:Ln/e$b;

    if-ne v2, v3, :cond_1

    .line 7
    invoke-direct {p0, p4, p3}, Lo/m;->l(II)V

    .line 8
    :cond_1
    iget-object v2, p0, Lo/m;->e:Lo/g;

    iget-boolean v3, v2, Lo/f;->j:Z

    if-nez v3, :cond_2

    return-void

    .line 9
    :cond_2
    iget v2, v2, Lo/f;->g:I

    if-ne v2, p3, :cond_3

    .line 10
    iget-object p1, p0, Lo/m;->h:Lo/f;

    invoke-virtual {p1, v1}, Lo/f;->d(I)V

    .line 11
    iget-object p1, p0, Lo/m;->i:Lo/f;

    invoke-virtual {p1, p2}, Lo/f;->d(I)V

    return-void

    .line 12
    :cond_3
    iget-object p3, p0, Lo/m;->b:Ln/e;

    if-nez p4, :cond_4

    invoke-virtual {p3}, Ln/e;->x()F

    move-result p3

    goto :goto_0

    .line 13
    :cond_4
    invoke-virtual {p3}, Ln/e;->L()F

    move-result p3

    :goto_0
    const/high16 p4, 0x3f000000    # 0.5f

    if-ne p1, v0, :cond_5

    .line 14
    iget v1, p1, Lo/f;->g:I

    .line 15
    iget p2, v0, Lo/f;->g:I

    const/high16 p3, 0x3f000000    # 0.5f

    :cond_5
    sub-int/2addr p2, v1

    .line 16
    iget-object p1, p0, Lo/m;->e:Lo/g;

    iget p1, p1, Lo/f;->g:I

    sub-int/2addr p2, p1

    .line 17
    iget-object p1, p0, Lo/m;->h:Lo/f;

    int-to-float v0, v1

    add-float/2addr v0, p4

    int-to-float p2, p2

    mul-float p2, p2, p3

    add-float/2addr v0, p2

    float-to-int p2, v0

    invoke-virtual {p1, p2}, Lo/f;->d(I)V

    .line 18
    iget-object p1, p0, Lo/m;->i:Lo/f;

    iget-object p2, p0, Lo/m;->h:Lo/f;

    iget p2, p2, Lo/f;->g:I

    iget-object p3, p0, Lo/m;->e:Lo/g;

    iget p3, p3, Lo/f;->g:I

    add-int/2addr p2, p3

    invoke-virtual {p1, p2}, Lo/f;->d(I)V

    :cond_6
    :goto_1
    return-void
.end method

.method protected o(Lo/d;)V
    .locals 0

    return-void
.end method

.method protected p(Lo/d;)V
    .locals 0

    return-void
.end method
