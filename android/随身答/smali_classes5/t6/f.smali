.class public final synthetic Lt6/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt6/f;->a:Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lt6/f;->a:Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;

    invoke-static {v0}, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;->d(Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;)Lcom/zykj/student/dialogue/ui/home/category/CategoryEditAdapter;

    move-result-object v0

    return-object v0
.end method
