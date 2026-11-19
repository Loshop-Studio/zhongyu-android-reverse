.class public final Lg3/b;
.super Ljava/util/TimerTask;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:I

.field public final c:I

.field public final d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg3/b;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 5
    .line 6
    iput p2, p0, Lg3/b;->c:I

    .line 7
    .line 8
    const p1, 0x7fffffff

    .line 9
    .line 10
    .line 11
    iput p1, p0, Lg3/b;->a:I

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    iput p1, p0, Lg3/b;->b:I

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget v0, p0, Lg3/b;->a:I

    .line 2
    .line 3
    const v1, 0x7fffffff

    .line 4
    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    iget v0, p0, Lg3/b;->c:I

    .line 9
    .line 10
    iput v0, p0, Lg3/b;->a:I

    .line 11
    .line 12
    :cond_0
    iget v0, p0, Lg3/b;->a:I

    .line 13
    .line 14
    int-to-float v1, v0

    .line 15
    const v2, 0x3dcccccd    # 0.1f

    .line 16
    .line 17
    .line 18
    mul-float/2addr v1, v2

    .line 19
    float-to-int v1, v1

    .line 20
    iput v1, p0, Lg3/b;->b:I

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    if-nez v1, :cond_2

    .line 24
    .line 25
    if-gez v0, :cond_1

    .line 26
    .line 27
    const/4 v1, -0x1

    .line 28
    iput v1, p0, Lg3/b;->b:I

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    iput v2, p0, Lg3/b;->b:I

    .line 32
    .line 33
    :cond_2
    :goto_0
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    const/16 v1, 0xbb8

    .line 38
    .line 39
    iget-object v3, p0, Lg3/b;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 40
    .line 41
    if-gt v0, v2, :cond_3

    .line 42
    .line 43
    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->a()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getHandler()Landroid/os/Handler;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_3
    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getTotalScrollY()F

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget v4, p0, Lg3/b;->b:I

    .line 59
    .line 60
    int-to-float v4, v4

    .line 61
    add-float/2addr v0, v4

    .line 62
    invoke-virtual {v3, v0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTotalScrollY(F)V

    .line 63
    .line 64
    .line 65
    iget-boolean v0, v3, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->o:Z

    .line 66
    .line 67
    if-nez v0, :cond_5

    .line 68
    .line 69
    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getItemHeight()F

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getInitPosition()I

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    neg-int v4, v4

    .line 78
    int-to-float v4, v4

    .line 79
    mul-float/2addr v4, v0

    .line 80
    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getItemsCount()I

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    sub-int/2addr v5, v2

    .line 85
    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getInitPosition()I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    sub-int/2addr v5, v2

    .line 90
    int-to-float v2, v5

    .line 91
    mul-float/2addr v2, v0

    .line 92
    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getTotalScrollY()F

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    cmpg-float v0, v0, v4

    .line 97
    .line 98
    if-lez v0, :cond_4

    .line 99
    .line 100
    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getTotalScrollY()F

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    cmpl-float v0, v0, v2

    .line 105
    .line 106
    if-ltz v0, :cond_5

    .line 107
    .line 108
    :cond_4
    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getTotalScrollY()F

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    iget v2, p0, Lg3/b;->b:I

    .line 113
    .line 114
    int-to-float v2, v2

    .line 115
    sub-float/2addr v0, v2

    .line 116
    invoke-virtual {v3, v0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTotalScrollY(F)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->a()V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getHandler()Landroid/os/Handler;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :cond_5
    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getHandler()Landroid/os/Handler;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    const/16 v1, 0x3e8

    .line 135
    .line 136
    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 137
    .line 138
    .line 139
    iget v0, p0, Lg3/b;->a:I

    .line 140
    .line 141
    iget v1, p0, Lg3/b;->b:I

    .line 142
    .line 143
    sub-int/2addr v0, v1

    .line 144
    iput v0, p0, Lg3/b;->a:I

    .line 145
    .line 146
    return-void
.end method
