.class public final La5/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcoil3/d;)V
    .locals 5

    const/4 v0, 0x2

    iput v0, p0, La5/e;->a:I

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iget-object v0, p1, Lcoil3/d;->a:Ljava/util/List;

    .line 15
    invoke-static {v0}, Lkotlin/collections/t;->E0(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, La5/e;->b:Ljava/lang/Object;

    .line 16
    iget-object v0, p1, Lcoil3/d;->b:Ljava/util/List;

    .line 17
    invoke-static {v0}, Lkotlin/collections/t;->E0(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, La5/e;->d:Ljava/lang/Object;

    .line 18
    iget-object v0, p1, Lcoil3/d;->c:Ljava/util/List;

    .line 19
    invoke-static {v0}, Lkotlin/collections/t;->E0(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, La5/e;->e:Ljava/lang/Object;

    .line 20
    iget-object v0, p1, Lcoil3/d;->f:Ld6/e;

    invoke-interface {v0}, Ld6/e;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 21
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 22
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 23
    check-cast v2, Lkotlin/Pair;

    .line 24
    new-instance v3, Landroidx/navigation/b;

    const/4 v4, 0x3

    invoke-direct {v3, v2, v4}, Landroidx/navigation/b;-><init>(Ljava/lang/Object;I)V

    .line 25
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 26
    :cond_0
    iput-object v1, p0, La5/e;->f:Ljava/lang/Object;

    .line 27
    iget-object p1, p1, Lcoil3/d;->g:Ld6/e;

    invoke-interface {p1}, Ld6/e;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    .line 28
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 29
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 30
    check-cast v1, Lcoil3/decode/i;

    .line 31
    new-instance v2, Lcoil3/c;

    const/4 v3, 0x0

    invoke-direct {v2, v1, v3}, Lcoil3/c;-><init>(Lcoil3/decode/i;I)V

    .line 32
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 33
    :cond_1
    iput-object v0, p0, La5/e;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/zykj/mistake/activity/MainActivity;Lcom/zykj/mistake/activity/MainActivity;Lcom/zykj/mistake/activity/e;Lcom/zykj/mistake/activity/a;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, La5/e;->a:I

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, La5/e;->b:Ljava/lang/Object;

    .line 9
    iput-object p2, p0, La5/e;->d:Ljava/lang/Object;

    .line 10
    iput-object p3, p0, La5/e;->e:Ljava/lang/Object;

    .line 11
    iput-object p4, p0, La5/e;->f:Ljava/lang/Object;

    .line 12
    new-instance p1, Ljava/text/SimpleDateFormat;

    const-string p2, "yyyy-MM-dd"

    sget-object p3, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    invoke-direct {p1, p2, p3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    iput-object p1, p0, La5/e;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/zykj/mistake/activity/MainActivity;Lr6/c;Lcom/zykj/mistake/activity/c;Lcom/zykj/mistake/activity/f;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, La5/e;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, La5/e;->b:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, La5/e;->d:Ljava/lang/Object;

    .line 4
    iput-object p3, p0, La5/e;->e:Ljava/lang/Object;

    .line 5
    iput-object p4, p0, La5/e;->f:Ljava/lang/Object;

    .line 6
    new-instance p1, Ljava/text/SimpleDateFormat;

    const-string p2, "yyyy-MM-dd"

    sget-object p3, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    invoke-direct {p1, p2, p3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    iput-object p1, p0, La5/e;->c:Ljava/lang/Object;

    return-void
.end method

.method public static d(Landroid/view/View;)V
    .locals 4

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    :goto_0
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    :cond_0
    check-cast v0, Ljava/lang/String;

    .line 35
    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    const-string v0, ""

    .line 39
    .line 40
    :cond_1
    const-string v1, "header"

    .line 41
    .line 42
    const/4 v2, 0x1

    .line 43
    invoke-static {v0, v1, v2}, Lkotlin/text/p;->F(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-nez v1, :cond_4

    .line 48
    .line 49
    const-string v1, "date_picker_header"

    .line 50
    .line 51
    invoke-static {v0, v1, v2}, Lkotlin/text/p;->F(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-nez v1, :cond_4

    .line 56
    .line 57
    const-string v1, "datePickerHeader"

    .line 58
    .line 59
    invoke-static {v0, v1, v2}, Lkotlin/text/p;->F(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_2

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_2
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 67
    .line 68
    if-eqz v0, :cond_3

    .line 69
    .line 70
    check-cast p0, Landroid/view/ViewGroup;

    .line 71
    .line 72
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    const/4 v1, 0x0

    .line 77
    :goto_1
    if-ge v1, v0, :cond_3

    .line 78
    .line 79
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    const-string v3, "getChildAt(...)"

    .line 84
    .line 85
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-static {v2}, La5/e;->d(Landroid/view/View;)V

    .line 89
    .line 90
    .line 91
    add-int/lit8 v1, v1, 0x1

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_3
    return-void

    .line 95
    :cond_4
    :goto_2
    const/16 v0, 0x8

    .line 96
    .line 97
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 98
    .line 99
    .line 100
    return-void
.end method

.method public static e(Landroid/view/View;)V
    .locals 4

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    :goto_0
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    :cond_0
    check-cast v0, Ljava/lang/String;

    .line 35
    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    const-string v0, ""

    .line 39
    .line 40
    :cond_1
    const-string v1, "header"

    .line 41
    .line 42
    const/4 v2, 0x1

    .line 43
    invoke-static {v0, v1, v2}, Lkotlin/text/p;->F(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-nez v1, :cond_4

    .line 48
    .line 49
    const-string v1, "date_picker_header"

    .line 50
    .line 51
    invoke-static {v0, v1, v2}, Lkotlin/text/p;->F(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-nez v1, :cond_4

    .line 56
    .line 57
    const-string v1, "datePickerHeader"

    .line 58
    .line 59
    invoke-static {v0, v1, v2}, Lkotlin/text/p;->F(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_2

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_2
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 67
    .line 68
    if-eqz v0, :cond_3

    .line 69
    .line 70
    check-cast p0, Landroid/view/ViewGroup;

    .line 71
    .line 72
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    const/4 v1, 0x0

    .line 77
    :goto_1
    if-ge v1, v0, :cond_3

    .line 78
    .line 79
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    const-string v3, "getChildAt(...)"

    .line 84
    .line 85
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-static {v2}, La5/e;->e(Landroid/view/View;)V

    .line 89
    .line 90
    .line 91
    add-int/lit8 v1, v1, 0x1

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_3
    return-void

    .line 95
    :cond_4
    :goto_2
    const/16 v0, 0x8

    .line 96
    .line 97
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 98
    .line 99
    .line 100
    return-void
.end method


# virtual methods
.method public a(Ln/f;Lkotlin/jvm/internal/d;)V
    .locals 3

    .line 1
    iget-object v0, p0, La5/e;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    new-instance v1, Landroidx/navigation/e;

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    invoke-direct {v1, v2, p1, p2}, Landroidx/navigation/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public b(Lp/a;Lkotlin/jvm/internal/d;)V
    .locals 2

    .line 1
    iget-object v0, p0, La5/e;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    new-instance v1, Lkotlin/Pair;

    .line 6
    .line 7
    invoke-direct {v1, p1, p2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public c(Ljava/util/Calendar;)Landroid/widget/DatePicker;
    .locals 4

    .line 1
    iget v0, p0, La5/e;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/widget/DatePicker;

    .line 7
    .line 8
    iget-object v1, p0, La5/e;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lcom/zykj/mistake/activity/MainActivity;

    .line 11
    .line 12
    invoke-direct {v0, v1}, Landroid/widget/DatePicker;-><init>(Landroid/content/Context;)V

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-virtual {v0, v1}, Landroid/widget/DatePicker;->setCalendarViewShown(Z)V

    .line 17
    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v0, v2}, Landroid/widget/DatePicker;->setSpinnersShown(Z)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v1}, Ljava/util/Calendar;->get(I)I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    const/4 v2, 0x2

    .line 28
    invoke-virtual {p1, v2}, Ljava/util/Calendar;->get(I)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    const/4 v3, 0x5

    .line 33
    invoke-virtual {p1, v3}, Ljava/util/Calendar;->get(I)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    const/4 v3, 0x0

    .line 38
    invoke-virtual {v0, v1, v2, p1, v3}, Landroid/widget/DatePicker;->init(IIILandroid/widget/DatePicker$OnDateChangedListener;)V

    .line 39
    .line 40
    .line 41
    return-object v0

    .line 42
    :pswitch_0
    new-instance v0, Landroid/widget/DatePicker;

    .line 43
    .line 44
    iget-object v1, p0, La5/e;->b:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v1, Lcom/zykj/mistake/activity/MainActivity;

    .line 47
    .line 48
    invoke-direct {v0, v1}, Landroid/widget/DatePicker;-><init>(Landroid/content/Context;)V

    .line 49
    .line 50
    .line 51
    const/4 v1, 0x1

    .line 52
    invoke-virtual {v0, v1}, Landroid/widget/DatePicker;->setCalendarViewShown(Z)V

    .line 53
    .line 54
    .line 55
    const/4 v2, 0x0

    .line 56
    invoke-virtual {v0, v2}, Landroid/widget/DatePicker;->setSpinnersShown(Z)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, v1}, Ljava/util/Calendar;->get(I)I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    const/4 v2, 0x2

    .line 64
    invoke-virtual {p1, v2}, Ljava/util/Calendar;->get(I)I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    const/4 v3, 0x5

    .line 69
    invoke-virtual {p1, v3}, Ljava/util/Calendar;->get(I)I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    const/4 v3, 0x0

    .line 74
    invoke-virtual {v0, v1, v2, p1, v3}, Landroid/widget/DatePicker;->init(IIILandroid/widget/DatePicker$OnDateChangedListener;)V

    .line 75
    .line 76
    .line 77
    return-object v0

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public f(Lcom/zykj/mistake/platform/picker/CollectionDatePickerTarget;Ljava/lang/String;Ljava/lang/String;)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v0, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    iget-object v4, v1, La5/e;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v4, Ljava/text/SimpleDateFormat;

    .line 12
    .line 13
    iget-object v5, v1, La5/e;->b:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v6, v5

    .line 16
    check-cast v6, Lcom/zykj/mistake/activity/MainActivity;

    .line 17
    .line 18
    const-string v5, "target"

    .line 19
    .line 20
    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    invoke-virtual {v4, v0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-nez v0, :cond_0

    .line 34
    .line 35
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    :cond_0
    invoke-virtual {v5, v0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    :goto_0
    if-eqz v3, :cond_3

    .line 52
    .line 53
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v4, v3}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    if-nez v3, :cond_2

    .line 62
    .line 63
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-virtual {v3}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    :cond_2
    invoke-virtual {v0, v3}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_3
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    :goto_1
    new-instance v3, Landroid/app/Dialog;

    .line 80
    .line 81
    invoke-direct {v3, v6}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    .line 82
    .line 83
    .line 84
    new-instance v7, Landroid/widget/LinearLayout;

    .line 85
    .line 86
    invoke-direct {v7, v6}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 87
    .line 88
    .line 89
    const/4 v4, 0x1

    .line 90
    invoke-virtual {v7, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 91
    .line 92
    .line 93
    const/16 v4, 0x10

    .line 94
    .line 95
    const/16 v8, 0x18

    .line 96
    .line 97
    invoke-virtual {v7, v8, v8, v8, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 98
    .line 99
    .line 100
    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    .line 101
    .line 102
    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 103
    .line 104
    .line 105
    const/4 v8, -0x1

    .line 106
    invoke-virtual {v4, v8}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 107
    .line 108
    .line 109
    const/4 v9, 0x4

    .line 110
    int-to-float v10, v9

    .line 111
    invoke-virtual {v6}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    .line 112
    .line 113
    .line 114
    move-result-object v11

    .line 115
    invoke-virtual {v11}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 116
    .line 117
    .line 118
    move-result-object v11

    .line 119
    iget v11, v11, Landroid/util/DisplayMetrics;->density:F

    .line 120
    .line 121
    mul-float/2addr v10, v11

    .line 122
    float-to-int v10, v10

    .line 123
    int-to-float v10, v10

    .line 124
    invoke-virtual {v4, v10}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v7, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 128
    .line 129
    .line 130
    new-instance v10, Landroid/widget/LinearLayout;

    .line 131
    .line 132
    invoke-direct {v10, v6}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 133
    .line 134
    .line 135
    const/4 v11, 0x0

    .line 136
    invoke-virtual {v10, v11}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v10, v9}, Landroid/view/View;->setVisibility(I)V

    .line 140
    .line 141
    .line 142
    invoke-static {v5}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v1, v5}, La5/e;->c(Ljava/util/Calendar;)Landroid/widget/DatePicker;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v1, v0}, La5/e;->c(Ljava/util/Calendar;)Landroid/widget/DatePicker;

    .line 153
    .line 154
    .line 155
    move-result-object v5

    .line 156
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 157
    .line 158
    const/4 v9, -0x2

    .line 159
    const/high16 v12, 0x3f800000    # 1.0f

    .line 160
    .line 161
    invoke-direct {v0, v11, v9, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v10, v4, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 165
    .line 166
    .line 167
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 168
    .line 169
    invoke-direct {v0, v11, v9, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v10, v5, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 173
    .line 174
    .line 175
    new-instance v9, Landroid/widget/LinearLayout;

    .line 176
    .line 177
    invoke-direct {v9, v6}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v9, v11}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 181
    .line 182
    .line 183
    const/16 v0, 0x11

    .line 184
    .line 185
    invoke-virtual {v9, v0}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 186
    .line 187
    .line 188
    const/16 v12, 0xc

    .line 189
    .line 190
    invoke-virtual {v9, v11, v12, v11, v11}, Landroid/view/View;->setPadding(IIII)V

    .line 191
    .line 192
    .line 193
    new-instance v12, Landroid/widget/TextView;

    .line 194
    .line 195
    invoke-direct {v12, v6}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 196
    .line 197
    .line 198
    sget v13, Lcom/zykj/mistake/R$string;->reset:I

    .line 199
    .line 200
    invoke-virtual {v6, v13}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v13

    .line 204
    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v12, v0}, Landroid/widget/TextView;->setGravity(I)V

    .line 208
    .line 209
    .line 210
    const/high16 v13, 0x41600000    # 14.0f

    .line 211
    .line 212
    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setTextSize(F)V

    .line 213
    .line 214
    .line 215
    const-string v14, "#1576FF"

    .line 216
    .line 217
    invoke-static {v14}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 218
    .line 219
    .line 220
    move-result v14

    .line 221
    invoke-virtual {v12, v14}, Landroid/widget/TextView;->setTextColor(I)V

    .line 222
    .line 223
    .line 224
    sget v14, Lcom/zykj/mistake/R$drawable;->bg_filter_reset:I

    .line 225
    .line 226
    invoke-virtual {v12, v14}, Landroid/view/View;->setBackgroundResource(I)V

    .line 227
    .line 228
    .line 229
    new-instance v14, La5/a;

    .line 230
    .line 231
    invoke-direct {v14, v1, v2, v3}, La5/a;-><init>(La5/e;Lcom/zykj/mistake/platform/picker/CollectionDatePickerTarget;Landroid/app/Dialog;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v12, v14}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 235
    .line 236
    .line 237
    new-instance v14, Landroid/widget/TextView;

    .line 238
    .line 239
    invoke-direct {v14, v6}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 240
    .line 241
    .line 242
    sget v15, Lcom/zykj/mistake/R$string;->confirm:I

    .line 243
    .line 244
    invoke-virtual {v6, v15}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v15

    .line 248
    invoke-virtual {v14, v15}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v14, v0}, Landroid/widget/TextView;->setGravity(I)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v14, v13}, Landroid/widget/TextView;->setTextSize(F)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v14, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 258
    .line 259
    .line 260
    sget v0, Lcom/zykj/mistake/R$drawable;->bg_filter_confirm:I

    .line 261
    .line 262
    invoke-virtual {v14, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 263
    .line 264
    .line 265
    new-instance v0, La5/b;

    .line 266
    .line 267
    invoke-direct/range {v0 .. v5}, La5/b;-><init>(La5/e;Lcom/zykj/mistake/platform/picker/CollectionDatePickerTarget;Landroid/app/Dialog;Landroid/widget/DatePicker;Landroid/widget/DatePicker;)V

    .line 268
    .line 269
    .line 270
    move-object v2, v4

    .line 271
    invoke-virtual {v14, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 272
    .line 273
    .line 274
    const/16 v0, 0x66

    .line 275
    .line 276
    int-to-float v0, v0

    .line 277
    invoke-virtual {v6}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    .line 278
    .line 279
    .line 280
    move-result-object v1

    .line 281
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 282
    .line 283
    .line 284
    move-result-object v1

    .line 285
    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    .line 286
    .line 287
    mul-float/2addr v0, v1

    .line 288
    float-to-int v0, v0

    .line 289
    const/16 v1, 0x2a

    .line 290
    .line 291
    int-to-float v1, v1

    .line 292
    invoke-virtual {v6}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    .line 293
    .line 294
    .line 295
    move-result-object v4

    .line 296
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 297
    .line 298
    .line 299
    move-result-object v4

    .line 300
    iget v4, v4, Landroid/util/DisplayMetrics;->density:F

    .line 301
    .line 302
    mul-float/2addr v1, v4

    .line 303
    float-to-int v1, v1

    .line 304
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 305
    .line 306
    invoke-direct {v4, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v9, v12, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 310
    .line 311
    .line 312
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 313
    .line 314
    invoke-direct {v4, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 315
    .line 316
    .line 317
    const/16 v0, 0x38

    .line 318
    .line 319
    iput v0, v4, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 320
    .line 321
    invoke-virtual {v9, v14, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v7, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v7, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v3, v7}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v3}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    if-eqz v0, :cond_4

    .line 338
    .line 339
    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    .line 340
    .line 341
    invoke-direct {v1, v11}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 345
    .line 346
    .line 347
    :cond_4
    invoke-virtual {v3}, Landroid/app/Dialog;->show()V

    .line 348
    .line 349
    .line 350
    new-instance v4, La5/c;

    .line 351
    .line 352
    const/4 v0, 0x0

    .line 353
    invoke-direct {v4, v10, v0}, La5/c;-><init>(Landroid/widget/LinearLayout;I)V

    .line 354
    .line 355
    .line 356
    new-instance v0, La5/d;

    .line 357
    .line 358
    move-object v3, v5

    .line 359
    const/4 v5, 0x0

    .line 360
    move-object/from16 v1, p0

    .line 361
    .line 362
    invoke-direct/range {v0 .. v5}, La5/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v2, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 366
    .line 367
    .line 368
    return-void
.end method
