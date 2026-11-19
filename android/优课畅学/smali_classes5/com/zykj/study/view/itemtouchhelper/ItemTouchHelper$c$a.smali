.class public Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$c;-><init>(Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIFFFF)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;

.field public final synthetic b:Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$c;


# direct methods
.method public constructor <init>(Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$c;Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$c$a;->b:Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$c;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$c$a;->a:Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$c$a;->b:Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$c;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {v0, p1}, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$c;->b(F)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
