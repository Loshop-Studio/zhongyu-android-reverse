.class public Lcom/xuexiang/xui/widget/tabbar/TabSegment;
.super Landroid/widget/HorizontalScrollView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;,
        Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabLayoutOnPageChangeListener;,
        Lcom/xuexiang/xui/widget/tabbar/TabSegment$IconPosition;,
        Lcom/xuexiang/xui/widget/tabbar/TabSegment$Mode;
    }
.end annotation


# static fields
.field public static final synthetic B:I


# instance fields
.field public A:Z

.field public final a:Ljava/util/ArrayList;

.field public final b:Lcom/xuexiang/xui/widget/tabbar/c;

.field public c:I

.field public d:I

.field public e:I

.field public f:Z

.field public g:I

.field public h:Z

.field public i:Landroid/graphics/drawable/Drawable;

.field public j:Z

.field public k:Landroid/graphics/Rect;

.field public l:Landroid/graphics/Paint;

.field public m:I

.field public n:I

.field public o:I

.field public p:I

.field public q:I

.field public r:I

.field public s:Landroid/animation/Animator;

.field public final t:Lb1/c;

.field public u:Landroidx/viewpager/widget/ViewPager;

.field public v:Landroidx/viewpager/widget/PagerAdapter;

.field public w:Lp3/g;

.field public x:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabLayoutOnPageChangeListener;

.field public y:Lp3/j;

.field public z:Lp3/e;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 2
    sget v0, Lcom/xuexiang/xui/R$attr;->TabSegmentStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 6

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/HorizontalScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->a:Ljava/util/ArrayList;

    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->c:I

    .line 6
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->d:I

    const/4 v1, 0x1

    .line 7
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->f:Z

    const/4 v2, 0x0

    .line 8
    iput-boolean v2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->h:Z

    .line 9
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->j:Z

    const/4 v3, 0x0

    .line 10
    iput-object v3, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->k:Landroid/graphics/Rect;

    .line 11
    iput-object v3, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->l:Landroid/graphics/Paint;

    .line 12
    iput v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->p:I

    .line 13
    iput v2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->r:I

    .line 14
    new-instance v4, Lb1/c;

    const/4 v5, 0x5

    invoke-direct {v4, p0, v5}, Lb1/c;-><init>(Landroid/view/KeyEvent$Callback;I)V

    iput-object v4, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->t:Lb1/c;

    .line 15
    iput-boolean v2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->A:Z

    .line 16
    sget-object v4, Lcom/xuexiang/xui/R$styleable;->TabSegment:[I

    invoke-virtual {p1, p2, v4, p3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 17
    sget p3, Lcom/xuexiang/xui/R$styleable;->TabSegment_ts_selected_color:I

    sget v4, Lcom/xuexiang/xui/R$attr;->colorAccent:I

    .line 18
    invoke-static {p1, v4, v2}, Lkotlin/collections/u;->F(Landroid/content/Context;II)I

    move-result v4

    .line 19
    invoke-virtual {p2, p3, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->n:I

    .line 20
    sget p3, Lcom/xuexiang/xui/R$styleable;->TabSegment_ts_normal_color:I

    sget v4, Lcom/xuexiang/xui/R$color;->xui_config_color_gray_5:I

    invoke-static {p1, v4}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v4

    invoke-virtual {p2, p3, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->m:I

    .line 21
    sget p3, Lcom/xuexiang/xui/R$styleable;->TabSegment_ts_has_indicator:I

    invoke-virtual {p2, p3, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->f:Z

    .line 22
    sget p3, Lcom/xuexiang/xui/R$styleable;->TabSegment_ts_indicator_height:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/xuexiang/xui/R$dimen;->xui_tab_segment_indicator_height:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    invoke-virtual {p2, p3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->g:I

    .line 23
    sget p3, Lcom/xuexiang/xui/R$styleable;->TabSegment_android_textSize:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/xuexiang/xui/R$dimen;->xui_tab_segment_text_size:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    invoke-virtual {p2, p3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->e:I

    .line 24
    sget p3, Lcom/xuexiang/xui/R$styleable;->TabSegment_ts_indicator_top:I

    invoke-virtual {p2, p3, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->h:Z

    .line 25
    sget p3, Lcom/xuexiang/xui/R$styleable;->TabSegment_ts_icon_position:I

    invoke-virtual {p2, p3, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->o:I

    .line 26
    sget p3, Lcom/xuexiang/xui/R$styleable;->TabSegment_ts_mode:I

    invoke-virtual {p2, p3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->p:I

    .line 27
    sget p3, Lcom/xuexiang/xui/R$styleable;->TabSegment_ts_space:I

    const/high16 v4, 0x41200000    # 10.0f

    invoke-static {p1, v4}, Lh4/a;->h(Landroid/content/Context;F)I

    move-result v4

    invoke-virtual {p2, p3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->q:I

    .line 28
    sget p3, Lcom/xuexiang/xui/R$styleable;->TabSegment_ts_typeface_provider:I

    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p3

    .line 29
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 30
    new-instance p2, Lcom/xuexiang/xui/widget/tabbar/c;

    invoke-direct {p2, p0, p1}, Lcom/xuexiang/xui/widget/tabbar/c;-><init>(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Landroid/content/Context;)V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->b:Lcom/xuexiang/xui/widget/tabbar/c;

    .line 31
    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v5, -0x2

    invoke-direct {v4, v5, v0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p0, p2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 32
    const-string p2, "Could not instantiate the TypefaceProvider: "

    const-string v0, "Error creating TypefaceProvider "

    if-eqz p3, :cond_4

    .line 33
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_0

    goto/16 :goto_6

    .line 34
    :cond_0
    invoke-virtual {p3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p3

    .line 35
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_1

    goto/16 :goto_6

    .line 36
    :cond_1
    invoke-virtual {p3, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x2e

    if-ne v4, v5, :cond_2

    .line 37
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    .line 38
    :cond_2
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v4

    if-eqz v4, :cond_3

    .line 39
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_2

    :catch_2
    move-exception p1

    goto :goto_3

    :catch_3
    move-exception p1

    goto :goto_4

    :catch_4
    move-exception p1

    goto :goto_5

    .line 40
    :cond_3
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    .line 41
    :goto_0
    invoke-virtual {p1, p3}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    const-class v4, Lp3/i;

    invoke-virtual {p1, v4}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    :try_start_1
    invoke-virtual {p1, v3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_0

    .line 43
    :try_start_2
    invoke-virtual {p1, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 44
    invoke-virtual {p1, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lg/a;->f(Ljava/lang/Object;)V

    goto :goto_6

    :catch_5
    move-exception p1

    .line 45
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/ClassCastException; {:try_start_2 .. :try_end_2} :catch_0

    .line 46
    :goto_1
    new-instance p2, Ljava/lang/IllegalStateException;

    const-string v0, "Class is not a TypefaceProvider "

    .line 47
    invoke-static {v0, p3}, Landroid/support/v4/media/f;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    .line 48
    invoke-direct {p2, p3, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    .line 49
    :goto_2
    new-instance p2, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot access non-public constructor "

    .line 50
    invoke-static {v0, p3}, Landroid/support/v4/media/f;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    .line 51
    invoke-direct {p2, p3, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    .line 52
    :goto_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 53
    invoke-static {p2, p3}, Landroid/support/v4/media/f;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 54
    invoke-direct {v0, p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 55
    :goto_4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 56
    invoke-static {p2, p3}, Landroid/support/v4/media/f;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 57
    invoke-direct {v0, p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 58
    :goto_5
    new-instance p2, Ljava/lang/IllegalStateException;

    const-string v0, "Unable to find TypefaceProvider "

    .line 59
    invoke-static {v0, p3}, Landroid/support/v4/media/f;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    .line 60
    invoke-direct {p2, p3, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    .line 61
    :cond_4
    :goto_6
    invoke-virtual {p0, v2}, Landroid/view/View;->setHorizontalScrollBarEnabled(Z)V

    .line 62
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    return-void
.end method

.method public static synthetic a(Lcom/xuexiang/xui/widget/tabbar/TabSegment;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->setViewPagerScrollState(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)I
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->getTabCount()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic c(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)Lcom/xuexiang/xui/widget/tabbar/d;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->getAdapter()Lcom/xuexiang/xui/widget/tabbar/d;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private getAdapter()Lcom/xuexiang/xui/widget/tabbar/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->b:Lcom/xuexiang/xui/widget/tabbar/c;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/xuexiang/xui/widget/tabbar/c;->a:Lcom/xuexiang/xui/widget/tabbar/d;

    .line 4
    .line 5
    return-object v0
.end method

.method private getTabCount()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->getAdapter()Lcom/xuexiang/xui/widget/tabbar/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lp3/s;->b:Ljava/util/ArrayList;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return v0

    .line 11
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0
.end method

.method private setViewPagerScrollState(I)V
    .locals 3

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->r:I

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    iget p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->d:I

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    if-eq p1, v0, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->s:Landroid/animation/Animator;

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-virtual {p0, p1, v1, v2}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->i(IZZ)V

    .line 17
    .line 18
    .line 19
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->d:I

    .line 20
    .line 21
    :cond_0
    return-void
.end method


# virtual methods
.method public final d(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    add-int/lit8 v1, v1, -0x1

    .line 8
    .line 9
    :goto_0
    if-ltz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, Lp3/j;

    .line 16
    .line 17
    iget-object v2, v2, Lp3/j;->a:Landroidx/viewpager/widget/ViewPager;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-virtual {v2, p1, v3}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(IZ)V

    .line 21
    .line 22
    .line 23
    add-int/lit8 v1, v1, -0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void
.end method

.method public final e(Lp3/h;Z)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->k:Landroid/graphics/Rect;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    new-instance v0, Landroid/graphics/Rect;

    .line 9
    .line 10
    iget v1, p1, Lp3/h;->b:I

    .line 11
    .line 12
    iget p1, p1, Lp3/h;->a:I

    .line 13
    .line 14
    add-int/2addr p1, v1

    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-direct {v0, v1, v2, p1, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->k:Landroid/graphics/Rect;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    iget v1, p1, Lp3/h;->b:I

    .line 23
    .line 24
    iput v1, v0, Landroid/graphics/Rect;->left:I

    .line 25
    .line 26
    iget p1, p1, Lp3/h;->a:I

    .line 27
    .line 28
    add-int/2addr v1, p1

    .line 29
    iput v1, v0, Landroid/graphics/Rect;->right:I

    .line 30
    .line 31
    :goto_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->l:Landroid/graphics/Paint;

    .line 32
    .line 33
    if-nez p1, :cond_2

    .line 34
    .line 35
    new-instance p1, Landroid/graphics/Paint;

    .line 36
    .line 37
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->l:Landroid/graphics/Paint;

    .line 41
    .line 42
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 45
    .line 46
    .line 47
    :cond_2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->l:Landroid/graphics/Paint;

    .line 48
    .line 49
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->n:I

    .line 50
    .line 51
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 52
    .line 53
    .line 54
    if-eqz p2, :cond_3

    .line 55
    .line 56
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->b:Lcom/xuexiang/xui/widget/tabbar/c;

    .line 57
    .line 58
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 59
    .line 60
    .line 61
    :cond_3
    :goto_1
    return-void
.end method

.method public final f(Lp3/h;Lp3/h;F)V
    .locals 2

    .line 1
    iget v0, p2, Lp3/h;->b:I

    .line 2
    .line 3
    iget v1, p1, Lp3/h;->b:I

    .line 4
    .line 5
    sub-int/2addr v0, v1

    .line 6
    iget p2, p2, Lp3/h;->a:I

    .line 7
    .line 8
    iget p1, p1, Lp3/h;->a:I

    .line 9
    .line 10
    sub-int/2addr p2, p1

    .line 11
    int-to-float v1, v1

    .line 12
    int-to-float v0, v0

    .line 13
    mul-float/2addr v0, p3

    .line 14
    add-float/2addr v0, v1

    .line 15
    float-to-int v0, v0

    .line 16
    int-to-float p1, p1

    .line 17
    int-to-float p2, p2

    .line 18
    mul-float/2addr p2, p3

    .line 19
    add-float/2addr p2, p1

    .line 20
    float-to-int p1, p2

    .line 21
    iget-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->k:Landroid/graphics/Rect;

    .line 22
    .line 23
    if-nez p2, :cond_0

    .line 24
    .line 25
    new-instance p2, Landroid/graphics/Rect;

    .line 26
    .line 27
    add-int/2addr p1, v0

    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {p2, v0, v1, p1, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 30
    .line 31
    .line 32
    iput-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->k:Landroid/graphics/Rect;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    iput v0, p2, Landroid/graphics/Rect;->left:I

    .line 36
    .line 37
    add-int/2addr v0, p1

    .line 38
    iput v0, p2, Landroid/graphics/Rect;->right:I

    .line 39
    .line 40
    :goto_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->l:Landroid/graphics/Paint;

    .line 41
    .line 42
    if-nez p1, :cond_1

    .line 43
    .line 44
    new-instance p1, Landroid/graphics/Paint;

    .line 45
    .line 46
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->l:Landroid/graphics/Paint;

    .line 50
    .line 51
    sget-object p2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 52
    .line 53
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 54
    .line 55
    .line 56
    :cond_1
    iget p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->n:I

    .line 57
    .line 58
    invoke-static {p3, p1, p1}, Lcoil3/network/g;->f(FII)I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    iget-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->l:Landroid/graphics/Paint;

    .line 63
    .line 64
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 65
    .line 66
    .line 67
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->b:Lcom/xuexiang/xui/widget/tabbar/c;

    .line 68
    .line 69
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public final g(Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->v:Landroidx/viewpager/widget/PagerAdapter;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    if-eqz p1, :cond_3

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->h()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {v0}, Landroidx/viewpager/widget/PagerAdapter;->getCount()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz p1, :cond_2

    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->h()V

    .line 19
    .line 20
    .line 21
    move p1, v1

    .line 22
    :goto_0
    if-ge p1, v0, :cond_1

    .line 23
    .line 24
    new-instance v2, Lp3/h;

    .line 25
    .line 26
    iget-object v3, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->v:Landroidx/viewpager/widget/PagerAdapter;

    .line 27
    .line 28
    invoke-virtual {v3, p1}, Landroidx/viewpager/widget/PagerAdapter;->getPageTitle(I)Ljava/lang/CharSequence;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    iput v1, v2, Lp3/h;->a:I

    .line 36
    .line 37
    iput v1, v2, Lp3/h;->b:I

    .line 38
    .line 39
    iput-object v3, v2, Lp3/h;->c:Ljava/lang/CharSequence;

    .line 40
    .line 41
    iget-object v3, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->b:Lcom/xuexiang/xui/widget/tabbar/c;

    .line 42
    .line 43
    iget-object v3, v3, Lcom/xuexiang/xui/widget/tabbar/c;->a:Lcom/xuexiang/xui/widget/tabbar/d;

    .line 44
    .line 45
    iget-object v3, v3, Lp3/s;->b:Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    add-int/lit8 p1, p1, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->getAdapter()Lcom/xuexiang/xui/widget/tabbar/d;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p1}, Lp3/s;->c()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->g(Z)V

    .line 61
    .line 62
    .line 63
    :cond_2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->u:Landroidx/viewpager/widget/ViewPager;

    .line 64
    .line 65
    if-eqz p1, :cond_3

    .line 66
    .line 67
    if-lez v0, :cond_3

    .line 68
    .line 69
    invoke-virtual {p1}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    const/4 v0, 0x1

    .line 74
    invoke-virtual {p0, p1, v0, v1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->i(IZZ)V

    .line 75
    .line 76
    .line 77
    :cond_3
    return-void
.end method

.method public getMode()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->p:I

    .line 2
    .line 3
    return v0
.end method

.method public getSelectedIndex()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public final h()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->b:Lcom/xuexiang/xui/widget/tabbar/c;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/xuexiang/xui/widget/tabbar/c;->a:Lcom/xuexiang/xui/widget/tabbar/d;

    .line 4
    .line 5
    iget-object v1, v0, Lp3/s;->b:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, Lp3/s;->c:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-virtual {v0, v1}, Lp3/s;->a(I)V

    .line 17
    .line 18
    .line 19
    const/4 v0, -0x1

    .line 20
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->c:I

    .line 21
    .line 22
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->s:Landroid/animation/Animator;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    .line 27
    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->s:Landroid/animation/Animator;

    .line 31
    .line 32
    :cond_0
    return-void
.end method

.method public final i(IZZ)V
    .locals 11

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->A:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->A:Z

    .line 8
    .line 9
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->getAdapter()Lcom/xuexiang/xui/widget/tabbar/d;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget-object v3, v2, Lp3/s;->c:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    iget-object v5, v2, Lp3/s;->b:Ljava/util/ArrayList;

    .line 20
    .line 21
    const/4 v8, 0x0

    .line 22
    if-nez v5, :cond_1

    .line 23
    .line 24
    move v5, v8

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    :goto_0
    if-eq v4, v5, :cond_2

    .line 31
    .line 32
    invoke-virtual {v2}, Lp3/s;->c()V

    .line 33
    .line 34
    .line 35
    iget-object v3, v2, Lp3/s;->c:Ljava/util/ArrayList;

    .line 36
    .line 37
    :cond_2
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_e

    .line 42
    .line 43
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-gt v4, p1, :cond_3

    .line 48
    .line 49
    goto/16 :goto_5

    .line 50
    .line 51
    :cond_3
    iget-object v4, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->s:Landroid/animation/Animator;

    .line 52
    .line 53
    if-nez v4, :cond_d

    .line 54
    .line 55
    iget v4, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->r:I

    .line 56
    .line 57
    if-eqz v4, :cond_4

    .line 58
    .line 59
    goto/16 :goto_4

    .line 60
    .line 61
    :cond_4
    iget v4, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->c:I

    .line 62
    .line 63
    iget-object v5, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->a:Ljava/util/ArrayList;

    .line 64
    .line 65
    if-ne v4, p1, :cond_6

    .line 66
    .line 67
    if-eqz p3, :cond_5

    .line 68
    .line 69
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    sub-int/2addr v2, v0

    .line 74
    :goto_1
    if-ltz v2, :cond_5

    .line 75
    .line 76
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    check-cast v0, Lp3/j;

    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    add-int/lit8 v2, v2, -0x1

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_5
    iput-boolean v8, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->A:Z

    .line 89
    .line 90
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->b:Lcom/xuexiang/xui/widget/tabbar/c;

    .line 91
    .line 92
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :cond_6
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    const/4 v9, -0x1

    .line 101
    if-le v4, v7, :cond_7

    .line 102
    .line 103
    const-string v4, "TabSegment"

    .line 104
    .line 105
    const-string v7, "selectTab: current selected index is bigger than views size."

    .line 106
    .line 107
    invoke-static {v4, v7}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 108
    .line 109
    .line 110
    iput v9, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->c:I

    .line 111
    .line 112
    :cond_7
    iget v7, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->c:I

    .line 113
    .line 114
    if-ne v7, v9, :cond_8

    .line 115
    .line 116
    invoke-virtual {v2, p1}, Lp3/s;->b(I)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    check-cast v2, Lp3/h;

    .line 121
    .line 122
    invoke-virtual {p0, v2, v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->e(Lp3/h;Z)V

    .line 123
    .line 124
    .line 125
    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    check-cast v4, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    .line 130
    .line 131
    invoke-virtual {v4}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->getTextView()Landroid/widget/TextView;

    .line 132
    .line 133
    .line 134
    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    check-cast v3, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    .line 139
    .line 140
    invoke-virtual {v3, v2, v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->b(Lp3/h;Z)V

    .line 141
    .line 142
    .line 143
    invoke-virtual/range {p0 .. p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->d(I)V

    .line 144
    .line 145
    .line 146
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->c:I

    .line 147
    .line 148
    iput-boolean v8, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->A:Z

    .line 149
    .line 150
    return-void

    .line 151
    :cond_8
    invoke-virtual {v2, v7}, Lp3/s;->b(I)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    check-cast v4, Lp3/h;

    .line 156
    .line 157
    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v9

    .line 161
    check-cast v9, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    .line 162
    .line 163
    invoke-virtual {v2, p1}, Lp3/s;->b(I)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    check-cast v2, Lp3/h;

    .line 168
    .line 169
    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    check-cast v3, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    .line 174
    .line 175
    if-eqz p2, :cond_c

    .line 176
    .line 177
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 178
    .line 179
    .line 180
    move-result v7

    .line 181
    sub-int/2addr v7, v0

    .line 182
    :goto_2
    if-ltz v7, :cond_9

    .line 183
    .line 184
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v10

    .line 188
    check-cast v10, Lp3/j;

    .line 189
    .line 190
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    add-int/lit8 v7, v7, -0x1

    .line 194
    .line 195
    goto :goto_2

    .line 196
    :cond_9
    invoke-virtual/range {p0 .. p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->d(I)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v9}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->getTextView()Landroid/widget/TextView;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->getTextView()Landroid/widget/TextView;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v9, v4, v8}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->b(Lp3/h;Z)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v3, v2, v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->b(Lp3/h;Z)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    .line 212
    .line 213
    .line 214
    move-result v4

    .line 215
    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    .line 216
    .line 217
    .line 218
    move-result v5

    .line 219
    if-le v4, v5, :cond_a

    .line 220
    .line 221
    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    .line 222
    .line 223
    .line 224
    move-result v3

    .line 225
    invoke-virtual {p0, v3, v8}, Landroid/widget/HorizontalScrollView;->smoothScrollTo(II)V

    .line 226
    .line 227
    .line 228
    goto :goto_3

    .line 229
    :cond_a
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 230
    .line 231
    .line 232
    move-result v4

    .line 233
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 234
    .line 235
    .line 236
    move-result v5

    .line 237
    sub-int/2addr v4, v5

    .line 238
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 239
    .line 240
    .line 241
    move-result v5

    .line 242
    sub-int/2addr v4, v5

    .line 243
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    .line 244
    .line 245
    .line 246
    move-result v5

    .line 247
    add-int/2addr v5, v4

    .line 248
    invoke-virtual {v3}, Landroid/view/View;->getRight()I

    .line 249
    .line 250
    .line 251
    move-result v7

    .line 252
    if-ge v5, v7, :cond_b

    .line 253
    .line 254
    invoke-virtual {v3}, Landroid/view/View;->getRight()I

    .line 255
    .line 256
    .line 257
    move-result v3

    .line 258
    sub-int/2addr v3, v4

    .line 259
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    .line 260
    .line 261
    .line 262
    move-result v4

    .line 263
    sub-int/2addr v3, v4

    .line 264
    invoke-virtual {p0, v3, v8}, Landroid/widget/HorizontalScrollView;->smoothScrollBy(II)V

    .line 265
    .line 266
    .line 267
    :cond_b
    :goto_3
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->c:I

    .line 268
    .line 269
    iput-boolean v8, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->A:Z

    .line 270
    .line 271
    invoke-virtual {p0, v2, v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->e(Lp3/h;Z)V

    .line 272
    .line 273
    .line 274
    return-void

    .line 275
    :cond_c
    const/4 v0, 0x2

    .line 276
    new-array v0, v0, [F

    .line 277
    .line 278
    fill-array-data v0, :array_0

    .line 279
    .line 280
    .line 281
    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 282
    .line 283
    .line 284
    move-result-object v10

    .line 285
    new-instance v0, Landroid/view/animation/LinearInterpolator;

    .line 286
    .line 287
    invoke-direct {v0}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v10, v0}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 291
    .line 292
    .line 293
    new-instance v0, Lcom/xuexiang/xui/widget/tabbar/a;

    .line 294
    .line 295
    move-object v1, p0

    .line 296
    move-object v5, v3

    .line 297
    move-object v3, v2

    .line 298
    move-object v2, v4

    .line 299
    move-object v4, v9

    .line 300
    invoke-direct/range {v0 .. v5}, Lcom/xuexiang/xui/widget/tabbar/a;-><init>(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Lp3/h;Lp3/h;Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v10, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 304
    .line 305
    .line 306
    new-instance v0, Lcom/xuexiang/xui/widget/tabbar/b;

    .line 307
    .line 308
    move-object v1, v3

    .line 309
    move-object v3, v2

    .line 310
    move-object v2, v4

    .line 311
    move-object v4, v5

    .line 312
    move-object v5, v1

    .line 313
    move-object v1, p0

    .line 314
    move v6, p1

    .line 315
    invoke-direct/range {v0 .. v7}, Lcom/xuexiang/xui/widget/tabbar/b;-><init>(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;Lp3/h;Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;Lp3/h;II)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v10, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 319
    .line 320
    .line 321
    const-wide/16 v2, 0xc8

    .line 322
    .line 323
    invoke-virtual {v10, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v10}, Landroid/animation/ValueAnimator;->start()V

    .line 327
    .line 328
    .line 329
    iput-boolean v8, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->A:Z

    .line 330
    .line 331
    return-void

    .line 332
    :cond_d
    :goto_4
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->d:I

    .line 333
    .line 334
    iput-boolean v8, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->A:Z

    .line 335
    .line 336
    return-void

    .line 337
    :cond_e
    :goto_5
    iput-boolean v8, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->A:Z

    .line 338
    .line 339
    return-void

    .line 340
    nop

    .line 341
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public final j(Landroidx/viewpager/widget/PagerAdapter;ZZ)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->v:Landroidx/viewpager/widget/PagerAdapter;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->w:Lp3/g;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/PagerAdapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->v:Landroidx/viewpager/widget/PagerAdapter;

    .line 13
    .line 14
    if-eqz p3, :cond_2

    .line 15
    .line 16
    if-eqz p1, :cond_2

    .line 17
    .line 18
    iget-object p3, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->w:Lp3/g;

    .line 19
    .line 20
    if-nez p3, :cond_1

    .line 21
    .line 22
    new-instance p3, Lp3/g;

    .line 23
    .line 24
    invoke-direct {p3, p0, p2}, Lp3/g;-><init>(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Z)V

    .line 25
    .line 26
    .line 27
    iput-object p3, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->w:Lp3/g;

    .line 28
    .line 29
    :cond_1
    iget-object p3, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->w:Lp3/g;

    .line 30
    .line 31
    invoke-virtual {p1, p3}, Landroidx/viewpager/widget/PagerAdapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 32
    .line 33
    .line 34
    :cond_2
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->g(Z)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final k(FI)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->s:Landroid/animation/Animator;

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->A:Z

    .line 6
    .line 7
    if-nez v0, :cond_3

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    cmpl-float v1, p1, v0

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    cmpg-float v0, p1, v0

    .line 16
    .line 17
    if-gez v0, :cond_1

    .line 18
    .line 19
    add-int/lit8 v0, p2, -0x1

    .line 20
    .line 21
    neg-float p1, p1

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    add-int/lit8 v0, p2, 0x1

    .line 24
    .line 25
    :goto_0
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->getAdapter()Lcom/xuexiang/xui/widget/tabbar/d;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iget-object v2, v1, Lp3/s;->c:Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-le v3, p2, :cond_3

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-gt v3, v0, :cond_2

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    invoke-virtual {v1, p2}, Lp3/s;->b(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    check-cast v3, Lp3/h;

    .line 49
    .line 50
    invoke-virtual {v1, v0}, Lp3/s;->b(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    check-cast v1, Lp3/h;

    .line 55
    .line 56
    invoke-virtual {v2, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    check-cast p2, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    .line 61
    .line 62
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    .line 67
    .line 68
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    iget v2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->n:I

    .line 72
    .line 73
    iget v4, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->m:I

    .line 74
    .line 75
    invoke-static {p1, v2, v4}, Lcoil3/network/g;->f(FII)I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    iget v4, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->m:I

    .line 83
    .line 84
    iget v5, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->n:I

    .line 85
    .line 86
    invoke-static {p1, v4, v5}, Lcoil3/network/g;->f(FII)I

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    invoke-virtual {p2, v3, v2}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->a(Lp3/h;I)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v1, v4}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->a(Lp3/h;I)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0, v3, v1, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->f(Lp3/h;Lp3/h;F)V

    .line 97
    .line 98
    .line 99
    :cond_3
    :goto_1
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 1

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/widget/HorizontalScrollView;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    move-object p1, p0

    .line 5
    iget p2, p1, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->c:I

    .line 6
    .line 7
    const/4 p3, -0x1

    .line 8
    if-eq p2, p3, :cond_1

    .line 9
    .line 10
    iget p2, p1, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->p:I

    .line 11
    .line 12
    if-nez p2, :cond_1

    .line 13
    .line 14
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->getAdapter()Lcom/xuexiang/xui/widget/tabbar/d;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    iget-object p2, p2, Lp3/s;->c:Ljava/util/ArrayList;

    .line 19
    .line 20
    iget p3, p1, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->c:I

    .line 21
    .line 22
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    check-cast p2, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    .line 29
    .line 30
    .line 31
    move-result p3

    .line 32
    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    .line 33
    .line 34
    .line 35
    move-result p4

    .line 36
    const/4 p5, 0x0

    .line 37
    if-le p3, p4, :cond_0

    .line 38
    .line 39
    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    invoke-virtual {p0, p2, p5}, Landroid/view/View;->scrollTo(II)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 48
    .line 49
    .line 50
    move-result p3

    .line 51
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 52
    .line 53
    .line 54
    move-result p4

    .line 55
    sub-int/2addr p3, p4

    .line 56
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 57
    .line 58
    .line 59
    move-result p4

    .line 60
    sub-int/2addr p3, p4

    .line 61
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    .line 62
    .line 63
    .line 64
    move-result p4

    .line 65
    add-int/2addr p4, p3

    .line 66
    invoke-virtual {p2}, Landroid/view/View;->getRight()I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-ge p4, v0, :cond_1

    .line 71
    .line 72
    invoke-virtual {p2}, Landroid/view/View;->getRight()I

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    sub-int/2addr p2, p3

    .line 77
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    .line 78
    .line 79
    .line 80
    move-result p3

    .line 81
    sub-int/2addr p2, p3

    .line 82
    invoke-virtual {p0, p2, p5}, Landroid/view/View;->scrollBy(II)V

    .line 83
    .line 84
    .line 85
    :cond_1
    return-void
.end method

.method public final onMeasure(II)V
    .locals 6

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-lez v2, :cond_0

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    add-int/2addr v4, v3

    .line 29
    sub-int v3, v0, v4

    .line 30
    .line 31
    const/high16 v5, 0x40000000    # 2.0f

    .line 32
    .line 33
    invoke-static {v3, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    invoke-virtual {v2, v3, p2}, Landroid/view/View;->measure(II)V

    .line 38
    .line 39
    .line 40
    const/high16 v3, -0x80000000

    .line 41
    .line 42
    if-ne v1, v3, :cond_0

    .line 43
    .line 44
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    add-int/2addr p1, v4

    .line 49
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_0
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public setDefaultNormalColor(I)V
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->m:I

    .line 2
    .line 3
    return-void
.end method

.method public setDefaultSelectedColor(I)V
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->n:I

    .line 2
    .line 3
    return-void
.end method

.method public setDefaultTabIconPosition(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->o:I

    .line 2
    .line 3
    return-void
.end method

.method public setHasIndicator(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->f:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->f:Z

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setIndicatorDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->i:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->g:I

    .line 10
    .line 11
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->b:Lcom/xuexiang/xui/widget/tabbar/c;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public setIndicatorPosition(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->h:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->h:Z

    .line 6
    .line 7
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->b:Lcom/xuexiang/xui/widget/tabbar/c;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public setIndicatorWidthAdjustContent(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->j:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->j:Z

    .line 6
    .line 7
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->b:Lcom/xuexiang/xui/widget/tabbar/c;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public setItemSpaceInScrollMode(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->q:I

    .line 2
    .line 3
    return-void
.end method

.method public setMode(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->p:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->p:I

    .line 6
    .line 7
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->b:Lcom/xuexiang/xui/widget/tabbar/c;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public setOnTabClickListener(Lp3/f;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setTabTextSize(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->e:I

    .line 2
    .line 3
    return-void
.end method

.method public setTypefaceProvider(Lp3/i;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setupWithViewPager(Landroidx/viewpager/widget/ViewPager;)V
    .locals 3
    .param p1    # Landroidx/viewpager/widget/ViewPager;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->u:Landroidx/viewpager/widget/ViewPager;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->x:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabLayoutOnPageChangeListener;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->removeOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->z:Lp3/e;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->u:Landroidx/viewpager/widget/ViewPager;

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Landroidx/viewpager/widget/ViewPager;->removeOnAdapterChangeListener(Landroidx/viewpager/widget/ViewPager$OnAdapterChangeListener;)V

    .line 19
    .line 20
    .line 21
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->y:Lp3/j;

    .line 22
    .line 23
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->a:Ljava/util/ArrayList;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    iput-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->y:Lp3/j;

    .line 32
    .line 33
    :cond_2
    if-eqz p1, :cond_7

    .line 34
    .line 35
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->u:Landroidx/viewpager/widget/ViewPager;

    .line 36
    .line 37
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->x:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabLayoutOnPageChangeListener;

    .line 38
    .line 39
    if-nez v0, :cond_3

    .line 40
    .line 41
    new-instance v0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabLayoutOnPageChangeListener;

    .line 42
    .line 43
    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabLayoutOnPageChangeListener;-><init>(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->x:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabLayoutOnPageChangeListener;

    .line 47
    .line 48
    :cond_3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->x:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabLayoutOnPageChangeListener;

    .line 49
    .line 50
    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    .line 51
    .line 52
    .line 53
    new-instance v0, Lp3/j;

    .line 54
    .line 55
    invoke-direct {v0, p1}, Lp3/j;-><init>(Landroidx/viewpager/widget/ViewPager;)V

    .line 56
    .line 57
    .line 58
    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->y:Lp3/j;

    .line 59
    .line 60
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-nez v2, :cond_4

    .line 65
    .line 66
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    :cond_4
    invoke-virtual {p1}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Landroidx/viewpager/widget/PagerAdapter;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    const/4 v1, 0x1

    .line 74
    if-eqz v0, :cond_5

    .line 75
    .line 76
    invoke-virtual {p0, v0, v1, v1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->j(Landroidx/viewpager/widget/PagerAdapter;ZZ)V

    .line 77
    .line 78
    .line 79
    :cond_5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->z:Lp3/e;

    .line 80
    .line 81
    if-nez v0, :cond_6

    .line 82
    .line 83
    new-instance v0, Lp3/e;

    .line 84
    .line 85
    invoke-direct {v0, p0}, Lp3/e;-><init>(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)V

    .line 86
    .line 87
    .line 88
    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->z:Lp3/e;

    .line 89
    .line 90
    :cond_6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->z:Lp3/e;

    .line 91
    .line 92
    iput-boolean v1, v0, Lp3/e;->a:Z

    .line 93
    .line 94
    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->addOnAdapterChangeListener(Landroidx/viewpager/widget/ViewPager$OnAdapterChangeListener;)V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :cond_7
    iput-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->u:Landroidx/viewpager/widget/ViewPager;

    .line 99
    .line 100
    const/4 p1, 0x0

    .line 101
    invoke-virtual {p0, v2, p1, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->j(Landroidx/viewpager/widget/PagerAdapter;ZZ)V

    .line 102
    .line 103
    .line 104
    return-void
.end method
