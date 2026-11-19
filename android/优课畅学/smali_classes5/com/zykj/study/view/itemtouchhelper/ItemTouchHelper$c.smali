.class public abstract Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public final a:F

.field public final b:F

.field public final c:F

.field public final d:F

.field public final e:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

.field public final f:I

.field public final g:Landroid/animation/ValueAnimator;

.field public final h:I

.field public i:Z

.field public j:Z

.field public k:Z

.field public l:F

.field public final synthetic m:Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;


# direct methods
.method public constructor <init>(Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIFFFF)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$c;->m:Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$c;->j:Z

    .line 8
    .line 9
    iput-boolean v0, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$c;->k:Z

    .line 10
    .line 11
    iput p4, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$c;->f:I

    .line 12
    .line 13
    iput p3, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$c;->h:I

    .line 14
    .line 15
    iput-object p2, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$c;->e:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 16
    .line 17
    iput p5, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$c;->a:F

    .line 18
    .line 19
    iput p6, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$c;->b:F

    .line 20
    .line 21
    iput p7, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$c;->c:F

    .line 22
    .line 23
    iput p8, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$c;->d:F

    .line 24
    .line 25
    const/4 p3, 0x2

    .line 26
    new-array p3, p3, [F

    .line 27
    .line 28
    fill-array-data p3, :array_0

    .line 29
    .line 30
    .line 31
    invoke-static {p3}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    iput-object p3, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$c;->g:Landroid/animation/ValueAnimator;

    .line 36
    .line 37
    new-instance p4, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$c$a;

    .line 38
    .line 39
    invoke-direct {p4, p0, p1}, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$c$a;-><init>(Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$c;Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p3, p4}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p2, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 46
    .line 47
    invoke-virtual {p3, p1}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p3, p0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 51
    .line 52
    .line 53
    const/4 p1, 0x0

    .line 54
    invoke-virtual {p0, p1}, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$c;->b(F)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    nop

    .line 59
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$c;->g:Landroid/animation/ValueAnimator;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$c;->l:F

    .line 2
    .line 3
    return-void
.end method

.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    .line 1
    const/high16 p1, 0x3f800000    # 1.0f

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$c;->b(F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-boolean p1, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$c;->k:Z

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    iget-object p1, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$c;->e:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->setIsRecyclable(Z)V

    .line 9
    .line 10
    .line 11
    :cond_0
    iput-boolean v0, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$c;->k:Z

    .line 12
    .line 13
    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method
