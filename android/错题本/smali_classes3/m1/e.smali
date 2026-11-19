.class public final Lm1/e;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# instance fields
.field public final a:Lo2/a;

.field public final b:[I

.field public c:I

.field public final d:I


# direct methods
.method public constructor <init>(Lo2/a;[III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm1/e;->a:Lo2/a;

    .line 5
    .line 6
    iput-object p2, p0, Lm1/e;->b:[I

    .line 7
    .line 8
    iput p3, p0, Lm1/e;->c:I

    .line 9
    .line 10
    iput p4, p0, Lm1/e;->d:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lm1/e;->b:[I

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    return v0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lm1/e;->b:[I

    .line 2
    .line 3
    aget p1, v0, p1

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public final getItemId(I)J
    .locals 2

    .line 1
    int-to-long v0, p1

    .line 2
    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 9

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    new-instance p2, Lm1/d;

    .line 4
    .line 5
    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object p3

    .line 9
    invoke-direct {p2, p0, p3}, Lm1/d;-><init>(Lm1/e;Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    iget-object p3, p2, Lm1/d;->a:Landroid/view/View;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    check-cast p3, Lm1/d;

    .line 20
    .line 21
    move-object v8, p3

    .line 22
    move-object p3, p2

    .line 23
    move-object p2, v8

    .line 24
    :goto_0
    iget-object v0, p2, Lm1/d;->e:Lm1/e;

    .line 25
    .line 26
    iget-object v1, v0, Lm1/e;->b:[I

    .line 27
    .line 28
    aget v2, v1, p1

    .line 29
    .line 30
    invoke-static {v2}, Landroid/graphics/Color;->alpha(I)I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    iget-object v4, p2, Lm1/d;->b:Lcom/jaredrummler/android/colorpicker/ColorPanelView;

    .line 35
    .line 36
    invoke-virtual {v4, v2}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->setColor(I)V

    .line 37
    .line 38
    .line 39
    iget-object v5, p2, Lm1/d;->c:Landroid/widget/ImageView;

    .line 40
    .line 41
    iget v6, v0, Lm1/e;->c:I

    .line 42
    .line 43
    if-ne v6, p1, :cond_1

    .line 44
    .line 45
    sget v6, Lcom/jaredrummler/android/colorpicker/R$drawable;->cpv_preset_checked:I

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    const/4 v6, 0x0

    .line 49
    :goto_1
    invoke-virtual {v5, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 50
    .line 51
    .line 52
    const/16 v6, 0xff

    .line 53
    .line 54
    const/high16 v7, -0x1000000

    .line 55
    .line 56
    if-eq v3, v6, :cond_3

    .line 57
    .line 58
    const/16 v0, 0xa5

    .line 59
    .line 60
    if-gt v3, v0, :cond_2

    .line 61
    .line 62
    or-int v0, v2, v7

    .line 63
    .line 64
    invoke-virtual {v4, v0}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->setBorderColor(I)V

    .line 65
    .line 66
    .line 67
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 68
    .line 69
    invoke-virtual {v5, v7, v0}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 70
    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_2
    iget v0, p2, Lm1/d;->d:I

    .line 74
    .line 75
    invoke-virtual {v4, v0}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->setBorderColor(I)V

    .line 76
    .line 77
    .line 78
    const/4 v0, -0x1

    .line 79
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 80
    .line 81
    invoke-virtual {v5, v0, v1}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 82
    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_3
    iget v0, v0, Lm1/e;->c:I

    .line 86
    .line 87
    if-ne p1, v0, :cond_4

    .line 88
    .line 89
    aget v0, v1, p1

    .line 90
    .line 91
    invoke-static {v0}, Landroidx/core/graphics/ColorUtils;->calculateLuminance(I)D

    .line 92
    .line 93
    .line 94
    move-result-wide v0

    .line 95
    const-wide v2, 0x3fe4cccccccccccdL    # 0.65

    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    cmpl-double v0, v0, v2

    .line 101
    .line 102
    if-ltz v0, :cond_4

    .line 103
    .line 104
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 105
    .line 106
    invoke-virtual {v5, v7, v0}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 107
    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_4
    const/4 v0, 0x0

    .line 111
    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 112
    .line 113
    .line 114
    :goto_2
    new-instance v0, Lm1/b;

    .line 115
    .line 116
    invoke-direct {v0, p2, p1}, Lm1/b;-><init>(Lm1/d;I)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v4, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 120
    .line 121
    .line 122
    new-instance p1, Lm1/c;

    .line 123
    .line 124
    const/4 v0, 0x0

    .line 125
    invoke-direct {p1, p2, v0}, Lm1/c;-><init>(Ljava/lang/Object;I)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v4, p1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 129
    .line 130
    .line 131
    return-object p3
.end method
