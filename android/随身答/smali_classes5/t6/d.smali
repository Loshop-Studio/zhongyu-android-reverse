.class public final synthetic Lt6/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/chad/library/adapter/base/viewholder/BaseDataBindingHolder;

.field public final synthetic b:Lcom/zykj/student/dialogue/ui/home/category/CategoryEditAdapter;


# direct methods
.method public synthetic constructor <init>(Lcom/chad/library/adapter/base/viewholder/BaseDataBindingHolder;Lcom/zykj/student/dialogue/ui/home/category/CategoryEditAdapter;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt6/d;->a:Lcom/chad/library/adapter/base/viewholder/BaseDataBindingHolder;

    iput-object p2, p0, Lt6/d;->b:Lcom/zykj/student/dialogue/ui/home/category/CategoryEditAdapter;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lt6/d;->a:Lcom/chad/library/adapter/base/viewholder/BaseDataBindingHolder;

    iget-object v1, p0, Lt6/d;->b:Lcom/zykj/student/dialogue/ui/home/category/CategoryEditAdapter;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, v1, p1}, Lcom/zykj/student/dialogue/ui/home/category/CategoryEditAdapter;->f(Lcom/chad/library/adapter/base/viewholder/BaseDataBindingHolder;Lcom/zykj/student/dialogue/ui/home/category/CategoryEditAdapter;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
