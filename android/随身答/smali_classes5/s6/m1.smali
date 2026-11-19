.class public final synthetic Ls6/m1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;


# instance fields
.field public final synthetic a:Lcom/zykj/student/dialogue/ui/home/HomeFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/student/dialogue/ui/home/HomeFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls6/m1;->a:Lcom/zykj/student/dialogue/ui/home/HomeFragment;

    return-void
.end method


# virtual methods
.method public final onRefresh()V
    .locals 1

    .line 1
    iget-object v0, p0, Ls6/m1;->a:Lcom/zykj/student/dialogue/ui/home/HomeFragment;

    invoke-static {v0}, Lcom/zykj/student/dialogue/ui/home/HomeFragment;->m(Lcom/zykj/student/dialogue/ui/home/HomeFragment;)V

    return-void
.end method
