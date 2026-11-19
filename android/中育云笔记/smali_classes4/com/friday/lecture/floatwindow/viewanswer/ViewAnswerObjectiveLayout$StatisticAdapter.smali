.class public final Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$StatisticAdapter;
.super Lcom/chad/library/adapter/base/BaseQuickAdapter;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "StatisticAdapter"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/chad/library/adapter/base/BaseQuickAdapter<",
        "Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$a;",
        "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ILjava/util/List;)V
    .locals 1

    .line 1
    const-string v0, "dataList"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget v0, Lcom/friday/lecture/R$layout;->item_statistic_child:I

    .line 7
    .line 8
    invoke-direct {p0, v0, p2}, Lcom/chad/library/adapter/base/BaseQuickAdapter;-><init>(ILjava/util/List;)V

    .line 9
    .line 10
    .line 11
    iput p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$StatisticAdapter;->a:I

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic convert(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$a;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$StatisticAdapter;->i(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public i(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$a;)V
    .locals 4

    .line 1
    const-string v0, "holder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "item"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget v0, Lcom/friday/lecture/R$id;->tv_count:I

    .line 12
    .line 13
    invoke-virtual {p2}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$a;->b()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    const-string v1, ""

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {p2}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$a;->b()Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    :goto_0
    invoke-virtual {p1, v0, v1}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    sget v1, Lcom/friday/lecture/R$id;->tv_option:I

    .line 43
    .line 44
    invoke-virtual {p2}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$a;->a()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v0, v1, v2}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;

    .line 49
    .line 50
    .line 51
    sget v0, Lcom/friday/lecture/R$id;->iv_percent:I

    .line 52
    .line 53
    invoke-virtual {p1, v0}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    check-cast p1, Landroid/widget/ImageView;

    .line 58
    .line 59
    invoke-virtual {p2}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$a;->b()Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    int-to-float v0, v0

    .line 68
    const/high16 v1, 0x3f800000    # 1.0f

    .line 69
    .line 70
    mul-float/2addr v0, v1

    .line 71
    iget v1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$StatisticAdapter;->a:I

    .line 72
    .line 73
    int-to-float v1, v1

    .line 74
    div-float/2addr v0, v1

    .line 75
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    const-string v2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"

    .line 80
    .line 81
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    check-cast v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 85
    .line 86
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getContext()Landroid/content/Context;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    sget v3, Lcom/friday/lecture/R$dimen;->view_110:I

    .line 95
    .line 96
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    mul-float/2addr v2, v0

    .line 101
    float-to-int v0, v2

    .line 102
    iput v0, v1, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 103
    .line 104
    invoke-virtual {p1, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p2}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$a;->c()Z

    .line 108
    .line 109
    .line 110
    move-result p2

    .line 111
    if-eqz p2, :cond_1

    .line 112
    .line 113
    const-string p2, "#14FF9C"

    .line 114
    .line 115
    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 116
    .line 117
    .line 118
    move-result p2

    .line 119
    invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :cond_1
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getContext()Landroid/content/Context;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    sget v0, Lcom/friday/lecture/R$color;->colorPrimary:I

    .line 128
    .line 129
    invoke-static {p2, v0}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 130
    .line 131
    .line 132
    move-result p2

    .line 133
    invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 134
    .line 135
    .line 136
    return-void
.end method
