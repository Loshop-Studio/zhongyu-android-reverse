.class public final Lz2/b;
.super Landroid/view/ViewOutlineProvider;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lz2/c;


# direct methods
.method public constructor <init>(Lz2/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz2/b;->a:Lz2/c;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/view/ViewOutlineProvider;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final getOutline(Landroid/view/View;Landroid/graphics/Outline;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v0, :cond_9

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto/16 :goto_2

    .line 14
    .line 15
    :cond_0
    iget-object v2, p0, Lz2/b;->a:Lz2/c;

    .line 16
    .line 17
    iget v3, v2, Lz2/c;->A:I

    .line 18
    .line 19
    if-lez v3, :cond_5

    .line 20
    .line 21
    iget v4, v2, Lz2/c;->B:I

    .line 22
    .line 23
    if-eqz v4, :cond_5

    .line 24
    .line 25
    const/4 v2, 0x4

    .line 26
    const/4 v5, 0x0

    .line 27
    if-ne v4, v2, :cond_1

    .line 28
    .line 29
    rsub-int/lit8 v2, v3, 0x0

    .line 30
    .line 31
    move v4, v1

    .line 32
    move v1, v2

    .line 33
    move v2, v5

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    const/4 v2, 0x1

    .line 36
    if-ne v4, v2, :cond_2

    .line 37
    .line 38
    rsub-int/lit8 v2, v3, 0x0

    .line 39
    .line 40
    move v4, v1

    .line 41
    move v1, v5

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    const/4 v2, 0x2

    .line 44
    if-ne v4, v2, :cond_4

    .line 45
    .line 46
    add-int/2addr v0, v3

    .line 47
    :cond_3
    :goto_0
    move v4, v1

    .line 48
    move v1, v5

    .line 49
    move v2, v1

    .line 50
    goto :goto_1

    .line 51
    :cond_4
    const/4 v2, 0x3

    .line 52
    if-ne v4, v2, :cond_3

    .line 53
    .line 54
    add-int/2addr v1, v3

    .line 55
    goto :goto_0

    .line 56
    :goto_1
    int-to-float v5, v3

    .line 57
    move v3, v0

    .line 58
    move-object v0, p2

    .line 59
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_5
    move v3, v0

    .line 64
    iget v4, v2, Lz2/c;->Q:I

    .line 65
    .line 66
    add-int/lit8 v5, v4, 0x1

    .line 67
    .line 68
    iget v6, v2, Lz2/c;->R:I

    .line 69
    .line 70
    sub-int/2addr v1, v6

    .line 71
    invoke-static {v5, v1}, Ljava/lang/Math;->max(II)I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    iget v5, v2, Lz2/c;->O:I

    .line 76
    .line 77
    iget v6, v2, Lz2/c;->P:I

    .line 78
    .line 79
    sub-int/2addr v3, v6

    .line 80
    iget-boolean v6, v2, Lz2/c;->I:Z

    .line 81
    .line 82
    if-eqz v6, :cond_6

    .line 83
    .line 84
    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    add-int/2addr v5, v6

    .line 89
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    add-int/2addr v4, v6

    .line 94
    add-int/lit8 v6, v5, 0x1

    .line 95
    .line 96
    invoke-virtual {p1}, Landroid/view/View;->getPaddingRight()I

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    sub-int/2addr v3, v7

    .line 101
    invoke-static {v6, v3}, Ljava/lang/Math;->max(II)I

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    add-int/lit8 v6, v4, 0x1

    .line 106
    .line 107
    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    .line 108
    .line 109
    .line 110
    move-result v7

    .line 111
    sub-int/2addr v1, v7

    .line 112
    invoke-static {v6, v1}, Ljava/lang/Math;->max(II)I

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    :cond_6
    move v8, v4

    .line 117
    move v4, v1

    .line 118
    move v1, v8

    .line 119
    iget v6, v2, Lz2/c;->M:F

    .line 120
    .line 121
    iget v7, v2, Lz2/c;->L:I

    .line 122
    .line 123
    if-nez v7, :cond_7

    .line 124
    .line 125
    const/high16 v6, 0x3f800000    # 1.0f

    .line 126
    .line 127
    :cond_7
    invoke-virtual {p2, v6}, Landroid/graphics/Outline;->setAlpha(F)V

    .line 128
    .line 129
    .line 130
    iget v2, v2, Lz2/c;->A:I

    .line 131
    .line 132
    if-gtz v2, :cond_8

    .line 133
    .line 134
    invoke-virtual {p2, v5, v1, v3, v4}, Landroid/graphics/Outline;->setRect(IIII)V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :cond_8
    int-to-float v2, v2

    .line 139
    move v0, v2

    .line 140
    move v2, v1

    .line 141
    move v1, v5

    .line 142
    move v5, v0

    .line 143
    move-object v0, p2

    .line 144
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    .line 145
    .line 146
    .line 147
    :cond_9
    :goto_2
    return-void
.end method
