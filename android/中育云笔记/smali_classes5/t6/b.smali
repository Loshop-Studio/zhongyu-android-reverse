.class public Lt6/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/view/ViewGroup$MarginLayoutParams;

.field public final b:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt6/b;->b:Landroid/view/View;

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 11
    .line 12
    iput-object p1, p0, Lt6/b;->a:Landroid/view/ViewGroup$MarginLayoutParams;

    .line 13
    .line 14
    instance-of v0, p1, Landroid/widget/LinearLayout$LayoutParams;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    check-cast p1, Landroid/widget/LinearLayout$LayoutParams;

    .line 19
    .line 20
    const v0, 0x800003

    .line 21
    .line 22
    .line 23
    iput v0, p1, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 24
    .line 25
    :cond_0
    return-void
.end method


# virtual methods
.method public a(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lt6/b;->a:Landroid/view/ViewGroup$MarginLayoutParams;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iput p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 8
    .line 9
    iget-object p1, p0, Lt6/b;->b:Landroid/view/View;

    .line 10
    .line 11
    iget-object v0, p0, Lt6/b;->a:Landroid/view/ViewGroup$MarginLayoutParams;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public b(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lt6/b;->a:Landroid/view/ViewGroup$MarginLayoutParams;

    .line 2
    .line 3
    iput p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 4
    .line 5
    iget-object p1, p0, Lt6/b;->b:Landroid/view/View;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public c(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lt6/b;->a:Landroid/view/ViewGroup$MarginLayoutParams;

    .line 2
    .line 3
    iput p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 4
    .line 5
    iget-object p1, p0, Lt6/b;->b:Landroid/view/View;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public d(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lt6/b;->a:Landroid/view/ViewGroup$MarginLayoutParams;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iput p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 8
    .line 9
    iget-object p1, p0, Lt6/b;->b:Landroid/view/View;

    .line 10
    .line 11
    iget-object v0, p0, Lt6/b;->a:Landroid/view/ViewGroup$MarginLayoutParams;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
