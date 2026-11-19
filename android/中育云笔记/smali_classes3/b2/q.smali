.class public final synthetic Lb2/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic c:Lcom/friday/common/camera/ImagePickFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/common/camera/ImagePickFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb2/q;->c:Lcom/friday/common/camera/ImagePickFragment;

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lb2/q;->c:Lcom/friday/common/camera/ImagePickFragment;

    invoke-static {v0, p1, p2}, Lcom/friday/common/camera/ImagePickFragment;->q(Lcom/friday/common/camera/ImagePickFragment;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method
