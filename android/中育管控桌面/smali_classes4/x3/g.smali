.class public final synthetic Lx3/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx3/g;->a:Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lx3/g;->a:Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;

    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->i(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;Landroid/animation/ValueAnimator;)V

    return-void
.end method
