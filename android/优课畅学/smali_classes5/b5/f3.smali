.class public final synthetic Lb5/f3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/my/MyCourseFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/ui/home/my/MyCourseFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb5/f3;->a:Lcom/zykj/study/ui/home/my/MyCourseFragment;

    return-void
.end method


# virtual methods
.method public final onRefresh()V
    .locals 1

    .line 1
    iget-object v0, p0, Lb5/f3;->a:Lcom/zykj/study/ui/home/my/MyCourseFragment;

    invoke-static {v0}, Lcom/zykj/study/ui/home/my/MyCourseFragment;->g(Lcom/zykj/study/ui/home/my/MyCourseFragment;)V

    return-void
.end method
