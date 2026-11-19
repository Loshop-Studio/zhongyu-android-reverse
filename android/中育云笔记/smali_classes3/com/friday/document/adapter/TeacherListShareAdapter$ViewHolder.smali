.class public final Lcom/friday/document/adapter/TeacherListShareAdapter$ViewHolder;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/friday/document/adapter/TeacherListShareAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "ViewHolder"
.end annotation


# instance fields
.field public final c:Lcom/friday/document/databinding/ItemFragmentShareByTeacherBinding;

.field public final d:Lhd/l;

.field public final synthetic e:Lcom/friday/document/adapter/TeacherListShareAdapter;


# direct methods
.method public constructor <init>(Lcom/friday/document/adapter/TeacherListShareAdapter;Lcom/friday/document/databinding/ItemFragmentShareByTeacherBinding;Lhd/l;)V
    .locals 1

    .line 1
    const-string v0, "binding"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onItemClick"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lcom/friday/document/adapter/TeacherListShareAdapter$ViewHolder;->e:Lcom/friday/document/adapter/TeacherListShareAdapter;

    .line 12
    .line 13
    invoke-virtual {p2}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 18
    .line 19
    .line 20
    iput-object p2, p0, Lcom/friday/document/adapter/TeacherListShareAdapter$ViewHolder;->c:Lcom/friday/document/databinding/ItemFragmentShareByTeacherBinding;

    .line 21
    .line 22
    iput-object p3, p0, Lcom/friday/document/adapter/TeacherListShareAdapter$ViewHolder;->d:Lhd/l;

    .line 23
    .line 24
    invoke-virtual {p2}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    new-instance p3, Lo2/k;

    .line 29
    .line 30
    invoke-direct {p3, p1, p0}, Lo2/k;-><init>(Lcom/friday/document/adapter/TeacherListShareAdapter;Lcom/friday/document/adapter/TeacherListShareAdapter$ViewHolder;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public static synthetic a(Lcom/friday/document/adapter/TeacherListShareAdapter;Lcom/friday/document/adapter/TeacherListShareAdapter$ViewHolder;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/document/adapter/TeacherListShareAdapter$ViewHolder;->b(Lcom/friday/document/adapter/TeacherListShareAdapter;Lcom/friday/document/adapter/TeacherListShareAdapter$ViewHolder;Landroid/view/View;)V

    return-void
.end method

.method public static final b(Lcom/friday/document/adapter/TeacherListShareAdapter;Lcom/friday/document/adapter/TeacherListShareAdapter$ViewHolder;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getBindingAdapterPosition()I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    invoke-static {p0, p2}, Lcom/friday/document/adapter/TeacherListShareAdapter;->a(Lcom/friday/document/adapter/TeacherListShareAdapter;I)Lcom/friday/document/model/TchByCloudEntity;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget-object p1, p1, Lcom/friday/document/adapter/TeacherListShareAdapter$ViewHolder;->d:Lhd/l;

    .line 10
    .line 11
    invoke-static {p0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {p1, p0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final c(Lcom/friday/document/model/TchByCloudEntity;)V
    .locals 4

    .line 1
    const-string v0, "item"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/friday/document/adapter/TeacherListShareAdapter$ViewHolder;->c:Lcom/friday/document/databinding/ItemFragmentShareByTeacherBinding;

    .line 7
    .line 8
    iget-object v1, v0, Lcom/friday/document/databinding/ItemFragmentShareByTeacherBinding;->e:Landroid/widget/TextView;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sget v2, Lcom/friday/document/R$string;->teacher_name:I

    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/friday/document/model/TchByCloudEntity;->getTeacherName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {v0, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lcom/friday/document/adapter/TeacherListShareAdapter$ViewHolder;->c:Lcom/friday/document/databinding/ItemFragmentShareByTeacherBinding;

    .line 36
    .line 37
    iget-object v1, v0, Lcom/friday/document/databinding/ItemFragmentShareByTeacherBinding;->f:Landroid/widget/TextView;

    .line 38
    .line 39
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sget v2, Lcom/friday/document/R$string;->update_time:I

    .line 48
    .line 49
    invoke-virtual {p1}, Lcom/friday/document/model/TchByCloudEntity;->getUpdateTime()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-virtual {v0, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1}, Lcom/friday/document/model/TchByCloudEntity;->getPicture()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    if-eqz v0, :cond_0

    .line 69
    .line 70
    iget-object v0, p0, Lcom/friday/document/adapter/TeacherListShareAdapter$ViewHolder;->c:Lcom/friday/document/databinding/ItemFragmentShareByTeacherBinding;

    .line 71
    .line 72
    iget-object v0, v0, Lcom/friday/document/databinding/ItemFragmentShareByTeacherBinding;->c:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 73
    .line 74
    const-string v1, "imgHead"

    .line 75
    .line 76
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1}, Lcom/friday/document/model/TchByCloudEntity;->getPicture()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-static {v1}, Lcoil3/l;->a(Landroid/content/Context;)Lcoil3/e;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    new-instance v2, Lw/g$a;

    .line 92
    .line 93
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-direct {v2, v3}, Lw/g$a;-><init>(Landroid/content/Context;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2, p1}, Lw/g$a;->d(Ljava/lang/Object;)Lw/g$a;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-static {p1, v0}, Lw/j;->q(Lw/g$a;Landroid/widget/ImageView;)Lw/g$a;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    iget-object v0, p0, Lcom/friday/document/adapter/TeacherListShareAdapter$ViewHolder;->c:Lcom/friday/document/databinding/ItemFragmentShareByTeacherBinding;

    .line 109
    .line 110
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    sget v2, Lcom/friday/document/R$drawable;->dialogue_ic_head_portrait:I

    .line 119
    .line 120
    invoke-static {v0, v2}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-static {p1, v0}, Lw/j;->p(Lw/g$a;Landroid/graphics/drawable/Drawable;)Lw/g$a;

    .line 125
    .line 126
    .line 127
    iget-object v0, p0, Lcom/friday/document/adapter/TeacherListShareAdapter$ViewHolder;->c:Lcom/friday/document/databinding/ItemFragmentShareByTeacherBinding;

    .line 128
    .line 129
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    sget v2, Lcom/friday/document/R$drawable;->dialogue_ic_head_portrait:I

    .line 138
    .line 139
    invoke-static {v0, v2}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-static {p1, v0}, Lw/j;->c(Lw/g$a;Landroid/graphics/drawable/Drawable;)Lw/g$a;

    .line 144
    .line 145
    .line 146
    invoke-virtual {p1}, Lw/g$a;->c()Lw/g;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-interface {v1, p1}, Lcoil3/e;->c(Lw/g;)Lw/c;

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :cond_0
    iget-object p1, p0, Lcom/friday/document/adapter/TeacherListShareAdapter$ViewHolder;->c:Lcom/friday/document/databinding/ItemFragmentShareByTeacherBinding;

    .line 155
    .line 156
    iget-object p1, p1, Lcom/friday/document/databinding/ItemFragmentShareByTeacherBinding;->c:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 157
    .line 158
    sget v0, Lcom/friday/document/R$drawable;->dialogue_ic_head_portrait:I

    .line 159
    .line 160
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 161
    .line 162
    .line 163
    return-void
.end method
