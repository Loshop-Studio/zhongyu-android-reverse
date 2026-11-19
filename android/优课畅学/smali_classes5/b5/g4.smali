.class public final synthetic Lb5/g4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/my/StudentViewFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/ui/home/my/StudentViewFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb5/g4;->a:Lcom/zykj/study/ui/home/my/StudentViewFragment;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lb5/g4;->a:Lcom/zykj/study/ui/home/my/StudentViewFragment;

    invoke-static {v0}, Lcom/zykj/study/ui/home/my/StudentViewFragment;->l(Lcom/zykj/study/ui/home/my/StudentViewFragment;)Landroidx/lifecycle/ViewModelStoreOwner;

    move-result-object v0

    return-object v0
.end method
