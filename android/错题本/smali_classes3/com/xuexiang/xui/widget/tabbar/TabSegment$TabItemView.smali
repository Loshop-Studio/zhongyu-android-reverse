.class public Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/tabbar/TabSegment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "TabItemView"
.end annotation


# instance fields
.field public final a:Landroidx/appcompat/widget/AppCompatTextView;

.field public final b:Landroid/view/GestureDetector;

.field public final synthetic c:Lcom/xuexiang/xui/widget/tabbar/TabSegment;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Landroid/content/Context;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->c:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Landroidx/appcompat/widget/AppCompatTextView;

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    invoke-direct {p1, p2}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->a:Landroidx/appcompat/widget/AppCompatTextView;

    .line 16
    .line 17
    const/4 p2, 0x1

    .line 18
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 19
    .line 20
    .line 21
    const/16 p2, 0x11

    .line 22
    .line 23
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setGravity(I)V

    .line 24
    .line 25
    .line 26
    sget-object p2, Landroid/text/TextUtils$TruncateAt;->MIDDLE:Landroid/text/TextUtils$TruncateAt;

    .line 27
    .line 28
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lt1/a;->b()V

    .line 32
    .line 33
    .line 34
    const/4 p2, 0x0

    .line 35
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 36
    .line 37
    .line 38
    sget p2, Lcom/xuexiang/xui/R$id;->xui_tab_segment_item_id:I

    .line 39
    .line 40
    invoke-virtual {p1, p2}, Landroid/view/View;->setId(I)V

    .line 41
    .line 42
    .line 43
    new-instance p2, Landroid/widget/RelativeLayout$LayoutParams;

    .line 44
    .line 45
    const/4 v0, -0x2

    .line 46
    invoke-direct {p2, v0, v0}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 47
    .line 48
    .line 49
    const/16 v0, 0xf

    .line 50
    .line 51
    const/4 v1, -0x1

    .line 52
    invoke-virtual {p2, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 56
    .line 57
    .line 58
    new-instance p1, Landroid/view/GestureDetector;

    .line 59
    .line 60
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    new-instance v0, Lcom/xuexiang/xui/widget/tabbar/e;

    .line 65
    .line 66
    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/tabbar/e;-><init>(Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;)V

    .line 67
    .line 68
    .line 69
    invoke-direct {p1, p2, v0}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    .line 70
    .line 71
    .line 72
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->b:Landroid/view/GestureDetector;

    .line 73
    .line 74
    return-void
.end method


# virtual methods
.method public final a(Lp3/h;I)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->a:Landroidx/appcompat/widget/AppCompatTextView;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    sget v1, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->B:I

    .line 14
    .line 15
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->c:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    .line 16
    .line 17
    iget v2, v1, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->o:I

    .line 18
    .line 19
    aget-object p1, p1, v2

    .line 20
    .line 21
    if-eqz p1, :cond_4

    .line 22
    .line 23
    new-instance v2, Landroid/graphics/LightingColorFilter;

    .line 24
    .line 25
    const/16 v3, 0xff

    .line 26
    .line 27
    const/4 v4, 0x0

    .line 28
    invoke-static {v3, v4, v4, v4}, Landroid/graphics/Color;->argb(IIII)I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    invoke-direct {v2, v3, p2}, Landroid/graphics/LightingColorFilter;-><init>(II)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v2}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 36
    .line 37
    .line 38
    iget p2, v1, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->o:I

    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    if-nez p2, :cond_0

    .line 42
    .line 43
    move-object v2, p1

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    move-object v2, v1

    .line 46
    :goto_0
    const/4 v3, 0x1

    .line 47
    if-ne p2, v3, :cond_1

    .line 48
    .line 49
    move-object v3, p1

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    move-object v3, v1

    .line 52
    :goto_1
    const/4 v4, 0x2

    .line 53
    if-ne p2, v4, :cond_2

    .line 54
    .line 55
    move-object v4, p1

    .line 56
    goto :goto_2

    .line 57
    :cond_2
    move-object v4, v1

    .line 58
    :goto_2
    const/4 v5, 0x3

    .line 59
    if-ne p2, v5, :cond_3

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_3
    move-object p1, v1

    .line 63
    :goto_3
    invoke-virtual {v0, v2, v3, v4, p1}, Landroidx/appcompat/widget/AppCompatTextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 64
    .line 65
    .line 66
    :cond_4
    return-void
.end method

.method public final b(Lp3/h;Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->c:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    sget p2, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->B:I

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget p2, v0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->n:I

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    sget p2, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->B:I

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget p2, v0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->m:I

    .line 19
    .line 20
    :goto_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->a:Landroidx/appcompat/widget/AppCompatTextView;

    .line 21
    .line 22
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setCompoundDrawablePadding(I)V

    .line 30
    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    invoke-virtual {v0, p1, p1, p1, p1}, Landroidx/appcompat/widget/AppCompatTextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public getTextView()Landroid/widget/TextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->a:Landroidx/appcompat/widget/AppCompatTextView;

    .line 2
    .line 3
    return-object v0
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->b:Landroid/view/GestureDetector;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    return p1

    .line 18
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 19
    return p1
.end method
