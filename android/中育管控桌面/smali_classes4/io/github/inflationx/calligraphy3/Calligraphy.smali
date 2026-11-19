.class Lio/github/inflationx/calligraphy3/Calligraphy;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/github/inflationx/calligraphy3/Calligraphy$ToolbarLayoutListener;
    }
.end annotation


# static fields
.field private static final ACTION_BAR_SUBTITLE:Ljava/lang/String; = "action_bar_subtitle"

.field private static final ACTION_BAR_TITLE:Ljava/lang/String; = "action_bar_title"


# instance fields
.field private final mAttributeId:[I

.field private final mCalligraphyConfig:Lio/github/inflationx/calligraphy3/CalligraphyConfig;


# direct methods
.method public constructor <init>(Lio/github/inflationx/calligraphy3/CalligraphyConfig;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/github/inflationx/calligraphy3/Calligraphy;->mCalligraphyConfig:Lio/github/inflationx/calligraphy3/CalligraphyConfig;

    .line 5
    .line 6
    invoke-virtual {p1}, Lio/github/inflationx/calligraphy3/CalligraphyConfig;->getAttrId()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    filled-new-array {p1}, [I

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Lio/github/inflationx/calligraphy3/Calligraphy;->mAttributeId:[I

    .line 15
    .line 16
    return-void
.end method

.method private applyFontMapper(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/github/inflationx/calligraphy3/Calligraphy;->mCalligraphyConfig:Lio/github/inflationx/calligraphy3/CalligraphyConfig;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/github/inflationx/calligraphy3/CalligraphyConfig;->getFontMapper()Lio/github/inflationx/calligraphy3/FontMapper;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {v0, p1}, Lio/github/inflationx/calligraphy3/FontMapper;->map(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    :cond_0
    return-object p1
.end method

.method private getDefaultTypeface(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Typeface;
    .locals 1

    .line 1
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p2, p0, Lio/github/inflationx/calligraphy3/Calligraphy;->mCalligraphyConfig:Lio/github/inflationx/calligraphy3/CalligraphyConfig;

    .line 8
    .line 9
    invoke-virtual {p2}, Lio/github/inflationx/calligraphy3/CalligraphyConfig;->getFontPath()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    :cond_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-static {p1, p2}, Lio/github/inflationx/calligraphy3/TypefaceUtils;->load(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1

    .line 28
    :cond_1
    const/4 p1, 0x0

    .line 29
    return-object p1
.end method

.method public static isActionBarSubTitle(Landroid/widget/TextView;)Z
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 1
    const-string v0, "action_bar_subtitle"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lio/github/inflationx/calligraphy3/Calligraphy;->matchesResourceIdName(Landroid/view/View;Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    invoke-static {p0}, Lio/github/inflationx/calligraphy3/Calligraphy;->parentIsToolbarV7(Landroid/view/View;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    .line 22
    .line 23
    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->getSubtitle()Ljava/lang/CharSequence;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {v0, p0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    return p0

    .line 36
    :cond_1
    const/4 p0, 0x0

    .line 37
    return p0
.end method

.method public static isActionBarTitle(Landroid/widget/TextView;)Z
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 1
    const-string v0, "action_bar_title"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lio/github/inflationx/calligraphy3/Calligraphy;->matchesResourceIdName(Landroid/view/View;Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    invoke-static {p0}, Lio/github/inflationx/calligraphy3/Calligraphy;->parentIsToolbarV7(Landroid/view/View;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    .line 22
    .line 23
    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->getTitle()Ljava/lang/CharSequence;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {v0, p0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    return p0

    .line 36
    :cond_1
    const/4 p0, 0x0

    .line 37
    return p0
.end method

.method public static matchesResourceIdName(Landroid/view/View;Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    return p0

    .line 10
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    invoke-virtual {v0, p0}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0
.end method

.method public static parentIsToolbarV7(Landroid/view/View;)Z
    .locals 1

    .line 1
    invoke-static {}, Lio/github/inflationx/calligraphy3/CalligraphyUtils;->canCheckForV7Toolbar()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    instance-of p0, p0, Landroidx/appcompat/widget/Toolbar;

    .line 18
    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method private resolveFontPath(Landroid/content/Context;Landroid/util/AttributeSet;)Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lio/github/inflationx/calligraphy3/Calligraphy;->mAttributeId:[I

    .line 2
    .line 3
    invoke-static {p1, p2, v0}, Lio/github/inflationx/calligraphy3/CalligraphyUtils;->pullFontPathFromView(Landroid/content/Context;Landroid/util/AttributeSet;[I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lio/github/inflationx/calligraphy3/Calligraphy;->mAttributeId:[I

    .line 14
    .line 15
    invoke-static {p1, p2, v0}, Lio/github/inflationx/calligraphy3/CalligraphyUtils;->pullFontPathFromStyle(Landroid/content/Context;Landroid/util/AttributeSet;[I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :cond_0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    iget-object v0, p0, Lio/github/inflationx/calligraphy3/Calligraphy;->mAttributeId:[I

    .line 26
    .line 27
    invoke-static {p1, p2, v0}, Lio/github/inflationx/calligraphy3/CalligraphyUtils;->pullFontPathFromTextAppearance(Landroid/content/Context;Landroid/util/AttributeSet;[I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1

    .line 32
    :cond_1
    return-object v0
.end method


# virtual methods
.method public getStyleForTextView(Landroid/widget/TextView;)[I
    .locals 6

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [I

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    const/4 v2, -0x1

    .line 6
    aput v2, v0, v1

    .line 7
    .line 8
    const/4 v3, 0x1

    .line 9
    aput v2, v0, v3

    .line 10
    .line 11
    invoke-static {p1}, Lio/github/inflationx/calligraphy3/Calligraphy;->isActionBarTitle(Landroid/widget/TextView;)Z

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    const v5, 0x10102ce

    .line 16
    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    aput v5, v0, v1

    .line 21
    .line 22
    const v4, 0x10102f8

    .line 23
    .line 24
    .line 25
    aput v4, v0, v3

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {p1}, Lio/github/inflationx/calligraphy3/Calligraphy;->isActionBarSubTitle(Landroid/widget/TextView;)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_1

    .line 33
    .line 34
    aput v5, v0, v1

    .line 35
    .line 36
    const v4, 0x10102f9

    .line 37
    .line 38
    .line 39
    aput v4, v0, v3

    .line 40
    .line 41
    :cond_1
    :goto_0
    aget v3, v0, v1

    .line 42
    .line 43
    if-ne v3, v2, :cond_3

    .line 44
    .line 45
    iget-object v2, p0, Lio/github/inflationx/calligraphy3/Calligraphy;->mCalligraphyConfig:Lio/github/inflationx/calligraphy3/CalligraphyConfig;

    .line 46
    .line 47
    invoke-virtual {v2}, Lio/github/inflationx/calligraphy3/CalligraphyConfig;->getClassStyles()Ljava/util/Map;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-interface {v2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-eqz v2, :cond_2

    .line 60
    .line 61
    iget-object v2, p0, Lio/github/inflationx/calligraphy3/Calligraphy;->mCalligraphyConfig:Lio/github/inflationx/calligraphy3/CalligraphyConfig;

    .line 62
    .line 63
    invoke-virtual {v2}, Lio/github/inflationx/calligraphy3/CalligraphyConfig;->getClassStyles()Ljava/util/Map;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    check-cast p1, Ljava/lang/Integer;

    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    goto :goto_1

    .line 82
    :cond_2
    const p1, 0x1010034

    .line 83
    .line 84
    .line 85
    :goto_1
    aput p1, v0, v1

    .line 86
    .line 87
    :cond_3
    return-object v0
.end method

.method public onViewCreated(Landroid/view/View;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 3

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    sget v0, Lio/github/inflationx/calligraphy3/R$id;->calligraphy_tag_id:I

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 10
    .line 11
    if-eq v1, v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2, p3}, Lio/github/inflationx/calligraphy3/Calligraphy;->onViewCreatedInternal(Landroid/view/View;Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v0, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-object p1
.end method

.method public onViewCreatedInternal(Landroid/view/View;Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 6

    .line 1
    instance-of v0, p1, Landroid/widget/TextView;

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Landroid/widget/TextView;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {v1}, Lio/github/inflationx/calligraphy3/TypefaceUtils;->isLoaded(Landroid/graphics/Typeface;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    goto/16 :goto_2

    .line 19
    .line 20
    :cond_0
    invoke-direct {p0, p2, p3}, Lio/github/inflationx/calligraphy3/Calligraphy;->resolveFontPath(Landroid/content/Context;Landroid/util/AttributeSet;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    const/4 v3, 0x1

    .line 29
    const/4 v4, 0x0

    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    invoke-virtual {p0, v0}, Lio/github/inflationx/calligraphy3/Calligraphy;->getStyleForTextView(Landroid/widget/TextView;)[I

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    aget v2, v1, v3

    .line 37
    .line 38
    const/4 v5, -0x1

    .line 39
    if-eq v2, v5, :cond_1

    .line 40
    .line 41
    aget v1, v1, v4

    .line 42
    .line 43
    iget-object v5, p0, Lio/github/inflationx/calligraphy3/Calligraphy;->mAttributeId:[I

    .line 44
    .line 45
    invoke-static {p2, v1, v2, v5}, Lio/github/inflationx/calligraphy3/CalligraphyUtils;->pullFontPathFromTheme(Landroid/content/Context;II[I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    aget v1, v1, v4

    .line 51
    .line 52
    iget-object v2, p0, Lio/github/inflationx/calligraphy3/Calligraphy;->mAttributeId:[I

    .line 53
    .line 54
    invoke-static {p2, v1, v2}, Lio/github/inflationx/calligraphy3/CalligraphyUtils;->pullFontPathFromTheme(Landroid/content/Context;I[I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    :cond_2
    :goto_0
    invoke-direct {p0, v1}, Lio/github/inflationx/calligraphy3/Calligraphy;->applyFontMapper(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    const-string v2, "action_bar_title"

    .line 63
    .line 64
    invoke-static {p1, v2}, Lio/github/inflationx/calligraphy3/Calligraphy;->matchesResourceIdName(Landroid/view/View;Ljava/lang/String;)Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-nez v2, :cond_4

    .line 69
    .line 70
    const-string v2, "action_bar_subtitle"

    .line 71
    .line 72
    invoke-static {p1, v2}, Lio/github/inflationx/calligraphy3/Calligraphy;->matchesResourceIdName(Landroid/view/View;Ljava/lang/String;)Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-eqz v2, :cond_3

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_3
    move v3, v4

    .line 80
    :cond_4
    :goto_1
    iget-object v2, p0, Lio/github/inflationx/calligraphy3/Calligraphy;->mCalligraphyConfig:Lio/github/inflationx/calligraphy3/CalligraphyConfig;

    .line 81
    .line 82
    invoke-static {p2, v0, v2, v1, v3}, Lio/github/inflationx/calligraphy3/CalligraphyUtils;->applyFontToTextView(Landroid/content/Context;Landroid/widget/TextView;Lio/github/inflationx/calligraphy3/CalligraphyConfig;Ljava/lang/String;Z)V

    .line 83
    .line 84
    .line 85
    :cond_5
    invoke-static {}, Lio/github/inflationx/calligraphy3/CalligraphyUtils;->canCheckForV7Toolbar()Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_6

    .line 90
    .line 91
    instance-of v0, p1, Landroidx/appcompat/widget/Toolbar;

    .line 92
    .line 93
    if-eqz v0, :cond_6

    .line 94
    .line 95
    move-object v0, p1

    .line 96
    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    .line 97
    .line 98
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    new-instance v2, Lio/github/inflationx/calligraphy3/Calligraphy$ToolbarLayoutListener;

    .line 103
    .line 104
    const/4 v3, 0x0

    .line 105
    invoke-direct {v2, p0, p2, v0, v3}, Lio/github/inflationx/calligraphy3/Calligraphy$ToolbarLayoutListener;-><init>(Lio/github/inflationx/calligraphy3/Calligraphy;Landroid/content/Context;Landroidx/appcompat/widget/Toolbar;Lio/github/inflationx/calligraphy3/Calligraphy$1;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1, v2}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 109
    .line 110
    .line 111
    :cond_6
    instance-of v0, p1, Lio/github/inflationx/calligraphy3/HasTypeface;

    .line 112
    .line 113
    if-eqz v0, :cond_7

    .line 114
    .line 115
    invoke-direct {p0, p2, p3}, Lio/github/inflationx/calligraphy3/Calligraphy;->resolveFontPath(Landroid/content/Context;Landroid/util/AttributeSet;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p3

    .line 119
    invoke-direct {p0, p3}, Lio/github/inflationx/calligraphy3/Calligraphy;->applyFontMapper(Ljava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p3

    .line 123
    invoke-direct {p0, p2, p3}, Lio/github/inflationx/calligraphy3/Calligraphy;->getDefaultTypeface(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Typeface;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    if-eqz p2, :cond_8

    .line 128
    .line 129
    check-cast p1, Lio/github/inflationx/calligraphy3/HasTypeface;

    .line 130
    .line 131
    invoke-interface {p1, p2}, Lio/github/inflationx/calligraphy3/HasTypeface;->setTypeface(Landroid/graphics/Typeface;)V

    .line 132
    .line 133
    .line 134
    return-void

    .line 135
    :cond_7
    iget-object v0, p0, Lio/github/inflationx/calligraphy3/Calligraphy;->mCalligraphyConfig:Lio/github/inflationx/calligraphy3/CalligraphyConfig;

    .line 136
    .line 137
    invoke-virtual {v0}, Lio/github/inflationx/calligraphy3/CalligraphyConfig;->isCustomViewTypefaceSupport()Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-eqz v0, :cond_8

    .line 142
    .line 143
    iget-object v0, p0, Lio/github/inflationx/calligraphy3/Calligraphy;->mCalligraphyConfig:Lio/github/inflationx/calligraphy3/CalligraphyConfig;

    .line 144
    .line 145
    invoke-virtual {v0, p1}, Lio/github/inflationx/calligraphy3/CalligraphyConfig;->isCustomViewHasTypeface(Landroid/view/View;)Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    if-eqz v0, :cond_8

    .line 150
    .line 151
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    const-string v1, "setTypeface"

    .line 156
    .line 157
    invoke-static {v0, v1}, Lio/github/inflationx/calligraphy3/ReflectionUtils;->getMethod(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-direct {p0, p2, p3}, Lio/github/inflationx/calligraphy3/Calligraphy;->resolveFontPath(Landroid/content/Context;Landroid/util/AttributeSet;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p3

    .line 165
    invoke-direct {p0, p3}, Lio/github/inflationx/calligraphy3/Calligraphy;->applyFontMapper(Ljava/lang/String;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p3

    .line 169
    invoke-direct {p0, p2, p3}, Lio/github/inflationx/calligraphy3/Calligraphy;->getDefaultTypeface(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Typeface;

    .line 170
    .line 171
    .line 172
    move-result-object p2

    .line 173
    if-eqz v0, :cond_8

    .line 174
    .line 175
    if-eqz p2, :cond_8

    .line 176
    .line 177
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object p2

    .line 181
    invoke-static {p1, v0, p2}, Lio/github/inflationx/calligraphy3/ReflectionUtils;->invokeMethod(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    :cond_8
    :goto_2
    return-void
.end method
