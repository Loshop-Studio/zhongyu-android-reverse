.class public Lcom/xuexiang/xui/widget/tabbar/TabSegment$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/tabbar/TabSegment;->a0(IZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;

.field public final synthetic b:Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;

.field public final synthetic c:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

.field public final synthetic d:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

.field public final synthetic e:Lcom/xuexiang/xui/widget/tabbar/TabSegment;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$b;->e:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$b;->a:Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$b;->b:Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$b;->c:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$b;->d:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 4

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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$b;->e:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$b;->a:Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;

    .line 14
    .line 15
    invoke-static {v0, v1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->C(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$b;->e:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    .line 20
    .line 21
    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$b;->a:Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;

    .line 22
    .line 23
    invoke-static {v1, v2}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->D(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;)I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-static {v0, v1, p1}, Lcom/xuexiang/xui/utils/b;->a(IIF)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$b;->e:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    .line 32
    .line 33
    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$b;->b:Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;

    .line 34
    .line 35
    invoke-static {v1, v2}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->D(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$b;->e:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    .line 40
    .line 41
    iget-object v3, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$b;->b:Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;

    .line 42
    .line 43
    invoke-static {v2, v3}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->C(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;)I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    invoke-static {v1, v2, p1}, Lcom/xuexiang/xui/utils/b;->a(IIF)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$b;->c:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    .line 52
    .line 53
    iget-object v3, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$b;->a:Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;

    .line 54
    .line 55
    invoke-virtual {v2, v3, v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->a(Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;I)V

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$b;->d:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    .line 59
    .line 60
    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$b;->b:Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;

    .line 61
    .line 62
    invoke-virtual {v0, v2, v1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->a(Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;I)V

    .line 63
    .line 64
    .line 65
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$b;->e:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    .line 66
    .line 67
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$b;->a:Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;

    .line 68
    .line 69
    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$b;->b:Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;

    .line 70
    .line 71
    invoke-static {v0, v1, v2, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->E(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;F)V

    .line 72
    .line 73
    .line 74
    return-void
.end method
