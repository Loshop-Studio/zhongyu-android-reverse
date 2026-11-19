.class public final Landroidx/core/animation/AnimatorKt$addListener$listener$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/core/animation/AnimatorKt;->addListener(Landroid/animation/Animator;Lhd/l;Lhd/l;Lhd/l;Lhd/l;)Landroid/animation/Animator$AnimatorListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $onCancel:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field final synthetic $onEnd:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field final synthetic $onRepeat:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field final synthetic $onStart:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lhd/l;Lhd/l;Lhd/l;Lhd/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            "Lhd/l;",
            "Lhd/l;",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/core/animation/AnimatorKt$addListener$listener$1;->$onRepeat:Lhd/l;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/core/animation/AnimatorKt$addListener$listener$1;->$onEnd:Lhd/l;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/core/animation/AnimatorKt$addListener$listener$1;->$onCancel:Lhd/l;

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/core/animation/AnimatorKt$addListener$listener$1;->$onStart:Lhd/l;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/core/animation/AnimatorKt$addListener$listener$1;->$onCancel:Lhd/l;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/core/animation/AnimatorKt$addListener$listener$1;->$onEnd:Lhd/l;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/core/animation/AnimatorKt$addListener$listener$1;->$onRepeat:Lhd/l;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/core/animation/AnimatorKt$addListener$listener$1;->$onStart:Lhd/l;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method
