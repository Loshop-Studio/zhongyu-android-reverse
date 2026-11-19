.class public final Lr3/b;
.super Landroid/view/animation/Animation;
.source "SourceFile"


# instance fields
.field public final a:Lcom/xuexiang/xui/widget/textview/ExpandableTextView;

.field public final b:I

.field public final c:I

.field public final synthetic d:Lcom/xuexiang/xui/widget/textview/ExpandableTextView;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/textview/ExpandableTextView;Lcom/xuexiang/xui/widget/textview/ExpandableTextView;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr3/b;->d:Lcom/xuexiang/xui/widget/textview/ExpandableTextView;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lr3/b;->a:Lcom/xuexiang/xui/widget/textview/ExpandableTextView;

    .line 7
    .line 8
    iput p3, p0, Lr3/b;->b:I

    .line 9
    .line 10
    iput p4, p0, Lr3/b;->c:I

    .line 11
    .line 12
    iget p1, p1, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->k:I

    .line 13
    .line 14
    int-to-long p1, p1

    .line 15
    invoke-virtual {p0, p1, p2}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 3

    .line 1
    iget p2, p0, Lr3/b;->c:I

    .line 2
    .line 3
    iget v0, p0, Lr3/b;->b:I

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
    iget-object v0, p0, Lr3/b;->d:Lcom/xuexiang/xui/widget/textview/ExpandableTextView;

    .line 12
    .line 13
    iget-object v1, v0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->a:Landroid/widget/TextView;

    .line 14
    .line 15
    iget v2, v0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->h:I

    .line 16
    .line 17
    sub-int v2, p2, v2

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setMaxHeight(I)V

    .line 20
    .line 21
    .line 22
    iget v1, v0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->l:F

    .line 23
    .line 24
    const/high16 v2, 0x3f800000    # 1.0f

    .line 25
    .line 26
    invoke-static {v1, v2}, Ljava/lang/Float;->compare(FF)I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    iget-object v1, v0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->a:Landroid/widget/TextView;

    .line 33
    .line 34
    iget v0, v0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->l:F

    .line 35
    .line 36
    sub-float/2addr v2, v0

    .line 37
    mul-float/2addr v2, p1

    .line 38
    add-float/2addr v2, v0

    .line 39
    invoke-virtual {v1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 40
    .line 41
    .line 42
    :cond_0
    iget-object p1, p0, Lr3/b;->a:Lcom/xuexiang/xui/widget/textview/ExpandableTextView;

    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput p2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 49
    .line 50
    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final willChangeBounds()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method
