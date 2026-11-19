.class public Ly2/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Landroid/content/Context;

.field public b:Landroid/graphics/drawable/Drawable;

.field public c:Landroid/graphics/drawable/Drawable;

.field public d:Ljava/lang/String;

.field public e:Landroid/content/res/ColorStateList;

.field public f:I

.field public g:Landroid/graphics/Typeface;

.field public h:I

.field public i:I

.field public j:I

.field public k:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x2

    .line 5
    iput v0, p0, Ly2/i;->i:I

    .line 6
    .line 7
    iput v0, p0, Ly2/i;->j:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput v0, p0, Ly2/i;->k:I

    .line 11
    .line 12
    iput-object p1, p0, Ly2/i;->a:Landroid/content/Context;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public a()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Ly2/i;->b:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()I
    .locals 1

    .line 1
    iget v0, p0, Ly2/i;->j:I

    .line 2
    .line 3
    return v0
.end method

.method public c()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Ly2/i;->c:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Ly2/i;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public e()I
    .locals 1

    .line 1
    iget v0, p0, Ly2/i;->h:I

    .line 2
    .line 3
    return v0
.end method

.method public f()I
    .locals 1

    .line 1
    iget v0, p0, Ly2/i;->f:I

    .line 2
    .line 3
    return v0
.end method

.method public g()Landroid/graphics/Typeface;
    .locals 1

    .line 1
    iget-object v0, p0, Ly2/i;->g:Landroid/graphics/Typeface;

    .line 2
    .line 3
    return-object v0
.end method

.method public h()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Ly2/i;->e:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object v0
.end method

.method public i()I
    .locals 1

    .line 1
    iget v0, p0, Ly2/i;->k:I

    .line 2
    .line 3
    return v0
.end method

.method public j()I
    .locals 1

    .line 1
    iget v0, p0, Ly2/i;->i:I

    .line 2
    .line 3
    return v0
.end method

.method public k(I)Ly2/i;
    .locals 1

    .line 1
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Ly2/i;->b:Landroid/graphics/drawable/Drawable;

    .line 7
    .line 8
    return-object p0
.end method

.method public l(I)Ly2/i;
    .locals 0

    .line 1
    iput p1, p0, Ly2/i;->j:I

    .line 2
    .line 3
    return-object p0
.end method

.method public m(I)Ly2/i;
    .locals 1

    .line 1
    iget-object v0, p0, Ly2/i;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, Ly2/i;->n(Ljava/lang/String;)Ly2/i;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public n(Ljava/lang/String;)Ly2/i;
    .locals 0

    .line 1
    iput-object p1, p0, Ly2/i;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public o(I)Ly2/i;
    .locals 0

    .line 1
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Ly2/i;->e:Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    return-object p0
.end method

.method public p(I)Ly2/i;
    .locals 1

    .line 1
    iget-object v0, p0, Ly2/i;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0, p1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {p0, p1}, Ly2/i;->o(I)Ly2/i;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public q(I)Ly2/i;
    .locals 0

    .line 1
    iput p1, p0, Ly2/i;->i:I

    .line 2
    .line 3
    return-object p0
.end method
