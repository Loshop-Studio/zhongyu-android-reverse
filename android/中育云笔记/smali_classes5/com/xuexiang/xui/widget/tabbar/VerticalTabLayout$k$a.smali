.class public Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k$a;->c:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k$a;->c:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k;->j:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    .line 4
    .line 5
    invoke-static {v0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->h(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x5

    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k$a;->c:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k$a;->c:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k;

    .line 19
    .line 20
    iget-object v2, v2, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k;->j:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    .line 21
    .line 22
    invoke-static {v2}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->j(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    sub-int/2addr v1, v2

    .line 27
    int-to-float v1, v1

    .line 28
    invoke-static {v0, v1}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k;->c(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k;F)F

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k$a;->c:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k;

    .line 33
    .line 34
    iget-object v0, v0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k;->j:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    .line 35
    .line 36
    invoke-static {v0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->h(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    const/16 v1, 0x77

    .line 41
    .line 42
    if-ne v0, v1, :cond_1

    .line 43
    .line 44
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k$a;->c:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k;

    .line 45
    .line 46
    iget-object v1, v0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k;->j:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    .line 47
    .line 48
    invoke-static {v1}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->j(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    invoke-static {v0, v1}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k;->d(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k;I)I

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k$a;->c:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k;

    .line 56
    .line 57
    iget-object v1, v0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k;->j:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    .line 58
    .line 59
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    invoke-static {v1, v0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->k(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;I)I

    .line 64
    .line 65
    .line 66
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k$a;->c:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k;

    .line 67
    .line 68
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 69
    .line 70
    .line 71
    return-void
.end method
