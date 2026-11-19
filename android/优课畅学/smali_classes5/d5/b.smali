.class public final synthetic Ld5/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/study/StudyListFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/ui/home/study/StudyListFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld5/b;->a:Lcom/zykj/study/ui/home/study/StudyListFragment;

    return-void
.end method


# virtual methods
.method public final onRefresh()V
    .locals 1

    .line 1
    iget-object v0, p0, Ld5/b;->a:Lcom/zykj/study/ui/home/study/StudyListFragment;

    invoke-static {v0}, Lcom/zykj/study/ui/home/study/StudyListFragment;->i(Lcom/zykj/study/ui/home/study/StudyListFragment;)V

    return-void
.end method
