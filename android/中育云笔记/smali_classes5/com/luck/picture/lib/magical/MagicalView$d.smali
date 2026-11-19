.class public Lcom/luck/picture/lib/magical/MagicalView$d;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luck/picture/lib/magical/MagicalView;->v()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/luck/picture/lib/magical/MagicalView;


# direct methods
.method public constructor <init>(Lcom/luck/picture/lib/magical/MagicalView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/magical/MagicalView$d;->a:Lcom/luck/picture/lib/magical/MagicalView;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/luck/picture/lib/magical/MagicalView$d;->a:Lcom/luck/picture/lib/magical/MagicalView;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/luck/picture/lib/magical/MagicalView;->g(Lcom/luck/picture/lib/magical/MagicalView;)Lt6/c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lcom/luck/picture/lib/magical/MagicalView$d;->a:Lcom/luck/picture/lib/magical/MagicalView;

    .line 10
    .line 11
    invoke-static {p1}, Lcom/luck/picture/lib/magical/MagicalView;->g(Lcom/luck/picture/lib/magical/MagicalView;)Lt6/c;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-interface {p1}, Lt6/c;->e()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method
