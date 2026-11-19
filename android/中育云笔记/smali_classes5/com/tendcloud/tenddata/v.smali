.class public Lcom/tendcloud/tenddata/v;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final a:I = 0x54440001

.field static final b:I = 0x54440002

.field static final c:Ljava/lang/String; = "MainContentView"

.field private static final d:Ljava/lang/String; = "v"

.field private static e:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "\\[(\\d)\\]"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lcom/tendcloud/tenddata/v;->e:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static a(Ljava/lang/String;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5

    .line 75
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_6

    if-nez p1, :cond_0

    goto/16 :goto_4

    .line 76
    :cond_0
    const-string v0, "MainContentView"

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_1

    .line 77
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    const v0, 0x1020002

    .line 78
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    .line 79
    :cond_1
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 80
    sget-object v2, Lcom/tendcloud/tenddata/v;->e:Ljava/util/regex/Pattern;

    invoke-virtual {v2, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    .line 81
    :goto_0
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->find()Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    .line 82
    invoke-virtual {v2, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v3

    .line 83
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    .line 84
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_3

    .line 85
    :cond_2
    sget-object v2, Lcom/tendcloud/tenddata/v;->d:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/tendcloud/tenddata/ca;->dForInternal([Ljava/lang/String;)V

    move v2, v4

    .line 86
    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_5

    .line 87
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    sub-int/2addr v3, v4

    if-ne v2, v3, :cond_3

    .line 88
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p0

    return-object p0

    .line 89
    :cond_3
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {p1, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p1, :cond_4

    goto :goto_2

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_5
    :goto_2
    return-object v1

    .line 90
    :goto_3
    sget-object v0, Lcom/tendcloud/tenddata/v;->d:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "parse error:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    filled-new-array {v0, p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/tendcloud/tenddata/ca;->dForInternal([Ljava/lang/String;)V

    .line 91
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_6
    :goto_4
    return-object v1
.end method

.method public static a(Landroid/view/View;Ljava/util/List;Z)Lcom/tendcloud/tenddata/w;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Ljava/util/List<",
            "Lcom/tendcloud/tenddata/w;",
            ">;Z)",
            "Lcom/tendcloud/tenddata/w;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p0, :cond_9

    if-eqz p1, :cond_9

    .line 24
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_2

    .line 25
    :cond_0
    invoke-static {p0}, Lcom/tendcloud/tenddata/v;->c(Landroid/view/View;)Ljava/lang/String;

    move-result-object v1

    .line 26
    sget-object v2, Lcom/tendcloud/tenddata/v;->d:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "btn_path:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/tendcloud/tenddata/ca;->dForInternal([Ljava/lang/String;)V

    .line 27
    instance-of v3, p0, Landroid/widget/TextView;

    const-string v4, "btn_value:"

    if-eqz v3, :cond_1

    .line 28
    move-object v3, p0

    check-cast v3, Landroid/widget/TextView;

    invoke-virtual {v3}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v3

    .line 29
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    filled-new-array {v2, v5}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/tendcloud/tenddata/ca;->dForInternal([Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v3, v0

    .line 30
    :goto_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 31
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/tendcloud/tenddata/w;

    const v6, 0x54440001

    .line 32
    invoke-virtual {p0, v6}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v7

    if-eqz v7, :cond_3

    .line 33
    invoke-virtual {p0, v6}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v5}, Lcom/tendcloud/tenddata/w;->i()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 34
    invoke-virtual {v5}, Lcom/tendcloud/tenddata/w;->c()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5}, Lcom/tendcloud/tenddata/w;->c()Ljava/lang/String;

    move-result-object v7

    const-string v8, "/"

    invoke-virtual {v7, v8}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    .line 35
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_3

    .line 36
    const-string v7, "#"

    invoke-virtual {v6, v7}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v8

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v9

    add-int/lit8 v9, v9, -0x1

    if-le v8, v9, :cond_3

    .line 37
    invoke-virtual {v6, v7}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v7

    add-int/lit8 v7, v7, 0x1

    invoke-virtual {v6, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    .line 38
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v8

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object v7

    .line 39
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_3

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 40
    sget-object p0, Lcom/tendcloud/tenddata/v;->d:Ljava/lang/String;

    const-string p1, "view id matched"

    filled-new-array {p0, p1}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/tendcloud/tenddata/ca;->dForInternal([Ljava/lang/String;)V

    return-object v5

    .line 41
    :cond_3
    invoke-virtual {v5}, Lcom/tendcloud/tenddata/w;->c()Ljava/lang/String;

    move-result-object v6

    invoke-static {v1, v6}, Lcom/tendcloud/tenddata/v;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_4

    .line 42
    sget-object p0, Lcom/tendcloud/tenddata/v;->d:Ljava/lang/String;

    const-string p1, "view path matched"

    filled-new-array {p0, p1}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/tendcloud/tenddata/ca;->dForInternal([Ljava/lang/String;)V

    return-object v5

    .line 43
    :cond_4
    sget-object v6, Lcom/tendcloud/tenddata/v;->d:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "||eventValue:"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Lcom/tendcloud/tenddata/w;->h()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "||eventSame:"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Lcom/tendcloud/tenddata/w;->b()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    filled-new-array {v6, v7}, [Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/tendcloud/tenddata/ca;->dForInternal([Ljava/lang/String;)V

    .line 44
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_5

    invoke-virtual {v5}, Lcom/tendcloud/tenddata/w;->h()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_5

    .line 45
    const-string p0, "view value matched"

    filled-new-array {v6, p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/tendcloud/tenddata/ca;->dForInternal([Ljava/lang/String;)V

    return-object v5

    .line 46
    :cond_5
    invoke-virtual {v5}, Lcom/tendcloud/tenddata/w;->b()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_2

    .line 47
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    .line 48
    :cond_6
    sget-object p0, Lcom/tendcloud/tenddata/v;->d:Ljava/lang/String;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "same elements:"

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p0, p1}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/tendcloud/tenddata/ca;->dForInternal([Ljava/lang/String;)V

    if-eqz p2, :cond_8

    .line 49
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result p0

    if-lez p0, :cond_8

    .line 50
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result p0

    const/4 p1, 0x0

    :cond_7
    if-ge p1, p0, :cond_8

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    add-int/lit8 p1, p1, 0x1

    check-cast p2, Lcom/tendcloud/tenddata/w;

    .line 51
    invoke-virtual {p2}, Lcom/tendcloud/tenddata/w;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 52
    sget-object p0, Lcom/tendcloud/tenddata/v;->d:Ljava/lang/String;

    const-string p1, "view same matched"

    filled-new-array {p0, p1}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/tendcloud/tenddata/ca;->dForInternal([Ljava/lang/String;)V

    return-object p2

    .line 53
    :cond_8
    sget-object p0, Lcom/tendcloud/tenddata/v;->d:Ljava/lang/String;

    const-string p1, "view none matched"

    filled-new-array {p0, p1}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/tendcloud/tenddata/ca;->dForInternal([Ljava/lang/String;)V

    return-object v0

    .line 54
    :cond_9
    :goto_2
    sget-object p0, Lcom/tendcloud/tenddata/v;->d:Ljava/lang/String;

    const-string p1, "empty reject"

    filled-new-array {p0, p1}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/tendcloud/tenddata/ca;->dForInternal([Ljava/lang/String;)V

    return-object v0
.end method

.method public static a(Landroid/view/View;)Ljava/lang/String;
    .locals 2

    .line 1
    instance-of v0, p0, Landroid/widget/EditText;

    if-eqz v0, :cond_1

    .line 2
    check-cast p0, Landroid/widget/EditText;

    invoke-virtual {p0}, Landroid/widget/TextView;->getInputType()I

    move-result v0

    const/16 v1, 0x10

    if-eq v0, v1, :cond_0

    const/16 v1, 0x80

    if-eq v0, v1, :cond_0

    const/16 v1, 0x90

    if-eq v0, v1, :cond_0

    const/16 v1, 0xe0

    if-eq v0, v1, :cond_0

    .line 3
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p0

    goto :goto_0

    .line 4
    :cond_0
    const-string p0, ""

    goto :goto_0

    :cond_1
    instance-of v0, p0, Landroid/widget/TextView;

    if-eqz v0, :cond_2

    .line 5
    check-cast p0, Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p0

    goto :goto_0

    .line 6
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object p0

    .line 7
    :goto_0
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 p0, 0x0

    return-object p0

    :cond_3
    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static a(Landroid/view/View;Lcom/tendcloud/tenddata/w;)Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Lcom/tendcloud/tenddata/w;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    if-eqz p0, :cond_4

    if-eqz p1, :cond_4

    .line 55
    invoke-virtual {p1}, Lcom/tendcloud/tenddata/w;->e()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lcom/tendcloud/tenddata/w;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_2

    .line 56
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0x20

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 57
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    :goto_0
    if-eqz p0, :cond_1

    .line 59
    instance-of v1, p0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_1

    .line 60
    move-object v1, p0

    check-cast v1, Landroid/view/View;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    invoke-interface {p0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    goto :goto_0

    .line 62
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    .line 63
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/view/View;

    .line 64
    sget-object v0, Lcom/tendcloud/tenddata/v;->d:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "rootView-----:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tendcloud/tenddata/ca;->dForInternal([Ljava/lang/String;)V

    .line 65
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 66
    invoke-virtual {p1}, Lcom/tendcloud/tenddata/w;->e()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tendcloud/tenddata/k;

    .line 67
    invoke-virtual {v1}, Lcom/tendcloud/tenddata/k;->b()Ljava/lang/String;

    move-result-object v2

    move-object v3, p0

    check-cast v3, Landroid/view/ViewGroup;

    invoke-static {v2, v3}, Lcom/tendcloud/tenddata/v;->a(Ljava/lang/String;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    .line 68
    sget-object v3, Lcom/tendcloud/tenddata/v;->d:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "getTarget:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    filled-new-array {v3, v4}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/tendcloud/tenddata/ca;->dForInternal([Ljava/lang/String;)V

    if-eqz v2, :cond_2

    .line 69
    instance-of v3, v2, Landroid/widget/TextView;

    if-eqz v3, :cond_2

    .line 70
    check-cast v2, Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v3

    .line 71
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 72
    invoke-virtual {v1}, Lcom/tendcloud/tenddata/k;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 73
    :cond_3
    sget-object p0, Lcom/tendcloud/tenddata/v;->d:Ljava/lang/String;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "values:"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p0, p1}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/tendcloud/tenddata/ca;->dForInternal([Ljava/lang/String;)V

    return-object v0

    .line 74
    :cond_4
    :goto_2
    sget-object p0, Lcom/tendcloud/tenddata/v;->d:Ljava/lang/String;

    const-string p1, "getValue faild by null"

    filled-new-array {p0, p1}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/tendcloud/tenddata/ca;->dForInternal([Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method private static a(Landroid/view/View;Ljava/lang/String;)V
    .locals 2

    if-eqz p0, :cond_0

    const v0, 0x54440001

    .line 14
    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 15
    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    .line 16
    check-cast p0, Landroid/view/ViewGroup;

    const/4 v0, 0x0

    .line 17
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 18
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 19
    invoke-static {v1, p1}, Lcom/tendcloud/tenddata/v;->a(Landroid/view/View;Ljava/lang/String;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private static a(Ljava/lang/Object;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 8
    check-cast p0, Landroidx/fragment/app/Fragment;

    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 10
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragment()Landroidx/fragment/app/Fragment;

    move-result-object p0

    :goto_0
    if-eqz p0, :cond_0

    .line 11
    const-string v0, "/"

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 13
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragment()Landroidx/fragment/app/Fragment;

    move-result-object p0

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static a(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x0

    .line 92
    :try_start_0
    invoke-static {}, Lcom/tendcloud/tenddata/f;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    instance-of p0, p0, Landroidx/fragment/app/Fragment;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :catchall_0
    :cond_0
    return v0
.end method

.method private static a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3

    .line 20
    const-string v0, "MainContentView"

    const/4 v1, 0x0

    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    .line 21
    :try_start_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    .line 22
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 23
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return p0

    :catchall_0
    :cond_0
    return v1
.end method

.method private static b(Ljava/lang/Object;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 6
    check-cast p0, Landroidx/fragment/app/Fragment;

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 8
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragment()Landroidx/fragment/app/Fragment;

    move-result-object p0

    :goto_0
    if-eqz p0, :cond_0

    .line 9
    const-string v0, "/"

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragment()Landroidx/fragment/app/Fragment;

    move-result-object p0

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static b(Landroid/view/View;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const/4 v0, 0x1

    .line 2
    :try_start_0
    const-string v1, "android.view.View"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    .line 3
    const-string v2, "isVisibleToUser"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 4
    invoke-virtual {v1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 5
    invoke-virtual {v1, p0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return p0

    :catchall_0
    return v0
.end method

.method public static b(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x0

    .line 12
    :try_start_0
    invoke-static {}, Lcom/tendcloud/tenddata/f;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    instance-of p0, p0, Landroidx/fragment/app/Fragment;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :catchall_0
    :cond_0
    return v0
.end method

.method public static c(Landroid/view/View;)Ljava/lang/String;
    .locals 9

    .line 8
    const-string v0, ""

    if-nez p0, :cond_0

    return-object v0

    .line 9
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0x20

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 10
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    :goto_0
    if-eqz p0, :cond_1

    .line 12
    instance-of v2, p0, Landroid/view/ViewGroup;

    if-eqz v2, :cond_1

    .line 13
    move-object v2, p0

    check-cast v2, Landroid/view/View;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 14
    invoke-interface {p0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    goto :goto_0

    .line 15
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result p0

    add-int/lit8 v2, p0, -0x1

    .line 16
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    .line 17
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    const-string v5, "DecorView"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 19
    const-string v4, "DecorView[0]/"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    :cond_2
    instance-of v4, v2, Landroid/view/ViewGroup;

    if-eqz v4, :cond_e

    .line 21
    check-cast v2, Landroid/view/ViewGroup;

    add-int/lit8 p0, p0, -0x2

    .line 22
    :goto_1
    const-string v4, "/"

    if-ltz p0, :cond_d

    .line 23
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/view/View;

    const v6, 0x54440002

    .line 24
    invoke-virtual {v5, v6}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v7

    if-eqz v7, :cond_3

    .line 25
    invoke-virtual {v5, v6}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    goto :goto_2

    .line 26
    :cond_3
    invoke-virtual {v5}, Landroid/view/View;->getId()I

    move-result v6

    const v7, 0x1020002

    if-ne v6, v7, :cond_4

    .line 27
    const-string v6, "MainContentView"

    goto :goto_2

    .line 28
    :cond_4
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v6

    .line 29
    :goto_2
    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v7

    .line 30
    invoke-static {}, Lcom/tendcloud/tenddata/f;->e()Z

    move-result v8

    if-eqz v8, :cond_5

    instance-of v8, v2, Landroidx/viewpager/widget/ViewPager;

    if-eqz v8, :cond_5

    .line 31
    check-cast v2, Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v2}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result v7

    goto :goto_4

    .line 32
    :cond_5
    invoke-static {}, Lcom/tendcloud/tenddata/f;->f()Z

    move-result v8

    if-eqz v8, :cond_6

    instance-of v8, v2, Landroidx/viewpager/widget/ViewPager;

    if-eqz v8, :cond_6

    .line 33
    check-cast v2, Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v2}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result v7

    goto :goto_4

    .line 34
    :cond_6
    instance-of v8, v2, Landroid/widget/AdapterView;

    if-eqz v8, :cond_7

    .line 35
    check-cast v2, Landroid/widget/AdapterView;

    invoke-virtual {v2, v5}, Landroid/widget/AdapterView;->getPositionForView(Landroid/view/View;)I

    move-result v7

    goto :goto_4

    .line 36
    :cond_7
    invoke-static {}, Lcom/tendcloud/tenddata/f;->a()Z

    move-result v8

    if-eqz v8, :cond_8

    instance-of v8, v2, Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v8, :cond_8

    .line 37
    check-cast v2, Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2, v5}, Landroidx/recyclerview/widget/RecyclerView;->getChildAdapterPosition(Landroid/view/View;)I

    move-result v2

    if-ltz v2, :cond_9

    goto :goto_3

    .line 38
    :cond_8
    invoke-static {}, Lcom/tendcloud/tenddata/f;->b()Z

    move-result v8

    if-eqz v8, :cond_9

    instance-of v8, v2, Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v8, :cond_9

    .line 39
    check-cast v2, Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2, v5}, Landroidx/recyclerview/widget/RecyclerView;->getChildAdapterPosition(Landroid/view/View;)I

    move-result v2

    if-ltz v2, :cond_9

    :goto_3
    move v7, v2

    .line 40
    :cond_9
    :goto_4
    :try_start_0
    invoke-virtual {v5}, Landroid/view/View;->getId()I

    move-result v2

    const/high16 v8, 0x7f000000

    if-le v2, v8, :cond_a

    const/4 v8, -0x1

    if-eq v2, v8, :cond_a

    .line 41
    invoke-virtual {v5}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v5}, Landroid/view/View;->getId()I

    move-result v8

    invoke-virtual {v2, v8}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_5

    :catch_0
    move-exception v2

    .line 42
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_a
    move-object v2, v0

    .line 43
    :goto_5
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "["

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, "]"

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 44
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_b

    .line 45
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "#"

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 46
    :cond_b
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    instance-of v2, v5, Landroid/view/ViewGroup;

    if-nez v2, :cond_c

    goto :goto_6

    .line 49
    :cond_c
    move-object v2, v5

    check-cast v2, Landroid/view/ViewGroup;

    add-int/lit8 p0, p0, -0x1

    goto/16 :goto_1

    .line 50
    :cond_d
    :goto_6
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->lastIndexOf(Ljava/lang/String;)I

    move-result p0

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    invoke-virtual {v3, p0, v0}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    .line 51
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_e
    return-object v0
.end method

.method private static c(Ljava/lang/Object;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    check-cast p0, Landroid/app/Fragment;

    .line 2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/16 v0, 0x11

    .line 3
    invoke-static {v0}, Lcom/tendcloud/tenddata/cq;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {p0}, Landroid/app/Fragment;->getParentFragment()Landroid/app/Fragment;

    move-result-object p0

    :goto_0
    if-eqz p0, :cond_0

    .line 5
    const-string v0, "/"

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 7
    invoke-virtual {p0}, Landroid/app/Fragment;->getParentFragment()Landroid/app/Fragment;

    move-result-object p0

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static d(Landroid/view/View;)Z
    .locals 1

    .line 1
    instance-of v0, p0, Landroid/widget/ListView;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    invoke-static {}, Lcom/tendcloud/tenddata/f;->a()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    instance-of v0, p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 12
    .line 13
    if-nez v0, :cond_2

    .line 14
    .line 15
    :cond_0
    invoke-static {}, Lcom/tendcloud/tenddata/f;->b()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    instance-of p0, p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 22
    .line 23
    if-eqz p0, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 p0, 0x0

    .line 27
    return p0

    .line 28
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 29
    return p0
.end method

.method public static e(Landroid/view/View;)Z
    .locals 0

    .line 1
    instance-of p0, p0, Landroid/webkit/WebView;

    .line 2
    .line 3
    return p0
.end method

.method public static f(Landroid/view/View;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    return v0

    .line 12
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    instance-of v2, v1, Landroid/widget/AdapterView;

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    if-eqz v2, :cond_3

    .line 20
    .line 21
    check-cast v1, Landroid/widget/AdapterView;

    .line 22
    .line 23
    invoke-virtual {v1}, Landroid/widget/AdapterView;->getOnItemClickListener()Landroid/widget/AdapterView$OnItemClickListener;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    if-eqz p0, :cond_2

    .line 28
    .line 29
    return v3

    .line 30
    :cond_2
    return v0

    .line 31
    :cond_3
    instance-of v2, p0, Landroid/widget/CompoundButton;

    .line 32
    .line 33
    if-eqz v2, :cond_5

    .line 34
    .line 35
    instance-of v0, p0, Landroid/widget/RadioButton;

    .line 36
    .line 37
    if-eqz v0, :cond_4

    .line 38
    .line 39
    instance-of v0, v1, Landroid/widget/RadioGroup;

    .line 40
    .line 41
    if-eqz v0, :cond_4

    .line 42
    .line 43
    check-cast v1, Landroid/view/View;

    .line 44
    .line 45
    invoke-static {v1}, Lcom/tendcloud/tenddata/v;->g(Landroid/view/View;)Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    return p0

    .line 50
    :cond_4
    invoke-static {p0}, Lcom/tendcloud/tenddata/v;->g(Landroid/view/View;)Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    return p0

    .line 55
    :cond_5
    const/16 v1, 0xf

    .line 56
    .line 57
    invoke-static {v1}, Lcom/tendcloud/tenddata/cq;->a(I)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_7

    .line 62
    .line 63
    invoke-virtual {p0}, Landroid/view/View;->isClickable()Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_6

    .line 68
    .line 69
    invoke-virtual {p0}, Landroid/view/View;->hasOnClickListeners()Z

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    if-eqz p0, :cond_6

    .line 74
    .line 75
    return v3

    .line 76
    :cond_6
    return v0

    .line 77
    :cond_7
    invoke-virtual {p0}, Landroid/view/View;->isClickable()Z

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    return p0
.end method

.method public static g(Landroid/view/View;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    :goto_0
    if-eqz v1, :cond_0

    .line 7
    .line 8
    const-class v2, Landroid/view/View;

    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    const-class v2, Landroid/widget/CompoundButton;

    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-nez v2, :cond_0

    .line 39
    .line 40
    const-class v2, Landroid/widget/RadioGroup;

    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-nez v2, :cond_0

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    goto :goto_0

    .line 61
    :cond_0
    const-string v2, "mOnCheckedChangeListener"

    .line 62
    .line 63
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    const/4 v2, 0x1

    .line 68
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    if-eqz p0, :cond_1

    .line 76
    .line 77
    return v2

    .line 78
    :catchall_0
    :cond_1
    return v0
.end method

.method public static trackFragment(Ljava/lang/Object;)V
    .locals 5

    .line 1
    invoke-static {p0}, Lcom/tendcloud/tenddata/v;->a(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    instance-of v0, p0, Landroid/app/Fragment;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-static {p0}, Lcom/tendcloud/tenddata/v;->b(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    invoke-static {p0}, Lcom/tendcloud/tenddata/v;->a(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    move-object v0, p0

    .line 25
    check-cast v0, Landroidx/fragment/app/Fragment;

    .line 26
    .line 27
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-static {p0}, Lcom/tendcloud/tenddata/v;->b(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    move-object v0, p0

    .line 39
    check-cast v0, Landroidx/fragment/app/Fragment;

    .line 40
    .line 41
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    goto :goto_0

    .line 46
    :cond_2
    move-object v0, p0

    .line 47
    check-cast v0, Landroid/app/Fragment;

    .line 48
    .line 49
    invoke-virtual {v0}, Landroid/app/Fragment;->getView()Landroid/view/View;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    :goto_0
    if-nez v0, :cond_3

    .line 54
    .line 55
    :goto_1
    return-void

    .line 56
    :cond_3
    new-instance v1, Ljava/util/ArrayList;

    .line 57
    .line 58
    const/16 v2, 0x10

    .line 59
    .line 60
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 61
    .line 62
    .line 63
    invoke-static {p0}, Lcom/tendcloud/tenddata/v;->a(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz v2, :cond_4

    .line 68
    .line 69
    invoke-static {p0, v1}, Lcom/tendcloud/tenddata/v;->a(Ljava/lang/Object;Ljava/util/List;)V

    .line 70
    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_4
    invoke-static {p0}, Lcom/tendcloud/tenddata/v;->b(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-eqz v2, :cond_5

    .line 78
    .line 79
    invoke-static {p0, v1}, Lcom/tendcloud/tenddata/v;->b(Ljava/lang/Object;Ljava/util/List;)V

    .line 80
    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_5
    invoke-static {p0, v1}, Lcom/tendcloud/tenddata/v;->c(Ljava/lang/Object;Ljava/util/List;)V

    .line 84
    .line 85
    .line 86
    :goto_2
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    add-int/lit8 v2, v2, -0x1

    .line 91
    .line 92
    const-string v3, ""

    .line 93
    .line 94
    :goto_3
    if-ltz v2, :cond_6

    .line 95
    .line 96
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    check-cast v4, Ljava/lang/String;

    .line 101
    .line 102
    invoke-virtual {v3, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    add-int/lit8 v2, v2, -0x1

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    const v2, 0x54440002

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, v2, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    new-instance v1, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 126
    .line 127
    .line 128
    const-string v2, "current fragment -> "

    .line 129
    .line 130
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    filled-new-array {p0}, [Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    invoke-static {p0}, Lcom/tendcloud/tenddata/ca;->dForInternal([Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-static {v0, v3}, Lcom/tendcloud/tenddata/v;->a(Landroid/view/View;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    return-void
.end method
