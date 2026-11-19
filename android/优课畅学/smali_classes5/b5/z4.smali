.class public final synthetic Lb5/z4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb5/z4;->a:Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lb5/z4;->a:Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;

    invoke-static {v0, p1, p2}, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;->p(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method
