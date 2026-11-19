.class public final synthetic Lb5/v4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb5/v4;->a:Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lb5/v4;->a:Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;

    invoke-static {v0}, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;->m(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;)Landroidx/lifecycle/ViewModelStoreOwner;

    move-result-object v0

    return-object v0
.end method
