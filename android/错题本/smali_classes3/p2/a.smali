.class public final Lp2/a;
.super Lp2/c;
.source "SourceFile"


# instance fields
.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Lcom/xuexiang/xui/widget/imageview/crop/Edge;Lcom/xuexiang/xui/widget/imageview/crop/Edge;I)V
    .locals 0

    .line 1
    iput p3, p0, Lp2/a;->d:I

    invoke-direct {p0, p1, p2}, Lp2/c;-><init>(Lcom/xuexiang/xui/widget/imageview/crop/Edge;Lcom/xuexiang/xui/widget/imageview/crop/Edge;)V

    return-void
.end method


# virtual methods
.method public final a(FFFLandroid/graphics/Rect;F)V
    .locals 9

    .line 1
    iget v0, p0, Lp2/a;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 7
    .line 8
    iget-object v1, p0, Lp2/c;->b:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 9
    .line 10
    if-ne v1, v0, :cond_0

    .line 11
    .line 12
    move v0, p1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    :goto_0
    sget-object v2, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->TOP:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 19
    .line 20
    iget-object v3, p0, Lp2/c;->a:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 21
    .line 22
    if-ne v3, v2, :cond_1

    .line 23
    .line 24
    move v2, p2

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    :goto_1
    sget-object v4, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 31
    .line 32
    if-ne v1, v4, :cond_2

    .line 33
    .line 34
    move v4, p1

    .line 35
    goto :goto_2

    .line 36
    :cond_2
    invoke-virtual {v4}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    :goto_2
    sget-object v5, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->BOTTOM:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 41
    .line 42
    if-ne v3, v5, :cond_3

    .line 43
    .line 44
    move v5, p2

    .line 45
    goto :goto_3

    .line 46
    :cond_3
    invoke-virtual {v5}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    :goto_3
    sub-float/2addr v4, v0

    .line 51
    sub-float/2addr v5, v2

    .line 52
    div-float/2addr v4, v5

    .line 53
    cmpl-float v0, v4, p3

    .line 54
    .line 55
    iget-object v2, p0, Lp2/c;->c:Landroid/support/v4/media/h;

    .line 56
    .line 57
    if-lez v0, :cond_4

    .line 58
    .line 59
    iput-object v1, v2, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 60
    .line 61
    iput-object v3, v2, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 62
    .line 63
    goto :goto_4

    .line 64
    :cond_4
    iput-object v3, v2, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 65
    .line 66
    iput-object v1, v2, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 67
    .line 68
    :goto_4
    iget-object v0, v2, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 69
    .line 70
    move-object v3, v0

    .line 71
    check-cast v3, Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 72
    .line 73
    iget-object v0, v2, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 76
    .line 77
    move v4, p1

    .line 78
    move v5, p2

    .line 79
    move v8, p3

    .line 80
    move-object v6, p4

    .line 81
    move v7, p5

    .line 82
    invoke-virtual/range {v3 .. v8}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->adjustCoordinate(FFLandroid/graphics/Rect;FF)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v8}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->adjustCoordinate(F)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v6, v7}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->isOutsideMargin(Landroid/graphics/Rect;F)Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-eqz p1, :cond_5

    .line 93
    .line 94
    invoke-virtual {v0, v6}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->snapToRect(Landroid/graphics/Rect;)F

    .line 95
    .line 96
    .line 97
    invoke-virtual {v3, v8}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->adjustCoordinate(F)V

    .line 98
    .line 99
    .line 100
    :cond_5
    return-void

    .line 101
    :pswitch_0
    move v4, p1

    .line 102
    move v5, p2

    .line 103
    move-object v6, p4

    .line 104
    move v7, p5

    .line 105
    invoke-virtual {p0, v4, v5, v6, v7}, Lp2/a;->b(FFLandroid/graphics/Rect;F)V

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public b(FFLandroid/graphics/Rect;F)V
    .locals 8

    .line 1
    iget v0, p0, Lp2/a;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3, p4}, Lp2/c;->b(FFLandroid/graphics/Rect;F)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    sget-object v2, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->TOP:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 17
    .line 18
    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    sget-object v4, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 23
    .line 24
    invoke-virtual {v4}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    sget-object v6, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->BOTTOM:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 29
    .line 30
    invoke-virtual {v6}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    add-float/2addr v1, v5

    .line 35
    const/high16 v5, 0x40000000    # 2.0f

    .line 36
    .line 37
    div-float/2addr v1, v5

    .line 38
    add-float/2addr v3, v7

    .line 39
    div-float/2addr v3, v5

    .line 40
    sub-float/2addr p1, v1

    .line 41
    sub-float/2addr p2, v3

    .line 42
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->offset(F)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2, p2}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->offset(F)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4, p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->offset(F)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v6, p2}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->offset(F)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, p3, p4}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->isOutsideMargin(Landroid/graphics/Rect;F)Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-eqz p1, :cond_0

    .line 59
    .line 60
    invoke-virtual {v0, p3}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->snapToRect(Landroid/graphics/Rect;)F

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    invoke-virtual {v4, p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->offset(F)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    invoke-virtual {v4, p3, p4}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->isOutsideMargin(Landroid/graphics/Rect;F)Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-eqz p1, :cond_1

    .line 73
    .line 74
    invoke-virtual {v4, p3}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->snapToRect(Landroid/graphics/Rect;)F

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->offset(F)V

    .line 79
    .line 80
    .line 81
    :cond_1
    :goto_0
    invoke-virtual {v2, p3, p4}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->isOutsideMargin(Landroid/graphics/Rect;F)Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-eqz p1, :cond_2

    .line 86
    .line 87
    invoke-virtual {v2, p3}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->snapToRect(Landroid/graphics/Rect;)F

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    invoke-virtual {v6, p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->offset(F)V

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_2
    invoke-virtual {v6, p3, p4}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->isOutsideMargin(Landroid/graphics/Rect;F)Z

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    if-eqz p1, :cond_3

    .line 100
    .line 101
    invoke-virtual {v6, p3}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->snapToRect(Landroid/graphics/Rect;)F

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    invoke-virtual {v2, p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->offset(F)V

    .line 106
    .line 107
    .line 108
    :cond_3
    :goto_1
    return-void

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
