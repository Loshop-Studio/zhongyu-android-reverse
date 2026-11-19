.class public final Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/viewbinding/ViewBinding;


# instance fields
.field public final a:Lcom/zykj/student/dialogue/ui/widget/TouchSwitchMotionLayout;

.field public final b:Landroid/widget/FrameLayout;

.field public final c:Landroid/widget/FrameLayout;

.field public final d:Landroid/widget/FrameLayout;

.field public final e:Lcom/xuexiang/xui/widget/alpha/XUIAlphaImageButton;

.field public final f:Landroidx/appcompat/widget/AppCompatImageView;

.field public final g:Landroidx/appcompat/widget/LinearLayoutCompat;

.field public final h:Lcom/zykj/student/dialogue/ui/widget/TouchSwitchMotionLayout;

.field public final i:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final j:Landroid/view/View;

.field public final k:Landroidx/appcompat/widget/AppCompatTextView;

.field public final l:Landroid/widget/TextView;

.field public final m:Landroidx/appcompat/widget/AppCompatTextView;

.field public final n:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/zykj/student/dialogue/ui/widget/TouchSwitchMotionLayout;Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;Lcom/xuexiang/xui/widget/alpha/XUIAlphaImageButton;Landroidx/appcompat/widget/AppCompatImageView;Landroidx/appcompat/widget/LinearLayoutCompat;Lcom/zykj/student/dialogue/ui/widget/TouchSwitchMotionLayout;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Landroidx/appcompat/widget/AppCompatTextView;Landroid/widget/TextView;Landroidx/appcompat/widget/AppCompatTextView;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;->a:Lcom/zykj/student/dialogue/ui/widget/TouchSwitchMotionLayout;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;->b:Landroid/widget/FrameLayout;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;->c:Landroid/widget/FrameLayout;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;->d:Landroid/widget/FrameLayout;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;->e:Lcom/xuexiang/xui/widget/alpha/XUIAlphaImageButton;

    .line 13
    .line 14
    iput-object p6, p0, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;->f:Landroidx/appcompat/widget/AppCompatImageView;

    .line 15
    .line 16
    iput-object p7, p0, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;->g:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 17
    .line 18
    iput-object p8, p0, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;->h:Lcom/zykj/student/dialogue/ui/widget/TouchSwitchMotionLayout;

    .line 19
    .line 20
    iput-object p9, p0, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;->i:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 21
    .line 22
    iput-object p10, p0, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;->j:Landroid/view/View;

    .line 23
    .line 24
    iput-object p11, p0, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;->k:Landroidx/appcompat/widget/AppCompatTextView;

    .line 25
    .line 26
    iput-object p12, p0, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;->l:Landroid/widget/TextView;

    .line 27
    .line 28
    iput-object p13, p0, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;->m:Landroidx/appcompat/widget/AppCompatTextView;

    .line 29
    .line 30
    iput-object p14, p0, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;->n:Landroid/view/View;

    .line 31
    .line 32
    return-void
.end method

.method public static a(Landroid/view/View;)Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget v1, Lcom/zykj/student/dialogue/R$id;->fl_container:I

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    move-object v5, v2

    .line 10
    check-cast v5, Landroid/widget/FrameLayout;

    .line 11
    .line 12
    if-eqz v5, :cond_0

    .line 13
    .line 14
    sget v1, Lcom/zykj/student/dialogue/R$id;->fl_tab:I

    .line 15
    .line 16
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    move-object v6, v2

    .line 21
    check-cast v6, Landroid/widget/FrameLayout;

    .line 22
    .line 23
    if-eqz v6, :cond_0

    .line 24
    .line 25
    sget v1, Lcom/zykj/student/dialogue/R$id;->fl_wrapper:I

    .line 26
    .line 27
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    move-object v7, v2

    .line 32
    check-cast v7, Landroid/widget/FrameLayout;

    .line 33
    .line 34
    if-eqz v7, :cond_0

    .line 35
    .line 36
    sget v1, Lcom/zykj/student/dialogue/R$id;->iv_back:I

    .line 37
    .line 38
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    move-object v8, v2

    .line 43
    check-cast v8, Lcom/xuexiang/xui/widget/alpha/XUIAlphaImageButton;

    .line 44
    .line 45
    if-eqz v8, :cond_0

    .line 46
    .line 47
    sget v1, Lcom/zykj/student/dialogue/R$id;->iv_closed_state:I

    .line 48
    .line 49
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    move-object v9, v2

    .line 54
    check-cast v9, Landroidx/appcompat/widget/AppCompatImageView;

    .line 55
    .line 56
    if-eqz v9, :cond_0

    .line 57
    .line 58
    sget v1, Lcom/zykj/student/dialogue/R$id;->ll_closed_state:I

    .line 59
    .line 60
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    move-object v10, v2

    .line 65
    check-cast v10, Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 66
    .line 67
    if-eqz v10, :cond_0

    .line 68
    .line 69
    move-object v4, v0

    .line 70
    check-cast v4, Lcom/zykj/student/dialogue/ui/widget/TouchSwitchMotionLayout;

    .line 71
    .line 72
    sget v1, Lcom/zykj/student/dialogue/R$id;->title_bar:I

    .line 73
    .line 74
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    move-object v12, v2

    .line 79
    check-cast v12, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 80
    .line 81
    if-eqz v12, :cond_0

    .line 82
    .line 83
    sget v1, Lcom/zykj/student/dialogue/R$id;->tutorial_bg_step1:I

    .line 84
    .line 85
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 86
    .line 87
    .line 88
    move-result-object v13

    .line 89
    if-eqz v13, :cond_0

    .line 90
    .line 91
    sget v1, Lcom/zykj/student/dialogue/R$id;->tv_closed_state:I

    .line 92
    .line 93
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    move-object v14, v2

    .line 98
    check-cast v14, Landroidx/appcompat/widget/AppCompatTextView;

    .line 99
    .line 100
    if-eqz v14, :cond_0

    .line 101
    .line 102
    sget v1, Lcom/zykj/student/dialogue/R$id;->tv_description:I

    .line 103
    .line 104
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    move-object v15, v2

    .line 109
    check-cast v15, Landroid/widget/TextView;

    .line 110
    .line 111
    if-eqz v15, :cond_0

    .line 112
    .line 113
    sget v1, Lcom/zykj/student/dialogue/R$id;->tv_understood:I

    .line 114
    .line 115
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    move-object/from16 v16, v2

    .line 120
    .line 121
    check-cast v16, Landroidx/appcompat/widget/AppCompatTextView;

    .line 122
    .line 123
    if-eqz v16, :cond_0

    .line 124
    .line 125
    sget v1, Lcom/zykj/student/dialogue/R$id;->v_closed_divider:I

    .line 126
    .line 127
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 128
    .line 129
    .line 130
    move-result-object v17

    .line 131
    if-eqz v17, :cond_0

    .line 132
    .line 133
    new-instance v3, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;

    .line 134
    .line 135
    move-object v11, v4

    .line 136
    invoke-direct/range {v3 .. v17}, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;-><init>(Lcom/zykj/student/dialogue/ui/widget/TouchSwitchMotionLayout;Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;Lcom/xuexiang/xui/widget/alpha/XUIAlphaImageButton;Landroidx/appcompat/widget/AppCompatImageView;Landroidx/appcompat/widget/LinearLayoutCompat;Lcom/zykj/student/dialogue/ui/widget/TouchSwitchMotionLayout;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Landroidx/appcompat/widget/AppCompatTextView;Landroid/widget/TextView;Landroidx/appcompat/widget/AppCompatTextView;Landroid/view/View;)V

    .line 137
    .line 138
    .line 139
    return-object v3

    .line 140
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    new-instance v1, Ljava/lang/NullPointerException;

    .line 149
    .line 150
    const-string v2, "Missing required view with ID: "

    .line 151
    .line 152
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-direct {v1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    throw v1
.end method

.method public static c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;
    .locals 2

    .line 1
    sget v0, Lcom/zykj/student/dialogue/R$layout;->dialogue_fragment_answer_detail:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-static {p0}, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;->a(Landroid/view/View;)Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method


# virtual methods
.method public b()Lcom/zykj/student/dialogue/ui/widget/TouchSwitchMotionLayout;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;->a:Lcom/zykj/student/dialogue/ui/widget/TouchSwitchMotionLayout;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;->b()Lcom/zykj/student/dialogue/ui/widget/TouchSwitchMotionLayout;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
