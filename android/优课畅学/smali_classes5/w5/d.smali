.class public final synthetic Lw5/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic a:Lw5/e;

.field public final synthetic b:Landroid/view/MotionEvent;


# direct methods
.method public synthetic constructor <init>(Lw5/e;Landroid/view/MotionEvent;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw5/d;->a:Lw5/e;

    iput-object p2, p0, Lw5/d;->b:Landroid/view/MotionEvent;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lw5/d;->a:Lw5/e;

    iget-object v1, p0, Lw5/d;->b:Landroid/view/MotionEvent;

    invoke-static {v0, v1}, Lw5/e;->d(Lw5/e;Landroid/view/MotionEvent;)Lh7/p;

    move-result-object v0

    return-object v0
.end method
