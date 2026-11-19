.class public abstract Lcom/xuexiang/xui/utils/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/widget/AbsListView;)I
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_3

    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/widget/AdapterView;->getAdapter()Landroid/widget/Adapter;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    check-cast v1, Landroid/widget/ListAdapter;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    move v2, v0

    .line 14
    move v3, v2

    .line 15
    :goto_0
    invoke-interface {v1}, Landroid/widget/Adapter;->getCount()I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-ge v2, v4, :cond_2

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    invoke-interface {v1, v2, v4, p0}, Landroid/widget/Adapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    instance-of v5, v4, Landroid/view/ViewGroup;

    .line 27
    .line 28
    if-eqz v5, :cond_1

    .line 29
    .line 30
    new-instance v5, Landroid/widget/RelativeLayout$LayoutParams;

    .line 31
    .line 32
    const/4 v6, -0x2

    .line 33
    invoke-direct {v5, v6, v6}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    invoke-virtual {v4, v0, v0}, Landroid/view/View;->measure(II)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    add-int/2addr v3, v4

    .line 47
    add-int/lit8 v2, v2, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    add-int/2addr v0, p0

    .line 59
    add-int/2addr v3, v0

    .line 60
    return v3

    .line 61
    :cond_3
    :goto_1
    return v0
.end method

.method public static b(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {v0, p0, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0, v0}, Landroid/content/pm/PackageItemInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;

    .line 15
    .line 16
    .line 17
    move-result-object p0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    return-object p0

    .line 19
    :catch_0
    move-exception p0

    .line 20
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    return-object p0
.end method

.method public static c(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getOpacity()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, -0x1

    .line 14
    if-eq v2, v3, :cond_0

    .line 15
    .line 16
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    sget-object v2, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 20
    .line 21
    :goto_0
    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    new-instance v3, Landroid/graphics/Canvas;

    .line 26
    .line 27
    invoke-direct {v3, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 28
    .line 29
    .line 30
    const/4 v4, 0x0

    .line 31
    invoke-virtual {p0, v4, v4, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v3}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 35
    .line 36
    .line 37
    return-object v2
.end method

.method public static d(Landroid/content/res/Resources;Ljava/lang/String;)I
    .locals 2

    .line 1
    const-string v0, "dimen"

    .line 2
    .line 3
    const-string v1, "android"

    .line 4
    .line 5
    invoke-virtual {p0, p1, v0, v1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-lez p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0
.end method

.method public static e(Landroid/widget/ListView;)I
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/xuexiang/xui/utils/h;->a(Landroid/widget/AbsListView;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v1}, Landroid/widget/Adapter;->getCount()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-lez v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/widget/ListView;->getDividerHeight()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    add-int/lit8 v1, v1, -0x1

    .line 24
    .line 25
    mul-int/2addr p0, v1

    .line 26
    add-int/2addr v0, p0

    .line 27
    :cond_0
    return v0
.end method

.method public static f(Landroid/content/Context;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget p0, p0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 10
    .line 11
    return p0
.end method

.method public static g()I
    .locals 2

    .line 1
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "status_bar_height"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lcom/xuexiang/xui/utils/h;->d(Landroid/content/res/Resources;Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public static h(I)Z
    .locals 6

    .line 1
    invoke-static {p0}, Landroid/graphics/Color;->red(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p0}, Landroid/graphics/Color;->red(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    mul-int/2addr v0, v1

    .line 10
    int-to-double v0, v0

    .line 11
    const-wide v2, 0x3fced916872b020cL    # 0.241

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    mul-double/2addr v0, v2

    .line 17
    invoke-static {p0}, Landroid/graphics/Color;->green(I)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-static {p0}, Landroid/graphics/Color;->green(I)I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    mul-int/2addr v2, v3

    .line 26
    int-to-double v2, v2

    .line 27
    const-wide v4, 0x3fe61cac083126e9L    # 0.691

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    mul-double/2addr v2, v4

    .line 33
    add-double/2addr v0, v2

    .line 34
    invoke-static {p0}, Landroid/graphics/Color;->blue(I)I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    invoke-static {p0}, Landroid/graphics/Color;->blue(I)I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    mul-int/2addr v2, p0

    .line 43
    int-to-double v2, v2

    .line 44
    const-wide v4, 0x3fb16872b020c49cL    # 0.068

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    mul-double/2addr v2, v4

    .line 50
    add-double/2addr v0, v2

    .line 51
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 52
    .line 53
    .line 54
    move-result-wide v0

    .line 55
    const-wide v2, 0x4060400000000000L    # 130.0

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    cmpl-double p0, v0, v2

    .line 61
    .line 62
    if-lez p0, :cond_0

    .line 63
    .line 64
    const/4 p0, 0x1

    .line 65
    return p0

    .line 66
    :cond_0
    const/4 p0, 0x0

    .line 67
    return p0
.end method

.method public static i(Ljava/lang/CharSequence;)Z
    .locals 0

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0

    .line 12
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 13
    return p0
.end method

.method public static j(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {p0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 7
    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    instance-of p0, v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    move-object p0, v0

    .line 16
    check-cast p0, Landroid/graphics/drawable/BitmapDrawable;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V

    .line 31
    .line 32
    .line 33
    :cond_0
    if-eqz v0, :cond_1

    .line 34
    .line 35
    const/4 p0, 0x0

    .line 36
    invoke-virtual {v0, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    return-void
.end method

.method public static k(Landroid/content/Context;Landroid/view/View;I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p2}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-direct {v0, p0, p2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public static l(Landroid/graphics/drawable/Drawable;I)Landroid/graphics/ColorFilter;
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/LightingColorFilter;

    .line 2
    .line 3
    const/16 v1, 0xff

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {v1, v2, v2, v2}, Landroid/graphics/Color;->argb(IIII)I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-direct {v0, v1, p1}, Landroid/graphics/LightingColorFilter;-><init>(II)V

    .line 11
    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-object v0
.end method
