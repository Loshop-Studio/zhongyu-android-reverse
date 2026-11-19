.class public Lcom/lljjcoder/style/citylist/sortlistview/SideBar;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lljjcoder/style/citylist/sortlistview/SideBar$OnTouchingLetterChangedListener;
    }
.end annotation


# static fields
.field public static b:[Ljava/lang/String;


# instance fields
.field private choose:I

.field private mTextDialog:Landroid/widget/TextView;

.field private onTouchingLetterChangedListener:Lcom/lljjcoder/style/citylist/sortlistview/SideBar$OnTouchingLetterChangedListener;

.field private paint:Landroid/graphics/Paint;


# direct methods
.method static constructor <clinit>()V
    .locals 28

    .line 1
    const-string v26, "Z"

    .line 2
    .line 3
    const-string v27, "#"

    .line 4
    .line 5
    const-string v1, "A"

    .line 6
    .line 7
    const-string v2, "B"

    .line 8
    .line 9
    const-string v3, "C"

    .line 10
    .line 11
    const-string v4, "D"

    .line 12
    .line 13
    const-string v5, "E"

    .line 14
    .line 15
    const-string v6, "F"

    .line 16
    .line 17
    const-string v7, "G"

    .line 18
    .line 19
    const-string v8, "H"

    .line 20
    .line 21
    const-string v9, "I"

    .line 22
    .line 23
    const-string v10, "J"

    .line 24
    .line 25
    const-string v11, "K"

    .line 26
    .line 27
    const-string v12, "L"

    .line 28
    .line 29
    const-string v13, "M"

    .line 30
    .line 31
    const-string v14, "N"

    .line 32
    .line 33
    const-string v15, "O"

    .line 34
    .line 35
    const-string v16, "P"

    .line 36
    .line 37
    const-string v17, "Q"

    .line 38
    .line 39
    const-string v18, "R"

    .line 40
    .line 41
    const-string v19, "S"

    .line 42
    .line 43
    const-string v20, "T"

    .line 44
    .line 45
    const-string v21, "U"

    .line 46
    .line 47
    const-string v22, "V"

    .line 48
    .line 49
    const-string v23, "W"

    .line 50
    .line 51
    const-string v24, "X"

    .line 52
    .line 53
    const-string v25, "Y"

    .line 54
    .line 55
    filled-new-array/range {v1 .. v27}, [Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sput-object v0, Lcom/lljjcoder/style/citylist/sortlistview/SideBar;->b:[Ljava/lang/String;

    .line 60
    .line 61
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const/4 p1, -0x1

    .line 8
    iput p1, p0, Lcom/lljjcoder/style/citylist/sortlistview/SideBar;->choose:I

    .line 9
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/lljjcoder/style/citylist/sortlistview/SideBar;->paint:Landroid/graphics/Paint;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, -0x1

    .line 5
    iput p1, p0, Lcom/lljjcoder/style/citylist/sortlistview/SideBar;->choose:I

    .line 6
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/lljjcoder/style/citylist/sortlistview/SideBar;->paint:Landroid/graphics/Paint;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, -0x1

    .line 2
    iput p1, p0, Lcom/lljjcoder/style/citylist/sortlistview/SideBar;->choose:I

    .line 3
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/lljjcoder/style/citylist/sortlistview/SideBar;->paint:Landroid/graphics/Paint;

    return-void
.end method


# virtual methods
.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iget v1, p0, Lcom/lljjcoder/style/citylist/sortlistview/SideBar;->choose:I

    .line 10
    .line 11
    iget-object v2, p0, Lcom/lljjcoder/style/citylist/sortlistview/SideBar;->onTouchingLetterChangedListener:Lcom/lljjcoder/style/citylist/sortlistview/SideBar$OnTouchingLetterChangedListener;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    int-to-float v3, v3

    .line 18
    div-float/2addr p1, v3

    .line 19
    sget-object v3, Lcom/lljjcoder/style/citylist/sortlistview/SideBar;->b:[Ljava/lang/String;

    .line 20
    .line 21
    array-length v3, v3

    .line 22
    int-to-float v3, v3

    .line 23
    mul-float/2addr p1, v3

    .line 24
    float-to-int p1, p1

    .line 25
    const/4 v3, 0x0

    .line 26
    const/4 v4, 0x1

    .line 27
    if-eq v0, v4, :cond_2

    .line 28
    .line 29
    sget v0, Lcom/lljjcoder/style/citypickerview/R$drawable;->sidebar_background:I

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 32
    .line 33
    .line 34
    if-eq v1, p1, :cond_3

    .line 35
    .line 36
    if-ltz p1, :cond_3

    .line 37
    .line 38
    sget-object v0, Lcom/lljjcoder/style/citylist/sortlistview/SideBar;->b:[Ljava/lang/String;

    .line 39
    .line 40
    array-length v1, v0

    .line 41
    if-ge p1, v1, :cond_3

    .line 42
    .line 43
    if-eqz v2, :cond_0

    .line 44
    .line 45
    aget-object v0, v0, p1

    .line 46
    .line 47
    invoke-interface {v2, v0}, Lcom/lljjcoder/style/citylist/sortlistview/SideBar$OnTouchingLetterChangedListener;->onTouchingLetterChanged(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    :cond_0
    iget-object v0, p0, Lcom/lljjcoder/style/citylist/sortlistview/SideBar;->mTextDialog:Landroid/widget/TextView;

    .line 51
    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    sget-object v1, Lcom/lljjcoder/style/citylist/sortlistview/SideBar;->b:[Ljava/lang/String;

    .line 55
    .line 56
    aget-object v1, v1, p1

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 59
    .line 60
    .line 61
    iget-object v0, p0, Lcom/lljjcoder/style/citylist/sortlistview/SideBar;->mTextDialog:Landroid/widget/TextView;

    .line 62
    .line 63
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 64
    .line 65
    .line 66
    :cond_1
    iput p1, p0, Lcom/lljjcoder/style/citylist/sortlistview/SideBar;->choose:I

    .line 67
    .line 68
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    new-instance p1, Landroid/graphics/drawable/ColorDrawable;

    .line 73
    .line 74
    invoke-direct {p1, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 78
    .line 79
    .line 80
    const/4 p1, -0x1

    .line 81
    iput p1, p0, Lcom/lljjcoder/style/citylist/sortlistview/SideBar;->choose:I

    .line 82
    .line 83
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 84
    .line 85
    .line 86
    iget-object p1, p0, Lcom/lljjcoder/style/citylist/sortlistview/SideBar;->mTextDialog:Landroid/widget/TextView;

    .line 87
    .line 88
    if-eqz p1, :cond_3

    .line 89
    .line 90
    const/4 v0, 0x4

    .line 91
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 92
    .line 93
    .line 94
    :cond_3
    :goto_0
    return v4
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 7

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    sget-object v2, Lcom/lljjcoder/style/citylist/sortlistview/SideBar;->b:[Ljava/lang/String;

    .line 13
    .line 14
    array-length v2, v2

    .line 15
    div-int/2addr v0, v2

    .line 16
    const/4 v2, 0x0

    .line 17
    :goto_0
    sget-object v3, Lcom/lljjcoder/style/citylist/sortlistview/SideBar;->b:[Ljava/lang/String;

    .line 18
    .line 19
    array-length v3, v3

    .line 20
    if-ge v2, v3, :cond_1

    .line 21
    .line 22
    iget-object v3, p0, Lcom/lljjcoder/style/citylist/sortlistview/SideBar;->paint:Landroid/graphics/Paint;

    .line 23
    .line 24
    const/16 v4, 0x41

    .line 25
    .line 26
    const/16 v5, 0x62

    .line 27
    .line 28
    const/16 v6, 0x21

    .line 29
    .line 30
    invoke-static {v6, v4, v5}, Landroid/graphics/Color;->rgb(III)I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 35
    .line 36
    .line 37
    iget-object v3, p0, Lcom/lljjcoder/style/citylist/sortlistview/SideBar;->paint:Landroid/graphics/Paint;

    .line 38
    .line 39
    sget-object v4, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 40
    .line 41
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 42
    .line 43
    .line 44
    iget-object v3, p0, Lcom/lljjcoder/style/citylist/sortlistview/SideBar;->paint:Landroid/graphics/Paint;

    .line 45
    .line 46
    const/4 v4, 0x1

    .line 47
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 48
    .line 49
    .line 50
    iget-object v3, p0, Lcom/lljjcoder/style/citylist/sortlistview/SideBar;->paint:Landroid/graphics/Paint;

    .line 51
    .line 52
    const/high16 v5, 0x41a00000    # 20.0f

    .line 53
    .line 54
    invoke-virtual {v3, v5}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 55
    .line 56
    .line 57
    iget v3, p0, Lcom/lljjcoder/style/citylist/sortlistview/SideBar;->choose:I

    .line 58
    .line 59
    if-ne v2, v3, :cond_0

    .line 60
    .line 61
    iget-object v3, p0, Lcom/lljjcoder/style/citylist/sortlistview/SideBar;->paint:Landroid/graphics/Paint;

    .line 62
    .line 63
    const-string v5, "#000000"

    .line 64
    .line 65
    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    invoke-virtual {v3, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 70
    .line 71
    .line 72
    iget-object v3, p0, Lcom/lljjcoder/style/citylist/sortlistview/SideBar;->paint:Landroid/graphics/Paint;

    .line 73
    .line 74
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 75
    .line 76
    .line 77
    :cond_0
    div-int/lit8 v3, v1, 0x2

    .line 78
    .line 79
    int-to-float v3, v3

    .line 80
    iget-object v4, p0, Lcom/lljjcoder/style/citylist/sortlistview/SideBar;->paint:Landroid/graphics/Paint;

    .line 81
    .line 82
    sget-object v5, Lcom/lljjcoder/style/citylist/sortlistview/SideBar;->b:[Ljava/lang/String;

    .line 83
    .line 84
    aget-object v5, v5, v2

    .line 85
    .line 86
    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    const/high16 v5, 0x40000000    # 2.0f

    .line 91
    .line 92
    div-float/2addr v4, v5

    .line 93
    sub-float/2addr v3, v4

    .line 94
    mul-int v4, v0, v2

    .line 95
    .line 96
    add-int/2addr v4, v0

    .line 97
    int-to-float v4, v4

    .line 98
    sget-object v5, Lcom/lljjcoder/style/citylist/sortlistview/SideBar;->b:[Ljava/lang/String;

    .line 99
    .line 100
    aget-object v5, v5, v2

    .line 101
    .line 102
    iget-object v6, p0, Lcom/lljjcoder/style/citylist/sortlistview/SideBar;->paint:Landroid/graphics/Paint;

    .line 103
    .line 104
    invoke-virtual {p1, v5, v3, v4, v6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 105
    .line 106
    .line 107
    iget-object v3, p0, Lcom/lljjcoder/style/citylist/sortlistview/SideBar;->paint:Landroid/graphics/Paint;

    .line 108
    .line 109
    invoke-virtual {v3}, Landroid/graphics/Paint;->reset()V

    .line 110
    .line 111
    .line 112
    add-int/lit8 v2, v2, 0x1

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_1
    return-void
.end method

.method public setOnTouchingLetterChangedListener(Lcom/lljjcoder/style/citylist/sortlistview/SideBar$OnTouchingLetterChangedListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/style/citylist/sortlistview/SideBar;->onTouchingLetterChangedListener:Lcom/lljjcoder/style/citylist/sortlistview/SideBar$OnTouchingLetterChangedListener;

    .line 2
    .line 3
    return-void
.end method

.method public setTextView(Landroid/widget/TextView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/style/citylist/sortlistview/SideBar;->mTextDialog:Landroid/widget/TextView;

    .line 2
    .line 3
    return-void
.end method
