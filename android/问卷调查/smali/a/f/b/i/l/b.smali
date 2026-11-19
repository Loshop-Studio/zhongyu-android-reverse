.class public La/f/b/i/l/b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/f/b/i/l/b$a;,
        La/f/b/i/l/b$b;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "La/f/b/i/d;",
            ">;"
        }
    .end annotation
.end field

.field public b:La/f/b/i/l/b$a;

.field public c:La/f/b/i/e;


# direct methods
.method public constructor <init>(La/f/b/i/e;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, La/f/b/i/l/b;->a:Ljava/util/ArrayList;

    new-instance v0, La/f/b/i/l/b$a;

    invoke-direct {v0}, La/f/b/i/l/b$a;-><init>()V

    iput-object v0, p0, La/f/b/i/l/b;->b:La/f/b/i/l/b$a;

    iput-object p1, p0, La/f/b/i/l/b;->c:La/f/b/i/e;

    return-void
.end method


# virtual methods
.method public final a(La/f/b/i/l/b$b;La/f/b/i/d;Z)Z
    .locals 6

    sget-object v0, La/f/b/i/d$a;->b:La/f/b/i/d$a;

    iget-object v1, p0, La/f/b/i/l/b;->b:La/f/b/i/l/b$a;

    invoke-virtual {p2}, La/f/b/i/d;->j()La/f/b/i/d$a;

    move-result-object v2

    iput-object v2, v1, La/f/b/i/l/b$a;->a:La/f/b/i/d$a;

    iget-object v1, p0, La/f/b/i/l/b;->b:La/f/b/i/l/b$a;

    invoke-virtual {p2}, La/f/b/i/d;->n()La/f/b/i/d$a;

    move-result-object v2

    iput-object v2, v1, La/f/b/i/l/b$a;->b:La/f/b/i/d$a;

    iget-object v1, p0, La/f/b/i/l/b;->b:La/f/b/i/l/b$a;

    invoke-virtual {p2}, La/f/b/i/d;->o()I

    move-result v2

    iput v2, v1, La/f/b/i/l/b$a;->c:I

    iget-object v1, p0, La/f/b/i/l/b;->b:La/f/b/i/l/b$a;

    invoke-virtual {p2}, La/f/b/i/d;->i()I

    move-result v2

    iput v2, v1, La/f/b/i/l/b$a;->d:I

    iget-object v1, p0, La/f/b/i/l/b;->b:La/f/b/i/l/b$a;

    const/4 v2, 0x0

    iput-boolean v2, v1, La/f/b/i/l/b$a;->i:Z

    iput-boolean p3, v1, La/f/b/i/l/b$a;->j:Z

    iget-object p3, v1, La/f/b/i/l/b$a;->a:La/f/b/i/d$a;

    sget-object v3, La/f/b/i/d$a;->d:La/f/b/i/d$a;

    const/4 v4, 0x1

    if-ne p3, v3, :cond_0

    move p3, v4

    goto :goto_0

    :cond_0
    move p3, v2

    :goto_0
    iget-object v5, v1, La/f/b/i/l/b$a;->b:La/f/b/i/d$a;

    if-ne v5, v3, :cond_1

    move v3, v4

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    const/4 v5, 0x0

    if-eqz p3, :cond_2

    iget p3, p2, La/f/b/i/d;->N:F

    cmpl-float p3, p3, v5

    if-lez p3, :cond_2

    move p3, v4

    goto :goto_2

    :cond_2
    move p3, v2

    :goto_2
    if-eqz v3, :cond_3

    iget v3, p2, La/f/b/i/d;->N:F

    cmpl-float v3, v3, v5

    if-lez v3, :cond_3

    move v3, v4

    goto :goto_3

    :cond_3
    move v3, v2

    :goto_3
    const/4 v5, 0x4

    if-eqz p3, :cond_4

    iget-object p3, p2, La/f/b/i/d;->l:[I

    aget p3, p3, v2

    if-ne p3, v5, :cond_4

    iput-object v0, v1, La/f/b/i/l/b$a;->a:La/f/b/i/d$a;

    :cond_4
    if-eqz v3, :cond_5

    iget-object p3, p2, La/f/b/i/d;->l:[I

    aget p3, p3, v4

    if-ne p3, v5, :cond_5

    iput-object v0, v1, La/f/b/i/l/b$a;->b:La/f/b/i/d$a;

    :cond_5
    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;

    invoke-virtual {p1, p2, v1}, Landroidx/constraintlayout/widget/ConstraintLayout$b;->a(La/f/b/i/d;La/f/b/i/l/b$a;)V

    iget-object p1, p0, La/f/b/i/l/b;->b:La/f/b/i/l/b$a;

    iget p1, p1, La/f/b/i/l/b$a;->e:I

    invoke-virtual {p2, p1}, La/f/b/i/d;->B(I)V

    iget-object p1, p0, La/f/b/i/l/b;->b:La/f/b/i/l/b$a;

    iget p1, p1, La/f/b/i/l/b$a;->f:I

    invoke-virtual {p2, p1}, La/f/b/i/d;->w(I)V

    iget-object p1, p0, La/f/b/i/l/b;->b:La/f/b/i/l/b$a;

    iget-boolean p3, p1, La/f/b/i/l/b$a;->h:Z

    .line 1
    iput-boolean p3, p2, La/f/b/i/d;->w:Z

    .line 2
    iget p3, p1, La/f/b/i/l/b$a;->g:I

    .line 3
    iput p3, p2, La/f/b/i/d;->R:I

    if-lez p3, :cond_6

    goto :goto_4

    :cond_6
    move v4, v2

    :goto_4
    iput-boolean v4, p2, La/f/b/i/d;->w:Z

    .line 4
    iput-boolean v2, p1, La/f/b/i/l/b$a;->j:Z

    iget-boolean p1, p1, La/f/b/i/l/b$a;->i:Z

    return p1
.end method

.method public final b(La/f/b/i/e;II)V
    .locals 3

    .line 1
    iget v0, p1, La/f/b/i/d;->S:I

    .line 2
    iget v1, p1, La/f/b/i/d;->T:I

    const/4 v2, 0x0

    .line 3
    invoke-virtual {p1, v2}, La/f/b/i/d;->z(I)V

    invoke-virtual {p1, v2}, La/f/b/i/d;->y(I)V

    .line 4
    iput p2, p1, La/f/b/i/d;->L:I

    iget v2, p1, La/f/b/i/d;->S:I

    if-ge p2, v2, :cond_0

    iput v2, p1, La/f/b/i/d;->L:I

    .line 5
    :cond_0
    iput p3, p1, La/f/b/i/d;->M:I

    iget p2, p1, La/f/b/i/d;->T:I

    if-ge p3, p2, :cond_1

    iput p2, p1, La/f/b/i/d;->M:I

    .line 6
    :cond_1
    invoke-virtual {p1, v0}, La/f/b/i/d;->z(I)V

    invoke-virtual {p1, v1}, La/f/b/i/d;->y(I)V

    iget-object p1, p0, La/f/b/i/l/b;->c:La/f/b/i/e;

    invoke-virtual {p1}, La/f/b/i/e;->E()V

    return-void
.end method
