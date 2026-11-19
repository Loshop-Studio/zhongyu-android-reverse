.class public final Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;
.super Lcom/friday/lecture/widget/LifecycleFrameLayout;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$StatisticAdapter;,
        Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$TheDetailAdapter;,
        Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$a;,
        Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$TheTabAdapter;,
        Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$b;,
        Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$TheViewPagerAdapter;
    }
.end annotation


# instance fields
.field public d:Z

.field public e:Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$TheTabAdapter;

.field public f:Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$TheViewPagerAdapter;

.field public g:Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$TheDetailAdapter;

.field public h:Landroid/widget/TextView;

.field public i:Landroid/widget/TextView;

.field public j:Landroid/widget/TextView;

.field public k:Landroid/widget/TextView;

.field public l:Landroid/widget/TextView;

.field public m:Landroid/widget/TextView;

.field public n:Landroid/view/View;

.field public o:Landroidx/viewpager2/widget/ViewPager2;

.field public p:I

.field public final q:Ljava/util/LinkedHashMap;

.field public final r:Ljava/util/ArrayList;

.field public final s:Ljava/util/ArrayList;

.field public final t:Ljava/util/TreeSet;

.field public final u:Ljava/util/TreeSet;

.field public v:Landroid/view/View;

.field public w:Landroid/view/View;

.field public x:I

.field public y:Ljava/util/TreeSet;

.field public z:Lcom/friday/lecture/databinding/WindowViewObjectiveAnswerBinding;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/friday/lecture/widget/LifecycleFrameLayout;-><init>(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->t()V

    .line 10
    .line 11
    .line 12
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 13
    .line 14
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->q:Ljava/util/LinkedHashMap;

    .line 18
    .line 19
    new-instance p1, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->r:Ljava/util/ArrayList;

    .line 25
    .line 26
    new-instance p1, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->s:Ljava/util/ArrayList;

    .line 32
    .line 33
    new-instance p1, Ljava/util/TreeSet;

    .line 34
    .line 35
    invoke-direct {p1}, Ljava/util/TreeSet;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->t:Ljava/util/TreeSet;

    .line 39
    .line 40
    new-instance p1, Ljava/util/TreeSet;

    .line 41
    .line 42
    invoke-direct {p1}, Ljava/util/TreeSet;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->u:Ljava/util/TreeSet;

    .line 46
    .line 47
    const/4 p1, 0x1

    .line 48
    iput p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->x:I

    .line 49
    .line 50
    new-instance p1, Ljava/util/TreeSet;

    .line 51
    .line 52
    invoke-direct {p1}, Ljava/util/TreeSet;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->y:Ljava/util/TreeSet;

    .line 56
    .line 57
    return-void
.end method

.method public static final A(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 3

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->e:Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$TheTabAdapter;

    .line 10
    .line 11
    const-string p2, "theTabAdapter"

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    invoke-static {p2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    move-object p1, v0

    .line 20
    :cond_0
    invoke-virtual {p1, p3}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$b;

    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$b;->c()Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->e:Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$TheTabAdapter;

    .line 34
    .line 35
    if-nez p1, :cond_2

    .line 36
    .line 37
    invoke-static {p2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    move-object p1, v0

    .line 41
    :cond_2
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    check-cast p1, Ljava/lang/Iterable;

    .line 46
    .line 47
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    const/4 v2, 0x0

    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    check-cast v1, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$b;

    .line 63
    .line 64
    invoke-virtual {v1, v2}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$b;->d(Z)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->e:Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$TheTabAdapter;

    .line 69
    .line 70
    if-nez p1, :cond_4

    .line 71
    .line 72
    invoke-static {p2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    move-object p1, v0

    .line 76
    :cond_4
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    check-cast p1, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$b;

    .line 85
    .line 86
    const/4 v1, 0x1

    .line 87
    invoke-virtual {p1, v1}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$b;->d(Z)V

    .line 88
    .line 89
    .line 90
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->e:Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$TheTabAdapter;

    .line 91
    .line 92
    if-nez p1, :cond_5

    .line 93
    .line 94
    invoke-static {p2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    move-object p1, v0

    .line 98
    :cond_5
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 99
    .line 100
    .line 101
    iget-object p0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->o:Landroidx/viewpager2/widget/ViewPager2;

    .line 102
    .line 103
    if-nez p0, :cond_6

    .line 104
    .line 105
    const-string p0, "vpOptions"

    .line 106
    .line 107
    invoke-static {p0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    move-object p0, v0

    .line 111
    :cond_6
    invoke-virtual {p0, p3, v2}, Landroidx/viewpager2/widget/ViewPager2;->setCurrentItem(IZ)V

    .line 112
    .line 113
    .line 114
    const-string p0, "OptionDetail"

    .line 115
    .line 116
    const-class p1, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$a;

    .line 117
    .line 118
    invoke-static {p0, p1}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    invoke-interface {p0, v0}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    return-void
.end method

.method public static final B(Landroid/view/View;)V
    .locals 7

    .line 1
    const-class p0, Lcom/friday/common/entity/MqttEntity;

    .line 2
    .line 3
    invoke-static {p0}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    new-instance v0, Lcom/friday/common/entity/MqttEntity;

    .line 8
    .line 9
    sget-object v1, Lcom/friday/common/entity/MqttType;->END_CLASS:Lcom/friday/common/entity/MqttType;

    .line 10
    .line 11
    sget-object v6, Lcom/friday/lecture/model/ClassTestHelper;->INSTANCE:Lcom/friday/lecture/model/ClassTestHelper;

    .line 12
    .line 13
    invoke-virtual {v6}, Lcom/friday/lecture/model/ClassTestHelper;->getRecentlyHomework()Lcom/friday/common/classtest/MqttResponse;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    invoke-virtual {v2}, Lcom/friday/common/classtest/MqttResponse;->getGuid()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    if-nez v2, :cond_1

    .line 24
    .line 25
    :cond_0
    const-string v2, ""

    .line 26
    .line 27
    :cond_1
    const/4 v4, 0x4

    .line 28
    const/4 v5, 0x0

    .line 29
    const/4 v3, 0x0

    .line 30
    invoke-direct/range {v0 .. v5}, Lcom/friday/common/entity/MqttEntity;-><init>(Lcom/friday/common/entity/MqttType;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 31
    .line 32
    .line 33
    invoke-interface {p0, v0}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    sget-object p0, La3/c;->a:La3/c;

    .line 37
    .line 38
    invoke-virtual {p0}, La3/c;->g()V

    .line 39
    .line 40
    .line 41
    const/4 v0, 0x1

    .line 42
    invoke-virtual {p0, v0}, La3/c;->d(Z)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, La3/c;->h()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v6}, Lcom/friday/lecture/model/ClassTestHelper;->classEnd()V

    .line 49
    .line 50
    .line 51
    sget-object p0, Lcom/friday/lecture/floatwindow/options/a;->g:Lcom/friday/lecture/floatwindow/options/a$a;

    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/friday/lecture/floatwindow/options/a$a;->a()Lcom/friday/lecture/floatwindow/options/a;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-virtual {p0}, Lcom/friday/lecture/floatwindow/options/a;->k()V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public static final C(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;Landroid/view/View;)V
    .locals 5

    .line 1
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->s:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    move v2, v1

    .line 9
    :cond_0
    if-ge v2, v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    add-int/lit8 v2, v2, 0x1

    .line 16
    .line 17
    check-cast v3, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$b;

    .line 18
    .line 19
    invoke-virtual {v3}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$b;->b()Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    check-cast v3, Ljava/lang/Iterable;

    .line 24
    .line 25
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_0

    .line 34
    .line 35
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    check-cast v4, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$a;

    .line 40
    .line 41
    invoke-virtual {v4, v1}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$a;->d(Z)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    const-string p1, "OptionDetail"

    .line 46
    .line 47
    const-class v0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$a;

    .line 48
    .line 49
    invoke-static {p1, v0}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    const/4 v0, 0x0

    .line 54
    invoke-interface {p1, v0}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->f:Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$TheViewPagerAdapter;

    .line 58
    .line 59
    if-nez p1, :cond_2

    .line 60
    .line 61
    const-string p1, "theViewPagerAdapter"

    .line 62
    .line 63
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    move-object p1, v0

    .line 67
    :cond_2
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->s:Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-virtual {p1, v1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setList(Ljava/util/Collection;)V

    .line 70
    .line 71
    .line 72
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->l:Landroid/widget/TextView;

    .line 73
    .line 74
    if-eqz p1, :cond_3

    .line 75
    .line 76
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    sget v2, Lcom/friday/lecture/R$color;->colorPrimary:I

    .line 81
    .line 82
    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 87
    .line 88
    .line 89
    :cond_3
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->m:Landroid/widget/TextView;

    .line 90
    .line 91
    if-eqz p1, :cond_4

    .line 92
    .line 93
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    sget v2, Lcom/friday/lecture/R$color;->white:I

    .line 98
    .line 99
    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 104
    .line 105
    .line 106
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    sget v1, Lcom/friday/lecture/R$drawable;->selected_indicator:I

    .line 111
    .line 112
    invoke-static {p1, v1}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->l:Landroid/widget/TextView;

    .line 117
    .line 118
    if-eqz v1, :cond_5

    .line 119
    .line 120
    invoke-virtual {v1, v0, v0, v0, p1}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 121
    .line 122
    .line 123
    :cond_5
    iget-object p0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->m:Landroid/widget/TextView;

    .line 124
    .line 125
    if-eqz p0, :cond_6

    .line 126
    .line 127
    invoke-virtual {p0, v0, v0, v0, v0}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 128
    .line 129
    .line 130
    :cond_6
    return-void
.end method

.method public static final D(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;Landroid/view/View;)V
    .locals 5

    .line 1
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->r:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    move v2, v1

    .line 9
    :cond_0
    if-ge v2, v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    add-int/lit8 v2, v2, 0x1

    .line 16
    .line 17
    check-cast v3, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$b;

    .line 18
    .line 19
    invoke-virtual {v3}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$b;->b()Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    check-cast v3, Ljava/lang/Iterable;

    .line 24
    .line 25
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_0

    .line 34
    .line 35
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    check-cast v4, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$a;

    .line 40
    .line 41
    invoke-virtual {v4, v1}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$a;->d(Z)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    const-string p1, "OptionDetail"

    .line 46
    .line 47
    const-class v0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$a;

    .line 48
    .line 49
    invoke-static {p1, v0}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    const/4 v0, 0x0

    .line 54
    invoke-interface {p1, v0}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->f:Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$TheViewPagerAdapter;

    .line 58
    .line 59
    if-nez p1, :cond_2

    .line 60
    .line 61
    const-string p1, "theViewPagerAdapter"

    .line 62
    .line 63
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    move-object p1, v0

    .line 67
    :cond_2
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->r:Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-virtual {p1, v1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setList(Ljava/util/Collection;)V

    .line 70
    .line 71
    .line 72
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->m:Landroid/widget/TextView;

    .line 73
    .line 74
    if-eqz p1, :cond_3

    .line 75
    .line 76
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    sget v2, Lcom/friday/lecture/R$color;->colorPrimary:I

    .line 81
    .line 82
    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 87
    .line 88
    .line 89
    :cond_3
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->l:Landroid/widget/TextView;

    .line 90
    .line 91
    if-eqz p1, :cond_4

    .line 92
    .line 93
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    sget v2, Lcom/friday/lecture/R$color;->white:I

    .line 98
    .line 99
    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 104
    .line 105
    .line 106
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    sget v1, Lcom/friday/lecture/R$drawable;->selected_indicator:I

    .line 111
    .line 112
    invoke-static {p1, v1}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->m:Landroid/widget/TextView;

    .line 117
    .line 118
    if-eqz v1, :cond_5

    .line 119
    .line 120
    invoke-virtual {v1, v0, v0, v0, p1}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 121
    .line 122
    .line 123
    :cond_5
    iget-object p0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->l:Landroid/widget/TextView;

    .line 124
    .line 125
    if-eqz p0, :cond_6

    .line 126
    .line 127
    invoke-virtual {p0, v0, v0, v0, v0}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 128
    .line 129
    .line 130
    :cond_6
    return-void
.end method

.method public static final E(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;Landroid/view/View;)V
    .locals 6

    .line 1
    const-class p1, Lcom/friday/common/entity/MqttEntity;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    new-instance v0, Lcom/friday/common/entity/MqttEntity;

    .line 8
    .line 9
    sget-object v1, Lcom/friday/common/entity/MqttType;->TIME_UP:Lcom/friday/common/entity/MqttType;

    .line 10
    .line 11
    const/4 v4, 0x4

    .line 12
    const/4 v5, 0x0

    .line 13
    const-string v2, ""

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-direct/range {v0 .. v5}, Lcom/friday/common/entity/MqttEntity;-><init>(Lcom/friday/common/entity/MqttType;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 17
    .line 18
    .line 19
    invoke-interface {p1, v0}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->G()V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public static final F(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$a;)V
    .locals 2

    .line 1
    const-string v0, "theDetailAdapter"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p4, :cond_1

    .line 5
    .line 6
    iget-object p0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->g:Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$TheDetailAdapter;

    .line 7
    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object v1, p0

    .line 15
    :goto_0
    invoke-virtual {p4}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$a;->b()Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Ljava/util/Collection;

    .line 20
    .line 21
    invoke-virtual {v1, p0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setList(Ljava/util/Collection;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p4}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$a;->b()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p4}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$a;->a()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    new-instance p1, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 46
    .line 47
    .line 48
    const-string p4, "\u9009\u62e9 "

    .line 49
    .line 50
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string p0, " \u7684\u5b66\u751f"

    .line 57
    .line 58
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-virtual {p2, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 66
    .line 67
    .line 68
    const/16 p0, 0x8

    .line 69
    .line 70
    invoke-virtual {p3, p0}, Landroid/view/View;->setVisibility(I)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_1
    const/4 p1, 0x0

    .line 75
    invoke-virtual {p3, p1}, Landroid/view/View;->setVisibility(I)V

    .line 76
    .line 77
    .line 78
    iget-object p0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->g:Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$TheDetailAdapter;

    .line 79
    .line 80
    if-nez p0, :cond_2

    .line 81
    .line 82
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    move-object p0, v1

    .line 86
    :cond_2
    invoke-virtual {p0, v1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setList(Ljava/util/Collection;)V

    .line 87
    .line 88
    .line 89
    return-void
.end method

.method public static final H(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->r:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->s:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 11
    .line 12
    .line 13
    iget v1, v0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->p:I

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    move v3, v2

    .line 17
    :goto_0
    if-ge v3, v1, :cond_f

    .line 18
    .line 19
    new-instance v4, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    iget-object v5, v0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->u:Ljava/util/TreeSet;

    .line 25
    .line 26
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    const-string v7, "<get-value>(...)"

    .line 35
    .line 36
    const-string v8, "next(...)"

    .line 37
    .line 38
    if-eqz v6, :cond_5

    .line 39
    .line 40
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    move-object v10, v6

    .line 45
    check-cast v10, Ljava/lang/String;

    .line 46
    .line 47
    iget-object v6, v0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->q:Ljava/util/LinkedHashMap;

    .line 48
    .line 49
    invoke-virtual {v6}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    new-instance v11, Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 60
    .line 61
    .line 62
    :cond_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v9

    .line 66
    if-eqz v9, :cond_4

    .line 67
    .line 68
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v9

    .line 72
    invoke-static {v9, v8}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    check-cast v9, Ljava/util/Map$Entry;

    .line 76
    .line 77
    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v12

    .line 81
    invoke-static {v12, v7}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    check-cast v12, Ljava/lang/Iterable;

    .line 85
    .line 86
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object v12

    .line 90
    move v13, v2

    .line 91
    :goto_2
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v14

    .line 95
    if-eqz v14, :cond_0

    .line 96
    .line 97
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v14

    .line 101
    add-int/lit8 v15, v13, 0x1

    .line 102
    .line 103
    if-gez v13, :cond_1

    .line 104
    .line 105
    invoke-static {}, Lrc/w;->w()V

    .line 106
    .line 107
    .line 108
    :cond_1
    check-cast v14, Ljava/lang/String;

    .line 109
    .line 110
    if-ne v13, v3, :cond_2

    .line 111
    .line 112
    const/4 v13, 0x2

    .line 113
    move/from16 v16, v1

    .line 114
    .line 115
    const/4 v1, 0x0

    .line 116
    invoke-static {v14, v10, v2, v13, v1}, Lqd/c0;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    if-eqz v1, :cond_3

    .line 121
    .line 122
    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_2
    move/from16 v16, v1

    .line 131
    .line 132
    :cond_3
    :goto_3
    move v13, v15

    .line 133
    move/from16 v1, v16

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_4
    move/from16 v16, v1

    .line 137
    .line 138
    new-instance v9, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$a;

    .line 139
    .line 140
    const/4 v13, 0x4

    .line 141
    const/4 v14, 0x0

    .line 142
    const/4 v12, 0x0

    .line 143
    invoke-direct/range {v9 .. v14}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$a;-><init>(Ljava/lang/String;Ljava/util/List;ZILkotlin/jvm/internal/n;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_5
    move/from16 v16, v1

    .line 151
    .line 152
    new-instance v1, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$b;

    .line 153
    .line 154
    add-int/lit8 v5, v3, 0x1

    .line 155
    .line 156
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    invoke-direct {v1, v6, v2, v4}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$b;-><init>(Ljava/lang/String;ZLjava/util/List;)V

    .line 161
    .line 162
    .line 163
    iget-object v4, v0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->s:Ljava/util/ArrayList;

    .line 164
    .line 165
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    new-instance v1, Ljava/util/ArrayList;

    .line 169
    .line 170
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 171
    .line 172
    .line 173
    iget-object v4, v0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->t:Ljava/util/TreeSet;

    .line 174
    .line 175
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    :cond_6
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 180
    .line 181
    .line 182
    move-result v6

    .line 183
    if-eqz v6, :cond_e

    .line 184
    .line 185
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v6

    .line 189
    check-cast v6, Ljava/lang/String;

    .line 190
    .line 191
    iget-object v9, v0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->q:Ljava/util/LinkedHashMap;

    .line 192
    .line 193
    invoke-virtual {v9}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 194
    .line 195
    .line 196
    move-result-object v9

    .line 197
    invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 198
    .line 199
    .line 200
    move-result-object v9

    .line 201
    new-instance v12, Ljava/util/ArrayList;

    .line 202
    .line 203
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 204
    .line 205
    .line 206
    :cond_7
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 207
    .line 208
    .line 209
    move-result v10

    .line 210
    if-eqz v10, :cond_a

    .line 211
    .line 212
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v10

    .line 216
    invoke-static {v10, v8}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    check-cast v10, Ljava/util/Map$Entry;

    .line 220
    .line 221
    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v11

    .line 225
    invoke-static {v11, v7}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    check-cast v11, Ljava/lang/Iterable;

    .line 229
    .line 230
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 231
    .line 232
    .line 233
    move-result-object v11

    .line 234
    move v13, v2

    .line 235
    :goto_5
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 236
    .line 237
    .line 238
    move-result v14

    .line 239
    if-eqz v14, :cond_7

    .line 240
    .line 241
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v14

    .line 245
    add-int/lit8 v15, v13, 0x1

    .line 246
    .line 247
    if-gez v13, :cond_8

    .line 248
    .line 249
    invoke-static {}, Lrc/w;->w()V

    .line 250
    .line 251
    .line 252
    :cond_8
    check-cast v14, Ljava/lang/String;

    .line 253
    .line 254
    if-ne v13, v3, :cond_9

    .line 255
    .line 256
    invoke-static {v14, v6}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    move-result v13

    .line 260
    if-eqz v13, :cond_9

    .line 261
    .line 262
    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v13

    .line 266
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    :cond_9
    move v13, v15

    .line 270
    goto :goto_5

    .line 271
    :cond_a
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 272
    .line 273
    .line 274
    move-result v9

    .line 275
    const/4 v10, 0x4

    .line 276
    if-le v9, v10, :cond_d

    .line 277
    .line 278
    new-instance v9, Ljava/lang/StringBuffer;

    .line 279
    .line 280
    invoke-direct {v9}, Ljava/lang/StringBuffer;-><init>()V

    .line 281
    .line 282
    .line 283
    move v10, v2

    .line 284
    move v11, v10

    .line 285
    :goto_6
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    .line 286
    .line 287
    .line 288
    move-result v13

    .line 289
    if-ge v10, v13, :cond_c

    .line 290
    .line 291
    invoke-interface {v6, v10}, Ljava/lang/CharSequence;->charAt(I)C

    .line 292
    .line 293
    .line 294
    move-result v13

    .line 295
    add-int/lit8 v14, v11, 0x1

    .line 296
    .line 297
    const/4 v15, 0x3

    .line 298
    if-ne v11, v15, :cond_b

    .line 299
    .line 300
    invoke-virtual {v9, v13}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 301
    .line 302
    .line 303
    const-string v11, "\n"

    .line 304
    .line 305
    invoke-virtual {v9, v11}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 306
    .line 307
    .line 308
    goto :goto_7

    .line 309
    :cond_b
    invoke-virtual {v9, v13}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 310
    .line 311
    .line 312
    :goto_7
    add-int/lit8 v10, v10, 0x1

    .line 313
    .line 314
    move v11, v14

    .line 315
    goto :goto_6

    .line 316
    :cond_c
    invoke-virtual {v9}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v6

    .line 320
    :cond_d
    move-object v11, v6

    .line 321
    invoke-static {v11}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 325
    .line 326
    .line 327
    move-result v6

    .line 328
    if-lez v6, :cond_6

    .line 329
    .line 330
    new-instance v10, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$a;

    .line 331
    .line 332
    const/4 v14, 0x4

    .line 333
    const/4 v15, 0x0

    .line 334
    const/4 v13, 0x0

    .line 335
    invoke-direct/range {v10 .. v15}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$a;-><init>(Ljava/lang/String;Ljava/util/List;ZILkotlin/jvm/internal/n;)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    goto/16 :goto_4

    .line 342
    .line 343
    :cond_e
    new-instance v3, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$b;

    .line 344
    .line 345
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v4

    .line 349
    invoke-direct {v3, v4, v2, v1}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$b;-><init>(Ljava/lang/String;ZLjava/util/List;)V

    .line 350
    .line 351
    .line 352
    iget-object v1, v0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->r:Ljava/util/ArrayList;

    .line 353
    .line 354
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    move v3, v5

    .line 358
    move/from16 v1, v16

    .line 359
    .line 360
    goto/16 :goto_0

    .line 361
    .line 362
    :cond_f
    new-instance v1, Li3/e;

    .line 363
    .line 364
    invoke-direct {v1, v0}, Li3/e;-><init>(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;)V

    .line 365
    .line 366
    .line 367
    invoke-static {v1}, Lcom/blankj/utilcode/util/ThreadUtils;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 368
    .line 369
    .line 370
    return-void
.end method

.method public static final I(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->s:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->s:Ljava/util/ArrayList;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$b;

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-virtual {v0, v1}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$b;->d(Z)V

    .line 23
    .line 24
    .line 25
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->e:Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$TheTabAdapter;

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    if-nez v0, :cond_2

    .line 29
    .line 30
    const-string v0, "theTabAdapter"

    .line 31
    .line 32
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    move-object v0, v1

    .line 36
    :cond_2
    iget-object v2, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->s:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {v0, v2}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setList(Ljava/util/Collection;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->f:Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$TheViewPagerAdapter;

    .line 42
    .line 43
    if-nez v0, :cond_3

    .line 44
    .line 45
    const-string v0, "theViewPagerAdapter"

    .line 46
    .line 47
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_3
    move-object v1, v0

    .line 52
    :goto_1
    iget-object p0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->s:Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-virtual {v1, p0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setList(Ljava/util/Collection;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public static synthetic d(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$a;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->F(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$a;)V

    return-void
.end method

.method public static synthetic e(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->x(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic f(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->B(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic g(Landroid/view/View;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->v(Landroid/view/View;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic h(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->A(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V

    return-void
.end method

.method public static synthetic i(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->I(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;)V

    return-void
.end method

.method public static synthetic j(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->E(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic k(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->y(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic l(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->w(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic m(Landroid/view/View;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->u(Landroid/view/View;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic n(Landroid/view/View;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->z(Landroid/view/View;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic o(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->C(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic p(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->H(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;)V

    return-void
.end method

.method public static synthetic q(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->D(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic r(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;)Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$TheViewPagerAdapter;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->f:Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$TheViewPagerAdapter;

    .line 2
    .line 3
    return-object p0
.end method

.method private final t()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sget v2, Lcom/friday/lecture/R$layout;->window_view_objective_answer:I

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-static {v1, v2, v3}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v1}, Lcom/friday/lecture/databinding/WindowViewObjectiveAnswerBinding;->a(Landroid/view/View;)Lcom/friday/lecture/databinding/WindowViewObjectiveAnswerBinding;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v2, "bind(...)"

    .line 22
    .line 23
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iput-object v1, v0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->z:Lcom/friday/lecture/databinding/WindowViewObjectiveAnswerBinding;

    .line 27
    .line 28
    sget v1, Lcom/friday/lecture/R$id;->before:I

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iput-object v1, v0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->v:Landroid/view/View;

    .line 35
    .line 36
    sget v1, Lcom/friday/lecture/R$id;->statistics:I

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    iput-object v1, v0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->w:Landroid/view/View;

    .line 43
    .line 44
    sget v1, Lcom/friday/lecture/R$id;->iv_close:I

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, Landroid/widget/ImageView;

    .line 51
    .line 52
    sget v2, Lcom/friday/lecture/R$id;->tv_submit_count_before:I

    .line 53
    .line 54
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    check-cast v2, Landroid/widget/TextView;

    .line 59
    .line 60
    iput-object v2, v0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->h:Landroid/widget/TextView;

    .line 61
    .line 62
    sget v2, Lcom/friday/lecture/R$id;->tv_end_class_before:I

    .line 63
    .line 64
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    check-cast v2, Landroid/widget/TextView;

    .line 69
    .line 70
    iput-object v2, v0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->j:Landroid/widget/TextView;

    .line 71
    .line 72
    sget v2, Lcom/friday/lecture/R$id;->tv_time_up_before:I

    .line 73
    .line 74
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    check-cast v2, Landroid/widget/TextView;

    .line 79
    .line 80
    iput-object v2, v0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->k:Landroid/widget/TextView;

    .line 81
    .line 82
    sget v2, Lcom/friday/lecture/R$id;->tv_end_class_cancel:I

    .line 83
    .line 84
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    sget v4, Lcom/friday/lecture/R$id;->tv_end_class_ensure:I

    .line 89
    .line 90
    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    sget v5, Lcom/friday/lecture/R$id;->tv_time_up_ensure:I

    .line 95
    .line 96
    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    sget v6, Lcom/friday/lecture/R$id;->tv_time_up_cancel:I

    .line 101
    .line 102
    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    sget v7, Lcom/friday/lecture/R$id;->layout_end_class:I

    .line 107
    .line 108
    invoke-virtual {v0, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    sget v8, Lcom/friday/lecture/R$id;->layout_time_up:I

    .line 113
    .line 114
    invoke-virtual {v0, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 115
    .line 116
    .line 117
    move-result-object v8

    .line 118
    const-string v9, "findViewById(...)"

    .line 119
    .line 120
    invoke-static {v8, v9}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    iput-object v8, v0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->n:Landroid/view/View;

    .line 124
    .line 125
    sget v8, Lcom/friday/lecture/R$id;->tv_submit_count_statistic:I

    .line 126
    .line 127
    invoke-virtual {v0, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 128
    .line 129
    .line 130
    move-result-object v8

    .line 131
    check-cast v8, Landroid/widget/TextView;

    .line 132
    .line 133
    iput-object v8, v0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->i:Landroid/widget/TextView;

    .line 134
    .line 135
    sget v8, Lcom/friday/lecture/R$id;->vp_options:I

    .line 136
    .line 137
    invoke-virtual {v0, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 138
    .line 139
    .line 140
    move-result-object v8

    .line 141
    invoke-static {v8, v9}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    check-cast v8, Landroidx/viewpager2/widget/ViewPager2;

    .line 145
    .line 146
    iput-object v8, v0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->o:Landroidx/viewpager2/widget/ViewPager2;

    .line 147
    .line 148
    sget v8, Lcom/friday/lecture/R$id;->rv_option_detail:I

    .line 149
    .line 150
    invoke-virtual {v0, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 151
    .line 152
    .line 153
    move-result-object v8

    .line 154
    check-cast v8, Landroidx/recyclerview/widget/RecyclerView;

    .line 155
    .line 156
    sget v9, Lcom/friday/lecture/R$id;->rv_question:I

    .line 157
    .line 158
    invoke-virtual {v0, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 159
    .line 160
    .line 161
    move-result-object v9

    .line 162
    check-cast v9, Landroidx/recyclerview/widget/RecyclerView;

    .line 163
    .line 164
    sget v10, Lcom/friday/lecture/R$id;->tv_selection_list:I

    .line 165
    .line 166
    invoke-virtual {v0, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 167
    .line 168
    .line 169
    move-result-object v10

    .line 170
    check-cast v10, Landroid/widget/TextView;

    .line 171
    .line 172
    iput-object v10, v0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->l:Landroid/widget/TextView;

    .line 173
    .line 174
    sget v10, Lcom/friday/lecture/R$id;->tv_answer_list:I

    .line 175
    .line 176
    invoke-virtual {v0, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 177
    .line 178
    .line 179
    move-result-object v10

    .line 180
    check-cast v10, Landroid/widget/TextView;

    .line 181
    .line 182
    iput-object v10, v0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->m:Landroid/widget/TextView;

    .line 183
    .line 184
    iget-object v10, v0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->j:Landroid/widget/TextView;

    .line 185
    .line 186
    if-eqz v10, :cond_0

    .line 187
    .line 188
    new-instance v11, Li3/f;

    .line 189
    .line 190
    invoke-direct {v11, v7}, Li3/f;-><init>(Landroid/view/View;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v10, v11}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 194
    .line 195
    .line 196
    :cond_0
    new-instance v10, Li3/h;

    .line 197
    .line 198
    invoke-direct {v10, v7}, Li3/h;-><init>(Landroid/view/View;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v2, v10}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 202
    .line 203
    .line 204
    new-instance v2, Li3/i;

    .line 205
    .line 206
    invoke-direct {v2}, Li3/i;-><init>()V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v4, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 210
    .line 211
    .line 212
    iget-object v2, v0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->l:Landroid/widget/TextView;

    .line 213
    .line 214
    if-eqz v2, :cond_1

    .line 215
    .line 216
    new-instance v4, Li3/j;

    .line 217
    .line 218
    invoke-direct {v4, v0}, Li3/j;-><init>(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v2, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 222
    .line 223
    .line 224
    :cond_1
    iget-object v2, v0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->m:Landroid/widget/TextView;

    .line 225
    .line 226
    if-eqz v2, :cond_2

    .line 227
    .line 228
    new-instance v4, Li3/k;

    .line 229
    .line 230
    invoke-direct {v4, v0}, Li3/k;-><init>(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v2, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 234
    .line 235
    .line 236
    :cond_2
    new-instance v2, Li3/l;

    .line 237
    .line 238
    invoke-direct {v2, v0}, Li3/l;-><init>(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v5, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 242
    .line 243
    .line 244
    new-instance v2, Li3/m;

    .line 245
    .line 246
    invoke-direct {v2, v0}, Li3/m;-><init>(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v6, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 250
    .line 251
    .line 252
    new-instance v2, Li3/n;

    .line 253
    .line 254
    invoke-direct {v2}, Li3/n;-><init>()V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 258
    .line 259
    .line 260
    iget-object v1, v0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->k:Landroid/widget/TextView;

    .line 261
    .line 262
    if-eqz v1, :cond_3

    .line 263
    .line 264
    new-instance v2, Li3/b;

    .line 265
    .line 266
    invoke-direct {v2, v0}, Li3/b;-><init>(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 270
    .line 271
    .line 272
    :cond_3
    sget v1, Lcom/friday/lecture/R$id;->tv_end_class_statistic:I

    .line 273
    .line 274
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    check-cast v1, Landroid/widget/TextView;

    .line 279
    .line 280
    new-instance v2, Li3/c;

    .line 281
    .line 282
    invoke-direct {v2, v7}, Li3/c;-><init>(Landroid/view/View;)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 286
    .line 287
    .line 288
    new-instance v1, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 289
    .line 290
    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 291
    .line 292
    .line 293
    move-result-object v2

    .line 294
    const/4 v4, 0x2

    .line 295
    invoke-direct {v1, v2, v4}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v8, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 299
    .line 300
    .line 301
    new-instance v10, Lcom/friday/common/helper/GridSpacingItemDecoration;

    .line 302
    .line 303
    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    sget v2, Lcom/friday/lecture/R$dimen;->view_10:I

    .line 312
    .line 313
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    .line 314
    .line 315
    .line 316
    move-result v1

    .line 317
    float-to-int v12, v1

    .line 318
    const/16 v15, 0x8

    .line 319
    .line 320
    const/16 v16, 0x0

    .line 321
    .line 322
    const/4 v11, 0x2

    .line 323
    const/4 v13, 0x0

    .line 324
    const/4 v14, 0x0

    .line 325
    invoke-direct/range {v10 .. v16}, Lcom/friday/common/helper/GridSpacingItemDecoration;-><init>(IIZZILkotlin/jvm/internal/n;)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v8, v10}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 329
    .line 330
    .line 331
    new-instance v1, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$TheDetailAdapter;

    .line 332
    .line 333
    invoke-direct {v1}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$TheDetailAdapter;-><init>()V

    .line 334
    .line 335
    .line 336
    iput-object v1, v0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->g:Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$TheDetailAdapter;

    .line 337
    .line 338
    invoke-virtual {v8, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 339
    .line 340
    .line 341
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 342
    .line 343
    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 344
    .line 345
    .line 346
    move-result-object v2

    .line 347
    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {v9, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 351
    .line 352
    .line 353
    new-instance v1, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$initView$12$1;

    .line 354
    .line 355
    invoke-direct {v1, v9}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$initView$12$1;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 356
    .line 357
    .line 358
    invoke-virtual {v9, v1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 359
    .line 360
    .line 361
    new-instance v1, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$TheTabAdapter;

    .line 362
    .line 363
    invoke-direct {v1}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$TheTabAdapter;-><init>()V

    .line 364
    .line 365
    .line 366
    iput-object v1, v0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->e:Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$TheTabAdapter;

    .line 367
    .line 368
    invoke-virtual {v9, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 369
    .line 370
    .line 371
    iget-object v1, v0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->e:Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$TheTabAdapter;

    .line 372
    .line 373
    if-nez v1, :cond_4

    .line 374
    .line 375
    const-string v1, "theTabAdapter"

    .line 376
    .line 377
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 378
    .line 379
    .line 380
    move-object v1, v3

    .line 381
    :cond_4
    new-instance v2, Li3/g;

    .line 382
    .line 383
    invoke-direct {v2, v0}, Li3/g;-><init>(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v1, v2}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setOnItemClickListener(Lo1/d;)V

    .line 387
    .line 388
    .line 389
    iget-object v1, v0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->o:Landroidx/viewpager2/widget/ViewPager2;

    .line 390
    .line 391
    if-nez v1, :cond_5

    .line 392
    .line 393
    const-string v1, "vpOptions"

    .line 394
    .line 395
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 396
    .line 397
    .line 398
    move-object v1, v3

    .line 399
    :cond_5
    new-instance v2, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$TheViewPagerAdapter;

    .line 400
    .line 401
    invoke-direct {v2}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$TheViewPagerAdapter;-><init>()V

    .line 402
    .line 403
    .line 404
    iput-object v2, v0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->f:Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$TheViewPagerAdapter;

    .line 405
    .line 406
    const/4 v2, 0x0

    .line 407
    invoke-virtual {v1, v2}, Landroidx/viewpager2/widget/ViewPager2;->setUserInputEnabled(Z)V

    .line 408
    .line 409
    .line 410
    const/4 v4, 0x1

    .line 411
    invoke-virtual {v1, v4}, Landroidx/viewpager2/widget/ViewPager2;->setOrientation(I)V

    .line 412
    .line 413
    .line 414
    iget-object v4, v0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->f:Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$TheViewPagerAdapter;

    .line 415
    .line 416
    if-nez v4, :cond_6

    .line 417
    .line 418
    const-string v4, "theViewPagerAdapter"

    .line 419
    .line 420
    invoke-static {v4}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 421
    .line 422
    .line 423
    goto :goto_0

    .line 424
    :cond_6
    move-object v3, v4

    .line 425
    :goto_0
    invoke-virtual {v1, v3}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 426
    .line 427
    .line 428
    new-instance v3, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$initView$13$1;

    .line 429
    .line 430
    invoke-direct {v3, v0}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$initView$13$1;-><init>(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;)V

    .line 431
    .line 432
    .line 433
    invoke-virtual {v1, v3}, Landroidx/viewpager2/widget/ViewPager2;->registerOnPageChangeCallback(Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;)V

    .line 434
    .line 435
    .line 436
    iget-object v1, v0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->k:Landroid/widget/TextView;

    .line 437
    .line 438
    if-eqz v1, :cond_7

    .line 439
    .line 440
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 441
    .line 442
    .line 443
    :cond_7
    return-void
.end method

.method public static final u(Landroid/view/View;Landroid/view/View;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public static final v(Landroid/view/View;Landroid/view/View;)V
    .locals 0

    .line 1
    const/16 p1, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static final w(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->n:Landroid/view/View;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const-string p0, "layoutTimeUp"

    .line 6
    .line 7
    invoke-static {p0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    :cond_0
    const/16 p1, 0x8

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static final x(Landroid/view/View;)V
    .locals 0

    .line 1
    sget-object p0, Ld3/a;->a:Ld3/a;

    .line 2
    .line 3
    invoke-virtual {p0}, Ld3/a;->a()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static final y(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->n:Landroid/view/View;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const-string p0, "layoutTimeUp"

    .line 6
    .line 7
    invoke-static {p0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static final z(Landroid/view/View;Landroid/view/View;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public final G()V
    .locals 4

    .line 1
    sget-object v0, Lcom/friday/lecture/model/ClassTestHelper;->INSTANCE:Lcom/friday/lecture/model/ClassTestHelper;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/friday/lecture/model/ClassTestHelper;->timeUp()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->d:Z

    .line 8
    .line 9
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->n:Landroid/view/View;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const-string v0, "layoutTimeUp"

    .line 14
    .line 15
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    :cond_0
    const/16 v1, 0x8

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->v:Landroid/view/View;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    const/4 v1, 0x4

    .line 29
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 30
    .line 31
    .line 32
    :cond_1
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->w:Landroid/view/View;

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 38
    .line 39
    .line 40
    :cond_2
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->i:Landroid/widget/TextView;

    .line 41
    .line 42
    if-eqz v0, :cond_3

    .line 43
    .line 44
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->q:Ljava/util/LinkedHashMap;

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/util/AbstractMap;->size()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    new-instance v2, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 53
    .line 54
    .line 55
    const-string v3, "\u9009\u62e9\u9898\u7edf\u8ba1     \u5df2\u63d0\u4ea4:    "

    .line 56
    .line 57
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 68
    .line 69
    .line 70
    :cond_3
    new-instance v0, Ljava/lang/Thread;

    .line 71
    .line 72
    new-instance v1, Li3/d;

    .line 73
    .line 74
    invoke-direct {v1, p0}, Li3/d;-><init>(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;)V

    .line 75
    .line 76
    .line 77
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public c()Landroidx/lifecycle/LifecycleRegistry;
    .locals 1

    .line 1
    new-instance v0, Landroidx/lifecycle/LifecycleRegistry;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroidx/lifecycle/LifecycleRegistry;-><init>(Landroidx/lifecycle/LifecycleOwner;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public onAttachedToWindow()V
    .locals 5

    .line 1
    invoke-super {p0}, Lcom/friday/lecture/widget/LifecycleFrameLayout;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    sget v0, Lcom/friday/lecture/R$id;->tv_option_student:I

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Landroid/widget/TextView;

    .line 11
    .line 12
    sget v1, Lcom/friday/lecture/R$id;->tv_option_count:I

    .line 13
    .line 14
    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Landroid/widget/TextView;

    .line 19
    .line 20
    sget v2, Lcom/friday/lecture/R$id;->empty_view:I

    .line 21
    .line 22
    invoke-virtual {p0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    const-string v3, "OptionDetail"

    .line 27
    .line 28
    const-class v4, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$a;

    .line 29
    .line 30
    invoke-static {v3, v4}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    new-instance v4, Li3/a;

    .line 35
    .line 36
    invoke-direct {v4, p0, v1, v0, v2}, Li3/a;-><init>(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;)V

    .line 37
    .line 38
    .line 39
    invoke-interface {v3, p0, v4}, Lcom/jeremyliao/liveeventbus/core/Observable;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final declared-synchronized s(IILcom/friday/common/classtest/MqttResponse$Student;Ljava/util/List;)V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "list"

    .line 3
    .line 4
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iget-boolean v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    monitor-exit p0

    .line 12
    return-void

    .line 13
    :cond_0
    :try_start_1
    iput p2, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->x:I

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    if-ne p2, v0, :cond_2

    .line 17
    .line 18
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->l:Landroid/widget/TextView;

    .line 19
    .line 20
    const/16 v2, 0x8

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    goto/16 :goto_5

    .line 30
    .line 31
    :cond_1
    :goto_0
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->m:Landroid/widget/TextView;

    .line 32
    .line 33
    if-eqz v1, :cond_4

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->l:Landroid/widget/TextView;

    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    if-eqz v1, :cond_3

    .line 43
    .line 44
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 45
    .line 46
    .line 47
    :cond_3
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->m:Landroid/widget/TextView;

    .line 48
    .line 49
    if-eqz v1, :cond_4

    .line 50
    .line 51
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 52
    .line 53
    .line 54
    :cond_4
    :goto_1
    invoke-interface {p4}, Ljava/util/List;->size()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    iput v1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->p:I

    .line 59
    .line 60
    if-gt v0, p1, :cond_5

    .line 61
    .line 62
    move v1, v0

    .line 63
    :goto_2
    packed-switch v1, :pswitch_data_0

    .line 64
    .line 65
    .line 66
    goto :goto_3

    .line 67
    :pswitch_0
    iget-object v2, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->u:Ljava/util/TreeSet;

    .line 68
    .line 69
    const-string v3, "H"

    .line 70
    .line 71
    invoke-virtual {v2, v3}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    goto :goto_3

    .line 75
    :pswitch_1
    iget-object v2, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->u:Ljava/util/TreeSet;

    .line 76
    .line 77
    const-string v3, "G"

    .line 78
    .line 79
    invoke-virtual {v2, v3}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    goto :goto_3

    .line 83
    :pswitch_2
    iget-object v2, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->u:Ljava/util/TreeSet;

    .line 84
    .line 85
    const-string v3, "F"

    .line 86
    .line 87
    invoke-virtual {v2, v3}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    goto :goto_3

    .line 91
    :pswitch_3
    iget-object v2, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->u:Ljava/util/TreeSet;

    .line 92
    .line 93
    const-string v3, "E"

    .line 94
    .line 95
    invoke-virtual {v2, v3}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    goto :goto_3

    .line 99
    :pswitch_4
    iget-object v2, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->u:Ljava/util/TreeSet;

    .line 100
    .line 101
    const-string v3, "D"

    .line 102
    .line 103
    invoke-virtual {v2, v3}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    goto :goto_3

    .line 107
    :pswitch_5
    iget-object v2, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->u:Ljava/util/TreeSet;

    .line 108
    .line 109
    const-string v3, "C"

    .line 110
    .line 111
    invoke-virtual {v2, v3}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    goto :goto_3

    .line 115
    :pswitch_6
    iget-object v2, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->u:Ljava/util/TreeSet;

    .line 116
    .line 117
    const-string v3, "B"

    .line 118
    .line 119
    invoke-virtual {v2, v3}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    goto :goto_3

    .line 123
    :pswitch_7
    iget-object v2, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->u:Ljava/util/TreeSet;

    .line 124
    .line 125
    const-string v3, "A"

    .line 126
    .line 127
    invoke-virtual {v2, v3}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    :goto_3
    if-eq v1, p1, :cond_5

    .line 131
    .line 132
    add-int/lit8 v1, v1, 0x1

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_5
    if-eq p2, v0, :cond_6

    .line 136
    .line 137
    move-object p1, p4

    .line 138
    check-cast p1, Ljava/lang/Iterable;

    .line 139
    .line 140
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 145
    .line 146
    .line 147
    move-result p2

    .line 148
    if-eqz p2, :cond_6

    .line 149
    .line 150
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p2

    .line 154
    check-cast p2, Ljava/lang/String;

    .line 155
    .line 156
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->t:Ljava/util/TreeSet;

    .line 157
    .line 158
    invoke-virtual {v1, p2}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    goto :goto_4

    .line 162
    :cond_6
    if-eqz p3, :cond_7

    .line 163
    .line 164
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->y:Ljava/util/TreeSet;

    .line 165
    .line 166
    invoke-virtual {p3}, Lcom/friday/common/classtest/MqttResponse$Student;->getStudentId()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p2

    .line 170
    invoke-virtual {p1, p2}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->q:Ljava/util/LinkedHashMap;

    .line 174
    .line 175
    invoke-virtual {p3}, Lcom/friday/common/classtest/MqttResponse$Student;->getStudentName()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p2

    .line 179
    invoke-interface {p1, p2, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    :cond_7
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->h:Landroid/widget/TextView;

    .line 183
    .line 184
    if-eqz p1, :cond_8

    .line 185
    .line 186
    iget-object p2, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->q:Ljava/util/LinkedHashMap;

    .line 187
    .line 188
    invoke-virtual {p2}, Ljava/util/AbstractMap;->size()I

    .line 189
    .line 190
    .line 191
    move-result p2

    .line 192
    new-instance p3, Ljava/lang/StringBuilder;

    .line 193
    .line 194
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 195
    .line 196
    .line 197
    const-string p4, "\u5df2\u63d0\u4ea4: "

    .line 198
    .line 199
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object p2

    .line 209
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 210
    .line 211
    .line 212
    :cond_8
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->k:Landroid/widget/TextView;

    .line 213
    .line 214
    if-eqz p1, :cond_9

    .line 215
    .line 216
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 217
    .line 218
    .line 219
    :cond_9
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->k:Landroid/widget/TextView;

    .line 220
    .line 221
    if-eqz p1, :cond_a

    .line 222
    .line 223
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 224
    .line 225
    .line 226
    move-result-object p2

    .line 227
    sget p3, Lcom/friday/lecture/R$color;->colorPrimary:I

    .line 228
    .line 229
    invoke-static {p2, p3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 230
    .line 231
    .line 232
    move-result p2

    .line 233
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 234
    .line 235
    .line 236
    :cond_a
    monitor-exit p0

    .line 237
    return-void

    .line 238
    :goto_5
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 239
    throw p1

    .line 240
    nop

    .line 241
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
