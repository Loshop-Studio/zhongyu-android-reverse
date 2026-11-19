.class public final synthetic Lt6/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt6/i;->a:Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lt6/i;->a:Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Landroid/os/Bundle;

    invoke-static {v0, p1, p2}, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;->f(Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;Ljava/lang/String;Landroid/os/Bundle;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
