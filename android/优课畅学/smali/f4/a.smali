.class public abstract Lf4/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:Ld4/a;

.field public c:I

.field public d:Landroid/graphics/Matrix;

.field public e:Landroid/graphics/Matrix;

.field public f:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lf4/a;->a:Z

    .line 6
    .line 7
    new-instance v0, Landroid/graphics/Matrix;

    .line 8
    .line 9
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lf4/a;->d:Landroid/graphics/Matrix;

    .line 13
    .line 14
    new-instance v0, Landroid/graphics/Matrix;

    .line 15
    .line 16
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lf4/a;->e:Landroid/graphics/Matrix;

    .line 20
    .line 21
    new-instance v0, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lf4/a;->f:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {p0}, Lf4/a;->b()Ld4/a;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, Lf4/a;->b:Ld4/a;

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public abstract a(Lh4/a;Landroid/graphics/Canvas;)V
.end method

.method public abstract b()Ld4/a;
.end method

.method public abstract c(I)V
.end method

.method public d()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lf4/a;->a:Z

    .line 2
    .line 3
    return v0
.end method

.method public e(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lf4/a;->a:Z

    .line 2
    .line 3
    return-void
.end method
