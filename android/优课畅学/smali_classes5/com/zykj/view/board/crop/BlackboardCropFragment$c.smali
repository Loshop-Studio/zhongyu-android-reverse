.class public final Lcom/zykj/view/board/crop/BlackboardCropFragment$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/view/widget/DoubleSeekBar$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/crop/BlackboardCropFragment;->G()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/view/board/crop/BlackboardCropFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment$c;->a:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic d(Ljava/lang/Throwable;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/crop/BlackboardCropFragment$c;->i(Ljava/lang/Throwable;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/crop/BlackboardCropFragment$c;->h(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V

    return-void
.end method

.method public static synthetic f(Lcom/zykj/view/board/crop/BlackboardCropFragment;I)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/crop/BlackboardCropFragment$c;->g(Lcom/zykj/view/board/crop/BlackboardCropFragment;I)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lcom/zykj/view/board/crop/BlackboardCropFragment;I)Lh7/p;
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->C(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    new-instance v0, Lq5/a0;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Lq5/a0;-><init>(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 13
    .line 14
    .line 15
    :cond_0
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 16
    .line 17
    return-object p0
.end method

.method public static final h(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->F()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final i(Ljava/lang/Throwable;)Lh7/p;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 7
    .line 8
    return-object p0
.end method


# virtual methods
.method public a(Lcom/zykj/view/widget/DoubleSeekBar;)V
    .locals 5

    .line 1
    const-string v0, "seekBar"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment$c;->a:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->z(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lcom/zykj/blackboard/crop/CropManager;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const-string v0, "cropManager"

    .line 16
    .line 17
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    move-object v0, v1

    .line 21
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/view/widget/DoubleSeekBar;->getMaskProgress()F

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    float-to-long v2, v2

    .line 26
    invoke-virtual {v0, v2, v3}, Lcom/zykj/blackboard/crop/CropManager;->calculateRecentTime(J)J

    .line 27
    .line 28
    .line 29
    move-result-wide v2

    .line 30
    long-to-float v0, v2

    .line 31
    invoke-virtual {p1, v0}, Lcom/zykj/view/widget/DoubleSeekBar;->setMaskProgress(F)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/zykj/view/widget/DoubleSeekBar;->getProgress()F

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    invoke-virtual {p1}, Lcom/zykj/view/widget/DoubleSeekBar;->getMaskProgress()F

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    cmpg-float v0, v0, v2

    .line 43
    .line 44
    if-gez v0, :cond_2

    .line 45
    .line 46
    invoke-virtual {p1}, Lcom/zykj/view/widget/DoubleSeekBar;->getMaskProgress()F

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    invoke-virtual {p1, v0}, Lcom/zykj/view/widget/DoubleSeekBar;->setProgress(F)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment$c;->a:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 54
    .line 55
    sget-object v2, La6/o;->a:La6/o;

    .line 56
    .line 57
    invoke-virtual {p1}, Lcom/zykj/view/widget/DoubleSeekBar;->getMaskProgress()F

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    float-to-long v3, v3

    .line 62
    invoke-virtual {v2, v3, v4}, La6/o;->a(J)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-static {v0, v2}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->E(Lcom/zykj/view/board/crop/BlackboardCropFragment;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    iget-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment$c;->a:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 70
    .line 71
    invoke-static {v0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->A(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    if-nez v0, :cond_1

    .line 76
    .line 77
    const-string v0, "mBinding"

    .line 78
    .line 79
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    move-object v0, v1

    .line 83
    :cond_1
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->f:Landroid/widget/TextView;

    .line 84
    .line 85
    iget-object v2, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment$c;->a:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 86
    .line 87
    invoke-static {v2}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->B(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    iget-object v3, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment$c;->a:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 92
    .line 93
    invoke-static {v3}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->D(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    new-instance v4, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    const-string v2, "/"

    .line 106
    .line 107
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 118
    .line 119
    .line 120
    iget-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment$c;->a:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 121
    .line 122
    const/4 v2, 0x0

    .line 123
    const/4 v3, 0x3

    .line 124
    invoke-static {v0, v1, v2, v3, v1}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->e0(Lcom/zykj/view/board/crop/BlackboardCropFragment;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    iget-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment$c;->a:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 128
    .line 129
    invoke-static {v0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->C(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    if-eqz v0, :cond_2

    .line 134
    .line 135
    invoke-virtual {p1}, Lcom/zykj/view/widget/DoubleSeekBar;->getProgress()F

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    float-to-int p1, p1

    .line 140
    iget-object v1, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment$c;->a:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 141
    .line 142
    new-instance v2, Lq5/y;

    .line 143
    .line 144
    invoke-direct {v2, v1}, Lq5/y;-><init>(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V

    .line 145
    .line 146
    .line 147
    new-instance v1, Lq5/z;

    .line 148
    .line 149
    invoke-direct {v1}, Lq5/z;-><init>()V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0, p1, v2, v1}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->m(ILx7/l;Lx7/l;)V

    .line 153
    .line 154
    .line 155
    :cond_2
    return-void
.end method

.method public b(Lcom/zykj/view/widget/DoubleSeekBar;F)V
    .locals 0

    .line 1
    const-string p2, "seekBar"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public c(Lcom/zykj/view/widget/DoubleSeekBar;)V
    .locals 2

    .line 1
    const-string v0, "seekBar"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment$c;->a:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 7
    .line 8
    invoke-static {p1}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->C(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const/4 v0, 0x0

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->p()Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object p1, v0

    .line 21
    :goto_0
    sget-object v1, Lcom/zykj/merge/sketch/constant/PlayStatus;->c:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 22
    .line 23
    if-eq p1, v1, :cond_2

    .line 24
    .line 25
    iget-object p1, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment$c;->a:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 26
    .line 27
    invoke-static {p1}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->C(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->p()Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :cond_1
    sget-object p1, Lcom/zykj/merge/sketch/constant/PlayStatus;->e:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 38
    .line 39
    if-ne v0, p1, :cond_3

    .line 40
    .line 41
    :cond_2
    iget-object p1, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment$c;->a:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 42
    .line 43
    invoke-static {p1}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->C(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    if-eqz p1, :cond_3

    .line 48
    .line 49
    invoke-virtual {p1}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->i()V

    .line 50
    .line 51
    .line 52
    :cond_3
    return-void
.end method
