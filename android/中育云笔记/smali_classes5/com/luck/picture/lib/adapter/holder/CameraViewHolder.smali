.class public Lcom/luck/picture/lib/adapter/holder/CameraViewHolder;
.super Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 4

    .line 1
    invoke-direct {p0, p1}, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;-><init>(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    sget v0, Lcom/luck/picture/lib/R$id;->tvCamera:I

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Landroid/widget/TextView;

    .line 11
    .line 12
    sget-object v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->P0:Lz6/a;

    .line 13
    .line 14
    invoke-virtual {v1}, Lz6/a;->c()Lcom/luck/picture/lib/style/SelectMainStyle;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Lcom/luck/picture/lib/style/SelectMainStyle;->a()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    invoke-static {v2}, La7/o;->c(I)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-virtual {v1}, Lcom/luck/picture/lib/style/SelectMainStyle;->b()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    invoke-static {v2}, La7/o;->c(I)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    invoke-virtual {v0, v3, v2, v3, v3}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(IIII)V

    .line 43
    .line 44
    .line 45
    :cond_1
    invoke-virtual {v1}, Lcom/luck/picture/lib/style/SelectMainStyle;->c()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-static {v2}, La7/o;->f(Ljava/lang/String;)Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_2

    .line 54
    .line 55
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    invoke-static {}, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    iget v2, v2, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c:I

    .line 64
    .line 65
    invoke-static {}, Ll6/d;->b()I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-ne v2, v3, :cond_3

    .line 70
    .line 71
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    sget v2, Lcom/luck/picture/lib/R$string;->ps_tape:I

    .line 76
    .line 77
    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 82
    .line 83
    .line 84
    :cond_3
    :goto_0
    invoke-virtual {v1}, Lcom/luck/picture/lib/style/SelectMainStyle;->h()I

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    invoke-static {p1}, La7/o;->b(I)Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-eqz v2, :cond_4

    .line 93
    .line 94
    int-to-float p1, p1

    .line 95
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 96
    .line 97
    .line 98
    :cond_4
    invoke-virtual {v1}, Lcom/luck/picture/lib/style/SelectMainStyle;->g()I

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    invoke-static {p1}, La7/o;->c(I)Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-eqz v1, :cond_5

    .line 107
    .line 108
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 109
    .line 110
    .line 111
    :cond_5
    return-void
.end method
