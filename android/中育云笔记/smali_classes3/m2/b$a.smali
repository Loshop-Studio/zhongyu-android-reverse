.class public final Lm2/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm2/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Landroid/content/Context;

.field public b:Landroidx/databinding/ViewDataBinding;

.field public c:I

.field public d:I

.field public e:Z

.field public f:Z

.field public g:Ljava/lang/Float;

.field public h:Ljava/lang/Integer;

.field public i:Landroid/view/View;

.field public j:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lm2/b$a;->a:Landroid/content/Context;

    .line 10
    .line 11
    const/4 p1, -0x2

    .line 12
    iput p1, p0, Lm2/b$a;->c:I

    .line 13
    .line 14
    iput p1, p0, Lm2/b$a;->d:I

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    iput-boolean p1, p0, Lm2/b$a;->j:Z

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final a(Lm2/b;)V
    .locals 2

    .line 1
    const-string v0, "controller"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm2/b$a;->i:Landroid/view/View;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lm2/b;->c(Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lm2/b$a;->b:Landroidx/databinding/ViewDataBinding;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "getRoot(...)"

    .line 22
    .line 23
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v0}, Lm2/b;->c(Landroid/view/View;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    iget v0, p0, Lm2/b$a;->c:I

    .line 30
    .line 31
    iget v1, p0, Lm2/b$a;->d:I

    .line 32
    .line 33
    invoke-virtual {p1, v0, v1}, Lm2/b;->g(II)V

    .line 34
    .line 35
    .line 36
    iget-boolean v0, p0, Lm2/b$a;->j:Z

    .line 37
    .line 38
    invoke-virtual {p1, v0}, Lm2/b;->f(Z)V

    .line 39
    .line 40
    .line 41
    iget-boolean v0, p0, Lm2/b$a;->e:Z

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    iget-object v0, p0, Lm2/b$a;->g:Ljava/lang/Float;

    .line 46
    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    invoke-virtual {p1, v0}, Lm2/b;->e(F)V

    .line 54
    .line 55
    .line 56
    :cond_2
    iget-boolean v0, p0, Lm2/b$a;->f:Z

    .line 57
    .line 58
    if-eqz v0, :cond_3

    .line 59
    .line 60
    iget-object v0, p0, Lm2/b$a;->h:Ljava/lang/Integer;

    .line 61
    .line 62
    if-eqz v0, :cond_3

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    invoke-virtual {p1, v0}, Lm2/b;->d(I)V

    .line 69
    .line 70
    .line 71
    :cond_3
    return-void
.end method

.method public final b()Landroidx/databinding/ViewDataBinding;
    .locals 1

    .line 1
    iget-object v0, p0, Lm2/b$a;->b:Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lm2/b$a;->a:Landroid/content/Context;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d(Landroidx/databinding/ViewDataBinding;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm2/b$a;->b:Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    return-void
.end method

.method public final e(I)V
    .locals 0

    .line 1
    iput p1, p0, Lm2/b$a;->d:I

    .line 2
    .line 3
    return-void
.end method

.method public final f(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lm2/b$a;->j:Z

    .line 2
    .line 3
    return-void
.end method

.method public final g(Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm2/b$a;->i:Landroid/view/View;

    .line 2
    .line 3
    return-void
.end method

.method public final h(I)V
    .locals 0

    .line 1
    iput p1, p0, Lm2/b$a;->c:I

    .line 2
    .line 3
    return-void
.end method
