.class public final synthetic Ld5/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/study/StudyListFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/ui/home/study/StudyListFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld5/d;->a:Lcom/zykj/study/ui/home/study/StudyListFragment;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Ld5/d;->a:Lcom/zykj/study/ui/home/study/StudyListFragment;

    invoke-static {v0}, Lcom/zykj/study/ui/home/study/StudyListFragment;->h(Lcom/zykj/study/ui/home/study/StudyListFragment;)Landroidx/lifecycle/ViewModelStoreOwner;

    move-result-object v0

    return-object v0
.end method
