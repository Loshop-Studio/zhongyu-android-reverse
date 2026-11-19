.class public final synthetic Lh3/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh3/g;->a:Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh3/g;->a:Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;

    invoke-static {v0, p1}, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->l(Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;Landroid/animation/ValueAnimator;)V

    return-void
.end method
