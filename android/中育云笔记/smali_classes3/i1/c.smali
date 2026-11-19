.class public final Li1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li1/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li1/c$a;
    }
.end annotation


# static fields
.field public static final b:Li1/c$a;


# instance fields
.field public final a:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Li1/c$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Li1/c$a;-><init>(Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Li1/c;->b:Li1/c$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(F)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Li1/c;->a:F

    return-void
.end method

.method public synthetic constructor <init>(FILkotlin/jvm/internal/n;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/high16 p1, 0x3f000000    # 0.5f

    .line 2
    :cond_0
    invoke-direct {p0, p1}, Li1/c;-><init>(F)V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)[Landroid/animation/Animator;
    .locals 10

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Li1/c;->a:F

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    new-array v2, v1, [F

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    aput v0, v2, v3

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    const/high16 v4, 0x3f800000    # 1.0f

    .line 16
    .line 17
    aput v4, v2, v0

    .line 18
    .line 19
    const-string v5, "scaleX"

    .line 20
    .line 21
    invoke-static {p1, v5, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    const-wide/16 v6, 0x12c

    .line 26
    .line 27
    invoke-virtual {v2, v6, v7}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 28
    .line 29
    .line 30
    new-instance v8, Landroid/view/animation/DecelerateInterpolator;

    .line 31
    .line 32
    invoke-direct {v8}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, v8}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 36
    .line 37
    .line 38
    iget v8, p0, Li1/c;->a:F

    .line 39
    .line 40
    new-array v9, v1, [F

    .line 41
    .line 42
    aput v8, v9, v3

    .line 43
    .line 44
    aput v4, v9, v0

    .line 45
    .line 46
    const-string v4, "scaleY"

    .line 47
    .line 48
    invoke-static {p1, v4, v9}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p1, v6, v7}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 53
    .line 54
    .line 55
    new-instance v6, Landroid/view/animation/DecelerateInterpolator;

    .line 56
    .line 57
    invoke-direct {v6}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, v6}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 61
    .line 62
    .line 63
    invoke-static {v2, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-static {p1, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    new-array v1, v1, [Landroid/animation/Animator;

    .line 70
    .line 71
    aput-object v2, v1, v3

    .line 72
    .line 73
    aput-object p1, v1, v0

    .line 74
    .line 75
    return-object v1
.end method
