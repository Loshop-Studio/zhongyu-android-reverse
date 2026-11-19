.class public final synthetic Lpb/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic c:Landroid/view/Window;

.field public final synthetic d:Lpb/l;


# direct methods
.method public synthetic constructor <init>(Landroid/view/Window;Lpb/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpb/j;->c:Landroid/view/Window;

    iput-object p2, p0, Lpb/j;->d:Lpb/l;

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 2

    .line 1
    iget-object v0, p0, Lpb/j;->c:Landroid/view/Window;

    iget-object v1, p0, Lpb/j;->d:Lpb/l;

    invoke-static {v0, v1}, Lpb/l;->d(Landroid/view/Window;Lpb/l;)V

    return-void
.end method
