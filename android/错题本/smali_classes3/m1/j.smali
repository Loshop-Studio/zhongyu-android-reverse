.class public final Lm1/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/jaredrummler/android/colorpicker/ColorPanelView;

.field public final synthetic b:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;


# direct methods
.method public constructor <init>(Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;Lcom/jaredrummler/android/colorpicker/ColorPanelView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm1/j;->b:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;

    .line 5
    .line 6
    iput-object p2, p0, Lm1/j;->a:Lcom/jaredrummler/android/colorpicker/ColorPanelView;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v0, v0, Ljava/lang/Boolean;

    .line 6
    .line 7
    iget-object v1, p0, Lm1/j;->b:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ljava/lang/Boolean;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    iget p1, v1, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->d:I

    .line 24
    .line 25
    invoke-static {v1, p1}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->e(Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Landroidx/fragment/app/DialogFragment;->dismiss()V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    iget-object v0, p0, Lm1/j;->a:Lcom/jaredrummler/android/colorpicker/ColorPanelView;

    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->getColor()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iput v0, v1, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->d:I

    .line 39
    .line 40
    iget-object v0, v1, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->h:Lm1/e;

    .line 41
    .line 42
    const/4 v2, -0x1

    .line 43
    iput v2, v0, Lm1/e;->c:I

    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 46
    .line 47
    .line 48
    const/4 v0, 0x0

    .line 49
    move v2, v0

    .line 50
    :goto_0
    iget-object v3, v1, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->i:Landroid/widget/LinearLayout;

    .line 51
    .line 52
    invoke-virtual {v3}, Landroid/view/ViewGroup;->getChildCount()I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-ge v2, v3, :cond_6

    .line 57
    .line 58
    iget-object v3, v1, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->i:Landroid/widget/LinearLayout;

    .line 59
    .line 60
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    check-cast v3, Landroid/widget/FrameLayout;

    .line 65
    .line 66
    sget v4, Lcom/jaredrummler/android/colorpicker/R$id;->cpv_color_panel_view:I

    .line 67
    .line 68
    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    check-cast v4, Lcom/jaredrummler/android/colorpicker/ColorPanelView;

    .line 73
    .line 74
    sget v5, Lcom/jaredrummler/android/colorpicker/R$id;->cpv_color_image_view:I

    .line 75
    .line 76
    invoke-virtual {v3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    check-cast v3, Landroid/widget/ImageView;

    .line 81
    .line 82
    if-ne v4, p1, :cond_1

    .line 83
    .line 84
    sget v5, Lcom/jaredrummler/android/colorpicker/R$drawable;->cpv_preset_checked:I

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_1
    move v5, v0

    .line 88
    :goto_1
    invoke-virtual {v3, v5}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 89
    .line 90
    .line 91
    if-ne v4, p1, :cond_2

    .line 92
    .line 93
    invoke-virtual {v4}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->getColor()I

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    invoke-static {v5}, Landroidx/core/graphics/ColorUtils;->calculateLuminance(I)D

    .line 98
    .line 99
    .line 100
    move-result-wide v5

    .line 101
    const-wide v7, 0x3fe4cccccccccccdL    # 0.65

    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    cmpl-double v5, v5, v7

    .line 107
    .line 108
    if-gez v5, :cond_3

    .line 109
    .line 110
    :cond_2
    invoke-virtual {v4}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->getColor()I

    .line 111
    .line 112
    .line 113
    move-result v5

    .line 114
    invoke-static {v5}, Landroid/graphics/Color;->alpha(I)I

    .line 115
    .line 116
    .line 117
    move-result v5

    .line 118
    const/16 v6, 0xa5

    .line 119
    .line 120
    if-gt v5, v6, :cond_4

    .line 121
    .line 122
    :cond_3
    const/high16 v5, -0x1000000

    .line 123
    .line 124
    sget-object v6, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 125
    .line 126
    invoke-virtual {v3, v5, v6}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 127
    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_4
    const/4 v5, 0x0

    .line 131
    invoke-virtual {v3, v5}, Landroid/widget/ImageView;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 132
    .line 133
    .line 134
    :goto_2
    if-ne v4, p1, :cond_5

    .line 135
    .line 136
    const/4 v3, 0x1

    .line 137
    goto :goto_3

    .line 138
    :cond_5
    move v3, v0

    .line 139
    :goto_3
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    invoke-virtual {v4, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    add-int/lit8 v2, v2, 0x1

    .line 147
    .line 148
    goto :goto_0

    .line 149
    :cond_6
    return-void
.end method
