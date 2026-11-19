.class public final Lcom/friday/paint/view/six/NewPaintFragment$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo1/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/paint/view/six/NewPaintFragment;->initDrawerRight()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public a:I

.field public b:Lcom/friday/paint/model/NoteListEntity;

.field public final synthetic c:Lcom/friday/paint/view/six/NewPaintFragment;


# direct methods
.method public constructor <init>(Lcom/friday/paint/view/six/NewPaintFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$b;->c:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 7

    .line 1
    const-string v0, "viewHolder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/view/View;->getAlpha()F

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/high16 v1, 0x3f000000    # 0.5f

    .line 13
    .line 14
    cmpg-float v0, v0, v1

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    sget-object v1, Lf2/a;->a:Lf2/a;

    .line 19
    .line 20
    iget-object v2, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 21
    .line 22
    const v4, 0x3f99999a    # 1.2f

    .line 23
    .line 24
    .line 25
    const-wide/16 v5, 0x258

    .line 26
    .line 27
    const/high16 v3, 0x3f800000    # 1.0f

    .line 28
    .line 29
    invoke-virtual/range {v1 .. v6}, Lf2/a;->b(Landroid/view/View;FFJ)V

    .line 30
    .line 31
    .line 32
    :cond_0
    iget-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$b;->c:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    invoke-virtual {p1, v0}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$b;->b:Lcom/friday/paint/model/NoteListEntity;

    .line 39
    .line 40
    if-eqz p1, :cond_2

    .line 41
    .line 42
    iget-object v1, p0, Lcom/friday/paint/view/six/NewPaintFragment$b;->c:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 43
    .line 44
    invoke-virtual {v1}, Lcom/friday/paint/view/six/NewPaintFragment;->getRightNoteListAdapter()Lcom/friday/paint/view/six/NewThumbnailListAdapter;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v2}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-interface {v2, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-ne p2, p1, :cond_1

    .line 57
    .line 58
    invoke-static {v1}, Lcom/friday/paint/view/six/NewPaintFragment;->access$getViewModel(Lcom/friday/paint/view/six/NewPaintFragment;)Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p1, p2}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->b0(I)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    invoke-static {v1}, Lcom/friday/paint/view/six/NewPaintFragment;->access$getViewModel(Lcom/friday/paint/view/six/NewPaintFragment;)Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    invoke-virtual {p2, p1}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->b0(I)V

    .line 71
    .line 72
    .line 73
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$b;->c:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 74
    .line 75
    invoke-static {p1}, Lcom/friday/paint/view/six/NewPaintFragment;->access$getMBinding(Lcom/friday/paint/view/six/NewPaintFragment;)Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    iget-object p1, p1, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->i:Landroid/widget/ImageView;

    .line 80
    .line 81
    invoke-virtual {p1}, Landroid/view/View;->isEnabled()Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    const/4 p2, 0x0

    .line 86
    if-nez p1, :cond_3

    .line 87
    .line 88
    iget-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$b;->c:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 89
    .line 90
    invoke-static {p1}, Lcom/friday/paint/view/six/NewPaintFragment;->access$getMBinding(Lcom/friday/paint/view/six/NewPaintFragment;)Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    iget-object v1, v1, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->i:Landroid/widget/ImageView;

    .line 95
    .line 96
    const-string v2, "ivCopyPage"

    .line 97
    .line 98
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    iget-object v2, p0, Lcom/friday/paint/view/six/NewPaintFragment$b;->c:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 102
    .line 103
    invoke-static {v2}, Lcom/friday/paint/view/six/NewPaintFragment;->access$getMBinding(Lcom/friday/paint/view/six/NewPaintFragment;)Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    iget-object v2, v2, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->e:Landroid/widget/ImageView;

    .line 108
    .line 109
    const-string v3, "ivAddPage"

    .line 110
    .line 111
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    iget-object v3, p0, Lcom/friday/paint/view/six/NewPaintFragment$b;->c:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 115
    .line 116
    invoke-static {v3}, Lcom/friday/paint/view/six/NewPaintFragment;->access$getMBinding(Lcom/friday/paint/view/six/NewPaintFragment;)Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    iget-object v3, v3, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->n:Landroid/widget/ImageView;

    .line 121
    .line 122
    const-string v4, "ivRemovePage"

    .line 123
    .line 124
    invoke-static {v3, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    const/4 v4, 0x3

    .line 128
    new-array v4, v4, [Landroid/view/View;

    .line 129
    .line 130
    aput-object v1, v4, p2

    .line 131
    .line 132
    aput-object v2, v4, v0

    .line 133
    .line 134
    const/4 v1, 0x2

    .line 135
    aput-object v3, v4, v1

    .line 136
    .line 137
    invoke-static {p1, v4}, Lcom/friday/paint/view/six/NewPaintFragment;->access$convertEnable(Lcom/friday/paint/view/six/NewPaintFragment;[Landroid/view/View;)V

    .line 138
    .line 139
    .line 140
    :cond_3
    iget-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$b;->c:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 141
    .line 142
    invoke-static {p1}, Lcom/friday/paint/view/six/NewPaintFragment;->access$getViewModel(Lcom/friday/paint/view/six/NewPaintFragment;)Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-virtual {p1, v0}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->c0(Z)V

    .line 147
    .line 148
    .line 149
    iget-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$b;->c:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 150
    .line 151
    invoke-virtual {p1}, Lcom/friday/paint/view/six/NewPaintFragment;->getRightNoteListAdapter()Lcom/friday/paint/view/six/NewThumbnailListAdapter;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 156
    .line 157
    .line 158
    iget-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$b;->c:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 159
    .line 160
    invoke-virtual {p1, p2}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 161
    .line 162
    .line 163
    return-void
.end method

.method public b(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILandroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 1
    const-string p2, "source"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "target"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public c(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 7

    .line 1
    const-string v0, "viewHolder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/friday/paint/view/six/NewPaintFragment$b;->c:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/friday/paint/view/six/NewPaintFragment;->access$getMBinding(Lcom/friday/paint/view/six/NewPaintFragment;)Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v0, v0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->i:Landroid/widget/ImageView;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/view/View;->isEnabled()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, Lcom/friday/paint/view/six/NewPaintFragment$b;->c:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 21
    .line 22
    invoke-static {v0}, Lcom/friday/paint/view/six/NewPaintFragment;->access$getMBinding(Lcom/friday/paint/view/six/NewPaintFragment;)Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iget-object v1, v1, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->i:Landroid/widget/ImageView;

    .line 27
    .line 28
    const-string v2, "ivCopyPage"

    .line 29
    .line 30
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget-object v2, p0, Lcom/friday/paint/view/six/NewPaintFragment$b;->c:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 34
    .line 35
    invoke-static {v2}, Lcom/friday/paint/view/six/NewPaintFragment;->access$getMBinding(Lcom/friday/paint/view/six/NewPaintFragment;)Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    iget-object v2, v2, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->e:Landroid/widget/ImageView;

    .line 40
    .line 41
    const-string v3, "ivAddPage"

    .line 42
    .line 43
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iget-object v3, p0, Lcom/friday/paint/view/six/NewPaintFragment$b;->c:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 47
    .line 48
    invoke-static {v3}, Lcom/friday/paint/view/six/NewPaintFragment;->access$getMBinding(Lcom/friday/paint/view/six/NewPaintFragment;)Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    iget-object v3, v3, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->n:Landroid/widget/ImageView;

    .line 53
    .line 54
    const-string v4, "ivRemovePage"

    .line 55
    .line 56
    invoke-static {v3, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const/4 v4, 0x3

    .line 60
    new-array v4, v4, [Landroid/view/View;

    .line 61
    .line 62
    const/4 v5, 0x0

    .line 63
    aput-object v1, v4, v5

    .line 64
    .line 65
    const/4 v1, 0x1

    .line 66
    aput-object v2, v4, v1

    .line 67
    .line 68
    const/4 v1, 0x2

    .line 69
    aput-object v3, v4, v1

    .line 70
    .line 71
    invoke-static {v0, v4}, Lcom/friday/paint/view/six/NewPaintFragment;->access$convertEnable(Lcom/friday/paint/view/six/NewPaintFragment;[Landroid/view/View;)V

    .line 72
    .line 73
    .line 74
    :cond_0
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 75
    .line 76
    invoke-virtual {v0}, Landroid/view/View;->getAlpha()F

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    const/high16 v1, 0x3f800000    # 1.0f

    .line 81
    .line 82
    cmpg-float v0, v0, v1

    .line 83
    .line 84
    if-nez v0, :cond_1

    .line 85
    .line 86
    sget-object v1, Lf2/a;->a:Lf2/a;

    .line 87
    .line 88
    iget-object v2, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 89
    .line 90
    const v4, 0x3f99999a    # 1.2f

    .line 91
    .line 92
    .line 93
    const-wide/16 v5, 0x258

    .line 94
    .line 95
    const/high16 v3, 0x3f800000    # 1.0f

    .line 96
    .line 97
    invoke-virtual/range {v1 .. v6}, Lf2/a;->b(Landroid/view/View;FFJ)V

    .line 98
    .line 99
    .line 100
    :cond_1
    iput p2, p0, Lcom/friday/paint/view/six/NewPaintFragment$b;->a:I

    .line 101
    .line 102
    iget-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$b;->c:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 103
    .line 104
    invoke-virtual {p1}, Lcom/friday/paint/view/six/NewPaintFragment;->getRightNoteListAdapter()Lcom/friday/paint/view/six/NewThumbnailListAdapter;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    check-cast p1, Ljava/lang/Iterable;

    .line 113
    .line 114
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 119
    .line 120
    .line 121
    move-result p2

    .line 122
    if-eqz p2, :cond_3

    .line 123
    .line 124
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p2

    .line 128
    move-object v0, p2

    .line 129
    check-cast v0, Lcom/friday/paint/model/NoteListEntity;

    .line 130
    .line 131
    invoke-virtual {v0}, Lcom/friday/paint/model/NoteListEntity;->getSelected()Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-eqz v0, :cond_2

    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_3
    const/4 p2, 0x0

    .line 139
    :goto_0
    check-cast p2, Lcom/friday/paint/model/NoteListEntity;

    .line 140
    .line 141
    iput-object p2, p0, Lcom/friday/paint/view/six/NewPaintFragment$b;->b:Lcom/friday/paint/model/NoteListEntity;

    .line 142
    .line 143
    return-void
.end method
