.class public final La2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;


# direct methods
.method public synthetic constructor <init>(Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;I)V
    .locals 0

    .line 1
    iput p2, p0, La2/a;->a:I

    iput-object p1, p0, La2/a;->b:Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget p1, p0, La2/a;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, La2/a;->b:Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;

    .line 7
    .line 8
    iget-object p1, p1, Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;->L:La2/b;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    check-cast p1, Lw1/a;

    .line 13
    .line 14
    iget-object v0, p1, Lw1/a;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lcom/xuexiang/xui/widget/activity/BaseGuideActivity;

    .line 17
    .line 18
    new-instance v1, Landroid/content/Intent;

    .line 19
    .line 20
    iget-object p1, p1, Lw1/a;->a:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p1, Ljava/lang/Class;

    .line 23
    .line 24
    invoke-direct {v1, v0, p1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void

    .line 34
    :pswitch_0
    iget-object p1, p0, La2/a;->b:Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;

    .line 35
    .line 36
    iget-object p1, p1, Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;->L:La2/b;

    .line 37
    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    check-cast p1, Lw1/a;

    .line 41
    .line 42
    iget-object v0, p1, Lw1/a;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, Lcom/xuexiang/xui/widget/activity/BaseGuideActivity;

    .line 45
    .line 46
    new-instance v1, Landroid/content/Intent;

    .line 47
    .line 48
    iget-object p1, p1, Lw1/a;->a:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p1, Ljava/lang/Class;

    .line 51
    .line 52
    invoke-direct {v1, v0, p1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 59
    .line 60
    .line 61
    :cond_1
    return-void

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
