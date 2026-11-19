.class public final synthetic Lrb/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# instance fields
.field public final synthetic c:Lrb/e;

.field public final synthetic d:Landroid/view/MotionEvent;


# direct methods
.method public synthetic constructor <init>(Lrb/e;Landroid/view/MotionEvent;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrb/c;->c:Lrb/e;

    iput-object p2, p0, Lrb/c;->d:Landroid/view/MotionEvent;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lrb/c;->c:Lrb/e;

    iget-object v1, p0, Lrb/c;->d:Landroid/view/MotionEvent;

    invoke-static {v0, v1}, Lrb/e;->a(Lrb/e;Landroid/view/MotionEvent;)Lqc/q;

    move-result-object v0

    return-object v0
.end method
