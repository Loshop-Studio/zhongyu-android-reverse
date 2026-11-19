.class public final Lp3/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;


# direct methods
.method public synthetic constructor <init>(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;I)V
    .locals 0

    .line 1
    iput p2, p0, Lp3/k;->a:I

    iput-object p1, p0, Lp3/k;->b:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Lp3/k;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lp3/k;->b:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    .line 7
    .line 8
    iget-object v0, v0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->b:Lp3/r;

    .line 9
    .line 10
    iget-object v1, v0, Lp3/r;->h:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->getSelectedTabPosition()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-virtual {v0, v1}, Lp3/r;->b(I)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    iget-object v0, p0, Lp3/k;->b:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    .line 21
    .line 22
    iget-object v0, v0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->b:Lp3/r;

    .line 23
    .line 24
    iget-object v1, v0, Lp3/r;->h:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    .line 25
    .line 26
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->getSelectedTabPosition()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-virtual {v0, v1}, Lp3/r;->b(I)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_1
    iget-object v0, p0, Lp3/k;->b:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    .line 35
    .line 36
    iget-object v0, v0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->b:Lp3/r;

    .line 37
    .line 38
    iget-object v1, v0, Lp3/r;->h:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    .line 39
    .line 40
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->getSelectedTabPosition()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    invoke-virtual {v0, v1}, Lp3/r;->b(I)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :pswitch_2
    iget-object v0, p0, Lp3/k;->b:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    .line 49
    .line 50
    iget-object v0, v0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->b:Lp3/r;

    .line 51
    .line 52
    const/4 v1, 0x0

    .line 53
    invoke-virtual {v0, v1}, Lp3/r;->a(F)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
