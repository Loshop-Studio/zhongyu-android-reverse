.class public Lcom/xuexiang/xui/widget/imageview/edit/TextStyleBuilder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/imageview/edit/TextStyleBuilder$TextStyle;
    }
.end annotation


# instance fields
.field private values:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/xuexiang/xui/widget/imageview/edit/TextStyleBuilder$TextStyle;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/TextStyleBuilder;->values:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method protected applyBackgroundColor(Landroid/widget/TextView;I)V
    .locals 0

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setBackgroundColor(I)V

    return-void
.end method

.method protected applyBackgroundDrawable(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method protected applyFontFamily(Landroid/widget/TextView;Landroid/graphics/Typeface;)V
    .locals 0

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    return-void
.end method

.method protected applyGravity(Landroid/widget/TextView;I)V
    .locals 0

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setGravity(I)V

    return-void
.end method

.method applyStyle(Landroid/widget/TextView;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/TextStyleBuilder;->values:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 2
    sget-object v2, Lcom/xuexiang/xui/widget/imageview/edit/TextStyleBuilder$1;->$SwitchMap$com$xuexiang$xui$widget$imageview$edit$TextStyleBuilder$TextStyle:[I

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/xuexiang/xui/widget/imageview/edit/TextStyleBuilder$TextStyle;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_0

    goto :goto_0

    .line 3
    :pswitch_0
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    instance-of v2, v2, Ljava/lang/Integer;

    if-eqz v2, :cond_0

    .line 4
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 5
    invoke-virtual {p0, p1, v1}, Lcom/xuexiang/xui/widget/imageview/edit/TextStyleBuilder;->applyTextAppearance(Landroid/widget/TextView;I)V

    goto :goto_0

    .line 6
    :pswitch_1
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    instance-of v2, v2, Landroid/graphics/drawable/Drawable;

    if-eqz v2, :cond_1

    .line 7
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/drawable/Drawable;

    .line 8
    invoke-virtual {p0, p1, v1}, Lcom/xuexiang/xui/widget/imageview/edit/TextStyleBuilder;->applyBackgroundDrawable(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 9
    :cond_1
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    instance-of v2, v2, Ljava/lang/Integer;

    if-eqz v2, :cond_0

    .line 10
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 11
    invoke-virtual {p0, p1, v1}, Lcom/xuexiang/xui/widget/imageview/edit/TextStyleBuilder;->applyBackgroundColor(Landroid/widget/TextView;I)V

    goto :goto_0

    .line 12
    :pswitch_2
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 13
    invoke-virtual {p0, p1, v1}, Lcom/xuexiang/xui/widget/imageview/edit/TextStyleBuilder;->applyGravity(Landroid/widget/TextView;I)V

    goto :goto_0

    .line 14
    :pswitch_3
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Typeface;

    .line 15
    invoke-virtual {p0, p1, v1}, Lcom/xuexiang/xui/widget/imageview/edit/TextStyleBuilder;->applyFontFamily(Landroid/widget/TextView;Landroid/graphics/Typeface;)V

    goto :goto_0

    .line 16
    :pswitch_4
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 17
    invoke-virtual {p0, p1, v1}, Lcom/xuexiang/xui/widget/imageview/edit/TextStyleBuilder;->applyTextColor(Landroid/widget/TextView;I)V

    goto/16 :goto_0

    .line 18
    :pswitch_5
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    .line 19
    invoke-virtual {p0, p1, v1}, Lcom/xuexiang/xui/widget/imageview/edit/TextStyleBuilder;->applyTextSize(Landroid/widget/TextView;F)V

    goto/16 :goto_0

    :cond_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method protected applyTextAppearance(Landroid/widget/TextView;I)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    .line 2
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextAppearance(I)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p1}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    :goto_0
    return-void
.end method

.method protected applyTextColor(Landroid/widget/TextView;I)V
    .locals 0

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method

.method protected applyTextSize(Landroid/widget/TextView;F)V
    .locals 0

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextSize(F)V

    return-void
.end method

.method protected getValues()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lcom/xuexiang/xui/widget/imageview/edit/TextStyleBuilder$TextStyle;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/TextStyleBuilder;->values:Ljava/util/Map;

    return-object v0
.end method

.method public withBackgroundColor(I)V
    .locals 2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/TextStyleBuilder;->values:Ljava/util/Map;

    sget-object v1, Lcom/xuexiang/xui/widget/imageview/edit/TextStyleBuilder$TextStyle;->BACKGROUND:Lcom/xuexiang/xui/widget/imageview/edit/TextStyleBuilder$TextStyle;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public withBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/TextStyleBuilder;->values:Ljava/util/Map;

    sget-object v1, Lcom/xuexiang/xui/widget/imageview/edit/TextStyleBuilder$TextStyle;->BACKGROUND:Lcom/xuexiang/xui/widget/imageview/edit/TextStyleBuilder$TextStyle;

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public withGravity(I)V
    .locals 2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/TextStyleBuilder;->values:Ljava/util/Map;

    sget-object v1, Lcom/xuexiang/xui/widget/imageview/edit/TextStyleBuilder$TextStyle;->GRAVITY:Lcom/xuexiang/xui/widget/imageview/edit/TextStyleBuilder$TextStyle;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public withTextAppearance(I)V
    .locals 2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/TextStyleBuilder;->values:Ljava/util/Map;

    sget-object v1, Lcom/xuexiang/xui/widget/imageview/edit/TextStyleBuilder$TextStyle;->TEXT_APPEARANCE:Lcom/xuexiang/xui/widget/imageview/edit/TextStyleBuilder$TextStyle;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public withTextColor(I)V
    .locals 2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/TextStyleBuilder;->values:Ljava/util/Map;

    sget-object v1, Lcom/xuexiang/xui/widget/imageview/edit/TextStyleBuilder$TextStyle;->COLOR:Lcom/xuexiang/xui/widget/imageview/edit/TextStyleBuilder$TextStyle;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public withTextFont(Landroid/graphics/Typeface;)V
    .locals 2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/TextStyleBuilder;->values:Ljava/util/Map;

    sget-object v1, Lcom/xuexiang/xui/widget/imageview/edit/TextStyleBuilder$TextStyle;->FONT_FAMILY:Lcom/xuexiang/xui/widget/imageview/edit/TextStyleBuilder$TextStyle;

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public withTextSize(F)V
    .locals 2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/TextStyleBuilder;->values:Ljava/util/Map;

    sget-object v1, Lcom/xuexiang/xui/widget/imageview/edit/TextStyleBuilder$TextStyle;->SIZE:Lcom/xuexiang/xui/widget/imageview/edit/TextStyleBuilder$TextStyle;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
