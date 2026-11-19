.class public La/b/c/s$b;
.super La/h/j/x;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/b/c/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:La/b/c/s;


# direct methods
.method public constructor <init>(La/b/c/s;)V
    .locals 0

    iput-object p1, p0, La/b/c/s$b;->a:La/b/c/s;

    invoke-direct {p0}, La/h/j/x;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, La/b/c/s$b;->a:La/b/c/s;

    const/4 v0, 0x0

    iput-object v0, p1, La/b/c/s;->t:La/b/g/g;

    iget-object p1, p1, La/b/c/s;->d:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1}, Landroid/widget/FrameLayout;->requestLayout()V

    return-void
.end method
