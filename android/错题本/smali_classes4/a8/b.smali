.class public final La8/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public final synthetic a:Lorg/angmarch/views/NiceSpinner;


# direct methods
.method public constructor <init>(Lorg/angmarch/views/NiceSpinner;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La8/b;->a:Lorg/angmarch/views/NiceSpinner;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 8

    .line 1
    iget-object v0, p0, La8/b;->a:Lorg/angmarch/views/NiceSpinner;

    .line 2
    .line 3
    iget v1, v0, Lorg/angmarch/views/NiceSpinner;->b:I

    .line 4
    .line 5
    if-lt p3, v1, :cond_0

    .line 6
    .line 7
    iget-object v1, v0, Lorg/angmarch/views/NiceSpinner;->e:Lorg/angmarch/views/c;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/widget/BaseAdapter;->getCount()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-ge p3, v1, :cond_0

    .line 14
    .line 15
    add-int/lit8 p3, p3, 0x1

    .line 16
    .line 17
    :cond_0
    move v4, p3

    .line 18
    iput v4, v0, Lorg/angmarch/views/NiceSpinner;->b:I

    .line 19
    .line 20
    iget-object p3, v0, Lorg/angmarch/views/NiceSpinner;->g:La8/e;

    .line 21
    .line 22
    const/4 v7, 0x0

    .line 23
    if-eqz p3, :cond_2

    .line 24
    .line 25
    check-cast p3, Lcom/zykj/mistake/activity/r;

    .line 26
    .line 27
    iget-object p3, p3, Lcom/zykj/mistake/activity/r;->a:Lcom/zykj/mistake/base/BaseMVPActivity;

    .line 28
    .line 29
    check-cast p3, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    .line 30
    .line 31
    iget-object v1, p3, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->e:Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-static {v4, v1}, Lkotlin/collections/t;->j0(ILjava/util/List;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Lcom/zykj/mistake/entity/resp/SubjectResp$Subject;

    .line 38
    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/SubjectResp$Subject;->getId()J

    .line 42
    .line 43
    .line 44
    move-result-wide v2

    .line 45
    const-string v5, "zykjMistake"

    .line 46
    .line 47
    invoke-virtual {p3, v5, v7}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    invoke-interface {v5}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    const-string v6, "SP_SUBJECT_ID"

    .line 56
    .line 57
    invoke-interface {v5, v6, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 58
    .line 59
    .line 60
    invoke-interface {v5}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 61
    .line 62
    .line 63
    iget-object v2, p3, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->o:Lcom/zykj/mistake/entity/EditMistakeData;

    .line 64
    .line 65
    if-eqz v2, :cond_2

    .line 66
    .line 67
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/EditMistakeData;->getTopicId()J

    .line 68
    .line 69
    .line 70
    move-result-wide v2

    .line 71
    invoke-virtual {p3}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 72
    .line 73
    .line 74
    move-result-object p3

    .line 75
    check-cast p3, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    .line 76
    .line 77
    iget-object p3, p3, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->v:Landroidx/appcompat/widget/AppCompatTextView;

    .line 78
    .line 79
    const-string v5, "tvTopicDiffTip"

    .line 80
    .line 81
    invoke-static {p3, v5}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/SubjectResp$Subject;->getId()J

    .line 85
    .line 86
    .line 87
    move-result-wide v5

    .line 88
    cmp-long v1, v2, v5

    .line 89
    .line 90
    if-eqz v1, :cond_1

    .line 91
    .line 92
    move v1, v7

    .line 93
    goto :goto_0

    .line 94
    :cond_1
    const/16 v1, 0x8

    .line 95
    .line 96
    :goto_0
    invoke-virtual {p3, v1}, Landroid/view/View;->setVisibility(I)V

    .line 97
    .line 98
    .line 99
    :cond_2
    iget-object v1, v0, Lorg/angmarch/views/NiceSpinner;->f:Landroid/widget/AdapterView$OnItemSelectedListener;

    .line 100
    .line 101
    if-eqz v1, :cond_3

    .line 102
    .line 103
    move-object v2, p1

    .line 104
    move-object v3, p2

    .line 105
    move-wide v5, p4

    .line 106
    invoke-interface/range {v1 .. v6}, Landroid/widget/AdapterView$OnItemSelectedListener;->onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    .line 107
    .line 108
    .line 109
    :cond_3
    iget-object p1, v0, Lorg/angmarch/views/NiceSpinner;->e:Lorg/angmarch/views/c;

    .line 110
    .line 111
    iput v4, p1, Lorg/angmarch/views/c;->e:I

    .line 112
    .line 113
    invoke-virtual {p1, v4}, Lorg/angmarch/views/c;->a(I)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-static {v0, p1}, Lorg/angmarch/views/NiceSpinner;->b(Lorg/angmarch/views/NiceSpinner;Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    iget-boolean p1, v0, Lorg/angmarch/views/NiceSpinner;->h:Z

    .line 121
    .line 122
    if-nez p1, :cond_4

    .line 123
    .line 124
    invoke-virtual {v0, v7}, Lorg/angmarch/views/NiceSpinner;->c(Z)V

    .line 125
    .line 126
    .line 127
    :cond_4
    iget-object p1, v0, Lorg/angmarch/views/NiceSpinner;->d:Landroid/widget/ListPopupWindow;

    .line 128
    .line 129
    invoke-virtual {p1}, Landroid/widget/ListPopupWindow;->dismiss()V

    .line 130
    .line 131
    .line 132
    return-void
.end method
