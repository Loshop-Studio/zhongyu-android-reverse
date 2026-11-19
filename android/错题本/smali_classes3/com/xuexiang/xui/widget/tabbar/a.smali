.class public final Lcom/xuexiang/xui/widget/tabbar/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lp3/h;

.field public final synthetic b:Lp3/h;

.field public final synthetic c:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

.field public final synthetic d:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

.field public final synthetic e:Lcom/xuexiang/xui/widget/tabbar/TabSegment;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Lp3/h;Lp3/h;Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/a;->e:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/a;->a:Lp3/h;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/xuexiang/xui/widget/tabbar/a;->b:Lp3/h;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/xuexiang/xui/widget/tabbar/a;->c:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/xuexiang/xui/widget/tabbar/a;->d:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ljava/lang/Float;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    sget v0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->B:I

    .line 12
    .line 13
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/a;->a:Lp3/h;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/a;->e:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    .line 19
    .line 20
    iget v2, v1, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->n:I

    .line 21
    .line 22
    iget v3, v1, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->m:I

    .line 23
    .line 24
    invoke-static {p1, v2, v3}, Lcoil3/network/g;->f(FII)I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    iget-object v3, p0, Lcom/xuexiang/xui/widget/tabbar/a;->b:Lp3/h;

    .line 29
    .line 30
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    iget v4, v1, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->m:I

    .line 34
    .line 35
    iget v5, v1, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->n:I

    .line 36
    .line 37
    invoke-static {p1, v4, v5}, Lcoil3/network/g;->f(FII)I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    iget-object v5, p0, Lcom/xuexiang/xui/widget/tabbar/a;->c:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    .line 42
    .line 43
    invoke-virtual {v5, v0, v2}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->a(Lp3/h;I)V

    .line 44
    .line 45
    .line 46
    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/a;->d:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    .line 47
    .line 48
    invoke-virtual {v2, v3, v4}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->a(Lp3/h;I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, v0, v3, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->f(Lp3/h;Lp3/h;F)V

    .line 52
    .line 53
    .line 54
    return-void
.end method
