.class public final Lb2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lb2/a;->a:I

    iput-object p1, p0, Lb2/a;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 4

    .line 1
    iget v0, p0, Lb2/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb2/a;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;

    .line 9
    .line 10
    iget p1, p1, Landroid/os/Message;->what:I

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    if-eq p1, v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget p1, v0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->e:F

    .line 17
    .line 18
    const/high16 v2, -0x80000000

    .line 19
    .line 20
    cmpg-float v2, p1, v2

    .line 21
    .line 22
    if-gez v2, :cond_1

    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->b()V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    iget v2, v0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->g:I

    .line 29
    .line 30
    int-to-float v2, v2

    .line 31
    sub-float/2addr p1, v2

    .line 32
    iput p1, v0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->e:F

    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 35
    .line 36
    .line 37
    iget-boolean p1, v0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->b:Z

    .line 38
    .line 39
    if-nez p1, :cond_2

    .line 40
    .line 41
    iget-object p1, v0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->j:Landroid/os/Handler;

    .line 42
    .line 43
    if-eqz p1, :cond_2

    .line 44
    .line 45
    const/16 v0, 0x1e

    .line 46
    .line 47
    int-to-long v2, v0

    .line 48
    invoke-virtual {p1, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 49
    .line 50
    .line 51
    :cond_2
    :goto_0
    return v1

    .line 52
    :pswitch_0
    iget-object v0, p0, Lb2/a;->b:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, Lm0/e;

    .line 55
    .line 56
    iget v1, p1, Landroid/os/Message;->what:I

    .line 57
    .line 58
    const/4 v2, 0x1

    .line 59
    if-ne v1, v2, :cond_3

    .line 60
    .line 61
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p1, Lm0/c;

    .line 64
    .line 65
    invoke-virtual {v0, p1}, Lm0/e;->b(Lm0/c;)V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_3
    const/4 v2, 0x2

    .line 70
    if-ne v1, v2, :cond_4

    .line 71
    .line 72
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p1, Lm0/c;

    .line 75
    .line 76
    iget-object v0, v0, Lm0/e;->d:Lcom/bumptech/glide/h;

    .line 77
    .line 78
    invoke-virtual {v0, p1}, Lcom/bumptech/glide/h;->k(Ls0/i;)V

    .line 79
    .line 80
    .line 81
    :cond_4
    const/4 v2, 0x0

    .line 82
    :goto_1
    return v2

    .line 83
    :pswitch_1
    iget-object p1, p0, Lb2/a;->b:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast p1, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;

    .line 86
    .line 87
    iget v0, p1, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->f:I

    .line 88
    .line 89
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->d()Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    const/4 v2, 0x1

    .line 94
    if-eqz v1, :cond_7

    .line 95
    .line 96
    iget-boolean v1, p1, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->t:Z

    .line 97
    .line 98
    if-eqz v1, :cond_6

    .line 99
    .line 100
    iget-object v1, p1, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->d:Landroidx/viewpager/widget/ViewPager;

    .line 101
    .line 102
    instance-of v3, v1, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;

    .line 103
    .line 104
    if-eqz v3, :cond_5

    .line 105
    .line 106
    check-cast v1, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;

    .line 107
    .line 108
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->getPageAdapterWrapper()Landroidx/viewpager/widget/PagerAdapter;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-virtual {v1}, Landroidx/viewpager/widget/PagerAdapter;->notifyDataSetChanged()V

    .line 113
    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_5
    invoke-virtual {v1}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Landroidx/viewpager/widget/PagerAdapter;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    if-eqz v1, :cond_6

    .line 121
    .line 122
    iget-object v1, p1, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->d:Landroidx/viewpager/widget/ViewPager;

    .line 123
    .line 124
    invoke-virtual {v1}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Landroidx/viewpager/widget/PagerAdapter;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-virtual {v1}, Landroidx/viewpager/widget/PagerAdapter;->notifyDataSetChanged()V

    .line 129
    .line 130
    .line 131
    :cond_6
    :goto_2
    add-int/2addr v0, v2

    .line 132
    iget-object p1, p1, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->d:Landroidx/viewpager/widget/ViewPager;

    .line 133
    .line 134
    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    .line 135
    .line 136
    .line 137
    :cond_7
    return v2

    .line 138
    nop

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
