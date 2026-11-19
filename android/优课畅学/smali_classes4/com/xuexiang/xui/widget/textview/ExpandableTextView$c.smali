.class public Lcom/xuexiang/xui/widget/textview/ExpandableTextView$c;
.super Landroid/view/animation/Animation;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/textview/ExpandableTextView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public final a:Landroid/view/View;

.field public final b:I

.field public final c:I

.field public final synthetic d:Lcom/xuexiang/xui/widget/textview/ExpandableTextView;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/textview/ExpandableTextView;Landroid/view/View;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView$c;->d:Lcom/xuexiang/xui/widget/textview/ExpandableTextView;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView$c;->a:Landroid/view/View;

    .line 7
    .line 8
    iput p3, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView$c;->b:I

    .line 9
    .line 10
    iput p4, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView$c;->c:I

    .line 11
    .line 12
    invoke-static {p1}, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->g(Lcom/xuexiang/xui/widget/textview/ExpandableTextView;)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    int-to-long p1, p1

    .line 17
    invoke-virtual {p0, p1, p2}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 18
    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 4

    .line 1
    iget p2, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView$c;->c:I

    .line 2
    .line 3
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView$c;->b:I

    .line 4
    .line 5
    sub-int/2addr p2, v0

    .line 6
    int-to-float p2, p2

    .line 7
    mul-float/2addr p2, p1

    .line 8
    int-to-float v0, v0

    .line 9
    add-float/2addr p2, v0

    .line 10
    float-to-int p2, p2

    .line 11
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView$c;->d:Lcom/xuexiang/xui/widget/textview/ExpandableTextView;

    .line 12
    .line 13
    iget-object v1, v0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->a:Landroid/widget/TextView;

    .line 14
    .line 15
    invoke-static {v0}, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->e(Lcom/xuexiang/xui/widget/textview/ExpandableTextView;)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    sub-int v0, p2, v0

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setMaxHeight(I)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView$c;->d:Lcom/xuexiang/xui/widget/textview/ExpandableTextView;

    .line 25
    .line 26
    invoke-static {v0}, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->a(Lcom/xuexiang/xui/widget/textview/ExpandableTextView;)F

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const/high16 v1, 0x3f800000    # 1.0f

    .line 31
    .line 32
    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView$c;->d:Lcom/xuexiang/xui/widget/textview/ExpandableTextView;

    .line 39
    .line 40
    iget-object v2, v0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->a:Landroid/widget/TextView;

    .line 41
    .line 42
    invoke-static {v0}, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->a(Lcom/xuexiang/xui/widget/textview/ExpandableTextView;)F

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object v3, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView$c;->d:Lcom/xuexiang/xui/widget/textview/ExpandableTextView;

    .line 47
    .line 48
    invoke-static {v3}, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->a(Lcom/xuexiang/xui/widget/textview/ExpandableTextView;)F

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    sub-float/2addr v1, v3

    .line 53
    mul-float/2addr p1, v1

    .line 54
    add-float/2addr v0, p1

    .line 55
    invoke-static {v2, v0}, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->b(Landroid/view/View;F)V

    .line 56
    .line 57
    .line 58
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView$c;->a:Landroid/view/View;

    .line 59
    .line 60
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    iput p2, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 65
    .line 66
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView$c;->a:Landroid/view/View;

    .line 67
    .line 68
    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public initialize(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/animation/Animation;->initialize(IIII)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public willChangeBounds()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
