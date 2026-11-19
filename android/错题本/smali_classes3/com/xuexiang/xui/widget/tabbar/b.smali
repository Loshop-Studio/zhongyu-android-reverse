.class public final Lcom/xuexiang/xui/widget/tabbar/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# instance fields
.field public final synthetic a:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

.field public final synthetic b:Lp3/h;

.field public final synthetic c:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

.field public final synthetic d:Lp3/h;

.field public final synthetic e:I

.field public final synthetic f:Lcom/xuexiang/xui/widget/tabbar/TabSegment;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;Lp3/h;Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;Lp3/h;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/b;->f:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/b;->a:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/xuexiang/xui/widget/tabbar/b;->b:Lp3/h;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/xuexiang/xui/widget/tabbar/b;->c:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/xuexiang/xui/widget/tabbar/b;->d:Lp3/h;

    .line 13
    .line 14
    iput p6, p0, Lcom/xuexiang/xui/widget/tabbar/b;->e:I

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final onAnimationCancel(Landroid/animation/Animator;)V
    .locals 5

    .line 1
    const/4 p1, 0x0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/b;->f:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    .line 3
    .line 4
    iput-object p1, v0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->s:Landroid/animation/Animator;

    .line 5
    .line 6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/b;->a:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/b;->b:Lp3/h;

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-virtual {p1, v1, v2}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->b(Lp3/h;Z)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/b;->d:Lp3/h;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    iget-object v4, p0, Lcom/xuexiang/xui/widget/tabbar/b;->c:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    .line 18
    .line 19
    invoke-virtual {v4, p1, v3}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->b(Lp3/h;Z)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1, v2}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->e(Lp3/h;Z)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 8

    .line 1
    const/4 p1, 0x0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/b;->f:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    .line 3
    .line 4
    iput-object p1, v0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->s:Landroid/animation/Animator;

    .line 5
    .line 6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/b;->a:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/b;->b:Lp3/h;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-virtual {p1, v1, v2}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->b(Lp3/h;Z)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/b;->c:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    .line 15
    .line 16
    iget-object v3, p0, Lcom/xuexiang/xui/widget/tabbar/b;->d:Lp3/h;

    .line 17
    .line 18
    const/4 v4, 0x1

    .line 19
    invoke-virtual {v1, v3, v4}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->b(Lp3/h;Z)V

    .line 20
    .line 21
    .line 22
    iget v3, p0, Lcom/xuexiang/xui/widget/tabbar/b;->e:I

    .line 23
    .line 24
    invoke-virtual {v0, v3}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->d(I)V

    .line 25
    .line 26
    .line 27
    iget-object v5, v0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->a:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    sub-int/2addr v6, v4

    .line 34
    :goto_0
    if-ltz v6, :cond_0

    .line 35
    .line 36
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    check-cast v7, Lp3/j;

    .line 41
    .line 42
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    add-int/lit8 v6, v6, -0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->getTextView()Landroid/widget/TextView;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->getTextView()Landroid/widget/TextView;

    .line 52
    .line 53
    .line 54
    iput v3, v0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->c:I

    .line 55
    .line 56
    iget p1, v0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->d:I

    .line 57
    .line 58
    const/4 v1, -0x1

    .line 59
    if-eq p1, v1, :cond_1

    .line 60
    .line 61
    iget v3, v0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->r:I

    .line 62
    .line 63
    if-nez v3, :cond_1

    .line 64
    .line 65
    invoke-virtual {v0, p1, v4, v2}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->i(IZZ)V

    .line 66
    .line 67
    .line 68
    iput v1, v0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->d:I

    .line 69
    .line 70
    :cond_1
    return-void
.end method

.method public final onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/b;->f:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    .line 2
    .line 3
    iput-object p1, v0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->s:Landroid/animation/Animator;

    .line 4
    .line 5
    return-void
.end method
