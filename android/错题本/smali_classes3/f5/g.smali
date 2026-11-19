.class public final Lf5/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public b:I

.field public c:I

.field public final synthetic d:Lcom/zykj/mistake/widget/WrapLinearLayout;


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/widget/WrapLinearLayout;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lf5/g;->d:Lcom/zykj/mistake/widget/WrapLinearLayout;

    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lf5/g;->a:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-virtual {p1}, Landroid/view/View;->getPaddingRight()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    add-int/2addr p1, v0

    .line 22
    iput p1, p0, Lf5/g;->b:I

    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    iput p1, p0, Lf5/g;->c:I

    .line 26
    .line 27
    return-void
.end method

.method public static a(Lf5/g;Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lf5/g;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget v1, p0, Lf5/g;->b:I

    .line 10
    .line 11
    int-to-float v1, v1

    .line 12
    iget-object v2, p0, Lf5/g;->d:Lcom/zykj/mistake/widget/WrapLinearLayout;

    .line 13
    .line 14
    iget-object v2, v2, Lcom/zykj/mistake/widget/WrapLinearLayout;->a:Lf5/f;

    .line 15
    .line 16
    iget v2, v2, Lf5/f;->b:F

    .line 17
    .line 18
    add-float/2addr v1, v2

    .line 19
    float-to-int v1, v1

    .line 20
    iput v1, p0, Lf5/g;->b:I

    .line 21
    .line 22
    :cond_0
    iget v1, p0, Lf5/g;->c:I

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-le v1, v2, :cond_1

    .line 29
    .line 30
    iget v1, p0, Lf5/g;->c:I

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    :goto_0
    iput v1, p0, Lf5/g;->c:I

    .line 38
    .line 39
    iget v1, p0, Lf5/g;->b:I

    .line 40
    .line 41
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    add-int/2addr v2, v1

    .line 46
    iput v2, p0, Lf5/g;->b:I

    .line 47
    .line 48
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    return-void
.end method
