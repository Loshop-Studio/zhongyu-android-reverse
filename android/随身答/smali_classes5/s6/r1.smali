.class public final synthetic Ls6/r1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;


# instance fields
.field public final synthetic a:Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls6/r1;->a:Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;

    return-void
.end method


# virtual methods
.method public final onRefresh()V
    .locals 1

    .line 1
    iget-object v0, p0, Ls6/r1;->a:Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;

    invoke-static {v0}, Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;->i(Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;)V

    return-void
.end method
