.class public Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->f(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/jaredrummler/android/colorpicker/ColorPanelView;

.field public final synthetic b:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;


# direct methods
.method public constructor <init>(Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;Lcom/jaredrummler/android/colorpicker/ColorPanelView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$i;->b:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$i;->a:Lcom/jaredrummler/android/colorpicker/ColorPanelView;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 8

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
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$i;->b:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;

    .line 22
    .line 23
    iget v0, p1, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->d:I

    .line 24
    .line 25
    invoke-static {p1, v0}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->c(Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;I)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$i;->b:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;

    .line 29
    .line 30
    invoke-virtual {p1}, Landroidx/fragment/app/DialogFragment;->dismiss()V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$i;->b:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;

    .line 35
    .line 36
    iget-object v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$i;->a:Lcom/jaredrummler/android/colorpicker/ColorPanelView;

    .line 37
    .line 38
    invoke-virtual {v1}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->getColor()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    iput v1, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->d:I

    .line 43
    .line 44
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$i;->b:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;

    .line 45
    .line 46
    iget-object v0, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->i:Lcom/jaredrummler/android/colorpicker/a;

    .line 47
    .line 48
    invoke-virtual {v0}, Lcom/jaredrummler/android/colorpicker/a;->a()V

    .line 49
    .line 50
    .line 51
    const/4 v0, 0x0

    .line 52
    move v1, v0

    .line 53
    :goto_0
    iget-object v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$i;->b:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;

    .line 54
    .line 55
    iget-object v2, v2, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->j:Landroid/widget/LinearLayout;

    .line 56
    .line 57
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-ge v1, v2, :cond_6

    .line 62
    .line 63
    iget-object v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$i;->b:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;

    .line 64
    .line 65
    iget-object v2, v2, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->j:Landroid/widget/LinearLayout;

    .line 66
    .line 67
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    check-cast v2, Landroid/widget/FrameLayout;

    .line 72
    .line 73
    sget v3, Lcom/jaredrummler/android/colorpicker/R$id;->cpv_color_panel_view:I

    .line 74
    .line 75
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    check-cast v3, Lcom/jaredrummler/android/colorpicker/ColorPanelView;

    .line 80
    .line 81
    sget v4, Lcom/jaredrummler/android/colorpicker/R$id;->cpv_color_image_view:I

    .line 82
    .line 83
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    check-cast v2, Landroid/widget/ImageView;

    .line 88
    .line 89
    if-ne v3, p1, :cond_1

    .line 90
    .line 91
    sget v4, Lcom/jaredrummler/android/colorpicker/R$drawable;->cpv_preset_checked:I

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_1
    move v4, v0

    .line 95
    :goto_1
    invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 96
    .line 97
    .line 98
    if-ne v3, p1, :cond_2

    .line 99
    .line 100
    invoke-virtual {v3}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->getColor()I

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    invoke-static {v4}, Landroidx/core/graphics/ColorUtils;->calculateLuminance(I)D

    .line 105
    .line 106
    .line 107
    move-result-wide v4

    .line 108
    const-wide v6, 0x3fe4cccccccccccdL    # 0.65

    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    cmpl-double v4, v4, v6

    .line 114
    .line 115
    if-gez v4, :cond_3

    .line 116
    .line 117
    :cond_2
    invoke-virtual {v3}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->getColor()I

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    invoke-static {v4}, Landroid/graphics/Color;->alpha(I)I

    .line 122
    .line 123
    .line 124
    move-result v4

    .line 125
    const/16 v5, 0xa5

    .line 126
    .line 127
    if-gt v4, v5, :cond_4

    .line 128
    .line 129
    :cond_3
    const/high16 v4, -0x1000000

    .line 130
    .line 131
    sget-object v5, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 132
    .line 133
    invoke-virtual {v2, v4, v5}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 134
    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_4
    const/4 v4, 0x0

    .line 138
    invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 139
    .line 140
    .line 141
    :goto_2
    if-ne v3, p1, :cond_5

    .line 142
    .line 143
    const/4 v2, 0x1

    .line 144
    goto :goto_3

    .line 145
    :cond_5
    move v2, v0

    .line 146
    :goto_3
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    invoke-virtual {v3, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    add-int/lit8 v1, v1, 0x1

    .line 154
    .line 155
    goto :goto_0

    .line 156
    :cond_6
    return-void
.end method
