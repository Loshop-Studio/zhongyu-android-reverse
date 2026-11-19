.class public Lcom/luck/picture/lib/animators/SlideInBottomAnimationAdapter;
.super Lcom/luck/picture/lib/animators/BaseAnimationAdapter;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/luck/picture/lib/animators/BaseAnimationAdapter;-><init>(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)[Landroid/animation/Animator;
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-float v0, v0

    .line 6
    const/4 v1, 0x2

    .line 7
    new-array v1, v1, [F

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    aput v0, v1, v2

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    const/4 v3, 0x0

    .line 14
    aput v3, v1, v0

    .line 15
    .line 16
    const-string v3, "translationY"

    .line 17
    .line 18
    invoke-static {p1, v3, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    new-array v0, v0, [Landroid/animation/Animator;

    .line 23
    .line 24
    aput-object p1, v0, v2

    .line 25
    .line 26
    return-object v0
.end method
