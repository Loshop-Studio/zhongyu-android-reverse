.class public Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# instance fields
.field public a:Z

.field public b:J

.field public c:I

.field public d:J

.field public e:Z

.field public f:I

.field public g:F

.field public h:F

.field public i:F

.field public j:I

.field public k:I


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$e;->a:Z

    .line 6
    .line 7
    const-wide/16 v1, 0x5dc

    .line 8
    .line 9
    iput-wide v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$e;->b:J

    .line 10
    .line 11
    iput v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$e;->c:I

    .line 12
    .line 13
    const-wide/16 v1, 0xc8

    .line 14
    .line 15
    iput-wide v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$e;->d:J

    .line 16
    .line 17
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$e;->e:Z

    .line 18
    .line 19
    const/4 v1, 0x7

    .line 20
    iput v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$e;->f:I

    .line 21
    .line 22
    const/high16 v2, 0x41a00000    # 20.0f

    .line 23
    .line 24
    iput v2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$e;->g:F

    .line 25
    .line 26
    const/high16 v3, 0x3fc00000    # 1.5f

    .line 27
    .line 28
    iput v3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$e;->h:F

    .line 29
    .line 30
    iput v2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$e;->i:F

    .line 31
    .line 32
    iput v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$e;->j:I

    .line 33
    .line 34
    iput v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$e;->k:I

    .line 35
    .line 36
    invoke-static {}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->g()[I

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    const-string v3, "#FFFF99"

    .line 41
    .line 42
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    aput v3, v2, v0

    .line 47
    .line 48
    invoke-static {}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->g()[I

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    const-string v2, "#FFCCCC"

    .line 53
    .line 54
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    const/4 v3, 0x1

    .line 59
    aput v2, v0, v3

    .line 60
    .line 61
    invoke-static {}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->g()[I

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    const-string v2, "#996699"

    .line 66
    .line 67
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    const/4 v3, 0x2

    .line 72
    aput v2, v0, v3

    .line 73
    .line 74
    invoke-static {}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->g()[I

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    const-string v2, "#FF6666"

    .line 79
    .line 80
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    const/4 v3, 0x3

    .line 85
    aput v2, v0, v3

    .line 86
    .line 87
    invoke-static {}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->g()[I

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    const-string v2, "#FFFF66"

    .line 92
    .line 93
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    const/4 v3, 0x4

    .line 98
    aput v2, v0, v3

    .line 99
    .line 100
    invoke-static {}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->g()[I

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    const-string v2, "#F44336"

    .line 105
    .line 106
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    const/4 v3, 0x5

    .line 111
    aput v2, v0, v3

    .line 112
    .line 113
    invoke-static {}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->g()[I

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    const-string v2, "#666666"

    .line 118
    .line 119
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    const/4 v4, 0x6

    .line 124
    aput v3, v0, v4

    .line 125
    .line 126
    invoke-static {}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->g()[I

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    const-string v3, "#CCCC00"

    .line 131
    .line 132
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    aput v3, v0, v1

    .line 137
    .line 138
    invoke-static {}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->g()[I

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    const/16 v1, 0x8

    .line 143
    .line 144
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    aput v2, v0, v1

    .line 149
    .line 150
    invoke-static {}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->g()[I

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    const-string v1, "#999933"

    .line 155
    .line 156
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    const/16 v2, 0x9

    .line 161
    .line 162
    aput v1, v0, v2

    .line 163
    .line 164
    return-void
.end method
