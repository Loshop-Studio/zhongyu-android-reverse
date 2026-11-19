.class public final Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;
.super Lcom/friday/lecture/widget/LifecycleFrameLayout;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$a;
    }
.end annotation


# instance fields
.field public d:Landroid/widget/TextView;

.field public e:Landroid/widget/TextView;

.field public f:Landroid/widget/TextView;

.field public g:Landroidx/recyclerview/widget/RecyclerView;

.field public h:Landroid/widget/ImageView;

.field public i:Landroid/widget/TextView;

.field public j:Landroid/view/View;

.field public k:Landroidx/viewpager/widget/ViewPager;

.field public l:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public m:Landroid/widget/LinearLayout;

.field public n:Landroid/view/View;

.field public o:Landroid/widget/ImageView;

.field public p:Landroid/widget/TextView;

.field public q:Landroid/view/View;

.field public r:Landroid/view/View;

.field public s:Z

.field public t:Z

.field public u:Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;

.field public v:Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$a;

.field public w:I

.field public x:Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter;


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
    invoke-direct {p0}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->v()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static final A(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->x:Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    const-string p1, "mAdapter"

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    move-object p1, v0

    .line 12
    :cond_0
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->l:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 24
    .line 25
    if-nez p1, :cond_2

    .line 26
    .line 27
    const-string p1, "clAnim"

    .line 28
    .line 29
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    move-object p1, v0

    .line 33
    :cond_2
    const/4 v1, 0x0

    .line 34
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->q:Landroid/view/View;

    .line 38
    .line 39
    if-nez p1, :cond_3

    .line 40
    .line 41
    const-string p1, "layoutList"

    .line 42
    .line 43
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    move-object p1, v0

    .line 47
    :cond_3
    const/16 v1, 0x8

    .line 48
    .line 49
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->o:Landroid/widget/ImageView;

    .line 53
    .line 54
    if-nez p1, :cond_4

    .line 55
    .line 56
    const-string p1, "ivFlipCard"

    .line 57
    .line 58
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_4
    move-object v0, p1

    .line 63
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->withLayer()Landroid/view/ViewPropertyAnimator;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    const/high16 v0, 0x43340000    # 180.0f

    .line 72
    .line 73
    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->rotationY(F)Landroid/view/ViewPropertyAnimator;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    const-wide/16 v0, 0x4b0

    .line 78
    .line 79
    invoke-virtual {p1, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    new-instance v0, Landroid/view/animation/AccelerateDecelerateInterpolator;

    .line 84
    .line 85
    invoke-direct {v0}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    new-instance v0, Li3/u;

    .line 93
    .line 94
    invoke-direct {v0, p0}, Li3/u;-><init>(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->setUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)Landroid/view/ViewPropertyAnimator;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    new-instance v0, Li3/v;

    .line 102
    .line 103
    invoke-direct {v0, p0}, Li3/v;-><init>(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-virtual {p0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 111
    .line 112
    .line 113
    return-void
.end method

.method public static final B(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    const/high16 v0, 0x3f000000    # 0.5f

    .line 11
    .line 12
    cmpg-float v0, v0, p1

    .line 13
    .line 14
    if-gtz v0, :cond_1

    .line 15
    .line 16
    const v0, 0x3f0ccccd    # 0.55f

    .line 17
    .line 18
    .line 19
    cmpg-float p1, p1, v0

    .line 20
    .line 21
    if-gtz p1, :cond_1

    .line 22
    .line 23
    iget-object p0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->o:Landroid/widget/ImageView;

    .line 24
    .line 25
    if-nez p0, :cond_0

    .line 26
    .line 27
    const-string p0, "ivFlipCard"

    .line 28
    .line 29
    invoke-static {p0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    :cond_0
    sget p1, Lcom/friday/lecture/R$drawable;->random_flip1:I

    .line 34
    .line 35
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 36
    .line 37
    .line 38
    :cond_1
    return-void
.end method

.method public static final C(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;)V
    .locals 4

    .line 1
    new-instance v0, Ljava/util/Random;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->x:Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter;

    .line 7
    .line 8
    const-string v2, "mAdapter"

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    move-object v1, v3

    .line 17
    :cond_0
    invoke-virtual {v1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const/4 v1, 0x1

    .line 30
    iput-boolean v1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->s:Z

    .line 31
    .line 32
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->x:Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter;

    .line 33
    .line 34
    if-nez v1, :cond_1

    .line 35
    .line 36
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    move-object v1, v3

    .line 40
    :cond_1
    invoke-virtual {v1, v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$a;

    .line 45
    .line 46
    invoke-virtual {v1}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$a;->b()Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iput-object v1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->u:Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;

    .line 51
    .line 52
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->x:Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter;

    .line 53
    .line 54
    if-nez v1, :cond_2

    .line 55
    .line 56
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    move-object v1, v3

    .line 60
    :cond_2
    invoke-virtual {v1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    check-cast v0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$a;

    .line 69
    .line 70
    iput-object v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->v:Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$a;

    .line 71
    .line 72
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->p:Landroid/widget/TextView;

    .line 73
    .line 74
    if-nez v0, :cond_3

    .line 75
    .line 76
    const-string v0, "tvRandomName"

    .line 77
    .line 78
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    move-object v0, v3

    .line 82
    :cond_3
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->u:Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;

    .line 83
    .line 84
    if-eqz v1, :cond_4

    .line 85
    .line 86
    invoke-virtual {v1}, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;->getStudent()Lcom/friday/common/classtest/MqttResponse$Student;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    if-eqz v1, :cond_4

    .line 91
    .line 92
    invoke-virtual {v1}, Lcom/friday/common/classtest/MqttResponse$Student;->getStudentName()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    :cond_4
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 97
    .line 98
    .line 99
    new-instance v0, Landroid/os/Handler;

    .line 100
    .line 101
    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 102
    .line 103
    .line 104
    new-instance v1, Li3/w;

    .line 105
    .line 106
    invoke-direct {v1, p0}, Li3/w;-><init>(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;)V

    .line 107
    .line 108
    .line 109
    const-wide/16 v2, 0x514

    .line 110
    .line 111
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 112
    .line 113
    .line 114
    return-void
.end method

.method public static final D(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->l:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-string v0, "clAnim"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    move-object v0, v1

    .line 12
    :cond_0
    const/16 v2, 0x8

    .line 13
    .line 14
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->q:Landroid/view/View;

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    const-string v0, "layoutList"

    .line 22
    .line 23
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    move-object v0, v1

    .line 27
    :cond_1
    const/4 v2, 0x0

    .line 28
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->o:Landroid/widget/ImageView;

    .line 32
    .line 33
    const-string v2, "ivFlipCard"

    .line 34
    .line 35
    if-nez v0, :cond_2

    .line 36
    .line 37
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    move-object v0, v1

    .line 41
    :cond_2
    const/4 v3, 0x0

    .line 42
    invoke-virtual {v0, v3}, Landroid/view/View;->setRotationY(F)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->o:Landroid/widget/ImageView;

    .line 46
    .line 47
    if-nez v0, :cond_3

    .line 48
    .line 49
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    move-object v0, v1

    .line 53
    :cond_3
    sget v2, Lcom/friday/lecture/R$drawable;->random_flip2:I

    .line 54
    .line 55
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->p:Landroid/widget/TextView;

    .line 59
    .line 60
    if-nez v0, :cond_4

    .line 61
    .line 62
    const-string v0, "tvRandomName"

    .line 63
    .line 64
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_4
    move-object v1, v0

    .line 69
    :goto_0
    const-string v0, ""

    .line 70
    .line 71
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->N()V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public static final E(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;Landroid/view/View;)V
    .locals 5

    .line 1
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->k:Landroidx/viewpager/widget/ViewPager;

    .line 2
    .line 3
    const-string v0, "viewPager"

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    move-object p1, v1

    .line 12
    :cond_0
    invoke-virtual {p1}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-lez p1, :cond_a

    .line 17
    .line 18
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->x:Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter;

    .line 19
    .line 20
    const-string v2, "mAdapter"

    .line 21
    .line 22
    if-nez p1, :cond_1

    .line 23
    .line 24
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    move-object p1, v1

    .line 28
    :cond_1
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iget-object v3, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->k:Landroidx/viewpager/widget/ViewPager;

    .line 33
    .line 34
    if-nez v3, :cond_2

    .line 35
    .line 36
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    move-object v3, v1

    .line 40
    :cond_2
    invoke-virtual {v3}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$a;

    .line 49
    .line 50
    invoke-virtual {p1}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$a;->a()Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p1}, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->A()V

    .line 55
    .line 56
    .line 57
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->k:Landroidx/viewpager/widget/ViewPager;

    .line 58
    .line 59
    if-nez p1, :cond_3

    .line 60
    .line 61
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    move-object p1, v1

    .line 65
    :cond_3
    iget-object v3, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->k:Landroidx/viewpager/widget/ViewPager;

    .line 66
    .line 67
    if-nez v3, :cond_4

    .line 68
    .line 69
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    move-object v3, v1

    .line 73
    :cond_4
    invoke-virtual {v3}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    add-int/lit8 v3, v3, -0x1

    .line 78
    .line 79
    const/4 v4, 0x0

    .line 80
    invoke-virtual {p1, v3, v4}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(IZ)V

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->x:Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter;

    .line 84
    .line 85
    if-nez p1, :cond_5

    .line 86
    .line 87
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    move-object p1, v1

    .line 91
    :cond_5
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    iget-object v3, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->k:Landroidx/viewpager/widget/ViewPager;

    .line 96
    .line 97
    if-nez v3, :cond_6

    .line 98
    .line 99
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    move-object v3, v1

    .line 103
    :cond_6
    invoke-virtual {v3}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    check-cast p1, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$a;

    .line 112
    .line 113
    invoke-virtual {p1}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$a;->a()Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-virtual {p1}, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->B()V

    .line 118
    .line 119
    .line 120
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->i:Landroid/widget/TextView;

    .line 121
    .line 122
    if-eqz p1, :cond_a

    .line 123
    .line 124
    iget-object v3, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->x:Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter;

    .line 125
    .line 126
    if-nez v3, :cond_7

    .line 127
    .line 128
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    move-object v3, v1

    .line 132
    :cond_7
    invoke-virtual {v3}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    iget-object p0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->k:Landroidx/viewpager/widget/ViewPager;

    .line 137
    .line 138
    if-nez p0, :cond_8

    .line 139
    .line 140
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    move-object p0, v1

    .line 144
    :cond_8
    invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    .line 145
    .line 146
    .line 147
    move-result p0

    .line 148
    invoke-interface {v2, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    check-cast p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$a;

    .line 153
    .line 154
    invoke-virtual {p0}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$a;->b()Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    invoke-virtual {p0}, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;->getStudent()Lcom/friday/common/classtest/MqttResponse$Student;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    if-eqz p0, :cond_9

    .line 163
    .line 164
    invoke-virtual {p0}, Lcom/friday/common/classtest/MqttResponse$Student;->getStudentName()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    :cond_9
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 169
    .line 170
    .line 171
    :cond_a
    return-void
.end method

.method public static final F(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;Landroid/view/View;)V
    .locals 5

    .line 1
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->k:Landroidx/viewpager/widget/ViewPager;

    .line 2
    .line 3
    const-string v0, "viewPager"

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    move-object p1, v1

    .line 12
    :cond_0
    invoke-virtual {p1}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    iget-object v2, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->x:Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter;

    .line 17
    .line 18
    const-string v3, "mAdapter"

    .line 19
    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    invoke-static {v3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    move-object v2, v1

    .line 26
    :cond_1
    invoke-virtual {v2}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    add-int/lit8 v2, v2, -0x1

    .line 35
    .line 36
    if-gt p1, v2, :cond_b

    .line 37
    .line 38
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->x:Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter;

    .line 39
    .line 40
    if-nez p1, :cond_2

    .line 41
    .line 42
    invoke-static {v3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    move-object p1, v1

    .line 46
    :cond_2
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iget-object v2, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->k:Landroidx/viewpager/widget/ViewPager;

    .line 51
    .line 52
    if-nez v2, :cond_3

    .line 53
    .line 54
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    move-object v2, v1

    .line 58
    :cond_3
    invoke-virtual {v2}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    check-cast p1, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$a;

    .line 67
    .line 68
    invoke-virtual {p1}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$a;->a()Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p1}, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->A()V

    .line 73
    .line 74
    .line 75
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->k:Landroidx/viewpager/widget/ViewPager;

    .line 76
    .line 77
    if-nez p1, :cond_4

    .line 78
    .line 79
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    move-object p1, v1

    .line 83
    :cond_4
    iget-object v2, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->k:Landroidx/viewpager/widget/ViewPager;

    .line 84
    .line 85
    if-nez v2, :cond_5

    .line 86
    .line 87
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    move-object v2, v1

    .line 91
    :cond_5
    invoke-virtual {v2}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    add-int/lit8 v2, v2, 0x1

    .line 96
    .line 97
    const/4 v4, 0x0

    .line 98
    invoke-virtual {p1, v2, v4}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(IZ)V

    .line 99
    .line 100
    .line 101
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->x:Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter;

    .line 102
    .line 103
    if-nez p1, :cond_6

    .line 104
    .line 105
    invoke-static {v3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    move-object p1, v1

    .line 109
    :cond_6
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    iget-object v2, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->k:Landroidx/viewpager/widget/ViewPager;

    .line 114
    .line 115
    if-nez v2, :cond_7

    .line 116
    .line 117
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    move-object v2, v1

    .line 121
    :cond_7
    invoke-virtual {v2}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    check-cast p1, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$a;

    .line 130
    .line 131
    invoke-virtual {p1}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$a;->a()Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    invoke-virtual {p1}, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->B()V

    .line 136
    .line 137
    .line 138
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->i:Landroid/widget/TextView;

    .line 139
    .line 140
    if-eqz p1, :cond_b

    .line 141
    .line 142
    iget-object v2, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->x:Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter;

    .line 143
    .line 144
    if-nez v2, :cond_8

    .line 145
    .line 146
    invoke-static {v3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    move-object v2, v1

    .line 150
    :cond_8
    invoke-virtual {v2}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    iget-object p0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->k:Landroidx/viewpager/widget/ViewPager;

    .line 155
    .line 156
    if-nez p0, :cond_9

    .line 157
    .line 158
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    move-object p0, v1

    .line 162
    :cond_9
    invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    .line 163
    .line 164
    .line 165
    move-result p0

    .line 166
    invoke-interface {v2, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    check-cast p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$a;

    .line 171
    .line 172
    invoke-virtual {p0}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$a;->b()Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    invoke-virtual {p0}, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;->getStudent()Lcom/friday/common/classtest/MqttResponse$Student;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    if-eqz p0, :cond_a

    .line 181
    .line 182
    invoke-virtual {p0}, Lcom/friday/common/classtest/MqttResponse$Student;->getStudentName()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    :cond_a
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 187
    .line 188
    .line 189
    :cond_b
    return-void
.end method

.method public static final G(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->j:Landroid/view/View;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 7
    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public static final H(Landroid/view/View;Landroid/view/View;)V
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

.method public static final I(Landroid/view/View;Landroid/view/View;)V
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

.method public static final J(Landroid/view/View;)V
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

.method public static final K(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;)V
    .locals 4

    .line 1
    iget-object p0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->x:Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-nez p0, :cond_0

    .line 5
    .line 6
    const-string p0, "mAdapter"

    .line 7
    .line 8
    invoke-static {p0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    move-object p0, v0

    .line 12
    :cond_0
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Ljava/lang/Iterable;

    .line 17
    .line 18
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    move-object v2, v1

    .line 33
    check-cast v2, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$a;

    .line 34
    .line 35
    invoke-virtual {v2}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$a;->b()Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v2}, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;->getRemoteUrl()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {p1}, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;->getRemoteUrl()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_1

    .line 52
    .line 53
    move-object v0, v1

    .line 54
    :cond_2
    check-cast v0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$a;

    .line 55
    .line 56
    if-eqz v0, :cond_4

    .line 57
    .line 58
    invoke-virtual {v0}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$a;->b()Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {p0}, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;->getLocalPath()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    if-nez p0, :cond_3

    .line 71
    .line 72
    invoke-virtual {v0}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$a;->b()Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-virtual {p0}, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;->getLocalPath()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-static {p0}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    if-nez p0, :cond_4

    .line 85
    .line 86
    :cond_3
    invoke-virtual {v0}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$a;->b()Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-virtual {p1}, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;->getLocalPath()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-virtual {p0, p1}, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;->setLocalPath(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    :cond_4
    return-void
.end method

.method public static synthetic d(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->y(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V

    return-void
.end method

.method public static synthetic e(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->w(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic f(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->G(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic g(Landroid/view/View;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->H(Landroid/view/View;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic h(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->K(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;)V

    return-void
.end method

.method public static synthetic i(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->D(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;)V

    return-void
.end method

.method public static synthetic j(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->F(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic k(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->z(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic l(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;Landroid/animation/ValueAnimator;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->B(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static synthetic m(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->A(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic n(Landroid/view/View;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->I(Landroid/view/View;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic o(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->C(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;)V

    return-void
.end method

.method public static synthetic p(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->x(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic q(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->E(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic r(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->J(Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic s(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;)Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->x:Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic t(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->s:Z

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic u(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->N()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final v()V
    .locals 12

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget v1, Lcom/friday/lecture/R$layout;->window_subjective_answer:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 13
    .line 14
    .line 15
    sget v0, Lcom/friday/lecture/R$id;->cv_stop_answer:I

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Landroid/widget/TextView;

    .line 22
    .line 23
    iput-object v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->d:Landroid/widget/TextView;

    .line 24
    .line 25
    sget v0, Lcom/friday/lecture/R$id;->cv_end_class:I

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Landroid/widget/TextView;

    .line 32
    .line 33
    iput-object v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->e:Landroid/widget/TextView;

    .line 34
    .line 35
    sget v0, Lcom/friday/lecture/R$id;->tv_submit_count_after:I

    .line 36
    .line 37
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Landroid/widget/TextView;

    .line 42
    .line 43
    iput-object v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->f:Landroid/widget/TextView;

    .line 44
    .line 45
    sget v0, Lcom/friday/lecture/R$id;->rv_answer:I

    .line 46
    .line 47
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 52
    .line 53
    iput-object v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 54
    .line 55
    sget v0, Lcom/friday/lecture/R$id;->iv_close_subjective:I

    .line 56
    .line 57
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast v0, Landroid/widget/ImageView;

    .line 62
    .line 63
    iput-object v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->h:Landroid/widget/ImageView;

    .line 64
    .line 65
    sget v0, Lcom/friday/lecture/R$id;->cl_anim:I

    .line 66
    .line 67
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    const-string v1, "findViewById(...)"

    .line 72
    .line 73
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 77
    .line 78
    iput-object v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->l:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 79
    .line 80
    sget v0, Lcom/friday/lecture/R$id;->ll_random:I

    .line 81
    .line 82
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    check-cast v0, Landroid/widget/LinearLayout;

    .line 90
    .line 91
    iput-object v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->m:Landroid/widget/LinearLayout;

    .line 92
    .line 93
    sget v0, Lcom/friday/lecture/R$id;->iv_flip_card:I

    .line 94
    .line 95
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    check-cast v0, Landroid/widget/ImageView;

    .line 103
    .line 104
    iput-object v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->o:Landroid/widget/ImageView;

    .line 105
    .line 106
    sget v0, Lcom/friday/lecture/R$id;->tv_random_name:I

    .line 107
    .line 108
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    check-cast v0, Landroid/widget/TextView;

    .line 116
    .line 117
    iput-object v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->p:Landroid/widget/TextView;

    .line 118
    .line 119
    sget v0, Lcom/friday/lecture/R$id;->layout_list:I

    .line 120
    .line 121
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    iput-object v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->q:Landroid/view/View;

    .line 129
    .line 130
    sget v0, Lcom/friday/lecture/R$id;->layout_detail:I

    .line 131
    .line 132
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    iput-object v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->r:Landroid/view/View;

    .line 140
    .line 141
    sget v0, Lcom/friday/lecture/R$id;->layout_random:I

    .line 142
    .line 143
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    iput-object v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->n:Landroid/view/View;

    .line 151
    .line 152
    sget v0, Lcom/friday/lecture/R$id;->layout_end_class:I

    .line 153
    .line 154
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    sget v3, Lcom/friday/lecture/R$id;->layout_time_up:I

    .line 159
    .line 160
    invoke-virtual {p0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    iput-object v3, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->j:Landroid/view/View;

    .line 165
    .line 166
    sget v3, Lcom/friday/lecture/R$id;->tv_end_class_cancel:I

    .line 167
    .line 168
    invoke-virtual {p0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    sget v4, Lcom/friday/lecture/R$id;->tv_end_class_ensure:I

    .line 173
    .line 174
    invoke-virtual {p0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    sget v5, Lcom/friday/lecture/R$id;->tv_time_up_ensure:I

    .line 179
    .line 180
    invoke-virtual {p0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 181
    .line 182
    .line 183
    move-result-object v5

    .line 184
    sget v6, Lcom/friday/lecture/R$id;->tv_time_up_cancel:I

    .line 185
    .line 186
    invoke-virtual {p0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 187
    .line 188
    .line 189
    move-result-object v6

    .line 190
    sget v7, Lcom/friday/lecture/R$id;->tv_name:I

    .line 191
    .line 192
    invoke-virtual {p0, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 193
    .line 194
    .line 195
    move-result-object v7

    .line 196
    check-cast v7, Landroid/widget/TextView;

    .line 197
    .line 198
    iput-object v7, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->i:Landroid/widget/TextView;

    .line 199
    .line 200
    new-instance v7, Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter;

    .line 201
    .line 202
    sget v8, Lcom/friday/lecture/R$layout;->item_student_answer:I

    .line 203
    .line 204
    invoke-direct {v7, v8}, Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter;-><init>(I)V

    .line 205
    .line 206
    .line 207
    iput-object v7, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->x:Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter;

    .line 208
    .line 209
    iget-object v7, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->m:Landroid/widget/LinearLayout;

    .line 210
    .line 211
    if-nez v7, :cond_0

    .line 212
    .line 213
    const-string v7, "llRandom"

    .line 214
    .line 215
    invoke-static {v7}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    move-object v7, v2

    .line 219
    :cond_0
    new-instance v8, Li3/x;

    .line 220
    .line 221
    invoke-direct {v8, p0}, Li3/x;-><init>(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;)V

    .line 222
    .line 223
    .line 224
    const-wide/16 v9, 0xbb8

    .line 225
    .line 226
    invoke-static {v7, v9, v10, v8}, Lcom/blankj/utilcode/util/ClickUtils;->applySingleDebouncing(Landroid/view/View;JLandroid/view/View$OnClickListener;)V

    .line 227
    .line 228
    .line 229
    sget v7, Lcom/friday/lecture/R$id;->view_pager:I

    .line 230
    .line 231
    invoke-virtual {p0, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 232
    .line 233
    .line 234
    move-result-object v7

    .line 235
    invoke-static {v7, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    check-cast v7, Landroidx/viewpager/widget/ViewPager;

    .line 239
    .line 240
    iput-object v7, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->k:Landroidx/viewpager/widget/ViewPager;

    .line 241
    .line 242
    if-nez v7, :cond_1

    .line 243
    .line 244
    const-string v1, "viewPager"

    .line 245
    .line 246
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    move-object v7, v2

    .line 250
    :cond_1
    new-instance v1, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$initView$2;

    .line 251
    .line 252
    invoke-direct {v1, p0}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$initView$2;-><init>(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v7, v1}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    .line 256
    .line 257
    .line 258
    sget v1, Lcom/friday/lecture/R$id;->iv_prev:I

    .line 259
    .line 260
    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    new-instance v7, Li3/z;

    .line 265
    .line 266
    invoke-direct {v7, p0}, Li3/z;-><init>(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v1, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 270
    .line 271
    .line 272
    sget v1, Lcom/friday/lecture/R$id;->iv_next:I

    .line 273
    .line 274
    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    new-instance v7, Li3/a0;

    .line 279
    .line 280
    invoke-direct {v7, p0}, Li3/a0;-><init>(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v1, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 284
    .line 285
    .line 286
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->d:Landroid/widget/TextView;

    .line 287
    .line 288
    if-eqz v1, :cond_2

    .line 289
    .line 290
    new-instance v7, Li3/b0;

    .line 291
    .line 292
    invoke-direct {v7, p0}, Li3/b0;-><init>(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v1, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 296
    .line 297
    .line 298
    :cond_2
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->e:Landroid/widget/TextView;

    .line 299
    .line 300
    if-eqz v1, :cond_3

    .line 301
    .line 302
    new-instance v7, Li3/c0;

    .line 303
    .line 304
    invoke-direct {v7, v0}, Li3/c0;-><init>(Landroid/view/View;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v1, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 308
    .line 309
    .line 310
    :cond_3
    new-instance v1, Li3/d0;

    .line 311
    .line 312
    invoke-direct {v1, v0}, Li3/d0;-><init>(Landroid/view/View;)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v3, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 316
    .line 317
    .line 318
    new-instance v0, Li3/e0;

    .line 319
    .line 320
    invoke-direct {v0}, Li3/e0;-><init>()V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v4, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 324
    .line 325
    .line 326
    new-instance v0, Li3/f0;

    .line 327
    .line 328
    invoke-direct {v0, p0}, Li3/f0;-><init>(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v6, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 332
    .line 333
    .line 334
    new-instance v0, Li3/s;

    .line 335
    .line 336
    invoke-direct {v0, p0}, Li3/s;-><init>(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v5, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 340
    .line 341
    .line 342
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->d:Landroid/widget/TextView;

    .line 343
    .line 344
    if-eqz v0, :cond_4

    .line 345
    .line 346
    const/4 v1, 0x0

    .line 347
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 348
    .line 349
    .line 350
    :cond_4
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 351
    .line 352
    if-eqz v0, :cond_8

    .line 353
    .line 354
    new-instance v1, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 355
    .line 356
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 357
    .line 358
    .line 359
    move-result-object v3

    .line 360
    const/4 v4, 0x4

    .line 361
    invoke-direct {v1, v3, v4}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 365
    .line 366
    .line 367
    new-instance v5, Lcom/friday/common/helper/GridSpacingItemDecoration;

    .line 368
    .line 369
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 370
    .line 371
    .line 372
    move-result-object v1

    .line 373
    sget v3, Lcom/friday/lecture/R$dimen;->view_17:I

    .line 374
    .line 375
    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimension(I)F

    .line 376
    .line 377
    .line 378
    move-result v1

    .line 379
    float-to-int v7, v1

    .line 380
    const/16 v10, 0x8

    .line 381
    .line 382
    const/4 v11, 0x0

    .line 383
    const/4 v6, 0x4

    .line 384
    const/4 v8, 0x0

    .line 385
    const/4 v9, 0x0

    .line 386
    invoke-direct/range {v5 .. v11}, Lcom/friday/common/helper/GridSpacingItemDecoration;-><init>(IIZZILkotlin/jvm/internal/n;)V

    .line 387
    .line 388
    .line 389
    invoke-virtual {v0, v5}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 390
    .line 391
    .line 392
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->x:Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter;

    .line 393
    .line 394
    const-string v3, "mAdapter"

    .line 395
    .line 396
    if-nez v1, :cond_5

    .line 397
    .line 398
    invoke-static {v3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    move-object v1, v2

    .line 402
    :cond_5
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 403
    .line 404
    .line 405
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    sget v1, Lcom/friday/lecture/R$layout;->empty_view_no_answer:I

    .line 410
    .line 411
    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->x:Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter;

    .line 416
    .line 417
    if-nez v1, :cond_6

    .line 418
    .line 419
    invoke-static {v3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 420
    .line 421
    .line 422
    move-object v1, v2

    .line 423
    :cond_6
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 424
    .line 425
    .line 426
    invoke-virtual {v1, v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setEmptyView(Landroid/view/View;)V

    .line 427
    .line 428
    .line 429
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->x:Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter;

    .line 430
    .line 431
    if-nez v0, :cond_7

    .line 432
    .line 433
    invoke-static {v3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 434
    .line 435
    .line 436
    goto :goto_0

    .line 437
    :cond_7
    move-object v2, v0

    .line 438
    :goto_0
    new-instance v0, Li3/t;

    .line 439
    .line 440
    invoke-direct {v0, p0}, Li3/t;-><init>(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;)V

    .line 441
    .line 442
    .line 443
    invoke-virtual {v2, v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setOnItemClickListener(Lo1/d;)V

    .line 444
    .line 445
    .line 446
    :cond_8
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->h:Landroid/widget/ImageView;

    .line 447
    .line 448
    if-eqz v0, :cond_9

    .line 449
    .line 450
    new-instance v1, Li3/y;

    .line 451
    .line 452
    invoke-direct {v1}, Li3/y;-><init>()V

    .line 453
    .line 454
    .line 455
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 456
    .line 457
    .line 458
    :cond_9
    return-void
.end method

.method public static final w(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->j:Landroid/view/View;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/16 p1, 0x8

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public static final x(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;Landroid/view/View;)V
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
    invoke-virtual {p0}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->L()V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public static final y(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 1

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
    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->s:Z

    .line 11
    .line 12
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->x:Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter;

    .line 13
    .line 14
    const/4 p2, 0x0

    .line 15
    const-string v0, "mAdapter"

    .line 16
    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    move-object p1, p2

    .line 23
    :cond_0
    invoke-virtual {p1, p3}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$a;

    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$a;->b()Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->u:Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;

    .line 34
    .line 35
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->x:Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter;

    .line 36
    .line 37
    if-nez p1, :cond_1

    .line 38
    .line 39
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    move-object p2, p1

    .line 44
    :goto_0
    invoke-virtual {p2}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    check-cast p1, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$a;

    .line 53
    .line 54
    iput-object p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->v:Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$a;

    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->N()V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public static final z(Landroid/view/View;)V
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


# virtual methods
.method public final L()V
    .locals 2

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
    iput-boolean v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->t:Z

    .line 8
    .line 9
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->j:Landroid/view/View;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/16 v1, 0x8

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->d:Landroid/widget/TextView;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 24
    .line 25
    .line 26
    :cond_1
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->d:Landroid/widget/TextView;

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    const-string v1, "#7B7B7B"

    .line 31
    .line 32
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 37
    .line 38
    .line 39
    :cond_2
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->d:Landroid/widget/TextView;

    .line 40
    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    const-string v1, "\u5df2\u622a\u6b62"

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 46
    .line 47
    .line 48
    :cond_3
    return-void
.end method

.method public final M(Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;)V
    .locals 7

    .line 1
    const-string v0, "subjectiveHomeworkAnswer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->x:Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter;

    .line 7
    .line 8
    const-string v1, "mAdapter"

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    move-object v0, v2

    .line 17
    :cond_0
    invoke-virtual {v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Ljava/lang/Iterable;

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_4

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    move-object v4, v3

    .line 38
    check-cast v4, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$a;

    .line 39
    .line 40
    invoke-virtual {v4}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$a;->b()Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-virtual {v4}, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;->getStudent()Lcom/friday/common/classtest/MqttResponse$Student;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    if-eqz v4, :cond_2

    .line 49
    .line 50
    invoke-virtual {v4}, Lcom/friday/common/classtest/MqttResponse$Student;->getStudentId()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    goto :goto_0

    .line 55
    :cond_2
    move-object v4, v2

    .line 56
    :goto_0
    invoke-virtual {p1}, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;->getStudent()Lcom/friday/common/classtest/MqttResponse$Student;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    if-eqz v5, :cond_3

    .line 61
    .line 62
    invoke-virtual {v5}, Lcom/friday/common/classtest/MqttResponse$Student;->getStudentId()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    goto :goto_1

    .line 67
    :cond_3
    move-object v5, v2

    .line 68
    :goto_1
    invoke-static {v4, v5}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-eqz v4, :cond_1

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_4
    move-object v3, v2

    .line 76
    :goto_2
    check-cast v3, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$a;

    .line 77
    .line 78
    iget-boolean v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->t:Z

    .line 79
    .line 80
    const/4 v4, 0x1

    .line 81
    if-nez v0, :cond_8

    .line 82
    .line 83
    if-nez v3, :cond_8

    .line 84
    .line 85
    new-instance v0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$a;

    .line 86
    .line 87
    new-instance v3, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;

    .line 88
    .line 89
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    const-string v6, "getContext(...)"

    .line 94
    .line 95
    invoke-static {v5, v6}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-direct {v3, v5, v4}, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;-><init>(Landroid/content/Context;Z)V

    .line 99
    .line 100
    .line 101
    invoke-direct {v0, v3, p1}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$a;-><init>(Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;)V

    .line 102
    .line 103
    .line 104
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->x:Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter;

    .line 105
    .line 106
    if-nez p1, :cond_5

    .line 107
    .line 108
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    move-object p1, v2

    .line 112
    :cond_5
    invoke-virtual {p1, v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->addData(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->k:Landroidx/viewpager/widget/ViewPager;

    .line 116
    .line 117
    if-nez p1, :cond_6

    .line 118
    .line 119
    const-string p1, "viewPager"

    .line 120
    .line 121
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_6
    move-object v2, p1

    .line 126
    :goto_3
    invoke-virtual {v2}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Landroidx/viewpager/widget/PagerAdapter;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    if-eqz p1, :cond_7

    .line 131
    .line 132
    invoke-virtual {p1}, Landroidx/viewpager/widget/PagerAdapter;->notifyDataSetChanged()V

    .line 133
    .line 134
    .line 135
    :cond_7
    iget p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->w:I

    .line 136
    .line 137
    add-int/2addr p1, v4

    .line 138
    iput p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->w:I

    .line 139
    .line 140
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->f:Landroid/widget/TextView;

    .line 141
    .line 142
    if-eqz v0, :cond_8

    .line 143
    .line 144
    new-instance v1, Ljava/lang/StringBuilder;

    .line 145
    .line 146
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 147
    .line 148
    .line 149
    const-string v2, "\u5df2\u63d0\u4ea4: "

    .line 150
    .line 151
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 162
    .line 163
    .line 164
    :cond_8
    iget p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->w:I

    .line 165
    .line 166
    if-ne p1, v4, :cond_a

    .line 167
    .line 168
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->d:Landroid/widget/TextView;

    .line 169
    .line 170
    if-eqz p1, :cond_9

    .line 171
    .line 172
    invoke-virtual {p1, v4}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 173
    .line 174
    .line 175
    :cond_9
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->d:Landroid/widget/TextView;

    .line 176
    .line 177
    if-eqz p1, :cond_a

    .line 178
    .line 179
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    sget v1, Lcom/friday/lecture/R$color;->colorPrimary:I

    .line 184
    .line 185
    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 190
    .line 191
    .line 192
    :cond_a
    return-void
.end method

.method public final N()V
    .locals 7

    .line 1
    iget-boolean v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->s:Z

    .line 2
    .line 3
    const-string v1, "layoutRandom"

    .line 4
    .line 5
    const-string v2, "layoutDetail"

    .line 6
    .line 7
    const-string v3, "layoutList"

    .line 8
    .line 9
    const/16 v4, 0x8

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x0

    .line 13
    if-nez v0, :cond_3

    .line 14
    .line 15
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->q:Landroid/view/View;

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    invoke-static {v3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    move-object v0, v6

    .line 23
    :cond_0
    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->r:Landroid/view/View;

    .line 27
    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    move-object v0, v6

    .line 34
    :cond_1
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->n:Landroid/view/View;

    .line 38
    .line 39
    if-nez v0, :cond_2

    .line 40
    .line 41
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    move-object v6, v0

    .line 46
    :goto_0
    invoke-virtual {v6, v5}, Landroid/view/View;->setVisibility(I)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_3
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->q:Landroid/view/View;

    .line 51
    .line 52
    if-nez v0, :cond_4

    .line 53
    .line 54
    invoke-static {v3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    move-object v0, v6

    .line 58
    :cond_4
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 59
    .line 60
    .line 61
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->n:Landroid/view/View;

    .line 62
    .line 63
    if-nez v0, :cond_5

    .line 64
    .line 65
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    move-object v0, v6

    .line 69
    :cond_5
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 70
    .line 71
    .line 72
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->r:Landroid/view/View;

    .line 73
    .line 74
    if-nez v0, :cond_6

    .line 75
    .line 76
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    move-object v0, v6

    .line 80
    :cond_6
    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 81
    .line 82
    .line 83
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->i:Landroid/widget/TextView;

    .line 84
    .line 85
    if-eqz v0, :cond_8

    .line 86
    .line 87
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->u:Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;

    .line 88
    .line 89
    if-eqz v1, :cond_7

    .line 90
    .line 91
    invoke-virtual {v1}, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;->getStudent()Lcom/friday/common/classtest/MqttResponse$Student;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    if-eqz v1, :cond_7

    .line 96
    .line 97
    invoke-virtual {v1}, Lcom/friday/common/classtest/MqttResponse$Student;->getStudentName()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    goto :goto_1

    .line 102
    :cond_7
    move-object v1, v6

    .line 103
    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 104
    .line 105
    .line 106
    :cond_8
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->k:Landroidx/viewpager/widget/ViewPager;

    .line 107
    .line 108
    const-string v1, "viewPager"

    .line 109
    .line 110
    if-nez v0, :cond_9

    .line 111
    .line 112
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    move-object v0, v6

    .line 116
    :cond_9
    iget-object v2, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->x:Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter;

    .line 117
    .line 118
    const-string v3, "mAdapter"

    .line 119
    .line 120
    if-nez v2, :cond_a

    .line 121
    .line 122
    invoke-static {v3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    move-object v2, v6

    .line 126
    :cond_a
    invoke-virtual {v2}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    iget-object v4, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->v:Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$a;

    .line 131
    .line 132
    invoke-static {v2, v4}, Lrc/g0;->r0(Ljava/util/List;Ljava/lang/Object;)I

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    invoke-virtual {v0, v2, v5}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(IZ)V

    .line 137
    .line 138
    .line 139
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->x:Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter;

    .line 140
    .line 141
    if-nez v0, :cond_b

    .line 142
    .line 143
    invoke-static {v3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    move-object v0, v6

    .line 147
    :cond_b
    invoke-virtual {v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    iget-object v2, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->k:Landroidx/viewpager/widget/ViewPager;

    .line 152
    .line 153
    if-nez v2, :cond_c

    .line 154
    .line 155
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_c
    move-object v6, v2

    .line 160
    :goto_2
    invoke-virtual {v6}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    check-cast v0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$a;

    .line 169
    .line 170
    invoke-virtual {v0}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$a;->a()Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-virtual {v0}, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->B()V

    .line 175
    .line 176
    .line 177
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
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/friday/lecture/widget/LifecycleFrameLayout;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    const-string v0, "updateTestLocalPath"

    .line 5
    .line 6
    const-class v1, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;

    .line 7
    .line 8
    invoke-static {v0, v1}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, Li3/r;

    .line 13
    .line 14
    invoke-direct {v1, p0}, Li3/r;-><init>(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v0, p0, v1}, Lcom/jeremyliao/liveeventbus/core/Observable;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
